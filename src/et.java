/*      */ public class et extends dx
/*      */ {
/*      */   int v;
/*      */   int g;
/*      */   int q;
/*      */   int i;
/*      */   int s;
/*      */   boolean y;
/*      */   int o;
/*      */   int w;
/*      */   int z;
/*      */   int b;
/*      */   int e;
/*      */   int t;
/*      */   int f;
/*      */   int k;
/*      */   int u;
/*      */ 
/*      */   boolean dh()
/*      */   {
/*  528 */     int j = this.q;
/*      */     int n;
/*      */     int m;
/*  531 */     if (j == -2147483648) {
/*  532 */       n = 0;
/*  533 */       m = 0;
/*  534 */       j = 0;
/*      */     }
/*      */     else {
/*  537 */       m = p(j, this.i);
/*  538 */       n = ad(j, this.i);
/*      */     }
/*  540 */     if ((this.s != j) || (this.u != m) || (this.v != n)) {
/*  541 */       if (this.s < j) {
/*  542 */         this.f = 1;
/*  543 */         this.t = (j - this.s);
/*      */       }
/*  545 */       else if (this.s > j) {
/*  546 */         this.f = -1;
/*  547 */         this.t = (this.s - j);
/*      */       } else {
/*  549 */         this.f = 0;
/*  550 */       }if (this.u < m) {
/*  551 */         this.k = 1;
/*  552 */         if ((this.t == 0) || (this.t > m - this.u)) this.t = (m - this.u);
/*      */       }
/*  554 */       else if (this.u > m) {
/*  555 */         this.k = -1;
/*  556 */         if ((this.t == 0) || (this.t > this.u - m)) this.t = (this.u - m); 
/*      */       }
/*  558 */       else { this.k = 0; }
/*  559 */       if (this.v < n) {
/*  560 */         this.o = 1;
/*  561 */         if ((this.t == 0) || (this.t > n - this.v)) this.t = (n - this.v);
/*      */       }
/*  563 */       else if (this.v > n) {
/*  564 */         this.o = -1;
/*  565 */         if ((this.t == 0) || (this.t > this.v - n)) this.t = (this.v - n); 
/*      */       }
/*  567 */       else { this.o = 0; }
/*  568 */       return false;
/*      */     }
/*  570 */     if (this.q == -2147483648) {
/*  571 */       this.q = 0;
/*  572 */       this.v = 0;
/*  573 */       this.u = 0;
/*  574 */       this.s = 0;
/*  575 */       r();
/*  576 */       return true;
/*      */     }
/*  578 */     as();
/*  579 */     return false;
/*      */   }
/*      */ 
/*      */   int da(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  474 */     while (this.t > 0) {
/*  475 */       int j = paramInt1 + this.t;
/*  476 */       if (j > paramInt3) j = paramInt3;
/*  477 */       this.t += paramInt1;
/*  478 */       if ((this.g == 256) && ((this.z & 0xFF) == 0)) {
/*  479 */         if (y.d) paramInt1 = by(0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, this.k, this.o, 0, j, paramInt2, this); else {
/*  480 */           paramInt1 = bw(((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, this.f, 0, j, paramInt2, this);
/*      */         }
/*      */       }
/*  483 */       else if (y.d) paramInt1 = bo(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, this.k, this.o, 0, j, paramInt2, this, this.g, paramInt4); else {
/*  484 */         paramInt1 = bu(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, this.f, 0, j, paramInt2, this, this.g, paramInt4);
/*      */       }
/*  486 */       this.t -= paramInt1;
/*  487 */       if (this.t != 0) return paramInt1;
/*  488 */       if (ai()) return paramInt3;
/*      */     }
/*  490 */     if ((this.g == 256) && ((this.z & 0xFF) == 0)) {
/*  491 */       if (y.d) return aw(0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, 0, paramInt3, paramInt2, this);
/*  492 */       return aj(((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, 0, paramInt3, paramInt2, this);
/*      */     }
/*      */ 
/*  495 */     if (y.d) return bs(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, 0, paramInt3, paramInt2, this, this.g, paramInt4);
/*  496 */     return bi(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, 0, paramInt3, paramInt2, this, this.g, paramInt4);
/*      */   }
/*      */ 
/*      */   int c()
/*      */   {
/*   31 */     int j = this.s * 3 >> 6;
/*   32 */     j = (j ^ j >> 31) + (j >>> 31);
/*   33 */     if (this.w == 0) j -= j * this.z / (((eq)this.n).n.length << 8);
/*   34 */     else if (this.w >= 0) j -= j * this.e / ((eq)this.n).n.length;
/*   35 */     return j > 255 ? 255 : j;
/*      */   }
/*      */ 
/*      */   et(eq parameq, int paramInt1, int paramInt2) {
/*   39 */     this.n = parameq;
/*   40 */     this.e = parameq.j;
/*   41 */     this.b = parameq.z;
/*   42 */     this.y = parameq.g;
/*   43 */     this.g = paramInt1;
/*   44 */     this.q = paramInt2;
/*   45 */     this.i = 8192;
/*   46 */     this.z = 0;
/*   47 */     as();
/*      */   }
/*      */ 
/*      */   et(eq parameq, int paramInt1, int paramInt2, int paramInt3) {
/*   51 */     this.n = parameq;
/*   52 */     this.e = parameq.j;
/*   53 */     this.b = parameq.z;
/*   54 */     this.y = parameq.g;
/*   55 */     this.g = paramInt1;
/*   56 */     this.q = paramInt2;
/*   57 */     this.i = paramInt3;
/*   58 */     this.z = 0;
/*   59 */     as();
/*      */   }
/*      */ 
/*      */   public static et be(eq parameq, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   68 */     if ((parameq.n == null) || (parameq.n.length == 0)) return null;
/*   69 */     return new et(parameq, paramInt1, paramInt2, paramInt3);
/*      */   }
/*      */ 
/*      */   public static et aa(eq parameq, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   68 */     if ((parameq.n == null) || (parameq.n.length == 0)) return null;
/*   69 */     return new et(parameq, paramInt1, paramInt2, paramInt3);
/*      */   }
/*      */ 
/*      */   void as() {
/*   73 */     this.s = this.q;
/*   74 */     this.u = p(this.q, this.i);
/*   75 */     this.v = ad(this.q, this.i);
/*      */   }
/*      */ 
/*      */   public synchronized void am(int paramInt) {
/*   79 */     this.w = paramInt;
/*      */   }
/*      */ 
/*      */   boolean ai()
/*      */   {
/*  528 */     int j = this.q;
/*      */     int n;
/*      */     int m;
/*  531 */     if (j == -2147483648) {
/*  532 */       n = 0;
/*  533 */       m = 0;
/*  534 */       j = 0;
/*      */     }
/*      */     else {
/*  537 */       m = p(j, this.i);
/*  538 */       n = ad(j, this.i);
/*      */     }
/*  540 */     if ((this.s != j) || (this.u != m) || (this.v != n)) {
/*  541 */       if (this.s < j) {
/*  542 */         this.f = 1;
/*  543 */         this.t = (j - this.s);
/*      */       }
/*  545 */       else if (this.s > j) {
/*  546 */         this.f = -1;
/*  547 */         this.t = (this.s - j);
/*      */       } else {
/*  549 */         this.f = 0;
/*  550 */       }if (this.u < m) {
/*  551 */         this.k = 1;
/*  552 */         if ((this.t == 0) || (this.t > m - this.u)) this.t = (m - this.u);
/*      */       }
/*  554 */       else if (this.u > m) {
/*  555 */         this.k = -1;
/*  556 */         if ((this.t == 0) || (this.t > this.u - m)) this.t = (this.u - m); 
/*      */       }
/*  558 */       else { this.k = 0; }
/*  559 */       if (this.v < n) {
/*  560 */         this.o = 1;
/*  561 */         if ((this.t == 0) || (this.t > n - this.v)) this.t = (n - this.v);
/*      */       }
/*  563 */       else if (this.v > n) {
/*  564 */         this.o = -1;
/*  565 */         if ((this.t == 0) || (this.t > this.v - n)) this.t = (this.v - n); 
/*      */       }
/*  567 */       else { this.o = 0; }
/*  568 */       return false;
/*      */     }
/*  570 */     if (this.q == -2147483648) {
/*  571 */       this.q = 0;
/*  572 */       this.v = 0;
/*  573 */       this.u = 0;
/*  574 */       this.s = 0;
/*  575 */       r();
/*  576 */       return true;
/*      */     }
/*  578 */     as();
/*  579 */     return false;
/*      */   }
/*      */ 
/*      */   static int db(int paramInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, et paramet)
/*      */   {
/*  603 */     paramInt2 >>= 8;
/*  604 */     paramInt8 >>= 8;
/*  605 */     paramInt4 <<= 2;
/*  606 */     paramInt5 <<= 2;
/*  607 */     if ((paramInt6 = paramInt3 + paramInt8 - paramInt2) > paramInt7) paramInt6 = paramInt7;
/*  608 */     paramInt3 <<= 1;
/*  609 */     paramInt6 <<= 1;
/*  610 */     paramInt6 -= 6;
/*  611 */     while (paramInt3 < paramInt6) {
/*  612 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  613 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  614 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  615 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  616 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  617 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  618 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  619 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  620 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  621 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  622 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  623 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*      */     }
/*  625 */     paramInt6 += 6;
/*  626 */     while (paramInt3 < paramInt6) {
/*  627 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  628 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  629 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*      */     }
/*  631 */     paramet.z = (paramInt2 << 8);
/*  632 */     return paramInt3 >> 1;
/*      */   }
/*      */ 
/*      */   public synchronized void cz(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  130 */     if (paramInt1 == 0) {
/*  131 */       ak(paramInt2, paramInt3);
/*  132 */       return;
/*      */     }
/*  134 */     int j = p(paramInt2, paramInt3);
/*  135 */     int m = ad(paramInt2, paramInt3);
/*  136 */     if ((this.u == j) && (this.v == m)) {
/*  137 */       this.t = 0;
/*  138 */       return;
/*      */     }
/*  140 */     int n = paramInt2 - this.s;
/*  141 */     if (this.s - paramInt2 > n) n = this.s - paramInt2;
/*  142 */     if (j - this.u > n) n = j - this.u;
/*  143 */     if (this.u - j > n) n = this.u - j;
/*  144 */     if (m - this.v > n) n = m - this.v;
/*  145 */     if (this.v - m > n) n = this.v - m;
/*  146 */     if (paramInt1 > n) paramInt1 = n;
/*  147 */     this.t = paramInt1;
/*  148 */     this.q = paramInt2;
/*  149 */     this.i = paramInt3;
/*  150 */     this.f = ((paramInt2 - this.s) / paramInt1);
/*  151 */     this.k = ((j - this.u) / paramInt1);
/*  152 */     this.o = ((m - this.v) / paramInt1);
/*      */   }
/*      */ 
/*      */   public synchronized int az()
/*      */   {
/*   98 */     return this.q == -2147483648 ? 0 : this.q;
/*      */   }
/*      */ 
/*      */   public synchronized int an() {
/*  102 */     return this.i < 0 ? -1 : this.i;
/*      */   }
/*      */ 
/*      */   public synchronized void ah(int paramInt) {
/*  106 */     int j = ((eq)this.n).n.length << 8;
/*  107 */     if (paramInt < -1) paramInt = -1;
/*  108 */     if (paramInt > j) paramInt = j;
/*  109 */     this.z = paramInt;
/*      */   }
/*      */ 
/*      */   static int bk(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, et paramet, int paramInt9, int paramInt10)
/*      */   {
/*  734 */     if ((paramInt9 == 0) || ((paramInt6 = paramInt4 + (paramInt8 + 256 - paramInt3 + paramInt9) / paramInt9) > paramInt7)) paramInt6 = paramInt7;
/*  735 */     while (paramInt4 < paramInt6) {
/*  736 */       paramInt2 = paramInt3 >> 8;
/*  737 */       paramInt1 = paramArrayOfByte[(paramInt2 - 1)];
/*  738 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramArrayOfByte[paramInt2] - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/*  739 */       paramInt3 += paramInt9;
/*      */     }
/*  741 */     if ((paramInt9 == 0) || ((paramInt6 = paramInt4 + (paramInt8 - paramInt3 + paramInt9) / paramInt9) > paramInt7)) paramInt6 = paramInt7;
/*  742 */     paramInt1 = paramInt10;
/*  743 */     paramInt2 = paramInt9;
/*  744 */     while (paramInt4 < paramInt6) {
/*  745 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramArrayOfByte[(paramInt3 >> 8)] - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/*  746 */       paramInt3 += paramInt2;
/*      */     }
/*  748 */     paramet.z = paramInt3;
/*  749 */     return paramInt4;
/*      */   }
/*      */ 
/*      */   void al()
/*      */   {
/*  118 */     if (this.t != 0) {
/*  119 */       if (this.q == -2147483648) this.q = 0;
/*  120 */       this.t = 0;
/*  121 */       as();
/*      */     }
/*      */   }
/*      */ 
/*      */   public synchronized void ab(int paramInt1, int paramInt2) {
/*  126 */     ao(paramInt1, paramInt2, an());
/*      */   }
/*      */ 
/*      */   public synchronized void ao(int paramInt1, int paramInt2, int paramInt3) {
/*  130 */     if (paramInt1 == 0) {
/*  131 */       ak(paramInt2, paramInt3);
/*  132 */       return;
/*      */     }
/*  134 */     int j = p(paramInt2, paramInt3);
/*  135 */     int m = ad(paramInt2, paramInt3);
/*  136 */     if ((this.u == j) && (this.v == m)) {
/*  137 */       this.t = 0;
/*  138 */       return;
/*      */     }
/*  140 */     int n = paramInt2 - this.s;
/*  141 */     if (this.s - paramInt2 > n) n = this.s - paramInt2;
/*  142 */     if (j - this.u > n) n = j - this.u;
/*  143 */     if (this.u - j > n) n = this.u - j;
/*  144 */     if (m - this.v > n) n = m - this.v;
/*  145 */     if (this.v - m > n) n = this.v - m;
/*  146 */     if (paramInt1 > n) paramInt1 = n;
/*  147 */     this.t = paramInt1;
/*  148 */     this.q = paramInt2;
/*  149 */     this.i = paramInt3;
/*  150 */     this.f = ((paramInt2 - this.s) / paramInt1);
/*  151 */     this.k = ((j - this.u) / paramInt1);
/*  152 */     this.o = ((m - this.v) / paramInt1);
/*      */   }
/*      */ 
/*      */   static int bi(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, et paramet, int paramInt9, int paramInt10)
/*      */   {
/*  689 */     if ((paramInt9 == 0) || ((paramInt6 = paramInt4 + (paramInt8 - paramInt3 + paramInt9 - 257) / paramInt9) > paramInt7)) paramInt6 = paramInt7;
/*  690 */     while (paramInt4 < paramInt6) {
/*  691 */       paramInt2 = paramInt3 >> 8;
/*  692 */       paramInt1 = paramArrayOfByte[paramInt2];
/*  693 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramArrayOfByte[(paramInt2 + 1)] - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/*  694 */       paramInt3 += paramInt9;
/*      */     }
/*  696 */     if ((paramInt9 == 0) || ((paramInt6 = paramInt4 + (paramInt8 - paramInt3 + paramInt9 - 1) / paramInt9) > paramInt7)) paramInt6 = paramInt7;
/*  697 */     paramInt2 = paramInt10;
/*  698 */     while (paramInt4 < paramInt6) {
/*  699 */       paramInt1 = paramArrayOfByte[(paramInt3 >> 8)];
/*  700 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramInt2 - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/*  701 */       paramInt3 += paramInt9;
/*      */     }
/*  703 */     paramet.z = paramInt3;
/*  704 */     return paramInt4;
/*      */   }
/*      */ 
/*      */   public synchronized void ar(int paramInt)
/*      */   {
/*  183 */     if (this.g < 0) this.g = (-paramInt); else
/*  184 */       this.g = paramInt;
/*      */   }
/*      */ 
/*      */   public synchronized int aq() {
/*  188 */     return this.g < 0 ? -this.g : this.g;
/*      */   }
/*      */ 
/*      */   static int eq(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, et paramet, int paramInt12, int paramInt13)
/*      */   {
/* 1019 */     paramet.s -= paramet.f * paramInt4;
/* 1020 */     if ((paramInt12 == 0) || ((paramInt9 = paramInt4 + (paramInt11 + 256 - paramInt3 + paramInt12) / paramInt12) > paramInt10)) paramInt9 = paramInt10;
/* 1021 */     paramInt4 <<= 1;
/* 1022 */     paramInt9 <<= 1;
/* 1023 */     while (paramInt4 < paramInt9) {
/* 1024 */       paramInt2 = paramInt3 >> 8;
/* 1025 */       paramInt1 = paramArrayOfByte[(paramInt2 - 1)];
/* 1026 */       paramInt1 = (paramInt1 << 8) + (paramArrayOfByte[paramInt2] - paramInt1) * (paramInt3 & 0xFF);
/* 1027 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/* 1028 */       paramInt5 += paramInt7;
/* 1029 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/* 1030 */       paramInt6 += paramInt8;
/* 1031 */       paramInt3 += paramInt12;
/*      */     }
/* 1033 */     if ((paramInt12 == 0) || ((paramInt9 = (paramInt4 >> 1) + (paramInt11 - paramInt3 + paramInt12) / paramInt12) > paramInt10)) paramInt9 = paramInt10;
/* 1034 */     paramInt9 <<= 1;
/* 1035 */     paramInt2 = paramInt13;
/* 1036 */     while (paramInt4 < paramInt9) {
/* 1037 */       paramInt1 = (paramInt2 << 8) + (paramArrayOfByte[(paramInt3 >> 8)] - paramInt2) * (paramInt3 & 0xFF);
/* 1038 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/* 1039 */       paramInt5 += paramInt7;
/* 1040 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/* 1041 */       paramInt6 += paramInt8;
/* 1042 */       paramInt3 += paramInt12;
/*      */     }
/* 1044 */     paramInt4 >>= 1;
/* 1045 */     paramet.s += paramet.f * paramInt4;
/* 1046 */     paramet.u = paramInt5;
/* 1047 */     paramet.v = paramInt6;
/* 1048 */     paramet.z = paramInt3;
/* 1049 */     return paramInt4;
/*      */   }
/*      */ 
/*      */   public boolean ae()
/*      */   {
/*  196 */     return this.t != 0;
/*      */   }
/*      */ 
/*      */   dx n() {
/*  200 */     return null;
/*      */   }
/*      */ 
/*      */   dx j() {
/*  204 */     return null;
/*      */   }
/*      */ 
/*      */   int z() {
/*  208 */     if ((this.q == 0) && (this.t == 0)) return 0;
/*  209 */     return 1;
/*      */   }
/*      */ 
/*      */   public synchronized void q(int[] paramArrayOfInt, int paramInt1, int paramInt2) {
/*  213 */     if ((this.q == 0) && (this.t == 0)) {
/*  214 */       i(paramInt2);
/*  215 */       return;
/*      */     }
/*  217 */     eq localeq = (eq)this.n;
/*  218 */     int j = this.e << 8;
/*  219 */     int m = this.b << 8;
/*  220 */     int n = localeq.n.length << 8;
/*  221 */     int i1 = m - j;
/*  222 */     if (i1 <= 0) this.w = 0;
/*  223 */     int i2 = paramInt1;
/*  224 */     paramInt2 += paramInt1;
/*  225 */     if (this.z < 0) {
/*  226 */       if (this.g > 0) { this.z = 0;
/*      */       } else {
/*  228 */         al();
/*  229 */         r();
/*  230 */         return;
/*      */       }
/*      */     }
/*  233 */     if (this.z >= n) {
/*  234 */       if (this.g < 0) { this.z = (n - 1);
/*      */       } else {
/*  236 */         al();
/*  237 */         r();
/*  238 */         return;
/*      */       }
/*      */     }
/*  241 */     if (this.w < 0) {
/*  242 */       if (this.y) {
/*  243 */         if (this.g < 0) {
/*  244 */           i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[this.e]);
/*  245 */           if (this.z >= j) return;
/*  246 */           this.z = (j + j - 1 - this.z);
/*  247 */           this.g = (-this.g);
/*      */         }
/*      */         while (true) {
/*  250 */           i2 = au(paramArrayOfInt, i2, m, paramInt2, localeq.n[(this.b - 1)]);
/*  251 */           if (this.z < m) return;
/*  252 */           this.z = (m + m - 1 - this.z);
/*  253 */           this.g = (-this.g);
/*  254 */           i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[this.e]);
/*  255 */           if (this.z >= j) return;
/*  256 */           this.z = (j + j - 1 - this.z);
/*  257 */           this.g = (-this.g);
/*      */         }
/*      */       }
/*  260 */       if (this.g < 0) {
/*      */         while (true) {
/*  262 */           i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[(this.b - 1)]);
/*  263 */           if (this.z >= j) return;
/*  264 */           this.z = (m - 1 - (m - 1 - this.z) % i1);
/*      */         }
/*      */       }
/*      */       while (true)
/*      */       {
/*  269 */         i2 = au(paramArrayOfInt, i2, m, paramInt2, localeq.n[this.e]);
/*  270 */         if (this.z < m) return;
/*  271 */         this.z = (j + (this.z - j) % i1);
/*      */       }
/*      */     }
/*      */ 
/*  275 */     if (this.w > 0) {
/*  276 */       if (this.y) {
/*  277 */         if (this.g < 0) {
/*  278 */           i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[this.e]);
/*  279 */           if (this.z >= j) return; this.z = (j + j - 1 - this.z);
/*  281 */           this.g = (-this.g);
/*  282 */           if (--this.w == 0); } else {
/*      */           do {
/*  285 */             i2 = au(paramArrayOfInt, i2, m, paramInt2, localeq.n[(this.b - 1)]);
/*  286 */             if (this.z < m) return;
/*  287 */             this.z = (m + m - 1 - this.z);
/*  288 */             this.g = (-this.g);
/*  289 */             if (--this.w == 0) break;
/*  290 */             i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[this.e]);
/*  291 */             if (this.z >= j) return;
/*  292 */             this.z = (j + j - 1 - this.z);
/*  293 */             this.g = (-this.g);
/*  294 */           }while (--this.w != 0);
/*      */         }
/*      */       }
/*      */       else
/*      */       {
/*      */         int i3;
/*  297 */         if (this.g < 0) {
/*      */           while (true) {
/*  299 */             i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[(this.b - 1)]);
/*  300 */             if (this.z >= j) return;
/*  301 */             i3 = (m - 1 - this.z) / i1;
/*  302 */             if (i3 >= this.w) {
/*  303 */               this.z += i1 * this.w;
/*  304 */               this.w = 0;
/*  305 */               break;
/*      */             }
/*  307 */             this.z += i1 * i3;
/*  308 */             this.w -= i3;
/*      */           }
/*      */         }
/*      */         while (true)
/*      */         {
/*  313 */           i2 = au(paramArrayOfInt, i2, m, paramInt2, localeq.n[this.e]);
/*  314 */           if (this.z < m) return;
/*  315 */           i3 = (this.z - j) / i1;
/*  316 */           if (i3 >= this.w) {
/*  317 */             this.z -= i1 * this.w;
/*  318 */             this.w = 0;
/*  319 */             break;
/*      */           }
/*  321 */           this.z -= i1 * i3;
/*  322 */           this.w -= i3;
/*      */         }
/*      */       }
/*      */     }
/*  326 */     if (this.g < 0) {
/*  327 */       ax(paramArrayOfInt, i2, 0, paramInt2, 0);
/*  328 */       if (this.z < 0) {
/*  329 */         this.z = -1;
/*  330 */         al();
/*  331 */         r();
/*      */       }
/*      */     }
/*      */     else {
/*  335 */       au(paramArrayOfInt, i2, n, paramInt2, 0);
/*  336 */       if (this.z >= n) {
/*  337 */         this.z = n;
/*  338 */         al();
/*  339 */         r();
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public synchronized void o(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*      */   {
/*  213 */     if ((this.q == 0) && (this.t == 0)) {
/*  214 */       i(paramInt2);
/*  215 */       return;
/*      */     }
/*  217 */     eq localeq = (eq)this.n;
/*  218 */     int j = this.e << 8;
/*  219 */     int m = this.b << 8;
/*  220 */     int n = localeq.n.length << 8;
/*  221 */     int i1 = m - j;
/*  222 */     if (i1 <= 0) this.w = 0;
/*  223 */     int i2 = paramInt1;
/*  224 */     paramInt2 += paramInt1;
/*  225 */     if (this.z < 0) {
/*  226 */       if (this.g > 0) { this.z = 0;
/*      */       } else {
/*  228 */         al();
/*  229 */         r();
/*  230 */         return;
/*      */       }
/*      */     }
/*  233 */     if (this.z >= n) {
/*  234 */       if (this.g < 0) { this.z = (n - 1);
/*      */       } else {
/*  236 */         al();
/*  237 */         r();
/*  238 */         return;
/*      */       }
/*      */     }
/*  241 */     if (this.w < 0) {
/*  242 */       if (this.y) {
/*  243 */         if (this.g < 0) {
/*  244 */           i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[this.e]);
/*  245 */           if (this.z >= j) return;
/*  246 */           this.z = (j + j - 1 - this.z);
/*  247 */           this.g = (-this.g);
/*      */         }
/*      */         while (true) {
/*  250 */           i2 = au(paramArrayOfInt, i2, m, paramInt2, localeq.n[(this.b - 1)]);
/*  251 */           if (this.z < m) return;
/*  252 */           this.z = (m + m - 1 - this.z);
/*  253 */           this.g = (-this.g);
/*  254 */           i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[this.e]);
/*  255 */           if (this.z >= j) return;
/*  256 */           this.z = (j + j - 1 - this.z);
/*  257 */           this.g = (-this.g);
/*      */         }
/*      */       }
/*  260 */       if (this.g < 0) {
/*      */         while (true) {
/*  262 */           i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[(this.b - 1)]);
/*  263 */           if (this.z >= j) return;
/*  264 */           this.z = (m - 1 - (m - 1 - this.z) % i1);
/*      */         }
/*      */       }
/*      */       while (true)
/*      */       {
/*  269 */         i2 = au(paramArrayOfInt, i2, m, paramInt2, localeq.n[this.e]);
/*  270 */         if (this.z < m) return;
/*  271 */         this.z = (j + (this.z - j) % i1);
/*      */       }
/*      */     }
/*      */ 
/*  275 */     if (this.w > 0) {
/*  276 */       if (this.y) {
/*  277 */         if (this.g < 0) {
/*  278 */           i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[this.e]);
/*  279 */           if (this.z >= j) return; this.z = (j + j - 1 - this.z);
/*  281 */           this.g = (-this.g);
/*  282 */           if (--this.w == 0); } else {
/*      */           do {
/*  285 */             i2 = au(paramArrayOfInt, i2, m, paramInt2, localeq.n[(this.b - 1)]);
/*  286 */             if (this.z < m) return;
/*  287 */             this.z = (m + m - 1 - this.z);
/*  288 */             this.g = (-this.g);
/*  289 */             if (--this.w == 0) break;
/*  290 */             i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[this.e]);
/*  291 */             if (this.z >= j) return;
/*  292 */             this.z = (j + j - 1 - this.z);
/*  293 */             this.g = (-this.g);
/*  294 */           }while (--this.w != 0);
/*      */         }
/*      */       }
/*      */       else
/*      */       {
/*      */         int i3;
/*  297 */         if (this.g < 0) {
/*      */           while (true) {
/*  299 */             i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[(this.b - 1)]);
/*  300 */             if (this.z >= j) return;
/*  301 */             i3 = (m - 1 - this.z) / i1;
/*  302 */             if (i3 >= this.w) {
/*  303 */               this.z += i1 * this.w;
/*  304 */               this.w = 0;
/*  305 */               break;
/*      */             }
/*  307 */             this.z += i1 * i3;
/*  308 */             this.w -= i3;
/*      */           }
/*      */         }
/*      */         while (true)
/*      */         {
/*  313 */           i2 = au(paramArrayOfInt, i2, m, paramInt2, localeq.n[this.e]);
/*  314 */           if (this.z < m) return;
/*  315 */           i3 = (this.z - j) / i1;
/*  316 */           if (i3 >= this.w) {
/*  317 */             this.z -= i1 * this.w;
/*  318 */             this.w = 0;
/*  319 */             break;
/*      */           }
/*  321 */           this.z -= i1 * i3;
/*  322 */           this.w -= i3;
/*      */         }
/*      */       }
/*      */     }
/*  326 */     if (this.g < 0) {
/*  327 */       ax(paramArrayOfInt, i2, 0, paramInt2, 0);
/*  328 */       if (this.z < 0) {
/*  329 */         this.z = -1;
/*  330 */         al();
/*  331 */         r();
/*      */       }
/*      */     }
/*      */     else {
/*  335 */       au(paramArrayOfInt, i2, n, paramInt2, 0);
/*  336 */       if (this.z >= n) {
/*  337 */         this.z = n;
/*  338 */         al();
/*  339 */         r();
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public synchronized void h(int paramInt) {
/*  345 */     if (this.t > 0) {
/*  346 */       if (paramInt >= this.t) {
/*  347 */         if (this.q == -2147483648) {
/*  348 */           this.q = 0;
/*  349 */           this.v = 0;
/*  350 */           this.u = 0;
/*  351 */           this.s = 0;
/*  352 */           r();
/*  353 */           paramInt = this.t;
/*      */         }
/*  355 */         this.t = 0;
/*  356 */         as();
/*      */       }
/*      */       else {
/*  359 */         this.s += this.f * paramInt;
/*  360 */         this.u += this.k * paramInt;
/*  361 */         this.v += this.o * paramInt;
/*  362 */         this.t -= paramInt;
/*      */       }
/*      */     }
/*  365 */     eq localeq = (eq)this.n;
/*  366 */     int j = this.e << 8;
/*  367 */     int m = this.b << 8;
/*  368 */     int n = localeq.n.length << 8;
/*  369 */     int i1 = m - j;
/*  370 */     if (i1 <= 0) this.w = 0;
/*  371 */     if (this.z < 0) {
/*  372 */       if (this.g > 0) { this.z = 0;
/*      */       } else {
/*  374 */         al();
/*  375 */         r();
/*  376 */         return;
/*      */       }
/*      */     }
/*  379 */     if (this.z >= n) {
/*  380 */       if (this.g < 0) { this.z = (n - 1);
/*      */       } else {
/*  382 */         al();
/*  383 */         r();
/*  384 */         return;
/*      */       }
/*      */     }
/*  387 */     this.z += this.g * paramInt;
/*  388 */     if (this.w < 0) {
/*  389 */       if (this.y) {
/*  390 */         if (this.g < 0) {
/*  391 */           if (this.z >= j) return;
/*  392 */           this.z = (j + j - 1 - this.z);
/*  393 */           this.g = (-this.g);
/*      */         }
/*      */         while (true) {
/*  396 */           if (this.z < m) return;
/*  397 */           this.z = (m + m - 1 - this.z);
/*  398 */           this.g = (-this.g);
/*  399 */           if (this.z >= j) return;
/*  400 */           this.z = (j + j - 1 - this.z);
/*  401 */           this.g = (-this.g);
/*      */         }
/*      */       }
/*  404 */       if (this.g < 0) {
/*  405 */         if (this.z >= j) return;
/*  406 */         this.z = (m - 1 - (m - 1 - this.z) % i1);
/*      */       }
/*      */       else {
/*  409 */         if (this.z < m) return;
/*  410 */         this.z = (j + (this.z - j) % i1);
/*      */       }
/*  412 */       return;
/*      */     }
/*  414 */     if (this.w > 0)
/*  415 */       if (this.y) {
/*  416 */         if (this.g < 0) {
/*  417 */           if (this.z >= j) return; this.z = (j + j - 1 - this.z);
/*  419 */           this.g = (-this.g);
/*  420 */           if (--this.w == 0); } else {
/*      */           do {
/*  423 */             if (this.z < m) return;
/*  424 */             this.z = (m + m - 1 - this.z);
/*  425 */             this.g = (-this.g);
/*  426 */             if (--this.w == 0) break;
/*  427 */             if (this.z >= j) return;
/*  428 */             this.z = (j + j - 1 - this.z);
/*  429 */             this.g = (-this.g);
/*  430 */           }while (--this.w != 0);
/*      */         }
/*      */       }
/*      */       else
/*      */       {
/*      */         int i2;
/*  433 */         if (this.g < 0) {
/*  434 */           if (this.z >= j) return;
/*  435 */           i2 = (m - 1 - this.z) / i1;
/*  436 */           if (i2 >= this.w) {
/*  437 */             this.z += i1 * this.w;
/*  438 */             this.w = 0;
/*  439 */             break label784;
/*      */           }
/*  441 */           this.z += i1 * i2;
/*  442 */           this.w -= i2;
/*      */         }
/*      */         else {
/*  445 */           if (this.z < m) return;
/*  446 */           i2 = (this.z - j) / i1;
/*  447 */           if (i2 >= this.w) {
/*  448 */             this.z -= i1 * this.w;
/*  449 */             this.w = 0;
/*  450 */             break label784;
/*      */           }
/*  452 */           this.z -= i1 * i2;
/*  453 */           this.w -= i2;
/*      */         }
/*  455 */         return;
/*      */       }
/*  457 */     label784: if (this.g < 0) {
/*  458 */       if (this.z < 0) {
/*  459 */         this.z = -1;
/*  460 */         al();
/*  461 */         r();
/*      */       }
/*      */ 
/*      */     }
/*  465 */     else if (this.z >= n) {
/*  466 */       this.z = n;
/*  467 */       al();
/*  468 */       r();
/*      */     }
/*      */   }
/*      */ 
/*      */   int ax(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  501 */     while (this.t > 0) {
/*  502 */       int j = paramInt1 + this.t;
/*  503 */       if (j > paramInt3) j = paramInt3;
/*  504 */       this.t += paramInt1;
/*  505 */       if ((this.g == -256) && ((this.z & 0xFF) == 0)) {
/*  506 */         if (y.d) paramInt1 = bf(0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, this.k, this.o, 0, j, paramInt2, this); else {
/*  507 */           paramInt1 = bx(((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, this.f, 0, j, paramInt2, this);
/*      */         }
/*      */       }
/*  510 */       else if (y.d) paramInt1 = bj(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, this.k, this.o, 0, j, paramInt2, this, this.g, paramInt4); else {
/*  511 */         paramInt1 = bq(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, this.f, 0, j, paramInt2, this, this.g, paramInt4);
/*      */       }
/*  513 */       this.t -= paramInt1;
/*  514 */       if (this.t != 0) return paramInt1;
/*  515 */       if (ai()) return paramInt3;
/*      */     }
/*  517 */     if ((this.g == -256) && ((this.z & 0xFF) == 0)) {
/*  518 */       if (y.d) return bh(0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, 0, paramInt3, paramInt2, this);
/*  519 */       return af(((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, 0, paramInt3, paramInt2, this);
/*      */     }
/*      */ 
/*  522 */     if (y.d) return bv(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, 0, paramInt3, paramInt2, this, this.g, paramInt4);
/*  523 */     return bk(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, 0, paramInt3, paramInt2, this, this.g, paramInt4);
/*      */   }
/*      */ 
/*      */   int t()
/*      */   {
/*  208 */     if ((this.q == 0) && (this.t == 0)) return 0;
/*  209 */     return 1;
/*      */   }
/*      */ 
/*      */   static int aj(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, et paramet)
/*      */   {
/*  583 */     paramInt1 >>= 8;
/*  584 */     paramInt6 >>= 8;
/*  585 */     paramInt3 <<= 2;
/*  586 */     if ((paramInt4 = paramInt2 + paramInt6 - paramInt1) > paramInt5) paramInt4 = paramInt5;
/*  587 */     paramInt4 -= 3;
/*  588 */     while (paramInt2 < paramInt4) {
/*  589 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*  590 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*  591 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*  592 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*      */     }
/*  594 */     paramInt4 += 3;
/*  595 */     while (paramInt2 < paramInt4) {
/*  596 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*      */     }
/*  598 */     paramet.z = (paramInt1 << 8);
/*  599 */     return paramInt2;
/*      */   }
/*      */ 
/*      */   static int aw(int paramInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, et paramet) {
/*  603 */     paramInt2 >>= 8;
/*  604 */     paramInt8 >>= 8;
/*  605 */     paramInt4 <<= 2;
/*  606 */     paramInt5 <<= 2;
/*  607 */     if ((paramInt6 = paramInt3 + paramInt8 - paramInt2) > paramInt7) paramInt6 = paramInt7;
/*  608 */     paramInt3 <<= 1;
/*  609 */     paramInt6 <<= 1;
/*  610 */     paramInt6 -= 6;
/*  611 */     while (paramInt3 < paramInt6) {
/*  612 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  613 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  614 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  615 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  616 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  617 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  618 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  619 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  620 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  621 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  622 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  623 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*      */     }
/*  625 */     paramInt6 += 6;
/*  626 */     while (paramInt3 < paramInt6) {
/*  627 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  628 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  629 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*      */     }
/*  631 */     paramet.z = (paramInt2 << 8);
/*  632 */     return paramInt3 >> 1;
/*      */   }
/*      */ 
/*      */   static int af(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, et paramet) {
/*  636 */     paramInt1 >>= 8;
/*  637 */     paramInt6 >>= 8;
/*  638 */     paramInt3 <<= 2;
/*  639 */     if ((paramInt4 = paramInt2 + paramInt1 - (paramInt6 - 1)) > paramInt5) paramInt4 = paramInt5;
/*  640 */     paramInt4 -= 3;
/*  641 */     while (paramInt2 < paramInt4) {
/*  642 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  643 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  644 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  645 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*      */     }
/*  647 */     paramInt4 += 3;
/*  648 */     while (paramInt2 < paramInt4) {
/*  649 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*      */     }
/*  651 */     paramet.z = (paramInt1 << 8);
/*  652 */     return paramInt2;
/*      */   }
/*      */ 
/*      */   public synchronized void ag(int paramInt)
/*      */   {
/*  156 */     if (paramInt == 0) {
/*  157 */       av(0);
/*  158 */       r();
/*  159 */       return;
/*      */     }
/*  161 */     if ((this.u == 0) && (this.v == 0)) {
/*  162 */       this.t = 0;
/*  163 */       this.q = 0;
/*  164 */       this.s = 0;
/*  165 */       r();
/*  166 */       return;
/*      */     }
/*  168 */     int j = -this.s;
/*  169 */     if (this.s > j) j = this.s;
/*  170 */     if (-this.u > j) j = -this.u;
/*  171 */     if (this.u > j) j = this.u;
/*  172 */     if (-this.v > j) j = -this.v;
/*  173 */     if (this.v > j) j = this.v;
/*  174 */     if (paramInt > j) paramInt = j;
/*  175 */     this.t = paramInt;
/*  176 */     this.q = -2147483648;
/*  177 */     this.f = (-this.s / paramInt);
/*  178 */     this.k = (-this.u / paramInt);
/*  179 */     this.o = (-this.v / paramInt);
/*      */   }
/*      */ 
/*      */   static int bo(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, et paramet, int paramInt12, int paramInt13)
/*      */   {
/*  958 */     paramet.s -= paramet.f * paramInt4;
/*  959 */     if ((paramInt12 == 0) || ((paramInt9 = paramInt4 + (paramInt11 - paramInt3 + paramInt12 - 257) / paramInt12) > paramInt10)) paramInt9 = paramInt10;
/*  960 */     paramInt4 <<= 1;
/*  961 */     paramInt9 <<= 1;
/*  962 */     while (paramInt4 < paramInt9) {
/*  963 */       paramInt2 = paramInt3 >> 8;
/*  964 */       paramInt1 = paramArrayOfByte[paramInt2];
/*  965 */       paramInt1 = (paramInt1 << 8) + (paramArrayOfByte[(paramInt2 + 1)] - paramInt1) * (paramInt3 & 0xFF);
/*  966 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/*  967 */       paramInt5 += paramInt7;
/*  968 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/*  969 */       paramInt6 += paramInt8;
/*  970 */       paramInt3 += paramInt12;
/*      */     }
/*  972 */     if ((paramInt12 == 0) || ((paramInt9 = (paramInt4 >> 1) + (paramInt11 - paramInt3 + paramInt12 - 1) / paramInt12) > paramInt10)) paramInt9 = paramInt10;
/*  973 */     paramInt9 <<= 1;
/*  974 */     paramInt2 = paramInt13;
/*  975 */     while (paramInt4 < paramInt9) {
/*  976 */       paramInt1 = paramArrayOfByte[(paramInt3 >> 8)];
/*  977 */       paramInt1 = (paramInt1 << 8) + (paramInt2 - paramInt1) * (paramInt3 & 0xFF);
/*  978 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/*  979 */       paramInt5 += paramInt7;
/*  980 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/*  981 */       paramInt6 += paramInt8;
/*  982 */       paramInt3 += paramInt12;
/*      */     }
/*  984 */     paramInt4 >>= 1;
/*  985 */     paramet.s += paramet.f * paramInt4;
/*  986 */     paramet.u = paramInt5;
/*  987 */     paramet.v = paramInt6;
/*  988 */     paramet.z = paramInt3;
/*  989 */     return paramInt4;
/*      */   }
/*      */ 
/*      */   static int bs(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, et paramet, int paramInt10, int paramInt11)
/*      */   {
/*  708 */     if ((paramInt10 == 0) || ((paramInt7 = paramInt4 + (paramInt9 - paramInt3 + paramInt10 - 257) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/*  709 */     paramInt4 <<= 1;
/*  710 */     paramInt7 <<= 1;
/*  711 */     while (paramInt4 < paramInt7) {
/*  712 */       paramInt2 = paramInt3 >> 8;
/*  713 */       paramInt1 = paramArrayOfByte[paramInt2];
/*  714 */       paramInt1 = (paramInt1 << 8) + (paramArrayOfByte[(paramInt2 + 1)] - paramInt1) * (paramInt3 & 0xFF);
/*  715 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/*  716 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/*  717 */       paramInt3 += paramInt10;
/*      */     }
/*  719 */     if ((paramInt10 == 0) || ((paramInt7 = (paramInt4 >> 1) + (paramInt9 - paramInt3 + paramInt10 - 1) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/*  720 */     paramInt7 <<= 1;
/*  721 */     paramInt2 = paramInt11;
/*  722 */     while (paramInt4 < paramInt7) {
/*  723 */       paramInt1 = paramArrayOfByte[(paramInt3 >> 8)];
/*  724 */       paramInt1 = (paramInt1 << 8) + (paramInt2 - paramInt1) * (paramInt3 & 0xFF);
/*  725 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/*  726 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/*  727 */       paramInt3 += paramInt10;
/*      */     }
/*  729 */     paramet.z = paramInt3;
/*  730 */     return paramInt4 >> 1;
/*      */   }
/*      */ 
/*      */   public synchronized void ay(boolean paramBoolean)
/*      */   {
/*  113 */     this.g = ((this.g ^ this.g >> 31) + (this.g >>> 31));
/*  114 */     if (paramBoolean) this.g = (-this.g);
/*      */   }
/*      */ 
/*      */   static int bv(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, et paramet, int paramInt10, int paramInt11)
/*      */   {
/*  753 */     if ((paramInt10 == 0) || ((paramInt7 = paramInt4 + (paramInt9 + 256 - paramInt3 + paramInt10) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/*  754 */     paramInt4 <<= 1;
/*  755 */     paramInt7 <<= 1;
/*  756 */     while (paramInt4 < paramInt7) {
/*  757 */       paramInt2 = paramInt3 >> 8;
/*  758 */       paramInt1 = paramArrayOfByte[(paramInt2 - 1)];
/*  759 */       paramInt1 = (paramInt1 << 8) + (paramArrayOfByte[paramInt2] - paramInt1) * (paramInt3 & 0xFF);
/*  760 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/*  761 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/*  762 */       paramInt3 += paramInt10;
/*      */     }
/*  764 */     if ((paramInt10 == 0) || ((paramInt7 = (paramInt4 >> 1) + (paramInt9 - paramInt3 + paramInt10) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/*  765 */     paramInt7 <<= 1;
/*  766 */     paramInt2 = paramInt11;
/*  767 */     while (paramInt4 < paramInt7) {
/*  768 */       paramInt1 = (paramInt2 << 8) + (paramArrayOfByte[(paramInt3 >> 8)] - paramInt2) * (paramInt3 & 0xFF);
/*  769 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/*  770 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/*  771 */       paramInt3 += paramInt10;
/*      */     }
/*  773 */     paramet.z = paramInt3;
/*  774 */     return paramInt4 >> 1;
/*      */   }
/*      */ 
/*      */   static int bm(int paramInt1, int paramInt2)
/*      */   {
/*   27 */     return paramInt2 < 0 ? -paramInt1 : (int)(paramInt1 * Math.sqrt(paramInt2 * 0.0001220703125D) + 0.5D);
/*      */   }
/*      */ 
/*      */   static int by(int paramInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, et paramet)
/*      */   {
/*  807 */     paramInt2 >>= 8;
/*  808 */     paramInt10 >>= 8;
/*  809 */     paramInt4 <<= 2;
/*  810 */     paramInt5 <<= 2;
/*  811 */     paramInt6 <<= 2;
/*  812 */     paramInt7 <<= 2;
/*  813 */     if ((paramInt8 = paramInt3 + paramInt10 - paramInt2) > paramInt9) paramInt8 = paramInt9;
/*  814 */     paramet.s += paramet.f * (paramInt8 - paramInt3);
/*  815 */     paramInt3 <<= 1;
/*  816 */     paramInt8 <<= 1;
/*  817 */     paramInt8 -= 6;
/*  818 */     while (paramInt3 < paramInt8) {
/*  819 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  820 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  821 */       paramInt4 += paramInt6;
/*  822 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  823 */       paramInt5 += paramInt7;
/*  824 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  825 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  826 */       paramInt4 += paramInt6;
/*  827 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  828 */       paramInt5 += paramInt7;
/*  829 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  830 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  831 */       paramInt4 += paramInt6;
/*  832 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  833 */       paramInt5 += paramInt7;
/*  834 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  835 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  836 */       paramInt4 += paramInt6;
/*  837 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  838 */       paramInt5 += paramInt7;
/*      */     }
/*  840 */     paramInt8 += 6;
/*  841 */     while (paramInt3 < paramInt8) {
/*  842 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  843 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  844 */       paramInt4 += paramInt6;
/*  845 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  846 */       paramInt5 += paramInt7;
/*      */     }
/*  848 */     paramet.u = (paramInt4 >> 2);
/*  849 */     paramet.v = (paramInt5 >> 2);
/*  850 */     paramet.z = (paramInt2 << 8);
/*  851 */     return paramInt3 >> 1;
/*      */   }
/*      */ 
/*      */   static int bx(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, et paramet) {
/*  855 */     paramInt1 >>= 8;
/*  856 */     paramInt7 >>= 8;
/*  857 */     paramInt3 <<= 2;
/*  858 */     paramInt4 <<= 2;
/*  859 */     if ((paramInt5 = paramInt2 + paramInt1 - (paramInt7 - 1)) > paramInt6) paramInt5 = paramInt6;
/*  860 */     paramet.u += paramet.k * (paramInt5 - paramInt2);
/*  861 */     paramet.v += paramet.o * (paramInt5 - paramInt2);
/*  862 */     paramInt5 -= 3;
/*  863 */     while (paramInt2 < paramInt5) {
/*  864 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  865 */       paramInt3 += paramInt4;
/*  866 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  867 */       paramInt3 += paramInt4;
/*  868 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  869 */       paramInt3 += paramInt4;
/*  870 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  871 */       paramInt3 += paramInt4;
/*      */     }
/*  873 */     paramInt5 += 3;
/*  874 */     while (paramInt2 < paramInt5) {
/*  875 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  876 */       paramInt3 += paramInt4;
/*      */     }
/*  878 */     paramet.s = (paramInt3 >> 2);
/*  879 */     paramet.z = (paramInt1 << 8);
/*  880 */     return paramInt2;
/*      */   }
/*      */ 
/*      */   static int bf(int paramInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, et paramet) {
/*  884 */     paramInt2 >>= 8;
/*  885 */     paramInt10 >>= 8;
/*  886 */     paramInt4 <<= 2;
/*  887 */     paramInt5 <<= 2;
/*  888 */     paramInt6 <<= 2;
/*  889 */     paramInt7 <<= 2;
/*  890 */     if ((paramInt8 = paramInt3 + paramInt2 - (paramInt10 - 1)) > paramInt9) paramInt8 = paramInt9;
/*  891 */     paramet.s += paramet.f * (paramInt8 - paramInt3);
/*  892 */     paramInt3 <<= 1;
/*  893 */     paramInt8 <<= 1;
/*  894 */     paramInt8 -= 6;
/*  895 */     while (paramInt3 < paramInt8) {
/*  896 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  897 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  898 */       paramInt4 += paramInt6;
/*  899 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  900 */       paramInt5 += paramInt7;
/*  901 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  902 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  903 */       paramInt4 += paramInt6;
/*  904 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  905 */       paramInt5 += paramInt7;
/*  906 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  907 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  908 */       paramInt4 += paramInt6;
/*  909 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  910 */       paramInt5 += paramInt7;
/*  911 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  912 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  913 */       paramInt4 += paramInt6;
/*  914 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  915 */       paramInt5 += paramInt7;
/*      */     }
/*  917 */     paramInt8 += 6;
/*  918 */     while (paramInt3 < paramInt8) {
/*  919 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  920 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  921 */       paramInt4 += paramInt6;
/*  922 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  923 */       paramInt5 += paramInt7;
/*      */     }
/*  925 */     paramet.u = (paramInt4 >> 2);
/*  926 */     paramet.v = (paramInt5 >> 2);
/*  927 */     paramet.z = (paramInt2 << 8);
/*  928 */     return paramInt3 >> 1;
/*      */   }
/*      */ 
/*      */   public synchronized void ap(int paramInt)
/*      */   {
/*   83 */     ak(paramInt << 6, an());
/*      */   }
/*      */ 
/*      */   static int dr(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, et paramet)
/*      */   {
/*  636 */     paramInt1 >>= 8;
/*  637 */     paramInt6 >>= 8;
/*  638 */     paramInt3 <<= 2;
/*  639 */     if ((paramInt4 = paramInt2 + paramInt1 - (paramInt6 - 1)) > paramInt5) paramInt4 = paramInt5;
/*  640 */     paramInt4 -= 3;
/*  641 */     while (paramInt2 < paramInt4) {
/*  642 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  643 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  644 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  645 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*      */     }
/*  647 */     paramInt4 += 3;
/*  648 */     while (paramInt2 < paramInt4) {
/*  649 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*      */     }
/*  651 */     paramet.z = (paramInt1 << 8);
/*  652 */     return paramInt2;
/*      */   }
/*      */ 
/*      */   public synchronized void cw(int paramInt1, int paramInt2)
/*      */   {
/*  126 */     ao(paramInt1, paramInt2, an());
/*      */   }
/*      */ 
/*      */   static int bj(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, et paramet, int paramInt12, int paramInt13)
/*      */   {
/* 1019 */     paramet.s -= paramet.f * paramInt4;
/* 1020 */     if ((paramInt12 == 0) || ((paramInt9 = paramInt4 + (paramInt11 + 256 - paramInt3 + paramInt12) / paramInt12) > paramInt10)) paramInt9 = paramInt10;
/* 1021 */     paramInt4 <<= 1;
/* 1022 */     paramInt9 <<= 1;
/* 1023 */     while (paramInt4 < paramInt9) {
/* 1024 */       paramInt2 = paramInt3 >> 8;
/* 1025 */       paramInt1 = paramArrayOfByte[(paramInt2 - 1)];
/* 1026 */       paramInt1 = (paramInt1 << 8) + (paramArrayOfByte[paramInt2] - paramInt1) * (paramInt3 & 0xFF);
/* 1027 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/* 1028 */       paramInt5 += paramInt7;
/* 1029 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/* 1030 */       paramInt6 += paramInt8;
/* 1031 */       paramInt3 += paramInt12;
/*      */     }
/* 1033 */     if ((paramInt12 == 0) || ((paramInt9 = (paramInt4 >> 1) + (paramInt11 - paramInt3 + paramInt12) / paramInt12) > paramInt10)) paramInt9 = paramInt10;
/* 1034 */     paramInt9 <<= 1;
/* 1035 */     paramInt2 = paramInt13;
/* 1036 */     while (paramInt4 < paramInt9) {
/* 1037 */       paramInt1 = (paramInt2 << 8) + (paramArrayOfByte[(paramInt3 >> 8)] - paramInt2) * (paramInt3 & 0xFF);
/* 1038 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/* 1039 */       paramInt5 += paramInt7;
/* 1040 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/* 1041 */       paramInt6 += paramInt8;
/* 1042 */       paramInt3 += paramInt12;
/*      */     }
/* 1044 */     paramInt4 >>= 1;
/* 1045 */     paramet.s += paramet.f * paramInt4;
/* 1046 */     paramet.u = paramInt5;
/* 1047 */     paramet.v = paramInt6;
/* 1048 */     paramet.z = paramInt3;
/* 1049 */     return paramInt4;
/*      */   }
/*      */ 
/*      */   public synchronized void f(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*      */   {
/*  213 */     if ((this.q == 0) && (this.t == 0)) {
/*  214 */       i(paramInt2);
/*  215 */       return;
/*      */     }
/*  217 */     eq localeq = (eq)this.n;
/*  218 */     int j = this.e << 8;
/*  219 */     int m = this.b << 8;
/*  220 */     int n = localeq.n.length << 8;
/*  221 */     int i1 = m - j;
/*  222 */     if (i1 <= 0) this.w = 0;
/*  223 */     int i2 = paramInt1;
/*  224 */     paramInt2 += paramInt1;
/*  225 */     if (this.z < 0) {
/*  226 */       if (this.g > 0) { this.z = 0;
/*      */       } else {
/*  228 */         al();
/*  229 */         r();
/*  230 */         return;
/*      */       }
/*      */     }
/*  233 */     if (this.z >= n) {
/*  234 */       if (this.g < 0) { this.z = (n - 1);
/*      */       } else {
/*  236 */         al();
/*  237 */         r();
/*  238 */         return;
/*      */       }
/*      */     }
/*  241 */     if (this.w < 0) {
/*  242 */       if (this.y) {
/*  243 */         if (this.g < 0) {
/*  244 */           i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[this.e]);
/*  245 */           if (this.z >= j) return;
/*  246 */           this.z = (j + j - 1 - this.z);
/*  247 */           this.g = (-this.g);
/*      */         }
/*      */         while (true) {
/*  250 */           i2 = au(paramArrayOfInt, i2, m, paramInt2, localeq.n[(this.b - 1)]);
/*  251 */           if (this.z < m) return;
/*  252 */           this.z = (m + m - 1 - this.z);
/*  253 */           this.g = (-this.g);
/*  254 */           i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[this.e]);
/*  255 */           if (this.z >= j) return;
/*  256 */           this.z = (j + j - 1 - this.z);
/*  257 */           this.g = (-this.g);
/*      */         }
/*      */       }
/*  260 */       if (this.g < 0) {
/*      */         while (true) {
/*  262 */           i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[(this.b - 1)]);
/*  263 */           if (this.z >= j) return;
/*  264 */           this.z = (m - 1 - (m - 1 - this.z) % i1);
/*      */         }
/*      */       }
/*      */       while (true)
/*      */       {
/*  269 */         i2 = au(paramArrayOfInt, i2, m, paramInt2, localeq.n[this.e]);
/*  270 */         if (this.z < m) return;
/*  271 */         this.z = (j + (this.z - j) % i1);
/*      */       }
/*      */     }
/*      */ 
/*  275 */     if (this.w > 0) {
/*  276 */       if (this.y) {
/*  277 */         if (this.g < 0) {
/*  278 */           i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[this.e]);
/*  279 */           if (this.z >= j) return; this.z = (j + j - 1 - this.z);
/*  281 */           this.g = (-this.g);
/*  282 */           if (--this.w == 0); } else {
/*      */           do {
/*  285 */             i2 = au(paramArrayOfInt, i2, m, paramInt2, localeq.n[(this.b - 1)]);
/*  286 */             if (this.z < m) return;
/*  287 */             this.z = (m + m - 1 - this.z);
/*  288 */             this.g = (-this.g);
/*  289 */             if (--this.w == 0) break;
/*  290 */             i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[this.e]);
/*  291 */             if (this.z >= j) return;
/*  292 */             this.z = (j + j - 1 - this.z);
/*  293 */             this.g = (-this.g);
/*  294 */           }while (--this.w != 0);
/*      */         }
/*      */       }
/*      */       else
/*      */       {
/*      */         int i3;
/*  297 */         if (this.g < 0) {
/*      */           while (true) {
/*  299 */             i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[(this.b - 1)]);
/*  300 */             if (this.z >= j) return;
/*  301 */             i3 = (m - 1 - this.z) / i1;
/*  302 */             if (i3 >= this.w) {
/*  303 */               this.z += i1 * this.w;
/*  304 */               this.w = 0;
/*  305 */               break;
/*      */             }
/*  307 */             this.z += i1 * i3;
/*  308 */             this.w -= i3;
/*      */           }
/*      */         }
/*      */         while (true)
/*      */         {
/*  313 */           i2 = au(paramArrayOfInt, i2, m, paramInt2, localeq.n[this.e]);
/*  314 */           if (this.z < m) return;
/*  315 */           i3 = (this.z - j) / i1;
/*  316 */           if (i3 >= this.w) {
/*  317 */             this.z -= i1 * this.w;
/*  318 */             this.w = 0;
/*  319 */             break;
/*      */           }
/*  321 */           this.z -= i1 * i3;
/*  322 */           this.w -= i3;
/*      */         }
/*      */       }
/*      */     }
/*  326 */     if (this.g < 0) {
/*  327 */       ax(paramArrayOfInt, i2, 0, paramInt2, 0);
/*  328 */       if (this.z < 0) {
/*  329 */         this.z = -1;
/*  330 */         al();
/*  331 */         r();
/*      */       }
/*      */     }
/*      */     else {
/*  335 */       au(paramArrayOfInt, i2, n, paramInt2, 0);
/*  336 */       if (this.z >= n) {
/*  337 */         this.z = n;
/*  338 */         al();
/*  339 */         r();
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   int au(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  474 */     while (this.t > 0) {
/*  475 */       int j = paramInt1 + this.t;
/*  476 */       if (j > paramInt3) j = paramInt3;
/*  477 */       this.t += paramInt1;
/*  478 */       if ((this.g == 256) && ((this.z & 0xFF) == 0)) {
/*  479 */         if (y.d) paramInt1 = by(0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, this.k, this.o, 0, j, paramInt2, this); else {
/*  480 */           paramInt1 = bw(((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, this.f, 0, j, paramInt2, this);
/*      */         }
/*      */       }
/*  483 */       else if (y.d) paramInt1 = bo(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, this.k, this.o, 0, j, paramInt2, this, this.g, paramInt4); else {
/*  484 */         paramInt1 = bu(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, this.f, 0, j, paramInt2, this, this.g, paramInt4);
/*      */       }
/*  486 */       this.t -= paramInt1;
/*  487 */       if (this.t != 0) return paramInt1;
/*  488 */       if (ai()) return paramInt3;
/*      */     }
/*  490 */     if ((this.g == 256) && ((this.z & 0xFF) == 0)) {
/*  491 */       if (y.d) return aw(0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, 0, paramInt3, paramInt2, this);
/*  492 */       return aj(((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, 0, paramInt3, paramInt2, this);
/*      */     }
/*      */ 
/*  495 */     if (y.d) return bs(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, 0, paramInt3, paramInt2, this, this.g, paramInt4);
/*  496 */     return bi(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, 0, paramInt3, paramInt2, this, this.g, paramInt4);
/*      */   }
/*      */ 
/*      */   static int es(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, et paramet, int paramInt10, int paramInt11)
/*      */   {
/*  753 */     if ((paramInt10 == 0) || ((paramInt7 = paramInt4 + (paramInt9 + 256 - paramInt3 + paramInt10) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/*  754 */     paramInt4 <<= 1;
/*  755 */     paramInt7 <<= 1;
/*  756 */     while (paramInt4 < paramInt7) {
/*  757 */       paramInt2 = paramInt3 >> 8;
/*  758 */       paramInt1 = paramArrayOfByte[(paramInt2 - 1)];
/*  759 */       paramInt1 = (paramInt1 << 8) + (paramArrayOfByte[paramInt2] - paramInt1) * (paramInt3 & 0xFF);
/*  760 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/*  761 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/*  762 */       paramInt3 += paramInt10;
/*      */     }
/*  764 */     if ((paramInt10 == 0) || ((paramInt7 = (paramInt4 >> 1) + (paramInt9 - paramInt3 + paramInt10) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/*  765 */     paramInt7 <<= 1;
/*  766 */     paramInt2 = paramInt11;
/*  767 */     while (paramInt4 < paramInt7) {
/*  768 */       paramInt1 = (paramInt2 << 8) + (paramArrayOfByte[(paramInt3 >> 8)] - paramInt2) * (paramInt3 & 0xFF);
/*  769 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/*  770 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/*  771 */       paramInt3 += paramInt10;
/*      */     }
/*  773 */     paramet.z = paramInt3;
/*  774 */     return paramInt4 >> 1;
/*      */   }
/*      */ 
/*      */   int s()
/*      */   {
/*   31 */     int j = this.s * 3 >> 6;
/*   32 */     j = (j ^ j >> 31) + (j >>> 31);
/*   33 */     if (this.w == 0) j -= j * this.z / (((eq)this.n).n.length << 8);
/*   34 */     else if (this.w >= 0) j -= j * this.e / ((eq)this.n).n.length;
/*   35 */     return j > 255 ? 255 : j;
/*      */   }
/*      */ 
/*      */   int u()
/*      */   {
/*   31 */     int j = this.s * 3 >> 6;
/*   32 */     j = (j ^ j >> 31) + (j >>> 31);
/*   33 */     if (this.w == 0) j -= j * this.z / (((eq)this.n).n.length << 8);
/*   34 */     else if (this.w >= 0) j -= j * this.e / ((eq)this.n).n.length;
/*   35 */     return j > 255 ? 255 : j;
/*      */   }
/*      */ 
/*      */   int dz(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  474 */     while (this.t > 0) {
/*  475 */       int j = paramInt1 + this.t;
/*  476 */       if (j > paramInt3) j = paramInt3;
/*  477 */       this.t += paramInt1;
/*  478 */       if ((this.g == 256) && ((this.z & 0xFF) == 0)) {
/*  479 */         if (y.d) paramInt1 = by(0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, this.k, this.o, 0, j, paramInt2, this); else {
/*  480 */           paramInt1 = bw(((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, this.f, 0, j, paramInt2, this);
/*      */         }
/*      */       }
/*  483 */       else if (y.d) paramInt1 = bo(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, this.k, this.o, 0, j, paramInt2, this, this.g, paramInt4); else {
/*  484 */         paramInt1 = bu(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, this.f, 0, j, paramInt2, this, this.g, paramInt4);
/*      */       }
/*  486 */       this.t -= paramInt1;
/*  487 */       if (this.t != 0) return paramInt1;
/*  488 */       if (ai()) return paramInt3;
/*      */     }
/*  490 */     if ((this.g == 256) && ((this.z & 0xFF) == 0)) {
/*  491 */       if (y.d) return aw(0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, 0, paramInt3, paramInt2, this);
/*  492 */       return aj(((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, 0, paramInt3, paramInt2, this);
/*      */     }
/*      */ 
/*  495 */     if (y.d) return bs(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, 0, paramInt3, paramInt2, this, this.g, paramInt4);
/*  496 */     return bi(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, 0, paramInt3, paramInt2, this, this.g, paramInt4);
/*      */   }
/*      */ 
/*      */   public synchronized void ci(int paramInt)
/*      */   {
/*  183 */     if (this.g < 0) this.g = (-paramInt); else
/*  184 */       this.g = paramInt;
/*      */   }
/*      */ 
/*      */   public synchronized void ce(int paramInt)
/*      */   {
/*  156 */     if (paramInt == 0) {
/*  157 */       av(0);
/*  158 */       r();
/*  159 */       return;
/*      */     }
/*  161 */     if ((this.u == 0) && (this.v == 0)) {
/*  162 */       this.t = 0;
/*  163 */       this.q = 0;
/*  164 */       this.s = 0;
/*  165 */       r();
/*  166 */       return;
/*      */     }
/*  168 */     int j = -this.s;
/*  169 */     if (this.s > j) j = this.s;
/*  170 */     if (-this.u > j) j = -this.u;
/*  171 */     if (this.u > j) j = this.u;
/*  172 */     if (-this.v > j) j = -this.v;
/*  173 */     if (this.v > j) j = this.v;
/*  174 */     if (paramInt > j) paramInt = j;
/*  175 */     this.t = paramInt;
/*  176 */     this.q = -2147483648;
/*  177 */     this.f = (-this.s / paramInt);
/*  178 */     this.k = (-this.u / paramInt);
/*  179 */     this.o = (-this.v / paramInt);
/*      */   }
/*      */ 
/*      */   void bc()
/*      */   {
/*   73 */     this.s = this.q;
/*   74 */     this.u = p(this.q, this.i);
/*   75 */     this.v = ad(this.q, this.i);
/*      */   }
/*      */ 
/*      */   public synchronized void br(int paramInt) {
/*   79 */     this.w = paramInt;
/*      */   }
/*      */ 
/*      */   public synchronized void bb(int paramInt) {
/*   83 */     ak(paramInt << 6, an()); } 
/*   83 */   public synchronized void bd(int paramInt) { ak(paramInt << 6, an()); }
/*      */ 
/*      */   synchronized void cr(int paramInt)
/*      */   {
/*   87 */     ak(paramInt, an()); } 
/*   87 */   synchronized void cs(int paramInt) { ak(paramInt, an()); } 
/*   87 */   synchronized void cj(int paramInt) { ak(paramInt, an()); }
/*      */ 
/*      */ 
/*      */   public synchronized int cl()
/*      */   {
/*   98 */     return this.q == -2147483648 ? 0 : this.q;
/*      */   }
/*      */ 
/*      */   boolean dc()
/*      */   {
/*  528 */     int j = this.q;
/*      */     int n;
/*      */     int m;
/*  531 */     if (j == -2147483648) {
/*  532 */       n = 0;
/*  533 */       m = 0;
/*  534 */       j = 0;
/*      */     }
/*      */     else {
/*  537 */       m = p(j, this.i);
/*  538 */       n = ad(j, this.i);
/*      */     }
/*  540 */     if ((this.s != j) || (this.u != m) || (this.v != n)) {
/*  541 */       if (this.s < j) {
/*  542 */         this.f = 1;
/*  543 */         this.t = (j - this.s);
/*      */       }
/*  545 */       else if (this.s > j) {
/*  546 */         this.f = -1;
/*  547 */         this.t = (this.s - j);
/*      */       } else {
/*  549 */         this.f = 0;
/*  550 */       }if (this.u < m) {
/*  551 */         this.k = 1;
/*  552 */         if ((this.t == 0) || (this.t > m - this.u)) this.t = (m - this.u);
/*      */       }
/*  554 */       else if (this.u > m) {
/*  555 */         this.k = -1;
/*  556 */         if ((this.t == 0) || (this.t > this.u - m)) this.t = (this.u - m); 
/*      */       }
/*  558 */       else { this.k = 0; }
/*  559 */       if (this.v < n) {
/*  560 */         this.o = 1;
/*  561 */         if ((this.t == 0) || (this.t > n - this.v)) this.t = (n - this.v);
/*      */       }
/*  563 */       else if (this.v > n) {
/*  564 */         this.o = -1;
/*  565 */         if ((this.t == 0) || (this.t > this.v - n)) this.t = (this.v - n); 
/*      */       }
/*  567 */       else { this.o = 0; }
/*  568 */       return false;
/*      */     }
/*  570 */     if (this.q == -2147483648) {
/*  571 */       this.q = 0;
/*  572 */       this.v = 0;
/*  573 */       this.u = 0;
/*  574 */       this.s = 0;
/*  575 */       r();
/*  576 */       return true;
/*      */     }
/*  578 */     as();
/*  579 */     return false;
/*      */   }
/*      */ 
/*      */   static int jdMethod_do(int paramInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, et paramet)
/*      */   {
/*  656 */     paramInt2 >>= 8;
/*  657 */     paramInt8 >>= 8;
/*  658 */     paramInt4 <<= 2;
/*  659 */     paramInt5 <<= 2;
/*  660 */     if ((paramInt6 = paramInt3 + paramInt2 - (paramInt8 - 1)) > paramInt7) paramInt6 = paramInt7;
/*  661 */     paramInt3 <<= 1;
/*  662 */     paramInt6 <<= 1;
/*  663 */     paramInt6 -= 6;
/*  664 */     while (paramInt3 < paramInt6) {
/*  665 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  666 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  667 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  668 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  669 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  670 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  671 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  672 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  673 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  674 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  675 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  676 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*      */     }
/*  678 */     paramInt6 += 6;
/*  679 */     while (paramInt3 < paramInt6) {
/*  680 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  681 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  682 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*      */     }
/*  684 */     paramet.z = (paramInt2 << 8);
/*  685 */     return paramInt3 >> 1;
/*      */   }
/*      */ 
/*      */   public synchronized void co(boolean paramBoolean)
/*      */   {
/*  113 */     this.g = ((this.g ^ this.g >> 31) + (this.g >>> 31));
/*  114 */     if (paramBoolean) this.g = (-this.g);
/*      */   }
/*      */ 
/*      */   public synchronized void ch(boolean paramBoolean)
/*      */   {
/*  113 */     this.g = ((this.g ^ this.g >> 31) + (this.g >>> 31));
/*  114 */     if (paramBoolean) this.g = (-this.g); 
/*      */   }
/*      */ 
/*      */   void cu()
/*      */   {
/*  118 */     if (this.t != 0) {
/*  119 */       if (this.q == -2147483648) this.q = 0;
/*  120 */       this.t = 0;
/*  121 */       as();
/*      */     }
/*      */   }
/*      */ 
/*      */   dx v()
/*      */   {
/*  200 */     return null;
/*      */   }
/*      */ 
/*      */   void cm()
/*      */   {
/*  118 */     if (this.t != 0) {
/*  119 */       if (this.q == -2147483648) this.q = 0;
/*  120 */       this.t = 0;
/*  121 */       as();
/*      */     }
/*      */   }
/*      */ 
/*      */   public synchronized void ca(int paramInt)
/*      */   {
/*  106 */     int j = ((eq)this.n).n.length << 8;
/*  107 */     if (paramInt < -1) paramInt = -1;
/*  108 */     if (paramInt > j) paramInt = j;
/*  109 */     this.z = paramInt;
/*      */   }
/*      */ 
/*      */   int ds(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  501 */     while (this.t > 0) {
/*  502 */       int j = paramInt1 + this.t;
/*  503 */       if (j > paramInt3) j = paramInt3;
/*  504 */       this.t += paramInt1;
/*  505 */       if ((this.g == -256) && ((this.z & 0xFF) == 0)) {
/*  506 */         if (y.d) paramInt1 = bf(0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, this.k, this.o, 0, j, paramInt2, this); else {
/*  507 */           paramInt1 = bx(((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, this.f, 0, j, paramInt2, this);
/*      */         }
/*      */       }
/*  510 */       else if (y.d) paramInt1 = bj(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, this.k, this.o, 0, j, paramInt2, this, this.g, paramInt4); else {
/*  511 */         paramInt1 = bq(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, this.f, 0, j, paramInt2, this, this.g, paramInt4);
/*      */       }
/*  513 */       this.t -= paramInt1;
/*  514 */       if (this.t != 0) return paramInt1;
/*  515 */       if (ai()) return paramInt3;
/*      */     }
/*  517 */     if ((this.g == -256) && ((this.z & 0xFF) == 0)) {
/*  518 */       if (y.d) return bh(0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, 0, paramInt3, paramInt2, this);
/*  519 */       return af(((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, 0, paramInt3, paramInt2, this);
/*      */     }
/*      */ 
/*  522 */     if (y.d) return bv(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, 0, paramInt3, paramInt2, this, this.g, paramInt4);
/*  523 */     return bk(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, 0, paramInt3, paramInt2, this, this.g, paramInt4);
/*      */   }
/*      */ 
/*      */   public synchronized void cv(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  130 */     if (paramInt1 == 0) {
/*  131 */       ak(paramInt2, paramInt3);
/*  132 */       return;
/*      */     }
/*  134 */     int j = p(paramInt2, paramInt3);
/*  135 */     int m = ad(paramInt2, paramInt3);
/*  136 */     if ((this.u == j) && (this.v == m)) {
/*  137 */       this.t = 0;
/*  138 */       return;
/*      */     }
/*  140 */     int n = paramInt2 - this.s;
/*  141 */     if (this.s - paramInt2 > n) n = this.s - paramInt2;
/*  142 */     if (j - this.u > n) n = j - this.u;
/*  143 */     if (this.u - j > n) n = this.u - j;
/*  144 */     if (m - this.v > n) n = m - this.v;
/*  145 */     if (this.v - m > n) n = this.v - m;
/*  146 */     if (paramInt1 > n) paramInt1 = n;
/*  147 */     this.t = paramInt1;
/*  148 */     this.q = paramInt2;
/*  149 */     this.i = paramInt3;
/*  150 */     this.f = ((paramInt2 - this.s) / paramInt1);
/*  151 */     this.k = ((j - this.u) / paramInt1);
/*  152 */     this.o = ((m - this.v) / paramInt1);
/*      */   }
/*      */ 
/*      */   public synchronized void ct(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  130 */     if (paramInt1 == 0) {
/*  131 */       ak(paramInt2, paramInt3);
/*  132 */       return;
/*      */     }
/*  134 */     int j = p(paramInt2, paramInt3);
/*  135 */     int m = ad(paramInt2, paramInt3);
/*  136 */     if ((this.u == j) && (this.v == m)) {
/*  137 */       this.t = 0;
/*  138 */       return;
/*      */     }
/*  140 */     int n = paramInt2 - this.s;
/*  141 */     if (this.s - paramInt2 > n) n = this.s - paramInt2;
/*  142 */     if (j - this.u > n) n = j - this.u;
/*  143 */     if (this.u - j > n) n = this.u - j;
/*  144 */     if (m - this.v > n) n = m - this.v;
/*  145 */     if (this.v - m > n) n = this.v - m;
/*  146 */     if (paramInt1 > n) paramInt1 = n;
/*  147 */     this.t = paramInt1;
/*  148 */     this.q = paramInt2;
/*  149 */     this.i = paramInt3;
/*  150 */     this.f = ((paramInt2 - this.s) / paramInt1);
/*  151 */     this.k = ((j - this.u) / paramInt1);
/*  152 */     this.o = ((m - this.v) / paramInt1);
/*      */   }
/*      */ 
/*      */   public synchronized void ck(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  130 */     if (paramInt1 == 0) {
/*  131 */       ak(paramInt2, paramInt3);
/*  132 */       return;
/*      */     }
/*  134 */     int j = p(paramInt2, paramInt3);
/*  135 */     int m = ad(paramInt2, paramInt3);
/*  136 */     if ((this.u == j) && (this.v == m)) {
/*  137 */       this.t = 0;
/*  138 */       return;
/*      */     }
/*  140 */     int n = paramInt2 - this.s;
/*  141 */     if (this.s - paramInt2 > n) n = this.s - paramInt2;
/*  142 */     if (j - this.u > n) n = j - this.u;
/*  143 */     if (this.u - j > n) n = this.u - j;
/*  144 */     if (m - this.v > n) n = m - this.v;
/*  145 */     if (this.v - m > n) n = this.v - m;
/*  146 */     if (paramInt1 > n) paramInt1 = n;
/*  147 */     this.t = paramInt1;
/*  148 */     this.q = paramInt2;
/*  149 */     this.i = paramInt3;
/*  150 */     this.f = ((paramInt2 - this.s) / paramInt1);
/*  151 */     this.k = ((j - this.u) / paramInt1);
/*  152 */     this.o = ((m - this.v) / paramInt1);
/*      */   }
/*      */ 
/*      */   public synchronized void cy(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  130 */     if (paramInt1 == 0) {
/*  131 */       ak(paramInt2, paramInt3);
/*  132 */       return;
/*      */     }
/*  134 */     int j = p(paramInt2, paramInt3);
/*  135 */     int m = ad(paramInt2, paramInt3);
/*  136 */     if ((this.u == j) && (this.v == m)) {
/*  137 */       this.t = 0;
/*  138 */       return;
/*      */     }
/*  140 */     int n = paramInt2 - this.s;
/*  141 */     if (this.s - paramInt2 > n) n = this.s - paramInt2;
/*  142 */     if (j - this.u > n) n = j - this.u;
/*  143 */     if (this.u - j > n) n = this.u - j;
/*  144 */     if (m - this.v > n) n = m - this.v;
/*  145 */     if (this.v - m > n) n = this.v - m;
/*  146 */     if (paramInt1 > n) paramInt1 = n;
/*  147 */     this.t = paramInt1;
/*  148 */     this.q = paramInt2;
/*  149 */     this.i = paramInt3;
/*  150 */     this.f = ((paramInt2 - this.s) / paramInt1);
/*  151 */     this.k = ((j - this.u) / paramInt1);
/*  152 */     this.o = ((m - this.v) / paramInt1);
/*      */   }
/*      */ 
/*      */   public synchronized void cq(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  130 */     if (paramInt1 == 0) {
/*  131 */       ak(paramInt2, paramInt3);
/*  132 */       return;
/*      */     }
/*  134 */     int j = p(paramInt2, paramInt3);
/*  135 */     int m = ad(paramInt2, paramInt3);
/*  136 */     if ((this.u == j) && (this.v == m)) {
/*  137 */       this.t = 0;
/*  138 */       return;
/*      */     }
/*  140 */     int n = paramInt2 - this.s;
/*  141 */     if (this.s - paramInt2 > n) n = this.s - paramInt2;
/*  142 */     if (j - this.u > n) n = j - this.u;
/*  143 */     if (this.u - j > n) n = this.u - j;
/*  144 */     if (m - this.v > n) n = m - this.v;
/*  145 */     if (this.v - m > n) n = this.v - m;
/*  146 */     if (paramInt1 > n) paramInt1 = n;
/*  147 */     this.t = paramInt1;
/*  148 */     this.q = paramInt2;
/*  149 */     this.i = paramInt3;
/*  150 */     this.f = ((paramInt2 - this.s) / paramInt1);
/*  151 */     this.k = ((j - this.u) / paramInt1);
/*  152 */     this.o = ((m - this.v) / paramInt1);
/*      */   }
/*      */ 
/*      */   public synchronized void cd(int paramInt) {
/*  156 */     if (paramInt == 0) {
/*  157 */       av(0);
/*  158 */       r();
/*  159 */       return;
/*      */     }
/*  161 */     if ((this.u == 0) && (this.v == 0)) {
/*  162 */       this.t = 0;
/*  163 */       this.q = 0;
/*  164 */       this.s = 0;
/*  165 */       r();
/*  166 */       return;
/*      */     }
/*  168 */     int j = -this.s;
/*  169 */     if (this.s > j) j = this.s;
/*  170 */     if (-this.u > j) j = -this.u;
/*  171 */     if (this.u > j) j = this.u;
/*  172 */     if (-this.v > j) j = -this.v;
/*  173 */     if (this.v > j) j = this.v;
/*  174 */     if (paramInt > j) paramInt = j;
/*  175 */     this.t = paramInt;
/*  176 */     this.q = -2147483648;
/*  177 */     this.f = (-this.s / paramInt);
/*  178 */     this.k = (-this.u / paramInt);
/*  179 */     this.o = (-this.v / paramInt);
/*      */   }
/*      */ 
/*      */   dx e()
/*      */   {
/*  200 */     return null;
/*      */   }
/*      */ 
/*      */   static int bw(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, et paramet)
/*      */   {
/*  778 */     paramInt1 >>= 8;
/*  779 */     paramInt7 >>= 8;
/*  780 */     paramInt3 <<= 2;
/*  781 */     paramInt4 <<= 2;
/*  782 */     if ((paramInt5 = paramInt2 + paramInt7 - paramInt1) > paramInt6) paramInt5 = paramInt6;
/*  783 */     paramet.u += paramet.k * (paramInt5 - paramInt2);
/*  784 */     paramet.v += paramet.o * (paramInt5 - paramInt2);
/*  785 */     paramInt5 -= 3;
/*  786 */     while (paramInt2 < paramInt5) {
/*  787 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*  788 */       paramInt3 += paramInt4;
/*  789 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*  790 */       paramInt3 += paramInt4;
/*  791 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*  792 */       paramInt3 += paramInt4;
/*  793 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*  794 */       paramInt3 += paramInt4;
/*      */     }
/*  796 */     paramInt5 += 3;
/*  797 */     while (paramInt2 < paramInt5) {
/*  798 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*  799 */       paramInt3 += paramInt4;
/*      */     }
/*  801 */     paramet.s = (paramInt3 >> 2);
/*  802 */     paramet.z = (paramInt1 << 8);
/*  803 */     return paramInt2;
/*      */   }
/*      */ 
/*      */   int dv(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  501 */     while (this.t > 0) {
/*  502 */       int j = paramInt1 + this.t;
/*  503 */       if (j > paramInt3) j = paramInt3;
/*  504 */       this.t += paramInt1;
/*  505 */       if ((this.g == -256) && ((this.z & 0xFF) == 0)) {
/*  506 */         if (y.d) paramInt1 = bf(0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, this.k, this.o, 0, j, paramInt2, this); else {
/*  507 */           paramInt1 = bx(((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, this.f, 0, j, paramInt2, this);
/*      */         }
/*      */       }
/*  510 */       else if (y.d) paramInt1 = bj(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, this.k, this.o, 0, j, paramInt2, this, this.g, paramInt4); else {
/*  511 */         paramInt1 = bq(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, this.f, 0, j, paramInt2, this, this.g, paramInt4);
/*      */       }
/*  513 */       this.t -= paramInt1;
/*  514 */       if (this.t != 0) return paramInt1;
/*  515 */       if (ai()) return paramInt3;
/*      */     }
/*  517 */     if ((this.g == -256) && ((this.z & 0xFF) == 0)) {
/*  518 */       if (y.d) return bh(0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, 0, paramInt3, paramInt2, this);
/*  519 */       return af(((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, 0, paramInt3, paramInt2, this);
/*      */     }
/*      */ 
/*  522 */     if (y.d) return bv(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, 0, paramInt3, paramInt2, this, this.g, paramInt4);
/*  523 */     return bk(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, 0, paramInt3, paramInt2, this, this.g, paramInt4);
/*      */   }
/*      */ 
/*      */   static int er(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, et paramet, int paramInt9, int paramInt10)
/*      */   {
/*  734 */     if ((paramInt9 == 0) || ((paramInt6 = paramInt4 + (paramInt8 + 256 - paramInt3 + paramInt9) / paramInt9) > paramInt7)) paramInt6 = paramInt7;
/*  735 */     while (paramInt4 < paramInt6) {
/*  736 */       paramInt2 = paramInt3 >> 8;
/*  737 */       paramInt1 = paramArrayOfByte[(paramInt2 - 1)];
/*  738 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramArrayOfByte[paramInt2] - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/*  739 */       paramInt3 += paramInt9;
/*      */     }
/*  741 */     if ((paramInt9 == 0) || ((paramInt6 = paramInt4 + (paramInt8 - paramInt3 + paramInt9) / paramInt9) > paramInt7)) paramInt6 = paramInt7;
/*  742 */     paramInt1 = paramInt10;
/*  743 */     paramInt2 = paramInt9;
/*  744 */     while (paramInt4 < paramInt6) {
/*  745 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramArrayOfByte[(paramInt3 >> 8)] - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/*  746 */       paramInt3 += paramInt2;
/*      */     }
/*  748 */     paramet.z = paramInt3;
/*  749 */     return paramInt4;
/*      */   }
/*      */ 
/*      */   public synchronized void cb(int paramInt)
/*      */   {
/*  183 */     if (this.g < 0) this.g = (-paramInt); else
/*  184 */       this.g = paramInt;
/*      */   }
/*      */ 
/*      */   public synchronized int cf() {
/*  188 */     return this.g < 0 ? -this.g : this.g; } 
/*  188 */   public synchronized int cg() { return this.g < 0 ? -this.g : this.g; } 
/*  188 */   public synchronized int dd() { return this.g < 0 ? -this.g : this.g; }
/*      */ 
/*      */   public boolean dg()
/*      */   {
/*  192 */     return (this.z < 0) || (this.z >= ((eq)this.n).n.length << 8);
/*      */   }
/*      */ 
/*      */   static int bn(int paramInt1, int paramInt2)
/*      */   {
/*   27 */     return paramInt2 < 0 ? -paramInt1 : (int)(paramInt1 * Math.sqrt(paramInt2 * 0.0001220703125D) + 0.5D);
/*      */   }
/*      */ 
/*      */   public boolean dk()
/*      */   {
/*  192 */     return (this.z < 0) || (this.z >= ((eq)this.n).n.length << 8);
/*      */   }
/*      */ 
/*      */   static int bu(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, et paramet, int paramInt10, int paramInt11)
/*      */   {
/*  932 */     paramet.u -= paramet.k * paramInt4;
/*  933 */     paramet.v -= paramet.o * paramInt4;
/*  934 */     if ((paramInt10 == 0) || ((paramInt7 = paramInt4 + (paramInt9 - paramInt3 + paramInt10 - 257) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/*  935 */     while (paramInt4 < paramInt7) {
/*  936 */       paramInt2 = paramInt3 >> 8;
/*  937 */       paramInt1 = paramArrayOfByte[paramInt2];
/*  938 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramArrayOfByte[(paramInt2 + 1)] - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/*  939 */       paramInt5 += paramInt6;
/*  940 */       paramInt3 += paramInt10;
/*      */     }
/*  942 */     if ((paramInt10 == 0) || ((paramInt7 = paramInt4 + (paramInt9 - paramInt3 + paramInt10 - 1) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/*  943 */     paramInt2 = paramInt11;
/*  944 */     while (paramInt4 < paramInt7) {
/*  945 */       paramInt1 = paramArrayOfByte[(paramInt3 >> 8)];
/*  946 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramInt2 - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/*  947 */       paramInt5 += paramInt6;
/*  948 */       paramInt3 += paramInt10;
/*      */     }
/*  950 */     paramet.u += paramet.k * paramInt4;
/*  951 */     paramet.v += paramet.o * paramInt4;
/*  952 */     paramet.s = paramInt5;
/*  953 */     paramet.z = paramInt3;
/*  954 */     return paramInt4;
/*      */   }
/*      */ 
/*      */   dx w()
/*      */   {
/*  200 */     return null;
/*      */   }
/*      */ 
/*      */   synchronized void ak(int paramInt1, int paramInt2)
/*      */   {
/*   91 */     this.q = paramInt1;
/*   92 */     this.i = paramInt2;
/*   93 */     this.t = 0;
/*   94 */     as();
/*      */   }
/*      */ 
/*      */   dx b()
/*      */   {
/*  204 */     return null; } 
/*  204 */   dx y() { return null; }
/*      */ 
/*      */ 
/*      */   static int bh(int paramInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, et paramet)
/*      */   {
/*  656 */     paramInt2 >>= 8;
/*  657 */     paramInt8 >>= 8;
/*  658 */     paramInt4 <<= 2;
/*  659 */     paramInt5 <<= 2;
/*  660 */     if ((paramInt6 = paramInt3 + paramInt2 - (paramInt8 - 1)) > paramInt7) paramInt6 = paramInt7;
/*  661 */     paramInt3 <<= 1;
/*  662 */     paramInt6 <<= 1;
/*  663 */     paramInt6 -= 6;
/*  664 */     while (paramInt3 < paramInt6) {
/*  665 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  666 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  667 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  668 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  669 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  670 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  671 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  672 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  673 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  674 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  675 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  676 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*      */     }
/*  678 */     paramInt6 += 6;
/*  679 */     while (paramInt3 < paramInt6) {
/*  680 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  681 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  682 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*      */     }
/*  684 */     paramet.z = (paramInt2 << 8);
/*  685 */     return paramInt3 >> 1;
/*      */   }
/*      */ 
/*      */   synchronized void av(int paramInt)
/*      */   {
/*   87 */     ak(paramInt, an());
/*      */   }
/*      */ 
/*      */   static int ad(int paramInt1, int paramInt2)
/*      */   {
/*   27 */     return paramInt2 < 0 ? -paramInt1 : (int)(paramInt1 * Math.sqrt(paramInt2 * 0.0001220703125D) + 0.5D);
/*      */   }
/*      */ 
/*      */   static int bq(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, et paramet, int paramInt10, int paramInt11)
/*      */   {
/*  993 */     paramet.u -= paramet.k * paramInt4;
/*  994 */     paramet.v -= paramet.o * paramInt4;
/*  995 */     if ((paramInt10 == 0) || ((paramInt7 = paramInt4 + (paramInt9 + 256 - paramInt3 + paramInt10) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/*  996 */     while (paramInt4 < paramInt7) {
/*  997 */       paramInt2 = paramInt3 >> 8;
/*  998 */       paramInt1 = paramArrayOfByte[(paramInt2 - 1)];
/*  999 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramArrayOfByte[paramInt2] - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/* 1000 */       paramInt5 += paramInt6;
/* 1001 */       paramInt3 += paramInt10;
/*      */     }
/* 1003 */     if ((paramInt10 == 0) || ((paramInt7 = paramInt4 + (paramInt9 - paramInt3 + paramInt10) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/* 1004 */     paramInt1 = paramInt11;
/* 1005 */     paramInt2 = paramInt10;
/* 1006 */     while (paramInt4 < paramInt7) {
/* 1007 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramArrayOfByte[(paramInt3 >> 8)] - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/* 1008 */       paramInt5 += paramInt6;
/* 1009 */       paramInt3 += paramInt2;
/*      */     }
/* 1011 */     paramet.u += paramet.k * paramInt4;
/* 1012 */     paramet.v += paramet.o * paramInt4;
/* 1013 */     paramet.s = paramInt5;
/* 1014 */     paramet.z = paramInt3;
/* 1015 */     return paramInt4;
/*      */   }
/*      */ 
/*      */   public synchronized void a(int paramInt)
/*      */   {
/*  345 */     if (this.t > 0) {
/*  346 */       if (paramInt >= this.t) {
/*  347 */         if (this.q == -2147483648) {
/*  348 */           this.q = 0;
/*  349 */           this.v = 0;
/*  350 */           this.u = 0;
/*  351 */           this.s = 0;
/*  352 */           r();
/*  353 */           paramInt = this.t;
/*      */         }
/*  355 */         this.t = 0;
/*  356 */         as();
/*      */       }
/*      */       else {
/*  359 */         this.s += this.f * paramInt;
/*  360 */         this.u += this.k * paramInt;
/*  361 */         this.v += this.o * paramInt;
/*  362 */         this.t -= paramInt;
/*      */       }
/*      */     }
/*  365 */     eq localeq = (eq)this.n;
/*  366 */     int j = this.e << 8;
/*  367 */     int m = this.b << 8;
/*  368 */     int n = localeq.n.length << 8;
/*  369 */     int i1 = m - j;
/*  370 */     if (i1 <= 0) this.w = 0;
/*  371 */     if (this.z < 0) {
/*  372 */       if (this.g > 0) { this.z = 0;
/*      */       } else {
/*  374 */         al();
/*  375 */         r();
/*  376 */         return;
/*      */       }
/*      */     }
/*  379 */     if (this.z >= n) {
/*  380 */       if (this.g < 0) { this.z = (n - 1);
/*      */       } else {
/*  382 */         al();
/*  383 */         r();
/*  384 */         return;
/*      */       }
/*      */     }
/*  387 */     this.z += this.g * paramInt;
/*  388 */     if (this.w < 0) {
/*  389 */       if (this.y) {
/*  390 */         if (this.g < 0) {
/*  391 */           if (this.z >= j) return;
/*  392 */           this.z = (j + j - 1 - this.z);
/*  393 */           this.g = (-this.g);
/*      */         }
/*      */         while (true) {
/*  396 */           if (this.z < m) return;
/*  397 */           this.z = (m + m - 1 - this.z);
/*  398 */           this.g = (-this.g);
/*  399 */           if (this.z >= j) return;
/*  400 */           this.z = (j + j - 1 - this.z);
/*  401 */           this.g = (-this.g);
/*      */         }
/*      */       }
/*  404 */       if (this.g < 0) {
/*  405 */         if (this.z >= j) return;
/*  406 */         this.z = (m - 1 - (m - 1 - this.z) % i1);
/*      */       }
/*      */       else {
/*  409 */         if (this.z < m) return;
/*  410 */         this.z = (j + (this.z - j) % i1);
/*      */       }
/*  412 */       return;
/*      */     }
/*  414 */     if (this.w > 0)
/*  415 */       if (this.y) {
/*  416 */         if (this.g < 0) {
/*  417 */           if (this.z >= j) return; this.z = (j + j - 1 - this.z);
/*  419 */           this.g = (-this.g);
/*  420 */           if (--this.w == 0); } else {
/*      */           do {
/*  423 */             if (this.z < m) return;
/*  424 */             this.z = (m + m - 1 - this.z);
/*  425 */             this.g = (-this.g);
/*  426 */             if (--this.w == 0) break;
/*  427 */             if (this.z >= j) return;
/*  428 */             this.z = (j + j - 1 - this.z);
/*  429 */             this.g = (-this.g);
/*  430 */           }while (--this.w != 0);
/*      */         }
/*      */       }
/*      */       else
/*      */       {
/*      */         int i2;
/*  433 */         if (this.g < 0) {
/*  434 */           if (this.z >= j) return;
/*  435 */           i2 = (m - 1 - this.z) / i1;
/*  436 */           if (i2 >= this.w) {
/*  437 */             this.z += i1 * this.w;
/*  438 */             this.w = 0;
/*  439 */             break label784;
/*      */           }
/*  441 */           this.z += i1 * i2;
/*  442 */           this.w -= i2;
/*      */         }
/*      */         else {
/*  445 */           if (this.z < m) return;
/*  446 */           i2 = (this.z - j) / i1;
/*  447 */           if (i2 >= this.w) {
/*  448 */             this.z -= i1 * this.w;
/*  449 */             this.w = 0;
/*  450 */             break label784;
/*      */           }
/*  452 */           this.z -= i1 * i2;
/*  453 */           this.w -= i2;
/*      */         }
/*  455 */         return;
/*      */       }
/*  457 */     label784: if (this.g < 0) {
/*  458 */       if (this.z < 0) {
/*  459 */         this.z = -1;
/*  460 */         al();
/*  461 */         r();
/*      */       }
/*      */ 
/*      */     }
/*  465 */     else if (this.z >= n) {
/*  466 */       this.z = n;
/*  467 */       al();
/*  468 */       r();
/*      */     }
/*      */   }
/*      */ 
/*      */   static int di(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, et paramet)
/*      */   {
/*  583 */     paramInt1 >>= 8;
/*  584 */     paramInt6 >>= 8;
/*  585 */     paramInt3 <<= 2;
/*  586 */     if ((paramInt4 = paramInt2 + paramInt6 - paramInt1) > paramInt5) paramInt4 = paramInt5;
/*  587 */     paramInt4 -= 3;
/*  588 */     while (paramInt2 < paramInt4) {
/*  589 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*  590 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*  591 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*  592 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*      */     }
/*  594 */     paramInt4 += 3;
/*  595 */     while (paramInt2 < paramInt4) {
/*  596 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*      */     }
/*  598 */     paramet.z = (paramInt1 << 8);
/*  599 */     return paramInt2;
/*      */   }
/*      */ 
/*      */   static int bz(int paramInt1, int paramInt2)
/*      */   {
/*   23 */     return paramInt2 < 0 ? paramInt1 : (int)(paramInt1 * Math.sqrt((16384 - paramInt2) * 0.0001220703125D) + 0.5D);
/*      */   }
/*      */ 
/*      */   void bp()
/*      */   {
/*   73 */     this.s = this.q;
/*   74 */     this.u = p(this.q, this.i);
/*   75 */     this.v = ad(this.q, this.i);
/*      */   }
/*      */ 
/*      */   int dj(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  474 */     while (this.t > 0) {
/*  475 */       int j = paramInt1 + this.t;
/*  476 */       if (j > paramInt3) j = paramInt3;
/*  477 */       this.t += paramInt1;
/*  478 */       if ((this.g == 256) && ((this.z & 0xFF) == 0)) {
/*  479 */         if (y.d) paramInt1 = by(0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, this.k, this.o, 0, j, paramInt2, this); else {
/*  480 */           paramInt1 = bw(((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, this.f, 0, j, paramInt2, this);
/*      */         }
/*      */       }
/*  483 */       else if (y.d) paramInt1 = bo(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, this.k, this.o, 0, j, paramInt2, this, this.g, paramInt4); else {
/*  484 */         paramInt1 = bu(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, this.f, 0, j, paramInt2, this, this.g, paramInt4);
/*      */       }
/*  486 */       this.t -= paramInt1;
/*  487 */       if (this.t != 0) return paramInt1;
/*  488 */       if (ai()) return paramInt3;
/*      */     }
/*  490 */     if ((this.g == 256) && ((this.z & 0xFF) == 0)) {
/*  491 */       if (y.d) return aw(0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, 0, paramInt3, paramInt2, this);
/*  492 */       return aj(((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, 0, paramInt3, paramInt2, this);
/*      */     }
/*      */ 
/*  495 */     if (y.d) return bs(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.u, this.v, 0, paramInt3, paramInt2, this, this.g, paramInt4);
/*  496 */     return bi(0, 0, ((eq)this.n).n, paramArrayOfInt, this.z, paramInt1, this.s, 0, paramInt3, paramInt2, this, this.g, paramInt4);
/*      */   }
/*      */ 
/*      */   void cc()
/*      */   {
/*  118 */     if (this.t != 0) {
/*  119 */       if (this.q == -2147483648) this.q = 0;
/*  120 */       this.t = 0;
/*  121 */       as();
/*      */     }
/*      */   }
/*      */ 
/*      */   public synchronized int cp()
/*      */   {
/*   98 */     return this.q == -2147483648 ? 0 : this.q;
/*      */   }
/*      */ 
/*      */   public synchronized void i(int paramInt)
/*      */   {
/*  345 */     if (this.t > 0) {
/*  346 */       if (paramInt >= this.t) {
/*  347 */         if (this.q == -2147483648) {
/*  348 */           this.q = 0;
/*  349 */           this.v = 0;
/*  350 */           this.u = 0;
/*  351 */           this.s = 0;
/*  352 */           r();
/*  353 */           paramInt = this.t;
/*      */         }
/*  355 */         this.t = 0;
/*  356 */         as();
/*      */       }
/*      */       else {
/*  359 */         this.s += this.f * paramInt;
/*  360 */         this.u += this.k * paramInt;
/*  361 */         this.v += this.o * paramInt;
/*  362 */         this.t -= paramInt;
/*      */       }
/*      */     }
/*  365 */     eq localeq = (eq)this.n;
/*  366 */     int j = this.e << 8;
/*  367 */     int m = this.b << 8;
/*  368 */     int n = localeq.n.length << 8;
/*  369 */     int i1 = m - j;
/*  370 */     if (i1 <= 0) this.w = 0;
/*  371 */     if (this.z < 0) {
/*  372 */       if (this.g > 0) { this.z = 0;
/*      */       } else {
/*  374 */         al();
/*  375 */         r();
/*  376 */         return;
/*      */       }
/*      */     }
/*  379 */     if (this.z >= n) {
/*  380 */       if (this.g < 0) { this.z = (n - 1);
/*      */       } else {
/*  382 */         al();
/*  383 */         r();
/*  384 */         return;
/*      */       }
/*      */     }
/*  387 */     this.z += this.g * paramInt;
/*  388 */     if (this.w < 0) {
/*  389 */       if (this.y) {
/*  390 */         if (this.g < 0) {
/*  391 */           if (this.z >= j) return;
/*  392 */           this.z = (j + j - 1 - this.z);
/*  393 */           this.g = (-this.g);
/*      */         }
/*      */         while (true) {
/*  396 */           if (this.z < m) return;
/*  397 */           this.z = (m + m - 1 - this.z);
/*  398 */           this.g = (-this.g);
/*  399 */           if (this.z >= j) return;
/*  400 */           this.z = (j + j - 1 - this.z);
/*  401 */           this.g = (-this.g);
/*      */         }
/*      */       }
/*  404 */       if (this.g < 0) {
/*  405 */         if (this.z >= j) return;
/*  406 */         this.z = (m - 1 - (m - 1 - this.z) % i1);
/*      */       }
/*      */       else {
/*  409 */         if (this.z < m) return;
/*  410 */         this.z = (j + (this.z - j) % i1);
/*      */       }
/*  412 */       return;
/*      */     }
/*  414 */     if (this.w > 0)
/*  415 */       if (this.y) {
/*  416 */         if (this.g < 0) {
/*  417 */           if (this.z >= j) return; this.z = (j + j - 1 - this.z);
/*  419 */           this.g = (-this.g);
/*  420 */           if (--this.w == 0); } else {
/*      */           do {
/*  423 */             if (this.z < m) return;
/*  424 */             this.z = (m + m - 1 - this.z);
/*  425 */             this.g = (-this.g);
/*  426 */             if (--this.w == 0) break;
/*  427 */             if (this.z >= j) return;
/*  428 */             this.z = (j + j - 1 - this.z);
/*  429 */             this.g = (-this.g);
/*  430 */           }while (--this.w != 0);
/*      */         }
/*      */       }
/*      */       else
/*      */       {
/*      */         int i2;
/*  433 */         if (this.g < 0) {
/*  434 */           if (this.z >= j) return;
/*  435 */           i2 = (m - 1 - this.z) / i1;
/*  436 */           if (i2 >= this.w) {
/*  437 */             this.z += i1 * this.w;
/*  438 */             this.w = 0;
/*  439 */             break label784;
/*      */           }
/*  441 */           this.z += i1 * i2;
/*  442 */           this.w -= i2;
/*      */         }
/*      */         else {
/*  445 */           if (this.z < m) return;
/*  446 */           i2 = (this.z - j) / i1;
/*  447 */           if (i2 >= this.w) {
/*  448 */             this.z -= i1 * this.w;
/*  449 */             this.w = 0;
/*  450 */             break label784;
/*      */           }
/*  452 */           this.z -= i1 * i2;
/*  453 */           this.w -= i2;
/*      */         }
/*  455 */         return;
/*      */       }
/*  457 */     label784: if (this.g < 0) {
/*  458 */       if (this.z < 0) {
/*  459 */         this.z = -1;
/*  460 */         al();
/*  461 */         r();
/*      */       }
/*      */ 
/*      */     }
/*  465 */     else if (this.z >= n) {
/*  466 */       this.z = n;
/*  467 */       al();
/*  468 */       r();
/*      */     }
/*      */   }
/*      */ 
/*      */   void ba()
/*      */   {
/*   73 */     this.s = this.q;
/*   74 */     this.u = p(this.q, this.i);
/*   75 */     this.v = ad(this.q, this.i);
/*      */   }
/*      */ 
/*      */   public static et ac(eq parameq, int paramInt1, int paramInt2)
/*      */   {
/*   63 */     if ((parameq.n == null) || (parameq.n.length == 0)) return null;
/*   64 */     return new et(parameq, (int)(parameq.c * 256L * paramInt1 / (y.r * 1874646052)), paramInt2 << 6);
/*      */   }
/*      */ 
/*      */   boolean dm()
/*      */   {
/*  528 */     int j = this.q;
/*      */     int n;
/*      */     int m;
/*  531 */     if (j == -2147483648) {
/*  532 */       n = 0;
/*  533 */       m = 0;
/*  534 */       j = 0;
/*      */     }
/*      */     else {
/*  537 */       m = p(j, this.i);
/*  538 */       n = ad(j, this.i);
/*      */     }
/*  540 */     if ((this.s != j) || (this.u != m) || (this.v != n)) {
/*  541 */       if (this.s < j) {
/*  542 */         this.f = 1;
/*  543 */         this.t = (j - this.s);
/*      */       }
/*  545 */       else if (this.s > j) {
/*  546 */         this.f = -1;
/*  547 */         this.t = (this.s - j);
/*      */       } else {
/*  549 */         this.f = 0;
/*  550 */       }if (this.u < m) {
/*  551 */         this.k = 1;
/*  552 */         if ((this.t == 0) || (this.t > m - this.u)) this.t = (m - this.u);
/*      */       }
/*  554 */       else if (this.u > m) {
/*  555 */         this.k = -1;
/*  556 */         if ((this.t == 0) || (this.t > this.u - m)) this.t = (this.u - m); 
/*      */       }
/*  558 */       else { this.k = 0; }
/*  559 */       if (this.v < n) {
/*  560 */         this.o = 1;
/*  561 */         if ((this.t == 0) || (this.t > n - this.v)) this.t = (n - this.v);
/*      */       }
/*  563 */       else if (this.v > n) {
/*  564 */         this.o = -1;
/*  565 */         if ((this.t == 0) || (this.t > this.v - n)) this.t = (this.v - n); 
/*      */       }
/*  567 */       else { this.o = 0; }
/*  568 */       return false;
/*      */     }
/*  570 */     if (this.q == -2147483648) {
/*  571 */       this.q = 0;
/*  572 */       this.v = 0;
/*  573 */       this.u = 0;
/*  574 */       this.s = 0;
/*  575 */       r();
/*  576 */       return true;
/*      */     }
/*  578 */     as();
/*  579 */     return false;
/*      */   }
/*      */ 
/*      */   static int p(int paramInt1, int paramInt2)
/*      */   {
/*   23 */     return paramInt2 < 0 ? paramInt1 : (int)(paramInt1 * Math.sqrt((16384 - paramInt2) * 0.0001220703125D) + 0.5D);
/*      */   }
/*      */ 
/*      */   static int ez(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, et paramet, int paramInt10, int paramInt11)
/*      */   {
/*  753 */     if ((paramInt10 == 0) || ((paramInt7 = paramInt4 + (paramInt9 + 256 - paramInt3 + paramInt10) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/*  754 */     paramInt4 <<= 1;
/*  755 */     paramInt7 <<= 1;
/*  756 */     while (paramInt4 < paramInt7) {
/*  757 */       paramInt2 = paramInt3 >> 8;
/*  758 */       paramInt1 = paramArrayOfByte[(paramInt2 - 1)];
/*  759 */       paramInt1 = (paramInt1 << 8) + (paramArrayOfByte[paramInt2] - paramInt1) * (paramInt3 & 0xFF);
/*  760 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/*  761 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/*  762 */       paramInt3 += paramInt10;
/*      */     }
/*  764 */     if ((paramInt10 == 0) || ((paramInt7 = (paramInt4 >> 1) + (paramInt9 - paramInt3 + paramInt10) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/*  765 */     paramInt7 <<= 1;
/*  766 */     paramInt2 = paramInt11;
/*  767 */     while (paramInt4 < paramInt7) {
/*  768 */       paramInt1 = (paramInt2 << 8) + (paramArrayOfByte[(paramInt3 >> 8)] - paramInt2) * (paramInt3 & 0xFF);
/*  769 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/*  770 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/*  771 */       paramInt3 += paramInt10;
/*      */     }
/*  773 */     paramet.z = paramInt3;
/*  774 */     return paramInt4 >> 1;
/*      */   }
/*      */ 
/*      */   static int dq(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, et paramet)
/*      */   {
/*  636 */     paramInt1 >>= 8;
/*  637 */     paramInt6 >>= 8;
/*  638 */     paramInt3 <<= 2;
/*  639 */     if ((paramInt4 = paramInt2 + paramInt1 - (paramInt6 - 1)) > paramInt5) paramInt4 = paramInt5;
/*  640 */     paramInt4 -= 3;
/*  641 */     while (paramInt2 < paramInt4) {
/*  642 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  643 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  644 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  645 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*      */     }
/*  647 */     paramInt4 += 3;
/*  648 */     while (paramInt2 < paramInt4) {
/*  649 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*      */     }
/*  651 */     paramet.z = (paramInt1 << 8);
/*  652 */     return paramInt2;
/*      */   }
/*      */ 
/*      */   static int ei(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, et paramet, int paramInt10, int paramInt11)
/*      */   {
/*  753 */     if ((paramInt10 == 0) || ((paramInt7 = paramInt4 + (paramInt9 + 256 - paramInt3 + paramInt10) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/*  754 */     paramInt4 <<= 1;
/*  755 */     paramInt7 <<= 1;
/*  756 */     while (paramInt4 < paramInt7) {
/*  757 */       paramInt2 = paramInt3 >> 8;
/*  758 */       paramInt1 = paramArrayOfByte[(paramInt2 - 1)];
/*  759 */       paramInt1 = (paramInt1 << 8) + (paramArrayOfByte[paramInt2] - paramInt1) * (paramInt3 & 0xFF);
/*  760 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/*  761 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/*  762 */       paramInt3 += paramInt10;
/*      */     }
/*  764 */     if ((paramInt10 == 0) || ((paramInt7 = (paramInt4 >> 1) + (paramInt9 - paramInt3 + paramInt10) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/*  765 */     paramInt7 <<= 1;
/*  766 */     paramInt2 = paramInt11;
/*  767 */     while (paramInt4 < paramInt7) {
/*  768 */       paramInt1 = (paramInt2 << 8) + (paramArrayOfByte[(paramInt3 >> 8)] - paramInt2) * (paramInt3 & 0xFF);
/*  769 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/*  770 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/*  771 */       paramInt3 += paramInt10;
/*      */     }
/*  773 */     paramet.z = paramInt3;
/*  774 */     return paramInt4 >> 1;
/*      */   }
/*      */ 
/*      */   static int du(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, et paramet)
/*      */   {
/*  636 */     paramInt1 >>= 8;
/*  637 */     paramInt6 >>= 8;
/*  638 */     paramInt3 <<= 2;
/*  639 */     if ((paramInt4 = paramInt2 + paramInt1 - (paramInt6 - 1)) > paramInt5) paramInt4 = paramInt5;
/*  640 */     paramInt4 -= 3;
/*  641 */     while (paramInt2 < paramInt4) {
/*  642 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  643 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  644 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  645 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*      */     }
/*  647 */     paramInt4 += 3;
/*  648 */     while (paramInt2 < paramInt4) {
/*  649 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*      */     }
/*  651 */     paramet.z = (paramInt1 << 8);
/*  652 */     return paramInt2;
/*      */   }
/*      */ 
/*      */   static int dy(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, et paramet)
/*      */   {
/*  636 */     paramInt1 >>= 8;
/*  637 */     paramInt6 >>= 8;
/*  638 */     paramInt3 <<= 2;
/*  639 */     if ((paramInt4 = paramInt2 + paramInt1 - (paramInt6 - 1)) > paramInt5) paramInt4 = paramInt5;
/*  640 */     paramInt4 -= 3;
/*  641 */     while (paramInt2 < paramInt4) {
/*  642 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  643 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  644 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  645 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*      */     }
/*  647 */     paramInt4 += 3;
/*  648 */     while (paramInt2 < paramInt4) {
/*  649 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*      */     }
/*  651 */     paramet.z = (paramInt1 << 8);
/*  652 */     return paramInt2;
/*      */   }
/*      */ 
/*      */   static int de(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, et paramet)
/*      */   {
/*  636 */     paramInt1 >>= 8;
/*  637 */     paramInt6 >>= 8;
/*  638 */     paramInt3 <<= 2;
/*  639 */     if ((paramInt4 = paramInt2 + paramInt1 - (paramInt6 - 1)) > paramInt5) paramInt4 = paramInt5;
/*  640 */     paramInt4 -= 3;
/*  641 */     while (paramInt2 < paramInt4) {
/*  642 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  643 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  644 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  645 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*      */     }
/*  647 */     paramInt4 += 3;
/*  648 */     while (paramInt2 < paramInt4) {
/*  649 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*      */     }
/*  651 */     paramet.z = (paramInt1 << 8);
/*  652 */     return paramInt2;
/*      */   }
/*      */ 
/*      */   static int dw(int paramInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, et paramet) {
/*  656 */     paramInt2 >>= 8;
/*  657 */     paramInt8 >>= 8;
/*  658 */     paramInt4 <<= 2;
/*  659 */     paramInt5 <<= 2;
/*  660 */     if ((paramInt6 = paramInt3 + paramInt2 - (paramInt8 - 1)) > paramInt7) paramInt6 = paramInt7;
/*  661 */     paramInt3 <<= 1;
/*  662 */     paramInt6 <<= 1;
/*  663 */     paramInt6 -= 6;
/*  664 */     while (paramInt3 < paramInt6) {
/*  665 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  666 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  667 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  668 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  669 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  670 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  671 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  672 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  673 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  674 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  675 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  676 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*      */     }
/*  678 */     paramInt6 += 6;
/*  679 */     while (paramInt3 < paramInt6) {
/*  680 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  681 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  682 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*      */     }
/*  684 */     paramet.z = (paramInt2 << 8);
/*  685 */     return paramInt3 >> 1;
/*      */   }
/*      */ 
/*      */   static int dl(int paramInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, et paramet)
/*      */   {
/*  656 */     paramInt2 >>= 8;
/*  657 */     paramInt8 >>= 8;
/*  658 */     paramInt4 <<= 2;
/*  659 */     paramInt5 <<= 2;
/*  660 */     if ((paramInt6 = paramInt3 + paramInt2 - (paramInt8 - 1)) > paramInt7) paramInt6 = paramInt7;
/*  661 */     paramInt3 <<= 1;
/*  662 */     paramInt6 <<= 1;
/*  663 */     paramInt6 -= 6;
/*  664 */     while (paramInt3 < paramInt6) {
/*  665 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  666 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  667 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  668 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  669 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  670 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  671 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  672 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  673 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  674 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  675 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  676 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*      */     }
/*  678 */     paramInt6 += 6;
/*  679 */     while (paramInt3 < paramInt6) {
/*  680 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  681 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  682 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*      */     }
/*  684 */     paramet.z = (paramInt2 << 8);
/*  685 */     return paramInt3 >> 1;
/*      */   }
/*      */ 
/*      */   static int dn(int paramInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, et paramet)
/*      */   {
/*  656 */     paramInt2 >>= 8;
/*  657 */     paramInt8 >>= 8;
/*  658 */     paramInt4 <<= 2;
/*  659 */     paramInt5 <<= 2;
/*  660 */     if ((paramInt6 = paramInt3 + paramInt2 - (paramInt8 - 1)) > paramInt7) paramInt6 = paramInt7;
/*  661 */     paramInt3 <<= 1;
/*  662 */     paramInt6 <<= 1;
/*  663 */     paramInt6 -= 6;
/*  664 */     while (paramInt3 < paramInt6) {
/*  665 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  666 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  667 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  668 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  669 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  670 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  671 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  672 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  673 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  674 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  675 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  676 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*      */     }
/*  678 */     paramInt6 += 6;
/*  679 */     while (paramInt3 < paramInt6) {
/*  680 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  681 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  682 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*      */     }
/*  684 */     paramet.z = (paramInt2 << 8);
/*  685 */     return paramInt3 >> 1;
/*      */   }
/*      */ 
/*      */   public boolean df()
/*      */   {
/*  192 */     return (this.z < 0) || (this.z >= ((eq)this.n).n.length << 8);
/*      */   }
/*      */ 
/*      */   static int dx(int paramInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, et paramet)
/*      */   {
/*  656 */     paramInt2 >>= 8;
/*  657 */     paramInt8 >>= 8;
/*  658 */     paramInt4 <<= 2;
/*  659 */     paramInt5 <<= 2;
/*  660 */     if ((paramInt6 = paramInt3 + paramInt2 - (paramInt8 - 1)) > paramInt7) paramInt6 = paramInt7;
/*  661 */     paramInt3 <<= 1;
/*  662 */     paramInt6 <<= 1;
/*  663 */     paramInt6 -= 6;
/*  664 */     while (paramInt3 < paramInt6) {
/*  665 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  666 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  667 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  668 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  669 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  670 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  671 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  672 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  673 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  674 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  675 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  676 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*      */     }
/*  678 */     paramInt6 += 6;
/*  679 */     while (paramInt3 < paramInt6) {
/*  680 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  681 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  682 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*      */     }
/*  684 */     paramet.z = (paramInt2 << 8);
/*  685 */     return paramInt3 >> 1;
/*      */   }
/*      */ 
/*      */   static int dt(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, et paramet, int paramInt9, int paramInt10) {
/*  689 */     if ((paramInt9 == 0) || ((paramInt6 = paramInt4 + (paramInt8 - paramInt3 + paramInt9 - 257) / paramInt9) > paramInt7)) paramInt6 = paramInt7;
/*  690 */     while (paramInt4 < paramInt6) {
/*  691 */       paramInt2 = paramInt3 >> 8;
/*  692 */       paramInt1 = paramArrayOfByte[paramInt2];
/*  693 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramArrayOfByte[(paramInt2 + 1)] - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/*  694 */       paramInt3 += paramInt9;
/*      */     }
/*  696 */     if ((paramInt9 == 0) || ((paramInt6 = paramInt4 + (paramInt8 - paramInt3 + paramInt9 - 1) / paramInt9) > paramInt7)) paramInt6 = paramInt7;
/*  697 */     paramInt2 = paramInt10;
/*  698 */     while (paramInt4 < paramInt6) {
/*  699 */       paramInt1 = paramArrayOfByte[(paramInt3 >> 8)];
/*  700 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramInt2 - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/*  701 */       paramInt3 += paramInt9;
/*      */     }
/*  703 */     paramet.z = paramInt3;
/*  704 */     return paramInt4;
/*      */   }
/*      */ 
/*      */   static int eb(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, et paramet, int paramInt9, int paramInt10)
/*      */   {
/*  689 */     if ((paramInt9 == 0) || ((paramInt6 = paramInt4 + (paramInt8 - paramInt3 + paramInt9 - 257) / paramInt9) > paramInt7)) paramInt6 = paramInt7;
/*  690 */     while (paramInt4 < paramInt6) {
/*  691 */       paramInt2 = paramInt3 >> 8;
/*  692 */       paramInt1 = paramArrayOfByte[paramInt2];
/*  693 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramArrayOfByte[(paramInt2 + 1)] - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/*  694 */       paramInt3 += paramInt9;
/*      */     }
/*  696 */     if ((paramInt9 == 0) || ((paramInt6 = paramInt4 + (paramInt8 - paramInt3 + paramInt9 - 1) / paramInt9) > paramInt7)) paramInt6 = paramInt7;
/*  697 */     paramInt2 = paramInt10;
/*  698 */     while (paramInt4 < paramInt6) {
/*  699 */       paramInt1 = paramArrayOfByte[(paramInt3 >> 8)];
/*  700 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramInt2 - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/*  701 */       paramInt3 += paramInt9;
/*      */     }
/*  703 */     paramet.z = paramInt3;
/*  704 */     return paramInt4;
/*      */   }
/*      */ 
/*      */   public synchronized void k(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*      */   {
/*  213 */     if ((this.q == 0) && (this.t == 0)) {
/*  214 */       i(paramInt2);
/*  215 */       return;
/*      */     }
/*  217 */     eq localeq = (eq)this.n;
/*  218 */     int j = this.e << 8;
/*  219 */     int m = this.b << 8;
/*  220 */     int n = localeq.n.length << 8;
/*  221 */     int i1 = m - j;
/*  222 */     if (i1 <= 0) this.w = 0;
/*  223 */     int i2 = paramInt1;
/*  224 */     paramInt2 += paramInt1;
/*  225 */     if (this.z < 0) {
/*  226 */       if (this.g > 0) { this.z = 0;
/*      */       } else {
/*  228 */         al();
/*  229 */         r();
/*  230 */         return;
/*      */       }
/*      */     }
/*  233 */     if (this.z >= n) {
/*  234 */       if (this.g < 0) { this.z = (n - 1);
/*      */       } else {
/*  236 */         al();
/*  237 */         r();
/*  238 */         return;
/*      */       }
/*      */     }
/*  241 */     if (this.w < 0) {
/*  242 */       if (this.y) {
/*  243 */         if (this.g < 0) {
/*  244 */           i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[this.e]);
/*  245 */           if (this.z >= j) return;
/*  246 */           this.z = (j + j - 1 - this.z);
/*  247 */           this.g = (-this.g);
/*      */         }
/*      */         while (true) {
/*  250 */           i2 = au(paramArrayOfInt, i2, m, paramInt2, localeq.n[(this.b - 1)]);
/*  251 */           if (this.z < m) return;
/*  252 */           this.z = (m + m - 1 - this.z);
/*  253 */           this.g = (-this.g);
/*  254 */           i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[this.e]);
/*  255 */           if (this.z >= j) return;
/*  256 */           this.z = (j + j - 1 - this.z);
/*  257 */           this.g = (-this.g);
/*      */         }
/*      */       }
/*  260 */       if (this.g < 0) {
/*      */         while (true) {
/*  262 */           i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[(this.b - 1)]);
/*  263 */           if (this.z >= j) return;
/*  264 */           this.z = (m - 1 - (m - 1 - this.z) % i1);
/*      */         }
/*      */       }
/*      */       while (true)
/*      */       {
/*  269 */         i2 = au(paramArrayOfInt, i2, m, paramInt2, localeq.n[this.e]);
/*  270 */         if (this.z < m) return;
/*  271 */         this.z = (j + (this.z - j) % i1);
/*      */       }
/*      */     }
/*      */ 
/*  275 */     if (this.w > 0) {
/*  276 */       if (this.y) {
/*  277 */         if (this.g < 0) {
/*  278 */           i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[this.e]);
/*  279 */           if (this.z >= j) return; this.z = (j + j - 1 - this.z);
/*  281 */           this.g = (-this.g);
/*  282 */           if (--this.w == 0); } else {
/*      */           do {
/*  285 */             i2 = au(paramArrayOfInt, i2, m, paramInt2, localeq.n[(this.b - 1)]);
/*  286 */             if (this.z < m) return;
/*  287 */             this.z = (m + m - 1 - this.z);
/*  288 */             this.g = (-this.g);
/*  289 */             if (--this.w == 0) break;
/*  290 */             i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[this.e]);
/*  291 */             if (this.z >= j) return;
/*  292 */             this.z = (j + j - 1 - this.z);
/*  293 */             this.g = (-this.g);
/*  294 */           }while (--this.w != 0);
/*      */         }
/*      */       }
/*      */       else
/*      */       {
/*      */         int i3;
/*  297 */         if (this.g < 0) {
/*      */           while (true) {
/*  299 */             i2 = ax(paramArrayOfInt, i2, j, paramInt2, localeq.n[(this.b - 1)]);
/*  300 */             if (this.z >= j) return;
/*  301 */             i3 = (m - 1 - this.z) / i1;
/*  302 */             if (i3 >= this.w) {
/*  303 */               this.z += i1 * this.w;
/*  304 */               this.w = 0;
/*  305 */               break;
/*      */             }
/*  307 */             this.z += i1 * i3;
/*  308 */             this.w -= i3;
/*      */           }
/*      */         }
/*      */         while (true)
/*      */         {
/*  313 */           i2 = au(paramArrayOfInt, i2, m, paramInt2, localeq.n[this.e]);
/*  314 */           if (this.z < m) return;
/*  315 */           i3 = (this.z - j) / i1;
/*  316 */           if (i3 >= this.w) {
/*  317 */             this.z -= i1 * this.w;
/*  318 */             this.w = 0;
/*  319 */             break;
/*      */           }
/*  321 */           this.z -= i1 * i3;
/*  322 */           this.w -= i3;
/*      */         }
/*      */       }
/*      */     }
/*  326 */     if (this.g < 0) {
/*  327 */       ax(paramArrayOfInt, i2, 0, paramInt2, 0);
/*  328 */       if (this.z < 0) {
/*  329 */         this.z = -1;
/*  330 */         al();
/*  331 */         r();
/*      */       }
/*      */     }
/*      */     else {
/*  335 */       au(paramArrayOfInt, i2, n, paramInt2, 0);
/*  336 */       if (this.z >= n) {
/*  337 */         this.z = n;
/*  338 */         al();
/*  339 */         r();
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public synchronized void cx(int paramInt)
/*      */   {
/*  156 */     if (paramInt == 0) {
/*  157 */       av(0);
/*  158 */       r();
/*  159 */       return;
/*      */     }
/*  161 */     if ((this.u == 0) && (this.v == 0)) {
/*  162 */       this.t = 0;
/*  163 */       this.q = 0;
/*  164 */       this.s = 0;
/*  165 */       r();
/*  166 */       return;
/*      */     }
/*  168 */     int j = -this.s;
/*  169 */     if (this.s > j) j = this.s;
/*  170 */     if (-this.u > j) j = -this.u;
/*  171 */     if (this.u > j) j = this.u;
/*  172 */     if (-this.v > j) j = -this.v;
/*  173 */     if (this.v > j) j = this.v;
/*  174 */     if (paramInt > j) paramInt = j;
/*  175 */     this.t = paramInt;
/*  176 */     this.q = -2147483648;
/*  177 */     this.f = (-this.s / paramInt);
/*  178 */     this.k = (-this.u / paramInt);
/*  179 */     this.o = (-this.v / paramInt);
/*      */   }
/*      */ 
/*      */   public boolean at()
/*      */   {
/*  192 */     return (this.z < 0) || (this.z >= ((eq)this.n).n.length << 8);
/*      */   }
/*      */ 
/*      */   static int ev(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, et paramet, int paramInt10, int paramInt11)
/*      */   {
/*  753 */     if ((paramInt10 == 0) || ((paramInt7 = paramInt4 + (paramInt9 + 256 - paramInt3 + paramInt10) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/*  754 */     paramInt4 <<= 1;
/*  755 */     paramInt7 <<= 1;
/*  756 */     while (paramInt4 < paramInt7) {
/*  757 */       paramInt2 = paramInt3 >> 8;
/*  758 */       paramInt1 = paramArrayOfByte[(paramInt2 - 1)];
/*  759 */       paramInt1 = (paramInt1 << 8) + (paramArrayOfByte[paramInt2] - paramInt1) * (paramInt3 & 0xFF);
/*  760 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/*  761 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/*  762 */       paramInt3 += paramInt10;
/*      */     }
/*  764 */     if ((paramInt10 == 0) || ((paramInt7 = (paramInt4 >> 1) + (paramInt9 - paramInt3 + paramInt10) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/*  765 */     paramInt7 <<= 1;
/*  766 */     paramInt2 = paramInt11;
/*  767 */     while (paramInt4 < paramInt7) {
/*  768 */       paramInt1 = (paramInt2 << 8) + (paramArrayOfByte[(paramInt3 >> 8)] - paramInt2) * (paramInt3 & 0xFF);
/*  769 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/*  770 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/*  771 */       paramInt3 += paramInt10;
/*      */     }
/*  773 */     paramet.z = paramInt3;
/*  774 */     return paramInt4 >> 1;
/*      */   }
/*      */ 
/*      */   public synchronized void cn(int paramInt)
/*      */   {
/*  156 */     if (paramInt == 0) {
/*  157 */       av(0);
/*  158 */       r();
/*  159 */       return;
/*      */     }
/*  161 */     if ((this.u == 0) && (this.v == 0)) {
/*  162 */       this.t = 0;
/*  163 */       this.q = 0;
/*  164 */       this.s = 0;
/*  165 */       r();
/*  166 */       return;
/*      */     }
/*  168 */     int j = -this.s;
/*  169 */     if (this.s > j) j = this.s;
/*  170 */     if (-this.u > j) j = -this.u;
/*  171 */     if (this.u > j) j = this.u;
/*  172 */     if (-this.v > j) j = -this.v;
/*  173 */     if (this.v > j) j = this.v;
/*  174 */     if (paramInt > j) paramInt = j;
/*  175 */     this.t = paramInt;
/*  176 */     this.q = -2147483648;
/*  177 */     this.f = (-this.s / paramInt);
/*  178 */     this.k = (-this.u / paramInt);
/*  179 */     this.o = (-this.v / paramInt);
/*      */   }
/*      */ 
/*      */   static int ef(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, et paramet)
/*      */   {
/*  778 */     paramInt1 >>= 8;
/*  779 */     paramInt7 >>= 8;
/*  780 */     paramInt3 <<= 2;
/*  781 */     paramInt4 <<= 2;
/*  782 */     if ((paramInt5 = paramInt2 + paramInt7 - paramInt1) > paramInt6) paramInt5 = paramInt6;
/*  783 */     paramet.u += paramet.k * (paramInt5 - paramInt2);
/*  784 */     paramet.v += paramet.o * (paramInt5 - paramInt2);
/*  785 */     paramInt5 -= 3;
/*  786 */     while (paramInt2 < paramInt5) {
/*  787 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*  788 */       paramInt3 += paramInt4;
/*  789 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*  790 */       paramInt3 += paramInt4;
/*  791 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*  792 */       paramInt3 += paramInt4;
/*  793 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*  794 */       paramInt3 += paramInt4;
/*      */     }
/*  796 */     paramInt5 += 3;
/*  797 */     while (paramInt2 < paramInt5) {
/*  798 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1++)] * paramInt3;
/*  799 */       paramInt3 += paramInt4;
/*      */     }
/*  801 */     paramet.s = (paramInt3 >> 2);
/*  802 */     paramet.z = (paramInt1 << 8);
/*  803 */     return paramInt2;
/*      */   }
/*      */ 
/*      */   static int ej(int paramInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, et paramet) {
/*  807 */     paramInt2 >>= 8;
/*  808 */     paramInt10 >>= 8;
/*  809 */     paramInt4 <<= 2;
/*  810 */     paramInt5 <<= 2;
/*  811 */     paramInt6 <<= 2;
/*  812 */     paramInt7 <<= 2;
/*  813 */     if ((paramInt8 = paramInt3 + paramInt10 - paramInt2) > paramInt9) paramInt8 = paramInt9;
/*  814 */     paramet.s += paramet.f * (paramInt8 - paramInt3);
/*  815 */     paramInt3 <<= 1;
/*  816 */     paramInt8 <<= 1;
/*  817 */     paramInt8 -= 6;
/*  818 */     while (paramInt3 < paramInt8) {
/*  819 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  820 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  821 */       paramInt4 += paramInt6;
/*  822 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  823 */       paramInt5 += paramInt7;
/*  824 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  825 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  826 */       paramInt4 += paramInt6;
/*  827 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  828 */       paramInt5 += paramInt7;
/*  829 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  830 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  831 */       paramInt4 += paramInt6;
/*  832 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  833 */       paramInt5 += paramInt7;
/*  834 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  835 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  836 */       paramInt4 += paramInt6;
/*  837 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  838 */       paramInt5 += paramInt7;
/*      */     }
/*  840 */     paramInt8 += 6;
/*  841 */     while (paramInt3 < paramInt8) {
/*  842 */       paramInt1 = paramArrayOfByte[(paramInt2++)];
/*  843 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  844 */       paramInt4 += paramInt6;
/*  845 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  846 */       paramInt5 += paramInt7;
/*      */     }
/*  848 */     paramet.u = (paramInt4 >> 2);
/*  849 */     paramet.v = (paramInt5 >> 2);
/*  850 */     paramet.z = (paramInt2 << 8);
/*  851 */     return paramInt3 >> 1;
/*      */   }
/*      */ 
/*      */   static int eh(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, et paramet) {
/*  855 */     paramInt1 >>= 8;
/*  856 */     paramInt7 >>= 8;
/*  857 */     paramInt3 <<= 2;
/*  858 */     paramInt4 <<= 2;
/*  859 */     if ((paramInt5 = paramInt2 + paramInt1 - (paramInt7 - 1)) > paramInt6) paramInt5 = paramInt6;
/*  860 */     paramet.u += paramet.k * (paramInt5 - paramInt2);
/*  861 */     paramet.v += paramet.o * (paramInt5 - paramInt2);
/*  862 */     paramInt5 -= 3;
/*  863 */     while (paramInt2 < paramInt5) {
/*  864 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  865 */       paramInt3 += paramInt4;
/*  866 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  867 */       paramInt3 += paramInt4;
/*  868 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  869 */       paramInt3 += paramInt4;
/*  870 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  871 */       paramInt3 += paramInt4;
/*      */     }
/*  873 */     paramInt5 += 3;
/*  874 */     while (paramInt2 < paramInt5) {
/*  875 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  876 */       paramInt3 += paramInt4;
/*      */     }
/*  878 */     paramet.s = (paramInt3 >> 2);
/*  879 */     paramet.z = (paramInt1 << 8);
/*  880 */     return paramInt2;
/*      */   }
/*      */ 
/*      */   static int eg(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, et paramet)
/*      */   {
/*  855 */     paramInt1 >>= 8;
/*  856 */     paramInt7 >>= 8;
/*  857 */     paramInt3 <<= 2;
/*  858 */     paramInt4 <<= 2;
/*  859 */     if ((paramInt5 = paramInt2 + paramInt1 - (paramInt7 - 1)) > paramInt6) paramInt5 = paramInt6;
/*  860 */     paramet.u += paramet.k * (paramInt5 - paramInt2);
/*  861 */     paramet.v += paramet.o * (paramInt5 - paramInt2);
/*  862 */     paramInt5 -= 3;
/*  863 */     while (paramInt2 < paramInt5) {
/*  864 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  865 */       paramInt3 += paramInt4;
/*  866 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  867 */       paramInt3 += paramInt4;
/*  868 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  869 */       paramInt3 += paramInt4;
/*  870 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  871 */       paramInt3 += paramInt4;
/*      */     }
/*  873 */     paramInt5 += 3;
/*  874 */     while (paramInt2 < paramInt5) {
/*  875 */       paramArrayOfInt[(paramInt2++)] += paramArrayOfByte[(paramInt1--)] * paramInt3;
/*  876 */       paramInt3 += paramInt4;
/*      */     }
/*  878 */     paramet.s = (paramInt3 >> 2);
/*  879 */     paramet.z = (paramInt1 << 8);
/*  880 */     return paramInt2;
/*      */   }
/*      */ 
/*      */   static int el(int paramInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, et paramet) {
/*  884 */     paramInt2 >>= 8;
/*  885 */     paramInt10 >>= 8;
/*  886 */     paramInt4 <<= 2;
/*  887 */     paramInt5 <<= 2;
/*  888 */     paramInt6 <<= 2;
/*  889 */     paramInt7 <<= 2;
/*  890 */     if ((paramInt8 = paramInt3 + paramInt2 - (paramInt10 - 1)) > paramInt9) paramInt8 = paramInt9;
/*  891 */     paramet.s += paramet.f * (paramInt8 - paramInt3);
/*  892 */     paramInt3 <<= 1;
/*  893 */     paramInt8 <<= 1;
/*  894 */     paramInt8 -= 6;
/*  895 */     while (paramInt3 < paramInt8) {
/*  896 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  897 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  898 */       paramInt4 += paramInt6;
/*  899 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  900 */       paramInt5 += paramInt7;
/*  901 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  902 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  903 */       paramInt4 += paramInt6;
/*  904 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  905 */       paramInt5 += paramInt7;
/*  906 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  907 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  908 */       paramInt4 += paramInt6;
/*  909 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  910 */       paramInt5 += paramInt7;
/*  911 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  912 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  913 */       paramInt4 += paramInt6;
/*  914 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  915 */       paramInt5 += paramInt7;
/*      */     }
/*  917 */     paramInt8 += 6;
/*  918 */     while (paramInt3 < paramInt8) {
/*  919 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  920 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  921 */       paramInt4 += paramInt6;
/*  922 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  923 */       paramInt5 += paramInt7;
/*      */     }
/*  925 */     paramet.u = (paramInt4 >> 2);
/*  926 */     paramet.v = (paramInt5 >> 2);
/*  927 */     paramet.z = (paramInt2 << 8);
/*  928 */     return paramInt3 >> 1;
/*      */   }
/*      */ 
/*      */   static int en(int paramInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, et paramet)
/*      */   {
/*  884 */     paramInt2 >>= 8;
/*  885 */     paramInt10 >>= 8;
/*  886 */     paramInt4 <<= 2;
/*  887 */     paramInt5 <<= 2;
/*  888 */     paramInt6 <<= 2;
/*  889 */     paramInt7 <<= 2;
/*  890 */     if ((paramInt8 = paramInt3 + paramInt2 - (paramInt10 - 1)) > paramInt9) paramInt8 = paramInt9;
/*  891 */     paramet.s += paramet.f * (paramInt8 - paramInt3);
/*  892 */     paramInt3 <<= 1;
/*  893 */     paramInt8 <<= 1;
/*  894 */     paramInt8 -= 6;
/*  895 */     while (paramInt3 < paramInt8) {
/*  896 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  897 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  898 */       paramInt4 += paramInt6;
/*  899 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  900 */       paramInt5 += paramInt7;
/*  901 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  902 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  903 */       paramInt4 += paramInt6;
/*  904 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  905 */       paramInt5 += paramInt7;
/*  906 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  907 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  908 */       paramInt4 += paramInt6;
/*  909 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  910 */       paramInt5 += paramInt7;
/*  911 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  912 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  913 */       paramInt4 += paramInt6;
/*  914 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  915 */       paramInt5 += paramInt7;
/*      */     }
/*  917 */     paramInt8 += 6;
/*  918 */     while (paramInt3 < paramInt8) {
/*  919 */       paramInt1 = paramArrayOfByte[(paramInt2--)];
/*  920 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt4;
/*  921 */       paramInt4 += paramInt6;
/*  922 */       paramArrayOfInt[(paramInt3++)] += paramInt1 * paramInt5;
/*  923 */       paramInt5 += paramInt7;
/*      */     }
/*  925 */     paramet.u = (paramInt4 >> 2);
/*  926 */     paramet.v = (paramInt5 >> 2);
/*  927 */     paramet.z = (paramInt2 << 8);
/*  928 */     return paramInt3 >> 1;
/*      */   }
/*      */ 
/*      */   static int ew(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, et paramet, int paramInt10, int paramInt11)
/*      */   {
/*  993 */     paramet.u -= paramet.k * paramInt4;
/*  994 */     paramet.v -= paramet.o * paramInt4;
/*  995 */     if ((paramInt10 == 0) || ((paramInt7 = paramInt4 + (paramInt9 + 256 - paramInt3 + paramInt10) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/*  996 */     while (paramInt4 < paramInt7) {
/*  997 */       paramInt2 = paramInt3 >> 8;
/*  998 */       paramInt1 = paramArrayOfByte[(paramInt2 - 1)];
/*  999 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramArrayOfByte[paramInt2] - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/* 1000 */       paramInt5 += paramInt6;
/* 1001 */       paramInt3 += paramInt10;
/*      */     }
/* 1003 */     if ((paramInt10 == 0) || ((paramInt7 = paramInt4 + (paramInt9 - paramInt3 + paramInt10) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/* 1004 */     paramInt1 = paramInt11;
/* 1005 */     paramInt2 = paramInt10;
/* 1006 */     while (paramInt4 < paramInt7) {
/* 1007 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramArrayOfByte[(paramInt3 >> 8)] - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/* 1008 */       paramInt5 += paramInt6;
/* 1009 */       paramInt3 += paramInt2;
/*      */     }
/* 1011 */     paramet.u += paramet.k * paramInt4;
/* 1012 */     paramet.v += paramet.o * paramInt4;
/* 1013 */     paramet.s = paramInt5;
/* 1014 */     paramet.z = paramInt3;
/* 1015 */     return paramInt4;
/*      */   }
/*      */ 
/*      */   static int ek(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, et paramet, int paramInt10, int paramInt11)
/*      */   {
/*  993 */     paramet.u -= paramet.k * paramInt4;
/*  994 */     paramet.v -= paramet.o * paramInt4;
/*  995 */     if ((paramInt10 == 0) || ((paramInt7 = paramInt4 + (paramInt9 + 256 - paramInt3 + paramInt10) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/*  996 */     while (paramInt4 < paramInt7) {
/*  997 */       paramInt2 = paramInt3 >> 8;
/*  998 */       paramInt1 = paramArrayOfByte[(paramInt2 - 1)];
/*  999 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramArrayOfByte[paramInt2] - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/* 1000 */       paramInt5 += paramInt6;
/* 1001 */       paramInt3 += paramInt10;
/*      */     }
/* 1003 */     if ((paramInt10 == 0) || ((paramInt7 = paramInt4 + (paramInt9 - paramInt3 + paramInt10) / paramInt10) > paramInt8)) paramInt7 = paramInt8;
/* 1004 */     paramInt1 = paramInt11;
/* 1005 */     paramInt2 = paramInt10;
/* 1006 */     while (paramInt4 < paramInt7) {
/* 1007 */       paramArrayOfInt[(paramInt4++)] += (((paramInt1 << 8) + (paramArrayOfByte[(paramInt3 >> 8)] - paramInt1) * (paramInt3 & 0xFF)) * paramInt5 >> 6);
/* 1008 */       paramInt5 += paramInt6;
/* 1009 */       paramInt3 += paramInt2;
/*      */     }
/* 1011 */     paramet.u += paramet.k * paramInt4;
/* 1012 */     paramet.v += paramet.o * paramInt4;
/* 1013 */     paramet.s = paramInt5;
/* 1014 */     paramet.z = paramInt3;
/* 1015 */     return paramInt4;
/*      */   }
/*      */ 
/*      */   boolean dp()
/*      */   {
/*  528 */     int j = this.q;
/*      */     int n;
/*      */     int m;
/*  531 */     if (j == -2147483648) {
/*  532 */       n = 0;
/*  533 */       m = 0;
/*  534 */       j = 0;
/*      */     }
/*      */     else {
/*  537 */       m = p(j, this.i);
/*  538 */       n = ad(j, this.i);
/*      */     }
/*  540 */     if ((this.s != j) || (this.u != m) || (this.v != n)) {
/*  541 */       if (this.s < j) {
/*  542 */         this.f = 1;
/*  543 */         this.t = (j - this.s);
/*      */       }
/*  545 */       else if (this.s > j) {
/*  546 */         this.f = -1;
/*  547 */         this.t = (this.s - j);
/*      */       } else {
/*  549 */         this.f = 0;
/*  550 */       }if (this.u < m) {
/*  551 */         this.k = 1;
/*  552 */         if ((this.t == 0) || (this.t > m - this.u)) this.t = (m - this.u);
/*      */       }
/*  554 */       else if (this.u > m) {
/*  555 */         this.k = -1;
/*  556 */         if ((this.t == 0) || (this.t > this.u - m)) this.t = (this.u - m); 
/*      */       }
/*  558 */       else { this.k = 0; }
/*  559 */       if (this.v < n) {
/*  560 */         this.o = 1;
/*  561 */         if ((this.t == 0) || (this.t > n - this.v)) this.t = (n - this.v);
/*      */       }
/*  563 */       else if (this.v > n) {
/*  564 */         this.o = -1;
/*  565 */         if ((this.t == 0) || (this.t > this.v - n)) this.t = (this.v - n); 
/*      */       }
/*  567 */       else { this.o = 0; }
/*  568 */       return false;
/*      */     }
/*  570 */     if (this.q == -2147483648) {
/*  571 */       this.q = 0;
/*  572 */       this.v = 0;
/*  573 */       this.u = 0;
/*  574 */       this.s = 0;
/*  575 */       r();
/*  576 */       return true;
/*      */     }
/*  578 */     as();
/*  579 */     return false;
/*      */   }
/*      */ 
/*      */   static int et(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, et paramet, int paramInt12, int paramInt13)
/*      */   {
/* 1019 */     paramet.s -= paramet.f * paramInt4;
/* 1020 */     if ((paramInt12 == 0) || ((paramInt9 = paramInt4 + (paramInt11 + 256 - paramInt3 + paramInt12) / paramInt12) > paramInt10)) paramInt9 = paramInt10;
/* 1021 */     paramInt4 <<= 1;
/* 1022 */     paramInt9 <<= 1;
/* 1023 */     while (paramInt4 < paramInt9) {
/* 1024 */       paramInt2 = paramInt3 >> 8;
/* 1025 */       paramInt1 = paramArrayOfByte[(paramInt2 - 1)];
/* 1026 */       paramInt1 = (paramInt1 << 8) + (paramArrayOfByte[paramInt2] - paramInt1) * (paramInt3 & 0xFF);
/* 1027 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/* 1028 */       paramInt5 += paramInt7;
/* 1029 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/* 1030 */       paramInt6 += paramInt8;
/* 1031 */       paramInt3 += paramInt12;
/*      */     }
/* 1033 */     if ((paramInt12 == 0) || ((paramInt9 = (paramInt4 >> 1) + (paramInt11 - paramInt3 + paramInt12) / paramInt12) > paramInt10)) paramInt9 = paramInt10;
/* 1034 */     paramInt9 <<= 1;
/* 1035 */     paramInt2 = paramInt13;
/* 1036 */     while (paramInt4 < paramInt9) {
/* 1037 */       paramInt1 = (paramInt2 << 8) + (paramArrayOfByte[(paramInt3 >> 8)] - paramInt2) * (paramInt3 & 0xFF);
/* 1038 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt5 >> 6);
/* 1039 */       paramInt5 += paramInt7;
/* 1040 */       paramArrayOfInt[(paramInt4++)] += (paramInt1 * paramInt6 >> 6);
/* 1041 */       paramInt6 += paramInt8;
/* 1042 */       paramInt3 += paramInt12;
/*      */     }
/* 1044 */     paramInt4 >>= 1;
/* 1045 */     paramet.s += paramet.f * paramInt4;
/* 1046 */     paramet.u = paramInt5;
/* 1047 */     paramet.v = paramInt6;
/* 1048 */     paramet.z = paramInt3;
/* 1049 */     return paramInt4;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     et
 * JD-Core Version:    0.6.2
 */