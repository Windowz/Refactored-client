/*    */ import java.awt.FontMetrics;
/*    */ 
/*    */ public class fr extends en
/*    */ {
/*    */   ae[] n;
/*    */   protected static FontMetrics k;
/*    */ 
/*    */   public boolean g(int paramInt)
/*    */   {
/* 39 */     return this.n[paramInt].i;
/*    */   }
/*    */ 
/*    */   public fr(ch paramch1, ch paramch2, int paramInt, boolean paramBoolean)
/*    */   {
/* 11 */     cg localcg = new cg();
/* 12 */     int i = paramch1.u(paramInt, (short)-11580);
/* 13 */     this.n = new ae[i];
/* 14 */     int[] arrayOfInt = paramch1.s(paramInt, 1507623706);
/* 15 */     for (int j = 0; j < arrayOfInt.length; j++) {
/* 16 */       byte[] arrayOfByte1 = paramch1.l(paramInt, arrayOfInt[j], 275852178);
/* 17 */       Object localObject = null;
/* 18 */       int m = (arrayOfByte1[0] & 0xFF) << 8 | arrayOfByte1[1] & 0xFF;
/* 19 */       ez localez = (ez)localcg.j();
/* 20 */       while (null != localez) {
/* 21 */         if (-13693581 * localez.m == m) {
/* 22 */           localObject = localez;
/* 23 */           break;
/*    */         }
/* 25 */         localez = (ez)localcg.g();
/*    */       }
/* 27 */       if (null == localObject)
/*    */       {
/* 29 */         byte[] arrayOfByte2;
/* 29 */         if (paramBoolean) arrayOfByte2 = paramch2.g(0, m, 777049912); else
/* 30 */           arrayOfByte2 = paramch2.g(m, 0, 260615362);
/* 31 */         localObject = new ez(m, arrayOfByte2);
/* 32 */         localcg.d((dg)localObject);
/*    */       }
/* 34 */       this.n[arrayOfInt[j]] = new ae(arrayOfByte1, (ez)localObject);
/*    */     }
/*    */   }
/*    */ 
/*    */   public boolean q(int paramInt) {
/* 39 */     return this.n[paramInt].i; } 
/* 39 */   public boolean z(int paramInt, byte paramByte) { return this.n[paramInt].i; }
/*    */ 
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     fr
 * JD-Core Version:    0.6.2
 */