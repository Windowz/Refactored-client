/*      */ import java.awt.Component;
/*      */ import java.awt.Graphics;
/*      */ import java.awt.Image;
/*      */ import java.awt.Shape;
/*      */ import java.awt.image.ColorModel;
/*      */ import java.awt.image.DirectColorModel;
/*      */ import java.awt.image.ImageConsumer;
/*      */ import java.awt.image.ImageObserver;
/*      */ import java.awt.image.ImageProducer;
/*      */ 
/*      */ public final class dm extends ab
/*      */   implements ImageProducer, ImageObserver
/*      */ {
/*      */   ColorModel c;
/*      */   ImageConsumer n;
/*      */   static j ai;
/*      */   static int[] u;
/*      */ 
/*      */   public final void l(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   33 */     v(999282438);
/*   34 */     paramGraphics.drawImage(this.m, paramInt1, paramInt2, this);
/*      */   }
/*      */ 
/*      */   public final void r(int paramInt1, int paramInt2, Component paramComponent, int paramInt3)
/*      */   {
/*   18 */     this.d = (-2139964135 * paramInt1);
/*   19 */     this.l = (paramInt2 * 1235141157);
/*   20 */     this.r = new int[paramInt2 * paramInt1 + 1];
/*   21 */     this.c = new DirectColorModel(32, 16711680, 65280, 255);
/*   22 */     this.m = paramComponent.createImage(this);
/*   23 */     v(769250231);
/*   24 */     paramComponent.prepareImage(this.m, this);
/*   25 */     v(-1020420199);
/*   26 */     paramComponent.prepareImage(this.m, this);
/*   27 */     v(-1660217898);
/*   28 */     paramComponent.prepareImage(this.m, this);
/*   29 */     d(-1544209713);
/*      */   }
/*      */ 
/*      */   public synchronized boolean isConsumer(ImageConsumer paramImageConsumer)
/*      */   {
/*   54 */     return paramImageConsumer == this.n;
/*      */   }
/*      */ 
/*      */   public final void m(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/*   38 */     w(paramInt1, paramInt2, paramInt3, paramInt4, (byte)99);
/*   39 */     Shape localShape = paramGraphics.getClip();
/*   40 */     paramGraphics.clipRect(paramInt1, paramInt2, paramInt3, paramInt4);
/*   41 */     paramGraphics.drawImage(this.m, 0, 0, this);
/*   42 */     paramGraphics.setClip(localShape);
/*      */   }
/*      */ 
/*      */   public final void g(Graphics paramGraphics, int paramInt1, int paramInt2)
/*      */   {
/*   33 */     v(378946562);
/*   34 */     paramGraphics.drawImage(this.m, paramInt1, paramInt2, this);
/*      */   }
/*      */ 
/*      */   synchronized void v(int paramInt)
/*      */   {
/*   68 */     if (this.n == null) { if (paramInt == -158738209) throw new IllegalStateException(); return; }
/*   69 */     this.n.setPixels(0, 0, this.d * 588074793, -1153594963 * this.l, this.c, this.r, 0, this.d * 588074793);
/*   70 */     this.n.imageComplete(2);
/*      */   }
/*      */ 
/*      */   public synchronized void removeConsumer(ImageConsumer paramImageConsumer)
/*      */   {
/*   58 */     if (this.n == paramImageConsumer) this.n = null; 
/*      */   }
/*      */ 
/*      */   public void startProduction(ImageConsumer paramImageConsumer)
/*      */   {
/*   62 */     addConsumer(paramImageConsumer);
/*      */   }
/*      */ 
/*      */   public void requestTopDownLeftRightResend(ImageConsumer paramImageConsumer)
/*      */   {
/*      */   }
/*      */ 
/*      */   public final void z(Graphics paramGraphics, int paramInt1, int paramInt2)
/*      */   {
/*   33 */     v(-1695052392);
/*   34 */     paramGraphics.drawImage(this.m, paramInt1, paramInt2, this);
/*      */   }
/*      */ 
/*      */   synchronized void w(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte paramByte)
/*      */   {
/*   74 */     if (this.n == null) { if (paramByte > 1);
/*   74 */       return; }
/*   75 */     this.n.setPixels(paramInt1, paramInt2, paramInt3, paramInt4, this.c, this.r, 588074793 * this.d * paramInt2 + paramInt1, 588074793 * this.d);
/*   76 */     this.n.imageComplete(2);
/*      */   }
/*      */ 
/*      */   public boolean imageUpdate(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*   80 */     return true;
/*      */   }
/*      */ 
/*      */   public final void c(int paramInt1, int paramInt2, Component paramComponent)
/*      */   {
/*   18 */     this.d = (-2139964135 * paramInt1);
/*   19 */     this.l = (paramInt2 * 1235141157);
/*   20 */     this.r = new int[paramInt2 * paramInt1 + 1];
/*   21 */     this.c = new DirectColorModel(32, 16711680, 65280, 255);
/*   22 */     this.m = paramComponent.createImage(this);
/*   23 */     v(-1154456681);
/*   24 */     paramComponent.prepareImage(this.m, this);
/*   25 */     v(1298630306);
/*   26 */     paramComponent.prepareImage(this.m, this);
/*   27 */     v(-767216234);
/*   28 */     paramComponent.prepareImage(this.m, this);
/*   29 */     d(117144860);
/*      */   }
/*      */ 
/*      */   public final void n(int paramInt1, int paramInt2, Component paramComponent)
/*      */   {
/*   18 */     this.d = (-2139964135 * paramInt1);
/*   19 */     this.l = (paramInt2 * 1235141157);
/*   20 */     this.r = new int[paramInt2 * paramInt1 + 1];
/*   21 */     this.c = new DirectColorModel(32, 16711680, 65280, 255);
/*   22 */     this.m = paramComponent.createImage(this);
/*   23 */     v(-843757192);
/*   24 */     paramComponent.prepareImage(this.m, this);
/*   25 */     v(-1959946445);
/*   26 */     paramComponent.prepareImage(this.m, this);
/*   27 */     v(1358525886);
/*   28 */     paramComponent.prepareImage(this.m, this);
/*   29 */     d(1342065923);
/*      */   }
/*      */ 
/*      */   public final void i(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   38 */     w(paramInt1, paramInt2, paramInt3, paramInt4, (byte)77);
/*   39 */     Shape localShape = paramGraphics.getClip();
/*   40 */     paramGraphics.clipRect(paramInt1, paramInt2, paramInt3, paramInt4);
/*   41 */     paramGraphics.drawImage(this.m, 0, 0, this);
/*   42 */     paramGraphics.setClip(localShape);
/*      */   }
/*      */ 
/*      */   public synchronized void k(ImageConsumer paramImageConsumer)
/*      */   {
/*   58 */     if (this.n == paramImageConsumer) this.n = null;
/*      */   }
/*      */ 
/*      */   public final void q(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   38 */     w(paramInt1, paramInt2, paramInt3, paramInt4, (byte)85);
/*   39 */     Shape localShape = paramGraphics.getClip();
/*   40 */     paramGraphics.clipRect(paramInt1, paramInt2, paramInt3, paramInt4);
/*   41 */     paramGraphics.drawImage(this.m, 0, 0, this);
/*   42 */     paramGraphics.setClip(localShape);
/*      */   }
/*      */ 
/*      */   public synchronized boolean f(ImageConsumer paramImageConsumer)
/*      */   {
/*   54 */     return paramImageConsumer == this.n;
/*      */   }
/*      */ 
/*      */   public final void s(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   38 */     w(paramInt1, paramInt2, paramInt3, paramInt4, (byte)11);
/*   39 */     Shape localShape = paramGraphics.getClip();
/*   40 */     paramGraphics.clipRect(paramInt1, paramInt2, paramInt3, paramInt4);
/*   41 */     paramGraphics.drawImage(this.m, 0, 0, this);
/*   42 */     paramGraphics.setClip(localShape);
/*      */   }
/*      */ 
/*      */   public synchronized void e(ImageConsumer paramImageConsumer) {
/*   46 */     this.n = paramImageConsumer;
/*   47 */     paramImageConsumer.setDimensions(588074793 * this.d, this.l * -1153594963);
/*   48 */     paramImageConsumer.setProperties(null);
/*   49 */     paramImageConsumer.setColorModel(this.c);
/*   50 */     paramImageConsumer.setHints(14);
/*      */   }
/*      */ 
/*      */   public synchronized void b(ImageConsumer paramImageConsumer)
/*      */   {
/*   46 */     this.n = paramImageConsumer;
/*   47 */     paramImageConsumer.setDimensions(588074793 * this.d, this.l * -1153594963);
/*   48 */     paramImageConsumer.setProperties(null);
/*   49 */     paramImageConsumer.setColorModel(this.c);
/*   50 */     paramImageConsumer.setHints(14);
/*      */   }
/*      */ 
/*      */   public synchronized boolean y(ImageConsumer paramImageConsumer) {
/*   54 */     return paramImageConsumer == this.n; } 
/*   54 */   public synchronized boolean t(ImageConsumer paramImageConsumer) { return paramImageConsumer == this.n; }
/*      */ 
/*      */ 
/*      */   public final void j(int paramInt1, int paramInt2, Component paramComponent)
/*      */   {
/*   18 */     this.d = (-2139964135 * paramInt1);
/*   19 */     this.l = (paramInt2 * 1235141157);
/*   20 */     this.r = new int[paramInt2 * paramInt1 + 1];
/*   21 */     this.c = new DirectColorModel(32, 16711680, 65280, 255);
/*   22 */     this.m = paramComponent.createImage(this);
/*   23 */     v(450949531);
/*   24 */     paramComponent.prepareImage(this.m, this);
/*   25 */     v(-1011874208);
/*   26 */     paramComponent.prepareImage(this.m, this);
/*   27 */     v(2052880352);
/*   28 */     paramComponent.prepareImage(this.m, this);
/*   29 */     d(779688828);
/*      */   }
/*      */ 
/*      */   public void o(ImageConsumer paramImageConsumer)
/*      */   {
/*   62 */     addConsumer(paramImageConsumer);
/*      */   }
/*      */ 
/*      */   public synchronized void addConsumer(ImageConsumer paramImageConsumer)
/*      */   {
/*   46 */     this.n = paramImageConsumer;
/*   47 */     paramImageConsumer.setDimensions(588074793 * this.d, this.l * -1153594963);
/*   48 */     paramImageConsumer.setProperties(null);
/*   49 */     paramImageConsumer.setColorModel(this.c);
/*   50 */     paramImageConsumer.setHints(14);
/*      */   }
/*      */ 
/*      */   public void a(ImageConsumer paramImageConsumer)
/*      */   {
/*   62 */     addConsumer(paramImageConsumer);
/*      */   }
/*      */ 
/*      */   public void h(ImageConsumer paramImageConsumer)
/*      */   {
/*      */   }
/*      */ 
/*      */   synchronized void x(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   74 */     if (this.n == null) return;
/*   75 */     this.n.setPixels(paramInt1, paramInt2, paramInt3, paramInt4, this.c, this.r, 588074793 * this.d * paramInt2 + paramInt1, 588074793 * this.d);
/*   76 */     this.n.imageComplete(2);
/*      */   }
/*      */ 
/*      */   public boolean cx(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*   80 */     return true;
/*      */   }
/*      */ 
/*      */   static final void ed(int paramInt)
/*      */   {
/*      */     while (true)
/*      */     {
/* 6304 */       if (client.dz.gs(client.da * -1750305651, -23137732) < 27) { if (paramInt == -581242838);
/* 6304 */         break; }
/* 6305 */       int i = client.dz.gu(15, 1646077683);
/* 6306 */       if (i == 32767) { if (paramInt == -581242838);
/* 6306 */         break; }
/* 6307 */       int j = 0;
/* 6308 */       if (null == client.ci[i]) { if (paramInt != -581242838) return;
/* 6309 */         client.ci[i] = new ge();
/* 6310 */         j = 1;
/*      */       }
/* 6312 */       ge localge = client.ci[i];
/*      */       int tmp108_107 = (client.cb + 117825089); client.cb = tmp108_107; client.cf[(tmp108_107 * 348729793 - 1)] = i;
/* 6314 */       localge.bi = (270903767 * client.au);
/* 6315 */       int k = client.il[client.dz.gu(3, 969489275)];
/* 6316 */       if (j != 0) { if (paramInt != -581242838) throw new IllegalStateException(); localge.bk = ((localge.g = k * 717504357) * 1731207405); }
/* 6317 */       int m = client.dz.gu(5, 714469374);
/* 6318 */       if (m > 15) { if (paramInt == -581242838);
/* 6318 */         m -= 32; }
/* 6319 */       int i1 = client.dz.gu(1, 488590056);
/* 6320 */       if (i1 == 1) { if (paramInt == -581242838);
/*      */         int tmp244_243 = (client.ih + -1499193843); client.ih = tmp244_243; client.ic[(tmp244_243 * 1848664261 - 1)] = i; }
/* 6321 */       int i2 = client.dz.gu(1, 971275095);
/* 6322 */       localge.bu = f.g(client.dz.gu(14, 182886254), (byte)-94);
/* 6323 */       int i3 = client.dz.gu(5, 417765861);
/* 6324 */       if (i3 > 15) { if (paramInt != -581242838) return; i3 -= 32; }
/* 6325 */       localge.i = (localge.bu.s * 882250009);
/* 6326 */       localge.bg = (305632677 * localge.bu.az);
/* 6327 */       if (0 == localge.bg * 682798035) { if (paramInt != -581242838) throw new IllegalStateException(); localge.g = 0; }
/* 6328 */       localge.w = (-597325913 * localge.bu.y);
/* 6329 */       localge.e = (localge.bu.t * 546558545);
/* 6330 */       localge.b = (localge.bu.f * -1519140515);
/* 6331 */       localge.y = (2089906895 * localge.bu.k);
/* 6332 */       localge.s = (2015927983 * localge.bu.w);
/* 6333 */       localge.u = (localge.bu.e * -1329319335);
/* 6334 */       localge.v = (localge.bu.b * 396409285);
/* 6335 */       if (paramInt != -581242838) throw new IllegalStateException(); localge.b(cr.ii.bt[0] + i3, cr.ii.bw[0] + m, false, i2 == 1 ? true : (byte)-50);
/*      */     }
/* 6337 */     client.dz.gb(-1650707573);
/*      */   }
/*      */ 
/*      */   static final void dc(byte paramByte)
/*      */   {
/* 4460 */     int j;
/*      */     Object localObject;
/* 4460 */     for (int i = -1; i < 939573231 * client.ie; i++) { if (paramByte <= 4) throw new IllegalStateException();
/*      */ 
/* 4462 */       if (-1 == i) { if (paramByte > 4);
/* 4462 */         j = 2047; } else {
/* 4463 */         j = client.if[i];
/* 4464 */       }localObject = client.iq[j];
/* 4465 */       if (null != localObject) { if (paramByte <= 4) return; if (((fi)localObject).k * -2085353383 > 0) { if (paramByte <= 4) throw new IllegalStateException();
/* 4466 */           localObject.k -= -386220055;
/* 4467 */           if (0 == ((fi)localObject).k * -2085353383) { if (paramByte > 4);
/* 4467 */             ((fi)localObject).f = null; } }
/*      */       }
/*      */     }
/* 4470 */     for (i = 0; i < client.cb * 348729793; i++) { if (paramByte > 4);
/* 4471 */       j = client.cf[i];
/* 4472 */       localObject = client.ci[j];
/* 4473 */       if (localObject != null) { if (paramByte <= 4) throw new IllegalStateException(); if (-2085353383 * ((ge)localObject).k > 0) { if (paramByte <= 4) throw new IllegalStateException();
/* 4474 */           localObject.k -= -386220055;
/* 4475 */           if (0 == -2085353383 * ((ge)localObject).k) { if (paramByte <= 4) throw new IllegalStateException(); ((ge)localObject).f = null;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     dm
 * JD-Core Version:    0.6.2
 */