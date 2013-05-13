/*      */ public final class bh
/*      */ {
/*      */   int c;
/*      */   int j;
/*      */   int l;
/*      */   int n;
/*      */   int r;
/*      */   int d;
/*      */   int m;
/*      */   public fu z;
/*      */   public fu g;
/*   13 */   public int q = 0;
/*   14 */   int i = 0;
/*      */ 
/*      */   public static String d(CharSequence paramCharSequence, da paramda, int paramInt)
/*      */   {
/*   40 */     if (null == paramCharSequence) { if (paramInt != -273626565) throw new IllegalStateException(); return null; }
/*   41 */     int k = 0;
/*   42 */     int i1 = paramCharSequence.length();
/*      */     int i3;
/*   45 */     while (k < i1) { if (paramInt != -273626565) throw new IllegalStateException();
/*      */ 
/*   47 */       i3 = paramCharSequence.charAt(k);
/*      */ 
/*   49 */       if ((160 != i3) && ((paramInt != -273626565) || ((32 != i3) && ((paramInt != -273626565) || (i3 != 95))))) if (paramInt != -273626565); i2 = (paramInt != -273626565) || (i3 == 45) ? 1 : 0;
/*      */ 
/*   51 */       if (i2 != 0) { if (paramInt != -273626565) throw new IllegalStateException();  } else {
/*   52 */         break;
/*      */       }
/*      */ 
/*   55 */       k++;
/*      */     }
/*      */ 
/*   59 */     while (i1 > k) { if (paramInt == -273626565);
/*   61 */       i3 = paramCharSequence.charAt(i1 - 1);
/*      */ 
/*   63 */       if ((i3 != 160) && ((paramInt != -273626565) || (32 != i3))) { if (paramInt != -273626565) throw new IllegalStateException(); if (95 != i3) if (paramInt != -273626565);  } i2 = (paramInt != -273626565) || (45 == i3) ? 1 : 0;
/*      */ 
/*   65 */       if (i2 != 0) { if (paramInt != -273626565) throw new IllegalStateException();  } else {
/*   66 */         break;
/*      */       }
/*      */ 
/*   69 */       i1--;
/*      */     }
/*   71 */     int i2 = i1 - k;
/*      */ 
/*   73 */     if (i2 >= 1) { if (paramInt != -273626565) throw new IllegalStateException();
/*   74 */       i3 = i2;
/*      */ 
/*   77 */       if (null == paramda) { if (paramInt != -273626565) throw new IllegalStateException();
/*   78 */         i4 = 12;
/*      */       } else
/*      */       {
/*   81 */         switch (-1033150515 * paramda.g) {
/*      */         default:
/*   83 */           i4 = 12;
/*   84 */           break;
/*      */         case 3:
/*   86 */           i4 = 20;
/*      */         }
/*      */       }
/*      */ 
/*   90 */       if (i3 <= i4) { if (paramInt != -273626565) throw new IllegalStateException(); break label417; }
/*      */     }
/*   92 */     return null;
/*      */ 
/*   94 */     label417: StringBuilder localStringBuilder = new StringBuilder(i2);
/*   95 */     for (int i4 = k; i4 < i1; i4++) { if (paramInt != -273626565) throw new IllegalStateException();
/*   96 */       char c1 = paramCharSequence.charAt(i4);
/*   97 */       if (!au.r(c1, -321324546)) { if (paramInt != -273626565); }
/*      */       else
/*      */       {
/*      */         char c2;
/*  100 */         switch (c1) {
/*      */         case 'À':
/*      */         case 'Á':
/*      */         case 'Â':
/*      */         case 'Ã':
/*      */         case 'Ä':
/*      */         case 'à':
/*      */         case 'á':
/*      */         case 'â':
/*      */         case 'ã':
/*      */         case 'ä':
/*  111 */           c2 = 'a';
/*  112 */           break;
/*      */         case ' ':
/*      */         case '-':
/*      */         case '_':
/*      */         case ' ':
/*  117 */           c2 = '_';
/*  118 */           break;
/*      */         case 'ÿ':
/*      */         case 'Ÿ':
/*  121 */           c2 = 'y';
/*  122 */           break;
/*      */         case '#':
/*      */         case '[':
/*      */         case ']':
/*  126 */           c2 = c1;
/*  127 */           break;
/*      */         case 'Ñ':
/*      */         case 'ñ':
/*  130 */           c2 = 'n';
/*  131 */           break;
/*      */         case 'Ù':
/*      */         case 'Ú':
/*      */         case 'Û':
/*      */         case 'Ü':
/*      */         case 'ù':
/*      */         case 'ú':
/*      */         case 'û':
/*      */         case 'ü':
/*  140 */           c2 = 'u';
/*  141 */           break;
/*      */         case 'Í':
/*      */         case 'Î':
/*      */         case 'Ï':
/*      */         case 'í':
/*      */         case 'î':
/*      */         case 'ï':
/*  148 */           c2 = 'i';
/*  149 */           break;
/*      */         default:
/*  151 */           c2 = Character.toLowerCase(c1);
/*  152 */           break;
/*      */         case 'Ç':
/*      */         case 'ç':
/*  155 */           c2 = 'c';
/*  156 */           break;
/*      */         case 'È':
/*      */         case 'É':
/*      */         case 'Ê':
/*      */         case 'Ë':
/*      */         case 'è':
/*      */         case 'é':
/*      */         case 'ê':
/*      */         case 'ë':
/*  165 */           c2 = 'e';
/*  166 */           break;
/*      */         case 'Ò':
/*      */         case 'Ó':
/*      */         case 'Ô':
/*      */         case 'Õ':
/*      */         case 'Ö':
/*      */         case 'ò':
/*      */         case 'ó':
/*      */         case 'ô':
/*      */         case 'õ':
/*      */         case 'ö':
/*  177 */           c2 = 'o';
/*  178 */           break;
/*      */         case 'ß':
/*  180 */           c2 = 'b';
/*      */         }
/*      */ 
/*  184 */         char c3 = c2;
/*  185 */         if (c3 == 0) { if (paramInt != -273626565) throw new IllegalStateException();  } else
/*  186 */           localStringBuilder.append(c3);
/*      */       } }
/*  188 */     if (localStringBuilder.length() == 0) { if (paramInt != -273626565) throw new IllegalStateException(); return null; }
/*  189 */     return localStringBuilder.toString();
/*      */   }
/*      */ 
/*      */   public static int c(CharSequence paramCharSequence, int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, int paramInt4)
/*      */   {
/*  104 */     int k = paramInt2 - paramInt1;
/*  105 */     for (int i1 = 0; i1 < k; i1++) { if (paramInt4 == -2117795425) throw new IllegalStateException();
/*  106 */       int i2 = paramCharSequence.charAt(i1 + paramInt1);
/*  107 */       if (i2 > 0) { if ((paramInt4 != -2117795425) && (i2 < 128)) break label126; if (paramInt4 == -2117795425) throw new IllegalStateException();  } if (i2 >= 160) { if (paramInt4 == -2117795425) throw new IllegalStateException(); if (i2 <= 255) { if (paramInt4 == -2117795425) throw new IllegalStateException(); label126: paramArrayOfByte[(paramInt3 + i1)] = ((byte)i2); continue; } }
/*  108 */       if (i2 == 8364) { if (paramInt4 != -2117795425);
/*  108 */         paramArrayOfByte[(paramInt3 + i1)] = -128;
/*  109 */       } else if (i2 == 8218) { if (paramInt4 != -2117795425);
/*  109 */         paramArrayOfByte[(paramInt3 + i1)] = -126;
/*  110 */       } else if (402 == i2) { if (paramInt4 == -2117795425) throw new IllegalStateException(); paramArrayOfByte[(paramInt3 + i1)] = -125;
/*  111 */       } else if (8222 == i2) { if (paramInt4 == -2117795425) throw new IllegalStateException(); paramArrayOfByte[(paramInt3 + i1)] = -124;
/*  112 */       } else if (8230 == i2) { if (paramInt4 == -2117795425) throw new IllegalStateException(); paramArrayOfByte[(paramInt3 + i1)] = -123;
/*  113 */       } else if (i2 == 8224) { if (paramInt4 == -2117795425) throw new IllegalStateException(); paramArrayOfByte[(paramInt3 + i1)] = -122;
/*  114 */       } else if (8225 == i2) { if (paramInt4 != -2117795425);
/*  114 */         paramArrayOfByte[(paramInt3 + i1)] = -121;
/*  115 */       } else if (710 == i2) { if (paramInt4 != -2117795425);
/*  115 */         paramArrayOfByte[(paramInt3 + i1)] = -120;
/*  116 */       } else if (8240 == i2) { if (paramInt4 != -2117795425);
/*  116 */         paramArrayOfByte[(i1 + paramInt3)] = -119;
/*  117 */       } else if (352 == i2) { if (paramInt4 != -2117795425);
/*  117 */         paramArrayOfByte[(i1 + paramInt3)] = -118;
/*  118 */       } else if (8249 == i2) { if (paramInt4 != -2117795425);
/*  118 */         paramArrayOfByte[(paramInt3 + i1)] = -117;
/*  119 */       } else if (338 == i2) { if (paramInt4 == -2117795425) throw new IllegalStateException(); paramArrayOfByte[(paramInt3 + i1)] = -116;
/*  120 */       } else if (381 == i2) { if (paramInt4 == -2117795425) throw new IllegalStateException(); paramArrayOfByte[(i1 + paramInt3)] = -114;
/*  121 */       } else if (8216 == i2) { if (paramInt4 == -2117795425) throw new IllegalStateException(); paramArrayOfByte[(paramInt3 + i1)] = -111;
/*  122 */       } else if (i2 == 8217) { if (paramInt4 != -2117795425);
/*  122 */         paramArrayOfByte[(i1 + paramInt3)] = -110;
/*  123 */       } else if (8220 == i2) { if (paramInt4 != -2117795425);
/*  123 */         paramArrayOfByte[(paramInt3 + i1)] = -109;
/*  124 */       } else if (8221 == i2) { if (paramInt4 != -2117795425);
/*  124 */         paramArrayOfByte[(i1 + paramInt3)] = -108;
/*  125 */       } else if (8226 == i2) { if (paramInt4 == -2117795425) throw new IllegalStateException(); paramArrayOfByte[(paramInt3 + i1)] = -107;
/*  126 */       } else if (8211 == i2) { if (paramInt4 == -2117795425) throw new IllegalStateException(); paramArrayOfByte[(i1 + paramInt3)] = -106;
/*  127 */       } else if (8212 == i2) { if (paramInt4 == -2117795425) throw new IllegalStateException(); paramArrayOfByte[(i1 + paramInt3)] = -105;
/*  128 */       } else if (732 == i2) { if (paramInt4 == -2117795425) throw new IllegalStateException(); paramArrayOfByte[(paramInt3 + i1)] = -104;
/*  129 */       } else if (8482 == i2) { if (paramInt4 == -2117795425) throw new IllegalStateException(); paramArrayOfByte[(paramInt3 + i1)] = -103;
/*  130 */       } else if (i2 == 353) { if (paramInt4 != -2117795425);
/*  130 */         paramArrayOfByte[(i1 + paramInt3)] = -102;
/*  131 */       } else if (8250 == i2) { if (paramInt4 == -2117795425) throw new IllegalStateException(); paramArrayOfByte[(paramInt3 + i1)] = -101;
/*  132 */       } else if (339 == i2) { if (paramInt4 != -2117795425);
/*  132 */         paramArrayOfByte[(i1 + paramInt3)] = -100;
/*  133 */       } else if (i2 == 382) { if (paramInt4 == -2117795425) throw new IllegalStateException(); paramArrayOfByte[(i1 + paramInt3)] = -98;
/*  134 */       } else if (i2 == 376) { if (paramInt4 != -2117795425);
/*  134 */         paramArrayOfByte[(i1 + paramInt3)] = -97; } else {
/*  135 */         paramArrayOfByte[(i1 + paramInt3)] = 63;
/*      */       } }
/*  137 */     return k;
/*      */   }
/*      */ 
/*      */   public static boolean r(int paramInt1, int paramInt2)
/*      */   {
/*    9 */     if (paramInt2 < -889486541);
/*    9 */     return 0 != (paramInt1 & 0x1);
/*      */   }
/*      */ 
/*      */   static final void da(byte paramByte)
/*      */   {
/* 4351 */     fb.j.m();
/*      */ 
/* 4353 */     fg.v(377132161);
/*      */ 
/* 4355 */     fd.g.m();
/*      */ 
/* 4357 */     ba.f(515197892);
/* 4358 */     df.b(425173250);
/*      */ 
/* 4360 */     fj.g.m();
/* 4361 */     fj.q.m();
/* 4362 */     fj.i.m();
/*      */ 
/* 4364 */     cu.t(1350213085);
/*      */ 
/* 4366 */     eu.z.m();
/* 4367 */     eu.g.m();
/*      */ 
/* 4370 */     fc.j.m();
/*      */ 
/* 4372 */     cz.s(1694144579);
/* 4373 */     ba.q(1990633880);
/* 4374 */     ch.y(-234587850);
/* 4375 */     ((bi)fx.av).v(-405249427);
/* 4376 */     ep.n.m();
/* 4377 */     bb.bp.e(-1688905701);
/* 4378 */     es.ba.e(-1702403190);
/* 4379 */     bd.br.e(-1329724142);
/* 4380 */     df.bb.e(-1847397006);
/* 4381 */     ck.bd.e(-1431339307);
/* 4382 */     bb.cr.e(-1526563383);
/* 4383 */     aa.cs.e(-2007616034);
/* 4384 */     client.cj.e(-1527140839);
/* 4385 */     client.cl.e(-1848307299);
/* 4386 */     ab.cp.e(-1267967168);
/* 4387 */     dz.ca.e(-1444634325);
/* 4388 */     ct.co.e(-2070254218);
/*      */   }
/*      */ 
/*      */   static void s(c[] paramArrayOfc, int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
/*      */   {
/*  797 */     if (paramInt1 < paramInt2) { if (paramInt3 <= -1874635519) return;
/*  798 */       int k = paramInt1 - 1;
/*  799 */       int i1 = 1 + paramInt2;
/*  800 */       int i2 = (paramInt2 + paramInt1) / 2;
/*  801 */       c localc1 = paramArrayOfc[i2];
/*  802 */       paramArrayOfc[i2] = paramArrayOfc[paramInt1];
/*  803 */       paramArrayOfc[paramInt1] = localc1;
/*  804 */       while (k < i1) { if (paramInt3 <= -1874635519) return; int i3 = 1;
/*      */         int i4;
/*      */         int i5;
/*      */         int i6;
/*      */         do { i1--;
/*  808 */           for (i4 = 0; i4 < 4; i4++) { if ((paramInt3 <= -1874635519) || 
/*  811 */               (2 == paramArrayOfInt1[i4])) { if (paramInt3 <= -1874635519) return;
/*  812 */               i5 = -962463709 * paramArrayOfc[i1].c;
/*  813 */               i6 = localc1.c * -962463709;
/*      */             }
/*  815 */             else if (paramArrayOfInt1[i4] == 1) { if (paramInt3 > -1874635519);
/*  816 */               i5 = paramArrayOfc[i1].d * -99617983;
/*  817 */               i6 = -99617983 * localc1.d;
/*  818 */               if (-1 == i5) { if (paramInt3 <= -1874635519) throw new IllegalStateException(); if (1 == paramArrayOfInt2[i4]) { if (paramInt3 > -1874635519);
/*  818 */                   i5 = 2001; } }
/*  819 */               if (-1 == i6) { if (paramInt3 <= -1874635519) return; if (paramArrayOfInt2[i4] == 1) { if (paramInt3 <= -1874635519) return; i6 = 2001; } }
/*      */             }
/*  821 */             else if (paramArrayOfInt1[i4] == 3) { if (paramInt3 <= -1874635519) throw new IllegalStateException();
/*  822 */               if (paramInt3 > -1874635519);
/*  822 */               i5 = paramArrayOfc[i1].n ? 1 : 0;
/*  823 */               if (paramInt3 > -1874635519);
/*  823 */               i6 = localc1.n ? 1 : 0;
/*      */             } else
/*      */             {
/*  826 */               i5 = -159366663 * paramArrayOfc[i1].r;
/*  827 */               i6 = -159366663 * localc1.r;
/*      */             }
/*  829 */             if (i6 == i5) { if (paramInt3 <= -1874635519) return;
/*  830 */               if (i4 == 3) { if (paramInt3 <= -1874635519) throw new IllegalStateException(); i3 = 0; }
/*      */             } else {
/*  832 */               if ((1 == paramArrayOfInt2[i4]) && ((paramInt3 <= -1874635519) || (i5 > i6))) { if (paramInt3 <= -1874635519) return; break; }
/*  833 */               if (paramArrayOfInt2[i4] == 0) { if (paramInt3 <= -1874635519) throw new IllegalStateException(); if (i5 < i6) { if (paramInt3 <= -1874635519) throw new IllegalStateException(); break; }
/*      */               }
/*  835 */               i3 = 0;
/*  836 */               break;
/*      */             } }
/*      */         }
/*  839 */         while (i3 != 0); if (paramInt3 <= -1874635519) throw new IllegalStateException();
/*  840 */         i3 = 1;
/*      */         do {
/*  842 */           k++;
/*  843 */           for (i4 = 0; i4 < 4; i4++) { if ((paramInt3 <= -1874635519) || 
/*  846 */               (2 == paramArrayOfInt1[i4])) { if (paramInt3 > -1874635519);
/*  847 */               i5 = -962463709 * paramArrayOfc[k].c;
/*  848 */               i6 = localc1.c * -962463709;
/*      */             }
/*  850 */             else if (1 == paramArrayOfInt1[i4]) { if (paramInt3 > -1874635519);
/*  851 */               i5 = -99617983 * paramArrayOfc[k].d;
/*  852 */               i6 = -99617983 * localc1.d;
/*  853 */               if ((-1 == i5) && ((paramInt3 <= -1874635519) || (1 == paramArrayOfInt2[i4]))) { if (paramInt3 > -1874635519);
/*  853 */                 i5 = 2001; }
/*  854 */               if (-1 == i6) { if (paramInt3 <= -1874635519) throw new IllegalStateException(); if (paramArrayOfInt2[i4] == 1) { if (paramInt3 > -1874635519);
/*  854 */                   i6 = 2001; } }
/*      */             }
/*  856 */             else if (paramArrayOfInt1[i4] == 3) { if (paramInt3 <= -1874635519) throw new IllegalStateException();
/*  857 */               if (paramInt3 <= -1874635519) return; i5 = paramArrayOfc[k].n ? 1 : 0;
/*  858 */               if (paramInt3 > -1874635519);
/*  858 */               i6 = localc1.n ? 1 : 0;
/*      */             } else
/*      */             {
/*  861 */               i5 = paramArrayOfc[k].r * -159366663;
/*  862 */               i6 = localc1.r * -159366663;
/*      */             }
/*  864 */             if (i6 == i5) { if ((paramInt3 <= -1874635519) || 
/*  865 */                 (3 == i4)) { if (paramInt3 > -1874635519);
/*  865 */                 i3 = 0; }
/*      */             } else {
/*  867 */               if (paramArrayOfInt2[i4] == 1) { if (paramInt3 <= -1874635519) return; if (i5 < i6) { if (paramInt3 <= -1874635519) return; break; } }
/*  868 */               if ((paramArrayOfInt2[i4] == 0) && ((paramInt3 <= -1874635519) || (i5 > i6))) { if (paramInt3 <= -1874635519) return; break;
/*      */               }
/*  870 */               i3 = 0;
/*  871 */               break;
/*      */             } }
/*      */         }
/*  874 */         while (i3 != 0); if ((paramInt3 <= -1874635519) || 
/*  875 */           (k < i1)) { if (paramInt3 > -1874635519);
/*  876 */           c localc2 = paramArrayOfc[k];
/*  877 */           paramArrayOfc[k] = paramArrayOfc[i1];
/*  878 */           paramArrayOfc[i1] = localc2;
/*      */         }
/*      */       }
/*  881 */       s(paramArrayOfc, paramInt1, i1, paramArrayOfInt1, paramArrayOfInt2, 551193707);
/*  882 */       s(paramArrayOfc, 1 + i1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, 1656522917);
/*      */     }
/*      */   }
/*      */ 
/*      */   public static fa d(Throwable paramThrowable, String paramString)
/*      */   {
/*      */     fa localfa;
/*   97 */     if ((paramThrowable instanceof fa)) {
/*   98 */       localfa = (fa)paramThrowable;
/*      */       fa tmp20_19 = localfa; tmp20_19.m = (tmp20_19.m + ' ' + paramString);
/*      */     } else {
/*  101 */       localfa = new fa(paramThrowable, paramString);
/*  102 */     }return localfa;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     bh
 * JD-Core Version:    0.6.2
 */