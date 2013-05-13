/*     */ public final class bu
/*     */ {
/*     */   static final int n = 6;
/*     */   static final int d = 16;
/*     */   static final int l = 23;
/*     */   static final int m = 0;
/*     */   static final int r = 4096;
/*  13 */   static bg z = new bg();
/*     */   static final int j = 50;
/*     */   static final int c = 1;
/*     */ 
/*     */   static void z(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 495 */     int i = 0;
/* 496 */     for (int k = paramInt1; k <= paramInt2; k++) {
/* 497 */       for (int i1 = 0; i1 < paramInt3; i1++) {
/* 498 */         if (paramArrayOfByte[i1] == k) {
/* 499 */           paramArrayOfInt3[i] = i1;
/* 500 */           i++;
/*     */         }
/*     */       }
/*     */     }
/* 504 */     for (k = 0; k < 23; k++) paramArrayOfInt2[k] = 0;
/* 505 */     for (k = 0; k < paramInt3; k++) paramArrayOfInt2[(paramArrayOfByte[k] + 1)] += 1;
/* 506 */     for (k = 1; k < 23; k++) paramArrayOfInt2[k] += paramArrayOfInt2[(k - 1)];
/* 507 */     for (k = 0; k < 23; k++) paramArrayOfInt1[k] = 0;
/* 508 */     int i2 = 0;
/* 509 */     for (k = paramInt1; k <= paramInt2; k++) {
/* 510 */       i2 += paramArrayOfInt2[(k + 1)] - paramArrayOfInt2[k];
/* 511 */       paramArrayOfInt1[k] = (i2 - 1);
/* 512 */       i2 <<= 1;
/*     */     }
/* 514 */     for (k = paramInt1 + 1; k <= paramInt2; k++)
/* 515 */       paramArrayOfInt2[k] = ((paramArrayOfInt1[(k - 1)] + 1 << 1) - paramArrayOfInt2[k]);
/*     */   }
/*     */ 
/*     */   public static int r(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     synchronized (z) {
/*  21 */       z.j = paramArrayOfByte2;
/*  22 */       z.z = (paramInt3 * 2027524795);
/*  23 */       z.q = paramArrayOfByte1;
/*  24 */       z.i = 0;
/*  25 */       z.s = (paramInt1 * -30159071);
/*  26 */       z.b = 0;
/*  27 */       z.e = 0;
/*  28 */       z.g = 0;
/*  29 */       z.u = 0;
/*  30 */       l(z);
/*  31 */       paramInt1 -= z.s * 320632033;
/*  32 */       z.j = null;
/*  33 */       z.q = null;
/*  34 */       return paramInt1;
/*     */     }
/*     */   }
/*     */ 
/*     */   static void d(bg parambg)
/*     */   {
/*  40 */     byte b = parambg.v;
/*  41 */     int k = parambg.w * 1570830361;
/*  42 */     int i1 = parambg.a * -441027967;
/*  43 */     int i2 = parambg.k * -1946535507;
/*  44 */     int[] arrayOfInt = bg.x;
/*  45 */     int i3 = parambg.f * 362661199;
/*  46 */     byte[] arrayOfByte = parambg.q;
/*  47 */     int i4 = parambg.i * -1924064507;
/*  48 */     int i5 = parambg.s * 320632033;
/*  49 */     int i6 = i5;
/*  50 */     int i7 = parambg.al * -759384805 + 1;
/*     */     while (true)
/*     */     {
/*  53 */       if (k > 0) {
/*     */         while (true) {
/*  55 */           if (i5 == 0) break label428;
/*  56 */           if (k == 1) break;
/*  57 */           arrayOfByte[i4] = b;
/*  58 */           k--;
/*  59 */           i4++;
/*  60 */           i5--;
/*     */         }
/*  62 */         if (i5 == 0) {
/*  63 */           k = 1;
/*  64 */           break;
/*     */         }
/*  66 */         arrayOfByte[i4] = b;
/*  67 */         i4++;
/*  68 */         i5--;
/*     */       }
/*  70 */       int i9 = 1;
/*  71 */       while (i9 != 0) {
/*  72 */         i9 = 0;
/*  73 */         if (i1 == i7) {
/*  74 */           k = 0;
/*  75 */           break label428;
/*     */         }
/*  77 */         b = (byte)i2;
/*  78 */         i3 = arrayOfInt[i3];
/*  79 */         i = (byte)(i3 & 0xFF);
/*  80 */         i3 >>= 8;
/*  81 */         i1++;
/*  82 */         if (i != i2) {
/*  83 */           i2 = i;
/*  84 */           if (i5 == 0) {
/*  85 */             k = 1;
/*  86 */             break label428;
/*     */           }
/*  88 */           arrayOfByte[i4] = b;
/*  89 */           i4++;
/*  90 */           i5--;
/*  91 */           i9 = 1;
/*     */         }
/*  94 */         else if (i1 == i7) {
/*  95 */           if (i5 == 0) {
/*  96 */             k = 1;
/*  97 */             break label428;
/*     */           }
/*  99 */           arrayOfByte[i4] = b;
/* 100 */           i4++;
/* 101 */           i5--;
/* 102 */           i9 = 1;
/*     */         }
/*     */       }
/*     */ 
/* 106 */       k = 2;
/* 107 */       i3 = arrayOfInt[i3];
/* 108 */       int i = (byte)(i3 & 0xFF);
/* 109 */       i3 >>= 8;
/* 110 */       i1++;
/* 111 */       if (i1 != i7)
/* 112 */         if (i != i2) {
/* 113 */           i2 = i;
/*     */         }
/*     */         else
/*     */         {
/* 117 */           k = 3;
/* 118 */           i3 = arrayOfInt[i3];
/* 119 */           i = (byte)(i3 & 0xFF);
/* 120 */           i3 >>= 8;
/* 121 */           i1++;
/* 122 */           if (i1 != i7)
/* 123 */             if (i != i2) {
/* 124 */               i2 = i;
/*     */             }
/*     */             else
/*     */             {
/* 128 */               i3 = arrayOfInt[i3];
/* 129 */               i = (byte)(i3 & 0xFF);
/* 130 */               i3 >>= 8;
/* 131 */               i1++;
/* 132 */               k = (i & 0xFF) + 4;
/* 133 */               i3 = arrayOfInt[i3];
/* 134 */               i2 = (byte)(i3 & 0xFF);
/* 135 */               i3 >>= 8;
/* 136 */               i1++;
/*     */             } 
/*     */         }
/*     */     }
/* 138 */     label428: int i8 = parambg.u * -977270285;
/* 139 */     parambg.u += (i6 - i5) * -1021593797;
/* 140 */     if (parambg.u * -977270285 < i8);
/* 141 */     parambg.v = b;
/* 142 */     parambg.w = (k * 378725417);
/* 143 */     parambg.a = (i1 * -404763263);
/* 144 */     parambg.k = (i2 * -1076522459);
/* 145 */     bg.x = arrayOfInt;
/* 146 */     parambg.f = (i3 * 519975343);
/* 147 */     parambg.q = arrayOfByte;
/* 148 */     parambg.i = (i4 * -1045923379);
/* 149 */     parambg.s = (i5 * -30159071);
/*     */   }
/*     */ 
/*     */   static void l(bg parambg)
/*     */   {
/* 156 */     int i2 = 0;
/* 157 */     int i3 = 0;
/* 158 */     int i4 = 0;
/* 159 */     int i5 = 0;
/* 160 */     int i6 = 0;
/* 161 */     int i7 = 0;
/* 162 */     int i8 = 0;
/* 163 */     int i9 = 0;
/* 164 */     int i10 = 0;
/* 165 */     int i11 = 0;
/* 166 */     int i12 = 0;
/* 167 */     int i13 = 0;
/* 168 */     int i14 = 0;
/* 169 */     int i15 = 0;
/* 170 */     int i16 = 0;
/* 171 */     int i17 = 0;
/* 172 */     int i18 = 0;
/* 173 */     int i19 = 0;
/* 174 */     int i20 = 0;
/* 175 */     int[] arrayOfInt1 = null;
/* 176 */     int[] arrayOfInt2 = null;
/* 177 */     int[] arrayOfInt3 = null;
/* 178 */     parambg.y = -141419677;
/* 179 */     if (bg.x == null) bg.x = new int[parambg.y * 1024274656];
/* 180 */     int i21 = 1;
/* 181 */     while (i21 != 0) {
/* 182 */       int i = m(parambg);
/* 183 */       if (i == 23) return;
/* 184 */       i = m(parambg);
/* 185 */       i = m(parambg);
/* 186 */       i = m(parambg);
/* 187 */       i = m(parambg);
/* 188 */       i = m(parambg);
/* 189 */       i = m(parambg);
/* 190 */       i = m(parambg);
/* 191 */       i = m(parambg);
/* 192 */       i = m(parambg);
/* 193 */       i = c(parambg);
/* 194 */       if (i != 0);
/* 196 */       parambg.t = 0;
/* 197 */       i = m(parambg);
/* 198 */       parambg.t = ((parambg.t * 1897549315 << 8 | i & 0xFF) * 907496619);
/* 199 */       i = m(parambg);
/* 200 */       parambg.t = ((parambg.t * 1897549315 << 8 | i & 0xFF) * 907496619);
/* 201 */       i = m(parambg);
/* 202 */       parambg.t = ((parambg.t * 1897549315 << 8 | i & 0xFF) * 907496619);
/* 203 */       for (i2 = 0; i2 < 16; i2++) {
/* 204 */         i = c(parambg);
/* 205 */         if (i == 1) parambg.ac[i2] = true; else
/* 206 */           parambg.ac[i2] = false;
/*     */       }
/* 208 */       for (i2 = 0; i2 < 256; i2++) parambg.ad[i2] = false;
/* 209 */       for (i2 = 0; i2 < 16; i2++) {
/* 210 */         if (parambg.ac[i2] != 0) {
/* 211 */           for (i3 = 0; i3 < 16; i3++) {
/* 212 */             i = c(parambg);
/* 213 */             if (i == 1) parambg.ad[(i2 * 16 + i3)] = true;
/*     */           }
/*     */         }
/*     */       }
/* 217 */       j(parambg);
/* 218 */       i5 = parambg.p * 522817017 + 2;
/* 219 */       i6 = n(3, parambg);
/* 220 */       i7 = n(15, parambg);
/* 221 */       for (i2 = 0; i2 < i7; i2++) {
/* 222 */         i3 = 0;
/*     */         while (true) {
/* 224 */           i = c(parambg);
/* 225 */           if (i == 0) break;
/* 226 */           i3++;
/*     */         }
/* 228 */         parambg.av[i2] = ((byte)i3);
/*     */       }
/*     */ 
/* 231 */       byte[] arrayOfByte = new byte[6];
/*     */ 
/* 234 */       for (int i24 = 0; i24 < i6; i24 = (byte)(i24 + 1)) arrayOfByte[i24] = i24;
/*     */       int i23;
/* 235 */       for (i2 = 0; i2 < i7; i2++) {
/* 236 */         i24 = parambg.av[i2];
/* 237 */         i23 = arrayOfByte[i24];
/* 238 */         while (i24 > 0) {
/* 239 */           arrayOfByte[i24] = arrayOfByte[(i24 - 1)];
/* 240 */           i24 = (byte)(i24 - 1);
/*     */         }
/* 242 */         arrayOfByte[0] = i23;
/* 243 */         parambg.ap[i2] = i23;
/*     */       }
/*     */ 
/* 246 */       for (i4 = 0; i4 < i6; i4++) {
/* 247 */         i15 = n(5, parambg);
/* 248 */         for (i2 = 0; i2 < i5; i2++) {
/*     */           while (true) {
/* 250 */             i = c(parambg);
/* 251 */             if (i == 0) break;
/* 252 */             i = c(parambg);
/* 253 */             if (i == 0) i15++; else
/* 254 */               i15--;
/*     */           }
/* 256 */           parambg.ak[i4][i2] = ((byte)i15);
/*     */         }
/*     */       }
/* 259 */       for (i4 = 0; i4 < i6; i4++) {
/* 260 */         int k = 32;
/* 261 */         int i1 = 0;
/* 262 */         for (i2 = 0; i2 < i5; i2++) {
/* 263 */           if (parambg.ak[i4][i2] > i1) i1 = parambg.ak[i4][i2];
/* 264 */           if (parambg.ak[i4][i2] < k) k = parambg.ak[i4][i2];
/*     */         }
/* 266 */         z(parambg.az[i4], parambg.an[i4], parambg.ah[i4], parambg.ak[i4], k, i1, i5);
/* 267 */         parambg.ay[i4] = k;
/*     */       }
/* 269 */       i8 = parambg.p * 522817017 + 1;
/* 270 */       i9 = -1;
/* 271 */       i10 = 0;
/* 272 */       for (i2 = 0; i2 <= 255; i2++) parambg.o[i2] = 0;
/*     */ 
/* 277 */       i24 = 4095;
/* 278 */       for (int i22 = 15; i22 >= 0; i22--) {
/* 279 */         for (i23 = 15; i23 >= 0; i23--) {
/* 280 */           parambg.as[i24] = ((byte)(i22 * 16 + i23));
/* 281 */           i24--;
/*     */         }
/* 283 */         parambg.am[i22] = (i24 + 1);
/*     */       }
/*     */ 
/* 286 */       i12 = 0;
/* 287 */       if (i10 == 0) {
/* 288 */         i9++;
/* 289 */         i10 = 50;
/* 290 */         i19 = parambg.ap[i9];
/* 291 */         i20 = parambg.ay[i19];
/* 292 */         arrayOfInt1 = parambg.az[i19];
/* 293 */         arrayOfInt3 = parambg.ah[i19];
/* 294 */         arrayOfInt2 = parambg.an[i19];
/*     */       }
/* 296 */       i10--;
/* 297 */       i16 = i20;
/* 298 */       i17 = n(i16, parambg);
/*     */ 
/* 300 */       while (i17 > arrayOfInt1[i16]) {
/* 301 */         i16++;
/* 302 */         i18 = c(parambg);
/* 303 */         i17 = i17 << 1 | i18;
/*     */       }
/* 305 */       i11 = arrayOfInt3[(i17 - arrayOfInt2[i16])];
/*     */ 
/* 307 */       while (i11 != i8) {
/* 308 */         if ((i11 == 0) || (i11 == 1)) {
/* 309 */           i13 = -1;
/* 310 */           i14 = 1;
/*     */           do {
/* 312 */             if (i11 == 0) i13 += 1 * i14;
/* 313 */             else if (i11 == 1) i13 += 2 * i14;
/* 314 */             i14 *= 2;
/* 315 */             if (i10 == 0) {
/* 316 */               i9++;
/* 317 */               i10 = 50;
/* 318 */               i19 = parambg.ap[i9];
/* 319 */               i20 = parambg.ay[i19];
/* 320 */               arrayOfInt1 = parambg.az[i19];
/* 321 */               arrayOfInt3 = parambg.ah[i19];
/* 322 */               arrayOfInt2 = parambg.an[i19];
/*     */             }
/* 324 */             i10--;
/* 325 */             i16 = i20;
/* 326 */             i17 = n(i16, parambg);
/*     */ 
/* 328 */             while (i17 > arrayOfInt1[i16]) {
/* 329 */               i16++;
/* 330 */               i18 = c(parambg);
/* 331 */               i17 = i17 << 1 | i18;
/*     */             }
/* 333 */             i11 = arrayOfInt3[(i17 - arrayOfInt2[i16])];
/* 334 */           }while ((i11 == 0) || (i11 == 1));
/* 335 */           i13++;
/* 336 */           i = parambg.aa[(parambg.as[parambg.am[0]] & 0xFF)];
/* 337 */           parambg.o[(i & 0xFF)] += i13;
/* 338 */           while (i13 > 0) {
/* 339 */             bg.x[i12] = (i & 0xFF);
/* 340 */             i12++;
/* 341 */             i13--;
/*     */           }
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/* 354 */           int i28 = i11 - 1;
/*     */           int i25;
/* 355 */           if (i28 < 16) {
/* 356 */             i25 = parambg.am[0];
/* 357 */             i = parambg.as[(i25 + i28)];
/* 358 */             while (i28 > 3) {
/* 359 */               int i29 = i25 + i28;
/* 360 */               parambg.as[i29] = parambg.as[(i29 - 1)];
/* 361 */               parambg.as[(i29 - 1)] = parambg.as[(i29 - 2)];
/* 362 */               parambg.as[(i29 - 2)] = parambg.as[(i29 - 3)];
/* 363 */               parambg.as[(i29 - 3)] = parambg.as[(i29 - 4)];
/* 364 */               i28 -= 4;
/*     */             }
/* 366 */             while (i28 > 0) {
/* 367 */               parambg.as[(i25 + i28)] = parambg.as[(i25 + i28 - 1)];
/* 368 */               i28--;
/*     */             }
/*     */ 
/* 371 */             parambg.as[i25] = i;
/*     */           }
/*     */           else {
/* 374 */             int i26 = i28 / 16;
/* 375 */             int i27 = i28 % 16;
/* 376 */             i25 = parambg.am[i26] + i27;
/* 377 */             i = parambg.as[i25];
/* 378 */             while (i25 > parambg.am[i26]) {
/* 379 */               parambg.as[i25] = parambg.as[(i25 - 1)];
/* 380 */               i25--;
/*     */             }
/* 382 */             parambg.am[i26] += 1;
/* 383 */             while (i26 > 0) {
/* 384 */               parambg.am[i26] -= 1;
/* 385 */               parambg.as[parambg.am[i26]] = parambg.as[(parambg.am[(i26 - 1)] + 16 - 1)];
/* 386 */               i26--;
/*     */             }
/* 388 */             parambg.am[0] -= 1;
/* 389 */             parambg.as[parambg.am[0]] = i;
/* 390 */             if (parambg.am[0] == 0) {
/* 391 */               i24 = 4095;
/* 392 */               for (i22 = 15; i22 >= 0; i22--) {
/* 393 */                 for (i23 = 15; i23 >= 0; i23--) {
/* 394 */                   parambg.as[i24] = parambg.as[(parambg.am[i22] + i23)];
/* 395 */                   i24--;
/*     */                 }
/* 397 */                 parambg.am[i22] = (i24 + 1);
/*     */               }
/*     */             }
/*     */           }
/*     */ 
/* 402 */           parambg.o[(parambg.aa[(i & 0xFF)] & 0xFF)] += 1;
/* 403 */           bg.x[i12] = (parambg.aa[(i & 0xFF)] & 0xFF);
/* 404 */           i12++;
/* 405 */           if (i10 == 0) {
/* 406 */             i9++;
/* 407 */             i10 = 50;
/* 408 */             i19 = parambg.ap[i9];
/* 409 */             i20 = parambg.ay[i19];
/* 410 */             arrayOfInt1 = parambg.az[i19];
/* 411 */             arrayOfInt3 = parambg.ah[i19];
/* 412 */             arrayOfInt2 = parambg.an[i19];
/*     */           }
/* 414 */           i10--;
/* 415 */           i16 = i20;
/* 416 */           i17 = n(i16, parambg);
/*     */ 
/* 418 */           while (i17 > arrayOfInt1[i16]) {
/* 419 */             i16++;
/* 420 */             i18 = c(parambg);
/* 421 */             i17 = i17 << 1 | i18;
/*     */           }
/* 423 */           i11 = arrayOfInt3[(i17 - arrayOfInt2[i16])];
/*     */         }
/*     */       }
/*     */ 
/* 427 */       parambg.w = 0;
/* 428 */       parambg.v = 0;
/* 429 */       parambg.h[0] = 0;
/* 430 */       for (i2 = 1; i2 <= 256; i2++) parambg.h[i2] = parambg.o[(i2 - 1)];
/* 431 */       for (i2 = 1; i2 <= 256; i2++) parambg.h[i2] += parambg.h[(i2 - 1)];
/* 432 */       for (i2 = 0; i2 < i12; i2++) {
/* 433 */         i = (byte)(bg.x[i2] & 0xFF);
/* 434 */         bg.x[parambg.h[(i & 0xFF)]] |= i2 << 8;
/* 435 */         parambg.h[(i & 0xFF)] += 1;
/*     */       }
/* 437 */       parambg.f = ((bg.x[(parambg.t * 1897549315)] >> 8) * 519975343);
/* 438 */       parambg.a = 0;
/* 439 */       parambg.f = (bg.x[(parambg.f * 362661199)] * 519975343);
/* 440 */       parambg.k = ((byte)(parambg.f * 362661199 & 0xFF) * -1076522459);
/*     */ 
/* 442 */       bg localbg = parambg; parambg.f = ((localbg.f * 362661199 >> 8) * 519975343);
/* 443 */       parambg.a += -404763263;
/* 444 */       parambg.al = (i12 * 1251450131);
/* 445 */       d(parambg);
/* 446 */       if ((parambg.a * -441027967 == parambg.al * -759384805 + 1) && (parambg.w * 1570830361 == 0)) i21 = 1; else
/* 447 */         i21 = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   static byte m(bg parambg)
/*     */   {
/* 453 */     return (byte)n(8, parambg);
/*     */   }
/*     */ 
/*     */   static byte c(bg parambg) {
/* 457 */     return (byte)n(1, parambg);
/*     */   }
/*     */ 
/*     */   static int n(int paramInt, bg parambg) {
/*     */     int i;
/*     */     while (true) {
/* 463 */       if (parambg.b * 846407047 >= paramInt)
/*     */       {
/* 465 */         int k = parambg.e * 403083957 >> parambg.b * 846407047 - paramInt & (1 << paramInt) - 1;
/* 466 */         parambg.b -= paramInt * 1952550967;
/* 467 */         i = k;
/* 468 */         break; } parambg.e = ((parambg.e * 403083957 << 8 | parambg.j[(parambg.z * 1301209715)] & 0xFF) * 2015972253);
/* 471 */       parambg.b += -1559461448;
/* 472 */       parambg.z += 2027524795;
/* 473 */       parambg.g += -1547534471;
/* 474 */       if (parambg.g * -1307788599 != 0); } return i;
/*     */   }
/*     */ 
/*     */   static void j(bg parambg)
/*     */   {
/* 481 */     parambg.p = 0;
/* 482 */     for (int i = 0; i < 256; i++)
/* 483 */       if (parambg.ad[i] != 0) {
/* 484 */         parambg.aa[(parambg.p * 522817017)] = ((byte)i);
/* 485 */         parambg.p += -1467243447;
/*     */       }
/*     */   }
/*     */ 
/*     */   bu()
/*     */     throws Throwable
/*     */   {
/*  16 */     throw new Error();
/*     */   }
/*     */ 
/*     */   static int y(int paramInt, bg parambg)
/*     */   {
/*     */     int i;
/*     */     while (true)
/*     */     {
/* 463 */       if (parambg.b * 846407047 >= paramInt)
/*     */       {
/* 465 */         int k = parambg.e * 403083957 >> parambg.b * 846407047 - paramInt & (1 << paramInt) - 1;
/* 466 */         parambg.b -= paramInt * 1952550967;
/* 467 */         i = k;
/* 468 */         break; } parambg.e = ((parambg.e * 403083957 << 8 | parambg.j[(parambg.z * 1301209715)] & 0xFF) * 2015972253);
/* 471 */       parambg.b += -1559461448;
/* 472 */       parambg.z += 2027524795;
/* 473 */       parambg.g += -1547534471;
/* 474 */       if (parambg.g * -1307788599 != 0); } return i;
/*     */   }
/*     */ 
/*     */   public static int q(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     synchronized (z) {
/*  21 */       z.j = paramArrayOfByte2;
/*  22 */       z.z = (paramInt3 * 2027524795);
/*  23 */       z.q = paramArrayOfByte1;
/*  24 */       z.i = 0;
/*  25 */       z.s = (paramInt1 * -30159071);
/*  26 */       z.b = 0;
/*  27 */       z.e = 0;
/*  28 */       z.g = 0;
/*  29 */       z.u = 0;
/*  30 */       l(z);
/*  31 */       paramInt1 -= z.s * 320632033;
/*  32 */       z.j = null;
/*  33 */       z.q = null;
/*  34 */       return paramInt1;
/*     */     }
/*     */   }
/*     */ 
/*     */   static void i(bg parambg)
/*     */   {
/*  40 */     byte b = parambg.v;
/*  41 */     int k = parambg.w * 1570830361;
/*  42 */     int i1 = parambg.a * -441027967;
/*  43 */     int i2 = parambg.k * -1946535507;
/*  44 */     int[] arrayOfInt = bg.x;
/*  45 */     int i3 = parambg.f * 362661199;
/*  46 */     byte[] arrayOfByte = parambg.q;
/*  47 */     int i4 = parambg.i * -1924064507;
/*  48 */     int i5 = parambg.s * 320632033;
/*  49 */     int i6 = i5;
/*  50 */     int i7 = parambg.al * -759384805 + 1;
/*     */     while (true)
/*     */     {
/*  53 */       if (k > 0) {
/*     */         while (true) {
/*  55 */           if (i5 == 0) break label428;
/*  56 */           if (k == 1) break;
/*  57 */           arrayOfByte[i4] = b;
/*  58 */           k--;
/*  59 */           i4++;
/*  60 */           i5--;
/*     */         }
/*  62 */         if (i5 == 0) {
/*  63 */           k = 1;
/*  64 */           break;
/*     */         }
/*  66 */         arrayOfByte[i4] = b;
/*  67 */         i4++;
/*  68 */         i5--;
/*     */       }
/*  70 */       int i9 = 1;
/*  71 */       while (i9 != 0) {
/*  72 */         i9 = 0;
/*  73 */         if (i1 == i7) {
/*  74 */           k = 0;
/*  75 */           break label428;
/*     */         }
/*  77 */         b = (byte)i2;
/*  78 */         i3 = arrayOfInt[i3];
/*  79 */         i = (byte)(i3 & 0xFF);
/*  80 */         i3 >>= 8;
/*  81 */         i1++;
/*  82 */         if (i != i2) {
/*  83 */           i2 = i;
/*  84 */           if (i5 == 0) {
/*  85 */             k = 1;
/*  86 */             break label428;
/*     */           }
/*  88 */           arrayOfByte[i4] = b;
/*  89 */           i4++;
/*  90 */           i5--;
/*  91 */           i9 = 1;
/*     */         }
/*  94 */         else if (i1 == i7) {
/*  95 */           if (i5 == 0) {
/*  96 */             k = 1;
/*  97 */             break label428;
/*     */           }
/*  99 */           arrayOfByte[i4] = b;
/* 100 */           i4++;
/* 101 */           i5--;
/* 102 */           i9 = 1;
/*     */         }
/*     */       }
/*     */ 
/* 106 */       k = 2;
/* 107 */       i3 = arrayOfInt[i3];
/* 108 */       int i = (byte)(i3 & 0xFF);
/* 109 */       i3 >>= 8;
/* 110 */       i1++;
/* 111 */       if (i1 != i7)
/* 112 */         if (i != i2) {
/* 113 */           i2 = i;
/*     */         }
/*     */         else
/*     */         {
/* 117 */           k = 3;
/* 118 */           i3 = arrayOfInt[i3];
/* 119 */           i = (byte)(i3 & 0xFF);
/* 120 */           i3 >>= 8;
/* 121 */           i1++;
/* 122 */           if (i1 != i7)
/* 123 */             if (i != i2) {
/* 124 */               i2 = i;
/*     */             }
/*     */             else
/*     */             {
/* 128 */               i3 = arrayOfInt[i3];
/* 129 */               i = (byte)(i3 & 0xFF);
/* 130 */               i3 >>= 8;
/* 131 */               i1++;
/* 132 */               k = (i & 0xFF) + 4;
/* 133 */               i3 = arrayOfInt[i3];
/* 134 */               i2 = (byte)(i3 & 0xFF);
/* 135 */               i3 >>= 8;
/* 136 */               i1++;
/*     */             } 
/*     */         }
/*     */     }
/* 138 */     label428: int i8 = parambg.u * -977270285;
/* 139 */     parambg.u += (i6 - i5) * -1021593797;
/* 140 */     if (parambg.u * -977270285 < i8);
/* 141 */     parambg.v = b;
/* 142 */     parambg.w = (k * 378725417);
/* 143 */     parambg.a = (i1 * -404763263);
/* 144 */     parambg.k = (i2 * -1076522459);
/* 145 */     bg.x = arrayOfInt;
/* 146 */     parambg.f = (i3 * 519975343);
/* 147 */     parambg.q = arrayOfByte;
/* 148 */     parambg.i = (i4 * -1045923379);
/* 149 */     parambg.s = (i5 * -30159071);
/*     */   }
/*     */ 
/*     */   static void s(bg parambg)
/*     */   {
/*  40 */     byte b = parambg.v;
/*  41 */     int k = parambg.w * 1570830361;
/*  42 */     int i1 = parambg.a * -441027967;
/*  43 */     int i2 = parambg.k * -1946535507;
/*  44 */     int[] arrayOfInt = bg.x;
/*  45 */     int i3 = parambg.f * 362661199;
/*  46 */     byte[] arrayOfByte = parambg.q;
/*  47 */     int i4 = parambg.i * -1924064507;
/*  48 */     int i5 = parambg.s * 320632033;
/*  49 */     int i6 = i5;
/*  50 */     int i7 = parambg.al * -759384805 + 1;
/*     */     while (true)
/*     */     {
/*  53 */       if (k > 0) {
/*     */         while (true) {
/*  55 */           if (i5 == 0) break label428;
/*  56 */           if (k == 1) break;
/*  57 */           arrayOfByte[i4] = b;
/*  58 */           k--;
/*  59 */           i4++;
/*  60 */           i5--;
/*     */         }
/*  62 */         if (i5 == 0) {
/*  63 */           k = 1;
/*  64 */           break;
/*     */         }
/*  66 */         arrayOfByte[i4] = b;
/*  67 */         i4++;
/*  68 */         i5--;
/*     */       }
/*  70 */       int i9 = 1;
/*  71 */       while (i9 != 0) {
/*  72 */         i9 = 0;
/*  73 */         if (i1 == i7) {
/*  74 */           k = 0;
/*  75 */           break label428;
/*     */         }
/*  77 */         b = (byte)i2;
/*  78 */         i3 = arrayOfInt[i3];
/*  79 */         i = (byte)(i3 & 0xFF);
/*  80 */         i3 >>= 8;
/*  81 */         i1++;
/*  82 */         if (i != i2) {
/*  83 */           i2 = i;
/*  84 */           if (i5 == 0) {
/*  85 */             k = 1;
/*  86 */             break label428;
/*     */           }
/*  88 */           arrayOfByte[i4] = b;
/*  89 */           i4++;
/*  90 */           i5--;
/*  91 */           i9 = 1;
/*     */         }
/*  94 */         else if (i1 == i7) {
/*  95 */           if (i5 == 0) {
/*  96 */             k = 1;
/*  97 */             break label428;
/*     */           }
/*  99 */           arrayOfByte[i4] = b;
/* 100 */           i4++;
/* 101 */           i5--;
/* 102 */           i9 = 1;
/*     */         }
/*     */       }
/*     */ 
/* 106 */       k = 2;
/* 107 */       i3 = arrayOfInt[i3];
/* 108 */       int i = (byte)(i3 & 0xFF);
/* 109 */       i3 >>= 8;
/* 110 */       i1++;
/* 111 */       if (i1 != i7)
/* 112 */         if (i != i2) {
/* 113 */           i2 = i;
/*     */         }
/*     */         else
/*     */         {
/* 117 */           k = 3;
/* 118 */           i3 = arrayOfInt[i3];
/* 119 */           i = (byte)(i3 & 0xFF);
/* 120 */           i3 >>= 8;
/* 121 */           i1++;
/* 122 */           if (i1 != i7)
/* 123 */             if (i != i2) {
/* 124 */               i2 = i;
/*     */             }
/*     */             else
/*     */             {
/* 128 */               i3 = arrayOfInt[i3];
/* 129 */               i = (byte)(i3 & 0xFF);
/* 130 */               i3 >>= 8;
/* 131 */               i1++;
/* 132 */               k = (i & 0xFF) + 4;
/* 133 */               i3 = arrayOfInt[i3];
/* 134 */               i2 = (byte)(i3 & 0xFF);
/* 135 */               i3 >>= 8;
/* 136 */               i1++;
/*     */             } 
/*     */         }
/*     */     }
/* 138 */     label428: int i8 = parambg.u * -977270285;
/* 139 */     parambg.u += (i6 - i5) * -1021593797;
/* 140 */     if (parambg.u * -977270285 < i8);
/* 141 */     parambg.v = b;
/* 142 */     parambg.w = (k * 378725417);
/* 143 */     parambg.a = (i1 * -404763263);
/* 144 */     parambg.k = (i2 * -1076522459);
/* 145 */     bg.x = arrayOfInt;
/* 146 */     parambg.f = (i3 * 519975343);
/* 147 */     parambg.q = arrayOfByte;
/* 148 */     parambg.i = (i4 * -1045923379);
/* 149 */     parambg.s = (i5 * -30159071);
/*     */   }
/*     */ 
/*     */   static void u(bg parambg)
/*     */   {
/* 156 */     int i2 = 0;
/* 157 */     int i3 = 0;
/* 158 */     int i4 = 0;
/* 159 */     int i5 = 0;
/* 160 */     int i6 = 0;
/* 161 */     int i7 = 0;
/* 162 */     int i8 = 0;
/* 163 */     int i9 = 0;
/* 164 */     int i10 = 0;
/* 165 */     int i11 = 0;
/* 166 */     int i12 = 0;
/* 167 */     int i13 = 0;
/* 168 */     int i14 = 0;
/* 169 */     int i15 = 0;
/* 170 */     int i16 = 0;
/* 171 */     int i17 = 0;
/* 172 */     int i18 = 0;
/* 173 */     int i19 = 0;
/* 174 */     int i20 = 0;
/* 175 */     int[] arrayOfInt1 = null;
/* 176 */     int[] arrayOfInt2 = null;
/* 177 */     int[] arrayOfInt3 = null;
/* 178 */     parambg.y = -141419677;
/* 179 */     if (bg.x == null) bg.x = new int[parambg.y * 1024274656];
/* 180 */     int i21 = 1;
/* 181 */     while (i21 != 0) {
/* 182 */       int i = m(parambg);
/* 183 */       if (i == 23) return;
/* 184 */       i = m(parambg);
/* 185 */       i = m(parambg);
/* 186 */       i = m(parambg);
/* 187 */       i = m(parambg);
/* 188 */       i = m(parambg);
/* 189 */       i = m(parambg);
/* 190 */       i = m(parambg);
/* 191 */       i = m(parambg);
/* 192 */       i = m(parambg);
/* 193 */       i = c(parambg);
/* 194 */       if (i != 0);
/* 196 */       parambg.t = 0;
/* 197 */       i = m(parambg);
/* 198 */       parambg.t = ((parambg.t * 1897549315 << 8 | i & 0xFF) * 907496619);
/* 199 */       i = m(parambg);
/* 200 */       parambg.t = ((parambg.t * 1897549315 << 8 | i & 0xFF) * 907496619);
/* 201 */       i = m(parambg);
/* 202 */       parambg.t = ((parambg.t * 1897549315 << 8 | i & 0xFF) * 907496619);
/* 203 */       for (i2 = 0; i2 < 16; i2++) {
/* 204 */         i = c(parambg);
/* 205 */         if (i == 1) parambg.ac[i2] = true; else
/* 206 */           parambg.ac[i2] = false;
/*     */       }
/* 208 */       for (i2 = 0; i2 < 256; i2++) parambg.ad[i2] = false;
/* 209 */       for (i2 = 0; i2 < 16; i2++) {
/* 210 */         if (parambg.ac[i2] != 0) {
/* 211 */           for (i3 = 0; i3 < 16; i3++) {
/* 212 */             i = c(parambg);
/* 213 */             if (i == 1) parambg.ad[(i2 * 16 + i3)] = true;
/*     */           }
/*     */         }
/*     */       }
/* 217 */       j(parambg);
/* 218 */       i5 = parambg.p * 522817017 + 2;
/* 219 */       i6 = n(3, parambg);
/* 220 */       i7 = n(15, parambg);
/* 221 */       for (i2 = 0; i2 < i7; i2++) {
/* 222 */         i3 = 0;
/*     */         while (true) {
/* 224 */           i = c(parambg);
/* 225 */           if (i == 0) break;
/* 226 */           i3++;
/*     */         }
/* 228 */         parambg.av[i2] = ((byte)i3);
/*     */       }
/*     */ 
/* 231 */       byte[] arrayOfByte = new byte[6];
/*     */ 
/* 234 */       for (int i24 = 0; i24 < i6; i24 = (byte)(i24 + 1)) arrayOfByte[i24] = i24;
/*     */       int i23;
/* 235 */       for (i2 = 0; i2 < i7; i2++) {
/* 236 */         i24 = parambg.av[i2];
/* 237 */         i23 = arrayOfByte[i24];
/* 238 */         while (i24 > 0) {
/* 239 */           arrayOfByte[i24] = arrayOfByte[(i24 - 1)];
/* 240 */           i24 = (byte)(i24 - 1);
/*     */         }
/* 242 */         arrayOfByte[0] = i23;
/* 243 */         parambg.ap[i2] = i23;
/*     */       }
/*     */ 
/* 246 */       for (i4 = 0; i4 < i6; i4++) {
/* 247 */         i15 = n(5, parambg);
/* 248 */         for (i2 = 0; i2 < i5; i2++) {
/*     */           while (true) {
/* 250 */             i = c(parambg);
/* 251 */             if (i == 0) break;
/* 252 */             i = c(parambg);
/* 253 */             if (i == 0) i15++; else
/* 254 */               i15--;
/*     */           }
/* 256 */           parambg.ak[i4][i2] = ((byte)i15);
/*     */         }
/*     */       }
/* 259 */       for (i4 = 0; i4 < i6; i4++) {
/* 260 */         int k = 32;
/* 261 */         int i1 = 0;
/* 262 */         for (i2 = 0; i2 < i5; i2++) {
/* 263 */           if (parambg.ak[i4][i2] > i1) i1 = parambg.ak[i4][i2];
/* 264 */           if (parambg.ak[i4][i2] < k) k = parambg.ak[i4][i2];
/*     */         }
/* 266 */         z(parambg.az[i4], parambg.an[i4], parambg.ah[i4], parambg.ak[i4], k, i1, i5);
/* 267 */         parambg.ay[i4] = k;
/*     */       }
/* 269 */       i8 = parambg.p * 522817017 + 1;
/* 270 */       i9 = -1;
/* 271 */       i10 = 0;
/* 272 */       for (i2 = 0; i2 <= 255; i2++) parambg.o[i2] = 0;
/*     */ 
/* 277 */       i24 = 4095;
/* 278 */       for (int i22 = 15; i22 >= 0; i22--) {
/* 279 */         for (i23 = 15; i23 >= 0; i23--) {
/* 280 */           parambg.as[i24] = ((byte)(i22 * 16 + i23));
/* 281 */           i24--;
/*     */         }
/* 283 */         parambg.am[i22] = (i24 + 1);
/*     */       }
/*     */ 
/* 286 */       i12 = 0;
/* 287 */       if (i10 == 0) {
/* 288 */         i9++;
/* 289 */         i10 = 50;
/* 290 */         i19 = parambg.ap[i9];
/* 291 */         i20 = parambg.ay[i19];
/* 292 */         arrayOfInt1 = parambg.az[i19];
/* 293 */         arrayOfInt3 = parambg.ah[i19];
/* 294 */         arrayOfInt2 = parambg.an[i19];
/*     */       }
/* 296 */       i10--;
/* 297 */       i16 = i20;
/* 298 */       i17 = n(i16, parambg);
/*     */ 
/* 300 */       while (i17 > arrayOfInt1[i16]) {
/* 301 */         i16++;
/* 302 */         i18 = c(parambg);
/* 303 */         i17 = i17 << 1 | i18;
/*     */       }
/* 305 */       i11 = arrayOfInt3[(i17 - arrayOfInt2[i16])];
/*     */ 
/* 307 */       while (i11 != i8) {
/* 308 */         if ((i11 == 0) || (i11 == 1)) {
/* 309 */           i13 = -1;
/* 310 */           i14 = 1;
/*     */           do {
/* 312 */             if (i11 == 0) i13 += 1 * i14;
/* 313 */             else if (i11 == 1) i13 += 2 * i14;
/* 314 */             i14 *= 2;
/* 315 */             if (i10 == 0) {
/* 316 */               i9++;
/* 317 */               i10 = 50;
/* 318 */               i19 = parambg.ap[i9];
/* 319 */               i20 = parambg.ay[i19];
/* 320 */               arrayOfInt1 = parambg.az[i19];
/* 321 */               arrayOfInt3 = parambg.ah[i19];
/* 322 */               arrayOfInt2 = parambg.an[i19];
/*     */             }
/* 324 */             i10--;
/* 325 */             i16 = i20;
/* 326 */             i17 = n(i16, parambg);
/*     */ 
/* 328 */             while (i17 > arrayOfInt1[i16]) {
/* 329 */               i16++;
/* 330 */               i18 = c(parambg);
/* 331 */               i17 = i17 << 1 | i18;
/*     */             }
/* 333 */             i11 = arrayOfInt3[(i17 - arrayOfInt2[i16])];
/* 334 */           }while ((i11 == 0) || (i11 == 1));
/* 335 */           i13++;
/* 336 */           i = parambg.aa[(parambg.as[parambg.am[0]] & 0xFF)];
/* 337 */           parambg.o[(i & 0xFF)] += i13;
/* 338 */           while (i13 > 0) {
/* 339 */             bg.x[i12] = (i & 0xFF);
/* 340 */             i12++;
/* 341 */             i13--;
/*     */           }
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/* 354 */           int i28 = i11 - 1;
/*     */           int i25;
/* 355 */           if (i28 < 16) {
/* 356 */             i25 = parambg.am[0];
/* 357 */             i = parambg.as[(i25 + i28)];
/* 358 */             while (i28 > 3) {
/* 359 */               int i29 = i25 + i28;
/* 360 */               parambg.as[i29] = parambg.as[(i29 - 1)];
/* 361 */               parambg.as[(i29 - 1)] = parambg.as[(i29 - 2)];
/* 362 */               parambg.as[(i29 - 2)] = parambg.as[(i29 - 3)];
/* 363 */               parambg.as[(i29 - 3)] = parambg.as[(i29 - 4)];
/* 364 */               i28 -= 4;
/*     */             }
/* 366 */             while (i28 > 0) {
/* 367 */               parambg.as[(i25 + i28)] = parambg.as[(i25 + i28 - 1)];
/* 368 */               i28--;
/*     */             }
/*     */ 
/* 371 */             parambg.as[i25] = i;
/*     */           }
/*     */           else {
/* 374 */             int i26 = i28 / 16;
/* 375 */             int i27 = i28 % 16;
/* 376 */             i25 = parambg.am[i26] + i27;
/* 377 */             i = parambg.as[i25];
/* 378 */             while (i25 > parambg.am[i26]) {
/* 379 */               parambg.as[i25] = parambg.as[(i25 - 1)];
/* 380 */               i25--;
/*     */             }
/* 382 */             parambg.am[i26] += 1;
/* 383 */             while (i26 > 0) {
/* 384 */               parambg.am[i26] -= 1;
/* 385 */               parambg.as[parambg.am[i26]] = parambg.as[(parambg.am[(i26 - 1)] + 16 - 1)];
/* 386 */               i26--;
/*     */             }
/* 388 */             parambg.am[0] -= 1;
/* 389 */             parambg.as[parambg.am[0]] = i;
/* 390 */             if (parambg.am[0] == 0) {
/* 391 */               i24 = 4095;
/* 392 */               for (i22 = 15; i22 >= 0; i22--) {
/* 393 */                 for (i23 = 15; i23 >= 0; i23--) {
/* 394 */                   parambg.as[i24] = parambg.as[(parambg.am[i22] + i23)];
/* 395 */                   i24--;
/*     */                 }
/* 397 */                 parambg.am[i22] = (i24 + 1);
/*     */               }
/*     */             }
/*     */           }
/*     */ 
/* 402 */           parambg.o[(parambg.aa[(i & 0xFF)] & 0xFF)] += 1;
/* 403 */           bg.x[i12] = (parambg.aa[(i & 0xFF)] & 0xFF);
/* 404 */           i12++;
/* 405 */           if (i10 == 0) {
/* 406 */             i9++;
/* 407 */             i10 = 50;
/* 408 */             i19 = parambg.ap[i9];
/* 409 */             i20 = parambg.ay[i19];
/* 410 */             arrayOfInt1 = parambg.az[i19];
/* 411 */             arrayOfInt3 = parambg.ah[i19];
/* 412 */             arrayOfInt2 = parambg.an[i19];
/*     */           }
/* 414 */           i10--;
/* 415 */           i16 = i20;
/* 416 */           i17 = n(i16, parambg);
/*     */ 
/* 418 */           while (i17 > arrayOfInt1[i16]) {
/* 419 */             i16++;
/* 420 */             i18 = c(parambg);
/* 421 */             i17 = i17 << 1 | i18;
/*     */           }
/* 423 */           i11 = arrayOfInt3[(i17 - arrayOfInt2[i16])];
/*     */         }
/*     */       }
/*     */ 
/* 427 */       parambg.w = 0;
/* 428 */       parambg.v = 0;
/* 429 */       parambg.h[0] = 0;
/* 430 */       for (i2 = 1; i2 <= 256; i2++) parambg.h[i2] = parambg.o[(i2 - 1)];
/* 431 */       for (i2 = 1; i2 <= 256; i2++) parambg.h[i2] += parambg.h[(i2 - 1)];
/* 432 */       for (i2 = 0; i2 < i12; i2++) {
/* 433 */         i = (byte)(bg.x[i2] & 0xFF);
/* 434 */         bg.x[parambg.h[(i & 0xFF)]] |= i2 << 8;
/* 435 */         parambg.h[(i & 0xFF)] += 1;
/*     */       }
/* 437 */       parambg.f = ((bg.x[(parambg.t * 1897549315)] >> 8) * 519975343);
/* 438 */       parambg.a = 0;
/* 439 */       parambg.f = (bg.x[(parambg.f * 362661199)] * 519975343);
/* 440 */       parambg.k = ((byte)(parambg.f * 362661199 & 0xFF) * -1076522459);
/*     */ 
/* 442 */       bg localbg = parambg; parambg.f = ((localbg.f * 362661199 >> 8) * 519975343);
/* 443 */       parambg.a += -404763263;
/* 444 */       parambg.al = (i12 * 1251450131);
/* 445 */       d(parambg);
/* 446 */       if ((parambg.a * -441027967 == parambg.al * -759384805 + 1) && (parambg.w * 1570830361 == 0)) i21 = 1; else
/* 447 */         i21 = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   static int e(int paramInt, bg parambg)
/*     */   {
/*     */     int i;
/*     */     while (true)
/*     */     {
/* 463 */       if (parambg.b * 846407047 >= paramInt)
/*     */       {
/* 465 */         int k = parambg.e * 403083957 >> parambg.b * 846407047 - paramInt & (1 << paramInt) - 1;
/* 466 */         parambg.b -= paramInt * 1952550967;
/* 467 */         i = k;
/* 468 */         break; } parambg.e = ((parambg.e * 403083957 << 8 | parambg.j[(parambg.z * 1301209715)] & 0xFF) * 2015972253);
/* 471 */       parambg.b += -1559461448;
/* 472 */       parambg.z += 2027524795;
/* 473 */       parambg.g += -1547534471;
/* 474 */       if (parambg.g * -1307788599 != 0); } return i;
/*     */   }
/*     */ 
/*     */   public static int g(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     synchronized (z) {
/*  21 */       z.j = paramArrayOfByte2;
/*  22 */       z.z = (paramInt3 * 2027524795);
/*  23 */       z.q = paramArrayOfByte1;
/*  24 */       z.i = 0;
/*  25 */       z.s = (paramInt1 * -30159071);
/*  26 */       z.b = 0;
/*  27 */       z.e = 0;
/*  28 */       z.g = 0;
/*  29 */       z.u = 0;
/*  30 */       l(z);
/*  31 */       paramInt1 -= z.s * 320632033;
/*  32 */       z.j = null;
/*  33 */       z.q = null;
/*  34 */       return paramInt1;
/*     */     }
/*     */   }
/*     */ 
/*     */   static int b(int paramInt, bg parambg)
/*     */   {
/*     */     int i;
/*     */     while (true)
/*     */     {
/* 463 */       if (parambg.b * 846407047 >= paramInt)
/*     */       {
/* 465 */         int k = parambg.e * 403083957 >> parambg.b * 846407047 - paramInt & (1 << paramInt) - 1;
/* 466 */         parambg.b -= paramInt * 1952550967;
/* 467 */         i = k;
/* 468 */         break; } parambg.e = ((parambg.e * 403083957 << 8 | parambg.j[(parambg.z * 1301209715)] & 0xFF) * 2015972253);
/* 471 */       parambg.b += -1559461448;
/* 472 */       parambg.z += 2027524795;
/* 473 */       parambg.g += -1547534471;
/* 474 */       if (parambg.g * -1307788599 != 0); } return i;
/*     */   }
/*     */ 
/*     */   static byte w(bg parambg)
/*     */   {
/* 457 */     return (byte)n(1, parambg);
/*     */   }
/*     */ 
/*     */   static void f(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 495 */     int i = 0;
/* 496 */     for (int k = paramInt1; k <= paramInt2; k++) {
/* 497 */       for (int i1 = 0; i1 < paramInt3; i1++) {
/* 498 */         if (paramArrayOfByte[i1] == k) {
/* 499 */           paramArrayOfInt3[i] = i1;
/* 500 */           i++;
/*     */         }
/*     */       }
/*     */     }
/* 504 */     for (k = 0; k < 23; k++) paramArrayOfInt2[k] = 0;
/* 505 */     for (k = 0; k < paramInt3; k++) paramArrayOfInt2[(paramArrayOfByte[k] + 1)] += 1;
/* 506 */     for (k = 1; k < 23; k++) paramArrayOfInt2[k] += paramArrayOfInt2[(k - 1)];
/* 507 */     for (k = 0; k < 23; k++) paramArrayOfInt1[k] = 0;
/* 508 */     int i2 = 0;
/* 509 */     for (k = paramInt1; k <= paramInt2; k++) {
/* 510 */       i2 += paramArrayOfInt2[(k + 1)] - paramArrayOfInt2[k];
/* 511 */       paramArrayOfInt1[k] = (i2 - 1);
/* 512 */       i2 <<= 1;
/*     */     }
/* 514 */     for (k = paramInt1 + 1; k <= paramInt2; k++)
/* 515 */       paramArrayOfInt2[k] = ((paramArrayOfInt1[(k - 1)] + 1 << 1) - paramArrayOfInt2[k]);
/*     */   }
/*     */ 
/*     */   static int t(int paramInt, bg parambg)
/*     */   {
/*     */     int i;
/*     */     while (true)
/*     */     {
/* 463 */       if (parambg.b * 846407047 >= paramInt)
/*     */       {
/* 465 */         int k = parambg.e * 403083957 >> parambg.b * 846407047 - paramInt & (1 << paramInt) - 1;
/* 466 */         parambg.b -= paramInt * 1952550967;
/* 467 */         i = k;
/* 468 */         break; } parambg.e = ((parambg.e * 403083957 << 8 | parambg.j[(parambg.z * 1301209715)] & 0xFF) * 2015972253);
/* 471 */       parambg.b += -1559461448;
/* 472 */       parambg.z += 2027524795;
/* 473 */       parambg.g += -1547534471;
/* 474 */       if (parambg.g * -1307788599 != 0); } return i;
/*     */   }
/*     */ 
/*     */   static byte v(bg parambg)
/*     */   {
/* 453 */     return (byte)n(8, parambg);
/*     */   }
/*     */ 
/*     */   static void k(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 495 */     int i = 0;
/* 496 */     for (int k = paramInt1; k <= paramInt2; k++) {
/* 497 */       for (int i1 = 0; i1 < paramInt3; i1++) {
/* 498 */         if (paramArrayOfByte[i1] == k) {
/* 499 */           paramArrayOfInt3[i] = i1;
/* 500 */           i++;
/*     */         }
/*     */       }
/*     */     }
/* 504 */     for (k = 0; k < 23; k++) paramArrayOfInt2[k] = 0;
/* 505 */     for (k = 0; k < paramInt3; k++) paramArrayOfInt2[(paramArrayOfByte[k] + 1)] += 1;
/* 506 */     for (k = 1; k < 23; k++) paramArrayOfInt2[k] += paramArrayOfInt2[(k - 1)];
/* 507 */     for (k = 0; k < 23; k++) paramArrayOfInt1[k] = 0;
/* 508 */     int i2 = 0;
/* 509 */     for (k = paramInt1; k <= paramInt2; k++) {
/* 510 */       i2 += paramArrayOfInt2[(k + 1)] - paramArrayOfInt2[k];
/* 511 */       paramArrayOfInt1[k] = (i2 - 1);
/* 512 */       i2 <<= 1;
/*     */     }
/* 514 */     for (k = paramInt1 + 1; k <= paramInt2; k++)
/* 515 */       paramArrayOfInt2[k] = ((paramArrayOfInt1[(k - 1)] + 1 << 1) - paramArrayOfInt2[k]);
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     bu
 * JD-Core Version:    0.6.2
 */