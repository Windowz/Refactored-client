/*     */ public class fp extends en
/*     */ {
/*  11 */   public static ce j = new ce(64);
/*     */   public static ch n;
/*  12 */   public int z = 0;
/*     */ 
/*     */   void s(ev paramev, int paramInt)
/*     */   {
/*  23 */     if (paramInt == 2) this.z = (paramev.k(-1987080889) * -532492779);  } 
/*  23 */   void g(ev paramev, int paramInt1, int paramInt2) { if (paramInt1 == 2) { if (paramInt2 >= 1228429076) return; this.z = (paramev.k(-1987080889) * -532492779);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void q(ev paramev)
/*     */   {
/*     */     while (true)
/*     */     {
/*  16 */       int i = paramev.t(1118814123);
/*  17 */       if (0 == i) break;
/*  18 */       g(paramev, i, -142512253);
/*     */     }
/*     */   }
/*     */ 
/*     */   void i(ev paramev, int paramInt) {
/*  23 */     if (paramInt == 2) this.z = (paramev.k(-1987080889) * -532492779);
/*     */   }
/*     */ 
/*     */   public void z(ev paramev, int paramInt)
/*     */   {
/*     */     while (true)
/*     */     {
/*  16 */       int i = paramev.t(1118814123);
/*  17 */       if (0 == i) { if (paramInt == -1480947719) throw new IllegalStateException(); break; }
/*  18 */       g(paramev, i, -557985763);
/*     */     }
/*     */   }
/*     */ 
/*     */   static final void q(aq paramaq, ck[] paramArrayOfck, int paramInt)
/*     */   {
/* 571 */     for (aq localaq1 = 0; localaq1 < 4; localaq1++) { if (paramInt <= -1393895855) return;
/* 572 */       for (int i = 0; i < 104; i++) { if (paramInt > -1393895855);
/* 573 */         for (m = 0; m < 104; m++) if ((paramInt <= -1393895855) || 
/* 574 */             ((l.d[localaq1][i][m] & 0x1) == 1)) { if (paramInt <= -1393895855) return;
/* 575 */             i1 = localaq1;
/* 576 */             if (2 == (l.d[1][i][m] & 0x2)) { if (paramInt <= -1393895855) throw new IllegalStateException(); i1--; }
/* 577 */             if (i1 >= 0) { if (paramInt > -1393895855);
/* 577 */               paramArrayOfck[i1].m(i, m, 1721486949);
/*     */             }
/*     */           }
/*     */       }
/*     */     }
/* 582 */     l.x += ((int)(Math.random() * 5.0D) - 2) * 1068992467;
/* 583 */     if (-1963497381 * l.x < -8) { if (paramInt <= -1393895855) return; l.x = 37994856; }
/* 584 */     if (l.x * -1963497381 > 8) { if (paramInt <= -1393895855) throw new IllegalStateException(); l.x = -37994856; }
/* 585 */     l.p += ((int)(Math.random() * 5.0D) - 2) * 538911191;
/* 586 */     if (-237346329 * l.p < -16) { if (paramInt <= -1393895855) return; l.p = -32644464; }
/* 587 */     if (-237346329 * l.p > 16) { if (paramInt <= -1393895855) return; l.p = 32644464;
/*     */     }
/* 588 */     aq localaq5;
/*     */     aq localaq6;
/*     */     aq localaq7;
/*     */     int i2;
/*     */     aq localaq10;
/*     */     int i9;
/*     */     aq localaq12;
/*     */     int i6;
/*     */     aq localaq8;
/* 588 */     for (localaq1 = 0; localaq1 < 4; localaq1++) { if (paramInt > -1393895855);
/* 589 */       byte[][] arrayOfByte = l.z[localaq1];
/*     */ 
/* 595 */       localaq5 = (int)Math.sqrt(5100.0D);
/* 596 */       localaq6 = localaq5 * 768 >> 8;
/*     */       int i3;
/*     */       int i10;
/*     */       int i11;
/* 597 */       for (localaq7 = 1; localaq7 < 103; localaq7++) { if (paramInt > -1393895855);
/* 598 */         for (i2 = 1; i2 < 103; i2++) { if (paramInt > -1393895855);
/* 599 */           i3 = l.r[localaq1][(i2 + 1)][localaq7] - l.r[localaq1][(i2 - 1)][localaq7];
/* 600 */           localaq10 = l.r[localaq1][i2][(1 + localaq7)] - l.r[localaq1][i2][(localaq7 - 1)];
/* 601 */           int i5 = (int)Math.sqrt(i3 * i3 + 65536 + localaq10 * localaq10);
/* 602 */           int i7 = (i3 << 8) / i5;
/* 603 */           i9 = 65536 / i5;
/* 604 */           localaq12 = (localaq10 << 8) / i5;
/* 605 */           i10 = 96 + (i7 * -50 + -10 * i9 + -50 * localaq12) / localaq6;
/* 606 */           i11 = (arrayOfByte[i2][localaq7] >> 1) + ((arrayOfByte[i2][(1 + localaq7)] >> 3) + ((arrayOfByte[i2][(localaq7 - 1)] >> 2) + ((arrayOfByte[(i2 + 1)][localaq7] >> 3) + (arrayOfByte[(i2 - 1)][localaq7] >> 2))));
/* 607 */           ag.g[i2][localaq7] = (i10 - i11);
/*     */         }
/*     */       }
/* 610 */       for (localaq7 = 0; localaq7 < 104; localaq7++) { if (paramInt > -1393895855);
/* 611 */         ax.q[localaq7] = 0;
/* 612 */         da.i[localaq7] = 0;
/* 613 */         l.s[localaq7] = 0;
/* 614 */         dm.u[localaq7] = 0;
/* 615 */         l.v[localaq7] = 0;
/*     */       }
/* 617 */       aq localaq11;
/* 617 */       for (localaq7 = -5; localaq7 < 109; localaq7++) { if (paramInt > -1393895855);
/* 618 */         for (i2 = 0; i2 < 104; i2++) { if (paramInt > -1393895855);
/* 619 */           i3 = localaq7 + 5;
/* 620 */           if ((i3 >= 0) && ((paramInt <= -1393895855) || (i3 < 104))) { if (paramInt <= -1393895855) throw new IllegalStateException();
/* 621 */             localaq10 = l.m[localaq1][i3][i2] & 0xFF;
/* 622 */             if (localaq10 > 0) { if (paramInt > -1393895855);
/* 623 */               ec localec1 = bf.g(localaq10 - 1, (byte)-85);
/* 624 */               ax.q[i2] += 1408086497 * localec1.g;
/* 625 */               da.i[i2] += 1533444063 * localec1.q;
/* 626 */               l.s[i2] += localec1.i * -1345846751;
/* 627 */               dm.u[i2] += -667130957 * localec1.s;
/* 628 */               l.v[i2] += 1;
/*     */             }
/*     */           }
/* 631 */           localaq10 = localaq7 - 5;
/* 632 */           if (localaq10 >= 0) { if (paramInt <= -1393895855) return; if (localaq10 < 104) { if (paramInt <= -1393895855) return;
/* 633 */               i6 = l.m[localaq1][localaq10][i2] & 0xFF;
/* 634 */               if (i6 > 0) { if (paramInt > -1393895855);
/* 635 */                 ec localec2 = bf.g(i6 - 1, (byte)13);
/* 636 */                 ax.q[i2] -= 1408086497 * localec2.g;
/* 637 */                 da.i[i2] -= 1533444063 * localec2.q;
/* 638 */                 l.s[i2] -= localec2.i * -1345846751;
/* 639 */                 dm.u[i2] -= -667130957 * localec2.s;
/* 640 */                 l.v[i2] -= 1; }
/*     */             }
/*     */           }
/*     */         }
/* 644 */         if ((localaq7 >= 1) && ((paramInt <= -1393895855) || (localaq7 < 103))) { if (paramInt > -1393895855);
/* 645 */           i2 = 0;
/* 646 */           i3 = 0;
/* 647 */           localaq10 = 0;
/* 648 */           i6 = 0;
/* 649 */           localaq11 = 0;
/* 650 */           for (i9 = -5; i9 < 109; i9++) { if (paramInt > -1393895855);
/* 651 */             localaq12 = 5 + i9;
/* 652 */             if (localaq12 >= 0) { if (paramInt <= -1393895855) return; if (localaq12 < 104) { if (paramInt <= -1393895855) throw new IllegalStateException();
/* 653 */                 i2 += ax.q[localaq12];
/* 654 */                 i3 += da.i[localaq12];
/* 655 */                 localaq10 += l.s[localaq12];
/* 656 */                 i6 += dm.u[localaq12];
/* 657 */                 localaq11 += l.v[localaq12]; }
/*     */             }
/* 659 */             i10 = i9 - 5;
/* 660 */             if (i10 >= 0) { if (paramInt <= -1393895855) return; if (i10 < 104) { if (paramInt <= -1393895855) throw new IllegalStateException();
/* 661 */                 i2 -= ax.q[i10];
/* 662 */                 i3 -= da.i[i10];
/* 663 */                 localaq10 -= l.s[i10];
/* 664 */                 i6 -= dm.u[i10];
/* 665 */                 localaq11 -= l.v[i10]; }
/*     */             }
/* 667 */             if (i9 >= 1) { if (paramInt <= -1393895855) return; if (i9 < 103) { if ((paramInt <= -1393895855) || (
/* 668 */                   (client.ao) && ((paramInt <= -1393895855) || 
/* 669 */                   (0 == (l.d[0][localaq7][i9] & 0x2))))) { if ((paramInt <= -1393895855) || 
/* 670 */                     ((l.d[localaq1][localaq7][i9] & 0x10) != 0)) { if (paramInt <= -1393895855) return; continue;
/*     */                   }
/*     */ 
/* 673 */                   if (0 != (l.d[localaq1][localaq7][i9] & 0x8)) { if (paramInt > -1393895855);
/* 674 */                     i11 = 0;
/*     */                   }
/* 677 */                   else if ((localaq1 > 0) && ((paramInt <= -1393895855) || ((l.d[1][localaq7][i9] & 0x2) != 0))) { if (paramInt > -1393895855);
/* 678 */                     i11 = localaq1 - 1;
/*     */                   } else
/*     */                   {
/* 681 */                     i11 = localaq1;
/*     */                   }
/* 683 */                   if (1943405583 * client.dl != i11) { if (paramInt <= -1393895855) throw new IllegalStateException(); continue;
/*     */                   }
/*     */                 }
/* 686 */                 if (localaq1 < 295866421 * l.l) { if (paramInt > -1393895855);
/* 686 */                   l.l = localaq1 * 1992835613; }
/* 687 */                 i11 = l.m[localaq1][localaq7][i9] & 0xFF;
/* 688 */                 int i12 = l.c[localaq1][localaq7][i9] & 0xFF;
/* 689 */                 if (i11 <= 0) { if ((paramInt > -1393895855) && (i12 <= 0)) continue; if (paramInt <= -1393895855); }
/* 690 */                 int i13 = l.r[localaq1][localaq7][i9];
/* 691 */                 int i14 = l.r[localaq1][(1 + localaq7)][i9];
/* 692 */                 int i15 = l.r[localaq1][(1 + localaq7)][(i9 + 1)];
/* 693 */                 int i16 = l.r[localaq1][localaq7][(1 + i9)];
/* 694 */                 int i17 = ag.g[localaq7][i9];
/* 695 */                 int i18 = ag.g[(localaq7 + 1)][i9];
/* 696 */                 int i19 = ag.g[(1 + localaq7)][(i9 + 1)];
/* 697 */                 int i20 = ag.g[localaq7][(i9 + 1)];
/* 698 */                 int i21 = -1;
/* 699 */                 int i22 = -1;
/*     */                 int i24;
/*     */                 int i25;
/* 700 */                 if (i11 > 0) { if (paramInt <= -1393895855) return;
/* 701 */                   i23 = i2 * 256 / i6;
/* 702 */                   i24 = i3 / localaq11;
/* 703 */                   i25 = localaq10 / localaq11;
/* 704 */                   i21 = aa.b(i23, i24, i25, 907957005);
/* 705 */                   i23 = i23 + -1963497381 * l.x & 0xFF;
/* 706 */                   i25 += -237346329 * l.p;
/* 707 */                   if (i25 < 0) { if (paramInt <= -1393895855) throw new IllegalStateException(); i25 = 0;
/* 708 */                   } else if (i25 > 255) { if (paramInt > -1393895855);
/* 708 */                     i25 = 255; }
/* 709 */                   i22 = aa.b(i23, i24, i25, 1882496302);
/*     */                 }
/* 711 */                 if (localaq1 > 0) { if (paramInt <= -1393895855) throw new IllegalStateException();
/* 712 */                   i23 = 1;
/* 713 */                   if ((0 == i11) && ((paramInt <= -1393895855) || (0 != l.n[localaq1][localaq7][i9]))) { if (paramInt <= -1393895855) return; i23 = 0; }
/* 714 */                   if ((i12 > 0) && ((paramInt <= -1393895855) || (!cj.z(i12 - 1, 1778772432).q))) { if (paramInt > -1393895855);
/* 714 */                     i23 = 0; }
/* 715 */                   if ((i23 != 0) && ((paramInt <= -1393895855) || 
/* 716 */                     (i14 == i13))) { if (paramInt <= -1393895855) throw new IllegalStateException(); if ((i15 == i13) && ((paramInt <= -1393895855) || (i13 == i16))) { if (paramInt > -1393895855);
/* 716 */                       bp.w[localaq1][localaq7][i9] |= 2340; }
/*     */                   }
/*     */                 }
/* 719 */                 int i23 = 0;
/* 720 */                 if (-1 != i22) { if (paramInt > -1393895855);
/* 720 */                   i23 = fx.ap[ch.w(i22, 96, 12)]; }
/* 721 */                 if (i12 == 0) { if (paramInt > -1393895855);
/* 722 */                   paramaq.n(localaq1, localaq7, i9, 0, 0, -1, i13, i14, i15, i16, ch.w(i21, i17, (byte)-9), ch.w(i21, i18, (byte)40), ch.w(i21, i19, (byte)8), ch.w(i21, i20, (byte)12), 0, 0, 0, 0, i23, 0);
/*     */                 } else
/*     */                 {
/* 725 */                   i24 = l.n[localaq1][localaq7][i9] + 1;
/* 726 */                   i25 = l.j[localaq1][localaq7][i9];
/* 727 */                   fb localfb = cj.z(i12 - 1, 2019856075);
/* 728 */                   int i26 = -534338865 * localfb.g;
/*     */                   int i28;
/*     */                   int i27;
/*     */                   int i30;
/* 731 */                   if (i26 >= 0) { if (paramInt <= -1393895855) return;
/* 732 */                     i28 = fx.av.d(i26, -2145324813);
/* 733 */                     i27 = -1;
/*     */                   }
/* 736 */                   else if (16711935 == localfb.z * 501250711) { if (paramInt > -1393895855);
/* 737 */                     i27 = -2;
/* 738 */                     i26 = -1;
/* 739 */                     i28 = -2;
/*     */                   } else
/*     */                   {
/* 742 */                     i27 = aa.b(-1372016439 * localfb.s, -1726086421 * localfb.u, localfb.v * -184885597, -2007724724);
/* 743 */                     i29 = localfb.s * -1372016439 + l.x * -1963497381 & 0xFF;
/* 744 */                     i30 = -184885597 * localfb.v + -237346329 * l.p;
/* 745 */                     if (i30 < 0) { if (paramInt <= -1393895855) return; i30 = 0;
/* 746 */                     } else if (i30 > 255) { if (paramInt > -1393895855);
/* 746 */                       i30 = 255; }
/* 747 */                     i28 = aa.b(i29, localfb.u * -1726086421, i30, 174392710);
/*     */                   }
/*     */ 
/* 750 */                   int i29 = 0;
/* 751 */                   if (i28 != -2) { if (paramInt <= -1393895855) throw new IllegalStateException(); i29 = fx.ap[eg.e(i28, 96, -1871888009)]; }
/* 752 */                   if (localfb.i * -1328768869 != -1) { if (paramInt > -1393895855);
/* 753 */                     i30 = -1963497381 * l.x + localfb.w * -1369253325 & 0xFF;
/* 754 */                     int i31 = -1374033761 * localfb.b + -237346329 * l.p;
/* 755 */                     if (i31 < 0) { if (paramInt > -1393895855);
/* 755 */                       i31 = 0;
/* 756 */                     } else if (i31 > 255) { if (paramInt <= -1393895855) throw new IllegalStateException(); i31 = 255; }
/* 757 */                     i28 = aa.b(i30, 1905173851 * localfb.e, i31, -457980738);
/* 758 */                     i29 = fx.ap[eg.e(i28, 96, -1844126251)];
/*     */                   }
/* 760 */                   paramaq.n(localaq1, localaq7, i9, i24, i25, i26, i13, i14, i15, i16, ch.w(i21, i17, (byte)34), ch.w(i21, i18, (byte)60), ch.w(i21, i19, (byte)46), ch.w(i21, i20, (byte)-116), eg.e(i27, i17, -1310531349), eg.e(i27, i18, -1334586386), eg.e(i27, i19, -1441637592), eg.e(i27, i20, -2040205630), i23, i29);
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/* 767 */       for (localaq7 = 1; localaq7 < 103; localaq7++) { if (paramInt > -1393895855);
/* 768 */         for (i2 = 1; i2 < 103; i2++) { if (paramInt <= -1393895855) throw new IllegalStateException();
/* 769 */           localaq8 = paramaq;
/* 770 */           localaq10 = localaq1;
/* 771 */           i6 = i2;
/* 772 */           localaq11 = localaq7;
/*     */ 
/* 775 */           if ((l.d[localaq1][i2][localaq7] & 0x8) != 0) { if (paramInt <= -1393895855) return;
/* 776 */             i9 = 0;
/*     */           } else
/*     */           {
/* 779 */             if (localaq1 > 0) { if (paramInt <= -1393895855) return; if ((l.d[1][i2][localaq7] & 0x2) != 0) { if (paramInt <= -1393895855) throw new IllegalStateException();
/* 780 */                 i9 = localaq1 - 1;
/* 781 */                 break label2799; }
/*     */             }
/* 783 */             i9 = localaq1;
/*     */           }
/* 785 */           label2799: localaq8.c(localaq10, i6, localaq11, i9);
/*     */         }
/*     */       }
/* 788 */       l.m[localaq1] = ((byte[][])null);
/* 789 */       l.c[localaq1] = ((byte[][])null);
/* 790 */       l.n[localaq1] = ((byte[][])null);
/* 791 */       l.j[localaq1] = ((byte[][])null);
/* 792 */       l.z[localaq1] = ((byte[][])null);
/*     */     }
/* 794 */     paramaq.ap(-50, -10, -50);
/* 795 */     for (localaq1 = 0; localaq1 < 104; localaq1++) { if (paramInt > -1393895855);
/* 796 */       for (k = 0; k < 104; k++) if ((paramInt <= -1393895855) || 
/* 797 */           ((l.d[1][localaq1][k] & 0x2) == 2)) { if (paramInt > -1393895855);
/* 797 */           paramaq.l(localaq1, k);
/*     */         }
/*     */     }
/* 800 */     localaq1 = 1;
/* 801 */     int k = 2;
/* 802 */     int m = 4;
/* 803 */     for (int i1 = 0; i1 < 4; i1++) { if (paramInt <= -1393895855) return;
/* 804 */       if (i1 > 0) { if (paramInt > -1393895855);
/* 805 */         localaq1 <<= 3;
/* 806 */         k <<= 3;
/* 807 */         m <<= 3;
/*     */       }
/* 809 */       for (aq localaq2 = 0; localaq2 <= i1; localaq2++) { if (paramInt <= -1393895855) return;
/* 810 */         for (aq localaq3 = 0; localaq3 <= 104; localaq3++) { if (paramInt > -1393895855);
/* 811 */           for (aq localaq4 = 0; localaq4 <= 104; localaq4++)
/*     */           {
/* 812 */             label3290: aq localaq9;
/*     */             label3377: int i8;
/* 811 */             if ((paramInt <= -1393895855) || 
/* 812 */               (0 != (bp.w[localaq2][localaq4][localaq3] & localaq1))) { if (paramInt > -1393895855);
/* 813 */               localaq5 = localaq3;
/* 814 */               localaq6 = localaq3;
/* 815 */               localaq7 = localaq2;
/* 816 */               i2 = localaq2;
/* 817 */               for (; localaq5 > 0; localaq5--) { if (paramInt <= -1393895855) return; if ((bp.w[localaq2][localaq4][(localaq5 - 1)] & localaq1) == 0) break; if (paramInt <= -1393895855) return; 
/*     */               }
/* 818 */               for (; localaq6 < 104; localaq6++) { if (paramInt <= -1393895855) return; if (0 == (bp.w[localaq2][localaq4][(1 + localaq6)] & localaq1)) break; if (paramInt <= -1393895855) return; 
/*     */               }
/* 819 */               while (localaq7 > 0) { if (paramInt > -1393895855);
/* 820 */                 for (localaq8 = localaq5; localaq8 <= localaq6; localaq8++) { if (paramInt <= -1393895855) throw new IllegalStateException(); if ((bp.w[(localaq7 - 1)][localaq4][localaq8] & localaq1) == 0) { if (paramInt > -1393895855);
/* 820 */                     break label3290; } }
/* 821 */                 localaq7--;
/*     */               }
/* 823 */               while (i2 < i1) { if (paramInt <= -1393895855) throw new IllegalStateException();
/* 824 */                 for (localaq8 = localaq5; localaq8 <= localaq6; localaq8++) { if (paramInt <= -1393895855) throw new IllegalStateException(); if ((bp.w[(i2 + 1)][localaq4][localaq8] & localaq1) == 0) { if (paramInt <= -1393895855) return; break label3377; } }
/* 825 */                 i2++;
/*     */               }
/* 827 */               localaq9 = (localaq6 - localaq5 + 1) * (1 + i2 - localaq7);
/* 828 */               if (localaq9 >= 8) { if (paramInt <= -1393895855) return;
/* 829 */                 localaq10 = 240;
/* 830 */                 i6 = l.r[i2][localaq4][localaq5] - localaq10;
/* 831 */                 i8 = l.r[localaq7][localaq4][localaq5];
/* 832 */                 aq.m(i1, 1, 128 * localaq4, 128 * localaq4, localaq5 * 128, localaq6 * 128 + 128, i6, i8);
/* 833 */                 for (i9 = localaq7; i9 <= i2; i9++) { if (paramInt <= -1393895855) return;
/* 834 */                   for (localaq12 = localaq5; localaq12 <= localaq6; localaq12++) { if (paramInt > -1393895855);
/* 834 */                     bp.w[i9][localaq4][localaq12] &= (localaq1 ^ 0xFFFFFFFF);
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/* 838 */             label3781: int i4;
/* 838 */             if (0 != (bp.w[localaq2][localaq4][localaq3] & k)) { if (paramInt <= -1393895855) return;
/* 839 */               localaq5 = localaq4;
/* 840 */               localaq6 = localaq4;
/* 841 */               localaq7 = localaq2;
/* 842 */               i2 = localaq2;
/* 843 */               for (; (localaq5 > 0) && ((paramInt <= -1393895855) || (0 != (bp.w[localaq2][(localaq5 - 1)][localaq3] & k))); localaq5--) if (paramInt <= -1393895855);
/* 844 */               for (; (localaq6 < 104) && ((paramInt <= -1393895855) || ((bp.w[localaq2][(1 + localaq6)][localaq3] & k) != 0)); localaq6++) if (paramInt <= -1393895855);
/* 845 */               while (localaq7 > 0) { if (paramInt > -1393895855);
/* 846 */                 for (localaq9 = localaq5; localaq9 <= localaq6; localaq9++) { if (paramInt <= -1393895855) throw new IllegalStateException(); if ((bp.w[(localaq7 - 1)][localaq9][localaq3] & k) == 0) { if (paramInt <= -1393895855) throw new IllegalStateException(); break label3781; } }
/* 847 */                 localaq7--;
/*     */               }
/* 849 */               while (i2 < i1) { if (paramInt <= -1393895855) return;
/* 850 */                 for (localaq9 = localaq5; localaq9 <= localaq6; localaq9++) { if (paramInt <= -1393895855) return; if (0 == (bp.w[(1 + i2)][localaq9][localaq3] & k)) { if (paramInt > -1393895855);
/* 850 */                     break label3858; } }
/* 851 */                 i2++;
/*     */               }
/* 853 */               label3858: i4 = (i2 + 1 - localaq7) * (1 + (localaq6 - localaq5));
/* 854 */               if (i4 >= 8) { if (paramInt > -1393895855);
/* 855 */                 localaq10 = 240;
/* 856 */                 i6 = l.r[i2][localaq5][localaq3] - localaq10;
/* 857 */                 i8 = l.r[localaq7][localaq5][localaq3];
/* 858 */                 aq.m(i1, 2, 128 * localaq5, 128 + 128 * localaq6, localaq3 * 128, localaq3 * 128, i6, i8);
/* 859 */                 for (i9 = localaq7; i9 <= i2; i9++) { if (paramInt <= -1393895855) return;
/* 860 */                   for (localaq12 = localaq5; localaq12 <= localaq6; localaq12++) { if (paramInt > -1393895855);
/* 860 */                     bp.w[i9][localaq12][localaq3] &= (k ^ 0xFFFFFFFF); }
/*     */                 }
/*     */               }
/*     */             }
/* 864 */             if ((bp.w[localaq2][localaq4][localaq3] & m) != 0) { if (paramInt <= -1393895855) throw new IllegalStateException();
/* 865 */               localaq5 = localaq4;
/* 866 */               localaq6 = localaq4;
/* 867 */               localaq7 = localaq3;
/* 868 */               i2 = localaq3;
/* 869 */               for (; (localaq7 > 0) && ((paramInt <= -1393895855) || (0 != (bp.w[localaq2][localaq4][(localaq7 - 1)] & m))); localaq7--) if (paramInt <= -1393895855) throw new IllegalStateException();
/* 870 */               for (; i2 < 104; i2++) { if (paramInt <= -1393895855) return; if ((bp.w[localaq2][localaq4][(i2 + 1)] & m) == 0) break; if (paramInt <= -1393895855); }
/* 871 */               while (localaq5 > 0) { if (paramInt > -1393895855);
/* 872 */                 for (i4 = localaq7; i4 <= i2; i4++) { if (paramInt <= -1393895855) return; if ((bp.w[localaq2][(localaq5 - 1)][i4] & m) == 0) { if (paramInt > -1393895855);
/* 872 */                     break label4262; } }
/* 873 */                 localaq5--;
/*     */               }
/* 875 */               label4262: while (localaq6 < 104) { if (paramInt <= -1393895855) return;
/* 876 */                 for (i4 = localaq7; i4 <= i2; i4++) if ((paramInt <= -1393895855) || (0 == (bp.w[localaq2][(1 + localaq6)][i4] & m))) { if (paramInt > -1393895855);
/* 876 */                     break label4341; }
/* 877 */                 localaq6++;
/*     */               }
/* 879 */               label4341: if ((localaq6 - localaq5 + 1) * (1 + (i2 - localaq7)) >= 4) { if (paramInt > -1393895855);
/* 880 */                 i4 = l.r[localaq2][localaq5][localaq7];
/* 881 */                 aq.m(i1, 4, localaq5 * 128, 128 * localaq6 + 128, 128 * localaq7, 128 + i2 * 128, i4, i4);
/* 882 */                 for (localaq10 = localaq5; localaq10 <= localaq6; localaq10++) { if (paramInt > -1393895855);
/* 883 */                   for (i6 = localaq7; i6 <= i2; i6++) { if (paramInt <= -1393895855) return; bp.w[localaq2][localaq10][i6] &= (m ^ 0xFFFFFFFF);
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     fp
 * JD-Core Version:    0.6.2
 */