package top.tntok.autobot;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: top.tntok.autobot.o000o00o  reason: case insensitive filesystem */
public final class C0096o000o00o {
    public static final int i1LIL11l = 31;
    public static final int iiI1L1iI = 15;
    public static final C0090o000Ooo0[] iiIliillii;
    public static final Map<ili11iILI1l, Integer> iilLil1i11I1 = i1LIL11l();
    public static final int il1LilLllii = 127;
    public static final int illlI1lLIL = 63;

    /* renamed from: top.tntok.autobot.o000o00o$i1LIL11l */
    public static final class i1LIL11l {
        public static final int IiiL1llIIi = 4096;
        public static final int iILiI1lll = 16384;
        public C0090o000Ooo0[] I11lLL1;
        public int IiIIlIL;
        public final boolean i1LIL11l;
        public int iLLLILIiLi1Ii;
        public final IiILIlLLiIL iiI1L1iI;
        public int iiIliillii;
        public int iilLiIIIi11i;
        public int iilLil1i11I1;
        public boolean il1LilLllii;
        public int illlI1lLIL;

        public i1LIL11l(IiILIlLLiIL iiILIlLLiIL) {
            this(4096, true, iiILIlLLiIL);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00b0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void I11lLL1(java.util.List<top.tntok.autobot.C0090o000Ooo0> r14) throws java.io.IOException {
            /*
                r13 = this;
                boolean r0 = r13.il1LilLllii
                r1 = 0
                if (r0 == 0) goto L_0x001e
                int r0 = r13.illlI1lLIL
                int r2 = r13.iilLil1i11I1
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0012
                r13.iLLLILIiLi1Ii(r0, r4, r3)
            L_0x0012:
                r13.il1LilLllii = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r13.illlI1lLIL = r0
                int r0 = r13.iilLil1i11I1
                r13.iLLLILIiLi1Ii(r0, r4, r3)
            L_0x001e:
                int r0 = r14.size()
                r2 = 0
            L_0x0023:
                if (r2 >= r0) goto L_0x00eb
                java.lang.Object r3 = r14.get(r2)
                top.tntok.autobot.o000Ooo0 r3 = (top.tntok.autobot.C0090o000Ooo0) r3
                top.tntok.autobot.ili11iILI1l r4 = r3.iiI1L1iI
                top.tntok.autobot.ili11iILI1l r4 = r4.IiiIlLl1il1i()
                top.tntok.autobot.ili11iILI1l r5 = r3.i1LIL11l
                java.util.Map<top.tntok.autobot.ili11iILI1l, java.lang.Integer> r6 = top.tntok.autobot.C0096o000o00o.iilLil1i11I1
                java.lang.Object r6 = r6.get(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                r7 = 1
                r8 = -1
                if (r6 == 0) goto L_0x006c
                int r6 = r6.intValue()
                int r9 = r6 + 1
                if (r9 <= r7) goto L_0x0069
                r10 = 8
                if (r9 >= r10) goto L_0x0069
                top.tntok.autobot.o000Ooo0[] r10 = top.tntok.autobot.C0096o000o00o.iiIliillii
                r11 = r10[r6]
                top.tntok.autobot.ili11iILI1l r11 = r11.i1LIL11l
                boolean r11 = java.util.Objects.equals(r11, r5)
                if (r11 == 0) goto L_0x0059
                r6 = r9
                goto L_0x006e
            L_0x0059:
                r10 = r10[r9]
                top.tntok.autobot.ili11iILI1l r10 = r10.i1LIL11l
                boolean r10 = java.util.Objects.equals(r10, r5)
                if (r10 == 0) goto L_0x0069
                int r6 = r6 + 2
                r12 = r9
                r9 = r6
                r6 = r12
                goto L_0x006e
            L_0x0069:
                r6 = r9
            L_0x006a:
                r9 = -1
                goto L_0x006e
            L_0x006c:
                r6 = -1
                goto L_0x006a
            L_0x006e:
                if (r9 != r8) goto L_0x00a6
                int r10 = r13.iLLLILIiLi1Ii
                int r10 = r10 + r7
                top.tntok.autobot.o000Ooo0[] r7 = r13.I11lLL1
                int r7 = r7.length
            L_0x0076:
                if (r10 >= r7) goto L_0x00a6
                top.tntok.autobot.o000Ooo0[] r11 = r13.I11lLL1
                r11 = r11[r10]
                top.tntok.autobot.ili11iILI1l r11 = r11.iiI1L1iI
                boolean r11 = java.util.Objects.equals(r11, r4)
                if (r11 == 0) goto L_0x00a3
                top.tntok.autobot.o000Ooo0[] r11 = r13.I11lLL1
                r11 = r11[r10]
                top.tntok.autobot.ili11iILI1l r11 = r11.i1LIL11l
                boolean r11 = java.util.Objects.equals(r11, r5)
                if (r11 == 0) goto L_0x0099
                int r7 = r13.iLLLILIiLi1Ii
                int r10 = r10 - r7
                top.tntok.autobot.o000Ooo0[] r7 = top.tntok.autobot.C0096o000o00o.iiIliillii
                int r7 = r7.length
                int r9 = r10 + r7
                goto L_0x00a6
            L_0x0099:
                if (r6 != r8) goto L_0x00a3
                int r6 = r13.iLLLILIiLi1Ii
                int r6 = r10 - r6
                top.tntok.autobot.o000Ooo0[] r11 = top.tntok.autobot.C0096o000o00o.iiIliillii
                int r11 = r11.length
                int r6 = r6 + r11
            L_0x00a3:
                int r10 = r10 + 1
                goto L_0x0076
            L_0x00a6:
                if (r9 == r8) goto L_0x00b0
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r13.iLLLILIiLi1Ii(r9, r3, r4)
                goto L_0x00e7
            L_0x00b0:
                r7 = 64
                if (r6 != r8) goto L_0x00c3
                top.tntok.autobot.IiILIlLLiIL r6 = r13.iiI1L1iI
                r6.IillLillLLIii(r7)
                r13.iilLil1i11I1(r4)
                r13.iilLil1i11I1(r5)
                r13.il1LilLllii(r3)
                goto L_0x00e7
            L_0x00c3:
                top.tntok.autobot.ili11iILI1l r8 = top.tntok.autobot.C0090o000Ooo0.il1LilLllii
                boolean r8 = r4.ILllI11(r8)
                if (r8 == 0) goto L_0x00dc
                top.tntok.autobot.ili11iILI1l r8 = top.tntok.autobot.C0090o000Ooo0.i1L1lLllLLlIi
                boolean r4 = r8.equals(r4)
                if (r4 != 0) goto L_0x00dc
                r3 = 15
                r13.iLLLILIiLi1Ii(r6, r3, r1)
                r13.iilLil1i11I1(r5)
                goto L_0x00e7
            L_0x00dc:
                r4 = 63
                r13.iLLLILIiLi1Ii(r6, r4, r7)
                r13.iilLil1i11I1(r5)
                r13.il1LilLllii(r3)
            L_0x00e7:
                int r2 = r2 + 1
                goto L_0x0023
            L_0x00eb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: top.tntok.autobot.C0096o000o00o.i1LIL11l.I11lLL1(java.util.List):void");
        }

        public final void i1LIL11l() {
            Arrays.fill(this.I11lLL1, (Object) null);
            this.iLLLILIiLi1Ii = this.I11lLL1.length - 1;
            this.IiIIlIL = 0;
            this.iilLiIIIi11i = 0;
        }

        public void iLLLILIiLi1Ii(int i, int i2, int i3) {
            if (i < i2) {
                this.iiI1L1iI.IillLillLLIii(i | i3);
                return;
            }
            this.iiI1L1iI.IillLillLLIii(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.iiI1L1iI.IillLillLLIii(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.iiI1L1iI.IillLillLLIii(i4);
        }

        public final void iiI1L1iI() {
            int i = this.iilLil1i11I1;
            int i2 = this.iilLiIIIi11i;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                i1LIL11l();
            } else {
                illlI1lLIL(i2 - i);
            }
        }

        public void iiIliillii(int i) {
            this.iiIliillii = i;
            int min = Math.min(i, 16384);
            int i2 = this.iilLil1i11I1;
            if (i2 != min) {
                if (min < i2) {
                    this.illlI1lLIL = Math.min(this.illlI1lLIL, min);
                }
                this.il1LilLllii = true;
                this.iilLil1i11I1 = min;
                iiI1L1iI();
            }
        }

        public void iilLil1i11I1(ili11iILI1l ili11iili1l) throws IOException {
            if (!this.i1LIL11l || C0107o000oo.iilLil1i11I1().iiIliillii(ili11iili1l) >= ili11iili1l.illiiliIILI()) {
                iLLLILIiLi1Ii(ili11iili1l.illiiliIILI(), 127, 0);
                this.iiI1L1iI.ILiLII1ILi(ili11iili1l);
                return;
            }
            IiILIlLLiIL iiILIlLLiIL = new IiILIlLLiIL();
            C0107o000oo.iilLil1i11I1().il1LilLllii(ili11iili1l, iiILIlLLiIL);
            ili11iILI1l IL1IiilLlLI = iiILIlLLiIL.IL1IiilLlLI();
            iLLLILIiLi1Ii(IL1IiilLlLI.illiiliIILI(), 127, 128);
            this.iiI1L1iI.ILiLII1ILi(IL1IiilLlLI);
        }

        public final void il1LilLllii(C0090o000Ooo0 o000ooo0) {
            int i = o000ooo0.illlI1lLIL;
            int i2 = this.iilLil1i11I1;
            if (i > i2) {
                i1LIL11l();
                return;
            }
            illlI1lLIL((this.iilLiIIIi11i + i) - i2);
            int i3 = this.IiIIlIL + 1;
            C0090o000Ooo0[] o000ooo0Arr = this.I11lLL1;
            if (i3 > o000ooo0Arr.length) {
                C0090o000Ooo0[] o000ooo0Arr2 = new C0090o000Ooo0[(o000ooo0Arr.length * 2)];
                System.arraycopy(o000ooo0Arr, 0, o000ooo0Arr2, o000ooo0Arr.length, o000ooo0Arr.length);
                this.iLLLILIiLi1Ii = this.I11lLL1.length - 1;
                this.I11lLL1 = o000ooo0Arr2;
            }
            int i4 = this.iLLLILIiLi1Ii;
            this.iLLLILIiLi1Ii = i4 - 1;
            this.I11lLL1[i4] = o000ooo0;
            this.IiIIlIL++;
            this.iilLiIIIi11i += i;
        }

        public final int illlI1lLIL(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.I11lLL1.length;
                while (true) {
                    length--;
                    i2 = this.iLLLILIiLi1Ii;
                    if (length < i2 || i <= 0) {
                        C0090o000Ooo0[] o000ooo0Arr = this.I11lLL1;
                        System.arraycopy(o000ooo0Arr, i2 + 1, o000ooo0Arr, i2 + 1 + i3, this.IiIIlIL);
                        C0090o000Ooo0[] o000ooo0Arr2 = this.I11lLL1;
                        int i4 = this.iLLLILIiLi1Ii;
                        Arrays.fill(o000ooo0Arr2, i4 + 1, i4 + 1 + i3, (Object) null);
                        this.iLLLILIiLi1Ii += i3;
                    } else {
                        int i5 = this.I11lLL1[length].illlI1lLIL;
                        i -= i5;
                        this.iilLiIIIi11i -= i5;
                        this.IiIIlIL--;
                        i3++;
                    }
                }
                C0090o000Ooo0[] o000ooo0Arr3 = this.I11lLL1;
                System.arraycopy(o000ooo0Arr3, i2 + 1, o000ooo0Arr3, i2 + 1 + i3, this.IiIIlIL);
                C0090o000Ooo0[] o000ooo0Arr22 = this.I11lLL1;
                int i42 = this.iLLLILIiLi1Ii;
                Arrays.fill(o000ooo0Arr22, i42 + 1, i42 + 1 + i3, (Object) null);
                this.iLLLILIiLi1Ii += i3;
            }
            return i3;
        }

        public i1LIL11l(int i, boolean z, IiILIlLLiIL iiILIlLLiIL) {
            this.illlI1lLIL = Integer.MAX_VALUE;
            C0090o000Ooo0[] o000ooo0Arr = new C0090o000Ooo0[8];
            this.I11lLL1 = o000ooo0Arr;
            this.iLLLILIiLi1Ii = o000ooo0Arr.length - 1;
            this.IiIIlIL = 0;
            this.iilLiIIIi11i = 0;
            this.iiIliillii = i;
            this.iilLil1i11I1 = i;
            this.i1LIL11l = z;
            this.iiI1L1iI = iiILIlLLiIL;
        }
    }

    /* renamed from: top.tntok.autobot.o000o00o$iiI1L1iI */
    public static final class iiI1L1iI {
        public int I11lLL1;
        public final ILL1iL1LiiI i1LIL11l;
        public int iLLLILIiLi1Ii;
        public final List<C0090o000Ooo0> iiI1L1iI;
        public C0090o000Ooo0[] iiIliillii;
        public int iilLil1i11I1;
        public int il1LilLllii;
        public final int illlI1lLIL;

        public iiI1L1iI(int i, C0370o0OOOooO o0oooooo) {
            this(i, i, o0oooooo);
        }

        public final void I11lLL1(int i, C0090o000Ooo0 o000ooo0) {
            this.iiI1L1iI.add(o000ooo0);
            int i2 = o000ooo0.illlI1lLIL;
            if (i != -1) {
                i2 -= this.iiIliillii[illlI1lLIL(i)].illlI1lLIL;
            }
            int i3 = this.il1LilLllii;
            if (i2 > i3) {
                i1LIL11l();
                return;
            }
            int il1LilLllii2 = il1LilLllii((this.iLLLILIiLi1Ii + i2) - i3);
            if (i == -1) {
                int i4 = this.I11lLL1 + 1;
                C0090o000Ooo0[] o000ooo0Arr = this.iiIliillii;
                if (i4 > o000ooo0Arr.length) {
                    C0090o000Ooo0[] o000ooo0Arr2 = new C0090o000Ooo0[(o000ooo0Arr.length * 2)];
                    System.arraycopy(o000ooo0Arr, 0, o000ooo0Arr2, o000ooo0Arr.length, o000ooo0Arr.length);
                    this.iilLil1i11I1 = this.iiIliillii.length - 1;
                    this.iiIliillii = o000ooo0Arr2;
                }
                int i5 = this.iilLil1i11I1;
                this.iilLil1i11I1 = i5 - 1;
                this.iiIliillii[i5] = o000ooo0;
                this.I11lLL1++;
            } else {
                this.iiIliillii[i + illlI1lLIL(i) + il1LilLllii2] = o000ooo0;
            }
            this.iLLLILIiLi1Ii += i2;
        }

        public final void I1iIiIi(int i) throws IOException {
            if (iLLLILIiLi1Ii(i)) {
                this.iiI1L1iI.add(C0096o000o00o.iiIliillii[i]);
                return;
            }
            int illlI1lLIL2 = illlI1lLIL(i - C0096o000o00o.iiIliillii.length);
            if (illlI1lLIL2 >= 0) {
                C0090o000Ooo0[] o000ooo0Arr = this.iiIliillii;
                if (illlI1lLIL2 < o000ooo0Arr.length) {
                    this.iiI1L1iI.add(o000ooo0Arr[illlI1lLIL2]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final void IL1lILLLL1L(int i) throws IOException {
            I11lLL1(-1, new C0090o000Ooo0(iilLil1i11I1(i), IiiL1llIIi()));
        }

        public final void Ii1liIIIiLi() throws IOException {
            this.iiI1L1iI.add(new C0090o000Ooo0(C0096o000o00o.iiI1L1iI(IiiL1llIIi()), IiiL1llIIi()));
        }

        public int IiIIlIL() {
            return this.il1LilLllii;
        }

        public ili11iILI1l IiiL1llIIi() throws IOException {
            boolean z;
            int iilLiIIIi11i = iilLiIIIi11i();
            if ((iilLiIIIi11i & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            int i1L1lLllLLlIi = i1L1lLllLLlIi(iilLiIIIi11i, 127);
            if (z) {
                return ili11iILI1l.il1l1IlL(C0107o000oo.iilLil1i11I1().illlI1lLIL(this.i1LIL11l.i1i1111LLILli((long) i1L1lLllLLlIi)));
            }
            return this.i1LIL11l.iliilLllIl1((long) i1L1lLllLLlIi);
        }

        public final void i111iLiiIIill(int i) throws IOException {
            this.iiI1L1iI.add(new C0090o000Ooo0(iilLil1i11I1(i), IiiL1llIIi()));
        }

        public int i1L1lLllLLlIi(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int iilLiIIIi11i = iilLiIIIi11i();
                if ((iilLiIIIi11i & 128) == 0) {
                    return i2 + (iilLiIIIi11i << i4);
                }
                i2 += (iilLiIIIi11i & 127) << i4;
                i4 += 7;
            }
        }

        public final void i1LIL11l() {
            Arrays.fill(this.iiIliillii, (Object) null);
            this.iilLil1i11I1 = this.iiIliillii.length - 1;
            this.I11lLL1 = 0;
            this.iLLLILIiLi1Ii = 0;
        }

        public void iILiI1lll() throws IOException {
            while (!this.i1LIL11l.Il1llillili()) {
                byte readByte = this.i1LIL11l.readByte();
                byte b = readByte & i1IL1lILl1L1I.iiI1L1iI;
                if (b == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    I1iIiIi(i1L1lLllLLlIi(b, 127) - 1);
                } else if (b == 64) {
                    iL1LIlIlI();
                } else if ((readByte & 64) == 64) {
                    IL1lILLLL1L(i1L1lLllLLlIi(b, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int i1L1lLllLLlIi = i1L1lLllLLlIi(b, 31);
                    this.il1LilLllii = i1L1lLllLLlIi;
                    if (i1L1lLllLLlIi < 0 || i1L1lLllLLlIi > this.illlI1lLIL) {
                        throw new IOException("Invalid dynamic table size update " + this.il1LilLllii);
                    }
                    iiI1L1iI();
                } else if (b == 16 || b == 0) {
                    Ii1liIIIiLi();
                } else {
                    i111iLiiIIill(i1L1lLllLLlIi(b, 15) - 1);
                }
            }
        }

        public final void iL1LIlIlI() throws IOException {
            I11lLL1(-1, new C0090o000Ooo0(C0096o000o00o.iiI1L1iI(IiiL1llIIi()), IiiL1llIIi()));
        }

        public final boolean iLLLILIiLi1Ii(int i) {
            if (i < 0 || i > C0096o000o00o.iiIliillii.length - 1) {
                return false;
            }
            return true;
        }

        public final void iiI1L1iI() {
            int i = this.il1LilLllii;
            int i2 = this.iLLLILIiLi1Ii;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                i1LIL11l();
            } else {
                il1LilLllii(i2 - i);
            }
        }

        public List<C0090o000Ooo0> iiIliillii() {
            ArrayList arrayList = new ArrayList(this.iiI1L1iI);
            this.iiI1L1iI.clear();
            return arrayList;
        }

        public final int iilLiIIIi11i() throws IOException {
            return this.i1LIL11l.readByte() & i1IL1lILl1L1I.iiI1L1iI;
        }

        public final ili11iILI1l iilLil1i11I1(int i) throws IOException {
            if (iLLLILIiLi1Ii(i)) {
                return C0096o000o00o.iiIliillii[i].iiI1L1iI;
            }
            int illlI1lLIL2 = illlI1lLIL(i - C0096o000o00o.iiIliillii.length);
            if (illlI1lLIL2 >= 0) {
                C0090o000Ooo0[] o000ooo0Arr = this.iiIliillii;
                if (illlI1lLIL2 < o000ooo0Arr.length) {
                    return o000ooo0Arr[illlI1lLIL2].iiI1L1iI;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final int il1LilLllii(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.iiIliillii.length;
                while (true) {
                    length--;
                    i2 = this.iilLil1i11I1;
                    if (length < i2 || i <= 0) {
                        C0090o000Ooo0[] o000ooo0Arr = this.iiIliillii;
                        System.arraycopy(o000ooo0Arr, i2 + 1, o000ooo0Arr, i2 + 1 + i3, this.I11lLL1);
                        this.iilLil1i11I1 += i3;
                    } else {
                        int i4 = this.iiIliillii[length].illlI1lLIL;
                        i -= i4;
                        this.iLLLILIiLi1Ii -= i4;
                        this.I11lLL1--;
                        i3++;
                    }
                }
                C0090o000Ooo0[] o000ooo0Arr2 = this.iiIliillii;
                System.arraycopy(o000ooo0Arr2, i2 + 1, o000ooo0Arr2, i2 + 1 + i3, this.I11lLL1);
                this.iilLil1i11I1 += i3;
            }
            return i3;
        }

        public final int illlI1lLIL(int i) {
            return this.iilLil1i11I1 + 1 + i;
        }

        public iiI1L1iI(int i, int i2, C0370o0OOOooO o0oooooo) {
            this.iiI1L1iI = new ArrayList();
            C0090o000Ooo0[] o000ooo0Arr = new C0090o000Ooo0[8];
            this.iiIliillii = o000ooo0Arr;
            this.iilLil1i11I1 = o000ooo0Arr.length - 1;
            this.I11lLL1 = 0;
            this.iLLLILIiLi1Ii = 0;
            this.illlI1lLIL = i;
            this.il1LilLllii = i2;
            this.i1LIL11l = C0249o00oo00O.il1LilLllii(o0oooooo);
        }
    }

    static {
        C0090o000Ooo0 o000ooo0 = new C0090o000Ooo0(C0090o000Ooo0.i1L1lLllLLlIi, "");
        ili11iILI1l ili11iili1l = C0090o000Ooo0.IiiL1llIIi;
        C0090o000Ooo0 o000ooo02 = new C0090o000Ooo0(ili11iili1l, "GET");
        C0090o000Ooo0 o000ooo03 = new C0090o000Ooo0(ili11iili1l, o00Oo00.IL1lILLLL1L);
        ili11iILI1l ili11iili1l2 = C0090o000Ooo0.iILiI1lll;
        C0090o000Ooo0 o000ooo04 = new C0090o000Ooo0(ili11iili1l2, "/");
        C0090o000Ooo0 o000ooo05 = new C0090o000Ooo0(ili11iili1l2, "/index.html");
        ili11iILI1l ili11iili1l3 = C0090o000Ooo0.I1iIiIi;
        C0090o000Ooo0 o000ooo06 = new C0090o000Ooo0(ili11iili1l3, "http");
        C0090o000Ooo0 o000ooo07 = new C0090o000Ooo0(ili11iili1l3, "https");
        ili11iILI1l ili11iili1l4 = C0090o000Ooo0.iilLiIIIi11i;
        C0090o000Ooo0 o000ooo08 = new C0090o000Ooo0(ili11iili1l4, "200");
        C0090o000Ooo0 o000ooo09 = new C0090o000Ooo0(ili11iili1l4, "204");
        C0090o000Ooo0 o000ooo010 = new C0090o000Ooo0(ili11iili1l4, "206");
        C0090o000Ooo0 o000ooo011 = new C0090o000Ooo0(ili11iili1l4, "304");
        C0090o000Ooo0 o000ooo012 = new C0090o000Ooo0(ili11iili1l4, "400");
        C0090o000Ooo0 o000ooo013 = new C0090o000Ooo0(ili11iili1l4, "404");
        C0090o000Ooo0 o000ooo014 = new C0090o000Ooo0(ili11iili1l4, "500");
        C0090o000Ooo0 o000ooo015 = o000ooo014;
        iiIliillii = new C0090o000Ooo0[]{o000ooo0, o000ooo02, o000ooo03, o000ooo04, o000ooo05, o000ooo06, o000ooo07, o000ooo08, o000ooo09, o000ooo010, o000ooo011, o000ooo012, o000ooo013, o000ooo015, new C0090o000Ooo0("accept-charset", ""), new C0090o000Ooo0("accept-encoding", "gzip, deflate"), new C0090o000Ooo0("accept-language", ""), new C0090o000Ooo0("accept-ranges", ""), new C0090o000Ooo0("accept", ""), new C0090o000Ooo0("access-control-allow-origin", ""), new C0090o000Ooo0("age", ""), new C0090o000Ooo0("allow", ""), new C0090o000Ooo0("authorization", ""), new C0090o000Ooo0("cache-control", ""), new C0090o000Ooo0("content-disposition", ""), new C0090o000Ooo0("content-encoding", ""), new C0090o000Ooo0("content-language", ""), new C0090o000Ooo0("content-length", ""), new C0090o000Ooo0("content-location", ""), new C0090o000Ooo0("content-range", ""), new C0090o000Ooo0("content-type", ""), new C0090o000Ooo0("cookie", ""), new C0090o000Ooo0("date", ""), new C0090o000Ooo0("etag", ""), new C0090o000Ooo0("expect", ""), new C0090o000Ooo0("expires", ""), new C0090o000Ooo0("from", ""), new C0090o000Ooo0(C0099o000o0OO.IiIIlIL, ""), new C0090o000Ooo0("if-match", ""), new C0090o000Ooo0("if-modified-since", ""), new C0090o000Ooo0("if-none-match", ""), new C0090o000Ooo0("if-range", ""), new C0090o000Ooo0("if-unmodified-since", ""), new C0090o000Ooo0("last-modified", ""), new C0090o000Ooo0("link", ""), new C0090o000Ooo0("location", ""), new C0090o000Ooo0("max-forwards", ""), new C0090o000Ooo0("proxy-authenticate", ""), new C0090o000Ooo0("proxy-authorization", ""), new C0090o000Ooo0("range", ""), new C0090o000Ooo0("referer", ""), new C0090o000Ooo0("refresh", ""), new C0090o000Ooo0("retry-after", ""), new C0090o000Ooo0("server", ""), new C0090o000Ooo0("set-cookie", ""), new C0090o000Ooo0("strict-transport-security", ""), new C0090o000Ooo0(C0099o000o0OO.iILiI1lll, ""), new C0090o000Ooo0("user-agent", ""), new C0090o000Ooo0("vary", ""), new C0090o000Ooo0("via", ""), new C0090o000Ooo0("www-authenticate", "")};
    }

    public static Map<ili11iILI1l, Integer> i1LIL11l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(iiIliillii.length);
        int i = 0;
        while (true) {
            C0090o000Ooo0[] o000ooo0Arr = iiIliillii;
            if (i >= o000ooo0Arr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(o000ooo0Arr[i].iiI1L1iI)) {
                linkedHashMap.put(o000ooo0Arr[i].iiI1L1iI, Integer.valueOf(i));
            }
            i++;
        }
    }

    public static ili11iILI1l iiI1L1iI(ili11iILI1l ili11iili1l) throws IOException {
        int illiiliIILI = ili11iili1l.illiiliIILI();
        int i = 0;
        while (i < illiiliIILI) {
            byte i1L1lLllLLlIi = ili11iili1l.i1L1lLllLLlIi(i);
            if (i1L1lLllLLlIi < 65 || i1L1lLllLLlIi > 90) {
                i++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + ili11iili1l.ILiLII1ILi());
            }
        }
        return ili11iili1l;
    }
}
