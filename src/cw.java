/*     */ import java.awt.Component;
/*     */ 
/*     */ public class cw
/*     */ {
/*     */   public static int l(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*   9 */     if (1 == (paramInt6 & 0x1)) {
/*  10 */       int i = paramInt4;
/*  11 */       paramInt4 = paramInt5;
/*  12 */       paramInt5 = i;
/*     */     }
/*  14 */     paramInt3 &= 3;
/*  15 */     if (paramInt3 == 0) return paramInt1;
/*  16 */     if (paramInt3 == 1) return paramInt2;
/*  17 */     if (paramInt3 == 2) return 7 - paramInt1 - (paramInt4 - 1);
/*  18 */     return 7 - paramInt2 - (paramInt5 - 1);
/*     */   }
/*     */ 
/*     */   cw()
/*     */     throws Throwable
/*     */   {
/*   5 */     throw new Error();
/*     */   }
/*     */ 
/*     */   public static int m(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*   9 */     if (1 == (paramInt6 & 0x1)) {
/*  10 */       int i = paramInt4;
/*  11 */       paramInt4 = paramInt5;
/*  12 */       paramInt5 = i;
/*     */     }
/*  14 */     paramInt3 &= 3;
/*  15 */     if (paramInt3 == 0) return paramInt1;
/*  16 */     if (paramInt3 == 1) return paramInt2;
/*  17 */     if (paramInt3 == 2) return 7 - paramInt1 - (paramInt4 - 1);
/*  18 */     return 7 - paramInt2 - (paramInt5 - 1);
/*     */   }
/*     */ 
/*     */   public static int c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*   9 */     if (1 == (paramInt6 & 0x1)) {
/*  10 */       int i = paramInt4;
/*  11 */       paramInt4 = paramInt5;
/*  12 */       paramInt5 = i;
/*     */     }
/*  14 */     paramInt3 &= 3;
/*  15 */     if (paramInt3 == 0) return paramInt1;
/*  16 */     if (paramInt3 == 1) return paramInt2;
/*  17 */     if (paramInt3 == 2) return 7 - paramInt1 - (paramInt4 - 1);
/*  18 */     return 7 - paramInt2 - (paramInt5 - 1);
/*     */   }
/*     */ 
/*     */   public static int n(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*   9 */     if (1 == (paramInt6 & 0x1)) {
/*  10 */       int i = paramInt4;
/*  11 */       paramInt4 = paramInt5;
/*  12 */       paramInt5 = i;
/*     */     }
/*  14 */     paramInt3 &= 3;
/*  15 */     if (paramInt3 == 0) return paramInt1;
/*  16 */     if (paramInt3 == 1) return paramInt2;
/*  17 */     if (paramInt3 == 2) return 7 - paramInt1 - (paramInt4 - 1);
/*  18 */     return 7 - paramInt2 - (paramInt5 - 1);
/*     */   }
/*     */ 
/*     */   public static int j(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  22 */     if (1 == (paramInt6 & 0x1)) {
/*  23 */       int i = paramInt4;
/*  24 */       paramInt4 = paramInt5;
/*  25 */       paramInt5 = i;
/*     */     }
/*  27 */     paramInt3 &= 3;
/*  28 */     if (paramInt3 == 0) return paramInt2;
/*  29 */     if (1 == paramInt3) return 7 - paramInt1 - (paramInt4 - 1);
/*  30 */     if (2 == paramInt3) return 7 - paramInt2 - (paramInt5 - 1);
/*  31 */     return paramInt1;
/*     */   }
/*     */ 
/*     */   public static void c(int paramInt)
/*     */   {
/*     */     try
/*     */     {
/* 240 */       ay.s.r(-883153307);
/* 241 */       for (int i = 0; i < 446752721 * ay.n; i++) { if (paramInt >= 1377085887) throw new IllegalStateException(); av.v[i].r(-883153307); }
/* 242 */       ay.u.r(-883153307);
/* 243 */       ay.i.r(-883153307);
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/*     */     }
/*     */   }
/*     */ 
/*     */   public static int d(byte[] paramArrayOfByte, int paramInt1, CharSequence paramCharSequence, int paramInt2)
/*     */   {
/*  21 */     int i = paramCharSequence.length();
/*  22 */     int j = paramInt1;
/*  23 */     for (int k = 0; k < i; k++) { if (paramInt2 != 1985538552) throw new IllegalStateException();
/*  24 */       int m = paramCharSequence.charAt(k);
/*  25 */       if (m <= 127) { if (paramInt2 != 1985538552) throw new IllegalStateException();
/*  26 */         paramArrayOfByte[(j++)] = ((byte)m);
/*     */       }
/*  28 */       else if (m <= 2047) { if (paramInt2 != 1985538552) throw new IllegalStateException();
/*  29 */         paramArrayOfByte[(j++)] = ((byte)(0xC0 | m >> 6));
/*  30 */         paramArrayOfByte[(j++)] = ((byte)(0x80 | m & 0x3F));
/*     */       } else
/*     */       {
/*  33 */         paramArrayOfByte[(j++)] = ((byte)(0xE0 | m >> 12));
/*  34 */         paramArrayOfByte[(j++)] = ((byte)(0x80 | m >> 6 & 0x3F));
/*  35 */         paramArrayOfByte[(j++)] = ((byte)(0x80 | m & 0x3F));
/*     */       }
/*     */     }
/*  38 */     return j - paramInt1;
/*     */   }
/*     */ 
/*     */   public static void d(Component paramComponent, byte paramByte)
/*     */   {
/* 121 */     paramComponent.removeKeyListener(az.r);
/* 122 */     paramComponent.removeFocusListener(az.r);
/* 123 */     az.cv = -1726812929;
/*     */   }
/*     */ 
/*     */   static final int u(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 931 */     int i = ef.v(paramInt1 - 1, paramInt2 - 1, -2075014964) + ef.v(1 + paramInt1, paramInt2 - 1, -1598619592) + ef.v(paramInt1 - 1, paramInt2 + 1, -1360141339) + ef.v(paramInt1 + 1, paramInt2 + 1, -2043696106);
/* 932 */     int j = ef.v(paramInt1 - 1, paramInt2, -997556011) + ef.v(paramInt1 + 1, paramInt2, -1632738479) + ef.v(paramInt1, paramInt2 - 1, -1644497636) + ef.v(paramInt1, 1 + paramInt2, -1129900770);
/* 933 */     int k = ef.v(paramInt1, paramInt2, -1753649179);
/* 934 */     return k / 4 + (j / 8 + i / 16);
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     cw
 * JD-Core Version:    0.6.2
 */