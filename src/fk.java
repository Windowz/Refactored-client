/*    */ import java.awt.Canvas;
/*    */ import java.awt.Component;
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ public final class fk extends Canvas
/*    */ {
/*    */   Component r;
/*    */ 
/*    */   public final void update(Graphics paramGraphics)
/*    */   {
/* 15 */     this.r.update(paramGraphics);
/*    */   }
/*    */ 
/*    */   public final void paint(Graphics paramGraphics) {
/* 19 */     this.r.paint(paramGraphics); } 
/* 19 */   public final void bp(Graphics paramGraphics) { this.r.paint(paramGraphics); }
/*    */ 
/*    */ 
/*    */   public final void be(Graphics paramGraphics)
/*    */   {
/* 15 */     this.r.update(paramGraphics);
/*    */   }
/*    */ 
/*    */   fk(Component paramComponent)
/*    */   {
/* 11 */     this.r = paramComponent;
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     fk
 * JD-Core Version:    0.6.2
 */