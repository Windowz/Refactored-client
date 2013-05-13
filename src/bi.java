/*      */ public class bi
/*      */   implements aw
/*      */ {
/*      */   ch j;
/*      */   int l;
/*   11 */   int m = 0;
/*      */   er[] r;
/*   12 */   double c = 1.0D;
/*   13 */   int n = 2063568000;
/*      */ 
/*    9 */   cg d = new cg();
/*      */ 
/*      */   public int d(int paramInt1, int paramInt2)
/*      */   {
/*   60 */     if (null != this.r[paramInt1]) { if (paramInt2 >= -2117795425) throw new IllegalStateException(); return this.r[paramInt1].z; }
/*   61 */     return 0;
/*      */   }
/*      */ 
/*      */   public void v(int paramInt)
/*      */   {
/*   73 */     for (int i = 0; i < this.r.length; i++) if ((paramInt >= 302573493) || 
/*   74 */         (null != this.r[i])) { if (paramInt >= 302573493) return; this.r[i].n();
/*      */       }
/*   76 */     this.d = new cg();
/*   77 */     this.m = (-1114410233 * this.l);
/*      */   }
/*      */ 
/*      */   public int[] c(int paramInt)
/*      */   {
/*   37 */     er localer1 = this.r[paramInt];
/*   38 */     if (null != localer1) {
/*   39 */       if (null != localer1.e) {
/*   40 */         this.d.l(localer1);
/*   41 */         localer1.b = true;
/*   42 */         return localer1.e;
/*      */       }
/*   44 */       boolean bool = localer1.c(this.c, this.n * 1626402089, this.j);
/*   45 */       if (bool) {
/*   46 */         if (this.m * 1117803517 == 0) {
/*   47 */           er localer2 = (er)this.d.n();
/*   48 */           localer2.n();
/*      */         } else {
/*   50 */           this.m -= 693805397;
/*   51 */         }this.d.l(localer1);
/*   52 */         localer1.b = true;
/*   53 */         return localer1.e;
/*      */       }
/*      */     }
/*   56 */     return null;
/*      */   }
/*      */ 
/*      */   public int j(int paramInt) {
/*   60 */     if (null != this.r[paramInt]) return this.r[paramInt].z;
/*   61 */     return 0;
/*      */   }
/*      */ 
/*      */   public boolean l(int paramInt1, int paramInt2) {
/*   65 */     return this.r[paramInt1].g;
/*      */   }
/*      */ 
/*      */   public boolean m(int paramInt1, int paramInt2) {
/*   69 */     if (paramInt2 > 1119430845);
/*   69 */     return 1626402089 * this.n == 64;
/*      */   }
/*      */ 
/*      */   public void k(int paramInt)
/*      */   {
/*   81 */     for (int i = 0; i < this.r.length; i++) {
/*   82 */       er localer = this.r[i];
/*   83 */       if ((null != localer) && (localer.v != 0) && (localer.b)) {
/*   84 */         localer.j(paramInt);
/*   85 */         localer.b = false;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void w(int paramInt1, int paramInt2)
/*      */   {
/*   81 */     for (int i = 0; i < this.r.length; i++) { if (paramInt2 != -920961594);
/*   82 */       er localer = this.r[i];
/*   83 */       if ((null != localer) && ((paramInt2 == -920961594) || (localer.v != 0))) { if (paramInt2 == -920961594) throw new IllegalStateException(); if (localer.b) { if (paramInt2 != -920961594);
/*   84 */           localer.j(paramInt1);
/*   85 */           localer.b = false;
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public bi(ch paramch1, ch paramch2, int paramInt1, double paramDouble, int paramInt2)
/*      */   {
/*   17 */     this.j = paramch2;
/*   18 */     this.l = (-305781309 * paramInt1);
/*   19 */     this.m = (this.l * -1114410233);
/*   20 */     this.c = paramDouble;
/*   21 */     this.n = (paramInt2 * 1962278681);
/*   22 */     int[] arrayOfInt = paramch1.s(0, 1139278315);
/*   23 */     int i = arrayOfInt.length;
/*   24 */     this.r = new er[paramch1.u(0, (short)-28070)];
/*   25 */     for (int k = 0; k < i; k++) {
/*   26 */       ev localev = new ev(paramch1.l(0, arrayOfInt[k], 1901235235));
/*   27 */       this.r[arrayOfInt[k]] = new er(localev);
/*      */     }
/*      */   }
/*      */ 
/*      */   public int n(int paramInt)
/*      */   {
/*   60 */     if (null != this.r[paramInt]) return this.r[paramInt].z;
/*   61 */     return 0;
/*      */   }
/*      */ 
/*      */   public int[] r(int paramInt1, int paramInt2)
/*      */   {
/*   37 */     er localer1 = this.r[paramInt1];
/*   38 */     if (null != localer1) { if ((paramInt2 != -112476939) || 
/*   39 */         (null != localer1.e)) { if (paramInt2 != -112476939) throw new IllegalStateException();
/*   40 */         this.d.l(localer1);
/*   41 */         localer1.b = true;
/*   42 */         return localer1.e;
/*      */       }
/*   44 */       boolean bool = localer1.c(this.c, this.n * 1626402089, this.j);
/*   45 */       if (bool) { if (paramInt2 != -112476939) throw new IllegalStateException();
/*   46 */         if (this.m * 1117803517 == 0) { if (paramInt2 == -112476939);
/*   47 */           er localer2 = (er)this.d.n();
/*   48 */           localer2.n();
/*      */         } else {
/*   50 */           this.m -= 693805397;
/*   51 */         }this.d.l(localer1);
/*   52 */         localer1.b = true;
/*   53 */         return localer1.e;
/*      */       }
/*      */     }
/*   56 */     return null;
/*      */   }
/*      */ 
/*      */   public boolean z(int paramInt)
/*      */   {
/*   65 */     return this.r[paramInt].g; } 
/*   65 */   public boolean g(int paramInt) { return this.r[paramInt].g; } 
/*   65 */   public boolean q(int paramInt) { return this.r[paramInt].g; }
/*      */ 
/*      */   public boolean i(int paramInt)
/*      */   {
/*   69 */     return 1626402089 * this.n == 64; } 
/*   69 */   public boolean s(int paramInt) { return 1626402089 * this.n == 64; }
/*      */ 
/*      */ 
/*      */   public void e(double paramDouble)
/*      */   {
/*   32 */     this.c = paramDouble;
/*   33 */     v(-152920975);
/*      */   }
/*      */ 
/*      */   public void b(double paramDouble)
/*      */   {
/*   32 */     this.c = paramDouble;
/*   33 */     v(-1449648697);
/*      */   }
/*      */ 
/*      */   public void y()
/*      */   {
/*   73 */     for (int i = 0; i < this.r.length; i++) {
/*   74 */       if (null != this.r[i]) this.r[i].n();
/*      */     }
/*   76 */     this.d = new cg();
/*   77 */     this.m = (-1114410233 * this.l);
/*      */   }
/*      */ 
/*      */   public void t()
/*      */   {
/*   73 */     for (int i = 0; i < this.r.length; i++) {
/*   74 */       if (null != this.r[i]) this.r[i].n();
/*      */     }
/*   76 */     this.d = new cg();
/*   77 */     this.m = (-1114410233 * this.l);
/*      */   }
/*      */ 
/*      */   public void f()
/*      */   {
/*   73 */     for (int i = 0; i < this.r.length; i++) {
/*   74 */       if (null != this.r[i]) this.r[i].n();
/*      */     }
/*   76 */     this.d = new cg();
/*   77 */     this.m = (-1114410233 * this.l);
/*      */   }
/*      */ 
/*      */   public void u(double paramDouble)
/*      */   {
/*   32 */     this.c = paramDouble;
/*   33 */     v(-347201404);
/*      */   }
/*      */ 
/*      */   static final void g(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, aq paramaq, ck paramck, int paramInt7)
/*      */   {
/*  308 */     if (client.ao) { if (paramInt7 == 332462707) return;
/*  309 */       if ((l.d[0][paramInt2][paramInt3] & 0x2) == 0) { if (paramInt7 == 332462707) throw new IllegalStateException();
/*  310 */         if ((l.d[paramInt1][paramInt2][paramInt3] & 0x10) != 0) { if (paramInt7 != 332462707);
/*      */           return;
/*      */         }
/*  313 */         int i;
/*  313 */         if (0 != (l.d[paramInt1][paramInt2][paramInt3] & 0x8)) { if (paramInt7 == 332462707) return;
/*  314 */           i = 0;
/*      */         }
/*  317 */         else if ((paramInt1 > 0) && ((paramInt7 == 332462707) || ((l.d[1][paramInt2][paramInt3] & 0x2) != 0))) { if (paramInt7 == 332462707) throw new IllegalStateException();
/*  318 */           i = paramInt1 - 1;
/*      */         } else
/*      */         {
/*  321 */           i = paramInt1;
/*      */         }
/*  323 */         if (1943405583 * client.dl != i) { if (paramInt7 != 332462707);
/*  323 */           return; }
/*      */       }
/*      */     }
/*  326 */     if (paramInt1 < 295866421 * l.l) { if (paramInt7 == 332462707) throw new IllegalStateException(); l.l = 1992835613 * paramInt1; }
/*  327 */     ey localey = fj.g(paramInt4, (byte)100);
/*      */ 
/*  330 */     if (paramInt5 != 1) { if (paramInt7 == 332462707) throw new IllegalStateException(); if (paramInt5 != 3) break label280; if (paramInt7 == 332462707) throw new IllegalStateException(); 
/*      */     }
/*  331 */     int k = localey.a * -1137199387;
/*  332 */     int i1 = 533735227 * localey.o; break label300;
/*      */ 
/*  335 */     label280: k = localey.o * 533735227;
/*  336 */     i1 = localey.a * -1137199387;
/*      */     label300: int i2;
/*      */     int i3;
/*  342 */     if (k + paramInt2 <= 104) { if (paramInt7 == 332462707) throw new IllegalStateException();
/*  343 */       i2 = paramInt2 + (k >> 1);
/*  344 */       i3 = (k + 1 >> 1) + paramInt2;
/*      */     } else
/*      */     {
/*  347 */       i2 = paramInt2;
/*  348 */       i3 = paramInt2 + 1;
/*      */     }
/*  350 */     int i4;
/*      */     int i5;
/*  350 */     if (i1 + paramInt3 <= 104) { if (paramInt7 == 332462707) throw new IllegalStateException();
/*  351 */       i4 = paramInt3 + (i1 >> 1);
/*  352 */       i5 = (i1 + 1 >> 1) + paramInt3;
/*      */     } else
/*      */     {
/*  355 */       i4 = paramInt3;
/*  356 */       i5 = paramInt3 + 1;
/*      */     }
/*  358 */     int[][] arrayOfInt = l.r[paramInt1];
/*  359 */     int i6 = arrayOfInt[i3][i5] + (arrayOfInt[i2][i4] + arrayOfInt[i3][i4] + arrayOfInt[i2][i5]) >> 2;
/*  360 */     int i7 = (k << 6) + (paramInt2 << 7);
/*  361 */     int i8 = (paramInt3 << 7) + (i1 << 6);
/*  362 */     i9 = 1073741824 + ((paramInt4 << 14) + ((paramInt3 << 7) + paramInt2));
/*  363 */     if (-192937193 * localey.p == 0) { if (paramInt7 == 332462707) throw new IllegalStateException(); i9 -= -2147483648; }
/*  364 */     i10 = paramInt6 + (paramInt5 << 6);
/*  365 */     if (1 == localey.ax * 1419733885) { if (paramInt7 == 332462707) return; i10 += 256; }
/*  366 */     if (localey.k((byte)-82)) { if (paramInt7 != 332462707);
/*  366 */       bs.j(paramInt1, paramInt2, paramInt3, localey, paramInt5, (byte)86);
/*      */     }
/*  367 */     Object localObject;
/*  367 */     if (paramInt6 == 22) { if (paramInt7 == 332462707) throw new IllegalStateException();
/*  368 */       if (client.ao) { if (paramInt7 == 332462707) throw new IllegalStateException(); if ((0 == -192937193 * localey.p) && ((paramInt7 == 332462707) || ((1 != -1013851739 * localey.h) && ((paramInt7 == 332462707) || (!localey.ae))))) { if (paramInt7 == 332462707) return; return; }
/*      */       }
/*  370 */       if ((-1 == localey.as * -183942983) && ((paramInt7 == 332462707) || (null == localey.ai))) { if (paramInt7 == 332462707) throw new IllegalStateException(); localObject = localey.w(22, paramInt5, arrayOfInt, i7, i6, i8, 1040991188); } else {
/*  371 */         localObject = new ff(paramInt4, 22, paramInt5, paramInt1, paramInt2, paramInt3, localey.as * -183942983, true, null);
/*  372 */       }paramaq.j(paramInt1, paramInt2, paramInt3, i6, (fu)localObject, i9, i10);
/*  373 */       if (1 == localey.h * -1013851739) { if (paramInt7 == 332462707) return; if (paramck != null) { if (paramInt7 == 332462707) throw new IllegalStateException(); paramck.c(paramInt2, paramInt3, (byte)102); } }
/*  374 */       return;
/*      */     }
/*  376 */     if (10 != paramInt6) { if (paramInt7 == 332462707) return; if (11 != paramInt6) break label1286; if (paramInt7 == 332462707);
/*      */     }
/*  378 */     if ((localey.as * -183942983 == -1) && ((paramInt7 == 332462707) || (null == localey.ai))) { if (paramInt7 == 332462707) return; localObject = localey.w(10, paramInt5, arrayOfInt, i7, i6, i8, 2080308042); } else {
/*  379 */       localObject = new ff(paramInt4, 10, paramInt5, paramInt1, paramInt2, paramInt3, -183942983 * localey.as, true, null);
/*  380 */     }if (localObject != null) if ((paramInt7 == 332462707) || 
/*  381 */         (paramInt6 == 11)) tmpTernaryOp = 256;
/*      */   }
/*      */ 
/*      */   public static fq z(int paramInt)
/*      */   {
/*  169 */     fq localfq = new fq();
/*  170 */     localfq.y = (716105887 * al.d);
/*  171 */     localfq.t = (1425919147 * al.l);
/*  172 */     localfq.e = al.m[0];
/*  173 */     localfq.b = al.c[0];
/*  174 */     localfq.v = m.n[0];
/*  175 */     localfq.w = cl.j[0];
/*  176 */     int i = localfq.w * localfq.v;
/*  177 */     byte[] arrayOfByte = bp.g[0];
/*  178 */     localfq.u = new int[i];
/*  179 */     for (int k = 0; k < i; k++) { if (paramInt >= 1621920765) throw new IllegalStateException(); localfq.u[k] = al.z[(arrayOfByte[k] & 0xFF)];
/*      */     }
/*  181 */     al.m = null;
/*  182 */     al.c = null;
/*  183 */     m.n = null;
/*  184 */     cl.j = null;
/*  185 */     al.z = null;
/*  186 */     bp.g = (byte[][])null;
/*      */ 
/*  188 */     return localfq;
/*      */   }
/*      */ 
/*      */   static fr y(int paramInt, byte paramByte)
/*      */   {
/*  187 */     Object localObject = (fr)eo.q.r(paramInt);
/*  188 */     if (null != localObject) { if (paramByte == 81);
/*  188 */       return localObject;
/*      */     }
/*  190 */     ch localch1 = ag.j;
/*  191 */     ch localch2 = eo.z;
/*      */ 
/*  193 */     int i = 1;
/*  194 */     int[] arrayOfInt = localch1.s(paramInt, 1549525451);
/*  195 */     for (int k = 0; k < arrayOfInt.length; k++) { if (paramByte != 81) throw new IllegalStateException();
/*  196 */       byte[] arrayOfByte1 = localch1.g(paramInt, arrayOfInt[k], -216187524);
/*  197 */       if (null == arrayOfByte1) { if (paramByte != 81) throw new IllegalStateException();
/*  198 */         i = 0;
/*      */       } else
/*      */       {
/*  201 */         int i1 = (arrayOfByte1[0] & 0xFF) << 8 | arrayOfByte1[1] & 0xFF;
/*      */ 
/*  204 */         byte[] arrayOfByte2 = localch2.g(i1, 0, 180984554);
/*  205 */         if (null == arrayOfByte2) { if (paramByte == 81);
/*  205 */           i = 0;
/*      */         }
/*      */       }
/*      */     }
/*  207 */     fr localfr;
/*  207 */     if (i == 0) { if (paramByte != 81) throw new IllegalStateException();
/*  208 */       localfr = null;
/*      */     } else
/*      */     {
/*      */       try {
/*  212 */         localfr = new fr(localch1, localch2, paramInt, false);
/*      */       }
/*      */       catch (Exception localException) {
/*  215 */         localfr = null;
/*      */       }
/*      */     }
/*  218 */     localObject = localfr;
/*  219 */     if (null != localObject) { if (paramByte != 81) throw new IllegalStateException(); eo.q.l((en)localObject, paramInt); }
/*  220 */     return localObject;
/*      */   }
/*      */ 
/*      */   static boolean gx(String paramString, int paramInt)
/*      */   {
/* 9606 */     if (paramString == null) { if (paramInt >= 1041476423) throw new IllegalStateException(); return false; }
/* 9607 */     for (int i = 0; i < 1704207791 * client.pr; i++) { if (paramInt >= 1041476423) throw new IllegalStateException();
/* 9608 */       m localm = client.pe[i];
/* 9609 */       if (paramString.equalsIgnoreCase(localm.r)) { if (paramInt >= 1041476423) throw new IllegalStateException(); return true; }
/* 9610 */       if (paramString.equalsIgnoreCase(localm.d)) { if (paramInt < 1041476423);
/* 9610 */         return true; }
/*      */     }
/* 9612 */     return false;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     bi
 * JD-Core Version:    0.6.2
 */