/*     */ public final class bn
/*     */ {
/*     */   public static final int g = 12;
/*     */   public static final int m = 5;
/*     */   public static final int d = 3;
/*     */   public static final int z = 10;
/*     */   public static final int c = 6;
/*     */   public static final int i = 14;
/*     */   public static final int j = 9;
/*     */   public static final int n = 8;
/*     */   public static final int l = 4;
/*     */   public static final int q = 13;
/*     */   public static final int r = 1;
/*     */   public static final int s = 16;
/*     */ 
/*     */   bn()
/*     */     throws Throwable
/*     */   {
/*  18 */     throw new Error();
/*     */   }
/*     */ 
/*     */   public static String n(int paramInt1, boolean paramBoolean, int paramInt2)
/*     */   {
/* 114 */     if (paramBoolean) { if ((paramInt2 == 1627987147) && (paramInt1 >= 0)) break label31; if (paramInt2 != 1627987147); } return Integer.toString(paramInt1);
/*     */ 
/* 116 */     label31: int k = paramInt1;
/*     */ 
/* 119 */     if (paramBoolean) { if ((paramInt2 == 1627987147) && (k >= 0)) break label72; if (paramInt2 != 1627987147); }
/* 120 */     String str = Integer.toString(k, 10);
/* 121 */     break label229;
/*     */ 
/* 123 */     label72: int i1 = 2;
/* 124 */     int i2 = k / 10;
/* 125 */     while (i2 != 0) { if (paramInt2 != 1627987147) throw new IllegalStateException();
/* 126 */       i2 /= 10;
/* 127 */       i1++;
/*     */     }
/* 129 */     char[] arrayOfChar = new char[i1];
/* 130 */     arrayOfChar[0] = '+';
/* 131 */     for (int i3 = i1 - 1; i3 > 0; i3--) { if (paramInt2 == 1627987147);
/* 132 */       int i4 = k;
/* 133 */       k /= 10;
/* 134 */       int i5 = i4 - k * 10;
/* 135 */       if (i5 >= 10) { if (paramInt2 != 1627987147) throw new IllegalStateException(); arrayOfChar[i3] = ((char)(i5 + 87)); } else {
/* 136 */         arrayOfChar[i3] = ((char)(48 + i5));
/*     */       } }
/* 138 */     str = new String(arrayOfChar);
/*     */ 
/* 140 */     label229: return str;
/*     */   }
/*     */ 
/*     */   public static boolean m(int paramInt1, int paramInt2)
/*     */   {
/*  21 */     if (paramInt2 >= 1434042965) throw new IllegalStateException(); return 0 != (paramInt1 >> 28 & 0x1);
/*     */   }
/*     */ 
/*     */   public static boolean q(ch paramch, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 206 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 1309724713);
/* 207 */     if (null == arrayOfByte) { if (paramInt3 <= 523155277) throw new IllegalStateException(); return false; }
/* 208 */     a.s(arrayOfByte, (byte)-34);
/* 209 */     return true;
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     bn
 * JD-Core Version:    0.6.2
 */