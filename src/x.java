/*     */ public class x
/*     */ {
/*     */   int[] n;
/*     */   int r;
/*     */   int[] l;
/*     */   int[] m;
/*     */   int d;
/*     */   float[][] c;
/*     */ 
/*     */   float[] m()
/*     */   {
/* 176 */     return this.c[l()];
/*     */   }
/*     */ 
/*     */   x()
/*     */   {
/*  41 */     dt.z(24);
/*  42 */     this.r = dt.z(16);
/*  43 */     this.d = dt.z(24);
/*  44 */     this.l = new int[this.d];
/*  45 */     int i = dt.j() != 0 ? 1 : 0;
/*     */     int k;
/*     */     int i2;
/*  46 */     if (i != 0) {
/*  47 */       j = 0;
/*  48 */       k = dt.z(5) + 1;
/*  49 */       while (j < this.d) {
/*  50 */         int i1 = dt.z(az.l(this.d - j, (byte)86));
/*  51 */         for (i2 = 0; i2 < i1; i2++) this.l[(j++)] = k;
/*  52 */         k++;
/*     */       }
/*     */     }
/*     */     else {
/*  56 */       j = dt.j() != 0 ? 1 : 0;
/*  57 */       for (k = 0; k < this.d; k++) {
/*  58 */         if ((j != 0) && (dt.j() == 0)) this.l[k] = 0; else
/*  59 */           this.l[k] = (dt.z(5) + 1);
/*     */       }
/*     */     }
/*  62 */     d();
/*  63 */     int j = dt.z(4);
/*  64 */     if (j > 0) {
/*  65 */       float f1 = dt.c(dt.z(32));
/*  66 */       float f2 = dt.c(dt.z(32));
/*  67 */       i2 = dt.z(4) + 1;
/*  68 */       int i3 = dt.j() != 0 ? 1 : 0;
/*     */       int i4;
/*  70 */       if (j == 1) i4 = r(this.d, this.r); else
/*  71 */         i4 = this.d * this.r;
/*  72 */       this.m = new int[i4];
/*  73 */       for (int i5 = 0; i5 < i4; i5++) this.m[i5] = dt.z(i2);
/*  74 */       this.c = new float[this.d][this.r];
/*     */       float f3;
/*     */       int i6;
/*     */       int i7;
/*  75 */       if (j == 1) {
/*  76 */         for (i5 = 0; i5 < this.d; i5++) {
/*  77 */           f3 = 0.0F;
/*  78 */           i6 = 1;
/*  79 */           for (i7 = 0; i7 < this.r; i7++) {
/*  80 */             int i8 = i5 / i6 % i4;
/*  81 */             float f5 = this.m[i8] * f2 + f1 + f3;
/*  82 */             this.c[i5][i7] = f5;
/*  83 */             if (i3 != 0) f3 = f5;
/*  84 */             i6 *= i4;
/*     */           }
/*     */         }
/*     */       }
/*     */       else
/*  89 */         for (i5 = 0; i5 < this.d; i5++) {
/*  90 */           f3 = 0.0F;
/*  91 */           i6 = i5 * this.r;
/*  92 */           for (i7 = 0; i7 < this.r; i7++) {
/*  93 */             float f4 = this.m[i6] * f2 + f1 + f3;
/*  94 */             this.c[i5][i7] = f4;
/*  95 */             if (i3 != 0) f3 = f4;
/*  96 */             i6++;
/*     */           }
/*     */         }
/*     */     }
/*     */   }
/*     */ 
/*     */   void d()
/*     */   {
/* 104 */     int[] arrayOfInt1 = new int[this.d];
/*     */ 
/* 106 */     int[] arrayOfInt2 = new int[33];
/*     */     int k;
/*     */     int i1;
/*     */     int i2;
/*     */     int i3;
/*     */     int i4;
/*     */     int i6;
/* 107 */     for (int j = 0; j < this.d; j++) {
/* 108 */       k = this.l[j];
/* 109 */       if (k != 0) {
/* 110 */         i1 = 1 << 32 - k;
/* 111 */         i2 = arrayOfInt2[k];
/* 112 */         arrayOfInt1[j] = i2;
/*     */         int i5;
/* 114 */         if ((i2 & i1) != 0) {
/* 115 */           i3 = arrayOfInt2[(k - 1)];
/*     */         }
/*     */         else {
/* 118 */           i3 = i2 | i1;
/* 119 */           for (i4 = k - 1; i4 >= 1; i4--) {
/* 120 */             i5 = arrayOfInt2[i4];
/* 121 */             if (i5 != i2) break;
/* 122 */             i6 = 1 << 32 - i4;
/* 123 */             if ((i5 & i6) != 0) {
/* 124 */               arrayOfInt2[i4] = arrayOfInt2[(i4 - 1)];
/* 125 */               break;
/*     */             }
/*     */ 
/* 128 */             arrayOfInt2[i4] = (i5 | i6);
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/* 134 */         arrayOfInt2[k] = i3;
/* 135 */         for (i4 = k + 1; i4 <= 32; i4++) {
/* 136 */           i5 = arrayOfInt2[i4];
/* 137 */           if (i5 == i2) arrayOfInt2[i4] = i3;
/*     */         }
/*     */       }
/*     */     }
/* 141 */     this.n = new int[8];
/* 142 */     int i = 0;
/* 143 */     for (j = 0; j < this.d; j++) {
/* 144 */       k = this.l[j];
/* 145 */       if (k != 0) {
/* 146 */         i1 = arrayOfInt1[j];
/* 147 */         i2 = 0;
/* 148 */         for (i3 = 0; i3 < k; i3++) {
/* 149 */           i4 = -2147483648 >>> i3;
/* 150 */           if ((i1 & i4) != 0) {
/* 151 */             if (this.n[i2] == 0) this.n[i2] = i;
/* 152 */             i2 = this.n[i2];
/*     */           }
/*     */           else {
/* 155 */             i2++;
/*     */           }
/* 157 */           if (i2 >= this.n.length) {
/* 158 */             int[] arrayOfInt3 = new int[this.n.length * 2];
/* 159 */             for (i6 = 0; i6 < this.n.length; i6++) arrayOfInt3[i6] = this.n[i6];
/* 160 */             this.n = arrayOfInt3;
/*     */           }
/* 162 */           i4 >>>= 1;
/*     */         }
/* 164 */         this.n[i2] = (j ^ 0xFFFFFFFF);
/* 165 */         if (i2 >= i) i = i2 + 1; 
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/* 170 */   int l() { int i = 0;
/* 171 */     while (this.n[i] >= 0) i = dt.j() != 0 ? this.n[i] : i + 1;
/* 172 */     return this.n[i] ^ 0xFFFFFFFF;
/*     */   }
/*     */ 
/*     */   int g()
/*     */   {
/* 170 */     int i = 0;
/* 171 */     while (this.n[i] >= 0) i = dt.j() != 0 ? this.n[i] : i + 1;
/* 172 */     return this.n[i] ^ 0xFFFFFFFF;
/*     */   }
/*     */ 
/*     */   static int c(int paramInt1, int paramInt2)
/*     */   {
/*  16 */     int i = (int)Math.pow(paramInt1, 1.0D / paramInt2) + 1;
/*     */     while (true)
/*     */     {
/*  19 */       int k = i;
/*  20 */       int i1 = paramInt2;
/*     */ 
/*  22 */       int i2 = 1;
/*  23 */       while (i1 > 1) {
/*  24 */         if ((i1 & 0x1) != 0) i2 *= k;
/*  25 */         k *= k;
/*  26 */         i1 >>= 1;
/*     */       }
/*     */       int j;
/*  28 */       if (i1 == 1) {
/*  29 */         j = k * i2;
/*     */       }
/*     */       else {
/*  32 */         j = i2;
/*     */       }
/*  34 */       if (j <= paramInt1) break;
/*  35 */       i--;
/*     */     }
/*  37 */     return i;
/*     */   }
/*     */ 
/*     */   static int r(int paramInt1, int paramInt2)
/*     */   {
/*  16 */     int i = (int)Math.pow(paramInt1, 1.0D / paramInt2) + 1;
/*     */     while (true)
/*     */     {
/*  19 */       int k = i;
/*  20 */       int i1 = paramInt2;
/*     */ 
/*  22 */       int i2 = 1;
/*  23 */       while (i1 > 1) {
/*  24 */         if ((i1 & 0x1) != 0) i2 *= k;
/*  25 */         k *= k;
/*  26 */         i1 >>= 1;
/*     */       }
/*     */       int j;
/*  28 */       if (i1 == 1) {
/*  29 */         j = k * i2;
/*     */       }
/*     */       else {
/*  32 */         j = i2;
/*     */       }
/*  34 */       if (j <= paramInt1) break;
/*  35 */       i--;
/*     */     }
/*  37 */     return i;
/*     */   }
/*     */ 
/*     */   void j()
/*     */   {
/* 104 */     int[] arrayOfInt1 = new int[this.d];
/*     */ 
/* 106 */     int[] arrayOfInt2 = new int[33];
/*     */     int k;
/*     */     int i1;
/*     */     int i2;
/*     */     int i3;
/*     */     int i4;
/*     */     int i6;
/* 107 */     for (int j = 0; j < this.d; j++) {
/* 108 */       k = this.l[j];
/* 109 */       if (k != 0) {
/* 110 */         i1 = 1 << 32 - k;
/* 111 */         i2 = arrayOfInt2[k];
/* 112 */         arrayOfInt1[j] = i2;
/*     */         int i5;
/* 114 */         if ((i2 & i1) != 0) {
/* 115 */           i3 = arrayOfInt2[(k - 1)];
/*     */         }
/*     */         else {
/* 118 */           i3 = i2 | i1;
/* 119 */           for (i4 = k - 1; i4 >= 1; i4--) {
/* 120 */             i5 = arrayOfInt2[i4];
/* 121 */             if (i5 != i2) break;
/* 122 */             i6 = 1 << 32 - i4;
/* 123 */             if ((i5 & i6) != 0) {
/* 124 */               arrayOfInt2[i4] = arrayOfInt2[(i4 - 1)];
/* 125 */               break;
/*     */             }
/*     */ 
/* 128 */             arrayOfInt2[i4] = (i5 | i6);
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/* 134 */         arrayOfInt2[k] = i3;
/* 135 */         for (i4 = k + 1; i4 <= 32; i4++) {
/* 136 */           i5 = arrayOfInt2[i4];
/* 137 */           if (i5 == i2) arrayOfInt2[i4] = i3;
/*     */         }
/*     */       }
/*     */     }
/* 141 */     this.n = new int[8];
/* 142 */     int i = 0;
/* 143 */     for (j = 0; j < this.d; j++) {
/* 144 */       k = this.l[j];
/* 145 */       if (k != 0) {
/* 146 */         i1 = arrayOfInt1[j];
/* 147 */         i2 = 0;
/* 148 */         for (i3 = 0; i3 < k; i3++) {
/* 149 */           i4 = -2147483648 >>> i3;
/* 150 */           if ((i1 & i4) != 0) {
/* 151 */             if (this.n[i2] == 0) this.n[i2] = i;
/* 152 */             i2 = this.n[i2];
/*     */           }
/*     */           else {
/* 155 */             i2++;
/*     */           }
/* 157 */           if (i2 >= this.n.length) {
/* 158 */             int[] arrayOfInt3 = new int[this.n.length * 2];
/* 159 */             for (i6 = 0; i6 < this.n.length; i6++) arrayOfInt3[i6] = this.n[i6];
/* 160 */             this.n = arrayOfInt3;
/*     */           }
/* 162 */           i4 >>>= 1;
/*     */         }
/* 164 */         this.n[i2] = (j ^ 0xFFFFFFFF);
/* 165 */         if (i2 >= i) i = i2 + 1;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   void z()
/*     */   {
/* 104 */     int[] arrayOfInt1 = new int[this.d];
/*     */ 
/* 106 */     int[] arrayOfInt2 = new int[33];
/*     */     int k;
/*     */     int i1;
/*     */     int i2;
/*     */     int i3;
/*     */     int i4;
/*     */     int i6;
/* 107 */     for (int j = 0; j < this.d; j++) {
/* 108 */       k = this.l[j];
/* 109 */       if (k != 0) {
/* 110 */         i1 = 1 << 32 - k;
/* 111 */         i2 = arrayOfInt2[k];
/* 112 */         arrayOfInt1[j] = i2;
/*     */         int i5;
/* 114 */         if ((i2 & i1) != 0) {
/* 115 */           i3 = arrayOfInt2[(k - 1)];
/*     */         }
/*     */         else {
/* 118 */           i3 = i2 | i1;
/* 119 */           for (i4 = k - 1; i4 >= 1; i4--) {
/* 120 */             i5 = arrayOfInt2[i4];
/* 121 */             if (i5 != i2) break;
/* 122 */             i6 = 1 << 32 - i4;
/* 123 */             if ((i5 & i6) != 0) {
/* 124 */               arrayOfInt2[i4] = arrayOfInt2[(i4 - 1)];
/* 125 */               break;
/*     */             }
/*     */ 
/* 128 */             arrayOfInt2[i4] = (i5 | i6);
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/* 134 */         arrayOfInt2[k] = i3;
/* 135 */         for (i4 = k + 1; i4 <= 32; i4++) {
/* 136 */           i5 = arrayOfInt2[i4];
/* 137 */           if (i5 == i2) arrayOfInt2[i4] = i3;
/*     */         }
/*     */       }
/*     */     }
/* 141 */     this.n = new int[8];
/* 142 */     int i = 0;
/* 143 */     for (j = 0; j < this.d; j++) {
/* 144 */       k = this.l[j];
/* 145 */       if (k != 0) {
/* 146 */         i1 = arrayOfInt1[j];
/* 147 */         i2 = 0;
/* 148 */         for (i3 = 0; i3 < k; i3++) {
/* 149 */           i4 = -2147483648 >>> i3;
/* 150 */           if ((i1 & i4) != 0) {
/* 151 */             if (this.n[i2] == 0) this.n[i2] = i;
/* 152 */             i2 = this.n[i2];
/*     */           }
/*     */           else {
/* 155 */             i2++;
/*     */           }
/* 157 */           if (i2 >= this.n.length) {
/* 158 */             int[] arrayOfInt3 = new int[this.n.length * 2];
/* 159 */             for (i6 = 0; i6 < this.n.length; i6++) arrayOfInt3[i6] = this.n[i6];
/* 160 */             this.n = arrayOfInt3;
/*     */           }
/* 162 */           i4 >>>= 1;
/*     */         }
/* 164 */         this.n[i2] = (j ^ 0xFFFFFFFF);
/* 165 */         if (i2 >= i) i = i2 + 1;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   float[] s()
/*     */   {
/* 176 */     return this.c[l()];
/*     */   }
/*     */ 
/*     */   int q()
/*     */   {
/* 170 */     int i = 0;
/* 171 */     while (this.n[i] >= 0) i = dt.j() != 0 ? this.n[i] : i + 1;
/* 172 */     return this.n[i] ^ 0xFFFFFFFF;
/*     */   }
/*     */ 
/*     */   int i()
/*     */   {
/* 170 */     int i = 0;
/* 171 */     while (this.n[i] >= 0) i = dt.j() != 0 ? this.n[i] : i + 1;
/* 172 */     return this.n[i] ^ 0xFFFFFFFF;
/*     */   }
/*     */ 
/*     */   void n()
/*     */   {
/* 104 */     int[] arrayOfInt1 = new int[this.d];
/*     */ 
/* 106 */     int[] arrayOfInt2 = new int[33];
/*     */     int k;
/*     */     int i1;
/*     */     int i2;
/*     */     int i3;
/*     */     int i4;
/*     */     int i6;
/* 107 */     for (int j = 0; j < this.d; j++) {
/* 108 */       k = this.l[j];
/* 109 */       if (k != 0) {
/* 110 */         i1 = 1 << 32 - k;
/* 111 */         i2 = arrayOfInt2[k];
/* 112 */         arrayOfInt1[j] = i2;
/*     */         int i5;
/* 114 */         if ((i2 & i1) != 0) {
/* 115 */           i3 = arrayOfInt2[(k - 1)];
/*     */         }
/*     */         else {
/* 118 */           i3 = i2 | i1;
/* 119 */           for (i4 = k - 1; i4 >= 1; i4--) {
/* 120 */             i5 = arrayOfInt2[i4];
/* 121 */             if (i5 != i2) break;
/* 122 */             i6 = 1 << 32 - i4;
/* 123 */             if ((i5 & i6) != 0) {
/* 124 */               arrayOfInt2[i4] = arrayOfInt2[(i4 - 1)];
/* 125 */               break;
/*     */             }
/*     */ 
/* 128 */             arrayOfInt2[i4] = (i5 | i6);
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/* 134 */         arrayOfInt2[k] = i3;
/* 135 */         for (i4 = k + 1; i4 <= 32; i4++) {
/* 136 */           i5 = arrayOfInt2[i4];
/* 137 */           if (i5 == i2) arrayOfInt2[i4] = i3;
/*     */         }
/*     */       }
/*     */     }
/* 141 */     this.n = new int[8];
/* 142 */     int i = 0;
/* 143 */     for (j = 0; j < this.d; j++) {
/* 144 */       k = this.l[j];
/* 145 */       if (k != 0) {
/* 146 */         i1 = arrayOfInt1[j];
/* 147 */         i2 = 0;
/* 148 */         for (i3 = 0; i3 < k; i3++) {
/* 149 */           i4 = -2147483648 >>> i3;
/* 150 */           if ((i1 & i4) != 0) {
/* 151 */             if (this.n[i2] == 0) this.n[i2] = i;
/* 152 */             i2 = this.n[i2];
/*     */           }
/*     */           else {
/* 155 */             i2++;
/*     */           }
/* 157 */           if (i2 >= this.n.length) {
/* 158 */             int[] arrayOfInt3 = new int[this.n.length * 2];
/* 159 */             for (i6 = 0; i6 < this.n.length; i6++) arrayOfInt3[i6] = this.n[i6];
/* 160 */             this.n = arrayOfInt3;
/*     */           }
/* 162 */           i4 >>>= 1;
/*     */         }
/* 164 */         this.n[i2] = (j ^ 0xFFFFFFFF);
/* 165 */         if (i2 >= i) i = i2 + 1;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   float[] u()
/*     */   {
/* 176 */     return this.c[l()];
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     x
 * JD-Core Version:    0.6.2
 */