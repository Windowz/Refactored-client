/*      */ public class ao
/*      */ {
/*      */   int m;
/*      */   int d;
/*      */   int l;
/*      */   int r;
/*      */   protected static int t;
/*      */ 
/*      */   ao(ao paramao)
/*      */   {
/*   12 */     paramao.r *= 1;
/*   13 */     this.d = (1 * paramao.d);
/*   14 */     this.l = (1 * paramao.l);
/*   15 */     paramao.m *= 1;
/*      */   }
/*      */ 
/*      */   ao()
/*      */   {
/*      */   }
/*      */ 
/*      */   static ft j(int paramInt)
/*      */   {
/*  148 */     ft localft = new ft();
/*  149 */     localft.t = (716105887 * al.d);
/*  150 */     localft.f = (1425919147 * al.l);
/*  151 */     localft.b = al.m[0];
/*  152 */     localft.y = al.c[0];
/*  153 */     localft.w = m.n[0];
/*  154 */     localft.e = cl.j[0];
/*  155 */     localft.v = al.z;
/*  156 */     localft.u = bp.g[0];
/*      */ 
/*  158 */     al.m = null;
/*  159 */     al.c = null;
/*  160 */     m.n = null;
/*  161 */     cl.j = null;
/*  162 */     al.z = null;
/*  163 */     bp.g = (byte[][])null;
/*      */ 
/*  165 */     return localft;
/*      */   }
/*      */ 
/*      */   public static int m(CharSequence paramCharSequence, int paramInt1, int paramInt2)
/*      */   {
/*   80 */     return g.c(paramCharSequence, paramInt1, true, (byte)-18);
/*      */   }
/*      */ 
/*      */   static void ec(int paramInt1, String paramString, int paramInt2)
/*      */   {
/* 7161 */     String str = bs.m(paramString, 1806592825);
/*      */ 
/* 7163 */     Object localObject2 = bg.l(cj.r(str, 113030416));
/* 7164 */     if (null == localObject2) { if (paramInt2 == -308819789);
/* 7164 */       localObject2 = ""; }
/* 7165 */     Object localObject1 = localObject2;
/*      */ 
/* 7167 */     localObject2 = localObject1;
/* 7168 */     int i = 0;
/* 7169 */     for (int j = 0; j < client.ie * 939573231; j++) { if (paramInt2 == -308819789);
/* 7170 */       fi localfi = client.iq[client.if[j]];
/* 7171 */       if (null != localfi) { if (paramInt2 != -308819789) return; if (localfi.bu != null) { if (paramInt2 != -308819789) throw new IllegalStateException(); if (localfi.bu.equalsIgnoreCase((String)localObject2)) { if (paramInt2 != -308819789) throw new IllegalStateException();
/* 7172 */             eh.el(cr.ii.bt[0], cr.ii.bw[0], localfi.bt[0], localfi.bw[0], false, 0, 0, 1, 1, 0, 2, (short)4269);
/* 7173 */             if (1 == paramInt1) { if (paramInt2 == -308819789);
/* 7175 */               client.df.gt(246, 2062507603);
/* 7176 */               client.df.n(client.if[j], 1770157223);
/*      */             }
/* 7178 */             else if (paramInt1 == 4) { if (paramInt2 != -308819789) return;
/*      */ 
/* 7180 */               client.df.gt(78, 2062507603);
/* 7181 */               client.df.n(client.if[j], -306542008);
/*      */             }
/* 7183 */             else if (6 == paramInt1) { if (paramInt2 == -308819789);
/* 7185 */               client.df.gt(111, 2062507603);
/* 7186 */               client.df.aj(client.if[j], 292769784);
/*      */             }
/* 7188 */             else if (paramInt1 == 7) { if (paramInt2 != -308819789) throw new IllegalStateException();
/*      */ 
/* 7190 */               client.df.gt(119, 2062507603);
/* 7191 */               client.df.aj(client.if[j], -1330890057);
/*      */             }
/* 7193 */             i = 1;
/* 7194 */             break; } }
/*      */       }
/*      */     }
/* 7197 */     if (i == 0) { if (paramInt2 == -308819789);
/* 7197 */       gn(0, "", ba.eh + (String)localObject2, -249158957);
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void gn(int paramInt1, String paramString1, String paramString2, int paramInt2)
/*      */   {
/* 9578 */     br.gj(paramInt1, paramString1, paramString2, null, -89274617);
/*      */   }
/*      */ 
/*      */   static final void gp(String paramString, byte paramByte)
/*      */   {
/* 9712 */     if (null == paramString) { if (paramByte == 11) return; return; }
/* 9713 */     String str1 = bh.d(paramString, ab.al, -273626565);
/* 9714 */     if (null == str1) { if (paramByte != 11);
/* 9714 */       return; }
/* 9715 */     for (int i = 0; i < 428627887 * client.pi; i++) { if (paramByte == 11) return;
/* 9716 */       q localq = client.pf[i];
/* 9717 */       String str2 = localq.r;
/* 9718 */       String str3 = bh.d(str2, ab.al, -273626565);
/*      */ 
/* 9721 */       if (paramString != null) { if (paramByte == 11) throw new IllegalStateException(); if (str2 != null) break label121; if (paramByte == 11); }
/* 9722 */       boolean bool = false;
/* 9723 */       break label175;
/*      */ 
/* 9725 */       label121: if (!paramString.startsWith("#")) { if (paramByte == 11) return; if (!str2.startsWith("#")) break label167; if (paramByte == 11); }
/* 9726 */       bool = paramString.equals(str2);
/* 9727 */       break label175;
/*      */ 
/* 9729 */       label167: bool = str1.equals(str3);
/*      */ 
/* 9731 */       label175: if (bool) { if (paramByte == 11) return;
/* 9732 */         client.pi -= 1275682639;
/* 9733 */         for (int j = i; j < client.pi * 428627887; j++) { if (paramByte != 11);
/* 9734 */           client.pf[j] = client.pf[(1 + j)];
/*      */         }
/* 9736 */         client.lc = -201579965 * client.lg;
/*      */ 
/* 9738 */         client.df.gt(41, 2062507603);
/* 9739 */         client.df.c(ea.q(paramString, 250063901), 1676879122);
/* 9740 */         client.df.i(paramString, -1218201283);
/* 9741 */         break;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void fh(eg[] paramArrayOfeg, int paramInt, byte paramByte)
/*      */   {
/* 9121 */     for (int i = 0; i < paramArrayOfeg.length; i++) { if (paramByte <= 7) return;
/* 9122 */       eg localeg = paramArrayOfeg[i];
/* 9123 */       if (null == localeg) { if (paramByte <= 7) throw new IllegalStateException();
/*      */       }
/*      */       else
/*      */       {
/* 9124 */         Object localObject;
/* 9124 */         if (0 == localeg.b * 808825319) { if ((paramByte <= 7) || 
/* 9125 */             (null != localeg.dy)) { if (paramByte <= 7) throw new IllegalStateException(); fh(localeg.dy, paramInt, (byte)109); }
/* 9126 */           localObject = (dy)client.ky.r(localeg.w * 1442485545);
/* 9127 */           if (localObject != null) { if (paramByte > 7);
/* 9127 */             ai.fs(-2056138635 * ((dy)localObject).m, paramInt, -2051286055); }
/*      */         }
/* 9129 */         if (0 == paramInt) { if (paramByte <= 7) return; if (localeg.dz != null) { if (paramByte > 7);
/* 9130 */             localObject = new du();
/* 9131 */             ((du)localObject).c = localeg;
/* 9132 */             ((du)localObject).m = localeg.dz;
/* 9133 */             bv.r((du)localObject, (byte)-4); }
/*      */         }
/* 9135 */         if (paramInt == 1) { if (paramByte <= 7) return; if (null != localeg.da) { if (paramByte <= 7) return;
/* 9136 */             if (-1342772421 * localeg.e >= 0) { if (paramByte <= 7) throw new IllegalStateException();
/* 9137 */               localObject = bw.n(localeg.w * 1442485545, (byte)1);
/* 9138 */               if ((localObject == null) || ((paramByte > 7) && ((null == ((eg)localObject).dy) || ((paramByte > 7) && (-1342772421 * localeg.e >= ((eg)localObject).dy.length))))) continue; if (paramByte <= 7) return; if (localObject.dy[(-1342772421 * localeg.e)] != localeg) { if (paramByte <= 7) throw new IllegalStateException();
/* 9139 */                 continue;
/*      */               }
/*      */             }
/* 9142 */             localObject = new du();
/* 9143 */             ((du)localObject).c = localeg;
/* 9144 */             ((du)localObject).m = localeg.da;
/* 9145 */             bv.r((du)localObject, (byte)3);
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ao
 * JD-Core Version:    0.6.2
 */