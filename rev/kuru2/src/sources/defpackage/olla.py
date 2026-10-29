import base64

TARGET = "QCB4cJjL64HjyfvzGaBB+ynzoPvJw6Ax+3nDoOPboEnDoPPD+8lBGcN5sQ=="

def solve():
    enc = base64.b64decode(TARGET)
    flag = bytearray()

    for b in enc:
        x = b ^ 90
        orig = ((x >> 3) | (x << 5)) & 0xFF 
        flag.append(orig)

    return flag.decode('utf-8', errors='ignore')

if __name__ == "__main__":
    flag = solve()
    print(f"[+] Flag: {flag}")
