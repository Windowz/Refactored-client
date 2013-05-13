/*     */ public class ef extends dg
/*     */ {
/*     */   int m;
/*     */   byte[] j;
/*     */   eq[] c;
/*     */   int[] i;
/*     */   byte[] z;
/*     */   cr[] g;
/*     */   byte[] q;
/*     */   short[] n;
/*     */   static fq[] fx;
/*     */ 
/*     */   void q()
/*     */   {
/* 327 */     this.i = null;
/*     */   }
/*     */ 
/*     */   ef(byte[] paramArrayOfByte)
/*     */   {
/*  27 */     this.c = new eq[''];
/*  28 */     this.n = new short[''];
/*  29 */     this.j = new byte[''];
/*  30 */     this.z = new byte[''];
/*  31 */     this.g = new cr[''];
/*  32 */     this.q = new byte[''];
/*  33 */     this.i = new int[''];
/*  34 */     ev localev = new ev(paramArrayOfByte);
/*  35 */     int k = 0;
/*  36 */     while (localev.m[(k + -196293817 * localev.c)] != 0) k++;
/*  37 */     byte[] arrayOfByte1 = new byte[k];
/*  38 */     for (int i1 = 0; i1 < k; i1++) arrayOfByte1[i1] = localev.f(2002687137);
/*  39 */     localev.c += -941396361;
/*  40 */     k++;
/*  41 */     i1 = -196293817 * localev.c;
/*  42 */     localev.c += -941396361 * k;
/*  43 */     int i2 = 0;
/*  44 */     while (0 != localev.m[(i2 + -196293817 * localev.c)]) i2++;
/*  45 */     byte[] arrayOfByte2 = new byte[i2];
/*  46 */     for (int i3 = 0; i3 < i2; i3++) arrayOfByte2[i3] = localev.f(2002687137);
/*  47 */     localev.c += -941396361;
/*  48 */     i2++;
/*  49 */     i3 = -196293817 * localev.c;
/*  50 */     localev.c += i2 * -941396361;
/*  51 */     int i4 = 0;
/*  52 */     while (0 != localev.m[(-196293817 * localev.c + i4)]) i4++;
/*  53 */     byte[] arrayOfByte3 = new byte[i4];
/*  54 */     for (int i5 = 0; i5 < i4; i5++) arrayOfByte3[i5] = localev.f(2002687137);
/*  55 */     localev.c += -941396361;
/*  56 */     i4++;
/*  57 */     byte[] arrayOfByte4 = new byte[i4];
/*     */     int i6;
/*  59 */     if (i4 > 1) {
/*  60 */       arrayOfByte4[1] = 1;
/*  61 */       int i7 = 1;
/*  62 */       i6 = 2;
/*  63 */       for (i8 = 2; i8 < i4; i8++) {
/*  64 */         int i9 = localev.t(1118814123);
/*  65 */         if (0 == i9) { i7 = i6++;
/*     */         } else {
/*  67 */           if (i9 <= i7) i9--;
/*  68 */           i7 = i9;
/*     */         }
/*  70 */         arrayOfByte4[i8] = ((byte)i7);
/*     */       }
/*     */     } else {
/*  73 */       i6 = i4;
/*  74 */     }cr[] arrayOfcr = new cr[i6];
/*  75 */     for (int i8 = 0; i8 < arrayOfcr.length; i8++) {
/*  76 */       localcr1 = arrayOfcr[i8] =  = new cr();
/*  77 */       int i10 = localev.t(1118814123);
/*  78 */       if (i10 > 0) localcr1.r = new byte[i10 * 2];
/*  79 */       i10 = localev.t(1118814123);
/*  80 */       if (i10 > 0) {
/*  81 */         localcr1.d = new byte[2 + 2 * i10];
/*  82 */         localcr1.d[1] = 64;
/*     */       }
/*     */     }
/*  85 */     i8 = localev.t(1118814123);
/*  86 */     cr localcr1 = i8 > 0 ? new byte[i8 * 2] : null;
/*  87 */     i8 = localev.t(1118814123);
/*  88 */     Object localObject = i8 > 0 ? new byte[2 * i8] : null;
/*  89 */     int i11 = 0;
/*  90 */     while (0 != localev.m[(-196293817 * localev.c + i11)]) i11++;
/*  91 */     byte[] arrayOfByte5 = new byte[i11];
/*  92 */     for (int i12 = 0; i12 < i11; i12++) arrayOfByte5[i12] = localev.f(2002687137);
/*  93 */     localev.c += -941396361;
/*  94 */     i11++;
/*  95 */     i12 = 0;
/*  96 */     for (int i13 = 0; i13 < 128; i13++) {
/*  97 */       i12 += localev.t(1118814123);
/*  98 */       this.n[i13] = ((short)i12);
/*     */     }
/* 100 */     i12 = 0;
/* 101 */     for (i13 = 0; i13 < 128; i13++) {
/* 102 */       i12 += localev.t(1118814123);
/*     */       int tmp730_728 = i13;
/*     */       short[] tmp730_725 = this.n; tmp730_725[tmp730_728] = ((short)(tmp730_725[tmp730_728] + (i12 << 8)));
/*     */     }
/* 105 */     i13 = 0;
/* 106 */     int i14 = 0;
/* 107 */     int i15 = 0;
/* 108 */     for (int i16 = 0; i16 < 128; i16++) {
/* 109 */       if (0 == i13) {
/* 110 */         if (i14 < arrayOfByte5.length) i13 = arrayOfByte5[(i14++)]; else
/* 111 */           i13 = -1;
/* 112 */         i15 = localev.ak((byte)2);
/*     */       }
/*     */       int tmp809_807 = i16;
/*     */       short[] tmp809_804 = this.n; tmp809_804[tmp809_807] = ((short)(tmp809_804[tmp809_807] + ((i15 - 1 & 0x2) << 14)));
/* 115 */       this.i[i16] = i15;
/* 116 */       i13--;
/*     */     }
/* 118 */     i13 = 0;
/* 119 */     i14 = 0;
/* 120 */     i16 = 0;
/* 121 */     for (int i17 = 0; i17 < 128; i17++)
/* 122 */       if (0 != this.i[i17]) {
/* 123 */         if (0 == i13) {
/* 124 */           if (i14 < arrayOfByte1.length) i13 = arrayOfByte1[(i14++)]; else
/* 125 */             i13 = -1;
/* 126 */           i16 = localev.m[(i1++)] - 1;
/*     */         }
/* 128 */         this.q[i17] = ((byte)i16);
/* 129 */         i13--;
/*     */       }
/* 131 */     i13 = 0;
/* 132 */     i14 = 0;
/* 133 */     i17 = 0;
/* 134 */     for (int i18 = 0; i18 < 128; i18++)
/* 135 */       if (0 != this.i[i18]) {
/* 136 */         if (0 == i13) {
/* 137 */           if (i14 < arrayOfByte2.length) i13 = arrayOfByte2[(i14++)]; else
/* 138 */             i13 = -1;
/* 139 */           i17 = localev.m[(i3++)] + 16 << 2;
/*     */         }
/* 141 */         this.z[i18] = ((byte)i17);
/* 142 */         i13--;
/*     */       }
/* 144 */     i13 = 0;
/* 145 */     i14 = 0;
/* 146 */     cr localcr2 = null;
/* 147 */     for (int i19 = 0; i19 < 128; i19++)
/* 148 */       if (this.i[i19] != 0) {
/* 149 */         if (0 == i13) {
/* 150 */           localcr2 = arrayOfcr[arrayOfByte4[i14]];
/* 151 */           if (i14 < arrayOfByte3.length) i13 = arrayOfByte3[(i14++)]; else
/* 152 */             i13 = -1;
/*     */         }
/* 154 */         this.g[i19] = localcr2;
/* 155 */         i13--;
/*     */       }
/* 157 */     i13 = 0;
/* 158 */     i14 = 0;
/* 159 */     i19 = 0;
/* 160 */     for (int i20 = 0; i20 < 128; i20++) {
/* 161 */       if (0 == i13) {
/* 162 */         if (i14 < arrayOfByte5.length) i13 = arrayOfByte5[(i14++)]; else
/* 163 */           i13 = -1;
/* 164 */         if (this.i[i20] > 0) i19 = localev.t(1118814123) + 1;
/*     */       }
/* 166 */       this.j[i20] = ((byte)i19);
/* 167 */       i13--;
/*     */     }
/* 169 */     this.m = ((localev.t(1118814123) + 1) * -68998541);
/*     */     cr localcr3;
/*     */     int i22;
/* 170 */     for (i20 = 0; i20 < i6; i20++) {
/* 171 */       localcr3 = arrayOfcr[i20];
/* 172 */       if (localcr3.r != null) {
/* 173 */         for (i22 = 1; i22 < localcr3.r.length; i22 += 2) localcr3.r[i22] = localev.f(2002687137);
/*     */       }
/* 175 */       if (localcr3.d != null) {
/* 176 */         for (i22 = 3; i22 < localcr3.d.length - 2; i22 += 2) localcr3.d[i22] = localev.f(2002687137);
/*     */       }
/*     */     }
/* 179 */     if (localcr1 != null) {
/* 180 */       for (i20 = 1; i20 < localcr1.length; i20 += 2) localcr1[i20] = localev.f(2002687137);
/*     */     }
/* 182 */     if (null != localObject) {
/* 183 */       for (i20 = 1; i20 < localObject.length; i20 += 2) localObject[i20] = localev.f(2002687137);
/*     */     }
/* 185 */     for (i20 = 0; i20 < i6; i20++) {
/* 186 */       localcr3 = arrayOfcr[i20];
/* 187 */       if (localcr3.d != null) {
/* 188 */         i12 = 0;
/* 189 */         for (i22 = 2; i22 < localcr3.d.length; i22 += 2) {
/* 190 */           i12 = 1 + i12 + localev.t(1118814123);
/* 191 */           localcr3.d[i22] = ((byte)i12);
/*     */         }
/*     */       }
/*     */     }
/* 195 */     for (i20 = 0; i20 < i6; i20++) {
/* 196 */       localcr3 = arrayOfcr[i20];
/* 197 */       if (localcr3.r != null) {
/* 198 */         i12 = 0;
/* 199 */         for (i22 = 2; i22 < localcr3.r.length; i22 += 2) {
/* 200 */           i12 = i12 + 1 + localev.t(1118814123);
/* 201 */           localcr3.r[i22] = ((byte)i12);
/*     */         }
/*     */       }
/*     */     }
/*     */     int i21;
/*     */     int i23;
/*     */     int i24;
/*     */     int i25;
/*     */     int i26;
/*     */     int i28;
/*     */     int i29;
/*     */     int i27;
/* 205 */     if (null != localcr1) {
/* 206 */       i12 = localev.t(1118814123);
/* 207 */       localcr1[0] = ((byte)i12);
/* 208 */       for (i20 = 2; i20 < localcr1.length; i20 += 2) {
/* 209 */         i12 = 1 + i12 + localev.t(1118814123);
/* 210 */         localcr1[i20] = ((byte)i12);
/*     */       }
/* 212 */       i20 = localcr1[0];
/* 213 */       i21 = localcr1[1];
/* 214 */       for (i22 = 0; i22 < i20; i22++) this.j[i22] = ((byte)(this.j[i22] * i21 + 32 >> 6));
/* 215 */       i22 = 2;
/* 216 */       while (i22 < localcr1.length) {
/* 217 */         i23 = localcr1[i22];
/* 218 */         i24 = localcr1[(1 + i22)];
/* 219 */         i25 = (i23 - i20) / 2 + i21 * (i23 - i20);
/* 220 */         for (i26 = i20; i26 < i23; i26++)
/*     */         {
/* 222 */           i28 = i23 - i20;
/*     */ 
/* 224 */           i29 = i25 >>> 31;
/* 225 */           i27 = (i29 + i25) / i28 - i29;
/*     */ 
/* 227 */           i29 = i27;
/* 228 */           this.j[i26] = ((byte)(i29 * this.j[i26] + 32 >> 6));
/* 229 */           i25 += i24 - i21;
/*     */         }
/* 231 */         i20 = i23;
/* 232 */         i21 = i24;
/* 233 */         i22 += 2;
/*     */       }
/* 235 */       for (i23 = i20; i23 < 128; i23++) this.j[i23] = ((byte)(32 + i21 * this.j[i23] >> 6));
/* 236 */       localcr1 = null;
/*     */     }
/* 238 */     if (null != localObject) {
/* 239 */       i12 = localev.t(1118814123);
/* 240 */       localObject[0] = ((byte)i12);
/* 241 */       for (i20 = 2; i20 < localObject.length; i20 += 2) {
/* 242 */         i12 = i12 + 1 + localev.t(1118814123);
/* 243 */         localObject[i20] = ((byte)i12);
/*     */       }
/* 245 */       i20 = localObject[0];
/* 246 */       i21 = localObject[1] << 1;
/* 247 */       for (i22 = 0; i22 < i20; i22++) {
/* 248 */         i23 = i21 + (this.z[i22] & 0xFF);
/* 249 */         if (i23 < 0) i23 = 0;
/* 250 */         if (i23 > 128) i23 = 128;
/* 251 */         this.z[i22] = ((byte)i23);
/*     */       }
/* 253 */       i22 = 2;
/* 254 */       while (i22 < localObject.length) {
/* 255 */         i23 = localObject[i22];
/* 256 */         i24 = localObject[(1 + i22)] << 1;
/* 257 */         i25 = (i23 - i20) / 2 + i21 * (i23 - i20);
/* 258 */         for (i26 = i20; i26 < i23; i26++)
/*     */         {
/* 260 */           i28 = i23 - i20;
/*     */ 
/* 262 */           i29 = i25 >>> 31;
/* 263 */           i27 = (i29 + i25) / i28 - i29;
/*     */ 
/* 265 */           i29 = i27;
/* 266 */           int i30 = i29 + (this.z[i26] & 0xFF);
/* 267 */           if (i30 < 0) i30 = 0;
/* 268 */           if (i30 > 128) i30 = 128;
/* 269 */           this.z[i26] = ((byte)i30);
/* 270 */           i25 += i24 - i21;
/*     */         }
/* 272 */         i20 = i23;
/* 273 */         i21 = i24;
/* 274 */         i22 += 2;
/*     */       }
/* 276 */       for (i23 = i20; i23 < 128; i23++) {
/* 277 */         i24 = i21 + (this.z[i23] & 0xFF);
/* 278 */         if (i24 < 0) i24 = 0;
/* 279 */         if (i24 > 128) i24 = 128;
/* 280 */         this.z[i23] = ((byte)i24);
/*     */       }
/* 282 */       localObject = null;
/*     */     }
/* 284 */     for (i20 = 0; i20 < i6; i20++) arrayOfcr[i20].l = (localev.t(1118814123) * 1020095983);
/*     */     cr localcr4;
/* 285 */     for (i20 = 0; i20 < i6; i20++) {
/* 286 */       localcr4 = arrayOfcr[i20];
/* 287 */       if (localcr4.r != null) localcr4.m = (localev.t(1118814123) * 747021127);
/* 288 */       if (null != localcr4.d) localcr4.c = (localev.t(1118814123) * 2037240079);
/* 289 */       if (localcr4.l * -358522609 > 0) localcr4.n = (localev.t(1118814123) * -541700579);
/*     */     }
/* 291 */     for (i20 = 0; i20 < i6; i20++) arrayOfcr[i20].z = (localev.t(1118814123) * -1158841629);
/* 292 */     for (i20 = 0; i20 < i6; i20++) {
/* 293 */       localcr4 = arrayOfcr[i20];
/* 294 */       if (localcr4.z * -1415472437 > 0) localcr4.j = (localev.t(1118814123) * -480148525);
/*     */     }
/* 296 */     for (i20 = 0; i20 < i6; i20++) {
/* 297 */       localcr4 = arrayOfcr[i20];
/* 298 */       if (localcr4.j * 1598999643 > 0) localcr4.g = (localev.t(1118814123) * 845678517);
/*     */     }
/*     */   }
/*     */ 
/*     */   void j(byte paramByte)
/*     */   {
/* 327 */     this.i = null;
/*     */   }
/*     */ 
/*     */   boolean z(a parama, byte[] paramArrayOfByte, int[] paramArrayOfInt)
/*     */   {
/* 303 */     boolean bool = true;
/* 304 */     int k = 0;
/* 305 */     eq localeq = null;
/* 306 */     for (int i1 = 0; i1 < 128; i1++)
/* 307 */       if ((null == paramArrayOfByte) || (paramArrayOfByte[i1] != 0)) {
/* 308 */         int i2 = this.i[i1];
/* 309 */         if (0 != i2) {
/* 310 */           if (i2 != k) {
/* 311 */             k = i2;
/* 312 */             i2--;
/* 313 */             if (0 == (i2 & 0x1)) localeq = parama.l(i2 >> 2, paramArrayOfInt, -1649775926); else
/* 314 */               localeq = parama.m(i2 >> 2, paramArrayOfInt, 1739815656);
/* 315 */             if (localeq == null) bool = false;
/*     */           }
/* 317 */           if (localeq != null) {
/* 318 */             this.c[i1] = localeq;
/* 319 */             this.i[i1] = 0;
/*     */           }
/*     */         }
/*     */       }
/* 323 */     return bool;
/*     */   }
/*     */ 
/*     */   boolean g(a parama, byte[] paramArrayOfByte, int[] paramArrayOfInt)
/*     */   {
/* 303 */     boolean bool = true;
/* 304 */     int k = 0;
/* 305 */     eq localeq = null;
/* 306 */     for (int i1 = 0; i1 < 128; i1++)
/* 307 */       if ((null == paramArrayOfByte) || (paramArrayOfByte[i1] != 0)) {
/* 308 */         int i2 = this.i[i1];
/* 309 */         if (0 != i2) {
/* 310 */           if (i2 != k) {
/* 311 */             k = i2;
/* 312 */             i2--;
/* 313 */             if (0 == (i2 & 0x1)) localeq = parama.l(i2 >> 2, paramArrayOfInt, -207235967); else
/* 314 */               localeq = parama.m(i2 >> 2, paramArrayOfInt, -1638870231);
/* 315 */             if (localeq == null) bool = false;
/*     */           }
/* 317 */           if (localeq != null) {
/* 318 */             this.c[i1] = localeq;
/* 319 */             this.i[i1] = 0;
/*     */           }
/*     */         }
/*     */       }
/* 323 */     return bool;
/*     */   }
/*     */ 
/*     */   boolean n(a parama, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt)
/*     */   {
/* 303 */     boolean bool = true;
/* 304 */     int k = 0;
/* 305 */     eq localeq = null;
/* 306 */     for (int i1 = 0; i1 < 128; i1++) { if (paramInt != 526957205) throw new IllegalStateException();
/* 307 */       if (null != paramArrayOfByte) { if ((paramInt == 526957205) && (paramArrayOfByte[i1] == 0)) continue; if (paramInt != 526957205) throw new IllegalStateException(); 
/*     */       }
/* 308 */       int i2 = this.i[i1];
/* 309 */       if (0 == i2) { if (paramInt != 526957205); } else {
/* 310 */         if (i2 != k) { if (paramInt == 526957205);
/* 311 */           k = i2;
/* 312 */           i2--;
/* 313 */           if (0 == (i2 & 0x1)) { if (paramInt == 526957205);
/* 313 */             localeq = parama.l(i2 >> 2, paramArrayOfInt, -1159253851); } else {
/* 314 */             localeq = parama.m(i2 >> 2, paramArrayOfInt, 1461469202);
/* 315 */           }if (localeq == null) { if (paramInt != 526957205) throw new IllegalStateException(); bool = false; }
/*     */         }
/* 317 */         if (localeq != null) { if (paramInt != 526957205) throw new IllegalStateException();
/* 318 */           this.c[i1] = localeq;
/* 319 */           this.i[i1] = 0;
/*     */         }
/*     */       }
/*     */     }
/* 323 */     return bool;
/*     */   }
/*     */ 
/*     */   public static String d(CharSequence[] paramArrayOfCharSequence, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  15 */     if (0 == paramInt2) { if (paramInt3 != -507566611);
/*  15 */       return ""; }
/*  16 */     if (1 == paramInt2) { if (paramInt3 != -507566611);
/*  17 */       CharSequence localCharSequence1 = paramArrayOfCharSequence[paramInt1];
/*  18 */       if (null == localCharSequence1) { if (paramInt3 != -507566611);
/*  18 */         return "null"; }
/*  19 */       return localCharSequence1.toString();
/*     */     }
/*  21 */     int k = paramInt2 + paramInt1;
/*  22 */     int i1 = 0;
/*  23 */     for (int i2 = paramInt1; i2 < k; i2++) { if (paramInt3 != -507566611);
/*  24 */       CharSequence localCharSequence2 = paramArrayOfCharSequence[i2];
/*  25 */       if (null == localCharSequence2) { if (paramInt3 != -507566611);
/*  25 */         i1 += 4; } else {
/*  26 */         i1 += localCharSequence2.length();
/*     */       } }
/*  28 */     StringBuilder localStringBuilder = new StringBuilder(i1);
/*  29 */     for (int i3 = paramInt1; i3 < k; i3++) { if (paramInt3 != -507566611);
/*  30 */       CharSequence localCharSequence3 = paramArrayOfCharSequence[i3];
/*  31 */       if (null == localCharSequence3) { if (paramInt3 == -507566611) throw new IllegalStateException(); localStringBuilder.append("null"); } else {
/*  32 */         localStringBuilder.append(localCharSequence3);
/*     */       } }
/*  34 */     return localStringBuilder.toString();
/*     */   }
/*     */ 
/*     */   static final int v(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 938 */     int k = paramInt2 * 57 + paramInt1;
/* 939 */     k = k << 13 ^ k;
/* 940 */     int i1 = k * (15731 * (k * k) + 789221) + 1376312589 & 0x7FFFFFFF;
/* 941 */     return i1 >> 19 & 0xFF;
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ef
 * JD-Core Version:    0.6.2
 */