/*      */ import java.io.ByteArrayInputStream;
/*      */ import java.io.IOException;
/*      */ import java.io.InvalidClassException;
/*      */ import java.io.ObjectInputStream;
/*      */ import java.io.OptionalDataException;
/*      */ import java.io.StreamCorruptedException;
/*      */ import java.lang.reflect.Field;
/*      */ import java.lang.reflect.InvocationTargetException;
/*      */ import java.lang.reflect.Method;
/*      */ 
/*      */ public class dk
/*      */ {
/*   17 */   public static cg r = new cg();
/*      */ 
/*      */   public static void l(ea paramea, int paramInt)
/*      */   {
/*      */     while (true)
/*      */     {
/*   26 */       ek localek = (ek)r.j();
/*   27 */       if (null == localek) return;
/*   28 */       paramea.gt(paramInt, 2062507603);
/*   29 */       paramea.c(0, 2030322552);
/*   30 */       int i = paramea.c * -196293817;
/*   31 */       paramea.z(localek.c * -828362671, (byte)95);
/*   32 */       for (int j = 0; j < localek.n * -528825213; j++) {
/*   33 */         if (0 != localek.z[j])
/*   34 */           paramea.c(localek.z[j], 1712075211);
/*      */         else
/*      */           try
/*      */           {
/*   38 */             int k = localek.j[j];
/*      */             Object localObject1;
/*      */             int m;
/*   39 */             if (0 == k) {
/*   40 */               localObject1 = localek.g[j];
/*   41 */               m = ((Field)localObject1).getInt(null);
/*   42 */               paramea.c(0, 1212058719);
/*   43 */               paramea.z(m, (byte)121);
/*      */             }
/*   45 */             else if (1 == k) {
/*   46 */               localObject1 = localek.g[j];
/*   47 */               ((Field)localObject1).setInt(null, localek.q[j]);
/*   48 */               paramea.c(0, 1541946299);
/*      */             }
/*   50 */             else if (k == 2) {
/*   51 */               localObject1 = localek.g[j];
/*   52 */               m = ((Field)localObject1).getModifiers();
/*   53 */               paramea.c(0, 2139178749);
/*   54 */               paramea.z(m, (byte)8);
/*      */             }
/*   56 */             if (k == 3) {
/*   57 */               localObject1 = localek.i[j];
/*   58 */               byte[][] arrayOfByte = localek.m[j];
/*   59 */               Object[] arrayOfObject = new Object[arrayOfByte.length];
/*   60 */               for (int i1 = 0; i1 < arrayOfByte.length; i1++) {
/*   61 */                 ObjectInputStream localObjectInputStream = new ObjectInputStream(new ByteArrayInputStream(arrayOfByte[i1]));
/*   62 */                 arrayOfObject[i1] = localObjectInputStream.readObject();
/*      */               }
/*   64 */               Object localObject2 = ((Method)localObject1).invoke(null, arrayOfObject);
/*   65 */               if (localObject2 == null) { paramea.c(0, 1514856384);
/*   66 */               } else if ((localObject2 instanceof Number)) {
/*   67 */                 paramea.c(1, 1391967788);
/*   68 */                 paramea.g(((Number)localObject2).longValue());
/*      */               }
/*   70 */               else if ((localObject2 instanceof String)) {
/*   71 */                 paramea.c(2, 1165980118);
/*   72 */                 paramea.i((String)localObject2, -1750222851);
/*      */               } else {
/*   74 */                 paramea.c(4, 1991759962);
/*      */               }
/*   76 */             } else if (4 == k) {
/*   77 */               localObject1 = localek.i[j];
/*   78 */               int n = ((Method)localObject1).getModifiers();
/*   79 */               paramea.c(0, 2073075910);
/*   80 */               paramea.z(n, (byte)123);
/*      */             }
/*      */           }
/*      */           catch (ClassNotFoundException localClassNotFoundException) {
/*   84 */             paramea.c(-10, 1868031678);
/*      */           }
/*      */           catch (InvalidClassException localInvalidClassException) {
/*   87 */             paramea.c(-11, 1591266931);
/*      */           }
/*      */           catch (StreamCorruptedException localStreamCorruptedException) {
/*   90 */             paramea.c(-12, 1866451034);
/*      */           }
/*      */           catch (OptionalDataException localOptionalDataException) {
/*   93 */             paramea.c(-13, 1148710331);
/*      */           }
/*      */           catch (IllegalAccessException localIllegalAccessException) {
/*   96 */             paramea.c(-14, 1714881965);
/*      */           }
/*      */           catch (IllegalArgumentException localIllegalArgumentException) {
/*   99 */             paramea.c(-15, 1955095175);
/*      */           }
/*      */           catch (InvocationTargetException localInvocationTargetException) {
/*  102 */             paramea.c(-16, 1887729497);
/*      */           }
/*      */           catch (SecurityException localSecurityException) {
/*  105 */             paramea.c(-17, 1330570787);
/*      */           }
/*      */           catch (IOException localIOException) {
/*  108 */             paramea.c(-18, 1548028433);
/*      */           }
/*      */           catch (NullPointerException localNullPointerException) {
/*  111 */             paramea.c(-19, 1248176251);
/*      */           }
/*      */           catch (Exception localException) {
/*  114 */             paramea.c(-20, 1285357079);
/*      */           }
/*      */           catch (Throwable localThrowable) {
/*  117 */             paramea.c(-21, 2023742031);
/*      */           }
/*      */       }
/*  120 */       paramea.ay(i, 1638375295);
/*  121 */       paramea.e(-196293817 * paramea.c - i, (byte)-51);
/*  122 */       localek.r();
/*      */     }
/*      */   }
/*      */ 
/*      */   dk()
/*      */     throws Throwable
/*      */   {
/*   20 */     throw new Error();
/*      */   }
/*      */ 
/*      */   public static void m(ea paramea, int paramInt)
/*      */   {
/*      */     while (true) {
/*   26 */       ek localek = (ek)r.j();
/*   27 */       if (null == localek) return;
/*   28 */       paramea.gt(paramInt, 2062507603);
/*   29 */       paramea.c(0, 1952889051);
/*   30 */       int i = paramea.c * -196293817;
/*   31 */       paramea.z(localek.c * -828362671, (byte)125);
/*   32 */       for (int j = 0; j < localek.n * -528825213; j++) {
/*   33 */         if (0 != localek.z[j])
/*   34 */           paramea.c(localek.z[j], 1389631130);
/*      */         else
/*      */           try
/*      */           {
/*   38 */             int k = localek.j[j];
/*      */             Object localObject1;
/*      */             int m;
/*   39 */             if (0 == k) {
/*   40 */               localObject1 = localek.g[j];
/*   41 */               m = ((Field)localObject1).getInt(null);
/*   42 */               paramea.c(0, 1362010642);
/*   43 */               paramea.z(m, (byte)112);
/*      */             }
/*   45 */             else if (1 == k) {
/*   46 */               localObject1 = localek.g[j];
/*   47 */               ((Field)localObject1).setInt(null, localek.q[j]);
/*   48 */               paramea.c(0, 1595003094);
/*      */             }
/*   50 */             else if (k == 2) {
/*   51 */               localObject1 = localek.g[j];
/*   52 */               m = ((Field)localObject1).getModifiers();
/*   53 */               paramea.c(0, 1928426510);
/*   54 */               paramea.z(m, (byte)124);
/*      */             }
/*   56 */             if (k == 3) {
/*   57 */               localObject1 = localek.i[j];
/*   58 */               byte[][] arrayOfByte = localek.m[j];
/*   59 */               Object[] arrayOfObject = new Object[arrayOfByte.length];
/*   60 */               for (int i1 = 0; i1 < arrayOfByte.length; i1++) {
/*   61 */                 ObjectInputStream localObjectInputStream = new ObjectInputStream(new ByteArrayInputStream(arrayOfByte[i1]));
/*   62 */                 arrayOfObject[i1] = localObjectInputStream.readObject();
/*      */               }
/*   64 */               Object localObject2 = ((Method)localObject1).invoke(null, arrayOfObject);
/*   65 */               if (localObject2 == null) { paramea.c(0, 1596942304);
/*   66 */               } else if ((localObject2 instanceof Number)) {
/*   67 */                 paramea.c(1, 1890095445);
/*   68 */                 paramea.g(((Number)localObject2).longValue());
/*      */               }
/*   70 */               else if ((localObject2 instanceof String)) {
/*   71 */                 paramea.c(2, 1373585625);
/*   72 */                 paramea.i((String)localObject2, -1748433353);
/*      */               } else {
/*   74 */                 paramea.c(4, 1333823586);
/*      */               }
/*   76 */             } else if (4 == k) {
/*   77 */               localObject1 = localek.i[j];
/*   78 */               int n = ((Method)localObject1).getModifiers();
/*   79 */               paramea.c(0, 1597146850);
/*   80 */               paramea.z(n, (byte)90);
/*      */             }
/*      */           }
/*      */           catch (ClassNotFoundException localClassNotFoundException) {
/*   84 */             paramea.c(-10, 1221018585);
/*      */           }
/*      */           catch (InvalidClassException localInvalidClassException) {
/*   87 */             paramea.c(-11, 2146680497);
/*      */           }
/*      */           catch (StreamCorruptedException localStreamCorruptedException) {
/*   90 */             paramea.c(-12, 1882134644);
/*      */           }
/*      */           catch (OptionalDataException localOptionalDataException) {
/*   93 */             paramea.c(-13, 1805394628);
/*      */           }
/*      */           catch (IllegalAccessException localIllegalAccessException) {
/*   96 */             paramea.c(-14, 1594934003);
/*      */           }
/*      */           catch (IllegalArgumentException localIllegalArgumentException) {
/*   99 */             paramea.c(-15, 1255927545);
/*      */           }
/*      */           catch (InvocationTargetException localInvocationTargetException) {
/*  102 */             paramea.c(-16, 1439610722);
/*      */           }
/*      */           catch (SecurityException localSecurityException) {
/*  105 */             paramea.c(-17, 1519219267);
/*      */           }
/*      */           catch (IOException localIOException) {
/*  108 */             paramea.c(-18, 1227643316);
/*      */           }
/*      */           catch (NullPointerException localNullPointerException) {
/*  111 */             paramea.c(-19, 1964951741);
/*      */           }
/*      */           catch (Exception localException) {
/*  114 */             paramea.c(-20, 1464861327);
/*      */           }
/*      */           catch (Throwable localThrowable) {
/*  117 */             paramea.c(-21, 1783393042);
/*      */           }
/*      */       }
/*  120 */       paramea.ay(i, 2106310118);
/*  121 */       paramea.e(-196293817 * paramea.c - i, (byte)101);
/*  122 */       localek.r();
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void j(byte[] paramArrayOfByte, int paramInt1, int paramInt2, aq paramaq, ck[] paramArrayOfck, int paramInt3)
/*      */   {
/*  243 */     ev localev = new ev(paramArrayOfByte);
/*  244 */     int i = -1;
/*      */     while (true) {
/*  246 */       int j = localev.ap(2081694923);
/*  247 */       if (0 == j) { if (paramInt3 >= 271983730) return; break; }
/*  248 */       i += j;
/*  249 */       int k = 0;
/*      */       while (true) {
/*  251 */         int m = localev.ap(351545235);
/*  252 */         if (0 == m) { if (paramInt3 >= 271983730) return; break; }
/*  253 */         k += m - 1;
/*  254 */         int n = k & 0x3F;
/*  255 */         int i1 = k >> 6 & 0x3F;
/*  256 */         int i2 = k >> 12;
/*  257 */         int i3 = localev.t(1118814123);
/*  258 */         int i4 = i3 >> 2;
/*  259 */         int i5 = i3 & 0x3;
/*  260 */         int i6 = paramInt1 + i1;
/*  261 */         int i7 = paramInt2 + n;
/*  262 */         if ((i6 > 0) && ((paramInt3 >= 271983730) || ((i7 > 0) && ((paramInt3 >= 271983730) || ((i6 < 103) && ((paramInt3 >= 271983730) || (i7 < 103))))))) { if (paramInt3 >= 271983730) return;
/*  263 */           int i8 = i2;
/*  264 */           if ((l.d[1][i6][i7] & 0x2) == 2) { if (paramInt3 < 271983730);
/*  264 */             i8--; }
/*  265 */           ck localck = null;
/*  266 */           if (i8 >= 0) { if (paramInt3 >= 271983730) throw new IllegalStateException(); localck = paramArrayOfck[i8]; }
/*  267 */           bi.g(i2, i6, i7, i, i5, i4, paramaq, localck, 893822451);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void dy(fz paramfz, int paramInt)
/*      */   {
/* 4748 */     if (paramfz.bg * 682798035 == 0) { if (paramInt > -16711936);
/*      */       return;
/*      */     }
/* 4749 */     int m;
/* 4749 */     if ((-1 != paramfz.am * -1737668453) && ((paramInt <= -16711936) || (paramfz.am * -1737668453 < 32768))) { if (paramInt > -16711936);
/* 4750 */       ge localge = client.ci[(paramfz.am * -1737668453)];
/* 4751 */       if (localge != null) { if (paramInt > -16711936);
/* 4752 */         int j = paramfz.j * -1481433155 - localge.j * -1481433155;
/* 4753 */         m = -1453593105 * paramfz.z - -1453593105 * localge.z;
/* 4754 */         if (j == 0) { if ((paramInt > -16711936) && (m == 0)) break label181; if (paramInt <= -16711936) throw new IllegalStateException();  } paramfz.bk = (((int)(Math.atan2(j, m) * 325.94900000000001D) & 0x7FF) * -1517596543);
/*      */       }
/*      */     }
/* 4757 */     label181: if (paramfz.am * -1737668453 >= 32768) { if (paramInt <= -16711936) return;
/* 4758 */       i = paramfz.am * -1737668453 - 32768;
/* 4759 */       if (-1804115051 * client.ik == i) { if (paramInt > -16711936);
/* 4759 */         i = 2047; }
/* 4760 */       fi localfi = client.iq[i];
/* 4761 */       if (null != localfi) { if (paramInt <= -16711936) throw new IllegalStateException();
/* 4762 */         m = paramfz.j * -1481433155 - localfi.j * -1481433155;
/* 4763 */         int n = -1453593105 * paramfz.z - -1453593105 * localfi.z;
/* 4764 */         if (m == 0) { if ((paramInt > -16711936) && (0 == n)) break label355; if (paramInt <= -16711936); } paramfz.bk = (((int)(Math.atan2(m, n) * 325.94900000000001D) & 0x7FF) * -1517596543);
/*      */       }
/*      */     }
/* 4767 */     label355: if (paramfz.ap * 1209579013 == 0) { if ((paramInt > -16711936) && (-1287375671 * paramfz.av == 0)) break label568; if (paramInt <= -16711936); } if (0 != paramfz.bl * 898034815) { if ((paramInt > -16711936) && (paramfz.bx * 1291807757 <= 0)) break label568; if (paramInt <= -16711936); }
/* 4768 */     int i = paramfz.j * -1481433155 - (paramfz.ap * 103645504 - 1786965440 * a.de - a.de * 1786965440);
/* 4769 */     int k = -1453593105 * paramfz.z - (-787664320 * paramfz.av - at.dw * 1445203520 - at.dw * 1445203520);
/* 4770 */     if (0 == i) { if (paramInt <= -16711936) throw new IllegalStateException(); if (k == 0) break label558; if (paramInt <= -16711936) return;  } paramfz.bk = (((int)(Math.atan2(i, k) * 325.94900000000001D) & 0x7FF) * -1517596543);
/* 4771 */     label558: paramfz.ap = 0;
/* 4772 */     paramfz.av = 0;
/*      */ 
/* 4774 */     label568: i = -224071807 * paramfz.bk - paramfz.g * 265411181 & 0x7FF;
/* 4775 */     if (0 != i) { if (paramInt <= -16711936) throw new IllegalStateException();
/* 4776 */       paramfz.bv += 1520629769;
/* 4777 */       if (i > 1024) { if (paramInt <= -16711936) throw new IllegalStateException();
/* 4778 */         paramfz.g -= 844281663 * paramfz.bg;
/* 4779 */         k = 1;
/* 4780 */         if (i >= 682798035 * paramfz.bg) { if (paramInt <= -16711936) throw new IllegalStateException(); if (i <= 2048 - paramfz.bg * 682798035) break label729; if (paramInt <= -16711936) throw new IllegalStateException(); 
/*      */         }
/* 4781 */         paramfz.g = (-624476955 * paramfz.bk);
/* 4782 */         k = 0;
/*      */ 
/* 4784 */         label729: if (-818747733 * paramfz.ak == paramfz.s * -8253603) { if ((paramInt <= -16711936) || (716576313 * paramfz.bv <= 25)) { if (paramInt <= -16711936) return; if (k == 0) break label836; if (paramInt <= -16711936) return; 
/*      */           }
/* 4785 */           if (-1 != 251689049 * paramfz.u) { if (paramInt > -16711936);
/* 4785 */             paramfz.ak = (567127307 * paramfz.u); } else {
/* 4786 */             paramfz.ak = (paramfz.w * 1336368273);
/*      */           } }
/*      */       } else
/*      */       {
/* 4790 */         label836: paramfz.g += paramfz.bg * 844281663;
/* 4791 */         k = 1;
/* 4792 */         if (i >= paramfz.bg * 682798035) { if ((paramInt > -16711936) && (i <= 2048 - paramfz.bg * 682798035)) break label916; if (paramInt <= -16711936); }
/* 4793 */         paramfz.g = (paramfz.bk * -624476955);
/* 4794 */         k = 0;
/*      */ 
/* 4796 */         label916: if (-8253603 * paramfz.s == paramfz.ak * -818747733) { if ((paramInt <= -16711936) || (716576313 * paramfz.bv <= 25)) { if ((paramInt > -16711936) && (k == 0)) break label1037; if (paramInt <= -16711936) throw new IllegalStateException(); 
/*      */           }
/* 4797 */           if (-1 != -879470121 * paramfz.v) { if (paramInt <= -16711936) throw new IllegalStateException(); paramfz.ak = (paramfz.v * 1578338693); } else {
/* 4798 */             paramfz.ak = (1336368273 * paramfz.w);
/*      */           }
/*      */         }
/*      */       }
/* 4802 */       label1037: fz localfz = paramfz; paramfz.g = (717504357 * (265411181 * localfz.g & 0x7FF));
/*      */     } else {
/* 4804 */       paramfz.bv = 0;
/*      */     }
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     dk
 * JD-Core Version:    0.6.2
 */