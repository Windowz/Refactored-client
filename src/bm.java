/*    */ public class bm
/*    */ {
/*    */   public static int[] l;
/*  5 */   public static final boolean[] d = { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };
/*    */   public static final int r = 25;
/*    */   static int v;
/*    */ 
/*    */   static
/*    */   {
/*  6 */     l = new int[99];
/*    */ 
/*  9 */     int i = 0;
/* 10 */     for (int j = 0; j < 99; j++) {
/* 11 */       int k = j + 1;
/* 12 */       int m = (int)(k + 300.0D * Math.pow(2.0D, k / 7.0D));
/* 13 */       i += m;
/* 14 */       l[j] = (i / 4);
/*    */     }
/*    */   }
/*    */ 
/*    */   bm() throws Throwable {
/* 19 */     throw new Error();
/*    */   }
/*    */ 
/*    */   public static bp[] l(int paramInt)
/*    */   {
/* 16 */     return new bp[] { bp.c, bp.d, bp.r, bp.n, bp.m, bp.l };
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     bm
 * JD-Core Version:    0.6.2
 */