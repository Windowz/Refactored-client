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
/*      */ public final class br
/*      */ {
/*      */   public static final String r = "#";
/*      */   static am bz;
/*      */   static int om;
/*      */ 
/*      */   br()
/*      */     throws Throwable
/*      */   {
/*    7 */     throw new Error();
/*      */   }
/*      */ 
/*      */   public static void r(ea paramea, int paramInt, byte paramByte)
/*      */   {
/*      */     while (true)
/*      */     {
/*   26 */       ek localek = (ek)dk.r.j();
/*   27 */       if (null == localek) { if (paramByte >= 1) throw new IllegalStateException(); return; }
/*   28 */       paramea.gt(paramInt, 2062507603);
/*   29 */       paramea.c(0, 1774576827);
/*   30 */       int i = paramea.c * -196293817;
/*   31 */       paramea.z(localek.c * -828362671, (byte)62);
/*   32 */       for (int j = 0; j < localek.n * -528825213; j++) { if (paramByte >= 1) throw new IllegalStateException();
/*   33 */         if (0 != localek.z[j]) { if (paramByte < 1);
/*   34 */           paramea.c(localek.z[j], 1242003189);
/*      */         } else
/*      */         {
/*      */           try {
/*   38 */             int k = localek.j[j];
/*      */             Object localObject1;
/*      */             int m;
/*   39 */             if (0 == k) { if (paramByte < 1);
/*   40 */               localObject1 = localek.g[j];
/*   41 */               m = ((Field)localObject1).getInt(null);
/*   42 */               paramea.c(0, 1431353934);
/*   43 */               paramea.z(m, (byte)7);
/*      */             }
/*   45 */             else if (1 == k) { if (paramByte < 1);
/*   46 */               localObject1 = localek.g[j];
/*   47 */               ((Field)localObject1).setInt(null, localek.q[j]);
/*   48 */               paramea.c(0, 2111871039);
/*      */             }
/*   50 */             else if (k == 2) { if (paramByte >= 1) return;
/*   51 */               localObject1 = localek.g[j];
/*   52 */               m = ((Field)localObject1).getModifiers();
/*   53 */               paramea.c(0, 1796592012);
/*   54 */               paramea.z(m, (byte)91);
/*      */             }
/*   56 */             if (k == 3) { if (paramByte >= 1) return;
/*   57 */               localObject1 = localek.i[j];
/*   58 */               byte[][] arrayOfByte = localek.m[j];
/*   59 */               Object[] arrayOfObject = new Object[arrayOfByte.length];
/*   60 */               for (int i1 = 0; i1 < arrayOfByte.length; i1++) { if (paramByte < 1);
/*   61 */                 ObjectInputStream localObjectInputStream = new ObjectInputStream(new ByteArrayInputStream(arrayOfByte[i1]));
/*   62 */                 arrayOfObject[i1] = localObjectInputStream.readObject();
/*      */               }
/*   64 */               Object localObject2 = ((Method)localObject1).invoke(null, arrayOfObject);
/*   65 */               if (localObject2 == null) { if (paramByte < 1);
/*   65 */                 paramea.c(0, 1665797090);
/*   66 */               } else if ((localObject2 instanceof Number)) { if (paramByte < 1);
/*   67 */                 paramea.c(1, 1720546580);
/*   68 */                 paramea.g(((Number)localObject2).longValue());
/*      */               }
/*   70 */               else if ((localObject2 instanceof String)) { if (paramByte >= 1) throw new IllegalStateException();
/*   71 */                 paramea.c(2, 1684798183);
/*   72 */                 paramea.i((String)localObject2, -2098535397);
/*      */               } else {
/*   74 */                 paramea.c(4, 2098594683);
/*      */               }
/*   76 */             } else if (4 == k) { if (paramByte < 1);
/*   77 */               localObject1 = localek.i[j];
/*   78 */               int n = ((Method)localObject1).getModifiers();
/*   79 */               paramea.c(0, 1930529666);
/*   80 */               paramea.z(n, (byte)88); }
/*      */           }
/*      */           catch (ClassNotFoundException localClassNotFoundException)
/*      */           {
/*   84 */             paramea.c(-10, 1451547303);
/*      */           }
/*      */           catch (InvalidClassException localInvalidClassException) {
/*   87 */             paramea.c(-11, 1208968712);
/*      */           }
/*      */           catch (StreamCorruptedException localStreamCorruptedException) {
/*   90 */             paramea.c(-12, 2069236827);
/*      */           }
/*      */           catch (OptionalDataException localOptionalDataException) {
/*   93 */             paramea.c(-13, 1890628446);
/*      */           }
/*      */           catch (IllegalAccessException localIllegalAccessException) {
/*   96 */             paramea.c(-14, 1636673479);
/*      */           }
/*      */           catch (IllegalArgumentException localIllegalArgumentException) {
/*   99 */             paramea.c(-15, 1863117051);
/*      */           }
/*      */           catch (InvocationTargetException localInvocationTargetException) {
/*  102 */             paramea.c(-16, 1725876683);
/*      */           }
/*      */           catch (SecurityException localSecurityException) {
/*  105 */             paramea.c(-17, 1407868180);
/*      */           }
/*      */           catch (IOException localIOException) {
/*  108 */             paramea.c(-18, 2035648756);
/*      */           }
/*      */           catch (NullPointerException localNullPointerException) {
/*  111 */             paramea.c(-19, 1408613159);
/*      */           }
/*      */           catch (Exception localException) {
/*  114 */             paramea.c(-20, 1543115603);
/*      */           }
/*      */           catch (Throwable localThrowable) {
/*  117 */             paramea.c(-21, 1662622021);
/*      */           }
/*      */         } }
/*  120 */       paramea.ay(i, 1647459345);
/*  121 */       paramea.e(-196293817 * paramea.c - i, (byte)-29);
/*  122 */       localek.r();
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void n(ft paramft, byte paramByte)
/*      */   {
/*  536 */     int i = 256;
/*  537 */     for (int j = 0; j < an.o.length; j++) { if (paramByte > 8);
/*  537 */       an.o[j] = 0;
/*      */     }
/*  538 */     int k;
/*  538 */     for (j = 0; j < 5000; j++) { if (paramByte <= 8) throw new IllegalStateException();
/*  539 */       k = (int)(Math.random() * 128.0D * i);
/*  540 */       an.o[k] = ((int)(Math.random() * 256.0D));
/*      */     }
/*  542 */     int n;
/*      */     int i1;
/*  542 */     for (j = 0; j < 20; j++) { if (paramByte > 8);
/*  543 */       for (k = 1; k < i - 1; k++) { if (paramByte <= 8) throw new IllegalStateException();
/*  544 */         for (n = 1; n < 127; n++) { if (paramByte > 8);
/*  545 */           i1 = n + (k << 7);
/*  546 */           ay.a[i1] = ((an.o[(i1 - 128)] + (an.o[(i1 - 1)] + an.o[(i1 + 1)]) + an.o[(128 + i1)]) / 4);
/*      */         }
/*      */       }
/*  549 */       int[] arrayOfInt = an.o;
/*  550 */       an.o = ay.a;
/*  551 */       ay.a = arrayOfInt;
/*      */     }
/*  553 */     if (null != paramft) { if (paramByte > 8);
/*  554 */       j = 0;
/*  555 */       for (int m = 0; m < paramft.e; m++) { if (paramByte <= 8) return;
/*  556 */         for (n = 0; n < paramft.w; n++) { if (paramByte <= 8) return;
/*  557 */           if (paramft.u[(j++)] != 0) { if (paramByte > 8);
/*  558 */             i1 = paramft.b + (n + 16);
/*  559 */             int i2 = paramft.y + (16 + m);
/*  560 */             int i3 = (i2 << 7) + i1;
/*  561 */             an.o[i3] = 0;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static final boolean em(int paramInt1, int paramInt2)
/*      */   {
/* 6452 */     if (paramInt1 < 0) { if (paramInt2 < -1103393601);
/* 6452 */       return false; }
/* 6453 */     int i = client.jr[paramInt1];
/* 6454 */     if (i >= 2000) { if (paramInt2 < -1103393601);
/* 6454 */       i -= 2000; }
/* 6455 */     if (i == 1007) { if (paramInt2 >= -1103393601) throw new IllegalStateException(); return true; }
/* 6456 */     return false;
/*      */   }
/*      */ 
/*      */   static final void gj(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2)
/*      */   {
/* 9582 */     for (int i = 99; i > 0; i--) { if (paramInt2 == 1891131882) throw new IllegalStateException();
/* 9583 */       client.mt[i] = client.mt[(i - 1)];
/* 9584 */       client.mc[i] = client.mc[(i - 1)];
/* 9585 */       client.mx[i] = client.mx[(i - 1)];
/* 9586 */       client.mr[i] = client.mr[(i - 1)];
/*      */     }
/* 9588 */     client.mt[0] = paramInt1;
/* 9589 */     client.mc[0] = paramString1;
/* 9590 */     client.mx[0] = paramString2;
/* 9591 */     client.mr[0] = paramString3;
/* 9592 */     client.mv += -1103393601;
/* 9593 */     client.li = 451174583 * client.lg;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     br
 * JD-Core Version:    0.6.2
 */