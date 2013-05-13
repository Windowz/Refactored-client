/*     */ import java.awt.Component;
/*     */ 
/*     */ public class y
/*     */ {
/*     */   static final int a = 4;
/*     */   static boolean d;
/*     */   static final int n = 16384;
/*     */   static f m;
/*     */   static int l;
/*  35 */   dx[] p = new dx[8];
/*     */   public static int r;
/*     */   dx z;
/*     */   int[] j;
/*  19 */   long q = cm.r(1057714066) * 8959876817757359585L;
/*     */   int i;
/*     */   int s;
/*     */   int u;
/*  23 */   long v = 0L;
/*  24 */   int w = 0;
/*     */ 
/*  27 */   long y = 0L;
/*     */ 
/*  26 */   int b = 0;
/*     */   static final int c = 256;
/*  28 */   boolean t = true;
/*     */   static final int f = 3;
/*  25 */   int e = 0;
/*     */ 
/*  18 */   int g = 564347168;
/*     */   static final int k = 8;
/*     */   static final int o = 2;
/*  34 */   int x = 0;
/*     */   static final int h = 286331153;
/*  36 */   dx[] ad = new dx[8];
/*     */   static int gj;
/*     */   static ft[] fl;
/*     */ 
/*     */   public final synchronized void ax()
/*     */   {
/* 176 */     if (m != null) {
/* 177 */       int i1 = 1;
/* 178 */       for (int i2 = 0; i2 < 2; i2++) {
/* 179 */         if (this == m.d[i2]) m.d[i2] = null;
/* 180 */         if (null != m.d[i2]) i1 = 0;
/*     */       }
/* 182 */       if (i1 != 0) {
/* 183 */         m.l = true;
/* 184 */         while (m.m) cl.r(50L);
/* 185 */         m = null;
/*     */       }
/*     */     }
/* 188 */     e();
/* 189 */     this.j = null;
/*     */   }
/*     */ 
/*     */   public final synchronized void au()
/*     */   {
/* 165 */     this.t = true;
/*     */     try {
/* 167 */       b();
/*     */     }
/*     */     catch (Exception localException) {
/* 170 */       e();
/* 171 */       this.v = ((cm.r(1178117591) + 2000L) * 6473770776085501813L);
/*     */     }
/*     */   }
/*     */ 
/*     */   public final void c(byte paramByte)
/*     */   {
/* 161 */     this.t = true;
/*     */   }
/*     */ 
/*     */   public final synchronized void n(int paramInt) {
/* 165 */     this.t = true;
/*     */     try {
/* 167 */       b();
/*     */     }
/*     */     catch (Exception localException) {
/* 170 */       e();
/* 171 */       this.v = ((cm.r(1927382636) + 2000L) * 6473770776085501813L);
/*     */     }
/*     */   }
/*     */ 
/*     */   void s(Component paramComponent)
/*     */     throws Exception
/*     */   {
/*     */   }
/*     */ 
/*     */   final void z(int paramInt1, int paramInt2)
/*     */   {
/* 193 */     this.x -= 619073207 * paramInt1;
/* 194 */     if (813821703 * this.x < 0) { if (paramInt2 == 2112107062) throw new IllegalStateException(); this.x = 0; }
/* 195 */     if (null != this.z) { if (paramInt2 == 2112107062) throw new IllegalStateException(); this.z.i(paramInt1);
/*     */     }
/*     */   }
/*     */ 
/*     */   public final synchronized void aq()
/*     */   {
/*  98 */     if (null == this.j) return;
/*  99 */     long l1 = cm.r(812689186);
/*     */     try {
/* 101 */       if (0L != this.v * -7209263431395360547L) {
/* 102 */         if (l1 < -7209263431395360547L * this.v) return;
/* 103 */         u(1555305681 * this.i);
/* 104 */         this.v = 0L;
/* 105 */         this.t = true;
/*     */       }
/* 107 */       int i1 = v();
/* 108 */       if (this.b * -1757489513 - i1 > this.w * -1590445671) this.w = (369003177 * (-1757489513 * this.b - i1));
/* 109 */       int i2 = -1308795267 * this.s + this.u * -792637813;
/* 110 */       if (256 + i2 > 16384) i2 = 16128;
/* 111 */       if (256 + i2 > 1555305681 * this.i) {
/* 112 */         this.i += 1662043136;
/* 113 */         if (this.i * 1555305681 > 16384) this.i = 822886400;
/* 114 */         e();
/* 115 */         u(this.i * 1555305681);
/* 116 */         i1 = 0;
/* 117 */         this.t = true;
/* 118 */         if (256 + i2 > this.i * 1555305681) {
/* 119 */           i2 = 1555305681 * this.i - 256;
/* 120 */           this.u = (767174947 * (i2 - this.s * -1308795267));
/*     */         }
/*     */       }
/* 123 */       while (i1 < i2) {
/* 124 */         g(this.j, 256);
/* 125 */         w();
/* 126 */         i1 += 256;
/*     */       }
/* 128 */       if (l1 > 6025691747582875803L * this.y) {
/* 129 */         if (!this.t) {
/* 130 */           if ((0 == this.w * -1590445671) && (this.e * 1974661711 == 0)) {
/* 131 */             e();
/* 132 */             this.v = (6473770776085501813L * (l1 + 2000L));
/* 133 */             return;
/*     */           }
/* 135 */           this.u = (Math.min(1974661711 * this.e, this.w * -1590445671) * 767174947);
/* 136 */           this.e = (this.w * -426105961);
/*     */         } else {
/* 138 */           this.t = false;
/* 139 */         }this.w = 0;
/* 140 */         this.y = ((l1 + 2000L) * 2471595332980968851L);
/*     */       }
/* 142 */       this.b = (i1 * 762186023);
/*     */     }
/*     */     catch (Exception localException1) {
/* 145 */       e();
/* 146 */       this.v = (6473770776085501813L * (l1 + 2000L));
/*     */     }
/*     */     try {
/* 149 */       if (l1 > -752082433621772767L * this.q + 500000L) l1 = this.q * -752082433621772767L;
/* 150 */       while (l1 > this.q * -752082433621772767L + 5000L) {
/* 151 */         z(256, 911086068);
/* 152 */         this.q += 8959876817757359585L * (256000 / (r * -1570391439));
/*     */       }
/*     */     }
/*     */     catch (Exception localException2) {
/* 156 */       this.q = (l1 * 8959876817757359585L);
/*     */     }
/*     */   }
/*     */ 
/*     */   final void i(dx paramdx, int paramInt1, int paramInt2)
/*     */   {
/* 287 */     int i1 = paramInt1 >> 5;
/* 288 */     dx localdx = this.ad[i1];
/* 289 */     if (localdx == null) { if (paramInt2 == -1842878178) throw new IllegalStateException(); this.p[i1] = paramdx; } else {
/* 290 */       localdx.m = paramdx;
/* 291 */     }this.ad[i1] = paramdx;
/* 292 */     paramdx.c = paramInt1;
/*     */   }
/*     */ 
/*     */   public final synchronized void ai()
/*     */   {
/* 176 */     if (m != null) {
/* 177 */       int i1 = 1;
/* 178 */       for (int i2 = 0; i2 < 2; i2++) {
/* 179 */         if (this == m.d[i2]) m.d[i2] = null;
/* 180 */         if (null != m.d[i2]) i1 = 0;
/*     */       }
/* 182 */       if (i1 != 0) {
/* 183 */         m.l = true;
/* 184 */         while (m.m) cl.r(50L);
/* 185 */         m = null;
/*     */       }
/*     */     }
/* 188 */     e();
/* 189 */     this.j = null;
/*     */   }
/*     */ 
/*     */   void u(int paramInt)
/*     */     throws Exception
/*     */   {
/*     */   }
/*     */ 
/*     */   int v()
/*     */     throws Exception
/*     */   {
/* 299 */     return 1555305681 * this.i;
/*     */   }
/*     */ 
/*     */   void w()
/*     */     throws Exception
/*     */   {
/*     */   }
/*     */ 
/*     */   void e()
/*     */   {
/*     */   }
/*     */ 
/*     */   void b()
/*     */     throws Exception
/*     */   {
/*     */   }
/*     */ 
/*     */   void y(Component paramComponent)
/*     */     throws Exception
/*     */   {
/*     */   }
/*     */ 
/*     */   void t(int paramInt)
/*     */     throws Exception
/*     */   {
/*     */   }
/*     */ 
/*     */   void f(int paramInt)
/*     */     throws Exception
/*     */   {
/*     */   }
/*     */ 
/*     */   void k(int paramInt)
/*     */     throws Exception
/*     */   {
/*     */   }
/*     */ 
/*     */   public static final y ah(ak paramak, Component paramComponent, int paramInt1, int paramInt2)
/*     */   {
/*  48 */     if (0 == -1570391439 * r) throw new IllegalStateException();
/*  49 */     if ((paramInt1 < 0) || (paramInt1 >= 2)) throw new IllegalArgumentException();
/*  50 */     if (paramInt2 < 256) paramInt2 = 256; try
/*     */     {
/*  52 */       ds localds = new ds();
/*  53 */       localds.j = new int[256 * (d ? 2 : 1)];
/*  54 */       localds.s = (1326811861 * paramInt2);
/*  55 */       localds.s(paramComponent);
/*  56 */       localds.i = ((1024 + (paramInt2 & 0xFFFFFC00)) * 236504113);
/*  57 */       if (localds.i * 1555305681 > 16384) localds.i = 822886400;
/*  58 */       localds.u(localds.i * 1555305681);
/*  59 */       if ((l * 2003441015 > 0) && (null == m)) {
/*  60 */         m = new f();
/*  61 */         m.r = paramak;
/*  62 */         paramak.j(m, l * 2003441015, 452735284);
/*     */       }
/*  64 */       if (m != null) {
/*  65 */         if (null != m.d[paramInt1]) throw new IllegalArgumentException();
/*  66 */         m.d[paramInt1] = localds;
/*     */       }
/*  68 */       return localds;
/*     */     }
/*     */     catch (Throwable localThrowable1) {
/*     */       try {
/*  72 */         dv localdv = new dv(paramak, paramInt1);
/*  73 */         localdv.j = new int[256 * (d ? 2 : 1)];
/*  74 */         localdv.s = (1326811861 * paramInt2);
/*  75 */         localdv.s(paramComponent);
/*  76 */         localdv.i = 822886400;
/*  77 */         localdv.u(localdv.i * 1555305681);
/*  78 */         if ((2003441015 * l > 0) && (m == null)) {
/*  79 */           m = new f();
/*  80 */           m.r = paramak;
/*  81 */           paramak.j(m, l * 2003441015, 694690133);
/*     */         }
/*  83 */         if (m != null) {
/*  84 */           if (null != m.d[paramInt1]) throw new IllegalArgumentException();
/*  85 */           m.d[paramInt1] = localdv;
/*     */         }
/*  87 */         return localdv; } catch (Throwable localThrowable2) {
/*     */       }
/*     */     }
/*  90 */     return new y();
/*     */   }
/*     */ 
/*     */   void ak()
/*     */     throws Exception
/*     */   {
/*     */   }
/*     */ 
/*     */   void as()
/*     */   {
/*     */   }
/*     */ 
/*     */   void x(int paramInt)
/*     */     throws Exception
/*     */   {
/*     */   }
/*     */ 
/*     */   void p(int paramInt)
/*     */     throws Exception
/*     */   {
/*     */   }
/*     */ 
/*     */   int ad()
/*     */     throws Exception
/*     */   {
/* 299 */     return 1555305681 * this.i; } 
/* 299 */   int ac() throws Exception { return 1555305681 * this.i; }
/*     */ 
/*     */ 
/*     */   void aa()
/*     */     throws Exception
/*     */   {
/*     */   }
/*     */ 
/*     */   static final void bs(dx paramdx)
/*     */   {
/* 281 */     paramdx.j = false;
/* 282 */     if (null != paramdx.n) paramdx.n.m = 0;
/* 283 */     for (dx localdx = paramdx.n(); localdx != null; localdx = paramdx.j()) bw.q(localdx, 1985976531);
/*     */   }
/*     */ 
/*     */   void am()
/*     */   {
/*     */   }
/*     */ 
/*     */   void ap()
/*     */   {
/*     */   }
/*     */ 
/*     */   void av()
/*     */   {
/*     */   }
/*     */ 
/*     */   public final synchronized void m(byte paramByte)
/*     */   {
/*  98 */     if (null == this.j) { if (paramByte >= 0) throw new IllegalStateException(); return; }
/*  99 */     long l1 = cm.r(1387912937);
/*     */     try {
/* 101 */       if (0L != this.v * -7209263431395360547L) { if ((paramByte >= 0) || 
/* 102 */           (l1 < -7209263431395360547L * this.v)) { if (paramByte < 0);
/* 102 */           return; }
/* 103 */         u(1555305681 * this.i);
/* 104 */         this.v = 0L;
/* 105 */         this.t = true;
/*     */       }
/* 107 */       int i1 = v();
/* 108 */       if (this.b * -1757489513 - i1 > this.w * -1590445671) { if (paramByte >= 0) throw new IllegalStateException(); this.w = (369003177 * (-1757489513 * this.b - i1)); }
/* 109 */       int i2 = -1308795267 * this.s + this.u * -792637813;
/* 110 */       if (256 + i2 > 16384) { if (paramByte >= 0) return; i2 = 16128; }
/* 111 */       if (256 + i2 > 1555305681 * this.i) { if (paramByte >= 0) return;
/* 112 */         this.i += 1662043136;
/* 113 */         if (this.i * 1555305681 > 16384) { if (paramByte >= 0) throw new IllegalStateException(); this.i = 822886400; }
/* 114 */         e();
/* 115 */         u(this.i * 1555305681);
/* 116 */         i1 = 0;
/* 117 */         this.t = true;
/* 118 */         if (256 + i2 > this.i * 1555305681) { if (paramByte < 0);
/* 119 */           i2 = 1555305681 * this.i - 256;
/* 120 */           this.u = (767174947 * (i2 - this.s * -1308795267));
/*     */         }
/*     */       }
/* 123 */       while (i1 < i2) { if (paramByte >= 0) throw new IllegalStateException();
/* 124 */         g(this.j, 256);
/* 125 */         w();
/* 126 */         i1 += 256;
/*     */       }
/* 128 */       if (l1 > 6025691747582875803L * this.y) { if (paramByte >= 0) throw new IllegalStateException();
/* 129 */         if (!this.t) { if ((paramByte >= 0) || 
/* 130 */             (0 == this.w * -1590445671)) { if (paramByte >= 0) return; if (this.e * 1974661711 == 0) { if (paramByte >= 0) return;
/* 131 */               e();
/* 132 */               this.v = (6473770776085501813L * (l1 + 2000L));
/* 133 */               return; }
/*     */           }
/* 135 */           this.u = (Math.min(1974661711 * this.e, this.w * -1590445671) * 767174947);
/* 136 */           this.e = (this.w * -426105961);
/*     */         } else {
/* 138 */           this.t = false;
/* 139 */         }this.w = 0;
/* 140 */         this.y = ((l1 + 2000L) * 2471595332980968851L);
/*     */       }
/* 142 */       this.b = (i1 * 762186023);
/*     */     }
/*     */     catch (Exception localException1) {
/* 145 */       e();
/* 146 */       this.v = (6473770776085501813L * (l1 + 2000L));
/*     */     }
/*     */     try {
/* 149 */       if (l1 > -752082433621772767L * this.q + 500000L) { if (paramByte >= 0) throw new IllegalStateException(); l1 = this.q * -752082433621772767L; }
/* 150 */       while (l1 > this.q * -752082433621772767L + 5000L) { if (paramByte >= 0) return;
/* 151 */         z(256, 249936342);
/* 152 */         this.q += 8959876817757359585L * (256000 / (r * -1570391439)); }
/*     */     }
/*     */     catch (Exception localException2)
/*     */     {
/* 156 */       this.q = (l1 * 8959876817757359585L);
/*     */     }
/*     */   }
/*     */ 
/*     */   void an()
/*     */     throws Exception
/*     */   {
/*     */   }
/*     */ 
/*     */   public static final y al(ak paramak, Component paramComponent, int paramInt1, int paramInt2)
/*     */   {
/*  48 */     if (0 == -1570391439 * r) throw new IllegalStateException();
/*  49 */     if ((paramInt1 < 0) || (paramInt1 >= 2)) throw new IllegalArgumentException();
/*  50 */     if (paramInt2 < 256) paramInt2 = 256; try
/*     */     {
/*  52 */       ds localds = new ds();
/*  53 */       localds.j = new int[256 * (d ? 2 : 1)];
/*  54 */       localds.s = (1326811861 * paramInt2);
/*  55 */       localds.s(paramComponent);
/*  56 */       localds.i = ((1024 + (paramInt2 & 0xFFFFFC00)) * 236504113);
/*  57 */       if (localds.i * 1555305681 > 16384) localds.i = 822886400;
/*  58 */       localds.u(localds.i * 1555305681);
/*  59 */       if ((l * 2003441015 > 0) && (null == m)) {
/*  60 */         m = new f();
/*  61 */         m.r = paramak;
/*  62 */         paramak.j(m, l * 2003441015, -744487139);
/*     */       }
/*  64 */       if (m != null) {
/*  65 */         if (null != m.d[paramInt1]) throw new IllegalArgumentException();
/*  66 */         m.d[paramInt1] = localds;
/*     */       }
/*  68 */       return localds;
/*     */     }
/*     */     catch (Throwable localThrowable1) {
/*     */       try {
/*  72 */         dv localdv = new dv(paramak, paramInt1);
/*  73 */         localdv.j = new int[256 * (d ? 2 : 1)];
/*  74 */         localdv.s = (1326811861 * paramInt2);
/*  75 */         localdv.s(paramComponent);
/*  76 */         localdv.i = 822886400;
/*  77 */         localdv.u(localdv.i * 1555305681);
/*  78 */         if ((2003441015 * l > 0) && (m == null)) {
/*  79 */           m = new f();
/*  80 */           m.r = paramak;
/*  81 */           paramak.j(m, l * 2003441015, 1973915677);
/*     */         }
/*  83 */         if (m != null) {
/*  84 */           if (null != m.d[paramInt1]) throw new IllegalArgumentException();
/*  85 */           m.d[paramInt1] = localdv;
/*     */         }
/*  87 */         return localdv; } catch (Throwable localThrowable2) {
/*     */       }
/*     */     }
/*  90 */     return new y();
/*     */   }
/*     */ 
/*     */   final void af(int paramInt)
/*     */   {
/* 193 */     this.x -= 619073207 * paramInt;
/* 194 */     if (813821703 * this.x < 0) this.x = 0;
/* 195 */     if (null != this.z) this.z.i(paramInt);
/*     */   }
/*     */ 
/*     */   public static final y ay(ak paramak, Component paramComponent, int paramInt1, int paramInt2)
/*     */   {
/*  48 */     if (0 == -1570391439 * r) throw new IllegalStateException();
/*  49 */     if ((paramInt1 < 0) || (paramInt1 >= 2)) throw new IllegalArgumentException();
/*  50 */     if (paramInt2 < 256) paramInt2 = 256; try
/*     */     {
/*  52 */       ds localds = new ds();
/*  53 */       localds.j = new int[256 * (d ? 2 : 1)];
/*  54 */       localds.s = (1326811861 * paramInt2);
/*  55 */       localds.s(paramComponent);
/*  56 */       localds.i = ((1024 + (paramInt2 & 0xFFFFFC00)) * 236504113);
/*  57 */       if (localds.i * 1555305681 > 16384) localds.i = 822886400;
/*  58 */       localds.u(localds.i * 1555305681);
/*  59 */       if ((l * 2003441015 > 0) && (null == m)) {
/*  60 */         m = new f();
/*  61 */         m.r = paramak;
/*  62 */         paramak.j(m, l * 2003441015, -56411860);
/*     */       }
/*  64 */       if (m != null) {
/*  65 */         if (null != m.d[paramInt1]) throw new IllegalArgumentException();
/*  66 */         m.d[paramInt1] = localds;
/*     */       }
/*  68 */       return localds;
/*     */     }
/*     */     catch (Throwable localThrowable1) {
/*     */       try {
/*  72 */         dv localdv = new dv(paramak, paramInt1);
/*  73 */         localdv.j = new int[256 * (d ? 2 : 1)];
/*  74 */         localdv.s = (1326811861 * paramInt2);
/*  75 */         localdv.s(paramComponent);
/*  76 */         localdv.i = 822886400;
/*  77 */         localdv.u(localdv.i * 1555305681);
/*  78 */         if ((2003441015 * l > 0) && (m == null)) {
/*  79 */           m = new f();
/*  80 */           m.r = paramak;
/*  81 */           paramak.j(m, l * 2003441015, 1841417730);
/*     */         }
/*  83 */         if (m != null) {
/*  84 */           if (null != m.d[paramInt1]) throw new IllegalArgumentException();
/*  85 */           m.d[paramInt1] = localdv;
/*     */         }
/*  87 */         return localdv; } catch (Throwable localThrowable2) {
/*     */       }
/*     */     }
/*  90 */     return new y();
/*     */   }
/*     */ 
/*     */   public final synchronized void l(dx paramdx, int paramInt) {
/*  94 */     this.z = paramdx;
/*     */   }
/*     */ 
/*     */   public static final y ab(ak paramak, Component paramComponent, int paramInt1, int paramInt2)
/*     */   {
/*  48 */     if (0 == -1570391439 * r) throw new IllegalStateException();
/*  49 */     if ((paramInt1 < 0) || (paramInt1 >= 2)) throw new IllegalArgumentException();
/*  50 */     if (paramInt2 < 256) paramInt2 = 256; try
/*     */     {
/*  52 */       ds localds = new ds();
/*  53 */       localds.j = new int[256 * (d ? 2 : 1)];
/*  54 */       localds.s = (1326811861 * paramInt2);
/*  55 */       localds.s(paramComponent);
/*  56 */       localds.i = ((1024 + (paramInt2 & 0xFFFFFC00)) * 236504113);
/*  57 */       if (localds.i * 1555305681 > 16384) localds.i = 822886400;
/*  58 */       localds.u(localds.i * 1555305681);
/*  59 */       if ((l * 2003441015 > 0) && (null == m)) {
/*  60 */         m = new f();
/*  61 */         m.r = paramak;
/*  62 */         paramak.j(m, l * 2003441015, -502464440);
/*     */       }
/*  64 */       if (m != null) {
/*  65 */         if (null != m.d[paramInt1]) throw new IllegalArgumentException();
/*  66 */         m.d[paramInt1] = localds;
/*     */       }
/*  68 */       return localds;
/*     */     }
/*     */     catch (Throwable localThrowable1) {
/*     */       try {
/*  72 */         dv localdv = new dv(paramak, paramInt1);
/*  73 */         localdv.j = new int[256 * (d ? 2 : 1)];
/*  74 */         localdv.s = (1326811861 * paramInt2);
/*  75 */         localdv.s(paramComponent);
/*  76 */         localdv.i = 822886400;
/*  77 */         localdv.u(localdv.i * 1555305681);
/*  78 */         if ((2003441015 * l > 0) && (m == null)) {
/*  79 */           m = new f();
/*  80 */           m.r = paramak;
/*  81 */           paramak.j(m, l * 2003441015, 278808207);
/*     */         }
/*  83 */         if (m != null) {
/*  84 */           if (null != m.d[paramInt1]) throw new IllegalArgumentException();
/*  85 */           m.d[paramInt1] = localdv;
/*     */         }
/*  87 */         return localdv; } catch (Throwable localThrowable2) {
/*     */       }
/*     */     }
/*  90 */     return new y();
/*     */   }
/*     */ 
/*     */   public final synchronized void ao(dx paramdx) {
/*  94 */     this.z = paramdx;
/*     */   }
/*     */ 
/*     */   void a(int paramInt)
/*     */     throws Exception
/*     */   {
/*     */   }
/*     */ 
/*     */   void az()
/*     */     throws Exception
/*     */   {
/*     */   }
/*     */ 
/*     */   final void bk(dx paramdx, int paramInt)
/*     */   {
/* 287 */     int i1 = paramInt >> 5;
/* 288 */     dx localdx = this.ad[i1];
/* 289 */     if (localdx == null) this.p[i1] = paramdx; else
/* 290 */       localdx.m = paramdx;
/* 291 */     this.ad[i1] = paramdx;
/* 292 */     paramdx.c = paramInt;
/*     */   }
/*     */ 
/*     */   public final void at()
/*     */   {
/* 161 */     this.t = true; } 
/* 161 */   public final void ae() { this.t = true; }
/*     */ 
/*     */ 
/*     */   public final synchronized void j(int paramInt)
/*     */   {
/* 176 */     if (m != null) { if (paramInt > 1193251098);
/* 177 */       int i1 = 1;
/* 178 */       for (int i2 = 0; i2 < 2; i2++) { if ((paramInt <= 1193251098) || 
/* 179 */           (this == m.d[i2])) { if (paramInt <= 1193251098) return; m.d[i2] = null; }
/* 180 */         if (null != m.d[i2]) { if (paramInt <= 1193251098) throw new IllegalStateException(); i1 = 0; }
/*     */       }
/* 182 */       if (i1 != 0) { if (paramInt <= 1193251098) return;
/* 183 */         m.l = true;
/* 184 */         for (; m.m; cl.r(50L)) if (paramInt <= 1193251098) return;
/* 185 */         m = null;
/*     */       }
/*     */     }
/* 188 */     e();
/* 189 */     this.j = null;
/*     */   }
/*     */ 
/*     */   void o(int paramInt)
/*     */     throws Exception
/*     */   {
/*     */   }
/*     */ 
/*     */   final void g(int[] paramArrayOfInt, int paramInt)
/*     */   {
/* 200 */     int i1 = paramInt;
/* 201 */     if (d) i1 <<= 1;
/* 202 */     bj.q(paramArrayOfInt, 0, i1);
/* 203 */     this.x -= paramInt * 619073207;
/* 204 */     if ((this.z != null) && (813821703 * this.x <= 0)) {
/* 205 */       this.x += 619073207 * (r * -1570391439 >> 4);
/* 206 */       bw.q(this.z, 97720478);
/* 207 */       i(this.z, this.z.c(), -1124059042);
/* 208 */       int i2 = 0;
/* 209 */       int i3 = 255;
/*     */       int i7;
/*     */       Object localObject2;
/* 210 */       for (int i4 = 7; i3 != 0; i4--)
/*     */       {
/*     */         int i5;
/*     */         int i6;
/* 213 */         if (i4 < 0) {
/* 214 */           i5 = i4 & 0x3;
/* 215 */           i6 = -(i4 >> 2);
/*     */         }
/*     */         else {
/* 218 */           i5 = i4;
/* 219 */           i6 = 0;
/*     */         }
/* 221 */         i7 = i3 >>> i5 & 0x11111111;
/* 222 */         for (; 
/* 223 */           0 != i7; i7 >>>= 4)
/*     */         {
/* 226 */           if ((i7 & 0x1) != 0)
/*     */           {
/* 229 */             i3 &= (1 << i5 ^ 0xFFFFFFFF);
/* 230 */             localObject2 = null;
/* 231 */             Object localObject3 = this.p[i5];
/* 232 */             while (localObject3 != null) {
/* 233 */               do localdo = ((dx)localObject3).n;
/* 234 */               if ((null != localdo) && (localdo.m > i6)) {
/* 235 */                 i3 |= 1 << i5;
/* 236 */                 localObject2 = localObject3;
/* 237 */                 localObject3 = ((dx)localObject3).m;
/*     */               }
/*     */               else {
/* 240 */                 ((dx)localObject3).j = true;
/* 241 */                 int i8 = ((dx)localObject3).z();
/* 242 */                 i2 += i8;
/* 243 */                 if (null != localdo) localdo.m += i8;
/* 244 */                 if (i2 >= 1791530041 * this.g) break label434;
/* 245 */                 dx localdx1 = ((dx)localObject3).n();
/* 246 */                 if (null != localdx1) {
/* 247 */                   int i9 = ((dx)localObject3).c;
/* 248 */                   while (null != localdx1) {
/* 249 */                     i(localdx1, i9 * localdx1.c() >> 8, -635988080);
/* 250 */                     localdx1 = ((dx)localObject3).j();
/*     */                   }
/*     */                 }
/* 253 */                 dx localdx2 = ((dx)localObject3).m;
/* 254 */                 ((dx)localObject3).m = null;
/* 255 */                 if (null == localObject2) this.p[i5] = localdx2; else
/* 256 */                   ((dx)localObject2).m = localdx2;
/* 257 */                 if (localdx2 == null) this.ad[i5] = localObject2;
/* 258 */                 localObject3 = localdx2;
/*     */               }
/*     */             }
/*     */           }
/* 222 */           i5 += 4; i6++;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/* 262 */       label434: for (i4 = 0; i4 < 8; i4++) {
/* 263 */         Object localObject1 = this.p[i4];
/* 264 */         dx[] arrayOfdx = this.p;
/* 265 */         i7 = i4;
/* 266 */         this.ad[i4] = null;
/* 267 */         arrayOfdx[i7] = null;
/* 268 */         while (null != localObject1) {
/* 269 */           localObject2 = ((dx)localObject1).m;
/* 270 */           ((dx)localObject1).m = null;
/* 271 */           localObject1 = localObject2;
/*     */         }
/*     */       }
/*     */     }
/* 275 */     if (this.x * 813821703 < 0) this.x = 0;
/* 276 */     if (null != this.z) this.z.q(paramArrayOfInt, 0, paramInt);
/* 277 */     this.q = (cm.r(1864509520) * 8959876817757359585L);
/*     */   }
/*     */ 
/*     */   public final synchronized void aj()
/*     */   {
/* 176 */     if (m != null) {
/* 177 */       int i1 = 1;
/* 178 */       for (int i2 = 0; i2 < 2; i2++) {
/* 179 */         if (this == m.d[i2]) m.d[i2] = null;
/* 180 */         if (null != m.d[i2]) i1 = 0;
/*     */       }
/* 182 */       if (i1 != 0) {
/* 183 */         m.l = true;
/* 184 */         while (m.m) cl.r(50L);
/* 185 */         m = null;
/*     */       }
/*     */     }
/* 188 */     e();
/* 189 */     this.j = null;
/*     */   }
/*     */ 
/*     */   final void aw(int paramInt) {
/* 193 */     this.x -= 619073207 * paramInt;
/* 194 */     if (813821703 * this.x < 0) this.x = 0;
/* 195 */     if (null != this.z) this.z.i(paramInt);
/*     */   }
/*     */ 
/*     */   public final synchronized void ag(dx paramdx)
/*     */   {
/*  94 */     this.z = paramdx;
/*     */   }
/*     */ 
/*     */   final void bh(int[] paramArrayOfInt, int paramInt)
/*     */   {
/* 200 */     int i1 = paramInt;
/* 201 */     if (d) i1 <<= 1;
/* 202 */     bj.q(paramArrayOfInt, 0, i1);
/* 203 */     this.x -= paramInt * 619073207;
/* 204 */     if ((this.z != null) && (813821703 * this.x <= 0)) {
/* 205 */       this.x += 619073207 * (r * -1570391439 >> 4);
/* 206 */       bw.q(this.z, -644885775);
/* 207 */       i(this.z, this.z.c(), 1762122575);
/* 208 */       int i2 = 0;
/* 209 */       int i3 = 255;
/*     */       int i7;
/*     */       Object localObject2;
/* 210 */       for (int i4 = 7; i3 != 0; i4--)
/*     */       {
/*     */         int i5;
/*     */         int i6;
/* 213 */         if (i4 < 0) {
/* 214 */           i5 = i4 & 0x3;
/* 215 */           i6 = -(i4 >> 2);
/*     */         }
/*     */         else {
/* 218 */           i5 = i4;
/* 219 */           i6 = 0;
/*     */         }
/* 221 */         i7 = i3 >>> i5 & 0x11111111;
/* 222 */         for (; 
/* 223 */           0 != i7; i7 >>>= 4)
/*     */         {
/* 226 */           if ((i7 & 0x1) != 0)
/*     */           {
/* 229 */             i3 &= (1 << i5 ^ 0xFFFFFFFF);
/* 230 */             localObject2 = null;
/* 231 */             Object localObject3 = this.p[i5];
/* 232 */             while (localObject3 != null) {
/* 233 */               do localdo = ((dx)localObject3).n;
/* 234 */               if ((null != localdo) && (localdo.m > i6)) {
/* 235 */                 i3 |= 1 << i5;
/* 236 */                 localObject2 = localObject3;
/* 237 */                 localObject3 = ((dx)localObject3).m;
/*     */               }
/*     */               else {
/* 240 */                 ((dx)localObject3).j = true;
/* 241 */                 int i8 = ((dx)localObject3).z();
/* 242 */                 i2 += i8;
/* 243 */                 if (null != localdo) localdo.m += i8;
/* 244 */                 if (i2 >= 1791530041 * this.g) break label434;
/* 245 */                 dx localdx1 = ((dx)localObject3).n();
/* 246 */                 if (null != localdx1) {
/* 247 */                   int i9 = ((dx)localObject3).c;
/* 248 */                   while (null != localdx1) {
/* 249 */                     i(localdx1, i9 * localdx1.c() >> 8, -877140921);
/* 250 */                     localdx1 = ((dx)localObject3).j();
/*     */                   }
/*     */                 }
/* 253 */                 dx localdx2 = ((dx)localObject3).m;
/* 254 */                 ((dx)localObject3).m = null;
/* 255 */                 if (null == localObject2) this.p[i5] = localdx2; else
/* 256 */                   ((dx)localObject2).m = localdx2;
/* 257 */                 if (localdx2 == null) this.ad[i5] = localObject2;
/* 258 */                 localObject3 = localdx2;
/*     */               }
/*     */             }
/*     */           }
/* 222 */           i5 += 4; i6++;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/* 262 */       label434: for (i4 = 0; i4 < 8; i4++) {
/* 263 */         Object localObject1 = this.p[i4];
/* 264 */         dx[] arrayOfdx = this.p;
/* 265 */         i7 = i4;
/* 266 */         this.ad[i4] = null;
/* 267 */         arrayOfdx[i7] = null;
/* 268 */         while (null != localObject1) {
/* 269 */           localObject2 = ((dx)localObject1).m;
/* 270 */           ((dx)localObject1).m = null;
/* 271 */           localObject1 = localObject2;
/*     */         }
/*     */       }
/*     */     }
/* 275 */     if (this.x * 813821703 < 0) this.x = 0;
/* 276 */     if (null != this.z) this.z.q(paramArrayOfInt, 0, paramInt);
/* 277 */     this.q = (cm.r(1663480940) * 8959876817757359585L);
/*     */   }
/*     */ 
/*     */   final void bi(int[] paramArrayOfInt, int paramInt)
/*     */   {
/* 200 */     int i1 = paramInt;
/* 201 */     if (d) i1 <<= 1;
/* 202 */     bj.q(paramArrayOfInt, 0, i1);
/* 203 */     this.x -= paramInt * 619073207;
/* 204 */     if ((this.z != null) && (813821703 * this.x <= 0)) {
/* 205 */       this.x += 619073207 * (r * -1570391439 >> 4);
/* 206 */       bw.q(this.z, 2015220853);
/* 207 */       i(this.z, this.z.c(), 1692483297);
/* 208 */       int i2 = 0;
/* 209 */       int i3 = 255;
/*     */       int i7;
/*     */       Object localObject2;
/* 210 */       for (int i4 = 7; i3 != 0; i4--)
/*     */       {
/*     */         int i5;
/*     */         int i6;
/* 213 */         if (i4 < 0) {
/* 214 */           i5 = i4 & 0x3;
/* 215 */           i6 = -(i4 >> 2);
/*     */         }
/*     */         else {
/* 218 */           i5 = i4;
/* 219 */           i6 = 0;
/*     */         }
/* 221 */         i7 = i3 >>> i5 & 0x11111111;
/* 222 */         for (; 
/* 223 */           0 != i7; i7 >>>= 4)
/*     */         {
/* 226 */           if ((i7 & 0x1) != 0)
/*     */           {
/* 229 */             i3 &= (1 << i5 ^ 0xFFFFFFFF);
/* 230 */             localObject2 = null;
/* 231 */             Object localObject3 = this.p[i5];
/* 232 */             while (localObject3 != null) {
/* 233 */               do localdo = ((dx)localObject3).n;
/* 234 */               if ((null != localdo) && (localdo.m > i6)) {
/* 235 */                 i3 |= 1 << i5;
/* 236 */                 localObject2 = localObject3;
/* 237 */                 localObject3 = ((dx)localObject3).m;
/*     */               }
/*     */               else {
/* 240 */                 ((dx)localObject3).j = true;
/* 241 */                 int i8 = ((dx)localObject3).z();
/* 242 */                 i2 += i8;
/* 243 */                 if (null != localdo) localdo.m += i8;
/* 244 */                 if (i2 >= 1791530041 * this.g) break label434;
/* 245 */                 dx localdx1 = ((dx)localObject3).n();
/* 246 */                 if (null != localdx1) {
/* 247 */                   int i9 = ((dx)localObject3).c;
/* 248 */                   while (null != localdx1) {
/* 249 */                     i(localdx1, i9 * localdx1.c() >> 8, -1171694359);
/* 250 */                     localdx1 = ((dx)localObject3).j();
/*     */                   }
/*     */                 }
/* 253 */                 dx localdx2 = ((dx)localObject3).m;
/* 254 */                 ((dx)localObject3).m = null;
/* 255 */                 if (null == localObject2) this.p[i5] = localdx2; else
/* 256 */                   ((dx)localObject2).m = localdx2;
/* 257 */                 if (localdx2 == null) this.ad[i5] = localObject2;
/* 258 */                 localObject3 = localdx2;
/*     */               }
/*     */             }
/*     */           }
/* 222 */           i5 += 4; i6++;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/* 262 */       label434: for (i4 = 0; i4 < 8; i4++) {
/* 263 */         Object localObject1 = this.p[i4];
/* 264 */         dx[] arrayOfdx = this.p;
/* 265 */         i7 = i4;
/* 266 */         this.ad[i4] = null;
/* 267 */         arrayOfdx[i7] = null;
/* 268 */         while (null != localObject1) {
/* 269 */           localObject2 = ((dx)localObject1).m;
/* 270 */           ((dx)localObject1).m = null;
/* 271 */           localObject1 = localObject2;
/*     */         }
/*     */       }
/*     */     }
/* 275 */     if (this.x * 813821703 < 0) this.x = 0;
/* 276 */     if (null != this.z) this.z.q(paramArrayOfInt, 0, paramInt);
/* 277 */     this.q = (cm.r(1822178188) * 8959876817757359585L);
/*     */   }
/*     */ 
/*     */   void h(int paramInt)
/*     */     throws Exception
/*     */   {
/*     */   }
/*     */ 
/*     */   public final synchronized void ar()
/*     */   {
/*  98 */     if (null == this.j) return;
/*  99 */     long l1 = cm.r(1201117755);
/*     */     try {
/* 101 */       if (0L != this.v * -7209263431395360547L) {
/* 102 */         if (l1 < -7209263431395360547L * this.v) return;
/* 103 */         u(1555305681 * this.i);
/* 104 */         this.v = 0L;
/* 105 */         this.t = true;
/*     */       }
/* 107 */       int i1 = v();
/* 108 */       if (this.b * -1757489513 - i1 > this.w * -1590445671) this.w = (369003177 * (-1757489513 * this.b - i1));
/* 109 */       int i2 = -1308795267 * this.s + this.u * -792637813;
/* 110 */       if (256 + i2 > 16384) i2 = 16128;
/* 111 */       if (256 + i2 > 1555305681 * this.i) {
/* 112 */         this.i += 1662043136;
/* 113 */         if (this.i * 1555305681 > 16384) this.i = 822886400;
/* 114 */         e();
/* 115 */         u(this.i * 1555305681);
/* 116 */         i1 = 0;
/* 117 */         this.t = true;
/* 118 */         if (256 + i2 > this.i * 1555305681) {
/* 119 */           i2 = 1555305681 * this.i - 256;
/* 120 */           this.u = (767174947 * (i2 - this.s * -1308795267));
/*     */         }
/*     */       }
/* 123 */       while (i1 < i2) {
/* 124 */         g(this.j, 256);
/* 125 */         w();
/* 126 */         i1 += 256;
/*     */       }
/* 128 */       if (l1 > 6025691747582875803L * this.y) {
/* 129 */         if (!this.t) {
/* 130 */           if ((0 == this.w * -1590445671) && (this.e * 1974661711 == 0)) {
/* 131 */             e();
/* 132 */             this.v = (6473770776085501813L * (l1 + 2000L));
/* 133 */             return;
/*     */           }
/* 135 */           this.u = (Math.min(1974661711 * this.e, this.w * -1590445671) * 767174947);
/* 136 */           this.e = (this.w * -426105961);
/*     */         } else {
/* 138 */           this.t = false;
/* 139 */         }this.w = 0;
/* 140 */         this.y = ((l1 + 2000L) * 2471595332980968851L);
/*     */       }
/* 142 */       this.b = (i1 * 762186023);
/*     */     }
/*     */     catch (Exception localException1) {
/* 145 */       e();
/* 146 */       this.v = (6473770776085501813L * (l1 + 2000L));
/*     */     }
/*     */     try {
/* 149 */       if (l1 > -752082433621772767L * this.q + 500000L) l1 = this.q * -752082433621772767L;
/* 150 */       while (l1 > this.q * -752082433621772767L + 5000L) {
/* 151 */         z(256, -1070700853);
/* 152 */         this.q += 8959876817757359585L * (256000 / (r * -1570391439));
/*     */       }
/*     */     }
/*     */     catch (Exception localException2) {
/* 156 */       this.q = (l1 * 8959876817757359585L);
/*     */     }
/*     */   }
/*     */ 
/*     */   final void bv(dx paramdx, int paramInt)
/*     */   {
/* 287 */     int i1 = paramInt >> 5;
/* 288 */     dx localdx = this.ad[i1];
/* 289 */     if (localdx == null) this.p[i1] = paramdx; else
/* 290 */       localdx.m = paramdx;
/* 291 */     this.ad[i1] = paramdx;
/* 292 */     paramdx.c = paramInt;
/*     */   }
/*     */ 
/*     */   final void bw(dx paramdx, int paramInt)
/*     */   {
/* 287 */     int i1 = paramInt >> 5;
/* 288 */     dx localdx = this.ad[i1];
/* 289 */     if (localdx == null) this.p[i1] = paramdx; else
/* 290 */       localdx.m = paramdx;
/* 291 */     this.ad[i1] = paramdx;
/* 292 */     paramdx.c = paramInt;
/*     */   }
/*     */ 
/*     */   public static fm g(byte[] paramArrayOfByte, int paramInt)
/*     */   {
/* 192 */     if (paramArrayOfByte == null) { if (paramInt == -727365499) throw new IllegalStateException(); return null; }
/* 193 */     fm localfm = new fm(paramArrayOfByte, al.m, al.c, m.n, cl.j, al.z, bp.g);
/*     */ 
/* 195 */     al.m = null;
/* 196 */     al.c = null;
/* 197 */     m.n = null;
/* 198 */     cl.j = null;
/* 199 */     al.z = null;
/* 200 */     bp.g = (byte[][])null;
/*     */ 
/* 202 */     return localfm;
/*     */   }
/*     */ 
/*     */   static char l(char paramChar, byte paramByte)
/*     */   {
/*  61 */     if (paramChar != 'µ') { if ((paramByte < 5) && ('ƒ' != paramChar)) break label32; if (paramByte >= 5); } return paramChar;
/*  62 */     label32: return Character.toTitleCase(paramChar);
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     y
 * JD-Core Version:    0.6.2
 */