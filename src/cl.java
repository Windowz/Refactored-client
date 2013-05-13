/*      */ public final class cl
/*      */ {
/*      */   static int[] j;
/*      */   public static int q;
/*      */ 
/*      */   public static int k(CharSequence paramCharSequence)
/*      */   {
/*  144 */     int i = paramCharSequence.length();
/*  145 */     int k = 0;
/*  146 */     for (int m = 0; m < i; m++) k = (k << 5) - k + bl.r(paramCharSequence.charAt(m), 2020718112);
/*  147 */     return k;
/*      */   }
/*      */ 
/*      */   public static String i(int paramInt)
/*      */   {
/*   11 */     return (paramInt >> 24 & 0xFF) + "." + (paramInt >> 16 & 0xFF) + "." + (paramInt >> 8 & 0xFF) + "." + (paramInt & 0xFF);
/*      */   }
/*      */ 
/*      */   public static String s(CharSequence[] paramArrayOfCharSequence, int paramInt1, int paramInt2) {
/*   15 */     if (0 == paramInt2) return "";
/*   16 */     if (1 == paramInt2) {
/*   17 */       CharSequence localCharSequence1 = paramArrayOfCharSequence[paramInt1];
/*   18 */       if (null == localCharSequence1) return "null";
/*   19 */       return localCharSequence1.toString();
/*      */     }
/*   21 */     int i = paramInt2 + paramInt1;
/*   22 */     int k = 0;
/*   23 */     for (int m = paramInt1; m < i; m++) {
/*   24 */       CharSequence localCharSequence2 = paramArrayOfCharSequence[m];
/*   25 */       if (null == localCharSequence2) k += 4; else
/*   26 */         k += localCharSequence2.length();
/*      */     }
/*   28 */     StringBuilder localStringBuilder = new StringBuilder(k);
/*   29 */     for (int n = paramInt1; n < i; n++) {
/*   30 */       CharSequence localCharSequence3 = paramArrayOfCharSequence[n];
/*   31 */       if (null == localCharSequence3) localStringBuilder.append("null"); else
/*   32 */         localStringBuilder.append(localCharSequence3);
/*      */     }
/*   34 */     return localStringBuilder.toString();
/*      */   }
/*      */ 
/*      */   public static String u(CharSequence[] paramArrayOfCharSequence, int paramInt1, int paramInt2)
/*      */   {
/*   15 */     if (0 == paramInt2) return "";
/*   16 */     if (1 == paramInt2) {
/*   17 */       CharSequence localCharSequence1 = paramArrayOfCharSequence[paramInt1];
/*   18 */       if (null == localCharSequence1) return "null";
/*   19 */       return localCharSequence1.toString();
/*      */     }
/*   21 */     int i = paramInt2 + paramInt1;
/*   22 */     int k = 0;
/*   23 */     for (int m = paramInt1; m < i; m++) {
/*   24 */       CharSequence localCharSequence2 = paramArrayOfCharSequence[m];
/*   25 */       if (null == localCharSequence2) k += 4; else
/*   26 */         k += localCharSequence2.length();
/*      */     }
/*   28 */     StringBuilder localStringBuilder = new StringBuilder(k);
/*   29 */     for (int n = paramInt1; n < i; n++) {
/*   30 */       CharSequence localCharSequence3 = paramArrayOfCharSequence[n];
/*   31 */       if (null == localCharSequence3) localStringBuilder.append("null"); else
/*   32 */         localStringBuilder.append(localCharSequence3);
/*      */     }
/*   34 */     return localStringBuilder.toString();
/*      */   }
/*      */ 
/*      */   public static String a(String paramString)
/*      */   {
/*  155 */     int i = paramString.length();
/*  156 */     char[] arrayOfChar = new char[i];
/*  157 */     int k = 2;
/*  158 */     for (int m = 0; m < i; m++) {
/*  159 */       char c = paramString.charAt(m);
/*  160 */       if (0 == k) c = Character.toLowerCase(c);
/*  161 */       else if ((2 == k) || (Character.isUpperCase(c))) c = y.l(c, (byte)-80);
/*  162 */       if (Character.isLetter(c)) k = 0;
/*  163 */       else if ((c == '.') || ('?' == c) || ('!' == c)) k = 2;
/*  164 */       else if (Character.isSpaceChar(c)) {
/*  165 */         if (2 != k) k = 1; 
/*      */       }
/*      */       else
/*  167 */         k = 1;
/*  168 */       arrayOfChar[m] = c;
/*      */     }
/*  170 */     return new String(arrayOfChar);
/*      */   }
/*      */ 
/*      */   public static boolean w(CharSequence paramCharSequence)
/*      */   {
/*   41 */     int i = 0;
/*   42 */     boolean bool2 = false;
/*   43 */     int k = 0;
/*   44 */     int m = paramCharSequence.length();
/*   45 */     for (int n = 0; n < m; n++) {
/*   46 */       int i1 = paramCharSequence.charAt(n);
/*   47 */       if (0 == n) {
/*   48 */         if (45 == i1) {
/*   49 */           i = 1;
/*      */         }
/*   52 */         else if (i1 == 43);
/*      */       }
/*      */       else {
/*   54 */         if ((i1 >= 48) && (i1 <= 57)) { i1 -= 48;
/*   55 */         } else if ((i1 >= 65) && (i1 <= 90)) { i1 -= 55;
/*   56 */         } else if ((i1 >= 97) && (i1 <= 122)) { i1 -= 87;
/*      */         } else {
/*   58 */           bool1 = false;
/*   59 */           break label188;
/*      */         }
/*   61 */         if (i1 >= 10) {
/*   62 */           bool1 = false;
/*   63 */           break label188;
/*      */         }
/*   65 */         if (i != 0) i1 = -i1;
/*   66 */         int i2 = 10 * k + i1;
/*   67 */         if (k != i2 / 10) {
/*   68 */           bool1 = false;
/*   69 */           break label188;
/*      */         }
/*   71 */         k = i2;
/*   72 */         bool2 = true;
/*      */       }
/*      */     }
/*   74 */     boolean bool1 = bool2;
/*      */ 
/*   76 */     label188: return bool1;
/*      */   }
/*      */ 
/*      */   public static String v(CharSequence[] paramArrayOfCharSequence, int paramInt1, int paramInt2)
/*      */   {
/*   15 */     if (0 == paramInt2) return "";
/*   16 */     if (1 == paramInt2) {
/*   17 */       CharSequence localCharSequence1 = paramArrayOfCharSequence[paramInt1];
/*   18 */       if (null == localCharSequence1) return "null";
/*   19 */       return localCharSequence1.toString();
/*      */     }
/*   21 */     int i = paramInt2 + paramInt1;
/*   22 */     int k = 0;
/*   23 */     for (int m = paramInt1; m < i; m++) {
/*   24 */       CharSequence localCharSequence2 = paramArrayOfCharSequence[m];
/*   25 */       if (null == localCharSequence2) k += 4; else
/*   26 */         k += localCharSequence2.length();
/*      */     }
/*   28 */     StringBuilder localStringBuilder = new StringBuilder(k);
/*   29 */     for (int n = paramInt1; n < i; n++) {
/*   30 */       CharSequence localCharSequence3 = paramArrayOfCharSequence[n];
/*   31 */       if (null == localCharSequence3) localStringBuilder.append("null"); else
/*   32 */         localStringBuilder.append(localCharSequence3);
/*      */     }
/*   34 */     return localStringBuilder.toString();
/*      */   }
/*      */ 
/*      */   public static int b(CharSequence paramCharSequence, int paramInt)
/*      */   {
/*   80 */     return g.c(paramCharSequence, paramInt, true, (byte)-15);
/*      */   }
/*      */ 
/*      */   public static int y(CharSequence paramCharSequence, int paramInt, boolean paramBoolean) {
/*   84 */     if ((paramInt < 2) || (paramInt > 36)) throw new IllegalArgumentException("");
/*   85 */     int i = 0;
/*   86 */     int k = 0;
/*   87 */     int m = 0;
/*   88 */     int n = paramCharSequence.length();
/*   89 */     for (int i1 = 0; i1 < n; i1++) {
/*   90 */       int i2 = paramCharSequence.charAt(i1);
/*   91 */       if (i1 == 0) {
/*   92 */         if (i2 == 45) {
/*   93 */           i = 1;
/*      */         }
/*   96 */         else if ((i2 == 43) && (paramBoolean));
/*      */       }
/*      */       else {
/*   98 */         if ((i2 >= 48) && (i2 <= 57)) i2 -= 48;
/*   99 */         else if ((i2 >= 65) && (i2 <= 90)) i2 -= 55;
/*  100 */         else if ((i2 >= 97) && (i2 <= 122)) i2 -= 87; else
/*  101 */           throw new NumberFormatException();
/*  102 */         if (i2 >= paramInt) throw new NumberFormatException();
/*  103 */         if (i != 0) i2 = -i2;
/*  104 */         int i3 = m * paramInt + i2;
/*  105 */         if (m != i3 / paramInt) throw new NumberFormatException();
/*  106 */         m = i3;
/*  107 */         k = 1;
/*      */       }
/*      */     }
/*  109 */     if (k == 0) throw new NumberFormatException();
/*  110 */     return m;
/*      */   }
/*      */ 
/*      */   public static String f(int paramInt, boolean paramBoolean) {
/*  114 */     if ((!paramBoolean) || (paramInt < 0)) return Integer.toString(paramInt);
/*      */ 
/*  116 */     int i = paramInt;
/*      */     String str;
/*  119 */     if ((!paramBoolean) || (i < 0)) {
/*  120 */       str = Integer.toString(i, 10);
/*      */     }
/*      */     else {
/*  123 */       int k = 2;
/*  124 */       int m = i / 10;
/*  125 */       while (m != 0) {
/*  126 */         m /= 10;
/*  127 */         k++;
/*      */       }
/*  129 */       char[] arrayOfChar = new char[k];
/*  130 */       arrayOfChar[0] = '+';
/*  131 */       for (int n = k - 1; n > 0; n--) {
/*  132 */         int i1 = i;
/*  133 */         i /= 10;
/*  134 */         int i2 = i1 - i * 10;
/*  135 */         if (i2 >= 10) arrayOfChar[n] = ((char)(i2 + 87)); else
/*  136 */           arrayOfChar[n] = ((char)(48 + i2));
/*      */       }
/*  138 */       str = new String(arrayOfChar);
/*      */     }
/*  140 */     return str;
/*      */   }
/*      */ 
/*      */   public static int t(CharSequence paramCharSequence, int paramInt, boolean paramBoolean)
/*      */   {
/*   84 */     if ((paramInt < 2) || (paramInt > 36)) throw new IllegalArgumentException("");
/*   85 */     int i = 0;
/*   86 */     int k = 0;
/*   87 */     int m = 0;
/*   88 */     int n = paramCharSequence.length();
/*   89 */     for (int i1 = 0; i1 < n; i1++) {
/*   90 */       int i2 = paramCharSequence.charAt(i1);
/*   91 */       if (i1 == 0) {
/*   92 */         if (i2 == 45) {
/*   93 */           i = 1;
/*      */         }
/*   96 */         else if ((i2 == 43) && (paramBoolean));
/*      */       }
/*      */       else {
/*   98 */         if ((i2 >= 48) && (i2 <= 57)) i2 -= 48;
/*   99 */         else if ((i2 >= 65) && (i2 <= 90)) i2 -= 55;
/*  100 */         else if ((i2 >= 97) && (i2 <= 122)) i2 -= 87; else
/*  101 */           throw new NumberFormatException();
/*  102 */         if (i2 >= paramInt) throw new NumberFormatException();
/*  103 */         if (i != 0) i2 = -i2;
/*  104 */         int i3 = m * paramInt + i2;
/*  105 */         if (m != i3 / paramInt) throw new NumberFormatException();
/*  106 */         m = i3;
/*  107 */         k = 1;
/*      */       }
/*      */     }
/*  109 */     if (k == 0) throw new NumberFormatException();
/*  110 */     return m;
/*      */   }
/*      */ 
/*      */   public static int e(CharSequence paramCharSequence, int paramInt)
/*      */   {
/*   80 */     return g.c(paramCharSequence, paramInt, true, (byte)46);
/*      */   }
/*      */ 
/*      */   public static boolean o(char paramChar)
/*      */   {
/*  151 */     return ((paramChar >= 'A') && (paramChar <= 'Z')) || ((paramChar >= 'a') && (paramChar <= 'z'));
/*      */   }
/*      */ 
/*      */   cl()
/*      */     throws Throwable
/*      */   {
/*    7 */     throw new Error();
/*      */   }
/*      */ 
/*      */   public static String h(char paramChar, int paramInt)
/*      */   {
/*  174 */     char[] arrayOfChar = new char[paramInt];
/*  175 */     for (int i = 0; i < paramInt; i++) arrayOfChar[i] = paramChar;
/*  176 */     return new String(arrayOfChar);
/*      */   }
/*      */ 
/*      */   public static String x(char paramChar, int paramInt)
/*      */   {
/*  174 */     char[] arrayOfChar = new char[paramInt];
/*  175 */     for (int i = 0; i < paramInt; i++) arrayOfChar[i] = paramChar;
/*  176 */     return new String(arrayOfChar);
/*      */   }
/*      */ 
/*      */   public static int d(char paramChar, int paramInt, byte paramByte)
/*      */   {
/*   33 */     int i = paramChar << '\004';
/*   34 */     if (!Character.isUpperCase(paramChar)) { if ((paramByte < 1) && (!Character.isTitleCase(paramChar))) break label50; if (paramByte >= 1) throw new IllegalStateException(); 
/*      */     }
/*   35 */     paramChar = Character.toLowerCase(paramChar);
/*   36 */     i = (paramChar << '\004') + 1;
/*      */ 
/*   38 */     label50: return i;
/*      */   }
/*      */ 
/*      */   static final void ez(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/* 5072 */     if (paramInt1 >= 128) { if (paramInt4 <= 586541261) return; if ((paramInt2 >= 128) && ((paramInt4 <= 586541261) || (paramInt1 <= 13056))) { if (paramInt4 <= 586541261) throw new IllegalStateException(); if (paramInt2 <= 13056) break label78; if (paramInt4 <= 586541261); } }
/* 5073 */     client.hm = -514857741;
/* 5074 */     client.hu = -46892809;
/* 5075 */     return;
/*      */ 
/* 5077 */     label78: int i = bw.ev(paramInt1, paramInt2, 409487383 * al.in, -1449198630) - paramInt3;
/* 5078 */     paramInt1 -= ct.gw * 1778771857;
/* 5079 */     i -= -2117795425 * bv.gn;
/* 5080 */     paramInt2 -= 1226331393 * y.gj;
/* 5081 */     int k = fx.an[(bb.gk * 375042907)];
/* 5082 */     int m = fx.ah[(375042907 * bb.gk)];
/* 5083 */     int n = fx.an[(-909703631 * bs.gx)];
/* 5084 */     int i1 = fx.ah[(bs.gx * -909703631)];
/* 5085 */     int i2 = n * paramInt2 + i1 * paramInt1 >> 16;
/* 5086 */     paramInt2 = paramInt2 * i1 - paramInt1 * n >> 16;
/* 5087 */     paramInt1 = i2;
/* 5088 */     i2 = m * i - k * paramInt2 >> 16;
/* 5089 */     paramInt2 = k * i + m * paramInt2 >> 16;
/* 5090 */     i = i2;
/* 5091 */     if (paramInt2 >= 50) { if (paramInt4 <= 586541261) return;
/* 5092 */       client.hm = ((paramInt1 << 9) / paramInt2 + 256) * 514857741;
/* 5093 */       client.hu = 46892809 * ((i << 9) / paramInt2 + 167);
/*      */     } else
/*      */     {
/* 5096 */       client.hm = -514857741;
/* 5097 */       client.hu = -46892809;
/*      */     }
/*      */   }
/*      */ 
/*      */   public static final void r(long paramLong)
/*      */   {
/*    9 */     if (paramLong <= 0L) return;
/*   10 */     if (paramLong % 10L == 0L) {
/*   11 */       dr.d(paramLong - 1L);
/*   12 */       dr.d(1L);
/*      */     } else {
/*   14 */       dr.d(paramLong);
/*      */     }
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     cl
 * JD-Core Version:    0.6.2
 */