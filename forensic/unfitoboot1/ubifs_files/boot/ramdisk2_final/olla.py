#!/usr/bin/env python3
"""
Decrypt audit.log.enc dari Ghoti-One diagnostic ramdisk.
Skema (dari derive.sh):
  ikm = 32 byte OTP-mirror dari raw NAND dump
  key = HKDF-SHA256(ikm, salt="ghoti", info="audit-key", length=32)
  pt  = AES-256-GCM-decrypt(key, nonce=blob[:12], ct=blob[12:])
"""

import sys
import os
from cryptography.hazmat.primitives.kdf.hkdf import HKDF
from cryptography.hazmat.primitives import hashes
from cryptography.hazmat.primitives.ciphers.aead import AESGCM

# IKM = 32 byte OTP-mirror dari flash.bin (raw dump, dengan OOB)
# offset 0x0106F800 = 17233920
IKM_HEX = "b7edc429c5b5f951be67bfca3b9295c718d7ed65557b0e38c2d82ec84d1aaeeb"
SALT = b"ghoti"
INFO = b"audit-key"

ENC_PATH = "opt/diag/audit.log.enc"

def main():
    if not os.path.exists(ENC_PATH):
        print(f"[!] File tidak ditemukan: {ENC_PATH}", file=sys.stderr)
        print("[!] Jalanin dari folder ramdisk2_final", file=sys.stderr)
        sys.exit(1)

    ikm = bytes.fromhex(IKM_HEX)
    print(f"[*] IKM ({len(ikm)} byte): {ikm.hex()}")

    key = HKDF(
        algorithm=hashes.SHA256(),
        length=32,
        salt=SALT,
        info=INFO,
    ).derive(ikm)
    print(f"[*] Key (HKDF-SHA256): {key.hex()}")

    blob = open(ENC_PATH, "rb").read()
    print(f"[*] Blob size: {len(blob)} byte")

    nonce = blob[:12]
    ct = blob[12:]
    print(f"[*] Nonce: {nonce.hex()}")
    print(f"[*] Ciphertext+tag: {len(ct)} byte")

    try:
        pt = AESGCM(key).decrypt(nonce, ct, None)
    except Exception as e:
        print(f"[!] Decrypt GAGAL: {e}", file=sys.stderr)
        sys.exit(1)

    print("=" * 60)
    print(pt.decode(errors="replace"))
    print("=" * 60)

if __name__ == "__main__":
    main()
