/*      */ public class f
/*      */   implements Runnable
/*      */ {
/*      */   ak r;
/*   12 */   volatile boolean m = false;
/*      */ 
/*   11 */   volatile boolean l = false;
/*      */ 
/*   10 */   volatile y[] d = new y[2];
/*      */   public static String k;
/*      */ 
/*      */   // ERROR //
/*      */   public void r()
/*      */   {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: iconst_1
/*      */     //   2: putfield 21	f:m	Z
/*      */     //   5: aload_0
/*      */     //   6: getfield 23	f:l	Z
/*      */     //   9: ifne +111 -> 120
/*      */     //   12: iconst_0
/*      */     //   13: istore_1
/*      */     //   14: iload_1
/*      */     //   15: iconst_2
/*      */     //   16: if_icmpge +26 -> 42
/*      */     //   19: aload_0
/*      */     //   20: getfield 25	f:d	[Ly;
/*      */     //   23: iload_1
/*      */     //   24: aaload
/*      */     //   25: astore_2
/*      */     //   26: aload_2
/*      */     //   27: ifnull +9 -> 36
/*      */     //   30: aload_2
/*      */     //   31: bipush 130
/*      */     //   33: invokevirtual 30	y:m	(B)V
/*      */     //   36: iinc 1 1
/*      */     //   39: goto -25 -> 14
/*      */     //   42: ldc2_w 31
/*      */     //   45: invokestatic 37	cl:r	(J)V
/*      */     //   48: aload_0
/*      */     //   49: getfield 39	f:r	Lak;
/*      */     //   52: astore_1
/*      */     //   53: aconst_null
/*      */     //   54: astore_2
/*      */     //   55: aload_1
/*      */     //   56: getfield 45	ak:z	Ljava/awt/EventQueue;
/*      */     //   59: ifnonnull +6 -> 65
/*      */     //   62: goto +55 -> 117
/*      */     //   65: iconst_0
/*      */     //   66: istore_3
/*      */     //   67: iload_3
/*      */     //   68: bipush 50
/*      */     //   70: if_icmpge +23 -> 93
/*      */     //   73: aload_1
/*      */     //   74: getfield 45	ak:z	Ljava/awt/EventQueue;
/*      */     //   77: invokevirtual 51	java/awt/EventQueue:peekEvent	()Ljava/awt/AWTEvent;
/*      */     //   80: ifnull +13 -> 93
/*      */     //   83: lconst_1
/*      */     //   84: invokestatic 37	cl:r	(J)V
/*      */     //   87: iinc 3 1
/*      */     //   90: goto -23 -> 67
/*      */     //   93: aload_2
/*      */     //   94: ifnull +23 -> 117
/*      */     //   97: aload_1
/*      */     //   98: getfield 45	ak:z	Ljava/awt/EventQueue;
/*      */     //   101: new 53	java/awt/event/ActionEvent
/*      */     //   104: dup
/*      */     //   105: aload_2
/*      */     //   106: sipush 1001
/*      */     //   109: ldc 55
/*      */     //   111: invokespecial 59	java/awt/event/ActionEvent:<init>	(Ljava/lang/Object;ILjava/lang/String;)V
/*      */     //   114: invokevirtual 63	java/awt/EventQueue:postEvent	(Ljava/awt/AWTEvent;)V
/*      */     //   117: goto -112 -> 5
/*      */     //   120: aload_0
/*      */     //   121: iconst_0
/*      */     //   122: putfield 21	f:m	Z
/*      */     //   125: goto +29 -> 154
/*      */     //   128: astore_1
/*      */     //   129: aconst_null
/*      */     //   130: aload_1
/*      */     //   131: ldc 64
/*      */     //   133: invokestatic 69	dy:r	(Ljava/lang/String;Ljava/lang/Throwable;I)V
/*      */     //   136: aload_0
/*      */     //   137: iconst_0
/*      */     //   138: putfield 21	f:m	Z
/*      */     //   141: goto +13 -> 154
/*      */     //   144: astore 4
/*      */     //   146: aload_0
/*      */     //   147: iconst_0
/*      */     //   148: putfield 21	f:m	Z
/*      */     //   151: aload 4
/*      */     //   153: athrow
/*      */     //   154: return
/*      */     //
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   5	120	128	java/lang/Exception
/*      */     //   5	146	144	finally
/*      */   }
/*      */ 
/*      */   // ERROR //
/*      */   public void run()
/*      */   {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: iconst_1
/*      */     //   2: putfield 21	f:m	Z
/*      */     //   5: aload_0
/*      */     //   6: getfield 23	f:l	Z
/*      */     //   9: ifne +111 -> 120
/*      */     //   12: iconst_0
/*      */     //   13: istore_1
/*      */     //   14: iload_1
/*      */     //   15: iconst_2
/*      */     //   16: if_icmpge +26 -> 42
/*      */     //   19: aload_0
/*      */     //   20: getfield 25	f:d	[Ly;
/*      */     //   23: iload_1
/*      */     //   24: aaload
/*      */     //   25: astore_2
/*      */     //   26: aload_2
/*      */     //   27: ifnull +9 -> 36
/*      */     //   30: aload_2
/*      */     //   31: bipush 246
/*      */     //   33: invokevirtual 30	y:m	(B)V
/*      */     //   36: iinc 1 1
/*      */     //   39: goto -25 -> 14
/*      */     //   42: ldc2_w 31
/*      */     //   45: invokestatic 37	cl:r	(J)V
/*      */     //   48: aload_0
/*      */     //   49: getfield 39	f:r	Lak;
/*      */     //   52: astore_1
/*      */     //   53: aconst_null
/*      */     //   54: astore_2
/*      */     //   55: aload_1
/*      */     //   56: getfield 45	ak:z	Ljava/awt/EventQueue;
/*      */     //   59: ifnonnull +6 -> 65
/*      */     //   62: goto +55 -> 117
/*      */     //   65: iconst_0
/*      */     //   66: istore_3
/*      */     //   67: iload_3
/*      */     //   68: bipush 50
/*      */     //   70: if_icmpge +23 -> 93
/*      */     //   73: aload_1
/*      */     //   74: getfield 45	ak:z	Ljava/awt/EventQueue;
/*      */     //   77: invokevirtual 51	java/awt/EventQueue:peekEvent	()Ljava/awt/AWTEvent;
/*      */     //   80: ifnull +13 -> 93
/*      */     //   83: lconst_1
/*      */     //   84: invokestatic 37	cl:r	(J)V
/*      */     //   87: iinc 3 1
/*      */     //   90: goto -23 -> 67
/*      */     //   93: aload_2
/*      */     //   94: ifnull +23 -> 117
/*      */     //   97: aload_1
/*      */     //   98: getfield 45	ak:z	Ljava/awt/EventQueue;
/*      */     //   101: new 53	java/awt/event/ActionEvent
/*      */     //   104: dup
/*      */     //   105: aload_2
/*      */     //   106: sipush 1001
/*      */     //   109: ldc 55
/*      */     //   111: invokespecial 59	java/awt/event/ActionEvent:<init>	(Ljava/lang/Object;ILjava/lang/String;)V
/*      */     //   114: invokevirtual 63	java/awt/EventQueue:postEvent	(Ljava/awt/AWTEvent;)V
/*      */     //   117: goto -112 -> 5
/*      */     //   120: aload_0
/*      */     //   121: iconst_0
/*      */     //   122: putfield 21	f:m	Z
/*      */     //   125: goto +29 -> 154
/*      */     //   128: astore_1
/*      */     //   129: aconst_null
/*      */     //   130: aload_1
/*      */     //   131: ldc 75
/*      */     //   133: invokestatic 69	dy:r	(Ljava/lang/String;Ljava/lang/Throwable;I)V
/*      */     //   136: aload_0
/*      */     //   137: iconst_0
/*      */     //   138: putfield 21	f:m	Z
/*      */     //   141: goto +13 -> 154
/*      */     //   144: astore 4
/*      */     //   146: aload_0
/*      */     //   147: iconst_0
/*      */     //   148: putfield 21	f:m	Z
/*      */     //   151: aload 4
/*      */     //   153: athrow
/*      */     //   154: return
/*      */     //
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   5	120	128	java/lang/Exception
/*      */     //   5	146	144	finally
/*      */   }
/*      */ 
/*      */   // ERROR //
/*      */   public void d()
/*      */   {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: iconst_1
/*      */     //   2: putfield 21	f:m	Z
/*      */     //   5: aload_0
/*      */     //   6: getfield 23	f:l	Z
/*      */     //   9: ifne +111 -> 120
/*      */     //   12: iconst_0
/*      */     //   13: istore_1
/*      */     //   14: iload_1
/*      */     //   15: iconst_2
/*      */     //   16: if_icmpge +26 -> 42
/*      */     //   19: aload_0
/*      */     //   20: getfield 25	f:d	[Ly;
/*      */     //   23: iload_1
/*      */     //   24: aaload
/*      */     //   25: astore_2
/*      */     //   26: aload_2
/*      */     //   27: ifnull +9 -> 36
/*      */     //   30: aload_2
/*      */     //   31: bipush 204
/*      */     //   33: invokevirtual 30	y:m	(B)V
/*      */     //   36: iinc 1 1
/*      */     //   39: goto -25 -> 14
/*      */     //   42: ldc2_w 31
/*      */     //   45: invokestatic 37	cl:r	(J)V
/*      */     //   48: aload_0
/*      */     //   49: getfield 39	f:r	Lak;
/*      */     //   52: astore_1
/*      */     //   53: aconst_null
/*      */     //   54: astore_2
/*      */     //   55: aload_1
/*      */     //   56: getfield 45	ak:z	Ljava/awt/EventQueue;
/*      */     //   59: ifnonnull +6 -> 65
/*      */     //   62: goto +55 -> 117
/*      */     //   65: iconst_0
/*      */     //   66: istore_3
/*      */     //   67: iload_3
/*      */     //   68: bipush 50
/*      */     //   70: if_icmpge +23 -> 93
/*      */     //   73: aload_1
/*      */     //   74: getfield 45	ak:z	Ljava/awt/EventQueue;
/*      */     //   77: invokevirtual 51	java/awt/EventQueue:peekEvent	()Ljava/awt/AWTEvent;
/*      */     //   80: ifnull +13 -> 93
/*      */     //   83: lconst_1
/*      */     //   84: invokestatic 37	cl:r	(J)V
/*      */     //   87: iinc 3 1
/*      */     //   90: goto -23 -> 67
/*      */     //   93: aload_2
/*      */     //   94: ifnull +23 -> 117
/*      */     //   97: aload_1
/*      */     //   98: getfield 45	ak:z	Ljava/awt/EventQueue;
/*      */     //   101: new 53	java/awt/event/ActionEvent
/*      */     //   104: dup
/*      */     //   105: aload_2
/*      */     //   106: sipush 1001
/*      */     //   109: ldc 55
/*      */     //   111: invokespecial 59	java/awt/event/ActionEvent:<init>	(Ljava/lang/Object;ILjava/lang/String;)V
/*      */     //   114: invokevirtual 63	java/awt/EventQueue:postEvent	(Ljava/awt/AWTEvent;)V
/*      */     //   117: goto -112 -> 5
/*      */     //   120: aload_0
/*      */     //   121: iconst_0
/*      */     //   122: putfield 21	f:m	Z
/*      */     //   125: goto +29 -> 154
/*      */     //   128: astore_1
/*      */     //   129: aconst_null
/*      */     //   130: aload_1
/*      */     //   131: ldc 76
/*      */     //   133: invokestatic 69	dy:r	(Ljava/lang/String;Ljava/lang/Throwable;I)V
/*      */     //   136: aload_0
/*      */     //   137: iconst_0
/*      */     //   138: putfield 21	f:m	Z
/*      */     //   141: goto +13 -> 154
/*      */     //   144: astore 4
/*      */     //   146: aload_0
/*      */     //   147: iconst_0
/*      */     //   148: putfield 21	f:m	Z
/*      */     //   151: aload 4
/*      */     //   153: athrow
/*      */     //   154: return
/*      */     //
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   5	120	128	java/lang/Exception
/*      */     //   5	146	144	finally
/*      */   }
/*      */ 
/*      */   // ERROR //
/*      */   public void l()
/*      */   {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: iconst_1
/*      */     //   2: putfield 21	f:m	Z
/*      */     //   5: aload_0
/*      */     //   6: getfield 23	f:l	Z
/*      */     //   9: ifne +111 -> 120
/*      */     //   12: iconst_0
/*      */     //   13: istore_1
/*      */     //   14: iload_1
/*      */     //   15: iconst_2
/*      */     //   16: if_icmpge +26 -> 42
/*      */     //   19: aload_0
/*      */     //   20: getfield 25	f:d	[Ly;
/*      */     //   23: iload_1
/*      */     //   24: aaload
/*      */     //   25: astore_2
/*      */     //   26: aload_2
/*      */     //   27: ifnull +9 -> 36
/*      */     //   30: aload_2
/*      */     //   31: bipush 149
/*      */     //   33: invokevirtual 30	y:m	(B)V
/*      */     //   36: iinc 1 1
/*      */     //   39: goto -25 -> 14
/*      */     //   42: ldc2_w 31
/*      */     //   45: invokestatic 37	cl:r	(J)V
/*      */     //   48: aload_0
/*      */     //   49: getfield 39	f:r	Lak;
/*      */     //   52: astore_1
/*      */     //   53: aconst_null
/*      */     //   54: astore_2
/*      */     //   55: aload_1
/*      */     //   56: getfield 45	ak:z	Ljava/awt/EventQueue;
/*      */     //   59: ifnonnull +6 -> 65
/*      */     //   62: goto +55 -> 117
/*      */     //   65: iconst_0
/*      */     //   66: istore_3
/*      */     //   67: iload_3
/*      */     //   68: bipush 50
/*      */     //   70: if_icmpge +23 -> 93
/*      */     //   73: aload_1
/*      */     //   74: getfield 45	ak:z	Ljava/awt/EventQueue;
/*      */     //   77: invokevirtual 51	java/awt/EventQueue:peekEvent	()Ljava/awt/AWTEvent;
/*      */     //   80: ifnull +13 -> 93
/*      */     //   83: lconst_1
/*      */     //   84: invokestatic 37	cl:r	(J)V
/*      */     //   87: iinc 3 1
/*      */     //   90: goto -23 -> 67
/*      */     //   93: aload_2
/*      */     //   94: ifnull +23 -> 117
/*      */     //   97: aload_1
/*      */     //   98: getfield 45	ak:z	Ljava/awt/EventQueue;
/*      */     //   101: new 53	java/awt/event/ActionEvent
/*      */     //   104: dup
/*      */     //   105: aload_2
/*      */     //   106: sipush 1001
/*      */     //   109: ldc 55
/*      */     //   111: invokespecial 59	java/awt/event/ActionEvent:<init>	(Ljava/lang/Object;ILjava/lang/String;)V
/*      */     //   114: invokevirtual 63	java/awt/EventQueue:postEvent	(Ljava/awt/AWTEvent;)V
/*      */     //   117: goto -112 -> 5
/*      */     //   120: aload_0
/*      */     //   121: iconst_0
/*      */     //   122: putfield 21	f:m	Z
/*      */     //   125: goto +29 -> 154
/*      */     //   128: astore_1
/*      */     //   129: aconst_null
/*      */     //   130: aload_1
/*      */     //   131: ldc 77
/*      */     //   133: invokestatic 69	dy:r	(Ljava/lang/String;Ljava/lang/Throwable;I)V
/*      */     //   136: aload_0
/*      */     //   137: iconst_0
/*      */     //   138: putfield 21	f:m	Z
/*      */     //   141: goto +13 -> 154
/*      */     //   144: astore 4
/*      */     //   146: aload_0
/*      */     //   147: iconst_0
/*      */     //   148: putfield 21	f:m	Z
/*      */     //   151: aload 4
/*      */     //   153: athrow
/*      */     //   154: return
/*      */     //
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   5	120	128	java/lang/Exception
/*      */     //   5	146	144	finally
/*      */   }
/*      */ 
/*      */   static final void eq(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*      */   {
/* 5991 */     if (paramInt3 >= 1) { if (paramInt8 != 1688333977) throw new IllegalStateException(); if ((paramInt4 >= 1) && ((paramInt8 != 1688333977) || (paramInt3 <= 102))) { if (paramInt8 != 1688333977) return; if (paramInt4 <= 102) { if ((paramInt8 != 1688333977) || 
/* 5992 */             (client.ao)) { if (paramInt8 != 1688333977) return; if (paramInt1 != 409487383 * al.in) { if (paramInt8 != 1688333977) return; return; } }
/* 5993 */           int i = 0;
/* 5994 */           int j = -1;
/* 5995 */           int n = 0;
/* 5996 */           int i1 = 0;
/* 5997 */           if (paramInt2 == 0) { if (paramInt8 != 1688333977) throw new IllegalStateException(); i = cr.eg.ad(paramInt1, paramInt3, paramInt4); }
/* 5998 */           if (paramInt2 == 1) { if (paramInt8 == 1688333977);
/* 5998 */             i = cr.eg.ac(paramInt1, paramInt3, paramInt4); }
/* 5999 */           if (paramInt2 == 2) { if (paramInt8 != 1688333977) return; i = cr.eg.aa(paramInt1, paramInt3, paramInt4); }
/* 6000 */           if (3 == paramInt2) { if (paramInt8 != 1688333977) throw new IllegalStateException(); i = cr.eg.as(paramInt1, paramInt3, paramInt4);
/*      */           }
/* 6001 */           int i2;
/* 6001 */           if (0 != i) { if (paramInt8 != 1688333977) return;
/* 6002 */             i2 = cr.eg.am(paramInt1, paramInt3, paramInt4, i);
/* 6003 */             j = i >> 14 & 0x7FFF;
/* 6004 */             n = i2 & 0x1F;
/* 6005 */             i1 = i2 >> 6 & 0x3;
/*      */             ey localey;
/* 6006 */             if (0 == paramInt2) { if (paramInt8 == 1688333977);
/* 6007 */               cr.eg.y(paramInt1, paramInt3, paramInt4);
/* 6008 */               localey = fj.g(j, (byte)100);
/* 6009 */               if (0 != -1013851739 * localey.h) { if (paramInt8 != 1688333977) throw new IllegalStateException(); client.el[paramInt1].j(paramInt3, paramInt4, n, i1, localey.x, -2038462727); }
/*      */             }
/* 6011 */             if (paramInt2 == 1) { if (paramInt8 == 1688333977);
/* 6011 */               cr.eg.t(paramInt1, paramInt3, paramInt4); }
/* 6012 */             if (paramInt2 == 2) { if (paramInt8 != 1688333977) return;
/* 6013 */               cr.eg.f(paramInt1, paramInt3, paramInt4);
/* 6014 */               localey = fj.g(j, (byte)100);
/* 6015 */               if ((paramInt3 + localey.o * 533735227 <= 103) && ((paramInt8 != 1688333977) || (533735227 * localey.o + paramInt4 <= 103))) { if (paramInt8 != 1688333977) throw new IllegalStateException(); if (paramInt3 + localey.a * -1137199387 <= 103) { if ((paramInt8 == 1688333977) && (paramInt4 + localey.a * -1137199387 <= 103)) break label522; if (paramInt8 != 1688333977) throw new IllegalStateException();  }  }
/* 6015 */               return;
/* 6016 */               label522: if (localey.h * -1013851739 != 0) { if (paramInt8 == 1688333977);
/* 6016 */                 client.el[paramInt1].z(paramInt3, paramInt4, 533735227 * localey.o, -1137199387 * localey.a, i1, localey.x, 2075766960); }
/*      */             }
/* 6018 */             if (3 == paramInt2) { if (paramInt8 == 1688333977);
/* 6019 */               cr.eg.k(paramInt1, paramInt3, paramInt4);
/* 6020 */               localey = fj.g(j, (byte)100);
/* 6021 */               if (1 == -1013851739 * localey.h) { if (paramInt8 != 1688333977) throw new IllegalStateException(); client.el[paramInt1].q(paramInt3, paramInt4, 1948086618); }
/*      */             }
/*      */           }
/* 6024 */           if (paramInt5 >= 0) { if (paramInt8 != 1688333977) throw new IllegalStateException();
/* 6025 */             i2 = paramInt1;
/* 6026 */             if (i2 < 3) { if (paramInt8 != 1688333977) return; if ((l.d[1][paramInt3][paramInt4] & 0x2) == 2) { if (paramInt8 != 1688333977) throw new IllegalStateException(); i2++; } }
/* 6027 */             bc.t(paramInt1, i2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, cr.eg, client.el[paramInt1], -305169195);
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static em g(int paramInt, byte paramByte)
/*      */   {
/*   58 */     em localem = (em)em.z.r(paramInt);
/*   59 */     if (localem != null) { if (paramByte < 1);
/*   59 */       return localem; }
/*   60 */     byte[] arrayOfByte = em.n.l(9, paramInt, 1022629068);
/*   61 */     localem = new em();
/*   62 */     localem.q = (2099104683 * paramInt);
/*   63 */     if (null != arrayOfByte) { if (paramByte >= 1) throw new IllegalStateException(); localem.i(new ev(arrayOfByte), -1363994354); }
/*   64 */     localem.q(1139110864);
/*   65 */     em.z.l(localem, paramInt);
/*   66 */     return localem;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     f
 * JD-Core Version:    0.6.2
 */