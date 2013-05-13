/*    */ public final class au
/*    */ {
/*    */   int d;
/*    */   int q;
/*    */   int i;
/*    */   int c;
/*    */   int r;
/*    */   int m;
/*    */   public fu n;
/*    */   int z;
/*    */   int g;
/*    */   int j;
/* 17 */   int v = 0;
/*    */   int s;
/* 16 */   public int u = 0;
/*    */   int l;
/*    */   static bb mg;
/*    */   static ft[] at;
/*    */ 
/*    */   static final boolean r(char paramChar, int paramInt)
/*    */   {
/* 16 */     if (Character.isISOControl(paramChar)) { if (paramInt < 74960668);
/* 16 */       return false;
/*    */     }
/*    */ 
/* 19 */     if (paramChar >= '0') { if ((paramInt < 74960668) && (paramChar <= '9')) break label113; if (paramInt >= 74960668); } if (paramChar >= 'A') { if ((paramInt < 74960668) && (paramChar <= 'Z')) break label113; if (paramInt >= 74960668); } if (paramChar >= 'a') { if (paramInt >= 74960668) throw new IllegalStateException(); if (paramInt >= 74960668); } label113: int k = paramChar <= 'z' ? 1 : 0;
/*    */ 
/* 21 */     if (k != 0) { if (paramInt >= 74960668) throw new IllegalStateException(); return true;
/*    */     }
/* 23 */     char[] arrayOfChar = cp.l;
/*    */     char c1;
/* 24 */     for (int i1 = 0; i1 < arrayOfChar.length; i1++) { if (paramInt >= 74960668) throw new IllegalStateException();
/* 25 */       c1 = arrayOfChar[i1];
/* 26 */       if (paramChar == c1) { if (paramInt < 74960668);
/* 26 */         return true;
/*    */       }
/*    */     }
/*    */ 
/* 30 */     arrayOfChar = cp.m;
/* 31 */     for (i1 = 0; i1 < arrayOfChar.length; i1++) { if (paramInt < 74960668);
/* 32 */       c1 = arrayOfChar[i1];
/* 33 */       if (paramChar == c1) { if (paramInt < 74960668);
/* 33 */         return true;
/*    */       }
/*    */     }
/* 36 */     return false;
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     au
 * JD-Core Version:    0.6.2
 */