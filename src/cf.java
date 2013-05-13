/*    */ public final class cf
/*    */ {
/*    */   dg m;
/*    */   dg[] d;
/*    */   int r;
/*    */   dg l;
/*  8 */   int c = 0;
/*    */ 
/*    */   void s()
/*    */   {
/* 46 */     for (int i = 0; i < this.r; i++) {
/* 47 */       dg localdg1 = this.d[i];
/*    */       while (true) {
/* 49 */         dg localdg2 = localdg1.d;
/* 50 */         if (localdg2 == localdg1) break;
/* 51 */         localdg2.r();
/*    */       }
/*    */     }
/* 54 */     this.l = null;
/* 55 */     this.m = null;
/*    */   }
/*    */ 
/*    */   public dg r(long paramLong)
/*    */   {
/* 21 */     dg localdg1 = this.d[((int)(paramLong & this.r - 1))];
/* 22 */     this.l = localdg1.d;
/* 23 */     while (this.l != localdg1) {
/* 24 */       if (this.l.r == paramLong) {
/* 25 */         dg localdg2 = this.l;
/* 26 */         this.l = this.l.d;
/* 27 */         return localdg2;
/*    */       }
/* 29 */       this.l = this.l.d;
/*    */     }
/* 31 */     this.l = null;
/* 32 */     return null;
/*    */   }
/*    */ 
/*    */   public void d(dg paramdg, long paramLong) {
/* 36 */     if (paramdg.l != null) paramdg.r();
/* 37 */     dg localdg = this.d[((int)(paramLong & this.r - 1))];
/* 38 */     paramdg.l = localdg.l;
/* 39 */     paramdg.d = localdg;
/* 40 */     paramdg.l.d = paramdg;
/* 41 */     paramdg.d.l = paramdg;
/* 42 */     paramdg.r = paramLong;
/*    */   }
/*    */ 
/*    */   public dg n(long paramLong)
/*    */   {
/* 21 */     dg localdg1 = this.d[((int)(paramLong & this.r - 1))];
/* 22 */     this.l = localdg1.d;
/* 23 */     while (this.l != localdg1) {
/* 24 */       if (this.l.r == paramLong) {
/* 25 */         dg localdg2 = this.l;
/* 26 */         this.l = this.l.d;
/* 27 */         return localdg2;
/*    */       }
/* 29 */       this.l = this.l.d;
/*    */     }
/* 31 */     this.l = null;
/* 32 */     return null;
/*    */   }
/*    */ 
/*    */   public cf(int paramInt)
/*    */   {
/* 11 */     this.r = paramInt;
/* 12 */     this.d = new dg[paramInt];
/* 13 */     for (int i = 0; i < paramInt; i++) {
/* 14 */       dg localdg = this.d[i] =  = new dg();
/* 15 */       localdg.d = localdg;
/* 16 */       localdg.l = localdg;
/*    */     }
/*    */   }
/*    */ 
/*    */   public dg c()
/*    */   {
/*    */     dg localdg;
/* 64 */     if ((this.c > 0) && (this.m != this.d[(this.c - 1)])) {
/* 65 */       localdg = this.m;
/* 66 */       this.m = localdg.d;
/* 67 */       return localdg;
/*    */     }
/* 69 */     while (this.c < this.r) {
/* 70 */       localdg = this.d[(this.c++)].d;
/* 71 */       if (localdg != this.d[(this.c - 1)]) {
/* 72 */         this.m = localdg.d;
/* 73 */         return localdg;
/*    */       }
/*    */     }
/* 76 */     return null;
/*    */   }
/*    */ 
/*    */   public void g(dg paramdg, long paramLong)
/*    */   {
/* 36 */     if (paramdg.l != null) paramdg.r();
/* 37 */     dg localdg = this.d[((int)(paramLong & this.r - 1))];
/* 38 */     paramdg.l = localdg.l;
/* 39 */     paramdg.d = localdg;
/* 40 */     paramdg.l.d = paramdg;
/* 41 */     paramdg.d.l = paramdg;
/* 42 */     paramdg.r = paramLong;
/*    */   }
/*    */ 
/*    */   public dg j(long paramLong)
/*    */   {
/* 21 */     dg localdg1 = this.d[((int)(paramLong & this.r - 1))];
/* 22 */     this.l = localdg1.d;
/* 23 */     while (this.l != localdg1) {
/* 24 */       if (this.l.r == paramLong) {
/* 25 */         dg localdg2 = this.l;
/* 26 */         this.l = this.l.d;
/* 27 */         return localdg2;
/*    */       }
/* 29 */       this.l = this.l.d;
/*    */     }
/* 31 */     this.l = null;
/* 32 */     return null;
/*    */   }
/*    */ 
/*    */   void l()
/*    */   {
/* 46 */     for (int i = 0; i < this.r; i++) {
/* 47 */       dg localdg1 = this.d[i];
/*    */       while (true) {
/* 49 */         dg localdg2 = localdg1.d;
/* 50 */         if (localdg2 == localdg1) break;
/* 51 */         localdg2.r();
/*    */       }
/*    */     }
/* 54 */     this.l = null;
/* 55 */     this.m = null;
/*    */   }
/*    */ 
/*    */   public dg m() {
/* 59 */     this.c = 0;
/* 60 */     return c();
/*    */   }
/*    */ 
/*    */   public void q(dg paramdg, long paramLong)
/*    */   {
/* 36 */     if (paramdg.l != null) paramdg.r();
/* 37 */     dg localdg = this.d[((int)(paramLong & this.r - 1))];
/* 38 */     paramdg.l = localdg.l;
/* 39 */     paramdg.d = localdg;
/* 40 */     paramdg.l.d = paramdg;
/* 41 */     paramdg.d.l = paramdg;
/* 42 */     paramdg.r = paramLong;
/*    */   }
/*    */ 
/*    */   public void i(dg paramdg, long paramLong)
/*    */   {
/* 36 */     if (paramdg.l != null) paramdg.r();
/* 37 */     dg localdg = this.d[((int)(paramLong & this.r - 1))];
/* 38 */     paramdg.l = localdg.l;
/* 39 */     paramdg.d = localdg;
/* 40 */     paramdg.l.d = paramdg;
/* 41 */     paramdg.d.l = paramdg;
/* 42 */     paramdg.r = paramLong;
/*    */   }
/*    */ 
/*    */   public dg z(long paramLong)
/*    */   {
/* 21 */     dg localdg1 = this.d[((int)(paramLong & this.r - 1))];
/* 22 */     this.l = localdg1.d;
/* 23 */     while (this.l != localdg1) {
/* 24 */       if (this.l.r == paramLong) {
/* 25 */         dg localdg2 = this.l;
/* 26 */         this.l = this.l.d;
/* 27 */         return localdg2;
/*    */       }
/* 29 */       this.l = this.l.d;
/*    */     }
/* 31 */     this.l = null;
/* 32 */     return null;
/*    */   }
/*    */ 
/*    */   public dg u()
/*    */   {
/* 59 */     this.c = 0;
/* 60 */     return c();
/*    */   }
/*    */ 
/*    */   public dg v()
/*    */   {
/* 59 */     this.c = 0;
/* 60 */     return c();
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     cf
 * JD-Core Version:    0.6.2
 */