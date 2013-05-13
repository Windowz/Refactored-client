/*     */ public class ct
/*     */ {
/*     */   public boolean l;
/*     */   int[] d;
/*     */   public static short[] g;
/*     */   int m;
/*     */   long c;
/*     */   long n;
/*     */   int[] r;
/*     */   public static short[][] q;
/*  23 */   static final int[] i = { 8, 11, 4, 6, 9, 7, 10 };
/*  24 */   static ce s = new ce(260);
/*     */   static dq co;
/*     */   static int gw;
/*     */   static int or;
/*     */ 
/*     */   fw a()
/*     */   {
/* 187 */     if (-1 != this.m * -1337103745) {
/* 188 */       return f.g(this.m * -1337103745, (byte)-84).v(-825585710);
/*     */     }
/* 190 */     int j = 0;
/* 191 */     for (int k = 0; k < 12; k++) {
/* 192 */       i1 = this.r[k];
/* 193 */       if ((i1 >= 256) && (i1 < 512) && 
/* 194 */         (!p.g(i1 - 256, -923288622).v((byte)-93))) j = 1;
/*     */ 
/* 196 */       if ((i1 >= 512) && 
/* 197 */         (!bb.z(i1 - 512, 1064122003).f(this.l, (byte)32))) j = 1;
/*     */     }
/*     */ 
/* 200 */     if (j != 0) return null;
/* 201 */     fw[] arrayOffw = new fw[12];
/* 202 */     int i1 = 0;
/* 203 */     for (int i2 = 0; i2 < 12; i2++) {
/* 204 */       i3 = this.r[i2];
/*     */       fw localfw2;
/* 205 */       if ((i3 >= 256) && (i3 < 512)) {
/* 206 */         localfw2 = p.g(i3 - 256, -53621350).w((byte)37);
/* 207 */         if (null != localfw2) arrayOffw[(i1++)] = localfw2;
/*     */       }
/* 209 */       if (i3 >= 512) {
/* 210 */         localfw2 = bb.z(i3 - 512, 1064122003).k(this.l, 876887922);
/* 211 */         if (null != localfw2) arrayOffw[(i1++)] = localfw2;
/*     */       }
/*     */     }
/* 214 */     fw localfw1 = new fw(arrayOffw, i1);
/* 215 */     for (int i3 = 0; i3 < 5; i3++) {
/* 216 */       if (this.d[i3] < bw.z[i3].length) localfw1.aa(c.j[i3], bw.z[i3][this.d[i3]]);
/* 217 */       if (this.d[i3] < q[i3].length) localfw1.aa(g[i3], q[i3][this.d[i3]]);
/*     */     }
/* 219 */     return localfw1;
/*     */   }
/*     */ 
/*     */   public void r(int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean, int paramInt1, int paramInt2)
/*     */   {
/*  27 */     if (null == paramArrayOfInt1) { if (paramInt2 != -1604645286) throw new IllegalStateException();
/*  28 */       paramArrayOfInt1 = new int[12];
/*  29 */       for (int j = 0; j < 7; j++) { if (paramInt2 != -1604645286) throw new IllegalStateException();
/*  30 */         for (int k = 0; k < dl.z * 1339023279; k++) { if (paramInt2 != -1604645286) return;
/*  31 */           fd localfd = p.g(k, 1428149772);
/*  32 */           if (localfd != null) { if (paramInt2 != -1604645286) throw new IllegalStateException(); if (!localfd.b) { if (paramInt2 != -1604645286) throw new IllegalStateException(); if (paramInt2 != -1604645286) return; if (1228813227 * localfd.q == j + (paramBoolean ? 7 : 0)) { if (paramInt2 == -1604645286);
/*  33 */                 paramArrayOfInt1[i[j]] = (256 + k);
/*  34 */                 break; } }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*  39 */     this.r = paramArrayOfInt1;
/*  40 */     this.d = paramArrayOfInt2;
/*  41 */     this.l = paramBoolean;
/*  42 */     this.m = (paramInt1 * -1262201473);
/*  43 */     n(1561388230);
/*     */   }
/*     */ 
/*     */   public void d(int paramInt1, boolean paramBoolean, int paramInt2) {
/*  47 */     if ((paramInt1 == 1) && ((paramInt2 <= -236004550) || (this.l))) { if (paramInt2 > -236004550);
/*  47 */       return; }
/*  48 */     int j = this.r[i[paramInt1]];
/*  49 */     if (j == 0) { if (paramInt2 > -236004550);
/*  49 */       return; }
/*  50 */     j -= 256;
/*     */     while (true) {
/*  52 */       if (!paramBoolean) { if (paramInt2 > -236004550);
/*  53 */         j--;
/*  54 */         if (j < 0) { if (paramInt2 > -236004550);
/*  54 */           j = dl.z * 1339023279 - 1; }
/*     */       } else
/*     */       {
/*  57 */         j++;
/*  58 */         if (j >= 1339023279 * dl.z) { if (paramInt2 > -236004550);
/*  58 */           j = 0; }
/*     */       }
/*  60 */       fd localfd = p.g(j, 1744745929);
/*  61 */       if (localfd != null) { if (paramInt2 <= -236004550) throw new IllegalStateException(); if (!localfd.b) { if (paramInt2 <= -236004550) return; if (paramInt2 <= -236004550) throw new IllegalStateException(); if (1228813227 * localfd.q == (this.l ? 7 : 0) + paramInt1) { if (paramInt2 <= -236004550) throw new IllegalStateException(); break; } } }
/*     */     }
/*  63 */     this.r[i[paramInt1]] = (j + 256);
/*  64 */     n(1561388230);
/*     */   }
/*     */ 
/*     */   public void l(int paramInt1, boolean paramBoolean, int paramInt2) {
/*  68 */     int j = this.d[paramInt1];
/*  69 */     if (!paramBoolean) { if (paramInt2 >= 1615826184) return;
/*  70 */       j--;
/*  71 */       if (j < 0) { if (paramInt2 < 1615826184);
/*  71 */         j = bw.z[paramInt1].length - 1; }
/*     */     } else
/*     */     {
/*  74 */       j++;
/*  75 */       if (j >= bw.z[paramInt1].length) { if (paramInt2 < 1615826184);
/*  75 */         j = 0; }
/*     */     }
/*  77 */     this.d[paramInt1] = j;
/*  78 */     n(1561388230);
/*     */   }
/*     */ 
/*     */   public void m(boolean paramBoolean, int paramInt) {
/*  82 */     if (this.l == paramBoolean) { if (paramInt < -529152772);
/*  82 */       return; }
/*  83 */     r(null, this.d, paramBoolean, -1, -1604645286);
/*     */   }
/*     */ 
/*     */   public void c(ev paramev, int paramInt) {
/*  87 */     if (paramInt != -1361357993) throw new IllegalStateException(); paramev.c(this.l ? 1 : 0, 1314814376);
/*  88 */     for (int j = 0; j < 7; j++) { if (paramInt != -1361357993) throw new IllegalStateException();
/*  89 */       int k = this.r[i[j]];
/*  90 */       if (0 == k) { if (paramInt == -1361357993);
/*  90 */         paramev.c(-1, 1265613675); } else {
/*  91 */         paramev.c(k - 256, 1354486904);
/*     */       } }
/*  93 */     for (j = 0; j < 5; j++) { if (paramInt != -1361357993) return; paramev.c(this.d[j], 1976654968); }
/*     */   }
/*     */ 
/*     */   void n(int paramInt) {
/*  97 */     long l1 = -3907175932511357469L * this.c;
/*  98 */     int j = this.r[5];
/*  99 */     int k = this.r[9];
/* 100 */     this.r[5] = k;
/* 101 */     this.r[9] = j;
/* 102 */     this.c = 0L;
/* 103 */     for (int i1 = 0; i1 < 12; i1++) { if (paramInt != 1561388230) throw new IllegalStateException();
/* 104 */       this.c = (-579607382353610805L * (this.c * -3907175932511357469L << 4));
/* 105 */       if (this.r[i1] >= 256) { if (paramInt != 1561388230) return; this.c += (this.r[i1] - 256) * -579607382353610805L; }
/*     */     }
/* 107 */     if (this.r[0] >= 256) { if (paramInt != 1561388230) return; this.c += -579607382353610805L * (this.r[0] - 256 >> 4); }
/* 108 */     if (this.r[1] >= 256) { if (paramInt == 1561388230);
/* 108 */       this.c += -579607382353610805L * (this.r[1] - 256 >> 8); }
/* 109 */     for (i1 = 0; i1 < 5; i1++) { if (paramInt != 1561388230) throw new IllegalStateException();
/* 110 */       this.c = ((this.c * -3907175932511357469L << 3) * -579607382353610805L);
/* 111 */       this.c += this.d[i1] * -579607382353610805L;
/*     */     }
/* 113 */     this.c = ((-3907175932511357469L * this.c << 1) * -579607382353610805L);
/* 114 */     if (this.l) tmpTernaryOp = 1;
/*     */   }
/*     */ 
/*     */   public fo j(eo parameo1, int paramInt1, eo parameo2, int paramInt2, byte paramByte)
/*     */   {
/* 121 */     if (this.m * -1337103745 != -1) { if (paramByte == 1) throw new IllegalStateException();
/* 122 */       return f.g(-1337103745 * this.m, (byte)-85).u(parameo1, paramInt1, parameo2, paramInt2, (byte)19);
/*     */     }
/* 124 */     long l1 = -3907175932511357469L * this.c;
/* 125 */     int[] arrayOfInt = this.r;
/* 126 */     if (parameo1 != null) { if (paramByte == 1) throw new IllegalStateException(); if (parameo1.t * 1057612145 < 0) { if (paramByte == 1) throw new IllegalStateException(); if (parameo1.f * 89028059 < 0) break label289; if (paramByte == 1) throw new IllegalStateException(); 
/*     */       }
/* 127 */       arrayOfInt = new int[12];
/* 128 */       for (int j = 0; j < 12; j++) { if (paramByte != 1);
/* 128 */         arrayOfInt[j] = this.r[j]; }
/* 129 */       if (parameo1.t * 1057612145 >= 0) { if (paramByte == 1) throw new IllegalStateException();
/* 130 */         l1 += (parameo1.t * 1057612145 - this.r[5] << 8);
/* 131 */         arrayOfInt[5] = (1057612145 * parameo1.t);
/*     */       }
/* 133 */       if (89028059 * parameo1.f >= 0) { if (paramByte == 1) throw new IllegalStateException();
/* 134 */         l1 += (parameo1.f * 89028059 - this.r[3] << 16);
/* 135 */         arrayOfInt[3] = (parameo1.f * 89028059);
/*     */       }
/*     */     }
/* 138 */     label289: fo localfo1 = (fo)s.r(l1);
/* 139 */     if (null == localfo1) { if (paramByte != 1);
/* 140 */       int k = 0;
/*     */       int i2;
/* 141 */       for (int i1 = 0; i1 < 12; i1++) { if (paramByte != 1);
/* 142 */         i2 = arrayOfInt[i1];
/* 143 */         if (i2 >= 256) { if (paramByte == 1) throw new IllegalStateException(); if ((i2 < 512) && ((paramByte == 1) || 
/* 144 */             (!p.g(i2 - 256, 684561382).s(1756762219)))) { if (paramByte != 1);
/* 144 */             k = 1; }
/*     */         }
/* 146 */         if (i2 >= 512) { if (paramByte == 1) throw new IllegalStateException();
/* 147 */           if (!bb.z(i2 - 512, 1064122003).y(this.l, 1123683833)) { if (paramByte == 1) throw new IllegalStateException(); k = 1; }
/*     */         }
/*     */       }
/* 150 */       if (k != 0) { if (paramByte == 1) throw new IllegalStateException();
/* 151 */         if (this.n * -2287209920803790149L != -1L) { if (paramByte != 1);
/* 151 */           localfo1 = (fo)s.r(this.n * -2287209920803790149L); }
/* 152 */         if (null == localfo1) { if (paramByte != 1);
/* 152 */           return null; }
/*     */       }
/* 154 */       if (localfo1 == null) { if (paramByte == 1) throw new IllegalStateException();
/* 155 */         fw[] arrayOffw = new fw[12];
/* 156 */         i2 = 0;
/* 157 */         for (int i3 = 0; i3 < 12; i3++) { if (paramByte != 1);
/* 158 */           i4 = arrayOfInt[i3];
/*     */           fw localfw2;
/* 159 */           if (i4 >= 256) { if (paramByte == 1) throw new IllegalStateException(); if (i4 < 512) { if (paramByte != 1);
/* 160 */               localfw2 = p.g(i4 - 256, -481381420).u((short)-16944);
/* 161 */               if (localfw2 != null) { if (paramByte == 1) throw new IllegalStateException(); arrayOffw[(i2++)] = localfw2; } }
/*     */           }
/* 163 */           if (i4 >= 512) { if (paramByte == 1) throw new IllegalStateException();
/* 164 */             localfw2 = bb.z(i4 - 512, 1064122003).t(this.l, -1246047945);
/* 165 */             if (null != localfw2) { if (paramByte != 1);
/* 165 */               arrayOffw[(i2++)] = localfw2; }
/*     */           }
/*     */         }
/* 168 */         fw localfw1 = new fw(arrayOffw, i2);
/* 169 */         for (int i4 = 0; i4 < 5; i4++) { if (paramByte == 1) throw new IllegalStateException();
/* 170 */           if (this.d[i4] < bw.z[i4].length) { if (paramByte == 1) throw new IllegalStateException(); localfw1.aa(c.j[i4], bw.z[i4][this.d[i4]]); }
/* 171 */           if (this.d[i4] < q[i4].length) { if (paramByte == 1) throw new IllegalStateException(); localfw1.aa(g[i4], q[i4][this.d[i4]]); }
/*     */         }
/* 173 */         localfo1 = localfw1.ah(64, 850, -30, -50, -30);
/* 174 */         s.l(localfo1, l1);
/* 175 */         this.n = (l1 * -8475485620753378701L);
/*     */       }
/*     */     }
/*     */ 
/* 179 */     if ((null == parameo1) && ((paramByte == 1) || (parameo2 == null))) { if (paramByte == 1) throw new IllegalStateException(); return localfo1;
/*     */     }
/* 180 */     fo localfo2;
/* 180 */     if (parameo1 != null) { if (paramByte == 1) throw new IllegalStateException(); if (parameo2 != null) { if (paramByte != 1);
/* 180 */         localfo2 = parameo1.e(localfo1, paramInt1, parameo2, paramInt2, -1078763104); break label1100; } }
/* 181 */     if (null != parameo1) { if (paramByte == 1) throw new IllegalStateException(); localfo2 = parameo1.u(localfo1, paramInt1, 1179557100); } else {
/* 182 */       localfo2 = parameo2.u(localfo1, paramInt2, -876616436);
/* 183 */     }label1100: return localfo2;
/*     */   }
/*     */ 
/*     */   public void i(int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean, int paramInt)
/*     */   {
/*  27 */     if (null == paramArrayOfInt1) {
/*  28 */       paramArrayOfInt1 = new int[12];
/*  29 */       for (int j = 0; j < 7; j++) {
/*  30 */         for (int k = 0; k < dl.z * 1339023279; k++) {
/*  31 */           fd localfd = p.g(k, -1011696208);
/*  32 */           if ((localfd != null) && (!localfd.b)) if (1228813227 * localfd.q == j + (paramBoolean ? 7 : 0)) {
/*  33 */               paramArrayOfInt1[i[j]] = (256 + k);
/*  34 */               break;
/*     */             }
/*     */         }
/*     */       }
/*     */     }
/*  39 */     this.r = paramArrayOfInt1;
/*  40 */     this.d = paramArrayOfInt2;
/*  41 */     this.l = paramBoolean;
/*  42 */     this.m = (paramInt * -1262201473);
/*  43 */     n(1561388230);
/*     */   }
/*     */ 
/*     */   public int g(int paramInt)
/*     */   {
/* 223 */     if (-1337103745 * this.m == -1) { if (paramInt == -752747097) throw new IllegalStateException(); return (this.r[11] << 5) + ((this.r[8] << 10) + ((this.d[4] << 20) + (this.d[0] << 25) + (this.r[0] << 15))) + this.r[1]; }
/* 224 */     return 305419896 + f.g(this.m * -1337103745, (byte)-102).q * -573647101;
/*     */   }
/*     */ 
/*     */   public int p()
/*     */   {
/* 223 */     if (-1337103745 * this.m == -1) return (this.r[11] << 5) + ((this.r[8] << 10) + ((this.d[4] << 20) + (this.d[0] << 25) + (this.r[0] << 15))) + this.r[1];
/* 224 */     return 305419896 + f.g(this.m * -1337103745, (byte)-37).q * -573647101;
/*     */   }
/*     */ 
/*     */   public void s(int paramInt, boolean paramBoolean)
/*     */   {
/*  68 */     int j = this.d[paramInt];
/*  69 */     if (!paramBoolean) {
/*  70 */       j--;
/*  71 */       if (j < 0) j = bw.z[paramInt].length - 1; 
/*     */     }
/*     */     else
/*     */     {
/*  74 */       j++;
/*  75 */       if (j >= bw.z[paramInt].length) j = 0;
/*     */     }
/*  77 */     this.d[paramInt] = j;
/*  78 */     n(1561388230);
/*     */   }
/*     */ 
/*     */   void t()
/*     */   {
/*  97 */     long l1 = -3907175932511357469L * this.c;
/*  98 */     int j = this.r[5];
/*  99 */     int k = this.r[9];
/* 100 */     this.r[5] = k;
/* 101 */     this.r[9] = j;
/* 102 */     this.c = 0L;
/* 103 */     for (int i1 = 0; i1 < 12; i1++) {
/* 104 */       this.c = (-579607382353610805L * (this.c * -3907175932511357469L << 4));
/* 105 */       if (this.r[i1] >= 256) this.c += (this.r[i1] - 256) * -579607382353610805L;
/*     */     }
/* 107 */     if (this.r[0] >= 256) this.c += -579607382353610805L * (this.r[0] - 256 >> 4);
/* 108 */     if (this.r[1] >= 256) this.c += -579607382353610805L * (this.r[1] - 256 >> 8);
/* 109 */     for (i1 = 0; i1 < 5; i1++) {
/* 110 */       this.c = ((this.c * -3907175932511357469L << 3) * -579607382353610805L);
/* 111 */       this.c += this.d[i1] * -579607382353610805L;
/*     */     }
/* 113 */     this.c = ((-3907175932511357469L * this.c << 1) * -579607382353610805L);
/* 114 */     this.c += (this.l ? 1 : 0) * -579607382353610805L;
/* 115 */     this.r[5] = j;
/* 116 */     this.r[9] = k;
/* 117 */     if ((l1 != 0L) && (-3907175932511357469L * this.c != l1)) s.d(l1);
/*     */   }
/*     */ 
/*     */   public void v(int paramInt, boolean paramBoolean)
/*     */   {
/*  68 */     int j = this.d[paramInt];
/*  69 */     if (!paramBoolean) {
/*  70 */       j--;
/*  71 */       if (j < 0) j = bw.z[paramInt].length - 1; 
/*     */     }
/*     */     else
/*     */     {
/*  74 */       j++;
/*  75 */       if (j >= bw.z[paramInt].length) j = 0;
/*     */     }
/*  77 */     this.d[paramInt] = j;
/*  78 */     n(1561388230);
/*     */   }
/*     */ 
/*     */   public void w(boolean paramBoolean) {
/*  82 */     if (this.l == paramBoolean) return;
/*  83 */     r(null, this.d, paramBoolean, -1, -1604645286);
/*     */   }
/*     */ 
/*     */   void b()
/*     */   {
/*  97 */     long l1 = -3907175932511357469L * this.c;
/*  98 */     int j = this.r[5];
/*  99 */     int k = this.r[9];
/* 100 */     this.r[5] = k;
/* 101 */     this.r[9] = j;
/* 102 */     this.c = 0L;
/* 103 */     for (int i1 = 0; i1 < 12; i1++) {
/* 104 */       this.c = (-579607382353610805L * (this.c * -3907175932511357469L << 4));
/* 105 */       if (this.r[i1] >= 256) this.c += (this.r[i1] - 256) * -579607382353610805L;
/*     */     }
/* 107 */     if (this.r[0] >= 256) this.c += -579607382353610805L * (this.r[0] - 256 >> 4);
/* 108 */     if (this.r[1] >= 256) this.c += -579607382353610805L * (this.r[1] - 256 >> 8);
/* 109 */     for (i1 = 0; i1 < 5; i1++) {
/* 110 */       this.c = ((this.c * -3907175932511357469L << 3) * -579607382353610805L);
/* 111 */       this.c += this.d[i1] * -579607382353610805L;
/*     */     }
/* 113 */     this.c = ((-3907175932511357469L * this.c << 1) * -579607382353610805L);
/* 114 */     this.c += (this.l ? 1 : 0) * -579607382353610805L;
/* 115 */     this.r[5] = j;
/* 116 */     this.r[9] = k;
/* 117 */     if ((l1 != 0L) && (-3907175932511357469L * this.c != l1)) s.d(l1);
/*     */   }
/*     */ 
/*     */   void y()
/*     */   {
/*  97 */     long l1 = -3907175932511357469L * this.c;
/*  98 */     int j = this.r[5];
/*  99 */     int k = this.r[9];
/* 100 */     this.r[5] = k;
/* 101 */     this.r[9] = j;
/* 102 */     this.c = 0L;
/* 103 */     for (int i1 = 0; i1 < 12; i1++) {
/* 104 */       this.c = (-579607382353610805L * (this.c * -3907175932511357469L << 4));
/* 105 */       if (this.r[i1] >= 256) this.c += (this.r[i1] - 256) * -579607382353610805L;
/*     */     }
/* 107 */     if (this.r[0] >= 256) this.c += -579607382353610805L * (this.r[0] - 256 >> 4);
/* 108 */     if (this.r[1] >= 256) this.c += -579607382353610805L * (this.r[1] - 256 >> 8);
/* 109 */     for (i1 = 0; i1 < 5; i1++) {
/* 110 */       this.c = ((this.c * -3907175932511357469L << 3) * -579607382353610805L);
/* 111 */       this.c += this.d[i1] * -579607382353610805L;
/*     */     }
/* 113 */     this.c = ((-3907175932511357469L * this.c << 1) * -579607382353610805L);
/* 114 */     this.c += (this.l ? 1 : 0) * -579607382353610805L;
/* 115 */     this.r[5] = j;
/* 116 */     this.r[9] = k;
/* 117 */     if ((l1 != 0L) && (-3907175932511357469L * this.c != l1)) s.d(l1);
/*     */   }
/*     */ 
/*     */   public static void ad()
/*     */   {
/* 228 */     s.m();
/*     */   }
/*     */ 
/*     */   public fo f(eo parameo1, int paramInt1, eo parameo2, int paramInt2)
/*     */   {
/* 121 */     if (this.m * -1337103745 != -1) {
/* 122 */       return f.g(-1337103745 * this.m, (byte)-121).u(parameo1, paramInt1, parameo2, paramInt2, (byte)24);
/*     */     }
/* 124 */     long l1 = -3907175932511357469L * this.c;
/* 125 */     int[] arrayOfInt = this.r;
/* 126 */     if ((parameo1 != null) && ((parameo1.t * 1057612145 >= 0) || (parameo1.f * 89028059 >= 0))) {
/* 127 */       arrayOfInt = new int[12];
/* 128 */       for (int j = 0; j < 12; j++) arrayOfInt[j] = this.r[j];
/* 129 */       if (parameo1.t * 1057612145 >= 0) {
/* 130 */         l1 += (parameo1.t * 1057612145 - this.r[5] << 8);
/* 131 */         arrayOfInt[5] = (1057612145 * parameo1.t);
/*     */       }
/* 133 */       if (89028059 * parameo1.f >= 0) {
/* 134 */         l1 += (parameo1.f * 89028059 - this.r[3] << 16);
/* 135 */         arrayOfInt[3] = (parameo1.f * 89028059);
/*     */       }
/*     */     }
/* 138 */     fo localfo1 = (fo)s.r(l1);
/* 139 */     if (null == localfo1) {
/* 140 */       int k = 0;
/*     */       int i2;
/* 141 */       for (int i1 = 0; i1 < 12; i1++) {
/* 142 */         i2 = arrayOfInt[i1];
/* 143 */         if ((i2 >= 256) && (i2 < 512) && 
/* 144 */           (!p.g(i2 - 256, 1160105513).s(2051900225))) k = 1;
/*     */ 
/* 146 */         if ((i2 >= 512) && 
/* 147 */           (!bb.z(i2 - 512, 1064122003).y(this.l, -350698973))) k = 1;
/*     */       }
/*     */ 
/* 150 */       if (k != 0) {
/* 151 */         if (this.n * -2287209920803790149L != -1L) localfo1 = (fo)s.r(this.n * -2287209920803790149L);
/* 152 */         if (null == localfo1) return null;
/*     */       }
/* 154 */       if (localfo1 == null) {
/* 155 */         fw[] arrayOffw = new fw[12];
/* 156 */         i2 = 0;
/* 157 */         for (int i3 = 0; i3 < 12; i3++) {
/* 158 */           i4 = arrayOfInt[i3];
/*     */           fw localfw2;
/* 159 */           if ((i4 >= 256) && (i4 < 512)) {
/* 160 */             localfw2 = p.g(i4 - 256, 2133451605).u((short)-27710);
/* 161 */             if (localfw2 != null) arrayOffw[(i2++)] = localfw2;
/*     */           }
/* 163 */           if (i4 >= 512) {
/* 164 */             localfw2 = bb.z(i4 - 512, 1064122003).t(this.l, -299395103);
/* 165 */             if (null != localfw2) arrayOffw[(i2++)] = localfw2;
/*     */           }
/*     */         }
/* 168 */         fw localfw1 = new fw(arrayOffw, i2);
/* 169 */         for (int i4 = 0; i4 < 5; i4++) {
/* 170 */           if (this.d[i4] < bw.z[i4].length) localfw1.aa(c.j[i4], bw.z[i4][this.d[i4]]);
/* 171 */           if (this.d[i4] < q[i4].length) localfw1.aa(g[i4], q[i4][this.d[i4]]);
/*     */         }
/* 173 */         localfo1 = localfw1.ah(64, 850, -30, -50, -30);
/* 174 */         s.l(localfo1, l1);
/* 175 */         this.n = (l1 * -8475485620753378701L);
/*     */       }
/*     */     }
/*     */ 
/* 179 */     if ((null == parameo1) && (parameo2 == null)) return localfo1;
/* 180 */     fo localfo2;
/* 180 */     if ((parameo1 != null) && (parameo2 != null)) localfo2 = parameo1.e(localfo1, paramInt1, parameo2, paramInt2, -1078763104);
/* 181 */     else if (null != parameo1) localfo2 = parameo1.u(localfo1, paramInt1, -192940884); else
/* 182 */       localfo2 = parameo2.u(localfo1, paramInt2, 159083911);
/* 183 */     return localfo2;
/*     */   }
/*     */ 
/*     */   fw k() {
/* 187 */     if (-1 != this.m * -1337103745) {
/* 188 */       return f.g(this.m * -1337103745, (byte)-85).v(-536626392);
/*     */     }
/* 190 */     int j = 0;
/* 191 */     for (int k = 0; k < 12; k++) {
/* 192 */       i1 = this.r[k];
/* 193 */       if ((i1 >= 256) && (i1 < 512) && 
/* 194 */         (!p.g(i1 - 256, 162995247).v((byte)-77))) j = 1;
/*     */ 
/* 196 */       if ((i1 >= 512) && 
/* 197 */         (!bb.z(i1 - 512, 1064122003).f(this.l, (byte)-85))) j = 1;
/*     */     }
/*     */ 
/* 200 */     if (j != 0) return null;
/* 201 */     fw[] arrayOffw = new fw[12];
/* 202 */     int i1 = 0;
/* 203 */     for (int i2 = 0; i2 < 12; i2++) {
/* 204 */       i3 = this.r[i2];
/*     */       fw localfw2;
/* 205 */       if ((i3 >= 256) && (i3 < 512)) {
/* 206 */         localfw2 = p.g(i3 - 256, 1199720191).w((byte)-9);
/* 207 */         if (null != localfw2) arrayOffw[(i1++)] = localfw2;
/*     */       }
/* 209 */       if (i3 >= 512) {
/* 210 */         localfw2 = bb.z(i3 - 512, 1064122003).k(this.l, -957998127);
/* 211 */         if (null != localfw2) arrayOffw[(i1++)] = localfw2;
/*     */       }
/*     */     }
/* 214 */     fw localfw1 = new fw(arrayOffw, i1);
/* 215 */     for (int i3 = 0; i3 < 5; i3++) {
/* 216 */       if (this.d[i3] < bw.z[i3].length) localfw1.aa(c.j[i3], bw.z[i3][this.d[i3]]);
/* 217 */       if (this.d[i3] < q[i3].length) localfw1.aa(g[i3], q[i3][this.d[i3]]);
/*     */     }
/* 219 */     return localfw1;
/*     */   }
/*     */ 
/*     */   fw o()
/*     */   {
/* 187 */     if (-1 != this.m * -1337103745) {
/* 188 */       return f.g(this.m * -1337103745, (byte)-48).v(-750440655);
/*     */     }
/* 190 */     int j = 0;
/* 191 */     for (int k = 0; k < 12; k++) {
/* 192 */       i1 = this.r[k];
/* 193 */       if ((i1 >= 256) && (i1 < 512) && 
/* 194 */         (!p.g(i1 - 256, -712598410).v((byte)-55))) j = 1;
/*     */ 
/* 196 */       if ((i1 >= 512) && 
/* 197 */         (!bb.z(i1 - 512, 1064122003).f(this.l, (byte)48))) j = 1;
/*     */     }
/*     */ 
/* 200 */     if (j != 0) return null;
/* 201 */     fw[] arrayOffw = new fw[12];
/* 202 */     int i1 = 0;
/* 203 */     for (int i2 = 0; i2 < 12; i2++) {
/* 204 */       i3 = this.r[i2];
/*     */       fw localfw2;
/* 205 */       if ((i3 >= 256) && (i3 < 512)) {
/* 206 */         localfw2 = p.g(i3 - 256, -700639066).w((byte)-17);
/* 207 */         if (null != localfw2) arrayOffw[(i1++)] = localfw2;
/*     */       }
/* 209 */       if (i3 >= 512) {
/* 210 */         localfw2 = bb.z(i3 - 512, 1064122003).k(this.l, 262714832);
/* 211 */         if (null != localfw2) arrayOffw[(i1++)] = localfw2;
/*     */       }
/*     */     }
/* 214 */     fw localfw1 = new fw(arrayOffw, i1);
/* 215 */     for (int i3 = 0; i3 < 5; i3++) {
/* 216 */       if (this.d[i3] < bw.z[i3].length) localfw1.aa(c.j[i3], bw.z[i3][this.d[i3]]);
/* 217 */       if (this.d[i3] < q[i3].length) localfw1.aa(g[i3], q[i3][this.d[i3]]);
/*     */     }
/* 219 */     return localfw1;
/*     */   }
/*     */ 
/*     */   public void u(int paramInt, boolean paramBoolean)
/*     */   {
/*  68 */     int j = this.d[paramInt];
/*  69 */     if (!paramBoolean) {
/*  70 */       j--;
/*  71 */       if (j < 0) j = bw.z[paramInt].length - 1; 
/*     */     }
/*     */     else
/*     */     {
/*  74 */       j++;
/*  75 */       if (j >= bw.z[paramInt].length) j = 0;
/*     */     }
/*  77 */     this.d[paramInt] = j;
/*  78 */     n(1561388230);
/*     */   }
/*     */ 
/*     */   void e()
/*     */   {
/*  97 */     long l1 = -3907175932511357469L * this.c;
/*  98 */     int j = this.r[5];
/*  99 */     int k = this.r[9];
/* 100 */     this.r[5] = k;
/* 101 */     this.r[9] = j;
/* 102 */     this.c = 0L;
/* 103 */     for (int i1 = 0; i1 < 12; i1++) {
/* 104 */       this.c = (-579607382353610805L * (this.c * -3907175932511357469L << 4));
/* 105 */       if (this.r[i1] >= 256) this.c += (this.r[i1] - 256) * -579607382353610805L;
/*     */     }
/* 107 */     if (this.r[0] >= 256) this.c += -579607382353610805L * (this.r[0] - 256 >> 4);
/* 108 */     if (this.r[1] >= 256) this.c += -579607382353610805L * (this.r[1] - 256 >> 8);
/* 109 */     for (i1 = 0; i1 < 5; i1++) {
/* 110 */       this.c = ((this.c * -3907175932511357469L << 3) * -579607382353610805L);
/* 111 */       this.c += this.d[i1] * -579607382353610805L;
/*     */     }
/* 113 */     this.c = ((-3907175932511357469L * this.c << 1) * -579607382353610805L);
/* 114 */     this.c += (this.l ? 1 : 0) * -579607382353610805L;
/* 115 */     this.r[5] = j;
/* 116 */     this.r[9] = k;
/* 117 */     if ((l1 != 0L) && (-3907175932511357469L * this.c != l1)) s.d(l1);
/*     */   }
/*     */ 
/*     */   public int x()
/*     */   {
/* 223 */     if (-1337103745 * this.m == -1) return (this.r[11] << 5) + ((this.r[8] << 10) + ((this.d[4] << 20) + (this.d[0] << 25) + (this.r[0] << 15))) + this.r[1];
/* 224 */     return 305419896 + f.g(this.m * -1337103745, (byte)-66).q * -573647101;
/*     */   }
/*     */ 
/*     */   fw h()
/*     */   {
/* 187 */     if (-1 != this.m * -1337103745) {
/* 188 */       return f.g(this.m * -1337103745, (byte)-104).v(-1411552272);
/*     */     }
/* 190 */     int j = 0;
/* 191 */     for (int k = 0; k < 12; k++) {
/* 192 */       i1 = this.r[k];
/* 193 */       if ((i1 >= 256) && (i1 < 512) && 
/* 194 */         (!p.g(i1 - 256, 1596183639).v((byte)-100))) j = 1;
/*     */ 
/* 196 */       if ((i1 >= 512) && 
/* 197 */         (!bb.z(i1 - 512, 1064122003).f(this.l, (byte)3))) j = 1;
/*     */     }
/*     */ 
/* 200 */     if (j != 0) return null;
/* 201 */     fw[] arrayOffw = new fw[12];
/* 202 */     int i1 = 0;
/* 203 */     for (int i2 = 0; i2 < 12; i2++) {
/* 204 */       i3 = this.r[i2];
/*     */       fw localfw2;
/* 205 */       if ((i3 >= 256) && (i3 < 512)) {
/* 206 */         localfw2 = p.g(i3 - 256, 324383541).w((byte)10);
/* 207 */         if (null != localfw2) arrayOffw[(i1++)] = localfw2;
/*     */       }
/* 209 */       if (i3 >= 512) {
/* 210 */         localfw2 = bb.z(i3 - 512, 1064122003).k(this.l, -14052350);
/* 211 */         if (null != localfw2) arrayOffw[(i1++)] = localfw2;
/*     */       }
/*     */     }
/* 214 */     fw localfw1 = new fw(arrayOffw, i1);
/* 215 */     for (int i3 = 0; i3 < 5; i3++) {
/* 216 */       if (this.d[i3] < bw.z[i3].length) localfw1.aa(c.j[i3], bw.z[i3][this.d[i3]]);
/* 217 */       if (this.d[i3] < q[i3].length) localfw1.aa(g[i3], q[i3][this.d[i3]]);
/*     */     }
/* 219 */     return localfw1;
/*     */   }
/*     */ 
/*     */   fw z(int paramInt)
/*     */   {
/* 187 */     if (-1 != this.m * -1337103745) { if (paramInt == 576757028);
/* 188 */       return f.g(this.m * -1337103745, (byte)-72).v(-733139311);
/*     */     }
/* 190 */     int j = 0;
/* 191 */     for (int k = 0; k < 12; k++) { if (paramInt == 576757028);
/* 192 */       i1 = this.r[k];
/* 193 */       if ((i1 >= 256) && ((paramInt != 576757028) || ((i1 < 512) && ((paramInt != 576757028) || 
/* 194 */         (!p.g(i1 - 256, 1813490737).v((byte)-94)))))) { if (paramInt == 576757028);
/* 194 */         j = 1;
/*     */       }
/* 196 */       if (i1 >= 512) { if (paramInt != 576757028) throw new IllegalStateException();
/* 197 */         if (!bb.z(i1 - 512, 1064122003).f(this.l, (byte)-38)) { if (paramInt != 576757028) throw new IllegalStateException(); j = 1; }
/*     */       }
/*     */     }
/* 200 */     if (j != 0) { if (paramInt == 576757028);
/* 200 */       return null; }
/* 201 */     fw[] arrayOffw = new fw[12];
/* 202 */     int i1 = 0;
/* 203 */     for (int i2 = 0; i2 < 12; i2++) { if (paramInt == 576757028);
/* 204 */       i3 = this.r[i2];
/*     */       fw localfw2;
/* 205 */       if (i3 >= 256) { if (paramInt != 576757028) throw new IllegalStateException(); if (i3 < 512) { if (paramInt != 576757028) throw new IllegalStateException();
/* 206 */           localfw2 = p.g(i3 - 256, -140850062).w((byte)46);
/* 207 */           if (null != localfw2) { if (paramInt == 576757028);
/* 207 */             arrayOffw[(i1++)] = localfw2; } }
/*     */       }
/* 209 */       if (i3 >= 512) { if (paramInt != 576757028) throw new IllegalStateException();
/* 210 */         localfw2 = bb.z(i3 - 512, 1064122003).k(this.l, 2105549758);
/* 211 */         if (null != localfw2) { if (paramInt == 576757028);
/* 211 */           arrayOffw[(i1++)] = localfw2; }
/*     */       }
/*     */     }
/* 214 */     fw localfw1 = new fw(arrayOffw, i1);
/* 215 */     for (int i3 = 0; i3 < 5; i3++) { if ((paramInt != 576757028) || 
/* 216 */         (this.d[i3] < bw.z[i3].length)) { if (paramInt != 576757028) throw new IllegalStateException(); localfw1.aa(c.j[i3], bw.z[i3][this.d[i3]]); }
/* 217 */       if (this.d[i3] < q[i3].length) { if (paramInt != 576757028) throw new IllegalStateException(); localfw1.aa(g[i3], q[i3][this.d[i3]]); }
/*     */     }
/* 219 */     return localfw1;
/*     */   }
/*     */ 
/*     */   public static void ac()
/*     */   {
/* 228 */     s.m();
/*     */   }
/*     */ 
/*     */   public static void z(ch paramch1, ch paramch2, int paramInt)
/*     */   {
/*  27 */     fd.n = paramch1;
/*  28 */     fd.j = paramch2;
/*  29 */     dl.z = fd.n.u(3, (short)19477) * -1486694577;
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ct
 * JD-Core Version:    0.6.2
 */