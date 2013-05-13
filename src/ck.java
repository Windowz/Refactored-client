/*      */ public class ck
/*      */ {
/*      */   static final int t = 262144;
/*      */   static final int d = 2;
/*      */   static final int l = 4;
/*      */   static final int r = 1;
/*      */   static final int c = 16;
/*      */   static final int n = 32;
/*      */   static final int j = 64;
/*      */   static final int z = 128;
/*      */   public static final int as = 19661184;
/*      */   static final int q = 512;
/*      */   static final int i = 1024;
/*      */   public static final int aa = 19661280;
/*      */   static final int u = 4096;
/*      */   static final int f = 524288;
/*      */   int ap;
/*      */   static final int v = 8192;
/*      */   static final int b = 65536;
/*      */   static final int y = 131072;
/*      */   static final int e = 32768;
/*      */   static final int w = 16384;
/*      */   static final int k = 2097152;
/*      */   public static final int o = 16777216;
/*      */   public static final int a = 19661187;
/*      */   public static final int h = 19661058;
/*      */   public static final int x = 19661070;
/*      */   static final int g = 256;
/*      */   public static final int ad = 19661112;
/*      */   public static final int ac = 19661088;
/*      */   static final int m = 8;
/*      */   int av;
/*      */   int am;
/*      */   public int[][] az;
/*      */   static final int s = 2048;
/*      */   int ak;
/*      */   public static final int p = 19661064;
/*      */   static dq bd;
/*      */   static eg ha;
/*      */ 
/*      */   public void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5)
/*      */   {
/*   59 */     paramInt1 -= -1742571293 * this.am;
/*   60 */     paramInt2 -= this.ap * -723140531;
/*   61 */     if (paramInt3 == 0) { if (paramInt5 <= 283393492) return;
/*   62 */       if (0 == paramInt4) { if (paramInt5 <= 283393492) return;
/*   63 */         n(paramInt1, paramInt2, 128, -517229826);
/*   64 */         n(paramInt1 - 1, paramInt2, 8, -517229826);
/*      */       }
/*   66 */       if (paramInt4 == 1) { if (paramInt5 > 283393492);
/*   67 */         n(paramInt1, paramInt2, 2, -517229826);
/*   68 */         n(paramInt1, 1 + paramInt2, 32, -517229826);
/*      */       }
/*   70 */       if (paramInt4 == 2) { if (paramInt5 <= 283393492) throw new IllegalStateException();
/*   71 */         n(paramInt1, paramInt2, 8, -517229826);
/*   72 */         n(paramInt1 + 1, paramInt2, 128, -517229826);
/*      */       }
/*   74 */       if (paramInt4 == 3) { if (paramInt5 <= 283393492) throw new IllegalStateException();
/*   75 */         n(paramInt1, paramInt2, 32, -517229826);
/*   76 */         n(paramInt1, paramInt2 - 1, 2, -517229826);
/*      */       }
/*      */     }
/*   79 */     if (1 != paramInt3) { if (paramInt5 <= 283393492) throw new IllegalStateException(); if (3 != paramInt3) break label392; if (paramInt5 <= 283393492); }
/*   80 */     if (paramInt4 == 0) { if (paramInt5 > 283393492);
/*   81 */       n(paramInt1, paramInt2, 1, -517229826);
/*   82 */       n(paramInt1 - 1, 1 + paramInt2, 16, -517229826);
/*      */     }
/*   84 */     if (1 == paramInt4) { if (paramInt5 <= 283393492) throw new IllegalStateException();
/*   85 */       n(paramInt1, paramInt2, 4, -517229826);
/*   86 */       n(paramInt1 + 1, 1 + paramInt2, 64, -517229826);
/*      */     }
/*   88 */     if (2 == paramInt4) { if (paramInt5 > 283393492);
/*   89 */       n(paramInt1, paramInt2, 16, -517229826);
/*   90 */       n(1 + paramInt1, paramInt2 - 1, 1, -517229826);
/*      */     }
/*   92 */     if (paramInt4 == 3) { if (paramInt5 <= 283393492) throw new IllegalStateException();
/*   93 */       n(paramInt1, paramInt2, 64, -517229826);
/*   94 */       n(paramInt1 - 1, paramInt2 - 1, 4, -517229826);
/*      */     }
/*      */ 
/*   97 */     label392: if (paramInt3 == 2) { if ((paramInt5 <= 283393492) || 
/*   98 */         (paramInt4 == 0)) { if (paramInt5 > 283393492);
/*   99 */         n(paramInt1, paramInt2, 130, -517229826);
/*  100 */         n(paramInt1 - 1, paramInt2, 8, -517229826);
/*  101 */         n(paramInt1, 1 + paramInt2, 32, -517229826);
/*      */       }
/*  103 */       if (1 == paramInt4) { if (paramInt5 <= 283393492) return;
/*  104 */         n(paramInt1, paramInt2, 10, -517229826);
/*  105 */         n(paramInt1, 1 + paramInt2, 32, -517229826);
/*  106 */         n(1 + paramInt1, paramInt2, 128, -517229826);
/*      */       }
/*  108 */       if (paramInt4 == 2) { if (paramInt5 > 283393492);
/*  109 */         n(paramInt1, paramInt2, 40, -517229826);
/*  110 */         n(paramInt1 + 1, paramInt2, 128, -517229826);
/*  111 */         n(paramInt1, paramInt2 - 1, 2, -517229826);
/*      */       }
/*  113 */       if (paramInt4 == 3) { if (paramInt5 <= 283393492) return;
/*  114 */         n(paramInt1, paramInt2, 160, -517229826);
/*  115 */         n(paramInt1, paramInt2 - 1, 2, -517229826);
/*  116 */         n(paramInt1 - 1, paramInt2, 8, -517229826);
/*      */       }
/*      */     }
/*  119 */     if (paramBoolean) { if (paramInt5 <= 283393492) return;
/*  120 */       if (0 == paramInt3) { if ((paramInt5 <= 283393492) || 
/*  121 */           (paramInt4 == 0)) { if (paramInt5 <= 283393492) return;
/*  122 */           n(paramInt1, paramInt2, 65536, -517229826);
/*  123 */           n(paramInt1 - 1, paramInt2, 4096, -517229826);
/*      */         }
/*  125 */         if (1 == paramInt4) { if (paramInt5 > 283393492);
/*  126 */           n(paramInt1, paramInt2, 1024, -517229826);
/*  127 */           n(paramInt1, paramInt2 + 1, 16384, -517229826);
/*      */         }
/*  129 */         if (paramInt4 == 2) { if (paramInt5 > 283393492);
/*  130 */           n(paramInt1, paramInt2, 4096, -517229826);
/*  131 */           n(1 + paramInt1, paramInt2, 65536, -517229826);
/*      */         }
/*  133 */         if (paramInt4 == 3) { if (paramInt5 > 283393492);
/*  134 */           n(paramInt1, paramInt2, 16384, -517229826);
/*  135 */           n(paramInt1, paramInt2 - 1, 1024, -517229826);
/*      */         }
/*      */       }
/*  138 */       if (1 != paramInt3) { if ((paramInt5 > 283393492) && (3 != paramInt3)) break label989; if (paramInt5 <= 283393492); }
/*  139 */       if (0 == paramInt4) { if (paramInt5 <= 283393492) throw new IllegalStateException();
/*  140 */         n(paramInt1, paramInt2, 512, -517229826);
/*  141 */         n(paramInt1 - 1, paramInt2 + 1, 8192, -517229826);
/*      */       }
/*  143 */       if (paramInt4 == 1) { if (paramInt5 <= 283393492) return;
/*  144 */         n(paramInt1, paramInt2, 2048, -517229826);
/*  145 */         n(1 + paramInt1, paramInt2 + 1, 32768, -517229826);
/*      */       }
/*  147 */       if (paramInt4 == 2) { if (paramInt5 <= 283393492) return;
/*  148 */         n(paramInt1, paramInt2, 8192, -517229826);
/*  149 */         n(paramInt1 + 1, paramInt2 - 1, 512, -517229826);
/*      */       }
/*  151 */       if (3 == paramInt4) { if (paramInt5 <= 283393492) throw new IllegalStateException();
/*  152 */         n(paramInt1, paramInt2, 32768, -517229826);
/*  153 */         n(paramInt1 - 1, paramInt2 - 1, 2048, -517229826);
/*      */       }
/*      */ 
/*  156 */       label989: if (2 == paramInt3) { if ((paramInt5 <= 283393492) || 
/*  157 */           (0 == paramInt4)) { if (paramInt5 > 283393492);
/*  158 */           n(paramInt1, paramInt2, 66560, -517229826);
/*  159 */           n(paramInt1 - 1, paramInt2, 4096, -517229826);
/*  160 */           n(paramInt1, 1 + paramInt2, 16384, -517229826);
/*      */         }
/*  162 */         if (paramInt4 == 1) { if (paramInt5 <= 283393492) throw new IllegalStateException();
/*  163 */           n(paramInt1, paramInt2, 5120, -517229826);
/*  164 */           n(paramInt1, 1 + paramInt2, 16384, -517229826);
/*  165 */           n(1 + paramInt1, paramInt2, 65536, -517229826);
/*      */         }
/*  167 */         if (2 == paramInt4) { if (paramInt5 > 283393492);
/*  168 */           n(paramInt1, paramInt2, 20480, -517229826);
/*  169 */           n(1 + paramInt1, paramInt2, 65536, -517229826);
/*  170 */           n(paramInt1, paramInt2 - 1, 1024, -517229826);
/*      */         }
/*  172 */         if (paramInt4 == 3) { if (paramInt5 > 283393492);
/*  173 */           n(paramInt1, paramInt2, 81920, -517229826);
/*  174 */           n(paramInt1, paramInt2 - 1, 1024, -517229826);
/*  175 */           n(paramInt1 - 1, paramInt2, 4096, -517229826);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void r(int paramInt)
/*      */   {
/*   50 */     for (int i1 = 0; i1 < this.av * 915245941; i1++) { if (paramInt > 207505750);
/*   51 */       for (int i2 = 0; i2 < this.ak * 920953833; i2++) { if (paramInt <= 207505750) throw new IllegalStateException();
/*   52 */         if (0 != i1) { if (paramInt <= 207505750) throw new IllegalStateException(); if (0 != i2) { if (paramInt <= 207505750) throw new IllegalStateException(); if (i1 < this.av * 915245941 - 5) { if (paramInt <= 207505750) return; if (i2 < 920953833 * this.ak - 5) break label147; if (paramInt <= 207505750) throw new IllegalStateException();  }  } }
/*   52 */         this.az[i1][i2] = 16777215; continue;
/*   53 */         label147: this.az[i1][i2] = 16777216;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public boolean i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*  364 */     if ((paramInt3 == paramInt1) && ((paramInt7 <= 1253515496) || (paramInt2 == paramInt4))) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); return true; }
/*  365 */     paramInt1 -= -1742571293 * this.am;
/*  366 */     paramInt2 -= this.ap * -723140531;
/*  367 */     paramInt3 -= -1742571293 * this.am;
/*  368 */     paramInt4 -= this.ap * -723140531;
/*  369 */     if (paramInt5 == 0) { if (paramInt7 <= 1253515496) throw new IllegalStateException();
/*  370 */       if (0 == paramInt6) { if ((paramInt7 <= 1253515496) || (
/*  371 */           (paramInt3 - 1 == paramInt1) && ((paramInt7 <= 1253515496) || (paramInt4 == paramInt2)))) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); return true; }
/*  372 */         if ((paramInt1 == paramInt3) && ((paramInt7 <= 1253515496) || ((paramInt2 == paramInt4 + 1) && ((paramInt7 <= 1253515496) || (0 == (this.az[paramInt1][paramInt2] & 0x12C0120)))))) { if (paramInt7 > 1253515496);
/*  372 */           return true; }
/*  373 */         if ((paramInt3 == paramInt1) && ((paramInt7 <= 1253515496) || (paramInt2 == paramInt4 - 1))) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if (0 == (this.az[paramInt1][paramInt2] & 0x12C0102)) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); return true; } }
/*      */       }
/*  375 */       else if (1 == paramInt6) { if (paramInt7 <= 1253515496) throw new IllegalStateException();
/*  376 */         if ((paramInt1 == paramInt3) && ((paramInt7 <= 1253515496) || (paramInt2 == paramInt4 + 1))) { if (paramInt7 > 1253515496);
/*  376 */           return true; }
/*  377 */         if (paramInt1 == paramInt3 - 1) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if ((paramInt4 == paramInt2) && ((paramInt7 <= 1253515496) || ((this.az[paramInt1][paramInt2] & 0x12C0108) == 0))) { if (paramInt7 > 1253515496);
/*  377 */             return true; } }
/*  378 */         if (paramInt1 == 1 + paramInt3) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if (paramInt2 == paramInt4) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if ((this.az[paramInt1][paramInt2] & 0x12C0180) == 0) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); return true; } } }
/*      */       }
/*  380 */       else if (2 == paramInt6) { if (paramInt7 <= 1253515496) throw new IllegalStateException();
/*  381 */         if (paramInt3 + 1 == paramInt1) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if (paramInt4 == paramInt2) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); return true; } }
/*  382 */         if ((paramInt3 == paramInt1) && ((paramInt7 <= 1253515496) || ((paramInt4 + 1 == paramInt2) && ((paramInt7 <= 1253515496) || (0 == (this.az[paramInt1][paramInt2] & 0x12C0120)))))) { if (paramInt7 > 1253515496);
/*  382 */           return true; }
/*  383 */         if ((paramInt1 == paramInt3) && ((paramInt7 <= 1253515496) || ((paramInt2 == paramInt4 - 1) && ((paramInt7 <= 1253515496) || ((this.az[paramInt1][paramInt2] & 0x12C0102) == 0))))) { if (paramInt7 > 1253515496);
/*  383 */           return true; }
/*      */       }
/*  385 */       else if (3 == paramInt6) { if (paramInt7 <= 1253515496) throw new IllegalStateException();
/*  386 */         if ((paramInt1 == paramInt3) && ((paramInt7 <= 1253515496) || (paramInt4 - 1 == paramInt2))) { if (paramInt7 > 1253515496);
/*  386 */           return true; }
/*  387 */         if (paramInt3 - 1 == paramInt1) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if ((paramInt4 == paramInt2) && ((paramInt7 <= 1253515496) || ((this.az[paramInt1][paramInt2] & 0x12C0108) == 0))) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); return true; } }
/*  388 */         if (1 + paramInt3 == paramInt1) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if ((paramInt2 == paramInt4) && ((paramInt7 <= 1253515496) || (0 == (this.az[paramInt1][paramInt2] & 0x12C0180)))) { if (paramInt7 > 1253515496);
/*  388 */             return true; } }
/*      */       }
/*      */     }
/*  391 */     if (2 == paramInt5) if ((paramInt7 <= 1253515496) || 
/*  392 */         (0 == paramInt6)) { if ((paramInt7 <= 1253515496) || (
/*  393 */           (paramInt1 == paramInt3 - 1) && ((paramInt7 <= 1253515496) || (paramInt4 == paramInt2)))) { if (paramInt7 > 1253515496);
/*  393 */           return true; }
/*  394 */         if ((paramInt1 == paramInt3) && ((paramInt7 <= 1253515496) || (paramInt2 == paramInt4 + 1))) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); return true; }
/*  395 */         if (paramInt3 + 1 == paramInt1) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if (paramInt4 == paramInt2) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if ((this.az[paramInt1][paramInt2] & 0x12C0180) == 0) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); return true; } } }
/*  396 */         if (paramInt3 == paramInt1) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if ((paramInt2 == paramInt4 - 1) && ((paramInt7 <= 1253515496) || ((this.az[paramInt1][paramInt2] & 0x12C0102) == 0))) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); return true; } }
/*      */       }
/*  398 */       else if (1 == paramInt6) { if ((paramInt7 <= 1253515496) || (
/*  399 */           (paramInt1 == paramInt3 - 1) && ((paramInt7 <= 1253515496) || (paramInt2 == paramInt4)))) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if ((this.az[paramInt1][paramInt2] & 0x12C0108) == 0) { if (paramInt7 > 1253515496);
/*  399 */             return true; } }
/*  400 */         if ((paramInt3 == paramInt1) && ((paramInt7 <= 1253515496) || (paramInt2 == paramInt4 + 1))) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); return true; }
/*  401 */         if ((paramInt3 + 1 == paramInt1) && ((paramInt7 <= 1253515496) || (paramInt2 == paramInt4))) { if (paramInt7 > 1253515496);
/*  401 */           return true; }
/*  402 */         if (paramInt3 == paramInt1) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if (paramInt2 == paramInt4 - 1) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if (0 == (this.az[paramInt1][paramInt2] & 0x12C0102)) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); return true; } } }
/*      */       }
/*  404 */       else if (2 == paramInt6) { if ((paramInt7 <= 1253515496) || 
/*  405 */           (paramInt1 == paramInt3 - 1)) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if (paramInt2 == paramInt4) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if ((this.az[paramInt1][paramInt2] & 0x12C0108) == 0) { if (paramInt7 > 1253515496);
/*  405 */               return true; } } }
/*  406 */         if (paramInt3 == paramInt1) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if (paramInt4 + 1 == paramInt2) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if (0 == (this.az[paramInt1][paramInt2] & 0x12C0120)) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); return true; } } }
/*  407 */         if (paramInt3 + 1 == paramInt1) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if (paramInt4 == paramInt2) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); return true; } }
/*  408 */         if ((paramInt3 == paramInt1) && ((paramInt7 <= 1253515496) || (paramInt2 == paramInt4 - 1))) { if (paramInt7 > 1253515496);
/*  408 */           return true; }
/*      */       }
/*  410 */       else if (paramInt6 == 3) { if ((paramInt7 <= 1253515496) || 
/*  411 */           (paramInt3 - 1 == paramInt1)) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if (paramInt4 == paramInt2) { if (paramInt7 > 1253515496);
/*  411 */             return true; } }
/*  412 */         if (paramInt1 == paramInt3) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if ((paramInt2 == paramInt4 + 1) && ((paramInt7 <= 1253515496) || (0 == (this.az[paramInt1][paramInt2] & 0x12C0120)))) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); return true; } }
/*  413 */         if ((paramInt1 == 1 + paramInt3) && ((paramInt7 <= 1253515496) || ((paramInt2 == paramInt4) && ((paramInt7 <= 1253515496) || ((this.az[paramInt1][paramInt2] & 0x12C0180) == 0))))) { if (paramInt7 > 1253515496);
/*  413 */           return true; }
/*  414 */         if ((paramInt3 == paramInt1) && ((paramInt7 <= 1253515496) || (paramInt4 - 1 == paramInt2))) { if (paramInt7 > 1253515496);
/*  414 */           return true;
/*      */         }
/*      */       }
/*  417 */     if (paramInt5 == 9) { if ((paramInt7 <= 1253515496) || 
/*  418 */         (paramInt1 == paramInt3)) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if (paramInt2 == paramInt4 + 1) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if ((this.az[paramInt1][paramInt2] & 0x20) == 0) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); return true; } } }
/*  419 */       if (paramInt1 == paramInt3) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if (paramInt4 - 1 == paramInt2) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if (0 == (this.az[paramInt1][paramInt2] & 0x2)) { if (paramInt7 > 1253515496);
/*  419 */             return true; } } }
/*  420 */       if (paramInt1 == paramInt3 - 1) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if ((paramInt2 == paramInt4) && ((paramInt7 <= 1253515496) || ((this.az[paramInt1][paramInt2] & 0x8) == 0))) { if (paramInt7 > 1253515496);
/*  420 */           return true; } }
/*  421 */       if (paramInt1 == 1 + paramInt3) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if (paramInt2 == paramInt4) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); if ((this.az[paramInt1][paramInt2] & 0x80) == 0) { if (paramInt7 <= 1253515496) throw new IllegalStateException(); return true; } } }
/*      */     }
/*  423 */     return false;
/*      */   }
/*      */ 
/*      */   public void l(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5)
/*      */   {
/*  182 */     int i1 = 256;
/*  183 */     if (paramBoolean) { if (paramInt5 < -1126900668);
/*  183 */       i1 += 131072; }
/*  184 */     paramInt1 -= this.am * -1742571293;
/*  185 */     paramInt2 -= -723140531 * this.ap;
/*  186 */     for (int i2 = paramInt1; i2 < paramInt1 + paramInt3; i2++) if ((paramInt5 >= -1126900668) || 
/*  187 */         (i2 >= 0)) { if (paramInt5 >= -1126900668) return; if (i2 < this.av * 915245941) { if (paramInt5 < -1126900668);
/*  188 */           for (int i3 = paramInt2; i3 < paramInt4 + paramInt2; i3++) if ((paramInt5 >= -1126900668) || (
/*  189 */               (i3 >= 0) && ((paramInt5 >= -1126900668) || (i3 < this.ak * 920953833)))) { if (paramInt5 >= -1126900668) throw new IllegalStateException(); n(i2, i3, i1, -517229826); }
/*      */         }
/*      */       }
/*      */   }
/*      */ 
/*      */   public void m(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  196 */     paramInt1 -= -1742571293 * this.am;
/*  197 */     paramInt2 -= -723140531 * this.ap;
/*  198 */     this.az[paramInt1][paramInt2] |= 2097152;
/*      */   }
/*      */ 
/*      */   public void f(int paramInt1, int paramInt2)
/*      */   {
/*  196 */     paramInt1 -= -1742571293 * this.am;
/*  197 */     paramInt2 -= -723140531 * this.ap;
/*  198 */     this.az[paramInt1][paramInt2] |= 2097152;
/*      */   }
/*      */ 
/*      */   void n(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  208 */     this.az[paramInt1][paramInt2] |= paramInt3;
/*      */   }
/*      */ 
/*      */   public void j(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5) {
/*  212 */     paramInt1 -= this.am * -1742571293;
/*  213 */     paramInt2 -= -723140531 * this.ap;
/*  214 */     if (paramInt3 == 0) { if (paramInt5 >= -1811026174) throw new IllegalStateException();
/*  215 */       if (0 == paramInt4) { if (paramInt5 >= -1811026174) throw new IllegalStateException();
/*  216 */         g(paramInt1, paramInt2, 128, 234821152);
/*  217 */         g(paramInt1 - 1, paramInt2, 8, -283608198);
/*      */       }
/*  219 */       if (paramInt4 == 1) { if (paramInt5 < -1811026174);
/*  220 */         g(paramInt1, paramInt2, 2, 1413614807);
/*  221 */         g(paramInt1, 1 + paramInt2, 32, 1865359715);
/*      */       }
/*  223 */       if (paramInt4 == 2) { if (paramInt5 < -1811026174);
/*  224 */         g(paramInt1, paramInt2, 8, 409279045);
/*  225 */         g(1 + paramInt1, paramInt2, 128, -408159253);
/*      */       }
/*  227 */       if (3 == paramInt4) { if (paramInt5 < -1811026174);
/*  228 */         g(paramInt1, paramInt2, 32, 152273922);
/*  229 */         g(paramInt1, paramInt2 - 1, 2, -252821292);
/*      */       }
/*      */     }
/*  232 */     if (paramInt3 != 1) { if ((paramInt5 < -1811026174) && (3 != paramInt3)) break label394; if (paramInt5 >= -1811026174) return; 
/*      */     }
/*  233 */     if (paramInt4 == 0) { if (paramInt5 >= -1811026174) throw new IllegalStateException();
/*  234 */       g(paramInt1, paramInt2, 1, 2080800647);
/*  235 */       g(paramInt1 - 1, paramInt2 + 1, 16, 2078134475);
/*      */     }
/*  237 */     if (paramInt4 == 1) { if (paramInt5 >= -1811026174) throw new IllegalStateException();
/*  238 */       g(paramInt1, paramInt2, 4, 1011437995);
/*  239 */       g(paramInt1 + 1, paramInt2 + 1, 64, 1171317918);
/*      */     }
/*  241 */     if (paramInt4 == 2) { if (paramInt5 >= -1811026174) throw new IllegalStateException();
/*  242 */       g(paramInt1, paramInt2, 16, 1907312211);
/*  243 */       g(paramInt1 + 1, paramInt2 - 1, 1, 503789237);
/*      */     }
/*  245 */     if (3 == paramInt4) { if (paramInt5 < -1811026174);
/*  246 */       g(paramInt1, paramInt2, 64, -294420830);
/*  247 */       g(paramInt1 - 1, paramInt2 - 1, 4, 549094481);
/*      */     }
/*      */ 
/*  250 */     label394: if (paramInt3 == 2) { if ((paramInt5 >= -1811026174) || 
/*  251 */         (0 == paramInt4)) { if (paramInt5 < -1811026174);
/*  252 */         g(paramInt1, paramInt2, 130, 1551018717);
/*  253 */         g(paramInt1 - 1, paramInt2, 8, 1828009937);
/*  254 */         g(paramInt1, 1 + paramInt2, 32, 1319546308);
/*      */       }
/*  256 */       if (1 == paramInt4) { if (paramInt5 < -1811026174);
/*  257 */         g(paramInt1, paramInt2, 10, -654003317);
/*  258 */         g(paramInt1, paramInt2 + 1, 32, 1120110625);
/*  259 */         g(1 + paramInt1, paramInt2, 128, 235044073);
/*      */       }
/*  261 */       if (paramInt4 == 2) { if (paramInt5 < -1811026174);
/*  262 */         g(paramInt1, paramInt2, 40, 1134827669);
/*  263 */         g(paramInt1 + 1, paramInt2, 128, -809829065);
/*  264 */         g(paramInt1, paramInt2 - 1, 2, 1617112361);
/*      */       }
/*  266 */       if (3 == paramInt4) { if (paramInt5 >= -1811026174) return;
/*  267 */         g(paramInt1, paramInt2, 160, 381654081);
/*  268 */         g(paramInt1, paramInt2 - 1, 2, 655650003);
/*  269 */         g(paramInt1 - 1, paramInt2, 8, -208135744);
/*      */       }
/*      */     }
/*  272 */     if (paramBoolean) { if ((paramInt5 >= -1811026174) || 
/*  273 */         (paramInt3 == 0)) { if ((paramInt5 >= -1811026174) || 
/*  274 */           (paramInt4 == 0)) { if (paramInt5 < -1811026174);
/*  275 */           g(paramInt1, paramInt2, 65536, 1438225669);
/*  276 */           g(paramInt1 - 1, paramInt2, 4096, 117530282);
/*      */         }
/*  278 */         if (paramInt4 == 1) { if (paramInt5 >= -1811026174) throw new IllegalStateException();
/*  279 */           g(paramInt1, paramInt2, 1024, 1907026372);
/*  280 */           g(paramInt1, paramInt2 + 1, 16384, 1769100194);
/*      */         }
/*  282 */         if (2 == paramInt4) { if (paramInt5 < -1811026174);
/*  283 */           g(paramInt1, paramInt2, 4096, 443107807);
/*  284 */           g(paramInt1 + 1, paramInt2, 65536, 1595994811);
/*      */         }
/*  286 */         if (3 == paramInt4) { if (paramInt5 < -1811026174);
/*  287 */           g(paramInt1, paramInt2, 16384, -436776329);
/*  288 */           g(paramInt1, paramInt2 - 1, 1024, 67270178);
/*      */         }
/*      */       }
/*  291 */       if (1 != paramInt3) { if ((paramInt5 < -1811026174) && (3 != paramInt3)) break label1001; if (paramInt5 >= -1811026174) return; 
/*      */       }
/*  292 */       if (paramInt4 == 0) { if (paramInt5 < -1811026174);
/*  293 */         g(paramInt1, paramInt2, 512, -633744821);
/*  294 */         g(paramInt1 - 1, paramInt2 + 1, 8192, 353399809);
/*      */       }
/*  296 */       if (1 == paramInt4) { if (paramInt5 >= -1811026174) throw new IllegalStateException();
/*  297 */         g(paramInt1, paramInt2, 2048, 1941236372);
/*  298 */         g(1 + paramInt1, paramInt2 + 1, 32768, 1373628805);
/*      */       }
/*  300 */       if (2 == paramInt4) { if (paramInt5 >= -1811026174) throw new IllegalStateException();
/*  301 */         g(paramInt1, paramInt2, 8192, 992481786);
/*  302 */         g(paramInt1 + 1, paramInt2 - 1, 512, 356921443);
/*      */       }
/*  304 */       if (3 == paramInt4) { if (paramInt5 >= -1811026174) return;
/*  305 */         g(paramInt1, paramInt2, 32768, -197656822);
/*  306 */         g(paramInt1 - 1, paramInt2 - 1, 2048, -811879346);
/*      */       }
/*      */ 
/*  309 */       label1001: if (2 == paramInt3) { if (paramInt5 >= -1811026174) throw new IllegalStateException();
/*  310 */         if (paramInt4 == 0) { if (paramInt5 >= -1811026174) throw new IllegalStateException();
/*  311 */           g(paramInt1, paramInt2, 66560, -643223207);
/*  312 */           g(paramInt1 - 1, paramInt2, 4096, 54455208);
/*  313 */           g(paramInt1, paramInt2 + 1, 16384, 803069422);
/*      */         }
/*  315 */         if (paramInt4 == 1) { if (paramInt5 < -1811026174);
/*  316 */           g(paramInt1, paramInt2, 5120, -160793569);
/*  317 */           g(paramInt1, 1 + paramInt2, 16384, 1367848155);
/*  318 */           g(1 + paramInt1, paramInt2, 65536, 8666379);
/*      */         }
/*  320 */         if (paramInt4 == 2) { if (paramInt5 < -1811026174);
/*  321 */           g(paramInt1, paramInt2, 20480, -839056843);
/*  322 */           g(1 + paramInt1, paramInt2, 65536, 1497893392);
/*  323 */           g(paramInt1, paramInt2 - 1, 1024, -272298095);
/*      */         }
/*  325 */         if (3 == paramInt4) { if (paramInt5 < -1811026174);
/*  326 */           g(paramInt1, paramInt2, 81920, -813830417);
/*  327 */           g(paramInt1, paramInt2 - 1, 1024, 814250987);
/*  328 */           g(paramInt1 - 1, paramInt2, 4096, 1161399224);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public boolean an(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*  461 */     int i1 = paramInt3 + paramInt5 - 1;
/*  462 */     int i2 = paramInt4 + paramInt6 - 1;
/*  463 */     if ((paramInt1 >= paramInt3) && (paramInt1 <= i1) && (paramInt2 >= paramInt4) && (paramInt2 <= i2)) return true;
/*  464 */     if ((paramInt1 == paramInt3 - 1) && (paramInt2 >= paramInt4) && (paramInt2 <= i2) && (0 == (this.az[(paramInt1 - this.am * -1742571293)][(paramInt2 - -723140531 * this.ap)] & 0x8)) && (0 == (paramInt7 & 0x8))) return true;
/*  465 */     if ((paramInt1 == 1 + i1) && (paramInt2 >= paramInt4) && (paramInt2 <= i2) && (0 == (this.az[(paramInt1 - this.am * -1742571293)][(paramInt2 - -723140531 * this.ap)] & 0x80)) && (0 == (paramInt7 & 0x2))) return true;
/*  466 */     if ((paramInt2 == paramInt4 - 1) && (paramInt1 >= paramInt3) && (paramInt1 <= i1) && ((this.az[(paramInt1 - this.am * -1742571293)][(paramInt2 - -723140531 * this.ap)] & 0x2) == 0) && ((paramInt7 & 0x4) == 0)) return true;
/*  467 */     if ((1 + i2 == paramInt2) && (paramInt1 >= paramInt3) && (paramInt1 <= i1) && ((this.az[(paramInt1 - -1742571293 * this.am)][(paramInt2 - this.ap * -723140531)] & 0x20) == 0) && (0 == (paramInt7 & 0x1))) return true;
/*  468 */     return false;
/*      */   }
/*      */ 
/*      */   public void x(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
/*      */   {
/*  212 */     paramInt1 -= this.am * -1742571293;
/*  213 */     paramInt2 -= -723140531 * this.ap;
/*  214 */     if (paramInt3 == 0) {
/*  215 */       if (0 == paramInt4) {
/*  216 */         g(paramInt1, paramInt2, 128, 1090832664);
/*  217 */         g(paramInt1 - 1, paramInt2, 8, 156935557);
/*      */       }
/*  219 */       if (paramInt4 == 1) {
/*  220 */         g(paramInt1, paramInt2, 2, 600612648);
/*  221 */         g(paramInt1, 1 + paramInt2, 32, 1057260002);
/*      */       }
/*  223 */       if (paramInt4 == 2) {
/*  224 */         g(paramInt1, paramInt2, 8, -798091056);
/*  225 */         g(1 + paramInt1, paramInt2, 128, -909685642);
/*      */       }
/*  227 */       if (3 == paramInt4) {
/*  228 */         g(paramInt1, paramInt2, 32, 2048491596);
/*  229 */         g(paramInt1, paramInt2 - 1, 2, 793382376);
/*      */       }
/*      */     }
/*  232 */     if ((paramInt3 == 1) || (3 == paramInt3)) {
/*  233 */       if (paramInt4 == 0) {
/*  234 */         g(paramInt1, paramInt2, 1, 160473934);
/*  235 */         g(paramInt1 - 1, paramInt2 + 1, 16, -921320804);
/*      */       }
/*  237 */       if (paramInt4 == 1) {
/*  238 */         g(paramInt1, paramInt2, 4, 1589110478);
/*  239 */         g(paramInt1 + 1, paramInt2 + 1, 64, -155731522);
/*      */       }
/*  241 */       if (paramInt4 == 2) {
/*  242 */         g(paramInt1, paramInt2, 16, -76547878);
/*  243 */         g(paramInt1 + 1, paramInt2 - 1, 1, 1601455504);
/*      */       }
/*  245 */       if (3 == paramInt4) {
/*  246 */         g(paramInt1, paramInt2, 64, -292741228);
/*  247 */         g(paramInt1 - 1, paramInt2 - 1, 4, -418025124);
/*      */       }
/*      */     }
/*  250 */     if (paramInt3 == 2) {
/*  251 */       if (0 == paramInt4) {
/*  252 */         g(paramInt1, paramInt2, 130, 1263520782);
/*  253 */         g(paramInt1 - 1, paramInt2, 8, -369037934);
/*  254 */         g(paramInt1, 1 + paramInt2, 32, 1882866956);
/*      */       }
/*  256 */       if (1 == paramInt4) {
/*  257 */         g(paramInt1, paramInt2, 10, 1877078026);
/*  258 */         g(paramInt1, paramInt2 + 1, 32, 240297963);
/*  259 */         g(1 + paramInt1, paramInt2, 128, 663056491);
/*      */       }
/*  261 */       if (paramInt4 == 2) {
/*  262 */         g(paramInt1, paramInt2, 40, 741775890);
/*  263 */         g(paramInt1 + 1, paramInt2, 128, 1624607282);
/*  264 */         g(paramInt1, paramInt2 - 1, 2, 242796925);
/*      */       }
/*  266 */       if (3 == paramInt4) {
/*  267 */         g(paramInt1, paramInt2, 160, 683166265);
/*  268 */         g(paramInt1, paramInt2 - 1, 2, -305359436);
/*  269 */         g(paramInt1 - 1, paramInt2, 8, 1148028788);
/*      */       }
/*      */     }
/*  272 */     if (paramBoolean) {
/*  273 */       if (paramInt3 == 0) {
/*  274 */         if (paramInt4 == 0) {
/*  275 */           g(paramInt1, paramInt2, 65536, 1724840715);
/*  276 */           g(paramInt1 - 1, paramInt2, 4096, -196635271);
/*      */         }
/*  278 */         if (paramInt4 == 1) {
/*  279 */           g(paramInt1, paramInt2, 1024, 405787264);
/*  280 */           g(paramInt1, paramInt2 + 1, 16384, 1461402238);
/*      */         }
/*  282 */         if (2 == paramInt4) {
/*  283 */           g(paramInt1, paramInt2, 4096, 1463311459);
/*  284 */           g(paramInt1 + 1, paramInt2, 65536, 845794590);
/*      */         }
/*  286 */         if (3 == paramInt4) {
/*  287 */           g(paramInt1, paramInt2, 16384, 1292641129);
/*  288 */           g(paramInt1, paramInt2 - 1, 1024, 363365202);
/*      */         }
/*      */       }
/*  291 */       if ((1 == paramInt3) || (3 == paramInt3)) {
/*  292 */         if (paramInt4 == 0) {
/*  293 */           g(paramInt1, paramInt2, 512, -378852083);
/*  294 */           g(paramInt1 - 1, paramInt2 + 1, 8192, 1218115351);
/*      */         }
/*  296 */         if (1 == paramInt4) {
/*  297 */           g(paramInt1, paramInt2, 2048, 842600250);
/*  298 */           g(1 + paramInt1, paramInt2 + 1, 32768, 1877263786);
/*      */         }
/*  300 */         if (2 == paramInt4) {
/*  301 */           g(paramInt1, paramInt2, 8192, 945350317);
/*  302 */           g(paramInt1 + 1, paramInt2 - 1, 512, 1732683491);
/*      */         }
/*  304 */         if (3 == paramInt4) {
/*  305 */           g(paramInt1, paramInt2, 32768, 2077455528);
/*  306 */           g(paramInt1 - 1, paramInt2 - 1, 2048, 1934624121);
/*      */         }
/*      */       }
/*  309 */       if (2 == paramInt3) {
/*  310 */         if (paramInt4 == 0) {
/*  311 */           g(paramInt1, paramInt2, 66560, 1910979104);
/*  312 */           g(paramInt1 - 1, paramInt2, 4096, 1234995069);
/*  313 */           g(paramInt1, paramInt2 + 1, 16384, 2110403376);
/*      */         }
/*  315 */         if (paramInt4 == 1) {
/*  316 */           g(paramInt1, paramInt2, 5120, 112773635);
/*  317 */           g(paramInt1, 1 + paramInt2, 16384, 109003798);
/*  318 */           g(1 + paramInt1, paramInt2, 65536, 1782622658);
/*      */         }
/*  320 */         if (paramInt4 == 2) {
/*  321 */           g(paramInt1, paramInt2, 20480, 476544803);
/*  322 */           g(1 + paramInt1, paramInt2, 65536, 812920713);
/*  323 */           g(paramInt1, paramInt2 - 1, 1024, 816420633);
/*      */         }
/*  325 */         if (3 == paramInt4) {
/*  326 */           g(paramInt1, paramInt2, 81920, -84235109);
/*  327 */           g(paramInt1, paramInt2 - 1, 1024, -815648678);
/*  328 */           g(paramInt1 - 1, paramInt2, 4096, -792695875);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void q(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  358 */     paramInt1 -= this.am * -1742571293;
/*  359 */     paramInt2 -= this.ap * -723140531;
/*  360 */     this.az[paramInt1][paramInt2] &= -262145;
/*      */   }
/*      */ 
/*      */   public boolean av(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*      */   {
/*  427 */     if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4)) return true;
/*  428 */     paramInt1 -= this.am * -1742571293;
/*  429 */     paramInt2 -= this.ap * -723140531;
/*  430 */     paramInt3 -= -1742571293 * this.am;
/*  431 */     paramInt4 -= this.ap * -723140531;
/*  432 */     if ((paramInt5 == 6) || (7 == paramInt5)) {
/*  433 */       if (7 == paramInt5) paramInt6 = 2 + paramInt6 & 0x3;
/*  434 */       if (paramInt6 == 0) {
/*  435 */         if ((paramInt3 + 1 == paramInt1) && (paramInt4 == paramInt2) && (0 == (this.az[paramInt1][paramInt2] & 0x80))) return true;
/*  436 */         if ((paramInt1 == paramInt3) && (paramInt4 - 1 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x2) == 0)) return true;
/*      */       }
/*  438 */       else if (1 == paramInt6) {
/*  439 */         if ((paramInt3 - 1 == paramInt1) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x8) == 0)) return true;
/*  440 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 - 1) && (0 == (this.az[paramInt1][paramInt2] & 0x2))) return true;
/*      */       }
/*  442 */       else if (paramInt6 == 2) {
/*  443 */         if ((paramInt1 == paramInt3 - 1) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x8) == 0)) return true;
/*  444 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 + 1) && ((this.az[paramInt1][paramInt2] & 0x20) == 0)) return true;
/*      */       }
/*  446 */       else if (3 == paramInt6) {
/*  447 */         if ((paramInt1 == 1 + paramInt3) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x80) == 0)) return true;
/*  448 */         if ((paramInt3 == paramInt1) && (paramInt2 == 1 + paramInt4) && (0 == (this.az[paramInt1][paramInt2] & 0x20))) return true;
/*      */       }
/*      */     }
/*  451 */     if (paramInt5 == 8) {
/*  452 */       if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1) && ((this.az[paramInt1][paramInt2] & 0x20) == 0)) return true;
/*  453 */       if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 - 1) && (0 == (this.az[paramInt1][paramInt2] & 0x2))) return true;
/*  454 */       if ((paramInt3 - 1 == paramInt1) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x8) == 0)) return true;
/*  455 */       if ((paramInt1 == 1 + paramInt3) && (paramInt4 == paramInt2) && (0 == (this.az[paramInt1][paramInt2] & 0x80))) return true;
/*      */     }
/*  457 */     return false;
/*      */   }
/*      */ 
/*      */   public boolean s(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte paramByte)
/*      */   {
/*  427 */     if ((paramInt3 == paramInt1) && ((paramByte != 0) || (paramInt2 == paramInt4))) { if (paramByte != 0) throw new IllegalStateException(); return true; }
/*  428 */     paramInt1 -= this.am * -1742571293;
/*  429 */     paramInt2 -= this.ap * -723140531;
/*  430 */     paramInt3 -= -1742571293 * this.am;
/*  431 */     paramInt4 -= this.ap * -723140531;
/*  432 */     if (paramInt5 != 6) { if ((paramByte == 0) && (7 != paramInt5)) break label719; if (paramByte != 0) throw new IllegalStateException(); 
/*      */     }
/*  433 */     if (7 == paramInt5) { if (paramByte != 0) throw new IllegalStateException(); paramInt6 = 2 + paramInt6 & 0x3; }
/*  434 */     if (paramInt6 == 0) { if ((paramByte != 0) || 
/*  435 */         (paramInt3 + 1 == paramInt1)) { if (paramByte != 0) throw new IllegalStateException(); if ((paramInt4 == paramInt2) && ((paramByte != 0) || (0 == (this.az[paramInt1][paramInt2] & 0x80)))) { if (paramByte != 0) throw new IllegalStateException(); return true; } }
/*  436 */       if ((paramInt1 == paramInt3) && ((paramByte != 0) || (paramInt4 - 1 == paramInt2))) { if (paramByte != 0) throw new IllegalStateException(); if ((this.az[paramInt1][paramInt2] & 0x2) == 0) { if (paramByte != 0) throw new IllegalStateException(); return true; } }
/*      */     }
/*  438 */     else if (1 == paramInt6) { if (paramByte != 0) throw new IllegalStateException();
/*  439 */       if (paramInt3 - 1 == paramInt1) { if (paramByte != 0) throw new IllegalStateException(); if ((paramInt4 == paramInt2) && ((paramByte != 0) || ((this.az[paramInt1][paramInt2] & 0x8) == 0))) { if (paramByte != 0) throw new IllegalStateException(); return true; } }
/*  440 */       if (paramInt1 == paramInt3) { if (paramByte != 0) throw new IllegalStateException(); if ((paramInt2 == paramInt4 - 1) && ((paramByte != 0) || (0 == (this.az[paramInt1][paramInt2] & 0x2)))) { if (paramByte == 0);
/*  440 */           return true; } }
/*      */     }
/*  442 */     else if (paramInt6 == 2) { if ((paramByte != 0) || (
/*  443 */         (paramInt1 == paramInt3 - 1) && ((paramByte != 0) || ((paramInt4 == paramInt2) && ((paramByte != 0) || ((this.az[paramInt1][paramInt2] & 0x8) == 0)))))) { if (paramByte == 0);
/*  443 */         return true; }
/*  444 */       if ((paramInt3 == paramInt1) && ((paramByte != 0) || ((paramInt2 == paramInt4 + 1) && ((paramByte != 0) || ((this.az[paramInt1][paramInt2] & 0x20) == 0))))) { if (paramByte != 0) throw new IllegalStateException(); return true; }
/*      */     }
/*  446 */     else if (3 == paramInt6) { if ((paramByte != 0) || (
/*  447 */         (paramInt1 == 1 + paramInt3) && ((paramByte != 0) || (paramInt4 == paramInt2)))) { if (paramByte != 0) throw new IllegalStateException(); if ((this.az[paramInt1][paramInt2] & 0x80) == 0) { if (paramByte != 0) throw new IllegalStateException(); return true; } }
/*  448 */       if (paramInt3 == paramInt1) { if (paramByte != 0) throw new IllegalStateException(); if ((paramInt2 == 1 + paramInt4) && ((paramByte != 0) || (0 == (this.az[paramInt1][paramInt2] & 0x20)))) { if (paramByte != 0) throw new IllegalStateException(); return true; }
/*      */       }
/*      */     }
/*  451 */     label719: if (paramInt5 == 8) { if (paramByte != 0) throw new IllegalStateException();
/*  452 */       if (paramInt1 == paramInt3) { if (paramByte != 0) throw new IllegalStateException(); if ((paramInt2 == paramInt4 + 1) && ((paramByte != 0) || ((this.az[paramInt1][paramInt2] & 0x20) == 0))) { if (paramByte == 0);
/*  452 */           return true; } }
/*  453 */       if ((paramInt3 == paramInt1) && ((paramByte != 0) || ((paramInt2 == paramInt4 - 1) && ((paramByte != 0) || (0 == (this.az[paramInt1][paramInt2] & 0x2)))))) { if (paramByte == 0);
/*  453 */         return true; }
/*  454 */       if ((paramInt3 - 1 == paramInt1) && ((paramByte != 0) || (paramInt2 == paramInt4))) { if (paramByte != 0) throw new IllegalStateException(); if ((this.az[paramInt1][paramInt2] & 0x8) == 0) { if (paramByte == 0);
/*  454 */           return true; } }
/*  455 */       if ((paramInt1 == 1 + paramInt3) && ((paramByte != 0) || ((paramInt4 == paramInt2) && ((paramByte != 0) || (0 == (this.az[paramInt1][paramInt2] & 0x80)))))) { if (paramByte != 0) throw new IllegalStateException(); return true; }
/*      */     }
/*  457 */     return false;
/*      */   }
/*      */ 
/*      */   public boolean u(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
/*  461 */     int i1 = paramInt3 + paramInt5 - 1;
/*  462 */     int i2 = paramInt4 + paramInt6 - 1;
/*  463 */     if (paramInt1 >= paramInt3) { if (paramInt8 != 1044051391) throw new IllegalStateException(); if (paramInt1 <= i1) { if (paramInt8 != 1044051391) throw new IllegalStateException(); if ((paramInt2 >= paramInt4) && ((paramInt8 != 1044051391) || (paramInt2 <= i2))) { if (paramInt8 == 1044051391);
/*  463 */           return true; } } }
/*  464 */     if (paramInt1 == paramInt3 - 1) { if (paramInt8 != 1044051391) throw new IllegalStateException(); if ((paramInt2 >= paramInt4) && ((paramInt8 != 1044051391) || ((paramInt2 <= i2) && ((paramInt8 != 1044051391) || ((0 == (this.az[(paramInt1 - this.am * -1742571293)][(paramInt2 - -723140531 * this.ap)] & 0x8)) && ((paramInt8 != 1044051391) || (0 == (paramInt7 & 0x8)))))))) { if (paramInt8 != 1044051391) throw new IllegalStateException(); return true; } }
/*  465 */     if ((paramInt1 == 1 + i1) && ((paramInt8 != 1044051391) || (paramInt2 >= paramInt4))) { if (paramInt8 != 1044051391) throw new IllegalStateException(); if ((paramInt2 <= i2) && ((paramInt8 != 1044051391) || (0 == (this.az[(paramInt1 - this.am * -1742571293)][(paramInt2 - -723140531 * this.ap)] & 0x80)))) { if (paramInt8 != 1044051391) throw new IllegalStateException(); if (0 == (paramInt7 & 0x2)) { if (paramInt8 == 1044051391);
/*  465 */           return true; } } }
/*  466 */     if ((paramInt2 == paramInt4 - 1) && ((paramInt8 != 1044051391) || ((paramInt1 >= paramInt3) && ((paramInt8 != 1044051391) || ((paramInt1 <= i1) && ((paramInt8 != 1044051391) || ((this.az[(paramInt1 - this.am * -1742571293)][(paramInt2 - -723140531 * this.ap)] & 0x2) == 0))))))) { if (paramInt8 != 1044051391) throw new IllegalStateException(); if ((paramInt7 & 0x4) == 0) { if (paramInt8 == 1044051391);
/*  466 */         return true; } }
/*  467 */     if (1 + i2 == paramInt2) { if (paramInt8 != 1044051391) throw new IllegalStateException(); if (paramInt1 >= paramInt3) { if (paramInt8 != 1044051391) throw new IllegalStateException(); if (paramInt1 <= i1) { if (paramInt8 != 1044051391) throw new IllegalStateException(); if ((this.az[(paramInt1 - -1742571293 * this.am)][(paramInt2 - this.ap * -723140531)] & 0x20) == 0) { if (paramInt8 != 1044051391) throw new IllegalStateException(); if (0 == (paramInt7 & 0x1)) { if (paramInt8 != 1044051391) throw new IllegalStateException(); return true; } } } } }
/*  468 */     return false;
/*      */   }
/*      */ 
/*      */   public void v()
/*      */   {
/*   50 */     for (int i1 = 0; i1 < this.av * 915245941; i1++)
/*   51 */       for (int i2 = 0; i2 < this.ak * 920953833; i2++)
/*   52 */         if ((0 == i1) || (0 == i2) || (i1 >= this.av * 915245941 - 5) || (i2 >= 920953833 * this.ak - 5)) this.az[i1][i2] = 16777215; else
/*   53 */           this.az[i1][i2] = 16777216;
/*      */   }
/*      */ 
/*      */   public void w()
/*      */   {
/*   50 */     for (int i1 = 0; i1 < this.av * 915245941; i1++)
/*   51 */       for (int i2 = 0; i2 < this.ak * 920953833; i2++)
/*   52 */         if ((0 == i1) || (0 == i2) || (i1 >= this.av * 915245941 - 5) || (i2 >= 920953833 * this.ak - 5)) this.az[i1][i2] = 16777215; else
/*   53 */           this.az[i1][i2] = 16777216;
/*      */   }
/*      */ 
/*      */   public void e()
/*      */   {
/*   50 */     for (int i1 = 0; i1 < this.av * 915245941; i1++)
/*   51 */       for (int i2 = 0; i2 < this.ak * 920953833; i2++)
/*   52 */         if ((0 == i1) || (0 == i2) || (i1 >= this.av * 915245941 - 5) || (i2 >= 920953833 * this.ak - 5)) this.az[i1][i2] = 16777215; else
/*   53 */           this.az[i1][i2] = 16777216;
/*      */   }
/*      */ 
/*      */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
/*      */   {
/*   59 */     paramInt1 -= -1742571293 * this.am;
/*   60 */     paramInt2 -= this.ap * -723140531;
/*   61 */     if (paramInt3 == 0) {
/*   62 */       if (0 == paramInt4) {
/*   63 */         n(paramInt1, paramInt2, 128, -517229826);
/*   64 */         n(paramInt1 - 1, paramInt2, 8, -517229826);
/*      */       }
/*   66 */       if (paramInt4 == 1) {
/*   67 */         n(paramInt1, paramInt2, 2, -517229826);
/*   68 */         n(paramInt1, 1 + paramInt2, 32, -517229826);
/*      */       }
/*   70 */       if (paramInt4 == 2) {
/*   71 */         n(paramInt1, paramInt2, 8, -517229826);
/*   72 */         n(paramInt1 + 1, paramInt2, 128, -517229826);
/*      */       }
/*   74 */       if (paramInt4 == 3) {
/*   75 */         n(paramInt1, paramInt2, 32, -517229826);
/*   76 */         n(paramInt1, paramInt2 - 1, 2, -517229826);
/*      */       }
/*      */     }
/*   79 */     if ((1 == paramInt3) || (3 == paramInt3)) {
/*   80 */       if (paramInt4 == 0) {
/*   81 */         n(paramInt1, paramInt2, 1, -517229826);
/*   82 */         n(paramInt1 - 1, 1 + paramInt2, 16, -517229826);
/*      */       }
/*   84 */       if (1 == paramInt4) {
/*   85 */         n(paramInt1, paramInt2, 4, -517229826);
/*   86 */         n(paramInt1 + 1, 1 + paramInt2, 64, -517229826);
/*      */       }
/*   88 */       if (2 == paramInt4) {
/*   89 */         n(paramInt1, paramInt2, 16, -517229826);
/*   90 */         n(1 + paramInt1, paramInt2 - 1, 1, -517229826);
/*      */       }
/*   92 */       if (paramInt4 == 3) {
/*   93 */         n(paramInt1, paramInt2, 64, -517229826);
/*   94 */         n(paramInt1 - 1, paramInt2 - 1, 4, -517229826);
/*      */       }
/*      */     }
/*   97 */     if (paramInt3 == 2) {
/*   98 */       if (paramInt4 == 0) {
/*   99 */         n(paramInt1, paramInt2, 130, -517229826);
/*  100 */         n(paramInt1 - 1, paramInt2, 8, -517229826);
/*  101 */         n(paramInt1, 1 + paramInt2, 32, -517229826);
/*      */       }
/*  103 */       if (1 == paramInt4) {
/*  104 */         n(paramInt1, paramInt2, 10, -517229826);
/*  105 */         n(paramInt1, 1 + paramInt2, 32, -517229826);
/*  106 */         n(1 + paramInt1, paramInt2, 128, -517229826);
/*      */       }
/*  108 */       if (paramInt4 == 2) {
/*  109 */         n(paramInt1, paramInt2, 40, -517229826);
/*  110 */         n(paramInt1 + 1, paramInt2, 128, -517229826);
/*  111 */         n(paramInt1, paramInt2 - 1, 2, -517229826);
/*      */       }
/*  113 */       if (paramInt4 == 3) {
/*  114 */         n(paramInt1, paramInt2, 160, -517229826);
/*  115 */         n(paramInt1, paramInt2 - 1, 2, -517229826);
/*  116 */         n(paramInt1 - 1, paramInt2, 8, -517229826);
/*      */       }
/*      */     }
/*  119 */     if (paramBoolean) {
/*  120 */       if (0 == paramInt3) {
/*  121 */         if (paramInt4 == 0) {
/*  122 */           n(paramInt1, paramInt2, 65536, -517229826);
/*  123 */           n(paramInt1 - 1, paramInt2, 4096, -517229826);
/*      */         }
/*  125 */         if (1 == paramInt4) {
/*  126 */           n(paramInt1, paramInt2, 1024, -517229826);
/*  127 */           n(paramInt1, paramInt2 + 1, 16384, -517229826);
/*      */         }
/*  129 */         if (paramInt4 == 2) {
/*  130 */           n(paramInt1, paramInt2, 4096, -517229826);
/*  131 */           n(1 + paramInt1, paramInt2, 65536, -517229826);
/*      */         }
/*  133 */         if (paramInt4 == 3) {
/*  134 */           n(paramInt1, paramInt2, 16384, -517229826);
/*  135 */           n(paramInt1, paramInt2 - 1, 1024, -517229826);
/*      */         }
/*      */       }
/*  138 */       if ((1 == paramInt3) || (3 == paramInt3)) {
/*  139 */         if (0 == paramInt4) {
/*  140 */           n(paramInt1, paramInt2, 512, -517229826);
/*  141 */           n(paramInt1 - 1, paramInt2 + 1, 8192, -517229826);
/*      */         }
/*  143 */         if (paramInt4 == 1) {
/*  144 */           n(paramInt1, paramInt2, 2048, -517229826);
/*  145 */           n(1 + paramInt1, paramInt2 + 1, 32768, -517229826);
/*      */         }
/*  147 */         if (paramInt4 == 2) {
/*  148 */           n(paramInt1, paramInt2, 8192, -517229826);
/*  149 */           n(paramInt1 + 1, paramInt2 - 1, 512, -517229826);
/*      */         }
/*  151 */         if (3 == paramInt4) {
/*  152 */           n(paramInt1, paramInt2, 32768, -517229826);
/*  153 */           n(paramInt1 - 1, paramInt2 - 1, 2048, -517229826);
/*      */         }
/*      */       }
/*  156 */       if (2 == paramInt3) {
/*  157 */         if (0 == paramInt4) {
/*  158 */           n(paramInt1, paramInt2, 66560, -517229826);
/*  159 */           n(paramInt1 - 1, paramInt2, 4096, -517229826);
/*  160 */           n(paramInt1, 1 + paramInt2, 16384, -517229826);
/*      */         }
/*  162 */         if (paramInt4 == 1) {
/*  163 */           n(paramInt1, paramInt2, 5120, -517229826);
/*  164 */           n(paramInt1, 1 + paramInt2, 16384, -517229826);
/*  165 */           n(1 + paramInt1, paramInt2, 65536, -517229826);
/*      */         }
/*  167 */         if (2 == paramInt4) {
/*  168 */           n(paramInt1, paramInt2, 20480, -517229826);
/*  169 */           n(1 + paramInt1, paramInt2, 65536, -517229826);
/*  170 */           n(paramInt1, paramInt2 - 1, 1024, -517229826);
/*      */         }
/*  172 */         if (paramInt4 == 3) {
/*  173 */           n(paramInt1, paramInt2, 81920, -517229826);
/*  174 */           n(paramInt1, paramInt2 - 1, 1024, -517229826);
/*  175 */           n(paramInt1 - 1, paramInt2, 4096, -517229826);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void c(int paramInt1, int paramInt2, byte paramByte)
/*      */   {
/*  202 */     paramInt1 -= this.am * -1742571293;
/*  203 */     paramInt2 -= -723140531 * this.ap;
/*  204 */     this.az[paramInt1][paramInt2] |= 262144;
/*      */   }
/*      */ 
/*      */   void g(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  354 */     this.az[paramInt1][paramInt2] &= (paramInt3 ^ 0xFFFFFFFF);
/*      */   }
/*      */ 
/*      */   void o(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  208 */     this.az[paramInt1][paramInt2] |= paramInt3;
/*      */   }
/*      */ 
/*      */   public void k(int paramInt1, int paramInt2)
/*      */   {
/*  202 */     paramInt1 -= this.am * -1742571293;
/*  203 */     paramInt2 -= -723140531 * this.ap;
/*  204 */     this.az[paramInt1][paramInt2] |= 262144;
/*      */   }
/*      */ 
/*      */   public void z(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6)
/*      */   {
/*  335 */     int i1 = 256;
/*  336 */     if (paramBoolean) { if (paramInt6 > 1356567763);
/*  336 */       i1 += 131072; }
/*  337 */     paramInt1 -= -1742571293 * this.am;
/*  338 */     paramInt2 -= -723140531 * this.ap;
/*  339 */     if (1 != paramInt5) { if (paramInt6 <= 1356567763) return; if (paramInt5 != 3) break label87; if (paramInt6 <= 1356567763); }
/*  340 */     int i2 = paramInt3;
/*  341 */     paramInt3 = paramInt4;
/*  342 */     paramInt4 = i2;
/*      */ 
/*  344 */     label87: for (i2 = paramInt1; i2 < paramInt3 + paramInt1; i2++) { if (paramInt6 <= 1356567763) return;
/*  345 */       if (i2 >= 0) { if (paramInt6 <= 1356567763) return; if (i2 < 915245941 * this.av) { if (paramInt6 > 1356567763);
/*  346 */           for (int i3 = paramInt2; i3 < paramInt2 + paramInt4; i3++) { if (paramInt6 <= 1356567763) return;
/*  347 */             if ((i3 >= 0) && ((paramInt6 <= 1356567763) || (i3 < 920953833 * this.ak))) { if (paramInt6 <= 1356567763) throw new IllegalStateException(); g(i2, i3, i1, -58583849);
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   void a(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  208 */     this.az[paramInt1][paramInt2] |= paramInt3; } 
/*  208 */   void h(int paramInt1, int paramInt2, int paramInt3) { this.az[paramInt1][paramInt2] |= paramInt3; }
/*      */ 
/*      */ 
/*      */   public void p(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
/*      */   {
/*  335 */     int i1 = 256;
/*  336 */     if (paramBoolean) i1 += 131072;
/*  337 */     paramInt1 -= -1742571293 * this.am;
/*  338 */     paramInt2 -= -723140531 * this.ap;
/*  339 */     if ((1 == paramInt5) || (paramInt5 == 3)) {
/*  340 */       i2 = paramInt3;
/*  341 */       paramInt3 = paramInt4;
/*  342 */       paramInt4 = i2;
/*      */     }
/*  344 */     for (int i2 = paramInt1; i2 < paramInt3 + paramInt1; i2++)
/*  345 */       if ((i2 >= 0) && (i2 < 915245941 * this.av))
/*  346 */         for (int i3 = paramInt2; i3 < paramInt2 + paramInt4; i3++)
/*  347 */           if ((i3 >= 0) && (i3 < 920953833 * this.ak)) g(i2, i3, i1, 1071472489);
/*      */   }
/*      */ 
/*      */   public void t(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
/*      */   {
/*  182 */     int i1 = 256;
/*  183 */     if (paramBoolean) i1 += 131072;
/*  184 */     paramInt1 -= this.am * -1742571293;
/*  185 */     paramInt2 -= -723140531 * this.ap;
/*  186 */     for (int i2 = paramInt1; i2 < paramInt1 + paramInt3; i2++)
/*  187 */       if ((i2 >= 0) && (i2 < this.av * 915245941))
/*  188 */         for (int i3 = paramInt2; i3 < paramInt4 + paramInt2; i3++)
/*  189 */           if ((i3 >= 0) && (i3 < this.ak * 920953833)) n(i2, i3, i1, -517229826);
/*      */   }
/*      */ 
/*      */   public void ad(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
/*      */   {
/*  335 */     int i1 = 256;
/*  336 */     if (paramBoolean) i1 += 131072;
/*  337 */     paramInt1 -= -1742571293 * this.am;
/*  338 */     paramInt2 -= -723140531 * this.ap;
/*  339 */     if ((1 == paramInt5) || (paramInt5 == 3)) {
/*  340 */       i2 = paramInt3;
/*  341 */       paramInt3 = paramInt4;
/*  342 */       paramInt4 = i2;
/*      */     }
/*  344 */     for (int i2 = paramInt1; i2 < paramInt3 + paramInt1; i2++)
/*  345 */       if ((i2 >= 0) && (i2 < 915245941 * this.av))
/*  346 */         for (int i3 = paramInt2; i3 < paramInt2 + paramInt4; i3++)
/*  347 */           if ((i3 >= 0) && (i3 < 920953833 * this.ak)) g(i2, i3, i1, 1022296429);
/*      */   }
/*      */ 
/*      */   void ac(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  354 */     this.az[paramInt1][paramInt2] &= (paramInt3 ^ 0xFFFFFFFF); } 
/*  354 */   void aa(int paramInt1, int paramInt2, int paramInt3) { this.az[paramInt1][paramInt2] &= (paramInt3 ^ 0xFFFFFFFF); }
/*      */ 
/*      */ 
/*      */   public boolean as(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*      */   {
/*  364 */     if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4)) return true;
/*  365 */     paramInt1 -= -1742571293 * this.am;
/*  366 */     paramInt2 -= this.ap * -723140531;
/*  367 */     paramInt3 -= -1742571293 * this.am;
/*  368 */     paramInt4 -= this.ap * -723140531;
/*  369 */     if (paramInt5 == 0) {
/*  370 */       if (0 == paramInt6) {
/*  371 */         if ((paramInt3 - 1 == paramInt1) && (paramInt4 == paramInt2)) return true;
/*  372 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0120))) return true;
/*  373 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 - 1) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0102))) return true;
/*      */       }
/*  375 */       else if (1 == paramInt6) {
/*  376 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1)) return true;
/*  377 */         if ((paramInt1 == paramInt3 - 1) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x12C0108) == 0)) return true;
/*  378 */         if ((paramInt1 == 1 + paramInt3) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x12C0180) == 0)) return true;
/*      */       }
/*  380 */       else if (2 == paramInt6) {
/*  381 */         if ((paramInt3 + 1 == paramInt1) && (paramInt4 == paramInt2)) return true;
/*  382 */         if ((paramInt3 == paramInt1) && (paramInt4 + 1 == paramInt2) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0120))) return true;
/*  383 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 - 1) && ((this.az[paramInt1][paramInt2] & 0x12C0102) == 0)) return true;
/*      */       }
/*  385 */       else if (3 == paramInt6) {
/*  386 */         if ((paramInt1 == paramInt3) && (paramInt4 - 1 == paramInt2)) return true;
/*  387 */         if ((paramInt3 - 1 == paramInt1) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x12C0108) == 0)) return true;
/*  388 */         if ((1 + paramInt3 == paramInt1) && (paramInt2 == paramInt4) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0180))) return true;
/*      */       }
/*      */     }
/*  391 */     if (2 == paramInt5) {
/*  392 */       if (0 == paramInt6) {
/*  393 */         if ((paramInt1 == paramInt3 - 1) && (paramInt4 == paramInt2)) return true;
/*  394 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1)) return true;
/*  395 */         if ((paramInt3 + 1 == paramInt1) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x12C0180) == 0)) return true;
/*  396 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 - 1) && ((this.az[paramInt1][paramInt2] & 0x12C0102) == 0)) return true;
/*      */       }
/*  398 */       else if (1 == paramInt6) {
/*  399 */         if ((paramInt1 == paramInt3 - 1) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x12C0108) == 0)) return true;
/*  400 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 + 1)) return true;
/*  401 */         if ((paramInt3 + 1 == paramInt1) && (paramInt2 == paramInt4)) return true;
/*  402 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 - 1) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0102))) return true;
/*      */       }
/*  404 */       else if (2 == paramInt6) {
/*  405 */         if ((paramInt1 == paramInt3 - 1) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x12C0108) == 0)) return true;
/*  406 */         if ((paramInt3 == paramInt1) && (paramInt4 + 1 == paramInt2) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0120))) return true;
/*  407 */         if ((paramInt3 + 1 == paramInt1) && (paramInt4 == paramInt2)) return true;
/*  408 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 - 1)) return true;
/*      */       }
/*  410 */       else if (paramInt6 == 3) {
/*  411 */         if ((paramInt3 - 1 == paramInt1) && (paramInt4 == paramInt2)) return true;
/*  412 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0120))) return true;
/*  413 */         if ((paramInt1 == 1 + paramInt3) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x12C0180) == 0)) return true;
/*  414 */         if ((paramInt3 == paramInt1) && (paramInt4 - 1 == paramInt2)) return true;
/*      */       }
/*      */     }
/*  417 */     if (paramInt5 == 9) {
/*  418 */       if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1) && ((this.az[paramInt1][paramInt2] & 0x20) == 0)) return true;
/*  419 */       if ((paramInt1 == paramInt3) && (paramInt4 - 1 == paramInt2) && (0 == (this.az[paramInt1][paramInt2] & 0x2))) return true;
/*  420 */       if ((paramInt1 == paramInt3 - 1) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x8) == 0)) return true;
/*  421 */       if ((paramInt1 == 1 + paramInt3) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x80) == 0)) return true;
/*      */     }
/*  423 */     return false;
/*      */   }
/*      */ 
/*      */   public boolean am(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*      */   {
/*  364 */     if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4)) return true;
/*  365 */     paramInt1 -= -1742571293 * this.am;
/*  366 */     paramInt2 -= this.ap * -723140531;
/*  367 */     paramInt3 -= -1742571293 * this.am;
/*  368 */     paramInt4 -= this.ap * -723140531;
/*  369 */     if (paramInt5 == 0) {
/*  370 */       if (0 == paramInt6) {
/*  371 */         if ((paramInt3 - 1 == paramInt1) && (paramInt4 == paramInt2)) return true;
/*  372 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0120))) return true;
/*  373 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 - 1) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0102))) return true;
/*      */       }
/*  375 */       else if (1 == paramInt6) {
/*  376 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1)) return true;
/*  377 */         if ((paramInt1 == paramInt3 - 1) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x12C0108) == 0)) return true;
/*  378 */         if ((paramInt1 == 1 + paramInt3) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x12C0180) == 0)) return true;
/*      */       }
/*  380 */       else if (2 == paramInt6) {
/*  381 */         if ((paramInt3 + 1 == paramInt1) && (paramInt4 == paramInt2)) return true;
/*  382 */         if ((paramInt3 == paramInt1) && (paramInt4 + 1 == paramInt2) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0120))) return true;
/*  383 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 - 1) && ((this.az[paramInt1][paramInt2] & 0x12C0102) == 0)) return true;
/*      */       }
/*  385 */       else if (3 == paramInt6) {
/*  386 */         if ((paramInt1 == paramInt3) && (paramInt4 - 1 == paramInt2)) return true;
/*  387 */         if ((paramInt3 - 1 == paramInt1) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x12C0108) == 0)) return true;
/*  388 */         if ((1 + paramInt3 == paramInt1) && (paramInt2 == paramInt4) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0180))) return true;
/*      */       }
/*      */     }
/*  391 */     if (2 == paramInt5) {
/*  392 */       if (0 == paramInt6) {
/*  393 */         if ((paramInt1 == paramInt3 - 1) && (paramInt4 == paramInt2)) return true;
/*  394 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1)) return true;
/*  395 */         if ((paramInt3 + 1 == paramInt1) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x12C0180) == 0)) return true;
/*  396 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 - 1) && ((this.az[paramInt1][paramInt2] & 0x12C0102) == 0)) return true;
/*      */       }
/*  398 */       else if (1 == paramInt6) {
/*  399 */         if ((paramInt1 == paramInt3 - 1) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x12C0108) == 0)) return true;
/*  400 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 + 1)) return true;
/*  401 */         if ((paramInt3 + 1 == paramInt1) && (paramInt2 == paramInt4)) return true;
/*  402 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 - 1) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0102))) return true;
/*      */       }
/*  404 */       else if (2 == paramInt6) {
/*  405 */         if ((paramInt1 == paramInt3 - 1) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x12C0108) == 0)) return true;
/*  406 */         if ((paramInt3 == paramInt1) && (paramInt4 + 1 == paramInt2) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0120))) return true;
/*  407 */         if ((paramInt3 + 1 == paramInt1) && (paramInt4 == paramInt2)) return true;
/*  408 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 - 1)) return true;
/*      */       }
/*  410 */       else if (paramInt6 == 3) {
/*  411 */         if ((paramInt3 - 1 == paramInt1) && (paramInt4 == paramInt2)) return true;
/*  412 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0120))) return true;
/*  413 */         if ((paramInt1 == 1 + paramInt3) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x12C0180) == 0)) return true;
/*  414 */         if ((paramInt3 == paramInt1) && (paramInt4 - 1 == paramInt2)) return true;
/*      */       }
/*      */     }
/*  417 */     if (paramInt5 == 9) {
/*  418 */       if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1) && ((this.az[paramInt1][paramInt2] & 0x20) == 0)) return true;
/*  419 */       if ((paramInt1 == paramInt3) && (paramInt4 - 1 == paramInt2) && (0 == (this.az[paramInt1][paramInt2] & 0x2))) return true;
/*  420 */       if ((paramInt1 == paramInt3 - 1) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x8) == 0)) return true;
/*  421 */       if ((paramInt1 == 1 + paramInt3) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x80) == 0)) return true;
/*      */     }
/*  423 */     return false;
/*      */   }
/*      */ 
/*      */   public boolean ap(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*      */   {
/*  364 */     if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4)) return true;
/*  365 */     paramInt1 -= -1742571293 * this.am;
/*  366 */     paramInt2 -= this.ap * -723140531;
/*  367 */     paramInt3 -= -1742571293 * this.am;
/*  368 */     paramInt4 -= this.ap * -723140531;
/*  369 */     if (paramInt5 == 0) {
/*  370 */       if (0 == paramInt6) {
/*  371 */         if ((paramInt3 - 1 == paramInt1) && (paramInt4 == paramInt2)) return true;
/*  372 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0120))) return true;
/*  373 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 - 1) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0102))) return true;
/*      */       }
/*  375 */       else if (1 == paramInt6) {
/*  376 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1)) return true;
/*  377 */         if ((paramInt1 == paramInt3 - 1) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x12C0108) == 0)) return true;
/*  378 */         if ((paramInt1 == 1 + paramInt3) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x12C0180) == 0)) return true;
/*      */       }
/*  380 */       else if (2 == paramInt6) {
/*  381 */         if ((paramInt3 + 1 == paramInt1) && (paramInt4 == paramInt2)) return true;
/*  382 */         if ((paramInt3 == paramInt1) && (paramInt4 + 1 == paramInt2) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0120))) return true;
/*  383 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 - 1) && ((this.az[paramInt1][paramInt2] & 0x12C0102) == 0)) return true;
/*      */       }
/*  385 */       else if (3 == paramInt6) {
/*  386 */         if ((paramInt1 == paramInt3) && (paramInt4 - 1 == paramInt2)) return true;
/*  387 */         if ((paramInt3 - 1 == paramInt1) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x12C0108) == 0)) return true;
/*  388 */         if ((1 + paramInt3 == paramInt1) && (paramInt2 == paramInt4) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0180))) return true;
/*      */       }
/*      */     }
/*  391 */     if (2 == paramInt5) {
/*  392 */       if (0 == paramInt6) {
/*  393 */         if ((paramInt1 == paramInt3 - 1) && (paramInt4 == paramInt2)) return true;
/*  394 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1)) return true;
/*  395 */         if ((paramInt3 + 1 == paramInt1) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x12C0180) == 0)) return true;
/*  396 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 - 1) && ((this.az[paramInt1][paramInt2] & 0x12C0102) == 0)) return true;
/*      */       }
/*  398 */       else if (1 == paramInt6) {
/*  399 */         if ((paramInt1 == paramInt3 - 1) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x12C0108) == 0)) return true;
/*  400 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 + 1)) return true;
/*  401 */         if ((paramInt3 + 1 == paramInt1) && (paramInt2 == paramInt4)) return true;
/*  402 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 - 1) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0102))) return true;
/*      */       }
/*  404 */       else if (2 == paramInt6) {
/*  405 */         if ((paramInt1 == paramInt3 - 1) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x12C0108) == 0)) return true;
/*  406 */         if ((paramInt3 == paramInt1) && (paramInt4 + 1 == paramInt2) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0120))) return true;
/*  407 */         if ((paramInt3 + 1 == paramInt1) && (paramInt4 == paramInt2)) return true;
/*  408 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 - 1)) return true;
/*      */       }
/*  410 */       else if (paramInt6 == 3) {
/*  411 */         if ((paramInt3 - 1 == paramInt1) && (paramInt4 == paramInt2)) return true;
/*  412 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1) && (0 == (this.az[paramInt1][paramInt2] & 0x12C0120))) return true;
/*  413 */         if ((paramInt1 == 1 + paramInt3) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x12C0180) == 0)) return true;
/*  414 */         if ((paramInt3 == paramInt1) && (paramInt4 - 1 == paramInt2)) return true;
/*      */       }
/*      */     }
/*  417 */     if (paramInt5 == 9) {
/*  418 */       if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1) && ((this.az[paramInt1][paramInt2] & 0x20) == 0)) return true;
/*  419 */       if ((paramInt1 == paramInt3) && (paramInt4 - 1 == paramInt2) && (0 == (this.az[paramInt1][paramInt2] & 0x2))) return true;
/*  420 */       if ((paramInt1 == paramInt3 - 1) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x8) == 0)) return true;
/*  421 */       if ((paramInt1 == 1 + paramInt3) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x80) == 0)) return true;
/*      */     }
/*  423 */     return false;
/*      */   }
/*      */ 
/*      */   public void y(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
/*      */   {
/*  182 */     int i1 = 256;
/*  183 */     if (paramBoolean) i1 += 131072;
/*  184 */     paramInt1 -= this.am * -1742571293;
/*  185 */     paramInt2 -= -723140531 * this.ap;
/*  186 */     for (int i2 = paramInt1; i2 < paramInt1 + paramInt3; i2++)
/*  187 */       if ((i2 >= 0) && (i2 < this.av * 915245941))
/*  188 */         for (int i3 = paramInt2; i3 < paramInt4 + paramInt2; i3++)
/*  189 */           if ((i3 >= 0) && (i3 < this.ak * 920953833)) n(i2, i3, i1, -517229826);
/*      */   }
/*      */ 
/*      */   public boolean ak(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*      */   {
/*  427 */     if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4)) return true;
/*  428 */     paramInt1 -= this.am * -1742571293;
/*  429 */     paramInt2 -= this.ap * -723140531;
/*  430 */     paramInt3 -= -1742571293 * this.am;
/*  431 */     paramInt4 -= this.ap * -723140531;
/*  432 */     if ((paramInt5 == 6) || (7 == paramInt5)) {
/*  433 */       if (7 == paramInt5) paramInt6 = 2 + paramInt6 & 0x3;
/*  434 */       if (paramInt6 == 0) {
/*  435 */         if ((paramInt3 + 1 == paramInt1) && (paramInt4 == paramInt2) && (0 == (this.az[paramInt1][paramInt2] & 0x80))) return true;
/*  436 */         if ((paramInt1 == paramInt3) && (paramInt4 - 1 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x2) == 0)) return true;
/*      */       }
/*  438 */       else if (1 == paramInt6) {
/*  439 */         if ((paramInt3 - 1 == paramInt1) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x8) == 0)) return true;
/*  440 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 - 1) && (0 == (this.az[paramInt1][paramInt2] & 0x2))) return true;
/*      */       }
/*  442 */       else if (paramInt6 == 2) {
/*  443 */         if ((paramInt1 == paramInt3 - 1) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x8) == 0)) return true;
/*  444 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 + 1) && ((this.az[paramInt1][paramInt2] & 0x20) == 0)) return true;
/*      */       }
/*  446 */       else if (3 == paramInt6) {
/*  447 */         if ((paramInt1 == 1 + paramInt3) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x80) == 0)) return true;
/*  448 */         if ((paramInt3 == paramInt1) && (paramInt2 == 1 + paramInt4) && (0 == (this.az[paramInt1][paramInt2] & 0x20))) return true;
/*      */       }
/*      */     }
/*  451 */     if (paramInt5 == 8) {
/*  452 */       if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1) && ((this.az[paramInt1][paramInt2] & 0x20) == 0)) return true;
/*  453 */       if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 - 1) && (0 == (this.az[paramInt1][paramInt2] & 0x2))) return true;
/*  454 */       if ((paramInt3 - 1 == paramInt1) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x8) == 0)) return true;
/*  455 */       if ((paramInt1 == 1 + paramInt3) && (paramInt4 == paramInt2) && (0 == (this.az[paramInt1][paramInt2] & 0x80))) return true;
/*      */     }
/*  457 */     return false;
/*      */   }
/*      */ 
/*      */   public ck(int paramInt1, int paramInt2)
/*      */   {
/*   41 */     this.am = 0;
/*   42 */     this.ap = 0;
/*   43 */     this.av = (paramInt1 * -1104368419);
/*   44 */     this.ak = (paramInt2 * 622617689);
/*   45 */     this.az = new int[915245941 * this.av][this.ak * 920953833];
/*   46 */     r(434153417);
/*      */   }
/*      */ 
/*      */   public boolean az(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*      */   {
/*  427 */     if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4)) return true;
/*  428 */     paramInt1 -= this.am * -1742571293;
/*  429 */     paramInt2 -= this.ap * -723140531;
/*  430 */     paramInt3 -= -1742571293 * this.am;
/*  431 */     paramInt4 -= this.ap * -723140531;
/*  432 */     if ((paramInt5 == 6) || (7 == paramInt5)) {
/*  433 */       if (7 == paramInt5) paramInt6 = 2 + paramInt6 & 0x3;
/*  434 */       if (paramInt6 == 0) {
/*  435 */         if ((paramInt3 + 1 == paramInt1) && (paramInt4 == paramInt2) && (0 == (this.az[paramInt1][paramInt2] & 0x80))) return true;
/*  436 */         if ((paramInt1 == paramInt3) && (paramInt4 - 1 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x2) == 0)) return true;
/*      */       }
/*  438 */       else if (1 == paramInt6) {
/*  439 */         if ((paramInt3 - 1 == paramInt1) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x8) == 0)) return true;
/*  440 */         if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 - 1) && (0 == (this.az[paramInt1][paramInt2] & 0x2))) return true;
/*      */       }
/*  442 */       else if (paramInt6 == 2) {
/*  443 */         if ((paramInt1 == paramInt3 - 1) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x8) == 0)) return true;
/*  444 */         if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 + 1) && ((this.az[paramInt1][paramInt2] & 0x20) == 0)) return true;
/*      */       }
/*  446 */       else if (3 == paramInt6) {
/*  447 */         if ((paramInt1 == 1 + paramInt3) && (paramInt4 == paramInt2) && ((this.az[paramInt1][paramInt2] & 0x80) == 0)) return true;
/*  448 */         if ((paramInt3 == paramInt1) && (paramInt2 == 1 + paramInt4) && (0 == (this.az[paramInt1][paramInt2] & 0x20))) return true;
/*      */       }
/*      */     }
/*  451 */     if (paramInt5 == 8) {
/*  452 */       if ((paramInt1 == paramInt3) && (paramInt2 == paramInt4 + 1) && ((this.az[paramInt1][paramInt2] & 0x20) == 0)) return true;
/*  453 */       if ((paramInt3 == paramInt1) && (paramInt2 == paramInt4 - 1) && (0 == (this.az[paramInt1][paramInt2] & 0x2))) return true;
/*  454 */       if ((paramInt3 - 1 == paramInt1) && (paramInt2 == paramInt4) && ((this.az[paramInt1][paramInt2] & 0x8) == 0)) return true;
/*  455 */       if ((paramInt1 == 1 + paramInt3) && (paramInt4 == paramInt2) && (0 == (this.az[paramInt1][paramInt2] & 0x80))) return true;
/*      */     }
/*  457 */     return false;
/*      */   }
/*      */ 
/*      */   public static byte[] m(CharSequence paramCharSequence, int paramInt)
/*      */   {
/*   66 */     int i1 = paramCharSequence.length();
/*   67 */     byte[] arrayOfByte = new byte[i1];
/*   68 */     for (int i2 = 0; i2 < i1; i2++) { if (paramInt != -846367360) throw new IllegalStateException();
/*   69 */       int i3 = paramCharSequence.charAt(i2);
/*   70 */       if (i3 > 0) { if ((paramInt == -846367360) && (i3 < 128)) break label124; if (paramInt != -846367360) throw new IllegalStateException();  } if (i3 >= 160) { if (paramInt != -846367360) throw new IllegalStateException(); if (i3 <= 255) { if (paramInt == -846367360);
/*   70 */           label124: arrayOfByte[i2] = ((byte)i3); continue; } }
/*   71 */       if (8364 == i3) { if (paramInt == -846367360);
/*   71 */         arrayOfByte[i2] = -128;
/*   72 */       } else if (i3 == 8218) { if (paramInt == -846367360);
/*   72 */         arrayOfByte[i2] = -126;
/*   73 */       } else if (i3 == 402) { if (paramInt == -846367360);
/*   73 */         arrayOfByte[i2] = -125;
/*   74 */       } else if (i3 == 8222) { if (paramInt != -846367360) throw new IllegalStateException(); arrayOfByte[i2] = -124;
/*   75 */       } else if (i3 == 8230) { if (paramInt != -846367360) throw new IllegalStateException(); arrayOfByte[i2] = -123;
/*   76 */       } else if (8224 == i3) { if (paramInt != -846367360) throw new IllegalStateException(); arrayOfByte[i2] = -122;
/*   77 */       } else if (8225 == i3) { if (paramInt == -846367360);
/*   77 */         arrayOfByte[i2] = -121;
/*   78 */       } else if (710 == i3) { if (paramInt != -846367360) throw new IllegalStateException(); arrayOfByte[i2] = -120;
/*   79 */       } else if (8240 == i3) { if (paramInt == -846367360);
/*   79 */         arrayOfByte[i2] = -119;
/*   80 */       } else if (i3 == 352) { if (paramInt != -846367360) throw new IllegalStateException(); arrayOfByte[i2] = -118;
/*   81 */       } else if (8249 == i3) { if (paramInt != -846367360) throw new IllegalStateException(); arrayOfByte[i2] = -117;
/*   82 */       } else if (i3 == 338) { if (paramInt != -846367360) throw new IllegalStateException(); arrayOfByte[i2] = -116;
/*   83 */       } else if (i3 == 381) { if (paramInt == -846367360);
/*   83 */         arrayOfByte[i2] = -114;
/*   84 */       } else if (i3 == 8216) { if (paramInt == -846367360);
/*   84 */         arrayOfByte[i2] = -111;
/*   85 */       } else if (i3 == 8217) { if (paramInt != -846367360) throw new IllegalStateException(); arrayOfByte[i2] = -110;
/*   86 */       } else if (8220 == i3) { if (paramInt != -846367360) throw new IllegalStateException(); arrayOfByte[i2] = -109;
/*   87 */       } else if (8221 == i3) { if (paramInt == -846367360);
/*   87 */         arrayOfByte[i2] = -108;
/*   88 */       } else if (i3 == 8226) { if (paramInt == -846367360);
/*   88 */         arrayOfByte[i2] = -107;
/*   89 */       } else if (i3 == 8211) { if (paramInt == -846367360);
/*   89 */         arrayOfByte[i2] = -106;
/*   90 */       } else if (8212 == i3) { if (paramInt == -846367360);
/*   90 */         arrayOfByte[i2] = -105;
/*   91 */       } else if (732 == i3) { if (paramInt == -846367360);
/*   91 */         arrayOfByte[i2] = -104;
/*   92 */       } else if (i3 == 8482) { if (paramInt == -846367360);
/*   92 */         arrayOfByte[i2] = -103;
/*   93 */       } else if (i3 == 353) { if (paramInt == -846367360);
/*   93 */         arrayOfByte[i2] = -102;
/*   94 */       } else if (i3 == 8250) { if (paramInt == -846367360);
/*   94 */         arrayOfByte[i2] = -101;
/*   95 */       } else if (i3 == 339) { if (paramInt == -846367360);
/*   95 */         arrayOfByte[i2] = -100;
/*   96 */       } else if (i3 == 382) { if (paramInt == -846367360);
/*   96 */         arrayOfByte[i2] = -98;
/*   97 */       } else if (i3 == 376) { if (paramInt != -846367360) throw new IllegalStateException(); arrayOfByte[i2] = -97; } else {
/*   98 */         arrayOfByte[i2] = 63;
/*      */       } }
/*  100 */     return arrayOfByte;
/*      */   }
/*      */ 
/*      */   static void ds(int paramInt, byte paramByte)
/*      */   {
/* 4415 */     if (paramInt == -1) { if (paramByte != -117) return; if (!client.nq) { if (paramByte == -117);
/* 4416 */         bc.m((byte)-67); break label120; }
/*      */     }
/* 4418 */     if (-1 != paramInt) { if (paramByte != -117) return; if (paramInt != client.nn * 313565793) { if (paramByte != -117) return; if ((0 != client.nl * -1987080889) && ((paramByte != -117) || (!client.nq))) { if (paramByte == -117);
/* 4419 */           q.c(2, bb.cr, paramInt, 0, client.nl * -1987080889, false, -892724720); } }
/*      */     }
/* 4421 */     label120: client.nn = 41386401 * paramInt;
/*      */   }
/*      */ 
/*      */   static final String fk(int paramInt1, int paramInt2)
/*      */   {
/* 8702 */     if (paramInt1 < 999999999) { if (paramInt2 < 938090829);
/* 8702 */       return Integer.toString(paramInt1); }
/* 8703 */     return "*";
/*      */   }
/*      */ 
/*      */   public static int j(CharSequence paramCharSequence, int paramInt)
/*      */   {
/*  144 */     int i1 = paramCharSequence.length();
/*  145 */     int i2 = 0;
/*  146 */     for (int i3 = 0; i3 < i1; i3++) { if (paramInt != -196293817) throw new IllegalStateException(); i2 = (i2 << 5) - i2 + bl.r(paramCharSequence.charAt(i3), 2046169597); }
/*  147 */     return i2;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ck
 * JD-Core Version:    0.6.2
 */