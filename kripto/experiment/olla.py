import random
import time
from datetime import datetime, timedelta

warmup = [int(l) for l in open("warmup.log").read().split()]
enc = open("flag.enc", "rb").read()
CALIBRATION_ROUNDS = len(warmup)

import os
mt = int(os.path.getmtime("warmup.log"))
start = mt - 86400 * 2
end   = mt + 86400 * 2

found = None
for s in range(start, end):
    random.seed(s)
    ok = True
    for i in range(len(warmup)):
        if random.getrandbits(32) != warmup[i]:
            ok = False
            break
    if ok:
        found = s
        break

print("seed =", found, datetime.fromtimestamp(found))

random.seed(found)
for _ in range(CALIBRATION_ROUNDS):
    random.getrandbits(32)

flag = bytes(b ^ (random.getrandbits(8)) for b in enc)
print(flag)
