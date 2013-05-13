/*     */ public class ei extends dg
/*     */ {
/*     */   cf m;
/*     */   byte[] c;
/*     */ 
/*     */   static ei z(ch paramch, int paramInt1, int paramInt2)
/*     */   {
/*  16 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 784930923);
/*  17 */     if (arrayOfByte == null) return null;
/*  18 */     return new ei(new ev(arrayOfByte));
/*     */   }
/*     */ 
/*     */   ei(ev paramev) {
/*  22 */     paramev.c = ((paramev.m.length - 3) * -941396361);
/*  23 */     int i = paramev.t(1118814123);
/*  24 */     int j = paramev.k(-1987080889);
/*  25 */     int k = 14 + i * 10;
/*  26 */     paramev.c = 0;
/*  27 */     int n = 0;
/*  28 */     int i1 = 0;
/*  29 */     int i2 = 0;
/*  30 */     int i3 = 0;
/*  31 */     int i4 = 0;
/*  32 */     int i5 = 0;
/*  33 */     int i6 = 0;
/*  34 */     int i7 = 0;
/*  35 */     label222: for (int i8 = 0; i8 < i; i8++) {
/*  36 */       i9 = -1;
/*     */       while (true) {
/*  38 */         i10 = paramev.t(1118814123);
/*  39 */         if (i10 != i9) k++;
/*  40 */         i9 = i10 & 0xF;
/*  41 */         if (i10 == 7) break label222;
/*  42 */         if (i10 == 23) {
/*  43 */           n++;
/*     */         }
/*  46 */         else if (i9 == 0) {
/*  47 */           i2++;
/*     */         }
/*  50 */         else if (i9 == 1) {
/*  51 */           i3++;
/*     */         }
/*  54 */         else if (i9 == 2) {
/*  55 */           i1++;
/*     */         }
/*  58 */         else if (i9 == 3) {
/*  59 */           i4++;
/*     */         }
/*  62 */         else if (i9 == 4) {
/*  63 */           i5++;
/*     */         }
/*  66 */         else if (i9 == 5) {
/*  67 */           i6++;
/*     */         }
/*     */         else {
/*  70 */           if (i9 != 6) break;
/*  71 */           i7++;
/*     */         }
/*     */       }
/*  74 */       throw new RuntimeException();
/*     */     }
/*     */ 
/*  77 */     k += 5 * n;
/*  78 */     k += 2 * (i2 + i3 + i1 + i4 + i6);
/*  79 */     k += i5 + i7;
/*  80 */     i8 = paramev.c * -196293817;
/*  81 */     int i9 = i + n + i1 + i2 + i3 + i4 + i5 + i6 + i7;
/*  82 */     for (int i10 = 0; i10 < i9; i10++) paramev.ak((byte)2);
/*  83 */     k += paramev.c * -196293817 - i8;
/*  84 */     i10 = paramev.c * -196293817;
/*  85 */     int i11 = 0;
/*  86 */     int i12 = 0;
/*  87 */     int i13 = 0;
/*  88 */     int i14 = 0;
/*  89 */     int i15 = 0;
/*  90 */     int i16 = 0;
/*  91 */     int i17 = 0;
/*  92 */     int i18 = 0;
/*  93 */     int i19 = 0;
/*  94 */     int i20 = 0;
/*  95 */     int i21 = 0;
/*  96 */     int i22 = 0;
/*  97 */     int i23 = 0;
/*  98 */     for (int i24 = 0; i24 < i1; i24++) {
/*  99 */       i23 = i23 + paramev.t(1118814123) & 0x7F;
/* 100 */       if ((i23 == 0) || (i23 == 32)) i7++;
/* 101 */       else if (i23 == 1) i11++;
/* 102 */       else if (i23 == 33) i12++;
/* 103 */       else if (i23 == 7) i13++;
/* 104 */       else if (i23 == 39) i14++;
/* 105 */       else if (i23 == 10) i15++;
/* 106 */       else if (i23 == 42) i16++;
/* 107 */       else if (i23 == 99) i17++;
/* 108 */       else if (i23 == 98) i18++;
/* 109 */       else if (i23 == 101) i19++;
/* 110 */       else if (i23 == 100) i20++;
/* 111 */       else if ((i23 == 64) || (i23 == 65) || (i23 == 120) || (i23 == 121) || (i23 == 123)) i21++; else
/* 112 */         i22++;
/*     */     }
/* 114 */     i24 = 0;
/* 115 */     int i25 = paramev.c * -196293817;
/* 116 */     paramev.c += i21 * -941396361;
/* 117 */     int i26 = paramev.c * -196293817;
/* 118 */     paramev.c += i6 * -941396361;
/* 119 */     int i27 = paramev.c * -196293817;
/* 120 */     paramev.c += i5 * -941396361;
/* 121 */     int i28 = paramev.c * -196293817;
/* 122 */     paramev.c += i4 * -941396361;
/* 123 */     int i29 = paramev.c * -196293817;
/* 124 */     paramev.c += i11 * -941396361;
/* 125 */     int i30 = paramev.c * -196293817;
/* 126 */     paramev.c += i13 * -941396361;
/* 127 */     int i31 = paramev.c * -196293817;
/* 128 */     paramev.c += i15 * -941396361;
/* 129 */     int i32 = paramev.c * -196293817;
/* 130 */     paramev.c += (i2 + i3 + i6) * -941396361;
/* 131 */     int i33 = paramev.c * -196293817;
/* 132 */     paramev.c += i2 * -941396361;
/* 133 */     int i34 = paramev.c * -196293817;
/* 134 */     paramev.c += i22 * -941396361;
/* 135 */     int i35 = paramev.c * -196293817;
/* 136 */     paramev.c += i3 * -941396361;
/* 137 */     int i36 = paramev.c * -196293817;
/* 138 */     paramev.c += i12 * -941396361;
/* 139 */     int i37 = paramev.c * -196293817;
/* 140 */     paramev.c += i14 * -941396361;
/* 141 */     int i38 = paramev.c * -196293817;
/* 142 */     paramev.c += i16 * -941396361;
/* 143 */     int i39 = paramev.c * -196293817;
/* 144 */     paramev.c += i7 * -941396361;
/* 145 */     int i40 = paramev.c * -196293817;
/* 146 */     paramev.c += i4 * -941396361;
/* 147 */     int i41 = paramev.c * -196293817;
/* 148 */     paramev.c += i17 * -941396361;
/* 149 */     int i42 = paramev.c * -196293817;
/* 150 */     paramev.c += i18 * -941396361;
/* 151 */     int i43 = paramev.c * -196293817;
/* 152 */     paramev.c += i19 * -941396361;
/* 153 */     int i44 = paramev.c * -196293817;
/* 154 */     paramev.c += i20 * -941396361;
/* 155 */     int i45 = paramev.c * -196293817;
/* 156 */     paramev.c += n * 1470778213;
/* 157 */     this.c = new byte[k];
/* 158 */     ev localev = new ev(this.c);
/* 159 */     localev.z(1297377380, (byte)19);
/* 160 */     localev.z(6, (byte)51);
/* 161 */     localev.n(i > 1 ? 1 : 0, -229931344);
/* 162 */     localev.n(i, 2005773102);
/* 163 */     localev.n(j, -2029893486);
/* 164 */     paramev.c = (i8 * -941396361);
/* 165 */     int i46 = 0;
/* 166 */     int i47 = 0;
/* 167 */     int i48 = 0;
/* 168 */     int i49 = 0;
/* 169 */     int i50 = 0;
/* 170 */     int i51 = 0;
/* 171 */     int i52 = 0;
/* 172 */     int[] arrayOfInt = new int[''];
/* 173 */     i23 = 0;
/* 174 */     for (int i53 = 0; i53 < i; i53++) {
/* 175 */       localev.z(1297379947, (byte)123);
/* 176 */       localev.c += 529381852;
/* 177 */       int i54 = localev.c * -196293817;
/* 178 */       int i55 = -1;
/*     */       while (true) {
/* 180 */         int i56 = paramev.ak((byte)2);
/* 181 */         localev.y(i56, 1424373430);
/* 182 */         int i57 = paramev.m[(i24++)] & 0xFF;
/* 183 */         int i58 = i57 != i55 ? 1 : 0;
/* 184 */         i55 = i57 & 0xF;
/* 185 */         if (i57 == 7) {
/* 186 */           if (i58 != 0) localev.c(255, 1586737758);
/* 187 */           localev.c(47, 1726983813);
/* 188 */           localev.c(0, 1292336558);
/* 189 */           break label2281;
/*     */         }
/* 191 */         if (i57 == 23) {
/* 192 */           if (i58 != 0) localev.c(255, 1605654755);
/* 193 */           localev.c(81, 2036233585);
/* 194 */           localev.c(3, 1331995975);
/* 195 */           localev.c(paramev.m[(i45++)], 1789300325);
/* 196 */           localev.c(paramev.m[(i45++)], 1936098584);
/* 197 */           localev.c(paramev.m[(i45++)], 1477932934);
/*     */         }
/*     */         else {
/* 200 */           i46 ^= i57 >> 4;
/* 201 */           if (i55 == 0) {
/* 202 */             if (i58 != 0) localev.c(144 + i46, 1975129833);
/* 203 */             i47 += paramev.m[(i32++)];
/* 204 */             i48 += paramev.m[(i33++)];
/* 205 */             localev.c(i47 & 0x7F, 1400903197);
/* 206 */             localev.c(i48 & 0x7F, 1149510507);
/*     */           }
/* 209 */           else if (i55 == 1) {
/* 210 */             if (i58 != 0) localev.c(128 + i46, 1736516696);
/* 211 */             i47 += paramev.m[(i32++)];
/* 212 */             i49 += paramev.m[(i35++)];
/* 213 */             localev.c(i47 & 0x7F, 1442358208);
/* 214 */             localev.c(i49 & 0x7F, 2105488984);
/*     */           }
/* 217 */           else if (i55 == 2) {
/* 218 */             if (i58 != 0) localev.c(176 + i46, 1855345304);
/* 219 */             i23 = i23 + paramev.m[(i10++)] & 0x7F;
/* 220 */             localev.c(i23, 1328409908);
/*     */             int i59;
/* 222 */             if ((i23 == 0) || (i23 == 32)) i59 = paramev.m[(i39++)];
/* 223 */             else if (i23 == 1) i59 = paramev.m[(i29++)];
/* 224 */             else if (i23 == 33) i59 = paramev.m[(i36++)];
/* 225 */             else if (i23 == 7) i59 = paramev.m[(i30++)];
/* 226 */             else if (i23 == 39) i59 = paramev.m[(i37++)];
/* 227 */             else if (i23 == 10) i59 = paramev.m[(i31++)];
/* 228 */             else if (i23 == 42) i59 = paramev.m[(i38++)];
/* 229 */             else if (i23 == 99) i59 = paramev.m[(i41++)];
/* 230 */             else if (i23 == 98) i59 = paramev.m[(i42++)];
/* 231 */             else if (i23 == 101) i59 = paramev.m[(i43++)];
/* 232 */             else if (i23 == 100) i59 = paramev.m[(i44++)];
/* 233 */             else if ((i23 == 64) || (i23 == 65) || (i23 == 120) || (i23 == 121) || (i23 == 123)) i59 = paramev.m[(i25++)]; else
/* 234 */               i59 = paramev.m[(i34++)];
/* 235 */             i59 += arrayOfInt[i23];
/* 236 */             arrayOfInt[i23] = i59;
/* 237 */             localev.c(i59 & 0x7F, 1301304037);
/*     */           }
/* 240 */           else if (i55 == 3) {
/* 241 */             if (i58 != 0) localev.c(224 + i46, 2002716834);
/* 242 */             i50 += paramev.m[(i40++)];
/* 243 */             i50 += (paramev.m[(i28++)] << 7);
/* 244 */             localev.c(i50 & 0x7F, 2131297727);
/* 245 */             localev.c(i50 >> 7 & 0x7F, 1943583075);
/*     */           }
/* 248 */           else if (i55 == 4) {
/* 249 */             if (i58 != 0) localev.c(208 + i46, 2109652292);
/* 250 */             i51 += paramev.m[(i27++)];
/* 251 */             localev.c(i51 & 0x7F, 1727431009);
/*     */           }
/* 254 */           else if (i55 == 5) {
/* 255 */             if (i58 != 0) localev.c(160 + i46, 1232231137);
/* 256 */             i47 += paramev.m[(i32++)];
/* 257 */             i52 += paramev.m[(i26++)];
/* 258 */             localev.c(i47 & 0x7F, 1717483622);
/* 259 */             localev.c(i52 & 0x7F, 1892979103);
/*     */           }
/*     */           else {
/* 262 */             if (i55 != 6) break;
/* 263 */             if (i58 != 0) localev.c(192 + i46, 1267360750);
/* 264 */             localev.c(paramev.m[(i39++)], 1359725480);
/*     */           }
/*     */         }
/*     */       }
/* 267 */       throw new RuntimeException();
/*     */ 
/* 269 */       label2281: localev.v(localev.c * -196293817 - i54, -909703631);
/*     */     }
/*     */   }
/*     */ 
/*     */   void n() {
/* 274 */     if (this.m != null) return;
/* 275 */     this.m = new cf(16);
/* 276 */     int[] arrayOfInt1 = new int[16];
/* 277 */     int[] arrayOfInt2 = new int[16];
/* 278 */     int[] arrayOfInt3 = arrayOfInt1;
/* 279 */     arrayOfInt2[9] = 128;
/* 280 */     arrayOfInt3[9] = 128;
/* 281 */     cs localcs = new cs(this.c);
/* 282 */     int i = localcs.m();
/* 283 */     for (int j = 0; j < i; j++) {
/* 284 */       localcs.c(j);
/* 285 */       localcs.z(j);
/* 286 */       localcs.n(j);
/*     */     }label423: 
/*     */     while (true) {
/* 289 */       j = localcs.u();
/* 290 */       int k = localcs.c[j];
/*     */       while (true) { if (localcs.c[j] != k) break label423;
/* 292 */         localcs.c(j);
/* 293 */         int n = localcs.g(j);
/* 294 */         if (n == 1) {
/* 295 */           localcs.j();
/* 296 */           localcs.n(j);
/* 297 */           if (localcs.v()) return; break;
/*     */         }
/*     */ 
/* 300 */         int i1 = n & 0xF0;
/*     */         int i2;
/*     */         int i3;
/*     */         int i4;
/* 301 */         if (i1 == 176) {
/* 302 */           i2 = n & 0xF;
/* 303 */           i3 = n >> 8 & 0x7F;
/* 304 */           i4 = n >> 16 & 0x7F;
/* 305 */           if (i3 == 0) arrayOfInt1[i2] = ((arrayOfInt1[i2] & 0xFFE03FFF) + (i4 << 14));
/* 306 */           if (i3 == 32) arrayOfInt1[i2] = ((arrayOfInt1[i2] & 0xFFFFC07F) + (i4 << 7));
/*     */         }
/* 308 */         if (i1 == 192) {
/* 309 */           i2 = n & 0xF;
/* 310 */           i3 = n >> 8 & 0x7F;
/* 311 */           arrayOfInt1[i2] += i3;
/*     */         }
/* 313 */         if (i1 == 144) {
/* 314 */           i2 = n & 0xF;
/* 315 */           i3 = n >> 8 & 0x7F;
/* 316 */           i4 = n >> 16 & 0x7F;
/* 317 */           if (i4 > 0) {
/* 318 */             int i5 = arrayOfInt2[i2];
/* 319 */             ew localew = (ew)this.m.r(i5);
/* 320 */             if (localew == null) {
/* 321 */               localew = new ew(new byte['']);
/* 322 */               this.m.d(localew, i5);
/*     */             }
/* 324 */             localew.m[i3] = 1;
/*     */           }
/*     */         }
/* 327 */         localcs.z(j);
/* 328 */         localcs.n(j); }
/*     */     }
/*     */   }
/*     */ 
/*     */   void j()
/*     */   {
/* 334 */     this.m = null;
/*     */   }
/*     */ 
/*     */   static ei c(ch paramch, int paramInt1, int paramInt2)
/*     */   {
/*  16 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 1320884478);
/*  17 */     if (arrayOfByte == null) return null;
/*  18 */     return new ei(new ev(arrayOfByte));
/*     */   }
/*     */ 
/*     */   void g()
/*     */   {
/* 274 */     if (this.m != null) return;
/* 275 */     this.m = new cf(16);
/* 276 */     int[] arrayOfInt1 = new int[16];
/* 277 */     int[] arrayOfInt2 = new int[16];
/* 278 */     int[] arrayOfInt3 = arrayOfInt1;
/* 279 */     arrayOfInt2[9] = 128;
/* 280 */     arrayOfInt3[9] = 128;
/* 281 */     cs localcs = new cs(this.c);
/* 282 */     int i = localcs.m();
/* 283 */     for (int j = 0; j < i; j++) {
/* 284 */       localcs.c(j);
/* 285 */       localcs.z(j);
/* 286 */       localcs.n(j);
/*     */     }label423: 
/*     */     while (true) {
/* 289 */       j = localcs.u();
/* 290 */       int k = localcs.c[j];
/*     */       while (true) { if (localcs.c[j] != k) break label423;
/* 292 */         localcs.c(j);
/* 293 */         int n = localcs.g(j);
/* 294 */         if (n == 1) {
/* 295 */           localcs.j();
/* 296 */           localcs.n(j);
/* 297 */           if (localcs.v()) return; break;
/*     */         }
/*     */ 
/* 300 */         int i1 = n & 0xF0;
/*     */         int i2;
/*     */         int i3;
/*     */         int i4;
/* 301 */         if (i1 == 176) {
/* 302 */           i2 = n & 0xF;
/* 303 */           i3 = n >> 8 & 0x7F;
/* 304 */           i4 = n >> 16 & 0x7F;
/* 305 */           if (i3 == 0) arrayOfInt1[i2] = ((arrayOfInt1[i2] & 0xFFE03FFF) + (i4 << 14));
/* 306 */           if (i3 == 32) arrayOfInt1[i2] = ((arrayOfInt1[i2] & 0xFFFFC07F) + (i4 << 7));
/*     */         }
/* 308 */         if (i1 == 192) {
/* 309 */           i2 = n & 0xF;
/* 310 */           i3 = n >> 8 & 0x7F;
/* 311 */           arrayOfInt1[i2] += i3;
/*     */         }
/* 313 */         if (i1 == 144) {
/* 314 */           i2 = n & 0xF;
/* 315 */           i3 = n >> 8 & 0x7F;
/* 316 */           i4 = n >> 16 & 0x7F;
/* 317 */           if (i4 > 0) {
/* 318 */             int i5 = arrayOfInt2[i2];
/* 319 */             ew localew = (ew)this.m.r(i5);
/* 320 */             if (localew == null) {
/* 321 */               localew = new ew(new byte['']);
/* 322 */               this.m.d(localew, i5);
/*     */             }
/* 324 */             localew.m[i3] = 1;
/*     */           }
/*     */         }
/* 327 */         localcs.z(j);
/* 328 */         localcs.n(j);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   void q()
/*     */   {
/* 274 */     if (this.m != null) return;
/* 275 */     this.m = new cf(16);
/* 276 */     int[] arrayOfInt1 = new int[16];
/* 277 */     int[] arrayOfInt2 = new int[16];
/* 278 */     int[] arrayOfInt3 = arrayOfInt1;
/* 279 */     arrayOfInt2[9] = 128;
/* 280 */     arrayOfInt3[9] = 128;
/* 281 */     cs localcs = new cs(this.c);
/* 282 */     int i = localcs.m();
/* 283 */     for (int j = 0; j < i; j++) {
/* 284 */       localcs.c(j);
/* 285 */       localcs.z(j);
/* 286 */       localcs.n(j);
/*     */     }label423: 
/*     */     while (true) {
/* 289 */       j = localcs.u();
/* 290 */       int k = localcs.c[j];
/*     */       while (true) { if (localcs.c[j] != k) break label423;
/* 292 */         localcs.c(j);
/* 293 */         int n = localcs.g(j);
/* 294 */         if (n == 1) {
/* 295 */           localcs.j();
/* 296 */           localcs.n(j);
/* 297 */           if (localcs.v()) return; break;
/*     */         }
/*     */ 
/* 300 */         int i1 = n & 0xF0;
/*     */         int i2;
/*     */         int i3;
/*     */         int i4;
/* 301 */         if (i1 == 176) {
/* 302 */           i2 = n & 0xF;
/* 303 */           i3 = n >> 8 & 0x7F;
/* 304 */           i4 = n >> 16 & 0x7F;
/* 305 */           if (i3 == 0) arrayOfInt1[i2] = ((arrayOfInt1[i2] & 0xFFE03FFF) + (i4 << 14));
/* 306 */           if (i3 == 32) arrayOfInt1[i2] = ((arrayOfInt1[i2] & 0xFFFFC07F) + (i4 << 7));
/*     */         }
/* 308 */         if (i1 == 192) {
/* 309 */           i2 = n & 0xF;
/* 310 */           i3 = n >> 8 & 0x7F;
/* 311 */           arrayOfInt1[i2] += i3;
/*     */         }
/* 313 */         if (i1 == 144) {
/* 314 */           i2 = n & 0xF;
/* 315 */           i3 = n >> 8 & 0x7F;
/* 316 */           i4 = n >> 16 & 0x7F;
/* 317 */           if (i4 > 0) {
/* 318 */             int i5 = arrayOfInt2[i2];
/* 319 */             ew localew = (ew)this.m.r(i5);
/* 320 */             if (localew == null) {
/* 321 */               localew = new ew(new byte['']);
/* 322 */               this.m.d(localew, i5);
/*     */             }
/* 324 */             localew.m[i3] = 1;
/*     */           }
/*     */         }
/* 327 */         localcs.z(j);
/* 328 */         localcs.n(j); }
/*     */     }
/*     */   }
/*     */ 
/*     */   void i()
/*     */   {
/* 334 */     this.m = null; } 
/* 334 */   void s() { this.m = null; }
/*     */ 
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ei
 * JD-Core Version:    0.6.2
 */