/*     */ import java.awt.Component;
/*     */ import java.io.EOFException;
/*     */ import java.io.IOException;
/*     */ 
/*     */ public class v
/*     */ {
/*     */   int m;
/*     */   u r;
/*   9 */   long l = 7063778177097892507L;
/*     */   long i;
/*     */   byte[] c;
/*     */   byte[] d;
/*  13 */   int j = 0;
/*     */   long z;
/*     */   long g;
/*  12 */   long n = -7174813313359092345L;
/*     */   long q;
/*     */   static c[] ai;
/*     */   static ft au;
/*     */   static be an;
/*     */   static int jdField_do;
/*     */ 
/*     */   void n(int paramInt)
/*     */     throws IOException
/*     */   {
/* 128 */     this.m = 0;
/* 129 */     if (-4700743278891748859L * this.z != this.i * -8539982320472972119L) { if (paramInt != -1153594963) return;
/* 130 */       this.r.r(-4700743278891748859L * this.z);
/* 131 */       this.i = (4872359221106843645L * this.z);
/*     */     }
/* 133 */     this.l = (this.z * -2158931229408350983L);
/* 134 */     while (843134581 * this.m < this.d.length) { if (paramInt == -1153594963);
/* 135 */       int k = this.r.c(this.d, 843134581 * this.m, this.d.length - this.m * 843134581, -505512815);
/* 136 */       if (-1 == k) { if (paramInt != -1153594963) return; break; }
/* 137 */       this.i += -548829109393735783L * k;
/* 138 */       this.m += -2061080099 * k;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void w(byte[] paramArrayOfByte)
/*     */     throws IOException
/*     */   {
/*  42 */     c(paramArrayOfByte, 0, paramArrayOfByte.length, 1548308603);
/*     */   }
/*     */ 
/*     */   public void d(long paramLong)
/*     */     throws IOException
/*     */   {
/*  33 */     if (paramLong < 0L) throw new IOException("");
/*  34 */     this.z = (paramLong * 4927525029638752973L);
/*     */   }
/*     */ 
/*     */   public long l(int paramInt) {
/*  38 */     return -4971064922075556127L * this.q;
/*     */   }
/*     */ 
/*     */   public void m(byte[] paramArrayOfByte, int paramInt) throws IOException {
/*  42 */     c(paramArrayOfByte, 0, paramArrayOfByte.length, 977748926);
/*     */   }
/*     */ 
/*     */   public void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3) throws IOException {
/*     */     try {
/*  47 */       if (paramInt2 + paramInt1 > paramArrayOfByte.length) { if (paramInt3 > 713675761);
/*  47 */         throw new ArrayIndexOutOfBoundsException(paramInt1 + paramInt2 - paramArrayOfByte.length); }
/*  48 */       if ((-1L != this.n * -8017140494686212151L) && ((paramInt3 <= 713675761) || ((this.z * -4700743278891748859L >= this.n * -8017140494686212151L) && ((paramInt3 <= 713675761) || (-4700743278891748859L * this.z + paramInt2 <= -8017140494686212151L * this.n + 1663746677 * this.j))))) { if (paramInt3 <= 713675761) throw new IllegalStateException();
/*  49 */         System.arraycopy(this.c, (int)(-4700743278891748859L * this.z - -8017140494686212151L * this.n), paramArrayOfByte, paramInt1, paramInt2);
/*  50 */         this.z += 4927525029638752973L * paramInt2;
/*  51 */         return;
/*     */       }
/*  53 */       long l1 = -4700743278891748859L * this.z;
/*  54 */       int k = paramInt1;
/*  55 */       int i1 = paramInt2;
/*     */       int i2;
/*  56 */       if ((this.z * -4700743278891748859L >= this.l * 7598901720898890861L) && ((paramInt3 <= 713675761) || (-4700743278891748859L * this.z < 7598901720898890861L * this.l + this.m * 843134581))) { if (paramInt3 <= 713675761) return;
/*  57 */         i2 = (int)(this.m * 843134581 - (this.z * -4700743278891748859L - 7598901720898890861L * this.l));
/*  58 */         if (i2 > paramInt2) { if (paramInt3 <= 713675761) throw new IllegalStateException(); i2 = paramInt2; }
/*  59 */         System.arraycopy(this.d, (int)(this.z * -4700743278891748859L - this.l * 7598901720898890861L), paramArrayOfByte, paramInt1, i2);
/*  60 */         this.z += 4927525029638752973L * i2;
/*  61 */         paramInt1 += i2;
/*  62 */         paramInt2 -= i2;
/*     */       }
/*  64 */       if (paramInt2 > this.d.length) { if (paramInt3 <= 713675761) return;
/*  65 */         this.r.r(-4700743278891748859L * this.z);
/*  66 */         this.i = (this.z * 4872359221106843645L);
/*  67 */         while (paramInt2 > 0) { if (paramInt3 > 713675761);
/*  68 */           i2 = this.r.c(paramArrayOfByte, paramInt1, paramInt2, -488629099);
/*  69 */           if (i2 == -1) { if (paramInt3 <= 713675761) return; break; }
/*  70 */           this.i += i2 * -548829109393735783L;
/*  71 */           this.z += i2 * 4927525029638752973L;
/*  72 */           paramInt1 += i2;
/*  73 */           paramInt2 -= i2;
/*     */         }
/*     */       }
/*  76 */       if (paramInt2 > 0) { if (paramInt3 <= 713675761) return;
/*  77 */         n(-1153594963);
/*  78 */         i2 = paramInt2;
/*  79 */         if (i2 > 843134581 * this.m) { if (paramInt3 <= 713675761) return; i2 = this.m * 843134581; }
/*  80 */         System.arraycopy(this.d, 0, paramArrayOfByte, paramInt1, i2);
/*  81 */         paramInt1 += i2;
/*  82 */         paramInt2 -= i2;
/*  83 */         this.z += 4927525029638752973L * i2;
/*     */       }
/*  85 */       if (-1L != -8017140494686212151L * this.n) { if (paramInt3 <= 713675761) throw new IllegalStateException();
/*  86 */         if ((-8017140494686212151L * this.n > this.z * -4700743278891748859L) && ((paramInt3 <= 713675761) || (paramInt2 > 0))) { if (paramInt3 > 713675761);
/*  87 */           i2 = paramInt1 + (int)(-8017140494686212151L * this.n - this.z * -4700743278891748859L);
/*  88 */           if (i2 > paramInt2 + paramInt1) { if (paramInt3 > 713675761);
/*  88 */             i2 = paramInt2 + paramInt1; }
/*  89 */           while (paramInt1 < i2) { if (paramInt3 <= 713675761) return;
/*  90 */             paramArrayOfByte[(paramInt1++)] = 0;
/*  91 */             paramInt2--;
/*  92 */             this.z += 4927525029638752973L;
/*     */           }
/*     */         }
/*  95 */         long l2 = -1L;
/*  96 */         long l3 = -1L;
/*  97 */         if (this.n * -8017140494686212151L >= l1) { if (paramInt3 <= 713675761) return; if (this.n * -8017140494686212151L < i1 + l1) { if (paramInt3 <= 713675761) throw new IllegalStateException();
/*  98 */             l2 = this.n * -8017140494686212151L; break label893; }
/*     */         }
/* 100 */         if ((l1 >= this.n * -8017140494686212151L) && ((paramInt3 <= 713675761) || (l1 < -8017140494686212151L * this.n + 1663746677 * this.j))) { if (paramInt3 <= 713675761) throw new IllegalStateException();
/* 101 */           l2 = l1;
/*     */         }
/* 103 */         label893: if ((-8017140494686212151L * this.n + 1663746677 * this.j > l1) && ((paramInt3 <= 713675761) || (this.j * 1663746677 + this.n * -8017140494686212151L <= l1 + i1))) { if (paramInt3 <= 713675761) throw new IllegalStateException();
/* 104 */           l3 = this.n * -8017140494686212151L + 1663746677 * this.j;
/*     */         }
/* 106 */         else if (i1 + l1 > -8017140494686212151L * this.n) { if (paramInt3 <= 713675761) return; if (l1 + i1 <= this.j * 1663746677 + -8017140494686212151L * this.n) { if (paramInt3 > 713675761);
/* 107 */             l3 = i1 + l1; }
/*     */         }
/* 109 */         if (l2 > -1L) { if (paramInt3 <= 713675761) return; if (l3 > l2) { if (paramInt3 > 713675761);
/* 110 */             int i3 = (int)(l3 - l2);
/* 111 */             System.arraycopy(this.c, (int)(l2 - -8017140494686212151L * this.n), paramArrayOfByte, k + (int)(l2 - l1), i3);
/* 112 */             if (l3 > this.z * -4700743278891748859L) { if (paramInt3 > 713675761);
/* 113 */               paramInt2 = (int)(paramInt2 - (l3 - -4700743278891748859L * this.z));
/* 114 */               this.z = (l3 * 4927525029638752973L); }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (IOException localIOException)
/*     */     {
/* 121 */       this.i = 548829109393735783L;
/* 122 */       throw localIOException;
/*     */     }
/* 124 */     if (paramInt2 > 0) { if (paramInt3 <= 713675761) throw new IllegalStateException(); throw new EOFException();
/*     */     }
/*     */   }
/*     */ 
/*     */   public void y(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */     throws IOException
/*     */   {
/*     */     try
/*     */     {
/*  47 */       if (paramInt2 + paramInt1 > paramArrayOfByte.length) throw new ArrayIndexOutOfBoundsException(paramInt1 + paramInt2 - paramArrayOfByte.length);
/*  48 */       if ((-1L != this.n * -8017140494686212151L) && (this.z * -4700743278891748859L >= this.n * -8017140494686212151L) && (-4700743278891748859L * this.z + paramInt2 <= -8017140494686212151L * this.n + 1663746677 * this.j)) {
/*  49 */         System.arraycopy(this.c, (int)(-4700743278891748859L * this.z - -8017140494686212151L * this.n), paramArrayOfByte, paramInt1, paramInt2);
/*  50 */         this.z += 4927525029638752973L * paramInt2;
/*  51 */         return;
/*     */       }
/*  53 */       long l1 = -4700743278891748859L * this.z;
/*  54 */       int k = paramInt1;
/*  55 */       int i1 = paramInt2;
/*     */       int i2;
/*  56 */       if ((this.z * -4700743278891748859L >= this.l * 7598901720898890861L) && (-4700743278891748859L * this.z < 7598901720898890861L * this.l + this.m * 843134581)) {
/*  57 */         i2 = (int)(this.m * 843134581 - (this.z * -4700743278891748859L - 7598901720898890861L * this.l));
/*  58 */         if (i2 > paramInt2) i2 = paramInt2;
/*  59 */         System.arraycopy(this.d, (int)(this.z * -4700743278891748859L - this.l * 7598901720898890861L), paramArrayOfByte, paramInt1, i2);
/*  60 */         this.z += 4927525029638752973L * i2;
/*  61 */         paramInt1 += i2;
/*  62 */         paramInt2 -= i2;
/*     */       }
/*  64 */       if (paramInt2 > this.d.length) {
/*  65 */         this.r.r(-4700743278891748859L * this.z);
/*  66 */         this.i = (this.z * 4872359221106843645L);
/*  67 */         while (paramInt2 > 0) {
/*  68 */           i2 = this.r.c(paramArrayOfByte, paramInt1, paramInt2, 645224874);
/*  69 */           if (i2 == -1) break;
/*  70 */           this.i += i2 * -548829109393735783L;
/*  71 */           this.z += i2 * 4927525029638752973L;
/*  72 */           paramInt1 += i2;
/*  73 */           paramInt2 -= i2;
/*     */         }
/*     */       }
/*  76 */       if (paramInt2 > 0) {
/*  77 */         n(-1153594963);
/*  78 */         i2 = paramInt2;
/*  79 */         if (i2 > 843134581 * this.m) i2 = this.m * 843134581;
/*  80 */         System.arraycopy(this.d, 0, paramArrayOfByte, paramInt1, i2);
/*  81 */         paramInt1 += i2;
/*  82 */         paramInt2 -= i2;
/*  83 */         this.z += 4927525029638752973L * i2;
/*     */       }
/*  85 */       if (-1L != -8017140494686212151L * this.n) {
/*  86 */         if ((-8017140494686212151L * this.n > this.z * -4700743278891748859L) && (paramInt2 > 0)) {
/*  87 */           i2 = paramInt1 + (int)(-8017140494686212151L * this.n - this.z * -4700743278891748859L);
/*  88 */           if (i2 > paramInt2 + paramInt1) i2 = paramInt2 + paramInt1;
/*  89 */           while (paramInt1 < i2) {
/*  90 */             paramArrayOfByte[(paramInt1++)] = 0;
/*  91 */             paramInt2--;
/*  92 */             this.z += 4927525029638752973L;
/*     */           }
/*     */         }
/*  95 */         long l2 = -1L;
/*  96 */         long l3 = -1L;
/*  97 */         if ((this.n * -8017140494686212151L >= l1) && (this.n * -8017140494686212151L < i1 + l1)) {
/*  98 */           l2 = this.n * -8017140494686212151L;
/*     */         }
/* 100 */         else if ((l1 >= this.n * -8017140494686212151L) && (l1 < -8017140494686212151L * this.n + 1663746677 * this.j)) {
/* 101 */           l2 = l1;
/*     */         }
/* 103 */         if ((-8017140494686212151L * this.n + 1663746677 * this.j > l1) && (this.j * 1663746677 + this.n * -8017140494686212151L <= l1 + i1)) {
/* 104 */           l3 = this.n * -8017140494686212151L + 1663746677 * this.j;
/*     */         }
/* 106 */         else if ((i1 + l1 > -8017140494686212151L * this.n) && (l1 + i1 <= this.j * 1663746677 + -8017140494686212151L * this.n)) {
/* 107 */           l3 = i1 + l1;
/*     */         }
/* 109 */         if ((l2 > -1L) && (l3 > l2)) {
/* 110 */           int i3 = (int)(l3 - l2);
/* 111 */           System.arraycopy(this.c, (int)(l2 - -8017140494686212151L * this.n), paramArrayOfByte, k + (int)(l2 - l1), i3);
/* 112 */           if (l3 > this.z * -4700743278891748859L) {
/* 113 */             paramInt2 = (int)(paramInt2 - (l3 - -4700743278891748859L * this.z));
/* 114 */             this.z = (l3 * 4927525029638752973L);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (IOException localIOException)
/*     */     {
/* 121 */       this.i = 548829109393735783L;
/* 122 */       throw localIOException;
/*     */     }
/* 124 */     if (paramInt2 > 0) throw new EOFException();
/*     */   }
/*     */ 
/*     */   public void r(int paramInt)
/*     */     throws IOException
/*     */   {
/*  28 */     z(744413800);
/*  29 */     this.r.l(1273308593);
/*     */   }
/*     */ 
/*     */   void z(int paramInt)
/*     */     throws IOException
/*     */   {
/* 201 */     if (-1L != this.n * -8017140494686212151L) { if ((paramInt <= 19661088) || 
/* 202 */         (-8017140494686212151L * this.n != this.i * -8539982320472972119L)) { if (paramInt > 19661088);
/* 203 */         this.r.r(-8017140494686212151L * this.n);
/* 204 */         this.i = (this.n * -1101049565050829279L);
/*     */       }
/* 206 */       this.r.d(this.c, 0, this.j * 1663746677, 1722259904);
/* 207 */       this.i += 7168816546579350253L * this.j;
/* 208 */       if (-8539982320472972119L * this.i > this.g * 4112281867670587389L) { if (paramInt > 19661088);
/* 208 */         this.g = (-6639242460214279907L * this.i); }
/* 209 */       long l1 = -1L;
/* 210 */       long l2 = -1L;
/* 211 */       if (this.n * -8017140494686212151L >= 7598901720898890861L * this.l) { if (paramInt <= 19661088) return; if (-8017140494686212151L * this.n < this.l * 7598901720898890861L + 843134581 * this.m) { if (paramInt > 19661088);
/* 212 */           l1 = this.n * -8017140494686212151L; break label320; }
/*     */       }
/* 214 */       if (this.l * 7598901720898890861L >= -8017140494686212151L * this.n) { if (paramInt <= 19661088) return; if (7598901720898890861L * this.l < this.n * -8017140494686212151L + 1663746677 * this.j) { if (paramInt > 19661088);
/* 215 */           l1 = 7598901720898890861L * this.l; }
/*     */       }
/* 217 */       label320: if ((this.n * -8017140494686212151L + this.j * 1663746677 > this.l * 7598901720898890861L) && ((paramInt <= 19661088) || (-8017140494686212151L * this.n + 1663746677 * this.j <= 843134581 * this.m + this.l * 7598901720898890861L))) { if (paramInt <= 19661088) throw new IllegalStateException();
/* 218 */         l2 = 1663746677 * this.j + this.n * -8017140494686212151L;
/*     */       }
/* 220 */       else if (this.l * 7598901720898890861L + this.m * 843134581 > -8017140494686212151L * this.n) { if (paramInt <= 19661088) return; if (this.l * 7598901720898890861L + 843134581 * this.m <= -8017140494686212151L * this.n + 1663746677 * this.j) { if (paramInt > 19661088);
/* 221 */           l2 = this.m * 843134581 + 7598901720898890861L * this.l; }
/*     */       }
/* 223 */       if (l1 > -1L) { if (paramInt <= 19661088) return; if (l2 > l1) { if (paramInt > 19661088);
/* 224 */           int k = (int)(l2 - l1);
/* 225 */           System.arraycopy(this.c, (int)(l1 - this.n * -8017140494686212151L), this.d, (int)(l1 - this.l * 7598901720898890861L), k); }
/*     */       }
/* 227 */       this.n = -7174813313359092345L;
/* 228 */       this.j = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void i(long paramLong)
/*     */     throws IOException
/*     */   {
/*  33 */     if (paramLong < 0L) throw new IOException("");
/*  34 */     this.z = (paramLong * 4927525029638752973L);
/*     */   }
/*     */ 
/*     */   public void q(long paramLong)
/*     */     throws IOException
/*     */   {
/*  33 */     if (paramLong < 0L) throw new IOException("");
/*  34 */     this.z = (paramLong * 4927525029638752973L);
/*     */   }
/*     */ 
/*     */   public void p(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */     throws IOException
/*     */   {
/*     */     try
/*     */     {
/* 144 */       if (paramInt2 + -4700743278891748859L * this.z > -4971064922075556127L * this.q) this.q = ((this.z * -4700743278891748859L + paramInt2) * 5903975295553088801L);
/* 145 */       if ((this.n * -8017140494686212151L != -1L) && ((this.z * -4700743278891748859L < this.n * -8017140494686212151L) || (-4700743278891748859L * this.z > 1663746677 * this.j + this.n * -8017140494686212151L))) {
/* 146 */         z(341001793);
/*     */       }
/* 148 */       if ((-1L != -8017140494686212151L * this.n) && (this.z * -4700743278891748859L + paramInt2 > this.n * -8017140494686212151L + this.c.length)) {
/* 149 */         int k = (int)(this.c.length - (-4700743278891748859L * this.z - this.n * -8017140494686212151L));
/* 150 */         System.arraycopy(paramArrayOfByte, paramInt1, this.c, (int)(this.z * -4700743278891748859L - -8017140494686212151L * this.n), k);
/* 151 */         this.z += 4927525029638752973L * k;
/* 152 */         paramInt1 += k;
/* 153 */         paramInt2 -= k;
/* 154 */         this.j = (this.c.length * 1278705117);
/* 155 */         z(1236299304);
/*     */       }
/* 157 */       if (paramInt2 > this.c.length) {
/* 158 */         if (this.z * -4700743278891748859L != -8539982320472972119L * this.i) {
/* 159 */           this.r.r(-4700743278891748859L * this.z);
/* 160 */           this.i = (this.z * 4872359221106843645L);
/*     */         }
/* 162 */         this.r.d(paramArrayOfByte, paramInt1, paramInt2, 1875544383);
/* 163 */         this.i += -548829109393735783L * paramInt2;
/* 164 */         if (this.i * -8539982320472972119L > 4112281867670587389L * this.g) this.g = (-6639242460214279907L * this.i);
/* 165 */         long l1 = -1L;
/* 166 */         long l2 = -1L;
/* 167 */         if ((this.z * -4700743278891748859L >= 7598901720898890861L * this.l) && (-4700743278891748859L * this.z < this.l * 7598901720898890861L + this.m * 843134581)) {
/* 168 */           l1 = this.z * -4700743278891748859L;
/*     */         }
/* 170 */         else if ((this.l * 7598901720898890861L >= -4700743278891748859L * this.z) && (this.l * 7598901720898890861L < -4700743278891748859L * this.z + paramInt2)) {
/* 171 */           l1 = 7598901720898890861L * this.l;
/*     */         }
/* 173 */         if ((this.z * -4700743278891748859L + paramInt2 > this.l * 7598901720898890861L) && (this.z * -4700743278891748859L + paramInt2 <= 843134581 * this.m + 7598901720898890861L * this.l)) {
/* 174 */           l2 = -4700743278891748859L * this.z + paramInt2;
/*     */         }
/* 176 */         else if ((843134581 * this.m + 7598901720898890861L * this.l > -4700743278891748859L * this.z) && (7598901720898890861L * this.l + this.m * 843134581 <= paramInt2 + this.z * -4700743278891748859L)) {
/* 177 */           l2 = this.l * 7598901720898890861L + 843134581 * this.m;
/*     */         }
/* 179 */         if ((l1 > -1L) && (l2 > l1)) {
/* 180 */           int i1 = (int)(l2 - l1);
/* 181 */           System.arraycopy(paramArrayOfByte, (int)(paramInt1 + l1 - this.z * -4700743278891748859L), this.d, (int)(l1 - this.l * 7598901720898890861L), i1);
/*     */         }
/* 183 */         this.z += 4927525029638752973L * paramInt2;
/* 184 */         return;
/*     */       }
/* 186 */       if (paramInt2 > 0) {
/* 187 */         if (this.n * -8017140494686212151L == -1L) this.n = (-3201707768008071587L * this.z);
/* 188 */         System.arraycopy(paramArrayOfByte, paramInt1, this.c, (int)(this.z * -4700743278891748859L - this.n * -8017140494686212151L), paramInt2);
/* 189 */         this.z += paramInt2 * 4927525029638752973L;
/* 190 */         if (this.z * -4700743278891748859L - this.n * -8017140494686212151L > 1663746677 * this.j) this.j = ((int)(-4700743278891748859L * this.z - this.n * -8017140494686212151L) * 1278705117);
/* 191 */         return;
/*     */       }
/*     */     }
/*     */     catch (IOException localIOException) {
/* 195 */       this.i = 548829109393735783L;
/* 196 */       throw localIOException;
/*     */     }
/*     */   }
/*     */ 
/*     */   public long s()
/*     */   {
/*  38 */     return -4971064922075556127L * this.q;
/*     */   }
/*     */ 
/*     */   public void u(byte[] paramArrayOfByte) throws IOException {
/*  42 */     c(paramArrayOfByte, 0, paramArrayOfByte.length, 839635578); } 
/*  42 */   public void v(byte[] paramArrayOfByte) throws IOException { c(paramArrayOfByte, 0, paramArrayOfByte.length, 1652105448); }
/*     */ 
/*     */   public void e(byte[] paramArrayOfByte, int paramInt1, int paramInt2) throws IOException
/*     */   {
/*     */     try {
/*  47 */       if (paramInt2 + paramInt1 > paramArrayOfByte.length) throw new ArrayIndexOutOfBoundsException(paramInt1 + paramInt2 - paramArrayOfByte.length);
/*  48 */       if ((-1L != this.n * -8017140494686212151L) && (this.z * -4700743278891748859L >= this.n * -8017140494686212151L) && (-4700743278891748859L * this.z + paramInt2 <= -8017140494686212151L * this.n + 1663746677 * this.j)) {
/*  49 */         System.arraycopy(this.c, (int)(-4700743278891748859L * this.z - -8017140494686212151L * this.n), paramArrayOfByte, paramInt1, paramInt2);
/*  50 */         this.z += 4927525029638752973L * paramInt2;
/*  51 */         return;
/*     */       }
/*  53 */       long l1 = -4700743278891748859L * this.z;
/*  54 */       int k = paramInt1;
/*  55 */       int i1 = paramInt2;
/*     */       int i2;
/*  56 */       if ((this.z * -4700743278891748859L >= this.l * 7598901720898890861L) && (-4700743278891748859L * this.z < 7598901720898890861L * this.l + this.m * 843134581)) {
/*  57 */         i2 = (int)(this.m * 843134581 - (this.z * -4700743278891748859L - 7598901720898890861L * this.l));
/*  58 */         if (i2 > paramInt2) i2 = paramInt2;
/*  59 */         System.arraycopy(this.d, (int)(this.z * -4700743278891748859L - this.l * 7598901720898890861L), paramArrayOfByte, paramInt1, i2);
/*  60 */         this.z += 4927525029638752973L * i2;
/*  61 */         paramInt1 += i2;
/*  62 */         paramInt2 -= i2;
/*     */       }
/*  64 */       if (paramInt2 > this.d.length) {
/*  65 */         this.r.r(-4700743278891748859L * this.z);
/*  66 */         this.i = (this.z * 4872359221106843645L);
/*  67 */         while (paramInt2 > 0) {
/*  68 */           i2 = this.r.c(paramArrayOfByte, paramInt1, paramInt2, -1818922376);
/*  69 */           if (i2 == -1) break;
/*  70 */           this.i += i2 * -548829109393735783L;
/*  71 */           this.z += i2 * 4927525029638752973L;
/*  72 */           paramInt1 += i2;
/*  73 */           paramInt2 -= i2;
/*     */         }
/*     */       }
/*  76 */       if (paramInt2 > 0) {
/*  77 */         n(-1153594963);
/*  78 */         i2 = paramInt2;
/*  79 */         if (i2 > 843134581 * this.m) i2 = this.m * 843134581;
/*  80 */         System.arraycopy(this.d, 0, paramArrayOfByte, paramInt1, i2);
/*  81 */         paramInt1 += i2;
/*  82 */         paramInt2 -= i2;
/*  83 */         this.z += 4927525029638752973L * i2;
/*     */       }
/*  85 */       if (-1L != -8017140494686212151L * this.n) {
/*  86 */         if ((-8017140494686212151L * this.n > this.z * -4700743278891748859L) && (paramInt2 > 0)) {
/*  87 */           i2 = paramInt1 + (int)(-8017140494686212151L * this.n - this.z * -4700743278891748859L);
/*  88 */           if (i2 > paramInt2 + paramInt1) i2 = paramInt2 + paramInt1;
/*  89 */           while (paramInt1 < i2) {
/*  90 */             paramArrayOfByte[(paramInt1++)] = 0;
/*  91 */             paramInt2--;
/*  92 */             this.z += 4927525029638752973L;
/*     */           }
/*     */         }
/*  95 */         long l2 = -1L;
/*  96 */         long l3 = -1L;
/*  97 */         if ((this.n * -8017140494686212151L >= l1) && (this.n * -8017140494686212151L < i1 + l1)) {
/*  98 */           l2 = this.n * -8017140494686212151L;
/*     */         }
/* 100 */         else if ((l1 >= this.n * -8017140494686212151L) && (l1 < -8017140494686212151L * this.n + 1663746677 * this.j)) {
/* 101 */           l2 = l1;
/*     */         }
/* 103 */         if ((-8017140494686212151L * this.n + 1663746677 * this.j > l1) && (this.j * 1663746677 + this.n * -8017140494686212151L <= l1 + i1)) {
/* 104 */           l3 = this.n * -8017140494686212151L + 1663746677 * this.j;
/*     */         }
/* 106 */         else if ((i1 + l1 > -8017140494686212151L * this.n) && (l1 + i1 <= this.j * 1663746677 + -8017140494686212151L * this.n)) {
/* 107 */           l3 = i1 + l1;
/*     */         }
/* 109 */         if ((l2 > -1L) && (l3 > l2)) {
/* 110 */           int i3 = (int)(l3 - l2);
/* 111 */           System.arraycopy(this.c, (int)(l2 - -8017140494686212151L * this.n), paramArrayOfByte, k + (int)(l2 - l1), i3);
/* 112 */           if (l3 > this.z * -4700743278891748859L) {
/* 113 */             paramInt2 = (int)(paramInt2 - (l3 - -4700743278891748859L * this.z));
/* 114 */             this.z = (l3 * 4927525029638752973L);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (IOException localIOException)
/*     */     {
/* 121 */       this.i = 548829109393735783L;
/* 122 */       throw localIOException;
/*     */     }
/* 124 */     if (paramInt2 > 0) throw new EOFException(); 
/*     */   }
/*     */ 
/*     */   void h() throws IOException {
/* 128 */     this.m = 0;
/* 129 */     if (-4700743278891748859L * this.z != this.i * -8539982320472972119L) {
/* 130 */       this.r.r(-4700743278891748859L * this.z);
/* 131 */       this.i = (4872359221106843645L * this.z);
/*     */     }
/* 133 */     this.l = (this.z * -2158931229408350983L);
/* 134 */     while (843134581 * this.m < this.d.length) {
/* 135 */       int k = this.r.c(this.d, 843134581 * this.m, this.d.length - this.m * 843134581, 1697149034);
/* 136 */       if (-1 == k) break;
/* 137 */       this.i += -548829109393735783L * k;
/* 138 */       this.m += -2061080099 * k;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */     throws IOException
/*     */   {
/*     */     try
/*     */     {
/*  47 */       if (paramInt2 + paramInt1 > paramArrayOfByte.length) throw new ArrayIndexOutOfBoundsException(paramInt1 + paramInt2 - paramArrayOfByte.length);
/*  48 */       if ((-1L != this.n * -8017140494686212151L) && (this.z * -4700743278891748859L >= this.n * -8017140494686212151L) && (-4700743278891748859L * this.z + paramInt2 <= -8017140494686212151L * this.n + 1663746677 * this.j)) {
/*  49 */         System.arraycopy(this.c, (int)(-4700743278891748859L * this.z - -8017140494686212151L * this.n), paramArrayOfByte, paramInt1, paramInt2);
/*  50 */         this.z += 4927525029638752973L * paramInt2;
/*  51 */         return;
/*     */       }
/*  53 */       long l1 = -4700743278891748859L * this.z;
/*  54 */       int k = paramInt1;
/*  55 */       int i1 = paramInt2;
/*     */       int i2;
/*  56 */       if ((this.z * -4700743278891748859L >= this.l * 7598901720898890861L) && (-4700743278891748859L * this.z < 7598901720898890861L * this.l + this.m * 843134581)) {
/*  57 */         i2 = (int)(this.m * 843134581 - (this.z * -4700743278891748859L - 7598901720898890861L * this.l));
/*  58 */         if (i2 > paramInt2) i2 = paramInt2;
/*  59 */         System.arraycopy(this.d, (int)(this.z * -4700743278891748859L - this.l * 7598901720898890861L), paramArrayOfByte, paramInt1, i2);
/*  60 */         this.z += 4927525029638752973L * i2;
/*  61 */         paramInt1 += i2;
/*  62 */         paramInt2 -= i2;
/*     */       }
/*  64 */       if (paramInt2 > this.d.length) {
/*  65 */         this.r.r(-4700743278891748859L * this.z);
/*  66 */         this.i = (this.z * 4872359221106843645L);
/*  67 */         while (paramInt2 > 0) {
/*  68 */           i2 = this.r.c(paramArrayOfByte, paramInt1, paramInt2, -198028282);
/*  69 */           if (i2 == -1) break;
/*  70 */           this.i += i2 * -548829109393735783L;
/*  71 */           this.z += i2 * 4927525029638752973L;
/*  72 */           paramInt1 += i2;
/*  73 */           paramInt2 -= i2;
/*     */         }
/*     */       }
/*  76 */       if (paramInt2 > 0) {
/*  77 */         n(-1153594963);
/*  78 */         i2 = paramInt2;
/*  79 */         if (i2 > 843134581 * this.m) i2 = this.m * 843134581;
/*  80 */         System.arraycopy(this.d, 0, paramArrayOfByte, paramInt1, i2);
/*  81 */         paramInt1 += i2;
/*  82 */         paramInt2 -= i2;
/*  83 */         this.z += 4927525029638752973L * i2;
/*     */       }
/*  85 */       if (-1L != -8017140494686212151L * this.n) {
/*  86 */         if ((-8017140494686212151L * this.n > this.z * -4700743278891748859L) && (paramInt2 > 0)) {
/*  87 */           i2 = paramInt1 + (int)(-8017140494686212151L * this.n - this.z * -4700743278891748859L);
/*  88 */           if (i2 > paramInt2 + paramInt1) i2 = paramInt2 + paramInt1;
/*  89 */           while (paramInt1 < i2) {
/*  90 */             paramArrayOfByte[(paramInt1++)] = 0;
/*  91 */             paramInt2--;
/*  92 */             this.z += 4927525029638752973L;
/*     */           }
/*     */         }
/*  95 */         long l2 = -1L;
/*  96 */         long l3 = -1L;
/*  97 */         if ((this.n * -8017140494686212151L >= l1) && (this.n * -8017140494686212151L < i1 + l1)) {
/*  98 */           l2 = this.n * -8017140494686212151L;
/*     */         }
/* 100 */         else if ((l1 >= this.n * -8017140494686212151L) && (l1 < -8017140494686212151L * this.n + 1663746677 * this.j)) {
/* 101 */           l2 = l1;
/*     */         }
/* 103 */         if ((-8017140494686212151L * this.n + 1663746677 * this.j > l1) && (this.j * 1663746677 + this.n * -8017140494686212151L <= l1 + i1)) {
/* 104 */           l3 = this.n * -8017140494686212151L + 1663746677 * this.j;
/*     */         }
/* 106 */         else if ((i1 + l1 > -8017140494686212151L * this.n) && (l1 + i1 <= this.j * 1663746677 + -8017140494686212151L * this.n)) {
/* 107 */           l3 = i1 + l1;
/*     */         }
/* 109 */         if ((l2 > -1L) && (l3 > l2)) {
/* 110 */           int i3 = (int)(l3 - l2);
/* 111 */           System.arraycopy(this.c, (int)(l2 - -8017140494686212151L * this.n), paramArrayOfByte, k + (int)(l2 - l1), i3);
/* 112 */           if (l3 > this.z * -4700743278891748859L) {
/* 113 */             paramInt2 = (int)(paramInt2 - (l3 - -4700743278891748859L * this.z));
/* 114 */             this.z = (l3 * 4927525029638752973L);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (IOException localIOException)
/*     */     {
/* 121 */       this.i = 548829109393735783L;
/* 122 */       throw localIOException;
/*     */     }
/* 124 */     if (paramInt2 > 0) throw new EOFException();
/*     */   }
/*     */ 
/*     */   public v(u paramu, int paramInt1, int paramInt2)
/*     */     throws IOException
/*     */   {
/*  20 */     this.r = paramu;
/*  21 */     this.q = ((this.g = paramu.m(-472140555) * 4705348963461664085L) * 1530596463475884189L);
/*  22 */     this.d = new byte[paramInt1];
/*  23 */     this.c = new byte[paramInt2];
/*  24 */     this.z = 0L;
/*     */   }
/*     */ 
/*     */   public void t(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */     throws IOException
/*     */   {
/*     */     try
/*     */     {
/*  47 */       if (paramInt2 + paramInt1 > paramArrayOfByte.length) throw new ArrayIndexOutOfBoundsException(paramInt1 + paramInt2 - paramArrayOfByte.length);
/*  48 */       if ((-1L != this.n * -8017140494686212151L) && (this.z * -4700743278891748859L >= this.n * -8017140494686212151L) && (-4700743278891748859L * this.z + paramInt2 <= -8017140494686212151L * this.n + 1663746677 * this.j)) {
/*  49 */         System.arraycopy(this.c, (int)(-4700743278891748859L * this.z - -8017140494686212151L * this.n), paramArrayOfByte, paramInt1, paramInt2);
/*  50 */         this.z += 4927525029638752973L * paramInt2;
/*  51 */         return;
/*     */       }
/*  53 */       long l1 = -4700743278891748859L * this.z;
/*  54 */       int k = paramInt1;
/*  55 */       int i1 = paramInt2;
/*     */       int i2;
/*  56 */       if ((this.z * -4700743278891748859L >= this.l * 7598901720898890861L) && (-4700743278891748859L * this.z < 7598901720898890861L * this.l + this.m * 843134581)) {
/*  57 */         i2 = (int)(this.m * 843134581 - (this.z * -4700743278891748859L - 7598901720898890861L * this.l));
/*  58 */         if (i2 > paramInt2) i2 = paramInt2;
/*  59 */         System.arraycopy(this.d, (int)(this.z * -4700743278891748859L - this.l * 7598901720898890861L), paramArrayOfByte, paramInt1, i2);
/*  60 */         this.z += 4927525029638752973L * i2;
/*  61 */         paramInt1 += i2;
/*  62 */         paramInt2 -= i2;
/*     */       }
/*  64 */       if (paramInt2 > this.d.length) {
/*  65 */         this.r.r(-4700743278891748859L * this.z);
/*  66 */         this.i = (this.z * 4872359221106843645L);
/*  67 */         while (paramInt2 > 0) {
/*  68 */           i2 = this.r.c(paramArrayOfByte, paramInt1, paramInt2, -206129027);
/*  69 */           if (i2 == -1) break;
/*  70 */           this.i += i2 * -548829109393735783L;
/*  71 */           this.z += i2 * 4927525029638752973L;
/*  72 */           paramInt1 += i2;
/*  73 */           paramInt2 -= i2;
/*     */         }
/*     */       }
/*  76 */       if (paramInt2 > 0) {
/*  77 */         n(-1153594963);
/*  78 */         i2 = paramInt2;
/*  79 */         if (i2 > 843134581 * this.m) i2 = this.m * 843134581;
/*  80 */         System.arraycopy(this.d, 0, paramArrayOfByte, paramInt1, i2);
/*  81 */         paramInt1 += i2;
/*  82 */         paramInt2 -= i2;
/*  83 */         this.z += 4927525029638752973L * i2;
/*     */       }
/*  85 */       if (-1L != -8017140494686212151L * this.n) {
/*  86 */         if ((-8017140494686212151L * this.n > this.z * -4700743278891748859L) && (paramInt2 > 0)) {
/*  87 */           i2 = paramInt1 + (int)(-8017140494686212151L * this.n - this.z * -4700743278891748859L);
/*  88 */           if (i2 > paramInt2 + paramInt1) i2 = paramInt2 + paramInt1;
/*  89 */           while (paramInt1 < i2) {
/*  90 */             paramArrayOfByte[(paramInt1++)] = 0;
/*  91 */             paramInt2--;
/*  92 */             this.z += 4927525029638752973L;
/*     */           }
/*     */         }
/*  95 */         long l2 = -1L;
/*  96 */         long l3 = -1L;
/*  97 */         if ((this.n * -8017140494686212151L >= l1) && (this.n * -8017140494686212151L < i1 + l1)) {
/*  98 */           l2 = this.n * -8017140494686212151L;
/*     */         }
/* 100 */         else if ((l1 >= this.n * -8017140494686212151L) && (l1 < -8017140494686212151L * this.n + 1663746677 * this.j)) {
/* 101 */           l2 = l1;
/*     */         }
/* 103 */         if ((-8017140494686212151L * this.n + 1663746677 * this.j > l1) && (this.j * 1663746677 + this.n * -8017140494686212151L <= l1 + i1)) {
/* 104 */           l3 = this.n * -8017140494686212151L + 1663746677 * this.j;
/*     */         }
/* 106 */         else if ((i1 + l1 > -8017140494686212151L * this.n) && (l1 + i1 <= this.j * 1663746677 + -8017140494686212151L * this.n)) {
/* 107 */           l3 = i1 + l1;
/*     */         }
/* 109 */         if ((l2 > -1L) && (l3 > l2)) {
/* 110 */           int i3 = (int)(l3 - l2);
/* 111 */           System.arraycopy(this.c, (int)(l2 - -8017140494686212151L * this.n), paramArrayOfByte, k + (int)(l2 - l1), i3);
/* 112 */           if (l3 > this.z * -4700743278891748859L) {
/* 113 */             paramInt2 = (int)(paramInt2 - (l3 - -4700743278891748859L * this.z));
/* 114 */             this.z = (l3 * 4927525029638752973L);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (IOException localIOException)
/*     */     {
/* 121 */       this.i = 548829109393735783L;
/* 122 */       throw localIOException;
/*     */     }
/* 124 */     if (paramInt2 > 0) throw new EOFException();
/*     */   }
/*     */ 
/*     */   public void f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */     throws IOException
/*     */   {
/*     */     try
/*     */     {
/*  47 */       if (paramInt2 + paramInt1 > paramArrayOfByte.length) throw new ArrayIndexOutOfBoundsException(paramInt1 + paramInt2 - paramArrayOfByte.length);
/*  48 */       if ((-1L != this.n * -8017140494686212151L) && (this.z * -4700743278891748859L >= this.n * -8017140494686212151L) && (-4700743278891748859L * this.z + paramInt2 <= -8017140494686212151L * this.n + 1663746677 * this.j)) {
/*  49 */         System.arraycopy(this.c, (int)(-4700743278891748859L * this.z - -8017140494686212151L * this.n), paramArrayOfByte, paramInt1, paramInt2);
/*  50 */         this.z += 4927525029638752973L * paramInt2;
/*  51 */         return;
/*     */       }
/*  53 */       long l1 = -4700743278891748859L * this.z;
/*  54 */       int k = paramInt1;
/*  55 */       int i1 = paramInt2;
/*     */       int i2;
/*  56 */       if ((this.z * -4700743278891748859L >= this.l * 7598901720898890861L) && (-4700743278891748859L * this.z < 7598901720898890861L * this.l + this.m * 843134581)) {
/*  57 */         i2 = (int)(this.m * 843134581 - (this.z * -4700743278891748859L - 7598901720898890861L * this.l));
/*  58 */         if (i2 > paramInt2) i2 = paramInt2;
/*  59 */         System.arraycopy(this.d, (int)(this.z * -4700743278891748859L - this.l * 7598901720898890861L), paramArrayOfByte, paramInt1, i2);
/*  60 */         this.z += 4927525029638752973L * i2;
/*  61 */         paramInt1 += i2;
/*  62 */         paramInt2 -= i2;
/*     */       }
/*  64 */       if (paramInt2 > this.d.length) {
/*  65 */         this.r.r(-4700743278891748859L * this.z);
/*  66 */         this.i = (this.z * 4872359221106843645L);
/*  67 */         while (paramInt2 > 0) {
/*  68 */           i2 = this.r.c(paramArrayOfByte, paramInt1, paramInt2, -130941391);
/*  69 */           if (i2 == -1) break;
/*  70 */           this.i += i2 * -548829109393735783L;
/*  71 */           this.z += i2 * 4927525029638752973L;
/*  72 */           paramInt1 += i2;
/*  73 */           paramInt2 -= i2;
/*     */         }
/*     */       }
/*  76 */       if (paramInt2 > 0) {
/*  77 */         n(-1153594963);
/*  78 */         i2 = paramInt2;
/*  79 */         if (i2 > 843134581 * this.m) i2 = this.m * 843134581;
/*  80 */         System.arraycopy(this.d, 0, paramArrayOfByte, paramInt1, i2);
/*  81 */         paramInt1 += i2;
/*  82 */         paramInt2 -= i2;
/*  83 */         this.z += 4927525029638752973L * i2;
/*     */       }
/*  85 */       if (-1L != -8017140494686212151L * this.n) {
/*  86 */         if ((-8017140494686212151L * this.n > this.z * -4700743278891748859L) && (paramInt2 > 0)) {
/*  87 */           i2 = paramInt1 + (int)(-8017140494686212151L * this.n - this.z * -4700743278891748859L);
/*  88 */           if (i2 > paramInt2 + paramInt1) i2 = paramInt2 + paramInt1;
/*  89 */           while (paramInt1 < i2) {
/*  90 */             paramArrayOfByte[(paramInt1++)] = 0;
/*  91 */             paramInt2--;
/*  92 */             this.z += 4927525029638752973L;
/*     */           }
/*     */         }
/*  95 */         long l2 = -1L;
/*  96 */         long l3 = -1L;
/*  97 */         if ((this.n * -8017140494686212151L >= l1) && (this.n * -8017140494686212151L < i1 + l1)) {
/*  98 */           l2 = this.n * -8017140494686212151L;
/*     */         }
/* 100 */         else if ((l1 >= this.n * -8017140494686212151L) && (l1 < -8017140494686212151L * this.n + 1663746677 * this.j)) {
/* 101 */           l2 = l1;
/*     */         }
/* 103 */         if ((-8017140494686212151L * this.n + 1663746677 * this.j > l1) && (this.j * 1663746677 + this.n * -8017140494686212151L <= l1 + i1)) {
/* 104 */           l3 = this.n * -8017140494686212151L + 1663746677 * this.j;
/*     */         }
/* 106 */         else if ((i1 + l1 > -8017140494686212151L * this.n) && (l1 + i1 <= this.j * 1663746677 + -8017140494686212151L * this.n)) {
/* 107 */           l3 = i1 + l1;
/*     */         }
/* 109 */         if ((l2 > -1L) && (l3 > l2)) {
/* 110 */           int i3 = (int)(l3 - l2);
/* 111 */           System.arraycopy(this.c, (int)(l2 - -8017140494686212151L * this.n), paramArrayOfByte, k + (int)(l2 - l1), i3);
/* 112 */           if (l3 > this.z * -4700743278891748859L) {
/* 113 */             paramInt2 = (int)(paramInt2 - (l3 - -4700743278891748859L * this.z));
/* 114 */             this.z = (l3 * 4927525029638752973L);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (IOException localIOException)
/*     */     {
/* 121 */       this.i = 548829109393735783L;
/* 122 */       throw localIOException;
/*     */     }
/* 124 */     if (paramInt2 > 0) throw new EOFException(); 
/*     */   }
/*     */ 
/*     */   void k() throws IOException {
/* 128 */     this.m = 0;
/* 129 */     if (-4700743278891748859L * this.z != this.i * -8539982320472972119L) {
/* 130 */       this.r.r(-4700743278891748859L * this.z);
/* 131 */       this.i = (4872359221106843645L * this.z);
/*     */     }
/* 133 */     this.l = (this.z * -2158931229408350983L);
/* 134 */     while (843134581 * this.m < this.d.length) {
/* 135 */       int k = this.r.c(this.d, 843134581 * this.m, this.d.length - this.m * 843134581, -2110389740);
/* 136 */       if (-1 == k) break;
/* 137 */       this.i += -548829109393735783L * k;
/* 138 */       this.m += -2061080099 * k;
/*     */     }
/*     */   }
/*     */ 
/*     */   void o()
/*     */     throws IOException
/*     */   {
/* 128 */     this.m = 0;
/* 129 */     if (-4700743278891748859L * this.z != this.i * -8539982320472972119L) {
/* 130 */       this.r.r(-4700743278891748859L * this.z);
/* 131 */       this.i = (4872359221106843645L * this.z);
/*     */     }
/* 133 */     this.l = (this.z * -2158931229408350983L);
/* 134 */     while (843134581 * this.m < this.d.length) {
/* 135 */       int k = this.r.c(this.d, 843134581 * this.m, this.d.length - this.m * 843134581, -1234648260);
/* 136 */       if (-1 == k) break;
/* 137 */       this.i += -548829109393735783L * k;
/* 138 */       this.m += -2061080099 * k;
/*     */     }
/*     */   }
/*     */ 
/*     */   void a()
/*     */     throws IOException
/*     */   {
/* 128 */     this.m = 0;
/* 129 */     if (-4700743278891748859L * this.z != this.i * -8539982320472972119L) {
/* 130 */       this.r.r(-4700743278891748859L * this.z);
/* 131 */       this.i = (4872359221106843645L * this.z);
/*     */     }
/* 133 */     this.l = (this.z * -2158931229408350983L);
/* 134 */     while (843134581 * this.m < this.d.length) {
/* 135 */       int k = this.r.c(this.d, 843134581 * this.m, this.d.length - this.m * 843134581, 1408997657);
/* 136 */       if (-1 == k) break;
/* 137 */       this.i += -548829109393735783L * k;
/* 138 */       this.m += -2061080099 * k;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void j(byte[] paramArrayOfByte, int paramInt1, int paramInt2, byte paramByte) throws IOException {
/*     */     try {
/* 144 */       if (paramInt2 + -4700743278891748859L * this.z > -4971064922075556127L * this.q) { if (paramByte <= 0) return; this.q = ((this.z * -4700743278891748859L + paramInt2) * 5903975295553088801L); }
/* 145 */       if (this.n * -8017140494686212151L != -1L) { if (paramByte <= 0) throw new IllegalStateException(); if (this.z * -4700743278891748859L >= this.n * -8017140494686212151L) { if ((paramByte > 0) && (-4700743278891748859L * this.z <= 1663746677 * this.j + this.n * -8017140494686212151L)) break label151; if (paramByte <= 0); }
/* 146 */         z(393540043);
/*     */       }
/* 148 */       label151: if ((-1L != -8017140494686212151L * this.n) && ((paramByte <= 0) || (this.z * -4700743278891748859L + paramInt2 > this.n * -8017140494686212151L + this.c.length))) { if (paramByte > 0);
/* 149 */         int k = (int)(this.c.length - (-4700743278891748859L * this.z - this.n * -8017140494686212151L));
/* 150 */         System.arraycopy(paramArrayOfByte, paramInt1, this.c, (int)(this.z * -4700743278891748859L - -8017140494686212151L * this.n), k);
/* 151 */         this.z += 4927525029638752973L * k;
/* 152 */         paramInt1 += k;
/* 153 */         paramInt2 -= k;
/* 154 */         this.j = (this.c.length * 1278705117);
/* 155 */         z(1018762232);
/*     */       }
/* 157 */       if (paramInt2 > this.c.length) { if (paramByte <= 0) throw new IllegalStateException();
/* 158 */         if (this.z * -4700743278891748859L != -8539982320472972119L * this.i) { if (paramByte <= 0) return;
/* 159 */           this.r.r(-4700743278891748859L * this.z);
/* 160 */           this.i = (this.z * 4872359221106843645L);
/*     */         }
/* 162 */         this.r.d(paramArrayOfByte, paramInt1, paramInt2, 1978271760);
/* 163 */         this.i += -548829109393735783L * paramInt2;
/* 164 */         if (this.i * -8539982320472972119L > 4112281867670587389L * this.g) { if (paramByte > 0);
/* 164 */           this.g = (-6639242460214279907L * this.i); }
/* 165 */         long l1 = -1L;
/* 166 */         long l2 = -1L;
/* 167 */         if ((this.z * -4700743278891748859L >= 7598901720898890861L * this.l) && ((paramByte <= 0) || (-4700743278891748859L * this.z < this.l * 7598901720898890861L + this.m * 843134581))) { if (paramByte <= 0) return;
/* 168 */           l1 = this.z * -4700743278891748859L;
/*     */         }
/* 170 */         else if ((this.l * 7598901720898890861L >= -4700743278891748859L * this.z) && ((paramByte <= 0) || (this.l * 7598901720898890861L < -4700743278891748859L * this.z + paramInt2))) { if (paramByte > 0);
/* 171 */           l1 = 7598901720898890861L * this.l;
/*     */         }
/* 173 */         if ((this.z * -4700743278891748859L + paramInt2 > this.l * 7598901720898890861L) && ((paramByte <= 0) || (this.z * -4700743278891748859L + paramInt2 <= 843134581 * this.m + 7598901720898890861L * this.l))) { if (paramByte > 0);
/* 174 */           l2 = -4700743278891748859L * this.z + paramInt2;
/*     */         }
/* 176 */         else if (843134581 * this.m + 7598901720898890861L * this.l > -4700743278891748859L * this.z) { if (paramByte <= 0) throw new IllegalStateException(); if (7598901720898890861L * this.l + this.m * 843134581 <= paramInt2 + this.z * -4700743278891748859L) { if (paramByte <= 0) throw new IllegalStateException();
/* 177 */             l2 = this.l * 7598901720898890861L + 843134581 * this.m; }
/*     */         }
/* 179 */         if ((l1 > -1L) && ((paramByte <= 0) || (l2 > l1))) { if (paramByte > 0);
/* 180 */           int i1 = (int)(l2 - l1);
/* 181 */           System.arraycopy(paramArrayOfByte, (int)(paramInt1 + l1 - this.z * -4700743278891748859L), this.d, (int)(l1 - this.l * 7598901720898890861L), i1);
/*     */         }
/* 183 */         this.z += 4927525029638752973L * paramInt2;
/* 184 */         return;
/*     */       }
/* 186 */       if (paramInt2 > 0) { if (paramByte <= 0) return;
/* 187 */         if (this.n * -8017140494686212151L == -1L) { if (paramByte <= 0) throw new IllegalStateException(); this.n = (-3201707768008071587L * this.z); }
/* 188 */         System.arraycopy(paramArrayOfByte, paramInt1, this.c, (int)(this.z * -4700743278891748859L - this.n * -8017140494686212151L), paramInt2);
/* 189 */         this.z += paramInt2 * 4927525029638752973L;
/* 190 */         if (this.z * -4700743278891748859L - this.n * -8017140494686212151L > 1663746677 * this.j) { if (paramByte <= 0) return; this.j = ((int)(-4700743278891748859L * this.z - this.n * -8017140494686212151L) * 1278705117); }
/* 191 */         return; }
/*     */     }
/*     */     catch (IOException localIOException)
/*     */     {
/* 195 */       this.i = 548829109393735783L;
/* 196 */       throw localIOException;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void x(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */     throws IOException
/*     */   {
/*     */     try
/*     */     {
/* 144 */       if (paramInt2 + -4700743278891748859L * this.z > -4971064922075556127L * this.q) this.q = ((this.z * -4700743278891748859L + paramInt2) * 5903975295553088801L);
/* 145 */       if ((this.n * -8017140494686212151L != -1L) && ((this.z * -4700743278891748859L < this.n * -8017140494686212151L) || (-4700743278891748859L * this.z > 1663746677 * this.j + this.n * -8017140494686212151L))) {
/* 146 */         z(1496424156);
/*     */       }
/* 148 */       if ((-1L != -8017140494686212151L * this.n) && (this.z * -4700743278891748859L + paramInt2 > this.n * -8017140494686212151L + this.c.length)) {
/* 149 */         int k = (int)(this.c.length - (-4700743278891748859L * this.z - this.n * -8017140494686212151L));
/* 150 */         System.arraycopy(paramArrayOfByte, paramInt1, this.c, (int)(this.z * -4700743278891748859L - -8017140494686212151L * this.n), k);
/* 151 */         this.z += 4927525029638752973L * k;
/* 152 */         paramInt1 += k;
/* 153 */         paramInt2 -= k;
/* 154 */         this.j = (this.c.length * 1278705117);
/* 155 */         z(739397092);
/*     */       }
/* 157 */       if (paramInt2 > this.c.length) {
/* 158 */         if (this.z * -4700743278891748859L != -8539982320472972119L * this.i) {
/* 159 */           this.r.r(-4700743278891748859L * this.z);
/* 160 */           this.i = (this.z * 4872359221106843645L);
/*     */         }
/* 162 */         this.r.d(paramArrayOfByte, paramInt1, paramInt2, 462461737);
/* 163 */         this.i += -548829109393735783L * paramInt2;
/* 164 */         if (this.i * -8539982320472972119L > 4112281867670587389L * this.g) this.g = (-6639242460214279907L * this.i);
/* 165 */         long l1 = -1L;
/* 166 */         long l2 = -1L;
/* 167 */         if ((this.z * -4700743278891748859L >= 7598901720898890861L * this.l) && (-4700743278891748859L * this.z < this.l * 7598901720898890861L + this.m * 843134581)) {
/* 168 */           l1 = this.z * -4700743278891748859L;
/*     */         }
/* 170 */         else if ((this.l * 7598901720898890861L >= -4700743278891748859L * this.z) && (this.l * 7598901720898890861L < -4700743278891748859L * this.z + paramInt2)) {
/* 171 */           l1 = 7598901720898890861L * this.l;
/*     */         }
/* 173 */         if ((this.z * -4700743278891748859L + paramInt2 > this.l * 7598901720898890861L) && (this.z * -4700743278891748859L + paramInt2 <= 843134581 * this.m + 7598901720898890861L * this.l)) {
/* 174 */           l2 = -4700743278891748859L * this.z + paramInt2;
/*     */         }
/* 176 */         else if ((843134581 * this.m + 7598901720898890861L * this.l > -4700743278891748859L * this.z) && (7598901720898890861L * this.l + this.m * 843134581 <= paramInt2 + this.z * -4700743278891748859L)) {
/* 177 */           l2 = this.l * 7598901720898890861L + 843134581 * this.m;
/*     */         }
/* 179 */         if ((l1 > -1L) && (l2 > l1)) {
/* 180 */           int i1 = (int)(l2 - l1);
/* 181 */           System.arraycopy(paramArrayOfByte, (int)(paramInt1 + l1 - this.z * -4700743278891748859L), this.d, (int)(l1 - this.l * 7598901720898890861L), i1);
/*     */         }
/* 183 */         this.z += 4927525029638752973L * paramInt2;
/* 184 */         return;
/*     */       }
/* 186 */       if (paramInt2 > 0) {
/* 187 */         if (this.n * -8017140494686212151L == -1L) this.n = (-3201707768008071587L * this.z);
/* 188 */         System.arraycopy(paramArrayOfByte, paramInt1, this.c, (int)(this.z * -4700743278891748859L - this.n * -8017140494686212151L), paramInt2);
/* 189 */         this.z += paramInt2 * 4927525029638752973L;
/* 190 */         if (this.z * -4700743278891748859L - this.n * -8017140494686212151L > 1663746677 * this.j) this.j = ((int)(-4700743278891748859L * this.z - this.n * -8017140494686212151L) * 1278705117);
/* 191 */         return;
/*     */       }
/*     */     }
/*     */     catch (IOException localIOException) {
/* 195 */       this.i = 548829109393735783L;
/* 196 */       throw localIOException;
/*     */     }
/*     */   }
/*     */ 
/*     */   void aa() throws IOException {
/* 201 */     if (-1L != this.n * -8017140494686212151L) {
/* 202 */       if (-8017140494686212151L * this.n != this.i * -8539982320472972119L) {
/* 203 */         this.r.r(-8017140494686212151L * this.n);
/* 204 */         this.i = (this.n * -1101049565050829279L);
/*     */       }
/* 206 */       this.r.d(this.c, 0, this.j * 1663746677, 1339500746);
/* 207 */       this.i += 7168816546579350253L * this.j;
/* 208 */       if (-8539982320472972119L * this.i > this.g * 4112281867670587389L) this.g = (-6639242460214279907L * this.i);
/* 209 */       long l1 = -1L;
/* 210 */       long l2 = -1L;
/* 211 */       if ((this.n * -8017140494686212151L >= 7598901720898890861L * this.l) && (-8017140494686212151L * this.n < this.l * 7598901720898890861L + 843134581 * this.m)) {
/* 212 */         l1 = this.n * -8017140494686212151L;
/*     */       }
/* 214 */       else if ((this.l * 7598901720898890861L >= -8017140494686212151L * this.n) && (7598901720898890861L * this.l < this.n * -8017140494686212151L + 1663746677 * this.j)) {
/* 215 */         l1 = 7598901720898890861L * this.l;
/*     */       }
/* 217 */       if ((this.n * -8017140494686212151L + this.j * 1663746677 > this.l * 7598901720898890861L) && (-8017140494686212151L * this.n + 1663746677 * this.j <= 843134581 * this.m + this.l * 7598901720898890861L)) {
/* 218 */         l2 = 1663746677 * this.j + this.n * -8017140494686212151L;
/*     */       }
/* 220 */       else if ((this.l * 7598901720898890861L + this.m * 843134581 > -8017140494686212151L * this.n) && (this.l * 7598901720898890861L + 843134581 * this.m <= -8017140494686212151L * this.n + 1663746677 * this.j)) {
/* 221 */         l2 = this.m * 843134581 + 7598901720898890861L * this.l;
/*     */       }
/* 223 */       if ((l1 > -1L) && (l2 > l1)) {
/* 224 */         int k = (int)(l2 - l1);
/* 225 */         System.arraycopy(this.c, (int)(l1 - this.n * -8017140494686212151L), this.d, (int)(l1 - this.l * 7598901720898890861L), k);
/*     */       }
/* 227 */       this.n = -7174813313359092345L;
/* 228 */       this.j = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void ad(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*     */     throws IOException
/*     */   {
/*     */     try
/*     */     {
/* 144 */       if (paramInt2 + -4700743278891748859L * this.z > -4971064922075556127L * this.q) this.q = ((this.z * -4700743278891748859L + paramInt2) * 5903975295553088801L);
/* 145 */       if ((this.n * -8017140494686212151L != -1L) && ((this.z * -4700743278891748859L < this.n * -8017140494686212151L) || (-4700743278891748859L * this.z > 1663746677 * this.j + this.n * -8017140494686212151L))) {
/* 146 */         z(391186314);
/*     */       }
/* 148 */       if ((-1L != -8017140494686212151L * this.n) && (this.z * -4700743278891748859L + paramInt2 > this.n * -8017140494686212151L + this.c.length)) {
/* 149 */         int k = (int)(this.c.length - (-4700743278891748859L * this.z - this.n * -8017140494686212151L));
/* 150 */         System.arraycopy(paramArrayOfByte, paramInt1, this.c, (int)(this.z * -4700743278891748859L - -8017140494686212151L * this.n), k);
/* 151 */         this.z += 4927525029638752973L * k;
/* 152 */         paramInt1 += k;
/* 153 */         paramInt2 -= k;
/* 154 */         this.j = (this.c.length * 1278705117);
/* 155 */         z(1128486649);
/*     */       }
/* 157 */       if (paramInt2 > this.c.length) {
/* 158 */         if (this.z * -4700743278891748859L != -8539982320472972119L * this.i) {
/* 159 */           this.r.r(-4700743278891748859L * this.z);
/* 160 */           this.i = (this.z * 4872359221106843645L);
/*     */         }
/* 162 */         this.r.d(paramArrayOfByte, paramInt1, paramInt2, 1858573754);
/* 163 */         this.i += -548829109393735783L * paramInt2;
/* 164 */         if (this.i * -8539982320472972119L > 4112281867670587389L * this.g) this.g = (-6639242460214279907L * this.i);
/* 165 */         long l1 = -1L;
/* 166 */         long l2 = -1L;
/* 167 */         if ((this.z * -4700743278891748859L >= 7598901720898890861L * this.l) && (-4700743278891748859L * this.z < this.l * 7598901720898890861L + this.m * 843134581)) {
/* 168 */           l1 = this.z * -4700743278891748859L;
/*     */         }
/* 170 */         else if ((this.l * 7598901720898890861L >= -4700743278891748859L * this.z) && (this.l * 7598901720898890861L < -4700743278891748859L * this.z + paramInt2)) {
/* 171 */           l1 = 7598901720898890861L * this.l;
/*     */         }
/* 173 */         if ((this.z * -4700743278891748859L + paramInt2 > this.l * 7598901720898890861L) && (this.z * -4700743278891748859L + paramInt2 <= 843134581 * this.m + 7598901720898890861L * this.l)) {
/* 174 */           l2 = -4700743278891748859L * this.z + paramInt2;
/*     */         }
/* 176 */         else if ((843134581 * this.m + 7598901720898890861L * this.l > -4700743278891748859L * this.z) && (7598901720898890861L * this.l + this.m * 843134581 <= paramInt2 + this.z * -4700743278891748859L)) {
/* 177 */           l2 = this.l * 7598901720898890861L + 843134581 * this.m;
/*     */         }
/* 179 */         if ((l1 > -1L) && (l2 > l1)) {
/* 180 */           int i1 = (int)(l2 - l1);
/* 181 */           System.arraycopy(paramArrayOfByte, (int)(paramInt1 + l1 - this.z * -4700743278891748859L), this.d, (int)(l1 - this.l * 7598901720898890861L), i1);
/*     */         }
/* 183 */         this.z += 4927525029638752973L * paramInt2;
/* 184 */         return;
/*     */       }
/* 186 */       if (paramInt2 > 0) {
/* 187 */         if (this.n * -8017140494686212151L == -1L) this.n = (-3201707768008071587L * this.z);
/* 188 */         System.arraycopy(paramArrayOfByte, paramInt1, this.c, (int)(this.z * -4700743278891748859L - this.n * -8017140494686212151L), paramInt2);
/* 189 */         this.z += paramInt2 * 4927525029638752973L;
/* 190 */         if (this.z * -4700743278891748859L - this.n * -8017140494686212151L > 1663746677 * this.j) this.j = ((int)(-4700743278891748859L * this.z - this.n * -8017140494686212151L) * 1278705117);
/* 191 */         return;
/*     */       }
/*     */     }
/*     */     catch (IOException localIOException) {
/* 195 */       this.i = 548829109393735783L;
/* 196 */       throw localIOException;
/*     */     }
/*     */   }
/*     */ 
/*     */   void ac() throws IOException {
/* 201 */     if (-1L != this.n * -8017140494686212151L) {
/* 202 */       if (-8017140494686212151L * this.n != this.i * -8539982320472972119L) {
/* 203 */         this.r.r(-8017140494686212151L * this.n);
/* 204 */         this.i = (this.n * -1101049565050829279L);
/*     */       }
/* 206 */       this.r.d(this.c, 0, this.j * 1663746677, 475227246);
/* 207 */       this.i += 7168816546579350253L * this.j;
/* 208 */       if (-8539982320472972119L * this.i > this.g * 4112281867670587389L) this.g = (-6639242460214279907L * this.i);
/* 209 */       long l1 = -1L;
/* 210 */       long l2 = -1L;
/* 211 */       if ((this.n * -8017140494686212151L >= 7598901720898890861L * this.l) && (-8017140494686212151L * this.n < this.l * 7598901720898890861L + 843134581 * this.m)) {
/* 212 */         l1 = this.n * -8017140494686212151L;
/*     */       }
/* 214 */       else if ((this.l * 7598901720898890861L >= -8017140494686212151L * this.n) && (7598901720898890861L * this.l < this.n * -8017140494686212151L + 1663746677 * this.j)) {
/* 215 */         l1 = 7598901720898890861L * this.l;
/*     */       }
/* 217 */       if ((this.n * -8017140494686212151L + this.j * 1663746677 > this.l * 7598901720898890861L) && (-8017140494686212151L * this.n + 1663746677 * this.j <= 843134581 * this.m + this.l * 7598901720898890861L)) {
/* 218 */         l2 = 1663746677 * this.j + this.n * -8017140494686212151L;
/*     */       }
/* 220 */       else if ((this.l * 7598901720898890861L + this.m * 843134581 > -8017140494686212151L * this.n) && (this.l * 7598901720898890861L + 843134581 * this.m <= -8017140494686212151L * this.n + 1663746677 * this.j)) {
/* 221 */         l2 = this.m * 843134581 + 7598901720898890861L * this.l;
/*     */       }
/* 223 */       if ((l1 > -1L) && (l2 > l1)) {
/* 224 */         int k = (int)(l2 - l1);
/* 225 */         System.arraycopy(this.c, (int)(l1 - this.n * -8017140494686212151L), this.d, (int)(l1 - this.l * 7598901720898890861L), k);
/*     */       }
/* 227 */       this.n = -7174813313359092345L;
/* 228 */       this.j = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void g()
/*     */     throws IOException
/*     */   {
/*  28 */     z(880064370);
/*  29 */     this.r.l(1273308593);
/*     */   }
/*     */ 
/*     */   void as()
/*     */     throws IOException
/*     */   {
/* 201 */     if (-1L != this.n * -8017140494686212151L) {
/* 202 */       if (-8017140494686212151L * this.n != this.i * -8539982320472972119L) {
/* 203 */         this.r.r(-8017140494686212151L * this.n);
/* 204 */         this.i = (this.n * -1101049565050829279L);
/*     */       }
/* 206 */       this.r.d(this.c, 0, this.j * 1663746677, 702643521);
/* 207 */       this.i += 7168816546579350253L * this.j;
/* 208 */       if (-8539982320472972119L * this.i > this.g * 4112281867670587389L) this.g = (-6639242460214279907L * this.i);
/* 209 */       long l1 = -1L;
/* 210 */       long l2 = -1L;
/* 211 */       if ((this.n * -8017140494686212151L >= 7598901720898890861L * this.l) && (-8017140494686212151L * this.n < this.l * 7598901720898890861L + 843134581 * this.m)) {
/* 212 */         l1 = this.n * -8017140494686212151L;
/*     */       }
/* 214 */       else if ((this.l * 7598901720898890861L >= -8017140494686212151L * this.n) && (7598901720898890861L * this.l < this.n * -8017140494686212151L + 1663746677 * this.j)) {
/* 215 */         l1 = 7598901720898890861L * this.l;
/*     */       }
/* 217 */       if ((this.n * -8017140494686212151L + this.j * 1663746677 > this.l * 7598901720898890861L) && (-8017140494686212151L * this.n + 1663746677 * this.j <= 843134581 * this.m + this.l * 7598901720898890861L)) {
/* 218 */         l2 = 1663746677 * this.j + this.n * -8017140494686212151L;
/*     */       }
/* 220 */       else if ((this.l * 7598901720898890861L + this.m * 843134581 > -8017140494686212151L * this.n) && (this.l * 7598901720898890861L + 843134581 * this.m <= -8017140494686212151L * this.n + 1663746677 * this.j)) {
/* 221 */         l2 = this.m * 843134581 + 7598901720898890861L * this.l;
/*     */       }
/* 223 */       if ((l1 > -1L) && (l2 > l1)) {
/* 224 */         int k = (int)(l2 - l1);
/* 225 */         System.arraycopy(this.c, (int)(l1 - this.n * -8017140494686212151L), this.d, (int)(l1 - this.l * 7598901720898890861L), k);
/*     */       }
/* 227 */       this.n = -7174813313359092345L;
/* 228 */       this.j = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   void am()
/*     */     throws IOException
/*     */   {
/* 201 */     if (-1L != this.n * -8017140494686212151L) {
/* 202 */       if (-8017140494686212151L * this.n != this.i * -8539982320472972119L) {
/* 203 */         this.r.r(-8017140494686212151L * this.n);
/* 204 */         this.i = (this.n * -1101049565050829279L);
/*     */       }
/* 206 */       this.r.d(this.c, 0, this.j * 1663746677, 1418301569);
/* 207 */       this.i += 7168816546579350253L * this.j;
/* 208 */       if (-8539982320472972119L * this.i > this.g * 4112281867670587389L) this.g = (-6639242460214279907L * this.i);
/* 209 */       long l1 = -1L;
/* 210 */       long l2 = -1L;
/* 211 */       if ((this.n * -8017140494686212151L >= 7598901720898890861L * this.l) && (-8017140494686212151L * this.n < this.l * 7598901720898890861L + 843134581 * this.m)) {
/* 212 */         l1 = this.n * -8017140494686212151L;
/*     */       }
/* 214 */       else if ((this.l * 7598901720898890861L >= -8017140494686212151L * this.n) && (7598901720898890861L * this.l < this.n * -8017140494686212151L + 1663746677 * this.j)) {
/* 215 */         l1 = 7598901720898890861L * this.l;
/*     */       }
/* 217 */       if ((this.n * -8017140494686212151L + this.j * 1663746677 > this.l * 7598901720898890861L) && (-8017140494686212151L * this.n + 1663746677 * this.j <= 843134581 * this.m + this.l * 7598901720898890861L)) {
/* 218 */         l2 = 1663746677 * this.j + this.n * -8017140494686212151L;
/*     */       }
/* 220 */       else if ((this.l * 7598901720898890861L + this.m * 843134581 > -8017140494686212151L * this.n) && (this.l * 7598901720898890861L + 843134581 * this.m <= -8017140494686212151L * this.n + 1663746677 * this.j)) {
/* 221 */         l2 = this.m * 843134581 + 7598901720898890861L * this.l;
/*     */       }
/* 223 */       if ((l1 > -1L) && (l2 > l1)) {
/* 224 */         int k = (int)(l2 - l1);
/* 225 */         System.arraycopy(this.c, (int)(l1 - this.n * -8017140494686212151L), this.d, (int)(l1 - this.l * 7598901720898890861L), k);
/*     */       }
/* 227 */       this.n = -7174813313359092345L;
/* 228 */       this.j = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   static int n(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 303 */     long l1 = (paramInt1 << 16) + paramInt2;
/* 304 */     if (null != bx.v) { if (paramInt3 != 47457749) throw new IllegalStateException(); if (bx.v.r == l1) break label56; if (paramInt3 != 47457749) throw new IllegalStateException();  } return 0;
/* 305 */     label56: return 2041748597 * cu.e.c / (cu.e.m.length - bx.v.z) + 1;
/*     */   }
/*     */ 
/*     */   static int r(int paramInt)
/*     */   {
/*  85 */     return 6;
/*     */   }
/*     */ 
/*     */   public static void r(Component paramComponent, int paramInt)
/*     */   {
/*  32 */     paramComponent.addMouseListener(an.r);
/*  33 */     paramComponent.addMouseMotionListener(an.r);
/*  34 */     paramComponent.addFocusListener(an.r);
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     v
 * JD-Core Version:    0.6.2
 */