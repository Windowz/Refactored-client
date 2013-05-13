/*    */ public class fe extends en
/*    */ {
/*    */   public int[] u;
/*    */   public static ch n;
/*    */   public int z;
/*    */   public char g;
/* 11 */   static ce j = new ce(64);
/*    */   public int i;
/* 16 */   public int s = 0;
/*    */ 
/* 14 */   public String q = "null";
/*    */   public int[] v;
/*    */   public String[] w;
/*    */ 
/*    */   void v(ev paramev)
/*    */   {
/*    */     while (true)
/*    */     {
/* 35 */       int k = paramev.t(1118814123);
/* 36 */       if (0 == k) break;
/* 37 */       q(paramev, k, (byte)-51);
/*    */     }
/*    */   }
/*    */ 
/*    */   void g(ev paramev, int paramInt)
/*    */   {
/*    */     while (true)
/*    */     {
/* 35 */       int k = paramev.t(1118814123);
/* 36 */       if (0 == k) { if (paramInt >= 2093910283) throw new IllegalStateException(); break; }
/* 37 */       q(paramev, k, (byte)-70);
/*    */     }
/*    */   }
/*    */ 
/*    */   void s(ev paramev)
/*    */   {
/*    */     while (true)
/*    */     {
/* 35 */       int k = paramev.t(1118814123);
/* 36 */       if (0 == k) break;
/* 37 */       q(paramev, k, (byte)-84);
/*    */     }
/*    */   }
/*    */ 
/*    */   void w(ev paramev)
/*    */   {
/*    */     while (true)
/*    */     {
/* 35 */       int k = paramev.t(1118814123);
/* 36 */       if (0 == k) break;
/* 37 */       q(paramev, k, (byte)-91);
/*    */     }
/*    */   }
/*    */ 
/*    */   void q(ev paramev, int paramInt, byte paramByte) {
/* 42 */     if (1 == paramInt) { if (paramByte < 2);
/* 42 */       this.z = (paramev.t(1118814123) * -283455839);
/* 43 */     } else if (paramInt == 2) { if (paramByte < 2);
/* 43 */       this.g = ((char)paramev.t(1118814123));
/* 44 */     } else if (paramInt == 3) { if (paramByte < 2);
/* 44 */       this.q = paramev.ad(1157077432);
/* 45 */     } else if (paramInt == 4) { if (paramByte < 2);
/* 45 */       this.i = (paramev.h(-2146702356) * -213793725);
/*    */     }
/*    */     else
/*    */     {
/* 46 */       int k;
/* 46 */       if (5 == paramInt) { if (paramByte >= 2) return;
/* 47 */         this.s = (paramev.k(-1987080889) * -1405545553);
/* 48 */         this.u = new int[this.s * 1089348431];
/* 49 */         this.w = new String[this.s * 1089348431];
/* 50 */         for (k = 0; k < 1089348431 * this.s; k++) { if (paramByte < 2);
/* 51 */           this.u[k] = paramev.h(-1469894189);
/* 52 */           this.w[k] = paramev.ad(632420362);
/*    */         }
/*    */       }
/* 55 */       else if (6 == paramInt) { if (paramByte >= 2) throw new IllegalStateException();
/* 56 */         this.s = (paramev.k(-1987080889) * -1405545553);
/* 57 */         this.u = new int[1089348431 * this.s];
/* 58 */         this.v = new int[this.s * 1089348431];
/* 59 */         for (k = 0; k < 1089348431 * this.s; k++) { if (paramByte >= 2) throw new IllegalStateException();
/* 60 */           this.u[k] = paramev.h(265162002);
/* 61 */           this.v[k] = paramev.h(1347184407);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   public static fe i(int paramInt)
/*    */   {
/* 24 */     fe localfe = (fe)j.r(paramInt);
/* 25 */     if (localfe != null) return localfe;
/* 26 */     byte[] arrayOfByte = n.l(8, paramInt, 405627208);
/* 27 */     localfe = new fe();
/* 28 */     if (arrayOfByte != null) localfe.g(new ev(arrayOfByte), -1338055439);
/* 29 */     j.l(localfe, paramInt);
/* 30 */     return localfe;
/*    */   }
/*    */ 
/*    */   void u(ev paramev) {
/*    */     while (true) {
/* 35 */       int k = paramev.t(1118814123);
/* 36 */       if (0 == k) break;
/* 37 */       q(paramev, k, (byte)-86);
/*    */     }
/*    */   }
/*    */ 
/*    */   void e(ev paramev, int paramInt) {
/* 42 */     if (1 == paramInt) { this.z = (paramev.t(1118814123) * -283455839);
/* 43 */     } else if (paramInt == 2) { this.g = ((char)paramev.t(1118814123));
/* 44 */     } else if (paramInt == 3) { this.q = paramev.ad(-923702347);
/* 45 */     } else if (paramInt == 4) { this.i = (paramev.h(-1287448392) * -213793725); }
/*    */     else
/*    */     {
/*    */       int k;
/* 46 */       if (5 == paramInt) {
/* 47 */         this.s = (paramev.k(-1987080889) * -1405545553);
/* 48 */         this.u = new int[this.s * 1089348431];
/* 49 */         this.w = new String[this.s * 1089348431];
/* 50 */         for (k = 0; k < 1089348431 * this.s; k++) {
/* 51 */           this.u[k] = paramev.h(-1581436237);
/* 52 */           this.w[k] = paramev.ad(1108433837);
/*    */         }
/*    */       }
/* 55 */       else if (6 == paramInt) {
/* 56 */         this.s = (paramev.k(-1987080889) * -1405545553);
/* 57 */         this.u = new int[1089348431 * this.s];
/* 58 */         this.v = new int[this.s * 1089348431];
/* 59 */         for (k = 0; k < 1089348431 * this.s; k++) {
/* 60 */           this.u[k] = paramev.h(1568123530);
/* 61 */           this.v[k] = paramev.h(1918639217);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     fe
 * JD-Core Version:    0.6.2
 */