/*     */ public class em extends en
/*     */ {
/*  34 */   public String[] p = new String[5];
/*     */ 
/*  41 */   int av = 0;
/*     */ 
/*  37 */   int aa = -1798702208;
/*     */   public int q;
/*  19 */   public String i = "null";
/*     */   public int[] an;
/*  16 */   static ce z = new ce(64);
/*     */   int[] v;
/*  23 */   public int w = 374790245;
/*     */   short[] o;
/*  25 */   public int b = 1235514437;
/*  26 */   public int y = -1303731829;
/*  27 */   public int t = 286207753;
/*     */   static ch n;
/*  29 */   public int k = 1716299847;
/*     */ 
/*  20 */   public int s = 1871312917;
/*     */   short[] a;
/*     */   short[] h;
/*     */   short[] x;
/*  24 */   public int e = 1269778415;
/*     */ 
/*  17 */   static ce g = new ce(50);
/*     */ 
/*  36 */   public int ac = 1932832697;
/*     */ 
/*  39 */   public boolean am = false;
/*     */ 
/*  38 */   int as = -582692480;
/*     */   int[] u;
/*  40 */   int ap = 0;
/*     */ 
/*  28 */   public int f = 1237420091;
/*     */ 
/*  42 */   public int ak = 2009345985;
/*  43 */   public int az = 2005811168;
/*     */ 
/*  45 */   int ah = -1032038783;
/*     */ 
/*  35 */   public boolean ad = true;
/*     */ 
/*  46 */   int ay = -1713529215;
/*  47 */   public boolean al = true;
/*  48 */   public boolean ab = true;
/*     */ 
/*     */   public static em a(int paramInt)
/*     */   {
/*  58 */     em localem = (em)z.r(paramInt);
/*  59 */     if (localem != null) return localem;
/*  60 */     byte[] arrayOfByte = n.l(9, paramInt, 1218953986);
/*  61 */     localem = new em();
/*  62 */     localem.q = (2099104683 * paramInt);
/*  63 */     if (null != arrayOfByte) localem.i(new ev(arrayOfByte), -661860712);
/*  64 */     localem.q(1296902606);
/*  65 */     z.l(localem, paramInt);
/*  66 */     return localem;
/*     */   }
/*     */   void q(int paramInt) {
/*     */   }
/*     */ 
/*     */   void i(ev paramev, int paramInt) {
/*     */     while (true) {
/*  73 */       int j = paramev.t(1118814123);
/*  74 */       if (j == 0) { if (paramInt < 65280);
/*  74 */         break; }
/*  75 */       s(paramev, j, -1548200017);
/*     */     }
/*     */   }
/*     */ 
/*     */   public static em f(int paramInt)
/*     */   {
/*  58 */     em localem = (em)z.r(paramInt);
/*  59 */     if (localem != null) return localem;
/*  60 */     byte[] arrayOfByte = n.l(9, paramInt, 22650484);
/*  61 */     localem = new em();
/*  62 */     localem.q = (2099104683 * paramInt);
/*  63 */     if (null != arrayOfByte) localem.i(new ev(arrayOfByte), -915377493);
/*  64 */     localem.q(-1101911723);
/*  65 */     z.l(localem, paramInt);
/*  66 */     return localem;
/*     */   }
/*     */ 
/*     */   public final fo u(eo parameo1, int paramInt1, eo parameo2, int paramInt2, byte paramByte)
/*     */   {
/* 151 */     if (null != this.an) { if (paramByte > 4);
/* 152 */       localObject = w((byte)0);
/* 153 */       if (localObject == null) { if (paramByte <= 4) throw new IllegalStateException(); return null; }
/* 154 */       return ((em)localObject).u(parameo1, paramInt1, parameo2, paramInt2, (byte)105);
/*     */     }
/* 156 */     Object localObject = (fo)g.r(this.q * -573647101);
/* 157 */     if (localObject == null) { if (paramByte <= 4) throw new IllegalStateException();
/* 158 */       int j = 0;
/* 159 */       for (int m = 0; m < this.u.length; m++) if ((paramByte <= 4) || (!dy.j.c(this.u[m], 0, 726919179))) { if (paramByte <= 4) throw new IllegalStateException(); j = 1; }
/* 160 */       if (j != 0) { if (paramByte <= 4) throw new IllegalStateException(); return null;
/*     */       }
/* 162 */       fw[] arrayOffw = new fw[this.u.length];
/* 163 */       for (int i1 = 0; i1 < this.u.length; i1++) { if (paramByte <= 4) throw new IllegalStateException(); arrayOffw[i1] = fw.b(dy.j, this.u[i1], 0);
/*     */       }
/* 164 */       fw localfw;
/* 164 */       if (1 == arrayOffw.length) { if (paramByte > 4);
/* 164 */         localfw = arrayOffw[0]; } else {
/* 165 */         localfw = new fw(arrayOffw, arrayOffw.length);
/* 166 */       }if (null != this.o) { if (paramByte <= 4) throw new IllegalStateException();
/* 167 */         for (i1 = 0; i1 < this.o.length; i1++) { if (paramByte <= 4) throw new IllegalStateException();
/* 168 */           localfw.aa(this.o[i1], this.a[i1]);
/*     */         }
/*     */       }
/* 171 */       if (null != this.h) { if (paramByte > 4);
/* 172 */         for (i1 = 0; i1 < this.h.length; i1++) { if (paramByte <= 4) throw new IllegalStateException();
/* 173 */           localfw.as(this.h[i1], this.x[i1]);
/*     */         }
/*     */       }
/* 176 */       localObject = localfw.ah(64 + this.ap * -1570416709, 850 + 1400207851 * this.av, -30, -50, -30);
/* 177 */       g.l((en)localObject, -573647101 * this.q);
/*     */     }
/* 180 */     fo localfo;
/* 180 */     if ((parameo1 != null) && ((paramByte <= 4) || (null != parameo2))) { if (paramByte <= 4) throw new IllegalStateException(); localfo = parameo1.e((fo)localObject, paramInt1, parameo2, paramInt2, -1078763104);
/* 181 */     } else if (null != parameo1) { if (paramByte <= 4) throw new IllegalStateException(); localfo = parameo1.u((fo)localObject, paramInt1, -214543847);
/* 182 */     } else if (null != parameo2) { if (paramByte > 4);
/* 182 */       localfo = parameo2.u((fo)localObject, paramInt2, -1573717415); } else {
/* 183 */       localfo = ((fo)localObject).y(true);
/* 184 */     }if (this.aa * 1001201095 == 128) { if (paramByte <= 4) throw new IllegalStateException(); if (this.as * -1348406773 == 128) break label672; if (paramByte <= 4); } localfo.ap(1001201095 * this.aa, -1348406773 * this.as, 1001201095 * this.aa);
/* 185 */     label672: return localfo;
/*     */   }
/*     */ 
/*     */   public final fw v(int paramInt) {
/* 189 */     if (this.an != null) { if (paramInt < -196293817);
/* 190 */       em localem = w((byte)0);
/* 191 */       if (localem == null) { if (paramInt >= -196293817) throw new IllegalStateException(); return null; }
/* 192 */       return localem.v(-1565794611);
/*     */     }
/* 194 */     if (null == this.v) { if (paramInt >= -196293817) throw new IllegalStateException(); return null; }
/* 195 */     int j = 0;
/* 196 */     for (int m = 0; m < this.v.length; m++) { if (paramInt >= -196293817) throw new IllegalStateException(); if (!dy.j.c(this.v[m], 0, -808554740)) { if (paramInt >= -196293817) throw new IllegalStateException(); j = 1; } }
/* 197 */     if (j != 0) { if (paramInt >= -196293817) throw new IllegalStateException(); return null; }
/* 198 */     fw[] arrayOffw = new fw[this.v.length];
/* 199 */     for (int i1 = 0; i1 < this.v.length; i1++) { if (paramInt >= -196293817) throw new IllegalStateException(); arrayOffw[i1] = fw.b(dy.j, this.v[i1], 0);
/*     */     }
/* 201 */     fw localfw;
/* 201 */     if (1 == arrayOffw.length) { if (paramInt >= -196293817) throw new IllegalStateException(); localfw = arrayOffw[0]; } else {
/* 202 */       localfw = new fw(arrayOffw, arrayOffw.length);
/*     */     }
/* 203 */     int i2;
/* 203 */     if (this.o != null) { if (paramInt < -196293817);
/* 204 */       for (i2 = 0; i2 < this.o.length; i2++) { if (paramInt < -196293817);
/* 205 */         localfw.aa(this.o[i2], this.a[i2]);
/*     */       }
/*     */     }
/* 208 */     if (null != this.h) { if (paramInt < -196293817);
/* 209 */       for (i2 = 0; i2 < this.h.length; i2++) { if (paramInt < -196293817);
/* 210 */         localfw.as(this.h[i2], this.x[i2]);
/*     */       }
/*     */     }
/* 213 */     return localfw;
/*     */   }
/*     */ 
/*     */   public final em w(byte paramByte) {
/* 217 */     int j = -1;
/* 218 */     if (this.ah * -136178049 != -1) { if (paramByte == 0);
/* 218 */       j = cc.r(-136178049 * this.ah, 771406341);
/* 219 */     } else if (1935367807 * this.ay != -1) { if (paramByte == 0);
/* 219 */       j = cm.l[(1935367807 * this.ay)]; }
/* 220 */     if ((j >= 0) && ((paramByte != 0) || (j < this.an.length))) { if ((paramByte == 0) && (this.an[j] != -1)) break label122; if (paramByte != 0) throw new IllegalStateException();  } return null;
/* 221 */     label122: return f.g(this.an[j], (byte)-119);
/*     */   }
/*     */ 
/*     */   void am(ev paramev)
/*     */   {
/*     */     while (true)
/*     */     {
/*  73 */       int j = paramev.t(1118814123);
/*  74 */       if (j == 0) break;
/*  75 */       s(paramev, j, -1510534371);
/*     */     }
/*     */   }
/*     */ 
/*     */   void s(ev paramev, int paramInt1, int paramInt2)
/*     */   {
/*  80 */     int j;
/*     */     int m;
/*  80 */     if (paramInt1 == 1) { if (paramInt2 >= -1360137261) throw new IllegalStateException();
/*  81 */       j = paramev.t(1118814123);
/*  82 */       this.u = new int[j];
/*  83 */       for (m = 0; m < j; m++) { if (paramInt2 >= -1360137261) return; this.u[m] = paramev.k(-1987080889); }
/*     */     }
/*  85 */     else if (2 == paramInt1) { if (paramInt2 < -1360137261);
/*  85 */       this.i = paramev.ad(1644676093);
/*  86 */     } else if (paramInt1 == 12) { if (paramInt2 >= -1360137261) throw new IllegalStateException(); this.s = (paramev.t(1118814123) * 1871312917);
/*  87 */     } else if (paramInt1 == 13) { if (paramInt2 >= -1360137261) return; this.w = (paramev.k(-1987080889) * -374790245);
/*  88 */     } else if (paramInt1 == 14) { if (paramInt2 >= -1360137261) throw new IllegalStateException(); this.y = (paramev.k(-1987080889) * 1303731829);
/*  89 */     } else if (15 == paramInt1) { if (paramInt2 >= -1360137261) throw new IllegalStateException(); this.e = (paramev.k(-1987080889) * -1269778415);
/*  90 */     } else if (paramInt1 == 16) { if (paramInt2 < -1360137261);
/*  90 */       this.b = (paramev.k(-1987080889) * -1235514437);
/*  91 */     } else if (17 == paramInt1) { if (paramInt2 >= -1360137261) return;
/*  92 */       this.y = (paramev.k(-1987080889) * 1303731829);
/*  93 */       this.t = (paramev.k(-1987080889) * -286207753);
/*  94 */       this.f = (paramev.k(-1987080889) * -1237420091);
/*  95 */       this.k = (paramev.k(-1987080889) * -1716299847);
/*     */     }
/*  97 */     else if ((paramInt1 >= 30) && ((paramInt2 >= -1360137261) || (paramInt1 < 35))) { if (paramInt2 < -1360137261);
/*  98 */       this.p[(paramInt1 - 30)] = paramev.ad(-673336970);
/*  99 */       if (this.p[(paramInt1 - 30)].equalsIgnoreCase(ba.m)) { if (paramInt2 >= -1360137261) throw new IllegalStateException(); this.p[(paramInt1 - 30)] = null; }
/*     */     }
/* 101 */     else if (paramInt1 == 40) { if (paramInt2 < -1360137261);
/* 102 */       j = paramev.t(1118814123);
/* 103 */       this.o = new short[j];
/* 104 */       this.a = new short[j];
/* 105 */       for (m = 0; m < j; m++) { if (paramInt2 < -1360137261);
/* 106 */         this.o[m] = ((short)paramev.k(-1987080889));
/* 107 */         this.a[m] = ((short)paramev.k(-1987080889));
/*     */       }
/*     */     }
/* 110 */     else if (41 == paramInt1) { if (paramInt2 < -1360137261);
/* 111 */       j = paramev.t(1118814123);
/* 112 */       this.h = new short[j];
/* 113 */       this.x = new short[j];
/* 114 */       for (m = 0; m < j; m++) { if (paramInt2 < -1360137261);
/* 115 */         this.h[m] = ((short)paramev.k(-1987080889));
/* 116 */         this.x[m] = ((short)paramev.k(-1987080889));
/*     */       }
/*     */     }
/* 119 */     else if (60 == paramInt1) { if (paramInt2 >= -1360137261) return;
/* 120 */       j = paramev.t(1118814123);
/* 121 */       this.v = new int[j];
/* 122 */       for (m = 0; m < j; m++) { if (paramInt2 >= -1360137261) throw new IllegalStateException(); this.v[m] = paramev.k(-1987080889); }
/*     */     }
/* 124 */     else if (93 == paramInt1) { if (paramInt2 < -1360137261);
/* 124 */       this.ad = false;
/* 125 */     } else if (95 == paramInt1) { if (paramInt2 < -1360137261);
/* 125 */       this.ac = (paramev.k(-1987080889) * -1932832697);
/* 126 */     } else if (97 == paramInt1) { if (paramInt2 >= -1360137261) return; this.aa = (paramev.k(-1987080889) * -920022025);
/* 127 */     } else if (98 == paramInt1) { if (paramInt2 < -1360137261);
/* 127 */       this.as = (paramev.k(-1987080889) * -306542173);
/* 128 */     } else if (paramInt1 == 99) { if (paramInt2 >= -1360137261) throw new IllegalStateException(); this.am = true;
/* 129 */     } else if (paramInt1 == 100) { if (paramInt2 >= -1360137261) throw new IllegalStateException(); this.ap = (paramev.f(2002687137) * 474076531);
/* 130 */     } else if (paramInt1 == 101) { if (paramInt2 >= -1360137261) throw new IllegalStateException(); this.av = (paramev.f(2002687137) * 888766927);
/* 131 */     } else if (102 == paramInt1) { if (paramInt2 >= -1360137261) throw new IllegalStateException(); this.ak = (paramev.k(-1987080889) * -2009345985);
/* 132 */     } else if (paramInt1 == 103) { if (paramInt2 >= -1360137261) throw new IllegalStateException(); this.az = (paramev.k(-1987080889) * 465334783);
/* 133 */     } else if (106 == paramInt1) { if (paramInt2 >= -1360137261) return;
/* 134 */       this.ah = (paramev.k(-1987080889) * 1032038783);
/* 135 */       if (this.ah * -136178049 == 65535) { if (paramInt2 >= -1360137261) throw new IllegalStateException(); this.ah = -1032038783; }
/* 136 */       this.ay = (paramev.k(-1987080889) * 1713529215);
/* 137 */       if (65535 == this.ay * 1935367807) { if (paramInt2 < -1360137261);
/* 137 */         this.ay = -1713529215; }
/* 138 */       j = paramev.t(1118814123);
/* 139 */       this.an = new int[1 + j];
/* 140 */       for (m = 0; m <= j; m++) { if (paramInt2 < -1360137261);
/* 141 */         this.an[m] = paramev.k(-1987080889);
/* 142 */         if (this.an[m] == 65535) { if (paramInt2 < -1360137261);
/* 142 */           this.an[m] = -1; }
/*     */       }
/*     */     }
/* 145 */     else if (107 == paramInt1) { if (paramInt2 < -1360137261);
/* 145 */       this.al = false;
/* 146 */     } else if (paramInt1 == 109) { if (paramInt2 < -1360137261);
/* 146 */       this.ab = false;
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void t(ch paramch1, ch paramch2)
/*     */   {
/*  53 */     n = paramch1;
/*  54 */     dy.j = paramch2;
/*     */   }
/*     */ 
/*     */   public static void ao()
/*     */   {
/* 234 */     z.m();
/* 235 */     g.m();
/*     */   }
/*     */ 
/*     */   public static em k(int paramInt)
/*     */   {
/*  58 */     em localem = (em)z.r(paramInt);
/*  59 */     if (localem != null) return localem;
/*  60 */     byte[] arrayOfByte = n.l(9, paramInt, 64825150);
/*  61 */     localem = new em();
/*  62 */     localem.q = (2099104683 * paramInt);
/*  63 */     if (null != arrayOfByte) localem.i(new ev(arrayOfByte), -917608725);
/*  64 */     localem.q(1251513961);
/*  65 */     z.l(localem, paramInt);
/*  66 */     return localem;
/*     */   }
/*     */ 
/*     */   public static em o(int paramInt)
/*     */   {
/*  58 */     em localem = (em)z.r(paramInt);
/*  59 */     if (localem != null) return localem;
/*  60 */     byte[] arrayOfByte = n.l(9, paramInt, 586930358);
/*  61 */     localem = new em();
/*  62 */     localem.q = (2099104683 * paramInt);
/*  63 */     if (null != arrayOfByte) localem.i(new ev(arrayOfByte), -1216060751);
/*  64 */     localem.q(1876585977);
/*  65 */     z.l(localem, paramInt);
/*  66 */     return localem;
/*     */   }
/*     */ 
/*     */   public boolean e(int paramInt)
/*     */   {
/* 225 */     if (this.an == null) { if (paramInt != -418538595) throw new IllegalStateException(); return true; }
/* 226 */     int j = -1;
/* 227 */     if (this.ah * -136178049 != -1) { if (paramInt == -418538595);
/* 227 */       j = cc.r(-136178049 * this.ah, 408180905);
/* 228 */     } else if (-1 != this.ay * 1935367807) { if (paramInt == -418538595);
/* 228 */       j = cm.l[(this.ay * 1935367807)]; }
/* 229 */     if (j >= 0) { if (paramInt != -418538595) throw new IllegalStateException(); if (j < this.an.length) { if ((paramInt == -418538595) && (-1 != this.an[j])) break label157; if (paramInt != -418538595); }  } return false;
/* 230 */     label157: return true;
/*     */   }
/*     */ 
/*     */   public static em h(int paramInt)
/*     */   {
/*  58 */     em localem = (em)z.r(paramInt);
/*  59 */     if (localem != null) return localem;
/*  60 */     byte[] arrayOfByte = n.l(9, paramInt, 1725193996);
/*  61 */     localem = new em();
/*  62 */     localem.q = (2099104683 * paramInt);
/*  63 */     if (null != arrayOfByte) localem.i(new ev(arrayOfByte), -960965526);
/*  64 */     localem.q(-1294118258);
/*  65 */     z.l(localem, paramInt);
/*  66 */     return localem;
/*     */   }
/*     */ 
/*     */   public final em ay()
/*     */   {
/* 217 */     int j = -1;
/* 218 */     if (this.ah * -136178049 != -1) j = cc.r(-136178049 * this.ah, 221043821);
/* 219 */     else if (1935367807 * this.ay != -1) j = cm.l[(1935367807 * this.ay)];
/* 220 */     if ((j < 0) || (j >= this.an.length) || (this.an[j] == -1)) return null;
/* 221 */     return f.g(this.an[j], (byte)-97);
/*     */   }
/*     */ 
/*     */   void p()
/*     */   {
/*     */   }
/*     */ 
/*     */   void ad(ev paramev)
/*     */   {
/*     */     while (true)
/*     */     {
/*  73 */       int j = paramev.t(1118814123);
/*  74 */       if (j == 0) break;
/*  75 */       s(paramev, j, -1478780800);
/*     */     }
/*     */   }
/*     */ 
/*     */   void aa(ev paramev)
/*     */   {
/*     */     while (true)
/*     */     {
/*  73 */       int j = paramev.t(1118814123);
/*  74 */       if (j == 0) break;
/*  75 */       s(paramev, j, -1580296130);
/*     */     }
/*     */   }
/*     */ 
/*     */   void ac(ev paramev)
/*     */   {
/*     */     while (true)
/*     */     {
/*  73 */       int j = paramev.t(1118814123);
/*  74 */       if (j == 0) break;
/*  75 */       s(paramev, j, -1812543472);
/*     */     }
/*     */   }
/*     */ 
/*     */   void as(ev paramev)
/*     */   {
/*     */     while (true)
/*     */     {
/*  73 */       int j = paramev.t(1118814123);
/*  74 */       if (j == 0) break;
/*  75 */       s(paramev, j, -1898697437);
/*     */     }
/*     */   }
/*     */ 
/*     */   void x()
/*     */   {
/*     */   }
/*     */ 
/*     */   void ap(ev paramev, int paramInt)
/*     */   {
/*     */     int j;
/*     */     int m;
/*  80 */     if (paramInt == 1) {
/*  81 */       j = paramev.t(1118814123);
/*  82 */       this.u = new int[j];
/*  83 */       for (m = 0; m < j; m++) this.u[m] = paramev.k(-1987080889);
/*     */     }
/*  85 */     else if (2 == paramInt) { this.i = paramev.ad(-1118700914);
/*  86 */     } else if (paramInt == 12) { this.s = (paramev.t(1118814123) * 1871312917);
/*  87 */     } else if (paramInt == 13) { this.w = (paramev.k(-1987080889) * -374790245);
/*  88 */     } else if (paramInt == 14) { this.y = (paramev.k(-1987080889) * 1303731829);
/*  89 */     } else if (15 == paramInt) { this.e = (paramev.k(-1987080889) * -1269778415);
/*  90 */     } else if (paramInt == 16) { this.b = (paramev.k(-1987080889) * -1235514437);
/*  91 */     } else if (17 == paramInt) {
/*  92 */       this.y = (paramev.k(-1987080889) * 1303731829);
/*  93 */       this.t = (paramev.k(-1987080889) * -286207753);
/*  94 */       this.f = (paramev.k(-1987080889) * -1237420091);
/*  95 */       this.k = (paramev.k(-1987080889) * -1716299847);
/*     */     }
/*  97 */     else if ((paramInt >= 30) && (paramInt < 35)) {
/*  98 */       this.p[(paramInt - 30)] = paramev.ad(1312766093);
/*  99 */       if (this.p[(paramInt - 30)].equalsIgnoreCase(ba.m)) this.p[(paramInt - 30)] = null;
/*     */     }
/* 101 */     else if (paramInt == 40) {
/* 102 */       j = paramev.t(1118814123);
/* 103 */       this.o = new short[j];
/* 104 */       this.a = new short[j];
/* 105 */       for (m = 0; m < j; m++) {
/* 106 */         this.o[m] = ((short)paramev.k(-1987080889));
/* 107 */         this.a[m] = ((short)paramev.k(-1987080889));
/*     */       }
/*     */     }
/* 110 */     else if (41 == paramInt) {
/* 111 */       j = paramev.t(1118814123);
/* 112 */       this.h = new short[j];
/* 113 */       this.x = new short[j];
/* 114 */       for (m = 0; m < j; m++) {
/* 115 */         this.h[m] = ((short)paramev.k(-1987080889));
/* 116 */         this.x[m] = ((short)paramev.k(-1987080889));
/*     */       }
/*     */     }
/* 119 */     else if (60 == paramInt) {
/* 120 */       j = paramev.t(1118814123);
/* 121 */       this.v = new int[j];
/* 122 */       for (m = 0; m < j; m++) this.v[m] = paramev.k(-1987080889);
/*     */     }
/* 124 */     else if (93 == paramInt) { this.ad = false;
/* 125 */     } else if (95 == paramInt) { this.ac = (paramev.k(-1987080889) * -1932832697);
/* 126 */     } else if (97 == paramInt) { this.aa = (paramev.k(-1987080889) * -920022025);
/* 127 */     } else if (98 == paramInt) { this.as = (paramev.k(-1987080889) * -306542173);
/* 128 */     } else if (paramInt == 99) { this.am = true;
/* 129 */     } else if (paramInt == 100) { this.ap = (paramev.f(2002687137) * 474076531);
/* 130 */     } else if (paramInt == 101) { this.av = (paramev.f(2002687137) * 888766927);
/* 131 */     } else if (102 == paramInt) { this.ak = (paramev.k(-1987080889) * -2009345985);
/* 132 */     } else if (paramInt == 103) { this.az = (paramev.k(-1987080889) * 465334783);
/* 133 */     } else if (106 == paramInt) {
/* 134 */       this.ah = (paramev.k(-1987080889) * 1032038783);
/* 135 */       if (this.ah * -136178049 == 65535) this.ah = -1032038783;
/* 136 */       this.ay = (paramev.k(-1987080889) * 1713529215);
/* 137 */       if (65535 == this.ay * 1935367807) this.ay = -1713529215;
/* 138 */       j = paramev.t(1118814123);
/* 139 */       this.an = new int[1 + j];
/* 140 */       for (m = 0; m <= j; m++) {
/* 141 */         this.an[m] = paramev.k(-1987080889);
/* 142 */         if (this.an[m] == 65535) this.an[m] = -1;
/*     */       }
/*     */     }
/* 145 */     else if (107 == paramInt) { this.al = false;
/* 146 */     } else if (paramInt == 109) { this.ab = false; }
/*     */ 
/*     */   }
/*     */ 
/*     */   void av(ev paramev, int paramInt)
/*     */   {
/*     */     int j;
/*     */     int m;
/*  80 */     if (paramInt == 1) {
/*  81 */       j = paramev.t(1118814123);
/*  82 */       this.u = new int[j];
/*  83 */       for (m = 0; m < j; m++) this.u[m] = paramev.k(-1987080889);
/*     */     }
/*  85 */     else if (2 == paramInt) { this.i = paramev.ad(743930641);
/*  86 */     } else if (paramInt == 12) { this.s = (paramev.t(1118814123) * 1871312917);
/*  87 */     } else if (paramInt == 13) { this.w = (paramev.k(-1987080889) * -374790245);
/*  88 */     } else if (paramInt == 14) { this.y = (paramev.k(-1987080889) * 1303731829);
/*  89 */     } else if (15 == paramInt) { this.e = (paramev.k(-1987080889) * -1269778415);
/*  90 */     } else if (paramInt == 16) { this.b = (paramev.k(-1987080889) * -1235514437);
/*  91 */     } else if (17 == paramInt) {
/*  92 */       this.y = (paramev.k(-1987080889) * 1303731829);
/*  93 */       this.t = (paramev.k(-1987080889) * -286207753);
/*  94 */       this.f = (paramev.k(-1987080889) * -1237420091);
/*  95 */       this.k = (paramev.k(-1987080889) * -1716299847);
/*     */     }
/*  97 */     else if ((paramInt >= 30) && (paramInt < 35)) {
/*  98 */       this.p[(paramInt - 30)] = paramev.ad(1524247351);
/*  99 */       if (this.p[(paramInt - 30)].equalsIgnoreCase(ba.m)) this.p[(paramInt - 30)] = null;
/*     */     }
/* 101 */     else if (paramInt == 40) {
/* 102 */       j = paramev.t(1118814123);
/* 103 */       this.o = new short[j];
/* 104 */       this.a = new short[j];
/* 105 */       for (m = 0; m < j; m++) {
/* 106 */         this.o[m] = ((short)paramev.k(-1987080889));
/* 107 */         this.a[m] = ((short)paramev.k(-1987080889));
/*     */       }
/*     */     }
/* 110 */     else if (41 == paramInt) {
/* 111 */       j = paramev.t(1118814123);
/* 112 */       this.h = new short[j];
/* 113 */       this.x = new short[j];
/* 114 */       for (m = 0; m < j; m++) {
/* 115 */         this.h[m] = ((short)paramev.k(-1987080889));
/* 116 */         this.x[m] = ((short)paramev.k(-1987080889));
/*     */       }
/*     */     }
/* 119 */     else if (60 == paramInt) {
/* 120 */       j = paramev.t(1118814123);
/* 121 */       this.v = new int[j];
/* 122 */       for (m = 0; m < j; m++) this.v[m] = paramev.k(-1987080889);
/*     */     }
/* 124 */     else if (93 == paramInt) { this.ad = false;
/* 125 */     } else if (95 == paramInt) { this.ac = (paramev.k(-1987080889) * -1932832697);
/* 126 */     } else if (97 == paramInt) { this.aa = (paramev.k(-1987080889) * -920022025);
/* 127 */     } else if (98 == paramInt) { this.as = (paramev.k(-1987080889) * -306542173);
/* 128 */     } else if (paramInt == 99) { this.am = true;
/* 129 */     } else if (paramInt == 100) { this.ap = (paramev.f(2002687137) * 474076531);
/* 130 */     } else if (paramInt == 101) { this.av = (paramev.f(2002687137) * 888766927);
/* 131 */     } else if (102 == paramInt) { this.ak = (paramev.k(-1987080889) * -2009345985);
/* 132 */     } else if (paramInt == 103) { this.az = (paramev.k(-1987080889) * 465334783);
/* 133 */     } else if (106 == paramInt) {
/* 134 */       this.ah = (paramev.k(-1987080889) * 1032038783);
/* 135 */       if (this.ah * -136178049 == 65535) this.ah = -1032038783;
/* 136 */       this.ay = (paramev.k(-1987080889) * 1713529215);
/* 137 */       if (65535 == this.ay * 1935367807) this.ay = -1713529215;
/* 138 */       j = paramev.t(1118814123);
/* 139 */       this.an = new int[1 + j];
/* 140 */       for (m = 0; m <= j; m++) {
/* 141 */         this.an[m] = paramev.k(-1987080889);
/* 142 */         if (this.an[m] == 65535) this.an[m] = -1;
/*     */       }
/*     */     }
/* 145 */     else if (107 == paramInt) { this.al = false;
/* 146 */     } else if (paramInt == 109) { this.ab = false; }
/*     */   }
/*     */ 
/*     */   public final fo ak(eo parameo1, int paramInt1, eo parameo2, int paramInt2)
/*     */   {
/* 151 */     if (null != this.an) {
/* 152 */       localObject = w((byte)0);
/* 153 */       if (localObject == null) return null;
/* 154 */       return ((em)localObject).u(parameo1, paramInt1, parameo2, paramInt2, (byte)53);
/*     */     }
/* 156 */     Object localObject = (fo)g.r(this.q * -573647101);
/* 157 */     if (localObject == null) {
/* 158 */       int j = 0;
/* 159 */       for (int m = 0; m < this.u.length; m++) if (!dy.j.c(this.u[m], 0, -754361724)) j = 1;
/* 160 */       if (j != 0) return null;
/*     */ 
/* 162 */       fw[] arrayOffw = new fw[this.u.length];
/* 163 */       for (int i1 = 0; i1 < this.u.length; i1++) arrayOffw[i1] = fw.b(dy.j, this.u[i1], 0);
/* 164 */       fw localfw;
/* 164 */       if (1 == arrayOffw.length) localfw = arrayOffw[0]; else
/* 165 */         localfw = new fw(arrayOffw, arrayOffw.length);
/* 166 */       if (null != this.o) {
/* 167 */         for (i1 = 0; i1 < this.o.length; i1++) {
/* 168 */           localfw.aa(this.o[i1], this.a[i1]);
/*     */         }
/*     */       }
/* 171 */       if (null != this.h) {
/* 172 */         for (i1 = 0; i1 < this.h.length; i1++) {
/* 173 */           localfw.as(this.h[i1], this.x[i1]);
/*     */         }
/*     */       }
/* 176 */       localObject = localfw.ah(64 + this.ap * -1570416709, 850 + 1400207851 * this.av, -30, -50, -30);
/* 177 */       g.l((en)localObject, -573647101 * this.q);
/*     */     }
/* 180 */     fo localfo;
/* 180 */     if ((parameo1 != null) && (null != parameo2)) localfo = parameo1.e((fo)localObject, paramInt1, parameo2, paramInt2, -1078763104);
/* 181 */     else if (null != parameo1) localfo = parameo1.u((fo)localObject, paramInt1, -734335920);
/* 182 */     else if (null != parameo2) localfo = parameo2.u((fo)localObject, paramInt2, 1262564196); else
/* 183 */       localfo = ((fo)localObject).y(true);
/* 184 */     if ((this.aa * 1001201095 != 128) || (this.as * -1348406773 != 128)) localfo.ap(1001201095 * this.aa, -1348406773 * this.as, 1001201095 * this.aa);
/* 185 */     return localfo;
/*     */   }
/*     */ 
/*     */   public final fw az() {
/* 189 */     if (this.an != null) {
/* 190 */       em localem = w((byte)0);
/* 191 */       if (localem == null) return null;
/* 192 */       return localem.v(-415016754);
/*     */     }
/* 194 */     if (null == this.v) return null;
/* 195 */     int j = 0;
/* 196 */     for (int m = 0; m < this.v.length; m++) if (!dy.j.c(this.v[m], 0, 1531901261)) j = 1;
/* 197 */     if (j != 0) return null;
/* 198 */     fw[] arrayOffw = new fw[this.v.length];
/* 199 */     for (int i1 = 0; i1 < this.v.length; i1++) arrayOffw[i1] = fw.b(dy.j, this.v[i1], 0);
/* 201 */     fw localfw;
/* 201 */     if (1 == arrayOffw.length) localfw = arrayOffw[0]; else
/* 202 */       localfw = new fw(arrayOffw, arrayOffw.length);
/*     */     int i2;
/* 203 */     if (this.o != null) {
/* 204 */       for (i2 = 0; i2 < this.o.length; i2++) {
/* 205 */         localfw.aa(this.o[i2], this.a[i2]);
/*     */       }
/*     */     }
/* 208 */     if (null != this.h) {
/* 209 */       for (i2 = 0; i2 < this.h.length; i2++) {
/* 210 */         localfw.as(this.h[i2], this.x[i2]);
/*     */       }
/*     */     }
/* 213 */     return localfw;
/*     */   }
/*     */ 
/*     */   public final fw an()
/*     */   {
/* 189 */     if (this.an != null) {
/* 190 */       em localem = w((byte)0);
/* 191 */       if (localem == null) return null;
/* 192 */       return localem.v(-1741841757);
/*     */     }
/* 194 */     if (null == this.v) return null;
/* 195 */     int j = 0;
/* 196 */     for (int m = 0; m < this.v.length; m++) if (!dy.j.c(this.v[m], 0, -907261914)) j = 1;
/* 197 */     if (j != 0) return null;
/* 198 */     fw[] arrayOffw = new fw[this.v.length];
/* 199 */     for (int i1 = 0; i1 < this.v.length; i1++) arrayOffw[i1] = fw.b(dy.j, this.v[i1], 0);
/* 201 */     fw localfw;
/* 201 */     if (1 == arrayOffw.length) localfw = arrayOffw[0]; else
/* 202 */       localfw = new fw(arrayOffw, arrayOffw.length);
/*     */     int i2;
/* 203 */     if (this.o != null) {
/* 204 */       for (i2 = 0; i2 < this.o.length; i2++) {
/* 205 */         localfw.aa(this.o[i2], this.a[i2]);
/*     */       }
/*     */     }
/* 208 */     if (null != this.h) {
/* 209 */       for (i2 = 0; i2 < this.h.length; i2++) {
/* 210 */         localfw.as(this.h[i2], this.x[i2]);
/*     */       }
/*     */     }
/* 213 */     return localfw;
/*     */   }
/*     */ 
/*     */   public final fw ah()
/*     */   {
/* 189 */     if (this.an != null) {
/* 190 */       em localem = w((byte)0);
/* 191 */       if (localem == null) return null;
/* 192 */       return localem.v(-1572810894);
/*     */     }
/* 194 */     if (null == this.v) return null;
/* 195 */     int j = 0;
/* 196 */     for (int m = 0; m < this.v.length; m++) if (!dy.j.c(this.v[m], 0, 1130301369)) j = 1;
/* 197 */     if (j != 0) return null;
/* 198 */     fw[] arrayOffw = new fw[this.v.length];
/* 199 */     for (int i1 = 0; i1 < this.v.length; i1++) arrayOffw[i1] = fw.b(dy.j, this.v[i1], 0);
/* 201 */     fw localfw;
/* 201 */     if (1 == arrayOffw.length) localfw = arrayOffw[0]; else
/* 202 */       localfw = new fw(arrayOffw, arrayOffw.length);
/*     */     int i2;
/* 203 */     if (this.o != null) {
/* 204 */       for (i2 = 0; i2 < this.o.length; i2++) {
/* 205 */         localfw.aa(this.o[i2], this.a[i2]);
/*     */       }
/*     */     }
/* 208 */     if (null != this.h) {
/* 209 */       for (i2 = 0; i2 < this.h.length; i2++) {
/* 210 */         localfw.as(this.h[i2], this.x[i2]);
/*     */       }
/*     */     }
/* 213 */     return localfw;
/*     */   }
/*     */ 
/*     */   public static void y(ch paramch1, ch paramch2)
/*     */   {
/*  53 */     n = paramch1;
/*  54 */     dy.j = paramch2;
/*     */   }
/*     */ 
/*     */   public final em al()
/*     */   {
/* 217 */     int j = -1;
/* 218 */     if (this.ah * -136178049 != -1) j = cc.r(-136178049 * this.ah, 840375079);
/* 219 */     else if (1935367807 * this.ay != -1) j = cm.l[(1935367807 * this.ay)];
/* 220 */     if ((j < 0) || (j >= this.an.length) || (this.an[j] == -1)) return null;
/* 221 */     return f.g(this.an[j], (byte)-33);
/*     */   }
/*     */ 
/*     */   public static void ab()
/*     */   {
/* 234 */     z.m();
/* 235 */     g.m();
/*     */   }
/*     */ 
/*     */   static void c(String paramString1, String paramString2, String paramString3, int paramInt)
/*     */   {
/* 530 */     g.av = paramString1;
/* 531 */     g.ak = paramString2;
/* 532 */     g.az = paramString3;
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     em
 * JD-Core Version:    0.6.2
 */