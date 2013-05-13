/*      */ import java.awt.Canvas;
/*      */ import java.awt.Graphics;
/*      */ 
/*      */ public class ej extends dg
/*      */ {
/*      */   int y;
/*      */   ef c;
/*      */   int i;
/*      */   int t;
/*      */   int z;
/*      */   int g;
/*      */   int q;
/*      */   int e;
/*      */   int s;
/*      */   int u;
/*      */   int v;
/*      */   int w;
/*      */   cr j;
/*      */   int b;
/*      */   eq n;
/*      */   int m;
/*      */   int f;
/*      */   int k;
/*      */   et o;
/*      */   int a;
/*      */   static final int h = 1048576;
/*      */   int x;
/*      */   static fq[] fh;
/*      */   static byte[][] ej;
/*      */   static ft[] fn;
/*      */ 
/*      */   void c(byte paramByte)
/*      */   {
/*   34 */     this.c = null;
/*   35 */     this.n = null;
/*   36 */     this.j = null;
/*   37 */     this.o = null;
/*      */   }
/*      */ 
/*      */   static final void ee(int paramInt)
/*      */   {
/* 6071 */     client.ij = 0;
/* 6072 */     client.ih = 0;
/*      */ 
/* 6074 */     client.dz.gy((short)12833);
/* 6075 */     int i1 = client.dz.gu(1, 2054223300);
/*      */     int i3;
/*      */     int i6;
/*      */     int i7;
/* 6076 */     if (0 == i1) { if (paramInt == 1827009430) return;  } else {
/* 6077 */       i2 = client.dz.gu(2, 323767062);
/* 6078 */       if (0 == i2) { if (paramInt == 1827009430)
/*      */           return;
/*      */         int tmp73_72 = (client.ih + -1499193843); client.ih = tmp73_72; client.ic[(tmp73_72 * 1848664261 - 1)] = 2047;
/*      */       }
/*      */       else
/*      */       {
/* 6082 */         int i4;
/* 6082 */         if (1 == i2) { if (paramInt == 1827009430) throw new IllegalStateException();
/* 6083 */           i3 = client.dz.gu(3, 2122003561);
/* 6084 */           cr.ii.y(i3, false, -1847492077);
/* 6085 */           i4 = client.dz.gu(1, 494249124);
/* 6086 */           if (1 == i4) { if (paramInt != 1827009430);
/*      */             int tmp163_162 = (client.ih + -1499193843); client.ih = tmp163_162; client.ic[(tmp163_162 * 1848664261 - 1)] = 2047;
/*      */           }
/*      */         }
/* 6089 */         else if (i2 == 2) { if (paramInt == 1827009430) return;
/* 6090 */           i3 = client.dz.gu(3, 482673983);
/* 6091 */           cr.ii.y(i3, true, -1847492077);
/* 6092 */           i4 = client.dz.gu(3, 1145465332);
/* 6093 */           cr.ii.y(i4, true, -1847492077);
/* 6094 */           i6 = client.dz.gu(1, 446809065);
/* 6095 */           if (1 == i6) { if (paramInt == 1827009430) throw new IllegalStateException();
/*      */             int tmp273_272 = (client.ih + -1499193843); client.ih = tmp273_272; client.ic[(tmp273_272 * 1848664261 - 1)] = 2047;
/*      */           }
/*      */         }
/* 6098 */         else if (i2 == 3) { if (paramInt == 1827009430) throw new IllegalStateException();
/* 6099 */           al.in = client.dz.gu(2, 30012089) * 1415671719;
/* 6100 */           i3 = client.dz.gu(7, 422435288);
/* 6101 */           i4 = client.dz.gu(1, 2092822893);
/* 6102 */           if (1 == i4) { if (paramInt != 1827009430);
/*      */             int tmp369_368 = (client.ih + -1499193843); client.ih = tmp369_368; client.ic[(tmp369_368 * 1848664261 - 1)] = 2047; }
/* 6103 */           i6 = client.dz.gu(7, 1130725918);
/* 6104 */           i7 = client.dz.gu(1, 1623710535);
/* 6105 */           if (paramInt == 1827009430) throw new IllegalStateException(); cr.ii.b(i3, i6, false, 1 == i7 ? true : (byte)-50);
/*      */         }
/*      */       }
/*      */     }
/* 6109 */     i1 = client.dz.gu(8, 725665563);
/* 6110 */     if (i1 < client.ie * 939573231) { if (paramInt == 1827009430) return;
/* 6111 */       for (i2 = i1; i2 < 939573231 * client.ie; i2++) { if (paramInt != 1827009430);
/*      */         int tmp499_498 = (client.ij + -304062529); client.ij = tmp499_498; client.io[(tmp499_498 * 190025791 - 1)] = client.if[i2]; }
/*      */     }
/* 6113 */     if (i1 > client.ie * 939573231) { if (paramInt == 1827009430) throw new IllegalStateException(); throw new RuntimeException(""); }
/* 6114 */     client.ie = 0;
/*      */     int i9;
/*      */     int i10;
/*      */     int i11;
/* 6115 */     for (int i2 = 0; i2 < i1; i2++) { if (paramInt != 1827009430);
/* 6116 */       i3 = client.if[i2];
/* 6117 */       fi localfi2 = client.iq[i3];
/* 6118 */       i6 = client.dz.gu(1, 102979635);
/* 6119 */       if (0 == i6) { if (paramInt == 1827009430) throw new IllegalStateException();
/*      */         int tmp627_626 = (client.ie + -1259974897); client.ie = tmp627_626; client.if[(tmp627_626 * 939573231 - 1)] = i3;
/* 6121 */         localfi2.bi = (270903767 * client.au);
/*      */       } else
/*      */       {
/* 6124 */         i7 = client.dz.gu(2, 873637786);
/* 6125 */         if (i7 == 0) { if (paramInt == 1827009430) throw new IllegalStateException();
/*      */           int tmp691_690 = (client.ie + -1259974897); client.ie = tmp691_690; client.if[(tmp691_690 * 939573231 - 1)] = i3;
/* 6127 */           localfi2.bi = (client.au * 270903767);
/*      */           int tmp722_721 = (client.ih + -1499193843); client.ih = tmp722_721; client.ic[(tmp722_721 * 1848664261 - 1)] = i3;
/*      */         }
/* 6131 */         else if (1 == i7) { if (paramInt != 1827009430);
/*      */           int tmp760_759 = (client.ie + -1259974897); client.ie = tmp760_759; client.if[(tmp760_759 * 939573231 - 1)] = i3;
/* 6133 */           localfi2.bi = (270903767 * client.au);
/* 6134 */           i9 = client.dz.gu(3, 2077353012);
/* 6135 */           localfi2.y(i9, false, -1847492077);
/* 6136 */           i10 = client.dz.gu(1, 983988708);
/* 6137 */           if (1 == i10) { if (paramInt != 1827009430);
/*      */             int tmp838_837 = (client.ih + -1499193843); client.ih = tmp838_837; client.ic[(tmp838_837 * 1848664261 - 1)] = i3;
/*      */           }
/*      */         }
/* 6140 */         else if (i7 == 2) { if (paramInt == 1827009430)
/*      */             return;
/* 6148 */           int tmp874_873 = (client.ie + -1259974897); client.ie = tmp874_873; client.if[(tmp874_873 * 939573231 - 1)] = i3;
/* 6142 */           localfi2.bi = (270903767 * client.au);
/* 6143 */           i9 = client.dz.gu(3, 1869160498);
/* 6144 */           localfi2.y(i9, true, -1847492077);
/* 6145 */           i10 = client.dz.gu(3, 1685868113);
/* 6146 */           localfi2.y(i10, true, -1847492077);
/* 6147 */           i11 = client.dz.gu(1, 822010889);
/* 6148 */           if (i11 == 1) { if (paramInt != 1827009430);
/*      */             int tmp973_972 = (client.ih + -1499193843); client.ih = tmp973_972; client.ic[(tmp973_972 * 1848664261 - 1)] = i3;
/*      */           }
/*      */         }
/* 6151 */         else if (i7 == 3) { if (paramInt == 1827009430)
/*      */             return;
/*      */           int tmp1009_1008 = (client.ij + -304062529); client.ij = tmp1009_1008; client.io[(tmp1009_1008 * 190025791 - 1)] = i3; }
/*      */       } }
/*      */     fi localfi1;
/*      */     int i5;
/*      */     while (true)
/*      */     {
/* 6159 */       if (client.dz.gs(-1750305651 * client.da, 1171021437) < 11) { if (paramInt != 1827009430);
/* 6159 */         break; }
/* 6160 */       i1 = client.dz.gu(11, 1907217262);
/* 6161 */       if (i1 == 2047) { if (paramInt == 1827009430) return; break; }
/* 6162 */       i2 = 0;
/* 6163 */       if (null == client.iq[i1]) { if (paramInt != 1827009430);
/* 6164 */         client.iq[i1] = new fi();
/* 6165 */         if (null != client.im[i1]) { if (paramInt != 1827009430);
/* 6165 */           client.iq[i1].am(client.im[i1], -391506356); }
/* 6166 */         i2 = 1;
/*      */       }
/* 6172 */       int tmp1164_1163 = (client.ie + -1259974897); client.ie = tmp1164_1163; client.if[(tmp1164_1163 * 939573231 - 1)] = i1;
/* 6169 */       localfi1 = client.iq[i1];
/* 6170 */       localfi1.bi = (270903767 * client.au);
/* 6171 */       i5 = client.dz.gu(5, 676911018);
/* 6172 */       if (i5 > 15) { if (paramInt == 1827009430) throw new IllegalStateException(); i5 -= 32; }
/* 6173 */       i6 = client.il[client.dz.gu(3, 1626864249)];
/* 6174 */       if (i2 != 0) { if (paramInt != 1827009430);
/* 6174 */         localfi1.bk = ((localfi1.g = 717504357 * i6) * 1731207405); }
/* 6175 */       i7 = client.dz.gu(5, 1547027389);
/* 6176 */       if (i7 > 15) { if (paramInt == 1827009430) throw new IllegalStateException(); i7 -= 32; }
/* 6177 */       i9 = client.dz.gu(1, 391445332);
/* 6178 */       i10 = client.dz.gu(1, 1569837415);
/* 6179 */       if (1 == i10) { if (paramInt == 1827009430) throw new IllegalStateException();
/*      */         int tmp1357_1356 = (client.ih + -1499193843); client.ih = tmp1357_1356; client.ic[(tmp1357_1356 * 1848664261 - 1)] = i1; }
/* 6180 */       if (paramInt == 1827009430) return; localfi1.b(i7 + cr.ii.bt[0], i5 + cr.ii.bw[0], false, i9 == 1 ? true : (byte)-50);
/*      */     }
/* 6182 */     client.dz.gb(-1650707573);
/*      */ 
/* 6185 */     for (i1 = 0; i1 < client.ih * 1848664261; i1++) { if (paramInt == 1827009430) throw new IllegalStateException();
/* 6186 */       i2 = client.ic[i1];
/* 6187 */       localfi1 = client.iq[i2];
/* 6188 */       i5 = client.dz.t(1118814123);
/* 6189 */       if (0 != (i5 & 0x40)) { if (paramInt == 1827009430) return; i5 += (client.dz.t(1118814123) << 8);
/*      */       }
/* 6191 */       if ((i5 & 0x4) != 0) { if (paramInt != 1827009430);
/* 6192 */         i6 = client.dz.k(-1987080889);
/* 6193 */         i7 = client.dz.t(1118814123);
/* 6194 */         i9 = client.dz.t(1118814123);
/* 6195 */         i10 = -196293817 * client.dz.c;
/* 6196 */         if (null != localfi1.bu) { if (paramInt == 1827009430) throw new IllegalStateException(); if (localfi1.bo != null) { if (paramInt != 1827009430);
/* 6197 */             i11 = 0;
/* 6198 */             if ((i7 <= 1) && ((paramInt == 1827009430) || 
/* 6199 */               (bi.gx(localfi1.bu, -340639617)))) { if (paramInt == 1827009430) throw new IllegalStateException(); i11 = 1;
/*      */             }
/* 6201 */             if ((i11 == 0) && ((paramInt == 1827009430) || (client.hy * 341191815 == 0))) { if (paramInt == 1827009430) throw new IllegalStateException();
/* 6202 */               client.bf.c = 0;
/* 6203 */               client.dz.as(client.bf.m, 0, i9, 1602313803);
/* 6204 */               client.bf.c = 0;
/* 6205 */               String str = fs.bb(n.g(ca.l(client.bf, -1928009959), (byte)-85));
/* 6206 */               localfi1.f = str.trim();
/* 6207 */               localfi1.o = ((i6 >> 8) * -798323603);
/* 6208 */               localfi1.a = ((i6 & 0xFF) * -2095735345);
/* 6209 */               localfi1.k = -2098433402;
/* 6210 */               if (i7 != 2) { if (paramInt == 1827009430) return; if (3 != i7) break label1848; if (paramInt == 1827009430) throw new IllegalStateException();  } ao.gn(1, j.r(1, (short)32425) + localfi1.bu, str, -746455680); break label1915;
/* 6211 */               label1848: if (i7 == 1) { if (paramInt != 1827009430);
/* 6211 */                 ao.gn(1, j.r(0, (short)25070) + localfi1.bu, str, 2121291614); } else {
/* 6212 */                 ao.gn(2, localfi1.bu, str, 2012221060);
/*      */               } } }
/*      */         }
/* 6215 */         label1915: client.dz.c = ((i10 + i9) * -941396361);
/*      */       }
/* 6217 */       if ((i5 & 0x2) != 0) { if (paramInt == 1827009430) throw new IllegalStateException();
/* 6218 */         i6 = client.dz.at(11804066);
/* 6219 */         byte[] arrayOfByte = new byte[i6];
/* 6220 */         ev localev = new ev(arrayOfByte);
/* 6221 */         client.dz.bq(arrayOfByte, 0, i6, 2044296510);
/* 6222 */         client.im[i2] = localev;
/* 6223 */         localfi1.am(localev, -391506356);
/*      */       }
/* 6225 */       if (0 != (i5 & 0x100)) { if (paramInt != 1827009430);
/* 6226 */         localfi1.au = (client.dz.t(1118814123) * 1070562229);
/* 6227 */         localfi1.ai = (client.dz.aq(1793501752) * 693170553);
/* 6228 */         localfi1.ax = (client.dz.t(1118814123) * 847059011);
/* 6229 */         localfi1.aj = (client.dz.ar(-2129239603) * -2126639359);
/* 6230 */         localfi1.aw = ((client.dz.af(-1548715885) + 1513618129 * client.au) * -1408186175);
/* 6231 */         localfi1.af = ((client.dz.k(-1987080889) + client.au * 1513618129) * 1632571817);
/* 6232 */         localfi1.bh = (client.dz.aq(1991435808) * 736054657);
/* 6233 */         localfi1.bl = 14472063;
/* 6234 */         localfi1.bf = 0;
/*      */       }
/* 6236 */       if ((i5 & 0x20) != 0) { if (paramInt == 1827009430) return;
/* 6237 */         localfi1.am = (client.dz.bh(1084188227) * -1576182381);
/* 6238 */         if (65535 == -1737668453 * localfi1.am) { if (paramInt != 1827009430);
/* 6238 */           localfi1.am = 1576182381; }
/*      */       }
/* 6240 */       if ((i5 & 0x80) != 0) { if (paramInt != 1827009430);
/* 6241 */         localfi1.ap = (client.dz.af(-262162726) * 1168352973);
/* 6242 */         localfi1.av = (client.dz.aw(-879475861) * -1693309575);
/*      */       }
/* 6244 */       int i8;
/* 6244 */       if ((i5 & 0x10) != 0) { if (paramInt != 1827009430);
/* 6245 */         i6 = client.dz.af(-300712332);
/* 6246 */         if (65535 == i6) { if (paramInt == 1827009430) throw new IllegalStateException(); i6 = -1; }
/* 6247 */         i8 = client.dz.aq(1811928444);
/* 6248 */         co.dw(localfi1, i6, i8, -445344276);
/*      */       }
/* 6250 */       if (0 != (i5 & 0x200)) { if (paramInt != 1827009430);
/* 6251 */         localfi1.ag = (client.dz.aw(1086512483) * -1818948799);
/* 6252 */         i6 = client.dz.h(-1054121901);
/* 6253 */         localfi1.ae = ((i6 >> 16) * -497610145);
/* 6254 */         localfi1.at = (-2053780461 * (client.au * 1513618129 + (i6 & 0xFFFF)));
/* 6255 */         localfi1.ar = 0;
/* 6256 */         localfi1.aq = 0;
/* 6257 */         if (localfi1.at * 1715068443 > 1513618129 * client.au) { if (paramInt != 1827009430);
/* 6257 */           localfi1.ar = 788248741; }
/* 6258 */         if (localfi1.ag * -694844223 == 65535) { if (paramInt == 1827009430) return; localfi1.ag = 1818948799; }
/*      */       }
/* 6260 */       if ((i5 & 0x400) != 0) { if (paramInt != 1827009430);
/* 6261 */         i6 = client.dz.ar(-1855288154);
/* 6262 */         i8 = client.dz.at(11804066);
/* 6263 */         localfi1.k(i6, i8, 1513618129 * client.au, (byte)-31);
/* 6264 */         localfi1.ac = (1938014183 * client.au + 1969912948);
/* 6265 */         localfi1.aa = (client.dz.t(1118814123) * 637748823);
/* 6266 */         localfi1.as = (client.dz.aq(1110862143) * 788257517);
/*      */       }
/* 6268 */       if (0 != (i5 & 0x1)) { if (paramInt == 1827009430) throw new IllegalStateException();
/* 6269 */         localfi1.f = client.dz.ad(619723066);
/* 6270 */         if (localfi1.f.charAt(0) == '~') { if (paramInt == 1827009430) throw new IllegalStateException();
/* 6271 */           localfi1.f = localfi1.f.substring(1);
/* 6272 */           ao.gn(2, localfi1.bu, localfi1.f, 912142598);
/*      */         }
/* 6274 */         else if (cr.ii == localfi1) { if (paramInt != 1827009430);
/* 6274 */           ao.gn(2, localfi1.bu, localfi1.f, 198894413); }
/* 6275 */         localfi1.o = 0;
/* 6276 */         localfi1.a = 0;
/* 6277 */         localfi1.k = -2098433402;
/*      */       }
/* 6279 */       if ((i5 & 0x8) != 0) { if (paramInt != 1827009430);
/* 6280 */         i6 = client.dz.ar(-1963165556);
/* 6281 */         i8 = client.dz.at(11804066);
/* 6282 */         localfi1.k(i6, i8, client.au * 1513618129, (byte)-15);
/* 6283 */         localfi1.ac = (1969912948 + 1938014183 * client.au);
/* 6284 */         localfi1.aa = (client.dz.ar(-2106932881) * 637748823);
/* 6285 */         localfi1.as = (client.dz.t(1118814123) * 788257517);
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 6290 */     for (i1 = 0; i1 < client.ij * 190025791; i1++) { if (paramInt == 1827009430) return;
/* 6291 */       i2 = client.io[i1];
/* 6292 */       if (client.au * 1513618129 != -1140982889 * client.iq[i2].bi) { if (paramInt == 1827009430) return; client.iq[i2] = null; }
/*      */     }
/* 6294 */     if (client.dz.c * -196293817 != -1750305651 * client.da) { if (paramInt != 1827009430);
/* 6294 */       throw new RuntimeException(-196293817 * client.dz.c + r.d + client.da * -1750305651); }
/* 6295 */     for (i1 = 0; i1 < client.ie * 939573231; i1++) if ((paramInt == 1827009430) || 
/* 6296 */         (client.iq[client.if[i1]] == null)) { if (paramInt == 1827009430) return;
/* 6297 */         throw new RuntimeException(i1 + r.d + 939573231 * client.ie);
/*      */       }
/*      */   }
/*      */ 
/*      */   static final void dl(String paramString, boolean paramBoolean, int paramInt)
/*      */   {
/* 4902 */     int i1 = 4;
/* 4903 */     Exception localException1 = i1 + 6;
/* 4904 */     int i2 = 6 + i1;
/* 4905 */     Exception localException2 = bd.dq.bc(paramString, 250);
/* 4906 */     int i3 = bd.dq.br(paramString, 250) * 13;
/* 4907 */     fv.e(localException1 - i1, i2 - i1, localException2 + i1 + i1, i3 + i1 + i1, 0);
/* 4908 */     fv.y(localException1 - i1, i2 - i1, i1 + (localException2 + i1), i1 + (i1 + i3), 16777215);
/* 4909 */     bd.dq.cj(paramString, localException1, i2, localException2, i3, 16777215, -1, 1, 1, 0);
/* 4910 */     bs.ea(localException1 - i1, i2 - i1, i1 + (i1 + localException2), i3 + i1 + i1, 2116418378);
/* 4911 */     if (paramBoolean) { if (paramInt == 1801998142) throw new IllegalStateException(); try
/*      */       {
/* 4913 */         Graphics localGraphics = c.h.getGraphics();
/* 4914 */         client.o.l(localGraphics, 0, 0, 1996793884);
/*      */       }
/*      */       catch (Exception localException3) {
/* 4917 */         c.h.repaint();
/*      */       }
/*      */     } else
/*      */     {
/* 4921 */       localException3 = localException1;
/* 4922 */       int i4 = i2;
/* 4923 */       Exception localException4 = localException2;
/* 4924 */       int i5 = i3;
/*      */ 
/* 4926 */       for (int i6 = 0; i6 < 578636789 * client.mw; i6++) if ((paramInt == 1801998142) || 
/* 4927 */           (client.mp[i6] + client.mi[i6] > localException3)) { if (paramInt == 1801998142) return; if (client.mi[i6] < localException4 + localException3) { if (paramInt == 1801998142) throw new IllegalStateException(); if ((client.mh[i6] + client.ma[i6] > i4) && ((paramInt == 1801998142) || (client.mh[i6] < i5 + i4))) { if (paramInt == 1801998142) throw new IllegalStateException(); client.me[i6] = true;
/*      */             }
/*      */           }
/*      */         }
/*      */     }
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ej
 * JD-Core Version:    0.6.2
 */