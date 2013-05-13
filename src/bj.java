/*     */ public class bj
/*     */ {
/*     */   static void f(long[] paramArrayOfLong1, int paramInt1, long[] paramArrayOfLong2, int paramInt2, int paramInt3)
/*     */   {
/* 176 */     if (paramArrayOfLong1 == paramArrayOfLong2) {
/* 177 */       if (paramInt1 == paramInt2) return;
/* 178 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/* 179 */         paramInt3--;
/* 180 */         paramInt1 += paramInt3;
/* 181 */         paramInt2 += paramInt3;
/* 182 */         paramInt3 = paramInt1 - paramInt3;
/* 183 */         paramInt3 += 3;
/* 184 */         while (paramInt1 >= paramInt3) {
/* 185 */           paramArrayOfLong2[(paramInt2--)] = paramArrayOfLong1[(paramInt1--)];
/* 186 */           paramArrayOfLong2[(paramInt2--)] = paramArrayOfLong1[(paramInt1--)];
/* 187 */           paramArrayOfLong2[(paramInt2--)] = paramArrayOfLong1[(paramInt1--)];
/* 188 */           paramArrayOfLong2[(paramInt2--)] = paramArrayOfLong1[(paramInt1--)];
/*     */         }
/* 190 */         paramInt3 -= 3;
/* 191 */         while (paramInt1 >= paramInt3) paramArrayOfLong2[(paramInt2--)] = paramArrayOfLong1[(paramInt1--)];
/* 192 */         return;
/*     */       }
/*     */     }
/* 195 */     paramInt3 += paramInt1;
/* 196 */     paramInt3 -= 3;
/* 197 */     while (paramInt1 < paramInt3) {
/* 198 */       paramArrayOfLong2[(paramInt2++)] = paramArrayOfLong1[(paramInt1++)];
/* 199 */       paramArrayOfLong2[(paramInt2++)] = paramArrayOfLong1[(paramInt1++)];
/* 200 */       paramArrayOfLong2[(paramInt2++)] = paramArrayOfLong1[(paramInt1++)];
/* 201 */       paramArrayOfLong2[(paramInt2++)] = paramArrayOfLong1[(paramInt1++)];
/*     */     }
/* 203 */     paramInt3 += 3;
/* 204 */     while (paramInt1 < paramInt3) paramArrayOfLong2[(paramInt2++)] = paramArrayOfLong1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void z(boolean[] paramArrayOfBoolean1, int paramInt1, boolean[] paramArrayOfBoolean2, int paramInt2, int paramInt3)
/*     */   {
/* 283 */     if (paramArrayOfBoolean1 == paramArrayOfBoolean2) {
/* 284 */       if (paramInt1 == paramInt2) return;
/* 285 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/* 286 */         paramInt3--;
/* 287 */         paramInt1 += paramInt3;
/* 288 */         paramInt2 += paramInt3;
/* 289 */         paramInt3 = paramInt1 - paramInt3;
/* 290 */         paramInt3 += 7;
/* 291 */         while (paramInt1 >= paramInt3) {
/* 292 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 293 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 294 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 295 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 296 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 297 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 298 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 299 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/*     */         }
/* 301 */         paramInt3 -= 7;
/* 302 */         while (paramInt1 >= paramInt3) paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 303 */         return;
/*     */       }
/*     */     }
/* 306 */     paramInt3 += paramInt1;
/* 307 */     paramInt3 -= 7;
/* 308 */     while (paramInt1 < paramInt3) {
/* 309 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 310 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 311 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 312 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 313 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 314 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 315 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 316 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/*     */     }
/* 318 */     paramInt3 += 7;
/* 319 */     while (paramInt1 < paramInt3) paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void ac(Object[] paramArrayOfObject1, int paramInt1, Object[] paramArrayOfObject2, int paramInt2, int paramInt3)
/*     */   {
/* 324 */     if (paramArrayOfObject1 == paramArrayOfObject2) {
/* 325 */       if (paramInt1 == paramInt2) return;
/* 326 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/* 327 */         paramInt3--;
/* 328 */         paramInt1 += paramInt3;
/* 329 */         paramInt2 += paramInt3;
/* 330 */         paramInt3 = paramInt1 - paramInt3;
/* 331 */         paramInt3 += 7;
/* 332 */         while (paramInt1 >= paramInt3) {
/* 333 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 334 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 335 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 336 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 337 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 338 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 339 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 340 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/*     */         }
/* 342 */         paramInt3 -= 7;
/* 343 */         while (paramInt1 >= paramInt3) paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 344 */         return;
/*     */       }
/*     */     }
/* 347 */     paramInt3 += paramInt1;
/* 348 */     paramInt3 -= 7;
/* 349 */     while (paramInt1 < paramInt3) {
/* 350 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 351 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 352 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 353 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 354 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 355 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 356 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 357 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/*     */     }
/* 359 */     paramInt3 += 7;
/* 360 */     while (paramInt1 < paramInt3) paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void l(char[] paramArrayOfChar1, int paramInt1, char[] paramArrayOfChar2, int paramInt2, int paramInt3)
/*     */   {
/*  94 */     if (paramArrayOfChar1 == paramArrayOfChar2) {
/*  95 */       if (paramInt1 == paramInt2) return;
/*  96 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/*  97 */         paramInt3--;
/*  98 */         paramInt1 += paramInt3;
/*  99 */         paramInt2 += paramInt3;
/* 100 */         paramInt3 = paramInt1 - paramInt3;
/* 101 */         paramInt3 += 7;
/* 102 */         while (paramInt1 >= paramInt3) {
/* 103 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 104 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 105 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 106 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 107 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 108 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 109 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 110 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/*     */         }
/* 112 */         paramInt3 -= 7;
/* 113 */         while (paramInt1 >= paramInt3) paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 114 */         return;
/*     */       }
/*     */     }
/* 117 */     paramInt3 += paramInt1;
/* 118 */     paramInt3 -= 7;
/* 119 */     while (paramInt1 < paramInt3) {
/* 120 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 121 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 122 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 123 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 124 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 125 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 126 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 127 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/*     */     }
/* 129 */     paramInt3 += 7;
/* 130 */     while (paramInt1 < paramInt3) paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void m(int[] paramArrayOfInt1, int paramInt1, int[] paramArrayOfInt2, int paramInt2, int paramInt3)
/*     */   {
/* 135 */     if (paramArrayOfInt1 == paramArrayOfInt2) {
/* 136 */       if (paramInt1 == paramInt2) return;
/* 137 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/* 138 */         paramInt3--;
/* 139 */         paramInt1 += paramInt3;
/* 140 */         paramInt2 += paramInt3;
/* 141 */         paramInt3 = paramInt1 - paramInt3;
/* 142 */         paramInt3 += 7;
/* 143 */         while (paramInt1 >= paramInt3) {
/* 144 */           paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/* 145 */           paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/* 146 */           paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/* 147 */           paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/* 148 */           paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/* 149 */           paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/* 150 */           paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/* 151 */           paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/*     */         }
/* 153 */         paramInt3 -= 7;
/* 154 */         while (paramInt1 >= paramInt3) paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/* 155 */         return;
/*     */       }
/*     */     }
/* 158 */     paramInt3 += paramInt1;
/* 159 */     paramInt3 -= 7;
/* 160 */     while (paramInt1 < paramInt3) {
/* 161 */       paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/* 162 */       paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/* 163 */       paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/* 164 */       paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/* 165 */       paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/* 166 */       paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/* 167 */       paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/* 168 */       paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/*     */     }
/* 170 */     paramInt3 += 7;
/* 171 */     while (paramInt1 < paramInt3) paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void c(long[] paramArrayOfLong1, int paramInt1, long[] paramArrayOfLong2, int paramInt2, int paramInt3)
/*     */   {
/* 176 */     if (paramArrayOfLong1 == paramArrayOfLong2) {
/* 177 */       if (paramInt1 == paramInt2) return;
/* 178 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/* 179 */         paramInt3--;
/* 180 */         paramInt1 += paramInt3;
/* 181 */         paramInt2 += paramInt3;
/* 182 */         paramInt3 = paramInt1 - paramInt3;
/* 183 */         paramInt3 += 3;
/* 184 */         while (paramInt1 >= paramInt3) {
/* 185 */           paramArrayOfLong2[(paramInt2--)] = paramArrayOfLong1[(paramInt1--)];
/* 186 */           paramArrayOfLong2[(paramInt2--)] = paramArrayOfLong1[(paramInt1--)];
/* 187 */           paramArrayOfLong2[(paramInt2--)] = paramArrayOfLong1[(paramInt1--)];
/* 188 */           paramArrayOfLong2[(paramInt2--)] = paramArrayOfLong1[(paramInt1--)];
/*     */         }
/* 190 */         paramInt3 -= 3;
/* 191 */         while (paramInt1 >= paramInt3) paramArrayOfLong2[(paramInt2--)] = paramArrayOfLong1[(paramInt1--)];
/* 192 */         return;
/*     */       }
/*     */     }
/* 195 */     paramInt3 += paramInt1;
/* 196 */     paramInt3 -= 3;
/* 197 */     while (paramInt1 < paramInt3) {
/* 198 */       paramArrayOfLong2[(paramInt2++)] = paramArrayOfLong1[(paramInt1++)];
/* 199 */       paramArrayOfLong2[(paramInt2++)] = paramArrayOfLong1[(paramInt1++)];
/* 200 */       paramArrayOfLong2[(paramInt2++)] = paramArrayOfLong1[(paramInt1++)];
/* 201 */       paramArrayOfLong2[(paramInt2++)] = paramArrayOfLong1[(paramInt1++)];
/*     */     }
/* 203 */     paramInt3 += 3;
/* 204 */     while (paramInt1 < paramInt3) paramArrayOfLong2[(paramInt2++)] = paramArrayOfLong1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void g(Object[] paramArrayOfObject1, int paramInt1, Object[] paramArrayOfObject2, int paramInt2, int paramInt3)
/*     */   {
/* 324 */     if (paramArrayOfObject1 == paramArrayOfObject2) {
/* 325 */       if (paramInt1 == paramInt2) return;
/* 326 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/* 327 */         paramInt3--;
/* 328 */         paramInt1 += paramInt3;
/* 329 */         paramInt2 += paramInt3;
/* 330 */         paramInt3 = paramInt1 - paramInt3;
/* 331 */         paramInt3 += 7;
/* 332 */         while (paramInt1 >= paramInt3) {
/* 333 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 334 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 335 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 336 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 337 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 338 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 339 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 340 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/*     */         }
/* 342 */         paramInt3 -= 7;
/* 343 */         while (paramInt1 >= paramInt3) paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 344 */         return;
/*     */       }
/*     */     }
/* 347 */     paramInt3 += paramInt1;
/* 348 */     paramInt3 -= 7;
/* 349 */     while (paramInt1 < paramInt3) {
/* 350 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 351 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 352 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 353 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 354 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 355 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 356 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 357 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/*     */     }
/* 359 */     paramInt3 += 7;
/* 360 */     while (paramInt1 < paramInt3) paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void j(double[] paramArrayOfDouble1, int paramInt1, double[] paramArrayOfDouble2, int paramInt2, int paramInt3)
/*     */   {
/* 250 */     if (paramArrayOfDouble1 == paramArrayOfDouble2) {
/* 251 */       if (paramInt1 == paramInt2) return;
/* 252 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/* 253 */         paramInt3--;
/* 254 */         paramInt1 += paramInt3;
/* 255 */         paramInt2 += paramInt3;
/* 256 */         paramInt3 = paramInt1 - paramInt3;
/* 257 */         paramInt3 += 3;
/* 258 */         while (paramInt1 >= paramInt3) {
/* 259 */           paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/* 260 */           paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/* 261 */           paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/* 262 */           paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/*     */         }
/* 264 */         paramInt3 -= 3;
/* 265 */         while (paramInt1 >= paramInt3) paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/* 266 */         return;
/*     */       }
/*     */     }
/* 269 */     paramInt3 += paramInt1;
/* 270 */     paramInt3 -= 3;
/* 271 */     while (paramInt1 < paramInt3) {
/* 272 */       paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/* 273 */       paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/* 274 */       paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/* 275 */       paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/*     */     }
/* 277 */     paramInt3 += 3;
/* 278 */     while (paramInt1 < paramInt3) paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void d(short[] paramArrayOfShort1, int paramInt1, short[] paramArrayOfShort2, int paramInt2, int paramInt3)
/*     */   {
/*  53 */     if (paramArrayOfShort1 == paramArrayOfShort2) {
/*  54 */       if (paramInt1 == paramInt2) return;
/*  55 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/*  56 */         paramInt3--;
/*  57 */         paramInt1 += paramInt3;
/*  58 */         paramInt2 += paramInt3;
/*  59 */         paramInt3 = paramInt1 - paramInt3;
/*  60 */         paramInt3 += 7;
/*  61 */         while (paramInt1 >= paramInt3) {
/*  62 */           paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*  63 */           paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*  64 */           paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*  65 */           paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*  66 */           paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*  67 */           paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*  68 */           paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*  69 */           paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*     */         }
/*  71 */         paramInt3 -= 7;
/*  72 */         while (paramInt1 >= paramInt3) paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*  73 */         return;
/*     */       }
/*     */     }
/*  76 */     paramInt3 += paramInt1;
/*  77 */     paramInt3 -= 7;
/*  78 */     while (paramInt1 < paramInt3) {
/*  79 */       paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*  80 */       paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*  81 */       paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*  82 */       paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*  83 */       paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*  84 */       paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*  85 */       paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*  86 */       paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*     */     }
/*  88 */     paramInt3 += 7;
/*  89 */     while (paramInt1 < paramInt3) paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void y(int[] paramArrayOfInt1, int paramInt1, int[] paramArrayOfInt2, int paramInt2, int paramInt3)
/*     */   {
/* 135 */     if (paramArrayOfInt1 == paramArrayOfInt2) {
/* 136 */       if (paramInt1 == paramInt2) return;
/* 137 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/* 138 */         paramInt3--;
/* 139 */         paramInt1 += paramInt3;
/* 140 */         paramInt2 += paramInt3;
/* 141 */         paramInt3 = paramInt1 - paramInt3;
/* 142 */         paramInt3 += 7;
/* 143 */         while (paramInt1 >= paramInt3) {
/* 144 */           paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/* 145 */           paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/* 146 */           paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/* 147 */           paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/* 148 */           paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/* 149 */           paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/* 150 */           paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/* 151 */           paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/*     */         }
/* 153 */         paramInt3 -= 7;
/* 154 */         while (paramInt1 >= paramInt3) paramArrayOfInt2[(paramInt2--)] = paramArrayOfInt1[(paramInt1--)];
/* 155 */         return;
/*     */       }
/*     */     }
/* 158 */     paramInt3 += paramInt1;
/* 159 */     paramInt3 -= 7;
/* 160 */     while (paramInt1 < paramInt3) {
/* 161 */       paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/* 162 */       paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/* 163 */       paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/* 164 */       paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/* 165 */       paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/* 166 */       paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/* 167 */       paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/* 168 */       paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/*     */     }
/* 170 */     paramInt3 += 7;
/* 171 */     while (paramInt1 < paramInt3) paramArrayOfInt2[(paramInt2++)] = paramArrayOfInt1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   public static void q(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/* 364 */     paramInt2 = paramInt1 + paramInt2 - 7;
/* 365 */     while (paramInt1 < paramInt2) {
/* 366 */       paramArrayOfInt[(paramInt1++)] = 0;
/* 367 */       paramArrayOfInt[(paramInt1++)] = 0;
/* 368 */       paramArrayOfInt[(paramInt1++)] = 0;
/* 369 */       paramArrayOfInt[(paramInt1++)] = 0;
/* 370 */       paramArrayOfInt[(paramInt1++)] = 0;
/* 371 */       paramArrayOfInt[(paramInt1++)] = 0;
/* 372 */       paramArrayOfInt[(paramInt1++)] = 0;
/* 373 */       paramArrayOfInt[(paramInt1++)] = 0;
/*     */     }
/* 375 */     paramInt2 += 7;
/* 376 */     while (paramInt1 < paramInt2) paramArrayOfInt[(paramInt1++)] = 0;
/*     */   }
/*     */ 
/*     */   static void e(char[] paramArrayOfChar1, int paramInt1, char[] paramArrayOfChar2, int paramInt2, int paramInt3)
/*     */   {
/*  94 */     if (paramArrayOfChar1 == paramArrayOfChar2) {
/*  95 */       if (paramInt1 == paramInt2) return;
/*  96 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/*  97 */         paramInt3--;
/*  98 */         paramInt1 += paramInt3;
/*  99 */         paramInt2 += paramInt3;
/* 100 */         paramInt3 = paramInt1 - paramInt3;
/* 101 */         paramInt3 += 7;
/* 102 */         while (paramInt1 >= paramInt3) {
/* 103 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 104 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 105 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 106 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 107 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 108 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 109 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 110 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/*     */         }
/* 112 */         paramInt3 -= 7;
/* 113 */         while (paramInt1 >= paramInt3) paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 114 */         return;
/*     */       }
/*     */     }
/* 117 */     paramInt3 += paramInt1;
/* 118 */     paramInt3 -= 7;
/* 119 */     while (paramInt1 < paramInt3) {
/* 120 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 121 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 122 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 123 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 124 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 125 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 126 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 127 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/*     */     }
/* 129 */     paramInt3 += 7;
/* 130 */     while (paramInt1 < paramInt3) paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void r(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
/*     */   {
/*  12 */     if (paramArrayOfByte1 == paramArrayOfByte2) {
/*  13 */       if (paramInt1 == paramInt2) return;
/*  14 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/*  15 */         paramInt3--;
/*  16 */         paramInt1 += paramInt3;
/*  17 */         paramInt2 += paramInt3;
/*  18 */         paramInt3 = paramInt1 - paramInt3;
/*  19 */         paramInt3 += 7;
/*  20 */         while (paramInt1 >= paramInt3) {
/*  21 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  22 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  23 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  24 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  25 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  26 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  27 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  28 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*     */         }
/*  30 */         paramInt3 -= 7;
/*  31 */         while (paramInt1 >= paramInt3) paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  32 */         return;
/*     */       }
/*     */     }
/*  35 */     paramInt3 += paramInt1;
/*  36 */     paramInt3 -= 7;
/*  37 */     while (paramInt1 < paramInt3) {
/*  38 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  39 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  40 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  41 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  42 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  43 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  44 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  45 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*     */     }
/*  47 */     paramInt3 += 7;
/*  48 */     while (paramInt1 < paramInt3) paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void u(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
/*     */   {
/*  12 */     if (paramArrayOfByte1 == paramArrayOfByte2) {
/*  13 */       if (paramInt1 == paramInt2) return;
/*  14 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/*  15 */         paramInt3--;
/*  16 */         paramInt1 += paramInt3;
/*  17 */         paramInt2 += paramInt3;
/*  18 */         paramInt3 = paramInt1 - paramInt3;
/*  19 */         paramInt3 += 7;
/*  20 */         while (paramInt1 >= paramInt3) {
/*  21 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  22 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  23 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  24 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  25 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  26 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  27 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  28 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*     */         }
/*  30 */         paramInt3 -= 7;
/*  31 */         while (paramInt1 >= paramInt3) paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  32 */         return;
/*     */       }
/*     */     }
/*  35 */     paramInt3 += paramInt1;
/*  36 */     paramInt3 -= 7;
/*  37 */     while (paramInt1 < paramInt3) {
/*  38 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  39 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  40 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  41 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  42 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  43 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  44 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  45 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*     */     }
/*  47 */     paramInt3 += 7;
/*  48 */     while (paramInt1 < paramInt3) paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void v(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
/*     */   {
/*  12 */     if (paramArrayOfByte1 == paramArrayOfByte2) {
/*  13 */       if (paramInt1 == paramInt2) return;
/*  14 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/*  15 */         paramInt3--;
/*  16 */         paramInt1 += paramInt3;
/*  17 */         paramInt2 += paramInt3;
/*  18 */         paramInt3 = paramInt1 - paramInt3;
/*  19 */         paramInt3 += 7;
/*  20 */         while (paramInt1 >= paramInt3) {
/*  21 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  22 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  23 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  24 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  25 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  26 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  27 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  28 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*     */         }
/*  30 */         paramInt3 -= 7;
/*  31 */         while (paramInt1 >= paramInt3) paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  32 */         return;
/*     */       }
/*     */     }
/*  35 */     paramInt3 += paramInt1;
/*  36 */     paramInt3 -= 7;
/*  37 */     while (paramInt1 < paramInt3) {
/*  38 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  39 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  40 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  41 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  42 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  43 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  44 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  45 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*     */     }
/*  47 */     paramInt3 += 7;
/*  48 */     while (paramInt1 < paramInt3) paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void w(short[] paramArrayOfShort1, int paramInt1, short[] paramArrayOfShort2, int paramInt2, int paramInt3)
/*     */   {
/*  53 */     if (paramArrayOfShort1 == paramArrayOfShort2) {
/*  54 */       if (paramInt1 == paramInt2) return;
/*  55 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/*  56 */         paramInt3--;
/*  57 */         paramInt1 += paramInt3;
/*  58 */         paramInt2 += paramInt3;
/*  59 */         paramInt3 = paramInt1 - paramInt3;
/*  60 */         paramInt3 += 7;
/*  61 */         while (paramInt1 >= paramInt3) {
/*  62 */           paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*  63 */           paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*  64 */           paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*  65 */           paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*  66 */           paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*  67 */           paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*  68 */           paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*  69 */           paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*     */         }
/*  71 */         paramInt3 -= 7;
/*  72 */         while (paramInt1 >= paramInt3) paramArrayOfShort2[(paramInt2--)] = paramArrayOfShort1[(paramInt1--)];
/*  73 */         return;
/*     */       }
/*     */     }
/*  76 */     paramInt3 += paramInt1;
/*  77 */     paramInt3 -= 7;
/*  78 */     while (paramInt1 < paramInt3) {
/*  79 */       paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*  80 */       paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*  81 */       paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*  82 */       paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*  83 */       paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*  84 */       paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*  85 */       paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*  86 */       paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*     */     }
/*  88 */     paramInt3 += 7;
/*  89 */     while (paramInt1 < paramInt3) paramArrayOfShort2[(paramInt2++)] = paramArrayOfShort1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   public static void aa(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/* 364 */     paramInt2 = paramInt1 + paramInt2 - 7;
/* 365 */     while (paramInt1 < paramInt2) {
/* 366 */       paramArrayOfInt[(paramInt1++)] = 0;
/* 367 */       paramArrayOfInt[(paramInt1++)] = 0;
/* 368 */       paramArrayOfInt[(paramInt1++)] = 0;
/* 369 */       paramArrayOfInt[(paramInt1++)] = 0;
/* 370 */       paramArrayOfInt[(paramInt1++)] = 0;
/* 371 */       paramArrayOfInt[(paramInt1++)] = 0;
/* 372 */       paramArrayOfInt[(paramInt1++)] = 0;
/* 373 */       paramArrayOfInt[(paramInt1++)] = 0;
/*     */     }
/* 375 */     paramInt2 += 7;
/* 376 */     while (paramInt1 < paramInt2) paramArrayOfInt[(paramInt1++)] = 0;
/*     */   }
/*     */ 
/*     */   static void b(char[] paramArrayOfChar1, int paramInt1, char[] paramArrayOfChar2, int paramInt2, int paramInt3)
/*     */   {
/*  94 */     if (paramArrayOfChar1 == paramArrayOfChar2) {
/*  95 */       if (paramInt1 == paramInt2) return;
/*  96 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/*  97 */         paramInt3--;
/*  98 */         paramInt1 += paramInt3;
/*  99 */         paramInt2 += paramInt3;
/* 100 */         paramInt3 = paramInt1 - paramInt3;
/* 101 */         paramInt3 += 7;
/* 102 */         while (paramInt1 >= paramInt3) {
/* 103 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 104 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 105 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 106 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 107 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 108 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 109 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 110 */           paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/*     */         }
/* 112 */         paramInt3 -= 7;
/* 113 */         while (paramInt1 >= paramInt3) paramArrayOfChar2[(paramInt2--)] = paramArrayOfChar1[(paramInt1--)];
/* 114 */         return;
/*     */       }
/*     */     }
/* 117 */     paramInt3 += paramInt1;
/* 118 */     paramInt3 -= 7;
/* 119 */     while (paramInt1 < paramInt3) {
/* 120 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 121 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 122 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 123 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 124 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 125 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 126 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/* 127 */       paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/*     */     }
/* 129 */     paramInt3 += 7;
/* 130 */     while (paramInt1 < paramInt3) paramArrayOfChar2[(paramInt2++)] = paramArrayOfChar1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void t(long[] paramArrayOfLong1, int paramInt1, long[] paramArrayOfLong2, int paramInt2, int paramInt3)
/*     */   {
/* 176 */     if (paramArrayOfLong1 == paramArrayOfLong2) {
/* 177 */       if (paramInt1 == paramInt2) return;
/* 178 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/* 179 */         paramInt3--;
/* 180 */         paramInt1 += paramInt3;
/* 181 */         paramInt2 += paramInt3;
/* 182 */         paramInt3 = paramInt1 - paramInt3;
/* 183 */         paramInt3 += 3;
/* 184 */         while (paramInt1 >= paramInt3) {
/* 185 */           paramArrayOfLong2[(paramInt2--)] = paramArrayOfLong1[(paramInt1--)];
/* 186 */           paramArrayOfLong2[(paramInt2--)] = paramArrayOfLong1[(paramInt1--)];
/* 187 */           paramArrayOfLong2[(paramInt2--)] = paramArrayOfLong1[(paramInt1--)];
/* 188 */           paramArrayOfLong2[(paramInt2--)] = paramArrayOfLong1[(paramInt1--)];
/*     */         }
/* 190 */         paramInt3 -= 3;
/* 191 */         while (paramInt1 >= paramInt3) paramArrayOfLong2[(paramInt2--)] = paramArrayOfLong1[(paramInt1--)];
/* 192 */         return;
/*     */       }
/*     */     }
/* 195 */     paramInt3 += paramInt1;
/* 196 */     paramInt3 -= 3;
/* 197 */     while (paramInt1 < paramInt3) {
/* 198 */       paramArrayOfLong2[(paramInt2++)] = paramArrayOfLong1[(paramInt1++)];
/* 199 */       paramArrayOfLong2[(paramInt2++)] = paramArrayOfLong1[(paramInt1++)];
/* 200 */       paramArrayOfLong2[(paramInt2++)] = paramArrayOfLong1[(paramInt1++)];
/* 201 */       paramArrayOfLong2[(paramInt2++)] = paramArrayOfLong1[(paramInt1++)];
/*     */     }
/* 203 */     paramInt3 += 3;
/* 204 */     while (paramInt1 < paramInt3) paramArrayOfLong2[(paramInt2++)] = paramArrayOfLong1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void i(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
/*     */   {
/*  12 */     if (paramArrayOfByte1 == paramArrayOfByte2) {
/*  13 */       if (paramInt1 == paramInt2) return;
/*  14 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/*  15 */         paramInt3--;
/*  16 */         paramInt1 += paramInt3;
/*  17 */         paramInt2 += paramInt3;
/*  18 */         paramInt3 = paramInt1 - paramInt3;
/*  19 */         paramInt3 += 7;
/*  20 */         while (paramInt1 >= paramInt3) {
/*  21 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  22 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  23 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  24 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  25 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  26 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  27 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  28 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*     */         }
/*  30 */         paramInt3 -= 7;
/*  31 */         while (paramInt1 >= paramInt3) paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  32 */         return;
/*     */       }
/*     */     }
/*  35 */     paramInt3 += paramInt1;
/*  36 */     paramInt3 -= 7;
/*  37 */     while (paramInt1 < paramInt3) {
/*  38 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  39 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  40 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  41 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  42 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  43 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  44 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  45 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*     */     }
/*  47 */     paramInt3 += 7;
/*  48 */     while (paramInt1 < paramInt3) paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void n(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2, int paramInt3)
/*     */   {
/* 209 */     if (paramArrayOfFloat1 == paramArrayOfFloat2) {
/* 210 */       if (paramInt1 == paramInt2) return;
/* 211 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/* 212 */         paramInt3--;
/* 213 */         paramInt1 += paramInt3;
/* 214 */         paramInt2 += paramInt3;
/* 215 */         paramInt3 = paramInt1 - paramInt3;
/* 216 */         paramInt3 += 7;
/* 217 */         while (paramInt1 >= paramInt3) {
/* 218 */           paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/* 219 */           paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/* 220 */           paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/* 221 */           paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/* 222 */           paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/* 223 */           paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/* 224 */           paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/* 225 */           paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/*     */         }
/* 227 */         paramInt3 -= 7;
/* 228 */         while (paramInt1 >= paramInt3) paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/* 229 */         return;
/*     */       }
/*     */     }
/* 232 */     paramInt3 += paramInt1;
/* 233 */     paramInt3 -= 7;
/* 234 */     while (paramInt1 < paramInt3) {
/* 235 */       paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/* 236 */       paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/* 237 */       paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/* 238 */       paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/* 239 */       paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/* 240 */       paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/* 241 */       paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/* 242 */       paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/*     */     }
/* 244 */     paramInt3 += 7;
/* 245 */     while (paramInt1 < paramInt3) paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void k(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2, int paramInt3)
/*     */   {
/* 209 */     if (paramArrayOfFloat1 == paramArrayOfFloat2) {
/* 210 */       if (paramInt1 == paramInt2) return;
/* 211 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/* 212 */         paramInt3--;
/* 213 */         paramInt1 += paramInt3;
/* 214 */         paramInt2 += paramInt3;
/* 215 */         paramInt3 = paramInt1 - paramInt3;
/* 216 */         paramInt3 += 7;
/* 217 */         while (paramInt1 >= paramInt3) {
/* 218 */           paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/* 219 */           paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/* 220 */           paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/* 221 */           paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/* 222 */           paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/* 223 */           paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/* 224 */           paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/* 225 */           paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/*     */         }
/* 227 */         paramInt3 -= 7;
/* 228 */         while (paramInt1 >= paramInt3) paramArrayOfFloat2[(paramInt2--)] = paramArrayOfFloat1[(paramInt1--)];
/* 229 */         return;
/*     */       }
/*     */     }
/* 232 */     paramInt3 += paramInt1;
/* 233 */     paramInt3 -= 7;
/* 234 */     while (paramInt1 < paramInt3) {
/* 235 */       paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/* 236 */       paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/* 237 */       paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/* 238 */       paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/* 239 */       paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/* 240 */       paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/* 241 */       paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/* 242 */       paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/*     */     }
/* 244 */     paramInt3 += 7;
/* 245 */     while (paramInt1 < paramInt3) paramArrayOfFloat2[(paramInt2++)] = paramArrayOfFloat1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void o(double[] paramArrayOfDouble1, int paramInt1, double[] paramArrayOfDouble2, int paramInt2, int paramInt3)
/*     */   {
/* 250 */     if (paramArrayOfDouble1 == paramArrayOfDouble2) {
/* 251 */       if (paramInt1 == paramInt2) return;
/* 252 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/* 253 */         paramInt3--;
/* 254 */         paramInt1 += paramInt3;
/* 255 */         paramInt2 += paramInt3;
/* 256 */         paramInt3 = paramInt1 - paramInt3;
/* 257 */         paramInt3 += 3;
/* 258 */         while (paramInt1 >= paramInt3) {
/* 259 */           paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/* 260 */           paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/* 261 */           paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/* 262 */           paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/*     */         }
/* 264 */         paramInt3 -= 3;
/* 265 */         while (paramInt1 >= paramInt3) paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/* 266 */         return;
/*     */       }
/*     */     }
/* 269 */     paramInt3 += paramInt1;
/* 270 */     paramInt3 -= 3;
/* 271 */     while (paramInt1 < paramInt3) {
/* 272 */       paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/* 273 */       paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/* 274 */       paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/* 275 */       paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/*     */     }
/* 277 */     paramInt3 += 3;
/* 278 */     while (paramInt1 < paramInt3) paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void a(double[] paramArrayOfDouble1, int paramInt1, double[] paramArrayOfDouble2, int paramInt2, int paramInt3)
/*     */   {
/* 250 */     if (paramArrayOfDouble1 == paramArrayOfDouble2) {
/* 251 */       if (paramInt1 == paramInt2) return;
/* 252 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/* 253 */         paramInt3--;
/* 254 */         paramInt1 += paramInt3;
/* 255 */         paramInt2 += paramInt3;
/* 256 */         paramInt3 = paramInt1 - paramInt3;
/* 257 */         paramInt3 += 3;
/* 258 */         while (paramInt1 >= paramInt3) {
/* 259 */           paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/* 260 */           paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/* 261 */           paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/* 262 */           paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/*     */         }
/* 264 */         paramInt3 -= 3;
/* 265 */         while (paramInt1 >= paramInt3) paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/* 266 */         return;
/*     */       }
/*     */     }
/* 269 */     paramInt3 += paramInt1;
/* 270 */     paramInt3 -= 3;
/* 271 */     while (paramInt1 < paramInt3) {
/* 272 */       paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/* 273 */       paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/* 274 */       paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/* 275 */       paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/*     */     }
/* 277 */     paramInt3 += 3;
/* 278 */     while (paramInt1 < paramInt3) paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void h(double[] paramArrayOfDouble1, int paramInt1, double[] paramArrayOfDouble2, int paramInt2, int paramInt3)
/*     */   {
/* 250 */     if (paramArrayOfDouble1 == paramArrayOfDouble2) {
/* 251 */       if (paramInt1 == paramInt2) return;
/* 252 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/* 253 */         paramInt3--;
/* 254 */         paramInt1 += paramInt3;
/* 255 */         paramInt2 += paramInt3;
/* 256 */         paramInt3 = paramInt1 - paramInt3;
/* 257 */         paramInt3 += 3;
/* 258 */         while (paramInt1 >= paramInt3) {
/* 259 */           paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/* 260 */           paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/* 261 */           paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/* 262 */           paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/*     */         }
/* 264 */         paramInt3 -= 3;
/* 265 */         while (paramInt1 >= paramInt3) paramArrayOfDouble2[(paramInt2--)] = paramArrayOfDouble1[(paramInt1--)];
/* 266 */         return;
/*     */       }
/*     */     }
/* 269 */     paramInt3 += paramInt1;
/* 270 */     paramInt3 -= 3;
/* 271 */     while (paramInt1 < paramInt3) {
/* 272 */       paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/* 273 */       paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/* 274 */       paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/* 275 */       paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/*     */     }
/* 277 */     paramInt3 += 3;
/* 278 */     while (paramInt1 < paramInt3) paramArrayOfDouble2[(paramInt2++)] = paramArrayOfDouble1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void x(boolean[] paramArrayOfBoolean1, int paramInt1, boolean[] paramArrayOfBoolean2, int paramInt2, int paramInt3)
/*     */   {
/* 283 */     if (paramArrayOfBoolean1 == paramArrayOfBoolean2) {
/* 284 */       if (paramInt1 == paramInt2) return;
/* 285 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/* 286 */         paramInt3--;
/* 287 */         paramInt1 += paramInt3;
/* 288 */         paramInt2 += paramInt3;
/* 289 */         paramInt3 = paramInt1 - paramInt3;
/* 290 */         paramInt3 += 7;
/* 291 */         while (paramInt1 >= paramInt3) {
/* 292 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 293 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 294 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 295 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 296 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 297 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 298 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 299 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/*     */         }
/* 301 */         paramInt3 -= 7;
/* 302 */         while (paramInt1 >= paramInt3) paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 303 */         return;
/*     */       }
/*     */     }
/* 306 */     paramInt3 += paramInt1;
/* 307 */     paramInt3 -= 7;
/* 308 */     while (paramInt1 < paramInt3) {
/* 309 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 310 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 311 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 312 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 313 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 314 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 315 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 316 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/*     */     }
/* 318 */     paramInt3 += 7;
/* 319 */     while (paramInt1 < paramInt3) paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void p(boolean[] paramArrayOfBoolean1, int paramInt1, boolean[] paramArrayOfBoolean2, int paramInt2, int paramInt3)
/*     */   {
/* 283 */     if (paramArrayOfBoolean1 == paramArrayOfBoolean2) {
/* 284 */       if (paramInt1 == paramInt2) return;
/* 285 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/* 286 */         paramInt3--;
/* 287 */         paramInt1 += paramInt3;
/* 288 */         paramInt2 += paramInt3;
/* 289 */         paramInt3 = paramInt1 - paramInt3;
/* 290 */         paramInt3 += 7;
/* 291 */         while (paramInt1 >= paramInt3) {
/* 292 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 293 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 294 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 295 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 296 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 297 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 298 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 299 */           paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/*     */         }
/* 301 */         paramInt3 -= 7;
/* 302 */         while (paramInt1 >= paramInt3) paramArrayOfBoolean2[(paramInt2--)] = paramArrayOfBoolean1[(paramInt1--)];
/* 303 */         return;
/*     */       }
/*     */     }
/* 306 */     paramInt3 += paramInt1;
/* 307 */     paramInt3 -= 7;
/* 308 */     while (paramInt1 < paramInt3) {
/* 309 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 310 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 311 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 312 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 313 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 314 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 315 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/* 316 */       paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/*     */     }
/* 318 */     paramInt3 += 7;
/* 319 */     while (paramInt1 < paramInt3) paramArrayOfBoolean2[(paramInt2++)] = paramArrayOfBoolean1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void ad(Object[] paramArrayOfObject1, int paramInt1, Object[] paramArrayOfObject2, int paramInt2, int paramInt3)
/*     */   {
/* 324 */     if (paramArrayOfObject1 == paramArrayOfObject2) {
/* 325 */       if (paramInt1 == paramInt2) return;
/* 326 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/* 327 */         paramInt3--;
/* 328 */         paramInt1 += paramInt3;
/* 329 */         paramInt2 += paramInt3;
/* 330 */         paramInt3 = paramInt1 - paramInt3;
/* 331 */         paramInt3 += 7;
/* 332 */         while (paramInt1 >= paramInt3) {
/* 333 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 334 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 335 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 336 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 337 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 338 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 339 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 340 */           paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/*     */         }
/* 342 */         paramInt3 -= 7;
/* 343 */         while (paramInt1 >= paramInt3) paramArrayOfObject2[(paramInt2--)] = paramArrayOfObject1[(paramInt1--)];
/* 344 */         return;
/*     */       }
/*     */     }
/* 347 */     paramInt3 += paramInt1;
/* 348 */     paramInt3 -= 7;
/* 349 */     while (paramInt1 < paramInt3) {
/* 350 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 351 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 352 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 353 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 354 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 355 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 356 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/* 357 */       paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/*     */     }
/* 359 */     paramInt3 += 7;
/* 360 */     while (paramInt1 < paramInt3) paramArrayOfObject2[(paramInt2++)] = paramArrayOfObject1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   static void s(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
/*     */   {
/*  12 */     if (paramArrayOfByte1 == paramArrayOfByte2) {
/*  13 */       if (paramInt1 == paramInt2) return;
/*  14 */       if ((paramInt2 > paramInt1) && (paramInt2 < paramInt1 + paramInt3)) {
/*  15 */         paramInt3--;
/*  16 */         paramInt1 += paramInt3;
/*  17 */         paramInt2 += paramInt3;
/*  18 */         paramInt3 = paramInt1 - paramInt3;
/*  19 */         paramInt3 += 7;
/*  20 */         while (paramInt1 >= paramInt3) {
/*  21 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  22 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  23 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  24 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  25 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  26 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  27 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  28 */           paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*     */         }
/*  30 */         paramInt3 -= 7;
/*  31 */         while (paramInt1 >= paramInt3) paramArrayOfByte2[(paramInt2--)] = paramArrayOfByte1[(paramInt1--)];
/*  32 */         return;
/*     */       }
/*     */     }
/*  35 */     paramInt3 += paramInt1;
/*  36 */     paramInt3 -= 7;
/*  37 */     while (paramInt1 < paramInt3) {
/*  38 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  39 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  40 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  41 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  42 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  43 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  44 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*  45 */       paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*     */     }
/*  47 */     paramInt3 += 7;
/*  48 */     while (paramInt1 < paramInt3) paramArrayOfByte2[(paramInt2++)] = paramArrayOfByte1[(paramInt1++)];
/*     */   }
/*     */ 
/*     */   bj()
/*     */     throws Throwable
/*     */   {
/*   7 */     throw new Error();
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     bj
 * JD-Core Version:    0.6.2
 */