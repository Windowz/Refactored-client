/*    */ public class cg
/*    */ {
/*  4 */   public dg r = new dg();
/*    */   dg d;
/*    */ 
/*    */   public dg n()
/*    */   {
/* 53 */     dg localdg = this.r.l;
/* 54 */     if (localdg == this.r) return null;
/* 55 */     localdg.r();
/* 56 */     return localdg;
/*    */   }
/*    */ 
/*    */   public void r()
/*    */   {
/*    */     while (true)
/*    */     {
/* 14 */       dg localdg = this.r.d;
/* 15 */       if (localdg == this.r) break;
/* 16 */       localdg.r();
/*    */     }
/* 18 */     this.d = null;
/*    */   }
/*    */ 
/*    */   public void d(dg paramdg) {
/* 22 */     if (paramdg.l != null) paramdg.r();
/* 23 */     paramdg.l = this.r.l;
/* 24 */     paramdg.d = this.r;
/* 25 */     paramdg.l.d = paramdg;
/* 26 */     paramdg.d.l = paramdg;
/*    */   }
/*    */ 
/*    */   public void e(dg paramdg) {
/* 30 */     if (paramdg.l != null) paramdg.r();
/* 31 */     paramdg.l = this.r;
/* 32 */     paramdg.d = this.r.d;
/* 33 */     paramdg.l.d = paramdg;
/* 34 */     paramdg.d.l = paramdg;
/*    */   }
/*    */ 
/*    */   public static void m(dg paramdg1, dg paramdg2) {
/* 38 */     if (paramdg1.l != null) paramdg1.r();
/* 39 */     paramdg1.l = paramdg2.l;
/* 40 */     paramdg1.d = paramdg2;
/* 41 */     paramdg1.l.d = paramdg1;
/* 42 */     paramdg1.d.l = paramdg1;
/*    */   }
/*    */ 
/*    */   public dg c() {
/* 46 */     dg localdg = this.r.d;
/* 47 */     if (localdg == this.r) return null;
/* 48 */     localdg.r();
/* 49 */     return localdg;
/*    */   }
/*    */ 
/*    */   public void v(dg paramdg)
/*    */   {
/* 30 */     if (paramdg.l != null) paramdg.r();
/* 31 */     paramdg.l = this.r;
/* 32 */     paramdg.d = this.r.d;
/* 33 */     paramdg.l.d = paramdg;
/* 34 */     paramdg.d.l = paramdg;
/*    */   }
/*    */ 
/*    */   public dg j()
/*    */   {
/* 60 */     dg localdg = this.r.d;
/* 61 */     if (localdg == this.r) {
/* 62 */       this.d = null;
/* 63 */       return null;
/*    */     }
/* 65 */     this.d = localdg.d;
/* 66 */     return localdg;
/*    */   }
/*    */ 
/*    */   public dg o()
/*    */   {
/* 53 */     dg localdg = this.r.l;
/* 54 */     if (localdg == this.r) return null;
/* 55 */     localdg.r();
/* 56 */     return localdg;
/*    */   }
/*    */ 
/*    */   public dg g()
/*    */   {
/* 80 */     dg localdg = this.d;
/* 81 */     if (localdg == this.r) {
/* 82 */       this.d = null;
/* 83 */       return null;
/*    */     }
/* 85 */     this.d = localdg.d;
/* 86 */     return localdg;
/*    */   }
/*    */ 
/*    */   public dg q() {
/* 90 */     dg localdg = this.d;
/* 91 */     if (localdg == this.r) {
/* 92 */       this.d = null;
/* 93 */       return null;
/*    */     }
/* 95 */     this.d = localdg.l;
/* 96 */     return localdg;
/*    */   }
/*    */ 
/*    */   public void i()
/*    */   {
/*    */     while (true)
/*    */     {
/* 14 */       dg localdg = this.r.d;
/* 15 */       if (localdg == this.r) break;
/* 16 */       localdg.r();
/*    */     }
/* 18 */     this.d = null;
/*    */   }
/*    */ 
/*    */   public void u(dg paramdg) {
/* 22 */     if (paramdg.l != null) paramdg.r();
/* 23 */     paramdg.l = this.r.l;
/* 24 */     paramdg.d = this.r;
/* 25 */     paramdg.l.d = paramdg;
/* 26 */     paramdg.d.l = paramdg;
/*    */   }
/*    */ 
/*    */   public dg x()
/*    */   {
/* 53 */     dg localdg = this.r.l;
/* 54 */     if (localdg == this.r) return null;
/* 55 */     localdg.r();
/* 56 */     return localdg;
/*    */   }
/*    */ 
/*    */   public dg z()
/*    */   {
/* 70 */     dg localdg = this.r.l;
/* 71 */     if (localdg == this.r) {
/* 72 */       this.d = null;
/* 73 */       return null;
/*    */     }
/* 75 */     this.d = localdg.l;
/* 76 */     return localdg;
/*    */   }
/*    */ 
/*    */   public void w(dg paramdg)
/*    */   {
/* 30 */     if (paramdg.l != null) paramdg.r();
/* 31 */     paramdg.l = this.r;
/* 32 */     paramdg.d = this.r.d;
/* 33 */     paramdg.l.d = paramdg;
/* 34 */     paramdg.d.l = paramdg;
/*    */   }
/*    */ 
/*    */   public dg am()
/*    */   {
/* 90 */     dg localdg = this.d;
/* 91 */     if (localdg == this.r) {
/* 92 */       this.d = null;
/* 93 */       return null;
/*    */     }
/* 95 */     this.d = localdg.l;
/* 96 */     return localdg;
/*    */   }
/*    */ 
/*    */   public dg aa()
/*    */   {
/* 80 */     dg localdg = this.d;
/* 81 */     if (localdg == this.r) {
/* 82 */       this.d = null;
/* 83 */       return null;
/*    */     }
/* 85 */     this.d = localdg.d;
/* 86 */     return localdg;
/*    */   }
/*    */ 
/*    */   public static void y(dg paramdg1, dg paramdg2)
/*    */   {
/* 38 */     if (paramdg1.l != null) paramdg1.r();
/* 39 */     paramdg1.l = paramdg2.l;
/* 40 */     paramdg1.d = paramdg2;
/* 41 */     paramdg1.l.d = paramdg1;
/* 42 */     paramdg1.d.l = paramdg1;
/*    */   }
/*    */ 
/*    */   public dg t() {
/* 46 */     dg localdg = this.r.d;
/* 47 */     if (localdg == this.r) return null;
/* 48 */     localdg.r();
/* 49 */     return localdg;
/*    */   }
/*    */ 
/*    */   public dg f()
/*    */   {
/* 46 */     dg localdg = this.r.d;
/* 47 */     if (localdg == this.r) return null;
/* 48 */     localdg.r();
/* 49 */     return localdg;
/*    */   }
/*    */ 
/*    */   public dg k()
/*    */   {
/* 46 */     dg localdg = this.r.d;
/* 47 */     if (localdg == this.r) return null;
/* 48 */     localdg.r();
/* 49 */     return localdg;
/*    */   }
/*    */ 
/*    */   public void l(dg paramdg)
/*    */   {
/* 30 */     if (paramdg.l != null) paramdg.r();
/* 31 */     paramdg.l = this.r;
/* 32 */     paramdg.d = this.r.d;
/* 33 */     paramdg.l.d = paramdg;
/* 34 */     paramdg.d.l = paramdg;
/*    */   }
/*    */ 
/*    */   public dg a()
/*    */   {
/* 53 */     dg localdg = this.r.l;
/* 54 */     if (localdg == this.r) return null;
/* 55 */     localdg.r();
/* 56 */     return localdg;
/*    */   }
/*    */ 
/*    */   public dg h()
/*    */   {
/* 53 */     dg localdg = this.r.l;
/* 54 */     if (localdg == this.r) return null;
/* 55 */     localdg.r();
/* 56 */     return localdg;
/*    */   }
/*    */ 
/*    */   public void s()
/*    */   {
/*    */     while (true)
/*    */     {
/* 14 */       dg localdg = this.r.d;
/* 15 */       if (localdg == this.r) break;
/* 16 */       localdg.r();
/*    */     }
/* 18 */     this.d = null;
/*    */   }
/*    */ 
/*    */   public dg p()
/*    */   {
/* 60 */     dg localdg = this.r.d;
/* 61 */     if (localdg == this.r) {
/* 62 */       this.d = null;
/* 63 */       return null;
/*    */     }
/* 65 */     this.d = localdg.d;
/* 66 */     return localdg;
/*    */   }
/*    */ 
/*    */   public dg ad()
/*    */   {
/* 60 */     dg localdg = this.r.d;
/* 61 */     if (localdg == this.r) {
/* 62 */       this.d = null;
/* 63 */       return null;
/*    */     }
/* 65 */     this.d = localdg.d;
/* 66 */     return localdg;
/*    */   }
/*    */ 
/*    */   public dg ac() {
/* 70 */     dg localdg = this.r.l;
/* 71 */     if (localdg == this.r) {
/* 72 */       this.d = null;
/* 73 */       return null;
/*    */     }
/* 75 */     this.d = localdg.l;
/* 76 */     return localdg;
/*    */   }
/*    */ 
/*    */   public cg()
/*    */   {
/*  8 */     this.r.d = this.r;
/*  9 */     this.r.l = this.r;
/*    */   }
/*    */ 
/*    */   public dg as()
/*    */   {
/* 90 */     dg localdg = this.d;
/* 91 */     if (localdg == this.r) {
/* 92 */       this.d = null;
/* 93 */       return null;
/*    */     }
/* 95 */     this.d = localdg.l;
/* 96 */     return localdg;
/*    */   }
/*    */ 
/*    */   public void b(dg paramdg)
/*    */   {
/* 30 */     if (paramdg.l != null) paramdg.r();
/* 31 */     paramdg.l = this.r;
/* 32 */     paramdg.d = this.r.d;
/* 33 */     paramdg.l.d = paramdg;
/* 34 */     paramdg.d.l = paramdg;
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     cg
 * JD-Core Version:    0.6.2
 */