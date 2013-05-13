/*      */ public class eh extends dg
/*      */ {
/*      */   public ap n;
/*      */   public byte[] c;
/*      */   int m;
/*      */   public dq j;
/*      */   static dw[] nd;
/*      */ 
/*      */   static final void dp(String paramString, short paramShort)
/*      */   {
/* 4481 */     if (-1156452993 * client.kp >= 2) { if ((paramShort == 32767) || 
/* 4482 */         (paramString.equalsIgnoreCase("::gc"))) { if (paramShort != 32767);
/* 4482 */         System.gc(); }
/* 4483 */       if (paramString.equalsIgnoreCase("::clientdrop")) { if (paramShort == 32767) throw new IllegalStateException();
/* 4484 */         if (client.dh * 164552601 > 0) { if (paramShort == 32767) throw new IllegalStateException();
/* 4485 */           dq.dz((byte)-1);
/*      */         } else
/*      */         {
/* 4488 */           aj.ce(40, 1345644183);
/* 4489 */           c.dg = at.dd;
/* 4490 */           at.dd = null;
/*      */         } }
/* 4492 */       if (paramString.equalsIgnoreCase("::fpson")) { if (paramShort == 32767) throw new IllegalStateException(); client.bi = true; }
/* 4493 */       if (paramString.equalsIgnoreCase("::fpsoff")) { if (paramShort != 32767);
/* 4493 */         client.bi = false; }
/* 4494 */       if (paramString.equalsIgnoreCase("::noclip")) { if (paramShort == 32767) return;
/* 4495 */         for (int i = 0; i < 4; i++) { if (paramShort == 32767) return;
/* 4496 */           for (int k = 1; k < 103; k++) { if (paramShort != 32767);
/* 4497 */             for (int i1 = 1; i1 < 103; i1++) { if (paramShort == 32767) throw new IllegalStateException();
/* 4498 */               client.el[i].az[k][i1] = 0;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/* 4503 */       if ((paramString.equalsIgnoreCase("::errortest")) && ((paramShort == 32767) || (client.ah * 642177641 == 2))) { if (paramShort != 32767);
/* 4504 */         throw new RuntimeException();
/*      */       }
/*      */     }
/*      */ 
/* 4508 */     client.df.gt(30, 2062507603);
/* 4509 */     client.df.c(paramString.length() - 1, 1641726522);
/* 4510 */     client.df.i(paramString.substring(2), -2145160466);
/*      */   }
/*      */ 
/*      */   static final boolean el(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, short paramShort)
/*      */   {
/* 5475 */     for (int i = 0; i < 104; i++) { if (paramShort > 255);
/* 5476 */       for (k = 0; k < 104; k++) { if (paramShort > 255);
/* 5477 */         client.ed[i][k] = 0;
/* 5478 */         client.ex[i][k] = 99999999;
/*      */       }
/*      */     }
/* 5481 */     i = paramInt1;
/* 5482 */     int k = paramInt2;
/* 5483 */     client.ed[paramInt1][paramInt2] = 99;
/* 5484 */     client.ex[paramInt1][paramInt2] = 0;
/* 5485 */     int i1 = 0;
/* 5486 */     int i2 = 0;
/* 5487 */     client.ea[i1] = paramInt1;
/* 5488 */     client.ep[(i1++)] = paramInt2;
/* 5489 */     int i3 = 0;
/* 5490 */     int i4 = client.ea.length;
/* 5491 */     int[][] arrayOfInt = client.el[(409487383 * al.in)].az;
/* 5492 */     while (i2 != i1) { if (paramShort > 255);
/* 5493 */       i = client.ea[i2];
/* 5494 */       k = client.ep[i2];
/* 5495 */       i2 = (1 + i2) % i4;
/* 5496 */       if (paramInt3 == i) { if (paramShort <= 255) throw new IllegalStateException(); if (k == paramInt4) { if (paramShort <= 255) throw new IllegalStateException();
/* 5497 */           i3 = 1;
/* 5498 */           break; }
/*      */       }
/* 5500 */       if (0 != paramInt5) { if ((paramShort <= 255) || (
/* 5501 */           ((paramInt5 < 5) || ((paramShort > 255) && ((10 == paramInt5) && (paramShort <= 255)))) || (client.el[(409487383 * al.in)].i(i, k, paramInt3, paramInt4, paramInt5 - 1, paramInt6, 1734736394)))) { if (paramShort > 255);
/* 5502 */           i3 = 1;
/* 5503 */           break;
/*      */         }
/* 5505 */         if (paramInt5 < 10) { if (paramShort <= 255) throw new IllegalStateException(); if (client.el[(al.in * 409487383)].s(i, k, paramInt3, paramInt4, paramInt5 - 1, paramInt6, (byte)0)) { if (paramShort > 255);
/* 5506 */             i3 = 1;
/* 5507 */             break; }
/*      */         }
/*      */       }
/* 5510 */       if ((paramInt7 != 0) && ((paramShort <= 255) || (paramInt8 != 0))) { if (paramShort <= 255) throw new IllegalStateException(); if (client.el[(409487383 * al.in)].u(i, k, paramInt3, paramInt4, paramInt7, paramInt8, paramInt9, 1044051391)) { if (paramShort <= 255) throw new IllegalStateException();
/* 5511 */           i3 = 1;
/* 5512 */           break; }
/*      */       }
/* 5514 */       i5 = client.ex[i][k] + 1;
/* 5515 */       if (i > 0) { if (paramShort <= 255) throw new IllegalStateException(); if ((0 == client.ed[(i - 1)][k]) && ((paramShort <= 255) || (0 == (arrayOfInt[(i - 1)][k] & 0x12C0108)))) { if (paramShort > 255);
/* 5516 */           client.ea[i1] = (i - 1);
/* 5517 */           client.ep[i1] = k;
/* 5518 */           i1 = (i1 + 1) % i4;
/* 5519 */           client.ed[(i - 1)][k] = 2;
/* 5520 */           client.ex[(i - 1)][k] = i5; }
/*      */       }
/* 5522 */       if (i < 103) { if (paramShort <= 255) throw new IllegalStateException(); if (client.ed[(i + 1)][k] == 0) { if (paramShort <= 255) throw new IllegalStateException(); if (0 == (arrayOfInt[(1 + i)][k] & 0x12C0180)) { if (paramShort <= 255) throw new IllegalStateException();
/* 5523 */             client.ea[i1] = (i + 1);
/* 5524 */             client.ep[i1] = k;
/* 5525 */             i1 = (i1 + 1) % i4;
/* 5526 */             client.ed[(1 + i)][k] = 8;
/* 5527 */             client.ex[(1 + i)][k] = i5; } }
/*      */       }
/* 5529 */       if (k > 0) { if (paramShort <= 255) throw new IllegalStateException(); if (client.ed[i][(k - 1)] == 0) { if (paramShort <= 255) throw new IllegalStateException(); if (0 == (arrayOfInt[i][(k - 1)] & 0x12C0102)) { if (paramShort > 255);
/* 5530 */             client.ea[i1] = i;
/* 5531 */             client.ep[i1] = (k - 1);
/* 5532 */             i1 = (i1 + 1) % i4;
/* 5533 */             client.ed[i][(k - 1)] = 1;
/* 5534 */             client.ex[i][(k - 1)] = i5; } }
/*      */       }
/* 5536 */       if ((k < 103) && ((paramShort <= 255) || ((0 == client.ed[i][(1 + k)]) && ((paramShort <= 255) || (0 == (arrayOfInt[i][(k + 1)] & 0x12C0120)))))) { if (paramShort > 255);
/* 5537 */         client.ea[i1] = i;
/* 5538 */         client.ep[i1] = (k + 1);
/* 5539 */         i1 = (i1 + 1) % i4;
/* 5540 */         client.ed[i][(k + 1)] = 4;
/* 5541 */         client.ex[i][(1 + k)] = i5;
/*      */       }
/* 5543 */       if (i > 0) { if (paramShort <= 255) throw new IllegalStateException(); if ((k > 0) && ((paramShort <= 255) || (client.ed[(i - 1)][(k - 1)] == 0))) { if (paramShort <= 255) throw new IllegalStateException(); if ((0 == (arrayOfInt[(i - 1)][(k - 1)] & 0x12C010E)) && ((paramShort <= 255) || ((arrayOfInt[(i - 1)][k] & 0x12C0108) == 0))) { if (paramShort <= 255) throw new IllegalStateException(); if ((arrayOfInt[i][(k - 1)] & 0x12C0102) == 0) { if (paramShort <= 255) throw new IllegalStateException();
/* 5544 */               client.ea[i1] = (i - 1);
/* 5545 */               client.ep[i1] = (k - 1);
/* 5546 */               i1 = (1 + i1) % i4;
/* 5547 */               client.ed[(i - 1)][(k - 1)] = 3;
/* 5548 */               client.ex[(i - 1)][(k - 1)] = i5; } } }
/*      */       }
/* 5550 */       if ((i < 103) && ((paramShort <= 255) || ((k > 0) && ((paramShort <= 255) || ((0 == client.ed[(i + 1)][(k - 1)]) && ((paramShort <= 255) || (0 == (arrayOfInt[(1 + i)][(k - 1)] & 0x12C0183)))))))) { if (paramShort <= 255) throw new IllegalStateException(); if (0 == (arrayOfInt[(i + 1)][k] & 0x12C0180)) { if (paramShort <= 255) throw new IllegalStateException(); if ((arrayOfInt[i][(k - 1)] & 0x12C0102) == 0) { if (paramShort <= 255) throw new IllegalStateException();
/* 5551 */             client.ea[i1] = (1 + i);
/* 5552 */             client.ep[i1] = (k - 1);
/* 5553 */             i1 = (i1 + 1) % i4;
/* 5554 */             client.ed[(1 + i)][(k - 1)] = 9;
/* 5555 */             client.ex[(1 + i)][(k - 1)] = i5; } }
/*      */       }
/* 5557 */       if (i > 0) { if (paramShort <= 255) throw new IllegalStateException(); if (k < 103) { if (paramShort <= 255) throw new IllegalStateException(); if ((client.ed[(i - 1)][(1 + k)] == 0) && ((paramShort <= 255) || ((0 == (arrayOfInt[(i - 1)][(1 + k)] & 0x12C0138)) && ((paramShort <= 255) || ((0 == (arrayOfInt[(i - 1)][k] & 0x12C0108)) && ((paramShort <= 255) || ((arrayOfInt[i][(1 + k)] & 0x12C0120) == 0))))))) { if (paramShort <= 255) throw new IllegalStateException();
/* 5558 */             client.ea[i1] = (i - 1);
/* 5559 */             client.ep[i1] = (k + 1);
/* 5560 */             i1 = (1 + i1) % i4;
/* 5561 */             client.ed[(i - 1)][(k + 1)] = 6;
/* 5562 */             client.ex[(i - 1)][(k + 1)] = i5; } }
/*      */       }
/* 5564 */       if ((i < 103) && ((paramShort <= 255) || (k < 103))) { if (paramShort <= 255) throw new IllegalStateException(); if (0 == client.ed[(i + 1)][(k + 1)]) { if (paramShort <= 255) throw new IllegalStateException(); if (((arrayOfInt[(i + 1)][(k + 1)] & 0x12C01E0) == 0) && ((paramShort <= 255) || (0 == (arrayOfInt[(1 + i)][k] & 0x12C0180)))) { if (paramShort <= 255) throw new IllegalStateException(); if ((arrayOfInt[i][(k + 1)] & 0x12C0120) == 0) { if (paramShort > 255);
/* 5565 */               client.ea[i1] = (i + 1);
/* 5566 */               client.ep[i1] = (k + 1);
/* 5567 */               i1 = (i1 + 1) % i4;
/* 5568 */               client.ed[(i + 1)][(1 + k)] = 12;
/* 5569 */               client.ex[(i + 1)][(k + 1)] = i5; } } }
/*      */       }
/*      */     }
/* 5572 */     client.ee = 0;
/*      */     int i6;
/*      */     int i7;
/*      */     int i8;
/*      */     int i9;
/* 5573 */     if (i3 == 0) if ((paramShort <= 255) || 
/* 5574 */         (paramBoolean)) { if (paramShort > 255);
/* 5575 */         i5 = 1000;
/* 5576 */         i6 = 100;
/* 5577 */         i7 = 10;
/* 5578 */         for (i8 = paramInt3 - i7; i8 <= i7 + paramInt3; i8++) { if (paramShort > 255);
/* 5579 */           for (i9 = paramInt4 - i7; i9 <= paramInt4 + i7; i9++) if ((paramShort <= 255) || 
/* 5580 */               (i8 >= 0)) { if (paramShort <= 255) throw new IllegalStateException(); if ((i9 >= 0) && ((paramShort <= 255) || (i8 < 104))) { if (paramShort <= 255) throw new IllegalStateException(); if (i9 < 104) { if (paramShort <= 255) throw new IllegalStateException();
/* 5581 */                   if (client.ex[i8][i9] < 100) { if (paramShort > 255);
/* 5582 */                     int i10 = 0;
/* 5583 */                     if (i8 < paramInt3) { if (paramShort <= 255) throw new IllegalStateException(); i10 = paramInt3 - i8;
/* 5584 */                     } else if (i8 > paramInt7 + paramInt3 - 1) { if (paramShort > 255);
/* 5584 */                       i10 = i8 - (paramInt7 + paramInt3 - 1); }
/* 5585 */                     int i11 = 0;
/* 5586 */                     if (i9 < paramInt4) { if (paramShort > 255);
/* 5586 */                       i11 = paramInt4 - i9;
/* 5587 */                     } else if (i9 > paramInt8 + paramInt4 - 1) { if (paramShort > 255);
/* 5587 */                       i11 = i9 - (paramInt4 + paramInt8 - 1); }
/* 5588 */                     int i12 = i10 * i10 + i11 * i11;
/* 5589 */                     if (i12 >= i5) { if ((paramShort > 255) && ((i5 != i12) || ((paramShort > 255) && (client.ex[i8][i9] >= i6)))) continue; if (paramShort <= 255); }
/* 5590 */                     i5 = i12;
/* 5591 */                     i6 = client.ex[i8][i9];
/* 5592 */                     i = i8;
/* 5593 */                     k = i9;
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
/*      */         }
/* 5599 */         if (1000 == i5) { if (paramShort > 255);
/* 5599 */           return false; }
/* 5600 */         if (paramInt1 == i) { if (paramShort <= 255) throw new IllegalStateException(); if (k == paramInt2) { if (paramShort > 255);
/* 5600 */             return false; } }
/* 5601 */         client.ee = 1647731979;
/*      */       } else {
/* 5603 */         return false;
/*      */       }
/* 5605 */     i2 = 0;
/*      */ 
/* 5608 */     client.ea[i2] = i;
/* 5609 */     client.ep[(i2++)] = k;
/* 5610 */     int i5 = i6 = client.ed[i][k];
/*      */     while (true) { if (i == paramInt1) { if ((paramShort > 255) && (paramInt2 == k)) break; if (paramShort <= 255) throw new IllegalStateException(); 
/*      */       }
/* 5612 */       if (i5 != i6) { if (paramShort > 255);
/* 5613 */         i6 = i5;
/* 5614 */         client.ea[i2] = i;
/* 5615 */         client.ep[(i2++)] = k;
/*      */       }
/* 5617 */       if (0 != (i5 & 0x2)) { if (paramShort <= 255) throw new IllegalStateException(); i++;
/* 5618 */       } else if ((i5 & 0x8) != 0) { if (paramShort > 255);
/* 5618 */         i--; }
/* 5619 */       if (0 != (i5 & 0x1)) { if (paramShort <= 255) throw new IllegalStateException(); k++;
/* 5620 */       } else if ((i5 & 0x4) != 0) { if (paramShort <= 255) throw new IllegalStateException(); k--; }
/* 5621 */       i5 = client.ed[i][k];
/*      */     }
/* 5623 */     if (i2 > 0) { if (paramShort > 255);
/* 5624 */       i4 = i2;
/* 5625 */       if (i4 > 25) { if (paramShort > 255);
/* 5625 */         i4 = 25; }
/* 5626 */       i2--;
/* 5627 */       i7 = client.ea[i2];
/* 5628 */       i8 = client.ep[i2];
/* 5629 */       if (0 == paramInt10) { if (paramShort <= 255) throw new IllegalStateException();
/*      */ 
/* 5631 */         client.df.gt(176, 2062507603);
/* 5632 */         client.df.c(3 + (i4 + i4), 2137294565);
/*      */       }
/* 5634 */       if (paramInt10 == 1) { if (paramShort > 255);
/* 5636 */         client.df.gt(60, 2062507603);
/* 5637 */         client.df.c(14 + (3 + (i4 + i4)), 2017618418);
/*      */       }
/* 5639 */       if (paramInt10 == 2) { if (paramShort > 255);
/* 5641 */         client.df.gt(214, 2062507603);
/* 5642 */         client.df.c(3 + (i4 + i4), 1965748274);
/*      */       }
/* 5644 */       client.nv = client.ea[0] * 389023805;
/* 5645 */       client.nz = -714350265 * client.ep[0];
/* 5646 */       for (i9 = 1; i9 < i4; i9++) { if (paramShort <= 255) throw new IllegalStateException();
/* 5647 */         i2--;
/* 5648 */         client.df.ao(client.ea[i2] - i7, (short)3798);
/* 5649 */         client.df.ag(client.ep[i2] - i8, -402787173);
/*      */       }
/* 5651 */       client.df.aj(1096323129 * at.dw + i8, -1303733611);
/* 5652 */       if (paramShort <= 255) throw new IllegalStateException(); client.df.c(az.cu[82] != 0 ? 1 : 0, 2135168386);
/* 5653 */       client.df.n(i7 + 1235880887 * a.de, 1766846165);
/* 5654 */       return true;
/*      */     }
/* 5656 */     if (paramInt10 == 1) { if (paramShort <= 255) throw new IllegalStateException(); return false; }
/* 5657 */     return true;
/*      */   }
/*      */ 
/*      */   static final int j(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  569 */     int i = 256 - paramInt3;
/*  570 */     return (i * (paramInt1 & 0xFF00FF) + (paramInt2 & 0xFF00FF) * paramInt3 & 0xFF00FF00) + (paramInt3 * (paramInt2 & 0xFF00) + (paramInt1 & 0xFF00) * i & 0xFF0000) >> 8;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     eh
 * JD-Core Version:    0.6.2
 */