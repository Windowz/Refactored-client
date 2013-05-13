/*     */ public class dt extends dg
/*     */ {
/*     */   static int[] ak;
/*     */   int c;
/*     */   static float[] p;
/*     */   static int u;
/*     */   boolean x;
/*     */   boolean g;
/*     */   static byte[] q;
/*     */   static int i;
/*     */   static int s;
/*     */   static int[] av;
/*     */   static int v;
/*     */   static x[] w;
/*     */   static e[] e;
/*     */   byte[] az;
/*     */   static b[] y;
/*     */   static boolean[] t;
/*     */   static int[] f;
/*  28 */   static boolean k = false;
/*     */   float[] o;
/*     */   int a;
/*     */   int h;
/*     */   static h[] b;
/*     */   static float[] ad;
/*     */   int n;
/*     */   static float[] ac;
/*     */   static float[] aa;
/*     */   static float[] as;
/*     */   byte[][] m;
/*     */   static float[] ap;
/*     */   int j;
/*     */   int z;
/*     */   static float[] am;
/*     */   int an;
/*     */   int ah;
/*     */ 
/*     */   void g(byte[] paramArrayOfByte)
/*     */   {
/*  89 */     ev localev = new ev(paramArrayOfByte);
/*  90 */     this.c = localev.h(-195593579);
/*  91 */     this.n = localev.h(1946536258);
/*  92 */     this.j = localev.h(-53808742);
/*  93 */     this.z = localev.h(-623730497);
/*  94 */     if (this.z < 0) {
/*  95 */       this.z ^= -1;
/*  96 */       this.g = true;
/*     */     }
/*  98 */     int i1 = localev.h(-221775255);
/*  99 */     this.m = new byte[i1][];
/* 100 */     for (int i2 = 0; i2 < i1; i2++) {
/* 101 */       int i3 = 0;
/*     */       while (true) {
/* 103 */         int i4 = localev.t(1118814123);
/* 104 */         i3 += i4;
/* 105 */         if (i4 < 255) break;
/*     */       }
/* 107 */       byte[] arrayOfByte = new byte[i3];
/* 108 */       localev.as(arrayOfByte, 0, i3, 1602313803);
/* 109 */       this.m[i2] = arrayOfByte;
/*     */     }
/*     */   }
/*     */ 
/*     */   static void n(byte[] paramArrayOfByte, int paramInt)
/*     */   {
/*  55 */     q = paramArrayOfByte;
/*  56 */     i = paramInt;
/*  57 */     s = 0;
/*     */   }
/*     */ 
/*     */   static int f(int paramInt)
/*     */   {
/*  69 */     int i1 = 0;
/*  70 */     int i2 = 0;
/*     */     int i3;
/*  71 */     while (paramInt >= 8 - s) {
/*  72 */       i3 = 8 - s;
/*  73 */       int i4 = (1 << i3) - 1;
/*  74 */       i1 += ((q[i] >> s & i4) << i2);
/*  75 */       s = 0;
/*  76 */       i += 1;
/*  77 */       i2 += i3;
/*  78 */       paramInt -= i3;
/*     */     }
/*  80 */     if (paramInt > 0) {
/*  81 */       i3 = (1 << paramInt) - 1;
/*  82 */       i1 += ((q[i] >> s & i3) << i2);
/*  83 */       s += paramInt;
/*     */     }
/*  85 */     return i1;
/*     */   }
/*     */ 
/*     */   void a(byte[] paramArrayOfByte) {
/*  89 */     ev localev = new ev(paramArrayOfByte);
/*  90 */     this.c = localev.h(893101090);
/*  91 */     this.n = localev.h(39236658);
/*  92 */     this.j = localev.h(-337002598);
/*  93 */     this.z = localev.h(844830963);
/*  94 */     if (this.z < 0) {
/*  95 */       this.z ^= -1;
/*  96 */       this.g = true;
/*     */     }
/*  98 */     int i1 = localev.h(-1835765370);
/*  99 */     this.m = new byte[i1][];
/* 100 */     for (int i2 = 0; i2 < i1; i2++) {
/* 101 */       int i3 = 0;
/*     */       while (true) {
/* 103 */         int i4 = localev.t(1118814123);
/* 104 */         i3 += i4;
/* 105 */         if (i4 < 255) break;
/*     */       }
/* 107 */       byte[] arrayOfByte = new byte[i3];
/* 108 */       localev.as(arrayOfByte, 0, i3, 1602313803);
/* 109 */       this.m[i2] = arrayOfByte;
/*     */     }
/*     */   }
/*     */ 
/*     */   eq v(int[] paramArrayOfInt)
/*     */   {
/* 421 */     if ((paramArrayOfInt != null) && (paramArrayOfInt[0] <= 0)) return null;
/* 422 */     if (this.az == null) {
/* 423 */       this.a = 0;
/* 424 */       this.o = new float[v];
/* 425 */       this.az = new byte[this.n];
/* 426 */       this.an = 0;
/* 427 */       this.ah = 0;
/*     */     }
/* 429 */     while (this.ah < this.m.length) {
/* 430 */       if ((paramArrayOfInt != null) && (paramArrayOfInt[0] <= 0)) return null;
/* 431 */       localObject = i(this.ah);
/* 432 */       if (localObject != null) {
/* 433 */         int i1 = this.an;
/* 434 */         int i2 = localObject.length;
/* 435 */         if (i2 > this.n - i1) i2 = this.n - i1;
/* 436 */         for (int i3 = 0; i3 < i2; i3++) {
/* 437 */           int i4 = (int)(128.0F + localObject[i3] * 128.0F);
/* 438 */           if ((i4 & 0xFFFFFF00) != 0) i4 = (i4 ^ 0xFFFFFFFF) >> 31;
/* 439 */           this.az[(i1++)] = ((byte)(i4 - 128));
/*     */         }
/* 441 */         if (paramArrayOfInt != null) paramArrayOfInt[0] -= i1 - this.an;
/* 442 */         this.an = i1;
/*     */       }
/* 444 */       this.ah += 1;
/*     */     }
/* 446 */     this.o = null;
/* 447 */     Object localObject = this.az;
/* 448 */     this.az = null;
/* 449 */     return new eq(this.c, (byte[])localObject, this.j, this.z, this.g);
/*     */   }
/*     */ 
/*     */   static float c(int paramInt)
/*     */   {
/*  47 */     int i1 = paramInt & 0x1FFFFF;
/*  48 */     int i2 = paramInt & 0x80000000;
/*  49 */     int i3 = (paramInt & 0x7FE00000) >> 21;
/*  50 */     if (i2 != 0) i1 = -i1;
/*  51 */     return (float)(i1 * Math.pow(2.0D, i3 - 788));
/*     */   }
/*     */ 
/*     */   float[] i(int paramInt)
/*     */   {
/* 198 */     n(this.m[paramInt], 0);
/* 199 */     j();
/* 200 */     int i1 = z(az.l(f.length - 1, (byte)112));
/* 201 */     int i2 = t[i1];
/* 202 */     int i3 = i2 != 0 ? v : u;
/* 203 */     int i4 = 0;
/* 204 */     int i5 = 0;
/* 205 */     if (i2 != 0) {
/* 206 */       i4 = j() != 0 ? 1 : 0;
/* 207 */       i5 = j() != 0 ? 1 : 0;
/*     */     }
/* 209 */     int i6 = i3 >> 1;
/*     */     int i7;
/*     */     int i8;
/*     */     int i9;
/* 213 */     if ((i2 != 0) && (i4 == 0)) {
/* 214 */       i7 = (i3 >> 2) - (u >> 2);
/* 215 */       i8 = (i3 >> 2) + (u >> 2);
/* 216 */       i9 = u >> 1;
/*     */     }
/*     */     else {
/* 219 */       i7 = 0;
/* 220 */       i8 = i6;
/* 221 */       i9 = i3 >> 1;
/*     */     }
/*     */     int i10;
/*     */     int i11;
/*     */     int i12;
/* 226 */     if ((i2 != 0) && (i5 == 0)) {
/* 227 */       i10 = i3 - (i3 >> 2) - (u >> 2);
/* 228 */       i11 = i3 - (i3 >> 2) + (u >> 2);
/* 229 */       i12 = u >> 1;
/*     */     }
/*     */     else {
/* 232 */       i10 = i6;
/* 233 */       i11 = i3;
/* 234 */       i12 = i3 >> 1;
/*     */     }
/* 236 */     b localb = y[f[i1]];
/*     */ 
/* 239 */     int i14 = localb.d;
/* 240 */     int i15 = localb.l[i14];
/* 241 */     int i13 = !e[i15].n() ? 1 : 0;
/*     */ 
/* 243 */     i14 = i13;
/* 244 */     for (i15 = 0; i15 < localb.r; i15++) {
/* 245 */       h localh = b[localb.m[i15]];
/* 246 */       float[] arrayOfFloat3 = p;
/* 247 */       localh.r(arrayOfFloat3, i3 >> 1, i14);
/*     */     }
/*     */     int i16;
/* 250 */     if (i13 == 0) {
/* 251 */       i15 = localb.d;
/* 252 */       i16 = localb.l[i15];
/* 253 */       e[i16].j(p, i3 >> 1);
/*     */     }
/*     */     int i17;
/* 256 */     if (i13 != 0) {
/* 257 */       for (i15 = i3 >> 1; i15 < i3; i15++) p[i15] = 0.0F; 
/*     */     }
/*     */     else
/*     */     {
/* 260 */       i15 = i3 >> 1;
/* 261 */       i16 = i3 >> 2;
/* 262 */       i17 = i3 >> 3;
/* 263 */       float[] arrayOfFloat4 = p;
/* 264 */       for (int i19 = 0; i19 < i15; i19++) arrayOfFloat4[i19] *= 0.5F;
/* 265 */       for (i19 = i15; i19 < i3; i19++) arrayOfFloat4[i19] = (-arrayOfFloat4[(i3 - i19 - 1)]);
/* 266 */       float[] arrayOfFloat5 = i2 != 0 ? as : ad;
/* 267 */       float[] arrayOfFloat6 = i2 != 0 ? am : ac;
/* 268 */       float[] arrayOfFloat7 = i2 != 0 ? ap : aa;
/* 269 */       int[] arrayOfInt = i2 != 0 ? ak : av;
/*     */       float f1;
/*     */       float f2;
/*     */       float f4;
/*     */       float f6;
/* 270 */       for (int i20 = 0; i20 < i16; i20++) {
/* 271 */         f1 = arrayOfFloat4[(4 * i20)] - arrayOfFloat4[(i3 - 4 * i20 - 1)];
/* 272 */         f2 = arrayOfFloat4[(4 * i20 + 2)] - arrayOfFloat4[(i3 - 4 * i20 - 3)];
/* 273 */         f4 = arrayOfFloat5[(2 * i20)];
/* 274 */         f6 = arrayOfFloat5[(2 * i20 + 1)];
/* 275 */         arrayOfFloat4[(i3 - 4 * i20 - 1)] = (f1 * f4 - f2 * f6);
/* 276 */         arrayOfFloat4[(i3 - 4 * i20 - 3)] = (f1 * f6 + f2 * f4);
/*     */       }
/* 278 */       for (i20 = 0; i20 < i17; i20++) {
/* 279 */         f1 = arrayOfFloat4[(i15 + 3 + 4 * i20)];
/* 280 */         f2 = arrayOfFloat4[(i15 + 1 + 4 * i20)];
/* 281 */         f4 = arrayOfFloat4[(4 * i20 + 3)];
/* 282 */         f6 = arrayOfFloat4[(4 * i20 + 1)];
/* 283 */         arrayOfFloat4[(i15 + 3 + 4 * i20)] = (f1 + f4);
/* 284 */         arrayOfFloat4[(i15 + 1 + 4 * i20)] = (f2 + f6);
/* 285 */         float f8 = arrayOfFloat5[(i15 - 4 - 4 * i20)];
/* 286 */         float f10 = arrayOfFloat5[(i15 - 3 - 4 * i20)];
/* 287 */         arrayOfFloat4[(4 * i20 + 3)] = ((f1 - f4) * f8 - (f2 - f6) * f10);
/* 288 */         arrayOfFloat4[(4 * i20 + 1)] = ((f2 - f6) * f8 + (f1 - f4) * f10);
/*     */       }
/* 290 */       i20 = az.l(i3 - 1, (byte)30);
/*     */       int i22;
/*     */       int i23;
/*     */       int i24;
/* 291 */       for (int i21 = 0; i21 < i20 - 3; i21++) {
/* 292 */         i22 = i3 >> i21 + 2;
/* 293 */         i23 = 8 << i21;
/* 294 */         for (i24 = 0; i24 < 2 << i21; i24++) {
/* 295 */           int i25 = i3 - i22 * 2 * i24;
/* 296 */           int i26 = i3 - i22 * (2 * i24 + 1);
/* 297 */           for (int i27 = 0; i27 < i3 >> i21 + 4; i27++) {
/* 298 */             int i28 = 4 * i27;
/* 299 */             float f14 = arrayOfFloat4[(i25 - 1 - i28)];
/* 300 */             float f15 = arrayOfFloat4[(i25 - 3 - i28)];
/* 301 */             float f16 = arrayOfFloat4[(i26 - 1 - i28)];
/* 302 */             float f17 = arrayOfFloat4[(i26 - 3 - i28)];
/* 303 */             arrayOfFloat4[(i25 - 1 - i28)] = (f14 + f16);
/* 304 */             arrayOfFloat4[(i25 - 3 - i28)] = (f15 + f17);
/* 305 */             float f18 = arrayOfFloat5[(i27 * i23)];
/* 306 */             float f19 = arrayOfFloat5[(i27 * i23 + 1)];
/* 307 */             arrayOfFloat4[(i26 - 1 - i28)] = ((f14 - f16) * f18 - (f15 - f17) * f19);
/* 308 */             arrayOfFloat4[(i26 - 3 - i28)] = ((f15 - f17) * f18 + (f14 - f16) * f19);
/*     */           }
/*     */         }
/*     */       }
/*     */       float f9;
/* 312 */       for (i21 = 1; i21 < i17 - 1; i21++) {
/* 313 */         i22 = arrayOfInt[i21];
/* 314 */         if (i21 < i22) {
/* 315 */           i23 = 8 * i21;
/* 316 */           i24 = 8 * i22;
/*     */ 
/* 318 */           f9 = arrayOfFloat4[(i23 + 1)];
/* 319 */           arrayOfFloat4[(i23 + 1)] = arrayOfFloat4[(i24 + 1)];
/* 320 */           arrayOfFloat4[(i24 + 1)] = f9;
/* 321 */           f9 = arrayOfFloat4[(i23 + 3)];
/* 322 */           arrayOfFloat4[(i23 + 3)] = arrayOfFloat4[(i24 + 3)];
/* 323 */           arrayOfFloat4[(i24 + 3)] = f9;
/* 324 */           f9 = arrayOfFloat4[(i23 + 5)];
/* 325 */           arrayOfFloat4[(i23 + 5)] = arrayOfFloat4[(i24 + 5)];
/* 326 */           arrayOfFloat4[(i24 + 5)] = f9;
/* 327 */           f9 = arrayOfFloat4[(i23 + 7)];
/* 328 */           arrayOfFloat4[(i23 + 7)] = arrayOfFloat4[(i24 + 7)];
/* 329 */           arrayOfFloat4[(i24 + 7)] = f9;
/*     */         }
/*     */       }
/* 332 */       for (i21 = 0; i21 < i15; i21++) arrayOfFloat4[i21] = arrayOfFloat4[(2 * i21 + 1)];
/* 333 */       for (i21 = 0; i21 < i17; i21++) {
/* 334 */         arrayOfFloat4[(i3 - 1 - 2 * i21)] = arrayOfFloat4[(4 * i21)];
/* 335 */         arrayOfFloat4[(i3 - 2 - 2 * i21)] = arrayOfFloat4[(4 * i21 + 1)];
/* 336 */         arrayOfFloat4[(i3 - i16 - 1 - 2 * i21)] = arrayOfFloat4[(4 * i21 + 2)];
/* 337 */         arrayOfFloat4[(i3 - i16 - 2 - 2 * i21)] = arrayOfFloat4[(4 * i21 + 3)];
/*     */       }
/*     */       float f3;
/* 339 */       for (i21 = 0; i21 < i17; i21++) {
/* 340 */         f3 = arrayOfFloat7[(2 * i21)];
/* 341 */         float f5 = arrayOfFloat7[(2 * i21 + 1)];
/* 342 */         float f7 = arrayOfFloat4[(i15 + 2 * i21)];
/* 343 */         f9 = arrayOfFloat4[(i15 + 2 * i21 + 1)];
/* 344 */         float f11 = arrayOfFloat4[(i3 - 2 - 2 * i21)];
/* 345 */         float f12 = arrayOfFloat4[(i3 - 1 - 2 * i21)];
/* 346 */         float f13 = f5 * (f7 - f11) + f3 * (f9 + f12);
/* 347 */         arrayOfFloat4[(i15 + 2 * i21)] = ((f7 + f11 + f13) * 0.5F);
/* 348 */         arrayOfFloat4[(i3 - 2 - 2 * i21)] = ((f7 + f11 - f13) * 0.5F);
/* 349 */         f13 = f5 * (f9 + f12) - f3 * (f7 - f11);
/* 350 */         arrayOfFloat4[(i15 + 2 * i21 + 1)] = ((f9 - f12 + f13) * 0.5F);
/* 351 */         arrayOfFloat4[(i3 - 1 - 2 * i21)] = ((-f9 + f12 + f13) * 0.5F);
/*     */       }
/* 353 */       for (i21 = 0; i21 < i16; i21++) {
/* 354 */         arrayOfFloat4[i21] = (arrayOfFloat4[(2 * i21 + i15)] * arrayOfFloat6[(2 * i21)] + arrayOfFloat4[(2 * i21 + 1 + i15)] * arrayOfFloat6[(2 * i21 + 1)]);
/* 355 */         arrayOfFloat4[(i15 - 1 - i21)] = (arrayOfFloat4[(2 * i21 + i15)] * arrayOfFloat6[(2 * i21 + 1)] - arrayOfFloat4[(2 * i21 + 1 + i15)] * arrayOfFloat6[(2 * i21)]);
/*     */       }
/* 357 */       for (i21 = 0; i21 < i16; i21++) arrayOfFloat4[(i3 - i16 + i21)] = (-arrayOfFloat4[i21]);
/* 358 */       for (i21 = 0; i21 < i16; i21++) arrayOfFloat4[i21] = arrayOfFloat4[(i16 + i21)];
/* 359 */       for (i21 = 0; i21 < i16; i21++) arrayOfFloat4[(i16 + i21)] = (-arrayOfFloat4[(i16 - i21 - 1)]);
/* 360 */       for (i21 = 0; i21 < i16; i21++) arrayOfFloat4[(i15 + i21)] = arrayOfFloat4[(i3 - i21 - 1)];
/* 361 */       for (i21 = i7; i21 < i8; i21++) {
/* 362 */         f3 = (float)Math.sin((i21 - i7 + 0.5D) / i9 * 0.5D * 3.141592653589793D);
/* 363 */         p[i21] *= (float)Math.sin(1.570796326794897D * f3 * f3);
/*     */       }
/* 365 */       for (i21 = i10; i21 < i11; i21++) {
/* 366 */         f3 = (float)Math.sin((i21 - i10 + 0.5D) / i12 * 0.5D * 3.141592653589793D + 1.570796326794897D);
/* 367 */         p[i21] *= (float)Math.sin(1.570796326794897D * f3 * f3);
/*     */       }
/*     */     }
/* 370 */     float[] arrayOfFloat1 = null;
/* 371 */     if (this.a > 0) {
/* 372 */       i16 = this.a + i3 >> 2;
/* 373 */       arrayOfFloat1 = new float[i16];
/*     */       int i18;
/* 374 */       if (!this.x) {
/* 375 */         for (i17 = 0; i17 < this.h; i17++) {
/* 376 */           i18 = (this.a >> 1) + i17;
/* 377 */           arrayOfFloat1[i17] += this.o[i18];
/*     */         }
/*     */       }
/* 380 */       if (i13 == 0) {
/* 381 */         for (i17 = i7; i17 < i3 >> 1; i17++) {
/* 382 */           i18 = arrayOfFloat1.length - (i3 >> 1) + i17;
/* 383 */           arrayOfFloat1[i18] += p[i17];
/*     */         }
/*     */       }
/*     */     }
/* 387 */     float[] arrayOfFloat2 = this.o;
/* 388 */     this.o = p;
/* 389 */     p = arrayOfFloat2;
/* 390 */     this.a = i3;
/* 391 */     this.h = (i11 - (i3 >> 1));
/* 392 */     this.x = i13;
/* 393 */     return arrayOfFloat1;
/*     */   }
/*     */ 
/*     */   static boolean s(ch paramch) {
/* 397 */     if (!k) {
/* 398 */       byte[] arrayOfByte = paramch.l(0, 0, 1086909588);
/* 399 */       if (arrayOfByte == null) return false;
/* 400 */       q(arrayOfByte);
/* 401 */       k = true;
/*     */     }
/* 403 */     return true;
/*     */   }
/*     */ 
/*     */   static dt u(ch paramch, int paramInt1, int paramInt2) {
/* 407 */     if (!s(paramch)) {
/* 408 */       paramch.c(paramInt1, paramInt2, -1540221916);
/* 409 */       return null;
/*     */     }
/* 411 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 1195602053);
/* 412 */     if (arrayOfByte == null) return null;
/* 413 */     return new dt(arrayOfByte);
/*     */   }
/*     */ 
/*     */   static int t()
/*     */   {
/*  61 */     int i1 = q[i] >> s & 0x1;
/*  62 */     s += 1;
/*  63 */     i += (s >> 3);
/*  64 */     s &= 7;
/*  65 */     return i1;
/*     */   }
/*     */ 
/*     */   static void h(byte[] paramArrayOfByte)
/*     */   {
/* 114 */     n(paramArrayOfByte, 0);
/* 115 */     u = 1 << z(4);
/* 116 */     v = 1 << z(4);
/* 117 */     p = new float[v];
/* 118 */     for (int i1 = 0; i1 < 2; i1++) {
/* 119 */       i2 = i1 != 0 ? v : u;
/* 120 */       i3 = i2 >> 1;
/* 121 */       i4 = i2 >> 2;
/* 122 */       i5 = i2 >> 3;
/* 123 */       float[] arrayOfFloat1 = new float[i3];
/* 124 */       for (int i7 = 0; i7 < i4; i7++) {
/* 125 */         arrayOfFloat1[(2 * i7)] = ((float)Math.cos(4 * i7 * 3.141592653589793D / i2));
/* 126 */         arrayOfFloat1[(2 * i7 + 1)] = (-(float)Math.sin(4 * i7 * 3.141592653589793D / i2));
/*     */       }
/* 128 */       float[] arrayOfFloat2 = new float[i3];
/* 129 */       for (int i8 = 0; i8 < i4; i8++) {
/* 130 */         arrayOfFloat2[(2 * i8)] = ((float)Math.cos((2 * i8 + 1) * 3.141592653589793D / (2 * i2)));
/* 131 */         arrayOfFloat2[(2 * i8 + 1)] = ((float)Math.sin((2 * i8 + 1) * 3.141592653589793D / (2 * i2)));
/*     */       }
/* 133 */       float[] arrayOfFloat3 = new float[i4];
/* 134 */       for (int i9 = 0; i9 < i5; i9++) {
/* 135 */         arrayOfFloat3[(2 * i9)] = ((float)Math.cos((4 * i9 + 2) * 3.141592653589793D / i2));
/* 136 */         arrayOfFloat3[(2 * i9 + 1)] = (-(float)Math.sin((4 * i9 + 2) * 3.141592653589793D / i2));
/*     */       }
/* 138 */       int[] arrayOfInt1 = new int[i5];
/* 139 */       int i10 = az.l(i5 - 1, (byte)123);
/* 140 */       for (int i11 = 0; i11 < i5; i11++) {
/* 141 */         int[] arrayOfInt2 = arrayOfInt1;
/* 142 */         int i12 = i11;
/*     */ 
/* 144 */         int i14 = i11;
/* 145 */         int i15 = i10;
/*     */ 
/* 147 */         int i16 = 0;
/* 148 */         while (i15 > 0) {
/* 149 */           i16 = i16 << 1 | i14 & 0x1;
/* 150 */           i14 >>>= 1;
/* 151 */           i15--;
/*     */         }
/* 153 */         int i13 = i16;
/*     */ 
/* 155 */         arrayOfInt2[i12] = i13;
/*     */       }
/* 157 */       if (i1 != 0) {
/* 158 */         as = arrayOfFloat1;
/* 159 */         am = arrayOfFloat2;
/* 160 */         ap = arrayOfFloat3;
/* 161 */         ak = arrayOfInt1;
/*     */       }
/*     */       else {
/* 164 */         ad = arrayOfFloat1;
/* 165 */         ac = arrayOfFloat2;
/* 166 */         aa = arrayOfFloat3;
/* 167 */         av = arrayOfInt1;
/*     */       }
/*     */     }
/* 170 */     i1 = z(8) + 1;
/* 171 */     w = new x[i1];
/* 172 */     for (int i2 = 0; i2 < i1; i2++) w[i2] = new x();
/*     */ 
/* 174 */     i2 = z(6) + 1;
/* 175 */     for (int i3 = 0; i3 < i2; i3++) z(16);
/*     */ 
/* 177 */     i2 = z(6) + 1;
/* 178 */     e = new e[i2];
/* 179 */     for (i3 = 0; i3 < i2; i3++) e[i3] = new e();
/* 180 */     i3 = z(6) + 1;
/* 181 */     b = new h[i3];
/* 182 */     for (int i4 = 0; i4 < i3; i4++) b[i4] = new h();
/* 183 */     i4 = z(6) + 1;
/* 184 */     y = new b[i4];
/* 185 */     for (int i5 = 0; i5 < i4; i5++) y[i5] = new b();
/* 186 */     i5 = z(6) + 1;
/* 187 */     t = new boolean[i5];
/* 188 */     f = new int[i5];
/* 189 */     for (int i6 = 0; i6 < i5; i6++) {
/* 190 */       t[i6] = (j() != 0 ? 1 : false);
/* 191 */       z(16);
/* 192 */       z(16);
/* 193 */       f[i6] = z(8);
/*     */     }
/*     */   }
/*     */ 
/*     */   static float w(int paramInt)
/*     */   {
/*  47 */     int i1 = paramInt & 0x1FFFFF;
/*  48 */     int i2 = paramInt & 0x80000000;
/*  49 */     int i3 = (paramInt & 0x7FE00000) >> 21;
/*  50 */     if (i2 != 0) i1 = -i1;
/*  51 */     return (float)(i1 * Math.pow(2.0D, i3 - 788));
/*     */   }
/*     */ 
/*     */   static void e(byte[] paramArrayOfByte, int paramInt) {
/*  55 */     q = paramArrayOfByte;
/*  56 */     i = paramInt;
/*  57 */     s = 0;
/*     */   }
/*     */ 
/*     */   static int b() {
/*  61 */     int i1 = q[i] >> s & 0x1;
/*  62 */     s += 1;
/*  63 */     i += (s >> 3);
/*  64 */     s &= 7;
/*  65 */     return i1;
/*     */   }
/*     */ 
/*     */   static int y()
/*     */   {
/*  61 */     int i1 = q[i] >> s & 0x1;
/*  62 */     s += 1;
/*  63 */     i += (s >> 3);
/*  64 */     s &= 7;
/*  65 */     return i1;
/*     */   }
/*     */ 
/*     */   static dt am(ch paramch, int paramInt1, int paramInt2)
/*     */   {
/* 407 */     if (!s(paramch)) {
/* 408 */       paramch.c(paramInt1, paramInt2, -736864836);
/* 409 */       return null;
/*     */     }
/* 411 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 1780354518);
/* 412 */     if (arrayOfByte == null) return null;
/* 413 */     return new dt(arrayOfByte);
/*     */   }
/*     */ 
/*     */   static void q(byte[] paramArrayOfByte)
/*     */   {
/* 114 */     n(paramArrayOfByte, 0);
/* 115 */     u = 1 << z(4);
/* 116 */     v = 1 << z(4);
/* 117 */     p = new float[v];
/* 118 */     for (int i1 = 0; i1 < 2; i1++) {
/* 119 */       i2 = i1 != 0 ? v : u;
/* 120 */       i3 = i2 >> 1;
/* 121 */       i4 = i2 >> 2;
/* 122 */       i5 = i2 >> 3;
/* 123 */       float[] arrayOfFloat1 = new float[i3];
/* 124 */       for (int i7 = 0; i7 < i4; i7++) {
/* 125 */         arrayOfFloat1[(2 * i7)] = ((float)Math.cos(4 * i7 * 3.141592653589793D / i2));
/* 126 */         arrayOfFloat1[(2 * i7 + 1)] = (-(float)Math.sin(4 * i7 * 3.141592653589793D / i2));
/*     */       }
/* 128 */       float[] arrayOfFloat2 = new float[i3];
/* 129 */       for (int i8 = 0; i8 < i4; i8++) {
/* 130 */         arrayOfFloat2[(2 * i8)] = ((float)Math.cos((2 * i8 + 1) * 3.141592653589793D / (2 * i2)));
/* 131 */         arrayOfFloat2[(2 * i8 + 1)] = ((float)Math.sin((2 * i8 + 1) * 3.141592653589793D / (2 * i2)));
/*     */       }
/* 133 */       float[] arrayOfFloat3 = new float[i4];
/* 134 */       for (int i9 = 0; i9 < i5; i9++) {
/* 135 */         arrayOfFloat3[(2 * i9)] = ((float)Math.cos((4 * i9 + 2) * 3.141592653589793D / i2));
/* 136 */         arrayOfFloat3[(2 * i9 + 1)] = (-(float)Math.sin((4 * i9 + 2) * 3.141592653589793D / i2));
/*     */       }
/* 138 */       int[] arrayOfInt1 = new int[i5];
/* 139 */       int i10 = az.l(i5 - 1, (byte)48);
/* 140 */       for (int i11 = 0; i11 < i5; i11++) {
/* 141 */         int[] arrayOfInt2 = arrayOfInt1;
/* 142 */         int i12 = i11;
/*     */ 
/* 144 */         int i14 = i11;
/* 145 */         int i15 = i10;
/*     */ 
/* 147 */         int i16 = 0;
/* 148 */         while (i15 > 0) {
/* 149 */           i16 = i16 << 1 | i14 & 0x1;
/* 150 */           i14 >>>= 1;
/* 151 */           i15--;
/*     */         }
/* 153 */         int i13 = i16;
/*     */ 
/* 155 */         arrayOfInt2[i12] = i13;
/*     */       }
/* 157 */       if (i1 != 0) {
/* 158 */         as = arrayOfFloat1;
/* 159 */         am = arrayOfFloat2;
/* 160 */         ap = arrayOfFloat3;
/* 161 */         ak = arrayOfInt1;
/*     */       }
/*     */       else {
/* 164 */         ad = arrayOfFloat1;
/* 165 */         ac = arrayOfFloat2;
/* 166 */         aa = arrayOfFloat3;
/* 167 */         av = arrayOfInt1;
/*     */       }
/*     */     }
/* 170 */     i1 = z(8) + 1;
/* 171 */     w = new x[i1];
/* 172 */     for (int i2 = 0; i2 < i1; i2++) w[i2] = new x();
/*     */ 
/* 174 */     i2 = z(6) + 1;
/* 175 */     for (int i3 = 0; i3 < i2; i3++) z(16);
/*     */ 
/* 177 */     i2 = z(6) + 1;
/* 178 */     e = new e[i2];
/* 179 */     for (i3 = 0; i3 < i2; i3++) e[i3] = new e();
/* 180 */     i3 = z(6) + 1;
/* 181 */     b = new h[i3];
/* 182 */     for (int i4 = 0; i4 < i3; i4++) b[i4] = new h();
/* 183 */     i4 = z(6) + 1;
/* 184 */     y = new b[i4];
/* 185 */     for (int i5 = 0; i5 < i4; i5++) y[i5] = new b();
/* 186 */     i5 = z(6) + 1;
/* 187 */     t = new boolean[i5];
/* 188 */     f = new int[i5];
/* 189 */     for (int i6 = 0; i6 < i5; i6++) {
/* 190 */       t[i6] = (j() != 0 ? 1 : false);
/* 191 */       z(16);
/* 192 */       z(16);
/* 193 */       f[i6] = z(8);
/*     */     }
/*     */   }
/*     */ 
/*     */   void k(byte[] paramArrayOfByte)
/*     */   {
/*  89 */     ev localev = new ev(paramArrayOfByte);
/*  90 */     this.c = localev.h(-388659084);
/*  91 */     this.n = localev.h(-135645447);
/*  92 */     this.j = localev.h(1229822602);
/*  93 */     this.z = localev.h(589236013);
/*  94 */     if (this.z < 0) {
/*  95 */       this.z ^= -1;
/*  96 */       this.g = true;
/*     */     }
/*  98 */     int i1 = localev.h(-2100564034);
/*  99 */     this.m = new byte[i1][];
/* 100 */     for (int i2 = 0; i2 < i1; i2++) {
/* 101 */       int i3 = 0;
/*     */       while (true) {
/* 103 */         int i4 = localev.t(1118814123);
/* 104 */         i3 += i4;
/* 105 */         if (i4 < 255) break;
/*     */       }
/* 107 */       byte[] arrayOfByte = new byte[i3];
/* 108 */       localev.as(arrayOfByte, 0, i3, 1602313803);
/* 109 */       this.m[i2] = arrayOfByte;
/*     */     }
/*     */   }
/*     */ 
/*     */   static int j()
/*     */   {
/*  61 */     int i1 = q[i] >> s & 0x1;
/*  62 */     s += 1;
/*  63 */     i += (s >> 3);
/*  64 */     s &= 7;
/*  65 */     return i1;
/*     */   }
/*     */ 
/*     */   dt(byte[] paramArrayOfByte)
/*     */   {
/* 417 */     g(paramArrayOfByte);
/*     */   }
/*     */ 
/*     */   void o(byte[] paramArrayOfByte)
/*     */   {
/*  89 */     ev localev = new ev(paramArrayOfByte);
/*  90 */     this.c = localev.h(507960922);
/*  91 */     this.n = localev.h(1102534506);
/*  92 */     this.j = localev.h(560751079);
/*  93 */     this.z = localev.h(1058635931);
/*  94 */     if (this.z < 0) {
/*  95 */       this.z ^= -1;
/*  96 */       this.g = true;
/*     */     }
/*  98 */     int i1 = localev.h(1183113421);
/*  99 */     this.m = new byte[i1][];
/* 100 */     for (int i2 = 0; i2 < i1; i2++) {
/* 101 */       int i3 = 0;
/*     */       while (true) {
/* 103 */         int i4 = localev.t(1118814123);
/* 104 */         i3 += i4;
/* 105 */         if (i4 < 255) break;
/*     */       }
/* 107 */       byte[] arrayOfByte = new byte[i3];
/* 108 */       localev.as(arrayOfByte, 0, i3, 1602313803);
/* 109 */       this.m[i2] = arrayOfByte;
/*     */     }
/*     */   }
/*     */ 
/*     */   float[] x(int paramInt)
/*     */   {
/* 198 */     n(this.m[paramInt], 0);
/* 199 */     j();
/* 200 */     int i1 = z(az.l(f.length - 1, (byte)90));
/* 201 */     int i2 = t[i1];
/* 202 */     int i3 = i2 != 0 ? v : u;
/* 203 */     int i4 = 0;
/* 204 */     int i5 = 0;
/* 205 */     if (i2 != 0) {
/* 206 */       i4 = j() != 0 ? 1 : 0;
/* 207 */       i5 = j() != 0 ? 1 : 0;
/*     */     }
/* 209 */     int i6 = i3 >> 1;
/*     */     int i7;
/*     */     int i8;
/*     */     int i9;
/* 213 */     if ((i2 != 0) && (i4 == 0)) {
/* 214 */       i7 = (i3 >> 2) - (u >> 2);
/* 215 */       i8 = (i3 >> 2) + (u >> 2);
/* 216 */       i9 = u >> 1;
/*     */     }
/*     */     else {
/* 219 */       i7 = 0;
/* 220 */       i8 = i6;
/* 221 */       i9 = i3 >> 1;
/*     */     }
/*     */     int i10;
/*     */     int i11;
/*     */     int i12;
/* 226 */     if ((i2 != 0) && (i5 == 0)) {
/* 227 */       i10 = i3 - (i3 >> 2) - (u >> 2);
/* 228 */       i11 = i3 - (i3 >> 2) + (u >> 2);
/* 229 */       i12 = u >> 1;
/*     */     }
/*     */     else {
/* 232 */       i10 = i6;
/* 233 */       i11 = i3;
/* 234 */       i12 = i3 >> 1;
/*     */     }
/* 236 */     b localb = y[f[i1]];
/*     */ 
/* 239 */     int i14 = localb.d;
/* 240 */     int i15 = localb.l[i14];
/* 241 */     int i13 = !e[i15].n() ? 1 : 0;
/*     */ 
/* 243 */     i14 = i13;
/* 244 */     for (i15 = 0; i15 < localb.r; i15++) {
/* 245 */       h localh = b[localb.m[i15]];
/* 246 */       float[] arrayOfFloat3 = p;
/* 247 */       localh.r(arrayOfFloat3, i3 >> 1, i14);
/*     */     }
/*     */     int i16;
/* 250 */     if (i13 == 0) {
/* 251 */       i15 = localb.d;
/* 252 */       i16 = localb.l[i15];
/* 253 */       e[i16].j(p, i3 >> 1);
/*     */     }
/*     */     int i17;
/* 256 */     if (i13 != 0) {
/* 257 */       for (i15 = i3 >> 1; i15 < i3; i15++) p[i15] = 0.0F; 
/*     */     }
/*     */     else
/*     */     {
/* 260 */       i15 = i3 >> 1;
/* 261 */       i16 = i3 >> 2;
/* 262 */       i17 = i3 >> 3;
/* 263 */       float[] arrayOfFloat4 = p;
/* 264 */       for (int i19 = 0; i19 < i15; i19++) arrayOfFloat4[i19] *= 0.5F;
/* 265 */       for (i19 = i15; i19 < i3; i19++) arrayOfFloat4[i19] = (-arrayOfFloat4[(i3 - i19 - 1)]);
/* 266 */       float[] arrayOfFloat5 = i2 != 0 ? as : ad;
/* 267 */       float[] arrayOfFloat6 = i2 != 0 ? am : ac;
/* 268 */       float[] arrayOfFloat7 = i2 != 0 ? ap : aa;
/* 269 */       int[] arrayOfInt = i2 != 0 ? ak : av;
/*     */       float f1;
/*     */       float f2;
/*     */       float f4;
/*     */       float f6;
/* 270 */       for (int i20 = 0; i20 < i16; i20++) {
/* 271 */         f1 = arrayOfFloat4[(4 * i20)] - arrayOfFloat4[(i3 - 4 * i20 - 1)];
/* 272 */         f2 = arrayOfFloat4[(4 * i20 + 2)] - arrayOfFloat4[(i3 - 4 * i20 - 3)];
/* 273 */         f4 = arrayOfFloat5[(2 * i20)];
/* 274 */         f6 = arrayOfFloat5[(2 * i20 + 1)];
/* 275 */         arrayOfFloat4[(i3 - 4 * i20 - 1)] = (f1 * f4 - f2 * f6);
/* 276 */         arrayOfFloat4[(i3 - 4 * i20 - 3)] = (f1 * f6 + f2 * f4);
/*     */       }
/* 278 */       for (i20 = 0; i20 < i17; i20++) {
/* 279 */         f1 = arrayOfFloat4[(i15 + 3 + 4 * i20)];
/* 280 */         f2 = arrayOfFloat4[(i15 + 1 + 4 * i20)];
/* 281 */         f4 = arrayOfFloat4[(4 * i20 + 3)];
/* 282 */         f6 = arrayOfFloat4[(4 * i20 + 1)];
/* 283 */         arrayOfFloat4[(i15 + 3 + 4 * i20)] = (f1 + f4);
/* 284 */         arrayOfFloat4[(i15 + 1 + 4 * i20)] = (f2 + f6);
/* 285 */         float f8 = arrayOfFloat5[(i15 - 4 - 4 * i20)];
/* 286 */         float f10 = arrayOfFloat5[(i15 - 3 - 4 * i20)];
/* 287 */         arrayOfFloat4[(4 * i20 + 3)] = ((f1 - f4) * f8 - (f2 - f6) * f10);
/* 288 */         arrayOfFloat4[(4 * i20 + 1)] = ((f2 - f6) * f8 + (f1 - f4) * f10);
/*     */       }
/* 290 */       i20 = az.l(i3 - 1, (byte)103);
/*     */       int i22;
/*     */       int i23;
/*     */       int i24;
/* 291 */       for (int i21 = 0; i21 < i20 - 3; i21++) {
/* 292 */         i22 = i3 >> i21 + 2;
/* 293 */         i23 = 8 << i21;
/* 294 */         for (i24 = 0; i24 < 2 << i21; i24++) {
/* 295 */           int i25 = i3 - i22 * 2 * i24;
/* 296 */           int i26 = i3 - i22 * (2 * i24 + 1);
/* 297 */           for (int i27 = 0; i27 < i3 >> i21 + 4; i27++) {
/* 298 */             int i28 = 4 * i27;
/* 299 */             float f14 = arrayOfFloat4[(i25 - 1 - i28)];
/* 300 */             float f15 = arrayOfFloat4[(i25 - 3 - i28)];
/* 301 */             float f16 = arrayOfFloat4[(i26 - 1 - i28)];
/* 302 */             float f17 = arrayOfFloat4[(i26 - 3 - i28)];
/* 303 */             arrayOfFloat4[(i25 - 1 - i28)] = (f14 + f16);
/* 304 */             arrayOfFloat4[(i25 - 3 - i28)] = (f15 + f17);
/* 305 */             float f18 = arrayOfFloat5[(i27 * i23)];
/* 306 */             float f19 = arrayOfFloat5[(i27 * i23 + 1)];
/* 307 */             arrayOfFloat4[(i26 - 1 - i28)] = ((f14 - f16) * f18 - (f15 - f17) * f19);
/* 308 */             arrayOfFloat4[(i26 - 3 - i28)] = ((f15 - f17) * f18 + (f14 - f16) * f19);
/*     */           }
/*     */         }
/*     */       }
/*     */       float f9;
/* 312 */       for (i21 = 1; i21 < i17 - 1; i21++) {
/* 313 */         i22 = arrayOfInt[i21];
/* 314 */         if (i21 < i22) {
/* 315 */           i23 = 8 * i21;
/* 316 */           i24 = 8 * i22;
/*     */ 
/* 318 */           f9 = arrayOfFloat4[(i23 + 1)];
/* 319 */           arrayOfFloat4[(i23 + 1)] = arrayOfFloat4[(i24 + 1)];
/* 320 */           arrayOfFloat4[(i24 + 1)] = f9;
/* 321 */           f9 = arrayOfFloat4[(i23 + 3)];
/* 322 */           arrayOfFloat4[(i23 + 3)] = arrayOfFloat4[(i24 + 3)];
/* 323 */           arrayOfFloat4[(i24 + 3)] = f9;
/* 324 */           f9 = arrayOfFloat4[(i23 + 5)];
/* 325 */           arrayOfFloat4[(i23 + 5)] = arrayOfFloat4[(i24 + 5)];
/* 326 */           arrayOfFloat4[(i24 + 5)] = f9;
/* 327 */           f9 = arrayOfFloat4[(i23 + 7)];
/* 328 */           arrayOfFloat4[(i23 + 7)] = arrayOfFloat4[(i24 + 7)];
/* 329 */           arrayOfFloat4[(i24 + 7)] = f9;
/*     */         }
/*     */       }
/* 332 */       for (i21 = 0; i21 < i15; i21++) arrayOfFloat4[i21] = arrayOfFloat4[(2 * i21 + 1)];
/* 333 */       for (i21 = 0; i21 < i17; i21++) {
/* 334 */         arrayOfFloat4[(i3 - 1 - 2 * i21)] = arrayOfFloat4[(4 * i21)];
/* 335 */         arrayOfFloat4[(i3 - 2 - 2 * i21)] = arrayOfFloat4[(4 * i21 + 1)];
/* 336 */         arrayOfFloat4[(i3 - i16 - 1 - 2 * i21)] = arrayOfFloat4[(4 * i21 + 2)];
/* 337 */         arrayOfFloat4[(i3 - i16 - 2 - 2 * i21)] = arrayOfFloat4[(4 * i21 + 3)];
/*     */       }
/*     */       float f3;
/* 339 */       for (i21 = 0; i21 < i17; i21++) {
/* 340 */         f3 = arrayOfFloat7[(2 * i21)];
/* 341 */         float f5 = arrayOfFloat7[(2 * i21 + 1)];
/* 342 */         float f7 = arrayOfFloat4[(i15 + 2 * i21)];
/* 343 */         f9 = arrayOfFloat4[(i15 + 2 * i21 + 1)];
/* 344 */         float f11 = arrayOfFloat4[(i3 - 2 - 2 * i21)];
/* 345 */         float f12 = arrayOfFloat4[(i3 - 1 - 2 * i21)];
/* 346 */         float f13 = f5 * (f7 - f11) + f3 * (f9 + f12);
/* 347 */         arrayOfFloat4[(i15 + 2 * i21)] = ((f7 + f11 + f13) * 0.5F);
/* 348 */         arrayOfFloat4[(i3 - 2 - 2 * i21)] = ((f7 + f11 - f13) * 0.5F);
/* 349 */         f13 = f5 * (f9 + f12) - f3 * (f7 - f11);
/* 350 */         arrayOfFloat4[(i15 + 2 * i21 + 1)] = ((f9 - f12 + f13) * 0.5F);
/* 351 */         arrayOfFloat4[(i3 - 1 - 2 * i21)] = ((-f9 + f12 + f13) * 0.5F);
/*     */       }
/* 353 */       for (i21 = 0; i21 < i16; i21++) {
/* 354 */         arrayOfFloat4[i21] = (arrayOfFloat4[(2 * i21 + i15)] * arrayOfFloat6[(2 * i21)] + arrayOfFloat4[(2 * i21 + 1 + i15)] * arrayOfFloat6[(2 * i21 + 1)]);
/* 355 */         arrayOfFloat4[(i15 - 1 - i21)] = (arrayOfFloat4[(2 * i21 + i15)] * arrayOfFloat6[(2 * i21 + 1)] - arrayOfFloat4[(2 * i21 + 1 + i15)] * arrayOfFloat6[(2 * i21)]);
/*     */       }
/* 357 */       for (i21 = 0; i21 < i16; i21++) arrayOfFloat4[(i3 - i16 + i21)] = (-arrayOfFloat4[i21]);
/* 358 */       for (i21 = 0; i21 < i16; i21++) arrayOfFloat4[i21] = arrayOfFloat4[(i16 + i21)];
/* 359 */       for (i21 = 0; i21 < i16; i21++) arrayOfFloat4[(i16 + i21)] = (-arrayOfFloat4[(i16 - i21 - 1)]);
/* 360 */       for (i21 = 0; i21 < i16; i21++) arrayOfFloat4[(i15 + i21)] = arrayOfFloat4[(i3 - i21 - 1)];
/* 361 */       for (i21 = i7; i21 < i8; i21++) {
/* 362 */         f3 = (float)Math.sin((i21 - i7 + 0.5D) / i9 * 0.5D * 3.141592653589793D);
/* 363 */         p[i21] *= (float)Math.sin(1.570796326794897D * f3 * f3);
/*     */       }
/* 365 */       for (i21 = i10; i21 < i11; i21++) {
/* 366 */         f3 = (float)Math.sin((i21 - i10 + 0.5D) / i12 * 0.5D * 3.141592653589793D + 1.570796326794897D);
/* 367 */         p[i21] *= (float)Math.sin(1.570796326794897D * f3 * f3);
/*     */       }
/*     */     }
/* 370 */     float[] arrayOfFloat1 = null;
/* 371 */     if (this.a > 0) {
/* 372 */       i16 = this.a + i3 >> 2;
/* 373 */       arrayOfFloat1 = new float[i16];
/*     */       int i18;
/* 374 */       if (!this.x) {
/* 375 */         for (i17 = 0; i17 < this.h; i17++) {
/* 376 */           i18 = (this.a >> 1) + i17;
/* 377 */           arrayOfFloat1[i17] += this.o[i18];
/*     */         }
/*     */       }
/* 380 */       if (i13 == 0) {
/* 381 */         for (i17 = i7; i17 < i3 >> 1; i17++) {
/* 382 */           i18 = arrayOfFloat1.length - (i3 >> 1) + i17;
/* 383 */           arrayOfFloat1[i18] += p[i17];
/*     */         }
/*     */       }
/*     */     }
/* 387 */     float[] arrayOfFloat2 = this.o;
/* 388 */     this.o = p;
/* 389 */     p = arrayOfFloat2;
/* 390 */     this.a = i3;
/* 391 */     this.h = (i11 - (i3 >> 1));
/* 392 */     this.x = i13;
/* 393 */     return arrayOfFloat1;
/*     */   }
/*     */ 
/*     */   float[] p(int paramInt)
/*     */   {
/* 198 */     n(this.m[paramInt], 0);
/* 199 */     j();
/* 200 */     int i1 = z(az.l(f.length - 1, (byte)20));
/* 201 */     int i2 = t[i1];
/* 202 */     int i3 = i2 != 0 ? v : u;
/* 203 */     int i4 = 0;
/* 204 */     int i5 = 0;
/* 205 */     if (i2 != 0) {
/* 206 */       i4 = j() != 0 ? 1 : 0;
/* 207 */       i5 = j() != 0 ? 1 : 0;
/*     */     }
/* 209 */     int i6 = i3 >> 1;
/*     */     int i7;
/*     */     int i8;
/*     */     int i9;
/* 213 */     if ((i2 != 0) && (i4 == 0)) {
/* 214 */       i7 = (i3 >> 2) - (u >> 2);
/* 215 */       i8 = (i3 >> 2) + (u >> 2);
/* 216 */       i9 = u >> 1;
/*     */     }
/*     */     else {
/* 219 */       i7 = 0;
/* 220 */       i8 = i6;
/* 221 */       i9 = i3 >> 1;
/*     */     }
/*     */     int i10;
/*     */     int i11;
/*     */     int i12;
/* 226 */     if ((i2 != 0) && (i5 == 0)) {
/* 227 */       i10 = i3 - (i3 >> 2) - (u >> 2);
/* 228 */       i11 = i3 - (i3 >> 2) + (u >> 2);
/* 229 */       i12 = u >> 1;
/*     */     }
/*     */     else {
/* 232 */       i10 = i6;
/* 233 */       i11 = i3;
/* 234 */       i12 = i3 >> 1;
/*     */     }
/* 236 */     b localb = y[f[i1]];
/*     */ 
/* 239 */     int i14 = localb.d;
/* 240 */     int i15 = localb.l[i14];
/* 241 */     int i13 = !e[i15].n() ? 1 : 0;
/*     */ 
/* 243 */     i14 = i13;
/* 244 */     for (i15 = 0; i15 < localb.r; i15++) {
/* 245 */       h localh = b[localb.m[i15]];
/* 246 */       float[] arrayOfFloat3 = p;
/* 247 */       localh.r(arrayOfFloat3, i3 >> 1, i14);
/*     */     }
/*     */     int i16;
/* 250 */     if (i13 == 0) {
/* 251 */       i15 = localb.d;
/* 252 */       i16 = localb.l[i15];
/* 253 */       e[i16].j(p, i3 >> 1);
/*     */     }
/*     */     int i17;
/* 256 */     if (i13 != 0) {
/* 257 */       for (i15 = i3 >> 1; i15 < i3; i15++) p[i15] = 0.0F; 
/*     */     }
/*     */     else
/*     */     {
/* 260 */       i15 = i3 >> 1;
/* 261 */       i16 = i3 >> 2;
/* 262 */       i17 = i3 >> 3;
/* 263 */       float[] arrayOfFloat4 = p;
/* 264 */       for (int i19 = 0; i19 < i15; i19++) arrayOfFloat4[i19] *= 0.5F;
/* 265 */       for (i19 = i15; i19 < i3; i19++) arrayOfFloat4[i19] = (-arrayOfFloat4[(i3 - i19 - 1)]);
/* 266 */       float[] arrayOfFloat5 = i2 != 0 ? as : ad;
/* 267 */       float[] arrayOfFloat6 = i2 != 0 ? am : ac;
/* 268 */       float[] arrayOfFloat7 = i2 != 0 ? ap : aa;
/* 269 */       int[] arrayOfInt = i2 != 0 ? ak : av;
/*     */       float f1;
/*     */       float f2;
/*     */       float f4;
/*     */       float f6;
/* 270 */       for (int i20 = 0; i20 < i16; i20++) {
/* 271 */         f1 = arrayOfFloat4[(4 * i20)] - arrayOfFloat4[(i3 - 4 * i20 - 1)];
/* 272 */         f2 = arrayOfFloat4[(4 * i20 + 2)] - arrayOfFloat4[(i3 - 4 * i20 - 3)];
/* 273 */         f4 = arrayOfFloat5[(2 * i20)];
/* 274 */         f6 = arrayOfFloat5[(2 * i20 + 1)];
/* 275 */         arrayOfFloat4[(i3 - 4 * i20 - 1)] = (f1 * f4 - f2 * f6);
/* 276 */         arrayOfFloat4[(i3 - 4 * i20 - 3)] = (f1 * f6 + f2 * f4);
/*     */       }
/* 278 */       for (i20 = 0; i20 < i17; i20++) {
/* 279 */         f1 = arrayOfFloat4[(i15 + 3 + 4 * i20)];
/* 280 */         f2 = arrayOfFloat4[(i15 + 1 + 4 * i20)];
/* 281 */         f4 = arrayOfFloat4[(4 * i20 + 3)];
/* 282 */         f6 = arrayOfFloat4[(4 * i20 + 1)];
/* 283 */         arrayOfFloat4[(i15 + 3 + 4 * i20)] = (f1 + f4);
/* 284 */         arrayOfFloat4[(i15 + 1 + 4 * i20)] = (f2 + f6);
/* 285 */         float f8 = arrayOfFloat5[(i15 - 4 - 4 * i20)];
/* 286 */         float f10 = arrayOfFloat5[(i15 - 3 - 4 * i20)];
/* 287 */         arrayOfFloat4[(4 * i20 + 3)] = ((f1 - f4) * f8 - (f2 - f6) * f10);
/* 288 */         arrayOfFloat4[(4 * i20 + 1)] = ((f2 - f6) * f8 + (f1 - f4) * f10);
/*     */       }
/* 290 */       i20 = az.l(i3 - 1, (byte)95);
/*     */       int i22;
/*     */       int i23;
/*     */       int i24;
/* 291 */       for (int i21 = 0; i21 < i20 - 3; i21++) {
/* 292 */         i22 = i3 >> i21 + 2;
/* 293 */         i23 = 8 << i21;
/* 294 */         for (i24 = 0; i24 < 2 << i21; i24++) {
/* 295 */           int i25 = i3 - i22 * 2 * i24;
/* 296 */           int i26 = i3 - i22 * (2 * i24 + 1);
/* 297 */           for (int i27 = 0; i27 < i3 >> i21 + 4; i27++) {
/* 298 */             int i28 = 4 * i27;
/* 299 */             float f14 = arrayOfFloat4[(i25 - 1 - i28)];
/* 300 */             float f15 = arrayOfFloat4[(i25 - 3 - i28)];
/* 301 */             float f16 = arrayOfFloat4[(i26 - 1 - i28)];
/* 302 */             float f17 = arrayOfFloat4[(i26 - 3 - i28)];
/* 303 */             arrayOfFloat4[(i25 - 1 - i28)] = (f14 + f16);
/* 304 */             arrayOfFloat4[(i25 - 3 - i28)] = (f15 + f17);
/* 305 */             float f18 = arrayOfFloat5[(i27 * i23)];
/* 306 */             float f19 = arrayOfFloat5[(i27 * i23 + 1)];
/* 307 */             arrayOfFloat4[(i26 - 1 - i28)] = ((f14 - f16) * f18 - (f15 - f17) * f19);
/* 308 */             arrayOfFloat4[(i26 - 3 - i28)] = ((f15 - f17) * f18 + (f14 - f16) * f19);
/*     */           }
/*     */         }
/*     */       }
/*     */       float f9;
/* 312 */       for (i21 = 1; i21 < i17 - 1; i21++) {
/* 313 */         i22 = arrayOfInt[i21];
/* 314 */         if (i21 < i22) {
/* 315 */           i23 = 8 * i21;
/* 316 */           i24 = 8 * i22;
/*     */ 
/* 318 */           f9 = arrayOfFloat4[(i23 + 1)];
/* 319 */           arrayOfFloat4[(i23 + 1)] = arrayOfFloat4[(i24 + 1)];
/* 320 */           arrayOfFloat4[(i24 + 1)] = f9;
/* 321 */           f9 = arrayOfFloat4[(i23 + 3)];
/* 322 */           arrayOfFloat4[(i23 + 3)] = arrayOfFloat4[(i24 + 3)];
/* 323 */           arrayOfFloat4[(i24 + 3)] = f9;
/* 324 */           f9 = arrayOfFloat4[(i23 + 5)];
/* 325 */           arrayOfFloat4[(i23 + 5)] = arrayOfFloat4[(i24 + 5)];
/* 326 */           arrayOfFloat4[(i24 + 5)] = f9;
/* 327 */           f9 = arrayOfFloat4[(i23 + 7)];
/* 328 */           arrayOfFloat4[(i23 + 7)] = arrayOfFloat4[(i24 + 7)];
/* 329 */           arrayOfFloat4[(i24 + 7)] = f9;
/*     */         }
/*     */       }
/* 332 */       for (i21 = 0; i21 < i15; i21++) arrayOfFloat4[i21] = arrayOfFloat4[(2 * i21 + 1)];
/* 333 */       for (i21 = 0; i21 < i17; i21++) {
/* 334 */         arrayOfFloat4[(i3 - 1 - 2 * i21)] = arrayOfFloat4[(4 * i21)];
/* 335 */         arrayOfFloat4[(i3 - 2 - 2 * i21)] = arrayOfFloat4[(4 * i21 + 1)];
/* 336 */         arrayOfFloat4[(i3 - i16 - 1 - 2 * i21)] = arrayOfFloat4[(4 * i21 + 2)];
/* 337 */         arrayOfFloat4[(i3 - i16 - 2 - 2 * i21)] = arrayOfFloat4[(4 * i21 + 3)];
/*     */       }
/*     */       float f3;
/* 339 */       for (i21 = 0; i21 < i17; i21++) {
/* 340 */         f3 = arrayOfFloat7[(2 * i21)];
/* 341 */         float f5 = arrayOfFloat7[(2 * i21 + 1)];
/* 342 */         float f7 = arrayOfFloat4[(i15 + 2 * i21)];
/* 343 */         f9 = arrayOfFloat4[(i15 + 2 * i21 + 1)];
/* 344 */         float f11 = arrayOfFloat4[(i3 - 2 - 2 * i21)];
/* 345 */         float f12 = arrayOfFloat4[(i3 - 1 - 2 * i21)];
/* 346 */         float f13 = f5 * (f7 - f11) + f3 * (f9 + f12);
/* 347 */         arrayOfFloat4[(i15 + 2 * i21)] = ((f7 + f11 + f13) * 0.5F);
/* 348 */         arrayOfFloat4[(i3 - 2 - 2 * i21)] = ((f7 + f11 - f13) * 0.5F);
/* 349 */         f13 = f5 * (f9 + f12) - f3 * (f7 - f11);
/* 350 */         arrayOfFloat4[(i15 + 2 * i21 + 1)] = ((f9 - f12 + f13) * 0.5F);
/* 351 */         arrayOfFloat4[(i3 - 1 - 2 * i21)] = ((-f9 + f12 + f13) * 0.5F);
/*     */       }
/* 353 */       for (i21 = 0; i21 < i16; i21++) {
/* 354 */         arrayOfFloat4[i21] = (arrayOfFloat4[(2 * i21 + i15)] * arrayOfFloat6[(2 * i21)] + arrayOfFloat4[(2 * i21 + 1 + i15)] * arrayOfFloat6[(2 * i21 + 1)]);
/* 355 */         arrayOfFloat4[(i15 - 1 - i21)] = (arrayOfFloat4[(2 * i21 + i15)] * arrayOfFloat6[(2 * i21 + 1)] - arrayOfFloat4[(2 * i21 + 1 + i15)] * arrayOfFloat6[(2 * i21)]);
/*     */       }
/* 357 */       for (i21 = 0; i21 < i16; i21++) arrayOfFloat4[(i3 - i16 + i21)] = (-arrayOfFloat4[i21]);
/* 358 */       for (i21 = 0; i21 < i16; i21++) arrayOfFloat4[i21] = arrayOfFloat4[(i16 + i21)];
/* 359 */       for (i21 = 0; i21 < i16; i21++) arrayOfFloat4[(i16 + i21)] = (-arrayOfFloat4[(i16 - i21 - 1)]);
/* 360 */       for (i21 = 0; i21 < i16; i21++) arrayOfFloat4[(i15 + i21)] = arrayOfFloat4[(i3 - i21 - 1)];
/* 361 */       for (i21 = i7; i21 < i8; i21++) {
/* 362 */         f3 = (float)Math.sin((i21 - i7 + 0.5D) / i9 * 0.5D * 3.141592653589793D);
/* 363 */         p[i21] *= (float)Math.sin(1.570796326794897D * f3 * f3);
/*     */       }
/* 365 */       for (i21 = i10; i21 < i11; i21++) {
/* 366 */         f3 = (float)Math.sin((i21 - i10 + 0.5D) / i12 * 0.5D * 3.141592653589793D + 1.570796326794897D);
/* 367 */         p[i21] *= (float)Math.sin(1.570796326794897D * f3 * f3);
/*     */       }
/*     */     }
/* 370 */     float[] arrayOfFloat1 = null;
/* 371 */     if (this.a > 0) {
/* 372 */       i16 = this.a + i3 >> 2;
/* 373 */       arrayOfFloat1 = new float[i16];
/*     */       int i18;
/* 374 */       if (!this.x) {
/* 375 */         for (i17 = 0; i17 < this.h; i17++) {
/* 376 */           i18 = (this.a >> 1) + i17;
/* 377 */           arrayOfFloat1[i17] += this.o[i18];
/*     */         }
/*     */       }
/* 380 */       if (i13 == 0) {
/* 381 */         for (i17 = i7; i17 < i3 >> 1; i17++) {
/* 382 */           i18 = arrayOfFloat1.length - (i3 >> 1) + i17;
/* 383 */           arrayOfFloat1[i18] += p[i17];
/*     */         }
/*     */       }
/*     */     }
/* 387 */     float[] arrayOfFloat2 = this.o;
/* 388 */     this.o = p;
/* 389 */     p = arrayOfFloat2;
/* 390 */     this.a = i3;
/* 391 */     this.h = (i11 - (i3 >> 1));
/* 392 */     this.x = i13;
/* 393 */     return arrayOfFloat1;
/*     */   }
/*     */ 
/*     */   float[] ad(int paramInt)
/*     */   {
/* 198 */     n(this.m[paramInt], 0);
/* 199 */     j();
/* 200 */     int i1 = z(az.l(f.length - 1, (byte)15));
/* 201 */     int i2 = t[i1];
/* 202 */     int i3 = i2 != 0 ? v : u;
/* 203 */     int i4 = 0;
/* 204 */     int i5 = 0;
/* 205 */     if (i2 != 0) {
/* 206 */       i4 = j() != 0 ? 1 : 0;
/* 207 */       i5 = j() != 0 ? 1 : 0;
/*     */     }
/* 209 */     int i6 = i3 >> 1;
/*     */     int i7;
/*     */     int i8;
/*     */     int i9;
/* 213 */     if ((i2 != 0) && (i4 == 0)) {
/* 214 */       i7 = (i3 >> 2) - (u >> 2);
/* 215 */       i8 = (i3 >> 2) + (u >> 2);
/* 216 */       i9 = u >> 1;
/*     */     }
/*     */     else {
/* 219 */       i7 = 0;
/* 220 */       i8 = i6;
/* 221 */       i9 = i3 >> 1;
/*     */     }
/*     */     int i10;
/*     */     int i11;
/*     */     int i12;
/* 226 */     if ((i2 != 0) && (i5 == 0)) {
/* 227 */       i10 = i3 - (i3 >> 2) - (u >> 2);
/* 228 */       i11 = i3 - (i3 >> 2) + (u >> 2);
/* 229 */       i12 = u >> 1;
/*     */     }
/*     */     else {
/* 232 */       i10 = i6;
/* 233 */       i11 = i3;
/* 234 */       i12 = i3 >> 1;
/*     */     }
/* 236 */     b localb = y[f[i1]];
/*     */ 
/* 239 */     int i14 = localb.d;
/* 240 */     int i15 = localb.l[i14];
/* 241 */     int i13 = !e[i15].n() ? 1 : 0;
/*     */ 
/* 243 */     i14 = i13;
/* 244 */     for (i15 = 0; i15 < localb.r; i15++) {
/* 245 */       h localh = b[localb.m[i15]];
/* 246 */       float[] arrayOfFloat3 = p;
/* 247 */       localh.r(arrayOfFloat3, i3 >> 1, i14);
/*     */     }
/*     */     int i16;
/* 250 */     if (i13 == 0) {
/* 251 */       i15 = localb.d;
/* 252 */       i16 = localb.l[i15];
/* 253 */       e[i16].j(p, i3 >> 1);
/*     */     }
/*     */     int i17;
/* 256 */     if (i13 != 0) {
/* 257 */       for (i15 = i3 >> 1; i15 < i3; i15++) p[i15] = 0.0F; 
/*     */     }
/*     */     else
/*     */     {
/* 260 */       i15 = i3 >> 1;
/* 261 */       i16 = i3 >> 2;
/* 262 */       i17 = i3 >> 3;
/* 263 */       float[] arrayOfFloat4 = p;
/* 264 */       for (int i19 = 0; i19 < i15; i19++) arrayOfFloat4[i19] *= 0.5F;
/* 265 */       for (i19 = i15; i19 < i3; i19++) arrayOfFloat4[i19] = (-arrayOfFloat4[(i3 - i19 - 1)]);
/* 266 */       float[] arrayOfFloat5 = i2 != 0 ? as : ad;
/* 267 */       float[] arrayOfFloat6 = i2 != 0 ? am : ac;
/* 268 */       float[] arrayOfFloat7 = i2 != 0 ? ap : aa;
/* 269 */       int[] arrayOfInt = i2 != 0 ? ak : av;
/*     */       float f1;
/*     */       float f2;
/*     */       float f4;
/*     */       float f6;
/* 270 */       for (int i20 = 0; i20 < i16; i20++) {
/* 271 */         f1 = arrayOfFloat4[(4 * i20)] - arrayOfFloat4[(i3 - 4 * i20 - 1)];
/* 272 */         f2 = arrayOfFloat4[(4 * i20 + 2)] - arrayOfFloat4[(i3 - 4 * i20 - 3)];
/* 273 */         f4 = arrayOfFloat5[(2 * i20)];
/* 274 */         f6 = arrayOfFloat5[(2 * i20 + 1)];
/* 275 */         arrayOfFloat4[(i3 - 4 * i20 - 1)] = (f1 * f4 - f2 * f6);
/* 276 */         arrayOfFloat4[(i3 - 4 * i20 - 3)] = (f1 * f6 + f2 * f4);
/*     */       }
/* 278 */       for (i20 = 0; i20 < i17; i20++) {
/* 279 */         f1 = arrayOfFloat4[(i15 + 3 + 4 * i20)];
/* 280 */         f2 = arrayOfFloat4[(i15 + 1 + 4 * i20)];
/* 281 */         f4 = arrayOfFloat4[(4 * i20 + 3)];
/* 282 */         f6 = arrayOfFloat4[(4 * i20 + 1)];
/* 283 */         arrayOfFloat4[(i15 + 3 + 4 * i20)] = (f1 + f4);
/* 284 */         arrayOfFloat4[(i15 + 1 + 4 * i20)] = (f2 + f6);
/* 285 */         float f8 = arrayOfFloat5[(i15 - 4 - 4 * i20)];
/* 286 */         float f10 = arrayOfFloat5[(i15 - 3 - 4 * i20)];
/* 287 */         arrayOfFloat4[(4 * i20 + 3)] = ((f1 - f4) * f8 - (f2 - f6) * f10);
/* 288 */         arrayOfFloat4[(4 * i20 + 1)] = ((f2 - f6) * f8 + (f1 - f4) * f10);
/*     */       }
/* 290 */       i20 = az.l(i3 - 1, (byte)50);
/*     */       int i22;
/*     */       int i23;
/*     */       int i24;
/* 291 */       for (int i21 = 0; i21 < i20 - 3; i21++) {
/* 292 */         i22 = i3 >> i21 + 2;
/* 293 */         i23 = 8 << i21;
/* 294 */         for (i24 = 0; i24 < 2 << i21; i24++) {
/* 295 */           int i25 = i3 - i22 * 2 * i24;
/* 296 */           int i26 = i3 - i22 * (2 * i24 + 1);
/* 297 */           for (int i27 = 0; i27 < i3 >> i21 + 4; i27++) {
/* 298 */             int i28 = 4 * i27;
/* 299 */             float f14 = arrayOfFloat4[(i25 - 1 - i28)];
/* 300 */             float f15 = arrayOfFloat4[(i25 - 3 - i28)];
/* 301 */             float f16 = arrayOfFloat4[(i26 - 1 - i28)];
/* 302 */             float f17 = arrayOfFloat4[(i26 - 3 - i28)];
/* 303 */             arrayOfFloat4[(i25 - 1 - i28)] = (f14 + f16);
/* 304 */             arrayOfFloat4[(i25 - 3 - i28)] = (f15 + f17);
/* 305 */             float f18 = arrayOfFloat5[(i27 * i23)];
/* 306 */             float f19 = arrayOfFloat5[(i27 * i23 + 1)];
/* 307 */             arrayOfFloat4[(i26 - 1 - i28)] = ((f14 - f16) * f18 - (f15 - f17) * f19);
/* 308 */             arrayOfFloat4[(i26 - 3 - i28)] = ((f15 - f17) * f18 + (f14 - f16) * f19);
/*     */           }
/*     */         }
/*     */       }
/*     */       float f9;
/* 312 */       for (i21 = 1; i21 < i17 - 1; i21++) {
/* 313 */         i22 = arrayOfInt[i21];
/* 314 */         if (i21 < i22) {
/* 315 */           i23 = 8 * i21;
/* 316 */           i24 = 8 * i22;
/*     */ 
/* 318 */           f9 = arrayOfFloat4[(i23 + 1)];
/* 319 */           arrayOfFloat4[(i23 + 1)] = arrayOfFloat4[(i24 + 1)];
/* 320 */           arrayOfFloat4[(i24 + 1)] = f9;
/* 321 */           f9 = arrayOfFloat4[(i23 + 3)];
/* 322 */           arrayOfFloat4[(i23 + 3)] = arrayOfFloat4[(i24 + 3)];
/* 323 */           arrayOfFloat4[(i24 + 3)] = f9;
/* 324 */           f9 = arrayOfFloat4[(i23 + 5)];
/* 325 */           arrayOfFloat4[(i23 + 5)] = arrayOfFloat4[(i24 + 5)];
/* 326 */           arrayOfFloat4[(i24 + 5)] = f9;
/* 327 */           f9 = arrayOfFloat4[(i23 + 7)];
/* 328 */           arrayOfFloat4[(i23 + 7)] = arrayOfFloat4[(i24 + 7)];
/* 329 */           arrayOfFloat4[(i24 + 7)] = f9;
/*     */         }
/*     */       }
/* 332 */       for (i21 = 0; i21 < i15; i21++) arrayOfFloat4[i21] = arrayOfFloat4[(2 * i21 + 1)];
/* 333 */       for (i21 = 0; i21 < i17; i21++) {
/* 334 */         arrayOfFloat4[(i3 - 1 - 2 * i21)] = arrayOfFloat4[(4 * i21)];
/* 335 */         arrayOfFloat4[(i3 - 2 - 2 * i21)] = arrayOfFloat4[(4 * i21 + 1)];
/* 336 */         arrayOfFloat4[(i3 - i16 - 1 - 2 * i21)] = arrayOfFloat4[(4 * i21 + 2)];
/* 337 */         arrayOfFloat4[(i3 - i16 - 2 - 2 * i21)] = arrayOfFloat4[(4 * i21 + 3)];
/*     */       }
/*     */       float f3;
/* 339 */       for (i21 = 0; i21 < i17; i21++) {
/* 340 */         f3 = arrayOfFloat7[(2 * i21)];
/* 341 */         float f5 = arrayOfFloat7[(2 * i21 + 1)];
/* 342 */         float f7 = arrayOfFloat4[(i15 + 2 * i21)];
/* 343 */         f9 = arrayOfFloat4[(i15 + 2 * i21 + 1)];
/* 344 */         float f11 = arrayOfFloat4[(i3 - 2 - 2 * i21)];
/* 345 */         float f12 = arrayOfFloat4[(i3 - 1 - 2 * i21)];
/* 346 */         float f13 = f5 * (f7 - f11) + f3 * (f9 + f12);
/* 347 */         arrayOfFloat4[(i15 + 2 * i21)] = ((f7 + f11 + f13) * 0.5F);
/* 348 */         arrayOfFloat4[(i3 - 2 - 2 * i21)] = ((f7 + f11 - f13) * 0.5F);
/* 349 */         f13 = f5 * (f9 + f12) - f3 * (f7 - f11);
/* 350 */         arrayOfFloat4[(i15 + 2 * i21 + 1)] = ((f9 - f12 + f13) * 0.5F);
/* 351 */         arrayOfFloat4[(i3 - 1 - 2 * i21)] = ((-f9 + f12 + f13) * 0.5F);
/*     */       }
/* 353 */       for (i21 = 0; i21 < i16; i21++) {
/* 354 */         arrayOfFloat4[i21] = (arrayOfFloat4[(2 * i21 + i15)] * arrayOfFloat6[(2 * i21)] + arrayOfFloat4[(2 * i21 + 1 + i15)] * arrayOfFloat6[(2 * i21 + 1)]);
/* 355 */         arrayOfFloat4[(i15 - 1 - i21)] = (arrayOfFloat4[(2 * i21 + i15)] * arrayOfFloat6[(2 * i21 + 1)] - arrayOfFloat4[(2 * i21 + 1 + i15)] * arrayOfFloat6[(2 * i21)]);
/*     */       }
/* 357 */       for (i21 = 0; i21 < i16; i21++) arrayOfFloat4[(i3 - i16 + i21)] = (-arrayOfFloat4[i21]);
/* 358 */       for (i21 = 0; i21 < i16; i21++) arrayOfFloat4[i21] = arrayOfFloat4[(i16 + i21)];
/* 359 */       for (i21 = 0; i21 < i16; i21++) arrayOfFloat4[(i16 + i21)] = (-arrayOfFloat4[(i16 - i21 - 1)]);
/* 360 */       for (i21 = 0; i21 < i16; i21++) arrayOfFloat4[(i15 + i21)] = arrayOfFloat4[(i3 - i21 - 1)];
/* 361 */       for (i21 = i7; i21 < i8; i21++) {
/* 362 */         f3 = (float)Math.sin((i21 - i7 + 0.5D) / i9 * 0.5D * 3.141592653589793D);
/* 363 */         p[i21] *= (float)Math.sin(1.570796326794897D * f3 * f3);
/*     */       }
/* 365 */       for (i21 = i10; i21 < i11; i21++) {
/* 366 */         f3 = (float)Math.sin((i21 - i10 + 0.5D) / i12 * 0.5D * 3.141592653589793D + 1.570796326794897D);
/* 367 */         p[i21] *= (float)Math.sin(1.570796326794897D * f3 * f3);
/*     */       }
/*     */     }
/* 370 */     float[] arrayOfFloat1 = null;
/* 371 */     if (this.a > 0) {
/* 372 */       i16 = this.a + i3 >> 2;
/* 373 */       arrayOfFloat1 = new float[i16];
/*     */       int i18;
/* 374 */       if (!this.x) {
/* 375 */         for (i17 = 0; i17 < this.h; i17++) {
/* 376 */           i18 = (this.a >> 1) + i17;
/* 377 */           arrayOfFloat1[i17] += this.o[i18];
/*     */         }
/*     */       }
/* 380 */       if (i13 == 0) {
/* 381 */         for (i17 = i7; i17 < i3 >> 1; i17++) {
/* 382 */           i18 = arrayOfFloat1.length - (i3 >> 1) + i17;
/* 383 */           arrayOfFloat1[i18] += p[i17];
/*     */         }
/*     */       }
/*     */     }
/* 387 */     float[] arrayOfFloat2 = this.o;
/* 388 */     this.o = p;
/* 389 */     p = arrayOfFloat2;
/* 390 */     this.a = i3;
/* 391 */     this.h = (i11 - (i3 >> 1));
/* 392 */     this.x = i13;
/* 393 */     return arrayOfFloat1;
/*     */   }
/*     */ 
/*     */   static dt ac(ch paramch, int paramInt1, int paramInt2)
/*     */   {
/* 407 */     if (!s(paramch)) {
/* 408 */       paramch.c(paramInt1, paramInt2, -1345110292);
/* 409 */       return null;
/*     */     }
/* 411 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 1155098771);
/* 412 */     if (arrayOfByte == null) return null;
/* 413 */     return new dt(arrayOfByte);
/*     */   }
/*     */ 
/*     */   static dt aa(ch paramch, int paramInt1, int paramInt2)
/*     */   {
/* 407 */     if (!s(paramch)) {
/* 408 */       paramch.c(paramInt1, paramInt2, -1010357844);
/* 409 */       return null;
/*     */     }
/* 411 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 1574943811);
/* 412 */     if (arrayOfByte == null) return null;
/* 413 */     return new dt(arrayOfByte);
/*     */   }
/*     */ 
/*     */   static dt as(ch paramch, int paramInt1, int paramInt2)
/*     */   {
/* 407 */     if (!s(paramch)) {
/* 408 */       paramch.c(paramInt1, paramInt2, 792961355);
/* 409 */       return null;
/*     */     }
/* 411 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 1846845009);
/* 412 */     if (arrayOfByte == null) return null;
/* 413 */     return new dt(arrayOfByte);
/*     */   }
/*     */ 
/*     */   static int z(int paramInt)
/*     */   {
/*  69 */     int i1 = 0;
/*  70 */     int i2 = 0;
/*     */     int i3;
/*  71 */     while (paramInt >= 8 - s) {
/*  72 */       i3 = 8 - s;
/*  73 */       int i4 = (1 << i3) - 1;
/*  74 */       i1 += ((q[i] >> s & i4) << i2);
/*  75 */       s = 0;
/*  76 */       i += 1;
/*  77 */       i2 += i3;
/*  78 */       paramInt -= i3;
/*     */     }
/*  80 */     if (paramInt > 0) {
/*  81 */       i3 = (1 << paramInt) - 1;
/*  82 */       i1 += ((q[i] >> s & i3) << i2);
/*  83 */       s += paramInt;
/*     */     }
/*  85 */     return i1;
/*     */   }
/*     */ 
/*     */   eq ap(int[] paramArrayOfInt)
/*     */   {
/* 421 */     if ((paramArrayOfInt != null) && (paramArrayOfInt[0] <= 0)) return null;
/* 422 */     if (this.az == null) {
/* 423 */       this.a = 0;
/* 424 */       this.o = new float[v];
/* 425 */       this.az = new byte[this.n];
/* 426 */       this.an = 0;
/* 427 */       this.ah = 0;
/*     */     }
/* 429 */     while (this.ah < this.m.length) {
/* 430 */       if ((paramArrayOfInt != null) && (paramArrayOfInt[0] <= 0)) return null;
/* 431 */       localObject = i(this.ah);
/* 432 */       if (localObject != null) {
/* 433 */         int i1 = this.an;
/* 434 */         int i2 = localObject.length;
/* 435 */         if (i2 > this.n - i1) i2 = this.n - i1;
/* 436 */         for (int i3 = 0; i3 < i2; i3++) {
/* 437 */           int i4 = (int)(128.0F + localObject[i3] * 128.0F);
/* 438 */           if ((i4 & 0xFFFFFF00) != 0) i4 = (i4 ^ 0xFFFFFFFF) >> 31;
/* 439 */           this.az[(i1++)] = ((byte)(i4 - 128));
/*     */         }
/* 441 */         if (paramArrayOfInt != null) paramArrayOfInt[0] -= i1 - this.an;
/* 442 */         this.an = i1;
/*     */       }
/* 444 */       this.ah += 1;
/*     */     }
/* 446 */     this.o = null;
/* 447 */     Object localObject = this.az;
/* 448 */     this.az = null;
/* 449 */     return new eq(this.c, (byte[])localObject, this.j, this.z, this.g);
/*     */   }
/*     */ 
/*     */   eq av(int[] paramArrayOfInt)
/*     */   {
/* 421 */     if ((paramArrayOfInt != null) && (paramArrayOfInt[0] <= 0)) return null;
/* 422 */     if (this.az == null) {
/* 423 */       this.a = 0;
/* 424 */       this.o = new float[v];
/* 425 */       this.az = new byte[this.n];
/* 426 */       this.an = 0;
/* 427 */       this.ah = 0;
/*     */     }
/* 429 */     while (this.ah < this.m.length) {
/* 430 */       if ((paramArrayOfInt != null) && (paramArrayOfInt[0] <= 0)) return null;
/* 431 */       localObject = i(this.ah);
/* 432 */       if (localObject != null) {
/* 433 */         int i1 = this.an;
/* 434 */         int i2 = localObject.length;
/* 435 */         if (i2 > this.n - i1) i2 = this.n - i1;
/* 436 */         for (int i3 = 0; i3 < i2; i3++) {
/* 437 */           int i4 = (int)(128.0F + localObject[i3] * 128.0F);
/* 438 */           if ((i4 & 0xFFFFFF00) != 0) i4 = (i4 ^ 0xFFFFFFFF) >> 31;
/* 439 */           this.az[(i1++)] = ((byte)(i4 - 128));
/*     */         }
/* 441 */         if (paramArrayOfInt != null) paramArrayOfInt[0] -= i1 - this.an;
/* 442 */         this.an = i1;
/*     */       }
/* 444 */       this.ah += 1;
/*     */     }
/* 446 */     this.o = null;
/* 447 */     Object localObject = this.az;
/* 448 */     this.az = null;
/* 449 */     return new eq(this.c, (byte[])localObject, this.j, this.z, this.g);
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     dt
 * JD-Core Version:    0.6.2
 */