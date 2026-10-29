# Writeup: kurukuru (Reverse Engineering)

## Ringkasan Singkat
Diberikan sebuah file `chall.zip`. Setelah diekstrak, kita mendapatkan file Java executable (`chall.jar`). Tugas kita adalah membalikkan alur enkripsi sederhana pada bytecode Java untuk mendapatkan flag asli.

- **Flag**: `CODEX26{7r45h_c4n5_4r3_m4d3_70_b3_534rch3d}`

---

## Langkah Penyelesaian (Human Walkthrough)

### 1. Ekstrak File Challenge
Pertama, kita cek dan ekstrak file `chall.zip`:
```bash
unzip chall.zip
```
Hasil ekstrak menghasilkan file bernama `chall.jar`.

---

### 2. Coba Jalankan Program
Sebelum masuk ke decompilation, kita coba eksekusi programnya untuk melihat perilakunya:
```bash
java -jar chall.jar
# Output: [-] Access denied.

java -jar chall.jar test
# Output: [-] Access denied.
```
Dari sini terlihat program meminta argumen berupa string (kemungkinan input flag).

---

### 3. Dekompilasi File JAR
Karena ini file Java (`.jar`), kita bisa dengan mudah melihat source code aslinya menggunakan decompiler seperti **jadx**, **jd-gui**, atau ekstrak `.class`-nya lalu disassembler:

```bash
jadx -d src chall.jar
```
Buka file `src/sources/defpackage/Chall.java`:

```java
public class Chall {
    private static final int FLAG_LEN = 43;
    private static final String TARGET = "QCB4cJjL64HjyfvzGaBB+ynzoPvJw6Ax+3nDoOPboEnDoPPD+8lBGcN5sQ==";

    private static boolean check(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length != FLAG_LEN) {
            return false;
        }
        byte[] bArr = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            int i2 = bytes[i] & 255;
            bArr[i] = (byte) ((((i2 << 3) | (i2 >>> 5)) & 255) ^ 90);
        }
        return Base64.getEncoder().encodeToString(bArr).equals(TARGET);
    }
    ...
}
```

---

### 4. Memahami Alur Program
Dari kode di atas, fungsi `check()` melakukan validasi dengan aturan berikut:
1. **Panjang flag** harus tepat **43 karakter** (`FLAG_LEN = 43`).
2. Setiap byte karakter dioperasikan secara bitwise:
   - `(i2 << 3) | (i2 >>> 5)`: Ini adalah operasi **Circular Shift / Rotate Left (ROL) sebanyak 3 bit**.
   - `^ 90`: Hasil rotasi di-**XOR dengan 90** (`0x5A`).
3. Hasil akhirnya diubah ke format **Base64** dan dicocokkan dengan konstanta `TARGET`:
   ```text
   QCB4cJjL64HjyfvzGaBB+ynzoPvJw6Ax+3nDoOPboEnDoPPD+8lBGcN5sQ==
   ```

---

### 5. Membalikkan Logika (Reverse)
Karena semua operasi bitwise di atas tidak menghilangkan data (lossless), kita bisa membalik langkahnya dari belakang:
1. **Base64 Decode** nilai `TARGET` menjadi byte array mentah.
2. **XOR balik dengan 90** (sifat XOR: `(A ^ B) ^ B = A`).
3. **Rotate Right (ROR) sebanyak 3 bit** (kebalikan dari geser kiri 3 bit):
   ```python
   orig = ((val >> 3) | (val << 5)) & 0xFF
   ```

---

### 6. Membuat Script Solver
Kita buat script Python sederhana `solver.py`:

```python
import base64

TARGET = "QCB4cJjL64HjyfvzGaBB+ynzoPvJw6Ax+3nDoOPboEnDoPPD+8lBGcN5sQ=="

def solve():
    # 1. Base64 decode string target
    enc = base64.b64decode(TARGET)
    flag = bytearray()

    for b in enc:
        # 2. Balikkan XOR 90
        x = b ^ 90
        # 3. Balikkan rotasi bit (geser kanan 3 bit)
        orig = ((x >> 3) | (x << 5)) & 0xFF
        flag.append(orig)

    return flag.decode('utf-8')

print("[+] Flag:", solve())
```

---

### 7. Eksekusi & Validasi
Jalankan solver:
```bash
python3 solver.py
```
Output:
```text
[+] Flag: CODEX26{7r45h_c4n5_4r3_m4d3_70_b3_534rch3d}
```

Terakhir, kita tes flag tersebut langsung ke `chall.jar` untuk memastikan 100% valid:
```bash
java -jar chall.jar "CODEX26{7r45h_c4n5_4r3_m4d3_70_b3_534rch3d}"
```
Output:
```text
[+] Access granted! Flag verified: CODEX26{7r45h_c4n5_4r3_m4d3_70_b3_534rch3d}
```
Flag berhasil didapatkan!
