/*    */ public final class cj
/*    */ {
/*  4 */   static final char[] r = { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
/*    */   static dq ch;
/*    */ 
/*    */   public static long n(CharSequence paramCharSequence)
/*    */   {
/* 11 */     long l = 0L;
/* 12 */     int i = paramCharSequence.length();
/* 13 */     for (int j = 0; j < i; j++) {
/* 14 */       l *= 37L;
/* 15 */       int k = paramCharSequence.charAt(j);
/* 16 */       if ((k >= 65) && (k <= 90)) l += 1 + k - 65;
/* 17 */       else if ((k >= 97) && (k <= 122)) l += 1 + k - 97;
/* 18 */       else if ((k >= 48) && (k <= 57)) l += k + 27 - 48;
/* 19 */       if (l >= 177917621779460413L) break;
/*    */     }
/* 21 */     while ((l % 37L == 0L) && (l != 0L)) l /= 37L;
/* 22 */     return l;
/*    */   }
/*    */ 
/*    */   public static String i(long paramLong)
/*    */   {
/* 44 */     if ((paramLong <= 0L) || (paramLong >= 6582952005840035281L)) return null;
/* 45 */     if (paramLong % 37L == 0L) return null;
/* 46 */     int i = 0;
/* 47 */     long l1 = paramLong;
/* 48 */     while (0L != l1) {
/* 49 */       i++;
/* 50 */       l1 /= 37L;
/*    */     }
/* 52 */     StringBuilder localStringBuilder = new StringBuilder(i);
/* 53 */     while (0L != paramLong) {
/* 54 */       long l2 = paramLong;
/* 55 */       paramLong /= 37L;
/* 56 */       char c = r[((int)(l2 - 37L * paramLong))];
/* 57 */       if (c == '_') {
/* 58 */         int j = localStringBuilder.length() - 1;
/* 59 */         localStringBuilder.setCharAt(j, Character.toUpperCase(localStringBuilder.charAt(j)));
/* 60 */         c = ' ';
/*    */       }
/* 62 */       localStringBuilder.append(c);
/*    */     }
/* 64 */     localStringBuilder.reverse();
/* 65 */     localStringBuilder.setCharAt(0, Character.toUpperCase(localStringBuilder.charAt(0)));
/* 66 */     return localStringBuilder.toString();
/*    */   }
/*    */ 
/*    */   public static long c(CharSequence paramCharSequence)
/*    */   {
/* 11 */     long l = 0L;
/* 12 */     int i = paramCharSequence.length();
/* 13 */     for (int j = 0; j < i; j++) {
/* 14 */       l *= 37L;
/* 15 */       int k = paramCharSequence.charAt(j);
/* 16 */       if ((k >= 65) && (k <= 90)) l += 1 + k - 65;
/* 17 */       else if ((k >= 97) && (k <= 122)) l += 1 + k - 97;
/* 18 */       else if ((k >= 48) && (k <= 57)) l += k + 27 - 48;
/* 19 */       if (l >= 177917621779460413L) break;
/*    */     }
/* 21 */     while ((l % 37L == 0L) && (l != 0L)) l /= 37L;
/* 22 */     return l;
/*    */   }
/*    */ 
/*    */   public static String z(long paramLong) {
/* 26 */     if ((paramLong <= 0L) || (paramLong >= 6582952005840035281L)) return null;
/* 27 */     if (0L == paramLong % 37L) return null;
/* 28 */     int i = 0;
/* 29 */     long l1 = paramLong;
/* 30 */     while (0L != l1) {
/* 31 */       i++;
/* 32 */       l1 /= 37L;
/*    */     }
/* 34 */     StringBuilder localStringBuilder = new StringBuilder(i);
/* 35 */     while (paramLong != 0L) {
/* 36 */       long l2 = paramLong;
/* 37 */       paramLong /= 37L;
/* 38 */       localStringBuilder.append(r[((int)(l2 - paramLong * 37L))]);
/*    */     }
/* 40 */     return localStringBuilder.reverse().toString();
/*    */   }
/*    */ 
/*    */   public static long j(CharSequence paramCharSequence)
/*    */   {
/* 11 */     long l = 0L;
/* 12 */     int i = paramCharSequence.length();
/* 13 */     for (int j = 0; j < i; j++) {
/* 14 */       l *= 37L;
/* 15 */       int k = paramCharSequence.charAt(j);
/* 16 */       if ((k >= 65) && (k <= 90)) l += 1 + k - 65;
/* 17 */       else if ((k >= 97) && (k <= 122)) l += 1 + k - 97;
/* 18 */       else if ((k >= 48) && (k <= 57)) l += k + 27 - 48;
/* 19 */       if (l >= 177917621779460413L) break;
/*    */     }
/* 21 */     while ((l % 37L == 0L) && (l != 0L)) l /= 37L;
/* 22 */     return l;
/*    */   }
/*    */ 
/*    */   cj()
/*    */     throws Throwable
/*    */   {
/*  7 */     throw new Error();
/*    */   }
/*    */ 
/*    */   public static String g(long paramLong)
/*    */   {
/* 26 */     if ((paramLong <= 0L) || (paramLong >= 6582952005840035281L)) return null;
/* 27 */     if (0L == paramLong % 37L) return null;
/* 28 */     int i = 0;
/* 29 */     long l1 = paramLong;
/* 30 */     while (0L != l1) {
/* 31 */       i++;
/* 32 */       l1 /= 37L;
/*    */     }
/* 34 */     StringBuilder localStringBuilder = new StringBuilder(i);
/* 35 */     while (paramLong != 0L) {
/* 36 */       long l2 = paramLong;
/* 37 */       paramLong /= 37L;
/* 38 */       localStringBuilder.append(r[((int)(l2 - paramLong * 37L))]);
/*    */     }
/* 40 */     return localStringBuilder.reverse().toString();
/*    */   }
/*    */ 
/*    */   public static String q(long paramLong)
/*    */   {
/* 26 */     if ((paramLong <= 0L) || (paramLong >= 6582952005840035281L)) return null;
/* 27 */     if (0L == paramLong % 37L) return null;
/* 28 */     int i = 0;
/* 29 */     long l1 = paramLong;
/* 30 */     while (0L != l1) {
/* 31 */       i++;
/* 32 */       l1 /= 37L;
/*    */     }
/* 34 */     StringBuilder localStringBuilder = new StringBuilder(i);
/* 35 */     while (paramLong != 0L) {
/* 36 */       long l2 = paramLong;
/* 37 */       paramLong /= 37L;
/* 38 */       localStringBuilder.append(r[((int)(l2 - paramLong * 37L))]);
/*    */     }
/* 40 */     return localStringBuilder.reverse().toString();
/*    */   }
/*    */ 
/*    */   public static String s(long paramLong) {
/* 44 */     if ((paramLong <= 0L) || (paramLong >= 6582952005840035281L)) return null;
/* 45 */     if (paramLong % 37L == 0L) return null;
/* 46 */     int i = 0;
/* 47 */     long l1 = paramLong;
/* 48 */     while (0L != l1) {
/* 49 */       i++;
/* 50 */       l1 /= 37L;
/*    */     }
/* 52 */     StringBuilder localStringBuilder = new StringBuilder(i);
/* 53 */     while (0L != paramLong) {
/* 54 */       long l2 = paramLong;
/* 55 */       paramLong /= 37L;
/* 56 */       char c = r[((int)(l2 - 37L * paramLong))];
/* 57 */       if (c == '_') {
/* 58 */         int j = localStringBuilder.length() - 1;
/* 59 */         localStringBuilder.setCharAt(j, Character.toUpperCase(localStringBuilder.charAt(j)));
/* 60 */         c = ' ';
/*    */       }
/* 62 */       localStringBuilder.append(c);
/*    */     }
/* 64 */     localStringBuilder.reverse();
/* 65 */     localStringBuilder.setCharAt(0, Character.toUpperCase(localStringBuilder.charAt(0)));
/* 66 */     return localStringBuilder.toString();
/*    */   }
/*    */ 
/*    */   public static String u(long paramLong)
/*    */   {
/* 44 */     if ((paramLong <= 0L) || (paramLong >= 6582952005840035281L)) return null;
/* 45 */     if (paramLong % 37L == 0L) return null;
/* 46 */     int i = 0;
/* 47 */     long l1 = paramLong;
/* 48 */     while (0L != l1) {
/* 49 */       i++;
/* 50 */       l1 /= 37L;
/*    */     }
/* 52 */     StringBuilder localStringBuilder = new StringBuilder(i);
/* 53 */     while (0L != paramLong) {
/* 54 */       long l2 = paramLong;
/* 55 */       paramLong /= 37L;
/* 56 */       char c = r[((int)(l2 - 37L * paramLong))];
/* 57 */       if (c == '_') {
/* 58 */         int j = localStringBuilder.length() - 1;
/* 59 */         localStringBuilder.setCharAt(j, Character.toUpperCase(localStringBuilder.charAt(j)));
/* 60 */         c = ' ';
/*    */       }
/* 62 */       localStringBuilder.append(c);
/*    */     }
/* 64 */     localStringBuilder.reverse();
/* 65 */     localStringBuilder.setCharAt(0, Character.toUpperCase(localStringBuilder.charAt(0)));
/* 66 */     return localStringBuilder.toString();
/*    */   }
/*    */ 
/*    */   public static String v(long paramLong)
/*    */   {
/* 44 */     if ((paramLong <= 0L) || (paramLong >= 6582952005840035281L)) return null;
/* 45 */     if (paramLong % 37L == 0L) return null;
/* 46 */     int i = 0;
/* 47 */     long l1 = paramLong;
/* 48 */     while (0L != l1) {
/* 49 */       i++;
/* 50 */       l1 /= 37L;
/*    */     }
/* 52 */     StringBuilder localStringBuilder = new StringBuilder(i);
/* 53 */     while (0L != paramLong) {
/* 54 */       long l2 = paramLong;
/* 55 */       paramLong /= 37L;
/* 56 */       char c = r[((int)(l2 - 37L * paramLong))];
/* 57 */       if (c == '_') {
/* 58 */         int j = localStringBuilder.length() - 1;
/* 59 */         localStringBuilder.setCharAt(j, Character.toUpperCase(localStringBuilder.charAt(j)));
/* 60 */         c = ' ';
/*    */       }
/* 62 */       localStringBuilder.append(c);
/*    */     }
/* 64 */     localStringBuilder.reverse();
/* 65 */     localStringBuilder.setCharAt(0, Character.toUpperCase(localStringBuilder.charAt(0)));
/* 66 */     return localStringBuilder.toString();
/*    */   }
/*    */ 
/*    */   public static long r(CharSequence paramCharSequence, int paramInt)
/*    */   {
/* 11 */     long l = 0L;
/* 12 */     int i = paramCharSequence.length();
/* 13 */     for (int j = 0; j < i; j++) { if (paramInt < 569633226);
/* 14 */       l *= 37L;
/* 15 */       int k = paramCharSequence.charAt(j);
/* 16 */       if (k >= 65) { if (paramInt >= 569633226) throw new IllegalStateException(); if (k <= 90) { if (paramInt < 569633226);
/* 16 */           l += 1 + k - 65; break label186; } }
/* 17 */       if ((k >= 97) && ((paramInt >= 569633226) || (k <= 122))) { if (paramInt < 569633226);
/* 17 */         l += 1 + k - 97;
/* 18 */       } else if ((k >= 48) && ((paramInt >= 569633226) || (k <= 57))) { if (paramInt < 569633226);
/* 18 */         l += k + 27 - 48; }
/* 19 */       label186: if (l >= 177917621779460413L) { if (paramInt >= 569633226) throw new IllegalStateException(); break; }
/*    */     }
/* 21 */     for (; (l % 37L == 0L) && ((paramInt >= 569633226) || (l != 0L)); l /= 37L) if (paramInt >= 569633226);
/* 22 */     return l;
/*    */   }
/*    */ 
/*    */   public static fb z(int paramInt1, int paramInt2) {
/* 26 */     fb localfb = (fb)fb.j.r(paramInt1);
/* 27 */     if (localfb != null) { if (paramInt2 <= 1768526741) throw new IllegalStateException(); return localfb; }
/* 28 */     byte[] arrayOfByte = by.n.l(4, paramInt1, 2043243980);
/* 29 */     localfb = new fb();
/* 30 */     if (null != arrayOfByte) { if (paramInt2 <= 1768526741) throw new IllegalStateException(); localfb.q(new ev(arrayOfByte), paramInt1, (byte)14); }
/* 31 */     localfb.g((byte)93);
/* 32 */     fb.j.l(localfb, paramInt1);
/* 33 */     return localfb;
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     cj
 * JD-Core Version:    0.6.2
 */