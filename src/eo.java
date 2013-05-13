/*     */ public class eo extends en
/*     */ {
/*     */   static ch z;
/*  15 */   static ce g = new ce(64);
/*     */ 
/*  27 */   public int k = 473025837;
/*     */   public int[] i;
/*     */   int[] s;
/*     */   public int[] u;
/*     */   public int[] v;
/*  21 */   public int w = 1512364377;
/*     */   int[] e;
/*  16 */   static ce q = new ce(100);
/*     */ 
/*  24 */   public int y = 1256278771;
/*  25 */   public int t = 1787510895;
/*  26 */   public int f = 586514861;
/*     */ 
/*  23 */   public boolean b = false;
/*     */ 
/*  28 */   public int o = 1122032315;
/*  29 */   public int a = -867837727;
/*  30 */   public int h = -1365551814;
/*     */ 
/*     */   static fr al(int paramInt)
/*     */   {
/* 187 */     Object localObject = (fr)q.r(paramInt);
/* 188 */     if (null != localObject) return localObject;
/*     */ 
/* 190 */     ch localch1 = ag.j;
/* 191 */     ch localch2 = z;
/*     */ 
/* 193 */     int j = 1;
/* 194 */     int[] arrayOfInt = localch1.s(paramInt, 1814052165);
/* 195 */     for (int m = 0; m < arrayOfInt.length; m++) {
/* 196 */       byte[] arrayOfByte1 = localch1.g(paramInt, arrayOfInt[m], -722973390);
/* 197 */       if (null == arrayOfByte1) {
/* 198 */         j = 0;
/*     */       }
/*     */       else {
/* 201 */         int n = (arrayOfByte1[0] & 0xFF) << 8 | arrayOfByte1[1] & 0xFF;
/*     */ 
/* 204 */         byte[] arrayOfByte2 = localch2.g(n, 0, -5129654);
/* 205 */         if (null == arrayOfByte2) j = 0;
/*     */       }
/*     */     }
/*     */     fr localfr;
/* 207 */     if (j == 0)
/* 208 */       localfr = null;
/*     */     else {
/*     */       try
/*     */       {
/* 212 */         localfr = new fr(localch1, localch2, paramInt, false);
/*     */       }
/*     */       catch (Exception localException) {
/* 215 */         localfr = null;
/*     */       }
/*     */     }
/* 218 */     localObject = localfr;
/* 219 */     if (null != localObject) q.l((en)localObject, paramInt);
/* 220 */     return localObject;
/*     */   }
/*     */ 
/*     */   void q(ev paramev, short paramShort)
/*     */   {
/*     */     while (true)
/*     */     {
/*  53 */       int j = paramev.t(1118814123);
/*  54 */       if (0 == j) { if (paramShort < 128);
/*  54 */         break; }
/*  55 */       i(paramev, j, (byte)22);
/*     */     }
/*     */   }
/*     */ 
/*     */   void i(ev paramev, int paramInt, byte paramByte)
/*     */   {
/*  60 */     int j;
/*     */     int m;
/*  60 */     if (1 == paramInt) { if (paramByte == 0) throw new IllegalStateException();
/*  61 */       j = paramev.k(-1987080889);
/*  62 */       this.u = new int[j];
/*  63 */       for (m = 0; m < j; m++) { if (paramByte == 0) return; this.u[m] = paramev.k(-1987080889); }
/*  64 */       this.i = new int[j];
/*  65 */       for (m = 0; m < j; m++) { if (paramByte == 0) throw new IllegalStateException(); this.i[m] = paramev.k(-1987080889); }
/*  66 */       for (m = 0; m < j; m++) { if (paramByte == 0) throw new IllegalStateException(); this.i[m] = ((paramev.k(-1987080889) << 16) + this.i[m]); }
/*     */     }
/*  68 */     else if (2 == paramInt) { if (paramByte != 0);
/*  68 */       this.w = (paramev.k(-1987080889) * -1512364377);
/*  69 */     } else if (3 == paramInt) { if (paramByte == 0) return;
/*  70 */       j = paramev.t(1118814123);
/*  71 */       this.e = new int[j + 1];
/*  72 */       for (m = 0; m < j; m++) { if (paramByte != 0);
/*  72 */         this.e[m] = paramev.t(1118814123); }
/*  73 */       this.e[j] = 9999999;
/*     */     }
/*  75 */     else if (4 == paramInt) { if (paramByte == 0) return; this.b = true;
/*  76 */     } else if (paramInt == 5) { if (paramByte != 0);
/*  76 */       this.y = (paramev.t(1118814123) * -607737705);
/*  77 */     } else if (paramInt == 6) { if (paramByte == 0) return; this.t = (paramev.k(-1987080889) * -1787510895);
/*  78 */     } else if (7 == paramInt) { if (paramByte == 0) return; this.f = (paramev.k(-1987080889) * -586514861);
/*  79 */     } else if (8 == paramInt) { if (paramByte == 0) throw new IllegalStateException(); this.k = (paramev.t(1118814123) * 265079087);
/*  80 */     } else if (paramInt == 9) { if (paramByte == 0) return; this.o = (paramev.t(1118814123) * -1122032315);
/*  81 */     } else if (10 == paramInt) { if (paramByte == 0) return; this.a = (paramev.t(1118814123) * 867837727);
/*  82 */     } else if (11 == paramInt) { if (paramByte != 0);
/*  82 */       this.h = (paramev.t(1118814123) * -682775907);
/*  83 */     } else if (paramInt == 12) { if (paramByte == 0) throw new IllegalStateException();
/*  84 */       j = paramev.t(1118814123);
/*  85 */       this.s = new int[j];
/*  86 */       for (m = 0; m < j; m++) { if (paramByte != 0);
/*  86 */         this.s[m] = paramev.k(-1987080889); }
/*  87 */       for (m = 0; m < j; m++) { if (paramByte == 0) return; this.s[m] = ((paramev.k(-1987080889) << 16) + this.s[m]); }
/*     */     }
/*  89 */     else if (paramInt == 13) { if (paramByte == 0) throw new IllegalStateException();
/*  90 */       j = paramev.t(1118814123);
/*  91 */       this.v = new int[j];
/*  92 */       for (m = 0; m < j; m++) { if (paramByte == 0) throw new IllegalStateException(); this.v[m] = paramev.a(94); }
/*     */     }
/*     */   }
/*     */ 
/*     */   void s(byte paramByte)
/*     */   {
/*  98 */     if (this.o * 1295492493 == -1) { if (paramByte != 1) return;
/*  99 */       if (null != this.e) { if (paramByte == 1);
/*  99 */         this.o = 2050902666; } else {
/* 100 */         this.o = 0;
/*     */       } }
/* 102 */     if (679908575 * this.a == -1) { if (paramByte != 1) return;
/* 103 */       if (null != this.e) { if (paramByte != 1) throw new IllegalStateException(); this.a = 1735675454; } else {
/* 104 */         this.a = 0;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   void h(ev paramev, int paramInt)
/*     */   {
/*     */     int j;
/*     */     int m;
/*  60 */     if (1 == paramInt) {
/*  61 */       j = paramev.k(-1987080889);
/*  62 */       this.u = new int[j];
/*  63 */       for (m = 0; m < j; m++) this.u[m] = paramev.k(-1987080889);
/*  64 */       this.i = new int[j];
/*  65 */       for (m = 0; m < j; m++) this.i[m] = paramev.k(-1987080889);
/*  66 */       for (m = 0; m < j; m++) this.i[m] = ((paramev.k(-1987080889) << 16) + this.i[m]);
/*     */     }
/*  68 */     else if (2 == paramInt) { this.w = (paramev.k(-1987080889) * -1512364377);
/*  69 */     } else if (3 == paramInt) {
/*  70 */       j = paramev.t(1118814123);
/*  71 */       this.e = new int[j + 1];
/*  72 */       for (m = 0; m < j; m++) this.e[m] = paramev.t(1118814123);
/*  73 */       this.e[j] = 9999999;
/*     */     }
/*  75 */     else if (4 == paramInt) { this.b = true;
/*  76 */     } else if (paramInt == 5) { this.y = (paramev.t(1118814123) * -607737705);
/*  77 */     } else if (paramInt == 6) { this.t = (paramev.k(-1987080889) * -1787510895);
/*  78 */     } else if (7 == paramInt) { this.f = (paramev.k(-1987080889) * -586514861);
/*  79 */     } else if (8 == paramInt) { this.k = (paramev.t(1118814123) * 265079087);
/*  80 */     } else if (paramInt == 9) { this.o = (paramev.t(1118814123) * -1122032315);
/*  81 */     } else if (10 == paramInt) { this.a = (paramev.t(1118814123) * 867837727);
/*  82 */     } else if (11 == paramInt) { this.h = (paramev.t(1118814123) * -682775907);
/*  83 */     } else if (paramInt == 12) {
/*  84 */       j = paramev.t(1118814123);
/*  85 */       this.s = new int[j];
/*  86 */       for (m = 0; m < j; m++) this.s[m] = paramev.k(-1987080889);
/*  87 */       for (m = 0; m < j; m++) this.s[m] = ((paramev.k(-1987080889) << 16) + this.s[m]);
/*     */     }
/*  89 */     else if (paramInt == 13) {
/*  90 */       j = paramev.t(1118814123);
/*  91 */       this.v = new int[j];
/*  92 */       for (m = 0; m < j; m++) this.v[m] = paramev.a(113);
/*     */     }
/*     */   }
/*     */ 
/*     */   fo v(fo paramfo, int paramInt1, int paramInt2, byte paramByte)
/*     */   {
/* 119 */     paramInt1 = this.i[paramInt1];
/* 120 */     fr localfr = bi.y(paramInt1 >> 16, (byte)81);
/* 121 */     paramInt1 &= 65535;
/* 122 */     if (null == localfr) { if (paramByte > -105);
/* 122 */       return paramfo.y(true); }
/* 123 */     if (!localfr.z(paramInt1, (byte)0)) tmpTernaryOp = 1;
/*     */   }
/*     */ 
/*     */   void p()
/*     */   {
/*  98 */     if (this.o * 1295492493 == -1) {
/*  99 */       if (null != this.e) this.o = 2050902666; else
/* 100 */         this.o = 0;
/*     */     }
/* 102 */     if (679908575 * this.a == -1)
/* 103 */       if (null != this.e) this.a = 1735675454; else
/* 104 */         this.a = 0;
/*     */   }
/*     */ 
/*     */   public fo e(fo paramfo, int paramInt1, eo parameo, int paramInt2, int paramInt3)
/*     */   {
/* 146 */     paramInt1 = this.i[paramInt1];
/* 147 */     fr localfr1 = bi.y(paramInt1 >> 16, (byte)81);
/* 148 */     paramInt1 &= 65535;
/* 149 */     if (localfr1 == null) { if (paramInt3 == -1078763104);
/* 149 */       return parameo.u(paramfo, paramInt2, 143839292); }
/* 150 */     paramInt2 = parameo.i[paramInt2];
/* 151 */     fr localfr2 = bi.y(paramInt2 >> 16, (byte)81);
/* 152 */     paramInt2 &= 65535;
/* 153 */     if (localfr2 == null) { if (paramInt3 != -1078763104) throw new IllegalStateException();
/* 154 */       if (paramInt3 != -1078763104) throw new IllegalStateException(); fo localfo = paramfo.y(!localfr1.z(paramInt1, (byte)0));
/* 155 */       localfo.h(localfr1, paramInt1);
/* 156 */       return localfo;
/*     */     }
/* 158 */     if (!localfr2.z(paramInt2, (byte)0)) tmpTernaryOp = 1;
/*     */   }
/*     */ 
/*     */   public fo ak(fo paramfo, int paramInt1, eo parameo, int paramInt2)
/*     */   {
/* 146 */     paramInt1 = this.i[paramInt1];
/* 147 */     fr localfr1 = bi.y(paramInt1 >> 16, (byte)81);
/* 148 */     paramInt1 &= 65535;
/* 149 */     if (localfr1 == null) return parameo.u(paramfo, paramInt2, -1015307550);
/* 150 */     paramInt2 = parameo.i[paramInt2];
/* 151 */     fr localfr2 = bi.y(paramInt2 >> 16, (byte)81);
/* 152 */     paramInt2 &= 65535;
/* 153 */     if (localfr2 == null) {
/* 154 */       localfo = paramfo.y(!localfr1.z(paramInt1, (byte)0));
/* 155 */       localfo.h(localfr1, paramInt1);
/* 156 */       return localfo;
/*     */     }
/* 158 */     fo localfo = paramfo.y((!localfr1.z(paramInt1, (byte)0) ? 1 : 0) & (!localfr2.z(paramInt2, (byte)0) ? 1 : 0));
/* 159 */     localfo.x(localfr1, paramInt1, localfr2, paramInt2, this.e);
/* 160 */     return localfo;
/*     */   }
/*     */ 
/*     */   void a(ev paramev, int paramInt)
/*     */   {
/*     */     int j;
/*     */     int m;
/*  60 */     if (1 == paramInt) {
/*  61 */       j = paramev.k(-1987080889);
/*  62 */       this.u = new int[j];
/*  63 */       for (m = 0; m < j; m++) this.u[m] = paramev.k(-1987080889);
/*  64 */       this.i = new int[j];
/*  65 */       for (m = 0; m < j; m++) this.i[m] = paramev.k(-1987080889);
/*  66 */       for (m = 0; m < j; m++) this.i[m] = ((paramev.k(-1987080889) << 16) + this.i[m]);
/*     */     }
/*  68 */     else if (2 == paramInt) { this.w = (paramev.k(-1987080889) * -1512364377);
/*  69 */     } else if (3 == paramInt) {
/*  70 */       j = paramev.t(1118814123);
/*  71 */       this.e = new int[j + 1];
/*  72 */       for (m = 0; m < j; m++) this.e[m] = paramev.t(1118814123);
/*  73 */       this.e[j] = 9999999;
/*     */     }
/*  75 */     else if (4 == paramInt) { this.b = true;
/*  76 */     } else if (paramInt == 5) { this.y = (paramev.t(1118814123) * -607737705);
/*  77 */     } else if (paramInt == 6) { this.t = (paramev.k(-1987080889) * -1787510895);
/*  78 */     } else if (7 == paramInt) { this.f = (paramev.k(-1987080889) * -586514861);
/*  79 */     } else if (8 == paramInt) { this.k = (paramev.t(1118814123) * 265079087);
/*  80 */     } else if (paramInt == 9) { this.o = (paramev.t(1118814123) * -1122032315);
/*  81 */     } else if (10 == paramInt) { this.a = (paramev.t(1118814123) * 867837727);
/*  82 */     } else if (11 == paramInt) { this.h = (paramev.t(1118814123) * -682775907);
/*  83 */     } else if (paramInt == 12) {
/*  84 */       j = paramev.t(1118814123);
/*  85 */       this.s = new int[j];
/*  86 */       for (m = 0; m < j; m++) this.s[m] = paramev.k(-1987080889);
/*  87 */       for (m = 0; m < j; m++) this.s[m] = ((paramev.k(-1987080889) << 16) + this.s[m]);
/*     */     }
/*  89 */     else if (paramInt == 13) {
/*  90 */       j = paramev.t(1118814123);
/*  91 */       this.v = new int[j];
/*  92 */       for (m = 0; m < j; m++) this.v[m] = paramev.a(123);
/*     */     }
/*     */   }
/*     */ 
/*     */   public static eo k(int paramInt)
/*     */   {
/*  41 */     eo localeo = (eo)g.r(paramInt);
/*  42 */     if (localeo != null) return localeo;
/*  43 */     byte[] arrayOfByte = dz.n.l(12, paramInt, 815032239);
/*  44 */     localeo = new eo();
/*  45 */     if (arrayOfByte != null) localeo.q(new ev(arrayOfByte), (short)-12728);
/*  46 */     localeo.s((byte)1);
/*  47 */     g.l(localeo, paramInt);
/*  48 */     return localeo;
/*     */   }
/*     */ 
/*     */   void o(ev paramev) {
/*     */     while (true) {
/*  53 */       int j = paramev.t(1118814123);
/*  54 */       if (0 == j) break;
/*  55 */       i(paramev, j, (byte)70);
/*     */     }
/*     */   }
/*     */ 
/*     */   fo am(fo paramfo, int paramInt)
/*     */   {
/* 136 */     paramInt = this.i[paramInt];
/* 137 */     fr localfr = bi.y(paramInt >> 16, (byte)81);
/* 138 */     paramInt &= 65535;
/* 139 */     if (null == localfr) return paramfo.t(true);
/* 140 */     fo localfo = paramfo.t(!localfr.z(paramInt, (byte)0));
/* 141 */     localfo.h(localfr, paramInt);
/* 142 */     return localfo;
/*     */   }
/*     */ 
/*     */   public static void f(ch paramch1, ch paramch2, ch paramch3)
/*     */   {
/*  35 */     dz.n = paramch1;
/*  36 */     ag.j = paramch2;
/*  37 */     z = paramch3;
/*     */   }
/*     */ 
/*     */   void x()
/*     */   {
/*  98 */     if (this.o * 1295492493 == -1) {
/*  99 */       if (null != this.e) this.o = 2050902666; else
/* 100 */         this.o = 0;
/*     */     }
/* 102 */     if (679908575 * this.a == -1)
/* 103 */       if (null != this.e) this.a = 1735675454; else
/* 104 */         this.a = 0;
/*     */   }
/*     */ 
/*     */   public fo an(fo paramfo, int paramInt)
/*     */   {
/* 164 */     int j = this.i[paramInt];
/* 165 */     fr localfr1 = bi.y(j >> 16, (byte)81);
/* 166 */     j &= 65535;
/* 167 */     if (null == localfr1) return paramfo.y(true);
/* 168 */     fr localfr2 = null;
/* 169 */     int m = 0;
/* 170 */     if ((this.s != null) && (paramInt < this.s.length)) {
/* 171 */       m = this.s[paramInt];
/* 172 */       localfr2 = bi.y(m >> 16, (byte)81);
/* 173 */       m &= 65535;
/*     */     }
/* 175 */     if ((localfr2 == null) || (m == 65535)) {
/* 176 */       localfo = paramfo.y(!localfr1.z(j, (byte)0));
/* 177 */       localfo.h(localfr1, j);
/* 178 */       return localfo;
/*     */     }
/* 180 */     fo localfo = paramfo.y((!localfr1.z(j, (byte)0) ? 1 : 0) & (!localfr2.z(m, (byte)0) ? 1 : 0));
/* 181 */     localfo.h(localfr1, j);
/* 182 */     localfo.h(localfr2, m);
/* 183 */     return localfo;
/*     */   }
/*     */ 
/*     */   public fo b(fo paramfo, int paramInt, byte paramByte)
/*     */   {
/* 164 */     int j = this.i[paramInt];
/* 165 */     fr localfr1 = bi.y(j >> 16, (byte)81);
/* 166 */     j &= 65535;
/* 167 */     if (null == localfr1) { if (paramByte >= 1) throw new IllegalStateException(); return paramfo.y(true); }
/* 168 */     fr localfr2 = null;
/* 169 */     int m = 0;
/* 170 */     if ((this.s != null) && ((paramByte >= 1) || (paramInt < this.s.length))) { if (paramByte < 1);
/* 171 */       m = this.s[paramInt];
/* 172 */       localfr2 = bi.y(m >> 16, (byte)81);
/* 173 */       m &= 65535;
/*     */     }
/* 175 */     if (localfr2 != null) { if (paramByte >= 1) throw new IllegalStateException(); if (m != 65535) break label197; if (paramByte >= 1); }
/* 176 */     if (paramByte >= 1) throw new IllegalStateException(); fo localfo = paramfo.y(!localfr1.z(j, (byte)0));
/* 177 */     localfo.h(localfr1, j);
/* 178 */     return localfo;
/*     */ 
/* 180 */     label197: if (!localfr2.z(m, (byte)0)) tmpTernaryOp = 1;
/*     */   }
/*     */ 
/*     */   fo ac(fo paramfo, int paramInt1, int paramInt2)
/*     */   {
/* 119 */     paramInt1 = this.i[paramInt1];
/* 120 */     fr localfr = bi.y(paramInt1 >> 16, (byte)81);
/* 121 */     paramInt1 &= 65535;
/* 122 */     if (null == localfr) return paramfo.y(true);
/* 123 */     fo localfo = paramfo.y(!localfr.z(paramInt1, (byte)0));
/* 124 */     paramInt2 &= 3;
/* 125 */     if (paramInt2 == 1) localfo.aa();
/* 126 */     else if (2 == paramInt2) localfo.ac();
/* 127 */     else if (3 == paramInt2) localfo.ad();
/* 128 */     localfo.h(localfr, paramInt1);
/* 129 */     if (1 == paramInt2) localfo.ad();
/* 130 */     else if (paramInt2 == 2) localfo.ac();
/* 131 */     else if (paramInt2 == 3) localfo.aa();
/* 132 */     return localfo;
/*     */   }
/*     */ 
/*     */   fo aa(fo paramfo, int paramInt1, int paramInt2)
/*     */   {
/* 119 */     paramInt1 = this.i[paramInt1];
/* 120 */     fr localfr = bi.y(paramInt1 >> 16, (byte)81);
/* 121 */     paramInt1 &= 65535;
/* 122 */     if (null == localfr) return paramfo.y(true);
/* 123 */     fo localfo = paramfo.y(!localfr.z(paramInt1, (byte)0));
/* 124 */     paramInt2 &= 3;
/* 125 */     if (paramInt2 == 1) localfo.aa();
/* 126 */     else if (2 == paramInt2) localfo.ac();
/* 127 */     else if (3 == paramInt2) localfo.ad();
/* 128 */     localfo.h(localfr, paramInt1);
/* 129 */     if (1 == paramInt2) localfo.ad();
/* 130 */     else if (paramInt2 == 2) localfo.ac();
/* 131 */     else if (paramInt2 == 3) localfo.aa();
/* 132 */     return localfo;
/*     */   }
/*     */ 
/*     */   fo as(fo paramfo, int paramInt) {
/* 136 */     paramInt = this.i[paramInt];
/* 137 */     fr localfr = bi.y(paramInt >> 16, (byte)81);
/* 138 */     paramInt &= 65535;
/* 139 */     if (null == localfr) return paramfo.t(true);
/* 140 */     fo localfo = paramfo.t(!localfr.z(paramInt, (byte)0));
/* 141 */     localfo.h(localfr, paramInt);
/* 142 */     return localfo;
/*     */   }
/*     */ 
/*     */   fo ap(fo paramfo, int paramInt)
/*     */   {
/* 136 */     paramInt = this.i[paramInt];
/* 137 */     fr localfr = bi.y(paramInt >> 16, (byte)81);
/* 138 */     paramInt &= 65535;
/* 139 */     if (null == localfr) return paramfo.t(true);
/* 140 */     fo localfo = paramfo.t(!localfr.z(paramInt, (byte)0));
/* 141 */     localfo.h(localfr, paramInt);
/* 142 */     return localfo;
/*     */   }
/*     */ 
/*     */   public fo av(fo paramfo, int paramInt1, eo parameo, int paramInt2) {
/* 146 */     paramInt1 = this.i[paramInt1];
/* 147 */     fr localfr1 = bi.y(paramInt1 >> 16, (byte)81);
/* 148 */     paramInt1 &= 65535;
/* 149 */     if (localfr1 == null) return parameo.u(paramfo, paramInt2, -237667332);
/* 150 */     paramInt2 = parameo.i[paramInt2];
/* 151 */     fr localfr2 = bi.y(paramInt2 >> 16, (byte)81);
/* 152 */     paramInt2 &= 65535;
/* 153 */     if (localfr2 == null) {
/* 154 */       localfo = paramfo.y(!localfr1.z(paramInt1, (byte)0));
/* 155 */       localfo.h(localfr1, paramInt1);
/* 156 */       return localfo;
/*     */     }
/* 158 */     fo localfo = paramfo.y((!localfr1.z(paramInt1, (byte)0) ? 1 : 0) & (!localfr2.z(paramInt2, (byte)0) ? 1 : 0));
/* 159 */     localfo.x(localfr1, paramInt1, localfr2, paramInt2, this.e);
/* 160 */     return localfo;
/*     */   }
/*     */ 
/*     */   public fo u(fo paramfo, int paramInt1, int paramInt2)
/*     */   {
/* 109 */     paramInt1 = this.i[paramInt1];
/* 110 */     fr localfr = bi.y(paramInt1 >> 16, (byte)81);
/* 111 */     paramInt1 &= 65535;
/* 112 */     if (localfr == null) { if (paramInt2 >= 1318595677) throw new IllegalStateException(); return paramfo.y(true); }
/* 113 */     if (!localfr.z(paramInt1, (byte)0)) tmpTernaryOp = 1;
/*     */   }
/*     */ 
/*     */   public fo az(fo paramfo, int paramInt)
/*     */   {
/* 164 */     int j = this.i[paramInt];
/* 165 */     fr localfr1 = bi.y(j >> 16, (byte)81);
/* 166 */     j &= 65535;
/* 167 */     if (null == localfr1) return paramfo.y(true);
/* 168 */     fr localfr2 = null;
/* 169 */     int m = 0;
/* 170 */     if ((this.s != null) && (paramInt < this.s.length)) {
/* 171 */       m = this.s[paramInt];
/* 172 */       localfr2 = bi.y(m >> 16, (byte)81);
/* 173 */       m &= 65535;
/*     */     }
/* 175 */     if ((localfr2 == null) || (m == 65535)) {
/* 176 */       localfo = paramfo.y(!localfr1.z(j, (byte)0));
/* 177 */       localfo.h(localfr1, j);
/* 178 */       return localfo;
/*     */     }
/* 180 */     fo localfo = paramfo.y((!localfr1.z(j, (byte)0) ? 1 : 0) & (!localfr2.z(m, (byte)0) ? 1 : 0));
/* 181 */     localfo.h(localfr1, j);
/* 182 */     localfo.h(localfr2, m);
/* 183 */     return localfo;
/*     */   }
/*     */ 
/*     */   public fo ad(fo paramfo, int paramInt)
/*     */   {
/* 109 */     paramInt = this.i[paramInt];
/* 110 */     fr localfr = bi.y(paramInt >> 16, (byte)81);
/* 111 */     paramInt &= 65535;
/* 112 */     if (localfr == null) return paramfo.y(true);
/* 113 */     fo localfo = paramfo.y(!localfr.z(paramInt, (byte)0));
/* 114 */     localfo.h(localfr, paramInt);
/* 115 */     return localfo;
/*     */   }
/*     */ 
/*     */   fo w(fo paramfo, int paramInt1, int paramInt2)
/*     */   {
/* 136 */     paramInt1 = this.i[paramInt1];
/* 137 */     fr localfr = bi.y(paramInt1 >> 16, (byte)81);
/* 138 */     paramInt1 &= 65535;
/* 139 */     if (null == localfr) { if (paramInt2 != 620705636);
/* 139 */       return paramfo.t(true); }
/* 140 */     if (paramInt2 == 620705636) throw new IllegalStateException(); fo localfo = paramfo.t(!localfr.z(paramInt1, (byte)0));
/* 141 */     localfo.h(localfr, paramInt1);
/* 142 */     return localfo;
/*     */   }
/*     */ 
/*     */   static fr ay(int paramInt)
/*     */   {
/* 187 */     Object localObject = (fr)q.r(paramInt);
/* 188 */     if (null != localObject) return localObject;
/*     */ 
/* 190 */     ch localch1 = ag.j;
/* 191 */     ch localch2 = z;
/*     */ 
/* 193 */     int j = 1;
/* 194 */     int[] arrayOfInt = localch1.s(paramInt, 947268768);
/* 195 */     for (int m = 0; m < arrayOfInt.length; m++) {
/* 196 */       byte[] arrayOfByte1 = localch1.g(paramInt, arrayOfInt[m], 967074000);
/* 197 */       if (null == arrayOfByte1) {
/* 198 */         j = 0;
/*     */       }
/*     */       else {
/* 201 */         int n = (arrayOfByte1[0] & 0xFF) << 8 | arrayOfByte1[1] & 0xFF;
/*     */ 
/* 204 */         byte[] arrayOfByte2 = localch2.g(n, 0, 890304964);
/* 205 */         if (null == arrayOfByte2) j = 0;
/*     */       }
/*     */     }
/*     */     fr localfr;
/* 207 */     if (j == 0)
/* 208 */       localfr = null;
/*     */     else {
/*     */       try
/*     */       {
/* 212 */         localfr = new fr(localch1, localch2, paramInt, false);
/*     */       }
/*     */       catch (Exception localException) {
/* 215 */         localfr = null;
/*     */       }
/*     */     }
/* 218 */     localObject = localfr;
/* 219 */     if (null != localObject) q.l((en)localObject, paramInt);
/* 220 */     return localObject;
/*     */   }
/*     */ 
/*     */   public static void ab() {
/* 224 */     g.m();
/* 225 */     q.m();
/*     */   }
/*     */ 
/*     */   public fo ah(fo paramfo, int paramInt)
/*     */   {
/* 164 */     int j = this.i[paramInt];
/* 165 */     fr localfr1 = bi.y(j >> 16, (byte)81);
/* 166 */     j &= 65535;
/* 167 */     if (null == localfr1) return paramfo.y(true);
/* 168 */     fr localfr2 = null;
/* 169 */     int m = 0;
/* 170 */     if ((this.s != null) && (paramInt < this.s.length)) {
/* 171 */       m = this.s[paramInt];
/* 172 */       localfr2 = bi.y(m >> 16, (byte)81);
/* 173 */       m &= 65535;
/*     */     }
/* 175 */     if ((localfr2 == null) || (m == 65535)) {
/* 176 */       localfo = paramfo.y(!localfr1.z(j, (byte)0));
/* 177 */       localfo.h(localfr1, j);
/* 178 */       return localfo;
/*     */     }
/* 180 */     fo localfo = paramfo.y((!localfr1.z(j, (byte)0) ? 1 : 0) & (!localfr2.z(m, (byte)0) ? 1 : 0));
/* 181 */     localfo.h(localfr1, j);
/* 182 */     localfo.h(localfr2, m);
/* 183 */     return localfo;
/*     */   }
/*     */ 
/*     */   public static void ao()
/*     */   {
/* 224 */     g.m();
/* 225 */     q.m();
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     eo
 * JD-Core Version:    0.6.2
 */