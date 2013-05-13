/*      */ public class dw extends dg
/*      */ {
/*      */   String m;
/*      */   String c;
/*      */   byte j;
/*      */   int n;
/*      */   static fm db;
/*      */ 
/*      */   public static boolean z(int paramInt1, int paramInt2)
/*      */   {
/*  173 */     if (df.c[paramInt1] != 0) { if (paramInt2 < 305883664);
/*  173 */       return true; }
/*  174 */     if (!eg.n.n(paramInt1, -1518561636)) { if (paramInt2 >= 305883664) throw new IllegalStateException(); return false; }
/*  175 */     int i = eg.n.u(paramInt1, (short)-12507);
/*  176 */     if (i == 0) { if (paramInt2 >= 305883664) throw new IllegalStateException();
/*  177 */       df.c[paramInt1] = true;
/*  178 */       return true;
/*      */     }
/*  180 */     if (av.m[paramInt1] == null) { if (paramInt2 < 305883664);
/*  180 */       av.m[paramInt1] = new eg[i]; }
/*  181 */     for (int k = 0; k < i; k++) if ((paramInt2 >= 305883664) || 
/*  182 */         (null == av.m[paramInt1][k])) { if (paramInt2 >= 305883664) throw new IllegalStateException();
/*  183 */         byte[] arrayOfByte = eg.n.l(paramInt1, k, 2006055078);
/*  184 */         if (null != arrayOfByte) { if (paramInt2 >= 305883664) throw new IllegalStateException();
/*  185 */           av.m[paramInt1][k] = new eg();
/*  186 */           av.m[paramInt1][k].w = ((k + (paramInt1 << 16)) * 1131599641);
/*  187 */           if (-1 == arrayOfByte[0]) { if (paramInt2 < 305883664);
/*  187 */             av.m[paramInt1][k].q(new ev(arrayOfByte), -14716853); } else {
/*  188 */             av.m[paramInt1][k].g(new ev(arrayOfByte), -58347769);
/*      */           }
/*      */         }
/*      */       }
/*  192 */     df.c[paramInt1] = true;
/*  193 */     return true;
/*      */   }
/*      */ 
/*      */   public static void l(int paramInt)
/*      */   {
/*  127 */     if (null != az.r) { if (paramInt != 920953833) return;
/*  128 */       synchronized (az.r) {
/*  129 */         az.r = null;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void jdMethod_do(boolean paramBoolean, byte paramByte)
/*      */   {
/* 4977 */     for (int i = 0; i < 348729793 * client.cb; i++) { if (paramByte == 8) throw new IllegalStateException();
/* 4978 */       ge localge = client.ci[client.cf[i]];
/* 4979 */       int k = 536870912 + (client.cf[i] << 14);
/* 4980 */       if ((localge != null) && ((paramByte == 8) || ((localge.f(1531790724)) && ((paramByte == 8) || (localge.bu.am == paramBoolean))))) { if (paramByte == 8) throw new IllegalStateException(); if (localge.bu.e(-418538595)) { if (paramByte != 8);
/* 4981 */           int i1 = localge.j * -1481433155 >> 7;
/* 4982 */           int i2 = localge.z * -1453593105 >> 7;
/* 4983 */           if ((i1 >= 0) && ((paramByte == 8) || (i1 < 104))) { if (paramByte == 8) return; if ((i2 >= 0) && ((paramByte == 8) || (i2 < 104))) { if (paramByte == 8) return;
/* 4984 */               if (1 == localge.i * 1787643845) { if (paramByte == 8) return; if (64 == (-1481433155 * localge.j & 0x7F)) { if (paramByte == 8) return; if ((localge.z * -1453593105 & 0x7F) == 64) { if ((paramByte == 8) || 
/* 4985 */                       (client.hk[i1][i2] == 306669323 * client.hr)) { if (paramByte == 8) throw new IllegalStateException(); continue; }
/* 4986 */                     client.hk[i1][i2] = (client.hr * 306669323); } }
/*      */               }
/* 4988 */               if (!localge.bu.al) { if (paramByte != 8);
/* 4988 */                 k -= -2147483648; }
/* 4989 */               cr.eg.s(409487383 * al.in, -1481433155 * localge.j, -1453593105 * localge.z, bw.ev(localge.j * -1481433155 + (-1554910912 * localge.i - 64), -1554910912 * localge.i - 64 + localge.z * -1453593105, 409487383 * al.in, -1689926450), -1554910912 * localge.i - 64 + 60, localge, localge.g * 265411181, k, localge.q);
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     dw
 * JD-Core Version:    0.6.2
 */