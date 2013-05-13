/*      */ import java.util.zip.Inflater;
/*      */ 
/*      */ public class bf
/*      */ {
/*      */   Inflater r;
/*      */   public static fm s;
/*      */   static fq[] fq;
/*      */ 
/*      */   public void m(ev paramev, byte[] paramArrayOfByte)
/*      */   {
/*   16 */     if ((paramev.m[(paramev.c * -196293817)] != 31) || (-117 != paramev.m[(1 + paramev.c * -196293817)])) throw new RuntimeException("");
/*   17 */     if (null == this.r) this.r = new Inflater(true); try
/*      */     {
/*   19 */       this.r.setInput(paramev.m, -196293817 * paramev.c + 10, paramev.m.length - (8 + (paramev.c * -196293817 + 10)));
/*   20 */       this.r.inflate(paramArrayOfByte);
/*      */     }
/*      */     catch (Exception localException) {
/*   23 */       this.r.reset();
/*   24 */       throw new RuntimeException("");
/*      */     }
/*   26 */     this.r.reset();
/*      */   }
/*      */ 
/*      */   bf(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void r(ev paramev, byte[] paramArrayOfByte, byte paramByte)
/*      */   {
/*   16 */     if (paramev.m[(paramev.c * -196293817)] == 31) { if ((paramByte == 0) && (-117 == paramev.m[(1 + paramev.c * -196293817)])) break label60; if (paramByte != 0) return;  } throw new RuntimeException("");
/*   17 */     label60: if (null == this.r) { if (paramByte == 0);
/*   17 */       this.r = new Inflater(true); }
/*      */     try {
/*   19 */       this.r.setInput(paramev.m, -196293817 * paramev.c + 10, paramev.m.length - (8 + (paramev.c * -196293817 + 10)));
/*   20 */       this.r.inflate(paramArrayOfByte);
/*      */     }
/*      */     catch (Exception localException) {
/*   23 */       this.r.reset();
/*   24 */       throw new RuntimeException("");
/*      */     }
/*   26 */     this.r.reset();
/*      */   }
/*      */ 
/*      */   public void d(ev paramev, byte[] paramArrayOfByte)
/*      */   {
/*   16 */     if ((paramev.m[(paramev.c * -196293817)] != 31) || (-117 != paramev.m[(1 + paramev.c * -196293817)])) throw new RuntimeException("");
/*   17 */     if (null == this.r) this.r = new Inflater(true); try
/*      */     {
/*   19 */       this.r.setInput(paramev.m, -196293817 * paramev.c + 10, paramev.m.length - (8 + (paramev.c * -196293817 + 10)));
/*   20 */       this.r.inflate(paramArrayOfByte);
/*      */     }
/*      */     catch (Exception localException) {
/*   23 */       this.r.reset();
/*   24 */       throw new RuntimeException("");
/*      */     }
/*   26 */     this.r.reset();
/*      */   }
/*      */ 
/*      */   public void l(ev paramev, byte[] paramArrayOfByte)
/*      */   {
/*   16 */     if ((paramev.m[(paramev.c * -196293817)] != 31) || (-117 != paramev.m[(1 + paramev.c * -196293817)])) throw new RuntimeException("");
/*   17 */     if (null == this.r) this.r = new Inflater(true); try
/*      */     {
/*   19 */       this.r.setInput(paramev.m, -196293817 * paramev.c + 10, paramev.m.length - (8 + (paramev.c * -196293817 + 10)));
/*   20 */       this.r.inflate(paramArrayOfByte);
/*      */     }
/*      */     catch (Exception localException) {
/*   23 */       this.r.reset();
/*   24 */       throw new RuntimeException("");
/*      */     }
/*   26 */     this.r.reset();
/*      */   }
/*      */ 
/*      */   public bf()
/*      */   {
/*   10 */     this(-1, 1000000, 1000000);
/*      */   }
/*      */ 
/*      */   public static int r(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte paramByte)
/*      */   {
/*    9 */     if (1 == (paramInt6 & 0x1)) { if (paramByte == 0) throw new IllegalStateException();
/*   10 */       int i = paramInt4;
/*   11 */       paramInt4 = paramInt5;
/*   12 */       paramInt5 = i;
/*      */     }
/*   14 */     paramInt3 &= 3;
/*   15 */     if (paramInt3 == 0) { if (paramByte == 0) throw new IllegalStateException(); return paramInt1; }
/*   16 */     if (paramInt3 == 1) { if (paramByte != 0);
/*   16 */       return paramInt2; }
/*   17 */     if (paramInt3 == 2) { if (paramByte != 0);
/*   17 */       return 7 - paramInt1 - (paramInt4 - 1); }
/*   18 */     return 7 - paramInt2 - (paramInt5 - 1);
/*      */   }
/*      */ 
/*      */   static void dk(int paramInt1, int paramInt2)
/*      */   {
/* 4278 */     if (-3 == paramInt1) { if (paramInt2 == 579085449) throw new IllegalStateException(); em.c(ba.az, ba.an, ba.ah, 920312672);
/* 4279 */     } else if (-2 == paramInt1) { if (paramInt2 != 579085449);
/* 4279 */       em.c(ba.ay, ba.al, ba.ab, 404778636);
/* 4280 */     } else if (paramInt1 == -1) { if (paramInt2 != 579085449);
/* 4280 */       em.c(ba.ao, ba.ag, ba.ar, 2120987084);
/* 4281 */     } else if (paramInt1 == 3) { if (paramInt2 == 579085449) throw new IllegalStateException(); em.c(ba.aq, ba.at, ba.ae, -1954780326);
/* 4282 */     } else if (4 == paramInt1) { if (paramInt2 == 579085449) return; em.c(ba.au, ba.ax, ba.ai, -1716394017);
/* 4283 */     } else if (paramInt1 == 5) { if (paramInt2 != 579085449);
/* 4283 */       em.c(ba.aj, ba.aw, ba.af, 883425387);
/* 4284 */     } else if (6 == paramInt1) { if (paramInt2 == 579085449) return; em.c(ba.bh, ba.bi, ba.bs, 1502222524);
/* 4285 */     } else if (paramInt1 == 7) { if (paramInt2 == 579085449) return; em.c(ba.bk, ba.bv, ba.bg, 1815887866);
/* 4286 */     } else if (paramInt1 == 8) { if (paramInt2 == 579085449) return; em.c(ba.bl, ba.bt, ba.bw, 825293575);
/* 4287 */     } else if (9 == paramInt1) { if (paramInt2 == 579085449) throw new IllegalStateException(); em.c(ba.by, ba.bx, ba.bf, 405824645);
/* 4288 */     } else if (paramInt1 == 10) { if (paramInt2 == 579085449) throw new IllegalStateException(); em.c(ba.bu, ba.bo, ba.bq, -621511764);
/* 4289 */     } else if (11 == paramInt1) { if (paramInt2 != 579085449);
/* 4289 */       em.c(ba.bj, ba.bz, ba.bm, 1904865309);
/* 4290 */     } else if (12 == paramInt1) { if (paramInt2 != 579085449);
/* 4290 */       em.c(ba.bn, ba.be, ba.bp, 1286190521);
/* 4291 */     } else if (13 == paramInt1) { if (paramInt2 == 579085449) return; em.c(ba.ba, ba.bc, ba.br, 309162174);
/* 4292 */     } else if (14 == paramInt1) { if (paramInt2 == 579085449) throw new IllegalStateException(); em.c(ba.bb, ba.bd, ba.cr, 37263143);
/* 4293 */     } else if (paramInt1 == 16) { if (paramInt2 != 579085449);
/* 4293 */       em.c(ba.cs, ba.cj, ba.cl, 198523282);
/* 4294 */     } else if (paramInt1 == 17) { if (paramInt2 == 579085449) throw new IllegalStateException(); em.c(ba.cp, ba.ca, ba.co, -959774038);
/* 4295 */     } else if (paramInt1 == 18) { if (paramInt2 == 579085449) throw new IllegalStateException(); em.c(ba.ch, ba.cu, ba.cc, 792224077);
/* 4296 */     } else if (19 == paramInt1) { if (paramInt2 == 579085449) throw new IllegalStateException(); em.c(ba.cm, ba.cw, ba.cz, 238698118);
/* 4297 */     } else if (20 == paramInt1) { if (paramInt2 == 579085449) return; em.c(ba.cv, ba.ct, ba.ck, -792636041);
/* 4298 */     } else if (22 == paramInt1) { if (paramInt2 != 579085449);
/* 4298 */       em.c(ba.cy, ba.cq, ba.cd, 1026719835);
/* 4299 */     } else if (paramInt1 == 23) { if (paramInt2 != 579085449);
/* 4299 */       em.c(ba.cx, ba.cn, ba.ce, 1868059322);
/* 4300 */     } else if (paramInt1 == 24) { if (paramInt2 == 579085449) throw new IllegalStateException(); em.c(ba.ci, ba.cb, ba.cf, 1546741237);
/* 4301 */     } else if (paramInt1 == 25) { if (paramInt2 == 579085449) return; em.c(ba.cg, ba.dd, ba.dg, -1648684486);
/* 4302 */     } else if (paramInt1 == 26) { if (paramInt2 == 579085449) throw new IllegalStateException(); em.c(ba.df, ba.dk, ba.dz, -587125986);
/* 4303 */     } else if (paramInt1 == 27) { if (paramInt2 == 579085449) return; em.c(ba.da, ba.dj, ba.dv, 1075837916);
/* 4304 */     } else if (paramInt1 == 31) { if (paramInt2 == 579085449) throw new IllegalStateException(); em.c(ba.db, ba.dq, ba.dr, 1621060718);
/* 4305 */     } else if (paramInt1 == 32) { if (paramInt2 == 579085449) throw new IllegalStateException(); em.c(ba.du, ba.dy, ba.de, 158870939);
/* 4306 */     } else if (37 == paramInt1) { if (paramInt2 == 579085449) return; em.c(ba.dw, ba.dl, ba.dn, -1449441513);
/* 4307 */     } else if (paramInt1 == 38) { if (paramInt2 != 579085449);
/* 4307 */       em.c(ba.do, ba.dx, ba.dt, -1085757481);
/* 4308 */     } else if (55 == paramInt1) { if (paramInt2 == 579085449) return; em.c(ba.eb, ba.er, ba.es, -907827781); } else {
/* 4309 */       em.c(ba.ez, ba.ev, ba.ei, 541585063);
/* 4310 */     }aj.ce(10, 1345644183);
/*      */   }
/*      */ 
/*      */   static final void dt(int paramInt)
/*      */   {
/* 5019 */     fn localfn = (fn)client.ip.j();
/* 5020 */     while (localfn != null) { if ((paramInt >= -206739299) || 
/* 5021 */         (localfn.q * -183532247 == al.in * 409487383)) { if ((paramInt < -206739299) && (!localfn.e)) break label81; if (paramInt >= -206739299) throw new IllegalStateException();  } localfn.r(); break label188;
/* 5022 */       label81: if (client.au * 1513618129 >= localfn.g * -1572805485) { if (paramInt >= -206739299) return;
/* 5023 */         localfn.b(120898863 * client.fv, 1646787400);
/* 5024 */         if (localfn.e) { if (paramInt >= -206739299) return; localfn.r(); } else {
/* 5025 */           cr.eg.s(-183532247 * localfn.q, 496267181 * localfn.i, localfn.s * 653420253, localfn.z * -1145432419, 60, localfn, 0, -1, false);
/*      */         } }
/* 5027 */       label188: localfn = (fn)client.ip.g();
/*      */     }
/*      */   }
/*      */ 
/*      */   public static ec g(int paramInt, byte paramByte)
/*      */   {
/*   25 */     ec localec = (ec)ec.j.r(paramInt);
/*   26 */     if (null != localec) { if (paramByte < 126);
/*   26 */       return localec; }
/*   27 */     byte[] arrayOfByte = ec.n.l(1, paramInt, 2027519942);
/*   28 */     localec = new ec();
/*   29 */     if (null != arrayOfByte) { if (paramByte >= 126) throw new IllegalStateException(); localec.i(new ev(arrayOfByte), paramInt, -1935155179); }
/*   30 */     localec.q(-1779725463);
/*   31 */     ec.j.l(localec, paramInt);
/*   32 */     return localec;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     bf
 * JD-Core Version:    0.6.2
 */