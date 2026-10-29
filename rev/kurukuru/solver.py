import base64

TARGET = "QCB4cJjL64HjyfvzGaBB+ynzoPvJw6Ax+3nDoOPboEnDoPPD+8lBGcN5sQ=="

def solve():
    enc = base64.b64decode(TARGET)
    flag = bytearray()
    
    for b in enc:
        # 1. Reverse XOR with 90
        x = b ^ 90
        # 2. Reverse circular left shift 3 (ROL 3) -> Rotate right 3 (ROR 3 / ROL 5)
        orig = ((x >> 3) | (x << 5)) & 0xFF
        flag.append(orig)
        
    return flag.decode('utf-8')

if __name__ == "__main__":
    flag = solve()
    print(f"[+] Flag: {flag}")
