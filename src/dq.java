/*      */ import java.util.zip.CRC32;
/*      */ 
/*      */ public class dq extends ch
/*      */ {
/*      */   volatile boolean[] x;
/*      */   ap k;
/*      */   int o;
/*   12 */   volatile boolean a = false;
/*   13 */   boolean h = false;
/*      */   int ac;
/*      */   ap f;
/*   15 */   static CRC32 p = new CRC32();
/*      */   int ad;
/*   18 */   int aa = 1319874039;
/*      */   static int oq;
/*      */ 
/*      */   void cp()
/*      */   {
/*  168 */     this.x = new boolean[this.i.length];
/*  169 */     for (int i = 0; i < this.x.length; i++) this.x[i] = false;
/*  170 */     if (this.f == null) {
/*  171 */       this.a = true;
/*  172 */       return;
/*      */     }
/*  174 */     this.aa = 1319874039;
/*  175 */     for (i = 0; i < this.x.length; i++) {
/*  176 */       if (this.j[i] > 0) {
/*  177 */         ap localap = this.f;
/*  178 */         dq localdq = this;
/*      */ 
/*  180 */         eh localeh = new eh();
/*  181 */         localeh.m = -383464489;
/*  182 */         localeh.r = i;
/*  183 */         localeh.n = localap;
/*  184 */         localeh.j = localdq;
/*  185 */         synchronized (cc.r) {
/*  186 */           cc.r.d(localeh);
/*      */         }
/*      */ 
/*  189 */         synchronized (cc.m) {
/*  190 */           if (0 == cc.l * -1562132559) dj.r.j(new cc(), 5, -302564893);
/*  191 */           cc.l = -1797728808;
/*      */         }
/*      */ 
/*  195 */         this.aa = (i * -1319874039);
/*      */       }
/*      */     }
/*  198 */     if (-429204423 * this.aa == -1) this.a = true;
/*      */   }
/*      */ 
/*      */   void bb(int paramInt1, int paramInt2)
/*      */   {
/*   59 */     this.ad = (-852869939 * paramInt1);
/*   60 */     this.ac = (-320486309 * paramInt2);
/*   61 */     if (this.k != null) cu.m(860612675 * this.o, this.k, this, -255999774); else
/*   62 */       by.m(this, 255, 860612675 * this.o, this.ad * -1008726011, (byte)0, true, 107433847);
/*      */   }
/*      */ 
/*      */   void d(int paramInt, byte paramByte)
/*      */   {
/*   50 */     ab.c(860612675 * this.o, paramInt, (short)-16710);
/*      */   }
/*      */ 
/*      */   public int ba()
/*      */   {
/*   42 */     if (this.a) return 100;
/*   43 */     if (null != this.i) return 99;
/*   44 */     int i = v.n(255, this.o * 860612675, 47457749);
/*   45 */     if (i >= 100) i = 99;
/*   46 */     return i;
/*      */   }
/*      */ 
/*      */   void cl()
/*      */   {
/*  168 */     this.x = new boolean[this.i.length];
/*  169 */     for (int i = 0; i < this.x.length; i++) this.x[i] = false;
/*  170 */     if (this.f == null) {
/*  171 */       this.a = true;
/*  172 */       return;
/*      */     }
/*  174 */     this.aa = 1319874039;
/*  175 */     for (i = 0; i < this.x.length; i++) {
/*  176 */       if (this.j[i] > 0) {
/*  177 */         ap localap = this.f;
/*  178 */         dq localdq = this;
/*      */ 
/*  180 */         eh localeh = new eh();
/*  181 */         localeh.m = -383464489;
/*  182 */         localeh.r = i;
/*  183 */         localeh.n = localap;
/*  184 */         localeh.j = localdq;
/*  185 */         synchronized (cc.r) {
/*  186 */           cc.r.d(localeh);
/*      */         }
/*      */ 
/*  189 */         synchronized (cc.m) {
/*  190 */           if (0 == cc.l * -1562132559) dj.r.j(new cc(), 5, 1667412385);
/*  191 */           cc.l = -1797728808;
/*      */         }
/*      */ 
/*  195 */         this.aa = (i * -1319874039);
/*      */       }
/*      */     }
/*  198 */     if (-429204423 * this.aa == -1) this.a = true;
/*      */   }
/*      */ 
/*      */   void bj(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2, byte paramByte)
/*      */   {
/*   66 */     Object localObject1;
/*   66 */     if (paramBoolean1) { if ((paramByte <= 28) || 
/*   67 */         (this.a)) { if (paramByte > 28);
/*   68 */         throw new RuntimeException();
/*      */       }
/*   70 */       if (this.k != null) { if (paramByte > 28);
/*   71 */         int i = this.o * 860612675;
/*   72 */         localObject1 = this.k;
/*      */ 
/*   74 */         ??? = new eh();
/*   75 */         ((eh)???).m = 0;
/*   76 */         ((eh)???).r = i;
/*   77 */         ((eh)???).c = paramArrayOfByte;
/*   78 */         ((eh)???).n = ((ap)localObject1);
/*   79 */         synchronized (cc.r) {
/*   80 */           cc.r.d((dg)???);
/*      */         }
/*      */ 
/*   83 */         synchronized (cc.m) {
/*   84 */           if (cc.l * -1562132559 == 0) { if (paramByte > 28);
/*   84 */             dj.r.j(new cc(), 5, 33065111); }
/*   85 */           cc.l = -1797728808;
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*   90 */       r(paramArrayOfByte, -1468848676);
/*   91 */       bm((short)-20704);
/*      */     } else
/*      */     {
/*   94 */       paramArrayOfByte[(paramArrayOfByte.length - 2)] = ((byte)(this.n[paramInt] >> 8));
/*   95 */       paramArrayOfByte[(paramArrayOfByte.length - 1)] = ((byte)this.n[paramInt]);
/*   96 */       if (null != this.f) { if (paramByte <= 28) throw new IllegalStateException();
/*   97 */         ap localap = this.f;
/*      */ 
/*   99 */         localObject1 = new eh();
/*  100 */         ((eh)localObject1).m = 0;
/*  101 */         ((eh)localObject1).r = paramInt;
/*  102 */         ((eh)localObject1).c = paramArrayOfByte;
/*  103 */         ((eh)localObject1).n = localap;
/*  104 */         synchronized (cc.r) {
/*  105 */           cc.r.d((dg)localObject1);
/*      */         }
/*      */ 
/*  108 */         synchronized (cc.m) {
/*  109 */           if (-1562132559 * cc.l == 0) { if (paramByte <= 28) return; dj.r.j(new cc(), 5, 312982942); }
/*  110 */           cc.l = -1797728808;
/*      */         }
/*      */ 
/*  114 */         this.x[paramInt] = true;
/*      */       }
/*  116 */       if (paramBoolean2) { if (paramByte > 28);
/*  116 */         this.i[paramInt] = cc.r(paramArrayOfByte, false, -73);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void bz(ap paramap, int paramInt1, byte[] paramArrayOfByte, boolean paramBoolean, int paramInt2)
/*      */   {
/*  121 */     int i;
/*  121 */     if (paramap == this.k) { if (paramInt2 <= 872914849) throw new IllegalStateException();
/*  122 */       if (this.a) { if (paramInt2 > 872914849);
/*  123 */         throw new RuntimeException();
/*      */       }
/*  125 */       if (null == paramArrayOfByte) { if (paramInt2 <= 872914849) throw new IllegalStateException();
/*  126 */         by.m(this, 255, 860612675 * this.o, this.ad * -1008726011, (byte)0, true, -301567499);
/*  127 */         return;
/*      */       }
/*  129 */       p.reset();
/*  130 */       p.update(paramArrayOfByte, 0, paramArrayOfByte.length);
/*  131 */       i = (int)p.getValue();
/*  132 */       ev localev = new ev(c.a(paramArrayOfByte, -450548300));
/*  133 */       int m = localev.t(1118814123);
/*  134 */       if ((m != 5) && ((paramInt2 <= 872914849) || (6 != m))) { if (paramInt2 > 872914849);
/*  134 */         throw new RuntimeException(""); }
/*  135 */       int n = 0;
/*  136 */       if (m >= 6) { if (paramInt2 > 872914849);
/*  136 */         n = localev.h(1799197884); }
/*  137 */       if (-1008726011 * this.ad == i) { if ((paramInt2 > 872914849) && (-1414411309 * this.ac == n)) break label283; if (paramInt2 <= 872914849) return; 
/*      */       }
/*  138 */       by.m(this, 255, 860612675 * this.o, -1008726011 * this.ad, (byte)0, true, 544599431);
/*  139 */       return;
/*      */ 
/*  141 */       label283: r(paramArrayOfByte, -1162529470);
/*  142 */       bm((short)9543);
/*      */     } else
/*      */     {
/*  145 */       if ((!paramBoolean) && ((paramInt2 <= 872914849) || (this.aa * -429204423 == paramInt1))) { if (paramInt2 > 872914849);
/*  146 */         this.a = true;
/*      */       }
/*  148 */       if (null != paramArrayOfByte) { if ((paramInt2 > 872914849) && (paramArrayOfByte.length > 2)) break label433; if (paramInt2 <= 872914849) return; 
/*      */       }
/*  149 */       this.x[paramInt1] = false;
/*  150 */       if (!this.h) { if ((paramInt2 > 872914849) && (!paramBoolean)) break label432; if (paramInt2 <= 872914849); } by.m(this, this.o * 860612675, paramInt1, this.c[paramInt1], (byte)2, paramBoolean, -511151204);
/*  151 */       label432: return;
/*      */ 
/*  153 */       label433: p.reset();
/*  154 */       p.update(paramArrayOfByte, 0, paramArrayOfByte.length - 2);
/*  155 */       i = (int)p.getValue();
/*  156 */       int j = ((paramArrayOfByte[(paramArrayOfByte.length - 2)] & 0xFF) << 8) + (paramArrayOfByte[(paramArrayOfByte.length - 1)] & 0xFF);
/*  157 */       if (i == this.c[paramInt1]) { if ((paramInt2 > 872914849) && (j == this.n[paramInt1])) break label589; if (paramInt2 <= 872914849); }
/*  158 */       this.x[paramInt1] = false;
/*  159 */       if (!this.h) { if ((paramInt2 > 872914849) && (!paramBoolean)) break label588; if (paramInt2 <= 872914849) return;  } by.m(this, 860612675 * this.o, paramInt1, this.c[paramInt1], (byte)2, paramBoolean, 1901886264);
/*  160 */       label588: return;
/*      */ 
/*  162 */       label589: this.x[paramInt1] = true;
/*  163 */       if (paramBoolean) { if (paramInt2 > 872914849);
/*  163 */         this.i[paramInt1] = cc.r(paramArrayOfByte, false, -125);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   void p(int paramInt)
/*      */   {
/*   50 */     ab.c(860612675 * this.o, paramInt, (short)-27969);
/*      */   }
/*      */ 
/*      */   void bm(short paramShort)
/*      */   {
/*  168 */     this.x = new boolean[this.i.length];
/*  169 */     for (int i = 0; i < this.x.length; i++) { if (paramShort < 16256);
/*  169 */       this.x[i] = false; }
/*  170 */     if (this.f == null) { if (paramShort < 16256);
/*  171 */       this.a = true;
/*  172 */       return;
/*      */     }
/*  174 */     this.aa = 1319874039;
/*  175 */     for (i = 0; i < this.x.length; i++) if ((paramShort >= 16256) || 
/*  176 */         (this.j[i] > 0)) { if (paramShort >= 16256) return;
/*  177 */         ap localap = this.f;
/*  178 */         dq localdq = this;
/*      */ 
/*  180 */         eh localeh = new eh();
/*  181 */         localeh.m = -383464489;
/*  182 */         localeh.r = i;
/*  183 */         localeh.n = localap;
/*  184 */         localeh.j = localdq;
/*  185 */         synchronized (cc.r) {
/*  186 */           cc.r.d(localeh);
/*      */         }
/*      */ 
/*  189 */         synchronized (cc.m) {
/*  190 */           if (0 == cc.l * -1562132559) { if (paramShort >= 16256) return; dj.r.j(new cc(), 5, 1305930255); }
/*  191 */           cc.l = -1797728808;
/*      */         }
/*      */ 
/*  195 */         this.aa = (i * -1319874039);
/*      */       }
/*      */ 
/*  198 */     if (-429204423 * this.aa == -1) { if (paramShort >= 16256) throw new IllegalStateException(); this.a = true;
/*      */     }
/*      */   }
/*      */ 
/*      */   public int be(int paramInt)
/*      */   {
/*  208 */     int i = 0;
/*  209 */     int j = 0;
/*  210 */     for (int m = 0; m < this.i.length; m++) if ((paramInt != 57499522) || 
/*  211 */         (this.j[m] > 0)) { if (paramInt == 57499522);
/*  212 */         i += 100;
/*  213 */         j += bn(m, -937672110);
/*      */       }
/*      */ 
/*  216 */     if (i == 0) { if (paramInt != 57499522) throw new IllegalStateException(); return 100; }
/*  217 */     m = j * 100 / i;
/*  218 */     return m;
/*      */   }
/*      */ 
/*      */   void x(int paramInt)
/*      */   {
/*   50 */     ab.c(860612675 * this.o, paramInt, (short)-22101);
/*      */   }
/*      */ 
/*      */   void i(int paramInt, byte paramByte) {
/*   54 */     if ((this.f != null) && ((paramByte <= 16) || ((this.x != null) && ((paramByte <= 16) || (this.x[paramInt] != 0))))) { if (paramByte <= 16) return; cu.m(paramInt, this.f, this, -2054502060); } else {
/*   55 */       by.m(this, this.o * 860612675, paramInt, this.c[paramInt], (byte)2, true, -352288640);
/*      */     }
/*      */   }
/*      */ 
/*      */   void ad(int paramInt)
/*      */   {
/*   50 */     ab.c(860612675 * this.o, paramInt, (short)-14106);
/*      */   }
/*      */ 
/*      */   void al(int paramInt) {
/*   54 */     if ((this.f != null) && (this.x != null) && (this.x[paramInt] != 0)) cu.m(paramInt, this.f, this, -1593261848); else
/*   55 */       by.m(this, this.o * 860612675, paramInt, this.c[paramInt], (byte)2, true, -311145554);
/*      */   }
/*      */ 
/*      */   void ab(int paramInt)
/*      */   {
/*   54 */     if ((this.f != null) && (this.x != null) && (this.x[paramInt] != 0)) cu.m(paramInt, this.f, this, -1708063182); else
/*   55 */       by.m(this, this.o * 860612675, paramInt, this.c[paramInt], (byte)2, true, 1251083596);
/*      */   }
/*      */ 
/*      */   public int bp()
/*      */   {
/*   42 */     if (this.a) return 100;
/*   43 */     if (null != this.i) return 99;
/*   44 */     int i = v.n(255, this.o * 860612675, 47457749);
/*   45 */     if (i >= 100) i = 99;
/*   46 */     return i;
/*      */   }
/*      */ 
/*      */   int bn(int paramInt1, int paramInt2)
/*      */   {
/*  202 */     if (null != this.i[paramInt1]) { if (paramInt2 == -937672110);
/*  202 */       return 100; }
/*  203 */     if (this.x[paramInt1] != 0) { if (paramInt2 == -937672110);
/*  203 */       return 100; }
/*  204 */     return v.n(860612675 * this.o, paramInt1, 47457749);
/*      */   }
/*      */ 
/*      */   public int bc()
/*      */   {
/*   42 */     if (this.a) return 100;
/*   43 */     if (null != this.i) return 99;
/*   44 */     int i = v.n(255, this.o * 860612675, 47457749);
/*   45 */     if (i >= 100) i = 99;
/*   46 */     return i;
/*      */   }
/*      */ 
/*      */   void br(int paramInt1, int paramInt2)
/*      */   {
/*   59 */     this.ad = (-852869939 * paramInt1);
/*   60 */     this.ac = (-320486309 * paramInt2);
/*   61 */     if (this.k != null) cu.m(860612675 * this.o, this.k, this, 52816347); else
/*   62 */       by.m(this, 255, 860612675 * this.o, this.ad * -1008726011, (byte)0, true, 1722537169);
/*      */   }
/*      */ 
/*      */   public int ch()
/*      */   {
/*  208 */     int i = 0;
/*  209 */     int j = 0;
/*  210 */     for (int m = 0; m < this.i.length; m++) {
/*  211 */       if (this.j[m] > 0) {
/*  212 */         i += 100;
/*  213 */         j += bn(m, -937672110);
/*      */       }
/*      */     }
/*  216 */     if (i == 0) return 100;
/*  217 */     m = j * 100 / i;
/*  218 */     return m;
/*      */   }
/*      */ 
/*      */   void bq(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   59 */     this.ad = (-852869939 * paramInt1);
/*   60 */     this.ac = (-320486309 * paramInt2);
/*   61 */     if (this.k != null) { if (paramInt3 < 1101484655);
/*   61 */       cu.m(860612675 * this.o, this.k, this, -2058470472); } else {
/*   62 */       by.m(this, 255, 860612675 * this.o, this.ad * -1008726011, (byte)0, true, 555332523);
/*      */     }
/*      */   }
/*      */ 
/*      */   void cr(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2)
/*      */   {
/*      */     Object localObject1;
/*   66 */     if (paramBoolean1) {
/*   67 */       if (this.a) {
/*   68 */         throw new RuntimeException();
/*      */       }
/*   70 */       if (this.k != null) {
/*   71 */         int i = this.o * 860612675;
/*   72 */         localObject1 = this.k;
/*      */ 
/*   74 */         ??? = new eh();
/*   75 */         ((eh)???).m = 0;
/*   76 */         ((eh)???).r = i;
/*   77 */         ((eh)???).c = paramArrayOfByte;
/*   78 */         ((eh)???).n = ((ap)localObject1);
/*   79 */         synchronized (cc.r) {
/*   80 */           cc.r.d((dg)???);
/*      */         }
/*      */ 
/*   83 */         synchronized (cc.m) {
/*   84 */           if (cc.l * -1562132559 == 0) dj.r.j(new cc(), 5, -445605970);
/*   85 */           cc.l = -1797728808;
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*   90 */       r(paramArrayOfByte, -532305491);
/*   91 */       bm((short)-20361);
/*      */     }
/*      */     else {
/*   94 */       paramArrayOfByte[(paramArrayOfByte.length - 2)] = ((byte)(this.n[paramInt] >> 8));
/*   95 */       paramArrayOfByte[(paramArrayOfByte.length - 1)] = ((byte)this.n[paramInt]);
/*   96 */       if (null != this.f) {
/*   97 */         ap localap = this.f;
/*      */ 
/*   99 */         localObject1 = new eh();
/*  100 */         ((eh)localObject1).m = 0;
/*  101 */         ((eh)localObject1).r = paramInt;
/*  102 */         ((eh)localObject1).c = paramArrayOfByte;
/*  103 */         ((eh)localObject1).n = localap;
/*  104 */         synchronized (cc.r) {
/*  105 */           cc.r.d((dg)localObject1);
/*      */         }
/*      */ 
/*  108 */         synchronized (cc.m) {
/*  109 */           if (-1562132559 * cc.l == 0) dj.r.j(new cc(), 5, -373581250);
/*  110 */           cc.l = -1797728808;
/*      */         }
/*      */ 
/*  114 */         this.x[paramInt] = true;
/*      */       }
/*  116 */       if (paramBoolean2) this.i[paramInt] = cc.r(paramArrayOfByte, false, -69);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void cs(ap paramap, int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
/*      */   {
/*      */     int i;
/*  121 */     if (paramap == this.k) {
/*  122 */       if (this.a) {
/*  123 */         throw new RuntimeException();
/*      */       }
/*  125 */       if (null == paramArrayOfByte) {
/*  126 */         by.m(this, 255, 860612675 * this.o, this.ad * -1008726011, (byte)0, true, 278598235);
/*  127 */         return;
/*      */       }
/*  129 */       p.reset();
/*  130 */       p.update(paramArrayOfByte, 0, paramArrayOfByte.length);
/*  131 */       i = (int)p.getValue();
/*  132 */       ev localev = new ev(c.a(paramArrayOfByte, -365354138));
/*  133 */       int m = localev.t(1118814123);
/*  134 */       if ((m != 5) && (6 != m)) throw new RuntimeException("");
/*  135 */       int n = 0;
/*  136 */       if (m >= 6) n = localev.h(-368930988);
/*  137 */       if ((-1008726011 * this.ad != i) || (-1414411309 * this.ac != n)) {
/*  138 */         by.m(this, 255, 860612675 * this.o, -1008726011 * this.ad, (byte)0, true, -165083847);
/*  139 */         return;
/*      */       }
/*  141 */       r(paramArrayOfByte, -1158287187);
/*  142 */       bm((short)-31557);
/*      */     }
/*      */     else {
/*  145 */       if ((!paramBoolean) && (this.aa * -429204423 == paramInt)) {
/*  146 */         this.a = true;
/*      */       }
/*  148 */       if ((null == paramArrayOfByte) || (paramArrayOfByte.length <= 2)) {
/*  149 */         this.x[paramInt] = false;
/*  150 */         if ((this.h) || (paramBoolean)) by.m(this, this.o * 860612675, paramInt, this.c[paramInt], (byte)2, paramBoolean, 1452644744);
/*  151 */         return;
/*      */       }
/*  153 */       p.reset();
/*  154 */       p.update(paramArrayOfByte, 0, paramArrayOfByte.length - 2);
/*  155 */       i = (int)p.getValue();
/*  156 */       int j = ((paramArrayOfByte[(paramArrayOfByte.length - 2)] & 0xFF) << 8) + (paramArrayOfByte[(paramArrayOfByte.length - 1)] & 0xFF);
/*  157 */       if ((i != this.c[paramInt]) || (j != this.n[paramInt])) {
/*  158 */         this.x[paramInt] = false;
/*  159 */         if ((this.h) || (paramBoolean)) by.m(this, 860612675 * this.o, paramInt, this.c[paramInt], (byte)2, paramBoolean, -637046714);
/*  160 */         return;
/*      */       }
/*  162 */       this.x[paramInt] = true;
/*  163 */       if (paramBoolean) this.i[paramInt] = cc.r(paramArrayOfByte, false, -105); 
/*      */     }
/*      */   }
/*      */ 
/*      */   void cj()
/*      */   {
/*  168 */     this.x = new boolean[this.i.length];
/*  169 */     for (int i = 0; i < this.x.length; i++) this.x[i] = false;
/*  170 */     if (this.f == null) {
/*  171 */       this.a = true;
/*  172 */       return;
/*      */     }
/*  174 */     this.aa = 1319874039;
/*  175 */     for (i = 0; i < this.x.length; i++) {
/*  176 */       if (this.j[i] > 0) {
/*  177 */         ap localap = this.f;
/*  178 */         dq localdq = this;
/*      */ 
/*  180 */         eh localeh = new eh();
/*  181 */         localeh.m = -383464489;
/*  182 */         localeh.r = i;
/*  183 */         localeh.n = localap;
/*  184 */         localeh.j = localdq;
/*  185 */         synchronized (cc.r) {
/*  186 */           cc.r.d(localeh);
/*      */         }
/*      */ 
/*  189 */         synchronized (cc.m) {
/*  190 */           if (0 == cc.l * -1562132559) dj.r.j(new cc(), 5, 767607541);
/*  191 */           cc.l = -1797728808;
/*      */         }
/*      */ 
/*  195 */         this.aa = (i * -1319874039);
/*      */       }
/*      */     }
/*  198 */     if (-429204423 * this.aa == -1) this.a = true;
/*      */   }
/*      */ 
/*      */   public dq(ap paramap1, ap paramap2, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
/*      */   {
/*   21 */     super(paramBoolean1, paramBoolean2);
/*   22 */     this.f = paramap1;
/*   23 */     this.k = paramap2;
/*   24 */     this.o = (paramInt * 2036966507);
/*   25 */     this.h = paramBoolean3;
/*   26 */     dq localdq = this;
/*   27 */     int i = 860612675 * this.o;
/*      */ 
/*   29 */     if (null != ab.f) {
/*   30 */       ab.f.c = (1058763704 * i + -412014509);
/*   31 */       int j = ab.f.h(1211919672);
/*   32 */       int m = ab.f.h(530588093);
/*   33 */       localdq.bq(j, m, 67332197);
/*      */     }
/*      */     else {
/*   36 */       by.m(null, 255, 255, 0, (byte)0, true, 963731653);
/*   37 */       cu.k[i] = localdq;
/*      */     }
/*      */   }
/*      */ 
/*      */   void bd(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2)
/*      */   {
/*      */     Object localObject1;
/*   66 */     if (paramBoolean1) {
/*   67 */       if (this.a) {
/*   68 */         throw new RuntimeException();
/*      */       }
/*   70 */       if (this.k != null) {
/*   71 */         int i = this.o * 860612675;
/*   72 */         localObject1 = this.k;
/*      */ 
/*   74 */         ??? = new eh();
/*   75 */         ((eh)???).m = 0;
/*   76 */         ((eh)???).r = i;
/*   77 */         ((eh)???).c = paramArrayOfByte;
/*   78 */         ((eh)???).n = ((ap)localObject1);
/*   79 */         synchronized (cc.r) {
/*   80 */           cc.r.d((dg)???);
/*      */         }
/*      */ 
/*   83 */         synchronized (cc.m) {
/*   84 */           if (cc.l * -1562132559 == 0) dj.r.j(new cc(), 5, 491034223);
/*   85 */           cc.l = -1797728808;
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*   90 */       r(paramArrayOfByte, -1062598828);
/*   91 */       bm((short)15127);
/*      */     }
/*      */     else {
/*   94 */       paramArrayOfByte[(paramArrayOfByte.length - 2)] = ((byte)(this.n[paramInt] >> 8));
/*   95 */       paramArrayOfByte[(paramArrayOfByte.length - 1)] = ((byte)this.n[paramInt]);
/*   96 */       if (null != this.f) {
/*   97 */         ap localap = this.f;
/*      */ 
/*   99 */         localObject1 = new eh();
/*  100 */         ((eh)localObject1).m = 0;
/*  101 */         ((eh)localObject1).r = paramInt;
/*  102 */         ((eh)localObject1).c = paramArrayOfByte;
/*  103 */         ((eh)localObject1).n = localap;
/*  104 */         synchronized (cc.r) {
/*  105 */           cc.r.d((dg)localObject1);
/*      */         }
/*      */ 
/*  108 */         synchronized (cc.m) {
/*  109 */           if (-1562132559 * cc.l == 0) dj.r.j(new cc(), 5, 1258463729);
/*  110 */           cc.l = -1797728808;
/*      */         }
/*      */ 
/*  114 */         this.x[paramInt] = true;
/*      */       }
/*  116 */       if (paramBoolean2) this.i[paramInt] = cc.r(paramArrayOfByte, false, -117);
/*      */     }
/*      */   }
/*      */ 
/*      */   int ca(int paramInt)
/*      */   {
/*  202 */     if (null != this.i[paramInt]) return 100;
/*  203 */     if (this.x[paramInt] != 0) return 100;
/*  204 */     return v.n(860612675 * this.o, paramInt, 47457749);
/*      */   }
/*      */ 
/*      */   public int co() {
/*  208 */     int i = 0;
/*  209 */     int j = 0;
/*  210 */     for (int m = 0; m < this.i.length; m++) {
/*  211 */       if (this.j[m] > 0) {
/*  212 */         i += 100;
/*  213 */         j += bn(m, -937672110);
/*      */       }
/*      */     }
/*  216 */     if (i == 0) return 100;
/*  217 */     m = j * 100 / i;
/*  218 */     return m;
/*      */   }
/*      */ 
/*      */   public int bo(byte paramByte)
/*      */   {
/*   42 */     if (this.a) { if (paramByte <= 6) throw new IllegalStateException(); return 100; }
/*   43 */     if (null != this.i) { if (paramByte <= 6) throw new IllegalStateException(); return 99; }
/*   44 */     int i = v.n(255, this.o * 860612675, 47457749);
/*   45 */     if (i >= 100) { if (paramByte <= 6) throw new IllegalStateException(); i = 99; }
/*   46 */     return i;
/*      */   }
/*      */ 
/*      */   static final void dz(byte paramByte)
/*      */   {
/* 4314 */     if (at.dd != null) { if (paramByte != -1) throw new IllegalStateException();
/* 4315 */       at.dd.m(-570456642);
/* 4316 */       at.dd = null;
/*      */     }
/* 4318 */     bh.da((byte)8);
/* 4319 */     cr.eg.r();
/* 4320 */     for (int i = 0; i < 4; i++) { if (paramByte == -1);
/* 4320 */       client.el[i].r(2046885173); }
/* 4321 */     System.gc();
/*      */ 
/* 4323 */     bd.c = -1268490119;
/* 4324 */     bd.n = null;
/* 4325 */     aa.j = 498205465;
/* 4326 */     bd.z = 79675327;
/* 4327 */     bd.g = 0;
/* 4328 */     dl.i = false;
/* 4329 */     cl.q = -990954278;
/*      */ 
/* 4331 */     client.nn = -41386401;
/* 4332 */     client.nq = false;
/*      */ 
/* 4334 */     for (de localde = (de)de.m.j(); localde != null; localde = (de)de.m.g()) { if (paramByte != -1) throw new IllegalStateException();
/* 4335 */       if (localde.u != null) { if (paramByte != -1) return;
/* 4336 */         cq.oc.ad(localde.u);
/* 4337 */         localde.u = null;
/*      */       }
/* 4339 */       if (null != localde.b) { if (paramByte == -1);
/* 4340 */         cq.oc.ad(localde.b);
/* 4341 */         localde.b = null;
/*      */       }
/*      */     }
/* 4344 */     de.m.r();
/*      */ 
/* 4346 */     aj.ce(10, 1345644183);
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     dq
 * JD-Core Version:    0.6.2
 */