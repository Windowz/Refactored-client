/*    */ public class ec extends en
/*    */ {
/* 12 */   int z = 0;
/*    */ 
/* 11 */   static ce j = new ce(64);
/*    */   public int q;
/*    */   public int g;
/*    */   static ch n;
/*    */   public int i;
/*    */   public int s;
/*    */ 
/*    */   void q(int paramInt)
/*    */   {
/* 36 */     u(this.z * -1484183399, (byte)59);
/*    */   }
/*    */ 
/*    */   void i(ev paramev, int paramInt1, int paramInt2) {
/*    */     while (true) {
/* 41 */       int k = paramev.t(1118814123);
/* 42 */       if (k == 0) { if (paramInt2 < -976917846);
/* 42 */         break; }
/* 43 */       s(paramev, k, paramInt1, -2044889408);
/*    */     }
/*    */   }
/*    */ 
/*    */   void s(ev paramev, int paramInt1, int paramInt2, int paramInt3) {
/* 48 */     if (paramInt1 == 1) { if (paramInt3 >= -862254080) throw new IllegalStateException(); this.z = (paramev.a((byte)62) * -1295602775); }
/*    */   }
/*    */ 
/*    */   void u(int paramInt, byte paramByte)
/*    */   {
/* 53 */     double d1 = (paramInt >> 16 & 0xFF) / 256.0D;
/* 54 */     double d2 = (paramInt >> 8 & 0xFF) / 256.0D;
/* 55 */     double d3 = (paramInt & 0xFF) / 256.0D;
/* 56 */     double d4 = d1;
/* 57 */     if (d2 < d4) { if (paramByte > 1);
/* 57 */       d4 = d2; }
/* 58 */     if (d3 < d4) { if (paramByte <= 1) throw new IllegalStateException(); d4 = d3; }
/* 59 */     double d5 = d1;
/* 60 */     if (d2 > d5) { if (paramByte > 1);
/* 60 */       d5 = d2; }
/* 61 */     if (d3 > d5) { if (paramByte <= 1) throw new IllegalStateException(); d5 = d3; }
/* 62 */     double d6 = 0.0D;
/* 63 */     double d7 = 0.0D;
/* 64 */     double d8 = (d5 + d4) / 2.0D;
/* 65 */     if (d5 != d4) { if (paramByte <= 1) throw new IllegalStateException();
/* 66 */       if (d8 < 0.5D) { if (paramByte > 1);
/* 66 */         d7 = (d5 - d4) / (d4 + d5); }
/* 67 */       if (d8 >= 0.5D) { if (paramByte > 1);
/* 67 */         d7 = (d5 - d4) / (2.0D - d5 - d4); }
/* 68 */       if (d1 == d5) { if (paramByte <= 1) throw new IllegalStateException(); d6 = (d2 - d3) / (d5 - d4);
/* 69 */       } else if (d2 == d5) { if (paramByte > 1);
/* 69 */         d6 = (d3 - d1) / (d5 - d4) + 2.0D;
/* 70 */       } else if (d5 == d3) { if (paramByte > 1);
/* 70 */         d6 = 4.0D + (d1 - d2) / (d5 - d4); }
/*    */     }
/* 72 */     d6 /= 6.0D;
/* 73 */     this.q = ((int)(d7 * 256.0D) * 841612319);
/* 74 */     this.i = (-88866335 * (int)(d8 * 256.0D));
/* 75 */     if (this.q * 1533444063 < 0) { if (paramByte > 1);
/* 75 */       this.q = 0;
/* 76 */     } else if (this.q * 1533444063 > 255) { if (paramByte <= 1) throw new IllegalStateException(); this.q = -137223455; }
/* 77 */     if (-1345846751 * this.i < 0) { if (paramByte > 1);
/* 77 */       this.i = 0;
/* 78 */     } else if (this.i * -1345846751 > 255) { if (paramByte > 1);
/* 78 */       this.i = -1186078945; }
/* 79 */     if (d8 > 0.5D) { if (paramByte <= 1) throw new IllegalStateException(); this.s = (1584071547 * (int)(512.0D * ((1.0D - d8) * d7))); } else {
/* 80 */       this.s = ((int)(512.0D * (d8 * d7)) * 1584071547);
/* 81 */     }if (-667130957 * this.s < 1) { if (paramByte <= 1) throw new IllegalStateException(); this.s = 1584071547; }
/* 82 */     this.g = (-610119135 * (int)(this.s * -667130957 * d6));
/*    */   }
/*    */ 
/*    */   public static ec b(int paramInt)
/*    */   {
/* 25 */     ec localec = (ec)j.r(paramInt);
/* 26 */     if (null != localec) return localec;
/* 27 */     byte[] arrayOfByte = n.l(1, paramInt, 2087974912);
/* 28 */     localec = new ec();
/* 29 */     if (null != arrayOfByte) localec.i(new ev(arrayOfByte), paramInt, -1696040063);
/* 30 */     localec.q(-1779725463);
/* 31 */     j.l(localec, paramInt);
/* 32 */     return localec;
/*    */   }
/*    */ 
/*    */   public static void w(ch paramch)
/*    */   {
/* 21 */     n = paramch; } 
/* 21 */   public static void e(ch paramch) { n = paramch; }
/*    */ 
/*    */ 
/*    */   public static void p()
/*    */   {
/* 86 */     j.m();
/*    */   }
/*    */ 
/*    */   void y()
/*    */   {
/* 36 */     u(this.z * -1484183399, (byte)79);
/*    */   }
/*    */ 
/*    */   void f(ev paramev, int paramInt) {
/*    */     while (true) {
/* 41 */       int k = paramev.t(1118814123);
/* 42 */       if (k == 0) break;
/* 43 */       s(paramev, k, paramInt, -1016039194);
/*    */     }
/*    */   }
/*    */ 
/*    */   void k(ev paramev, int paramInt)
/*    */   {
/*    */     while (true)
/*    */     {
/* 41 */       int k = paramev.t(1118814123);
/* 42 */       if (k == 0) break;
/* 43 */       s(paramev, k, paramInt, -1713011662);
/*    */     }
/*    */   }
/*    */ 
/*    */   void o(ev paramev, int paramInt)
/*    */   {
/*    */     while (true)
/*    */     {
/* 41 */       int k = paramev.t(1118814123);
/* 42 */       if (k == 0) break;
/* 43 */       s(paramev, k, paramInt, -1126012400);
/*    */     }
/*    */   }
/*    */ 
/*    */   void a(ev paramev, int paramInt1, int paramInt2) {
/* 48 */     if (paramInt1 == 1) this.z = (paramev.a((byte)36) * -1295602775);
/*    */   }
/*    */ 
/*    */   void h(int paramInt)
/*    */   {
/* 53 */     double d1 = (paramInt >> 16 & 0xFF) / 256.0D;
/* 54 */     double d2 = (paramInt >> 8 & 0xFF) / 256.0D;
/* 55 */     double d3 = (paramInt & 0xFF) / 256.0D;
/* 56 */     double d4 = d1;
/* 57 */     if (d2 < d4) d4 = d2;
/* 58 */     if (d3 < d4) d4 = d3;
/* 59 */     double d5 = d1;
/* 60 */     if (d2 > d5) d5 = d2;
/* 61 */     if (d3 > d5) d5 = d3;
/* 62 */     double d6 = 0.0D;
/* 63 */     double d7 = 0.0D;
/* 64 */     double d8 = (d5 + d4) / 2.0D;
/* 65 */     if (d5 != d4) {
/* 66 */       if (d8 < 0.5D) d7 = (d5 - d4) / (d4 + d5);
/* 67 */       if (d8 >= 0.5D) d7 = (d5 - d4) / (2.0D - d5 - d4);
/* 68 */       if (d1 == d5) d6 = (d2 - d3) / (d5 - d4);
/* 69 */       else if (d2 == d5) d6 = (d3 - d1) / (d5 - d4) + 2.0D;
/* 70 */       else if (d5 == d3) d6 = 4.0D + (d1 - d2) / (d5 - d4);
/*    */     }
/* 72 */     d6 /= 6.0D;
/* 73 */     this.q = ((int)(d7 * 256.0D) * 841612319);
/* 74 */     this.i = (-88866335 * (int)(d8 * 256.0D));
/* 75 */     if (this.q * 1533444063 < 0) this.q = 0;
/* 76 */     else if (this.q * 1533444063 > 255) this.q = -137223455;
/* 77 */     if (-1345846751 * this.i < 0) this.i = 0;
/* 78 */     else if (this.i * -1345846751 > 255) this.i = -1186078945;
/* 79 */     if (d8 > 0.5D) this.s = (1584071547 * (int)(512.0D * ((1.0D - d8) * d7))); else
/* 80 */       this.s = ((int)(512.0D * (d8 * d7)) * 1584071547);
/* 81 */     if (-667130957 * this.s < 1) this.s = 1584071547;
/* 82 */     this.g = (-610119135 * (int)(this.s * -667130957 * d6));
/*    */   }
/*    */ 
/*    */   public static void x() {
/* 86 */     j.m();
/*    */   }
/*    */ 
/*    */   void t()
/*    */   {
/* 36 */     u(this.z * -1484183399, (byte)68);
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ec
 * JD-Core Version:    0.6.2
 */