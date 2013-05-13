/*      */ import java.lang.reflect.Field;
/*      */ import java.lang.reflect.Method;
/*      */ 
/*      */ public class ek extends dg
/*      */ {
/*      */   public Field[] g;
/*      */   public int n;
/*      */   public int c;
/*      */   public int[] z;
/*      */   public int[] q;
/*      */   public byte[][][] m;
/*      */   public int[] j;
/*      */   public Method[] i;
/*      */ 
/*      */   static final void er(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/* 5038 */     if (-826116947 * client.hs == 1) { if (paramInt5 == -1755329803) return;
/* 5039 */       ej.fh[(-284511209 * client.hn / 100)].cj(client.hl * -777444849 - 8, -1718478003 * client.hj - 8);
/*      */     }
/* 5041 */     if (-826116947 * client.hs == 2) { if (paramInt5 != -1755329803);
/* 5042 */       ej.fh[(-284511209 * client.hn / 100 + 4)].cj(-777444849 * client.hl - 8, client.hj * -1718478003 - 8);
/*      */     }
/*      */ 
/* 5045 */     client.hy = 0;
/* 5046 */     int k = 1235880887 * a.de + (-1481433155 * cr.ii.j >> 7);
/* 5047 */     int i1 = at.dw * 1096323129 + (-1453593105 * cr.ii.z >> 7);
/* 5048 */     if (k >= 3053) { if (paramInt5 == -1755329803) throw new IllegalStateException(); if (k <= 3156) { if (paramInt5 == -1755329803) throw new IllegalStateException(); if (i1 >= 3056) { if (paramInt5 == -1755329803) throw new IllegalStateException(); if (i1 <= 3136) { if (paramInt5 == -1755329803) return; client.hy = 970119479; } } } }
/* 5049 */     if (k >= 3072) { if (paramInt5 == -1755329803) return; if ((k <= 3118) && ((paramInt5 == -1755329803) || (i1 >= 9492))) { if (paramInt5 == -1755329803) throw new IllegalStateException(); if (i1 <= 9535) { if (paramInt5 != -1755329803);
/* 5049 */           client.hy = 970119479; } } }
/* 5050 */     if ((1 == client.hy * 341191815) && ((paramInt5 == -1755329803) || ((k >= 3139) && ((paramInt5 == -1755329803) || (k <= 3199))))) { if (paramInt5 == -1755329803) throw new IllegalStateException(); if (i1 >= 3008) { if (paramInt5 == -1755329803) return; if (i1 <= 3062) { if (paramInt5 == -1755329803) throw new IllegalStateException(); client.hy = 0; } }
/*      */     }
/* 5052 */     if (client.bi) { if (paramInt5 == -1755329803) return;
/* 5053 */       k = 512 + paramInt1 - 5;
/* 5054 */       i1 = paramInt2 + 20;
/* 5055 */       bd.dq.cr("Fps:" + 727890019 * client.q, k, i1, 16776960, -1);
/* 5056 */       i1 += 15;
/* 5057 */       Runtime localRuntime = Runtime.getRuntime();
/* 5058 */       int i2 = (int)((localRuntime.totalMemory() - localRuntime.freeMemory()) / 1024L);
/* 5059 */       int i3 = 16776960;
/* 5060 */       if ((i2 > 32768) && ((paramInt5 == -1755329803) || (client.ao))) { if (paramInt5 != -1755329803);
/* 5060 */         i3 = 16711680; }
/* 5061 */       if ((i2 > 65536) && ((paramInt5 == -1755329803) || (!client.ao))) { if (paramInt5 != -1755329803);
/* 5061 */         i3 = 16711680; }
/* 5062 */       bd.dq.cr("Mem:" + i2 + "k", k, i1, i3, -1);
/* 5063 */       i1 += 15;
/*      */     }
/*      */   }
/*      */ 
/*      */   public static fe z(int paramInt1, int paramInt2)
/*      */   {
/*   24 */     fe localfe = (fe)fe.j.r(paramInt1);
/*   25 */     if (localfe != null) { if (paramInt2 == -1914557735);
/*   25 */       return localfe; }
/*   26 */     byte[] arrayOfByte = fe.n.l(8, paramInt1, 251395877);
/*   27 */     localfe = new fe();
/*   28 */     if (arrayOfByte != null) { if (paramInt2 != -1914557735) throw new IllegalStateException(); localfe.g(new ev(arrayOfByte), 367634260); }
/*   29 */     fe.j.l(localfe, paramInt1);
/*   30 */     return localfe;
/*      */   }
/*      */ 
/*      */   public static void d(int paramInt1, int paramInt2)
/*      */   {
/*   38 */     an.d = paramInt1 * 1461677081;
/*      */   }
/*      */ 
/*      */   public static String r(int paramInt, byte paramByte)
/*      */   {
/*   11 */     return (paramInt >> 24 & 0xFF) + "." + (paramInt >> 16 & 0xFF) + "." + (paramInt >> 8 & 0xFF) + "." + (paramInt & 0xFF);
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ek
 * JD-Core Version:    0.6.2
 */