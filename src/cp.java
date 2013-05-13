/*     */ public class cp
/*     */ {
/*     */   static final int d = 12;
/*     */   static final int r = 1;
/*   8 */   static final char[] l = { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };
/*   9 */   static final char[] m = { '[', ']', '#' };
/*     */   static fq[] fa;
/*     */ 
/*     */   public static String c(CharSequence paramCharSequence, da paramda)
/*     */   {
/*  40 */     if (null == paramCharSequence) return null;
/*  41 */     int i = 0;
/*  42 */     int j = paramCharSequence.length();
/*     */     int n;
/*  45 */     while (i < j)
/*     */     {
/*  47 */       n = paramCharSequence.charAt(i);
/*     */ 
/*  49 */       k = (160 == n) || (32 == n) || (n == 95) || (n == 45) ? 1 : 0;
/*     */ 
/*  51 */       if (k == 0) {
/*  52 */         break;
/*     */       }
/*     */ 
/*  55 */       i++;
/*     */     }
/*     */ 
/*  59 */     while (j > i)
/*     */     {
/*  61 */       n = paramCharSequence.charAt(j - 1);
/*     */ 
/*  63 */       k = (n == 160) || (32 == n) || (95 == n) || (45 == n) ? 1 : 0;
/*     */ 
/*  65 */       if (k == 0) {
/*  66 */         break;
/*     */       }
/*     */ 
/*  69 */       j--;
/*     */     }
/*  71 */     int k = j - i;
/*     */ 
/*  73 */     if (k >= 1) {
/*  74 */       n = k;
/*     */ 
/*  77 */       if (null == paramda) {
/*  78 */         i1 = 12;
/*     */       }
/*     */       else {
/*  81 */         switch (-1033150515 * paramda.g) {
/*     */         default:
/*  83 */           i1 = 12;
/*  84 */           break;
/*     */         case 3:
/*  86 */           i1 = 20;
/*     */         }
/*     */       }
/*     */ 
/*  90 */       if (n <= i1);
/*     */     } else {
/*  92 */       return null;
/*     */     }
/*  94 */     StringBuilder localStringBuilder = new StringBuilder(k);
/*  95 */     for (int i1 = i; i1 < j; i1++) {
/*  96 */       char c1 = paramCharSequence.charAt(i1);
/*  97 */       if (au.r(c1, -469437021))
/*     */       {
/*     */         char c2;
/* 100 */         switch (c1) {
/*     */         case 'À':
/*     */         case 'Á':
/*     */         case 'Â':
/*     */         case 'Ã':
/*     */         case 'Ä':
/*     */         case 'à':
/*     */         case 'á':
/*     */         case 'â':
/*     */         case 'ã':
/*     */         case 'ä':
/* 111 */           c2 = 'a';
/* 112 */           break;
/*     */         case ' ':
/*     */         case '-':
/*     */         case '_':
/*     */         case ' ':
/* 117 */           c2 = '_';
/* 118 */           break;
/*     */         case 'ÿ':
/*     */         case 'Ÿ':
/* 121 */           c2 = 'y';
/* 122 */           break;
/*     */         case '#':
/*     */         case '[':
/*     */         case ']':
/* 126 */           c2 = c1;
/* 127 */           break;
/*     */         case 'Ñ':
/*     */         case 'ñ':
/* 130 */           c2 = 'n';
/* 131 */           break;
/*     */         case 'Ù':
/*     */         case 'Ú':
/*     */         case 'Û':
/*     */         case 'Ü':
/*     */         case 'ù':
/*     */         case 'ú':
/*     */         case 'û':
/*     */         case 'ü':
/* 140 */           c2 = 'u';
/* 141 */           break;
/*     */         case 'Í':
/*     */         case 'Î':
/*     */         case 'Ï':
/*     */         case 'í':
/*     */         case 'î':
/*     */         case 'ï':
/* 148 */           c2 = 'i';
/* 149 */           break;
/*     */         default:
/* 151 */           c2 = Character.toLowerCase(c1);
/* 152 */           break;
/*     */         case 'Ç':
/*     */         case 'ç':
/* 155 */           c2 = 'c';
/* 156 */           break;
/*     */         case 'È':
/*     */         case 'É':
/*     */         case 'Ê':
/*     */         case 'Ë':
/*     */         case 'è':
/*     */         case 'é':
/*     */         case 'ê':
/*     */         case 'ë':
/* 165 */           c2 = 'e';
/* 166 */           break;
/*     */         case 'Ò':
/*     */         case 'Ó':
/*     */         case 'Ô':
/*     */         case 'Õ':
/*     */         case 'Ö':
/*     */         case 'ò':
/*     */         case 'ó':
/*     */         case 'ô':
/*     */         case 'õ':
/*     */         case 'ö':
/* 177 */           c2 = 'o';
/* 178 */           break;
/*     */         case 'ß':
/* 180 */           c2 = 'b';
/*     */         }
/*     */ 
/* 184 */         char c3 = c2;
/* 185 */         if (c3 != 0)
/* 186 */           localStringBuilder.append(c3); 
/*     */       }
/*     */     }
/* 188 */     if (localStringBuilder.length() == 0) return null;
/* 189 */     return localStringBuilder.toString();
/*     */   }
/*     */ 
/*     */   static final boolean l(char paramChar)
/*     */   {
/*  16 */     if (Character.isISOControl(paramChar)) return false;
/*     */ 
/*  19 */     int i = ((paramChar >= '0') && (paramChar <= '9')) || ((paramChar >= 'A') && (paramChar <= 'Z')) || ((paramChar >= 'a') && (paramChar <= 'z')) ? 1 : 0;
/*     */ 
/*  21 */     if (i != 0) return true;
/*     */ 
/*  23 */     char[] arrayOfChar = l;
/*     */     char c;
/*  24 */     for (int j = 0; j < arrayOfChar.length; j++) {
/*  25 */       c = arrayOfChar[j];
/*  26 */       if (paramChar == c) return true;
/*     */ 
/*     */     }
/*     */ 
/*  30 */     arrayOfChar = m;
/*  31 */     for (j = 0; j < arrayOfChar.length; j++) {
/*  32 */       c = arrayOfChar[j];
/*  33 */       if (paramChar == c) return true;
/*     */     }
/*     */ 
/*  36 */     return false;
/*     */   }
/*     */ 
/*     */   public static String m(CharSequence paramCharSequence, da paramda) {
/*  40 */     if (null == paramCharSequence) return null;
/*  41 */     int i = 0;
/*  42 */     int j = paramCharSequence.length();
/*     */     int n;
/*  45 */     while (i < j)
/*     */     {
/*  47 */       n = paramCharSequence.charAt(i);
/*     */ 
/*  49 */       k = (160 == n) || (32 == n) || (n == 95) || (n == 45) ? 1 : 0;
/*     */ 
/*  51 */       if (k == 0) {
/*  52 */         break;
/*     */       }
/*     */ 
/*  55 */       i++;
/*     */     }
/*     */ 
/*  59 */     while (j > i)
/*     */     {
/*  61 */       n = paramCharSequence.charAt(j - 1);
/*     */ 
/*  63 */       k = (n == 160) || (32 == n) || (95 == n) || (45 == n) ? 1 : 0;
/*     */ 
/*  65 */       if (k == 0) {
/*  66 */         break;
/*     */       }
/*     */ 
/*  69 */       j--;
/*     */     }
/*  71 */     int k = j - i;
/*     */ 
/*  73 */     if (k >= 1) {
/*  74 */       n = k;
/*     */ 
/*  77 */       if (null == paramda) {
/*  78 */         i1 = 12;
/*     */       }
/*     */       else {
/*  81 */         switch (-1033150515 * paramda.g) {
/*     */         default:
/*  83 */           i1 = 12;
/*  84 */           break;
/*     */         case 3:
/*  86 */           i1 = 20;
/*     */         }
/*     */       }
/*     */ 
/*  90 */       if (n <= i1);
/*     */     } else {
/*  92 */       return null;
/*     */     }
/*  94 */     StringBuilder localStringBuilder = new StringBuilder(k);
/*  95 */     for (int i1 = i; i1 < j; i1++) {
/*  96 */       char c1 = paramCharSequence.charAt(i1);
/*  97 */       if (au.r(c1, -2131554748))
/*     */       {
/*     */         char c2;
/* 100 */         switch (c1) {
/*     */         case 'À':
/*     */         case 'Á':
/*     */         case 'Â':
/*     */         case 'Ã':
/*     */         case 'Ä':
/*     */         case 'à':
/*     */         case 'á':
/*     */         case 'â':
/*     */         case 'ã':
/*     */         case 'ä':
/* 111 */           c2 = 'a';
/* 112 */           break;
/*     */         case ' ':
/*     */         case '-':
/*     */         case '_':
/*     */         case ' ':
/* 117 */           c2 = '_';
/* 118 */           break;
/*     */         case 'ÿ':
/*     */         case 'Ÿ':
/* 121 */           c2 = 'y';
/* 122 */           break;
/*     */         case '#':
/*     */         case '[':
/*     */         case ']':
/* 126 */           c2 = c1;
/* 127 */           break;
/*     */         case 'Ñ':
/*     */         case 'ñ':
/* 130 */           c2 = 'n';
/* 131 */           break;
/*     */         case 'Ù':
/*     */         case 'Ú':
/*     */         case 'Û':
/*     */         case 'Ü':
/*     */         case 'ù':
/*     */         case 'ú':
/*     */         case 'û':
/*     */         case 'ü':
/* 140 */           c2 = 'u';
/* 141 */           break;
/*     */         case 'Í':
/*     */         case 'Î':
/*     */         case 'Ï':
/*     */         case 'í':
/*     */         case 'î':
/*     */         case 'ï':
/* 148 */           c2 = 'i';
/* 149 */           break;
/*     */         default:
/* 151 */           c2 = Character.toLowerCase(c1);
/* 152 */           break;
/*     */         case 'Ç':
/*     */         case 'ç':
/* 155 */           c2 = 'c';
/* 156 */           break;
/*     */         case 'È':
/*     */         case 'É':
/*     */         case 'Ê':
/*     */         case 'Ë':
/*     */         case 'è':
/*     */         case 'é':
/*     */         case 'ê':
/*     */         case 'ë':
/* 165 */           c2 = 'e';
/* 166 */           break;
/*     */         case 'Ò':
/*     */         case 'Ó':
/*     */         case 'Ô':
/*     */         case 'Õ':
/*     */         case 'Ö':
/*     */         case 'ò':
/*     */         case 'ó':
/*     */         case 'ô':
/*     */         case 'õ':
/*     */         case 'ö':
/* 177 */           c2 = 'o';
/* 178 */           break;
/*     */         case 'ß':
/* 180 */           c2 = 'b';
/*     */         }
/*     */ 
/* 184 */         char c3 = c2;
/* 185 */         if (c3 != 0)
/* 186 */           localStringBuilder.append(c3); 
/*     */       }
/*     */     }
/* 188 */     if (localStringBuilder.length() == 0) return null;
/* 189 */     return localStringBuilder.toString();
/*     */   }
/*     */ 
/*     */   cp()
/*     */     throws Throwable
/*     */   {
/*  12 */     throw new Error();
/*     */   }
/*     */ 
/*     */   public static String n(CharSequence paramCharSequence, da paramda)
/*     */   {
/*  40 */     if (null == paramCharSequence) return null;
/*  41 */     int i = 0;
/*  42 */     int j = paramCharSequence.length();
/*     */     int n;
/*  45 */     while (i < j)
/*     */     {
/*  47 */       n = paramCharSequence.charAt(i);
/*     */ 
/*  49 */       k = (160 == n) || (32 == n) || (n == 95) || (n == 45) ? 1 : 0;
/*     */ 
/*  51 */       if (k == 0) {
/*  52 */         break;
/*     */       }
/*     */ 
/*  55 */       i++;
/*     */     }
/*     */ 
/*  59 */     while (j > i)
/*     */     {
/*  61 */       n = paramCharSequence.charAt(j - 1);
/*     */ 
/*  63 */       k = (n == 160) || (32 == n) || (95 == n) || (45 == n) ? 1 : 0;
/*     */ 
/*  65 */       if (k == 0) {
/*  66 */         break;
/*     */       }
/*     */ 
/*  69 */       j--;
/*     */     }
/*  71 */     int k = j - i;
/*     */ 
/*  73 */     if (k >= 1) {
/*  74 */       n = k;
/*     */ 
/*  77 */       if (null == paramda) {
/*  78 */         i1 = 12;
/*     */       }
/*     */       else {
/*  81 */         switch (-1033150515 * paramda.g) {
/*     */         default:
/*  83 */           i1 = 12;
/*  84 */           break;
/*     */         case 3:
/*  86 */           i1 = 20;
/*     */         }
/*     */       }
/*     */ 
/*  90 */       if (n <= i1);
/*     */     } else {
/*  92 */       return null;
/*     */     }
/*  94 */     StringBuilder localStringBuilder = new StringBuilder(k);
/*  95 */     for (int i1 = i; i1 < j; i1++) {
/*  96 */       char c1 = paramCharSequence.charAt(i1);
/*  97 */       if (au.r(c1, -935853216))
/*     */       {
/*     */         char c2;
/* 100 */         switch (c1) {
/*     */         case 'À':
/*     */         case 'Á':
/*     */         case 'Â':
/*     */         case 'Ã':
/*     */         case 'Ä':
/*     */         case 'à':
/*     */         case 'á':
/*     */         case 'â':
/*     */         case 'ã':
/*     */         case 'ä':
/* 111 */           c2 = 'a';
/* 112 */           break;
/*     */         case ' ':
/*     */         case '-':
/*     */         case '_':
/*     */         case ' ':
/* 117 */           c2 = '_';
/* 118 */           break;
/*     */         case 'ÿ':
/*     */         case 'Ÿ':
/* 121 */           c2 = 'y';
/* 122 */           break;
/*     */         case '#':
/*     */         case '[':
/*     */         case ']':
/* 126 */           c2 = c1;
/* 127 */           break;
/*     */         case 'Ñ':
/*     */         case 'ñ':
/* 130 */           c2 = 'n';
/* 131 */           break;
/*     */         case 'Ù':
/*     */         case 'Ú':
/*     */         case 'Û':
/*     */         case 'Ü':
/*     */         case 'ù':
/*     */         case 'ú':
/*     */         case 'û':
/*     */         case 'ü':
/* 140 */           c2 = 'u';
/* 141 */           break;
/*     */         case 'Í':
/*     */         case 'Î':
/*     */         case 'Ï':
/*     */         case 'í':
/*     */         case 'î':
/*     */         case 'ï':
/* 148 */           c2 = 'i';
/* 149 */           break;
/*     */         default:
/* 151 */           c2 = Character.toLowerCase(c1);
/* 152 */           break;
/*     */         case 'Ç':
/*     */         case 'ç':
/* 155 */           c2 = 'c';
/* 156 */           break;
/*     */         case 'È':
/*     */         case 'É':
/*     */         case 'Ê':
/*     */         case 'Ë':
/*     */         case 'è':
/*     */         case 'é':
/*     */         case 'ê':
/*     */         case 'ë':
/* 165 */           c2 = 'e';
/* 166 */           break;
/*     */         case 'Ò':
/*     */         case 'Ó':
/*     */         case 'Ô':
/*     */         case 'Õ':
/*     */         case 'Ö':
/*     */         case 'ò':
/*     */         case 'ó':
/*     */         case 'ô':
/*     */         case 'õ':
/*     */         case 'ö':
/* 177 */           c2 = 'o';
/* 178 */           break;
/*     */         case 'ß':
/* 180 */           c2 = 'b';
/*     */         }
/*     */ 
/* 184 */         char c3 = c2;
/* 185 */         if (c3 != 0)
/* 186 */           localStringBuilder.append(c3); 
/*     */       }
/*     */     }
/* 188 */     if (localStringBuilder.length() == 0) return null;
/* 189 */     return localStringBuilder.toString();
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     cp
 * JD-Core Version:    0.6.2
 */