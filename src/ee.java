/*     */ public class ee extends dx
/*     */ {
/*  12 */   int i = -1;
/*     */ 
/*  10 */   cg g = new cg();
/*  11 */   int q = 0;
/*     */ 
/*   9 */   cg z = new cg();
/*     */ 
/*     */   public final synchronized void q(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/*     */     while (true)
/*     */     {
/*  60 */       if (this.i < 0) {
/*  61 */         am(paramArrayOfInt, paramInt1, paramInt2);
/*  62 */         return;
/*     */       }
/*  64 */       if (this.q + paramInt2 < this.i) {
/*  65 */         this.q += paramInt2;
/*  66 */         am(paramArrayOfInt, paramInt1, paramInt2);
/*  67 */         return;
/*     */       }
/*  69 */       int j = this.i - this.q;
/*  70 */       am(paramArrayOfInt, paramInt1, j);
/*  71 */       paramInt1 += j;
/*  72 */       paramInt2 -= j;
/*  73 */       this.q += j;
/*  74 */       ac();
/*  75 */       eb localeb1 = (eb)this.g.j();
/*  76 */       synchronized (localeb1) {
/*  77 */         int k = localeb1.n(this);
/*  78 */         if (k < 0) {
/*  79 */           localeb1.m = 0;
/*  80 */           as(localeb1);
/*     */         }
/*     */         else {
/*  83 */           localeb1.m = k;
/*  84 */           aa(localeb1.d, localeb1);
/*     */         }
/*     */       }
/*  87 */       if (paramInt2 == 0) return;
/*     */     }
/*     */   }
/*     */ 
/*     */   public final synchronized void p(dx paramdx)
/*     */   {
/*  15 */     this.z.l(paramdx);
/*     */   }
/*     */ 
/*     */   public final synchronized void ad(dx paramdx) {
/*  19 */     paramdx.r();
/*     */   }
/*     */ 
/*     */   void ac() {
/*  23 */     if (this.q > 0) {
/*  24 */       for (eb localeb = (eb)this.g.j(); localeb != null; localeb = (eb)this.g.g()) {
/*  25 */         localeb.m -= this.q;
/*     */       }
/*  27 */       this.i -= this.q;
/*  28 */       this.q = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   void aa(dg paramdg, eb parameb) {
/*  33 */     while ((paramdg != this.g.r) && (((eb)paramdg).m <= parameb.m)) paramdg = paramdg.d;
/*  34 */     cg.m(parameb, paramdg);
/*  35 */     this.i = ((eb)this.g.r.d).m;
/*     */   }
/*     */ 
/*     */   void as(eb parameb) {
/*  39 */     parameb.r();
/*  40 */     parameb.c();
/*  41 */     dg localdg = this.g.r.d;
/*  42 */     if (localdg == this.g.r) this.i = -1; else
/*  43 */       this.i = ((eb)localdg).m;
/*     */   }
/*     */ 
/*     */   dx n() {
/*  47 */     return (dx)this.z.j();
/*     */   }
/*     */ 
/*     */   int z()
/*     */   {
/*  55 */     return 0;
/*     */   }
/*     */ 
/*     */   dx y()
/*     */   {
/*  51 */     return (dx)this.z.g();
/*     */   }
/*     */ 
/*     */   void ag(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/*  92 */     for (dx localdx = (dx)this.z.j(); localdx != null; localdx = (dx)this.z.g())
/*  93 */       localdx.g(paramArrayOfInt, paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */   public final synchronized void i(int paramInt)
/*     */   {
/*     */     while (true) {
/*  99 */       if (this.i < 0) {
/* 100 */         ap(paramInt);
/* 101 */         return;
/*     */       }
/* 103 */       if (this.q + paramInt < this.i) {
/* 104 */         this.q += paramInt;
/* 105 */         ap(paramInt);
/* 106 */         return;
/*     */       }
/* 108 */       int j = this.i - this.q;
/* 109 */       ap(j);
/* 110 */       paramInt -= j;
/* 111 */       this.q += j;
/* 112 */       ac();
/* 113 */       eb localeb1 = (eb)this.g.j();
/* 114 */       synchronized (localeb1) {
/* 115 */         int k = localeb1.n(this);
/* 116 */         if (k < 0) {
/* 117 */           localeb1.m = 0;
/* 118 */           as(localeb1);
/*     */         }
/*     */         else {
/* 121 */           localeb1.m = k;
/* 122 */           aa(localeb1.d, localeb1);
/*     */         }
/*     */       }
/* 125 */       if (paramInt == 0) return; 
/*     */     }
/*     */   }
/*     */ 
/*     */   void ap(int paramInt)
/*     */   {
/* 130 */     for (dx localdx = (dx)this.z.j(); localdx != null; localdx = (dx)this.z.g())
/* 131 */       localdx.i(paramInt);
/*     */   }
/*     */ 
/*     */   dx v()
/*     */   {
/*  47 */     return (dx)this.z.j(); } 
/*  47 */   dx w() { return (dx)this.z.j(); }
/*     */ 
/*     */ 
/*     */   void am(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/*  92 */     for (dx localdx = (dx)this.z.j(); localdx != null; localdx = (dx)this.z.g())
/*  93 */       localdx.g(paramArrayOfInt, paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */   dx b()
/*     */   {
/*  51 */     return (dx)this.z.g();
/*     */   }
/*     */ 
/*     */   public final synchronized void o(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/*     */     while (true)
/*     */     {
/*  60 */       if (this.i < 0) {
/*  61 */         am(paramArrayOfInt, paramInt1, paramInt2);
/*  62 */         return;
/*     */       }
/*  64 */       if (this.q + paramInt2 < this.i) {
/*  65 */         this.q += paramInt2;
/*  66 */         am(paramArrayOfInt, paramInt1, paramInt2);
/*  67 */         return;
/*     */       }
/*  69 */       int j = this.i - this.q;
/*  70 */       am(paramArrayOfInt, paramInt1, j);
/*  71 */       paramInt1 += j;
/*  72 */       paramInt2 -= j;
/*  73 */       this.q += j;
/*  74 */       ac();
/*  75 */       eb localeb1 = (eb)this.g.j();
/*  76 */       synchronized (localeb1) {
/*  77 */         int k = localeb1.n(this);
/*  78 */         if (k < 0) {
/*  79 */           localeb1.m = 0;
/*  80 */           as(localeb1);
/*     */         }
/*     */         else {
/*  83 */           localeb1.m = k;
/*  84 */           aa(localeb1.d, localeb1);
/*     */         }
/*     */       }
/*  87 */       if (paramInt2 == 0) return;
/*     */     }
/*     */   }
/*     */ 
/*     */   int t()
/*     */   {
/*  55 */     return 0;
/*     */   }
/*     */ 
/*     */   public final synchronized void f(int[] paramArrayOfInt, int paramInt1, int paramInt2) {
/*     */     while (true) {
/*  60 */       if (this.i < 0) {
/*  61 */         am(paramArrayOfInt, paramInt1, paramInt2);
/*  62 */         return;
/*     */       }
/*  64 */       if (this.q + paramInt2 < this.i) {
/*  65 */         this.q += paramInt2;
/*  66 */         am(paramArrayOfInt, paramInt1, paramInt2);
/*  67 */         return;
/*     */       }
/*  69 */       int j = this.i - this.q;
/*  70 */       am(paramArrayOfInt, paramInt1, j);
/*  71 */       paramInt1 += j;
/*  72 */       paramInt2 -= j;
/*  73 */       this.q += j;
/*  74 */       ac();
/*  75 */       eb localeb1 = (eb)this.g.j();
/*  76 */       synchronized (localeb1) {
/*  77 */         int k = localeb1.n(this);
/*  78 */         if (k < 0) {
/*  79 */           localeb1.m = 0;
/*  80 */           as(localeb1);
/*     */         }
/*     */         else {
/*  83 */           localeb1.m = k;
/*  84 */           aa(localeb1.d, localeb1);
/*     */         }
/*     */       }
/*  87 */       if (paramInt2 == 0) return;
/*     */     }
/*     */   }
/*     */ 
/*     */   public final synchronized void k(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/*     */     while (true)
/*     */     {
/*  60 */       if (this.i < 0) {
/*  61 */         am(paramArrayOfInt, paramInt1, paramInt2);
/*  62 */         return;
/*     */       }
/*  64 */       if (this.q + paramInt2 < this.i) {
/*  65 */         this.q += paramInt2;
/*  66 */         am(paramArrayOfInt, paramInt1, paramInt2);
/*  67 */         return;
/*     */       }
/*  69 */       int j = this.i - this.q;
/*  70 */       am(paramArrayOfInt, paramInt1, j);
/*  71 */       paramInt1 += j;
/*  72 */       paramInt2 -= j;
/*  73 */       this.q += j;
/*  74 */       ac();
/*  75 */       eb localeb1 = (eb)this.g.j();
/*  76 */       synchronized (localeb1) {
/*  77 */         int k = localeb1.n(this);
/*  78 */         if (k < 0) {
/*  79 */           localeb1.m = 0;
/*  80 */           as(localeb1);
/*     */         }
/*     */         else {
/*  83 */           localeb1.m = k;
/*  84 */           aa(localeb1.d, localeb1);
/*     */         }
/*     */       }
/*  87 */       if (paramInt2 == 0) return;
/*     */     }
/*     */   }
/*     */ 
/*     */   dx e()
/*     */   {
/*  47 */     return (dx)this.z.j();
/*     */   }
/*     */ 
/*     */   public final synchronized void a(int paramInt)
/*     */   {
/*     */     while (true)
/*     */     {
/*  99 */       if (this.i < 0) {
/* 100 */         ap(paramInt);
/* 101 */         return;
/*     */       }
/* 103 */       if (this.q + paramInt < this.i) {
/* 104 */         this.q += paramInt;
/* 105 */         ap(paramInt);
/* 106 */         return;
/*     */       }
/* 108 */       int j = this.i - this.q;
/* 109 */       ap(j);
/* 110 */       paramInt -= j;
/* 111 */       this.q += j;
/* 112 */       ac();
/* 113 */       eb localeb1 = (eb)this.g.j();
/* 114 */       synchronized (localeb1) {
/* 115 */         int k = localeb1.n(this);
/* 116 */         if (k < 0) {
/* 117 */           localeb1.m = 0;
/* 118 */           as(localeb1);
/*     */         }
/*     */         else {
/* 121 */           localeb1.m = k;
/* 122 */           aa(localeb1.d, localeb1);
/*     */         }
/*     */       }
/* 125 */       if (paramInt == 0) return;
/*     */     }
/*     */   }
/*     */ 
/*     */   public final synchronized void h(int paramInt)
/*     */   {
/*     */     while (true)
/*     */     {
/*  99 */       if (this.i < 0) {
/* 100 */         ap(paramInt);
/* 101 */         return;
/*     */       }
/* 103 */       if (this.q + paramInt < this.i) {
/* 104 */         this.q += paramInt;
/* 105 */         ap(paramInt);
/* 106 */         return;
/*     */       }
/* 108 */       int j = this.i - this.q;
/* 109 */       ap(j);
/* 110 */       paramInt -= j;
/* 111 */       this.q += j;
/* 112 */       ac();
/* 113 */       eb localeb1 = (eb)this.g.j();
/* 114 */       synchronized (localeb1) {
/* 115 */         int k = localeb1.n(this);
/* 116 */         if (k < 0) {
/* 117 */           localeb1.m = 0;
/* 118 */           as(localeb1);
/*     */         }
/*     */         else {
/* 121 */           localeb1.m = k;
/* 122 */           aa(localeb1.d, localeb1);
/*     */         }
/*     */       }
/* 125 */       if (paramInt == 0) return;
/*     */     }
/*     */   }
/*     */ 
/*     */   public final synchronized void av(dx paramdx)
/*     */   {
/*  15 */     this.z.l(paramdx);
/*     */   }
/*     */ 
/*     */   public final synchronized void ak(dx paramdx) {
/*  19 */     paramdx.r(); } 
/*  19 */   public final synchronized void az(dx paramdx) { paramdx.r(); }
/*     */ 
/*     */   void an()
/*     */   {
/*  23 */     if (this.q > 0) {
/*  24 */       for (eb localeb = (eb)this.g.j(); localeb != null; localeb = (eb)this.g.g()) {
/*  25 */         localeb.m -= this.q;
/*     */       }
/*  27 */       this.i -= this.q;
/*  28 */       this.q = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   void ah(dg paramdg, eb parameb) {
/*  33 */     while ((paramdg != this.g.r) && (((eb)paramdg).m <= parameb.m)) paramdg = paramdg.d;
/*  34 */     cg.m(parameb, paramdg);
/*  35 */     this.i = ((eb)this.g.r.d).m;
/*     */   }
/*     */ 
/*     */   void ab(eb parameb) {
/*  39 */     parameb.r();
/*  40 */     parameb.c();
/*  41 */     dg localdg = this.g.r.d;
/*  42 */     if (localdg == this.g.r) this.i = -1; else
/*  43 */       this.i = ((eb)localdg).m;
/*     */   }
/*     */ 
/*     */   void al(dg paramdg, eb parameb)
/*     */   {
/*  33 */     while ((paramdg != this.g.r) && (((eb)paramdg).m <= parameb.m)) paramdg = paramdg.d;
/*  34 */     cg.m(parameb, paramdg);
/*  35 */     this.i = ((eb)this.g.r.d).m;
/*     */   }
/*     */ 
/*     */   void ay(dg paramdg, eb parameb)
/*     */   {
/*  33 */     while ((paramdg != this.g.r) && (((eb)paramdg).m <= parameb.m)) paramdg = paramdg.d;
/*  34 */     cg.m(parameb, paramdg);
/*  35 */     this.i = ((eb)this.g.r.d).m;
/*     */   }
/*     */ 
/*     */   void ar(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/*  92 */     for (dx localdx = (dx)this.z.j(); localdx != null; localdx = (dx)this.z.g())
/*  93 */       localdx.g(paramArrayOfInt, paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */   void aq(int paramInt)
/*     */   {
/* 130 */     for (dx localdx = (dx)this.z.j(); localdx != null; localdx = (dx)this.z.g())
/* 131 */       localdx.i(paramInt);
/*     */   }
/*     */ 
/*     */   void ao(eb parameb)
/*     */   {
/*  39 */     parameb.r();
/*  40 */     parameb.c();
/*  41 */     dg localdg = this.g.r.d;
/*  42 */     if (localdg == this.g.r) this.i = -1; else
/*  43 */       this.i = ((eb)localdg).m;
/*     */   }
/*     */ 
/*     */   dx j()
/*     */   {
/*  51 */     return (dx)this.z.g();
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ee
 * JD-Core Version:    0.6.2
 */