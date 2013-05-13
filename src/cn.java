/*    */ public class cn
/*    */ {
/*    */   int[] r;
/*    */ 
/*    */   public int l(int paramInt)
/*    */   {
/* 20 */     int i = (this.r.length >> 1) - 1;
/* 21 */     int j = paramInt & i;
/*    */     while (true) {
/* 23 */       int k = this.r[(j + j + 1)];
/* 24 */       if (k == -1) return -1;
/* 25 */       if (this.r[(j + j)] == paramInt) return k;
/* 26 */       j = j + 1 & i;
/*    */     }
/*    */   }
/*    */ 
/*    */   public int r(int paramInt)
/*    */   {
/* 20 */     int i = (this.r.length >> 1) - 1;
/* 21 */     int j = paramInt & i;
/*    */     while (true) {
/* 23 */       int k = this.r[(j + j + 1)];
/* 24 */       if (k == -1) return -1;
/* 25 */       if (this.r[(j + j)] == paramInt) return k;
/* 26 */       j = j + 1 & i;
/*    */     }
/*    */   }
/*    */ 
/*    */   public int d(int paramInt)
/*    */   {
/* 20 */     int i = (this.r.length >> 1) - 1;
/* 21 */     int j = paramInt & i;
/*    */     while (true) {
/* 23 */       int k = this.r[(j + j + 1)];
/* 24 */       if (k == -1) return -1;
/* 25 */       if (this.r[(j + j)] == paramInt) return k;
/* 26 */       j = j + 1 & i;
/*    */     }
/*    */   }
/*    */ 
/*    */   public cn(int[] paramArrayOfInt)
/*    */   {
/*  7 */     int i = 1;
/*  8 */     while (i <= paramArrayOfInt.length + (paramArrayOfInt.length >> 1)) i <<= 1;
/*  9 */     this.r = new int[i + i];
/* 10 */     for (int j = 0; j < i + i; j++) this.r[j] = -1;
/* 11 */     for (j = 0; j < paramArrayOfInt.length; j++) {
/* 12 */       int k = paramArrayOfInt[j] & i - 1;
/* 13 */       while (this.r[(k + k + 1)] != -1) k = k + 1 & i - 1;
/* 14 */       this.r[(k + k)] = paramArrayOfInt[j];
/* 15 */       this.r[(k + k + 1)] = j;
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     cn
 * JD-Core Version:    0.6.2
 */