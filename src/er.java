/*     */ public class er extends dg
/*     */ {
/*     */   int w;
/*     */   static final int c = 1;
/*     */   static final int n = 2;
/*     */   static final int j = 3;
/*     */   boolean g;
/*     */   int z;
/*     */   int[] i;
/*  25 */   boolean b = false;
/*     */   int[] s;
/*     */   int[] u;
/*     */   int v;
/*     */   static int[] y;
/*     */   int[] e;
/*     */   static final int m = 0;
/*     */   int[] q;
/*     */ 
/*     */   void v(int paramInt)
/*     */   {
/* 115 */     if (this.e == null)
/*     */       return;
/*     */     int k;
/*     */     int i1;
/*     */     int i2;
/*     */     int i3;
/*     */     int i6;
/* 116 */     if ((this.v == 1) || (this.v == 3)) {
/* 117 */       if ((y == null) || (y.length < this.e.length)) y = new int[this.e.length];
/*     */ 
/* 119 */       if (this.e.length == 4096) k = 64; else
/* 120 */         k = 128;
/* 121 */       i1 = this.e.length;
/* 122 */       i2 = k * paramInt * this.w;
/* 123 */       i3 = i1 - 1;
/* 124 */       if (this.v == 1) i2 = -i2;
/* 125 */       for (int i4 = 0; i4 < i1; i4++) {
/* 126 */         i6 = i4 + i2 & i3;
/* 127 */         y[i4] = this.e[i6];
/*     */       }
/* 129 */       int[] arrayOfInt1 = this.e;
/* 130 */       this.e = y;
/* 131 */       y = arrayOfInt1;
/*     */     }
/* 133 */     if ((this.v == 2) || (this.v == 4)) {
/* 134 */       if ((y == null) || (y.length < this.e.length)) y = new int[this.e.length];
/*     */ 
/* 136 */       if (this.e.length == 4096) k = 64; else
/* 137 */         k = 128;
/* 138 */       i1 = this.e.length;
/* 139 */       i2 = paramInt * this.w;
/* 140 */       i3 = k - 1;
/* 141 */       if (this.v == 2) i2 = -i2;
/* 142 */       for (int i5 = 0; i5 < i1; i5 += k) {
/* 143 */         for (i6 = 0; i6 < k; i6++) {
/* 144 */           int i7 = i5 + i6;
/* 145 */           int i8 = i5 + (i6 + i2 & i3);
/* 146 */           y[i7] = this.e[i8];
/*     */         }
/*     */       }
/* 149 */       int[] arrayOfInt2 = this.e;
/* 150 */       this.e = y;
/* 151 */       y = arrayOfInt2;
/*     */     }
/*     */   }
/*     */ 
/*     */   boolean c(double paramDouble, int paramInt, ch paramch)
/*     */   {
/*  53 */     for (int k = 0; k < this.q.length; k++) {
/*  54 */       if (paramch.q(this.q[k], 1178473963) == null) return false;
/*     */     }
/*  56 */     k = paramInt * paramInt;
/*  57 */     this.e = new int[k];
/*  58 */     for (int i1 = 0; i1 < this.q.length; i1++) {
/*  59 */       ft localft = u.n(paramch, this.q[i1], 980880941);
/*  60 */       localft.bm();
/*  61 */       byte[] arrayOfByte = localft.u;
/*  62 */       int[] arrayOfInt = localft.v;
/*  63 */       int i2 = this.u[i1];
/*     */       int i4;
/*     */       int i5;
/*     */       int i6;
/*  64 */       if (((i2 & 0xFF000000) != 16777216) || (
/*  65 */         ((i2 & 0xFF000000) != 33554432) || 
/*  66 */         ((i2 & 0xFF000000) == 50331648))) {
/*  67 */         i3 = i2 & 0xFF00FF;
/*  68 */         i4 = i2 >> 8 & 0xFF;
/*  69 */         for (i5 = 0; i5 < arrayOfInt.length; i5++) {
/*  70 */           i6 = arrayOfInt[i5];
/*  71 */           if ((i6 & 0xFFFF) == i6 >> 8) {
/*  72 */             i6 &= 255;
/*  73 */             arrayOfInt[i5] = (i3 * i6 >> 8 & 0xFF00FF | i4 * i6 & 0xFF00);
/*     */           }
/*     */         }
/*     */       }
/*  77 */       for (int i3 = 0; i3 < arrayOfInt.length; i3++) arrayOfInt[i3] = fx.bb(arrayOfInt[i3], paramDouble);
/*     */ 
/*  79 */       if (i1 == 0) i3 = 0; else
/*  80 */         i3 = this.i[(i1 - 1)];
/*  81 */       if ((i1 != 0) || 
/*  83 */         (i3 == 0)) {
/*  84 */         if (localft.w == paramInt) {
/*  85 */           for (i4 = 0; i4 < k; i4++) this.e[i4] = arrayOfInt[(arrayOfByte[i4] & 0xFF)];
/*     */         }
/*  87 */         else if ((localft.w == 64) && (paramInt == 128)) {
/*  88 */           i4 = 0;
/*  89 */           for (i5 = 0; i5 < paramInt; i5++) {
/*  90 */             for (i6 = 0; i6 < paramInt; i6++) this.e[(i4++)] = arrayOfInt[(arrayOfByte[((i6 >> 1) + (i5 >> 1 << 6))] & 0xFF)];
/*     */           }
/*     */         }
/*  93 */         else if ((localft.w == 128) && (paramInt == 64)) {
/*  94 */           i4 = 0;
/*  95 */           for (i5 = 0; i5 < paramInt; i5++)
/*  96 */             for (i6 = 0; i6 < paramInt; i6++) this.e[(i4++)] = arrayOfInt[(arrayOfByte[((i6 << 1) + (i5 << 1 << 7))] & 0xFF)];
/*     */         }
/*     */         else
/*     */         {
/* 100 */           throw new RuntimeException();
/*     */         }
/*     */       }
/* 103 */       if ((i3 == 1) && (
/* 104 */         (i3 == 2) && 
/* 105 */         (i3 != 3)));
/*     */     }
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */   void n() {
/* 111 */     this.e = null;
/*     */   }
/*     */ 
/*     */   boolean q(double paramDouble, int paramInt, ch paramch)
/*     */   {
/*  53 */     for (int k = 0; k < this.q.length; k++) {
/*  54 */       if (paramch.q(this.q[k], 2133645757) == null) return false;
/*     */     }
/*  56 */     k = paramInt * paramInt;
/*  57 */     this.e = new int[k];
/*  58 */     for (int i1 = 0; i1 < this.q.length; i1++) {
/*  59 */       ft localft = u.n(paramch, this.q[i1], -991360352);
/*  60 */       localft.bm();
/*  61 */       byte[] arrayOfByte = localft.u;
/*  62 */       int[] arrayOfInt = localft.v;
/*  63 */       int i2 = this.u[i1];
/*     */       int i4;
/*     */       int i5;
/*     */       int i6;
/*  64 */       if (((i2 & 0xFF000000) != 16777216) || (
/*  65 */         ((i2 & 0xFF000000) != 33554432) || 
/*  66 */         ((i2 & 0xFF000000) == 50331648))) {
/*  67 */         i3 = i2 & 0xFF00FF;
/*  68 */         i4 = i2 >> 8 & 0xFF;
/*  69 */         for (i5 = 0; i5 < arrayOfInt.length; i5++) {
/*  70 */           i6 = arrayOfInt[i5];
/*  71 */           if ((i6 & 0xFFFF) == i6 >> 8) {
/*  72 */             i6 &= 255;
/*  73 */             arrayOfInt[i5] = (i3 * i6 >> 8 & 0xFF00FF | i4 * i6 & 0xFF00);
/*     */           }
/*     */         }
/*     */       }
/*  77 */       for (int i3 = 0; i3 < arrayOfInt.length; i3++) arrayOfInt[i3] = fx.bb(arrayOfInt[i3], paramDouble);
/*     */ 
/*  79 */       if (i1 == 0) i3 = 0; else
/*  80 */         i3 = this.i[(i1 - 1)];
/*  81 */       if ((i1 != 0) || 
/*  83 */         (i3 == 0)) {
/*  84 */         if (localft.w == paramInt) {
/*  85 */           for (i4 = 0; i4 < k; i4++) this.e[i4] = arrayOfInt[(arrayOfByte[i4] & 0xFF)];
/*     */         }
/*  87 */         else if ((localft.w == 64) && (paramInt == 128)) {
/*  88 */           i4 = 0;
/*  89 */           for (i5 = 0; i5 < paramInt; i5++) {
/*  90 */             for (i6 = 0; i6 < paramInt; i6++) this.e[(i4++)] = arrayOfInt[(arrayOfByte[((i6 >> 1) + (i5 >> 1 << 6))] & 0xFF)];
/*     */           }
/*     */         }
/*  93 */         else if ((localft.w == 128) && (paramInt == 64)) {
/*  94 */           i4 = 0;
/*  95 */           for (i5 = 0; i5 < paramInt; i5++)
/*  96 */             for (i6 = 0; i6 < paramInt; i6++) this.e[(i4++)] = arrayOfInt[(arrayOfByte[((i6 << 1) + (i5 << 1 << 7))] & 0xFF)];
/*     */         }
/*     */         else
/*     */         {
/* 100 */           throw new RuntimeException();
/*     */         }
/*     */       }
/* 103 */       if ((i3 == 1) && (
/* 104 */         (i3 == 2) && 
/* 105 */         (i3 != 3)));
/*     */     }
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */   boolean z(double paramDouble, int paramInt, ch paramch)
/*     */   {
/*  53 */     for (int k = 0; k < this.q.length; k++) {
/*  54 */       if (paramch.q(this.q[k], 2006495923) == null) return false;
/*     */     }
/*  56 */     k = paramInt * paramInt;
/*  57 */     this.e = new int[k];
/*  58 */     for (int i1 = 0; i1 < this.q.length; i1++) {
/*  59 */       ft localft = u.n(paramch, this.q[i1], -1510386097);
/*  60 */       localft.bm();
/*  61 */       byte[] arrayOfByte = localft.u;
/*  62 */       int[] arrayOfInt = localft.v;
/*  63 */       int i2 = this.u[i1];
/*     */       int i4;
/*     */       int i5;
/*     */       int i6;
/*  64 */       if (((i2 & 0xFF000000) != 16777216) || (
/*  65 */         ((i2 & 0xFF000000) != 33554432) || 
/*  66 */         ((i2 & 0xFF000000) == 50331648))) {
/*  67 */         i3 = i2 & 0xFF00FF;
/*  68 */         i4 = i2 >> 8 & 0xFF;
/*  69 */         for (i5 = 0; i5 < arrayOfInt.length; i5++) {
/*  70 */           i6 = arrayOfInt[i5];
/*  71 */           if ((i6 & 0xFFFF) == i6 >> 8) {
/*  72 */             i6 &= 255;
/*  73 */             arrayOfInt[i5] = (i3 * i6 >> 8 & 0xFF00FF | i4 * i6 & 0xFF00);
/*     */           }
/*     */         }
/*     */       }
/*  77 */       for (int i3 = 0; i3 < arrayOfInt.length; i3++) arrayOfInt[i3] = fx.bb(arrayOfInt[i3], paramDouble);
/*     */ 
/*  79 */       if (i1 == 0) i3 = 0; else
/*  80 */         i3 = this.i[(i1 - 1)];
/*  81 */       if ((i1 != 0) || 
/*  83 */         (i3 == 0)) {
/*  84 */         if (localft.w == paramInt) {
/*  85 */           for (i4 = 0; i4 < k; i4++) this.e[i4] = arrayOfInt[(arrayOfByte[i4] & 0xFF)];
/*     */         }
/*  87 */         else if ((localft.w == 64) && (paramInt == 128)) {
/*  88 */           i4 = 0;
/*  89 */           for (i5 = 0; i5 < paramInt; i5++) {
/*  90 */             for (i6 = 0; i6 < paramInt; i6++) this.e[(i4++)] = arrayOfInt[(arrayOfByte[((i6 >> 1) + (i5 >> 1 << 6))] & 0xFF)];
/*     */           }
/*     */         }
/*  93 */         else if ((localft.w == 128) && (paramInt == 64)) {
/*  94 */           i4 = 0;
/*  95 */           for (i5 = 0; i5 < paramInt; i5++)
/*  96 */             for (i6 = 0; i6 < paramInt; i6++) this.e[(i4++)] = arrayOfInt[(arrayOfByte[((i6 << 1) + (i5 << 1 << 7))] & 0xFF)];
/*     */         }
/*     */         else
/*     */         {
/* 100 */           throw new RuntimeException();
/*     */         }
/*     */       }
/* 103 */       if ((i3 == 1) && (
/* 104 */         (i3 == 2) && 
/* 105 */         (i3 != 3)));
/*     */     }
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */   boolean g(double paramDouble, int paramInt, ch paramch)
/*     */   {
/*  53 */     for (int k = 0; k < this.q.length; k++) {
/*  54 */       if (paramch.q(this.q[k], 1581711902) == null) return false;
/*     */     }
/*  56 */     k = paramInt * paramInt;
/*  57 */     this.e = new int[k];
/*  58 */     for (int i1 = 0; i1 < this.q.length; i1++) {
/*  59 */       ft localft = u.n(paramch, this.q[i1], -1716302211);
/*  60 */       localft.bm();
/*  61 */       byte[] arrayOfByte = localft.u;
/*  62 */       int[] arrayOfInt = localft.v;
/*  63 */       int i2 = this.u[i1];
/*     */       int i4;
/*     */       int i5;
/*     */       int i6;
/*  64 */       if (((i2 & 0xFF000000) != 16777216) || (
/*  65 */         ((i2 & 0xFF000000) != 33554432) || 
/*  66 */         ((i2 & 0xFF000000) == 50331648))) {
/*  67 */         i3 = i2 & 0xFF00FF;
/*  68 */         i4 = i2 >> 8 & 0xFF;
/*  69 */         for (i5 = 0; i5 < arrayOfInt.length; i5++) {
/*  70 */           i6 = arrayOfInt[i5];
/*  71 */           if ((i6 & 0xFFFF) == i6 >> 8) {
/*  72 */             i6 &= 255;
/*  73 */             arrayOfInt[i5] = (i3 * i6 >> 8 & 0xFF00FF | i4 * i6 & 0xFF00);
/*     */           }
/*     */         }
/*     */       }
/*  77 */       for (int i3 = 0; i3 < arrayOfInt.length; i3++) arrayOfInt[i3] = fx.bb(arrayOfInt[i3], paramDouble);
/*     */ 
/*  79 */       if (i1 == 0) i3 = 0; else
/*  80 */         i3 = this.i[(i1 - 1)];
/*  81 */       if ((i1 != 0) || 
/*  83 */         (i3 == 0)) {
/*  84 */         if (localft.w == paramInt) {
/*  85 */           for (i4 = 0; i4 < k; i4++) this.e[i4] = arrayOfInt[(arrayOfByte[i4] & 0xFF)];
/*     */         }
/*  87 */         else if ((localft.w == 64) && (paramInt == 128)) {
/*  88 */           i4 = 0;
/*  89 */           for (i5 = 0; i5 < paramInt; i5++) {
/*  90 */             for (i6 = 0; i6 < paramInt; i6++) this.e[(i4++)] = arrayOfInt[(arrayOfByte[((i6 >> 1) + (i5 >> 1 << 6))] & 0xFF)];
/*     */           }
/*     */         }
/*  93 */         else if ((localft.w == 128) && (paramInt == 64)) {
/*  94 */           i4 = 0;
/*  95 */           for (i5 = 0; i5 < paramInt; i5++)
/*  96 */             for (i6 = 0; i6 < paramInt; i6++) this.e[(i4++)] = arrayOfInt[(arrayOfByte[((i6 << 1) + (i5 << 1 << 7))] & 0xFF)];
/*     */         }
/*     */         else
/*     */         {
/* 100 */           throw new RuntimeException();
/*     */         }
/*     */       }
/* 103 */       if ((i3 == 1) && (
/* 104 */         (i3 == 2) && 
/* 105 */         (i3 != 3)));
/*     */     }
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */   void j(int paramInt)
/*     */   {
/* 115 */     if (this.e == null)
/*     */       return;
/*     */     int k;
/*     */     int i1;
/*     */     int i2;
/*     */     int i3;
/*     */     int i6;
/* 116 */     if ((this.v == 1) || (this.v == 3)) {
/* 117 */       if ((y == null) || (y.length < this.e.length)) y = new int[this.e.length];
/*     */ 
/* 119 */       if (this.e.length == 4096) k = 64; else
/* 120 */         k = 128;
/* 121 */       i1 = this.e.length;
/* 122 */       i2 = k * paramInt * this.w;
/* 123 */       i3 = i1 - 1;
/* 124 */       if (this.v == 1) i2 = -i2;
/* 125 */       for (int i4 = 0; i4 < i1; i4++) {
/* 126 */         i6 = i4 + i2 & i3;
/* 127 */         y[i4] = this.e[i6];
/*     */       }
/* 129 */       int[] arrayOfInt1 = this.e;
/* 130 */       this.e = y;
/* 131 */       y = arrayOfInt1;
/*     */     }
/* 133 */     if ((this.v == 2) || (this.v == 4)) {
/* 134 */       if ((y == null) || (y.length < this.e.length)) y = new int[this.e.length];
/*     */ 
/* 136 */       if (this.e.length == 4096) k = 64; else
/* 137 */         k = 128;
/* 138 */       i1 = this.e.length;
/* 139 */       i2 = paramInt * this.w;
/* 140 */       i3 = k - 1;
/* 141 */       if (this.v == 2) i2 = -i2;
/* 142 */       for (int i5 = 0; i5 < i1; i5 += k) {
/* 143 */         for (i6 = 0; i6 < k; i6++) {
/* 144 */           int i7 = i5 + i6;
/* 145 */           int i8 = i5 + (i6 + i2 & i3);
/* 146 */           y[i7] = this.e[i8];
/*     */         }
/*     */       }
/* 149 */       int[] arrayOfInt2 = this.e;
/* 150 */       this.e = y;
/* 151 */       y = arrayOfInt2;
/*     */     }
/*     */   }
/*     */ 
/*     */   boolean i(double paramDouble, int paramInt, ch paramch)
/*     */   {
/*  53 */     for (int k = 0; k < this.q.length; k++) {
/*  54 */       if (paramch.q(this.q[k], 1301734917) == null) return false;
/*     */     }
/*  56 */     k = paramInt * paramInt;
/*  57 */     this.e = new int[k];
/*  58 */     for (int i1 = 0; i1 < this.q.length; i1++) {
/*  59 */       ft localft = u.n(paramch, this.q[i1], 602377660);
/*  60 */       localft.bm();
/*  61 */       byte[] arrayOfByte = localft.u;
/*  62 */       int[] arrayOfInt = localft.v;
/*  63 */       int i2 = this.u[i1];
/*     */       int i4;
/*     */       int i5;
/*     */       int i6;
/*  64 */       if (((i2 & 0xFF000000) != 16777216) || (
/*  65 */         ((i2 & 0xFF000000) != 33554432) || 
/*  66 */         ((i2 & 0xFF000000) == 50331648))) {
/*  67 */         i3 = i2 & 0xFF00FF;
/*  68 */         i4 = i2 >> 8 & 0xFF;
/*  69 */         for (i5 = 0; i5 < arrayOfInt.length; i5++) {
/*  70 */           i6 = arrayOfInt[i5];
/*  71 */           if ((i6 & 0xFFFF) == i6 >> 8) {
/*  72 */             i6 &= 255;
/*  73 */             arrayOfInt[i5] = (i3 * i6 >> 8 & 0xFF00FF | i4 * i6 & 0xFF00);
/*     */           }
/*     */         }
/*     */       }
/*  77 */       for (int i3 = 0; i3 < arrayOfInt.length; i3++) arrayOfInt[i3] = fx.bb(arrayOfInt[i3], paramDouble);
/*     */ 
/*  79 */       if (i1 == 0) i3 = 0; else
/*  80 */         i3 = this.i[(i1 - 1)];
/*  81 */       if ((i1 != 0) || 
/*  83 */         (i3 == 0)) {
/*  84 */         if (localft.w == paramInt) {
/*  85 */           for (i4 = 0; i4 < k; i4++) this.e[i4] = arrayOfInt[(arrayOfByte[i4] & 0xFF)];
/*     */         }
/*  87 */         else if ((localft.w == 64) && (paramInt == 128)) {
/*  88 */           i4 = 0;
/*  89 */           for (i5 = 0; i5 < paramInt; i5++) {
/*  90 */             for (i6 = 0; i6 < paramInt; i6++) this.e[(i4++)] = arrayOfInt[(arrayOfByte[((i6 >> 1) + (i5 >> 1 << 6))] & 0xFF)];
/*     */           }
/*     */         }
/*  93 */         else if ((localft.w == 128) && (paramInt == 64)) {
/*  94 */           i4 = 0;
/*  95 */           for (i5 = 0; i5 < paramInt; i5++)
/*  96 */             for (i6 = 0; i6 < paramInt; i6++) this.e[(i4++)] = arrayOfInt[(arrayOfByte[((i6 << 1) + (i5 << 1 << 7))] & 0xFF)];
/*     */         }
/*     */         else
/*     */         {
/* 100 */           throw new RuntimeException();
/*     */         }
/*     */       }
/* 103 */       if ((i3 == 1) && (
/* 104 */         (i3 == 2) && 
/* 105 */         (i3 != 3)));
/*     */     }
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */   void s(int paramInt)
/*     */   {
/* 115 */     if (this.e == null)
/*     */       return;
/*     */     int k;
/*     */     int i1;
/*     */     int i2;
/*     */     int i3;
/*     */     int i6;
/* 116 */     if ((this.v == 1) || (this.v == 3)) {
/* 117 */       if ((y == null) || (y.length < this.e.length)) y = new int[this.e.length];
/*     */ 
/* 119 */       if (this.e.length == 4096) k = 64; else
/* 120 */         k = 128;
/* 121 */       i1 = this.e.length;
/* 122 */       i2 = k * paramInt * this.w;
/* 123 */       i3 = i1 - 1;
/* 124 */       if (this.v == 1) i2 = -i2;
/* 125 */       for (int i4 = 0; i4 < i1; i4++) {
/* 126 */         i6 = i4 + i2 & i3;
/* 127 */         y[i4] = this.e[i6];
/*     */       }
/* 129 */       int[] arrayOfInt1 = this.e;
/* 130 */       this.e = y;
/* 131 */       y = arrayOfInt1;
/*     */     }
/* 133 */     if ((this.v == 2) || (this.v == 4)) {
/* 134 */       if ((y == null) || (y.length < this.e.length)) y = new int[this.e.length];
/*     */ 
/* 136 */       if (this.e.length == 4096) k = 64; else
/* 137 */         k = 128;
/* 138 */       i1 = this.e.length;
/* 139 */       i2 = paramInt * this.w;
/* 140 */       i3 = k - 1;
/* 141 */       if (this.v == 2) i2 = -i2;
/* 142 */       for (int i5 = 0; i5 < i1; i5 += k) {
/* 143 */         for (i6 = 0; i6 < k; i6++) {
/* 144 */           int i7 = i5 + i6;
/* 145 */           int i8 = i5 + (i6 + i2 & i3);
/* 146 */           y[i7] = this.e[i8];
/*     */         }
/*     */       }
/* 149 */       int[] arrayOfInt2 = this.e;
/* 150 */       this.e = y;
/* 151 */       y = arrayOfInt2;
/*     */     }
/*     */   }
/*     */ 
/*     */   void u(int paramInt)
/*     */   {
/* 115 */     if (this.e == null)
/*     */       return;
/*     */     int k;
/*     */     int i1;
/*     */     int i2;
/*     */     int i3;
/*     */     int i6;
/* 116 */     if ((this.v == 1) || (this.v == 3)) {
/* 117 */       if ((y == null) || (y.length < this.e.length)) y = new int[this.e.length];
/*     */ 
/* 119 */       if (this.e.length == 4096) k = 64; else
/* 120 */         k = 128;
/* 121 */       i1 = this.e.length;
/* 122 */       i2 = k * paramInt * this.w;
/* 123 */       i3 = i1 - 1;
/* 124 */       if (this.v == 1) i2 = -i2;
/* 125 */       for (int i4 = 0; i4 < i1; i4++) {
/* 126 */         i6 = i4 + i2 & i3;
/* 127 */         y[i4] = this.e[i6];
/*     */       }
/* 129 */       int[] arrayOfInt1 = this.e;
/* 130 */       this.e = y;
/* 131 */       y = arrayOfInt1;
/*     */     }
/* 133 */     if ((this.v == 2) || (this.v == 4)) {
/* 134 */       if ((y == null) || (y.length < this.e.length)) y = new int[this.e.length];
/*     */ 
/* 136 */       if (this.e.length == 4096) k = 64; else
/* 137 */         k = 128;
/* 138 */       i1 = this.e.length;
/* 139 */       i2 = paramInt * this.w;
/* 140 */       i3 = k - 1;
/* 141 */       if (this.v == 2) i2 = -i2;
/* 142 */       for (int i5 = 0; i5 < i1; i5 += k) {
/* 143 */         for (i6 = 0; i6 < k; i6++) {
/* 144 */           int i7 = i5 + i6;
/* 145 */           int i8 = i5 + (i6 + i2 & i3);
/* 146 */           y[i7] = this.e[i8];
/*     */         }
/*     */       }
/* 149 */       int[] arrayOfInt2 = this.e;
/* 150 */       this.e = y;
/* 151 */       y = arrayOfInt2;
/*     */     }
/*     */   }
/*     */ 
/*     */   er(ev paramev)
/*     */   {
/*  29 */     this.z = paramev.k(-1987080889);
/*  30 */     this.g = (paramev.t(1118814123) == 1);
/*  31 */     int k = paramev.t(1118814123);
/*  32 */     if ((k < 1) || (k > 4)) {
/*  33 */       throw new RuntimeException();
/*     */     }
/*  35 */     this.q = new int[k];
/*  36 */     for (int i1 = 0; i1 < k; i1++) this.q[i1] = paramev.k(-1987080889);
/*  37 */     if (k > 1) {
/*  38 */       this.i = new int[k - 1];
/*  39 */       for (i1 = 0; i1 < k - 1; i1++) this.i[i1] = paramev.t(1118814123);
/*     */     }
/*  41 */     if (k > 1) {
/*  42 */       this.s = new int[k - 1];
/*  43 */       for (i1 = 0; i1 < k - 1; i1++) this.s[i1] = paramev.t(1118814123);
/*     */     }
/*  45 */     this.u = new int[k];
/*  46 */     for (i1 = 0; i1 < k; i1++) this.u[i1] = paramev.h(758780471);
/*  47 */     this.v = paramev.t(1118814123);
/*  48 */     this.w = paramev.t(1118814123);
/*  49 */     this.e = null;
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     er
 * JD-Core Version:    0.6.2
 */