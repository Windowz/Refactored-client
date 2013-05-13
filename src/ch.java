/*      */ public abstract class ch
/*      */ {
/*      */   int[] d;
/*      */   boolean w;
/*      */   int[] l;
/*      */   cn m;
/*      */   int[] c;
/*      */   Object[][] s;
/*      */   int[] j;
/*      */   int[][] z;
/*      */   int[][] g;
/*      */   cn[] q;
/*      */   public int v;
/*   26 */   static int b = 0;
/*      */ 
/*   22 */   static bf u = new bf();
/*      */   Object[] i;
/*      */   int[] n;
/*      */   boolean e;
/*      */   int r;
/*      */   static final int y = 0;
/*      */   static final int t = 1;
/*      */ 
/*      */   public int[] ao(int paramInt)
/*      */   {
/*  209 */     return this.z[paramInt];
/*      */   }
/*      */ 
/*      */   void r(byte[] paramArrayOfByte, int paramInt)
/*      */   {
/*   37 */     int i1 = paramArrayOfByte.length;
/*      */ 
/*   41 */     int i3 = -1;
/*   42 */     for (int i4 = 0; i4 < i1; i4++) { if (paramInt < -528503859);
/*   43 */       i3 = i3 >>> 8 ^ ev.n[((i3 ^ paramArrayOfByte[i4]) & 0xFF)];
/*      */     }
/*   45 */     i3 ^= -1;
/*   46 */     int i2 = i3;
/*      */ 
/*   48 */     int k = i2;
/*      */ 
/*   50 */     this.v = (k * -1640625137);
/*   51 */     ev localev = new ev(c.a(paramArrayOfByte, -1321401092));
/*   52 */     i3 = localev.t(1118814123);
/*   53 */     if (i3 >= 5) { if (paramInt >= -528503859) return; if (i3 <= 7) break label137; if (paramInt >= -528503859) return;  } throw new RuntimeException("");
/*   54 */     label137: if (i3 >= 6) { if (paramInt < -528503859);
/*   55 */       localev.h(-1619982688);
/*      */     }
/*      */ 
/*   58 */     i4 = localev.t(1118814123);
/*   59 */     if (i3 >= 7) { if (paramInt >= -528503859) return; this.r = (localev.av((short)-12418) * 911050257); } else {
/*   60 */       this.r = (localev.k(-1987080889) * 911050257);
/*   61 */     }int i5 = 0;
/*   62 */     int i6 = -1;
/*   63 */     this.d = new int[-1700386063 * this.r];
/*   64 */     if (i3 >= 7) { if (paramInt < -528503859);
/*   65 */       for (i7 = 0; i7 < -1700386063 * this.r; i7++) { if (paramInt >= -528503859) throw new IllegalStateException();
/*   67 */         int tmp297_296 = (i5 + localev.av((short)-7476)); i5 = tmp297_296; this.d[i7] = tmp297_296;
/*   67 */         if (this.d[i7] > i6) { if (paramInt < -528503859);
/*   67 */           i6 = this.d[i7]; } }
/*      */     }
/*      */     else
/*      */     {
/*   71 */       for (i7 = 0; i7 < this.r * -1700386063; i7++) { if (paramInt >= -528503859) throw new IllegalStateException();
/*   73 */         int tmp385_384 = (i5 + localev.k(-1987080889)); i5 = tmp385_384; this.d[i7] = tmp385_384;
/*   73 */         if (this.d[i7] > i6) { if (paramInt >= -528503859) return; i6 = this.d[i7]; }
/*      */       }
/*      */     }
/*   76 */     this.c = new int[i6 + 1];
/*   77 */     this.n = new int[1 + i6];
/*   78 */     this.j = new int[i6 + 1];
/*   79 */     this.z = new int[1 + i6][];
/*   80 */     this.i = new Object[i6 + 1];
/*   81 */     this.s = new Object[i6 + 1][];
/*   82 */     if (i4 != 0) { if (paramInt < -528503859);
/*   83 */       this.l = new int[i6 + 1];
/*   84 */       for (i7 = 0; i7 < -1700386063 * this.r; i7++) { if (paramInt < -528503859);
/*   84 */         this.l[this.d[i7]] = localev.h(-1852526288); }
/*   85 */       this.m = new cn(this.l);
/*      */     }
/*   87 */     for (int i7 = 0; i7 < -1700386063 * this.r; i7++) { if (paramInt >= -528503859) throw new IllegalStateException(); this.c[this.d[i7]] = localev.h(2043058492); }
/*   88 */     for (i7 = 0; i7 < -1700386063 * this.r; i7++) { if (paramInt >= -528503859) return; this.n[this.d[i7]] = localev.h(871056383); }
/*   89 */     for (i7 = 0; i7 < this.r * -1700386063; i7++) { if (paramInt < -528503859);
/*   89 */       this.j[this.d[i7]] = localev.k(-1987080889);
/*      */     }
/*   90 */     int i8;
/*      */     int i9;
/*      */     int i10;
/*      */     int i11;
/*      */     int i12;
/*   90 */     if (i3 >= 7) { if (paramInt >= -528503859) throw new IllegalStateException();
/*   91 */       for (i7 = 0; i7 < this.r * -1700386063; i7++) { if (paramInt < -528503859);
/*   92 */         i8 = this.d[i7];
/*   93 */         i9 = this.j[i8];
/*   94 */         i5 = 0;
/*   95 */         i10 = -1;
/*   96 */         this.z[i8] = new int[i9];
/*   97 */         for (i11 = 0; i11 < i9; i11++) { if (paramInt < -528503859);
/*   98 */           i12 = this.z[i8][i11] = i5 += localev.av((short)7040);
/*   99 */           if (i12 > i10) { if (paramInt < -528503859);
/*   99 */             i10 = i12; }
/*      */         }
/*  101 */         this.s[i8] = new Object[1 + i10]; }
/*      */     }
/*      */     else
/*      */     {
/*  105 */       for (i7 = 0; i7 < this.r * -1700386063; i7++) { if (paramInt < -528503859);
/*  106 */         i8 = this.d[i7];
/*  107 */         i9 = this.j[i8];
/*  108 */         i5 = 0;
/*  109 */         i10 = -1;
/*  110 */         this.z[i8] = new int[i9];
/*  111 */         for (i11 = 0; i11 < i9; i11++) { if (paramInt < -528503859);
/*  112 */           i12 = this.z[i8][i11] = i5 += localev.k(-1987080889);
/*  113 */           if (i12 > i10) { if (paramInt < -528503859);
/*  113 */             i10 = i12; }
/*      */         }
/*  115 */         this.s[i8] = new Object[1 + i10];
/*      */       }
/*      */     }
/*  118 */     if (0 != i4) { if (paramInt >= -528503859) return;
/*  119 */       this.g = new int[i6 + 1][];
/*  120 */       this.q = new cn[i6 + 1];
/*  121 */       for (i7 = 0; i7 < this.r * -1700386063; i7++) { if (paramInt >= -528503859) throw new IllegalStateException();
/*  122 */         i8 = this.d[i7];
/*  123 */         i9 = this.j[i8];
/*  124 */         this.g[i8] = new int[this.s[i8].length];
/*  125 */         for (i10 = 0; i10 < i9; i10++) { if (paramInt < -528503859);
/*  125 */           this.g[i8][this.z[i8][i10]] = localev.h(-1925236690); }
/*  126 */         this.q[i8] = new cn(this.g[i8]); } }
/*      */   }
/*      */ 
/*      */   void d(int paramInt, byte paramByte)
/*      */   {
/*      */   }
/*      */ 
/*      */   public byte[] l(int paramInt1, int paramInt2, int paramInt3) {
/*  134 */     return m(paramInt1, paramInt2, null, (short)-2999);
/*      */   }
/*      */ 
/*      */   public boolean ap()
/*      */   {
/*  169 */     boolean bool = true;
/*  170 */     for (int k = 0; k < this.d.length; k++) {
/*  171 */       int i1 = this.d[k];
/*  172 */       if (this.i[i1] == null) {
/*  173 */         i(i1, (byte)40);
/*  174 */         if (null == this.i[i1]) bool = false;
/*      */       }
/*      */     }
/*  177 */     return bool;
/*      */   }
/*      */ 
/*      */   public boolean c(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  153 */     if (paramInt1 >= 0) { if (paramInt3 == 2102066905) throw new IllegalStateException(); if ((paramInt1 < this.s.length) && ((paramInt3 == 2102066905) || ((this.s[paramInt1] != null) && ((paramInt3 == 2102066905) || (paramInt2 >= 0))))) { if ((paramInt3 != 2102066905) && (paramInt2 < this.s[paramInt1].length)) break label94; if (paramInt3 == 2102066905) throw new IllegalStateException();  }  }
/*  153 */     return false;
/*  154 */     label94: if (this.s[paramInt1][paramInt2] != null) { if (paramInt3 != 2102066905);
/*  154 */       return true; }
/*  155 */     if (null != this.i[paramInt1]) { if (paramInt3 != 2102066905);
/*  155 */       return true; }
/*  156 */     i(paramInt1, (byte)87);
/*  157 */     if (null != this.i[paramInt1]) { if (paramInt3 == 2102066905) throw new IllegalStateException(); return true; }
/*  158 */     return false;
/*      */   }
/*      */ 
/*      */   static final byte[] bu(byte[] paramArrayOfByte)
/*      */   {
/*  368 */     ev localev = new ev(paramArrayOfByte);
/*  369 */     int k = localev.t(1118814123);
/*  370 */     int i1 = localev.h(-358172428);
/*  371 */     if ((i1 < 0) || ((397398037 * b != 0) && (i1 > b * 397398037))) {
/*  372 */       throw new RuntimeException();
/*      */     }
/*  374 */     if (k == 0) {
/*  375 */       byte[] arrayOfByte1 = new byte[i1];
/*  376 */       localev.as(arrayOfByte1, 0, i1, 1602313803);
/*  377 */       return arrayOfByte1;
/*      */     }
/*      */ 
/*  380 */     int i2 = localev.h(107114364);
/*  381 */     if ((i2 < 0) || ((397398037 * b != 0) && (i2 > 397398037 * b))) {
/*  382 */       throw new RuntimeException();
/*      */     }
/*  384 */     byte[] arrayOfByte2 = new byte[i2];
/*  385 */     if (k == 1) bu.r(arrayOfByte2, i2, paramArrayOfByte, i1, 9); else
/*  386 */       u.r(localev, arrayOfByte2, (byte)0);
/*  387 */     return arrayOfByte2;
/*      */   }
/*      */ 
/*      */   public boolean j(byte paramByte)
/*      */   {
/*  169 */     boolean bool = true;
/*  170 */     for (int k = 0; k < this.d.length; k++) { if (paramByte != 124) throw new IllegalStateException();
/*  171 */       int i1 = this.d[k];
/*  172 */       if (this.i[i1] == null) { if (paramByte == 124);
/*  173 */         i(i1, (byte)27);
/*  174 */         if (null == this.i[i1]) { if (paramByte != 124) throw new IllegalStateException(); bool = false; }
/*      */       }
/*      */     }
/*  177 */     return bool;
/*      */   }
/*      */ 
/*      */   boolean bh(int paramInt, int[] paramArrayOfInt)
/*      */   {
/*  233 */     if (this.i[paramInt] == null) return false;
/*  234 */     int k = this.j[paramInt];
/*  235 */     int[] arrayOfInt1 = this.z[paramInt];
/*  236 */     Object[] arrayOfObject = this.s[paramInt];
/*  237 */     int i1 = 1;
/*  238 */     for (int i2 = 0; i2 < k; i2++) {
/*  239 */       if (arrayOfObject[arrayOfInt1[i2]] == null) {
/*  240 */         i1 = 0;
/*  241 */         break;
/*      */       }
/*      */     }
/*  244 */     if (i1 != 0) return true;
/*      */     byte[] arrayOfByte;
/*  246 */     if ((null != paramArrayOfInt) && ((paramArrayOfInt[0] != 0) || (paramArrayOfInt[1] != 0) || (0 != paramArrayOfInt[2]) || (paramArrayOfInt[3] != 0))) {
/*  247 */       arrayOfByte = s.d(this.i[paramInt], true, -1538756517);
/*  248 */       localObject = new ev(arrayOfByte);
/*  249 */       ((ev)localObject).an(paramArrayOfInt, 5, ((ev)localObject).m.length, -2035943148);
/*      */     } else {
/*  251 */       arrayOfByte = s.d(this.i[paramInt], false, -1504232846);
/*      */     }
/*      */ 
/*  254 */     Object localObject = c.a(arrayOfByte, -981521995);
/*      */ 
/*  291 */     if (this.w) this.i[paramInt] = null;
/*  292 */     if (k > 1) {
/*  293 */       int i3 = localObject.length;
/*  294 */       int i4 = localObject[(--i3)] & 0xFF;
/*  295 */       i3 -= i4 * k * 4;
/*  296 */       ev localev = new ev((byte[])localObject);
/*  297 */       int[] arrayOfInt2 = new int[k];
/*  298 */       localev.c = (-941396361 * i3);
/*  299 */       for (int i5 = 0; i5 < i4; i5++) {
/*  300 */         i6 = 0;
/*  301 */         for (i7 = 0; i7 < k; i7++) {
/*  302 */           i6 += localev.h(157405255);
/*  303 */           arrayOfInt2[i7] += i6;
/*      */         }
/*      */       }
/*  306 */       byte[][] arrayOfByte1 = new byte[k][];
/*  307 */       for (int i6 = 0; i6 < k; i6++) {
/*  308 */         arrayOfByte1[i6] = new byte[arrayOfInt2[i6]];
/*  309 */         arrayOfInt2[i6] = 0;
/*      */       }
/*  311 */       localev.c = (-941396361 * i3);
/*  312 */       i6 = 0;
/*  313 */       for (int i7 = 0; i7 < i4; i7++) {
/*  314 */         int i8 = 0;
/*  315 */         for (int i9 = 0; i9 < k; i9++) {
/*  316 */           i8 += localev.h(366022326);
/*  317 */           System.arraycopy(localObject, i6, arrayOfByte1[i9], arrayOfInt2[i9], i8);
/*  318 */           arrayOfInt2[i9] += i8;
/*  319 */           i6 += i8;
/*      */         }
/*      */       }
/*  322 */       for (i7 = 0; i7 < k; i7++) {
/*  323 */         if (!this.e) arrayOfObject[arrayOfInt1[i7]] = cc.r(arrayOfByte1[i7], false, -4); else {
/*  324 */           arrayOfObject[arrayOfInt1[i7]] = arrayOfByte1[i7];
/*      */         }
/*      */       }
/*      */     }
/*  328 */     else if (!this.e) { arrayOfObject[arrayOfInt1[0]] = cc.r((byte[])localObject, false, -75); } else {
/*  329 */       arrayOfObject[arrayOfInt1[0]] = localObject;
/*      */     }
/*  331 */     return true;
/*      */   }
/*      */ 
/*      */   public byte[] g(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  187 */     if ((paramInt1 >= 0) && ((paramInt3 <= -805598580) || ((paramInt1 < this.s.length) && ((paramInt3 <= -805598580) || ((this.s[paramInt1] != null) && ((paramInt3 <= -805598580) || (paramInt2 >= 0))))))) { if (paramInt3 <= -805598580) throw new IllegalStateException(); if (paramInt2 < this.s[paramInt1].length) break label94; if (paramInt3 <= -805598580) throw new IllegalStateException();  } return null;
/*  188 */     label94: if (null == this.s[paramInt1][paramInt2]) { if (paramInt3 > -805598580);
/*  189 */       boolean bool = b(paramInt1, null, -1774274481);
/*  190 */       if (!bool) { if (paramInt3 <= -805598580) throw new IllegalStateException();
/*  191 */         i(paramInt1, (byte)121);
/*  192 */         bool = b(paramInt1, null, -1774274481);
/*  193 */         if (!bool) { if (paramInt3 > -805598580);
/*  193 */           return null; }
/*      */       }
/*      */     }
/*  196 */     byte[] arrayOfByte = s.d(this.s[paramInt1][paramInt2], false, -2033447912);
/*  197 */     return arrayOfByte;
/*      */   }
/*      */ 
/*      */   public byte[] q(int paramInt1, int paramInt2) {
/*  201 */     if (this.s.length == 1) { if (paramInt2 > 1024652825);
/*  201 */       return g(0, paramInt1, 1779596975); }
/*  202 */     if (1 == this.s[paramInt1].length) { if (paramInt2 > 1024652825);
/*  202 */       return g(paramInt1, 0, -595184712); }
/*  203 */     throw new RuntimeException();
/*      */   }
/*      */   void i(int paramInt, byte paramByte) {
/*      */   }
/*      */ 
/*      */   public int[] s(int paramInt1, int paramInt2) {
/*  209 */     return this.z[paramInt1];
/*      */   }
/*      */ 
/*      */   public int u(int paramInt, short paramShort) {
/*  213 */     return this.s[paramInt].length;
/*      */   }
/*      */ 
/*      */   public int v(int paramInt) {
/*  217 */     return this.s.length;
/*      */   }
/*      */ 
/*      */   public void o(String paramString, int paramInt)
/*      */   {
/*  361 */     paramString = paramString.toLowerCase();
/*  362 */     int k = this.m.r(ck.j(paramString, -196293817));
/*  363 */     if (k < 0) { if (paramInt <= 275517944) throw new IllegalStateException(); return; }
/*  364 */     d(k, (byte)75);
/*      */   }
/*      */ 
/*      */   public void e(int paramInt)
/*      */   {
/*  225 */     for (int k = 0; k < this.s.length; k++) if ((paramInt >= -1264594317) || 
/*  226 */         (this.s[k] != null)) { if (paramInt < -1264594317);
/*  227 */         for (int i1 = 0; i1 < this.s[k].length; i1++) { if (paramInt >= -1264594317) return; this.s[k][i1] = null; }
/*      */       }
/*      */   }
/*      */ 
/*      */   boolean b(int paramInt1, int[] paramArrayOfInt, int paramInt2)
/*      */   {
/*  233 */     if (this.i[paramInt1] == null) { if (paramInt2 != -1774274481) throw new IllegalStateException(); return false; }
/*  234 */     int k = this.j[paramInt1];
/*  235 */     int[] arrayOfInt1 = this.z[paramInt1];
/*  236 */     Object[] arrayOfObject = this.s[paramInt1];
/*  237 */     int i1 = 1;
/*  238 */     for (int i2 = 0; i2 < k; i2++) { if (paramInt2 != -1774274481) throw new IllegalStateException();
/*  239 */       if (arrayOfObject[arrayOfInt1[i2]] == null) { if (paramInt2 != -1774274481) throw new IllegalStateException();
/*  240 */         i1 = 0;
/*  241 */         break;
/*      */       }
/*      */     }
/*  244 */     if (i1 != 0) { if (paramInt2 == -1774274481);
/*  244 */       return true;
/*      */     }
/*  246 */     if (null != paramArrayOfInt) { if (paramInt2 != -1774274481) throw new IllegalStateException(); if ((paramArrayOfInt[0] == 0) && ((paramInt2 != -1774274481) || ((paramArrayOfInt[1] == 0) && ((paramInt2 != -1774274481) || (0 == paramArrayOfInt[2]))))) { if ((paramInt2 == -1774274481) && (paramArrayOfInt[3] == 0)) break label257; if (paramInt2 != -1774274481) throw new IllegalStateException(); 
/*      */       }
/*  247 */       arrayOfByte = s.d(this.i[paramInt1], true, -1917839648);
/*  248 */       localObject1 = new ev(arrayOfByte);
/*  249 */       ((ev)localObject1).an(paramArrayOfInt, 5, ((ev)localObject1).m.length, -368734406);
/*  250 */       break label271; }
/*  251 */     label257: byte[] arrayOfByte = s.d(this.i[paramInt1], false, -1555894770);
/*      */ 
/*  254 */     label271: Object localObject1 = c.a(arrayOfByte, -747952247);
/*      */ 
/*  290 */     break label491;
/*      */ 
/*  266 */     int i9 = i9 >>> 8 ^ ev.n[((i9 ^ arrayOfByte[i11]) & 0xFF)];
/*      */ 
/*  265 */     i11++;
/*      */     while (true);
/*  268 */     i9 ^= -1;
/*  269 */     int i7 = i9;
/*      */ 
/*  271 */     int i5 = i7;
/*      */     Object localObject2;
/*  273 */     Object localObject4 = localObject2;
/*      */     Object localObject3;
/*  274 */     String str = (String)localObject3 + i5 + ",";
/*      */ 
/*  276 */     int i12 = arrayOfByte.length - 2;
/*      */ 
/*  280 */     int i14 = -1;
/*  281 */     for (int i15 = 0; i15 < i12; i15++) { if (paramInt2 != -1774274481) throw new IllegalStateException();
/*  282 */       i14 = i14 >>> 8 ^ ev.n[((i14 ^ arrayOfByte[i15]) & 0xFF)];
/*      */     }
/*  284 */     i14 ^= -1;
/*  285 */     int i13 = i14;
/*      */ 
/*  287 */     int i11 = i13;
/*      */ 
/*  289 */     throw bh.d(localObject4, str + i11 + "," + this.c[paramInt1] + "," + 1564697327 * this.v);
/*      */ 
/*  291 */     label491: if (this.w) { if (paramInt2 == -1774274481);
/*  291 */       this.i[paramInt1] = null; }
/*  292 */     if (k > 1) { if (paramInt2 != -1774274481) throw new IllegalStateException();
/*  293 */       int i3 = localObject1.length;
/*  294 */       int i4 = localObject1[(--i3)] & 0xFF;
/*  295 */       i3 -= i4 * k * 4;
/*  296 */       localObject3 = new ev((byte[])localObject1);
/*  297 */       int[] arrayOfInt2 = new int[k];
/*  298 */       ((ev)localObject3).c = (-941396361 * i3);
/*  299 */       for (int i6 = 0; i6 < i4; i6++) { if (paramInt2 == -1774274481);
/*  300 */         i8 = 0;
/*  301 */         for (i10 = 0; i10 < k; i10++) { if (paramInt2 == -1774274481);
/*  302 */           i8 += ((ev)localObject3).h(20747632);
/*  303 */           arrayOfInt2[i10] += i8;
/*      */         }
/*      */       }
/*  306 */       byte[][] arrayOfByte1 = new byte[k][];
/*  307 */       for (int i8 = 0; i8 < k; i8++) { if (paramInt2 == -1774274481);
/*  308 */         arrayOfByte1[i8] = new byte[arrayOfInt2[i8]];
/*  309 */         arrayOfInt2[i8] = 0;
/*      */       }
/*  311 */       ((ev)localObject3).c = (-941396361 * i3);
/*  312 */       i8 = 0;
/*  313 */       for (int i10 = 0; i10 < i4; i10++) { if (paramInt2 != -1774274481) throw new IllegalStateException();
/*  314 */         i11 = 0;
/*  315 */         for (i12 = 0; i12 < k; i12++) { if (paramInt2 == -1774274481);
/*  316 */           i11 += ((ev)localObject3).h(2023795543);
/*  317 */           System.arraycopy(localObject1, i8, arrayOfByte1[i12], arrayOfInt2[i12], i11);
/*  318 */           arrayOfInt2[i12] += i11;
/*  319 */           i8 += i11;
/*      */         }
/*      */       }
/*  322 */       for (i10 = 0; i10 < k; i10++) { if (paramInt2 != -1774274481) throw new IllegalStateException();
/*  323 */         if (!this.e) { if (paramInt2 != -1774274481) throw new IllegalStateException(); arrayOfObject[arrayOfInt1[i10]] = cc.r(arrayOfByte1[i10], false, -77); } else {
/*  324 */           arrayOfObject[arrayOfInt1[i10]] = arrayOfByte1[i10];
/*      */         }
/*      */       }
/*      */     }
/*  328 */     else if (!this.e) { if (paramInt2 != -1774274481) throw new IllegalStateException(); arrayOfObject[arrayOfInt1[0]] = cc.r((byte[])localObject1, false, -37); } else {
/*  329 */       arrayOfObject[arrayOfInt1[0]] = localObject1;
/*      */     }
/*  331 */     return true;
/*      */   }
/*      */ 
/*      */   public int y(String paramString, int paramInt) {
/*  335 */     paramString = paramString.toLowerCase();
/*  336 */     return this.m.r(ck.j(paramString, -196293817));
/*      */   }
/*      */ 
/*      */   public byte[] ay(int paramInt)
/*      */   {
/*  201 */     if (this.s.length == 1) return g(0, paramInt, 1748721902);
/*  202 */     if (1 == this.s[paramInt].length) return g(paramInt, 0, 1348472869);
/*  203 */     throw new RuntimeException();
/*      */   }
/*      */ 
/*      */   public byte[] f(String paramString1, String paramString2, int paramInt)
/*      */   {
/*  345 */     paramString1 = paramString1.toLowerCase();
/*  346 */     paramString2 = paramString2.toLowerCase();
/*  347 */     int k = this.m.r(ck.j(paramString1, -196293817));
/*  348 */     int i1 = this.q[k].r(ck.j(paramString2, -196293817));
/*  349 */     return l(k, i1, 155719014);
/*      */   }
/*      */ 
/*      */   boolean bi(int paramInt, int[] paramArrayOfInt)
/*      */   {
/*  233 */     if (this.i[paramInt] == null) return false;
/*  234 */     int k = this.j[paramInt];
/*  235 */     int[] arrayOfInt1 = this.z[paramInt];
/*  236 */     Object[] arrayOfObject = this.s[paramInt];
/*  237 */     int i1 = 1;
/*  238 */     for (int i2 = 0; i2 < k; i2++) {
/*  239 */       if (arrayOfObject[arrayOfInt1[i2]] == null) {
/*  240 */         i1 = 0;
/*  241 */         break;
/*      */       }
/*      */     }
/*  244 */     if (i1 != 0) return true;
/*      */     byte[] arrayOfByte;
/*  246 */     if ((null != paramArrayOfInt) && ((paramArrayOfInt[0] != 0) || (paramArrayOfInt[1] != 0) || (0 != paramArrayOfInt[2]) || (paramArrayOfInt[3] != 0))) {
/*  247 */       arrayOfByte = s.d(this.i[paramInt], true, -1409909987);
/*  248 */       localObject = new ev(arrayOfByte);
/*  249 */       ((ev)localObject).an(paramArrayOfInt, 5, ((ev)localObject).m.length, -420462101);
/*      */     } else {
/*  251 */       arrayOfByte = s.d(this.i[paramInt], false, -1717139137);
/*      */     }
/*      */ 
/*  254 */     Object localObject = c.a(arrayOfByte, -156985225);
/*      */ 
/*  291 */     if (this.w) this.i[paramInt] = null;
/*  292 */     if (k > 1) {
/*  293 */       int i3 = localObject.length;
/*  294 */       int i4 = localObject[(--i3)] & 0xFF;
/*  295 */       i3 -= i4 * k * 4;
/*  296 */       ev localev = new ev((byte[])localObject);
/*  297 */       int[] arrayOfInt2 = new int[k];
/*  298 */       localev.c = (-941396361 * i3);
/*  299 */       for (int i5 = 0; i5 < i4; i5++) {
/*  300 */         i6 = 0;
/*  301 */         for (i7 = 0; i7 < k; i7++) {
/*  302 */           i6 += localev.h(887418052);
/*  303 */           arrayOfInt2[i7] += i6;
/*      */         }
/*      */       }
/*  306 */       byte[][] arrayOfByte1 = new byte[k][];
/*  307 */       for (int i6 = 0; i6 < k; i6++) {
/*  308 */         arrayOfByte1[i6] = new byte[arrayOfInt2[i6]];
/*  309 */         arrayOfInt2[i6] = 0;
/*      */       }
/*  311 */       localev.c = (-941396361 * i3);
/*  312 */       i6 = 0;
/*  313 */       for (int i7 = 0; i7 < i4; i7++) {
/*  314 */         int i8 = 0;
/*  315 */         for (int i9 = 0; i9 < k; i9++) {
/*  316 */           i8 += localev.h(1838875532);
/*  317 */           System.arraycopy(localObject, i6, arrayOfByte1[i9], arrayOfInt2[i9], i8);
/*  318 */           arrayOfInt2[i9] += i8;
/*  319 */           i6 += i8;
/*      */         }
/*      */       }
/*  322 */       for (i7 = 0; i7 < k; i7++) {
/*  323 */         if (!this.e) arrayOfObject[arrayOfInt1[i7]] = cc.r(arrayOfByte1[i7], false, -124); else {
/*  324 */           arrayOfObject[arrayOfInt1[i7]] = arrayOfByte1[i7];
/*      */         }
/*      */       }
/*      */     }
/*  328 */     else if (!this.e) { arrayOfObject[arrayOfInt1[0]] = cc.r((byte[])localObject, false, -106); } else {
/*  329 */       arrayOfObject[arrayOfInt1[0]] = localObject;
/*      */     }
/*  331 */     return true;
/*      */   }
/*      */ 
/*      */   void al(int paramInt)
/*      */   {
/*      */   }
/*      */ 
/*      */   public int t(int paramInt, String paramString, byte paramByte)
/*      */   {
/*  340 */     paramString = paramString.toLowerCase();
/*  341 */     return this.q[paramInt].r(ck.j(paramString, -196293817));
/*      */   }
/*      */ 
/*      */   void h(byte[] paramArrayOfByte)
/*      */   {
/*   37 */     int i1 = paramArrayOfByte.length;
/*      */ 
/*   41 */     int i3 = -1;
/*   42 */     for (int i4 = 0; i4 < i1; i4++) {
/*   43 */       i3 = i3 >>> 8 ^ ev.n[((i3 ^ paramArrayOfByte[i4]) & 0xFF)];
/*      */     }
/*   45 */     i3 ^= -1;
/*   46 */     int i2 = i3;
/*      */ 
/*   48 */     int k = i2;
/*      */ 
/*   50 */     this.v = (k * -1640625137);
/*   51 */     ev localev = new ev(c.a(paramArrayOfByte, -1950839590));
/*   52 */     i3 = localev.t(1118814123);
/*   53 */     if ((i3 < 5) || (i3 > 7)) throw new RuntimeException("");
/*   54 */     if (i3 >= 6) {
/*   55 */       localev.h(-755760292);
/*      */     }
/*      */ 
/*   58 */     i4 = localev.t(1118814123);
/*   59 */     if (i3 >= 7) this.r = (localev.av((short)1504) * 911050257); else
/*   60 */       this.r = (localev.k(-1987080889) * 911050257);
/*   61 */     int i5 = 0;
/*   62 */     int i6 = -1;
/*   63 */     this.d = new int[-1700386063 * this.r];
/*   64 */     if (i3 >= 7) {
/*   65 */       for (i7 = 0; i7 < -1700386063 * this.r; i7++)
/*      */       {
/*   67 */         int tmp235_234 = (i5 + localev.av((short)-20241)); i5 = tmp235_234; this.d[i7] = tmp235_234;
/*   67 */         if (this.d[i7] > i6) i6 = this.d[i7];
/*      */       }
/*      */     }
/*      */     else {
/*   71 */       for (i7 = 0; i7 < this.r * -1700386063; i7++)
/*      */       {
/*   73 */         int tmp300_299 = (i5 + localev.k(-1987080889)); i5 = tmp300_299; this.d[i7] = tmp300_299;
/*   73 */         if (this.d[i7] > i6) i6 = this.d[i7];
/*      */       }
/*      */     }
/*   76 */     this.c = new int[i6 + 1];
/*   77 */     this.n = new int[1 + i6];
/*   78 */     this.j = new int[i6 + 1];
/*   79 */     this.z = new int[1 + i6][];
/*   80 */     this.i = new Object[i6 + 1];
/*   81 */     this.s = new Object[i6 + 1][];
/*   82 */     if (i4 != 0) {
/*   83 */       this.l = new int[i6 + 1];
/*   84 */       for (i7 = 0; i7 < -1700386063 * this.r; i7++) this.l[this.d[i7]] = localev.h(-1439931713);
/*   85 */       this.m = new cn(this.l);
/*      */     }
/*   87 */     for (int i7 = 0; i7 < -1700386063 * this.r; i7++) this.c[this.d[i7]] = localev.h(2039288262);
/*   88 */     for (i7 = 0; i7 < -1700386063 * this.r; i7++) this.n[this.d[i7]] = localev.h(1356544336);
/*   89 */     for (i7 = 0; i7 < this.r * -1700386063; i7++) this.j[this.d[i7]] = localev.k(-1987080889);
/*      */     int i8;
/*      */     int i9;
/*      */     int i10;
/*      */     int i11;
/*      */     int i12;
/*   90 */     if (i3 >= 7) {
/*   91 */       for (i7 = 0; i7 < this.r * -1700386063; i7++) {
/*   92 */         i8 = this.d[i7];
/*   93 */         i9 = this.j[i8];
/*   94 */         i5 = 0;
/*   95 */         i10 = -1;
/*   96 */         this.z[i8] = new int[i9];
/*   97 */         for (i11 = 0; i11 < i9; i11++) {
/*   98 */           i12 = this.z[i8][i11] = i5 += localev.av((short)5801);
/*   99 */           if (i12 > i10) i10 = i12;
/*      */         }
/*  101 */         this.s[i8] = new Object[1 + i10];
/*      */       }
/*      */     }
/*      */     else {
/*  105 */       for (i7 = 0; i7 < this.r * -1700386063; i7++) {
/*  106 */         i8 = this.d[i7];
/*  107 */         i9 = this.j[i8];
/*  108 */         i5 = 0;
/*  109 */         i10 = -1;
/*  110 */         this.z[i8] = new int[i9];
/*  111 */         for (i11 = 0; i11 < i9; i11++) {
/*  112 */           i12 = this.z[i8][i11] = i5 += localev.k(-1987080889);
/*  113 */           if (i12 > i10) i10 = i12;
/*      */         }
/*  115 */         this.s[i8] = new Object[1 + i10];
/*      */       }
/*      */     }
/*  118 */     if (0 != i4) {
/*  119 */       this.g = new int[i6 + 1][];
/*  120 */       this.q = new cn[i6 + 1];
/*  121 */       for (i7 = 0; i7 < this.r * -1700386063; i7++) {
/*  122 */         i8 = this.d[i7];
/*  123 */         i9 = this.j[i8];
/*  124 */         this.g[i8] = new int[this.s[i8].length];
/*  125 */         for (i10 = 0; i10 < i9; i10++) this.g[i8][this.z[i8][i10]] = localev.h(744553423);
/*  126 */         this.q[i8] = new cn(this.g[i8]);
/*      */       }
/*      */     }
/*      */   }
/*      */   void x(int paramInt) {
/*      */   }
/*      */   void ab(int paramInt) {  }
/*      */ 
/*      */   void ad(int paramInt) {  }
/*      */ 
/*  134 */   public byte[] ac(int paramInt1, int paramInt2) { return m(paramInt1, paramInt2, null, (short)6248); }
/*      */ 
/*      */ 
/*      */   public boolean bw(String paramString1, String paramString2)
/*      */   {
/*  353 */     paramString1 = paramString1.toLowerCase();
/*  354 */     paramString2 = paramString2.toLowerCase();
/*  355 */     int k = this.m.r(ck.j(paramString1, -196293817));
/*  356 */     int i1 = this.q[k].r(ck.j(paramString2, -196293817));
/*  357 */     return c(k, i1, -1317883473);
/*      */   }
/*      */ 
/*      */   public boolean as(int paramInt)
/*      */   {
/*  162 */     if (this.i[paramInt] != null) return true;
/*  163 */     i(paramInt, (byte)81);
/*  164 */     if (null != this.i[paramInt]) return true;
/*  165 */     return false;
/*      */   }
/*      */ 
/*      */   public boolean am(int paramInt)
/*      */   {
/*  162 */     if (this.i[paramInt] != null) return true;
/*  163 */     i(paramInt, (byte)51);
/*  164 */     if (null != this.i[paramInt]) return true;
/*  165 */     return false;
/*      */   }
/*      */ 
/*      */   public int ae()
/*      */   {
/*  217 */     return this.s.length;
/*      */   }
/*      */ 
/*      */   public void aj()
/*      */   {
/*  225 */     for (int k = 0; k < this.s.length; k++)
/*  226 */       if (this.s[k] != null)
/*  227 */         for (int i1 = 0; i1 < this.s[k].length; i1++) this.s[k][i1] = null;
/*      */   }
/*      */ 
/*      */   public byte[] ak(int paramInt)
/*      */   {
/*  181 */     if (1 == this.s.length) return l(0, paramInt, 1050819001);
/*  182 */     if (1 == this.s[paramInt].length) return l(paramInt, 0, 328620837);
/*  183 */     throw new RuntimeException();
/*      */   }
/*      */ 
/*      */   public boolean k(String paramString1, String paramString2, byte paramByte)
/*      */   {
/*  353 */     paramString1 = paramString1.toLowerCase();
/*  354 */     paramString2 = paramString2.toLowerCase();
/*  355 */     int k = this.m.r(ck.j(paramString1, -196293817));
/*  356 */     int i1 = this.q[k].r(ck.j(paramString2, -196293817));
/*  357 */     return c(k, i1, 82785106);
/*      */   }
/*      */ 
/*      */   public byte[] an(int paramInt1, int paramInt2)
/*      */   {
/*  187 */     if ((paramInt1 < 0) || (paramInt1 >= this.s.length) || (this.s[paramInt1] == null) || (paramInt2 < 0) || (paramInt2 >= this.s[paramInt1].length)) return null;
/*  188 */     if (null == this.s[paramInt1][paramInt2]) {
/*  189 */       boolean bool = b(paramInt1, null, -1774274481);
/*  190 */       if (!bool) {
/*  191 */         i(paramInt1, (byte)82);
/*  192 */         bool = b(paramInt1, null, -1774274481);
/*  193 */         if (!bool) return null;
/*      */       }
/*      */     }
/*  196 */     byte[] arrayOfByte = s.d(this.s[paramInt1][paramInt2], false, -1566826313);
/*  197 */     return arrayOfByte;
/*      */   }
/*      */ 
/*      */   public byte[] aa(int paramInt1, int paramInt2, int[] paramArrayOfInt)
/*      */   {
/*  138 */     if ((paramInt1 < 0) || (paramInt1 >= this.s.length) || (null == this.s[paramInt1]) || (paramInt2 < 0) || (paramInt2 >= this.s[paramInt1].length)) return null;
/*  139 */     if (null == this.s[paramInt1][paramInt2]) {
/*  140 */       boolean bool = b(paramInt1, paramArrayOfInt, -1774274481);
/*  141 */       if (!bool) {
/*  142 */         i(paramInt1, (byte)35);
/*  143 */         bool = b(paramInt1, paramArrayOfInt, -1774274481);
/*  144 */         if (!bool) return null;
/*      */       }
/*      */     }
/*  147 */     byte[] arrayOfByte = s.d(this.s[paramInt1][paramInt2], false, -2055127661);
/*  148 */     if (this.e) this.s[paramInt1][paramInt2] = null;
/*  149 */     return arrayOfByte;
/*      */   }
/*      */ 
/*      */   ch(boolean paramBoolean1, boolean paramBoolean2)
/*      */   {
/*   31 */     this.w = paramBoolean1;
/*   32 */     this.e = paramBoolean2;
/*      */   }
/*      */ 
/*      */   public byte[] m(int paramInt1, int paramInt2, int[] paramArrayOfInt, short paramShort)
/*      */   {
/*  138 */     if ((paramInt1 >= 0) && ((paramShort == 13312) || ((paramInt1 < this.s.length) && ((paramShort == 13312) || ((null != this.s[paramInt1]) && ((paramShort == 13312) || (paramInt2 >= 0))))))) { if ((paramShort != 13312) && (paramInt2 < this.s[paramInt1].length)) break label100; if (paramShort == 13312) throw new IllegalStateException();  } return null;
/*  139 */     label100: if (null == this.s[paramInt1][paramInt2]) { if (paramShort != 13312);
/*  140 */       boolean bool = b(paramInt1, paramArrayOfInt, -1774274481);
/*  141 */       if (!bool) { if (paramShort != 13312);
/*  142 */         i(paramInt1, (byte)124);
/*  143 */         bool = b(paramInt1, paramArrayOfInt, -1774274481);
/*  144 */         if (!bool) { if (paramShort == 13312) throw new IllegalStateException(); return null; }
/*      */       }
/*      */     }
/*  147 */     byte[] arrayOfByte = s.d(this.s[paramInt1][paramInt2], false, -1745972668);
/*  148 */     if (this.e) { if (paramShort == 13312) throw new IllegalStateException(); this.s[paramInt1][paramInt2] = null; }
/*  149 */     return arrayOfByte;
/*      */   }
/*      */ 
/*      */   void p(int paramInt)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void bx(String paramString)
/*      */   {
/*  361 */     paramString = paramString.toLowerCase();
/*  362 */     int k = this.m.r(ck.j(paramString, -196293817));
/*  363 */     if (k < 0) return;
/*  364 */     d(k, (byte)100);
/*      */   }
/*      */ 
/*      */   public byte[] az(int paramInt1, int paramInt2)
/*      */   {
/*  187 */     if ((paramInt1 < 0) || (paramInt1 >= this.s.length) || (this.s[paramInt1] == null) || (paramInt2 < 0) || (paramInt2 >= this.s[paramInt1].length)) return null;
/*  188 */     if (null == this.s[paramInt1][paramInt2]) {
/*  189 */       boolean bool = b(paramInt1, null, -1774274481);
/*  190 */       if (!bool) {
/*  191 */         i(paramInt1, (byte)66);
/*  192 */         bool = b(paramInt1, null, -1774274481);
/*  193 */         if (!bool) return null;
/*      */       }
/*      */     }
/*  196 */     byte[] arrayOfByte = s.d(this.s[paramInt1][paramInt2], false, -1839138314);
/*  197 */     return arrayOfByte;
/*      */   }
/*      */ 
/*      */   public int ar(int paramInt)
/*      */   {
/*  213 */     return this.s[paramInt].length; } 
/*  213 */   public int aq(int paramInt) { return this.s[paramInt].length; } 
/*  213 */   public int at(int paramInt) { return this.s[paramInt].length; }
/*      */ 
/*      */ 
/*      */   public void w(int paramInt1, int paramInt2)
/*      */   {
/*  221 */     for (int k = 0; k < this.s[paramInt1].length; k++) { if (paramInt2 >= 171357857) throw new IllegalStateException(); this.s[paramInt1][k] = null;
/*      */     }
/*      */   }
/*      */ 
/*      */   public int au()
/*      */   {
/*  217 */     return this.s.length;
/*      */   }
/*      */ 
/*      */   public void ax(int paramInt) {
/*  221 */     for (int k = 0; k < this.s[paramInt].length; k++) this.s[paramInt][k] = null;  } 
/*  221 */   public void ai(int paramInt) { for (int k = 0; k < this.s[paramInt].length; k++) this.s[paramInt][k] = null; 
/*      */   }
/*      */ 
/*      */   public void aw()
/*      */   {
/*  225 */     for (int k = 0; k < this.s.length; k++)
/*  226 */       if (this.s[k] != null)
/*  227 */         for (int i1 = 0; i1 < this.s[k].length; i1++) this.s[k][i1] = null;
/*      */   }
/*      */ 
/*      */   boolean af(int paramInt, int[] paramArrayOfInt)
/*      */   {
/*  233 */     if (this.i[paramInt] == null) return false;
/*  234 */     int k = this.j[paramInt];
/*  235 */     int[] arrayOfInt1 = this.z[paramInt];
/*  236 */     Object[] arrayOfObject = this.s[paramInt];
/*  237 */     int i1 = 1;
/*  238 */     for (int i2 = 0; i2 < k; i2++) {
/*  239 */       if (arrayOfObject[arrayOfInt1[i2]] == null) {
/*  240 */         i1 = 0;
/*  241 */         break;
/*      */       }
/*      */     }
/*  244 */     if (i1 != 0) return true;
/*      */     byte[] arrayOfByte;
/*  246 */     if ((null != paramArrayOfInt) && ((paramArrayOfInt[0] != 0) || (paramArrayOfInt[1] != 0) || (0 != paramArrayOfInt[2]) || (paramArrayOfInt[3] != 0))) {
/*  247 */       arrayOfByte = s.d(this.i[paramInt], true, -1408002835);
/*  248 */       localObject = new ev(arrayOfByte);
/*  249 */       ((ev)localObject).an(paramArrayOfInt, 5, ((ev)localObject).m.length, -1079204677);
/*      */     } else {
/*  251 */       arrayOfByte = s.d(this.i[paramInt], false, -1890687910);
/*      */     }
/*      */ 
/*  254 */     Object localObject = c.a(arrayOfByte, -866462293);
/*      */ 
/*  291 */     if (this.w) this.i[paramInt] = null;
/*  292 */     if (k > 1) {
/*  293 */       int i3 = localObject.length;
/*  294 */       int i4 = localObject[(--i3)] & 0xFF;
/*  295 */       i3 -= i4 * k * 4;
/*  296 */       ev localev = new ev((byte[])localObject);
/*  297 */       int[] arrayOfInt2 = new int[k];
/*  298 */       localev.c = (-941396361 * i3);
/*  299 */       for (int i5 = 0; i5 < i4; i5++) {
/*  300 */         i6 = 0;
/*  301 */         for (i7 = 0; i7 < k; i7++) {
/*  302 */           i6 += localev.h(1480111843);
/*  303 */           arrayOfInt2[i7] += i6;
/*      */         }
/*      */       }
/*  306 */       byte[][] arrayOfByte1 = new byte[k][];
/*  307 */       for (int i6 = 0; i6 < k; i6++) {
/*  308 */         arrayOfByte1[i6] = new byte[arrayOfInt2[i6]];
/*  309 */         arrayOfInt2[i6] = 0;
/*      */       }
/*  311 */       localev.c = (-941396361 * i3);
/*  312 */       i6 = 0;
/*  313 */       for (int i7 = 0; i7 < i4; i7++) {
/*  314 */         int i8 = 0;
/*  315 */         for (int i9 = 0; i9 < k; i9++) {
/*  316 */           i8 += localev.h(-2060793071);
/*  317 */           System.arraycopy(localObject, i6, arrayOfByte1[i9], arrayOfInt2[i9], i8);
/*  318 */           arrayOfInt2[i9] += i8;
/*  319 */           i6 += i8;
/*      */         }
/*      */       }
/*  322 */       for (i7 = 0; i7 < k; i7++) {
/*  323 */         if (!this.e) arrayOfObject[arrayOfInt1[i7]] = cc.r(arrayOfByte1[i7], false, 2); else {
/*  324 */           arrayOfObject[arrayOfInt1[i7]] = arrayOfByte1[i7];
/*      */         }
/*      */       }
/*      */     }
/*  328 */     else if (!this.e) { arrayOfObject[arrayOfInt1[0]] = cc.r((byte[])localObject, false, -42); } else {
/*  329 */       arrayOfObject[arrayOfInt1[0]] = localObject;
/*      */     }
/*  331 */     return true;
/*      */   }
/*      */ 
/*      */   public byte[] z(int paramInt1, int paramInt2)
/*      */   {
/*  181 */     if (1 == this.s.length) { if (paramInt2 > 685894802);
/*  181 */       return l(0, paramInt1, 1774245974); }
/*  182 */     if (1 == this.s[paramInt1].length) { if (paramInt2 > 685894802);
/*  182 */       return l(paramInt1, 0, 1594402393); }
/*  183 */     throw new RuntimeException();
/*      */   }
/*      */ 
/*      */   public boolean n(int paramInt1, int paramInt2)
/*      */   {
/*  162 */     if (this.i[paramInt1] != null) { if (paramInt2 < -1483785783);
/*  162 */       return true; }
/*  163 */     i(paramInt1, (byte)24);
/*  164 */     if (null != this.i[paramInt1]) { if (paramInt2 < -1483785783);
/*  164 */       return true; }
/*  165 */     return false;
/*      */   }
/*      */ 
/*      */   public int bs(String paramString)
/*      */   {
/*  335 */     paramString = paramString.toLowerCase();
/*  336 */     return this.m.r(ck.j(paramString, -196293817));
/*      */   }
/*      */ 
/*      */   public byte[] bk(String paramString1, String paramString2)
/*      */   {
/*  345 */     paramString1 = paramString1.toLowerCase();
/*  346 */     paramString2 = paramString2.toLowerCase();
/*  347 */     int k = this.m.r(ck.j(paramString1, -196293817));
/*  348 */     int i1 = this.q[k].r(ck.j(paramString2, -196293817));
/*  349 */     return l(k, i1, 1050302691);
/*      */   }
/*      */ 
/*      */   public boolean bv(String paramString1, String paramString2) {
/*  353 */     paramString1 = paramString1.toLowerCase();
/*  354 */     paramString2 = paramString2.toLowerCase();
/*  355 */     int k = this.m.r(ck.j(paramString1, -196293817));
/*  356 */     int i1 = this.q[k].r(ck.j(paramString2, -196293817));
/*  357 */     return c(k, i1, 102578643);
/*      */   }
/*      */ 
/*      */   public int[] ag(int paramInt)
/*      */   {
/*  209 */     return this.z[paramInt];
/*      */   }
/*      */ 
/*      */   public void by(String paramString)
/*      */   {
/*  361 */     paramString = paramString.toLowerCase();
/*  362 */     int k = this.m.r(ck.j(paramString, -196293817));
/*  363 */     if (k < 0) return;
/*  364 */     d(k, (byte)119);
/*      */   }
/*      */ 
/*      */   public byte[] ah(int paramInt1, int paramInt2)
/*      */   {
/*  187 */     if ((paramInt1 < 0) || (paramInt1 >= this.s.length) || (this.s[paramInt1] == null) || (paramInt2 < 0) || (paramInt2 >= this.s[paramInt1].length)) return null;
/*  188 */     if (null == this.s[paramInt1][paramInt2]) {
/*  189 */       boolean bool = b(paramInt1, null, -1774274481);
/*  190 */       if (!bool) {
/*  191 */         i(paramInt1, (byte)116);
/*  192 */         bool = b(paramInt1, null, -1774274481);
/*  193 */         if (!bool) return null;
/*      */       }
/*      */     }
/*  196 */     byte[] arrayOfByte = s.d(this.s[paramInt1][paramInt2], false, -1655465314);
/*  197 */     return arrayOfByte;
/*      */   }
/*      */ 
/*      */   static final byte[] bf(byte[] paramArrayOfByte)
/*      */   {
/*  368 */     ev localev = new ev(paramArrayOfByte);
/*  369 */     int k = localev.t(1118814123);
/*  370 */     int i1 = localev.h(-1356860240);
/*  371 */     if ((i1 < 0) || ((397398037 * b != 0) && (i1 > b * 397398037))) {
/*  372 */       throw new RuntimeException();
/*      */     }
/*  374 */     if (k == 0) {
/*  375 */       byte[] arrayOfByte1 = new byte[i1];
/*  376 */       localev.as(arrayOfByte1, 0, i1, 1602313803);
/*  377 */       return arrayOfByte1;
/*      */     }
/*      */ 
/*  380 */     int i2 = localev.h(2119576846);
/*  381 */     if ((i2 < 0) || ((397398037 * b != 0) && (i2 > 397398037 * b))) {
/*  382 */       throw new RuntimeException();
/*      */     }
/*  384 */     byte[] arrayOfByte2 = new byte[i2];
/*  385 */     if (k == 1) bu.r(arrayOfByte2, i2, paramArrayOfByte, i1, 9); else
/*  386 */       u.r(localev, arrayOfByte2, (byte)0);
/*  387 */     return arrayOfByte2;
/*      */   }
/*      */ 
/*      */   public boolean av()
/*      */   {
/*  169 */     boolean bool = true;
/*  170 */     for (int k = 0; k < this.d.length; k++) {
/*  171 */       int i1 = this.d[k];
/*  172 */       if (this.i[i1] == null) {
/*  173 */         i(i1, (byte)64);
/*  174 */         if (null == this.i[i1]) bool = false;
/*      */       }
/*      */     }
/*  177 */     return bool;
/*      */   }
/*      */ 
/*      */   static final void ff(eg parameg, int paramInt1, int paramInt2, byte paramByte)
/*      */   {
/* 9151 */     if (null == client.ke) { if ((paramByte == -1) && (!client.jj)) break label28; if (paramByte != -1) return;  } return;
/* 9152 */     label28: if (null != parameg) { if ((paramByte == -1) && (bs.fz(parameg, -922966617) != null)) break label65; if (paramByte != -1) throw new IllegalStateException();  } return;
/* 9153 */     label65: client.ke = parameg;
/* 9154 */     client.kx = bs.fz(parameg, -922966617);
/* 9155 */     client.kk = 1117368529 * paramInt1;
/* 9156 */     client.kb = paramInt2 * 122626477;
/* 9157 */     cv.ll = 0;
/* 9158 */     client.kh = false;
/*      */   }
/*      */ 
/*      */   static final void gl(String paramString, int paramInt)
/*      */   {
/* 9616 */     if (null == paramString) { if (paramInt != -147639803);
/* 9616 */       return; }
/* 9617 */     if (client.pi * 428627887 >= 200) { if ((paramInt != -147639803) && (client.iy * -1334690681 != 1)) break label93; if (paramInt == -147639803) throw new IllegalStateException();  } if (428627887 * client.pi >= 200) { if (paramInt == -147639803) throw new IllegalStateException();
/* 9618 */       label93: ao.gn(0, "", ba.eu, 1546598895);
/* 9619 */       return;
/*      */     }
/* 9621 */     String str1 = bh.d(paramString, ab.al, -273626565);
/* 9622 */     if (str1 == null) { if (paramInt == -147639803) throw new IllegalStateException();
/*      */       return;
/*      */     }
/* 9623 */     Object localObject;
/*      */     String str2;
/*      */     String str3;
/* 9623 */     for (int k = 0; k < 428627887 * client.pi; k++) { if (paramInt != -147639803);
/* 9624 */       localObject = client.pf[k];
/* 9625 */       str2 = bh.d(((q)localObject).r, ab.al, -273626565);
/* 9626 */       if (null != str2) { if (paramInt == -147639803) throw new IllegalStateException(); if (str2.equals(str1)) { if (paramInt == -147639803) throw new IllegalStateException();
/* 9627 */           ao.gn(0, "", paramString + ba.fd, 839858042);
/* 9628 */           return; }
/*      */       }
/* 9630 */       if (((q)localObject).d != null) { if (paramInt != -147639803);
/* 9631 */         str3 = bh.d(((q)localObject).d, ab.al, -273626565);
/* 9632 */         if (str3 != null) { if (paramInt == -147639803) throw new IllegalStateException(); if (str3.equals(str1)) { if (paramInt == -147639803) throw new IllegalStateException();
/* 9633 */             ao.gn(0, "", paramString + ba.fd, 388808241);
/* 9634 */             return; }
/*      */         }
/*      */       }
/*      */     }
/* 9638 */     for (k = 0; k < client.pr * 1704207791; k++) { if (paramInt != -147639803);
/* 9639 */       localObject = client.pe[k];
/* 9640 */       str2 = bh.d(((m)localObject).r, ab.al, -273626565);
/* 9641 */       if ((null != str2) && ((paramInt == -147639803) || (str2.equals(str1)))) { if (paramInt == -147639803) throw new IllegalStateException();
/* 9642 */         ao.gn(0, "", ba.fp + paramString + ba.fg, 811090871);
/* 9643 */         return;
/*      */       }
/* 9645 */       if (null != ((m)localObject).d) { if (paramInt != -147639803);
/* 9646 */         str3 = bh.d(((m)localObject).d, ab.al, -273626565);
/* 9647 */         if ((str3 != null) && ((paramInt == -147639803) || (str3.equals(str1)))) { if (paramInt == -147639803) return;
/* 9648 */           ao.gn(0, "", ba.fp + paramString + ba.fg, 163422100);
/* 9649 */           return;
/*      */         }
/*      */       }
/*      */     }
/* 9653 */     if (bh.d(cr.ii.bu, ab.al, -273626565).equals(str1)) { if (paramInt == -147639803) return;
/* 9654 */       ao.gn(0, "", ba.fe, 2120995067);
/* 9655 */       return;
/*      */     }
/*      */ 
/* 9658 */     client.df.gt(203, 2062507603);
/* 9659 */     client.df.c(ea.q(paramString, 17763013), 1851187419);
/* 9660 */     client.df.i(paramString, -1578387639);
/*      */   }
/*      */ 
/*      */   public static void y(int paramInt)
/*      */   {
/*  625 */     eg.q.m();
/*  626 */     eg.i.m();
/*  627 */     eg.s.m();
/*      */   }
/*      */ 
/*      */   static final int w(int paramInt1, int paramInt2, byte paramByte)
/*      */   {
/*  945 */     if (-1 == paramInt1) { if (paramByte != 0);
/*  945 */       return 12345678; }
/*  946 */     paramInt2 = paramInt2 * (paramInt1 & 0x7F) / 128;
/*  947 */     if (paramInt2 < 2) { if (paramByte == 0) throw new IllegalStateException(); paramInt2 = 2;
/*  948 */     } else if (paramInt2 > 126) { if (paramByte != 0);
/*  948 */       paramInt2 = 126; }
/*  949 */     return paramInt2 + (paramInt1 & 0xFF80);
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ch
 * JD-Core Version:    0.6.2
 */