/*    */ import java.awt.Component;
/*    */ import java.awt.event.MouseWheelEvent;
/*    */ import java.awt.event.MouseWheelListener;
/*    */ 
/*    */ public class dh extends ac
/*    */   implements MouseWheelListener
/*    */ {
/*  7 */   int r = 0;
/*    */ 
/*    */   public void b(Component paramComponent)
/*    */   {
/* 16 */     paramComponent.removeMouseWheelListener(this);
/*    */   }
/*    */ 
/*    */   public void d(Component paramComponent, int paramInt)
/*    */   {
/* 12 */     paramComponent.addMouseWheelListener(this);
/*    */   }
/*    */ 
/*    */   public void l(Component paramComponent, byte paramByte) {
/* 16 */     paramComponent.removeMouseWheelListener(this);
/*    */   }
/*    */ 
/*    */   public void q(Component paramComponent)
/*    */   {
/* 12 */     paramComponent.addMouseWheelListener(this);
/*    */   }
/*    */ 
/*    */   public synchronized int m(int paramInt)
/*    */   {
/* 25 */     int i = -754696219 * this.r;
/* 26 */     this.r = 0;
/* 27 */     return i;
/*    */   }
/*    */ 
/*    */   public synchronized void mouseWheelMoved(MouseWheelEvent paramMouseWheelEvent)
/*    */   {
/* 21 */     this.r += paramMouseWheelEvent.getWheelRotation() * 1337320941;
/*    */   }
/*    */ 
/*    */   public void s(Component paramComponent)
/*    */   {
/* 16 */     paramComponent.removeMouseWheelListener(this);
/*    */   }
/*    */ 
/*    */   public void i(Component paramComponent)
/*    */   {
/* 12 */     paramComponent.addMouseWheelListener(this);
/*    */   }
/*    */ 
/*    */   public void v(Component paramComponent) {
/* 16 */     paramComponent.removeMouseWheelListener(this); } 
/* 16 */   public void w(Component paramComponent) { paramComponent.removeMouseWheelListener(this); } 
/* 16 */   public void e(Component paramComponent) { paramComponent.removeMouseWheelListener(this); } 
/* 16 */   public void u(Component paramComponent) { paramComponent.removeMouseWheelListener(this); }
/*    */ 
/*    */ 
/*    */   public synchronized int y()
/*    */   {
/* 25 */     int i = -754696219 * this.r;
/* 26 */     this.r = 0;
/* 27 */     return i;
/*    */   }
/*    */ 
/*    */   public synchronized int t()
/*    */   {
/* 25 */     int i = -754696219 * this.r;
/* 26 */     this.r = 0;
/* 27 */     return i;
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     dh
 * JD-Core Version:    0.6.2
 */