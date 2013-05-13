/*     */ import java.util.Random;
/*     */ 
/*     */ public class t
/*     */ {
/*  20 */   int s = 0;
/*     */   k d;
/*  21 */   int u = 100;
/*     */   k m;
/*     */   k c;
/*     */   k n;
/*  40 */   static int[] y = new int[220500];
/*     */   k z;
/*     */   k l;
/*  18 */   int[] q = { 0, 0, 0, 0, 0 };
/*  19 */   int[] i = { 0, 0, 0, 0, 0 };
/*     */ 
/*  44 */   static int[] o = new int[5];
/*     */   k r;
/*     */   ad v;
/*     */   k w;
/*  24 */   int e = 500;
/*  25 */   int b = 0;
/*     */ 
/*  17 */   int[] g = { 0, 0, 0, 0, 0 };
/*     */   k j;
/*     */   static int[] f;
/*  31 */   static int[] t = new int[32768];
/*     */   static final double k = 1.005792941067853D;
/*  45 */   static int[] a = new int[5];
/*  46 */   static int[] h = new int[5];
/*  47 */   static int[] x = new int[5];
/*  48 */   static int[] p = new int[5];
/*     */ 
/*     */   final int[] m(int paramInt1, int paramInt2)
/*     */   {
/*  53 */     bj.q(y, 0, paramInt1);
/*  54 */     if (paramInt2 < 10) return y;
/*  55 */     double d1 = paramInt1 / (paramInt2 + 0.0D);
/*  56 */     this.r.l();
/*  57 */     this.d.l();
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     if (this.l != null) {
/*  62 */       this.l.l();
/*  63 */       this.m.l();
/*  64 */       i1 = (int)((this.l.c - this.l.m) * 32.768000000000001D / d1);
/*  65 */       i2 = (int)(this.l.m * 32.768000000000001D / d1);
/*     */     }
/*  67 */     int i4 = 0;
/*  68 */     int i5 = 0;
/*  69 */     int i6 = 0;
/*  70 */     if (this.c != null) {
/*  71 */       this.c.l();
/*  72 */       this.n.l();
/*  73 */       i4 = (int)((this.c.c - this.c.m) * 32.768000000000001D / d1);
/*  74 */       i5 = (int)(this.c.m * 32.768000000000001D / d1);
/*     */     }
/*  76 */     for (int i7 = 0; i7 < 5; i7++)
/*  77 */       if (this.g[i7] != 0) {
/*  78 */         o[i7] = 0;
/*  79 */         a[i7] = ((int)(this.i[i7] * d1));
/*  80 */         h[i7] = ((this.g[i7] << 14) / 100);
/*  81 */         x[i7] = ((int)((this.r.c - this.r.m) * 32.768000000000001D * Math.pow(1.005792941067853D, this.q[i7]) / d1));
/*  82 */         p[i7] = ((int)(this.r.m * 32.768000000000001D / d1));
/*     */       }
/*     */     int i8;
/*     */     int i9;
/*     */     int i10;
/*     */     int i11;
/*  84 */     for (i7 = 0; i7 < paramInt1; i7++) {
/*  85 */       i8 = this.r.m(paramInt1);
/*  86 */       i9 = this.d.m(paramInt1);
/*  87 */       if (this.l != null) {
/*  88 */         i10 = this.l.m(paramInt1);
/*  89 */         i11 = this.m.m(paramInt1);
/*  90 */         i8 += (d(i3, i11, this.l.n) >> 1);
/*  91 */         i3 += (i10 * i1 >> 16) + i2;
/*     */       }
/*  93 */       if (this.c != null) {
/*  94 */         i10 = this.c.m(paramInt1);
/*  95 */         i11 = this.n.m(paramInt1);
/*  96 */         i9 = i9 * ((d(i6, i11, this.c.n) >> 1) + 32768) >> 15;
/*  97 */         i6 += (i10 * i4 >> 16) + i5;
/*     */       }
/*  99 */       for (i10 = 0; i10 < 5; i10++)
/* 100 */         if (this.g[i10] != 0) {
/* 101 */           i11 = i7 + a[i10];
/* 102 */           if (i11 < paramInt1) {
/* 103 */             y[i11] += d(o[i10], i9 * h[i10] >> 15, this.r.n);
/* 104 */             o[i10] += (i8 * x[i10] >> 16) + p[i10];
/*     */           }
/*     */         }
/*     */     }
/*     */     int i12;
/* 108 */     if (this.j != null) {
/* 109 */       this.j.l();
/* 110 */       this.z.l();
/* 111 */       i7 = 0;
/* 112 */       i8 = 0;
/* 113 */       i9 = 1;
/* 114 */       for (i10 = 0; i10 < paramInt1; i10++) {
/* 115 */         i11 = this.j.m(paramInt1);
/* 116 */         i12 = this.z.m(paramInt1);
/* 117 */         if (i9 != 0) i8 = this.j.m + ((this.j.c - this.j.m) * i11 >> 8); else
/* 118 */           i8 = this.j.m + ((this.j.c - this.j.m) * i12 >> 8);
/* 119 */         i7 += 256; if (i7 >= i8) {
/* 120 */           i7 = 0;
/* 121 */           i9 = i9 == 0 ? 1 : 0;
/*     */         }
/* 123 */         if (i9 != 0) y[i10] = 0;
/*     */       }
/*     */     }
/* 126 */     if ((this.s > 0) && (this.u > 0)) {
/* 127 */       i7 = (int)(this.s * d1);
/* 128 */       for (i8 = i7; i8 < paramInt1; i8++) y[i8] += y[(i8 - i7)] * this.u / 100;
/*     */     }
/* 130 */     if ((this.v.r[0] > 0) || (this.v.r[1] > 0)) {
/* 131 */       this.w.l();
/* 132 */       i7 = this.w.m(paramInt1 + 1);
/* 133 */       i8 = this.v.m(0, i7 / 65536.0F);
/* 134 */       i9 = this.v.m(1, i7 / 65536.0F);
/* 135 */       if (paramInt1 >= i8 + i9) {
/* 136 */         i10 = 0;
/* 137 */         i11 = i9;
/* 138 */         if (i11 > paramInt1 - i8) i11 = paramInt1 - i8;
/*     */         int i13;
/* 139 */         for (; i10 < i11; i10++) {
/* 140 */           i12 = (int)(y[(i10 + i8)] * ad.g >> 16);
/* 141 */           for (i13 = 0; i13 < i8; i13++) i12 += (int)(y[(i10 + i8 - 1 - i13)] * ad.j[0][i13] >> 16);
/* 142 */           for (i13 = 0; i13 < i10; i13++) i12 -= (int)(y[(i10 - 1 - i13)] * ad.j[1][i13] >> 16);
/* 143 */           y[i10] = i12;
/* 144 */           i7 = this.w.m(paramInt1 + 1);
/* 147 */         }
/*     */ i11 = 128;
/*     */         int i14;
/*     */         while (true) { if (i11 > paramInt1 - i8) i11 = paramInt1 - i8;
/* 150 */           for (; i10 < i11; i10++) {
/* 151 */             i13 = (int)(y[(i10 + i8)] * ad.g >> 16);
/* 152 */             for (i14 = 0; i14 < i8; i14++) i13 += (int)(y[(i10 + i8 - 1 - i14)] * ad.j[0][i14] >> 16);
/* 153 */             for (i14 = 0; i14 < i9; i14++) i13 -= (int)(y[(i10 - 1 - i14)] * ad.j[1][i14] >> 16);
/* 154 */             y[i10] = i13;
/* 155 */             i7 = this.w.m(paramInt1 + 1);
/*     */           }
/* 157 */           if (i10 >= paramInt1 - i8) break;
/* 158 */           i8 = this.v.m(0, i7 / 65536.0F);
/* 159 */           i9 = this.v.m(1, i7 / 65536.0F);
/* 160 */           i11 += 128;
/*     */         }
/* 162 */         for (; i10 < paramInt1; i10++) {
/* 163 */           i13 = 0;
/* 164 */           for (i14 = i10 + i8 - paramInt1; i14 < i8; i14++) i13 += (int)(y[(i10 + i8 - 1 - i14)] * ad.j[0][i14] >> 16);
/* 165 */           for (i14 = 0; i14 < i9; i14++) i13 -= (int)(y[(i10 - 1 - i14)] * ad.j[1][i14] >> 16);
/* 166 */           y[i10] = i13;
/* 167 */           i7 = this.w.m(paramInt1 + 1);
/*     */         }
/*     */       }
/*     */     }
/* 171 */     for (i7 = 0; i7 < paramInt1; i7++) {
/* 172 */       if (y[i7] < -32768) y[i7] = -32768;
/* 173 */       if (y[i7] > 32767) y[i7] = 32767;
/*     */     }
/* 175 */     return y;
/*     */   }
/*     */ 
/*     */   final void l(ev paramev)
/*     */   {
/* 190 */     this.r = new k();
/* 191 */     this.r.r(paramev);
/* 192 */     this.d = new k();
/* 193 */     this.d.r(paramev);
/* 194 */     int i1 = paramev.t(1118814123);
/* 195 */     if (i1 != 0) {
/* 196 */       paramev.c -= -941396361;
/* 197 */       this.l = new k();
/* 198 */       this.l.r(paramev);
/* 199 */       this.m = new k();
/* 200 */       this.m.r(paramev);
/*     */     }
/* 202 */     i1 = paramev.t(1118814123);
/* 203 */     if (i1 != 0) {
/* 204 */       paramev.c -= -941396361;
/* 205 */       this.c = new k();
/* 206 */       this.c.r(paramev);
/* 207 */       this.n = new k();
/* 208 */       this.n.r(paramev);
/*     */     }
/* 210 */     i1 = paramev.t(1118814123);
/* 211 */     if (i1 != 0) {
/* 212 */       paramev.c -= -941396361;
/* 213 */       this.j = new k();
/* 214 */       this.j.r(paramev);
/* 215 */       this.z = new k();
/* 216 */       this.z.r(paramev);
/*     */     }
/* 218 */     for (int i2 = 0; i2 < 10; i2++) {
/* 219 */       int i3 = paramev.ap(759550562);
/* 220 */       if (i3 == 0) break;
/* 221 */       this.g[i2] = i3;
/* 222 */       this.q[i2] = paramev.am(-2019856980);
/* 223 */       this.i[i2] = paramev.ap(718707351);
/*     */     }
/* 225 */     this.s = paramev.ap(1875517674);
/* 226 */     this.u = paramev.ap(1182880965);
/* 227 */     this.e = paramev.k(-1987080889);
/* 228 */     this.b = paramev.k(-1987080889);
/* 229 */     this.v = new ad();
/* 230 */     this.w = new k();
/* 231 */     this.v.c(paramev, this.w);
/*     */   }
/*     */ 
/*     */   final int d(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 179 */     if (paramInt3 == 1) {
/* 180 */       if ((paramInt1 & 0x7FFF) < 16384) return paramInt2;
/* 181 */       return -paramInt2;
/*     */     }
/* 183 */     if (paramInt3 == 2) return f[(paramInt1 & 0x7FFF)] * paramInt2 >> 14;
/* 184 */     if (paramInt3 == 3) return ((paramInt1 & 0x7FFF) * paramInt2 >> 14) - paramInt2;
/* 185 */     if (paramInt3 == 4) return t[(paramInt1 / 2607 & 0x7FFF)] * paramInt2;
/* 186 */     return 0;
/*     */   }
/*     */ 
/*     */   final int z(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 179 */     if (paramInt3 == 1) {
/* 180 */       if ((paramInt1 & 0x7FFF) < 16384) return paramInt2;
/* 181 */       return -paramInt2;
/*     */     }
/* 183 */     if (paramInt3 == 2) return f[(paramInt1 & 0x7FFF)] * paramInt2 >> 14;
/* 184 */     if (paramInt3 == 3) return ((paramInt1 & 0x7FFF) * paramInt2 >> 14) - paramInt2;
/* 185 */     if (paramInt3 == 4) return t[(paramInt1 / 2607 & 0x7FFF)] * paramInt2;
/* 186 */     return 0;
/*     */   }
/*     */ 
/*     */   static
/*     */   {
/*  32 */     Random localRandom = new Random(0L);
/*  33 */     for (int i1 = 0; i1 < 32768; i1++) {
/*  34 */       t[i1] = ((localRandom.nextInt() & 0x2) - 1);
/*     */     }
/*  36 */     f = new int[32768];
/*  37 */     for (i1 = 0; i1 < 32768; i1++)
/*  38 */       f[i1] = ((int)(Math.sin(i1 / 5215.1903000000002D) * 16384.0D));
/*     */   }
/*     */ 
/*     */   final int[] c(int paramInt1, int paramInt2)
/*     */   {
/*  53 */     bj.q(y, 0, paramInt1);
/*  54 */     if (paramInt2 < 10) return y;
/*  55 */     double d1 = paramInt1 / (paramInt2 + 0.0D);
/*  56 */     this.r.l();
/*  57 */     this.d.l();
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     if (this.l != null) {
/*  62 */       this.l.l();
/*  63 */       this.m.l();
/*  64 */       i1 = (int)((this.l.c - this.l.m) * 32.768000000000001D / d1);
/*  65 */       i2 = (int)(this.l.m * 32.768000000000001D / d1);
/*     */     }
/*  67 */     int i4 = 0;
/*  68 */     int i5 = 0;
/*  69 */     int i6 = 0;
/*  70 */     if (this.c != null) {
/*  71 */       this.c.l();
/*  72 */       this.n.l();
/*  73 */       i4 = (int)((this.c.c - this.c.m) * 32.768000000000001D / d1);
/*  74 */       i5 = (int)(this.c.m * 32.768000000000001D / d1);
/*     */     }
/*  76 */     for (int i7 = 0; i7 < 5; i7++)
/*  77 */       if (this.g[i7] != 0) {
/*  78 */         o[i7] = 0;
/*  79 */         a[i7] = ((int)(this.i[i7] * d1));
/*  80 */         h[i7] = ((this.g[i7] << 14) / 100);
/*  81 */         x[i7] = ((int)((this.r.c - this.r.m) * 32.768000000000001D * Math.pow(1.005792941067853D, this.q[i7]) / d1));
/*  82 */         p[i7] = ((int)(this.r.m * 32.768000000000001D / d1));
/*     */       }
/*     */     int i8;
/*     */     int i9;
/*     */     int i10;
/*     */     int i11;
/*  84 */     for (i7 = 0; i7 < paramInt1; i7++) {
/*  85 */       i8 = this.r.m(paramInt1);
/*  86 */       i9 = this.d.m(paramInt1);
/*  87 */       if (this.l != null) {
/*  88 */         i10 = this.l.m(paramInt1);
/*  89 */         i11 = this.m.m(paramInt1);
/*  90 */         i8 += (d(i3, i11, this.l.n) >> 1);
/*  91 */         i3 += (i10 * i1 >> 16) + i2;
/*     */       }
/*  93 */       if (this.c != null) {
/*  94 */         i10 = this.c.m(paramInt1);
/*  95 */         i11 = this.n.m(paramInt1);
/*  96 */         i9 = i9 * ((d(i6, i11, this.c.n) >> 1) + 32768) >> 15;
/*  97 */         i6 += (i10 * i4 >> 16) + i5;
/*     */       }
/*  99 */       for (i10 = 0; i10 < 5; i10++)
/* 100 */         if (this.g[i10] != 0) {
/* 101 */           i11 = i7 + a[i10];
/* 102 */           if (i11 < paramInt1) {
/* 103 */             y[i11] += d(o[i10], i9 * h[i10] >> 15, this.r.n);
/* 104 */             o[i10] += (i8 * x[i10] >> 16) + p[i10];
/*     */           }
/*     */         }
/*     */     }
/*     */     int i12;
/* 108 */     if (this.j != null) {
/* 109 */       this.j.l();
/* 110 */       this.z.l();
/* 111 */       i7 = 0;
/* 112 */       i8 = 0;
/* 113 */       i9 = 1;
/* 114 */       for (i10 = 0; i10 < paramInt1; i10++) {
/* 115 */         i11 = this.j.m(paramInt1);
/* 116 */         i12 = this.z.m(paramInt1);
/* 117 */         if (i9 != 0) i8 = this.j.m + ((this.j.c - this.j.m) * i11 >> 8); else
/* 118 */           i8 = this.j.m + ((this.j.c - this.j.m) * i12 >> 8);
/* 119 */         i7 += 256; if (i7 >= i8) {
/* 120 */           i7 = 0;
/* 121 */           i9 = i9 == 0 ? 1 : 0;
/*     */         }
/* 123 */         if (i9 != 0) y[i10] = 0;
/*     */       }
/*     */     }
/* 126 */     if ((this.s > 0) && (this.u > 0)) {
/* 127 */       i7 = (int)(this.s * d1);
/* 128 */       for (i8 = i7; i8 < paramInt1; i8++) y[i8] += y[(i8 - i7)] * this.u / 100;
/*     */     }
/* 130 */     if ((this.v.r[0] > 0) || (this.v.r[1] > 0)) {
/* 131 */       this.w.l();
/* 132 */       i7 = this.w.m(paramInt1 + 1);
/* 133 */       i8 = this.v.m(0, i7 / 65536.0F);
/* 134 */       i9 = this.v.m(1, i7 / 65536.0F);
/* 135 */       if (paramInt1 >= i8 + i9) {
/* 136 */         i10 = 0;
/* 137 */         i11 = i9;
/* 138 */         if (i11 > paramInt1 - i8) i11 = paramInt1 - i8;
/*     */         int i13;
/* 139 */         for (; i10 < i11; i10++) {
/* 140 */           i12 = (int)(y[(i10 + i8)] * ad.g >> 16);
/* 141 */           for (i13 = 0; i13 < i8; i13++) i12 += (int)(y[(i10 + i8 - 1 - i13)] * ad.j[0][i13] >> 16);
/* 142 */           for (i13 = 0; i13 < i10; i13++) i12 -= (int)(y[(i10 - 1 - i13)] * ad.j[1][i13] >> 16);
/* 143 */           y[i10] = i12;
/* 144 */           i7 = this.w.m(paramInt1 + 1);
/* 147 */         }
/*     */ i11 = 128;
/*     */         int i14;
/*     */         while (true) { if (i11 > paramInt1 - i8) i11 = paramInt1 - i8;
/* 150 */           for (; i10 < i11; i10++) {
/* 151 */             i13 = (int)(y[(i10 + i8)] * ad.g >> 16);
/* 152 */             for (i14 = 0; i14 < i8; i14++) i13 += (int)(y[(i10 + i8 - 1 - i14)] * ad.j[0][i14] >> 16);
/* 153 */             for (i14 = 0; i14 < i9; i14++) i13 -= (int)(y[(i10 - 1 - i14)] * ad.j[1][i14] >> 16);
/* 154 */             y[i10] = i13;
/* 155 */             i7 = this.w.m(paramInt1 + 1);
/*     */           }
/* 157 */           if (i10 >= paramInt1 - i8) break;
/* 158 */           i8 = this.v.m(0, i7 / 65536.0F);
/* 159 */           i9 = this.v.m(1, i7 / 65536.0F);
/* 160 */           i11 += 128;
/*     */         }
/* 162 */         for (; i10 < paramInt1; i10++) {
/* 163 */           i13 = 0;
/* 164 */           for (i14 = i10 + i8 - paramInt1; i14 < i8; i14++) i13 += (int)(y[(i10 + i8 - 1 - i14)] * ad.j[0][i14] >> 16);
/* 165 */           for (i14 = 0; i14 < i9; i14++) i13 -= (int)(y[(i10 - 1 - i14)] * ad.j[1][i14] >> 16);
/* 166 */           y[i10] = i13;
/* 167 */           i7 = this.w.m(paramInt1 + 1);
/*     */         }
/*     */       }
/*     */     }
/* 171 */     for (i7 = 0; i7 < paramInt1; i7++) {
/* 172 */       if (y[i7] < -32768) y[i7] = -32768;
/* 173 */       if (y[i7] > 32767) y[i7] = 32767;
/*     */     }
/* 175 */     return y;
/*     */   }
/*     */ 
/*     */   final int[] n(int paramInt1, int paramInt2)
/*     */   {
/*  53 */     bj.q(y, 0, paramInt1);
/*  54 */     if (paramInt2 < 10) return y;
/*  55 */     double d1 = paramInt1 / (paramInt2 + 0.0D);
/*  56 */     this.r.l();
/*  57 */     this.d.l();
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     if (this.l != null) {
/*  62 */       this.l.l();
/*  63 */       this.m.l();
/*  64 */       i1 = (int)((this.l.c - this.l.m) * 32.768000000000001D / d1);
/*  65 */       i2 = (int)(this.l.m * 32.768000000000001D / d1);
/*     */     }
/*  67 */     int i4 = 0;
/*  68 */     int i5 = 0;
/*  69 */     int i6 = 0;
/*  70 */     if (this.c != null) {
/*  71 */       this.c.l();
/*  72 */       this.n.l();
/*  73 */       i4 = (int)((this.c.c - this.c.m) * 32.768000000000001D / d1);
/*  74 */       i5 = (int)(this.c.m * 32.768000000000001D / d1);
/*     */     }
/*  76 */     for (int i7 = 0; i7 < 5; i7++)
/*  77 */       if (this.g[i7] != 0) {
/*  78 */         o[i7] = 0;
/*  79 */         a[i7] = ((int)(this.i[i7] * d1));
/*  80 */         h[i7] = ((this.g[i7] << 14) / 100);
/*  81 */         x[i7] = ((int)((this.r.c - this.r.m) * 32.768000000000001D * Math.pow(1.005792941067853D, this.q[i7]) / d1));
/*  82 */         p[i7] = ((int)(this.r.m * 32.768000000000001D / d1));
/*     */       }
/*     */     int i8;
/*     */     int i9;
/*     */     int i10;
/*     */     int i11;
/*  84 */     for (i7 = 0; i7 < paramInt1; i7++) {
/*  85 */       i8 = this.r.m(paramInt1);
/*  86 */       i9 = this.d.m(paramInt1);
/*  87 */       if (this.l != null) {
/*  88 */         i10 = this.l.m(paramInt1);
/*  89 */         i11 = this.m.m(paramInt1);
/*  90 */         i8 += (d(i3, i11, this.l.n) >> 1);
/*  91 */         i3 += (i10 * i1 >> 16) + i2;
/*     */       }
/*  93 */       if (this.c != null) {
/*  94 */         i10 = this.c.m(paramInt1);
/*  95 */         i11 = this.n.m(paramInt1);
/*  96 */         i9 = i9 * ((d(i6, i11, this.c.n) >> 1) + 32768) >> 15;
/*  97 */         i6 += (i10 * i4 >> 16) + i5;
/*     */       }
/*  99 */       for (i10 = 0; i10 < 5; i10++)
/* 100 */         if (this.g[i10] != 0) {
/* 101 */           i11 = i7 + a[i10];
/* 102 */           if (i11 < paramInt1) {
/* 103 */             y[i11] += d(o[i10], i9 * h[i10] >> 15, this.r.n);
/* 104 */             o[i10] += (i8 * x[i10] >> 16) + p[i10];
/*     */           }
/*     */         }
/*     */     }
/*     */     int i12;
/* 108 */     if (this.j != null) {
/* 109 */       this.j.l();
/* 110 */       this.z.l();
/* 111 */       i7 = 0;
/* 112 */       i8 = 0;
/* 113 */       i9 = 1;
/* 114 */       for (i10 = 0; i10 < paramInt1; i10++) {
/* 115 */         i11 = this.j.m(paramInt1);
/* 116 */         i12 = this.z.m(paramInt1);
/* 117 */         if (i9 != 0) i8 = this.j.m + ((this.j.c - this.j.m) * i11 >> 8); else
/* 118 */           i8 = this.j.m + ((this.j.c - this.j.m) * i12 >> 8);
/* 119 */         i7 += 256; if (i7 >= i8) {
/* 120 */           i7 = 0;
/* 121 */           i9 = i9 == 0 ? 1 : 0;
/*     */         }
/* 123 */         if (i9 != 0) y[i10] = 0;
/*     */       }
/*     */     }
/* 126 */     if ((this.s > 0) && (this.u > 0)) {
/* 127 */       i7 = (int)(this.s * d1);
/* 128 */       for (i8 = i7; i8 < paramInt1; i8++) y[i8] += y[(i8 - i7)] * this.u / 100;
/*     */     }
/* 130 */     if ((this.v.r[0] > 0) || (this.v.r[1] > 0)) {
/* 131 */       this.w.l();
/* 132 */       i7 = this.w.m(paramInt1 + 1);
/* 133 */       i8 = this.v.m(0, i7 / 65536.0F);
/* 134 */       i9 = this.v.m(1, i7 / 65536.0F);
/* 135 */       if (paramInt1 >= i8 + i9) {
/* 136 */         i10 = 0;
/* 137 */         i11 = i9;
/* 138 */         if (i11 > paramInt1 - i8) i11 = paramInt1 - i8;
/*     */         int i13;
/* 139 */         for (; i10 < i11; i10++) {
/* 140 */           i12 = (int)(y[(i10 + i8)] * ad.g >> 16);
/* 141 */           for (i13 = 0; i13 < i8; i13++) i12 += (int)(y[(i10 + i8 - 1 - i13)] * ad.j[0][i13] >> 16);
/* 142 */           for (i13 = 0; i13 < i10; i13++) i12 -= (int)(y[(i10 - 1 - i13)] * ad.j[1][i13] >> 16);
/* 143 */           y[i10] = i12;
/* 144 */           i7 = this.w.m(paramInt1 + 1);
/* 147 */         }
/*     */ i11 = 128;
/*     */         int i14;
/*     */         while (true) { if (i11 > paramInt1 - i8) i11 = paramInt1 - i8;
/* 150 */           for (; i10 < i11; i10++) {
/* 151 */             i13 = (int)(y[(i10 + i8)] * ad.g >> 16);
/* 152 */             for (i14 = 0; i14 < i8; i14++) i13 += (int)(y[(i10 + i8 - 1 - i14)] * ad.j[0][i14] >> 16);
/* 153 */             for (i14 = 0; i14 < i9; i14++) i13 -= (int)(y[(i10 - 1 - i14)] * ad.j[1][i14] >> 16);
/* 154 */             y[i10] = i13;
/* 155 */             i7 = this.w.m(paramInt1 + 1);
/*     */           }
/* 157 */           if (i10 >= paramInt1 - i8) break;
/* 158 */           i8 = this.v.m(0, i7 / 65536.0F);
/* 159 */           i9 = this.v.m(1, i7 / 65536.0F);
/* 160 */           i11 += 128;
/*     */         }
/* 162 */         for (; i10 < paramInt1; i10++) {
/* 163 */           i13 = 0;
/* 164 */           for (i14 = i10 + i8 - paramInt1; i14 < i8; i14++) i13 += (int)(y[(i10 + i8 - 1 - i14)] * ad.j[0][i14] >> 16);
/* 165 */           for (i14 = 0; i14 < i9; i14++) i13 -= (int)(y[(i10 - 1 - i14)] * ad.j[1][i14] >> 16);
/* 166 */           y[i10] = i13;
/* 167 */           i7 = this.w.m(paramInt1 + 1);
/*     */         }
/*     */       }
/*     */     }
/* 171 */     for (i7 = 0; i7 < paramInt1; i7++) {
/* 172 */       if (y[i7] < -32768) y[i7] = -32768;
/* 173 */       if (y[i7] > 32767) y[i7] = 32767;
/*     */     }
/* 175 */     return y;
/*     */   }
/*     */ 
/*     */   final int j(int paramInt1, int paramInt2, int paramInt3) {
/* 179 */     if (paramInt3 == 1) {
/* 180 */       if ((paramInt1 & 0x7FFF) < 16384) return paramInt2;
/* 181 */       return -paramInt2;
/*     */     }
/* 183 */     if (paramInt3 == 2) return f[(paramInt1 & 0x7FFF)] * paramInt2 >> 14;
/* 184 */     if (paramInt3 == 3) return ((paramInt1 & 0x7FFF) * paramInt2 >> 14) - paramInt2;
/* 185 */     if (paramInt3 == 4) return t[(paramInt1 / 2607 & 0x7FFF)] * paramInt2;
/* 186 */     return 0;
/*     */   }
/*     */ 
/*     */   final int[] r(int paramInt1, int paramInt2)
/*     */   {
/*  53 */     bj.q(y, 0, paramInt1);
/*  54 */     if (paramInt2 < 10) return y;
/*  55 */     double d1 = paramInt1 / (paramInt2 + 0.0D);
/*  56 */     this.r.l();
/*  57 */     this.d.l();
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     if (this.l != null) {
/*  62 */       this.l.l();
/*  63 */       this.m.l();
/*  64 */       i1 = (int)((this.l.c - this.l.m) * 32.768000000000001D / d1);
/*  65 */       i2 = (int)(this.l.m * 32.768000000000001D / d1);
/*     */     }
/*  67 */     int i4 = 0;
/*  68 */     int i5 = 0;
/*  69 */     int i6 = 0;
/*  70 */     if (this.c != null) {
/*  71 */       this.c.l();
/*  72 */       this.n.l();
/*  73 */       i4 = (int)((this.c.c - this.c.m) * 32.768000000000001D / d1);
/*  74 */       i5 = (int)(this.c.m * 32.768000000000001D / d1);
/*     */     }
/*  76 */     for (int i7 = 0; i7 < 5; i7++)
/*  77 */       if (this.g[i7] != 0) {
/*  78 */         o[i7] = 0;
/*  79 */         a[i7] = ((int)(this.i[i7] * d1));
/*  80 */         h[i7] = ((this.g[i7] << 14) / 100);
/*  81 */         x[i7] = ((int)((this.r.c - this.r.m) * 32.768000000000001D * Math.pow(1.005792941067853D, this.q[i7]) / d1));
/*  82 */         p[i7] = ((int)(this.r.m * 32.768000000000001D / d1));
/*     */       }
/*     */     int i8;
/*     */     int i9;
/*     */     int i10;
/*     */     int i11;
/*  84 */     for (i7 = 0; i7 < paramInt1; i7++) {
/*  85 */       i8 = this.r.m(paramInt1);
/*  86 */       i9 = this.d.m(paramInt1);
/*  87 */       if (this.l != null) {
/*  88 */         i10 = this.l.m(paramInt1);
/*  89 */         i11 = this.m.m(paramInt1);
/*  90 */         i8 += (d(i3, i11, this.l.n) >> 1);
/*  91 */         i3 += (i10 * i1 >> 16) + i2;
/*     */       }
/*  93 */       if (this.c != null) {
/*  94 */         i10 = this.c.m(paramInt1);
/*  95 */         i11 = this.n.m(paramInt1);
/*  96 */         i9 = i9 * ((d(i6, i11, this.c.n) >> 1) + 32768) >> 15;
/*  97 */         i6 += (i10 * i4 >> 16) + i5;
/*     */       }
/*  99 */       for (i10 = 0; i10 < 5; i10++)
/* 100 */         if (this.g[i10] != 0) {
/* 101 */           i11 = i7 + a[i10];
/* 102 */           if (i11 < paramInt1) {
/* 103 */             y[i11] += d(o[i10], i9 * h[i10] >> 15, this.r.n);
/* 104 */             o[i10] += (i8 * x[i10] >> 16) + p[i10];
/*     */           }
/*     */         }
/*     */     }
/*     */     int i12;
/* 108 */     if (this.j != null) {
/* 109 */       this.j.l();
/* 110 */       this.z.l();
/* 111 */       i7 = 0;
/* 112 */       i8 = 0;
/* 113 */       i9 = 1;
/* 114 */       for (i10 = 0; i10 < paramInt1; i10++) {
/* 115 */         i11 = this.j.m(paramInt1);
/* 116 */         i12 = this.z.m(paramInt1);
/* 117 */         if (i9 != 0) i8 = this.j.m + ((this.j.c - this.j.m) * i11 >> 8); else
/* 118 */           i8 = this.j.m + ((this.j.c - this.j.m) * i12 >> 8);
/* 119 */         i7 += 256; if (i7 >= i8) {
/* 120 */           i7 = 0;
/* 121 */           i9 = i9 == 0 ? 1 : 0;
/*     */         }
/* 123 */         if (i9 != 0) y[i10] = 0;
/*     */       }
/*     */     }
/* 126 */     if ((this.s > 0) && (this.u > 0)) {
/* 127 */       i7 = (int)(this.s * d1);
/* 128 */       for (i8 = i7; i8 < paramInt1; i8++) y[i8] += y[(i8 - i7)] * this.u / 100;
/*     */     }
/* 130 */     if ((this.v.r[0] > 0) || (this.v.r[1] > 0)) {
/* 131 */       this.w.l();
/* 132 */       i7 = this.w.m(paramInt1 + 1);
/* 133 */       i8 = this.v.m(0, i7 / 65536.0F);
/* 134 */       i9 = this.v.m(1, i7 / 65536.0F);
/* 135 */       if (paramInt1 >= i8 + i9) {
/* 136 */         i10 = 0;
/* 137 */         i11 = i9;
/* 138 */         if (i11 > paramInt1 - i8) i11 = paramInt1 - i8;
/*     */         int i13;
/* 139 */         for (; i10 < i11; i10++) {
/* 140 */           i12 = (int)(y[(i10 + i8)] * ad.g >> 16);
/* 141 */           for (i13 = 0; i13 < i8; i13++) i12 += (int)(y[(i10 + i8 - 1 - i13)] * ad.j[0][i13] >> 16);
/* 142 */           for (i13 = 0; i13 < i10; i13++) i12 -= (int)(y[(i10 - 1 - i13)] * ad.j[1][i13] >> 16);
/* 143 */           y[i10] = i12;
/* 144 */           i7 = this.w.m(paramInt1 + 1);
/* 147 */         }
/*     */ i11 = 128;
/*     */         int i14;
/*     */         while (true) { if (i11 > paramInt1 - i8) i11 = paramInt1 - i8;
/* 150 */           for (; i10 < i11; i10++) {
/* 151 */             i13 = (int)(y[(i10 + i8)] * ad.g >> 16);
/* 152 */             for (i14 = 0; i14 < i8; i14++) i13 += (int)(y[(i10 + i8 - 1 - i14)] * ad.j[0][i14] >> 16);
/* 153 */             for (i14 = 0; i14 < i9; i14++) i13 -= (int)(y[(i10 - 1 - i14)] * ad.j[1][i14] >> 16);
/* 154 */             y[i10] = i13;
/* 155 */             i7 = this.w.m(paramInt1 + 1);
/*     */           }
/* 157 */           if (i10 >= paramInt1 - i8) break;
/* 158 */           i8 = this.v.m(0, i7 / 65536.0F);
/* 159 */           i9 = this.v.m(1, i7 / 65536.0F);
/* 160 */           i11 += 128;
/*     */         }
/* 162 */         for (; i10 < paramInt1; i10++) {
/* 163 */           i13 = 0;
/* 164 */           for (i14 = i10 + i8 - paramInt1; i14 < i8; i14++) i13 += (int)(y[(i10 + i8 - 1 - i14)] * ad.j[0][i14] >> 16);
/* 165 */           for (i14 = 0; i14 < i9; i14++) i13 -= (int)(y[(i10 - 1 - i14)] * ad.j[1][i14] >> 16);
/* 166 */           y[i10] = i13;
/* 167 */           i7 = this.w.m(paramInt1 + 1);
/*     */         }
/*     */       }
/*     */     }
/* 171 */     for (i7 = 0; i7 < paramInt1; i7++) {
/* 172 */       if (y[i7] < -32768) y[i7] = -32768;
/* 173 */       if (y[i7] > 32767) y[i7] = 32767;
/*     */     }
/* 175 */     return y;
/*     */   }
/*     */ 
/*     */   final void g(ev paramev)
/*     */   {
/* 190 */     this.r = new k();
/* 191 */     this.r.r(paramev);
/* 192 */     this.d = new k();
/* 193 */     this.d.r(paramev);
/* 194 */     int i1 = paramev.t(1118814123);
/* 195 */     if (i1 != 0) {
/* 196 */       paramev.c -= -941396361;
/* 197 */       this.l = new k();
/* 198 */       this.l.r(paramev);
/* 199 */       this.m = new k();
/* 200 */       this.m.r(paramev);
/*     */     }
/* 202 */     i1 = paramev.t(1118814123);
/* 203 */     if (i1 != 0) {
/* 204 */       paramev.c -= -941396361;
/* 205 */       this.c = new k();
/* 206 */       this.c.r(paramev);
/* 207 */       this.n = new k();
/* 208 */       this.n.r(paramev);
/*     */     }
/* 210 */     i1 = paramev.t(1118814123);
/* 211 */     if (i1 != 0) {
/* 212 */       paramev.c -= -941396361;
/* 213 */       this.j = new k();
/* 214 */       this.j.r(paramev);
/* 215 */       this.z = new k();
/* 216 */       this.z.r(paramev);
/*     */     }
/* 218 */     for (int i2 = 0; i2 < 10; i2++) {
/* 219 */       int i3 = paramev.ap(404588073);
/* 220 */       if (i3 == 0) break;
/* 221 */       this.g[i2] = i3;
/* 222 */       this.q[i2] = paramev.am(-1709610142);
/* 223 */       this.i[i2] = paramev.ap(-17361004);
/*     */     }
/* 225 */     this.s = paramev.ap(1375224443);
/* 226 */     this.u = paramev.ap(619261183);
/* 227 */     this.e = paramev.k(-1987080889);
/* 228 */     this.b = paramev.k(-1987080889);
/* 229 */     this.v = new ad();
/* 230 */     this.w = new k();
/* 231 */     this.v.c(paramev, this.w);
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     t
 * JD-Core Version:    0.6.2
 */