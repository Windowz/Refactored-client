/*      */ public class dc extends aa
/*      */ {
/*      */   int n;
/*      */   int d;
/*      */   int l;
/*    7 */   long[] r = new long[10];
/*      */   int c;
/*      */   long m;
/*      */   static ch z;
/*      */ 
/*      */   int c(int paramInt1, int paramInt2)
/*      */   {
/*   31 */     int i = this.d * -1963270905;
/*   32 */     int j = 639210383 * this.l;
/*   33 */     this.d = 1307629172;
/*   34 */     this.l = -824169617;
/*   35 */     this.m = (cm.r(1709322561) * 6452604506098551425L);
/*   36 */     if (this.r[(1093011227 * this.n)] == 0L) {
/*   37 */       this.d = (i * 619970743);
/*   38 */       this.l = (-824169617 * j);
/*      */     }
/*   40 */     else if (2100392505621575041L * this.m > this.r[(this.n * 1093011227)]) { this.d = ((int)(paramInt1 * 2560 / (2100392505621575041L * this.m - this.r[(1093011227 * this.n)])) * 619970743); }
/*   41 */     if (-1963270905 * this.d < 25) this.d = -1680600609;
/*   42 */     if (-1963270905 * this.d > 256) {
/*   43 */       this.d = -201279744;
/*   44 */       this.l = ((int)(paramInt1 - (2100392505621575041L * this.m - this.r[(this.n * 1093011227)]) / 10L) * -824169617);
/*      */     }
/*   46 */     if (639210383 * this.l > paramInt1) this.l = (paramInt1 * -824169617);
/*   47 */     this.r[(1093011227 * this.n)] = (2100392505621575041L * this.m);
/*   48 */     this.n = (-1459422445 * ((1093011227 * this.n + 1) % 10));
/*   49 */     if (this.l * 639210383 > 1) {
/*   50 */       for (k = 0; k < 10; k++) {
/*   51 */         if (this.r[k] != 0L) this.r[k] = (639210383 * this.l + this.r[k]);
/*      */       }
/*      */     }
/*   54 */     if (this.l * 639210383 < paramInt2) this.l = (-824169617 * paramInt2);
/*   55 */     cl.r(this.l * 639210383);
/*   56 */     int k = 0;
/*   57 */     while (788895463 * this.c < 256) {
/*   58 */       k++;
/*   59 */       this.c += this.d * 906585313;
/*      */     }
/*   61 */     this.c = ((788895463 * this.c & 0xFF) * 1797987543);
/*   62 */     return k;
/*      */   }
/*      */ 
/*      */   dc()
/*      */   {
/*   15 */     this.d = -201279744;
/*   16 */     this.l = -824169617;
/*   17 */     this.c = 0;
/*   18 */     this.m = (cm.r(1902257128) * 6452604506098551425L);
/*   19 */     for (int i = 0; i < 10; i++)
/*   20 */       this.r[i] = (2100392505621575041L * this.m);
/*      */   }
/*      */ 
/*      */   int d(int paramInt1, int paramInt2, byte paramByte)
/*      */   {
/*   31 */     int i = this.d * -1963270905;
/*   32 */     int j = 639210383 * this.l;
/*   33 */     this.d = 1307629172;
/*   34 */     this.l = -824169617;
/*   35 */     this.m = (cm.r(2080684028) * 6452604506098551425L);
/*   36 */     if (this.r[(1093011227 * this.n)] == 0L) { if (paramByte == 7);
/*   37 */       this.d = (i * 619970743);
/*   38 */       this.l = (-824169617 * j);
/*      */     }
/*   40 */     else if (2100392505621575041L * this.m > this.r[(this.n * 1093011227)]) { if (paramByte == 7);
/*   40 */       this.d = ((int)(paramInt1 * 2560 / (2100392505621575041L * this.m - this.r[(1093011227 * this.n)])) * 619970743); }
/*   41 */     if (-1963270905 * this.d < 25) { if (paramByte != 7) throw new IllegalStateException(); this.d = -1680600609; }
/*   42 */     if (-1963270905 * this.d > 256) { if (paramByte != 7) throw new IllegalStateException();
/*   43 */       this.d = -201279744;
/*   44 */       this.l = ((int)(paramInt1 - (2100392505621575041L * this.m - this.r[(this.n * 1093011227)]) / 10L) * -824169617);
/*      */     }
/*   46 */     if (639210383 * this.l > paramInt1) { if (paramByte != 7) throw new IllegalStateException(); this.l = (paramInt1 * -824169617); }
/*   47 */     this.r[(1093011227 * this.n)] = (2100392505621575041L * this.m);
/*   48 */     this.n = (-1459422445 * ((1093011227 * this.n + 1) % 10));
/*   49 */     if (this.l * 639210383 > 1) { if (paramByte != 7) throw new IllegalStateException();
/*   50 */       for (k = 0; k < 10; k++) { if (paramByte != 7) throw new IllegalStateException();
/*   51 */         if (this.r[k] != 0L) { if (paramByte != 7) throw new IllegalStateException(); this.r[k] = (639210383 * this.l + this.r[k]); }
/*      */       }
/*      */     }
/*   54 */     if (this.l * 639210383 < paramInt2) { if (paramByte == 7);
/*   54 */       this.l = (-824169617 * paramInt2); }
/*   55 */     cl.r(this.l * 639210383);
/*   56 */     int k = 0;
/*   57 */     while (788895463 * this.c < 256) { if (paramByte != 7) throw new IllegalStateException();
/*   58 */       k++;
/*   59 */       this.c += this.d * 906585313;
/*      */     }
/*   61 */     this.c = ((788895463 * this.c & 0xFF) * 1797987543);
/*   62 */     return k;
/*      */   }
/*      */ 
/*      */   int j(int paramInt1, int paramInt2)
/*      */   {
/*   31 */     int i = this.d * -1963270905;
/*   32 */     int j = 639210383 * this.l;
/*   33 */     this.d = 1307629172;
/*   34 */     this.l = -824169617;
/*   35 */     this.m = (cm.r(1706672648) * 6452604506098551425L);
/*   36 */     if (this.r[(1093011227 * this.n)] == 0L) {
/*   37 */       this.d = (i * 619970743);
/*   38 */       this.l = (-824169617 * j);
/*      */     }
/*   40 */     else if (2100392505621575041L * this.m > this.r[(this.n * 1093011227)]) { this.d = ((int)(paramInt1 * 2560 / (2100392505621575041L * this.m - this.r[(1093011227 * this.n)])) * 619970743); }
/*   41 */     if (-1963270905 * this.d < 25) this.d = -1680600609;
/*   42 */     if (-1963270905 * this.d > 256) {
/*   43 */       this.d = -201279744;
/*   44 */       this.l = ((int)(paramInt1 - (2100392505621575041L * this.m - this.r[(this.n * 1093011227)]) / 10L) * -824169617);
/*      */     }
/*   46 */     if (639210383 * this.l > paramInt1) this.l = (paramInt1 * -824169617);
/*   47 */     this.r[(1093011227 * this.n)] = (2100392505621575041L * this.m);
/*   48 */     this.n = (-1459422445 * ((1093011227 * this.n + 1) % 10));
/*   49 */     if (this.l * 639210383 > 1) {
/*   50 */       for (k = 0; k < 10; k++) {
/*   51 */         if (this.r[k] != 0L) this.r[k] = (639210383 * this.l + this.r[k]);
/*      */       }
/*      */     }
/*   54 */     if (this.l * 639210383 < paramInt2) this.l = (-824169617 * paramInt2);
/*   55 */     cl.r(this.l * 639210383);
/*   56 */     int k = 0;
/*   57 */     while (788895463 * this.c < 256) {
/*   58 */       k++;
/*   59 */       this.c += this.d * 906585313;
/*      */     }
/*   61 */     this.c = ((788895463 * this.c & 0xFF) * 1797987543);
/*   62 */     return k;
/*      */   }
/*      */ 
/*      */   void m()
/*      */   {
/*   25 */     for (int i = 0; i < 10; i++)
/*   26 */       this.r[i] = 0L;
/*      */   }
/*      */ 
/*      */   void l()
/*      */   {
/*   25 */     for (int i = 0; i < 10; i++)
/*   26 */       this.r[i] = 0L;
/*      */   }
/*      */ 
/*      */   int n(int paramInt1, int paramInt2)
/*      */   {
/*   31 */     int i = this.d * -1963270905;
/*   32 */     int j = 639210383 * this.l;
/*   33 */     this.d = 1307629172;
/*   34 */     this.l = -824169617;
/*   35 */     this.m = (cm.r(1177516064) * 6452604506098551425L);
/*   36 */     if (this.r[(1093011227 * this.n)] == 0L) {
/*   37 */       this.d = (i * 619970743);
/*   38 */       this.l = (-824169617 * j);
/*      */     }
/*   40 */     else if (2100392505621575041L * this.m > this.r[(this.n * 1093011227)]) { this.d = ((int)(paramInt1 * 2560 / (2100392505621575041L * this.m - this.r[(1093011227 * this.n)])) * 619970743); }
/*   41 */     if (-1963270905 * this.d < 25) this.d = -1680600609;
/*   42 */     if (-1963270905 * this.d > 256) {
/*   43 */       this.d = -201279744;
/*   44 */       this.l = ((int)(paramInt1 - (2100392505621575041L * this.m - this.r[(this.n * 1093011227)]) / 10L) * -824169617);
/*      */     }
/*   46 */     if (639210383 * this.l > paramInt1) this.l = (paramInt1 * -824169617);
/*   47 */     this.r[(1093011227 * this.n)] = (2100392505621575041L * this.m);
/*   48 */     this.n = (-1459422445 * ((1093011227 * this.n + 1) % 10));
/*   49 */     if (this.l * 639210383 > 1) {
/*   50 */       for (k = 0; k < 10; k++) {
/*   51 */         if (this.r[k] != 0L) this.r[k] = (639210383 * this.l + this.r[k]);
/*      */       }
/*      */     }
/*   54 */     if (this.l * 639210383 < paramInt2) this.l = (-824169617 * paramInt2);
/*   55 */     cl.r(this.l * 639210383);
/*   56 */     int k = 0;
/*   57 */     while (788895463 * this.c < 256) {
/*   58 */       k++;
/*   59 */       this.c += this.d * 906585313;
/*      */     }
/*   61 */     this.c = ((788895463 * this.c & 0xFF) * 1797987543);
/*   62 */     return k;
/*      */   }
/*      */ 
/*      */   void r(int paramInt)
/*      */   {
/*   25 */     for (int i = 0; i < 10; i++) { if (paramInt > 604237768);
/*   26 */       this.r[i] = 0L;
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void ek(dn paramdn, int paramInt)
/*      */   {
/* 5971 */     int i = 0;
/* 5972 */     int j = -1;
/* 5973 */     int k = 0;
/* 5974 */     int i1 = 0;
/* 5975 */     if (0 == paramdn.c * -1555364995) { if (paramInt != -1878232493);
/* 5975 */       i = cr.eg.ad(paramdn.m * -343936653, paramdn.n * -1854575731, paramdn.j * 2131749159); }
/* 5976 */     if (1 == paramdn.c * -1555364995) { if (paramInt != -1878232493);
/* 5976 */       i = cr.eg.ac(-343936653 * paramdn.m, -1854575731 * paramdn.n, 2131749159 * paramdn.j); }
/* 5977 */     if (2 == paramdn.c * -1555364995) { if (paramInt == -1878232493) return; i = cr.eg.aa(paramdn.m * -343936653, -1854575731 * paramdn.n, 2131749159 * paramdn.j); }
/* 5978 */     if (3 == paramdn.c * -1555364995) { if (paramInt == -1878232493) return; i = cr.eg.as(paramdn.m * -343936653, paramdn.n * -1854575731, 2131749159 * paramdn.j); }
/* 5979 */     if (0 != i) { if (paramInt == -1878232493) return;
/* 5980 */       int i2 = cr.eg.am(paramdn.m * -343936653, paramdn.n * -1854575731, paramdn.j * 2131749159, i);
/* 5981 */       j = i >> 14 & 0x7FFF;
/* 5982 */       k = i2 & 0x1F;
/* 5983 */       i1 = i2 >> 6 & 0x3;
/*      */     }
/* 5985 */     paramdn.z = (j * 12932345);
/* 5986 */     paramdn.q = (-1314165617 * k);
/* 5987 */     paramdn.g = (i1 * 851052773);
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     dc
 * JD-Core Version:    0.6.2
 */