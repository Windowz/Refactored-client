/*      */ public final class df
/*      */ {
/*      */   static boolean r;
/*      */   public static boolean[] c;
/*      */   static dq bb;
/*      */   static fq fr;
/*      */   static byte nr;
/*      */   static int ou;
/*      */ 
/*      */   public static int l(CharSequence paramCharSequence)
/*      */   {
/*    9 */     int i = paramCharSequence.length();
/*   10 */     int j = 0;
/*   11 */     for (int k = 0; k < i; k++) {
/*   12 */       int m = paramCharSequence.charAt(k);
/*   13 */       if (m <= 127) j++;
/*   14 */       else if (m <= 2047) j += 2; else
/*   15 */         j += 3;
/*      */     }
/*   17 */     return j;
/*      */   }
/*      */ 
/*      */   public static int c(byte[] paramArrayOfByte, int paramInt, CharSequence paramCharSequence) {
/*   21 */     int i = paramCharSequence.length();
/*   22 */     int j = paramInt;
/*   23 */     for (int k = 0; k < i; k++) {
/*   24 */       int m = paramCharSequence.charAt(k);
/*   25 */       if (m <= 127) {
/*   26 */         paramArrayOfByte[(j++)] = ((byte)m);
/*      */       }
/*   28 */       else if (m <= 2047) {
/*   29 */         paramArrayOfByte[(j++)] = ((byte)(0xC0 | m >> 6));
/*   30 */         paramArrayOfByte[(j++)] = ((byte)(0x80 | m & 0x3F));
/*      */       }
/*      */       else {
/*   33 */         paramArrayOfByte[(j++)] = ((byte)(0xE0 | m >> 12));
/*   34 */         paramArrayOfByte[(j++)] = ((byte)(0x80 | m >> 6 & 0x3F));
/*   35 */         paramArrayOfByte[(j++)] = ((byte)(0x80 | m & 0x3F));
/*      */       }
/*      */     }
/*   38 */     return j - paramInt;
/*      */   }
/*      */ 
/*      */   public static int m(CharSequence paramCharSequence)
/*      */   {
/*    9 */     int i = paramCharSequence.length();
/*   10 */     int j = 0;
/*   11 */     for (int k = 0; k < i; k++) {
/*   12 */       int m = paramCharSequence.charAt(k);
/*   13 */       if (m <= 127) j++;
/*   14 */       else if (m <= 2047) j += 2; else
/*   15 */         j += 3;
/*      */     }
/*   17 */     return j;
/*      */   }
/*      */ 
/*      */   public static int j(byte[] paramArrayOfByte, int paramInt, CharSequence paramCharSequence) {
/*   21 */     int i = paramCharSequence.length();
/*   22 */     int j = paramInt;
/*   23 */     for (int k = 0; k < i; k++) {
/*   24 */       int m = paramCharSequence.charAt(k);
/*   25 */       if (m <= 127) {
/*   26 */         paramArrayOfByte[(j++)] = ((byte)m);
/*      */       }
/*   28 */       else if (m <= 2047) {
/*   29 */         paramArrayOfByte[(j++)] = ((byte)(0xC0 | m >> 6));
/*   30 */         paramArrayOfByte[(j++)] = ((byte)(0x80 | m & 0x3F));
/*      */       }
/*      */       else {
/*   33 */         paramArrayOfByte[(j++)] = ((byte)(0xE0 | m >> 12));
/*   34 */         paramArrayOfByte[(j++)] = ((byte)(0x80 | m >> 6 & 0x3F));
/*   35 */         paramArrayOfByte[(j++)] = ((byte)(0x80 | m & 0x3F));
/*      */       }
/*      */     }
/*   38 */     return j - paramInt;
/*      */   }
/*      */ 
/*      */   public static int n(byte[] paramArrayOfByte, int paramInt, CharSequence paramCharSequence)
/*      */   {
/*   21 */     int i = paramCharSequence.length();
/*   22 */     int j = paramInt;
/*   23 */     for (int k = 0; k < i; k++) {
/*   24 */       int m = paramCharSequence.charAt(k);
/*   25 */       if (m <= 127) {
/*   26 */         paramArrayOfByte[(j++)] = ((byte)m);
/*      */       }
/*   28 */       else if (m <= 2047) {
/*   29 */         paramArrayOfByte[(j++)] = ((byte)(0xC0 | m >> 6));
/*   30 */         paramArrayOfByte[(j++)] = ((byte)(0x80 | m & 0x3F));
/*      */       }
/*      */       else {
/*   33 */         paramArrayOfByte[(j++)] = ((byte)(0xE0 | m >> 12));
/*   34 */         paramArrayOfByte[(j++)] = ((byte)(0x80 | m >> 6 & 0x3F));
/*   35 */         paramArrayOfByte[(j++)] = ((byte)(0x80 | m & 0x3F));
/*      */       }
/*      */     }
/*   38 */     return j - paramInt;
/*      */   }
/*      */ 
/*      */   df()
/*      */     throws Throwable
/*      */   {
/*    5 */     throw new Error();
/*      */   }
/*      */ 
/*      */   static final void eb(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/* 5032 */     if (client.bk * -909626157 != 2) { if (paramInt3 != -1230677250) return; return; }
/* 5033 */     cl.ez(1507980417 * client.by + (client.bl * 1317659273 - 1235880887 * a.de << 7), -1578744753 * client.bx + (-1296179183 * client.bt - at.dw * 1096323129 << 7), client.bw * -125057094, 1411708708);
/* 5034 */     if ((client.hm * -911201339 > -1) && ((paramInt3 != -1230677250) || (1513618129 * client.au % 20 < 10))) { if (paramInt3 == -1230677250);
/* 5034 */       ef.fx[0].cj(paramInt1 + client.hm * -911201339 - 12, client.hu * 273430329 + paramInt2 - 28);
/*      */     }
/*      */   }
/*      */ 
/*      */   public static void b(int paramInt)
/*      */   {
/*  234 */     em.z.m();
/*  235 */     em.g.m();
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     df
 * JD-Core Version:    0.6.2
 */