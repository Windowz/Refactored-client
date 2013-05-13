/*    */ public class dg
/*    */ {
/*    */   dg l;
/*    */   public dg d;
/*    */   public long r;
/*    */ 
/*    */   public boolean l()
/*    */   {
/* 19 */     if (this.l == null) return false;
/* 20 */     return true;
/*    */   }
/*    */ 
/*    */   public void r()
/*    */   {
/* 11 */     if (this.l == null) return;
/* 12 */     this.l.d = this.d;
/* 13 */     this.d.l = this.l;
/* 14 */     this.d = null;
/* 15 */     this.l = null;
/*    */   }
/*    */ 
/*    */   public boolean d() {
/* 19 */     if (this.l == null) return false;
/* 20 */     return true;
/*    */   }
/*    */ 
/*    */   public boolean m()
/*    */   {
/* 19 */     if (this.l == null) return false;
/* 20 */     return true;
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     dg
 * JD-Core Version:    0.6.2
 */