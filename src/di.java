/*    */ import java.awt.Component;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Shape;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.awt.image.ColorModel;
/*    */ import java.awt.image.DataBufferInt;
/*    */ import java.awt.image.DirectColorModel;
/*    */ import java.awt.image.Raster;
/*    */ import java.awt.image.WritableRaster;
/*    */ import java.util.Hashtable;
/*    */ 
/*    */ public final class di extends ab
/*    */ {
/*    */   Component c;
/*    */ 
/*    */   public final void q(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 36 */     Shape localShape = paramGraphics.getClip();
/* 37 */     paramGraphics.clipRect(paramInt1, paramInt2, paramInt3, paramInt4);
/* 38 */     paramGraphics.drawImage(this.m, 0, 0, this.c);
/* 39 */     paramGraphics.setClip(localShape);
/*    */   }
/*    */ 
/*    */   public final void i(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 36 */     Shape localShape = paramGraphics.getClip();
/* 37 */     paramGraphics.clipRect(paramInt1, paramInt2, paramInt3, paramInt4);
/* 38 */     paramGraphics.drawImage(this.m, 0, 0, this.c);
/* 39 */     paramGraphics.setClip(localShape);
/*    */   }
/*    */ 
/*    */   public final void l(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 32 */     paramGraphics.drawImage(this.m, paramInt1, paramInt2, this.c);
/*    */   }
/*    */ 
/*    */   public final void m(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 36 */     Shape localShape = paramGraphics.getClip();
/* 37 */     paramGraphics.clipRect(paramInt1, paramInt2, paramInt3, paramInt4);
/* 38 */     paramGraphics.drawImage(this.m, 0, 0, this.c);
/* 39 */     paramGraphics.setClip(localShape);
/*    */   }
/*    */ 
/*    */   public final void c(int paramInt1, int paramInt2, Component paramComponent)
/*    */   {
/* 20 */     this.d = (-2139964135 * paramInt1);
/* 21 */     this.l = (1235141157 * paramInt2);
/* 22 */     this.r = new int[paramInt1 * paramInt2 + 1];
/* 23 */     DataBufferInt localDataBufferInt = new DataBufferInt(this.r, this.r.length);
/* 24 */     DirectColorModel localDirectColorModel = new DirectColorModel(32, 16711680, 65280, 255);
/* 25 */     WritableRaster localWritableRaster = Raster.createWritableRaster(localDirectColorModel.createCompatibleSampleModel(588074793 * this.d, -1153594963 * this.l), localDataBufferInt, null);
/* 26 */     this.m = new BufferedImage(localDirectColorModel, localWritableRaster, false, new Hashtable());
/* 27 */     this.c = paramComponent;
/* 28 */     d(1719991671);
/*    */   }
/*    */ 
/*    */   public final void n(int paramInt1, int paramInt2, Component paramComponent)
/*    */   {
/* 20 */     this.d = (-2139964135 * paramInt1);
/* 21 */     this.l = (1235141157 * paramInt2);
/* 22 */     this.r = new int[paramInt1 * paramInt2 + 1];
/* 23 */     DataBufferInt localDataBufferInt = new DataBufferInt(this.r, this.r.length);
/* 24 */     DirectColorModel localDirectColorModel = new DirectColorModel(32, 16711680, 65280, 255);
/* 25 */     WritableRaster localWritableRaster = Raster.createWritableRaster(localDirectColorModel.createCompatibleSampleModel(588074793 * this.d, -1153594963 * this.l), localDataBufferInt, null);
/* 26 */     this.m = new BufferedImage(localDirectColorModel, localWritableRaster, false, new Hashtable());
/* 27 */     this.c = paramComponent;
/* 28 */     d(-593489024);
/*    */   }
/*    */ 
/*    */   public final void j(int paramInt1, int paramInt2, Component paramComponent)
/*    */   {
/* 20 */     this.d = (-2139964135 * paramInt1);
/* 21 */     this.l = (1235141157 * paramInt2);
/* 22 */     this.r = new int[paramInt1 * paramInt2 + 1];
/* 23 */     DataBufferInt localDataBufferInt = new DataBufferInt(this.r, this.r.length);
/* 24 */     DirectColorModel localDirectColorModel = new DirectColorModel(32, 16711680, 65280, 255);
/* 25 */     WritableRaster localWritableRaster = Raster.createWritableRaster(localDirectColorModel.createCompatibleSampleModel(588074793 * this.d, -1153594963 * this.l), localDataBufferInt, null);
/* 26 */     this.m = new BufferedImage(localDirectColorModel, localWritableRaster, false, new Hashtable());
/* 27 */     this.c = paramComponent;
/* 28 */     d(691916143);
/*    */   }
/*    */ 
/*    */   public final void g(Graphics paramGraphics, int paramInt1, int paramInt2) {
/* 32 */     paramGraphics.drawImage(this.m, paramInt1, paramInt2, this.c); } 
/* 32 */   public final void z(Graphics paramGraphics, int paramInt1, int paramInt2) { paramGraphics.drawImage(this.m, paramInt1, paramInt2, this.c); }
/*    */ 
/*    */ 
/*    */   public final void r(int paramInt1, int paramInt2, Component paramComponent, int paramInt3)
/*    */   {
/* 20 */     this.d = (-2139964135 * paramInt1);
/* 21 */     this.l = (1235141157 * paramInt2);
/* 22 */     this.r = new int[paramInt1 * paramInt2 + 1];
/* 23 */     DataBufferInt localDataBufferInt = new DataBufferInt(this.r, this.r.length);
/* 24 */     DirectColorModel localDirectColorModel = new DirectColorModel(32, 16711680, 65280, 255);
/* 25 */     WritableRaster localWritableRaster = Raster.createWritableRaster(localDirectColorModel.createCompatibleSampleModel(588074793 * this.d, -1153594963 * this.l), localDataBufferInt, null);
/* 26 */     this.m = new BufferedImage(localDirectColorModel, localWritableRaster, false, new Hashtable());
/* 27 */     this.c = paramComponent;
/* 28 */     d(1298570685);
/*    */   }
/*    */ 
/*    */   public final void s(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 36 */     Shape localShape = paramGraphics.getClip();
/* 37 */     paramGraphics.clipRect(paramInt1, paramInt2, paramInt3, paramInt4);
/* 38 */     paramGraphics.drawImage(this.m, 0, 0, this.c);
/* 39 */     paramGraphics.setClip(localShape);
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     di
 * JD-Core Version:    0.6.2
 */