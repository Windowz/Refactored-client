/*      */ public class dl extends dg
/*      */ {
/*    8 */   int[] c = { -1 };
/*      */ 
/*    7 */   static cf m = new cf(32);
/*      */ 
/*    9 */   int[] n = { 0 };
/*      */   public static boolean i;
/*      */   static int gt;
/*      */   static fq ns;
/*      */   public static int z;
/*      */ 
/*      */   static int q(int paramInt1, int paramInt2)
/*      */   {
/*   14 */     dl localdl = (dl)m.r(paramInt1);
/*   15 */     if (null == localdl) return 0;
/*   16 */     if ((paramInt2 < 0) || (paramInt2 >= localdl.n.length)) return 0;
/*   17 */     return localdl.n[paramInt2];
/*      */   }
/*      */ 
/*      */   static int g(int paramInt1, int paramInt2)
/*      */   {
/*   14 */     dl localdl = (dl)m.r(paramInt1);
/*   15 */     if (null == localdl) return 0;
/*   16 */     if ((paramInt2 < 0) || (paramInt2 >= localdl.n.length)) return 0;
/*   17 */     return localdl.n[paramInt2];
/*      */   }
/*      */ 
/*      */   static void u(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   32 */     dl localdl = (dl)m.r(paramInt1);
/*   33 */     if (localdl == null) {
/*   34 */       localdl = new dl();
/*   35 */       m.d(localdl, paramInt1);
/*      */     }
/*   37 */     if (localdl.c.length <= paramInt2) {
/*   38 */       int[] arrayOfInt1 = new int[1 + paramInt2];
/*   39 */       int[] arrayOfInt2 = new int[1 + paramInt2];
/*   40 */       for (int j = 0; j < localdl.c.length; j++) {
/*   41 */         arrayOfInt1[j] = localdl.c[j];
/*   42 */         arrayOfInt2[j] = localdl.n[j];
/*      */       }
/*   44 */       for (j = localdl.c.length; j < paramInt2; j++) {
/*   45 */         arrayOfInt1[j] = -1;
/*   46 */         arrayOfInt2[j] = 0;
/*      */       }
/*   48 */       localdl.c = arrayOfInt1;
/*   49 */       localdl.n = arrayOfInt2;
/*      */     }
/*   51 */     localdl.c[paramInt2] = paramInt3;
/*   52 */     localdl.n[paramInt2] = paramInt4;
/*      */   }
/*      */ 
/*      */   static int i(int paramInt1, int paramInt2)
/*      */   {
/*   21 */     dl localdl = (dl)m.r(paramInt1);
/*   22 */     if (null == localdl) return 0;
/*   23 */     if (-1 == paramInt2) return 0;
/*   24 */     int j = 0;
/*   25 */     for (int k = 0; k < localdl.n.length; k++) {
/*   26 */       if (paramInt2 == localdl.c[k]) j += localdl.n[k];
/*      */     }
/*   28 */     return j;
/*      */   }
/*      */ 
/*      */   static void s(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   32 */     dl localdl = (dl)m.r(paramInt1);
/*   33 */     if (localdl == null) {
/*   34 */       localdl = new dl();
/*   35 */       m.d(localdl, paramInt1);
/*      */     }
/*   37 */     if (localdl.c.length <= paramInt2) {
/*   38 */       int[] arrayOfInt1 = new int[1 + paramInt2];
/*   39 */       int[] arrayOfInt2 = new int[1 + paramInt2];
/*   40 */       for (int j = 0; j < localdl.c.length; j++) {
/*   41 */         arrayOfInt1[j] = localdl.c[j];
/*   42 */         arrayOfInt2[j] = localdl.n[j];
/*      */       }
/*   44 */       for (j = localdl.c.length; j < paramInt2; j++) {
/*   45 */         arrayOfInt1[j] = -1;
/*   46 */         arrayOfInt2[j] = 0;
/*      */       }
/*   48 */       localdl.c = arrayOfInt1;
/*   49 */       localdl.n = arrayOfInt2;
/*      */     }
/*   51 */     localdl.c[paramInt2] = paramInt3;
/*   52 */     localdl.n[paramInt2] = paramInt4;
/*      */   }
/*      */ 
/*      */   static void v(int paramInt) {
/*   56 */     dl localdl = (dl)m.r(paramInt);
/*   57 */     if (localdl == null) return;
/*   58 */     localdl.r();
/*      */   }
/*      */ 
/*      */   static final void dn(boolean paramBoolean, int paramInt)
/*      */   {
/* 4934 */     if (client.nv * -329330923 == cr.ii.j * -1481433155 >> 7) { if (paramInt <= -855065600) throw new IllegalStateException(); if (355956855 * client.nz == cr.ii.z * -1453593105 >> 7) { if (paramInt > -855065600);
/* 4935 */         client.nv = 0; }
/*      */     }
/* 4937 */     int j = client.ie * 939573231;
/* 4938 */     if (paramBoolean) { if (paramInt > -855065600);
/* 4938 */       j = 1; }
/* 4939 */     for (int k = 0; k < j; k++)
/*      */     {
/* 4942 */       fi localfi;
/*      */       int i1;
/* 4939 */       if ((paramInt <= -855065600) || 
/* 4942 */         (paramBoolean)) { if (paramInt <= -855065600) return;
/* 4943 */         localfi = cr.ii;
/* 4944 */         i1 = 33538048;
/*      */       } else
/*      */       {
/* 4947 */         localfi = client.iq[client.if[k]];
/* 4948 */         i1 = client.if[k] << 14;
/*      */       }
/* 4950 */       if ((localfi != null) && ((paramInt <= -855065600) || (localfi.f(1531790724)))) { if (paramInt <= -855065600) return;
/* 4951 */         localfi.cl = false;
/* 4952 */         if (client.ao) { if (paramInt <= -855065600) return; if ((939573231 * client.ie <= 50) && (paramInt <= -855065600)); } if ((939573231 * client.ie > 200) && ((paramInt <= -855065600) || (
/* 4953 */           (!paramBoolean) && ((paramInt <= -855065600) || (-8253603 * localfi.s == localfi.ak * -818747733))))) { if (paramInt > -855065600);
/* 4953 */           localfi.cl = true;
/*      */         }
/* 4955 */         int i2 = -1481433155 * localfi.j >> 7;
/* 4956 */         int i3 = -1453593105 * localfi.z >> 7;
/* 4957 */         if ((i2 >= 0) && ((paramInt <= -855065600) || ((i2 < 104) && ((paramInt <= -855065600) || ((i3 >= 0) && ((paramInt <= -855065600) || (i3 < 104))))))) { if (paramInt <= -855065600) throw new IllegalStateException();
/* 4958 */           if ((null != localfi.bb) && ((paramInt <= -855065600) || (1513618129 * client.au >= -792334027 * localfi.be))) { if (paramInt <= -855065600) throw new IllegalStateException(); if (1513618129 * client.au < 1471042755 * localfi.bp) { if (paramInt > -855065600);
/* 4959 */               localfi.cl = false;
/* 4960 */               localfi.bn = (bw.ev(-1481433155 * localfi.j, -1453593105 * localfi.z, 409487383 * al.in, -1170893870) * -561474925);
/* 4961 */               cr.eg.u(al.in * 409487383, localfi.j * -1481433155, -1453593105 * localfi.z, localfi.bn * -1005102181, 60, localfi, 265411181 * localfi.g, i1, localfi.bd * 886096953, -1867059705 * localfi.cr, -721441085 * localfi.cs, localfi.cj * 219368585); continue;
/*      */             }
/*      */           }
/* 4964 */           if (64 == (localfi.j * -1481433155 & 0x7F)) { if (paramInt <= -855065600) return; if (64 == (localfi.z * -1453593105 & 0x7F)) { if ((paramInt <= -855065600) || 
/* 4965 */                 (306669323 * client.hr == client.hk[i2][i3])) { if (paramInt <= -855065600) throw new IllegalStateException(); continue; }
/* 4966 */               client.hk[i2][i3] = (306669323 * client.hr); }
/*      */           }
/* 4968 */           localfi.bn = (bw.ev(-1481433155 * localfi.j, -1453593105 * localfi.z, 409487383 * al.in, -1623400038) * -561474925);
/* 4969 */           cr.eg.s(409487383 * al.in, localfi.j * -1481433155, localfi.z * -1453593105, localfi.bn * -1005102181, 60, localfi, localfi.g * 265411181, i1, localfi.q);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static boolean r(ch paramch1, ch paramch2, ch paramch3, ed paramed, byte paramByte)
/*      */   {
/*   26 */     bd.r = paramch1;
/*   27 */     bd.d = paramch2;
/*   28 */     bd.l = paramch3;
/*   29 */     bd.m = paramed;
/*   30 */     return true;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     dl
 * JD-Core Version:    0.6.2
 */