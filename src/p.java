/*      */ public class p
/*      */ {
/*      */   int m;
/*      */   static final int d = 7;
/*      */   int c;
/*      */   static final int r = 14;
/*      */   static final int l = 6;
/*      */   int[][] n;
/*      */   static eg q;
/*      */ 
/*      */   int i(int paramInt)
/*      */   {
/*   71 */     if (this.n != null) paramInt = 6 + (int)(paramInt * (this.c * -99257707) / (212094277 * this.m));
/*   72 */     return paramInt;
/*      */   }
/*      */ 
/*      */   int q(int paramInt)
/*      */   {
/*   66 */     if (null != this.n) paramInt = (int)(-99257707 * this.c * paramInt / (212094277 * this.m));
/*   67 */     return paramInt;
/*      */   }
/*      */ 
/*      */   int d(int paramInt, short paramShort)
/*      */   {
/*   66 */     if (null != this.n) { if (paramShort >= 180) throw new IllegalStateException(); paramInt = (int)(-99257707 * this.c * paramInt / (212094277 * this.m)); }
/*   67 */     return paramInt;
/*      */   }
/*      */ 
/*      */   int l(int paramInt1, int paramInt2) {
/*   71 */     if (this.n != null) { if (paramInt2 != -1784891884);
/*   71 */       paramInt1 = 6 + (int)(paramInt1 * (this.c * -99257707) / (212094277 * this.m)); }
/*   72 */     return paramInt1;
/*      */   }
/*      */ 
/*      */   byte[] z(byte[] paramArrayOfByte)
/*      */   {
/*   40 */     if (this.n != null) {
/*   41 */       int i = (int)(this.c * -99257707 * paramArrayOfByte.length / (this.m * 212094277)) + 14;
/*   42 */       int[] arrayOfInt1 = new int[i];
/*   43 */       int j = 0;
/*   44 */       int k = 0;
/*      */       int i2;
/*   45 */       for (int i1 = 0; i1 < paramArrayOfByte.length; i1++) {
/*   46 */         i2 = paramArrayOfByte[i1];
/*   47 */         int[] arrayOfInt2 = this.n[k];
/*   48 */         for (int i3 = 0; i3 < 14; i3++) arrayOfInt1[(j + i3)] += i2 * arrayOfInt2[i3];
/*   49 */         k += this.c * -99257707;
/*   50 */         i3 = k / (this.m * 212094277);
/*   51 */         j += i3;
/*   52 */         k -= i3 * (this.m * 212094277);
/*      */       }
/*   54 */       paramArrayOfByte = new byte[i];
/*   55 */       for (i1 = 0; i1 < i; i1++) {
/*   56 */         i2 = arrayOfInt1[i1] + 32768 >> 16;
/*   57 */         if (i2 < -128) paramArrayOfByte[i1] = -128;
/*   58 */         else if (i2 > 127) paramArrayOfByte[i1] = 127; else
/*   59 */           paramArrayOfByte[i1] = ((byte)i2);
/*      */       }
/*      */     }
/*   62 */     return paramArrayOfByte;
/*      */   }
/*      */ 
/*      */   byte[] c(byte[] paramArrayOfByte)
/*      */   {
/*   40 */     if (this.n != null) {
/*   41 */       int i = (int)(this.c * -99257707 * paramArrayOfByte.length / (this.m * 212094277)) + 14;
/*   42 */       int[] arrayOfInt1 = new int[i];
/*   43 */       int j = 0;
/*   44 */       int k = 0;
/*      */       int i2;
/*   45 */       for (int i1 = 0; i1 < paramArrayOfByte.length; i1++) {
/*   46 */         i2 = paramArrayOfByte[i1];
/*   47 */         int[] arrayOfInt2 = this.n[k];
/*   48 */         for (int i3 = 0; i3 < 14; i3++) arrayOfInt1[(j + i3)] += i2 * arrayOfInt2[i3];
/*   49 */         k += this.c * -99257707;
/*   50 */         i3 = k / (this.m * 212094277);
/*   51 */         j += i3;
/*   52 */         k -= i3 * (this.m * 212094277);
/*      */       }
/*   54 */       paramArrayOfByte = new byte[i];
/*   55 */       for (i1 = 0; i1 < i; i1++) {
/*   56 */         i2 = arrayOfInt1[i1] + 32768 >> 16;
/*   57 */         if (i2 < -128) paramArrayOfByte[i1] = -128;
/*   58 */         else if (i2 > 127) paramArrayOfByte[i1] = 127; else
/*   59 */           paramArrayOfByte[i1] = ((byte)i2);
/*      */       }
/*      */     }
/*   62 */     return paramArrayOfByte;
/*      */   }
/*      */ 
/*      */   byte[] n(byte[] paramArrayOfByte)
/*      */   {
/*   40 */     if (this.n != null) {
/*   41 */       int i = (int)(this.c * -99257707 * paramArrayOfByte.length / (this.m * 212094277)) + 14;
/*   42 */       int[] arrayOfInt1 = new int[i];
/*   43 */       int j = 0;
/*   44 */       int k = 0;
/*      */       int i2;
/*   45 */       for (int i1 = 0; i1 < paramArrayOfByte.length; i1++) {
/*   46 */         i2 = paramArrayOfByte[i1];
/*   47 */         int[] arrayOfInt2 = this.n[k];
/*   48 */         for (int i3 = 0; i3 < 14; i3++) arrayOfInt1[(j + i3)] += i2 * arrayOfInt2[i3];
/*   49 */         k += this.c * -99257707;
/*   50 */         i3 = k / (this.m * 212094277);
/*   51 */         j += i3;
/*   52 */         k -= i3 * (this.m * 212094277);
/*      */       }
/*   54 */       paramArrayOfByte = new byte[i];
/*   55 */       for (i1 = 0; i1 < i; i1++) {
/*   56 */         i2 = arrayOfInt1[i1] + 32768 >> 16;
/*   57 */         if (i2 < -128) paramArrayOfByte[i1] = -128;
/*   58 */         else if (i2 > 127) paramArrayOfByte[i1] = 127; else
/*   59 */           paramArrayOfByte[i1] = ((byte)i2);
/*      */       }
/*      */     }
/*   62 */     return paramArrayOfByte;
/*      */   }
/*      */ 
/*      */   byte[] m(byte[] paramArrayOfByte)
/*      */   {
/*   40 */     if (this.n != null) {
/*   41 */       int i = (int)(this.c * -99257707 * paramArrayOfByte.length / (this.m * 212094277)) + 14;
/*   42 */       int[] arrayOfInt1 = new int[i];
/*   43 */       int j = 0;
/*   44 */       int k = 0;
/*      */       int i2;
/*   45 */       for (int i1 = 0; i1 < paramArrayOfByte.length; i1++) {
/*   46 */         i2 = paramArrayOfByte[i1];
/*   47 */         int[] arrayOfInt2 = this.n[k];
/*   48 */         for (int i3 = 0; i3 < 14; i3++) arrayOfInt1[(j + i3)] += i2 * arrayOfInt2[i3];
/*   49 */         k += this.c * -99257707;
/*   50 */         i3 = k / (this.m * 212094277);
/*   51 */         j += i3;
/*   52 */         k -= i3 * (this.m * 212094277);
/*      */       }
/*   54 */       paramArrayOfByte = new byte[i];
/*   55 */       for (i1 = 0; i1 < i; i1++) {
/*   56 */         i2 = arrayOfInt1[i1] + 32768 >> 16;
/*   57 */         if (i2 < -128) paramArrayOfByte[i1] = -128;
/*   58 */         else if (i2 > 127) paramArrayOfByte[i1] = 127; else
/*   59 */           paramArrayOfByte[i1] = ((byte)i2);
/*      */       }
/*      */     }
/*   62 */     return paramArrayOfByte;
/*      */   }
/*      */ 
/*      */   public p(int paramInt1, int paramInt2)
/*      */   {
/*   14 */     if (paramInt1 == paramInt2) return;
/*   15 */     int i = av.r(paramInt1, paramInt2, (byte)82);
/*   16 */     paramInt1 /= i;
/*   17 */     paramInt2 /= i;
/*   18 */     this.m = (-868729459 * paramInt1);
/*   19 */     this.c = (1452198077 * paramInt2);
/*   20 */     this.n = new int[paramInt1][14];
/*   21 */     for (int j = 0; j < paramInt1; j++) {
/*   22 */       int[] arrayOfInt = this.n[j];
/*   23 */       double d1 = j / paramInt1 + 6.0D;
/*   24 */       int k = (int)Math.floor(1.0D + (d1 - 7.0D));
/*   25 */       if (k < 0) k = 0;
/*   26 */       int i1 = (int)Math.ceil(7.0D + d1);
/*   27 */       if (i1 > 14) i1 = 14;
/*   28 */       double d2 = paramInt2 / paramInt1;
/*   29 */       for (; k < i1; k++) {
/*   30 */         double d3 = (k - d1) * 3.141592653589793D;
/*   31 */         double d4 = d2;
/*   32 */         if ((d3 < -0.0001D) || (d3 > 0.0001D)) d4 *= Math.sin(d3) / d3;
/*   33 */         d4 *= (0.54D + 0.46D * Math.cos(0.2243994752564138D * (k - d1)));
/*   34 */         arrayOfInt[k] = ((int)Math.floor(d4 * 65536.0D + 0.5D));
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   int g(int paramInt)
/*      */   {
/*   66 */     if (null != this.n) paramInt = (int)(-99257707 * this.c * paramInt / (212094277 * this.m));
/*   67 */     return paramInt;
/*      */   }
/*      */ 
/*      */   byte[] r(byte[] paramArrayOfByte, int paramInt)
/*      */   {
/*   40 */     if (this.n != null) { if (paramInt >= -1888320993) throw new IllegalStateException();
/*   41 */       int i = (int)(this.c * -99257707 * paramArrayOfByte.length / (this.m * 212094277)) + 14;
/*   42 */       int[] arrayOfInt1 = new int[i];
/*   43 */       int j = 0;
/*   44 */       int k = 0;
/*      */       int i2;
/*   45 */       for (int i1 = 0; i1 < paramArrayOfByte.length; i1++) { if (paramInt >= -1888320993) throw new IllegalStateException();
/*   46 */         i2 = paramArrayOfByte[i1];
/*   47 */         int[] arrayOfInt2 = this.n[k];
/*   48 */         for (int i3 = 0; i3 < 14; i3++) { if (paramInt >= -1888320993) throw new IllegalStateException(); arrayOfInt1[(j + i3)] += i2 * arrayOfInt2[i3]; }
/*   49 */         k += this.c * -99257707;
/*   50 */         i3 = k / (this.m * 212094277);
/*   51 */         j += i3;
/*   52 */         k -= i3 * (this.m * 212094277);
/*      */       }
/*   54 */       paramArrayOfByte = new byte[i];
/*   55 */       for (i1 = 0; i1 < i; i1++) { if (paramInt < -1888320993);
/*   56 */         i2 = arrayOfInt1[i1] + 32768 >> 16;
/*   57 */         if (i2 < -128) { if (paramInt >= -1888320993) throw new IllegalStateException(); paramArrayOfByte[i1] = -128;
/*   58 */         } else if (i2 > 127) { if (paramInt < -1888320993);
/*   58 */           paramArrayOfByte[i1] = 127; } else {
/*   59 */           paramArrayOfByte[i1] = ((byte)i2);
/*      */         } }
/*      */     }
/*   62 */     return paramArrayOfByte;
/*      */   }
/*      */ 
/*      */   byte[] j(byte[] paramArrayOfByte)
/*      */   {
/*   40 */     if (this.n != null) {
/*   41 */       int i = (int)(this.c * -99257707 * paramArrayOfByte.length / (this.m * 212094277)) + 14;
/*   42 */       int[] arrayOfInt1 = new int[i];
/*   43 */       int j = 0;
/*   44 */       int k = 0;
/*      */       int i2;
/*   45 */       for (int i1 = 0; i1 < paramArrayOfByte.length; i1++) {
/*   46 */         i2 = paramArrayOfByte[i1];
/*   47 */         int[] arrayOfInt2 = this.n[k];
/*   48 */         for (int i3 = 0; i3 < 14; i3++) arrayOfInt1[(j + i3)] += i2 * arrayOfInt2[i3];
/*   49 */         k += this.c * -99257707;
/*   50 */         i3 = k / (this.m * 212094277);
/*   51 */         j += i3;
/*   52 */         k -= i3 * (this.m * 212094277);
/*      */       }
/*   54 */       paramArrayOfByte = new byte[i];
/*   55 */       for (i1 = 0; i1 < i; i1++) {
/*   56 */         i2 = arrayOfInt1[i1] + 32768 >> 16;
/*   57 */         if (i2 < -128) paramArrayOfByte[i1] = -128;
/*   58 */         else if (i2 > 127) paramArrayOfByte[i1] = 127; else
/*   59 */           paramArrayOfByte[i1] = ((byte)i2);
/*      */       }
/*      */     }
/*   62 */     return paramArrayOfByte;
/*      */   }
/*      */ 
/*      */   public static char r(char paramChar, int paramInt1, int paramInt2)
/*      */   {
/*    9 */     if (paramChar >= 'À') { if (paramInt2 >= -125965859) throw new IllegalStateException(); if (paramChar <= 'ÿ') { if ((paramInt2 >= -125965859) || 
/*   10 */           (paramChar >= 'À')) { if (paramInt2 >= -125965859) throw new IllegalStateException(); if (paramChar <= 'Æ') { if (paramInt2 >= -125965859) throw new IllegalStateException(); return 'A'; } }
/*   11 */         if ('Ç' == paramChar) { if (paramInt2 < -125965859);
/*   11 */           return 'C'; }
/*   12 */         if ((paramChar >= 'È') && ((paramInt2 >= -125965859) || (paramChar <= 'Ë'))) { if (paramInt2 >= -125965859) throw new IllegalStateException(); return 'E'; }
/*   13 */         if (paramChar >= 'Ì') { if (paramInt2 >= -125965859) throw new IllegalStateException(); if (paramChar <= 'Ï') { if (paramInt2 < -125965859);
/*   13 */             return 'I'; } }
/*   14 */         if ((paramChar >= 'Ò') && ((paramInt2 >= -125965859) || (paramChar <= 'Ö'))) { if (paramInt2 < -125965859);
/*   14 */           return 'O'; }
/*   15 */         if ((paramChar >= 'Ù') && ((paramInt2 >= -125965859) || (paramChar <= 'Ü'))) { if (paramInt2 >= -125965859) throw new IllegalStateException(); return 'U'; }
/*   16 */         if ('Ý' == paramChar) { if (paramInt2 >= -125965859) throw new IllegalStateException(); return 'Y'; }
/*   17 */         if ('ß' == paramChar) { if (paramInt2 < -125965859);
/*   17 */           return 's'; }
/*   18 */         if (paramChar >= 'à') { if (paramInt2 >= -125965859) throw new IllegalStateException(); if (paramChar <= 'æ') { if (paramInt2 >= -125965859) throw new IllegalStateException(); return 'a'; } }
/*   19 */         if (paramChar == 'ç') { if (paramInt2 < -125965859);
/*   19 */           return 'c'; }
/*   20 */         if ((paramChar >= 'è') && ((paramInt2 >= -125965859) || (paramChar <= 'ë'))) { if (paramInt2 < -125965859);
/*   20 */           return 'e'; }
/*   21 */         if (paramChar >= 'ì') { if (paramInt2 >= -125965859) throw new IllegalStateException(); if (paramChar <= 'ï') { if (paramInt2 < -125965859);
/*   21 */             return 'i'; } }
/*   22 */         if ((paramChar >= 'ò') && ((paramInt2 >= -125965859) || (paramChar <= 'ö'))) { if (paramInt2 >= -125965859) throw new IllegalStateException(); return 'o'; }
/*   23 */         if (paramChar >= 'ù') { if (paramInt2 >= -125965859) throw new IllegalStateException(); if (paramChar <= 'ü') { if (paramInt2 < -125965859);
/*   23 */             return 'u'; } }
/*   24 */         if (paramChar != 'ý') { if (paramInt2 >= -125965859) throw new IllegalStateException(); if ('ÿ' != paramChar) break label558; if (paramInt2 >= -125965859); } return 'y'; }
/*      */     }
/*   26 */     label558: if ('Œ' == paramChar) { if (paramInt2 < -125965859);
/*   26 */       return 'O'; }
/*   27 */     if (paramChar == 'œ') { if (paramInt2 >= -125965859) throw new IllegalStateException(); return 'o'; }
/*   28 */     if ('Ÿ' == paramChar) { if (paramInt2 < -125965859);
/*   28 */       return 'Y'; }
/*   29 */     return paramChar;
/*      */   }
/*      */ 
/*      */   // ERROR //
/*      */   public static void d(boolean paramBoolean, int paramInt)
/*      */   {
/*      */     // Byte code:
/*      */     //   0: aconst_null
/*      */     //   1: getstatic 104	g:r	Lam;
/*      */     //   4: if_acmpne +13 -> 17
/*      */     //   7: iload_1
/*      */     //   8: ldc 105
/*      */     //   10: if_icmpgt +6 -> 16
/*      */     //   13: goto +0 -> 13
/*      */     //   16: return
/*      */     //   17: new 107	ev
/*      */     //   20: dup
/*      */     //   21: iconst_4
/*      */     //   22: invokespecial 110	ev:<init>	(I)V
/*      */     //   25: astore_2
/*      */     //   26: aload_2
/*      */     //   27: iload_0
/*      */     //   28: ifeq +16 -> 44
/*      */     //   31: iload_1
/*      */     //   32: ldc 105
/*      */     //   34: if_icmpgt +6 -> 40
/*      */     //   37: goto +3 -> 40
/*      */     //   40: iconst_2
/*      */     //   41: goto +4 -> 45
/*      */     //   44: iconst_3
/*      */     //   45: ldc 111
/*      */     //   47: invokevirtual 113	ev:c	(II)V
/*      */     //   50: aload_2
/*      */     //   51: iconst_0
/*      */     //   52: bipush 46
/*      */     //   54: invokevirtual 116	ev:j	(IB)V
/*      */     //   57: getstatic 104	g:r	Lam;
/*      */     //   60: aload_2
/*      */     //   61: getfield 118	ev:m	[B
/*      */     //   64: iconst_0
/*      */     //   65: iconst_4
/*      */     //   66: ldc 119
/*      */     //   68: invokevirtual 124	am:z	([BIII)V
/*      */     //   71: goto +29 -> 100
/*      */     //   74: astore_2
/*      */     //   75: getstatic 104	g:r	Lam;
/*      */     //   78: ldc 125
/*      */     //   80: invokevirtual 127	am:m	(I)V
/*      */     //   83: goto +4 -> 87
/*      */     //   86: astore_3
/*      */     //   87: getstatic 132	cu:h	I
/*      */     //   90: ldc 133
/*      */     //   92: iadd
/*      */     //   93: putstatic 132	cu:h	I
/*      */     //   96: aconst_null
/*      */     //   97: putstatic 104	g:r	Lam;
/*      */     //   100: return
/*      */     //
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   17	71	74	java/io/IOException
/*      */     //   75	83	86	java/lang/Exception
/*      */   }
/*      */ 
/*      */   static final void dh(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/* 4425 */     if ((client.nt * -1304364045 != 0) && ((paramInt3 >= 679908575) || (-1304364045 * client.nt != 3))) { if (paramInt3 >= 679908575) return; return; }
/* 4426 */     if (1 == an.u * -312511045) { if (paramInt3 < 679908575);
/* 4427 */       int i = 429599329 * an.v - 25 - paramInt1;
/* 4428 */       int j = an.w * -374516205 - 5 - paramInt2;
/* 4429 */       if ((i >= 0) && ((paramInt3 >= 679908575) || (j >= 0))) { if (paramInt3 >= 679908575) return; if ((i < 146) && ((paramInt3 >= 679908575) || (j < 151))) { if (paramInt3 >= 679908575) throw new IllegalStateException();
/* 4430 */           i -= 73;
/* 4431 */           j -= 75;
/* 4432 */           int k = client.fc * -387887155 + 1168764363 * client.gz & 0x7FF;
/* 4433 */           int i1 = fx.an[k];
/* 4434 */           int i2 = fx.ah[k];
/* 4435 */           i1 = (256 + client.fj * -936091237) * i1 >> 8;
/* 4436 */           i2 = (-936091237 * client.fj + 256) * i2 >> 8;
/* 4437 */           int i3 = j * i1 + i * i2 >> 11;
/* 4438 */           int i4 = j * i2 - i * i1 >> 11;
/* 4439 */           int i5 = i3 + -1481433155 * cr.ii.j >> 7;
/* 4440 */           int i6 = -1453593105 * cr.ii.z - i4 >> 7;
/* 4441 */           boolean bool = eh.el(cr.ii.bt[0], cr.ii.bw[0], i5, i6, true, 0, 0, 0, 0, 0, 1, (short)11438);
/* 4442 */           if (bool) { if (paramInt3 < 679908575);
/* 4443 */             client.df.c(i, 2078623730);
/* 4444 */             client.df.c(j, 1739228660);
/* 4445 */             client.df.n(1168764363 * client.gz, 1418493117);
/* 4446 */             client.df.c(57, 1313580170);
/* 4447 */             client.df.c(client.fc * -387887155, 1860649835);
/* 4448 */             client.df.c(-936091237 * client.fj, 1681351854);
/* 4449 */             client.df.c(89, 1718505298);
/* 4450 */             client.df.n(-1481433155 * cr.ii.j, 1923739626);
/* 4451 */             client.df.n(-1453593105 * cr.ii.z, -361627140);
/* 4452 */             client.df.c(client.ee * 634338979, 1812281610);
/* 4453 */             client.df.c(63, 1357400491);
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void de(fz paramfz, int paramInt)
/*      */   {
/* 4808 */     paramfz.q = false;
/* 4809 */     if (paramfz.ak * -818747733 != -1) { if (paramInt <= 286331153) return;
/* 4810 */       eo localeo1 = i.g(paramfz.ak * -818747733, (byte)0);
/* 4811 */       if (null != localeo1) { if (paramInt <= 286331153) return; if (localeo1.i != null) { if (paramInt <= 286331153) return;
/* 4812 */           paramfz.an += 760991339;
/* 4813 */           if ((-1158034013 * paramfz.az < localeo1.i.length) && ((paramInt <= 286331153) || (513109571 * paramfz.an > localeo1.u[(paramfz.az * -1158034013)]))) { if (paramInt > 286331153);
/* 4814 */             paramfz.an = 760991339;
/* 4815 */             paramfz.az += -742797813;
/* 4816 */             de.dv(localeo1, paramfz.az * -1158034013, paramfz.j * -1481433155, paramfz.z * -1453593105, 1509628094);
/*      */           }
/* 4818 */           if (paramfz.az * -1158034013 < localeo1.i.length) break label250; if (paramInt <= 286331153) throw new IllegalStateException();
/* 4819 */           paramfz.an = 0;
/* 4820 */           paramfz.az = 0;
/* 4821 */           de.dv(localeo1, paramfz.az * -1158034013, paramfz.j * -1481433155, -1453593105 * paramfz.z, 1509628094); break label250;
/*      */         }
/*      */       }
/* 4824 */       paramfz.ak = 1293556733;
/*      */     }
/* 4826 */     label250: if ((-1 != paramfz.ag * -694844223) && ((paramInt <= 286331153) || (client.au * 1513618129 >= paramfz.at * 1715068443))) { if (paramInt <= 286331153) return;
/* 4827 */       if (1776455891 * paramfz.ar < 0) { if (paramInt <= 286331153) return; paramfz.ar = 0; }
/* 4828 */       int i = cm.z(-694844223 * paramfz.ag, (byte)59).s * -1017417001;
/* 4829 */       if (-1 != i) { if (paramInt > 286331153);
/* 4830 */         eo localeo3 = i.g(i, (byte)0);
/* 4831 */         if (localeo3 != null) { if (paramInt <= 286331153) return; if (localeo3.i != null) { if (paramInt > 286331153);
/* 4832 */             paramfz.aq += -1935697383;
/* 4833 */             if (paramfz.ar * 1776455891 < localeo3.i.length) { if (paramInt <= 286331153) return; if (paramfz.aq * -1730076119 > localeo3.u[(1776455891 * paramfz.ar)]) { if (paramInt > 286331153);
/* 4834 */                 paramfz.aq = -1935697383;
/* 4835 */                 paramfz.ar += -788248741;
/* 4836 */                 de.dv(localeo3, paramfz.ar * 1776455891, paramfz.j * -1481433155, -1453593105 * paramfz.z, 1509628094); }
/*      */             }
/* 4838 */             if (1776455891 * paramfz.ar < localeo3.i.length) break label593; if (paramInt <= 286331153) throw new IllegalStateException();
/* 4839 */             if (paramfz.ar * 1776455891 >= 0) { if ((paramInt > 286331153) && (paramfz.ar * 1776455891 < localeo3.i.length)) break label593; if (paramInt <= 286331153) return;  } paramfz.ag = 1818948799; break label593;
/*      */           }
/*      */         }
/* 4842 */         paramfz.ag = 1818948799;
/*      */       } else {
/* 4844 */         paramfz.ag = 1818948799;
/*      */       }
/*      */     }
/* 4846 */     label593: eo localeo2;
/* 4846 */     if ((-1085803875 * paramfz.ah != -1) && ((paramInt <= 286331153) || (-1548016099 * paramfz.ab <= 1))) { if (paramInt > 286331153);
/* 4847 */       localeo2 = i.g(-1085803875 * paramfz.ah, (byte)0);
/* 4848 */       if ((localeo2.o * 1295492493 == 1) && ((paramInt <= 286331153) || (894843567 * paramfz.bf > 0))) { if (paramInt <= 286331153) return;
/* 4849 */         if ((paramfz.aw * 946849601 <= 1513618129 * client.au) && ((paramInt <= 286331153) || (paramfz.af * -940170599 < 1513618129 * client.au))) { if (paramInt <= 286331153) throw new IllegalStateException();
/* 4850 */           paramfz.ab = 1774898229;
/* 4851 */           return;
/*      */         }
/*      */       }
/*      */     }
/* 4855 */     if ((paramfz.ah * -1085803875 != -1) && ((paramInt <= 286331153) || (paramfz.ab * -1548016099 == 0))) { if (paramInt <= 286331153) return;
/* 4856 */       localeo2 = i.g(-1085803875 * paramfz.ah, (byte)0);
/* 4857 */       if (localeo2 != null) { if (paramInt <= 286331153) return; if (localeo2.i != null) { if (paramInt > 286331153);
/* 4858 */           paramfz.al += -676052995;
/* 4859 */           if ((804831839 * paramfz.ay < localeo2.i.length) && ((paramInt <= 286331153) || (1655903573 * paramfz.al > localeo2.u[(paramfz.ay * 804831839)]))) { if (paramInt <= 286331153) return;
/* 4860 */             paramfz.al = -676052995;
/* 4861 */             paramfz.ay += -319022689;
/* 4862 */             de.dv(localeo2, paramfz.ay * 804831839, paramfz.j * -1481433155, paramfz.z * -1453593105, 1509628094);
/*      */           }
/* 4864 */           if (paramfz.ay * 804831839 >= localeo2.i.length) { if (paramInt <= 286331153) throw new IllegalStateException();
/* 4865 */             paramfz.ay -= localeo2.w * -1293431735;
/* 4866 */             paramfz.ao += -1889656743;
/* 4867 */             if (paramfz.ao * 448735209 >= 1569791439 * localeo2.k) { if (paramInt > 286331153);
/* 4867 */               paramfz.ah = -1995318197; } else {
/* 4868 */               if (paramfz.ay * 804831839 >= 0) { if (paramInt <= 286331153) throw new IllegalStateException(); if (804831839 * paramfz.ay < localeo2.i.length) break label1116; if (paramInt <= 286331153); } paramfz.ah = -1995318197; break label1145;
/* 4869 */               label1116: de.dv(localeo2, 804831839 * paramfz.ay, paramfz.j * -1481433155, -1453593105 * paramfz.z, 1509628094);
/*      */             } }
/* 4871 */           label1145: paramfz.q = localeo2.b; break label1163; }
/*      */       }
/* 4873 */       paramfz.ah = -1995318197;
/*      */     }
/* 4875 */     label1163: if (paramfz.ab * -1548016099 > 0) { if (paramInt <= 286331153) throw new IllegalStateException(); paramfz.ab -= 1774898229;
/*      */     }
/*      */   }
/*      */ 
/*      */   public static fd g(int paramInt1, int paramInt2)
/*      */   {
/*   33 */     fd localfd = (fd)fd.g.r(paramInt1);
/*   34 */     if (localfd != null) { if (paramInt2 > -1427188652);
/*   34 */       return localfd; }
/*   35 */     byte[] arrayOfByte = fd.n.l(3, paramInt1, 156967201);
/*   36 */     localfd = new fd();
/*   37 */     if (arrayOfByte != null) { if (paramInt2 > -1427188652);
/*   37 */       localfd.q(new ev(arrayOfByte), -1801985824); }
/*   38 */     fd.g.l(localfd, paramInt1);
/*   39 */     return localfd;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     p
 * JD-Core Version:    0.6.2
 */