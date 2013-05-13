/*     */ public class ed extends dx
/*     */ {
/*     */   int ak;
/*     */   static final int o = 4;
/*  19 */   int[] v = new int[16];
/*     */ 
/*  17 */   int[] s = new int[16];
/*     */ 
/*  24 */   int[] t = new int[16];
/*     */ 
/*  21 */   int[] e = new int[16];
/*     */   cf z;
/*  20 */   int[] w = new int[16];
/*     */ 
/*  23 */   int[] y = new int[16];
/*     */ 
/*  22 */   int[] b = new int[16];
/*     */ 
/*  14 */   int g = -1628508928;
/*  15 */   int q = -1591091520;
/*     */   static final int f = 1;
/*     */   static final int k = 2;
/*  16 */   int[] i = new int[16];
/*     */ 
/*  18 */   int[] u = new int[16];
/*     */ 
/*  29 */   int[] h = new int[16];
/*  30 */   int[] x = new int[16];
/*  31 */   int[] p = new int[16];
/*  32 */   int[] ad = new int[16];
/*     */ 
/*  28 */   int[] a = new int[16];
/*     */ 
/*  34 */   ej[][] aa = new ej[16][''];
/*  35 */   ej[][] as = new ej[16][''];
/*  36 */   cs am = new cs();
/*     */   boolean ap;
/*     */   int av;
/*  33 */   int[] ac = new int[16];
/*     */   long az;
/*     */   long an;
/*  42 */   ex ah = new ex(this);
/*     */ 
/*     */   void de()
/*     */   {
/* 513 */     int j = 1327814981 * this.av;
/* 514 */     int m = 1194474949 * this.ak;
/* 515 */     long l = -5995049236264940859L * this.an;
/* 516 */     while (this.ak * 1194474949 == m) {
/* 517 */       while (m == this.am.c[j]) {
/* 518 */         this.am.c(j);
/* 519 */         int n = this.am.g(j);
/* 520 */         if (n == 1) {
/* 521 */           this.am.j();
/* 522 */           this.am.n(j);
/* 523 */           if (!this.am.v()) break;
/* 524 */           if ((this.ap) && (m != 0)) {
/* 525 */             this.am.w(l);
/* 526 */             break;
/*     */           }
/* 528 */           ae((byte)-18);
/* 529 */           this.am.d();
/* 530 */           return;
/*     */         }
/* 532 */         if ((n & 0x80) != 0) ai(n, 207699768);
/* 533 */         this.am.z(j);
/* 534 */         this.am.n(j);
/*     */       }
/* 536 */       j = this.am.u();
/* 537 */       m = this.am.c[j];
/* 538 */       l = this.am.s(m);
/*     */     }
/* 540 */     this.av = (-1481125491 * j);
/* 541 */     this.ak = (889862413 * m);
/* 542 */     this.an = (1359011237585314829L * l);
/*     */   }
/*     */ 
/*     */   int db(ej paramej)
/*     */   {
/* 406 */     int j = paramej.s * -877191411 + (-937318833 * paramej.v * (-554657737 * paramej.u) >> 12);
/* 407 */     j += (this.x[(1720864287 * paramej.m)] * (this.b[(paramej.m * 1720864287)] - 8192) >> 12);
/* 408 */     cr localcr = paramej.j;
/* 409 */     if ((localcr.z * -1415472437 > 0) && ((localcr.j * 1598999643 > 0) || (this.y[(1720864287 * paramej.m)] > 0))) {
/* 410 */       m = 1598999643 * localcr.j << 2;
/* 411 */       int n = localcr.g * -1501172067 << 1;
/* 412 */       if (paramej.f * 879779013 < n) m = m * (paramej.f * 879779013) / n;
/* 413 */       m += (this.y[(paramej.m * 1720864287)] >> 7);
/* 414 */       double d = Math.sin(0.01227184630308513D * (paramej.k * -1623116543 & 0x1FF));
/* 415 */       j += (int)(m * d);
/*     */     }
/* 417 */     int m = (int)(paramej.n.c * 256 * Math.pow(2.0D, j * 0.0003255208333333333D) / (-1570391439 * y.r) + 0.5D);
/* 418 */     return m < 1 ? 1 : m;
/*     */   }
/*     */ 
/*     */   synchronized void br(ei paramei, boolean paramBoolean)
/*     */   {
/*  88 */     ap((byte)0);
/*  89 */     this.am.r(paramei.c);
/*  90 */     this.ap = paramBoolean;
/*  91 */     this.az = 0L;
/*  92 */     int j = this.am.m();
/*  93 */     for (int m = 0; m < j; m++) {
/*  94 */       this.am.c(m);
/*  95 */       this.am.z(m);
/*  96 */       this.am.n(m);
/*     */     }
/*  98 */     this.av = (this.am.u() * -1481125491);
/*  99 */     this.ak = (889862413 * this.am.c[(1327814981 * this.av)]);
/* 100 */     this.an = (this.am.s(1194474949 * this.ak) * 1359011237585314829L);
/*     */   }
/*     */ 
/*     */   synchronized boolean ac(ei paramei, ch paramch, a parama, int paramInt, byte paramByte)
/*     */   {
/*  58 */     paramei.n();
/*  59 */     boolean bool = true;
/*  60 */     int[] arrayOfInt = null;
/*  61 */     if (paramInt > 0) { if (paramByte <= 15) throw new IllegalStateException(); arrayOfInt = new int[] { paramInt }; }
/*  62 */     for (ew localew = (ew)paramei.m.m(); null != localew; localew = (ew)paramei.m.c()) { if (paramByte > 15);
/*  63 */       int j = (int)localew.r;
/*  64 */       ef localef = (ef)this.z.r(j);
/*  65 */       if (null == localef) { if (paramByte > 15);
/*  66 */         localef = l.c(paramch, j, -1870180593);
/*  67 */         if (localef == null) { if (paramByte > 15);
/*  68 */           bool = false;
/*     */         } else
/*     */         {
/*  71 */           this.z.d(localef, j);
/*     */         }
/*  73 */       } else if (!localef.n(parama, localew.m, arrayOfInt, 526957205)) { if (paramByte <= 15) throw new IllegalStateException(); bool = false; }
/*     */     }
/*  75 */     if (bool) { if (paramByte <= 15) throw new IllegalStateException(); paramei.j(); }
/*  76 */     return bool;
/*     */   }
/*     */ 
/*     */   void co(int paramInt1, int paramInt2)
/*     */   {
/* 117 */     this.v[paramInt1] = paramInt2;
/* 118 */     this.e[paramInt1] = (paramInt2 & 0xFFFFFF80);
/* 119 */     an(paramInt1, paramInt2, 2012820934);
/*     */   }
/*     */ 
/*     */   void cc(int paramInt1, int paramInt2)
/*     */   {
/* 117 */     this.v[paramInt1] = paramInt2;
/* 118 */     this.e[paramInt1] = (paramInt2 & 0xFFFFFF80);
/* 119 */     an(paramInt1, paramInt2, 2138489592);
/*     */   }
/*     */ 
/*     */   synchronized void am(ei paramei, boolean paramBoolean, byte paramByte)
/*     */   {
/*  88 */     ap((byte)0);
/*  89 */     this.am.r(paramei.c);
/*  90 */     this.ap = paramBoolean;
/*  91 */     this.az = 0L;
/*  92 */     int j = this.am.m();
/*  93 */     for (int m = 0; m < j; m++) { if (paramByte == 14) return;
/*  94 */       this.am.c(m);
/*  95 */       this.am.z(m);
/*  96 */       this.am.n(m);
/*     */     }
/*  98 */     this.av = (this.am.u() * -1481125491);
/*  99 */     this.ak = (889862413 * this.am.c[(1327814981 * this.av)]);
/* 100 */     this.an = (this.am.s(1194474949 * this.ak) * 1359011237585314829L);
/*     */   }
/*     */ 
/*     */   synchronized dx v()
/*     */   {
/* 460 */     return this.ah;
/*     */   }
/*     */ 
/*     */   synchronized boolean av(int paramInt)
/*     */   {
/* 109 */     return this.am.l();
/*     */   }
/*     */ 
/*     */   public synchronized void ak(int paramInt1, int paramInt2, int paramInt3) {
/* 113 */     az(paramInt1, paramInt2, 31374679);
/*     */   }
/*     */ 
/*     */   void au(int paramInt, byte paramByte)
/*     */   {
/* 279 */     if (0 != (this.a[paramInt] & 0x2)) { if (paramByte <= -1) throw new IllegalStateException();
/* 280 */       for (ej localej = (ej)this.ah.g.j(); null != localej; localej = (ej)this.ah.g.g()) { if (paramByte <= -1) return;
/* 281 */         if ((1720864287 * localej.m == paramInt) && ((paramByte <= -1) || ((this.aa[paramInt][(-91733895 * localej.g)] == null) && ((paramByte <= -1) || 
/* 282 */           (localej.y * -225172079 < 0))))) { if (paramByte <= -1) return; localej.y = 0;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   int aw(ej paramej, int paramInt)
/*     */   {
/* 406 */     int j = paramej.s * -877191411 + (-937318833 * paramej.v * (-554657737 * paramej.u) >> 12);
/* 407 */     j += (this.x[(1720864287 * paramej.m)] * (this.b[(paramej.m * 1720864287)] - 8192) >> 12);
/* 408 */     cr localcr = paramej.j;
/* 409 */     if (localcr.z * -1415472437 > 0) { if (paramInt <= -259794601) throw new IllegalStateException(); if (localcr.j * 1598999643 <= 0) { if ((paramInt > -259794601) && (this.y[(1720864287 * paramej.m)] <= 0)) break label257; if (paramInt <= -259794601) throw new IllegalStateException(); 
/*     */       }
/* 410 */       m = 1598999643 * localcr.j << 2;
/* 411 */       int n = localcr.g * -1501172067 << 1;
/* 412 */       if (paramej.f * 879779013 < n) { if (paramInt > -259794601);
/* 412 */         m = m * (paramej.f * 879779013) / n; }
/* 413 */       m += (this.y[(paramej.m * 1720864287)] >> 7);
/* 414 */       double d = Math.sin(0.01227184630308513D * (paramej.k * -1623116543 & 0x1FF));
/* 415 */       j += (int)(m * d);
/*     */     }
/* 417 */     label257: int m = (int)(paramej.n.c * 256 * Math.pow(2.0D, j * 0.0003255208333333333D) / (-1570391439 * y.r) + 0.5D);
/* 418 */     if (paramInt > -259794601);
/* 418 */     return m < 1 ? 1 : m;
/*     */   }
/*     */ 
/*     */   synchronized void bm()
/*     */   {
/*  84 */     for (ef localef = (ef)this.z.m(); localef != null; localef = (ef)this.z.c()) localef.r();
/*     */   }
/*     */ 
/*     */   void ay(ej paramej, boolean paramBoolean, int paramInt)
/*     */   {
/* 185 */     int j = paramej.n.n.length;
/*     */     int m;
/* 187 */     if ((paramBoolean) && ((paramInt == 1198453124) || (paramej.n.g))) { if (paramInt == 1198453124) return;
/* 188 */       int n = j + j - paramej.n.j;
/* 189 */       m = (int)(n * this.p[(1720864287 * paramej.m)] >> 6);
/* 190 */       j <<= 8;
/* 191 */       if (m >= j) { if (paramInt == 1198453124) return;
/* 192 */         m = j + j - 1 - m;
/* 193 */         paramej.o.ay(true); }
/*     */     }
/*     */     else
/*     */     {
/* 197 */       m = (int)(this.p[(1720864287 * paramej.m)] * j >> 6);
/*     */     }
/* 199 */     paramej.o.ah(m);
/*     */   }
/*     */ 
/*     */   synchronized void p(int paramInt1, int paramInt2)
/*     */   {
/*  50 */     this.g = (765390573 * paramInt1);
/*     */   }
/*     */ 
/*     */   void ab(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*     */   }
/*     */ 
/*     */   synchronized dx e()
/*     */   {
/* 460 */     return this.ah;
/*     */   }
/*     */ 
/*     */   void ag(int paramInt1, int paramInt2, short paramShort)
/*     */   {
/* 223 */     this.b[paramInt1] = paramInt2;
/*     */   }
/*     */ 
/*     */   boolean dl(ej paramej)
/*     */   {
/* 546 */     if (paramej.o == null) {
/* 547 */       if (paramej.y * -225172079 >= 0) {
/* 548 */         paramej.r();
/* 549 */         if ((paramej.z * -1619622529 > 0) && (paramej == this.as[(paramej.m * 1720864287)][(paramej.z * -1619622529)])) {
/* 550 */           this.as[(paramej.m * 1720864287)][(-1619622529 * paramej.z)] = null;
/*     */         }
/*     */       }
/* 553 */       return true;
/*     */     }
/* 555 */     return false;
/*     */   }
/*     */ 
/*     */   void aq(int paramInt1, int paramInt2)
/*     */   {
/* 241 */     if (paramInt1 < 0) { if (paramInt2 != 1982273969);
/* 242 */       for (paramInt1 = 0; paramInt1 < 16; paramInt1++) { if (paramInt2 != 1982273969);
/* 242 */         aq(paramInt1, -320591065); }
/* 243 */       return;
/*     */     }
/* 245 */     this.i[paramInt1] = 12800;
/* 246 */     this.s[paramInt1] = 8192;
/* 247 */     this.u[paramInt1] = 16383;
/* 248 */     this.b[paramInt1] = 8192;
/* 249 */     this.y[paramInt1] = 0;
/* 250 */     this.t[paramInt1] = 8192;
/* 251 */     au(paramInt1, (byte)75);
/* 252 */     ax(paramInt1, (byte)13);
/* 253 */     this.a[paramInt1] = 0;
/* 254 */     this.h[paramInt1] = 32767;
/* 255 */     this.x[paramInt1] = 256;
/* 256 */     this.p[paramInt1] = 0;
/* 257 */     aj(paramInt1, 8192, -1699099862);
/*     */   }
/*     */ 
/*     */   void at(int paramInt1, int paramInt2) {
/* 261 */     for (ej localej = (ej)this.ah.g.j(); null != localej; localej = (ej)this.ah.g.g()) { if ((paramInt2 >= -1586161636) || 
/* 262 */         (paramInt1 >= 0)) { if (paramInt2 >= -1586161636) throw new IllegalStateException(); if (paramInt1 != localej.m * 1720864287) continue; if (paramInt2 >= -1586161636) throw new IllegalStateException(); 
/*     */       }
/* 263 */       if (-225172079 * localej.y < 0) { if (paramInt2 >= -1586161636) throw new IllegalStateException();
/* 264 */         this.aa[(localej.m * 1720864287)][(localej.g * -91733895)] = null;
/* 265 */         localej.y = 0;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   void ae(byte paramByte)
/*     */   {
/* 272 */     ar(-1, (byte)-17);
/* 273 */     aq(-1, 522569399);
/* 274 */     for (int j = 0; j < 16; j++) { if (paramByte >= 0) throw new IllegalStateException(); this.w[j] = this.v[j]; }
/* 275 */     for (j = 0; j < 16; j++) { if (paramByte < 0);
/* 275 */       this.e[j] = (this.v[j] & 0xFFFFFF80);
/*     */     }
/*     */   }
/*     */ 
/*     */   synchronized void cs()
/*     */   {
/* 104 */     this.am.d();
/* 105 */     ae((byte)-1);
/*     */   }
/*     */ 
/*     */   void ax(int paramInt, byte paramByte)
/*     */   {
/* 289 */     if ((this.a[paramInt] & 0x4) != 0) { if (paramByte <= 1) throw new IllegalStateException();
/* 290 */       for (ej localej = (ej)this.ah.g.j(); null != localej; localej = (ej)this.ah.g.g()) { if (paramByte <= 1) return;
/* 291 */         if (1720864287 * localej.m == paramInt) { if (paramByte <= 1) return; localej.x = 0; } }
/*     */     }
/*     */   }
/*     */ 
/*     */   void ai(int paramInt1, int paramInt2)
/*     */   {
/* 297 */     int j = paramInt1 & 0xF0;
/*     */     int m;
/*     */     int n;
/*     */     int i1;
/* 298 */     if (j == 128) { if (paramInt2 != 207699768) return;
/* 299 */       m = paramInt1 & 0xF;
/* 300 */       n = paramInt1 >> 8 & 0x7F;
/* 301 */       i1 = paramInt1 >> 16 & 0x7F;
/* 302 */       al(m, n, i1, 971818374);
/* 303 */       return;
/*     */     }
/* 305 */     if (j == 144) { if (paramInt2 != 207699768) throw new IllegalStateException();
/* 306 */       m = paramInt1 & 0xF;
/* 307 */       n = paramInt1 >> 8 & 0x7F;
/* 308 */       i1 = paramInt1 >> 16 & 0x7F;
/* 309 */       if (i1 > 0) { if (paramInt2 == 207699768);
/* 309 */         ah(m, n, i1, 374301821); } else {
/* 310 */         al(m, n, 64, 897577442);
/* 311 */       }return;
/*     */     }
/* 313 */     if (160 == j) { if (paramInt2 != 207699768) throw new IllegalStateException();
/* 314 */       m = paramInt1 & 0xF;
/* 315 */       n = paramInt1 >> 8 & 0x7F;
/* 316 */       i1 = paramInt1 >> 16 & 0x7F;
/* 317 */       ab(m, n, i1, 1810851958);
/* 318 */       return;
/*     */     }
/* 320 */     if (j == 176) { if (paramInt2 != 207699768) return;
/* 321 */       m = paramInt1 & 0xF;
/* 322 */       n = paramInt1 >> 8 & 0x7F;
/* 323 */       i1 = paramInt1 >> 16 & 0x7F;
/* 324 */       if (0 == n) { if (paramInt2 == 207699768);
/* 324 */         this.e[m] = ((this.e[m] & 0xFFE03FFF) + (i1 << 14)); }
/* 325 */       if (32 == n) { if (paramInt2 == 207699768);
/* 325 */         this.e[m] = ((this.e[m] & 0xFFFFC07F) + (i1 << 7)); }
/* 326 */       if (1 == n) { if (paramInt2 != 207699768) return; this.y[m] = ((i1 << 7) + (this.y[m] & 0xFFFFC07F)); }
/* 327 */       if (n == 33) { if (paramInt2 != 207699768) throw new IllegalStateException(); this.y[m] = (i1 + (this.y[m] & 0xFFFFFF80)); }
/* 328 */       if (5 == n) { if (paramInt2 == 207699768);
/* 328 */         this.t[m] = ((i1 << 7) + (this.t[m] & 0xFFFFC07F)); }
/* 329 */       if (n == 37) { if (paramInt2 == 207699768);
/* 329 */         this.t[m] = ((this.t[m] & 0xFFFFFF80) + i1); }
/* 330 */       if (n == 7) { if (paramInt2 != 207699768) return; this.i[m] = ((i1 << 7) + (this.i[m] & 0xFFFFC07F)); }
/* 331 */       if (n == 39) { if (paramInt2 != 207699768) return; this.i[m] = (i1 + (this.i[m] & 0xFFFFFF80)); }
/* 332 */       if (n == 10) { if (paramInt2 != 207699768) return; this.s[m] = ((this.s[m] & 0xFFFFC07F) + (i1 << 7)); }
/* 333 */       if (n == 42) { if (paramInt2 == 207699768);
/* 333 */         this.s[m] = (i1 + (this.s[m] & 0xFFFFFF80)); }
/* 334 */       if (11 == n) { if (paramInt2 != 207699768) return; this.u[m] = ((this.u[m] & 0xFFFFC07F) + (i1 << 7)); }
/* 335 */       if (n == 43) { if (paramInt2 == 207699768);
/* 335 */         this.u[m] = (i1 + (this.u[m] & 0xFFFFFF80)); }
/* 336 */       if (n == 64) if ((paramInt2 != 207699768) || 
/* 337 */           (i1 >= 64)) { if (paramInt2 != 207699768) throw new IllegalStateException(); this.a[m] |= 1; } else {
/* 338 */           this.a[m] &= -2;
/*     */         }
/* 340 */       if (n == 65) { if (paramInt2 != 207699768) throw new IllegalStateException();
/* 341 */         if (i1 >= 64) { if (paramInt2 != 207699768) throw new IllegalStateException(); this.a[m] |= 2;
/*     */         } else {
/* 343 */           au(m, (byte)74);
/* 344 */           this.a[m] &= -3;
/*     */         }
/*     */       }
/* 347 */       if (99 == n) { if (paramInt2 == 207699768);
/* 347 */         this.h[m] = ((this.h[m] & 0x7F) + (i1 << 7)); }
/* 348 */       if (98 == n) { if (paramInt2 == 207699768);
/* 348 */         this.h[m] = (i1 + (this.h[m] & 0x3F80)); }
/* 349 */       if (101 == n) { if (paramInt2 == 207699768);
/* 349 */         this.h[m] = (16384 + (this.h[m] & 0x7F) + (i1 << 7)); }
/* 350 */       if (100 == n) { if (paramInt2 != 207699768) throw new IllegalStateException(); this.h[m] = (i1 + (16384 + (this.h[m] & 0x3F80))); }
/* 351 */       if (120 == n) { if (paramInt2 == 207699768);
/* 351 */         ar(m, (byte)-72); }
/* 352 */       if (121 == n) { if (paramInt2 == 207699768);
/* 352 */         aq(m, -123879400); }
/* 353 */       if (123 == n) { if (paramInt2 != 207699768) throw new IllegalStateException(); at(m, -1983104600);
/*     */       }
/* 354 */       int i2;
/* 354 */       if (6 == n) { if (paramInt2 != 207699768) return;
/* 355 */         i2 = this.h[m];
/* 356 */         if (i2 == 16384) { if (paramInt2 == 207699768);
/* 356 */           this.x[m] = ((this.x[m] & 0xFFFFC07F) + (i1 << 7)); }
/*     */       }
/* 358 */       if (38 == n) { if (paramInt2 != 207699768) return;
/* 359 */         i2 = this.h[m];
/* 360 */         if (i2 == 16384) { if (paramInt2 == 207699768);
/* 360 */           this.x[m] = ((this.x[m] & 0xFFFFFF80) + i1); }
/*     */       }
/* 362 */       if (n == 16) { if (paramInt2 != 207699768) throw new IllegalStateException(); this.p[m] = ((i1 << 7) + (this.p[m] & 0xFFFFC07F)); }
/* 363 */       if (48 == n) { if (paramInt2 != 207699768) throw new IllegalStateException(); this.p[m] = ((this.p[m] & 0xFFFFFF80) + i1); }
/* 364 */       if (81 == n) if ((paramInt2 != 207699768) || 
/* 365 */           (i1 >= 64)) { if (paramInt2 == 207699768);
/* 365 */           this.a[m] |= 4;
/*     */         } else {
/* 367 */           ax(m, (byte)45);
/* 368 */           this.a[m] &= -5;
/*     */         }
/*     */ 
/* 371 */       if (17 == n) { if (paramInt2 != 207699768) throw new IllegalStateException(); aj(m, (i1 << 7) + (this.ad[m] & 0xFFFFC07F), -1699099862); }
/* 372 */       if (49 == n) { if (paramInt2 == 207699768);
/* 372 */         aj(m, (this.ad[m] & 0xFFFFFF80) + i1, -1699099862); }
/* 373 */       return;
/*     */     }
/* 375 */     if (j == 192) { if (paramInt2 != 207699768) throw new IllegalStateException();
/* 376 */       m = paramInt1 & 0xF;
/* 377 */       n = paramInt1 >> 8 & 0x7F;
/* 378 */       an(m, this.e[m] + n, 2094901181);
/* 379 */       return;
/*     */     }
/* 381 */     if (208 == j) { if (paramInt2 != 207699768) throw new IllegalStateException();
/* 382 */       m = paramInt1 & 0xF;
/* 383 */       n = paramInt1 >> 8 & 0x7F;
/* 384 */       ao(m, n, 469490057);
/* 385 */       return;
/*     */     }
/* 387 */     if (224 == j) { if (paramInt2 != 207699768) return;
/* 388 */       m = paramInt1 & 0xF;
/* 389 */       n = (paramInt1 >> 8 & 0x7F) + (paramInt1 >> 9 & 0x3F80);
/* 390 */       ag(m, n, (short)14161);
/* 391 */       return;
/*     */     }
/* 393 */     j = paramInt1 & 0xFF;
/* 394 */     if (j == 255) { if (paramInt2 != 207699768) return;
/* 395 */       ae((byte)-9);
/* 396 */       return; }
/*     */   }
/*     */ 
/*     */   void aj(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 401 */     this.ad[paramInt1] = paramInt2;
/* 402 */     this.ac[paramInt1] = ((int)(2097152.0D * Math.pow(2.0D, paramInt2 * 0.00054931640625D) + 0.5D));
/*     */   }
/*     */ 
/*     */   void az(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 117 */     this.v[paramInt1] = paramInt2;
/* 118 */     this.e[paramInt1] = (paramInt2 & 0xFFFFFF80);
/* 119 */     an(paramInt1, paramInt2, 2101460903);
/*     */   }
/*     */ 
/*     */   void dc(int paramInt)
/*     */   {
/* 297 */     int j = paramInt & 0xF0;
/*     */     int m;
/*     */     int n;
/*     */     int i1;
/* 298 */     if (j == 128) {
/* 299 */       m = paramInt & 0xF;
/* 300 */       n = paramInt >> 8 & 0x7F;
/* 301 */       i1 = paramInt >> 16 & 0x7F;
/* 302 */       al(m, n, i1, 1824014089);
/* 303 */       return;
/*     */     }
/* 305 */     if (j == 144) {
/* 306 */       m = paramInt & 0xF;
/* 307 */       n = paramInt >> 8 & 0x7F;
/* 308 */       i1 = paramInt >> 16 & 0x7F;
/* 309 */       if (i1 > 0) ah(m, n, i1, 374301821); else
/* 310 */         al(m, n, 64, 1611885742);
/* 311 */       return;
/*     */     }
/* 313 */     if (160 == j) {
/* 314 */       m = paramInt & 0xF;
/* 315 */       n = paramInt >> 8 & 0x7F;
/* 316 */       i1 = paramInt >> 16 & 0x7F;
/* 317 */       ab(m, n, i1, 2061133037);
/* 318 */       return;
/*     */     }
/* 320 */     if (j == 176) {
/* 321 */       m = paramInt & 0xF;
/* 322 */       n = paramInt >> 8 & 0x7F;
/* 323 */       i1 = paramInt >> 16 & 0x7F;
/* 324 */       if (0 == n) this.e[m] = ((this.e[m] & 0xFFE03FFF) + (i1 << 14));
/* 325 */       if (32 == n) this.e[m] = ((this.e[m] & 0xFFFFC07F) + (i1 << 7));
/* 326 */       if (1 == n) this.y[m] = ((i1 << 7) + (this.y[m] & 0xFFFFC07F));
/* 327 */       if (n == 33) this.y[m] = (i1 + (this.y[m] & 0xFFFFFF80));
/* 328 */       if (5 == n) this.t[m] = ((i1 << 7) + (this.t[m] & 0xFFFFC07F));
/* 329 */       if (n == 37) this.t[m] = ((this.t[m] & 0xFFFFFF80) + i1);
/* 330 */       if (n == 7) this.i[m] = ((i1 << 7) + (this.i[m] & 0xFFFFC07F));
/* 331 */       if (n == 39) this.i[m] = (i1 + (this.i[m] & 0xFFFFFF80));
/* 332 */       if (n == 10) this.s[m] = ((this.s[m] & 0xFFFFC07F) + (i1 << 7));
/* 333 */       if (n == 42) this.s[m] = (i1 + (this.s[m] & 0xFFFFFF80));
/* 334 */       if (11 == n) this.u[m] = ((this.u[m] & 0xFFFFC07F) + (i1 << 7));
/* 335 */       if (n == 43) this.u[m] = (i1 + (this.u[m] & 0xFFFFFF80));
/* 336 */       if (n == 64) {
/* 337 */         if (i1 >= 64) this.a[m] |= 1; else
/* 338 */           this.a[m] &= -2;
/*     */       }
/* 340 */       if (n == 65) {
/* 341 */         if (i1 >= 64) { this.a[m] |= 2;
/*     */         } else {
/* 343 */           au(m, (byte)72);
/* 344 */           this.a[m] &= -3;
/*     */         }
/*     */       }
/* 347 */       if (99 == n) this.h[m] = ((this.h[m] & 0x7F) + (i1 << 7));
/* 348 */       if (98 == n) this.h[m] = (i1 + (this.h[m] & 0x3F80));
/* 349 */       if (101 == n) this.h[m] = (16384 + (this.h[m] & 0x7F) + (i1 << 7));
/* 350 */       if (100 == n) this.h[m] = (i1 + (16384 + (this.h[m] & 0x3F80)));
/* 351 */       if (120 == n) ar(m, (byte)-57);
/* 352 */       if (121 == n) aq(m, 373891082);
/* 353 */       if (123 == n) at(m, -1607015151);
/*     */       int i2;
/* 354 */       if (6 == n) {
/* 355 */         i2 = this.h[m];
/* 356 */         if (i2 == 16384) this.x[m] = ((this.x[m] & 0xFFFFC07F) + (i1 << 7));
/*     */       }
/* 358 */       if (38 == n) {
/* 359 */         i2 = this.h[m];
/* 360 */         if (i2 == 16384) this.x[m] = ((this.x[m] & 0xFFFFFF80) + i1);
/*     */       }
/* 362 */       if (n == 16) this.p[m] = ((i1 << 7) + (this.p[m] & 0xFFFFC07F));
/* 363 */       if (48 == n) this.p[m] = ((this.p[m] & 0xFFFFFF80) + i1);
/* 364 */       if (81 == n) {
/* 365 */         if (i1 >= 64) { this.a[m] |= 4;
/*     */         } else {
/* 367 */           ax(m, (byte)40);
/* 368 */           this.a[m] &= -5;
/*     */         }
/*     */       }
/* 371 */       if (17 == n) aj(m, (i1 << 7) + (this.ad[m] & 0xFFFFC07F), -1699099862);
/* 372 */       if (49 == n) aj(m, (this.ad[m] & 0xFFFFFF80) + i1, -1699099862);
/* 373 */       return;
/*     */     }
/* 375 */     if (j == 192) {
/* 376 */       m = paramInt & 0xF;
/* 377 */       n = paramInt >> 8 & 0x7F;
/* 378 */       an(m, this.e[m] + n, 2086897772);
/* 379 */       return;
/*     */     }
/* 381 */     if (208 == j) {
/* 382 */       m = paramInt & 0xF;
/* 383 */       n = paramInt >> 8 & 0x7F;
/* 384 */       ao(m, n, 1307558273);
/* 385 */       return;
/*     */     }
/* 387 */     if (224 == j) {
/* 388 */       m = paramInt & 0xF;
/* 389 */       n = (paramInt >> 8 & 0x7F) + (paramInt >> 9 & 0x3F80);
/* 390 */       ag(m, n, (short)-12722);
/* 391 */       return;
/*     */     }
/* 393 */     j = paramInt & 0xFF;
/* 394 */     if (j == 255) {
/* 395 */       ae((byte)-27);
/* 396 */       return;
/*     */     }
/*     */   }
/*     */ 
/*     */   void dk()
/*     */   {
/* 272 */     ar(-1, (byte)-103);
/* 273 */     aq(-1, 1106438237);
/* 274 */     for (int j = 0; j < 16; j++) this.w[j] = this.v[j];
/* 275 */     for (j = 0; j < 16; j++) this.e[j] = (this.v[j] & 0xFFFFFF80);
/*     */   }
/*     */ 
/*     */   synchronized void aa(byte paramByte)
/*     */   {
/*  80 */     for (ef localef = (ef)this.z.m(); null != localef; localef = (ef)this.z.c()) { if (paramByte == 16) return; localef.j((byte)-39);
/*     */     }
/*     */   }
/*     */ 
/*     */   synchronized dx j()
/*     */   {
/* 464 */     return null;
/*     */   }
/*     */ 
/*     */   boolean dw(ej paramej)
/*     */   {
/* 546 */     if (paramej.o == null) {
/* 547 */       if (paramej.y * -225172079 >= 0) {
/* 548 */         paramej.r();
/* 549 */         if ((paramej.z * -1619622529 > 0) && (paramej == this.as[(paramej.m * 1720864287)][(paramej.z * -1619622529)])) {
/* 550 */           this.as[(paramej.m * 1720864287)][(-1619622529 * paramej.z)] = null;
/*     */         }
/*     */       }
/* 553 */       return true;
/*     */     }
/* 555 */     return false;
/*     */   }
/*     */ 
/*     */   synchronized void q(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/* 472 */     if (this.am.l()) {
/* 473 */       int j = 267109451 * this.q * this.am.d / (y.r * -1570391439);
/*     */       while (true) {
/* 475 */         long l = j * paramInt2 + -5382402532361213583L * this.az;
/* 476 */         if (this.an * -5995049236264940859L - l >= 0L) {
/* 477 */           this.az = (l * -6874601403000866927L);
/*     */         }
/*     */         else {
/* 480 */           int m = (int)((j + (this.an * -5995049236264940859L - this.az * -5382402532361213583L) - 1L) / j);
/* 481 */           this.az += -6874601403000866927L * (m * j);
/* 482 */           this.ah.q(paramArrayOfInt, paramInt1, m);
/* 483 */           paramInt1 += m;
/* 484 */           paramInt2 -= m;
/* 485 */           bi(55291032);
/* 486 */           if (!this.am.l()) break; 
/*     */         }
/*     */       }
/*     */     }
/* 489 */     this.ah.q(paramArrayOfInt, paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */   synchronized void i(int paramInt) {
/* 493 */     if (this.am.l()) {
/* 494 */       int j = this.am.d * (this.q * 267109451) / (y.r * -1570391439);
/*     */       while (true) {
/* 496 */         long l = this.az * -5382402532361213583L + j * paramInt;
/* 497 */         if (this.an * -5995049236264940859L - l >= 0L) {
/* 498 */           this.az = (l * -6874601403000866927L);
/*     */         }
/*     */         else {
/* 501 */           int m = (int)((-5995049236264940859L * this.an - -5382402532361213583L * this.az + j - 1L) / j);
/* 502 */           this.az += m * j * -6874601403000866927L;
/* 503 */           this.ah.i(m);
/* 504 */           paramInt -= m;
/* 505 */           bi(-794489558);
/* 506 */           if (!this.am.l()) break; 
/*     */         }
/*     */       }
/*     */     }
/* 509 */     this.ah.i(paramInt);
/*     */   }
/*     */ 
/*     */   void bi(int paramInt) {
/* 513 */     int j = 1327814981 * this.av;
/* 514 */     int m = 1194474949 * this.ak;
/* 515 */     long l = -5995049236264940859L * this.an;
/* 516 */     while (this.ak * 1194474949 == m) { if (paramInt != -1890018418);
/* 517 */       while (m == this.am.c[j]) { if (paramInt != -1890018418);
/* 518 */         this.am.c(j);
/* 519 */         int n = this.am.g(j);
/* 520 */         if (n == 1) { if (paramInt == -1890018418) throw new IllegalStateException();
/* 521 */           this.am.j();
/* 522 */           this.am.n(j);
/* 523 */           if (!this.am.v()) { if (paramInt == -1890018418) return; break; }
/* 524 */           if ((this.ap) && ((paramInt == -1890018418) || (m != 0))) { if (paramInt != -1890018418);
/* 525 */             this.am.w(l);
/* 526 */             break;
/*     */           }
/* 528 */           ae((byte)-68);
/* 529 */           this.am.d();
/* 530 */           return;
/*     */         }
/* 532 */         if ((n & 0x80) != 0) { if (paramInt == -1890018418) return; ai(n, 207699768); }
/* 533 */         this.am.z(j);
/* 534 */         this.am.n(j);
/*     */       }
/* 536 */       j = this.am.u();
/* 537 */       m = this.am.c[j];
/* 538 */       l = this.am.s(m);
/*     */     }
/* 540 */     this.av = (-1481125491 * j);
/* 541 */     this.ak = (889862413 * m);
/* 542 */     this.an = (1359011237585314829L * l);
/*     */   }
/*     */ 
/*     */   boolean bs(ej paramej, byte paramByte) {
/* 546 */     if (paramej.o == null) { if ((paramByte != 16) || 
/* 547 */         (paramej.y * -225172079 >= 0)) { if (paramByte == 16);
/* 548 */         paramej.r();
/* 549 */         if ((paramej.z * -1619622529 > 0) && ((paramByte != 16) || (paramej == this.as[(paramej.m * 1720864287)][(paramej.z * -1619622529)]))) { if (paramByte != 16) throw new IllegalStateException();
/* 550 */           this.as[(paramej.m * 1720864287)][(-1619622529 * paramej.z)] = null;
/*     */         }
/*     */       }
/* 553 */       return true;
/*     */     }
/* 555 */     return false;
/*     */   }
/*     */ 
/*     */   void ah(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 130 */     al(paramInt1, paramInt2, 64, 1664882778);
/* 131 */     if (0 != (this.a[paramInt1] & 0x2)) { if (paramInt4 == 374301821);
/* 132 */       for (localObject = (ej)this.ah.g.z(); localObject != null; localObject = (ej)this.ah.g.q()) if ((paramInt4 != 374301821) || 
/* 133 */           (paramInt1 == ((ej)localObject).m * 1720864287)) { if (paramInt4 != 374301821) throw new IllegalStateException(); if (((ej)localObject).y * -225172079 < 0) { if (paramInt4 != 374301821) throw new IllegalStateException();
/* 134 */             this.aa[paramInt1][(-91733895 * localObject.g)] = null;
/* 135 */             this.aa[paramInt1][paramInt2] = localObject;
/* 136 */             int j = (((ej)localObject).u * -554657737 * (((ej)localObject).v * -937318833) >> 12) + ((ej)localObject).s * -877191411;
/* 137 */             localObject.s += -1036335163 * (paramInt2 - -91733895 * ((ej)localObject).g << 8);
/* 138 */             ((ej)localObject).u = ((j - ((ej)localObject).s * -877191411) * 2104139143);
/* 139 */             ((ej)localObject).v = 2064314368;
/* 140 */             ((ej)localObject).g = (1170352585 * paramInt2);
/* 141 */             return;
/*     */           }
/*     */         }
/*     */     }
/* 145 */     Object localObject = (ef)this.z.r(this.w[paramInt1]);
/* 146 */     if (localObject == null) { if (paramInt4 == 374301821);
/* 146 */       return; }
/* 147 */     eq localeq = localObject.c[paramInt2];
/* 148 */     if (localeq == null) { if (paramInt4 != 374301821) return; return; }
/* 149 */     ej localej1 = new ej();
/* 150 */     localej1.m = (paramInt1 * -908218913);
/* 151 */     localej1.c = ((ef)localObject);
/* 152 */     localej1.n = localeq;
/* 153 */     localej1.j = localObject.g[paramInt2];
/* 154 */     localej1.z = (1921727103 * localObject.q[paramInt2]);
/* 155 */     localej1.g = (paramInt2 * 1170352585);
/* 156 */     localej1.q = ((paramInt3 * paramInt3 * (832211643 * ((ef)localObject).m) * localObject.j[paramInt2] + 1024 >> 11) * 1303874573);
/* 157 */     localej1.i = ((localObject.z[paramInt2] & 0xFF) * 1270514133);
/* 158 */     localej1.s = (-1036335163 * ((paramInt2 << 8) - (localObject.n[paramInt2] & 0x7FFF)));
/* 159 */     localej1.w = 0;
/* 160 */     localej1.e = 0;
/* 161 */     localej1.b = 0;
/* 162 */     localej1.y = -1128479601;
/* 163 */     localej1.t = 0;
/* 164 */     if (0 == this.p[paramInt1]) { if (paramInt4 == 374301821);
/* 165 */       localej1.o = et.aa(localeq, aw(localej1, 1785739061), af(localej1, -1093308794), bh(localej1, -59396598));
/*     */     } else
/*     */     {
/* 168 */       localej1.o = et.aa(localeq, aw(localej1, 2066948639), 0, bh(localej1, -59396598));
/* 169 */       if (paramInt4 != 374301821) throw new IllegalStateException(); ay(localej1, localObject.n[paramInt2] < 0, -1822360109);
/*     */     }
/* 171 */     if (localObject.n[paramInt2] < 0) { if (paramInt4 == 374301821);
/* 171 */       localej1.o.am(-1); }
/* 172 */     if (-1619622529 * localej1.z >= 0) { if (paramInt4 != 374301821) throw new IllegalStateException();
/* 173 */       ej localej2 = this.as[paramInt1][(-1619622529 * localej1.z)];
/* 174 */       if (null != localej2) { if (paramInt4 != 374301821) throw new IllegalStateException(); if (localej2.y * -225172079 < 0) { if (paramInt4 == 374301821);
/* 175 */           this.aa[paramInt1][(localej2.g * -91733895)] = null;
/* 176 */           localej2.y = 0; }
/*     */       }
/* 178 */       this.as[paramInt1][(-1619622529 * localej1.z)] = localej1;
/*     */     }
/* 180 */     this.ah.g.d(localej1);
/* 181 */     this.aa[paramInt1][paramInt2] = localej1;
/*     */   }
/*     */ 
/*     */   int du(ej paramej)
/*     */   {
/* 454 */     int j = this.s[(1720864287 * paramej.m)];
/* 455 */     if (j < 8192) return 1937158013 * paramej.i * j + 32 >> 6;
/* 456 */     return 16384 - (32 + (16384 - j) * (128 - 1937158013 * paramej.i) >> 6);
/*     */   }
/*     */ 
/*     */   synchronized dx w() {
/* 460 */     return this.ah;
/*     */   }
/*     */ 
/*     */   void an(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 123 */     if (this.w[paramInt1] != paramInt2) { if (paramInt3 > 1952400144);
/* 124 */       this.w[paramInt1] = paramInt2;
/* 125 */       for (int j = 0; j < 128; j++) { if (paramInt3 <= 1952400144) return; this.as[paramInt1][j] = null;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   synchronized dx b()
/*     */   {
/* 464 */     return null; } 
/* 464 */   synchronized dx y() { return null; }
/*     */ 
/*     */   synchronized int t()
/*     */   {
/* 468 */     return 0;
/*     */   }
/*     */ 
/*     */   synchronized void f(int[] paramArrayOfInt, int paramInt1, int paramInt2) {
/* 472 */     if (this.am.l()) {
/* 473 */       int j = 267109451 * this.q * this.am.d / (y.r * -1570391439);
/*     */       while (true) {
/* 475 */         long l = j * paramInt2 + -5382402532361213583L * this.az;
/* 476 */         if (this.an * -5995049236264940859L - l >= 0L) {
/* 477 */           this.az = (l * -6874601403000866927L);
/*     */         }
/*     */         else {
/* 480 */           int m = (int)((j + (this.an * -5995049236264940859L - this.az * -5382402532361213583L) - 1L) / j);
/* 481 */           this.az += -6874601403000866927L * (m * j);
/* 482 */           this.ah.q(paramArrayOfInt, paramInt1, m);
/* 483 */           paramInt1 += m;
/* 484 */           paramInt2 -= m;
/* 485 */           bi(-759711944);
/* 486 */           if (!this.am.l()) break; 
/*     */         }
/*     */       }
/*     */     }
/* 489 */     this.ah.q(paramArrayOfInt, paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */   synchronized void k(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/* 472 */     if (this.am.l()) {
/* 473 */       int j = 267109451 * this.q * this.am.d / (y.r * -1570391439);
/*     */       while (true) {
/* 475 */         long l = j * paramInt2 + -5382402532361213583L * this.az;
/* 476 */         if (this.an * -5995049236264940859L - l >= 0L) {
/* 477 */           this.az = (l * -6874601403000866927L);
/*     */         }
/*     */         else {
/* 480 */           int m = (int)((j + (this.an * -5995049236264940859L - this.az * -5382402532361213583L) - 1L) / j);
/* 481 */           this.az += -6874601403000866927L * (m * j);
/* 482 */           this.ah.q(paramArrayOfInt, paramInt1, m);
/* 483 */           paramInt1 += m;
/* 484 */           paramInt2 -= m;
/* 485 */           bi(265398199);
/* 486 */           if (!this.am.l()) break; 
/*     */         }
/*     */       }
/*     */     }
/* 489 */     this.ah.q(paramArrayOfInt, paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */   synchronized void o(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/* 472 */     if (this.am.l()) {
/* 473 */       int j = 267109451 * this.q * this.am.d / (y.r * -1570391439);
/*     */       while (true) {
/* 475 */         long l = j * paramInt2 + -5382402532361213583L * this.az;
/* 476 */         if (this.an * -5995049236264940859L - l >= 0L) {
/* 477 */           this.az = (l * -6874601403000866927L);
/*     */         }
/*     */         else {
/* 480 */           int m = (int)((j + (this.an * -5995049236264940859L - this.az * -5382402532361213583L) - 1L) / j);
/* 481 */           this.az += -6874601403000866927L * (m * j);
/* 482 */           this.ah.q(paramArrayOfInt, paramInt1, m);
/* 483 */           paramInt1 += m;
/* 484 */           paramInt2 -= m;
/* 485 */           bi(135075327);
/* 486 */           if (!this.am.l()) break; 
/*     */         }
/*     */       }
/*     */     }
/* 489 */     this.ah.q(paramArrayOfInt, paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */   synchronized void a(int paramInt) {
/* 493 */     if (this.am.l()) {
/* 494 */       int j = this.am.d * (this.q * 267109451) / (y.r * -1570391439);
/*     */       while (true) {
/* 496 */         long l = this.az * -5382402532361213583L + j * paramInt;
/* 497 */         if (this.an * -5995049236264940859L - l >= 0L) {
/* 498 */           this.az = (l * -6874601403000866927L);
/*     */         }
/*     */         else {
/* 501 */           int m = (int)((-5995049236264940859L * this.an - -5382402532361213583L * this.az + j - 1L) / j);
/* 502 */           this.az += m * j * -6874601403000866927L;
/* 503 */           this.ah.i(m);
/* 504 */           paramInt -= m;
/* 505 */           bi(-933903929);
/* 506 */           if (!this.am.l()) break; 
/*     */         }
/*     */       }
/*     */     }
/* 509 */     this.ah.i(paramInt);
/*     */   }
/*     */ 
/*     */   synchronized void h(int paramInt)
/*     */   {
/* 493 */     if (this.am.l()) {
/* 494 */       int j = this.am.d * (this.q * 267109451) / (y.r * -1570391439);
/*     */       while (true) {
/* 496 */         long l = this.az * -5382402532361213583L + j * paramInt;
/* 497 */         if (this.an * -5995049236264940859L - l >= 0L) {
/* 498 */           this.az = (l * -6874601403000866927L);
/*     */         }
/*     */         else {
/* 501 */           int m = (int)((-5995049236264940859L * this.an - -5382402532361213583L * this.az + j - 1L) / j);
/* 502 */           this.az += m * j * -6874601403000866927L;
/* 503 */           this.ah.i(m);
/* 504 */           paramInt -= m;
/* 505 */           bi(-1055771438);
/* 506 */           if (!this.am.l()) break; 
/*     */         }
/*     */       }
/*     */     }
/* 509 */     this.ah.i(paramInt);
/*     */   }
/*     */ 
/*     */   synchronized void bv(int paramInt)
/*     */   {
/*  50 */     this.g = (765390573 * paramInt); } 
/*  50 */   synchronized void bw(int paramInt) { this.g = (765390573 * paramInt); } 
/*  50 */   synchronized void by(int paramInt) { this.g = (765390573 * paramInt); } 
/*  50 */   synchronized void bx(int paramInt) { this.g = (765390573 * paramInt); }
/*     */ 
/*     */   int bf()
/*     */   {
/*  54 */     return -1256808731 * this.g; } 
/*  54 */   int bu() { return -1256808731 * this.g; }
/*     */ 
/*     */   synchronized boolean bo(ei paramei, ch paramch, a parama, int paramInt)
/*     */   {
/*  58 */     paramei.n();
/*  59 */     boolean bool = true;
/*  60 */     int[] arrayOfInt = null;
/*  61 */     if (paramInt > 0) arrayOfInt = new int[] { paramInt };
/*  62 */     for (ew localew = (ew)paramei.m.m(); null != localew; localew = (ew)paramei.m.c()) {
/*  63 */       int j = (int)localew.r;
/*  64 */       ef localef = (ef)this.z.r(j);
/*  65 */       if (null == localef) {
/*  66 */         localef = l.c(paramch, j, -1980991937);
/*  67 */         if (localef == null) {
/*  68 */           bool = false;
/*     */         }
/*     */         else
/*  71 */           this.z.d(localef, j);
/*     */       }
/*  73 */       else if (!localef.n(parama, localew.m, arrayOfInt, 526957205)) { bool = false; }
/*     */     }
/*  75 */     if (bool) paramei.j();
/*  76 */     return bool;
/*     */   }
/*     */ 
/*     */   synchronized boolean bq(ei paramei, ch paramch, a parama, int paramInt)
/*     */   {
/*  58 */     paramei.n();
/*  59 */     boolean bool = true;
/*  60 */     int[] arrayOfInt = null;
/*  61 */     if (paramInt > 0) arrayOfInt = new int[] { paramInt };
/*  62 */     for (ew localew = (ew)paramei.m.m(); null != localew; localew = (ew)paramei.m.c()) {
/*  63 */       int j = (int)localew.r;
/*  64 */       ef localef = (ef)this.z.r(j);
/*  65 */       if (null == localef) {
/*  66 */         localef = l.c(paramch, j, -2099103346);
/*  67 */         if (localef == null) {
/*  68 */           bool = false;
/*     */         }
/*     */         else
/*  71 */           this.z.d(localef, j);
/*     */       }
/*  73 */       else if (!localef.n(parama, localew.m, arrayOfInt, 526957205)) { bool = false; }
/*     */     }
/*  75 */     if (bool) paramei.j();
/*  76 */     return bool;
/*     */   }
/*     */ 
/*     */   synchronized void bj() {
/*  80 */     for (ef localef = (ef)this.z.m(); null != localef; localef = (ef)this.z.c()) localef.j((byte)-42); 
/*     */   }
/*     */ 
/*     */   synchronized void bz()
/*     */   {
/*  84 */     for (ef localef = (ef)this.z.m(); localef != null; localef = (ef)this.z.c()) localef.r();  } 
/*     */   void ao(int paramInt1, int paramInt2, int paramInt3) {  } 
/*  84 */   synchronized void bn() { for (ef localef = (ef)this.z.m(); localef != null; localef = (ef)this.z.c()) localef.r();  } 
/*  84 */   synchronized void be() { for (ef localef = (ef)this.z.m(); localef != null; localef = (ef)this.z.c()) localef.r();  } 
/*  84 */   synchronized void bp() { for (ef localef = (ef)this.z.m(); localef != null; localef = (ef)this.z.c()) localef.r(); 
/*     */   }
/*     */ 
/*     */   synchronized void ba(ei paramei, boolean paramBoolean)
/*     */   {
/*  88 */     ap((byte)0);
/*  89 */     this.am.r(paramei.c);
/*  90 */     this.ap = paramBoolean;
/*  91 */     this.az = 0L;
/*  92 */     int j = this.am.m();
/*  93 */     for (int m = 0; m < j; m++) {
/*  94 */       this.am.c(m);
/*  95 */       this.am.z(m);
/*  96 */       this.am.n(m);
/*     */     }
/*  98 */     this.av = (this.am.u() * -1481125491);
/*  99 */     this.ak = (889862413 * this.am.c[(1327814981 * this.av)]);
/* 100 */     this.an = (this.am.s(1194474949 * this.ak) * 1359011237585314829L);
/*     */   }
/*     */ 
/*     */   synchronized void bc(ei paramei, boolean paramBoolean)
/*     */   {
/*  88 */     ap((byte)0);
/*  89 */     this.am.r(paramei.c);
/*  90 */     this.ap = paramBoolean;
/*  91 */     this.az = 0L;
/*  92 */     int j = this.am.m();
/*  93 */     for (int m = 0; m < j; m++) {
/*  94 */       this.am.c(m);
/*  95 */       this.am.z(m);
/*  96 */       this.am.n(m);
/*     */     }
/*  98 */     this.av = (this.am.u() * -1481125491);
/*  99 */     this.ak = (889862413 * this.am.c[(1327814981 * this.av)]);
/* 100 */     this.an = (this.am.s(1194474949 * this.ak) * 1359011237585314829L);
/*     */   }
/*     */ 
/*     */   synchronized boolean cj()
/*     */   {
/* 109 */     return this.am.l();
/*     */   }
/*     */ 
/*     */   void cv(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 130 */     al(paramInt1, paramInt2, 64, 1307395137);
/* 131 */     if (0 != (this.a[paramInt1] & 0x2)) {
/* 132 */       for (localObject = (ej)this.ah.g.z(); localObject != null; localObject = (ej)this.ah.g.q()) {
/* 133 */         if ((paramInt1 == ((ej)localObject).m * 1720864287) && (((ej)localObject).y * -225172079 < 0)) {
/* 134 */           this.aa[paramInt1][(-91733895 * localObject.g)] = null;
/* 135 */           this.aa[paramInt1][paramInt2] = localObject;
/* 136 */           int j = (((ej)localObject).u * -554657737 * (((ej)localObject).v * -937318833) >> 12) + ((ej)localObject).s * -877191411;
/* 137 */           localObject.s += -1036335163 * (paramInt2 - -91733895 * ((ej)localObject).g << 8);
/* 138 */           ((ej)localObject).u = ((j - ((ej)localObject).s * -877191411) * 2104139143);
/* 139 */           ((ej)localObject).v = 2064314368;
/* 140 */           ((ej)localObject).g = (1170352585 * paramInt2);
/* 141 */           return;
/*     */         }
/*     */       }
/*     */     }
/* 145 */     Object localObject = (ef)this.z.r(this.w[paramInt1]);
/* 146 */     if (localObject == null) return;
/* 147 */     eq localeq = localObject.c[paramInt2];
/* 148 */     if (localeq == null) return;
/* 149 */     ej localej1 = new ej();
/* 150 */     localej1.m = (paramInt1 * -908218913);
/* 151 */     localej1.c = ((ef)localObject);
/* 152 */     localej1.n = localeq;
/* 153 */     localej1.j = localObject.g[paramInt2];
/* 154 */     localej1.z = (1921727103 * localObject.q[paramInt2]);
/* 155 */     localej1.g = (paramInt2 * 1170352585);
/* 156 */     localej1.q = ((paramInt3 * paramInt3 * (832211643 * ((ef)localObject).m) * localObject.j[paramInt2] + 1024 >> 11) * 1303874573);
/* 157 */     localej1.i = ((localObject.z[paramInt2] & 0xFF) * 1270514133);
/* 158 */     localej1.s = (-1036335163 * ((paramInt2 << 8) - (localObject.n[paramInt2] & 0x7FFF)));
/* 159 */     localej1.w = 0;
/* 160 */     localej1.e = 0;
/* 161 */     localej1.b = 0;
/* 162 */     localej1.y = -1128479601;
/* 163 */     localej1.t = 0;
/* 164 */     if (0 == this.p[paramInt1]) {
/* 165 */       localej1.o = et.aa(localeq, aw(localej1, 1030627116), af(localej1, -1830111323), bh(localej1, -59396598));
/*     */     }
/*     */     else {
/* 168 */       localej1.o = et.aa(localeq, aw(localej1, 1725482125), 0, bh(localej1, -59396598));
/* 169 */       ay(localej1, localObject.n[paramInt2] < 0, 1610114056);
/*     */     }
/* 171 */     if (localObject.n[paramInt2] < 0) localej1.o.am(-1);
/* 172 */     if (-1619622529 * localej1.z >= 0) {
/* 173 */       ej localej2 = this.as[paramInt1][(-1619622529 * localej1.z)];
/* 174 */       if ((null != localej2) && (localej2.y * -225172079 < 0)) {
/* 175 */         this.aa[paramInt1][(localej2.g * -91733895)] = null;
/* 176 */         localej2.y = 0;
/*     */       }
/* 178 */       this.as[paramInt1][(-1619622529 * localej1.z)] = localej1;
/*     */     }
/* 180 */     this.ah.g.d(localej1);
/* 181 */     this.aa[paramInt1][paramInt2] = localej1;
/*     */   }
/*     */ 
/*     */   synchronized void bd()
/*     */   {
/* 104 */     this.am.d();
/* 105 */     ae((byte)-46);
/*     */   }
/*     */ 
/*     */   synchronized void cr()
/*     */   {
/* 104 */     this.am.d();
/* 105 */     ae((byte)-29);
/*     */   }
/*     */ 
/*     */   public ed()
/*     */   {
/*  45 */     this.z = new cf(128);
/*  46 */     ae((byte)-39);
/*     */   }
/*     */ 
/*     */   int af(ej paramej, int paramInt)
/*     */   {
/* 422 */     cr localcr = paramej.j;
/* 423 */     int j = this.i[(1720864287 * paramej.m)] * this.u[(1720864287 * paramej.m)] + 4096 >> 13;
/* 424 */     j = 16384 + j * j >> 15;
/* 425 */     j = 16384 + 1919263429 * paramej.q * j >> 15;
/* 426 */     j = 128 + this.g * -1256808731 * j >> 8;
/* 427 */     if (-358522609 * localcr.l > 0) { if (paramInt < 360988728);
/* 428 */       j = (int)(j * Math.pow(0.5D, localcr.l * -358522609 * (paramej.w * -467718847 * 1.953125E-005D)) + 0.5D);
/*     */     }
/* 430 */     int m;
/*     */     int n;
/*     */     int i1;
/*     */     int i2;
/* 430 */     if (null != localcr.r) { if (paramInt >= 360988728) throw new IllegalStateException();
/* 431 */       m = paramej.e * 1012038793;
/* 432 */       n = localcr.r[(1 + -1017502871 * paramej.b)];
/* 433 */       if (-1017502871 * paramej.b < localcr.r.length - 2) { if (paramInt >= 360988728) throw new IllegalStateException();
/* 434 */         i1 = (localcr.r[(paramej.b * -1017502871)] & 0xFF) << 8;
/* 435 */         i2 = (localcr.r[(2 + -1017502871 * paramej.b)] & 0xFF) << 8;
/* 436 */         n += (localcr.r[(paramej.b * -1017502871 + 3)] - n) * (m - i1) / (i2 - i1);
/*     */       }
/* 438 */       j = n * j + 32 >> 6;
/*     */     }
/* 440 */     if ((paramej.y * -225172079 > 0) && ((paramInt >= 360988728) || (null != localcr.d))) { if (paramInt >= 360988728) throw new IllegalStateException();
/* 441 */       m = paramej.y * -225172079;
/* 442 */       n = localcr.d[(407915213 * paramej.t + 1)];
/* 443 */       if (paramej.t * 407915213 < localcr.d.length - 2) { if (paramInt >= 360988728) throw new IllegalStateException();
/* 444 */         i1 = (localcr.d[(paramej.t * 407915213)] & 0xFF) << 8;
/* 445 */         i2 = (localcr.d[(407915213 * paramej.t + 2)] & 0xFF) << 8;
/* 446 */         n += (m - i1) * (localcr.d[(407915213 * paramej.t + 3)] - n) / (i2 - i1);
/*     */       }
/* 448 */       j = 32 + j * n >> 6;
/*     */     }
/* 450 */     return j;
/*     */   }
/*     */ 
/*     */   synchronized boolean cl()
/*     */   {
/* 109 */     return this.am.l();
/*     */   }
/*     */ 
/*     */   void ck(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 130 */     al(paramInt1, paramInt2, 64, 1920549783);
/* 131 */     if (0 != (this.a[paramInt1] & 0x2)) {
/* 132 */       for (localObject = (ej)this.ah.g.z(); localObject != null; localObject = (ej)this.ah.g.q()) {
/* 133 */         if ((paramInt1 == ((ej)localObject).m * 1720864287) && (((ej)localObject).y * -225172079 < 0)) {
/* 134 */           this.aa[paramInt1][(-91733895 * localObject.g)] = null;
/* 135 */           this.aa[paramInt1][paramInt2] = localObject;
/* 136 */           int j = (((ej)localObject).u * -554657737 * (((ej)localObject).v * -937318833) >> 12) + ((ej)localObject).s * -877191411;
/* 137 */           localObject.s += -1036335163 * (paramInt2 - -91733895 * ((ej)localObject).g << 8);
/* 138 */           ((ej)localObject).u = ((j - ((ej)localObject).s * -877191411) * 2104139143);
/* 139 */           ((ej)localObject).v = 2064314368;
/* 140 */           ((ej)localObject).g = (1170352585 * paramInt2);
/* 141 */           return;
/*     */         }
/*     */       }
/*     */     }
/* 145 */     Object localObject = (ef)this.z.r(this.w[paramInt1]);
/* 146 */     if (localObject == null) return;
/* 147 */     eq localeq = localObject.c[paramInt2];
/* 148 */     if (localeq == null) return;
/* 149 */     ej localej1 = new ej();
/* 150 */     localej1.m = (paramInt1 * -908218913);
/* 151 */     localej1.c = ((ef)localObject);
/* 152 */     localej1.n = localeq;
/* 153 */     localej1.j = localObject.g[paramInt2];
/* 154 */     localej1.z = (1921727103 * localObject.q[paramInt2]);
/* 155 */     localej1.g = (paramInt2 * 1170352585);
/* 156 */     localej1.q = ((paramInt3 * paramInt3 * (832211643 * ((ef)localObject).m) * localObject.j[paramInt2] + 1024 >> 11) * 1303874573);
/* 157 */     localej1.i = ((localObject.z[paramInt2] & 0xFF) * 1270514133);
/* 158 */     localej1.s = (-1036335163 * ((paramInt2 << 8) - (localObject.n[paramInt2] & 0x7FFF)));
/* 159 */     localej1.w = 0;
/* 160 */     localej1.e = 0;
/* 161 */     localej1.b = 0;
/* 162 */     localej1.y = -1128479601;
/* 163 */     localej1.t = 0;
/* 164 */     if (0 == this.p[paramInt1]) {
/* 165 */       localej1.o = et.aa(localeq, aw(localej1, 1830011157), af(localej1, -238735787), bh(localej1, -59396598));
/*     */     }
/*     */     else {
/* 168 */       localej1.o = et.aa(localeq, aw(localej1, 1127739031), 0, bh(localej1, -59396598));
/* 169 */       ay(localej1, localObject.n[paramInt2] < 0, -757390062);
/*     */     }
/* 171 */     if (localObject.n[paramInt2] < 0) localej1.o.am(-1);
/* 172 */     if (-1619622529 * localej1.z >= 0) {
/* 173 */       ej localej2 = this.as[paramInt1][(-1619622529 * localej1.z)];
/* 174 */       if ((null != localej2) && (localej2.y * -225172079 < 0)) {
/* 175 */         this.aa[paramInt1][(localej2.g * -91733895)] = null;
/* 176 */         localej2.y = 0;
/*     */       }
/* 178 */       this.as[paramInt1][(-1619622529 * localej1.z)] = localej1;
/*     */     }
/* 180 */     this.ah.g.d(localej1);
/* 181 */     this.aa[paramInt1][paramInt2] = localej1;
/*     */   }
/*     */ 
/*     */   void di(int paramInt1, int paramInt2)
/*     */   {
/* 401 */     this.ad[paramInt1] = paramInt2;
/* 402 */     this.ac[paramInt1] = ((int)(2097152.0D * Math.pow(2.0D, paramInt2 * 0.00054931640625D) + 0.5D));
/*     */   }
/*     */ 
/*     */   int bh(ej paramej, int paramInt)
/*     */   {
/* 454 */     int j = this.s[(1720864287 * paramej.m)];
/* 455 */     if (j < 8192) { if (paramInt == -59396598);
/* 455 */       return 1937158013 * paramej.i * j + 32 >> 6; }
/* 456 */     return 16384 - (32 + (16384 - j) * (128 - 1937158013 * paramej.i) >> 6);
/*     */   }
/*     */ 
/*     */   void ch(int paramInt1, int paramInt2)
/*     */   {
/* 117 */     this.v[paramInt1] = paramInt2;
/* 118 */     this.e[paramInt1] = (paramInt2 & 0xFFFFFF80);
/* 119 */     an(paramInt1, paramInt2, 2092005449);
/*     */   }
/*     */ 
/*     */   void cu(int paramInt1, int paramInt2)
/*     */   {
/* 117 */     this.v[paramInt1] = paramInt2;
/* 118 */     this.e[paramInt1] = (paramInt2 & 0xFFFFFF80);
/* 119 */     an(paramInt1, paramInt2, 2027751999);
/*     */   }
/*     */ 
/*     */   int ad(byte paramByte)
/*     */   {
/*  54 */     return -1256808731 * this.g;
/*     */   }
/*     */ 
/*     */   void cm(int paramInt1, int paramInt2)
/*     */   {
/* 123 */     if (this.w[paramInt1] != paramInt2) {
/* 124 */       this.w[paramInt1] = paramInt2;
/* 125 */       for (int j = 0; j < 128; j++) this.as[paramInt1][j] = null; 
/*     */     }
/*     */   }
/*     */ 
/*     */   void cw(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 130 */     al(paramInt1, paramInt2, 64, 2101912877);
/* 131 */     if (0 != (this.a[paramInt1] & 0x2)) {
/* 132 */       for (localObject = (ej)this.ah.g.z(); localObject != null; localObject = (ej)this.ah.g.q()) {
/* 133 */         if ((paramInt1 == ((ej)localObject).m * 1720864287) && (((ej)localObject).y * -225172079 < 0)) {
/* 134 */           this.aa[paramInt1][(-91733895 * localObject.g)] = null;
/* 135 */           this.aa[paramInt1][paramInt2] = localObject;
/* 136 */           int j = (((ej)localObject).u * -554657737 * (((ej)localObject).v * -937318833) >> 12) + ((ej)localObject).s * -877191411;
/* 137 */           localObject.s += -1036335163 * (paramInt2 - -91733895 * ((ej)localObject).g << 8);
/* 138 */           ((ej)localObject).u = ((j - ((ej)localObject).s * -877191411) * 2104139143);
/* 139 */           ((ej)localObject).v = 2064314368;
/* 140 */           ((ej)localObject).g = (1170352585 * paramInt2);
/* 141 */           return;
/*     */         }
/*     */       }
/*     */     }
/* 145 */     Object localObject = (ef)this.z.r(this.w[paramInt1]);
/* 146 */     if (localObject == null) return;
/* 147 */     eq localeq = localObject.c[paramInt2];
/* 148 */     if (localeq == null) return;
/* 149 */     ej localej1 = new ej();
/* 150 */     localej1.m = (paramInt1 * -908218913);
/* 151 */     localej1.c = ((ef)localObject);
/* 152 */     localej1.n = localeq;
/* 153 */     localej1.j = localObject.g[paramInt2];
/* 154 */     localej1.z = (1921727103 * localObject.q[paramInt2]);
/* 155 */     localej1.g = (paramInt2 * 1170352585);
/* 156 */     localej1.q = ((paramInt3 * paramInt3 * (832211643 * ((ef)localObject).m) * localObject.j[paramInt2] + 1024 >> 11) * 1303874573);
/* 157 */     localej1.i = ((localObject.z[paramInt2] & 0xFF) * 1270514133);
/* 158 */     localej1.s = (-1036335163 * ((paramInt2 << 8) - (localObject.n[paramInt2] & 0x7FFF)));
/* 159 */     localej1.w = 0;
/* 160 */     localej1.e = 0;
/* 161 */     localej1.b = 0;
/* 162 */     localej1.y = -1128479601;
/* 163 */     localej1.t = 0;
/* 164 */     if (0 == this.p[paramInt1]) {
/* 165 */       localej1.o = et.aa(localeq, aw(localej1, 774249799), af(localej1, -639832068), bh(localej1, -59396598));
/*     */     }
/*     */     else {
/* 168 */       localej1.o = et.aa(localeq, aw(localej1, 311793840), 0, bh(localej1, -59396598));
/* 169 */       ay(localej1, localObject.n[paramInt2] < 0, 456968109);
/*     */     }
/* 171 */     if (localObject.n[paramInt2] < 0) localej1.o.am(-1);
/* 172 */     if (-1619622529 * localej1.z >= 0) {
/* 173 */       ej localej2 = this.as[paramInt1][(-1619622529 * localej1.z)];
/* 174 */       if ((null != localej2) && (localej2.y * -225172079 < 0)) {
/* 175 */         this.aa[paramInt1][(localej2.g * -91733895)] = null;
/* 176 */         localej2.y = 0;
/*     */       }
/* 178 */       this.as[paramInt1][(-1619622529 * localej1.z)] = localej1;
/*     */     }
/* 180 */     this.ah.g.d(localej1);
/* 181 */     this.aa[paramInt1][paramInt2] = localej1;
/*     */   }
/*     */ 
/*     */   void cz(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 130 */     al(paramInt1, paramInt2, 64, 1219577261);
/* 131 */     if (0 != (this.a[paramInt1] & 0x2)) {
/* 132 */       for (localObject = (ej)this.ah.g.z(); localObject != null; localObject = (ej)this.ah.g.q()) {
/* 133 */         if ((paramInt1 == ((ej)localObject).m * 1720864287) && (((ej)localObject).y * -225172079 < 0)) {
/* 134 */           this.aa[paramInt1][(-91733895 * localObject.g)] = null;
/* 135 */           this.aa[paramInt1][paramInt2] = localObject;
/* 136 */           int j = (((ej)localObject).u * -554657737 * (((ej)localObject).v * -937318833) >> 12) + ((ej)localObject).s * -877191411;
/* 137 */           localObject.s += -1036335163 * (paramInt2 - -91733895 * ((ej)localObject).g << 8);
/* 138 */           ((ej)localObject).u = ((j - ((ej)localObject).s * -877191411) * 2104139143);
/* 139 */           ((ej)localObject).v = 2064314368;
/* 140 */           ((ej)localObject).g = (1170352585 * paramInt2);
/* 141 */           return;
/*     */         }
/*     */       }
/*     */     }
/* 145 */     Object localObject = (ef)this.z.r(this.w[paramInt1]);
/* 146 */     if (localObject == null) return;
/* 147 */     eq localeq = localObject.c[paramInt2];
/* 148 */     if (localeq == null) return;
/* 149 */     ej localej1 = new ej();
/* 150 */     localej1.m = (paramInt1 * -908218913);
/* 151 */     localej1.c = ((ef)localObject);
/* 152 */     localej1.n = localeq;
/* 153 */     localej1.j = localObject.g[paramInt2];
/* 154 */     localej1.z = (1921727103 * localObject.q[paramInt2]);
/* 155 */     localej1.g = (paramInt2 * 1170352585);
/* 156 */     localej1.q = ((paramInt3 * paramInt3 * (832211643 * ((ef)localObject).m) * localObject.j[paramInt2] + 1024 >> 11) * 1303874573);
/* 157 */     localej1.i = ((localObject.z[paramInt2] & 0xFF) * 1270514133);
/* 158 */     localej1.s = (-1036335163 * ((paramInt2 << 8) - (localObject.n[paramInt2] & 0x7FFF)));
/* 159 */     localej1.w = 0;
/* 160 */     localej1.e = 0;
/* 161 */     localej1.b = 0;
/* 162 */     localej1.y = -1128479601;
/* 163 */     localej1.t = 0;
/* 164 */     if (0 == this.p[paramInt1]) {
/* 165 */       localej1.o = et.aa(localeq, aw(localej1, 1557591347), af(localej1, -608301672), bh(localej1, -59396598));
/*     */     }
/*     */     else {
/* 168 */       localej1.o = et.aa(localeq, aw(localej1, 514101885), 0, bh(localej1, -59396598));
/* 169 */       ay(localej1, localObject.n[paramInt2] < 0, 778331987);
/*     */     }
/* 171 */     if (localObject.n[paramInt2] < 0) localej1.o.am(-1);
/* 172 */     if (-1619622529 * localej1.z >= 0) {
/* 173 */       ej localej2 = this.as[paramInt1][(-1619622529 * localej1.z)];
/* 174 */       if ((null != localej2) && (localej2.y * -225172079 < 0)) {
/* 175 */         this.aa[paramInt1][(localej2.g * -91733895)] = null;
/* 176 */         localej2.y = 0;
/*     */       }
/* 178 */       this.as[paramInt1][(-1619622529 * localej1.z)] = localej1;
/*     */     }
/* 180 */     this.ah.g.d(localej1);
/* 181 */     this.aa[paramInt1][paramInt2] = localej1;
/*     */   }
/*     */ 
/*     */   void al(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 203 */     ej localej1 = this.aa[paramInt1][paramInt2];
/* 204 */     if (null == localej1) { if (paramInt4 <= 837696003) return; return; }
/* 205 */     this.aa[paramInt1][paramInt2] = null;
/* 206 */     if (0 != (this.a[paramInt1] & 0x2)) { if (paramInt4 <= 837696003) return;
/* 207 */       for (ej localej2 = (ej)this.ah.g.j(); null != localej2; localej2 = (ej)this.ah.g.g()) { if (paramInt4 <= 837696003) throw new IllegalStateException();
/* 208 */         if (1720864287 * localej2.m == localej1.m * 1720864287) { if (paramInt4 <= 837696003) return; if ((localej2.y * -225172079 < 0) && ((paramInt4 <= 837696003) || (localej1 != localej2))) { if (paramInt4 <= 837696003) throw new IllegalStateException();
/* 209 */             localej1.y = 0;
/* 210 */             break; } }
/*     */       }
/*     */     }
/*     */     else
/*     */     {
/* 215 */       localej1.y = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   void ct(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 130 */     al(paramInt1, paramInt2, 64, 1429974702);
/* 131 */     if (0 != (this.a[paramInt1] & 0x2)) {
/* 132 */       for (localObject = (ej)this.ah.g.z(); localObject != null; localObject = (ej)this.ah.g.q()) {
/* 133 */         if ((paramInt1 == ((ej)localObject).m * 1720864287) && (((ej)localObject).y * -225172079 < 0)) {
/* 134 */           this.aa[paramInt1][(-91733895 * localObject.g)] = null;
/* 135 */           this.aa[paramInt1][paramInt2] = localObject;
/* 136 */           int j = (((ej)localObject).u * -554657737 * (((ej)localObject).v * -937318833) >> 12) + ((ej)localObject).s * -877191411;
/* 137 */           localObject.s += -1036335163 * (paramInt2 - -91733895 * ((ej)localObject).g << 8);
/* 138 */           ((ej)localObject).u = ((j - ((ej)localObject).s * -877191411) * 2104139143);
/* 139 */           ((ej)localObject).v = 2064314368;
/* 140 */           ((ej)localObject).g = (1170352585 * paramInt2);
/* 141 */           return;
/*     */         }
/*     */       }
/*     */     }
/* 145 */     Object localObject = (ef)this.z.r(this.w[paramInt1]);
/* 146 */     if (localObject == null) return;
/* 147 */     eq localeq = localObject.c[paramInt2];
/* 148 */     if (localeq == null) return;
/* 149 */     ej localej1 = new ej();
/* 150 */     localej1.m = (paramInt1 * -908218913);
/* 151 */     localej1.c = ((ef)localObject);
/* 152 */     localej1.n = localeq;
/* 153 */     localej1.j = localObject.g[paramInt2];
/* 154 */     localej1.z = (1921727103 * localObject.q[paramInt2]);
/* 155 */     localej1.g = (paramInt2 * 1170352585);
/* 156 */     localej1.q = ((paramInt3 * paramInt3 * (832211643 * ((ef)localObject).m) * localObject.j[paramInt2] + 1024 >> 11) * 1303874573);
/* 157 */     localej1.i = ((localObject.z[paramInt2] & 0xFF) * 1270514133);
/* 158 */     localej1.s = (-1036335163 * ((paramInt2 << 8) - (localObject.n[paramInt2] & 0x7FFF)));
/* 159 */     localej1.w = 0;
/* 160 */     localej1.e = 0;
/* 161 */     localej1.b = 0;
/* 162 */     localej1.y = -1128479601;
/* 163 */     localej1.t = 0;
/* 164 */     if (0 == this.p[paramInt1]) {
/* 165 */       localej1.o = et.aa(localeq, aw(localej1, -169047287), af(localej1, 334534702), bh(localej1, -59396598));
/*     */     }
/*     */     else {
/* 168 */       localej1.o = et.aa(localeq, aw(localej1, 1455683483), 0, bh(localej1, -59396598));
/* 169 */       ay(localej1, localObject.n[paramInt2] < 0, 1735107924);
/*     */     }
/* 171 */     if (localObject.n[paramInt2] < 0) localej1.o.am(-1);
/* 172 */     if (-1619622529 * localej1.z >= 0) {
/* 173 */       ej localej2 = this.as[paramInt1][(-1619622529 * localej1.z)];
/* 174 */       if ((null != localej2) && (localej2.y * -225172079 < 0)) {
/* 175 */         this.aa[paramInt1][(localej2.g * -91733895)] = null;
/* 176 */         localej2.y = 0;
/*     */       }
/* 178 */       this.as[paramInt1][(-1619622529 * localej1.z)] = localej1;
/*     */     }
/* 180 */     this.ah.g.d(localej1);
/* 181 */     this.aa[paramInt1][paramInt2] = localej1;
/*     */   }
/*     */ 
/*     */   boolean bk(ej paramej, int[] paramArrayOfInt, int paramInt1, int paramInt2, byte paramByte)
/*     */   {
/* 559 */     paramej.a = (y.r * -1570391439 / 100 * 364427183);
/* 560 */     if (-225172079 * paramej.y >= 0) { if (paramByte != 0) throw new IllegalStateException(); if (paramej.o != null) { if ((paramByte == 0) && (!paramej.o.at())) break label169; if (paramByte != 0) throw new IllegalStateException(); 
/*     */       }
/* 561 */       paramej.c((byte)4);
/* 562 */       paramej.r();
/* 563 */       if ((-1619622529 * paramej.z > 0) && ((paramByte != 0) || (paramej == this.as[(paramej.m * 1720864287)][(paramej.z * -1619622529)]))) { if (paramByte == 0);
/* 564 */         this.as[(1720864287 * paramej.m)][(paramej.z * -1619622529)] = null;
/*     */       }
/* 566 */       return true;
/*     */     }
/* 568 */     label169: int j = -937318833 * paramej.v;
/* 569 */     if (j > 0) { if (paramByte == 0);
/* 570 */       j -= (int)(16.0D * Math.pow(2.0D, 0.000492125984251969D * this.t[(1720864287 * paramej.m)]) + 0.5D);
/* 571 */       if (j < 0) { if (paramByte == 0);
/* 571 */         j = 0; }
/* 572 */       paramej.v = (898085039 * j);
/*     */     }
/* 574 */     paramej.o.ar(aw(paramej, 515515040));
/* 575 */     cr localcr = paramej.j;
/* 576 */     int m = 0;
/* 577 */     paramej.f += -337198579;
/* 578 */     paramej.k += localcr.z * 276665291;
/* 579 */     double d = ((paramej.g * -91733895 - 60 << 8) + (paramej.u * -554657737 * (paramej.v * -937318833) >> 12)) * 5.086263020833333E-006D;
/* 580 */     if (localcr.l * -358522609 > 0) if ((paramByte != 0) || 
/* 581 */         (-1452219339 * localcr.n > 0)) { if (paramByte == 0);
/* 581 */         paramej.w += (int)(128.0D * Math.pow(2.0D, d * (-1452219339 * localcr.n)) + 0.5D) * -835951935; } else {
/* 582 */         paramej.w += 372334720;
/*     */       }
/* 584 */     if (localcr.r != null) { if ((paramByte != 0) || 
/* 585 */         (-2037508489 * localcr.m > 0)) { if (paramByte == 0);
/* 585 */         paramej.e += (int)(128.0D * Math.pow(2.0D, d * (-2037508489 * localcr.m)) + 0.5D) * -1308771911; } else {
/* 586 */         paramej.e += -19080064;
/* 587 */       }for (; -1017502871 * paramej.b < localcr.r.length - 2; paramej.b += 1825126834) { if (paramByte != 0) throw new IllegalStateException(); if (1012038793 * paramej.e <= (localcr.r[(2 + -1017502871 * paramej.b)] & 0xFF) << 8) break; if (paramByte != 0) throw new IllegalStateException(); 
/*     */       }
/* 588 */       if (paramej.b * -1017502871 == localcr.r.length - 2) { if (paramByte != 0) throw new IllegalStateException(); if (localcr.r[(-1017502871 * paramej.b + 1)] == 0) { if (paramByte != 0) throw new IllegalStateException(); m = 1; } }
/*     */     }
/* 590 */     if ((-225172079 * paramej.y >= 0) && ((paramByte != 0) || ((null != localcr.d) && ((paramByte != 0) || (0 == (this.a[(1720864287 * paramej.m)] & 0x1)))))) { if ((paramByte != 0) || 
/* 591 */         (paramej.z * -1619622529 >= 0)) { if ((paramByte == 0) && (this.as[(1720864287 * paramej.m)][(paramej.z * -1619622529)] == paramej)) break label1030; if (paramByte != 0); }
/* 592 */       if (2067987951 * localcr.c > 0) { if (paramByte != 0) throw new IllegalStateException(); paramej.y += (int)(128.0D * Math.pow(2.0D, localcr.c * 2067987951 * d) + 0.5D) * 1128479601; } else {
/* 593 */         paramej.y += -1583499136;
/* 594 */       }for (; 407915213 * paramej.t < localcr.d.length - 2; paramej.t += 674849802) { if (paramByte != 0) throw new IllegalStateException(); if (paramej.y * -225172079 <= (localcr.d[(paramej.t * 407915213 + 2)] & 0xFF) << 8) break; if (paramByte != 0); }
/* 595 */       if (localcr.d.length - 2 == paramej.t * 407915213) { if (paramByte == 0);
/* 595 */         m = 1;
/*     */       }
/*     */     }
/* 598 */     label1030: if (m != 0) { if (paramByte == 0);
/* 599 */       paramej.o.ag(-1116143793 * paramej.a);
/* 600 */       if (null != paramArrayOfInt) { if (paramByte != 0) throw new IllegalStateException(); paramej.o.q(paramArrayOfInt, paramInt1, paramInt2); } else {
/* 601 */         paramej.o.i(paramInt2);
/* 602 */       }if (paramej.o.ae()) { if (paramByte == 0);
/* 602 */         this.ah.q.p(paramej.o); }
/* 603 */       paramej.c((byte)4);
/* 604 */       if (paramej.y * -225172079 >= 0) { if (paramByte != 0) throw new IllegalStateException();
/* 605 */         paramej.r();
/* 606 */         if ((-1619622529 * paramej.z > 0) && ((paramByte != 0) || (paramej == this.as[(paramej.m * 1720864287)][(-1619622529 * paramej.z)]))) { if (paramByte != 0) throw new IllegalStateException();
/* 607 */           this.as[(paramej.m * 1720864287)][(paramej.z * -1619622529)] = null;
/*     */         }
/*     */       }
/* 610 */       return true;
/*     */     }
/* 612 */     paramej.o.ao(paramej.a * -1116143793, af(paramej, -1442757644), bh(paramej, -59396598));
/* 613 */     return false;
/*     */   }
/*     */ 
/*     */   void cy(ej paramej, boolean paramBoolean)
/*     */   {
/* 185 */     int j = paramej.n.n.length;
/*     */     int m;
/* 187 */     if ((paramBoolean) && (paramej.n.g)) {
/* 188 */       int n = j + j - paramej.n.j;
/* 189 */       m = (int)(n * this.p[(1720864287 * paramej.m)] >> 6);
/* 190 */       j <<= 8;
/* 191 */       if (m >= j) {
/* 192 */         m = j + j - 1 - m;
/* 193 */         paramej.o.ay(true);
/*     */       }
/*     */     }
/*     */     else {
/* 197 */       m = (int)(this.p[(1720864287 * paramej.m)] * j >> 6);
/*     */     }
/* 199 */     paramej.o.ah(m);
/*     */   }
/*     */ 
/*     */   void cq(int paramInt1, int paramInt2, int paramInt3) {
/* 203 */     ej localej1 = this.aa[paramInt1][paramInt2];
/* 204 */     if (null == localej1) return;
/* 205 */     this.aa[paramInt1][paramInt2] = null;
/* 206 */     if (0 != (this.a[paramInt1] & 0x2)) {
/* 207 */       for (ej localej2 = (ej)this.ah.g.j(); null != localej2; localej2 = (ej)this.ah.g.g()) {
/* 208 */         if ((1720864287 * localej2.m == localej1.m * 1720864287) && (localej2.y * -225172079 < 0) && (localej1 != localej2)) {
/* 209 */           localej1.y = 0;
/* 210 */           break;
/*     */         }
/*     */       }
/*     */     }
/*     */     else
/* 215 */       localej1.y = 0; 
/*     */   }
/*     */   void cd(int paramInt1, int paramInt2, int paramInt3) {
/*     */   }
/*     */   void cx(int paramInt1, int paramInt2) {
/*     */   }
/*     */   void cn(int paramInt1, int paramInt2) {
/*     */   }
/* 223 */   void ce(int paramInt1, int paramInt2) { this.b[paramInt1] = paramInt2; }
/*     */ 
/*     */   void ci(int paramInt)
/*     */   {
/* 227 */     for (ej localej = (ej)this.ah.g.j(); null != localej; localej = (ej)this.ah.g.g())
/* 228 */       if ((paramInt < 0) || (1720864287 * localej.m == paramInt)) {
/* 229 */         if (localej.o != null) {
/* 230 */           localej.o.ag(-1570391439 * y.r / 100);
/* 231 */           if (localej.o.ae()) this.ah.q.p(localej.o);
/* 232 */           localej.c((byte)4);
/*     */         }
/* 234 */         if (-225172079 * localej.y < 0) this.aa[(localej.m * 1720864287)][(localej.g * -91733895)] = null;
/* 235 */         localej.r();
/*     */       }
/*     */   }
/*     */ 
/*     */   void cb(int paramInt)
/*     */   {
/* 227 */     for (ej localej = (ej)this.ah.g.j(); null != localej; localej = (ej)this.ah.g.g())
/* 228 */       if ((paramInt < 0) || (1720864287 * localej.m == paramInt)) {
/* 229 */         if (localej.o != null) {
/* 230 */           localej.o.ag(-1570391439 * y.r / 100);
/* 231 */           if (localej.o.ae()) this.ah.q.p(localej.o);
/* 232 */           localej.c((byte)4);
/*     */         }
/* 234 */         if (-225172079 * localej.y < 0) this.aa[(localej.m * 1720864287)][(localej.g * -91733895)] = null;
/* 235 */         localej.r();
/*     */       }
/*     */   }
/*     */ 
/*     */   void cf(int paramInt)
/*     */   {
/* 241 */     if (paramInt < 0) {
/* 242 */       for (paramInt = 0; paramInt < 16; paramInt++) aq(paramInt, -1934961173);
/* 243 */       return;
/*     */     }
/* 245 */     this.i[paramInt] = 12800;
/* 246 */     this.s[paramInt] = 8192;
/* 247 */     this.u[paramInt] = 16383;
/* 248 */     this.b[paramInt] = 8192;
/* 249 */     this.y[paramInt] = 0;
/* 250 */     this.t[paramInt] = 8192;
/* 251 */     au(paramInt, (byte)62);
/* 252 */     ax(paramInt, (byte)22);
/* 253 */     this.a[paramInt] = 0;
/* 254 */     this.h[paramInt] = 32767;
/* 255 */     this.x[paramInt] = 256;
/* 256 */     this.p[paramInt] = 0;
/* 257 */     aj(paramInt, 8192, -1699099862);
/*     */   }
/*     */ 
/*     */   void cg(int paramInt)
/*     */   {
/* 241 */     if (paramInt < 0) {
/* 242 */       for (paramInt = 0; paramInt < 16; paramInt++) aq(paramInt, -106149346);
/* 243 */       return;
/*     */     }
/* 245 */     this.i[paramInt] = 12800;
/* 246 */     this.s[paramInt] = 8192;
/* 247 */     this.u[paramInt] = 16383;
/* 248 */     this.b[paramInt] = 8192;
/* 249 */     this.y[paramInt] = 0;
/* 250 */     this.t[paramInt] = 8192;
/* 251 */     au(paramInt, (byte)56);
/* 252 */     ax(paramInt, (byte)31);
/* 253 */     this.a[paramInt] = 0;
/* 254 */     this.h[paramInt] = 32767;
/* 255 */     this.x[paramInt] = 256;
/* 256 */     this.p[paramInt] = 0;
/* 257 */     aj(paramInt, 8192, -1699099862);
/*     */   }
/*     */ 
/*     */   void dd(int paramInt)
/*     */   {
/* 241 */     if (paramInt < 0) {
/* 242 */       for (paramInt = 0; paramInt < 16; paramInt++) aq(paramInt, -1129962387);
/* 243 */       return;
/*     */     }
/* 245 */     this.i[paramInt] = 12800;
/* 246 */     this.s[paramInt] = 8192;
/* 247 */     this.u[paramInt] = 16383;
/* 248 */     this.b[paramInt] = 8192;
/* 249 */     this.y[paramInt] = 0;
/* 250 */     this.t[paramInt] = 8192;
/* 251 */     au(paramInt, (byte)51);
/* 252 */     ax(paramInt, (byte)28);
/* 253 */     this.a[paramInt] = 0;
/* 254 */     this.h[paramInt] = 32767;
/* 255 */     this.x[paramInt] = 256;
/* 256 */     this.p[paramInt] = 0;
/* 257 */     aj(paramInt, 8192, -1699099862);
/*     */   }
/*     */ 
/*     */   void dg(int paramInt)
/*     */   {
/* 241 */     if (paramInt < 0) {
/* 242 */       for (paramInt = 0; paramInt < 16; paramInt++) aq(paramInt, -2048284742);
/* 243 */       return;
/*     */     }
/* 245 */     this.i[paramInt] = 12800;
/* 246 */     this.s[paramInt] = 8192;
/* 247 */     this.u[paramInt] = 16383;
/* 248 */     this.b[paramInt] = 8192;
/* 249 */     this.y[paramInt] = 0;
/* 250 */     this.t[paramInt] = 8192;
/* 251 */     au(paramInt, (byte)47);
/* 252 */     ax(paramInt, (byte)24);
/* 253 */     this.a[paramInt] = 0;
/* 254 */     this.h[paramInt] = 32767;
/* 255 */     this.x[paramInt] = 256;
/* 256 */     this.p[paramInt] = 0;
/* 257 */     aj(paramInt, 8192, -1699099862);
/*     */   }
/*     */ 
/*     */   void dz()
/*     */   {
/* 272 */     ar(-1, (byte)-8);
/* 273 */     aq(-1, -1965396346);
/* 274 */     for (int j = 0; j < 16; j++) this.w[j] = this.v[j];
/* 275 */     for (j = 0; j < 16; j++) this.e[j] = (this.v[j] & 0xFFFFFF80);
/*     */   }
/*     */ 
/*     */   synchronized int z()
/*     */   {
/* 468 */     return 0;
/*     */   }
/*     */ 
/*     */   synchronized boolean cp()
/*     */   {
/* 109 */     return this.am.l();
/*     */   }
/*     */ 
/*     */   void da(int paramInt)
/*     */   {
/* 279 */     if (0 != (this.a[paramInt] & 0x2))
/* 280 */       for (ej localej = (ej)this.ah.g.j(); null != localej; localej = (ej)this.ah.g.g())
/* 281 */         if ((1720864287 * localej.m == paramInt) && (this.aa[paramInt][(-91733895 * localej.g)] == null) && 
/* 282 */           (localej.y * -225172079 < 0)) localej.y = 0;
/*     */   }
/*     */ 
/*     */   void dj(int paramInt)
/*     */   {
/* 279 */     if (0 != (this.a[paramInt] & 0x2))
/* 280 */       for (ej localej = (ej)this.ah.g.j(); null != localej; localej = (ej)this.ah.g.g())
/* 281 */         if ((1720864287 * localej.m == paramInt) && (this.aa[paramInt][(-91733895 * localej.g)] == null) && 
/* 282 */           (localej.y * -225172079 < 0)) localej.y = 0;
/*     */   }
/*     */ 
/*     */   void dv(int paramInt)
/*     */   {
/* 279 */     if (0 != (this.a[paramInt] & 0x2))
/* 280 */       for (ej localej = (ej)this.ah.g.j(); null != localej; localej = (ej)this.ah.g.g())
/* 281 */         if ((1720864287 * localej.m == paramInt) && (this.aa[paramInt][(-91733895 * localej.g)] == null) && 
/* 282 */           (localej.y * -225172079 < 0)) localej.y = 0;
/*     */   }
/*     */ 
/*     */   void ds(int paramInt)
/*     */   {
/* 289 */     if ((this.a[paramInt] & 0x4) != 0)
/* 290 */       for (ej localej = (ej)this.ah.g.j(); null != localej; localej = (ej)this.ah.g.g())
/* 291 */         if (1720864287 * localej.m == paramInt) localej.x = 0;
/*     */   }
/*     */ 
/*     */   void dh(int paramInt)
/*     */   {
/* 297 */     int j = paramInt & 0xF0;
/*     */     int m;
/*     */     int n;
/*     */     int i1;
/* 298 */     if (j == 128) {
/* 299 */       m = paramInt & 0xF;
/* 300 */       n = paramInt >> 8 & 0x7F;
/* 301 */       i1 = paramInt >> 16 & 0x7F;
/* 302 */       al(m, n, i1, 1338643210);
/* 303 */       return;
/*     */     }
/* 305 */     if (j == 144) {
/* 306 */       m = paramInt & 0xF;
/* 307 */       n = paramInt >> 8 & 0x7F;
/* 308 */       i1 = paramInt >> 16 & 0x7F;
/* 309 */       if (i1 > 0) ah(m, n, i1, 374301821); else
/* 310 */         al(m, n, 64, 1790113660);
/* 311 */       return;
/*     */     }
/* 313 */     if (160 == j) {
/* 314 */       m = paramInt & 0xF;
/* 315 */       n = paramInt >> 8 & 0x7F;
/* 316 */       i1 = paramInt >> 16 & 0x7F;
/* 317 */       ab(m, n, i1, 777393828);
/* 318 */       return;
/*     */     }
/* 320 */     if (j == 176) {
/* 321 */       m = paramInt & 0xF;
/* 322 */       n = paramInt >> 8 & 0x7F;
/* 323 */       i1 = paramInt >> 16 & 0x7F;
/* 324 */       if (0 == n) this.e[m] = ((this.e[m] & 0xFFE03FFF) + (i1 << 14));
/* 325 */       if (32 == n) this.e[m] = ((this.e[m] & 0xFFFFC07F) + (i1 << 7));
/* 326 */       if (1 == n) this.y[m] = ((i1 << 7) + (this.y[m] & 0xFFFFC07F));
/* 327 */       if (n == 33) this.y[m] = (i1 + (this.y[m] & 0xFFFFFF80));
/* 328 */       if (5 == n) this.t[m] = ((i1 << 7) + (this.t[m] & 0xFFFFC07F));
/* 329 */       if (n == 37) this.t[m] = ((this.t[m] & 0xFFFFFF80) + i1);
/* 330 */       if (n == 7) this.i[m] = ((i1 << 7) + (this.i[m] & 0xFFFFC07F));
/* 331 */       if (n == 39) this.i[m] = (i1 + (this.i[m] & 0xFFFFFF80));
/* 332 */       if (n == 10) this.s[m] = ((this.s[m] & 0xFFFFC07F) + (i1 << 7));
/* 333 */       if (n == 42) this.s[m] = (i1 + (this.s[m] & 0xFFFFFF80));
/* 334 */       if (11 == n) this.u[m] = ((this.u[m] & 0xFFFFC07F) + (i1 << 7));
/* 335 */       if (n == 43) this.u[m] = (i1 + (this.u[m] & 0xFFFFFF80));
/* 336 */       if (n == 64) {
/* 337 */         if (i1 >= 64) this.a[m] |= 1; else
/* 338 */           this.a[m] &= -2;
/*     */       }
/* 340 */       if (n == 65) {
/* 341 */         if (i1 >= 64) { this.a[m] |= 2;
/*     */         } else {
/* 343 */           au(m, (byte)45);
/* 344 */           this.a[m] &= -3;
/*     */         }
/*     */       }
/* 347 */       if (99 == n) this.h[m] = ((this.h[m] & 0x7F) + (i1 << 7));
/* 348 */       if (98 == n) this.h[m] = (i1 + (this.h[m] & 0x3F80));
/* 349 */       if (101 == n) this.h[m] = (16384 + (this.h[m] & 0x7F) + (i1 << 7));
/* 350 */       if (100 == n) this.h[m] = (i1 + (16384 + (this.h[m] & 0x3F80)));
/* 351 */       if (120 == n) ar(m, (byte)-62);
/* 352 */       if (121 == n) aq(m, 1584960711);
/* 353 */       if (123 == n) at(m, -1959142989);
/*     */       int i2;
/* 354 */       if (6 == n) {
/* 355 */         i2 = this.h[m];
/* 356 */         if (i2 == 16384) this.x[m] = ((this.x[m] & 0xFFFFC07F) + (i1 << 7));
/*     */       }
/* 358 */       if (38 == n) {
/* 359 */         i2 = this.h[m];
/* 360 */         if (i2 == 16384) this.x[m] = ((this.x[m] & 0xFFFFFF80) + i1);
/*     */       }
/* 362 */       if (n == 16) this.p[m] = ((i1 << 7) + (this.p[m] & 0xFFFFC07F));
/* 363 */       if (48 == n) this.p[m] = ((this.p[m] & 0xFFFFFF80) + i1);
/* 364 */       if (81 == n) {
/* 365 */         if (i1 >= 64) { this.a[m] |= 4;
/*     */         } else {
/* 367 */           ax(m, (byte)121);
/* 368 */           this.a[m] &= -5;
/*     */         }
/*     */       }
/* 371 */       if (17 == n) aj(m, (i1 << 7) + (this.ad[m] & 0xFFFFC07F), -1699099862);
/* 372 */       if (49 == n) aj(m, (this.ad[m] & 0xFFFFFF80) + i1, -1699099862);
/* 373 */       return;
/*     */     }
/* 375 */     if (j == 192) {
/* 376 */       m = paramInt & 0xF;
/* 377 */       n = paramInt >> 8 & 0x7F;
/* 378 */       an(m, this.e[m] + n, 2038952814);
/* 379 */       return;
/*     */     }
/* 381 */     if (208 == j) {
/* 382 */       m = paramInt & 0xF;
/* 383 */       n = paramInt >> 8 & 0x7F;
/* 384 */       ao(m, n, 1106101578);
/* 385 */       return;
/*     */     }
/* 387 */     if (224 == j) {
/* 388 */       m = paramInt & 0xF;
/* 389 */       n = (paramInt >> 8 & 0x7F) + (paramInt >> 9 & 0x3F80);
/* 390 */       ag(m, n, (short)-12553);
/* 391 */       return;
/*     */     }
/* 393 */     j = paramInt & 0xFF;
/* 394 */     if (j == 255) {
/* 395 */       ae((byte)-10);
/* 396 */       return;
/*     */     }
/*     */   }
/*     */ 
/*     */   synchronized void bb(ei paramei, boolean paramBoolean)
/*     */   {
/*  88 */     ap((byte)0);
/*  89 */     this.am.r(paramei.c);
/*  90 */     this.ap = paramBoolean;
/*  91 */     this.az = 0L;
/*  92 */     int j = this.am.m();
/*  93 */     for (int m = 0; m < j; m++) {
/*  94 */       this.am.c(m);
/*  95 */       this.am.z(m);
/*  96 */       this.am.n(m);
/*     */     }
/*  98 */     this.av = (this.am.u() * -1481125491);
/*  99 */     this.ak = (889862413 * this.am.c[(1327814981 * this.av)]);
/* 100 */     this.an = (this.am.s(1194474949 * this.ak) * 1359011237585314829L);
/*     */   }
/*     */ 
/*     */   void dp(int paramInt1, int paramInt2)
/*     */   {
/* 401 */     this.ad[paramInt1] = paramInt2;
/* 402 */     this.ac[paramInt1] = ((int)(2097152.0D * Math.pow(2.0D, paramInt2 * 0.00054931640625D) + 0.5D));
/*     */   }
/*     */ 
/*     */   void dm(int paramInt1, int paramInt2)
/*     */   {
/* 401 */     this.ad[paramInt1] = paramInt2;
/* 402 */     this.ac[paramInt1] = ((int)(2097152.0D * Math.pow(2.0D, paramInt2 * 0.00054931640625D) + 0.5D));
/*     */   }
/*     */ 
/*     */   void ar(int paramInt, byte paramByte)
/*     */   {
/* 227 */     for (ej localej = (ej)this.ah.g.j(); null != localej; localej = (ej)this.ah.g.g()) { if (paramByte >= 0) throw new IllegalStateException();
/* 228 */       if (paramInt >= 0) { if ((paramByte < 0) && (1720864287 * localej.m != paramInt)) continue; if (paramByte >= 0) return; 
/*     */       }
/* 229 */       if (localej.o != null) { if (paramByte >= 0) return;
/* 230 */         localej.o.ag(-1570391439 * y.r / 100);
/* 231 */         if (localej.o.ae()) { if (paramByte < 0);
/* 231 */           this.ah.q.p(localej.o); }
/* 232 */         localej.c((byte)4);
/*     */       }
/* 234 */       if (-225172079 * localej.y < 0) { if (paramByte < 0);
/* 234 */         this.aa[(localej.m * 1720864287)][(localej.g * -91733895)] = null; }
/* 235 */       localej.r();
/*     */     }
/*     */   }
/*     */ 
/*     */   void df(int paramInt)
/*     */   {
/* 261 */     for (ej localej = (ej)this.ah.g.j(); null != localej; localej = (ej)this.ah.g.g())
/* 262 */       if (((paramInt < 0) || (paramInt == localej.m * 1720864287)) && 
/* 263 */         (-225172079 * localej.y < 0)) {
/* 264 */         this.aa[(localej.m * 1720864287)][(localej.g * -91733895)] = null;
/* 265 */         localej.y = 0;
/*     */       }
/*     */   }
/*     */ 
/*     */   int dq(ej paramej)
/*     */   {
/* 422 */     cr localcr = paramej.j;
/* 423 */     int j = this.i[(1720864287 * paramej.m)] * this.u[(1720864287 * paramej.m)] + 4096 >> 13;
/* 424 */     j = 16384 + j * j >> 15;
/* 425 */     j = 16384 + 1919263429 * paramej.q * j >> 15;
/* 426 */     j = 128 + this.g * -1256808731 * j >> 8;
/* 427 */     if (-358522609 * localcr.l > 0)
/* 428 */       j = (int)(j * Math.pow(0.5D, localcr.l * -358522609 * (paramej.w * -467718847 * 1.953125E-005D)) + 0.5D);
/*     */     int m;
/*     */     int n;
/*     */     int i1;
/*     */     int i2;
/* 430 */     if (null != localcr.r) {
/* 431 */       m = paramej.e * 1012038793;
/* 432 */       n = localcr.r[(1 + -1017502871 * paramej.b)];
/* 433 */       if (-1017502871 * paramej.b < localcr.r.length - 2) {
/* 434 */         i1 = (localcr.r[(paramej.b * -1017502871)] & 0xFF) << 8;
/* 435 */         i2 = (localcr.r[(2 + -1017502871 * paramej.b)] & 0xFF) << 8;
/* 436 */         n += (localcr.r[(paramej.b * -1017502871 + 3)] - n) * (m - i1) / (i2 - i1);
/*     */       }
/* 438 */       j = n * j + 32 >> 6;
/*     */     }
/* 440 */     if ((paramej.y * -225172079 > 0) && (null != localcr.d)) {
/* 441 */       m = paramej.y * -225172079;
/* 442 */       n = localcr.d[(407915213 * paramej.t + 1)];
/* 443 */       if (paramej.t * 407915213 < localcr.d.length - 2) {
/* 444 */         i1 = (localcr.d[(paramej.t * 407915213)] & 0xFF) << 8;
/* 445 */         i2 = (localcr.d[(407915213 * paramej.t + 2)] & 0xFF) << 8;
/* 446 */         n += (m - i1) * (localcr.d[(407915213 * paramej.t + 3)] - n) / (i2 - i1);
/*     */       }
/* 448 */       j = 32 + j * n >> 6;
/*     */     }
/* 450 */     return j;
/*     */   }
/*     */ 
/*     */   int dr(ej paramej) {
/* 454 */     int j = this.s[(1720864287 * paramej.m)];
/* 455 */     if (j < 8192) return 1937158013 * paramej.i * j + 32 >> 6;
/* 456 */     return 16384 - (32 + (16384 - j) * (128 - 1937158013 * paramej.i) >> 6);
/*     */   }
/*     */ 
/*     */   public synchronized void ca(int paramInt1, int paramInt2)
/*     */   {
/* 113 */     az(paramInt1, paramInt2, 1130628869);
/*     */   }
/*     */ 
/*     */   void dy()
/*     */   {
/* 513 */     int j = 1327814981 * this.av;
/* 514 */     int m = 1194474949 * this.ak;
/* 515 */     long l = -5995049236264940859L * this.an;
/* 516 */     while (this.ak * 1194474949 == m) {
/* 517 */       while (m == this.am.c[j]) {
/* 518 */         this.am.c(j);
/* 519 */         int n = this.am.g(j);
/* 520 */         if (n == 1) {
/* 521 */           this.am.j();
/* 522 */           this.am.n(j);
/* 523 */           if (!this.am.v()) break;
/* 524 */           if ((this.ap) && (m != 0)) {
/* 525 */             this.am.w(l);
/* 526 */             break;
/*     */           }
/* 528 */           ae((byte)-4);
/* 529 */           this.am.d();
/* 530 */           return;
/*     */         }
/* 532 */         if ((n & 0x80) != 0) ai(n, 207699768);
/* 533 */         this.am.z(j);
/* 534 */         this.am.n(j);
/*     */       }
/* 536 */       j = this.am.u();
/* 537 */       m = this.am.c[j];
/* 538 */       l = this.am.s(m);
/*     */     }
/* 540 */     this.av = (-1481125491 * j);
/* 541 */     this.ak = (889862413 * m);
/* 542 */     this.an = (1359011237585314829L * l);
/*     */   }
/*     */ 
/*     */   synchronized void as(int paramInt)
/*     */   {
/*  84 */     for (ef localef = (ef)this.z.m(); localef != null; localef = (ef)this.z.c()) { if (paramInt <= -342759179) return; localef.r();
/*     */     }
/*     */   }
/*     */ 
/*     */   synchronized dx n()
/*     */   {
/* 460 */     return this.ah;
/*     */   }
/*     */ 
/*     */   synchronized void ap(byte paramByte)
/*     */   {
/* 104 */     this.am.d();
/* 105 */     ae((byte)-4);
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ed
 * JD-Core Version:    0.6.2
 */