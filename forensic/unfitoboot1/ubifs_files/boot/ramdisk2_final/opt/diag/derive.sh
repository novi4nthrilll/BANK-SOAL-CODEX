#!/bin/sh
# Ghoti-One factory audit log decryption
#
# Derivation:
#   ikm  = 32 raw bytes read from /dev/mtdblock0 at the OTP-mirror offset
#   key  = HKDF-SHA256(ikm, salt="ghoti", info="audit-key", length=32)
#   ct   = /opt/diag/audit.log.enc  (12-byte nonce || AES-256-GCM ciphertext+tag)
#   pt   = AES-256-GCM-decrypt(key, nonce, ct)
#
# The OTP-mirror offset and size are documented in the factory ATE bring-up
# sheet (factory_ate_sheet.pdf). Do NOT hard-code them here.
#
# Usage: sh /opt/diag/derive.sh <flash> <offset_hex> <size_dec>
FLASH="$1"; OFFSET="$2"; SIZE="$3"
[ -z "$FLASH" ] || [ -z "$OFFSET" ] || [ -z "$SIZE" ] && {
    echo "usage: $0 <flash> <offset> <size>" >&2; exit 2; }
dd if="$FLASH" bs=1 skip="$(printf '%d' "$OFFSET")" count="$SIZE" 2>/dev/null | \
python3 -c '
import sys
from cryptography.hazmat.primitives.kdf.hkdf import HKDF
from cryptography.hazmat.primitives import hashes
from cryptography.hazmat.primitives.ciphers.aead import AESGCM
ikm = sys.stdin.buffer.read()
key = HKDF(algorithm=hashes.SHA256(), length=32,
           salt=b"ghoti", info=b"audit-key").derive(ikm)
blob = open("/opt/diag/audit.log.enc","rb").read()
sys.stdout.buffer.write(AESGCM(key).decrypt(blob[:12], blob[12:], None))
'
