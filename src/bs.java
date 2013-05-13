/*      */ public final class bs
/*      */ {
/*      */   int j;
/*      */   int m;
/*      */   int l;
/*      */   int r;
/*      */   int q;
/*      */   int u;
/*      */   int w;
/*      */   int z;
/*      */   int g;
/*      */   int b;
/*      */   int i;
/*      */   int s;
/*      */   int d;
/*      */   int v;
/*      */   int c;
/*      */   int e;
/*      */   int n;
/*      */   int y;
/*      */   static fq[] ff;
/*      */   static int gx;
/*      */ 
/*      */   public static String m(CharSequence paramCharSequence, int paramInt)
/*      */   {
/*   70 */     String str = bk.d(cj.r(paramCharSequence, -579106608));
/*   71 */     if (str == null) { if (paramInt == 1806592825);
/*   71 */       str = ""; }
/*   72 */     return str;
/*      */   }
/*      */ 
/*      */   static void j(int paramInt1, int paramInt2, int paramInt3, ey paramey, int paramInt4, byte paramByte)
/*      */   {
/*   59 */     de localde = new de();
/*   60 */     localde.c = (116794091 * paramInt1);
/*   61 */     localde.n = (1283318912 * paramInt2);
/*   62 */     localde.j = (-956376192 * paramInt3);
/*   63 */     int k = 533735227 * paramey.o;
/*   64 */     int i1 = paramey.a * -1137199387;
/*   65 */     if (paramInt4 != 1) { if (paramByte <= 1) throw new IllegalStateException(); if (3 != paramInt4) break label105; if (paramByte <= 1) return; 
/*      */     }
/*   66 */     k = paramey.a * -1137199387;
/*   67 */     i1 = 533735227 * paramey.o;
/*      */ 
/*   69 */     label105: localde.z = ((k + paramInt2) * 1316003456);
/*   70 */     localde.g = (-175821184 * (paramInt3 + i1));
/*   71 */     localde.i = (-151395397 * paramey.af);
/*   72 */     localde.q = (94712448 * paramey.bh);
/*   73 */     localde.s = (-427594353 * paramey.bi);
/*   74 */     localde.v = (-1121775919 * paramey.bs);
/*   75 */     localde.w = paramey.bk;
/*   76 */     if (null != paramey.ai) { if (paramByte > 1);
/*   77 */       localde.y = paramey;
/*   78 */       localde.n(-324979285);
/*      */     }
/*   80 */     de.m.d(localde);
/*   81 */     if (null != localde.w) { if (paramByte <= 1) throw new IllegalStateException(); localde.e = ((localde.s * 126224035 + (int)(Math.random() * (540356717 * localde.v - localde.s * 126224035))) * 1914159225);
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void eh(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*      */   {
/* 5313 */     int k = cr.eg.ad(paramInt1, paramInt2, paramInt3);
/*      */     int i1;
/*      */     int i2;
/*      */     int i3;
/*      */     int i4;
/*      */     Object localObject;
/*      */     int i8;
/* 5314 */     if (0 != k) { if (paramInt6 != 78028097);
/* 5315 */       i1 = cr.eg.am(paramInt1, paramInt2, paramInt3, k);
/* 5316 */       i2 = i1 >> 6 & 0x3;
/* 5317 */       i3 = i1 & 0x1F;
/* 5318 */       i4 = paramInt4;
/* 5319 */       if (k > 0) { if (paramInt6 == 78028097) throw new IllegalStateException(); i4 = paramInt5; }
/* 5320 */       localObject = dl.ns.u;
/* 5321 */       int i6 = 4 * paramInt2 + 24624 + (103 - paramInt3) * 2048;
/* 5322 */       i8 = k >> 14 & 0x7FFF;
/* 5323 */       ey localey2 = fj.g(i8, (byte)100);
/* 5324 */       if (-1 != localey2.an * 342542729) { if (paramInt6 != 78028097);
/* 5325 */         ft localft3 = y.fl[(342542729 * localey2.an)];
/* 5326 */         if (localft3 != null) { if (paramInt6 == 78028097) throw new IllegalStateException();
/* 5327 */           int i10 = (localey2.o * 2134940908 - localft3.w) / 2;
/* 5328 */           int i11 = (-253830252 * localey2.a - localft3.e) / 2;
/* 5329 */           localft3.be(i10 + (48 + paramInt2 * 4), 48 + (104 - paramInt3 - -1137199387 * localey2.a) * 4 + i11); }
/*      */       }
/*      */       else
/*      */       {
/* 5333 */         if (i3 != 0) { if ((paramInt6 != 78028097) && (i3 != 2)) break label545; if (paramInt6 == 78028097) throw new IllegalStateException(); 
/*      */         }
/* 5334 */         if (i2 == 0) { if (paramInt6 == 78028097) throw new IllegalStateException();
/* 5335 */           localObject[i6] = i4;
/* 5336 */           localObject[(512 + i6)] = i4;
/* 5337 */           localObject[(1024 + i6)] = i4;
/* 5338 */           localObject[(i6 + 1536)] = i4;
/*      */         }
/* 5340 */         else if (1 == i2) { if (paramInt6 == 78028097) throw new IllegalStateException();
/* 5341 */           localObject[i6] = i4;
/* 5342 */           localObject[(i6 + 1)] = i4;
/* 5343 */           localObject[(i6 + 2)] = i4;
/* 5344 */           localObject[(i6 + 3)] = i4;
/*      */         }
/* 5346 */         else if (i2 == 2) { if (paramInt6 == 78028097) return;
/* 5347 */           localObject[(3 + i6)] = i4;
/* 5348 */           localObject[(512 + (i6 + 3))] = i4;
/* 5349 */           localObject[(3 + i6 + 1024)] = i4;
/* 5350 */           localObject[(1536 + (i6 + 3))] = i4;
/*      */         }
/* 5352 */         else if (3 == i2) { if (paramInt6 == 78028097) return;
/* 5353 */           localObject[(1536 + i6)] = i4;
/* 5354 */           localObject[(1 + (1536 + i6))] = i4;
/* 5355 */           localObject[(2 + (i6 + 1536))] = i4;
/* 5356 */           localObject[(i6 + 1536 + 3)] = i4;
/*      */         }
/*      */ 
/* 5359 */         label545: if (3 == i3) { if (paramInt6 == 78028097) throw new IllegalStateException();
/* 5360 */           if (0 == i2) { if (paramInt6 != 78028097);
/* 5360 */             localObject[i6] = i4;
/* 5361 */           } else if (1 == i2) { if (paramInt6 == 78028097) throw new IllegalStateException(); localObject[(i6 + 3)] = i4;
/* 5362 */           } else if (i2 == 2) { if (paramInt6 != 78028097);
/* 5362 */             localObject[(i6 + 3 + 1536)] = i4;
/* 5363 */           } else if (i2 == 3) { if (paramInt6 != 78028097);
/* 5363 */             localObject[(i6 + 1536)] = i4; }
/*      */         }
/* 5365 */         if (2 == i3) { if (paramInt6 == 78028097) return;
/* 5366 */           if (i2 == 3) { if (paramInt6 == 78028097) return;
/* 5367 */             localObject[i6] = i4;
/* 5368 */             localObject[(i6 + 512)] = i4;
/* 5369 */             localObject[(i6 + 1024)] = i4;
/* 5370 */             localObject[(i6 + 1536)] = i4;
/*      */           }
/* 5372 */           else if (0 == i2) { if (paramInt6 == 78028097) throw new IllegalStateException();
/* 5373 */             localObject[i6] = i4;
/* 5374 */             localObject[(1 + i6)] = i4;
/* 5375 */             localObject[(i6 + 2)] = i4;
/* 5376 */             localObject[(i6 + 3)] = i4;
/*      */           }
/* 5378 */           else if (i2 == 1) { if (paramInt6 == 78028097) return;
/* 5379 */             localObject[(i6 + 3)] = i4;
/* 5380 */             localObject[(512 + (3 + i6))] = i4;
/* 5381 */             localObject[(3 + i6 + 1024)] = i4;
/* 5382 */             localObject[(1536 + (3 + i6))] = i4;
/*      */           }
/* 5384 */           else if (2 == i2) { if (paramInt6 == 78028097) return;
/* 5385 */             localObject[(i6 + 1536)] = i4;
/* 5386 */             localObject[(i6 + 1536 + 1)] = i4;
/* 5387 */             localObject[(2 + (1536 + i6))] = i4;
/* 5388 */             localObject[(3 + (1536 + i6))] = i4;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/* 5393 */     k = cr.eg.aa(paramInt1, paramInt2, paramInt3);
/* 5394 */     if (k != 0) { if (paramInt6 == 78028097) return;
/* 5395 */       i1 = cr.eg.am(paramInt1, paramInt2, paramInt3, k);
/* 5396 */       i2 = i1 >> 6 & 0x3;
/* 5397 */       i3 = i1 & 0x1F;
/* 5398 */       i4 = k >> 14 & 0x7FFF;
/* 5399 */       localObject = fj.g(i4, (byte)100);
/*      */       int i9;
/* 5400 */       if (-1 != ((ey)localObject).an * 342542729) { if (paramInt6 != 78028097);
/* 5401 */         ft localft2 = y.fl[(342542729 * localObject.an)];
/* 5402 */         if (null != localft2) { if (paramInt6 == 78028097) throw new IllegalStateException();
/* 5403 */           i8 = (2134940908 * ((ey)localObject).o - localft2.w) / 2;
/* 5404 */           i9 = (((ey)localObject).a * -253830252 - localft2.e) / 2;
/* 5405 */           localft2.be(i8 + (48 + 4 * paramInt2), 48 + (104 - paramInt3 - -1137199387 * ((ey)localObject).a) * 4 + i9);
/*      */         }
/*      */       }
/* 5408 */       else if (9 == i3) { if (paramInt6 != 78028097);
/* 5409 */         int i7 = 15658734;
/* 5410 */         if (k > 0) { if (paramInt6 != 78028097);
/* 5410 */           i7 = 15597568; }
/* 5411 */         int[] arrayOfInt = dl.ns.u;
/* 5412 */         i9 = 4 * paramInt2 + 24624 + (103 - paramInt3) * 2048;
/* 5413 */         if (i2 != 0) { if ((paramInt6 != 78028097) && (i2 != 2)) break label1297; if (paramInt6 == 78028097) throw new IllegalStateException(); 
/*      */         }
/* 5414 */         arrayOfInt[(i9 + 1536)] = i7;
/* 5415 */         arrayOfInt[(1024 + i9 + 1)] = i7;
/* 5416 */         arrayOfInt[(2 + (i9 + 512))] = i7;
/* 5417 */         arrayOfInt[(3 + i9)] = i7; break label1343;
/*      */ 
/* 5420 */         label1297: arrayOfInt[i9] = i7;
/* 5421 */         arrayOfInt[(i9 + 512 + 1)] = i7;
/* 5422 */         arrayOfInt[(i9 + 1024 + 2)] = i7;
/* 5423 */         arrayOfInt[(3 + (i9 + 1536))] = i7;
/*      */       }
/*      */     }
/*      */ 
/* 5427 */     label1343: k = cr.eg.as(paramInt1, paramInt2, paramInt3);
/* 5428 */     if (k != 0) { if (paramInt6 != 78028097);
/* 5429 */       i1 = k >> 14 & 0x7FFF;
/* 5430 */       ey localey1 = fj.g(i1, (byte)100);
/* 5431 */       if (342542729 * localey1.an != -1) { if (paramInt6 != 78028097);
/* 5432 */         ft localft1 = y.fl[(localey1.an * 342542729)];
/* 5433 */         if (null != localft1) { if (paramInt6 == 78028097) throw new IllegalStateException();
/* 5434 */           i4 = (2134940908 * localey1.o - localft1.w) / 2;
/* 5435 */           int i5 = (localey1.a * -253830252 - localft1.e) / 2;
/* 5436 */           localft1.be(paramInt2 * 4 + 48 + i4, (104 - paramInt3 - localey1.a * -1137199387) * 4 + 48 + i5);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void ea(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/* 6425 */     for (int k = 0; k < 578636789 * client.mw; k++) { if (paramInt5 <= -1988195492) return;
/* 6426 */       if ((client.mp[k] + client.mi[k] > paramInt1) && ((paramInt5 <= -1988195492) || ((client.mi[k] < paramInt3 + paramInt1) && ((paramInt5 <= -1988195492) || (client.ma[k] + client.mh[k] > paramInt2))))) { if (paramInt5 <= -1988195492) throw new IllegalStateException(); if (client.mh[k] < paramInt4 + paramInt2) { if (paramInt5 > -1988195492);
/* 6426 */           client.mq[k] = true;
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static eg fz(eg parameg, int paramInt)
/*      */   {
/* 9190 */     eg localeg2 = parameg;
/*      */ 
/* 9192 */     int k = az.l(dn.gg(localeg2, (byte)25), -204868796);
/*      */     eg localeg1;
/* 9193 */     if (k == 0) { if (paramInt != -922966617) throw new IllegalStateException();
/* 9194 */       localeg1 = null;
/*      */     } else
/*      */     {
/* 9197 */       for (int i1 = 0; i1 < k; i1++) { if (paramInt == -922966617);
/* 9198 */         localeg2 = bw.n(localeg2.p * -937713391, (byte)1);
/* 9199 */         if (localeg2 == null) { if (paramInt != -922966617) throw new IllegalStateException();
/* 9200 */           localeg1 = null;
/* 9201 */           break label101;
/*      */         }
/*      */       }
/* 9204 */       localeg1 = localeg2;
/*      */     }
/* 9206 */     label101: Object localObject = localeg1;
/* 9207 */     if (localObject == null) { if (paramInt != -922966617) throw new IllegalStateException(); localObject = parameg.bb; }
/* 9208 */     return localObject;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     bs
 * JD-Core Version:    0.6.2
 */