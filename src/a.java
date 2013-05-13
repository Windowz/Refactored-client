/*      */ import java.awt.Frame;
/*      */ 
/*      */ public class a
/*      */ {
/*    9 */   cf l = new cf(256);
/*      */   ch d;
/*   10 */   cf m = new cf(256);
/*      */   ch r;
/*      */   protected static Frame a;
/*      */   static int de;
/*      */ 
/*      */   eq j(int paramInt1, int paramInt2, int[] paramArrayOfInt)
/*      */   {
/*   33 */     int i = paramInt2 ^ (paramInt1 << 4 & 0xFFFF | paramInt1 >>> 12);
/*   34 */     i |= paramInt1 << 16;
/*   35 */     long l1 = i ^ 0x0;
/*   36 */     eq localeq = (eq)this.m.r(l1);
/*   37 */     if (null != localeq) return localeq;
/*   38 */     if ((null != paramArrayOfInt) && (paramArrayOfInt[0] <= 0)) return null;
/*   39 */     dt localdt = (dt)this.l.r(l1);
/*   40 */     if (null == localdt) {
/*   41 */       localdt = dt.u(this.d, paramInt1, paramInt2);
/*   42 */       if (null == localdt) return null;
/*   43 */       this.l.d(localdt, l1);
/*      */     }
/*   45 */     localeq = localdt.v(paramArrayOfInt);
/*   46 */     if (null == localeq) return null;
/*   47 */     localdt.r();
/*   48 */     this.m.d(localeq, l1);
/*   49 */     return localeq;
/*      */   }
/*      */ 
/*      */   eq r(int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
/*      */   {
/*   18 */     int i = paramInt2 ^ (paramInt1 << 4 & 0xFFFF | paramInt1 >>> 12);
/*   19 */     i |= paramInt1 << 16;
/*   20 */     long l1 = i;
/*   21 */     eq localeq = (eq)this.m.r(l1);
/*   22 */     if (null != localeq) { if (paramInt3 == -1851254035) throw new IllegalStateException(); return localeq; }
/*   23 */     if ((null != paramArrayOfInt) && ((paramInt3 == -1851254035) || (paramArrayOfInt[0] <= 0))) { if (paramInt3 != -1851254035);
/*   23 */       return null; }
/*   24 */     o localo = o.r(this.r, paramInt1, paramInt2);
/*   25 */     if (null == localo) { if (paramInt3 != -1851254035);
/*   25 */       return null; }
/*   26 */     localeq = localo.d();
/*   27 */     this.m.d(localeq, l1);
/*   28 */     if (null != paramArrayOfInt) { if (paramInt3 != -1851254035);
/*   28 */       paramArrayOfInt[0] -= localeq.n.length; }
/*   29 */     return localeq;
/*      */   }
/*      */ 
/*      */   eq d(int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3) {
/*   33 */     int i = paramInt2 ^ (paramInt1 << 4 & 0xFFFF | paramInt1 >>> 12);
/*   34 */     i |= paramInt1 << 16;
/*   35 */     long l1 = i ^ 0x0;
/*   36 */     eq localeq = (eq)this.m.r(l1);
/*   37 */     if (null != localeq) { if (paramInt3 <= -737733341) throw new IllegalStateException(); return localeq; }
/*   38 */     if (null != paramArrayOfInt) { if (paramInt3 <= -737733341) throw new IllegalStateException(); if (paramArrayOfInt[0] <= 0) { if (paramInt3 > -737733341);
/*   38 */         return null; } }
/*   39 */     dt localdt = (dt)this.l.r(l1);
/*   40 */     if (null == localdt) { if (paramInt3 > -737733341);
/*   41 */       localdt = dt.u(this.d, paramInt1, paramInt2);
/*   42 */       if (null == localdt) { if (paramInt3 > -737733341);
/*   42 */         return null; }
/*   43 */       this.l.d(localdt, l1);
/*      */     }
/*   45 */     localeq = localdt.v(paramArrayOfInt);
/*   46 */     if (null == localeq) { if (paramInt3 <= -737733341) throw new IllegalStateException(); return null; }
/*   47 */     localdt.r();
/*   48 */     this.m.d(localeq, l1);
/*   49 */     return localeq;
/*      */   }
/*      */ 
/*      */   public eq l(int paramInt1, int[] paramArrayOfInt, int paramInt2) {
/*   53 */     if (this.r.v(1223675499) == 1) { if (paramInt2 < 16776960);
/*   53 */       return r(0, paramInt1, paramArrayOfInt, -1861651951); }
/*   54 */     if (this.r.u(paramInt1, (short)-10320) == 1) { if (paramInt2 < 16776960);
/*   54 */       return r(paramInt1, 0, paramArrayOfInt, -129061140); }
/*   55 */     throw new RuntimeException();
/*      */   }
/*      */ 
/*      */   eq n(int paramInt1, int paramInt2, int[] paramArrayOfInt)
/*      */   {
/*   18 */     int i = paramInt2 ^ (paramInt1 << 4 & 0xFFFF | paramInt1 >>> 12);
/*   19 */     i |= paramInt1 << 16;
/*   20 */     long l1 = i;
/*   21 */     eq localeq = (eq)this.m.r(l1);
/*   22 */     if (null != localeq) return localeq;
/*   23 */     if ((null != paramArrayOfInt) && (paramArrayOfInt[0] <= 0)) return null;
/*   24 */     o localo = o.r(this.r, paramInt1, paramInt2);
/*   25 */     if (null == localo) return null;
/*   26 */     localeq = localo.d();
/*   27 */     this.m.d(localeq, l1);
/*   28 */     if (null != paramArrayOfInt) paramArrayOfInt[0] -= localeq.n.length;
/*   29 */     return localeq;
/*      */   }
/*      */ 
/*      */   eq c(int paramInt1, int paramInt2, int[] paramArrayOfInt)
/*      */   {
/*   18 */     int i = paramInt2 ^ (paramInt1 << 4 & 0xFFFF | paramInt1 >>> 12);
/*   19 */     i |= paramInt1 << 16;
/*   20 */     long l1 = i;
/*   21 */     eq localeq = (eq)this.m.r(l1);
/*   22 */     if (null != localeq) return localeq;
/*   23 */     if ((null != paramArrayOfInt) && (paramArrayOfInt[0] <= 0)) return null;
/*   24 */     o localo = o.r(this.r, paramInt1, paramInt2);
/*   25 */     if (null == localo) return null;
/*   26 */     localeq = localo.d();
/*   27 */     this.m.d(localeq, l1);
/*   28 */     if (null != paramArrayOfInt) paramArrayOfInt[0] -= localeq.n.length;
/*   29 */     return localeq;
/*      */   }
/*      */ 
/*      */   eq q(int paramInt1, int paramInt2, int[] paramArrayOfInt) {
/*   33 */     int i = paramInt2 ^ (paramInt1 << 4 & 0xFFFF | paramInt1 >>> 12);
/*   34 */     i |= paramInt1 << 16;
/*   35 */     long l1 = i ^ 0x0;
/*   36 */     eq localeq = (eq)this.m.r(l1);
/*   37 */     if (null != localeq) return localeq;
/*   38 */     if ((null != paramArrayOfInt) && (paramArrayOfInt[0] <= 0)) return null;
/*   39 */     dt localdt = (dt)this.l.r(l1);
/*   40 */     if (null == localdt) {
/*   41 */       localdt = dt.u(this.d, paramInt1, paramInt2);
/*   42 */       if (null == localdt) return null;
/*   43 */       this.l.d(localdt, l1);
/*      */     }
/*   45 */     localeq = localdt.v(paramArrayOfInt);
/*   46 */     if (null == localeq) return null;
/*   47 */     localdt.r();
/*   48 */     this.m.d(localeq, l1);
/*   49 */     return localeq;
/*      */   }
/*      */ 
/*      */   public eq m(int paramInt1, int[] paramArrayOfInt, int paramInt2)
/*      */   {
/*   59 */     if (this.d.v(1223675499) == 1) { if (paramInt2 == -395736293) throw new IllegalStateException(); return d(0, paramInt1, paramArrayOfInt, 743625012); }
/*   60 */     if (this.d.u(paramInt1, (short)21625) == 1) { if (paramInt2 == -395736293) throw new IllegalStateException(); return d(paramInt1, 0, paramArrayOfInt, 1811590135); }
/*   61 */     throw new RuntimeException();
/*      */   }
/*      */ 
/*      */   public a(ch paramch1, ch paramch2)
/*      */   {
/*   13 */     this.r = paramch1;
/*   14 */     this.d = paramch2;
/*      */   }
/*      */ 
/*      */   eq g(int paramInt1, int paramInt2, int[] paramArrayOfInt)
/*      */   {
/*   33 */     int i = paramInt2 ^ (paramInt1 << 4 & 0xFFFF | paramInt1 >>> 12);
/*   34 */     i |= paramInt1 << 16;
/*   35 */     long l1 = i ^ 0x0;
/*   36 */     eq localeq = (eq)this.m.r(l1);
/*   37 */     if (null != localeq) return localeq;
/*   38 */     if ((null != paramArrayOfInt) && (paramArrayOfInt[0] <= 0)) return null;
/*   39 */     dt localdt = (dt)this.l.r(l1);
/*   40 */     if (null == localdt) {
/*   41 */       localdt = dt.u(this.d, paramInt1, paramInt2);
/*   42 */       if (null == localdt) return null;
/*   43 */       this.l.d(localdt, l1);
/*      */     }
/*   45 */     localeq = localdt.v(paramArrayOfInt);
/*   46 */     if (null == localeq) return null;
/*   47 */     localdt.r();
/*   48 */     this.m.d(localeq, l1);
/*   49 */     return localeq;
/*      */   }
/*      */ 
/*      */   eq z(int paramInt1, int paramInt2, int[] paramArrayOfInt)
/*      */   {
/*   33 */     int i = paramInt2 ^ (paramInt1 << 4 & 0xFFFF | paramInt1 >>> 12);
/*   34 */     i |= paramInt1 << 16;
/*   35 */     long l1 = i ^ 0x0;
/*   36 */     eq localeq = (eq)this.m.r(l1);
/*   37 */     if (null != localeq) return localeq;
/*   38 */     if ((null != paramArrayOfInt) && (paramArrayOfInt[0] <= 0)) return null;
/*   39 */     dt localdt = (dt)this.l.r(l1);
/*   40 */     if (null == localdt) {
/*   41 */       localdt = dt.u(this.d, paramInt1, paramInt2);
/*   42 */       if (null == localdt) return null;
/*   43 */       this.l.d(localdt, l1);
/*      */     }
/*   45 */     localeq = localdt.v(paramArrayOfInt);
/*   46 */     if (null == localeq) return null;
/*   47 */     localdt.r();
/*   48 */     this.m.d(localeq, l1);
/*   49 */     return localeq;
/*      */   }
/*      */ 
/*      */   eq i(int paramInt1, int paramInt2, int[] paramArrayOfInt)
/*      */   {
/*   33 */     int i = paramInt2 ^ (paramInt1 << 4 & 0xFFFF | paramInt1 >>> 12);
/*   34 */     i |= paramInt1 << 16;
/*   35 */     long l1 = i ^ 0x0;
/*   36 */     eq localeq = (eq)this.m.r(l1);
/*   37 */     if (null != localeq) return localeq;
/*   38 */     if ((null != paramArrayOfInt) && (paramArrayOfInt[0] <= 0)) return null;
/*   39 */     dt localdt = (dt)this.l.r(l1);
/*   40 */     if (null == localdt) {
/*   41 */       localdt = dt.u(this.d, paramInt1, paramInt2);
/*   42 */       if (null == localdt) return null;
/*   43 */       this.l.d(localdt, l1);
/*      */     }
/*   45 */     localeq = localdt.v(paramArrayOfInt);
/*   46 */     if (null == localeq) return null;
/*   47 */     localdt.r();
/*   48 */     this.m.d(localeq, l1);
/*   49 */     return localeq;
/*      */   }
/*      */ 
/*      */   public eq s(int paramInt, int[] paramArrayOfInt)
/*      */   {
/*   59 */     if (this.d.v(1223675499) == 1) return d(0, paramInt, paramArrayOfInt, 1283246737);
/*   60 */     if (this.d.u(paramInt, (short)-18359) == 1) return d(paramInt, 0, paramArrayOfInt, 633942319);
/*   61 */     throw new RuntimeException();
/*      */   }
/*      */ 
/*      */   static void s(byte[] paramArrayOfByte, byte paramByte)
/*      */   {
/*  220 */     ev localev = new ev(paramArrayOfByte);
/*  221 */     localev.c = (-941396361 * (paramArrayOfByte.length - 2));
/*  222 */     al.r = localev.k(-1987080889) * 1146649569;
/*  223 */     al.m = new int[-874969055 * al.r];
/*  224 */     al.c = new int[al.r * -874969055];
/*  225 */     m.n = new int[-874969055 * al.r];
/*  226 */     cl.j = new int[-874969055 * al.r];
/*  227 */     bp.g = new byte[al.r * -874969055][];
/*  228 */     localev.c = (-941396361 * (paramArrayOfByte.length - 7 - al.r * 1590182152));
/*  229 */     al.d = localev.k(-1987080889) * 926954335;
/*  230 */     al.l = localev.k(-1987080889) * -1191195133;
/*  231 */     int i = (localev.t(1118814123) & 0xFF) + 1;
/*  232 */     for (int j = 0; j < al.r * -874969055; j++) { if (paramByte != 4);
/*  232 */       al.m[j] = localev.k(-1987080889); }
/*  233 */     for (j = 0; j < -874969055 * al.r; j++) { if (paramByte == 4) throw new IllegalStateException(); al.c[j] = localev.k(-1987080889); }
/*  234 */     for (j = 0; j < al.r * -874969055; j++) { if (paramByte == 4) throw new IllegalStateException(); m.n[j] = localev.k(-1987080889); }
/*  235 */     for (j = 0; j < al.r * -874969055; j++) { if (paramByte != 4);
/*  235 */       cl.j[j] = localev.k(-1987080889); }
/*  236 */     localev.c = ((paramArrayOfByte.length - 7 - 1590182152 * al.r - (i - 1) * 3) * -941396361);
/*  237 */     al.z = new int[i];
/*  238 */     for (j = 1; j < i; j++) { if (paramByte != 4);
/*  239 */       al.z[j] = localev.a(56);
/*  240 */       if (0 == al.z[j]) { if (paramByte != 4);
/*  240 */         al.z[j] = 1; }
/*      */     }
/*  242 */     localev.c = 0;
/*  243 */     for (j = 0; j < -874969055 * al.r; j++) { if (paramByte != 4);
/*  244 */       int k = m.n[j];
/*  245 */       int n = cl.j[j];
/*  246 */       int i1 = n * k;
/*  247 */       byte[] arrayOfByte = new byte[i1];
/*  248 */       bp.g[j] = arrayOfByte;
/*  249 */       int i2 = localev.t(1118814123);
/*      */       int i3;
/*  250 */       if (0 == i2) { if (paramByte == 4) throw new IllegalStateException();
/*  251 */         for (i3 = 0; i3 < i1; i3++) { if (paramByte != 4);
/*  251 */           arrayOfByte[i3] = localev.f(2002687137); }
/*      */       }
/*  253 */       else if (i2 == 1) { if (paramByte != 4);
/*  254 */         for (i3 = 0; i3 < k; i3++) { if (paramByte != 4);
/*  255 */           for (int i4 = 0; i4 < n; i4++) { if (paramByte != 4);
/*  256 */             arrayOfByte[(i4 * k + i3)] = localev.f(2002687137);
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void gz(String paramString, boolean paramBoolean, short paramShort)
/*      */   {
/* 9664 */     if (paramString == null) { if (paramShort != 128) return; return; }
/* 9665 */     if (1704207791 * client.pr >= 100) { if (paramShort == 128);
/* 9666 */       ao.gn(0, "", ba.fb, 639345819);
/* 9667 */       return;
/*      */     }
/* 9669 */     String str1 = bh.d(paramString, ab.al, -273626565);
/* 9670 */     if (str1 == null) { if (paramShort == 128);
/*      */       return;
/*      */     }
/* 9671 */     Object localObject;
/*      */     String str2;
/*      */     String str3;
/* 9671 */     for (int i = 0; i < 1704207791 * client.pr; i++) { if (paramShort == 128);
/* 9672 */       localObject = client.pe[i];
/* 9673 */       str2 = bh.d(((m)localObject).r, ab.al, -273626565);
/* 9674 */       if (null != str2) { if (paramShort != 128) return; if (str2.equals(str1)) { if (paramShort == 128);
/* 9675 */           ao.gn(0, "", paramString + ba.fc, 41413780);
/* 9676 */           return; }
/*      */       }
/* 9678 */       if (null != ((m)localObject).d) { if (paramShort == 128);
/* 9679 */         str3 = bh.d(((m)localObject).d, ab.al, -273626565);
/* 9680 */         if (null != str3) { if (paramShort != 128) return; if (str3.equals(str1)) { if (paramShort != 128) return;
/* 9681 */             ao.gn(0, "", paramString + ba.fc, 1831406811);
/* 9682 */             return; }
/*      */         }
/*      */       }
/*      */     }
/* 9686 */     for (i = 0; i < client.pi * 428627887; i++) { if (paramShort != 128) return;
/* 9687 */       localObject = client.pf[i];
/* 9688 */       str2 = bh.d(((q)localObject).r, ab.al, -273626565);
/* 9689 */       if (null != str2) { if (paramShort != 128) throw new IllegalStateException(); if (str2.equals(str1)) { if (paramShort == 128);
/* 9690 */           ao.gn(0, "", ba.fv + paramString + ba.fu, -1557812184);
/* 9691 */           return; }
/*      */       }
/* 9693 */       if (null != ((q)localObject).d) { if (paramShort != 128) return;
/* 9694 */         str3 = bh.d(((q)localObject).d, ab.al, -273626565);
/* 9695 */         if ((null != str3) && ((paramShort != 128) || (str3.equals(str1)))) { if (paramShort == 128);
/* 9696 */           ao.gn(0, "", ba.fv + paramString + ba.fu, -867090289);
/* 9697 */           return;
/*      */         }
/*      */       }
/*      */     }
/* 9701 */     if (bh.d(cr.ii.bu, ab.al, -273626565).equals(str1)) { if (paramShort != 128) throw new IllegalStateException();
/* 9702 */       ao.gn(0, "", ba.fj, 1692477475);
/* 9703 */       return;
/*      */     }
/*      */ 
/* 9706 */     client.df.gt(231, 2062507603);
/* 9707 */     client.df.c(ea.q(paramString, 1779393330), 1561009937);
/* 9708 */     client.df.i(paramString, -1987334202);
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     a
 * JD-Core Version:    0.6.2
 */