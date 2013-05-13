/*      */ public class bo
/*      */ {
/*      */   static long l;
/*      */   static int[] ev;
/*      */ 
/*      */   public static int m(int paramInt1, int paramInt2)
/*      */   {
/*      */     int i;
/*    9 */     if (paramInt2 > paramInt1) {
/*   10 */       i = paramInt1;
/*   11 */       paramInt1 = paramInt2;
/*   12 */       paramInt2 = i;
/*      */     }
/*   14 */     while (paramInt2 != 0) {
/*   15 */       i = paramInt1 % paramInt2;
/*   16 */       paramInt1 = paramInt2;
/*   17 */       paramInt2 = i;
/*      */     }
/*   19 */     return paramInt1;
/*      */   }
/*      */ 
/*      */   public static int n(int paramInt)
/*      */   {
/*   32 */     int i = 0;
/*   33 */     if ((paramInt < 0) || (paramInt >= 65536)) {
/*   34 */       paramInt >>>= 16;
/*   35 */       i += 16;
/*      */     }
/*   37 */     if (paramInt >= 256) {
/*   38 */       paramInt >>>= 8;
/*   39 */       i += 8;
/*      */     }
/*   41 */     if (paramInt >= 16) {
/*   42 */       paramInt >>>= 4;
/*   43 */       i += 4;
/*      */     }
/*   45 */     if (paramInt >= 4) {
/*   46 */       paramInt >>>= 2;
/*   47 */       i += 2;
/*      */     }
/*   49 */     if (paramInt >= 1) {
/*   50 */       paramInt >>>= 1;
/*   51 */       i++;
/*      */     }
/*   53 */     return paramInt + i;
/*      */   }
/*      */ 
/*      */   public static int c(int paramInt1, int paramInt2)
/*      */   {
/*      */     int i;
/*    9 */     if (paramInt2 > paramInt1) {
/*   10 */       i = paramInt1;
/*   11 */       paramInt1 = paramInt2;
/*   12 */       paramInt2 = i;
/*      */     }
/*   14 */     while (paramInt2 != 0) {
/*   15 */       i = paramInt1 % paramInt2;
/*   16 */       paramInt1 = paramInt2;
/*   17 */       paramInt2 = i;
/*      */     }
/*   19 */     return paramInt1;
/*      */   }
/*      */ 
/*      */   public static int z(int paramInt)
/*      */   {
/*   32 */     int i = 0;
/*   33 */     if ((paramInt < 0) || (paramInt >= 65536)) {
/*   34 */       paramInt >>>= 16;
/*   35 */       i += 16;
/*      */     }
/*   37 */     if (paramInt >= 256) {
/*   38 */       paramInt >>>= 8;
/*   39 */       i += 8;
/*      */     }
/*   41 */     if (paramInt >= 16) {
/*   42 */       paramInt >>>= 4;
/*   43 */       i += 4;
/*      */     }
/*   45 */     if (paramInt >= 4) {
/*   46 */       paramInt >>>= 2;
/*   47 */       i += 2;
/*      */     }
/*   49 */     if (paramInt >= 1) {
/*   50 */       paramInt >>>= 1;
/*   51 */       i++;
/*      */     }
/*   53 */     return paramInt + i;
/*      */   }
/*      */ 
/*      */   public static int j(int paramInt)
/*      */   {
/*   32 */     int i = 0;
/*   33 */     if ((paramInt < 0) || (paramInt >= 65536)) {
/*   34 */       paramInt >>>= 16;
/*   35 */       i += 16;
/*      */     }
/*   37 */     if (paramInt >= 256) {
/*   38 */       paramInt >>>= 8;
/*   39 */       i += 8;
/*      */     }
/*   41 */     if (paramInt >= 16) {
/*   42 */       paramInt >>>= 4;
/*   43 */       i += 4;
/*      */     }
/*   45 */     if (paramInt >= 4) {
/*   46 */       paramInt >>>= 2;
/*   47 */       i += 2;
/*      */     }
/*   49 */     if (paramInt >= 1) {
/*   50 */       paramInt >>>= 1;
/*   51 */       i++;
/*      */     }
/*   53 */     return paramInt + i;
/*      */   }
/*      */ 
/*      */   bo()
/*      */     throws Throwable
/*      */   {
/*    5 */     throw new Error();
/*      */   }
/*      */ 
/*      */   public static int g(int paramInt)
/*      */   {
/*   32 */     int i = 0;
/*   33 */     if ((paramInt < 0) || (paramInt >= 65536)) {
/*   34 */       paramInt >>>= 16;
/*   35 */       i += 16;
/*      */     }
/*   37 */     if (paramInt >= 256) {
/*   38 */       paramInt >>>= 8;
/*   39 */       i += 8;
/*      */     }
/*   41 */     if (paramInt >= 16) {
/*   42 */       paramInt >>>= 4;
/*   43 */       i += 4;
/*      */     }
/*   45 */     if (paramInt >= 4) {
/*   46 */       paramInt >>>= 2;
/*   47 */       i += 2;
/*      */     }
/*   49 */     if (paramInt >= 1) {
/*   50 */       paramInt >>>= 1;
/*   51 */       i++;
/*      */     }
/*   53 */     return paramInt + i;
/*      */   }
/*      */ 
/*      */   static boolean gy(eg parameg, int paramInt)
/*      */   {
/* 9775 */     if (client.kc) { if (paramInt >= 1262057765) throw new IllegalStateException();
/* 9776 */       if (dn.gg(parameg, (byte)25) != 0) { if (paramInt >= 1262057765) throw new IllegalStateException(); return false; }
/* 9777 */       if (0 == parameg.b * 808825319) { if (paramInt >= 1262057765) throw new IllegalStateException(); return false; }
/*      */     }
/* 9779 */     return parameg.ad;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     bo
 * JD-Core Version:    0.6.2
 */