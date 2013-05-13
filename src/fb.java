/*     */ public class fb extends en
/*     */ {
/*     */   public int v;
/*  12 */   public int z = 0;
/*  13 */   public int g = 494066641;
/*  14 */   public boolean q = true;
/*     */   public int s;
/*     */   public int w;
/*  11 */   public static ce j = new ce(64);
/*     */   public int e;
/*     */   public int u;
/*  15 */   public int i = 850031213;
/*     */   public int b;
/*     */ 
/*     */   void o(ev paramev, int paramInt1, int paramInt2)
/*     */   {
/*  55 */     if (1 == paramInt1) this.z = (paramev.a((byte)6) * 96904487);
/*  56 */     else if (paramInt1 == 2) this.g = (paramev.t(1118814123) * -494066641);
/*  57 */     else if (paramInt1 == 5) this.q = false;
/*  58 */     else if (7 == paramInt1) this.i = (paramev.a((byte)116) * -850031213);
/*  59 */     else if (paramInt1 != 8);
/*     */   }
/*     */ 
/*     */   void g(byte paramByte)
/*     */   {
/*  37 */     if (-1 != -1328768869 * this.i) { if (paramByte == 100) return;
/*  38 */       s(this.i * -1328768869, 375921199);
/*  39 */       this.w = (this.s * -1100839661);
/*  40 */       this.e = (this.u * 150289841);
/*  41 */       this.b = (-1261299843 * this.v);
/*     */     }
/*  43 */     s(this.z * 501250711, 400039476);
/*     */   }
/*     */ 
/*     */   void a(ev paramev, int paramInt1, int paramInt2)
/*     */   {
/*  55 */     if (1 == paramInt1) this.z = (paramev.a((byte)20) * 96904487);
/*  56 */     else if (paramInt1 == 2) this.g = (paramev.t(1118814123) * -494066641);
/*  57 */     else if (paramInt1 == 5) this.q = false;
/*  58 */     else if (7 == paramInt1) this.i = (paramev.a((byte)26) * -850031213);
/*  59 */     else if (paramInt1 != 8);
/*     */   }
/*     */ 
/*     */   void i(ev paramev, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  55 */     if (1 == paramInt1) { if (paramInt3 <= 273430329) throw new IllegalStateException(); this.z = (paramev.a((byte)93) * 96904487);
/*  56 */     } else if (paramInt1 == 2) { if (paramInt3 > 273430329);
/*  56 */       this.g = (paramev.t(1118814123) * -494066641);
/*  57 */     } else if (paramInt1 == 5) { if (paramInt3 > 273430329);
/*  57 */       this.q = false;
/*  58 */     } else if (7 == paramInt1) { if (paramInt3 > 273430329);
/*  58 */       this.i = (paramev.a((byte)34) * -850031213);
/*  59 */     } else if ((paramInt1 == 8) && (paramInt3 <= 273430329));
/*     */   }
/*     */ 
/*     */   void s(int paramInt1, int paramInt2)
/*     */   {
/*  64 */     double d1 = (paramInt1 >> 16 & 0xFF) / 256.0D;
/*  65 */     double d2 = (paramInt1 >> 8 & 0xFF) / 256.0D;
/*  66 */     double d3 = (paramInt1 & 0xFF) / 256.0D;
/*  67 */     double d4 = d1;
/*  68 */     if (d2 < d4) { if (paramInt2 == -1372016439) throw new IllegalStateException(); d4 = d2; }
/*  69 */     if (d3 < d4) { if (paramInt2 == -1372016439) return; d4 = d3; }
/*  70 */     double d5 = d1;
/*  71 */     if (d2 > d5) { if (paramInt2 != -1372016439);
/*  71 */       d5 = d2; }
/*  72 */     if (d3 > d5) { if (paramInt2 != -1372016439);
/*  72 */       d5 = d3; }
/*  73 */     double d6 = 0.0D;
/*  74 */     double d7 = 0.0D;
/*  75 */     double d8 = (d5 + d4) / 2.0D;
/*  76 */     if (d4 != d5) { if ((paramInt2 == -1372016439) || 
/*  77 */         (d8 < 0.5D)) { if (paramInt2 == -1372016439) throw new IllegalStateException(); d7 = (d5 - d4) / (d5 + d4); }
/*  78 */       if (d8 >= 0.5D) { if (paramInt2 != -1372016439);
/*  78 */         d7 = (d5 - d4) / (2.0D - d5 - d4); }
/*  79 */       if (d5 == d1) { if (paramInt2 != -1372016439);
/*  79 */         d6 = (d2 - d3) / (d5 - d4);
/*  80 */       } else if (d2 == d5) { if (paramInt2 == -1372016439) throw new IllegalStateException(); d6 = 2.0D + (d3 - d1) / (d5 - d4);
/*  81 */       } else if (d3 == d5) { if (paramInt2 == -1372016439) throw new IllegalStateException(); d6 = 4.0D + (d1 - d2) / (d5 - d4); }
/*     */     }
/*  83 */     d6 /= 6.0D;
/*  84 */     this.s = (-1943901831 * (int)(256.0D * d6));
/*  85 */     this.u = ((int)(d7 * 256.0D) * 1293129155);
/*  86 */     this.v = (-606616309 * (int)(d8 * 256.0D));
/*  87 */     if (-1726086421 * this.u < 0) { if (paramInt2 == -1372016439) throw new IllegalStateException(); this.u = 0;
/*  88 */     } else if (-1726086421 * this.u > 255) { if (paramInt2 != -1372016439);
/*  88 */       this.u = -964547267; }
/*  89 */     if (this.v * -184885597 < 0) { if (paramInt2 == -1372016439) return; this.v = 0;
/*  90 */     } else if (this.v * -184885597 > 255) { if (paramInt2 == -1372016439) throw new IllegalStateException(); this.v = -68336139;
/*     */     }
/*     */   }
/*     */ 
/*     */   public static fb u(int paramInt)
/*     */   {
/*  26 */     fb localfb = (fb)j.r(paramInt);
/*  27 */     if (localfb != null) return localfb;
/*  28 */     byte[] arrayOfByte = by.n.l(4, paramInt, 2021789274);
/*  29 */     localfb = new fb();
/*  30 */     if (null != arrayOfByte) localfb.q(new ev(arrayOfByte), paramInt, (byte)29);
/*  31 */     localfb.g((byte)7);
/*  32 */     j.l(localfb, paramInt);
/*  33 */     return localfb;
/*     */   }
/*     */ 
/*     */   public static fb e(int paramInt)
/*     */   {
/*  26 */     fb localfb = (fb)j.r(paramInt);
/*  27 */     if (localfb != null) return localfb;
/*  28 */     byte[] arrayOfByte = by.n.l(4, paramInt, 1109241460);
/*  29 */     localfb = new fb();
/*  30 */     if (null != arrayOfByte) localfb.q(new ev(arrayOfByte), paramInt, (byte)-1);
/*  31 */     localfb.g((byte)-83);
/*  32 */     j.l(localfb, paramInt);
/*  33 */     return localfb;
/*     */   }
/*     */ 
/*     */   void f(ev paramev, int paramInt)
/*     */   {
/*     */     while (true)
/*     */     {
/*  48 */       int k = paramev.t(1118814123);
/*  49 */       if (0 == k) break;
/*  50 */       i(paramev, k, paramInt, 1412416852);
/*     */     }
/*     */   }
/*     */ 
/*     */   void k(ev paramev, int paramInt)
/*     */   {
/*     */     while (true)
/*     */     {
/*  48 */       int k = paramev.t(1118814123);
/*  49 */       if (0 == k) break;
/*  50 */       i(paramev, k, paramInt, 273887802);
/*     */     }
/*     */   }
/*     */ 
/*     */   void b()
/*     */   {
/*  37 */     if (-1 != -1328768869 * this.i) {
/*  38 */       s(this.i * -1328768869, 2060548136);
/*  39 */       this.w = (this.s * -1100839661);
/*  40 */       this.e = (this.u * 150289841);
/*  41 */       this.b = (-1261299843 * this.v);
/*     */     }
/*  43 */     s(this.z * 501250711, -362437927);
/*     */   }
/*     */ 
/*     */   void y()
/*     */   {
/*  37 */     if (-1 != -1328768869 * this.i) {
/*  38 */       s(this.i * -1328768869, 390775884);
/*  39 */       this.w = (this.s * -1100839661);
/*  40 */       this.e = (this.u * 150289841);
/*  41 */       this.b = (-1261299843 * this.v);
/*     */     }
/*  43 */     s(this.z * 501250711, -1972411050);
/*     */   }
/*     */ 
/*     */   void t(ev paramev, int paramInt) {
/*     */     while (true) {
/*  48 */       int k = paramev.t(1118814123);
/*  49 */       if (0 == k) break;
/*  50 */       i(paramev, k, paramInt, 2096502323);
/*     */     }
/*     */   }
/*     */ 
/*     */   public static fb w(int paramInt)
/*     */   {
/*  26 */     fb localfb = (fb)j.r(paramInt);
/*  27 */     if (localfb != null) return localfb;
/*  28 */     byte[] arrayOfByte = by.n.l(4, paramInt, 702607167);
/*  29 */     localfb = new fb();
/*  30 */     if (null != arrayOfByte) localfb.q(new ev(arrayOfByte), paramInt, (byte)6);
/*  31 */     localfb.g((byte)103);
/*  32 */     j.l(localfb, paramInt);
/*  33 */     return localfb;
/*     */   }
/*     */ 
/*     */   public static fb v(int paramInt)
/*     */   {
/*  26 */     fb localfb = (fb)j.r(paramInt);
/*  27 */     if (localfb != null) return localfb;
/*  28 */     byte[] arrayOfByte = by.n.l(4, paramInt, 1417463329);
/*  29 */     localfb = new fb();
/*  30 */     if (null != arrayOfByte) localfb.q(new ev(arrayOfByte), paramInt, (byte)-5);
/*  31 */     localfb.g((byte)-67);
/*  32 */     j.l(localfb, paramInt);
/*  33 */     return localfb;
/*     */   }
/*     */ 
/*     */   void h(int paramInt)
/*     */   {
/*  64 */     double d1 = (paramInt >> 16 & 0xFF) / 256.0D;
/*  65 */     double d2 = (paramInt >> 8 & 0xFF) / 256.0D;
/*  66 */     double d3 = (paramInt & 0xFF) / 256.0D;
/*  67 */     double d4 = d1;
/*  68 */     if (d2 < d4) d4 = d2;
/*  69 */     if (d3 < d4) d4 = d3;
/*  70 */     double d5 = d1;
/*  71 */     if (d2 > d5) d5 = d2;
/*  72 */     if (d3 > d5) d5 = d3;
/*  73 */     double d6 = 0.0D;
/*  74 */     double d7 = 0.0D;
/*  75 */     double d8 = (d5 + d4) / 2.0D;
/*  76 */     if (d4 != d5) {
/*  77 */       if (d8 < 0.5D) d7 = (d5 - d4) / (d5 + d4);
/*  78 */       if (d8 >= 0.5D) d7 = (d5 - d4) / (2.0D - d5 - d4);
/*  79 */       if (d5 == d1) d6 = (d2 - d3) / (d5 - d4);
/*  80 */       else if (d2 == d5) d6 = 2.0D + (d3 - d1) / (d5 - d4);
/*  81 */       else if (d3 == d5) d6 = 4.0D + (d1 - d2) / (d5 - d4);
/*     */     }
/*  83 */     d6 /= 6.0D;
/*  84 */     this.s = (-1943901831 * (int)(256.0D * d6));
/*  85 */     this.u = ((int)(d7 * 256.0D) * 1293129155);
/*  86 */     this.v = (-606616309 * (int)(d8 * 256.0D));
/*  87 */     if (-1726086421 * this.u < 0) this.u = 0;
/*  88 */     else if (-1726086421 * this.u > 255) this.u = -964547267;
/*  89 */     if (this.v * -184885597 < 0) this.v = 0;
/*  90 */     else if (this.v * -184885597 > 255) this.v = -68336139;
/*     */   }
/*     */ 
/*     */   void q(ev paramev, int paramInt, byte paramByte)
/*     */   {
/*     */     while (true)
/*     */     {
/*  48 */       int k = paramev.t(1118814123);
/*  49 */       if (0 == k) { if (paramByte == 48) throw new IllegalStateException(); break; }
/*  50 */       i(paramev, k, paramInt, 896938778);
/*     */     }
/*     */   }
/*     */ 
/*     */   static final int i(int paramInt1, int paramInt2, byte paramByte)
/*     */   {
/* 894 */     int k = dn.s(45365 + paramInt1, paramInt2 + 91923, 4, (byte)-112) - 128 + (dn.s(10294 + paramInt1, 37821 + paramInt2, 2, (byte)-114) - 128 >> 1) + (dn.s(paramInt1, paramInt2, 1, (byte)-119) - 128 >> 2);
/* 895 */     k = (int)(0.3D * k) + 35;
/* 896 */     if (k < 10) { if (paramByte != 0) throw new IllegalStateException(); k = 10;
/* 897 */     } else if (k > 60) { if (paramByte == 0);
/* 897 */       k = 60; }
/* 898 */     return k;
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     fb
 * JD-Core Version:    0.6.2
 */