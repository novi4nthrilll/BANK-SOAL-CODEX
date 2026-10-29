package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.List;
import java.util.Map;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class H7 implements D8, p070w0.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static H7 f2808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H7 f2809c = new H7(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H7 f2810d = new H7(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2811a;

    public /* synthetic */ H7(int i3) {
        this.f2811a = i3;
    }

    public static final B8 d(Object obj, Object obj2) {
        B8 b8B = (B8) obj;
        B8 b8 = (B8) obj2;
        if (!b8.isEmpty()) {
            if (!b8B.f2749d) {
                b8B = b8B.b();
            }
            b8B.e();
            if (!b8.isEmpty()) {
                b8B.putAll(b8);
            }
        }
        return b8B;
    }

    public static synchronized void e() {
        if (f2808b == null) {
            f2808b = new H7(0);
        }
    }

    public static void f(Object obj) {
        ((AbstractC0269l8) obj).zzb.e();
    }

    public static void g(Object obj) {
        S8 s8 = ((AbstractC0299o8) obj).zzc;
        if (s8.e) {
            s8.e = false;
        }
    }

    public static void h(A8 a8, Map.Entry entry) {
        C0279m8 c0279m8 = (C0279m8) entry.getKey();
        b9 b9Var = b9.e;
        switch (c0279m8.f3230d.ordinal()) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                O8.z(202056002, (List) entry.getValue(), a8, false);
                break;
            case 1:
                O8.D(202056002, (List) entry.getValue(), a8, false);
                break;
            case 2:
                O8.G(202056002, (List) entry.getValue(), a8, false);
                break;
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                O8.h(202056002, (List) entry.getValue(), a8, false);
                break;
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                O8.F(202056002, (List) entry.getValue(), a8, false);
                break;
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                O8.C(202056002, (List) entry.getValue(), a8, false);
                break;
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                O8.B(202056002, (List) entry.getValue(), a8, false);
                break;
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                O8.x(202056002, (List) entry.getValue(), a8, false);
                break;
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                O8.f(202056002, (List) entry.getValue(), a8);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    O8.E(202056002, (List) entry.getValue(), a8, K8.f2835c.a(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    O8.a(202056002, (List) entry.getValue(), a8, K8.f2835c.a(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                O8.y(202056002, (List) entry.getValue(), a8);
                break;
            case 12:
                O8.g(202056002, (List) entry.getValue(), a8, false);
                break;
            case 13:
                O8.F(202056002, (List) entry.getValue(), a8, false);
                break;
            case 14:
                O8.b(202056002, (List) entry.getValue(), a8, false);
                break;
            case 15:
                O8.c(202056002, (List) entry.getValue(), a8, false);
                break;
            case 16:
                O8.d(202056002, (List) entry.getValue(), a8, false);
                break;
            case 17:
                O8.e(202056002, (List) entry.getValue(), a8, false);
                break;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.D8
    public M8 a(Class cls) {
        switch (this.f2811a) {
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                if (!AbstractC0299o8.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (M8) AbstractC0299o8.n(cls.asSubclass(AbstractC0299o8.class)).k(3, null);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // p070w0.d
    public Object apply(Object obj) {
        switch (this.f2811a) {
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                break;
        }
        return (byte[]) obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.D8
    public boolean b(Class cls) {
        switch (this.f2811a) {
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                return AbstractC0299o8.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    public void c(p049o1.a aVar) {
        aVar.a(C0325r5.class, C0253k2.f3147a);
        aVar.a(C0208f7.class, C0195e4.f3025a);
        aVar.a(AbstractC0335s5.class, C0273m2.f3227a);
        aVar.a(AbstractC0365v5.class, C0293o2.f3242a);
        aVar.a(AbstractC0345t5.class, C0283n2.f3232a);
        aVar.a(AbstractC0355u5.class, C0303p2.f3250a);
        aVar.a(I4.class, D1.f2760a);
        aVar.a(H4.class, C1.f2751a);
        aVar.a(AbstractC0196e5.class, Z1.f2972a);
        aVar.a(S6.class, O3.f2873a);
        aVar.a(G4.class, B1.f2744a);
        aVar.a(F4.class, A1.f2738a);
        aVar.a(AbstractC0167b6.class, X2.f2946a);
        aVar.a(AbstractC0407z7.class, S1.f2905a);
        aVar.a(AbstractC0156a5.class, V1.f2929a);
        aVar.a(Y4.class, R1.f2896a);
        aVar.a(AbstractC0177c6.class, Y2.f2958a);
        aVar.a(P6.class, K3.f2832a);
        aVar.a(Q6.class, L3.f2841a);
        aVar.a(O6.class, J3.f2827a);
        aVar.a(AbstractC0405z5.class, C0362v2.f3469a);
        aVar.a(AbstractC0397y7.class, C0252k1.f3099a);
        aVar.a(A5.class, C0372w2.f3473a);
        aVar.a(AbstractC0257k6.class, C0214g3.f3072a);
        aVar.a(AbstractC0287n6.class, C0244j3.f3097a);
        aVar.a(AbstractC0277m6.class, C0234i3.f3089a);
        aVar.a(AbstractC0267l6.class, C0224h3.f3079a);
        aVar.a(AbstractC0376w6.class, C0333s3.f3454a);
        aVar.a(AbstractC0386x6.class, C0343t3.f3459a);
        aVar.a(AbstractC0406z6.class, C0363v3.f3470a);
        aVar.a(AbstractC0396y6.class, C0353u3.f3465a);
        aVar.a(AbstractC0395y5.class, C0352u2.f3464a);
        aVar.a(A6.class, C0373w3.f3474a);
        aVar.a(B6.class, C0383x3.f3489a);
        aVar.a(C6.class, C0393y3.f3501a);
        aVar.a(D6.class, C0403z3.f3510a);
        aVar.a(I6.class, C3.f2753a);
        aVar.a(G6.class, D3.f2762a);
        aVar.a(AbstractC0366v6.class, C0294o3.f3243a);
        aVar.a(AbstractC0236i5.class, C0193e2.f3023a);
        aVar.a(AbstractC0346t6.class, C0314q3.f3260a);
        aVar.a(AbstractC0336s6.class, C0304p3.f3251a);
        aVar.a(AbstractC0356u6.class, C0323r3.f3447a);
        aVar.a(R6.class, N3.f2869a);
        aVar.a(AbstractC0268l7.class, C0255k4.f3217a);
        aVar.a(AbstractC0354u4.class, C0302p1.f3249a);
        aVar.a(AbstractC0334s4.class, C0282n1.f3231a);
        aVar.a(AbstractC0324r4.class, C0272m1.f3226a);
        aVar.a(AbstractC0344t4.class, C0292o1.f3241a);
        aVar.a(AbstractC0374w4.class, C0321r1.f3445a);
        aVar.a(AbstractC0364v4.class, C0312q1.f3258a);
        aVar.a(AbstractC0384x4.class, C0331s1.f3452a);
        aVar.a(AbstractC0394y4.class, C0341t1.f3457a);
        aVar.a(AbstractC0404z4.class, C0351u1.f3463a);
        aVar.a(A4.class, C0361v1.f3468a);
        aVar.a(B4.class, C0371w1.f3472a);
        aVar.a(AbstractC0311q0.class, C0212g1.f3070a);
        aVar.a(AbstractC0330s0.class, C0232i1.f3087a);
        aVar.a(AbstractC0320r0.class, C0222h1.f3077a);
        aVar.a(AbstractC0216g5.class, C0173c2.f3001a);
        aVar.a(J4.class, E1.f2766a);
        aVar.a(D.class, C0350u0.f3462a);
        aVar.a(C.class, C0360v0.f3467a);
        aVar.a(S4.class, P1.f2876a);
        aVar.a(F.class, C0370w0.f3471a);
        aVar.a(E.class, C0380x0.f3486a);
        aVar.a(T.class, I0.f2813a);
        aVar.a(S.class, J0.f2824a);
        aVar.a(H.class, C0390y0.f3498a);
        aVar.a(G.class, C0400z0.f3507a);
        aVar.a(Z.class, O0.f2870a);
        aVar.a(Y.class, P0.f2875a);
        aVar.a(AbstractC0181d0.class, S0.f2904a);
        aVar.a(AbstractC0171c0.class, T0.f2913a);
        aVar.a(AbstractC0301p0.class, C0192e1.f3022a);
        aVar.a(AbstractC0291o0.class, C0202f1.f3052a);
        aVar.a(AbstractC0201f0.class, U0.f2921a);
        aVar.a(AbstractC0191e0.class, V0.f2928a);
        aVar.a(AbstractC0221h0.class, W0.f2936a);
        aVar.a(AbstractC0211g0.class, X0.f2944a);
        aVar.a(AbstractC0347t7.class, R3.f2903a);
        aVar.a(AbstractC0278m7.class, F1.f2780a);
        aVar.a(AbstractC0318q7.class, C0342t2.f3458a);
        aVar.a(AbstractC0308p7.class, C0332s2.f3453a);
        aVar.a(AbstractC0288n7.class, T1.f2914a);
        aVar.a(AbstractC0337s7.class, Q3.f2892a);
        aVar.a(AbstractC0327r7.class, P3.f2878a);
        aVar.a(AbstractC0357u7.class, S3.f2907a);
        aVar.a(AbstractC0298o7.class, C0153a2.f2986a);
        aVar.a(AbstractC0387x7.class, C0275m4.f3229a);
        aVar.a(AbstractC0377w7.class, C0295o4.f3244a);
        aVar.a(AbstractC0367v7.class, C0265l4.f3224a);
        aVar.a(U6.class, U3.f2924a);
        aVar.a(AbstractC0206f5.class, C0163b2.f2992a);
        aVar.a(AbstractC0246j5.class, C0203f2.f3053a);
        aVar.a(AbstractC0315q4.class, C0262l1.f3222a);
        aVar.a(AbstractC0166b5.class, W1.f2937a);
        aVar.a(AbstractC0226h5.class, C0183d2.f3019a);
        aVar.a(T4.class, Q1.f2887a);
        aVar.a(L4.class, H1.f2805a);
        aVar.a(M4.class, I1.f2814a);
        aVar.a(K4.class, G1.f2787a);
        aVar.a(N4.class, J1.f2825a);
        aVar.a(AbstractC0385x5.class, C0322r2.f3446a);
        aVar.a(AbstractC0375w5.class, C0313q2.f3259a);
        aVar.a(B.class, C0340t0.f3456a);
        aVar.a(AbstractC0238i7.class, C0225h4.f3080a);
        aVar.a(AbstractC0258k7.class, C0245j4.f3098a);
        aVar.a(AbstractC0248j7.class, C0235i4.f3090a);
        aVar.a(AbstractC0305p4.class, C0242j1.f3095a);
        aVar.a(E4.class, C0401z1.f3508a);
        aVar.a(D4.class, C0391y1.f3499a);
        aVar.a(C4.class, C0381x1.f3487a);
        aVar.a(Y5.class, U2.f2923a);
        aVar.a(AbstractC0157a6.class, W2.f2938a);
        aVar.a(Z5.class, V2.f2930a);
        aVar.a(Q.class, G0.f2786a);
        aVar.a(P.class, H0.f2804a);
        aVar.a(AbstractC0187d6.class, Z2.f2973a);
        aVar.a(AbstractC0217g6.class, C0174c3.f3002a);
        aVar.a(AbstractC0197e6.class, C0154a3.f2987a);
        aVar.a(AbstractC0207f6.class, C0164b3.f2993a);
        aVar.a(V.class, K0.f2830a);
        aVar.a(U.class, L0.f2838a);
        aVar.a(Z6.class, Z3.f2974a);
        aVar.a(Y6.class, Y3.f2959a);
        aVar.a(AbstractC0218g7.class, C0205f4.f3055a);
        aVar.a(AbstractC0228h7.class, C0215g4.f3073a);
        aVar.a(AbstractC0297o6.class, C0254k3.f3216a);
        aVar.a(AbstractC0326r6.class, C0284n3.f3233a);
        aVar.a(AbstractC0307p6.class, C0264l3.f3223a);
        aVar.a(AbstractC0317q6.class, C0274m3.f3228a);
        aVar.a(AbstractC0186d5.class, Y1.f2957a);
        aVar.a(AbstractC0161b0.class, Q0.f2886a);
        aVar.a(AbstractC0151a0.class, R0.f2895a);
        aVar.a(AbstractC0176c5.class, X1.f2945a);
        aVar.a(Z4.class, U1.f2922a);
        aVar.a(AbstractC0227h6.class, C0184d3.f3020a);
        aVar.a(AbstractC0247j6.class, C0204f3.f3054a);
        aVar.a(AbstractC0237i6.class, C0194e3.f3024a);
        aVar.a(X.class, M0.f2849a);
        aVar.a(W.class, N0.f2866a);
        aVar.a(O5.class, K2.f2831a);
        aVar.a(P5.class, L2.f2840a);
        aVar.a(Q5.class, M2.f2851a);
        aVar.a(M.class, C0.f2750a);
        aVar.a(L.class, D0.f2759a);
        aVar.a(L5.class, H2.f2806a);
        aVar.a(M5.class, I2.f2815a);
        aVar.a(N5.class, J2.f2826a);
        aVar.a(K.class, A0.f2737a);
        aVar.a(J.class, B0.f2743a);
        aVar.a(R5.class, N2.f2868a);
        aVar.a(S5.class, O2.f2872a);
        aVar.a(T5.class, P2.f2877a);
        aVar.a(U5.class, Q2.f2891a);
        aVar.a(O.class, E0.f2765a);
        aVar.a(N.class, F0.f2779a);
        aVar.a(W6.class, V3.f2931a);
        aVar.a(V6.class, W3.f2939a);
        aVar.a(AbstractC0256k5.class, C0213g2.f3071a);
        aVar.a(AbstractC0276m5.class, C0233i2.f3088a);
        aVar.a(AbstractC0266l5.class, C0223h2.f3078a);
        aVar.a(AbstractC0286n5.class, C0243j2.f3096a);
        aVar.a(J6.class, E3.f2768a);
        aVar.a(K6.class, F3.f2782a);
        aVar.a(AbstractC0261l0.class, C0152a1.f2985a);
        aVar.a(AbstractC0251k0.class, C0162b1.f2991a);
        aVar.a(AbstractC0158a7.class, C0155a4.f2988a);
        aVar.a(E6.class, A3.f2740a);
        aVar.a(F6.class, B3.f2746a);
        aVar.a(AbstractC0241j0.class, Y0.f2956a);
        aVar.a(AbstractC0231i0.class, Z0.f2971a);
        aVar.a(X6.class, X3.f2947a);
        aVar.a(K5.class, C0392y2.f3500a);
        aVar.a(J5.class, G2.f2788a);
        aVar.a(G5.class, D2.f2761a);
        aVar.a(F5.class, C2.f2752a);
        aVar.a(H5.class, E2.f2767a);
        aVar.a(I5.class, F2.f2781a);
        aVar.a(E5.class, B2.f2745a);
        aVar.a(B5.class, C0382x2.f3488a);
        aVar.a(D5.class, A2.f2739a);
        aVar.a(C5.class, C0402z2.f3509a);
        aVar.a(W5.class, S2.f2906a);
        aVar.a(Q4.class, N1.f2867a);
        aVar.a(V5.class, R2.f2902a);
        aVar.a(X5.class, T2.f2915a);
        aVar.a(P4.class, M1.f2850a);
        aVar.a(R4.class, O1.f2871a);
        aVar.a(T6.class, T3.f2916a);
        aVar.a(L6.class, G3.f2789a);
        aVar.a(AbstractC0188d7.class, C0185d4.f3021a);
        aVar.a(N6.class, I3.f2816a);
        aVar.a(M6.class, H3.f2807a);
        aVar.a(AbstractC0168b7.class, C0165b4.f2994a);
        aVar.a(AbstractC0281n0.class, C0172c1.f3000a);
        aVar.a(AbstractC0271m0.class, C0182d1.f3018a);
        aVar.a(AbstractC0178c7.class, C0175c4.f3003a);
        aVar.a(O4.class, L1.f2839a);
    }
}
