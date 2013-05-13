/*     */ import java.awt.Font;
/*     */ 
/*     */ public class ca
/*     */ {
/*   4 */   static final char[] r = { '€', '\000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\000', 'Ž', '\000', '\000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\000', 'ž', 'Ÿ' };
/*     */   protected static Font f;
/*     */   static int gv;
/*     */   static int jf;
/*     */   public static char cc;
/*     */ 
/*     */   public static boolean q(char paramChar)
/*     */   {
/*  45 */     if (((paramChar > 0) && (paramChar < '')) || ((paramChar >= ' ') && (paramChar <= 'ÿ'))) return true;
/*  46 */     if ('\000' != paramChar)
/*     */     {
/*  48 */       char[] arrayOfChar = r;
/*  49 */       for (int i = 0; i < arrayOfChar.length; i++) {
/*  50 */         char c = arrayOfChar[i];
/*     */ 
/*  52 */         if (c == paramChar) return true;
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/*  57 */     return false;
/*     */   }
/*     */ 
/*     */   ca()
/*     */     throws Throwable
/*     */   {
/*   7 */     throw new Error();
/*     */   }
/*     */ 
/*     */   static byte j(char paramChar)
/*     */   {
/*  12 */     byte b;
/*  12 */     if (((paramChar > 0) && (paramChar < '')) || ((paramChar >= ' ') && (paramChar <= 'ÿ'))) b = (byte)paramChar;
/*  13 */     else if (paramChar == '€') b = -128;
/*  14 */     else if ('‚' == paramChar) b = -126;
/*  15 */     else if (paramChar == 'ƒ') b = -125;
/*  16 */     else if ('„' == paramChar) b = -124;
/*  17 */     else if ('…' == paramChar) b = -123;
/*  18 */     else if ('†' == paramChar) b = -122;
/*  19 */     else if (paramChar == '‡') b = -121;
/*  20 */     else if ('ˆ' == paramChar) b = -120;
/*  21 */     else if (paramChar == '‰') b = -119;
/*  22 */     else if ('Š' == paramChar) b = -118;
/*  23 */     else if ('‹' == paramChar) b = -117;
/*  24 */     else if ('Œ' == paramChar) b = -116;
/*  25 */     else if (paramChar == 'Ž') b = -114;
/*  26 */     else if (paramChar == '‘') b = -111;
/*  27 */     else if (paramChar == '’') b = -110;
/*  28 */     else if ('“' == paramChar) b = -109;
/*  29 */     else if ('”' == paramChar) b = -108;
/*  30 */     else if (paramChar == '•') b = -107;
/*  31 */     else if ('–' == paramChar) b = -106;
/*  32 */     else if ('—' == paramChar) b = -105;
/*  33 */     else if ('˜' == paramChar) b = -104;
/*  34 */     else if (paramChar == '™') b = -103;
/*  35 */     else if (paramChar == 'š') b = -102;
/*  36 */     else if (paramChar == '›') b = -101;
/*  37 */     else if ('œ' == paramChar) b = -100;
/*  38 */     else if (paramChar == 'ž') b = -98;
/*  39 */     else if (paramChar == 'Ÿ') b = -97; else
/*  40 */       b = 63;
/*  41 */     return b;
/*     */   }
/*     */ 
/*     */   public static boolean g(char paramChar) {
/*  45 */     if (((paramChar > 0) && (paramChar < '')) || ((paramChar >= ' ') && (paramChar <= 'ÿ'))) return true;
/*  46 */     if ('\000' != paramChar)
/*     */     {
/*  48 */       char[] arrayOfChar = r;
/*  49 */       for (int i = 0; i < arrayOfChar.length; i++) {
/*  50 */         char c = arrayOfChar[i];
/*     */ 
/*  52 */         if (c == paramChar) return true;
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/*  57 */     return false;
/*     */   }
/*     */ 
/*     */   static byte z(char paramChar)
/*     */   {
/*  12 */     byte b;
/*  12 */     if (((paramChar > 0) && (paramChar < '')) || ((paramChar >= ' ') && (paramChar <= 'ÿ'))) b = (byte)paramChar;
/*  13 */     else if (paramChar == '€') b = -128;
/*  14 */     else if ('‚' == paramChar) b = -126;
/*  15 */     else if (paramChar == 'ƒ') b = -125;
/*  16 */     else if ('„' == paramChar) b = -124;
/*  17 */     else if ('…' == paramChar) b = -123;
/*  18 */     else if ('†' == paramChar) b = -122;
/*  19 */     else if (paramChar == '‡') b = -121;
/*  20 */     else if ('ˆ' == paramChar) b = -120;
/*  21 */     else if (paramChar == '‰') b = -119;
/*  22 */     else if ('Š' == paramChar) b = -118;
/*  23 */     else if ('‹' == paramChar) b = -117;
/*  24 */     else if ('Œ' == paramChar) b = -116;
/*  25 */     else if (paramChar == 'Ž') b = -114;
/*  26 */     else if (paramChar == '‘') b = -111;
/*  27 */     else if (paramChar == '’') b = -110;
/*  28 */     else if ('“' == paramChar) b = -109;
/*  29 */     else if ('”' == paramChar) b = -108;
/*  30 */     else if (paramChar == '•') b = -107;
/*  31 */     else if ('–' == paramChar) b = -106;
/*  32 */     else if ('—' == paramChar) b = -105;
/*  33 */     else if ('˜' == paramChar) b = -104;
/*  34 */     else if (paramChar == '™') b = -103;
/*  35 */     else if (paramChar == 'š') b = -102;
/*  36 */     else if (paramChar == '›') b = -101;
/*  37 */     else if ('œ' == paramChar) b = -100;
/*  38 */     else if (paramChar == 'ž') b = -98;
/*  39 */     else if (paramChar == 'Ÿ') b = -97; else
/*  40 */       b = 63;
/*  41 */     return b;
/*     */   }
/*     */ 
/*     */   public static byte[] i(CharSequence paramCharSequence)
/*     */   {
/*  66 */     int i = paramCharSequence.length();
/*  67 */     byte[] arrayOfByte = new byte[i];
/*  68 */     for (int j = 0; j < i; j++) {
/*  69 */       int k = paramCharSequence.charAt(j);
/*  70 */       if (((k > 0) && (k < 128)) || ((k >= 160) && (k <= 255))) arrayOfByte[j] = ((byte)k);
/*  71 */       else if (8364 == k) arrayOfByte[j] = -128;
/*  72 */       else if (k == 8218) arrayOfByte[j] = -126;
/*  73 */       else if (k == 402) arrayOfByte[j] = -125;
/*  74 */       else if (k == 8222) arrayOfByte[j] = -124;
/*  75 */       else if (k == 8230) arrayOfByte[j] = -123;
/*  76 */       else if (8224 == k) arrayOfByte[j] = -122;
/*  77 */       else if (8225 == k) arrayOfByte[j] = -121;
/*  78 */       else if (710 == k) arrayOfByte[j] = -120;
/*  79 */       else if (8240 == k) arrayOfByte[j] = -119;
/*  80 */       else if (k == 352) arrayOfByte[j] = -118;
/*  81 */       else if (8249 == k) arrayOfByte[j] = -117;
/*  82 */       else if (k == 338) arrayOfByte[j] = -116;
/*  83 */       else if (k == 381) arrayOfByte[j] = -114;
/*  84 */       else if (k == 8216) arrayOfByte[j] = -111;
/*  85 */       else if (k == 8217) arrayOfByte[j] = -110;
/*  86 */       else if (8220 == k) arrayOfByte[j] = -109;
/*  87 */       else if (8221 == k) arrayOfByte[j] = -108;
/*  88 */       else if (k == 8226) arrayOfByte[j] = -107;
/*  89 */       else if (k == 8211) arrayOfByte[j] = -106;
/*  90 */       else if (8212 == k) arrayOfByte[j] = -105;
/*  91 */       else if (732 == k) arrayOfByte[j] = -104;
/*  92 */       else if (k == 8482) arrayOfByte[j] = -103;
/*  93 */       else if (k == 353) arrayOfByte[j] = -102;
/*  94 */       else if (k == 8250) arrayOfByte[j] = -101;
/*  95 */       else if (k == 339) arrayOfByte[j] = -100;
/*  96 */       else if (k == 382) arrayOfByte[j] = -98;
/*  97 */       else if (k == 376) arrayOfByte[j] = -97; else
/*  98 */         arrayOfByte[j] = 63;
/*     */     }
/* 100 */     return arrayOfByte;
/*     */   }
/*     */ 
/*     */   public static int s(CharSequence paramCharSequence, int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3) {
/* 104 */     int i = paramInt2 - paramInt1;
/* 105 */     for (int j = 0; j < i; j++) {
/* 106 */       int k = paramCharSequence.charAt(j + paramInt1);
/* 107 */       if (((k > 0) && (k < 128)) || ((k >= 160) && (k <= 255))) paramArrayOfByte[(paramInt3 + j)] = ((byte)k);
/* 108 */       else if (k == 8364) paramArrayOfByte[(paramInt3 + j)] = -128;
/* 109 */       else if (k == 8218) paramArrayOfByte[(paramInt3 + j)] = -126;
/* 110 */       else if (402 == k) paramArrayOfByte[(paramInt3 + j)] = -125;
/* 111 */       else if (8222 == k) paramArrayOfByte[(paramInt3 + j)] = -124;
/* 112 */       else if (8230 == k) paramArrayOfByte[(paramInt3 + j)] = -123;
/* 113 */       else if (k == 8224) paramArrayOfByte[(paramInt3 + j)] = -122;
/* 114 */       else if (8225 == k) paramArrayOfByte[(paramInt3 + j)] = -121;
/* 115 */       else if (710 == k) paramArrayOfByte[(paramInt3 + j)] = -120;
/* 116 */       else if (8240 == k) paramArrayOfByte[(j + paramInt3)] = -119;
/* 117 */       else if (352 == k) paramArrayOfByte[(j + paramInt3)] = -118;
/* 118 */       else if (8249 == k) paramArrayOfByte[(paramInt3 + j)] = -117;
/* 119 */       else if (338 == k) paramArrayOfByte[(paramInt3 + j)] = -116;
/* 120 */       else if (381 == k) paramArrayOfByte[(j + paramInt3)] = -114;
/* 121 */       else if (8216 == k) paramArrayOfByte[(paramInt3 + j)] = -111;
/* 122 */       else if (k == 8217) paramArrayOfByte[(j + paramInt3)] = -110;
/* 123 */       else if (8220 == k) paramArrayOfByte[(paramInt3 + j)] = -109;
/* 124 */       else if (8221 == k) paramArrayOfByte[(j + paramInt3)] = -108;
/* 125 */       else if (8226 == k) paramArrayOfByte[(paramInt3 + j)] = -107;
/* 126 */       else if (8211 == k) paramArrayOfByte[(j + paramInt3)] = -106;
/* 127 */       else if (8212 == k) paramArrayOfByte[(j + paramInt3)] = -105;
/* 128 */       else if (732 == k) paramArrayOfByte[(paramInt3 + j)] = -104;
/* 129 */       else if (8482 == k) paramArrayOfByte[(paramInt3 + j)] = -103;
/* 130 */       else if (k == 353) paramArrayOfByte[(j + paramInt3)] = -102;
/* 131 */       else if (8250 == k) paramArrayOfByte[(paramInt3 + j)] = -101;
/* 132 */       else if (339 == k) paramArrayOfByte[(j + paramInt3)] = -100;
/* 133 */       else if (k == 382) paramArrayOfByte[(j + paramInt3)] = -98;
/* 134 */       else if (k == 376) paramArrayOfByte[(j + paramInt3)] = -97; else
/* 135 */         paramArrayOfByte[(j + paramInt3)] = 63;
/*     */     }
/* 137 */     return i;
/*     */   }
/*     */ 
/*     */   public static String u(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
/* 141 */     char[] arrayOfChar = new char[paramInt2];
/* 142 */     int i = 0;
/* 143 */     for (int j = 0; j < paramInt2; j++) {
/* 144 */       int k = paramArrayOfByte[(paramInt1 + j)] & 0xFF;
/* 145 */       if (k != 0) {
/* 146 */         if ((k >= 128) && (k < 160)) {
/* 147 */           int m = r[(k - 128)];
/* 148 */           if (0 == m) m = 63;
/* 149 */           k = m;
/*     */         }
/* 151 */         arrayOfChar[(i++)] = ((char)k);
/*     */       }
/*     */     }
/* 153 */     return new String(arrayOfChar, 0, i);
/*     */   }
/*     */ 
/*     */   public static String v(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */   {
/* 141 */     char[] arrayOfChar = new char[paramInt2];
/* 142 */     int i = 0;
/* 143 */     for (int j = 0; j < paramInt2; j++) {
/* 144 */       int k = paramArrayOfByte[(paramInt1 + j)] & 0xFF;
/* 145 */       if (k != 0) {
/* 146 */         if ((k >= 128) && (k < 160)) {
/* 147 */           int m = r[(k - 128)];
/* 148 */           if (0 == m) m = 63;
/* 149 */           k = m;
/*     */         }
/* 151 */         arrayOfChar[(i++)] = ((char)k);
/*     */       }
/*     */     }
/* 153 */     return new String(arrayOfChar, 0, i);
/*     */   }
/*     */ 
/*     */   public static String w(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */   {
/* 141 */     char[] arrayOfChar = new char[paramInt2];
/* 142 */     int i = 0;
/* 143 */     for (int j = 0; j < paramInt2; j++) {
/* 144 */       int k = paramArrayOfByte[(paramInt1 + j)] & 0xFF;
/* 145 */       if (k != 0) {
/* 146 */         if ((k >= 128) && (k < 160)) {
/* 147 */           int m = r[(k - 128)];
/* 148 */           if (0 == m) m = 63;
/* 149 */           k = m;
/*     */         }
/* 151 */         arrayOfChar[(i++)] = ((char)k);
/*     */       }
/*     */     }
/* 153 */     return new String(arrayOfChar, 0, i);
/*     */   }
/*     */ 
/*     */   public static String e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */   {
/* 141 */     char[] arrayOfChar = new char[paramInt2];
/* 142 */     int i = 0;
/* 143 */     for (int j = 0; j < paramInt2; j++) {
/* 144 */       int k = paramArrayOfByte[(paramInt1 + j)] & 0xFF;
/* 145 */       if (k != 0) {
/* 146 */         if ((k >= 128) && (k < 160)) {
/* 147 */           int m = r[(k - 128)];
/* 148 */           if (0 == m) m = 63;
/* 149 */           k = m;
/*     */         }
/* 151 */         arrayOfChar[(i++)] = ((char)k);
/*     */       }
/*     */     }
/* 153 */     return new String(arrayOfChar, 0, i);
/*     */   }
/*     */ 
/*     */   public static String l(ev paramev, int paramInt)
/*     */   {
/*     */     String str1;
/*     */     try
/*     */     {
/*  30 */       int i = paramev.ap(911176219);
/*  31 */       if (i > 32767) { if (paramInt >= -1235645106) throw new IllegalStateException(); i = 32767; }
/*  32 */       byte[] arrayOfByte = new byte[i];
/*  33 */       paramev.c += dz.r.d(paramev.m, -196293817 * paramev.c, arrayOfByte, 0, i, (byte)-29) * -941396361;
/*  34 */       String str2 = ey.n(arrayOfByte, 0, i, (byte)-79);
/*  35 */       str1 = str2;
/*     */     }
/*     */     catch (Exception localException) {
/*  38 */       str1 = "Cabbage";
/*     */     }
/*     */ 
/*  41 */     return str1;
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ca
 * JD-Core Version:    0.6.2
 */