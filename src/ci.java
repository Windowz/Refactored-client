/*    */ public final class ci
/*    */ {
/*  4 */   en r = new en();
/*    */ 
/*    */   public void g(en paramen)
/*    */   {
/* 20 */     if (paramen.c != null) paramen.c();
/* 21 */     paramen.c = this.r;
/* 22 */     paramen.m = this.r.m;
/* 23 */     paramen.c.m = paramen;
/* 24 */     paramen.m.c = paramen;
/*    */   }
/*    */ 
/*    */   public void r(en paramen)
/*    */   {
/* 12 */     if (paramen.c != null) paramen.c();
/* 13 */     paramen.c = this.r.c;
/* 14 */     paramen.m = this.r;
/* 15 */     paramen.c.m = paramen;
/* 16 */     paramen.m.c = paramen;
/*    */   }
/*    */ 
/*    */   public void d(en paramen) {
/* 20 */     if (paramen.c != null) paramen.c();
/* 21 */     paramen.c = this.r;
/* 22 */     paramen.m = this.r.m;
/* 23 */     paramen.c.m = paramen;
/* 24 */     paramen.m.c = paramen;
/*    */   }
/*    */ 
/*    */   en l() {
/* 28 */     en localen = this.r.m;
/* 29 */     if (localen == this.r) return null;
/* 30 */     localen.c();
/* 31 */     return localen;
/*    */   }
/*    */ 
/*    */   public en m() {
/* 35 */     en localen = this.r.m;
/* 36 */     if (localen == this.r) {
/* 37 */       return null;
/*    */     }
/* 39 */     return localen;
/*    */   }
/*    */ 
/*    */   void c() {
/*    */     while (true) {
/* 44 */       en localen = this.r.m;
/* 45 */       if (localen == this.r) break;
/* 46 */       localen.c();
/*    */     }
/*    */   }
/*    */ 
/*    */   public void z(en paramen)
/*    */   {
/* 20 */     if (paramen.c != null) paramen.c();
/* 21 */     paramen.c = this.r;
/* 22 */     paramen.m = this.r.m;
/* 23 */     paramen.c.m = paramen;
/* 24 */     paramen.m.c = paramen;
/*    */   }
/*    */ 
/*    */   public void j(en paramen)
/*    */   {
/* 12 */     if (paramen.c != null) paramen.c();
/* 13 */     paramen.c = this.r.c;
/* 14 */     paramen.m = this.r;
/* 15 */     paramen.c.m = paramen;
/* 16 */     paramen.m.c = paramen;
/*    */   }
/*    */ 
/*    */   public void n(en paramen)
/*    */   {
/* 12 */     if (paramen.c != null) paramen.c();
/* 13 */     paramen.c = this.r.c;
/* 14 */     paramen.m = this.r;
/* 15 */     paramen.c.m = paramen;
/* 16 */     paramen.m.c = paramen;
/*    */   }
/*    */ 
/*    */   public ci()
/*    */   {
/*  7 */     this.r.m = this.r;
/*  8 */     this.r.c = this.r;
/*    */   }
/*    */ 
/*    */   en q()
/*    */   {
/* 28 */     en localen = this.r.m;
/* 29 */     if (localen == this.r) return null;
/* 30 */     localen.c();
/* 31 */     return localen;
/*    */   }
/*    */ 
/*    */   void i()
/*    */   {
/*    */     while (true)
/*    */     {
/* 44 */       en localen = this.r.m;
/* 45 */       if (localen == this.r) break;
/* 46 */       localen.c();
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ci
 * JD-Core Version:    0.6.2
 */