#!/usr/bin/env python3
import base64
import codecs

def solve():
    with open("cipher.txt", "r") as f:
        data = f.read().strip()

    print("[*] Layer 0 (Original Cipher):", data[:40] + "...")

    # Layer 1: Base64 decode
    layer1 = base64.b64decode(data).decode()
    print("[*] Layer 1 (Base64 decode):", layer1[:40] + "...")

    # Layer 2: Base64 decode
    layer2 = base64.b64decode(layer1).decode()
    print("[*] Layer 2 (Base64 decode):", layer2[:40] + "...")

    # Layer 3: Hex decode
    layer3 = bytes.fromhex(layer2).decode()
    print("[*] Layer 3 (Hex decode):", layer3[:40] + "...")

    # Layer 4: Base64 decode
    layer4 = base64.b64decode(layer3).decode()
    print("[*] Layer 4 (Base64 decode):", layer4[:40] + "...")

    # Layer 5: Reverse string
    layer5 = layer4[::-1]
    print("[*] Layer 5 (Reverse):", layer5[:40] + "...")

    # Layer 6: ROT13 decode
    layer6 = codecs.decode(layer5, "rot_13")
    print("[*] Layer 6 (ROT13):", layer6[:40] + "...")

    # Layer 7: Base64 decode
    layer7 = base64.b64decode(layer6).decode()
    print("[*] Layer 7 (Base64 decode):", layer7[:40] + "...")

    # Layer 8: Hex decode
    layer8 = bytes.fromhex(layer7).decode()
    print("[*] Layer 8 (Hex decode):", layer8)

    # Layer 9: Base64 decode -> FLAG!
    flag = base64.b64decode(layer8).decode()
    print("\n[+] FLAG:", flag)

if __name__ == "__main__":
    solve()
