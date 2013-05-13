/*     */ import java.math.BigInteger;
/*     */ 
/*     */ public class ev extends dg
/*     */ {
/*     */   public static final int z = 5000;
/*     */   public int c;
/*  11 */   public static int[] n = new int[256];
/*     */   static final int j = -306674912;
/*     */   public byte[] m;
/*     */   static p od;
/*     */ 
/*     */   public int ex()
/*     */   {
/* 391 */     return 0 - this.m[((this.c += -941396361) * -196293817 - 1)] & 0xFF;
/*     */   }
/*     */ 
/*     */   public void dr(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */   {
/* 251 */     for (int i = paramInt1; i < paramInt2 + paramInt1; i++)
/*     */     {
/*     */       int tmp26_25 = (this.c + -941396361); this.c = tmp26_25; paramArrayOfByte[i] = this.m[(tmp26_25 * -196293817 - 1)];
/*     */     }
/*     */   }
/*     */ 
/*     */   public void c(int paramInt1, int paramInt2)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)paramInt1);
/*     */   }
/*     */ 
/*     */   public int df()
/*     */   {
/* 161 */     this.c += 529381852;
/* 162 */     return ((this.m[(-196293817 * this.c - 2)] & 0xFF) << 8) + (((this.m[(-196293817 * this.c - 3)] & 0xFF) << 16) + ((this.m[(-196293817 * this.c - 4)] & 0xFF) << 24)) + (this.m[(this.c * -196293817 - 1)] & 0xFF);
/*     */   }
/*     */ 
/*     */   public int gn()
/*     */   {
/* 484 */     this.c += 529381852;
/* 485 */     return (this.m[(-196293817 * this.c - 4)] & 0xFF) + (((this.m[(-196293817 * this.c - 2)] & 0xFF) << 16) + ((this.m[(this.c * -196293817 - 1)] & 0xFF) << 24) + ((this.m[(-196293817 * this.c - 3)] & 0xFF) << 8));
/*     */   }
/*     */ 
/*     */   public void ef(BigInteger paramBigInteger1, BigInteger paramBigInteger2)
/*     */   {
/* 326 */     int i = -196293817 * this.c;
/* 327 */     this.c = 0;
/* 328 */     byte[] arrayOfByte1 = new byte[i];
/* 329 */     as(arrayOfByte1, 0, i, 1602313803);
/* 330 */     BigInteger localBigInteger1 = new BigInteger(arrayOfByte1);
/* 331 */     BigInteger localBigInteger2 = localBigInteger1.modPow(paramBigInteger1, paramBigInteger2);
/* 332 */     byte[] arrayOfByte2 = localBigInteger2.toByteArray();
/* 333 */     this.c = 0;
/* 334 */     n(arrayOfByte2.length, -1403380670);
/* 335 */     u(arrayOfByte2, 0, arrayOfByte2.length, (byte)89);
/*     */   }
/*     */ 
/*     */   public void g(long paramLong)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(int)(paramLong >> 56));
/*     */     int tmp40_39 = (this.c + -941396361); this.c = tmp40_39; this.m[(tmp40_39 * -196293817 - 1)] = ((byte)(int)(paramLong >> 48));
/*     */     int tmp68_67 = (this.c + -941396361); this.c = tmp68_67; this.m[(tmp68_67 * -196293817 - 1)] = ((byte)(int)(paramLong >> 40));
/*     */     int tmp96_95 = (this.c + -941396361); this.c = tmp96_95; this.m[(tmp96_95 * -196293817 - 1)] = ((byte)(int)(paramLong >> 32));
/*     */     int tmp124_123 = (this.c + -941396361); this.c = tmp124_123; this.m[(tmp124_123 * -196293817 - 1)] = ((byte)(int)(paramLong >> 24));
/*     */     int tmp152_151 = (this.c + -941396361); this.c = tmp152_151; this.m[(tmp152_151 * -196293817 - 1)] = ((byte)(int)(paramLong >> 16));
/*     */     int tmp180_179 = (this.c + -941396361); this.c = tmp180_179; this.m[(tmp180_179 * -196293817 - 1)] = ((byte)(int)(paramLong >> 8));
/*     */     int tmp208_207 = (this.c + -941396361); this.c = tmp208_207; this.m[(tmp208_207 * -196293817 - 1)] = ((byte)(int)paramLong);
/*     */   }
/*     */ 
/*     */   public void i(String paramString, int paramInt)
/*     */   {
/*  76 */     int i = paramString.indexOf(0);
/*  77 */     if (i >= 0) { if (paramInt < -1114410233);
/*  77 */       throw new IllegalArgumentException(""); }
/*  78 */     this.c += bh.c(paramString, 0, paramString.length(), this.m, -196293817 * this.c, 1262861172) * -941396361;
/*     */     int tmp75_74 = (this.c + -941396361); this.c = tmp75_74; this.m[(tmp75_74 * -196293817 - 1)] = 0;
/*     */   }
/*     */ 
/*     */   public void s(CharSequence paramCharSequence, int paramInt) {
/*  83 */     int i = es.r(paramCharSequence, 152299600);
/*     */     int tmp19_18 = (this.c + -941396361); this.c = tmp19_18; this.m[(tmp19_18 * -196293817 - 1)] = 0;
/*  85 */     y(i, 1424373430);
/*  86 */     this.c += cw.d(this.m, -196293817 * this.c, paramCharSequence, 1985538552) * -941396361;
/*     */   }
/*     */ 
/*     */   public int dl()
/*     */   {
/* 261 */     int i = this.m[(-196293817 * this.c)] & 0xFF;
/* 262 */     if (i < 128) return t(1118814123);
/* 263 */     return k(-1987080889) - 32768;
/*     */   }
/*     */ 
/*     */   public byte f(int paramInt)
/*     */   {
/* 140 */     return this.m[((this.c += -941396361) * -196293817 - 1)];
/*     */   }
/*     */ 
/*     */   public int bf(int paramInt)
/*     */   {
/* 484 */     this.c += 529381852;
/* 485 */     return (this.m[(-196293817 * this.c - 4)] & 0xFF) + (((this.m[(-196293817 * this.c - 2)] & 0xFF) << 16) + ((this.m[(this.c * -196293817 - 1)] & 0xFF) << 24) + ((this.m[(-196293817 * this.c - 3)] & 0xFF) << 8));
/*     */   }
/*     */ 
/*     */   public int bv(int paramInt)
/*     */   {
/* 458 */     this.c += 1470778213;
/* 459 */     return (this.m[(this.c * -196293817 - 3)] & 0xFF) + (((this.m[(-196293817 * this.c - 1)] & 0xFF) << 16) + ((this.m[(this.c * -196293817 - 2)] & 0xFF) << 8));
/*     */   }
/*     */ 
/*     */   public void b(int paramInt1, int paramInt2)
/*     */   {
/* 110 */     if (paramInt1 >= 0) { if (paramInt2 != 1000988793) return; if (paramInt1 < 128) { if (paramInt2 == 1000988793);
/* 111 */         c(paramInt1, 1758062365);
/* 112 */         return; }
/*     */     }
/* 114 */     if (paramInt1 >= 0) { if (paramInt2 != 1000988793) throw new IllegalStateException(); if (paramInt1 < 32768) { if (paramInt2 != 1000988793) throw new IllegalStateException();
/* 115 */         n(paramInt1 + 32768, 1709242039);
/* 116 */         return; }
/*     */     }
/* 118 */     throw new IllegalArgumentException();
/*     */   }
/*     */ 
/*     */   public void y(int paramInt1, int paramInt2) {
/* 122 */     if ((paramInt1 & 0xFFFFFF80) != 0) { if (paramInt2 != 1424373430) return;
/* 123 */       if (0 != (paramInt1 & 0xFFFFC000)) { if (paramInt2 != 1424373430) throw new IllegalStateException();
/* 124 */         if ((paramInt1 & 0xFFE00000) != 0) { if (paramInt2 != 1424373430) return;
/* 125 */           if ((paramInt1 & 0xF0000000) != 0) { if (paramInt2 != 1424373430) throw new IllegalStateException(); c(paramInt1 >>> 28 | 0x80, 1972224803); }
/* 126 */           c(paramInt1 >>> 21 | 0x80, 2095764127);
/*     */         }
/* 128 */         c(paramInt1 >>> 14 | 0x80, 1656183756);
/*     */       }
/* 130 */       c(paramInt1 >>> 7 | 0x80, 1281333127);
/*     */     }
/* 132 */     c(paramInt1 & 0x7F, 2004087680);
/*     */   }
/*     */ 
/*     */   public int t(int paramInt) {
/* 136 */     return this.m[((this.c += -941396361) * -196293817 - 1)] & 0xFF;
/*     */   }
/*     */ 
/*     */   public int fk()
/*     */   {
/* 422 */     this.c += -1882792722;
/* 423 */     return (this.m[(this.c * -196293817 - 2)] & 0xFF) + ((this.m[(-196293817 * this.c - 1)] & 0xFF) << 8);
/*     */   }
/*     */ 
/*     */   public int k(int paramInt)
/*     */   {
/* 144 */     this.c += -1882792722;
/* 145 */     return ((this.m[(this.c * -196293817 - 2)] & 0xFF) << 8) + (this.m[(-196293817 * this.c - 1)] & 0xFF);
/*     */   }
/*     */ 
/*     */   public int o(int paramInt) {
/* 149 */     this.c += -1882792722;
/* 150 */     int i = ((this.m[(this.c * -196293817 - 2)] & 0xFF) << 8) + (this.m[(this.c * -196293817 - 1)] & 0xFF);
/* 151 */     if (i > 32767) { if (paramInt < -1702967809);
/* 151 */       i -= 65536; }
/* 152 */     return i;
/*     */   }
/*     */ 
/*     */   public int bo(byte paramByte)
/*     */   {
/* 494 */     this.c += 529381852;
/* 495 */     return ((this.m[(this.c * -196293817 - 3)] & 0xFF) << 24) + ((this.m[(-196293817 * this.c - 4)] & 0xFF) << 16) + ((this.m[(this.c * -196293817 - 1)] & 0xFF) << 8) + (this.m[(-196293817 * this.c - 2)] & 0xFF);
/*     */   }
/*     */ 
/*     */   public int h(int paramInt)
/*     */   {
/* 161 */     this.c += 529381852;
/* 162 */     return ((this.m[(-196293817 * this.c - 2)] & 0xFF) << 8) + (((this.m[(-196293817 * this.c - 3)] & 0xFF) << 16) + ((this.m[(-196293817 * this.c - 4)] & 0xFF) << 24)) + (this.m[(this.c * -196293817 - 1)] & 0xFF);
/*     */   }
/*     */ 
/*     */   public long x(int paramInt) {
/* 166 */     long l1 = h(-1879407017) & 0xFFFFFFFF;
/* 167 */     long l2 = h(-1260919556) & 0xFFFFFFFF;
/* 168 */     return (l1 << 32) + l2;
/*     */   }
/*     */ 
/*     */   public void er(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/* 282 */     int i = -196293817 * this.c;
/* 283 */     this.c = (-941396361 * paramInt1);
/* 284 */     int k = (paramInt2 - paramInt1) / 8;
/* 285 */     for (int i1 = 0; i1 < k; i1++) {
/* 286 */       int i2 = h(2063836281);
/* 287 */       int i3 = h(1035396117);
/* 288 */       int i4 = 0;
/* 289 */       int i5 = -1640531527;
/* 290 */       int i6 = 32;
/* 291 */       while (i6-- > 0) {
/* 292 */         i2 += ((i3 << 4 ^ i3 >>> 5) + i3 ^ paramArrayOfInt[(i4 & 0x3)] + i4);
/* 293 */         i4 += i5;
/* 294 */         i3 += ((i2 << 4 ^ i2 >>> 5) + i2 ^ paramArrayOfInt[(i4 >>> 11 & 0x3)] + i4);
/*     */       }
/* 296 */       this.c -= 1058763704;
/* 297 */       z(i2, (byte)100);
/* 298 */       z(i3, (byte)124);
/*     */     }
/* 300 */     this.c = (-941396361 * i);
/*     */   }
/*     */ 
/*     */   public int fo()
/*     */   {
/* 458 */     this.c += 1470778213;
/* 459 */     return (this.m[(this.c * -196293817 - 3)] & 0xFF) + (((this.m[(-196293817 * this.c - 1)] & 0xFF) << 16) + ((this.m[(this.c * -196293817 - 2)] & 0xFF) << 8));
/*     */   }
/*     */ 
/*     */   public int fx()
/*     */   {
/* 427 */     this.c += -1882792722;
/* 428 */     return (this.m[(this.c * -196293817 - 1)] - 128 & 0xFF) + ((this.m[(-196293817 * this.c - 2)] & 0xFF) << 8);
/*     */   }
/*     */ 
/*     */   public int ar(int paramInt)
/*     */   {
/* 387 */     return this.m[((this.c += -941396361) * -196293817 - 1)] - 128 & 0xFF;
/*     */   }
/*     */ 
/*     */   public void as(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 251 */     for (int i = paramInt1; i < paramInt2 + paramInt1; i++) { if (paramInt3 != 1602313803)
/*     */         return;
/*     */       int tmp34_33 = (this.c + -941396361); this.c = tmp34_33; paramArrayOfByte[i] = this.m[(tmp34_33 * -196293817 - 1)]; }
/*     */   }
/*     */ 
/*     */   public int am(int paramInt) {
/* 255 */     int i = this.m[(this.c * -196293817)] & 0xFF;
/* 256 */     if (i < 128) { if (paramInt >= -712342056) throw new IllegalStateException(); return t(1118814123) - 64; }
/* 257 */     return k(-1987080889) - 49152;
/*     */   }
/*     */ 
/*     */   public void gw(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt >> 16));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)(paramInt >> 24));
/*     */     int tmp66_65 = (this.c + -941396361); this.c = tmp66_65; this.m[(tmp66_65 * -196293817 - 1)] = ((byte)paramInt);
/*     */     int tmp90_89 = (this.c + -941396361); this.c = tmp90_89; this.m[(tmp90_89 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */   }
/*     */ 
/*     */   public int av(short paramShort)
/*     */   {
/* 267 */     if (this.m[(-196293817 * this.c)] < 0) { if (paramShort == 2048) throw new IllegalStateException(); return h(-427538818) & 0x7FFFFFFF; }
/* 268 */     return k(-1987080889);
/*     */   }
/*     */ 
/*     */   public int ak(byte paramByte) {
/* 272 */     int i = this.m[((this.c += -941396361) * -196293817 - 1)];
/* 273 */     int k = 0;
/* 274 */     while (i < 0) { if (paramByte != 2) throw new IllegalStateException();
/* 275 */       k = (k | i & 0x7F) << 7;
/* 276 */       i = this.m[((this.c += -941396361) * -196293817 - 1)];
/*     */     }
/* 278 */     return k | i;
/*     */   }
/*     */ 
/*     */   public void fc(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)paramInt);
/*     */     int tmp36_35 = (this.c + -941396361); this.c = tmp36_35; this.m[(tmp36_35 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */   }
/*     */ 
/*     */   public String aa(int paramInt)
/*     */   {
/* 198 */     int i = this.m[((this.c += -941396361) * -196293817 - 1)];
/* 199 */     if (0 != i) { if (paramInt == -106460278) throw new IllegalStateException(); throw new IllegalStateException(""); }
/* 200 */     int k = ak((byte)2);
/* 201 */     if (k + -196293817 * this.c > this.m.length) { if (paramInt != -106460278);
/* 201 */       throw new IllegalStateException("");
/*     */     }
/* 203 */     byte[] arrayOfByte = this.m;
/* 204 */     int i1 = -196293817 * this.c;
/*     */ 
/* 206 */     Object localObject = new char[k];
/* 207 */     int i2 = 0;
/* 208 */     int i3 = i1;
/* 209 */     int i4 = k + i1;
/* 210 */     while (i3 < i4) { if (paramInt == -106460278) throw new IllegalStateException();
/* 211 */       int i5 = arrayOfByte[(i3++)] & 0xFF;
/*     */       int i6;
/* 213 */       if (i5 < 128) { if ((paramInt == -106460278) || 
/* 214 */           (i5 == 0)) { if (paramInt == -106460278) throw new IllegalStateException(); i6 = 65533; } else {
/* 215 */           i6 = i5;
/*     */         }
/* 217 */       } else if (i5 < 192) { if (paramInt == -106460278) throw new IllegalStateException(); i6 = 65533;
/* 218 */       } else if (i5 < 224) { if ((paramInt == -106460278) || 
/* 219 */           (i3 < i4)) { if (paramInt == -106460278) throw new IllegalStateException(); if (128 == (arrayOfByte[i3] & 0xC0)) { if (paramInt != -106460278);
/* 220 */             i6 = (i5 & 0x1F) << 6 | arrayOfByte[(i3++)] & 0x3F;
/* 221 */             if (i6 >= 128) break label759; if (paramInt != -106460278);
/* 221 */             i6 = 65533; break label759; }
/*     */         }
/* 223 */         i6 = 65533;
/*     */       }
/* 225 */       else if (i5 < 240) { if ((paramInt == -106460278) || (
/* 226 */           (1 + i3 < i4) && ((paramInt == -106460278) || ((128 == (arrayOfByte[i3] & 0xC0)) && ((paramInt == -106460278) || ((arrayOfByte[(1 + i3)] & 0xC0) == 128)))))) { if (paramInt != -106460278);
/* 227 */           i6 = (i5 & 0xF) << 12 | (arrayOfByte[(i3++)] & 0x3F) << 6 | arrayOfByte[(i3++)] & 0x3F;
/* 228 */           if (i6 < 2048) { if (paramInt != -106460278);
/* 228 */             i6 = 65533; }
/*     */         } else {
/* 230 */           i6 = 65533;
/*     */         }
/* 232 */       } else if (i5 < 248) { if (paramInt == -106460278) throw new IllegalStateException();
/* 233 */         if (2 + i3 < i4) { if (paramInt == -106460278) throw new IllegalStateException(); if (128 == (arrayOfByte[i3] & 0xC0)) { if (paramInt == -106460278) throw new IllegalStateException(); if ((128 == (arrayOfByte[(i3 + 1)] & 0xC0)) && ((paramInt == -106460278) || ((arrayOfByte[(2 + i3)] & 0xC0) == 128))) { if (paramInt == -106460278) throw new IllegalStateException();
/* 234 */               i6 = (i5 & 0x7) << 18 | (arrayOfByte[(i3++)] & 0x3F) << 12 | (arrayOfByte[(i3++)] & 0x3F) << 6 | arrayOfByte[(i3++)] & 0x3F;
/* 235 */               if (i6 >= 65536) { if (paramInt == -106460278) throw new IllegalStateException(); if (i6 <= 1114111) break label741; if (paramInt == -106460278) throw new IllegalStateException();  } i6 = 65533; break label759;
/* 236 */               label741: i6 = 65533; break label759; } }
/*     */         }
/* 238 */         i6 = 65533;
/*     */       } else {
/* 240 */         i6 = 65533;
/* 241 */       }label759: localObject[(i2++)] = ((char)i6);
/*     */     }
/* 243 */     String str = new String((char[])localObject, 0, i2);
/*     */ 
/* 245 */     localObject = str;
/* 246 */     this.c += k * -941396361;
/* 247 */     return localObject;
/*     */   }
/*     */ 
/*     */   public void ah(BigInteger paramBigInteger1, BigInteger paramBigInteger2, int paramInt)
/*     */   {
/* 326 */     int i = -196293817 * this.c;
/* 327 */     this.c = 0;
/* 328 */     byte[] arrayOfByte1 = new byte[i];
/* 329 */     as(arrayOfByte1, 0, i, 1602313803);
/* 330 */     BigInteger localBigInteger1 = new BigInteger(arrayOfByte1);
/* 331 */     BigInteger localBigInteger2 = localBigInteger1.modPow(paramBigInteger1, paramBigInteger2);
/* 332 */     byte[] arrayOfByte2 = localBigInteger2.toByteArray();
/* 333 */     this.c = 0;
/* 334 */     n(arrayOfByte2.length, -1680395822);
/* 335 */     u(arrayOfByte2, 0, arrayOfByte2.length, (byte)99);
/*     */   }
/*     */ 
/*     */   public int ay(int paramInt1, int paramInt2)
/*     */   {
/* 340 */     byte[] arrayOfByte = this.m;
/* 341 */     int k = -196293817 * this.c;
/*     */ 
/* 343 */     int i1 = -1;
/* 344 */     for (int i2 = paramInt1; i2 < k; i2++) { if (paramInt2 > 1581507090);
/* 345 */       i1 = i1 >>> 8 ^ n[((i1 ^ arrayOfByte[i2]) & 0xFF)];
/*     */     }
/* 347 */     i1 ^= -1;
/* 348 */     int i = i1;
/*     */ 
/* 350 */     i1 = i;
/* 351 */     z(i1, (byte)70);
/* 352 */     return i1;
/*     */   }
/*     */ 
/*     */   public void ao(int paramInt, short paramShort)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(0 - paramInt));
/*     */   }
/*     */ 
/*     */   public void ab(int paramInt1, int paramInt2)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt1 + 128));
/*     */   }
/*     */ 
/*     */   public int ft()
/*     */   {
/* 427 */     this.c += -1882792722;
/* 428 */     return (this.m[(this.c * -196293817 - 1)] - 128 & 0xFF) + ((this.m[(-196293817 * this.c - 2)] & 0xFF) << 8);
/*     */   }
/*     */ 
/*     */   public void ag(int paramInt1, int paramInt2)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(128 - paramInt1));
/*     */   }
/*     */ 
/*     */   public void j(int paramInt, byte paramByte)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt >> 16));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp66_65 = (this.c + -941396361); this.c = tmp66_65; this.m[(tmp66_65 * -196293817 - 1)] = ((byte)paramInt);
/*     */   }
/*     */ 
/*     */   public int fl()
/*     */   {
/* 422 */     this.c += -1882792722;
/* 423 */     return (this.m[(this.c * -196293817 - 2)] & 0xFF) + ((this.m[(-196293817 * this.c - 1)] & 0xFF) << 8);
/*     */   }
/*     */ 
/*     */   public int at(int paramInt)
/*     */   {
/* 395 */     return 128 - this.m[((this.c += -941396361) * -196293817 - 1)] & 0xFF;
/*     */   }
/*     */ 
/*     */   public byte ae(int paramInt) {
/* 399 */     return (byte)(this.m[((this.c += -941396361) * -196293817 - 1)] - 128);
/*     */   }
/*     */ 
/*     */   public byte au(int paramInt) {
/* 403 */     return (byte)(128 - this.m[((this.c += -941396361) * -196293817 - 1)]);
/*     */   }
/*     */ 
/*     */   public void gf(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */   {
/* 499 */     for (int i = paramInt2 + paramInt1 - 1; i >= paramInt1; i--)
/*     */     {
/*     */       int tmp28_27 = (this.c + -941396361); this.c = tmp28_27; paramArrayOfByte[i] = this.m[(tmp28_27 * -196293817 - 1)];
/*     */     }
/*     */   }
/*     */ 
/*     */   public void ai(int paramInt, byte paramByte)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)(128 + paramInt));
/*     */   }
/*     */ 
/*     */   public void aj(int paramInt1, int paramInt2)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(128 + paramInt1));
/*     */     int tmp40_39 = (this.c + -941396361); this.c = tmp40_39; this.m[(tmp40_39 * -196293817 - 1)] = ((byte)(paramInt1 >> 8));
/*     */   }
/*     */ 
/*     */   public int aw(int paramInt) {
/* 422 */     this.c += -1882792722;
/* 423 */     return (this.m[(this.c * -196293817 - 2)] & 0xFF) + ((this.m[(-196293817 * this.c - 1)] & 0xFF) << 8);
/*     */   }
/*     */ 
/*     */   public int af(int paramInt) {
/* 427 */     this.c += -1882792722;
/* 428 */     return (this.m[(this.c * -196293817 - 1)] - 128 & 0xFF) + ((this.m[(-196293817 * this.c - 2)] & 0xFF) << 8);
/*     */   }
/*     */ 
/*     */   public int bh(int paramInt) {
/* 432 */     this.c += -1882792722;
/* 433 */     return (this.m[(this.c * -196293817 - 2)] - 128 & 0xFF) + ((this.m[(this.c * -196293817 - 1)] & 0xFF) << 8);
/*     */   }
/*     */ 
/*     */   public void br(long paramLong)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(int)(paramLong >> 56));
/*     */     int tmp40_39 = (this.c + -941396361); this.c = tmp40_39; this.m[(tmp40_39 * -196293817 - 1)] = ((byte)(int)(paramLong >> 48));
/*     */     int tmp68_67 = (this.c + -941396361); this.c = tmp68_67; this.m[(tmp68_67 * -196293817 - 1)] = ((byte)(int)(paramLong >> 40));
/*     */     int tmp96_95 = (this.c + -941396361); this.c = tmp96_95; this.m[(tmp96_95 * -196293817 - 1)] = ((byte)(int)(paramLong >> 32));
/*     */     int tmp124_123 = (this.c + -941396361); this.c = tmp124_123; this.m[(tmp124_123 * -196293817 - 1)] = ((byte)(int)(paramLong >> 24));
/*     */     int tmp152_151 = (this.c + -941396361); this.c = tmp152_151; this.m[(tmp152_151 * -196293817 - 1)] = ((byte)(int)(paramLong >> 16));
/*     */     int tmp180_179 = (this.c + -941396361); this.c = tmp180_179; this.m[(tmp180_179 * -196293817 - 1)] = ((byte)(int)(paramLong >> 8));
/*     */     int tmp208_207 = (this.c + -941396361); this.c = tmp208_207; this.m[(tmp208_207 * -196293817 - 1)] = ((byte)(int)paramLong);
/*     */   }
/*     */ 
/*     */   public int bs(byte paramByte)
/*     */   {
/* 444 */     this.c += -1882792722;
/* 445 */     int i = (this.m[(this.c * -196293817 - 1)] - 128 & 0xFF) + ((this.m[(this.c * -196293817 - 2)] & 0xFF) << 8);
/* 446 */     if (i > 32767) { if (paramByte < 4);
/* 446 */       i -= 65536; }
/* 447 */     return i;
/*     */   }
/*     */ 
/*     */   public int bk(short paramShort) {
/* 451 */     this.c += -1882792722;
/* 452 */     int i = ((this.m[(-196293817 * this.c - 1)] & 0xFF) << 8) + (this.m[(this.c * -196293817 - 2)] - 128 & 0xFF);
/* 453 */     if (i > 32767) { if (paramShort < 3302);
/* 453 */       i -= 65536; }
/* 454 */     return i;
/*     */   }
/*     */ 
/*     */   public int gp()
/*     */   {
/* 489 */     this.c += 529381852;
/* 490 */     return ((this.m[(this.c * -196293817 - 4)] & 0xFF) << 8) + (((this.m[(-196293817 * this.c - 2)] & 0xFF) << 24) + ((this.m[(-196293817 * this.c - 1)] & 0xFF) << 16)) + (this.m[(-196293817 * this.c - 3)] & 0xFF);
/*     */   }
/*     */ 
/*     */   public void bw(int paramInt, short paramShort)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)paramInt);
/*     */     int tmp36_35 = (this.c + -941396361); this.c = tmp36_35; this.m[(tmp36_35 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp63_62 = (this.c + -941396361); this.c = tmp63_62; this.m[(tmp63_62 * -196293817 - 1)] = ((byte)(paramInt >> 16));
/*     */     int tmp90_89 = (this.c + -941396361); this.c = tmp90_89; this.m[(tmp90_89 * -196293817 - 1)] = ((byte)(paramInt >> 24));
/*     */   }
/*     */ 
/*     */   public int ap(int paramInt)
/*     */   {
/* 261 */     int i = this.m[(-196293817 * this.c)] & 0xFF;
/* 262 */     if (i < 128) { if (paramInt > -373618467);
/* 262 */       return t(1118814123); }
/* 263 */     return k(-1987080889) - 32768;
/*     */   }
/*     */ 
/*     */   public void bx(int paramInt, short paramShort)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt >> 16));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)(paramInt >> 24));
/*     */     int tmp66_65 = (this.c + -941396361); this.c = tmp66_65; this.m[(tmp66_65 * -196293817 - 1)] = ((byte)paramInt);
/*     */     int tmp90_89 = (this.c + -941396361); this.c = tmp90_89; this.m[(tmp90_89 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */   }
/*     */ 
/*     */   public void ct(int paramInt)
/*     */   {
/* 122 */     if ((paramInt & 0xFFFFFF80) != 0) {
/* 123 */       if (0 != (paramInt & 0xFFFFC000)) {
/* 124 */         if ((paramInt & 0xFFE00000) != 0) {
/* 125 */           if ((paramInt & 0xF0000000) != 0) c(paramInt >>> 28 | 0x80, 1276863251);
/* 126 */           c(paramInt >>> 21 | 0x80, 1342102469);
/*     */         }
/* 128 */         c(paramInt >>> 14 | 0x80, 1749251366);
/*     */       }
/* 130 */       c(paramInt >>> 7 | 0x80, 1226133696);
/*     */     }
/* 132 */     c(paramInt & 0x7F, 1984058635);
/*     */   }
/*     */ 
/*     */   public int bu(int paramInt)
/*     */   {
/* 489 */     this.c += 529381852;
/* 490 */     return ((this.m[(this.c * -196293817 - 4)] & 0xFF) << 8) + (((this.m[(-196293817 * this.c - 2)] & 0xFF) << 24) + ((this.m[(-196293817 * this.c - 1)] & 0xFF) << 16)) + (this.m[(-196293817 * this.c - 3)] & 0xFF);
/*     */   }
/*     */ 
/*     */   public int dw()
/*     */   {
/* 255 */     int i = this.m[(this.c * -196293817)] & 0xFF;
/* 256 */     if (i < 128) return t(1118814123) - 64;
/* 257 */     return k(-1987080889) - 49152;
/*     */   }
/*     */ 
/*     */   public void dq(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */   {
/* 251 */     for (int i = paramInt1; i < paramInt2 + paramInt1; i++)
/*     */     {
/*     */       int tmp26_25 = (this.c + -941396361); this.c = tmp26_25; paramArrayOfByte[i] = this.m[(tmp26_25 * -196293817 - 1)];
/*     */     }
/*     */   }
/*     */ 
/*     */   static
/*     */   {
/*  16 */     for (int k = 0; k < 256; k++) {
/*  17 */       int i = k;
/*  18 */       for (int i1 = 0; i1 < 8; i1++) {
/*  19 */         if (1 == (i & 0x1)) i = i >>> 1 ^ 0xEDB88320; else
/*  20 */           i >>>= 1;
/*     */       }
/*  22 */       n[k] = i;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void bj(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)paramInt);
/*     */   }
/*     */ 
/*     */   public void bz(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)paramInt);
/*     */   }
/*     */ 
/*     */   public int eb()
/*     */   {
/* 272 */     int i = this.m[((this.c += -941396361) * -196293817 - 1)];
/* 273 */     int k = 0;
/* 274 */     while (i < 0) {
/* 275 */       k = (k | i & 0x7F) << 7;
/* 276 */       i = this.m[((this.c += -941396361) * -196293817 - 1)];
/*     */     }
/* 278 */     return k | i;
/*     */   }
/*     */ 
/*     */   public void bn(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt >> 16));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp66_65 = (this.c + -941396361); this.c = tmp66_65; this.m[(tmp66_65 * -196293817 - 1)] = ((byte)paramInt);
/*     */   }
/*     */ 
/*     */   public void be(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt >> 16));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp66_65 = (this.c + -941396361); this.c = tmp66_65; this.m[(tmp66_65 * -196293817 - 1)] = ((byte)paramInt);
/*     */   }
/*     */ 
/*     */   public void bp(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt >> 16));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp66_65 = (this.c + -941396361); this.c = tmp66_65; this.m[(tmp66_65 * -196293817 - 1)] = ((byte)paramInt);
/*     */   }
/*     */ 
/*     */   public void ba(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt >> 24));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)(paramInt >> 16));
/*     */     int tmp66_65 = (this.c + -941396361); this.c = tmp66_65; this.m[(tmp66_65 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp93_92 = (this.c + -941396361); this.c = tmp93_92; this.m[(tmp93_92 * -196293817 - 1)] = ((byte)paramInt);
/*     */   }
/*     */ 
/*     */   public void bc(long paramLong)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(int)(paramLong >> 56));
/*     */     int tmp40_39 = (this.c + -941396361); this.c = tmp40_39; this.m[(tmp40_39 * -196293817 - 1)] = ((byte)(int)(paramLong >> 48));
/*     */     int tmp68_67 = (this.c + -941396361); this.c = tmp68_67; this.m[(tmp68_67 * -196293817 - 1)] = ((byte)(int)(paramLong >> 40));
/*     */     int tmp96_95 = (this.c + -941396361); this.c = tmp96_95; this.m[(tmp96_95 * -196293817 - 1)] = ((byte)(int)(paramLong >> 32));
/*     */     int tmp124_123 = (this.c + -941396361); this.c = tmp124_123; this.m[(tmp124_123 * -196293817 - 1)] = ((byte)(int)(paramLong >> 24));
/*     */     int tmp152_151 = (this.c + -941396361); this.c = tmp152_151; this.m[(tmp152_151 * -196293817 - 1)] = ((byte)(int)(paramLong >> 16));
/*     */     int tmp180_179 = (this.c + -941396361); this.c = tmp180_179; this.m[(tmp180_179 * -196293817 - 1)] = ((byte)(int)(paramLong >> 8));
/*     */     int tmp208_207 = (this.c + -941396361); this.c = tmp208_207; this.m[(tmp208_207 * -196293817 - 1)] = ((byte)(int)paramLong);
/*     */   }
/*     */ 
/*     */   public int ea()
/*     */   {
/* 395 */     return 128 - this.m[((this.c += -941396361) * -196293817 - 1)] & 0xFF;
/*     */   }
/*     */ 
/*     */   public static int bb(String paramString)
/*     */   {
/*  72 */     return paramString.length() + 1;
/*     */   }
/*     */ 
/*     */   public boolean al(int paramInt)
/*     */   {
/* 356 */     this.c -= 529381852;
/*     */ 
/* 358 */     byte[] arrayOfByte = this.m;
/* 359 */     int k = this.c * -196293817;
/*     */ 
/* 361 */     int i1 = -1;
/* 362 */     for (int i2 = 0; i2 < k; i2++) { if (paramInt > -143028152);
/* 363 */       i1 = i1 >>> 8 ^ n[((i1 ^ arrayOfByte[i2]) & 0xFF)];
/*     */     }
/* 365 */     i1 ^= -1;
/* 366 */     int i = i1;
/*     */ 
/* 368 */     i1 = i;
/* 369 */     i2 = h(1745494748);
/* 370 */     if (i2 == i1) { if (paramInt > -143028152);
/* 370 */       return true; }
/* 371 */     return false;
/*     */   }
/*     */ 
/*     */   public void cr(String paramString)
/*     */   {
/*  76 */     int i = paramString.indexOf(0);
/*  77 */     if (i >= 0) throw new IllegalArgumentException("");
/*  78 */     this.c += bh.c(paramString, 0, paramString.length(), this.m, -196293817 * this.c, -1826408063) * -941396361;
/*     */     int tmp66_65 = (this.c + -941396361); this.c = tmp66_65; this.m[(tmp66_65 * -196293817 - 1)] = 0;
/*     */   }
/*     */ 
/*     */   public void cs(String paramString)
/*     */   {
/*  76 */     int i = paramString.indexOf(0);
/*  77 */     if (i >= 0) throw new IllegalArgumentException("");
/*  78 */     this.c += bh.c(paramString, 0, paramString.length(), this.m, -196293817 * this.c, -507564979) * -941396361;
/*     */     int tmp66_65 = (this.c + -941396361); this.c = tmp66_65; this.m[(tmp66_65 * -196293817 - 1)] = 0;
/*     */   }
/*     */ 
/*     */   public void fr(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)(128 + paramInt));
/*     */   }
/*     */ 
/*     */   public void cl(CharSequence paramCharSequence)
/*     */   {
/*  83 */     int i = es.r(paramCharSequence, 152299600);
/*     */     int tmp19_18 = (this.c + -941396361); this.c = tmp19_18; this.m[(tmp19_18 * -196293817 - 1)] = 0;
/*  85 */     y(i, 1424373430);
/*  86 */     this.c += cw.d(this.m, -196293817 * this.c, paramCharSequence, 1985538552) * -941396361;
/*     */   }
/*     */ 
/*     */   public int cn()
/*     */   {
/* 136 */     return this.m[((this.c += -941396361) * -196293817 - 1)] & 0xFF;
/*     */   }
/*     */ 
/*     */   public void ca(int paramInt)
/*     */   {
/*  94 */     this.m[(-196293817 * this.c - paramInt - 4)] = ((byte)(paramInt >> 24));
/*  95 */     this.m[(this.c * -196293817 - paramInt - 3)] = ((byte)(paramInt >> 16));
/*  96 */     this.m[(-196293817 * this.c - paramInt - 2)] = ((byte)(paramInt >> 8));
/*  97 */     this.m[(-196293817 * this.c - paramInt - 1)] = ((byte)paramInt);
/*     */   }
/*     */ 
/*     */   public void co(int paramInt)
/*     */   {
/*  94 */     this.m[(-196293817 * this.c - paramInt - 4)] = ((byte)(paramInt >> 24));
/*  95 */     this.m[(this.c * -196293817 - paramInt - 3)] = ((byte)(paramInt >> 16));
/*  96 */     this.m[(-196293817 * this.c - paramInt - 2)] = ((byte)(paramInt >> 8));
/*  97 */     this.m[(-196293817 * this.c - paramInt - 1)] = ((byte)paramInt);
/*     */   }
/*     */ 
/*     */   public void ch(int paramInt) {
/* 101 */     this.m[(-196293817 * this.c - paramInt - 2)] = ((byte)(paramInt >> 8));
/* 102 */     this.m[(-196293817 * this.c - paramInt - 1)] = ((byte)paramInt);
/*     */   }
/*     */ 
/*     */   public int fw()
/*     */   {
/* 458 */     this.c += 1470778213;
/* 459 */     return (this.m[(this.c * -196293817 - 3)] & 0xFF) + (((this.m[(-196293817 * this.c - 1)] & 0xFF) << 16) + ((this.m[(this.c * -196293817 - 2)] & 0xFF) << 8));
/*     */   }
/*     */ 
/*     */   public void cc(int paramInt)
/*     */   {
/* 106 */     this.m[(this.c * -196293817 - paramInt - 1)] = ((byte)paramInt);
/*     */   }
/*     */ 
/*     */   public void n(int paramInt1, int paramInt2)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt1 >> 8));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)paramInt1);
/*     */   }
/*     */ 
/*     */   public void cw(int paramInt)
/*     */   {
/* 110 */     if ((paramInt >= 0) && (paramInt < 128)) {
/* 111 */       c(paramInt, 2039580423);
/* 112 */       return;
/*     */     }
/* 114 */     if ((paramInt >= 0) && (paramInt < 32768)) {
/* 115 */       n(paramInt + 32768, -193359782);
/* 116 */       return;
/*     */     }
/* 118 */     throw new IllegalArgumentException();
/*     */   }
/*     */ 
/*     */   public void cz(int paramInt)
/*     */   {
/* 110 */     if ((paramInt >= 0) && (paramInt < 128)) {
/* 111 */       c(paramInt, 1410457040);
/* 112 */       return;
/*     */     }
/* 114 */     if ((paramInt >= 0) && (paramInt < 32768)) {
/* 115 */       n(paramInt + 32768, 743652708);
/* 116 */       return;
/*     */     }
/* 118 */     throw new IllegalArgumentException();
/*     */   }
/*     */ 
/*     */   public void cv(int paramInt) {
/* 122 */     if ((paramInt & 0xFFFFFF80) != 0) {
/* 123 */       if (0 != (paramInt & 0xFFFFC000)) {
/* 124 */         if ((paramInt & 0xFFE00000) != 0) {
/* 125 */           if ((paramInt & 0xF0000000) != 0) c(paramInt >>> 28 | 0x80, 1807567737);
/* 126 */           c(paramInt >>> 21 | 0x80, 1291408730);
/*     */         }
/* 128 */         c(paramInt >>> 14 | 0x80, 1720895151);
/*     */       }
/* 130 */       c(paramInt >>> 7 | 0x80, 1554624627);
/*     */     }
/* 132 */     c(paramInt & 0x7F, 1170914682);
/*     */   }
/*     */ 
/*     */   public String p(int paramInt)
/*     */   {
/* 172 */     if (this.m[(-196293817 * this.c)] == 0) { if (paramInt == -1503416379);
/* 173 */       this.c += -941396361;
/* 174 */       return null;
/*     */     }
/* 176 */     return ad(-1756459836);
/*     */   }
/*     */ 
/*     */   public void ck(int paramInt)
/*     */   {
/* 122 */     if ((paramInt & 0xFFFFFF80) != 0) {
/* 123 */       if (0 != (paramInt & 0xFFFFC000)) {
/* 124 */         if ((paramInt & 0xFFE00000) != 0) {
/* 125 */           if ((paramInt & 0xF0000000) != 0) c(paramInt >>> 28 | 0x80, 2068171477);
/* 126 */           c(paramInt >>> 21 | 0x80, 1463399557);
/*     */         }
/* 128 */         c(paramInt >>> 14 | 0x80, 1494637179);
/*     */       }
/* 130 */       c(paramInt >>> 7 | 0x80, 2035355929);
/*     */     }
/* 132 */     c(paramInt & 0x7F, 1149774912);
/*     */   }
/*     */ 
/*     */   public void an(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 304 */     int i = -196293817 * this.c;
/* 305 */     this.c = (-941396361 * paramInt1);
/* 306 */     int k = (paramInt2 - paramInt1) / 8;
/* 307 */     for (int i1 = 0; i1 < k; i1++) { if (paramInt3 < 16711935);
/* 308 */       int i2 = h(-1411905367);
/* 309 */       int i3 = h(-1838353926);
/* 310 */       int i4 = -957401312;
/* 311 */       int i5 = -1640531527;
/* 312 */       int i6 = 32;
/* 313 */       while (i6-- > 0) { if (paramInt3 < 16711935);
/* 314 */         i3 -= ((i2 << 4 ^ i2 >>> 5) + i2 ^ paramArrayOfInt[(i4 >>> 11 & 0x3)] + i4);
/* 315 */         i4 -= i5;
/* 316 */         i2 -= ((i3 << 4 ^ i3 >>> 5) + i3 ^ i4 + paramArrayOfInt[(i4 & 0x3)]);
/*     */       }
/* 318 */       this.c -= 1058763704;
/* 319 */       z(i2, (byte)23);
/* 320 */       z(i3, (byte)78);
/*     */     }
/* 322 */     this.c = (-941396361 * i);
/*     */   }
/*     */ 
/*     */   public void cq(int paramInt)
/*     */   {
/* 122 */     if ((paramInt & 0xFFFFFF80) != 0) {
/* 123 */       if (0 != (paramInt & 0xFFFFC000)) {
/* 124 */         if ((paramInt & 0xFFE00000) != 0) {
/* 125 */           if ((paramInt & 0xF0000000) != 0) c(paramInt >>> 28 | 0x80, 1749161819);
/* 126 */           c(paramInt >>> 21 | 0x80, 1178942197);
/*     */         }
/* 128 */         c(paramInt >>> 14 | 0x80, 1711215454);
/*     */       }
/* 130 */       c(paramInt >>> 7 | 0x80, 1644253741);
/*     */     }
/* 132 */     c(paramInt & 0x7F, 1578943052);
/*     */   }
/*     */ 
/*     */   public int cd() {
/* 136 */     return this.m[((this.c += -941396361) * -196293817 - 1)] & 0xFF;
/*     */   }
/*     */ 
/*     */   public void ax(int paramInt, byte paramByte)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)paramInt);
/*     */     int tmp36_35 = (this.c + -941396361); this.c = tmp36_35; this.m[(tmp36_35 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */   }
/*     */ 
/*     */   public int fz()
/*     */   {
/* 458 */     this.c += 1470778213;
/* 459 */     return (this.m[(this.c * -196293817 - 3)] & 0xFF) + (((this.m[(-196293817 * this.c - 1)] & 0xFF) << 16) + ((this.m[(this.c * -196293817 - 2)] & 0xFF) << 8));
/*     */   }
/*     */ 
/*     */   public void fv(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)(128 + paramInt));
/*     */   }
/*     */ 
/*     */   public void cj(CharSequence paramCharSequence)
/*     */   {
/*  83 */     int i = es.r(paramCharSequence, 152299600);
/*     */     int tmp19_18 = (this.c + -941396361); this.c = tmp19_18; this.m[(tmp19_18 * -196293817 - 1)] = 0;
/*  85 */     y(i, 1424373430);
/*  86 */     this.c += cw.d(this.m, -196293817 * this.c, paramCharSequence, 1985538552) * -941396361;
/*     */   }
/*     */ 
/*     */   public int cb()
/*     */   {
/* 149 */     this.c += -1882792722;
/* 150 */     int i = ((this.m[(this.c * -196293817 - 2)] & 0xFF) << 8) + (this.m[(this.c * -196293817 - 1)] & 0xFF);
/* 151 */     if (i > 32767) i -= 65536;
/* 152 */     return i;
/*     */   }
/*     */ 
/*     */   public int cf() {
/* 156 */     this.c += 1470778213;
/* 157 */     return (this.m[(-196293817 * this.c - 1)] & 0xFF) + (((this.m[(this.c * -196293817 - 2)] & 0xFF) << 8) + ((this.m[(-196293817 * this.c - 3)] & 0xFF) << 16));
/*     */   }
/*     */ 
/*     */   public int cg()
/*     */   {
/* 156 */     this.c += 1470778213;
/* 157 */     return (this.m[(-196293817 * this.c - 1)] & 0xFF) + (((this.m[(this.c * -196293817 - 2)] & 0xFF) << 8) + ((this.m[(-196293817 * this.c - 3)] & 0xFF) << 16));
/*     */   }
/*     */ 
/*     */   public int dd() {
/* 161 */     this.c += 529381852;
/* 162 */     return ((this.m[(-196293817 * this.c - 2)] & 0xFF) << 8) + (((this.m[(-196293817 * this.c - 3)] & 0xFF) << 16) + ((this.m[(-196293817 * this.c - 4)] & 0xFF) << 24)) + (this.m[(this.c * -196293817 - 1)] & 0xFF);
/*     */   }
/*     */ 
/*     */   public int dg()
/*     */   {
/* 161 */     this.c += 529381852;
/* 162 */     return ((this.m[(-196293817 * this.c - 2)] & 0xFF) << 8) + (((this.m[(-196293817 * this.c - 3)] & 0xFF) << 16) + ((this.m[(-196293817 * this.c - 4)] & 0xFF) << 24)) + (this.m[(this.c * -196293817 - 1)] & 0xFF);
/*     */   }
/*     */ 
/*     */   public int aq(int paramInt)
/*     */   {
/* 391 */     return 0 - this.m[((this.c += -941396361) * -196293817 - 1)] & 0xFF;
/*     */   }
/*     */ 
/*     */   public void dy(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */   {
/* 251 */     for (int i = paramInt1; i < paramInt2 + paramInt1; i++)
/*     */     {
/*     */       int tmp26_25 = (this.c + -941396361); this.c = tmp26_25; paramArrayOfByte[i] = this.m[(tmp26_25 * -196293817 - 1)];
/*     */     }
/*     */   }
/*     */ 
/*     */   public long dz()
/*     */   {
/* 166 */     long l1 = h(-1471513341) & 0xFFFFFFFF;
/* 167 */     long l2 = h(-2059131746) & 0xFFFFFFFF;
/* 168 */     return (l1 << 32) + l2;
/*     */   }
/*     */ 
/*     */   public long da()
/*     */   {
/* 166 */     long l1 = h(972963594) & 0xFFFFFFFF;
/* 167 */     long l2 = h(-1656328769) & 0xFFFFFFFF;
/* 168 */     return (l1 << 32) + l2;
/*     */   }
/*     */ 
/*     */   public long dj()
/*     */   {
/* 166 */     long l1 = h(475684009) & 0xFFFFFFFF;
/* 167 */     long l2 = h(1945801819) & 0xFFFFFFFF;
/* 168 */     return (l1 << 32) + l2;
/*     */   }
/*     */ 
/*     */   public String dv() {
/* 172 */     if (this.m[(-196293817 * this.c)] == 0) {
/* 173 */       this.c += -941396361;
/* 174 */       return null;
/*     */     }
/* 176 */     return ad(-369893341);
/*     */   }
/*     */ 
/*     */   public String dc() {
/* 180 */     int i = -196293817 * this.c;
/* 181 */     while (this.m[((this.c += -941396361) * -196293817 - 1)] != 0);
/* 182 */     int k = -196293817 * this.c - i - 1;
/* 183 */     if (0 == k) return "";
/* 184 */     return ey.n(this.m, i, k, (byte)-28);
/*     */   }
/*     */ 
/*     */   public String dh()
/*     */   {
/* 172 */     if (this.m[(-196293817 * this.c)] == 0) {
/* 173 */       this.c += -941396361;
/* 174 */       return null;
/*     */     }
/* 176 */     return ad(1847837861);
/*     */   }
/*     */ 
/*     */   public String ad(int paramInt) {
/* 180 */     int i = -196293817 * this.c;
/* 181 */     while (this.m[((this.c += -941396361) * -196293817 - 1)] != 0) if (paramInt <= -1947308195);
/* 182 */     int k = -196293817 * this.c - i - 1;
/* 183 */     if (0 == k) { if (paramInt <= -1947308195) throw new IllegalStateException(); return ""; }
/* 184 */     return ey.n(this.m, i, k, (byte)-28);
/*     */   }
/*     */ 
/*     */   public String dp()
/*     */   {
/* 180 */     int i = -196293817 * this.c;
/* 181 */     while (this.m[((this.c += -941396361) * -196293817 - 1)] != 0);
/* 182 */     int k = -196293817 * this.c - i - 1;
/* 183 */     if (0 == k) return "";
/* 184 */     return ey.n(this.m, i, k, (byte)-4);
/*     */   }
/*     */ 
/*     */   public int ep()
/*     */   {
/* 395 */     return 128 - this.m[((this.c += -941396361) * -196293817 - 1)] & 0xFF;
/*     */   }
/*     */ 
/*     */   public String dm()
/*     */   {
/* 188 */     int i = this.m[((this.c += -941396361) * -196293817 - 1)];
/* 189 */     if (i != 0) throw new IllegalStateException("");
/* 190 */     int k = this.c * -196293817;
/* 191 */     while (this.m[((this.c += -941396361) * -196293817 - 1)] != 0);
/* 192 */     int i1 = this.c * -196293817 - k - 1;
/* 193 */     if (i1 == 0) return "";
/* 194 */     return ey.n(this.m, k, i1, (byte)-12);
/*     */   }
/*     */ 
/*     */   public String db() {
/* 198 */     int i = this.m[((this.c += -941396361) * -196293817 - 1)];
/* 199 */     if (0 != i) throw new IllegalStateException("");
/* 200 */     int k = ak((byte)2);
/* 201 */     if (k + -196293817 * this.c > this.m.length) throw new IllegalStateException("");
/*     */ 
/* 203 */     byte[] arrayOfByte = this.m;
/* 204 */     int i1 = -196293817 * this.c;
/*     */ 
/* 206 */     Object localObject = new char[k];
/* 207 */     int i2 = 0;
/* 208 */     int i3 = i1;
/* 209 */     int i4 = k + i1;
/* 210 */     while (i3 < i4) {
/* 211 */       int i5 = arrayOfByte[(i3++)] & 0xFF;
/*     */       int i6;
/* 213 */       if (i5 < 128) {
/* 214 */         if (i5 == 0) i6 = 65533; else
/* 215 */           i6 = i5;
/*     */       }
/* 217 */       else if (i5 < 192) i6 = 65533;
/* 218 */       else if (i5 < 224) {
/* 219 */         if ((i3 < i4) && (128 == (arrayOfByte[i3] & 0xC0))) {
/* 220 */           i6 = (i5 & 0x1F) << 6 | arrayOfByte[(i3++)] & 0x3F;
/* 221 */           if (i6 < 128) i6 = 65533; 
/*     */         }
/* 223 */         else { i6 = 65533; }
/*     */       }
/* 225 */       else if (i5 < 240) {
/* 226 */         if ((1 + i3 < i4) && (128 == (arrayOfByte[i3] & 0xC0)) && ((arrayOfByte[(1 + i3)] & 0xC0) == 128)) {
/* 227 */           i6 = (i5 & 0xF) << 12 | (arrayOfByte[(i3++)] & 0x3F) << 6 | arrayOfByte[(i3++)] & 0x3F;
/* 228 */           if (i6 < 2048) i6 = 65533; 
/*     */         }
/* 230 */         else { i6 = 65533; }
/*     */       }
/* 232 */       else if (i5 < 248) {
/* 233 */         if ((2 + i3 < i4) && (128 == (arrayOfByte[i3] & 0xC0)) && (128 == (arrayOfByte[(i3 + 1)] & 0xC0)) && ((arrayOfByte[(2 + i3)] & 0xC0) == 128)) {
/* 234 */           i6 = (i5 & 0x7) << 18 | (arrayOfByte[(i3++)] & 0x3F) << 12 | (arrayOfByte[(i3++)] & 0x3F) << 6 | arrayOfByte[(i3++)] & 0x3F;
/* 235 */           if ((i6 < 65536) || (i6 > 1114111)) i6 = 65533; else
/* 236 */             i6 = 65533;
/*     */         } else {
/* 238 */           i6 = 65533;
/*     */         }
/*     */       } else i6 = 65533;
/* 241 */       localObject[(i2++)] = ((char)i6);
/*     */     }
/* 243 */     String str = new String((char[])localObject, 0, i2);
/*     */ 
/* 245 */     localObject = str;
/* 246 */     this.c += k * -941396361;
/* 247 */     return localObject;
/*     */   }
/*     */ 
/*     */   public void v(int paramInt1, int paramInt2)
/*     */   {
/*  94 */     this.m[(-196293817 * this.c - paramInt1 - 4)] = ((byte)(paramInt1 >> 24));
/*  95 */     this.m[(this.c * -196293817 - paramInt1 - 3)] = ((byte)(paramInt1 >> 16));
/*  96 */     this.m[(-196293817 * this.c - paramInt1 - 2)] = ((byte)(paramInt1 >> 8));
/*  97 */     this.m[(-196293817 * this.c - paramInt1 - 1)] = ((byte)paramInt1);
/*     */   }
/*     */ 
/*     */   public void w(int paramInt1, int paramInt2) {
/* 101 */     this.m[(-196293817 * this.c - paramInt1 - 2)] = ((byte)(paramInt1 >> 8));
/* 102 */     this.m[(-196293817 * this.c - paramInt1 - 1)] = ((byte)paramInt1);
/*     */   }
/*     */ 
/*     */   public void du(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */   {
/* 251 */     for (int i = paramInt1; i < paramInt2 + paramInt1; i++)
/*     */     {
/*     */       int tmp26_25 = (this.c + -941396361); this.c = tmp26_25; paramArrayOfByte[i] = this.m[(tmp26_25 * -196293817 - 1)];
/*     */     }
/*     */   }
/*     */ 
/*     */   public void ej(BigInteger paramBigInteger1, BigInteger paramBigInteger2)
/*     */   {
/* 326 */     int i = -196293817 * this.c;
/* 327 */     this.c = 0;
/* 328 */     byte[] arrayOfByte1 = new byte[i];
/* 329 */     as(arrayOfByte1, 0, i, 1602313803);
/* 330 */     BigInteger localBigInteger1 = new BigInteger(arrayOfByte1);
/* 331 */     BigInteger localBigInteger2 = localBigInteger1.modPow(paramBigInteger1, paramBigInteger2);
/* 332 */     byte[] arrayOfByte2 = localBigInteger2.toByteArray();
/* 333 */     this.c = 0;
/* 334 */     n(arrayOfByte2.length, 1929654242);
/* 335 */     u(arrayOfByte2, 0, arrayOfByte2.length, (byte)123);
/*     */   }
/*     */ 
/*     */   public int de()
/*     */   {
/* 255 */     int i = this.m[(this.c * -196293817)] & 0xFF;
/* 256 */     if (i < 128) return t(1118814123) - 64;
/* 257 */     return k(-1987080889) - 49152;
/*     */   }
/*     */ 
/*     */   public byte ce()
/*     */   {
/* 140 */     return this.m[((this.c += -941396361) * -196293817 - 1)];
/*     */   }
/*     */ 
/*     */   public int bi(int paramInt)
/*     */   {
/* 437 */     this.c += -1882792722;
/* 438 */     int i = ((this.m[(-196293817 * this.c - 1)] & 0xFF) << 8) + (this.m[(-196293817 * this.c - 2)] & 0xFF);
/* 439 */     if (i > 32767) { if (paramInt > -919418135);
/* 439 */       i -= 65536; }
/* 440 */     return i;
/*     */   }
/*     */ 
/*     */   public int dn()
/*     */   {
/* 261 */     int i = this.m[(-196293817 * this.c)] & 0xFF;
/* 262 */     if (i < 128) return t(1118814123);
/* 263 */     return k(-1987080889) - 32768;
/*     */   }
/*     */ 
/*     */   public byte ci()
/*     */   {
/* 140 */     return this.m[((this.c += -941396361) * -196293817 - 1)];
/*     */   }
/*     */ 
/*     */   public int dx()
/*     */   {
/* 261 */     int i = this.m[(-196293817 * this.c)] & 0xFF;
/* 262 */     if (i < 128) return t(1118814123);
/* 263 */     return k(-1987080889) - 32768;
/*     */   }
/*     */ 
/*     */   public int dt() {
/* 267 */     if (this.m[(-196293817 * this.c)] < 0) return h(-657948647) & 0x7FFFFFFF;
/* 268 */     return k(-1987080889);
/*     */   }
/*     */ 
/*     */   public void by(int paramInt1, int paramInt2)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt1 >> 8));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)paramInt1);
/*     */     int tmp63_62 = (this.c + -941396361); this.c = tmp63_62; this.m[(tmp63_62 * -196293817 - 1)] = ((byte)(paramInt1 >> 24));
/*     */     int tmp90_89 = (this.c + -941396361); this.c = tmp90_89; this.m[(tmp90_89 * -196293817 - 1)] = ((byte)(paramInt1 >> 16));
/*     */   }
/*     */ 
/*     */   public int jdMethod_do()
/*     */   {
/* 261 */     int i = this.m[(-196293817 * this.c)] & 0xFF;
/* 262 */     if (i < 128) return t(1118814123);
/* 263 */     return k(-1987080889) - 32768;
/*     */   }
/*     */ 
/*     */   public void es(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/* 304 */     int i = -196293817 * this.c;
/* 305 */     this.c = (-941396361 * paramInt1);
/* 306 */     int k = (paramInt2 - paramInt1) / 8;
/* 307 */     for (int i1 = 0; i1 < k; i1++) {
/* 308 */       int i2 = h(-2065106677);
/* 309 */       int i3 = h(766327526);
/* 310 */       int i4 = -957401312;
/* 311 */       int i5 = -1640531527;
/* 312 */       int i6 = 32;
/* 313 */       while (i6-- > 0) {
/* 314 */         i3 -= ((i2 << 4 ^ i2 >>> 5) + i2 ^ paramArrayOfInt[(i4 >>> 11 & 0x3)] + i4);
/* 315 */         i4 -= i5;
/* 316 */         i2 -= ((i3 << 4 ^ i3 >>> 5) + i3 ^ i4 + paramArrayOfInt[(i4 & 0x3)]);
/*     */       }
/* 318 */       this.c -= 1058763704;
/* 319 */       z(i2, (byte)24);
/* 320 */       z(i3, (byte)70);
/*     */     }
/* 322 */     this.c = (-941396361 * i);
/*     */   }
/*     */ 
/*     */   public void ez(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/* 304 */     int i = -196293817 * this.c;
/* 305 */     this.c = (-941396361 * paramInt1);
/* 306 */     int k = (paramInt2 - paramInt1) / 8;
/* 307 */     for (int i1 = 0; i1 < k; i1++) {
/* 308 */       int i2 = h(1806672249);
/* 309 */       int i3 = h(1211037303);
/* 310 */       int i4 = -957401312;
/* 311 */       int i5 = -1640531527;
/* 312 */       int i6 = 32;
/* 313 */       while (i6-- > 0) {
/* 314 */         i3 -= ((i2 << 4 ^ i2 >>> 5) + i2 ^ paramArrayOfInt[(i4 >>> 11 & 0x3)] + i4);
/* 315 */         i4 -= i5;
/* 316 */         i2 -= ((i3 << 4 ^ i3 >>> 5) + i3 ^ i4 + paramArrayOfInt[(i4 & 0x3)]);
/*     */       }
/* 318 */       this.c -= 1058763704;
/* 319 */       z(i2, (byte)92);
/* 320 */       z(i3, (byte)25);
/*     */     }
/* 322 */     this.c = (-941396361 * i);
/*     */   }
/*     */ 
/*     */   public void ev(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
/* 326 */     int i = -196293817 * this.c;
/* 327 */     this.c = 0;
/* 328 */     byte[] arrayOfByte1 = new byte[i];
/* 329 */     as(arrayOfByte1, 0, i, 1602313803);
/* 330 */     BigInteger localBigInteger1 = new BigInteger(arrayOfByte1);
/* 331 */     BigInteger localBigInteger2 = localBigInteger1.modPow(paramBigInteger1, paramBigInteger2);
/* 332 */     byte[] arrayOfByte2 = localBigInteger2.toByteArray();
/* 333 */     this.c = 0;
/* 334 */     n(arrayOfByte2.length, 840190255);
/* 335 */     u(arrayOfByte2, 0, arrayOfByte2.length, (byte)92);
/*     */   }
/*     */ 
/*     */   public void ei(BigInteger paramBigInteger1, BigInteger paramBigInteger2)
/*     */   {
/* 326 */     int i = -196293817 * this.c;
/* 327 */     this.c = 0;
/* 328 */     byte[] arrayOfByte1 = new byte[i];
/* 329 */     as(arrayOfByte1, 0, i, 1602313803);
/* 330 */     BigInteger localBigInteger1 = new BigInteger(arrayOfByte1);
/* 331 */     BigInteger localBigInteger2 = localBigInteger1.modPow(paramBigInteger1, paramBigInteger2);
/* 332 */     byte[] arrayOfByte2 = localBigInteger2.toByteArray();
/* 333 */     this.c = 0;
/* 334 */     n(arrayOfByte2.length, -1571671825);
/* 335 */     u(arrayOfByte2, 0, arrayOfByte2.length, (byte)38);
/*     */   }
/*     */ 
/*     */   public void e(int paramInt, byte paramByte)
/*     */   {
/* 106 */     this.m[(this.c * -196293817 - paramInt - 1)] = ((byte)paramInt);
/*     */   }
/*     */ 
/*     */   public String di()
/*     */   {
/* 188 */     int i = this.m[((this.c += -941396361) * -196293817 - 1)];
/* 189 */     if (i != 0) throw new IllegalStateException("");
/* 190 */     int k = this.c * -196293817;
/* 191 */     while (this.m[((this.c += -941396361) * -196293817 - 1)] != 0);
/* 192 */     int i1 = this.c * -196293817 - k - 1;
/* 193 */     if (i1 == 0) return "";
/* 194 */     return ey.n(this.m, k, i1, (byte)-85);
/*     */   }
/*     */ 
/*     */   public int eh(int paramInt)
/*     */   {
/* 340 */     byte[] arrayOfByte = this.m;
/* 341 */     int k = -196293817 * this.c;
/*     */ 
/* 343 */     int i1 = -1;
/* 344 */     for (int i2 = paramInt; i2 < k; i2++) {
/* 345 */       i1 = i1 >>> 8 ^ n[((i1 ^ arrayOfByte[i2]) & 0xFF)];
/*     */     }
/* 347 */     i1 ^= -1;
/* 348 */     int i = i1;
/*     */ 
/* 350 */     i1 = i;
/* 351 */     z(i1, (byte)86);
/* 352 */     return i1;
/*     */   }
/*     */ 
/*     */   public int eg(int paramInt)
/*     */   {
/* 340 */     byte[] arrayOfByte = this.m;
/* 341 */     int k = -196293817 * this.c;
/*     */ 
/* 343 */     int i1 = -1;
/* 344 */     for (int i2 = paramInt; i2 < k; i2++) {
/* 345 */       i1 = i1 >>> 8 ^ n[((i1 ^ arrayOfByte[i2]) & 0xFF)];
/*     */     }
/* 347 */     i1 ^= -1;
/* 348 */     int i = i1;
/*     */ 
/* 350 */     i1 = i;
/* 351 */     z(i1, (byte)25);
/* 352 */     return i1;
/*     */   }
/*     */ 
/*     */   public int el(int paramInt)
/*     */   {
/* 340 */     byte[] arrayOfByte = this.m;
/* 341 */     int k = -196293817 * this.c;
/*     */ 
/* 343 */     int i1 = -1;
/* 344 */     for (int i2 = paramInt; i2 < k; i2++) {
/* 345 */       i1 = i1 >>> 8 ^ n[((i1 ^ arrayOfByte[i2]) & 0xFF)];
/*     */     }
/* 347 */     i1 ^= -1;
/* 348 */     int i = i1;
/*     */ 
/* 350 */     i1 = i;
/* 351 */     z(i1, (byte)33);
/* 352 */     return i1;
/*     */   }
/*     */ 
/*     */   public boolean en() {
/* 356 */     this.c -= 529381852;
/*     */ 
/* 358 */     byte[] arrayOfByte = this.m;
/* 359 */     int k = this.c * -196293817;
/*     */ 
/* 361 */     int i1 = -1;
/* 362 */     for (int i2 = 0; i2 < k; i2++) {
/* 363 */       i1 = i1 >>> 8 ^ n[((i1 ^ arrayOfByte[i2]) & 0xFF)];
/*     */     }
/* 365 */     i1 ^= -1;
/* 366 */     int i = i1;
/*     */ 
/* 368 */     i1 = i;
/* 369 */     i2 = h(1920634936);
/* 370 */     if (i2 == i1) return true;
/* 371 */     return false;
/*     */   }
/*     */ 
/*     */   public void ew(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt + 128));
/*     */   }
/*     */ 
/*     */   public void ek(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(0 - paramInt));
/*     */   }
/*     */ 
/*     */   public void eq(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(0 - paramInt));
/*     */   }
/*     */ 
/*     */   public void et(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(128 - paramInt));
/*     */   }
/*     */ 
/*     */   public int ee() {
/* 387 */     return this.m[((this.c += -941396361) * -196293817 - 1)] - 128 & 0xFF;
/*     */   }
/*     */ 
/*     */   public int ed() {
/* 391 */     return 0 - this.m[((this.c += -941396361) * -196293817 - 1)] & 0xFF;
/*     */   }
/*     */ 
/*     */   public void cy(int paramInt)
/*     */   {
/* 122 */     if ((paramInt & 0xFFFFFF80) != 0) {
/* 123 */       if (0 != (paramInt & 0xFFFFC000)) {
/* 124 */         if ((paramInt & 0xFFE00000) != 0) {
/* 125 */           if ((paramInt & 0xF0000000) != 0) c(paramInt >>> 28 | 0x80, 1644398462);
/* 126 */           c(paramInt >>> 21 | 0x80, 1803596472);
/*     */         }
/* 128 */         c(paramInt >>> 14 | 0x80, 1534127354);
/*     */       }
/* 130 */       c(paramInt >>> 7 | 0x80, 1778198666);
/*     */     }
/* 132 */     c(paramInt & 0x7F, 1655225685);
/*     */   }
/*     */ 
/*     */   public int a(byte paramByte)
/*     */   {
/* 156 */     this.c += 1470778213;
/* 157 */     return (this.m[(-196293817 * this.c - 1)] & 0xFF) + (((this.m[(this.c * -196293817 - 2)] & 0xFF) << 8) + ((this.m[(-196293817 * this.c - 3)] & 0xFF) << 16));
/*     */   }
/*     */ 
/*     */   public void u(byte[] paramArrayOfByte, int paramInt1, int paramInt2, byte paramByte)
/*     */   {
/*  90 */     for (int i = paramInt1; i < paramInt2 + paramInt1; i++) { if (paramByte <= 1) throw new IllegalStateException();
/*     */       int tmp37_36 = (this.c + -941396361); this.c = tmp37_36; this.m[(tmp37_36 * -196293817 - 1)] = paramArrayOfByte[i];
/*     */     }
/*     */   }
/*     */ 
/*     */   public int em()
/*     */   {
/* 395 */     return 128 - this.m[((this.c += -941396361) * -196293817 - 1)] & 0xFF;
/*     */   }
/*     */ 
/*     */   public byte ey() {
/* 399 */     return (byte)(this.m[((this.c += -941396361) * -196293817 - 1)] - 128); } 
/* 399 */   public byte ec() { return (byte)(this.m[((this.c += -941396361) * -196293817 - 1)] - 128); } 
/* 399 */   public byte eo() { return (byte)(this.m[((this.c += -941396361) * -196293817 - 1)] - 128); }
/*     */ 
/*     */   public byte eu()
/*     */   {
/* 403 */     return (byte)(128 - this.m[((this.c += -941396361) * -196293817 - 1)]); } 
/* 403 */   public byte fd() { return (byte)(128 - this.m[((this.c += -941396361) * -196293817 - 1)]); }
/*     */ 
/*     */ 
/*     */   public void fb(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)paramInt);
/*     */     int tmp36_35 = (this.c + -941396361); this.c = tmp36_35; this.m[(tmp36_35 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */   }
/*     */ 
/*     */   public String ac(byte paramByte)
/*     */   {
/* 188 */     int i = this.m[((this.c += -941396361) * -196293817 - 1)];
/* 189 */     if (i != 0) { if (paramByte < 1);
/* 189 */       throw new IllegalStateException(""); }
/* 190 */     int k = this.c * -196293817;
/* 191 */     while (this.m[((this.c += -941396361) * -196293817 - 1)] != 0) if (paramByte >= 1) throw new IllegalStateException();
/* 192 */     int i1 = this.c * -196293817 - k - 1;
/* 193 */     if (i1 == 0) { if (paramByte < 1);
/* 193 */       return ""; }
/* 194 */     return ey.n(this.m, k, i1, (byte)-43);
/*     */   }
/*     */ 
/*     */   public void fe(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)paramInt);
/*     */     int tmp36_35 = (this.c + -941396361); this.c = tmp36_35; this.m[(tmp36_35 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */   }
/*     */ 
/*     */   public void cu(int paramInt)
/*     */   {
/* 101 */     this.m[(-196293817 * this.c - paramInt - 2)] = ((byte)(paramInt >> 8));
/* 102 */     this.m[(-196293817 * this.c - paramInt - 1)] = ((byte)paramInt);
/*     */   }
/*     */ 
/*     */   public long dk()
/*     */   {
/* 166 */     long l1 = h(-1980864822) & 0xFFFFFFFF;
/* 167 */     long l2 = h(-1464348854) & 0xFFFFFFFF;
/* 168 */     return (l1 << 32) + l2;
/*     */   }
/*     */ 
/*     */   public void fu(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)(128 + paramInt));
/*     */   }
/*     */ 
/*     */   public void bq(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 499 */     for (int i = paramInt2 + paramInt1 - 1; i >= paramInt1; i--) { if (paramInt3 <= 1238025423) throw new IllegalStateException();
/*     */       int tmp44_43 = (this.c + -941396361); this.c = tmp44_43; paramArrayOfByte[i] = this.m[(tmp44_43 * -196293817 - 1)];
/*     */     }
/*     */   }
/*     */ 
/*     */   public void gd(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)paramInt);
/*     */     int tmp63_62 = (this.c + -941396361); this.c = tmp63_62; this.m[(tmp63_62 * -196293817 - 1)] = ((byte)(paramInt >> 24));
/*     */     int tmp90_89 = (this.c + -941396361); this.c = tmp90_89; this.m[(tmp90_89 * -196293817 - 1)] = ((byte)(paramInt >> 16));
/*     */   }
/*     */ 
/*     */   public int cx()
/*     */   {
/* 136 */     return this.m[((this.c += -941396361) * -196293817 - 1)] & 0xFF;
/*     */   }
/*     */ 
/*     */   public int fa()
/*     */   {
/* 422 */     this.c += -1882792722;
/* 423 */     return (this.m[(this.c * -196293817 - 2)] & 0xFF) + ((this.m[(-196293817 * this.c - 1)] & 0xFF) << 8);
/*     */   }
/*     */ 
/*     */   public int fq()
/*     */   {
/* 422 */     this.c += -1882792722;
/* 423 */     return (this.m[(this.c * -196293817 - 2)] & 0xFF) + ((this.m[(-196293817 * this.c - 1)] & 0xFF) << 8);
/*     */   }
/*     */ 
/*     */   public void bm(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)paramInt);
/*     */   }
/*     */ 
/*     */   public void gm(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt >> 16));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)(paramInt >> 24));
/*     */     int tmp66_65 = (this.c + -941396361); this.c = tmp66_65; this.m[(tmp66_65 * -196293817 - 1)] = ((byte)paramInt);
/*     */     int tmp90_89 = (this.c + -941396361); this.c = tmp90_89; this.m[(tmp90_89 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */   }
/*     */ 
/*     */   public int fs()
/*     */   {
/* 432 */     this.c += -1882792722;
/* 433 */     return (this.m[(this.c * -196293817 - 2)] - 128 & 0xFF) + ((this.m[(this.c * -196293817 - 1)] & 0xFF) << 8);
/*     */   }
/*     */ 
/*     */   public int fh() {
/* 437 */     this.c += -1882792722;
/* 438 */     int i = ((this.m[(-196293817 * this.c - 1)] & 0xFF) << 8) + (this.m[(-196293817 * this.c - 2)] & 0xFF);
/* 439 */     if (i > 32767) i -= 65536;
/* 440 */     return i;
/*     */   }
/*     */ 
/*     */   public int ff()
/*     */   {
/* 451 */     this.c += -1882792722;
/* 452 */     int i = ((this.m[(-196293817 * this.c - 1)] & 0xFF) << 8) + (this.m[(this.c * -196293817 - 2)] - 128 & 0xFF);
/* 453 */     if (i > 32767) i -= 65536;
/* 454 */     return i;
/*     */   }
/*     */ 
/*     */   public int fy()
/*     */   {
/* 451 */     this.c += -1882792722;
/* 452 */     int i = ((this.m[(-196293817 * this.c - 1)] & 0xFF) << 8) + (this.m[(this.c * -196293817 - 2)] - 128 & 0xFF);
/* 453 */     if (i > 32767) i -= 65536;
/* 454 */     return i;
/*     */   }
/*     */ 
/*     */   public int fn() {
/* 458 */     this.c += 1470778213;
/* 459 */     return (this.m[(this.c * -196293817 - 3)] & 0xFF) + (((this.m[(-196293817 * this.c - 1)] & 0xFF) << 16) + ((this.m[(this.c * -196293817 - 2)] & 0xFF) << 8));
/*     */   }
/*     */ 
/*     */   public void az(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 282 */     int i = -196293817 * this.c;
/* 283 */     this.c = (-941396361 * paramInt1);
/* 284 */     int k = (paramInt2 - paramInt1) / 8;
/* 285 */     for (int i1 = 0; i1 < k; i1++) { if (paramInt3 <= -1090880349) return;
/* 286 */       int i2 = h(919911596);
/* 287 */       int i3 = h(-1693739651);
/* 288 */       int i4 = 0;
/* 289 */       int i5 = -1640531527;
/* 290 */       int i6 = 32;
/* 291 */       while (i6-- > 0) { if (paramInt3 > -1090880349);
/* 292 */         i2 += ((i3 << 4 ^ i3 >>> 5) + i3 ^ paramArrayOfInt[(i4 & 0x3)] + i4);
/* 293 */         i4 += i5;
/* 294 */         i3 += ((i2 << 4 ^ i2 >>> 5) + i2 ^ paramArrayOfInt[(i4 >>> 11 & 0x3)] + i4);
/*     */       }
/* 296 */       this.c -= 1058763704;
/* 297 */       z(i2, (byte)88);
/* 298 */       z(i3, (byte)56);
/*     */     }
/* 300 */     this.c = (-941396361 * i);
/*     */   }
/*     */ 
/*     */   public ev(int paramInt)
/*     */   {
/*  29 */     this.m = bv.r(paramInt, 1985237951);
/*  30 */     this.c = 0;
/*     */   }
/*     */ 
/*     */   public void fj(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)paramInt);
/*     */     int tmp36_35 = (this.c + -941396361); this.c = tmp36_35; this.m[(tmp36_35 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */   }
/*     */ 
/*     */   public void fm(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)paramInt);
/*     */     int tmp36_35 = (this.c + -941396361); this.c = tmp36_35; this.m[(tmp36_35 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp63_62 = (this.c + -941396361); this.c = tmp63_62; this.m[(tmp63_62 * -196293817 - 1)] = ((byte)(paramInt >> 16));
/*     */     int tmp90_89 = (this.c + -941396361); this.c = tmp90_89; this.m[(tmp90_89 * -196293817 - 1)] = ((byte)(paramInt >> 24));
/*     */   }
/*     */ 
/*     */   public void fi(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)paramInt);
/*     */     int tmp36_35 = (this.c + -941396361); this.c = tmp36_35; this.m[(tmp36_35 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp63_62 = (this.c + -941396361); this.c = tmp63_62; this.m[(tmp63_62 * -196293817 - 1)] = ((byte)(paramInt >> 16));
/*     */     int tmp90_89 = (this.c + -941396361); this.c = tmp90_89; this.m[(tmp90_89 * -196293817 - 1)] = ((byte)(paramInt >> 24));
/*     */   }
/*     */ 
/*     */   public void ge(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)paramInt);
/*     */     int tmp36_35 = (this.c + -941396361); this.c = tmp36_35; this.m[(tmp36_35 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp63_62 = (this.c + -941396361); this.c = tmp63_62; this.m[(tmp63_62 * -196293817 - 1)] = ((byte)(paramInt >> 16));
/*     */     int tmp90_89 = (this.c + -941396361); this.c = tmp90_89; this.m[(tmp90_89 * -196293817 - 1)] = ((byte)(paramInt >> 24));
/*     */   }
/*     */ 
/*     */   public void gq(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)paramInt);
/*     */     int tmp36_35 = (this.c + -941396361); this.c = tmp36_35; this.m[(tmp36_35 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp63_62 = (this.c + -941396361); this.c = tmp63_62; this.m[(tmp63_62 * -196293817 - 1)] = ((byte)(paramInt >> 16));
/*     */     int tmp90_89 = (this.c + -941396361); this.c = tmp90_89; this.m[(tmp90_89 * -196293817 - 1)] = ((byte)(paramInt >> 24));
/*     */   }
/*     */ 
/*     */   public void gr(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)paramInt);
/*     */     int tmp36_35 = (this.c + -941396361); this.c = tmp36_35; this.m[(tmp36_35 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp63_62 = (this.c + -941396361); this.c = tmp63_62; this.m[(tmp63_62 * -196293817 - 1)] = ((byte)(paramInt >> 16));
/*     */     int tmp90_89 = (this.c + -941396361); this.c = tmp90_89; this.m[(tmp90_89 * -196293817 - 1)] = ((byte)(paramInt >> 24));
/*     */   }
/*     */ 
/*     */   public void z(int paramInt, byte paramByte)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt >> 24));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)(paramInt >> 16));
/*     */     int tmp66_65 = (this.c + -941396361); this.c = tmp66_65; this.m[(tmp66_65 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */     int tmp93_92 = (this.c + -941396361); this.c = tmp93_92; this.m[(tmp93_92 * -196293817 - 1)] = ((byte)paramInt);
/*     */   }
/*     */ 
/*     */   public void gh(int paramInt)
/*     */   {
/*     */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt >> 16));
/*     */     int tmp39_38 = (this.c + -941396361); this.c = tmp39_38; this.m[(tmp39_38 * -196293817 - 1)] = ((byte)(paramInt >> 24));
/*     */     int tmp66_65 = (this.c + -941396361); this.c = tmp66_65; this.m[(tmp66_65 * -196293817 - 1)] = ((byte)paramInt);
/*     */     int tmp90_89 = (this.c + -941396361); this.c = tmp90_89; this.m[(tmp90_89 * -196293817 - 1)] = ((byte)(paramInt >> 8));
/*     */   }
/*     */ 
/*     */   public static int bd(String paramString)
/*     */   {
/*  72 */     return paramString.length() + 1;
/*     */   }
/*     */ 
/*     */   public void cp(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */   {
/*  90 */     for (int i = paramInt1; i < paramInt2 + paramInt1; i++)
/*     */     {
/*     */       int tmp23_22 = (this.c + -941396361); this.c = tmp23_22; this.m[(tmp23_22 * -196293817 - 1)] = paramArrayOfByte[i];
/*     */     }
/*     */   }
/*     */ 
/*     */   public String ds()
/*     */   {
/* 172 */     if (this.m[(-196293817 * this.c)] == 0) {
/* 173 */       this.c += -941396361;
/* 174 */       return null;
/*     */     }
/* 176 */     return ad(-146827828);
/*     */   }
/*     */ 
/*     */   public int gj()
/*     */   {
/* 484 */     this.c += 529381852;
/* 485 */     return (this.m[(-196293817 * this.c - 4)] & 0xFF) + (((this.m[(-196293817 * this.c - 2)] & 0xFF) << 16) + ((this.m[(this.c * -196293817 - 1)] & 0xFF) << 24) + ((this.m[(-196293817 * this.c - 3)] & 0xFF) << 8));
/*     */   }
/*     */ 
/*     */   public int gk()
/*     */   {
/* 484 */     this.c += 529381852;
/* 485 */     return (this.m[(-196293817 * this.c - 4)] & 0xFF) + (((this.m[(-196293817 * this.c - 2)] & 0xFF) << 16) + ((this.m[(this.c * -196293817 - 1)] & 0xFF) << 24) + ((this.m[(-196293817 * this.c - 3)] & 0xFF) << 8));
/*     */   }
/*     */ 
/*     */   public int gx() {
/* 489 */     this.c += 529381852;
/* 490 */     return ((this.m[(this.c * -196293817 - 4)] & 0xFF) << 8) + (((this.m[(-196293817 * this.c - 2)] & 0xFF) << 24) + ((this.m[(-196293817 * this.c - 1)] & 0xFF) << 16)) + (this.m[(-196293817 * this.c - 3)] & 0xFF);
/*     */   }
/*     */ 
/*     */   public int gl()
/*     */   {
/* 489 */     this.c += 529381852;
/* 490 */     return ((this.m[(this.c * -196293817 - 4)] & 0xFF) << 8) + (((this.m[(-196293817 * this.c - 2)] & 0xFF) << 24) + ((this.m[(-196293817 * this.c - 1)] & 0xFF) << 16)) + (this.m[(-196293817 * this.c - 3)] & 0xFF);
/*     */   }
/*     */ 
/*     */   public int gz()
/*     */   {
/* 489 */     this.c += 529381852;
/* 490 */     return ((this.m[(this.c * -196293817 - 4)] & 0xFF) << 8) + (((this.m[(-196293817 * this.c - 2)] & 0xFF) << 24) + ((this.m[(-196293817 * this.c - 1)] & 0xFF) << 16)) + (this.m[(-196293817 * this.c - 3)] & 0xFF);
/*     */   }
/*     */ 
/*     */   public ev(byte[] paramArrayOfByte)
/*     */   {
/*  34 */     this.m = paramArrayOfByte;
/*  35 */     this.c = 0;
/*     */   }
/*     */ 
/*     */   public void cm(int paramInt)
/*     */   {
/* 110 */     if ((paramInt >= 0) && (paramInt < 128)) {
/* 111 */       c(paramInt, 1759148543);
/* 112 */       return;
/*     */     }
/* 114 */     if ((paramInt >= 0) && (paramInt < 32768)) {
/* 115 */       n(paramInt + 32768, -2062991932);
/* 116 */       return;
/*     */     }
/* 118 */     throw new IllegalArgumentException();
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ev
 * JD-Core Version:    0.6.2
 */