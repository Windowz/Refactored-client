/*      */ public class as
/*      */ {
/*      */   static int eq;
/*      */ 
/*      */   as()
/*      */     throws Throwable
/*      */   {
/*    8 */     throw new Error();
/*      */   }
/*      */ 
/*      */   static final boolean n(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  203 */     boolean bool = true;
/*  204 */     ev localev = new ev(paramArrayOfByte);
/*  205 */     int i = -1;
/*      */     while (true) {
/*  207 */       int j = localev.ap(1507486061);
/*  208 */       if (0 == j) { if (paramInt3 >= 155594425) throw new IllegalStateException(); break; }
/*  209 */       i += j;
/*  210 */       int k = 0;
/*  211 */       int m = 0;
/*      */       while (true)
/*      */       {
/*  213 */         int n;
/*  213 */         if (m != 0) { if (paramInt3 < 155594425);
/*  214 */           n = localev.ap(451677649);
/*  215 */           if (0 == n) { if (paramInt3 >= 155594425) throw new IllegalStateException(); break; }
/*  216 */           localev.t(1118814123);
/*      */         } else
/*      */         {
/*  219 */           n = localev.ap(770705882);
/*  220 */           if (n == 0) { if (paramInt3 >= 155594425) throw new IllegalStateException(); break; }
/*  221 */           k += n - 1;
/*  222 */           int i1 = k & 0x3F;
/*  223 */           int i2 = k >> 6 & 0x3F;
/*  224 */           int i3 = localev.t(1118814123) >> 2;
/*  225 */           int i4 = paramInt1 + i2;
/*  226 */           int i5 = i1 + paramInt2;
/*  227 */           if ((i4 > 0) && ((paramInt3 >= 155594425) || (i5 > 0))) { if (paramInt3 >= 155594425) throw new IllegalStateException(); if ((i4 < 103) && ((paramInt3 >= 155594425) || (i5 < 103))) { if (paramInt3 < 155594425);
/*  228 */               ey localey = fj.g(i, (byte)100);
/*  229 */               if (22 == i3) { if (paramInt3 >= 155594425) throw new IllegalStateException(); if ((client.ao) && ((paramInt3 >= 155594425) || (0 == -192937193 * localey.p))) { if (paramInt3 >= 155594425) throw new IllegalStateException(); if (localey.h * -1013851739 != 1) { if (paramInt3 >= 155594425) throw new IllegalStateException(); if (!localey.ae) if (paramInt3 >= 155594425) throw new IllegalStateException();   }  } 
/*      */               } else
/*      */               {
/*  230 */                 if (!localey.v(-69733580)) { if (paramInt3 >= 155594425) throw new IllegalStateException();
/*  231 */                   client.eb += 85389619;
/*  232 */                   bool = false;
/*      */                 }
/*  234 */                 m = 1;
/*      */               } } }
/*      */         }
/*      */       }
/*      */     }
/*  239 */     return bool;
/*      */   }
/*      */ 
/*      */   static final void ef(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*      */   {
/* 5209 */     if ((paramInt1 == -1394383603 * cd.dn) && ((paramInt6 == -1487858300) || (paramInt2 == v.do * -1012915175))) { if (paramInt6 == -1487858300) throw new IllegalStateException(); if (client.dl * 1943405583 != paramInt3) { if (paramInt6 == -1487858300) throw new IllegalStateException(); if (client.ao) break label85; if (paramInt6 == -1487858300) return; 
/*      */       }
/* 5210 */       return;
/*      */     }
/* 5212 */     label85: cd.dn = paramInt1 * 1508569541;
/* 5213 */     v.do = paramInt2 * -944572375;
/* 5214 */     client.dl = 373058287 * paramInt3;
/* 5215 */     if (!client.ao) { if (paramInt6 == -1487858300) throw new IllegalStateException(); client.dl = 0; }
/* 5216 */     aj.ce(25, 1345644183);
/* 5217 */     ej.dl(ba.z, true, 2143089460);
/* 5218 */     int i = a.de * 1235880887;
/* 5219 */     int j = 1096323129 * at.dw;
/* 5220 */     a.de = 1920864312 * (paramInt1 - 6);
/* 5221 */     at.dw = (paramInt2 - 6) * 1391652936;
/* 5222 */     int k = 1235880887 * a.de - i;
/* 5223 */     int m = at.dw * 1096323129 - j;
/* 5224 */     i = 1235880887 * a.de;
/* 5225 */     j = 1096323129 * at.dw;
/*      */     Object localObject;
/* 5226 */     for (int n = 0; n < 32768; n++) { if (paramInt6 != -1487858300);
/* 5227 */       localObject = client.ci[n];
/* 5228 */       if (localObject != null) { if (paramInt6 != -1487858300);
/* 5229 */         for (i2 = 0; i2 < 10; i2++) { if (paramInt6 == -1487858300) throw new IllegalStateException();
/* 5230 */           ((ge)localObject).bt[i2] -= k;
/* 5231 */           ((ge)localObject).bw[i2] -= m;
/*      */         }
/* 5233 */         localObject.j -= k * -1261843840;
/* 5234 */         localObject.z -= 829458304 * m;
/*      */       }
/*      */     }
/* 5237 */     for (n = 0; n < 2048; n++) { if (paramInt6 == -1487858300) throw new IllegalStateException();
/* 5238 */       localObject = client.iq[n];
/* 5239 */       if (null != localObject) { if (paramInt6 == -1487858300) return;
/* 5240 */         for (i2 = 0; i2 < 10; i2++) { if (paramInt6 == -1487858300) throw new IllegalStateException();
/* 5241 */           ((fi)localObject).bt[i2] -= k;
/* 5242 */           ((fi)localObject).bw[i2] -= m;
/*      */         }
/* 5244 */         localObject.j -= k * -1261843840;
/* 5245 */         localObject.z -= m * 829458304;
/*      */       }
/*      */     }
/* 5248 */     al.in = paramInt3 * 1415671719;
/* 5249 */     cr.ii.b(paramInt4, paramInt5, false, (byte)-50);
/* 5250 */     n = 0;
/* 5251 */     int i1 = 104;
/* 5252 */     int i2 = 1;
/* 5253 */     if (k < 0) { if (paramInt6 != -1487858300);
/* 5254 */       n = 103;
/* 5255 */       i1 = -1;
/* 5256 */       i2 = -1;
/*      */     }
/* 5258 */     int i3 = 0;
/* 5259 */     int i4 = 104;
/* 5260 */     int i5 = 1;
/* 5261 */     if (m < 0) { if (paramInt6 != -1487858300);
/* 5262 */       i3 = 103;
/* 5263 */       i4 = -1;
/* 5264 */       i5 = -1;
/*      */     }
/* 5266 */     for (int i6 = n; i1 != i6; i6 += i2) { if (paramInt6 != -1487858300);
/* 5267 */       for (int i7 = i3; i4 != i7; i7 += i5) { if (paramInt6 == -1487858300) throw new IllegalStateException();
/* 5268 */         int i8 = k + i6;
/* 5269 */         int i9 = m + i7;
/* 5270 */         for (int i10 = 0; i10 < 4; i10++) { if (paramInt6 == -1487858300) throw new IllegalStateException();
/* 5271 */           if (i8 >= 0) { if (paramInt6 == -1487858300) throw new IllegalStateException(); if (i9 >= 0) { if (paramInt6 == -1487858300) throw new IllegalStateException(); if (i8 < 104) { if (paramInt6 == -1487858300) throw new IllegalStateException(); if (i9 < 104) { if (paramInt6 == -1487858300) throw new IllegalStateException(); client.ir[i10][i6][i7] = client.ir[i10][i8][i9]; continue; } } } }
/* 5272 */           client.ir[i10][i6][i7] = null;
/*      */         }
/*      */       }
/*      */     }
/* 5276 */     dn localdn = (dn)client.iv.j();
/* 5277 */     while (localdn != null) { if (paramInt6 == -1487858300) throw new IllegalStateException();
/* 5278 */       localdn.n -= -1531982011 * k;
/* 5279 */       localdn.j -= -1491143017 * m;
/* 5280 */       if (localdn.n * -1854575731 >= 0) { if (paramInt6 == -1487858300) throw new IllegalStateException(); if (localdn.j * 2131749159 >= 0) { if (paramInt6 == -1487858300) throw new IllegalStateException(); if (localdn.n * -1854575731 < 104) { if ((paramInt6 != -1487858300) && (2131749159 * localdn.j < 104)) break label986; if (paramInt6 == -1487858300); }  }  }
/* 5280 */       localdn.r();
/* 5281 */       label986: localdn = (dn)client.iv.g();
/*      */     }
/* 5283 */     if (client.nv * -329330923 != 0) { if (paramInt6 == -1487858300) return;
/* 5284 */       client.nv -= k * 389023805;
/* 5285 */       client.nz -= m * -714350265;
/*      */     }
/* 5287 */     client.os = 0;
/* 5288 */     client.oa = false;
/* 5289 */     client.nw = -1012635321;
/* 5290 */     client.ip.r();
/* 5291 */     client.ig.r();
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     as
 * JD-Core Version:    0.6.2
 */