package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/* JADX INFO: loaded from: chall.jar:Chall.class */
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

    public static void main(String[] strArr) {
        if (strArr.length != 1) {
            System.out.println("[-] Access denied.");
            System.exit(1);
        }
        if (check(strArr[0])) {
            System.out.println("[+] Access granted! Flag verified: " + strArr[0]);
            System.exit(0);
        }
        System.out.println("[-] Access denied.");
        System.exit(1);
    }
}
