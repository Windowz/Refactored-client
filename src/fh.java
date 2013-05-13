/*    */ public final class fh extends fu
/*    */ {
/*    */   double h;
/*    */   int w;
/*    */   int j;
/*    */   int q;
/*    */   int i;
/*    */   int s;
/*    */   int u;
/*    */   int v;
/*    */   int g;
/*    */   int e;
/*    */   double k;
/*    */   int ac;
/*    */   double o;
/*    */   double f;
/*    */   double t;
/*    */   double a;
/*    */   int b;
/*    */   int z;
/*    */   double x;
/*    */   double p;
/*    */   int ad;
/* 20 */   boolean y = false;
/*    */   eo aa;
/* 32 */   int as = 0;
/* 33 */   int am = 0;
/*    */ 
/*    */   final void t(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 54 */     if (!this.y) {
/* 55 */       d1 = paramInt1 - 843402863 * this.g;
/* 56 */       double d2 = paramInt2 - this.q * -1599119613;
/* 57 */       double d3 = Math.sqrt(d2 * d2 + d1 * d1);
/* 58 */       this.t = (843402863 * this.g + d1 * (-702617589 * this.e) / d3);
/* 59 */       this.f = (-1599119613 * this.q + -702617589 * this.e * d2 / d3);
/* 60 */       this.k = (-939794029 * this.i);
/*    */     }
/* 62 */     double d1 = 1 + -395208975 * this.v - paramInt4;
/* 63 */     this.o = ((paramInt1 - this.t) / d1);
/* 64 */     this.a = ((paramInt2 - this.f) / d1);
/* 65 */     this.h = Math.sqrt(this.a * this.a + this.o * this.o);
/* 66 */     if (!this.y) this.x = (-this.h * Math.tan(1833308197 * this.w * 0.02454369D));
/* 67 */     this.p = ((paramInt3 - this.k - d1 * this.x) * 2.0D / (d1 * d1));
/*    */   }
/*    */ 
/*    */   final void h(int paramInt) {
/* 71 */     this.y = true;
/* 72 */     this.t += paramInt * this.o;
/* 73 */     this.f += paramInt * this.a;
/* 74 */     this.k += paramInt * (0.5D * this.p * paramInt) + paramInt * this.x;
/* 75 */     this.x += this.p * paramInt;
/* 76 */     this.ad = (((int)(Math.atan2(this.o, this.a) * 325.94900000000001D) + 1024 & 0x7FF) * -1578910037);
/* 77 */     this.ac = (((int)(Math.atan2(this.x, this.h) * 325.94900000000001D) & 0x7FF) * -1687752937);
/* 78 */     if (this.aa != null) {
/* 79 */       this.am += paramInt * -1949547947;
/* 80 */       while (this.am * 415148797 > this.aa.u[(969114259 * this.as)]) {
/* 81 */         this.am -= this.aa.u[(969114259 * this.as)] * -1949547947;
/* 82 */         this.as += -703468645;
/* 83 */         if (this.as * 969114259 >= this.aa.i.length) {
/* 84 */           this.as -= -507566611 * this.aa.w;
/* 85 */           if ((this.as * 969114259 < 0) || (969114259 * this.as >= this.aa.i.length)) this.as = 0;
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   final void y(int paramInt, byte paramByte)
/*    */   {
/* 71 */     this.y = true;
/* 72 */     this.t += paramInt * this.o;
/* 73 */     this.f += paramInt * this.a;
/* 74 */     this.k += paramInt * (0.5D * this.p * paramInt) + paramInt * this.x;
/* 75 */     this.x += this.p * paramInt;
/* 76 */     this.ad = (((int)(Math.atan2(this.o, this.a) * 325.94900000000001D) + 1024 & 0x7FF) * -1578910037);
/* 77 */     this.ac = (((int)(Math.atan2(this.x, this.h) * 325.94900000000001D) & 0x7FF) * -1687752937);
/* 78 */     if (this.aa != null) { if (paramByte > 0);
/* 79 */       this.am += paramInt * -1949547947;
/* 80 */       while (this.am * 415148797 > this.aa.u[(969114259 * this.as)]) { if (paramByte > 0);
/* 81 */         this.am -= this.aa.u[(969114259 * this.as)] * -1949547947;
/* 82 */         this.as += -703468645;
/* 83 */         if (this.as * 969114259 >= this.aa.i.length) { if (paramByte > 0);
/* 84 */           this.as -= -507566611 * this.aa.w;
/* 85 */           if (this.as * 969114259 >= 0) { if ((paramByte <= 0) || (969114259 * this.as >= this.aa.i.length)) if (paramByte <= 0);  } else this.as = 0;
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 54 */     if (!this.y) { if (paramInt5 >= -1453593105) throw new IllegalStateException();
/* 55 */       d1 = paramInt1 - 843402863 * this.g;
/* 56 */       double d2 = paramInt2 - this.q * -1599119613;
/* 57 */       double d3 = Math.sqrt(d2 * d2 + d1 * d1);
/* 58 */       this.t = (843402863 * this.g + d1 * (-702617589 * this.e) / d3);
/* 59 */       this.f = (-1599119613 * this.q + -702617589 * this.e * d2 / d3);
/* 60 */       this.k = (-939794029 * this.i);
/*    */     }
/* 62 */     double d1 = 1 + -395208975 * this.v - paramInt4;
/* 63 */     this.o = ((paramInt1 - this.t) / d1);
/* 64 */     this.a = ((paramInt2 - this.f) / d1);
/* 65 */     this.h = Math.sqrt(this.a * this.a + this.o * this.o);
/* 66 */     if (!this.y) { if (paramInt5 < -1453593105);
/* 66 */       this.x = (-this.h * Math.tan(1833308197 * this.w * 0.02454369D)); }
/* 67 */     this.p = ((paramInt3 - this.k - d1 * this.x) * 2.0D / (d1 * d1));
/*    */   }
/*    */ 
/*    */   final fo q()
/*    */   {
/* 92 */     eu localeu = cm.z(this.j * 30563477, (byte)22);
/* 93 */     fo localfo = localeu.i(this.as * 969114259, (short)-6699);
/* 94 */     if (null == localfo) return null;
/* 95 */     localfo.as(-788842329 * this.ac);
/* 96 */     return localfo;
/*    */   }
/*    */ 
/*    */   final fo i()
/*    */   {
/* 92 */     eu localeu = cm.z(this.j * 30563477, (byte)-57);
/* 93 */     fo localfo = localeu.i(this.as * 969114259, (short)8268);
/* 94 */     if (null == localfo) return null;
/* 95 */     localfo.as(-788842329 * this.ac);
/* 96 */     return localfo;
/*    */   }
/*    */ 
/*    */   final fo s()
/*    */   {
/* 92 */     eu localeu = cm.z(this.j * 30563477, (byte)0);
/* 93 */     fo localfo = localeu.i(this.as * 969114259, (short)-12346);
/* 94 */     if (null == localfo) return null;
/* 95 */     localfo.as(-788842329 * this.ac);
/* 96 */     return localfo;
/*    */   }
/*    */ 
/*    */   final fo g(int paramInt)
/*    */   {
/* 92 */     eu localeu = cm.z(this.j * 30563477, (byte)-31);
/* 93 */     fo localfo = localeu.i(this.as * 969114259, (short)3853);
/* 94 */     if (null == localfo) { if (paramInt != -78901604) throw new IllegalStateException(); return null; }
/* 95 */     localfo.as(-788842329 * this.ac);
/* 96 */     return localfo;
/*    */   }
/*    */ 
/*    */   fh(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11)
/*    */   {
/* 36 */     this.j = (-1707372867 * paramInt1);
/* 37 */     this.z = (paramInt2 * -2106311871);
/* 38 */     this.g = (paramInt3 * 350343311);
/* 39 */     this.q = (-1363180629 * paramInt4);
/* 40 */     this.i = (1086022811 * paramInt5);
/* 41 */     this.u = (1522016761 * paramInt6);
/* 42 */     this.v = (103324177 * paramInt7);
/* 43 */     this.w = (-966292563 * paramInt8);
/* 44 */     this.e = (1132618659 * paramInt9);
/* 45 */     this.b = (paramInt10 * -686081239);
/* 46 */     this.s = (1228828265 * paramInt11);
/* 47 */     this.y = false;
/* 48 */     int m = cm.z(30563477 * this.j, (byte)20).s * -1017417001;
/* 49 */     if (m != -1) this.aa = i.g(m, (byte)0); else
/* 50 */       this.aa = null;
/*    */   }
/*    */ 
/*    */   final fo u()
/*    */   {
/* 92 */     eu localeu = cm.z(this.j * 30563477, (byte)-47);
/* 93 */     fo localfo = localeu.i(this.as * 969114259, (short)1077);
/* 94 */     if (null == localfo) return null;
/* 95 */     localfo.as(-788842329 * this.ac);
/* 96 */     return localfo;
/*    */   }
/*    */ 
/*    */   final void k(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 54 */     if (!this.y) {
/* 55 */       d1 = paramInt1 - 843402863 * this.g;
/* 56 */       double d2 = paramInt2 - this.q * -1599119613;
/* 57 */       double d3 = Math.sqrt(d2 * d2 + d1 * d1);
/* 58 */       this.t = (843402863 * this.g + d1 * (-702617589 * this.e) / d3);
/* 59 */       this.f = (-1599119613 * this.q + -702617589 * this.e * d2 / d3);
/* 60 */       this.k = (-939794029 * this.i);
/*    */     }
/* 62 */     double d1 = 1 + -395208975 * this.v - paramInt4;
/* 63 */     this.o = ((paramInt1 - this.t) / d1);
/* 64 */     this.a = ((paramInt2 - this.f) / d1);
/* 65 */     this.h = Math.sqrt(this.a * this.a + this.o * this.o);
/* 66 */     if (!this.y) this.x = (-this.h * Math.tan(1833308197 * this.w * 0.02454369D));
/* 67 */     this.p = ((paramInt3 - this.k - d1 * this.x) * 2.0D / (d1 * d1));
/*    */   }
/*    */ 
/*    */   final void o(int paramInt) {
/* 71 */     this.y = true;
/* 72 */     this.t += paramInt * this.o;
/* 73 */     this.f += paramInt * this.a;
/* 74 */     this.k += paramInt * (0.5D * this.p * paramInt) + paramInt * this.x;
/* 75 */     this.x += this.p * paramInt;
/* 76 */     this.ad = (((int)(Math.atan2(this.o, this.a) * 325.94900000000001D) + 1024 & 0x7FF) * -1578910037);
/* 77 */     this.ac = (((int)(Math.atan2(this.x, this.h) * 325.94900000000001D) & 0x7FF) * -1687752937);
/* 78 */     if (this.aa != null) {
/* 79 */       this.am += paramInt * -1949547947;
/* 80 */       while (this.am * 415148797 > this.aa.u[(969114259 * this.as)]) {
/* 81 */         this.am -= this.aa.u[(969114259 * this.as)] * -1949547947;
/* 82 */         this.as += -703468645;
/* 83 */         if (this.as * 969114259 >= this.aa.i.length) {
/* 84 */           this.as -= -507566611 * this.aa.w;
/* 85 */           if ((this.as * 969114259 < 0) || (969114259 * this.as >= this.aa.i.length)) this.as = 0;
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   final void f(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 54 */     if (!this.y) {
/* 55 */       d1 = paramInt1 - 843402863 * this.g;
/* 56 */       double d2 = paramInt2 - this.q * -1599119613;
/* 57 */       double d3 = Math.sqrt(d2 * d2 + d1 * d1);
/* 58 */       this.t = (843402863 * this.g + d1 * (-702617589 * this.e) / d3);
/* 59 */       this.f = (-1599119613 * this.q + -702617589 * this.e * d2 / d3);
/* 60 */       this.k = (-939794029 * this.i);
/*    */     }
/* 62 */     double d1 = 1 + -395208975 * this.v - paramInt4;
/* 63 */     this.o = ((paramInt1 - this.t) / d1);
/* 64 */     this.a = ((paramInt2 - this.f) / d1);
/* 65 */     this.h = Math.sqrt(this.a * this.a + this.o * this.o);
/* 66 */     if (!this.y) this.x = (-this.h * Math.tan(1833308197 * this.w * 0.02454369D));
/* 67 */     this.p = ((paramInt3 - this.k - d1 * this.x) * 2.0D / (d1 * d1));
/*    */   }
/*    */ 
/*    */   final void a(int paramInt) {
/* 71 */     this.y = true;
/* 72 */     this.t += paramInt * this.o;
/* 73 */     this.f += paramInt * this.a;
/* 74 */     this.k += paramInt * (0.5D * this.p * paramInt) + paramInt * this.x;
/* 75 */     this.x += this.p * paramInt;
/* 76 */     this.ad = (((int)(Math.atan2(this.o, this.a) * 325.94900000000001D) + 1024 & 0x7FF) * -1578910037);
/* 77 */     this.ac = (((int)(Math.atan2(this.x, this.h) * 325.94900000000001D) & 0x7FF) * -1687752937);
/* 78 */     if (this.aa != null) {
/* 79 */       this.am += paramInt * -1949547947;
/* 80 */       while (this.am * 415148797 > this.aa.u[(969114259 * this.as)]) {
/* 81 */         this.am -= this.aa.u[(969114259 * this.as)] * -1949547947;
/* 82 */         this.as += -703468645;
/* 83 */         if (this.as * 969114259 >= this.aa.i.length) {
/* 84 */           this.as -= -507566611 * this.aa.w;
/* 85 */           if ((this.as * 969114259 < 0) || (969114259 * this.as >= this.aa.i.length)) this.as = 0;
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   static void j(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 32 */     dl localdl = (dl)dl.m.r(paramInt1);
/* 33 */     if (localdl == null) { if (paramInt5 == -1527968120) return;
/* 34 */       localdl = new dl();
/* 35 */       dl.m.d(localdl, paramInt1);
/*    */     }
/* 37 */     if (localdl.c.length <= paramInt2) { if (paramInt5 == -1527968120) return;
/* 38 */       int[] arrayOfInt1 = new int[1 + paramInt2];
/* 39 */       int[] arrayOfInt2 = new int[1 + paramInt2];
/* 40 */       for (int m = 0; m < localdl.c.length; m++) { if (paramInt5 == -1527968120) return;
/* 41 */         arrayOfInt1[m] = localdl.c[m];
/* 42 */         arrayOfInt2[m] = localdl.n[m];
/*    */       }
/* 44 */       for (m = localdl.c.length; m < paramInt2; m++) { if (paramInt5 != -1527968120);
/* 45 */         arrayOfInt1[m] = -1;
/* 46 */         arrayOfInt2[m] = 0;
/*    */       }
/* 48 */       localdl.c = arrayOfInt1;
/* 49 */       localdl.n = arrayOfInt2;
/*    */     }
/* 51 */     localdl.c[paramInt2] = paramInt3;
/* 52 */     localdl.n[paramInt2] = paramInt4;
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     fh
 * JD-Core Version:    0.6.2
 */