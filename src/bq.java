/*    */ public class bq
/*    */ {
/*    */   static int[] b;
/*    */   static fq[] fs;
/*    */   static int[] fm;
/*    */ 
/*    */   static final void c(long paramLong)
/*    */   {
/*    */     try
/*    */     {
/* 20 */       Thread.sleep(paramLong);
/*    */     }
/*    */     catch (InterruptedException localInterruptedException)
/*    */     {
/*    */     }
/*    */   }
/*    */ 
/*    */   public static final void l(long paramLong)
/*    */   {
/*  9 */     if (paramLong <= 0L) return;
/* 10 */     if (paramLong % 10L == 0L) {
/* 11 */       dr.d(paramLong - 1L);
/* 12 */       dr.d(1L);
/*    */     } else {
/* 14 */       dr.d(paramLong);
/*    */     }
/*    */   }
/*    */ 
/*    */   public static final void m(long paramLong)
/*    */   {
/*  9 */     if (paramLong <= 0L) return;
/* 10 */     if (paramLong % 10L == 0L) {
/* 11 */       dr.d(paramLong - 1L);
/* 12 */       dr.d(1L);
/*    */     } else {
/* 14 */       dr.d(paramLong);
/*    */     }
/*    */   }
/*    */ 
/*    */   bq()
/*    */     throws Throwable
/*    */   {
/*  5 */     throw new Error();
/*    */   }
/*    */ 
/*    */   static ep z(int paramInt1, int paramInt2)
/*    */   {
/* 20 */     ep localep = (ep)ep.n.r(paramInt1);
/* 21 */     if (localep != null) { if (paramInt2 <= -222738392) throw new IllegalStateException(); return localep; }
/* 22 */     byte[] arrayOfByte = ct.co.l(paramInt1, 0, 1953334075);
/* 23 */     if (null == arrayOfByte) { if (paramInt2 > -222738392);
/* 23 */       return null; }
/* 24 */     localep = new ep();
/* 25 */     ev localev = new ev(arrayOfByte);
/* 26 */     localev.c = (-941396361 * (localev.m.length - 12));
/* 27 */     int i = localev.h(541861105);
/* 28 */     localep.q = (localev.k(-1987080889) * 1947447425);
/* 29 */     localep.i = (localev.k(-1987080889) * 767315775);
/* 30 */     localep.s = (localev.k(-1987080889) * -457312291);
/* 31 */     localep.u = (localev.k(-1987080889) * 771343157);
/* 32 */     localev.c = 0;
/* 33 */     localev.p(-1503416379);
/* 34 */     localep.j = new int[i];
/* 35 */     localep.z = new int[i];
/* 36 */     localep.g = new String[i];
/* 37 */     int j = 0;
/* 38 */     while (localev.c * -196293817 < localev.m.length - 12) { if (paramInt2 > -222738392);
/* 39 */       int k = localev.k(-1987080889);
/* 40 */       if (k == 3) { if (paramInt2 <= -222738392) throw new IllegalStateException(); localep.g[j] = localev.ad(603203553); } else {
/* 41 */         if (k < 100) { if (paramInt2 <= -222738392) throw new IllegalStateException(); if ((21 != k) && ((paramInt2 <= -222738392) || ((k != 38) && ((paramInt2 <= -222738392) || (k != 39))))) { if (paramInt2 > -222738392);
/* 41 */             localep.z[j] = localev.h(780701433); break label376; } }
/* 42 */         localep.z[j] = localev.t(1118814123);
/* 43 */       }label376: localep.j[(j++)] = k;
/*    */     }
/* 45 */     ep.n.l(localep, paramInt1);
/* 46 */     return localep;
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     bq
 * JD-Core Version:    0.6.2
 */