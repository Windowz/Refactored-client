/*      */ public class ez extends dg
/*      */ {
/*      */   int[][] j;
/*      */   int c;
/*      */   int[] n;
/*      */   int m;
/*      */   public static String o;
/*      */   static ft[] fy;
/*      */   static fq[] fk;
/*      */ 
/*      */   ez(int paramInt, byte[] paramArrayOfByte)
/*      */   {
/*   13 */     this.m = (paramInt * -1175527493);
/*   14 */     ev localev = new ev(paramArrayOfByte);
/*   15 */     this.c = (localev.t(1118814123) * 1260613035);
/*   16 */     this.n = new int[this.c * 724837635];
/*   17 */     this.j = new int[this.c * 724837635][];
/*   18 */     for (int i = 0; i < 724837635 * this.c; i++) this.n[i] = localev.t(1118814123);
/*   19 */     for (i = 0; i < 724837635 * this.c; i++) this.j[i] = new int[localev.t(1118814123)];
/*   20 */     for (i = 0; i < 724837635 * this.c; i++)
/*   21 */       for (int k = 0; k < this.j[i].length; k++) this.j[i][k] = localev.t(1118814123);
/*      */   }
/*      */ 
/*      */   static final void dm(byte paramByte)
/*      */   {
/* 4514 */     int i = 64 + be.ox * -1547008640;
/* 4515 */     int k = 64 + br.om * -1899358848;
/* 4516 */     int i1 = bw.ev(i, k, 409487383 * al.in, -879540595) - dq.oq * 1146276341;
/* 4517 */     if (1778771857 * ct.gw < i) { if (paramByte >= 0) throw new IllegalStateException();
/* 4518 */       ct.gw += -373442191 * (1948288849 * du.oh + 2071227499 * co.op * (i - ct.gw * 1778771857) / 1000);
/* 4519 */       if (ct.gw * 1778771857 > i) { if (paramByte < 0);
/* 4519 */         ct.gw = i * -373442191; }
/*      */     }
/* 4521 */     if (1778771857 * ct.gw > i) { if (paramByte >= 0) throw new IllegalStateException();
/* 4522 */       ct.gw -= -373442191 * (1948288849 * du.oh + 2071227499 * co.op * (1778771857 * ct.gw - i) / 1000);
/* 4523 */       if (1778771857 * ct.gw < i) { if (paramByte < 0);
/* 4523 */         ct.gw = i * -373442191; }
/*      */     }
/* 4525 */     if (-2117795425 * bv.gn < i1) { if (paramByte >= 0) throw new IllegalStateException();
/* 4526 */       bv.gn += (du.oh * 1948288849 + (i1 - bv.gn * -2117795425) * (2071227499 * co.op) / 1000) * 714988127;
/* 4527 */       if (-2117795425 * bv.gn > i1) { if (paramByte >= 0) throw new IllegalStateException(); bv.gn = 714988127 * i1; }
/*      */     }
/* 4529 */     if (-2117795425 * bv.gn > i1) { if (paramByte < 0);
/* 4530 */       bv.gn -= 714988127 * (2071227499 * co.op * (bv.gn * -2117795425 - i1) / 1000 + du.oh * 1948288849);
/* 4531 */       if (-2117795425 * bv.gn < i1) { if (paramByte < 0);
/* 4531 */         bv.gn = i1 * 714988127; }
/*      */     }
/* 4533 */     if (y.gj * 1226331393 < k) { if (paramByte >= 0) return;
/* 4534 */       y.gj += (du.oh * 1948288849 + co.op * 2071227499 * (k - y.gj * 1226331393) / 1000) * -702502143;
/* 4535 */       if (y.gj * 1226331393 > k) { if (paramByte < 0);
/* 4535 */         y.gj = k * -702502143; }
/*      */     }
/* 4537 */     if (y.gj * 1226331393 > k) { if (paramByte < 0);
/* 4538 */       y.gj -= -702502143 * (du.oh * 1948288849 + 2071227499 * co.op * (1226331393 * y.gj - k) / 1000);
/* 4539 */       if (y.gj * 1226331393 < k) { if (paramByte >= 0) return; y.gj = k * -702502143; }
/*      */     }
/* 4541 */     i = ct.or * -39282304 + 64;
/* 4542 */     k = 64 + bp.og * 718237568;
/* 4543 */     i1 = bw.ev(i, k, al.in * 409487383, -1209451842) - -456743929 * cq.ob;
/* 4544 */     int i2 = i - ct.gw * 1778771857;
/* 4545 */     int i3 = i1 - bv.gn * -2117795425;
/* 4546 */     int i4 = k - y.gj * 1226331393;
/* 4547 */     int i5 = (int)Math.sqrt(i2 * i2 + i4 * i4);
/* 4548 */     int i6 = (int)(Math.atan2(i3, i5) * 325.94900000000001D) & 0x7FF;
/* 4549 */     int i7 = (int)(Math.atan2(i2, i4) * -325.94900000000001D) & 0x7FF;
/* 4550 */     if (i6 < 128) { if (paramByte >= 0) return; i6 = 128; }
/* 4551 */     if (i6 > 383) { if (paramByte >= 0) return; i6 = 383; }
/* 4552 */     if (bb.gk * 375042907 < i6) { if (paramByte < 0);
/* 4553 */       bb.gk += -940686125 * (de.oy * 1602313803 + df.ou * -228008219 * (i6 - bb.gk * 375042907) / 1000);
/* 4554 */       if (bb.gk * 375042907 > i6) { if (paramByte < 0);
/* 4554 */         bb.gk = -940686125 * i6; }
/*      */     }
/* 4556 */     if (bb.gk * 375042907 > i6) { if (paramByte >= 0) return;
/* 4557 */       bb.gk -= (de.oy * 1602313803 + -228008219 * df.ou * (375042907 * bb.gk - i6) / 1000) * -940686125;
/* 4558 */       if (bb.gk * 375042907 < i6) { if (paramByte < 0);
/* 4558 */         bb.gk = i6 * -940686125; }
/*      */     }
/* 4560 */     int i8 = i7 - -909703631 * bs.gx;
/* 4561 */     if (i8 > 1024) { if (paramByte < 0);
/* 4561 */       i8 -= 2048; }
/* 4562 */     if (i8 < -1024) { if (paramByte >= 0) throw new IllegalStateException(); i8 += 2048; }
/* 4563 */     if (i8 > 0) { if (paramByte >= 0) return;
/* 4564 */       bs.gx += -407072047 * (1602313803 * de.oy + i8 * (df.ou * -228008219) / 1000);
/* 4565 */       bs.gx = (-909703631 * bs.gx & 0x7FF) * -407072047;
/*      */     }
/* 4567 */     if (i8 < 0) { if (paramByte >= 0) throw new IllegalStateException();
/* 4568 */       bs.gx -= (de.oy * 1602313803 + -i8 * (-228008219 * df.ou) / 1000) * -407072047;
/* 4569 */       bs.gx = -407072047 * (bs.gx * -909703631 & 0x7FF);
/*      */     }
/* 4571 */     int i9 = i7 - bs.gx * -909703631;
/* 4572 */     if (i9 > 1024) { if (paramByte >= 0) return; i9 -= 2048; }
/* 4573 */     if (i9 < -1024) { if (paramByte >= 0) throw new IllegalStateException(); i9 += 2048; }
/* 4574 */     if (i9 < 0) { if (paramByte >= 0) return; if (i8 > 0) break label1155; if (paramByte >= 0) return;  } if (i9 > 0) { if (paramByte >= 0) throw new IllegalStateException(); if (i8 < 0) { if (paramByte < 0);
/* 4574 */         label1155: bs.gx = i7 * -407072047;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static String fu(String paramString, eg parameg, short paramShort)
/*      */   {
/* 8635 */     if (paramString.indexOf("%") != -1) { if (paramShort != 255);
/* 8636 */       for (int i = 1; i <= 5; i++) { if (paramShort != 255);
/*      */         while (true) {
/* 8638 */           int k = paramString.indexOf("%" + i);
/* 8639 */           if (k == -1) { if (paramShort == 255) throw new IllegalStateException(); break; }
/* 8640 */           paramString = paramString.substring(0, k) + ck.fk(ba.fq(parameg, i - 1, (byte)0), -1020193009) + paramString.substring(k + 2);
/*      */         } }
/*      */       while (true)
/*      */       {
/* 8644 */         i = paramString.indexOf("%dns");
/* 8645 */         if (-1 == i) { if (paramShort == 255) throw new IllegalStateException(); break; }
/* 8646 */         String str = "";
/* 8647 */         if (g.bu != null) { if (paramShort == 255) throw new IllegalStateException();
/* 8648 */           str = ek.r(g.bu.j, (byte)-34);
/* 8649 */           if (null != g.bu.g) { if (paramShort != 255);
/* 8650 */             str = (String)g.bu.g;
/*      */           }
/*      */         }
/* 8653 */         paramString = paramString.substring(0, i) + str + paramString.substring(i + 4);
/*      */       }
/*      */     }
/* 8656 */     return paramString;
/*      */   }
/*      */ 
/*      */   public static fg g(int paramInt1, int paramInt2)
/*      */   {
/*   23 */     fg localfg = (fg)fg.z.r(paramInt1);
/*   24 */     if (localfg != null) { if (paramInt2 == -200732336) throw new IllegalStateException(); return localfg; }
/*   25 */     byte[] arrayOfByte = al.n.l(16, paramInt1, 1063436725);
/*   26 */     localfg = new fg();
/*   27 */     if (arrayOfByte != null) { if (paramInt2 == -200732336) throw new IllegalStateException(); localfg.q(new ev(arrayOfByte), -1399233070); }
/*   28 */     fg.z.l(localfg, paramInt1);
/*   29 */     return localfg;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ez
 * JD-Core Version:    0.6.2
 */