/*     */ public final class ar
/*     */ {
/*     */   int u;
/*     */   int v;
/*     */   int[] l;
/*     */   int[] j;
/*     */   int[] c;
/*     */   int s;
/*     */   int[] r;
/*     */   int[] g;
/*     */   int[] m;
/*     */   int[] q;
/*  16 */   boolean i = true;
/*     */   int[] n;
/*  41 */   static final int[][] o = { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };
/*     */   int w;
/*     */   int[] z;
/*  21 */   static int[] e = new int[6];
/*  22 */   static int[] b = new int[6];
/*  23 */   static int[] y = new int[6];
/*  24 */   static int[] t = new int[6];
/*  25 */   static int[] f = new int[6];
/*  26 */   static final int[][] k = { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };
/*     */   int[] d;
/*     */ 
/*     */   ar(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19)
/*     */   {
/*  58 */     if ((paramInt6 != paramInt7) || (paramInt6 != paramInt8) || (paramInt6 != paramInt9)) this.i = false;
/*  59 */     this.s = paramInt1;
/*  60 */     this.u = paramInt2;
/*  61 */     this.v = paramInt18;
/*  62 */     this.w = paramInt19;
/*  63 */     int i1 = 128;
/*  64 */     int i2 = i1 / 2;
/*  65 */     int i3 = i1 / 4;
/*  66 */     int i4 = i1 * 3 / 4;
/*  67 */     int[] arrayOfInt1 = k[paramInt1];
/*  68 */     int i5 = arrayOfInt1.length;
/*  69 */     this.r = new int[i5];
/*  70 */     this.d = new int[i5];
/*  71 */     this.l = new int[i5];
/*  72 */     int[] arrayOfInt2 = new int[i5];
/*  73 */     int[] arrayOfInt3 = new int[i5];
/*  74 */     int i6 = paramInt4 * i1;
/*  75 */     int i7 = paramInt5 * i1;
/*     */     int i13;
/*     */     int i14;
/*  76 */     for (int i8 = 0; i8 < i5; i8++) {
/*  77 */       i9 = arrayOfInt1[i8];
/*  78 */       if (((i9 & 0x1) == 0) && (i9 <= 8)) i9 = (i9 - paramInt2 - paramInt2 - 1 & 0x7) + 1;
/*  79 */       if ((i9 > 8) && (i9 <= 12)) i9 = (i9 - 9 - paramInt2 & 0x3) + 9;
/*  80 */       if ((i9 > 12) && (i9 <= 16)) i9 = (i9 - 13 - paramInt2 & 0x3) + 13;
/*     */ 
/*  86 */       if (i9 == 1) {
/*  87 */         i10 = i6;
/*  88 */         i11 = i7;
/*  89 */         i12 = paramInt6;
/*  90 */         i13 = paramInt10;
/*  91 */         i14 = paramInt14;
/*     */       }
/*  93 */       else if (i9 == 2) {
/*  94 */         i10 = i6 + i2;
/*  95 */         i11 = i7;
/*  96 */         i12 = paramInt6 + paramInt7 >> 1;
/*  97 */         i13 = paramInt10 + paramInt11 >> 1;
/*  98 */         i14 = paramInt14 + paramInt15 >> 1;
/*     */       }
/* 100 */       else if (i9 == 3) {
/* 101 */         i10 = i6 + i1;
/* 102 */         i11 = i7;
/* 103 */         i12 = paramInt7;
/* 104 */         i13 = paramInt11;
/* 105 */         i14 = paramInt15;
/*     */       }
/* 107 */       else if (i9 == 4) {
/* 108 */         i10 = i6 + i1;
/* 109 */         i11 = i7 + i2;
/* 110 */         i12 = paramInt7 + paramInt8 >> 1;
/* 111 */         i13 = paramInt11 + paramInt12 >> 1;
/* 112 */         i14 = paramInt15 + paramInt16 >> 1;
/*     */       }
/* 114 */       else if (i9 == 5) {
/* 115 */         i10 = i6 + i1;
/* 116 */         i11 = i7 + i1;
/* 117 */         i12 = paramInt8;
/* 118 */         i13 = paramInt12;
/* 119 */         i14 = paramInt16;
/*     */       }
/* 121 */       else if (i9 == 6) {
/* 122 */         i10 = i6 + i2;
/* 123 */         i11 = i7 + i1;
/* 124 */         i12 = paramInt8 + paramInt9 >> 1;
/* 125 */         i13 = paramInt12 + paramInt13 >> 1;
/* 126 */         i14 = paramInt16 + paramInt17 >> 1;
/*     */       }
/* 128 */       else if (i9 == 7) {
/* 129 */         i10 = i6;
/* 130 */         i11 = i7 + i1;
/* 131 */         i12 = paramInt9;
/* 132 */         i13 = paramInt13;
/* 133 */         i14 = paramInt17;
/*     */       }
/* 135 */       else if (i9 == 8) {
/* 136 */         i10 = i6;
/* 137 */         i11 = i7 + i2;
/* 138 */         i12 = paramInt9 + paramInt6 >> 1;
/* 139 */         i13 = paramInt13 + paramInt10 >> 1;
/* 140 */         i14 = paramInt17 + paramInt14 >> 1;
/*     */       }
/* 142 */       else if (i9 == 9) {
/* 143 */         i10 = i6 + i2;
/* 144 */         i11 = i7 + i3;
/* 145 */         i12 = paramInt6 + paramInt7 >> 1;
/* 146 */         i13 = paramInt10 + paramInt11 >> 1;
/* 147 */         i14 = paramInt14 + paramInt15 >> 1;
/*     */       }
/* 149 */       else if (i9 == 10) {
/* 150 */         i10 = i6 + i4;
/* 151 */         i11 = i7 + i2;
/* 152 */         i12 = paramInt7 + paramInt8 >> 1;
/* 153 */         i13 = paramInt11 + paramInt12 >> 1;
/* 154 */         i14 = paramInt15 + paramInt16 >> 1;
/*     */       }
/* 156 */       else if (i9 == 11) {
/* 157 */         i10 = i6 + i2;
/* 158 */         i11 = i7 + i4;
/* 159 */         i12 = paramInt8 + paramInt9 >> 1;
/* 160 */         i13 = paramInt12 + paramInt13 >> 1;
/* 161 */         i14 = paramInt16 + paramInt17 >> 1;
/*     */       }
/* 163 */       else if (i9 == 12) {
/* 164 */         i10 = i6 + i3;
/* 165 */         i11 = i7 + i2;
/* 166 */         i12 = paramInt9 + paramInt6 >> 1;
/* 167 */         i13 = paramInt13 + paramInt10 >> 1;
/* 168 */         i14 = paramInt17 + paramInt14 >> 1;
/*     */       }
/* 170 */       else if (i9 == 13) {
/* 171 */         i10 = i6 + i3;
/* 172 */         i11 = i7 + i3;
/* 173 */         i12 = paramInt6;
/* 174 */         i13 = paramInt10;
/* 175 */         i14 = paramInt14;
/*     */       }
/* 177 */       else if (i9 == 14) {
/* 178 */         i10 = i6 + i4;
/* 179 */         i11 = i7 + i3;
/* 180 */         i12 = paramInt7;
/* 181 */         i13 = paramInt11;
/* 182 */         i14 = paramInt15;
/*     */       }
/* 184 */       else if (i9 == 15) {
/* 185 */         i10 = i6 + i4;
/* 186 */         i11 = i7 + i4;
/* 187 */         i12 = paramInt8;
/* 188 */         i13 = paramInt12;
/* 189 */         i14 = paramInt16;
/*     */       }
/*     */       else {
/* 192 */         i10 = i6 + i3;
/* 193 */         i11 = i7 + i4;
/* 194 */         i12 = paramInt9;
/* 195 */         i13 = paramInt13;
/* 196 */         i14 = paramInt17;
/*     */       }
/* 198 */       this.r[i8] = i10;
/* 199 */       this.d[i8] = i12;
/* 200 */       this.l[i8] = i11;
/* 201 */       arrayOfInt2[i8] = i13;
/* 202 */       arrayOfInt3[i8] = i14;
/*     */     }
/* 204 */     int[] arrayOfInt4 = o[paramInt1];
/* 205 */     int i9 = arrayOfInt4.length / 4;
/* 206 */     this.j = new int[i9];
/* 207 */     this.z = new int[i9];
/* 208 */     this.g = new int[i9];
/* 209 */     this.m = new int[i9];
/* 210 */     this.c = new int[i9];
/* 211 */     this.n = new int[i9];
/* 212 */     if (paramInt3 != -1) this.q = new int[i9];
/* 213 */     int i10 = 0;
/* 214 */     for (int i11 = 0; i11 < i9; i11++) {
/* 215 */       i12 = arrayOfInt4[i10];
/* 216 */       i13 = arrayOfInt4[(i10 + 1)];
/* 217 */       i14 = arrayOfInt4[(i10 + 2)];
/* 218 */       int i15 = arrayOfInt4[(i10 + 3)];
/* 219 */       i10 += 4;
/* 220 */       if (i13 < 4) i13 = i13 - paramInt2 & 0x3;
/* 221 */       if (i14 < 4) i14 = i14 - paramInt2 & 0x3;
/* 222 */       if (i15 < 4) i15 = i15 - paramInt2 & 0x3;
/* 223 */       this.j[i11] = i13;
/* 224 */       this.z[i11] = i14;
/* 225 */       this.g[i11] = i15;
/* 226 */       if (i12 == 0) {
/* 227 */         this.m[i11] = arrayOfInt2[i13];
/* 228 */         this.c[i11] = arrayOfInt2[i14];
/* 229 */         this.n[i11] = arrayOfInt2[i15];
/* 230 */         if (this.q != null) this.q[i11] = -1; 
/*     */       }
/*     */       else
/*     */       {
/* 233 */         this.m[i11] = arrayOfInt3[i13];
/* 234 */         this.c[i11] = arrayOfInt3[i14];
/* 235 */         this.n[i11] = arrayOfInt3[i15];
/* 236 */         if (this.q != null) this.q[i11] = paramInt3;
/*     */       }
/*     */     }
/* 239 */     i11 = paramInt6;
/* 240 */     int i12 = paramInt7;
/* 241 */     if (paramInt7 < i11) i11 = paramInt7;
/* 242 */     if (paramInt7 > i12) i12 = paramInt7;
/* 243 */     if (paramInt8 < i11) i11 = paramInt8;
/* 244 */     if (paramInt8 > i12) i12 = paramInt8;
/* 245 */     if (paramInt9 < i11) i11 = paramInt9;
/* 246 */     if (paramInt9 > i12) i12 = paramInt9;
/* 247 */     i11 /= 14;
/* 248 */     i12 /= 14;
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ar
 * JD-Core Version:    0.6.2
 */