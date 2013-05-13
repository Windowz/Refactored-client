/*     */ public class fd extends en
/*     */ {
/*     */   static ch n;
/*  21 */   int[] e = { -1, -1, -1, -1, -1 };
/*     */ 
/*  14 */   public static ce g = new ce(64);
/*     */   static ch j;
/*     */   int[] i;
/*     */   short[] s;
/*     */   short[] u;
/*     */   short[] v;
/*     */   short[] w;
/*  15 */   public int q = -291188483;
/*     */ 
/*  22 */   public boolean b = false;
/*     */ 
/*     */   public fw ad()
/*     */   {
/*  88 */     if (this.i == null) return null;
/*  89 */     fw[] arrayOffw = new fw[this.i.length];
/*  90 */     for (int k = 0; k < this.i.length; k++) arrayOffw[k] = fw.b(j, this.i[k], 0);
/*  92 */     fw localfw;
/*  92 */     if (arrayOffw.length == 1) localfw = arrayOffw[0]; else
/*  93 */       localfw = new fw(arrayOffw, arrayOffw.length);
/*     */     int m;
/*  94 */     if (this.s != null) {
/*  95 */       for (m = 0; m < this.s.length; m++) {
/*  96 */         localfw.aa(this.s[m], this.u[m]);
/*     */       }
/*     */     }
/*  99 */     if (this.v != null) {
/* 100 */       for (m = 0; m < this.v.length; m++) {
/* 101 */         localfw.as(this.v[m], this.w[m]);
/*     */       }
/*     */     }
/* 104 */     return localfw;
/*     */   }
/*     */ 
/*     */   public static fd t(int paramInt)
/*     */   {
/*  33 */     fd localfd = (fd)g.r(paramInt);
/*  34 */     if (localfd != null) return localfd;
/*  35 */     byte[] arrayOfByte = n.l(3, paramInt, 1076514524);
/*  36 */     localfd = new fd();
/*  37 */     if (arrayOfByte != null) localfd.q(new ev(arrayOfByte), -1926239567);
/*  38 */     g.l(localfd, paramInt);
/*  39 */     return localfd;
/*     */   }
/*     */ 
/*     */   public boolean aa()
/*     */   {
/* 108 */     boolean bool = true;
/* 109 */     for (int k = 0; k < 5; k++) {
/* 110 */       if ((this.e[k] != -1) && (!j.c(this.e[k], 0, 617883037))) bool = false;
/*     */     }
/* 112 */     return bool;
/*     */   }
/*     */ 
/*     */   public boolean s(int paramInt)
/*     */   {
/*  81 */     if (null == this.i) { if (paramInt == -81607545) throw new IllegalStateException(); return true; }
/*  82 */     boolean bool = true;
/*  83 */     for (int k = 0; k < this.i.length; k++) if ((paramInt == -81607545) || (!j.c(this.i[k], 0, -390446119))) { if (paramInt != -81607545);
/*  83 */         bool = false; }
/*  84 */     return bool;
/*     */   }
/*     */ 
/*     */   public fw av()
/*     */   {
/* 116 */     fw[] arrayOffw = new fw[5];
/* 117 */     int k = 0;
/* 118 */     for (int m = 0; m < 5; m++) {
/* 119 */       if (this.e[m] != -1) arrayOffw[(k++)] = fw.b(j, this.e[m], 0);
/*     */     }
/* 121 */     fw localfw = new fw(arrayOffw, k);
/*     */     int i1;
/* 122 */     if (null != this.s) {
/* 123 */       for (i1 = 0; i1 < this.s.length; i1++) {
/* 124 */         localfw.aa(this.s[i1], this.u[i1]);
/*     */       }
/*     */     }
/* 127 */     if (this.v != null) {
/* 128 */       for (i1 = 0; i1 < this.v.length; i1++) {
/* 129 */         localfw.as(this.v[i1], this.w[i1]);
/*     */       }
/*     */     }
/* 132 */     return localfw;
/*     */   }
/*     */ 
/*     */   public boolean v(byte paramByte)
/*     */   {
/* 108 */     boolean bool = true;
/* 109 */     for (int k = 0; k < 5; k++) { if (paramByte >= 25) throw new IllegalStateException();
/* 110 */       if (this.e[k] != -1) { if (paramByte >= 25) throw new IllegalStateException(); if (!j.c(this.e[k], 0, -545466818)) { if (paramByte < 25);
/* 110 */           bool = false; } }
/*     */     }
/* 112 */     return bool;
/*     */   }
/*     */ 
/*     */   void q(ev paramev, int paramInt)
/*     */   {
/*     */     while (true)
/*     */     {
/*  44 */       int k = paramev.t(1118814123);
/*  45 */       if (0 == k) { if (paramInt < -931909167);
/*  45 */         break; }
/*  46 */       i(paramev, k, 1666410701);
/*     */     }
/*     */   }
/*     */ 
/*     */   public fw u(short paramShort)
/*     */   {
/*  88 */     if (this.i == null) { if (paramShort >= 362) throw new IllegalStateException(); return null; }
/*  89 */     fw[] arrayOffw = new fw[this.i.length];
/*  90 */     for (int k = 0; k < this.i.length; k++) { if (paramShort >= 362) throw new IllegalStateException(); arrayOffw[k] = fw.b(j, this.i[k], 0);
/*     */     }
/*  92 */     fw localfw;
/*  92 */     if (arrayOffw.length == 1) { if (paramShort >= 362) throw new IllegalStateException(); localfw = arrayOffw[0]; } else {
/*  93 */       localfw = new fw(arrayOffw, arrayOffw.length);
/*     */     }
/*  94 */     int m;
/*  94 */     if (this.s != null) { if (paramShort < 362);
/*  95 */       for (m = 0; m < this.s.length; m++) { if (paramShort < 362);
/*  96 */         localfw.aa(this.s[m], this.u[m]);
/*     */       }
/*     */     }
/*  99 */     if (this.v != null) { if (paramShort >= 362) throw new IllegalStateException();
/* 100 */       for (m = 0; m < this.v.length; m++) { if (paramShort >= 362) throw new IllegalStateException();
/* 101 */         localfw.as(this.v[m], this.w[m]);
/*     */       }
/*     */     }
/* 104 */     return localfw;
/*     */   }
/*     */ 
/*     */   void h(ev paramev, int paramInt)
/*     */   {
/*  51 */     if (paramInt == 1) { this.q = (paramev.t(1118814123) * 291188483); }
/*     */     else
/*     */     {
/*     */       int k;
/*     */       int m;
/*  52 */       if (paramInt == 2) {
/*  53 */         k = paramev.t(1118814123);
/*  54 */         this.i = new int[k];
/*  55 */         for (m = 0; m < k; m++) this.i[m] = paramev.k(-1987080889);
/*     */       }
/*  57 */       else if (3 == paramInt) { this.b = true;
/*  58 */       } else if (40 == paramInt) {
/*  59 */         k = paramev.t(1118814123);
/*  60 */         this.s = new short[k];
/*  61 */         this.u = new short[k];
/*  62 */         for (m = 0; m < k; m++) {
/*  63 */           this.s[m] = ((short)paramev.k(-1987080889));
/*  64 */           this.u[m] = ((short)paramev.k(-1987080889));
/*     */         }
/*     */       }
/*  67 */       else if (paramInt == 41) {
/*  68 */         k = paramev.t(1118814123);
/*  69 */         this.v = new short[k];
/*  70 */         this.w = new short[k];
/*  71 */         for (m = 0; m < k; m++) {
/*  72 */           this.v[m] = ((short)paramev.k(-1987080889));
/*  73 */           this.w[m] = ((short)paramev.k(-1987080889));
/*     */         }
/*     */       }
/*  76 */       else if ((paramInt >= 60) && (paramInt < 70)) { this.e[(paramInt - 60)] = paramev.k(-1987080889); }
/*     */ 
/*     */     }
/*     */   }
/*     */ 
/*     */   public static fd b(int paramInt)
/*     */   {
/*  33 */     fd localfd = (fd)g.r(paramInt);
/*  34 */     if (localfd != null) return localfd;
/*  35 */     byte[] arrayOfByte = n.l(3, paramInt, 1881992876);
/*  36 */     localfd = new fd();
/*  37 */     if (arrayOfByte != null) localfd.q(new ev(arrayOfByte), -1285118932);
/*  38 */     g.l(localfd, paramInt);
/*  39 */     return localfd;
/*     */   }
/*     */ 
/*     */   public static fd y(int paramInt)
/*     */   {
/*  33 */     fd localfd = (fd)g.r(paramInt);
/*  34 */     if (localfd != null) return localfd;
/*  35 */     byte[] arrayOfByte = n.l(3, paramInt, 780941650);
/*  36 */     localfd = new fd();
/*  37 */     if (arrayOfByte != null) localfd.q(new ev(arrayOfByte), -1620716169);
/*  38 */     g.l(localfd, paramInt);
/*  39 */     return localfd;
/*     */   }
/*     */ 
/*     */   public boolean as()
/*     */   {
/* 108 */     boolean bool = true;
/* 109 */     for (int k = 0; k < 5; k++) {
/* 110 */       if ((this.e[k] != -1) && (!j.c(this.e[k], 0, 79641811))) bool = false;
/*     */     }
/* 112 */     return bool;
/*     */   }
/*     */ 
/*     */   void f(ev paramev)
/*     */   {
/*     */     while (true)
/*     */     {
/*  44 */       int k = paramev.t(1118814123);
/*  45 */       if (0 == k) break;
/*  46 */       i(paramev, k, 1918689711);
/*     */     }
/*     */   }
/*     */ 
/*     */   void k(ev paramev)
/*     */   {
/*     */     while (true)
/*     */     {
/*  44 */       int k = paramev.t(1118814123);
/*  45 */       if (0 == k) break;
/*  46 */       i(paramev, k, 1111824351);
/*     */     }
/*     */   }
/*     */ 
/*     */   void o(ev paramev)
/*     */   {
/*     */     while (true)
/*     */     {
/*  44 */       int k = paramev.t(1118814123);
/*  45 */       if (0 == k) break;
/*  46 */       i(paramev, k, -1872643597);
/*     */     }
/*     */   }
/*     */ 
/*     */   void a(ev paramev, int paramInt) {
/*  51 */     if (paramInt == 1) { this.q = (paramev.t(1118814123) * 291188483); }
/*     */     else
/*     */     {
/*     */       int k;
/*     */       int m;
/*  52 */       if (paramInt == 2) {
/*  53 */         k = paramev.t(1118814123);
/*  54 */         this.i = new int[k];
/*  55 */         for (m = 0; m < k; m++) this.i[m] = paramev.k(-1987080889);
/*     */       }
/*  57 */       else if (3 == paramInt) { this.b = true;
/*  58 */       } else if (40 == paramInt) {
/*  59 */         k = paramev.t(1118814123);
/*  60 */         this.s = new short[k];
/*  61 */         this.u = new short[k];
/*  62 */         for (m = 0; m < k; m++) {
/*  63 */           this.s[m] = ((short)paramev.k(-1987080889));
/*  64 */           this.u[m] = ((short)paramev.k(-1987080889));
/*     */         }
/*     */       }
/*  67 */       else if (paramInt == 41) {
/*  68 */         k = paramev.t(1118814123);
/*  69 */         this.v = new short[k];
/*  70 */         this.w = new short[k];
/*  71 */         for (m = 0; m < k; m++) {
/*  72 */           this.v[m] = ((short)paramev.k(-1987080889));
/*  73 */           this.w[m] = ((short)paramev.k(-1987080889));
/*     */         }
/*     */       }
/*  76 */       else if ((paramInt >= 60) && (paramInt < 70)) { this.e[(paramInt - 60)] = paramev.k(-1987080889); }
/*     */ 
/*     */     }
/*     */   }
/*     */ 
/*     */   public boolean ap()
/*     */   {
/* 108 */     boolean bool = true;
/* 109 */     for (int k = 0; k < 5; k++) {
/* 110 */       if ((this.e[k] != -1) && (!j.c(this.e[k], 0, -2001175342))) bool = false;
/*     */     }
/* 112 */     return bool;
/*     */   }
/*     */ 
/*     */   public boolean x()
/*     */   {
/*  81 */     if (null == this.i) return true;
/*  82 */     boolean bool = true;
/*  83 */     for (int k = 0; k < this.i.length; k++) if (!j.c(this.i[k], 0, -1517900044)) bool = false;
/*  84 */     return bool;
/*     */   }
/*     */ 
/*     */   public fw p() {
/*  88 */     if (this.i == null) return null;
/*  89 */     fw[] arrayOffw = new fw[this.i.length];
/*  90 */     for (int k = 0; k < this.i.length; k++) arrayOffw[k] = fw.b(j, this.i[k], 0);
/*  92 */     fw localfw;
/*  92 */     if (arrayOffw.length == 1) localfw = arrayOffw[0]; else
/*  93 */       localfw = new fw(arrayOffw, arrayOffw.length);
/*     */     int m;
/*  94 */     if (this.s != null) {
/*  95 */       for (m = 0; m < this.s.length; m++) {
/*  96 */         localfw.aa(this.s[m], this.u[m]);
/*     */       }
/*     */     }
/*  99 */     if (this.v != null) {
/* 100 */       for (m = 0; m < this.v.length; m++) {
/* 101 */         localfw.as(this.v[m], this.w[m]);
/*     */       }
/*     */     }
/* 104 */     return localfw;
/*     */   }
/*     */ 
/*     */   public boolean am() {
/* 108 */     boolean bool = true;
/* 109 */     for (int k = 0; k < 5; k++) {
/* 110 */       if ((this.e[k] != -1) && (!j.c(this.e[k], 0, 1859175001))) bool = false;
/*     */     }
/* 112 */     return bool;
/*     */   }
/*     */ 
/*     */   void i(ev paramev, int paramInt1, int paramInt2)
/*     */   {
/*  51 */     if (paramInt1 == 1) { if (paramInt2 == 601144597) throw new IllegalStateException(); this.q = (paramev.t(1118814123) * 291188483);
/*     */     }
/*     */     else
/*     */     {
/*  52 */       int k;
/*     */       int m;
/*  52 */       if (paramInt1 == 2) { if (paramInt2 == 601144597) throw new IllegalStateException();
/*  53 */         k = paramev.t(1118814123);
/*  54 */         this.i = new int[k];
/*  55 */         for (m = 0; m < k; m++) { if (paramInt2 == 601144597) return; this.i[m] = paramev.k(-1987080889); }
/*     */       }
/*  57 */       else if (3 == paramInt1) { if (paramInt2 == 601144597) return; this.b = true;
/*  58 */       } else if (40 == paramInt1) { if (paramInt2 == 601144597) throw new IllegalStateException();
/*  59 */         k = paramev.t(1118814123);
/*  60 */         this.s = new short[k];
/*  61 */         this.u = new short[k];
/*  62 */         for (m = 0; m < k; m++) { if (paramInt2 != 601144597);
/*  63 */           this.s[m] = ((short)paramev.k(-1987080889));
/*  64 */           this.u[m] = ((short)paramev.k(-1987080889));
/*     */         }
/*     */       }
/*  67 */       else if (paramInt1 == 41) { if (paramInt2 != 601144597);
/*  68 */         k = paramev.t(1118814123);
/*  69 */         this.v = new short[k];
/*  70 */         this.w = new short[k];
/*  71 */         for (m = 0; m < k; m++) { if (paramInt2 == 601144597) throw new IllegalStateException();
/*  72 */           this.v[m] = ((short)paramev.k(-1987080889));
/*  73 */           this.w[m] = ((short)paramev.k(-1987080889));
/*     */         }
/*     */       }
/*  76 */       else if (paramInt1 >= 60) { if (paramInt2 == 601144597) throw new IllegalStateException(); if (paramInt1 < 70) { if (paramInt2 == 601144597) return; this.e[(paramInt1 - 60)] = paramev.k(-1987080889);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public fw ac()
/*     */   {
/*  88 */     if (this.i == null) return null;
/*  89 */     fw[] arrayOffw = new fw[this.i.length];
/*  90 */     for (int k = 0; k < this.i.length; k++) arrayOffw[k] = fw.b(j, this.i[k], 0);
/*  92 */     fw localfw;
/*  92 */     if (arrayOffw.length == 1) localfw = arrayOffw[0]; else
/*  93 */       localfw = new fw(arrayOffw, arrayOffw.length);
/*     */     int m;
/*  94 */     if (this.s != null) {
/*  95 */       for (m = 0; m < this.s.length; m++) {
/*  96 */         localfw.aa(this.s[m], this.u[m]);
/*     */       }
/*     */     }
/*  99 */     if (this.v != null) {
/* 100 */       for (m = 0; m < this.v.length; m++) {
/* 101 */         localfw.as(this.v[m], this.w[m]);
/*     */       }
/*     */     }
/* 104 */     return localfw;
/*     */   }
/*     */ 
/*     */   public fw w(byte paramByte)
/*     */   {
/* 116 */     fw[] arrayOffw = new fw[5];
/* 117 */     int k = 0;
/* 118 */     for (int m = 0; m < 5; m++) if ((paramByte == 0) || 
/* 119 */         (this.e[m] != -1)) { if (paramByte == 0) throw new IllegalStateException(); arrayOffw[(k++)] = fw.b(j, this.e[m], 0);
/*     */       }
/* 121 */     fw localfw = new fw(arrayOffw, k);
/*     */     int i1;
/* 122 */     if (null != this.s) { if (paramByte != 0);
/* 123 */       for (i1 = 0; i1 < this.s.length; i1++) { if (paramByte != 0);
/* 124 */         localfw.aa(this.s[i1], this.u[i1]);
/*     */       }
/*     */     }
/* 127 */     if (this.v != null) { if (paramByte != 0);
/* 128 */       for (i1 = 0; i1 < this.v.length; i1++) { if (paramByte != 0);
/* 129 */         localfw.as(this.v[i1], this.w[i1]);
/*     */       }
/*     */     }
/* 132 */     return localfw;
/*     */   }
/*     */ 
/*     */   public static fd e(int paramInt)
/*     */   {
/*  33 */     fd localfd = (fd)g.r(paramInt);
/*  34 */     if (localfd != null) return localfd;
/*  35 */     byte[] arrayOfByte = n.l(3, paramInt, 215643412);
/*  36 */     localfd = new fd();
/*  37 */     if (arrayOfByte != null) localfd.q(new ev(arrayOfByte), -1949918930);
/*  38 */     g.l(localfd, paramInt);
/*  39 */     return localfd;
/*     */   }
/*     */ 
/*     */   public fw ak()
/*     */   {
/* 116 */     fw[] arrayOffw = new fw[5];
/* 117 */     int k = 0;
/* 118 */     for (int m = 0; m < 5; m++) {
/* 119 */       if (this.e[m] != -1) arrayOffw[(k++)] = fw.b(j, this.e[m], 0);
/*     */     }
/* 121 */     fw localfw = new fw(arrayOffw, k);
/*     */     int i1;
/* 122 */     if (null != this.s) {
/* 123 */       for (i1 = 0; i1 < this.s.length; i1++) {
/* 124 */         localfw.aa(this.s[i1], this.u[i1]);
/*     */       }
/*     */     }
/* 127 */     if (this.v != null) {
/* 128 */       for (i1 = 0; i1 < this.v.length; i1++) {
/* 129 */         localfw.as(this.v[i1], this.w[i1]);
/*     */       }
/*     */     }
/* 132 */     return localfw;
/*     */   }
/*     */ 
/*     */   public fw az()
/*     */   {
/* 116 */     fw[] arrayOffw = new fw[5];
/* 117 */     int k = 0;
/* 118 */     for (int m = 0; m < 5; m++) {
/* 119 */       if (this.e[m] != -1) arrayOffw[(k++)] = fw.b(j, this.e[m], 0);
/*     */     }
/* 121 */     fw localfw = new fw(arrayOffw, k);
/*     */     int i1;
/* 122 */     if (null != this.s) {
/* 123 */       for (i1 = 0; i1 < this.s.length; i1++) {
/* 124 */         localfw.aa(this.s[i1], this.u[i1]);
/*     */       }
/*     */     }
/* 127 */     if (this.v != null) {
/* 128 */       for (i1 = 0; i1 < this.v.length; i1++) {
/* 129 */         localfw.as(this.v[i1], this.w[i1]);
/*     */       }
/*     */     }
/* 132 */     return localfw;
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     fd
 * JD-Core Version:    0.6.2
 */