/*    */ public class ad
/*    */ {
/*    */   static final int d = 4;
/*    */   static final float i = 8.0F;
/*  8 */   int[] r = new int[2];
/*    */ 
/* 11 */   int[][][] m = new int[2][2][4];
/* 12 */   int[] c = new int[2];
/* 13 */   static float[][] n = new float[2][8];
/* 14 */   static int[][] j = new int[2][8];
/*    */   static float z;
/*    */   static int g;
/*    */   static final float q = 100.0F;
/* 10 */   int[][][] l = new int[2][2][4];
/*    */   static final float s = 32.703197F;
/*    */ 
/*    */   static float j(float paramFloat)
/*    */   {
/* 30 */     float f = 32.703197F * (float)Math.pow(2.0D, paramFloat);
/* 31 */     return f * 3.141593F / 11025.0F;
/*    */   }
/*    */ 
/*    */   float r(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 24 */     float f = this.m[paramInt1][0][paramInt2] + paramFloat * (this.m[paramInt1][1][paramInt2] - this.m[paramInt1][0][paramInt2]);
/* 25 */     f *= 0.001525879F;
/* 26 */     return 1.0F - (float)Math.pow(10.0D, -f / 20.0F);
/*    */   }
/*    */ 
/*    */   static float d(float paramFloat) {
/* 30 */     float f = 32.703197F * (float)Math.pow(2.0D, paramFloat);
/* 31 */     return f * 3.141593F / 11025.0F;
/*    */   }
/*    */ 
/*    */   float l(int paramInt1, int paramInt2, float paramFloat) {
/* 35 */     float f = this.l[paramInt1][0][paramInt2] + paramFloat * (this.l[paramInt1][1][paramInt2] - this.l[paramInt1][0][paramInt2]);
/* 36 */     f *= 0.0001220703F;
/* 37 */     return d(f);
/*    */   }
/*    */ 
/*    */   int m(int paramInt, float paramFloat) {
/* 41 */     if (paramInt == 0) {
/* 42 */       f1 = this.c[0] + (this.c[1] - this.c[0]) * paramFloat;
/* 43 */       f1 *= 0.003051758F;
/* 44 */       z = (float)Math.pow(0.1D, f1 / 20.0F);
/* 45 */       g = (int)(z * 65536.0F);
/*    */     }
/* 47 */     if (this.r[paramInt] == 0) return 0;
/* 48 */     float f1 = r(paramInt, 0, paramFloat);
/* 49 */     n[paramInt][0] = (-2.0F * f1 * (float)Math.cos(l(paramInt, 0, paramFloat)));
/* 50 */     n[paramInt][1] = (f1 * f1);
/* 51 */     for (int k = 1; k < this.r[paramInt]; k++) {
/* 52 */       f1 = r(paramInt, k, paramFloat);
/* 53 */       float f2 = -2.0F * f1 * (float)Math.cos(l(paramInt, k, paramFloat));
/* 54 */       float f3 = f1 * f1;
/* 55 */       n[paramInt][(k * 2 + 1)] = (n[paramInt][(k * 2 - 1)] * f3);
/* 56 */       n[paramInt][(k * 2)] = (n[paramInt][(k * 2 - 1)] * f2 + n[paramInt][(k * 2 - 2)] * f3);
/* 57 */       for (int i1 = k * 2 - 1; i1 >= 2; i1--) n[paramInt][i1] += n[paramInt][(i1 - 1)] * f2 + n[paramInt][(i1 - 2)] * f3;
/* 58 */       n[paramInt][1] += n[paramInt][0] * f2 + f3;
/* 59 */       n[paramInt][0] += f2;
/*    */     }
/* 61 */     if (paramInt == 0) for (k = 0; k < this.r[0] * 2; k++) n[0][k] *= z;
/* 62 */     for (k = 0; k < this.r[paramInt] * 2; k++) j[paramInt][k] = ((int)(n[paramInt][k] * 65536.0F));
/* 63 */     return this.r[paramInt] * 2;
/*    */   }
/*    */ 
/*    */   int i(int paramInt, float paramFloat)
/*    */   {
/* 41 */     if (paramInt == 0) {
/* 42 */       f1 = this.c[0] + (this.c[1] - this.c[0]) * paramFloat;
/* 43 */       f1 *= 0.003051758F;
/* 44 */       z = (float)Math.pow(0.1D, f1 / 20.0F);
/* 45 */       g = (int)(z * 65536.0F);
/*    */     }
/* 47 */     if (this.r[paramInt] == 0) return 0;
/* 48 */     float f1 = r(paramInt, 0, paramFloat);
/* 49 */     n[paramInt][0] = (-2.0F * f1 * (float)Math.cos(l(paramInt, 0, paramFloat)));
/* 50 */     n[paramInt][1] = (f1 * f1);
/* 51 */     for (int k = 1; k < this.r[paramInt]; k++) {
/* 52 */       f1 = r(paramInt, k, paramFloat);
/* 53 */       float f2 = -2.0F * f1 * (float)Math.cos(l(paramInt, k, paramFloat));
/* 54 */       float f3 = f1 * f1;
/* 55 */       n[paramInt][(k * 2 + 1)] = (n[paramInt][(k * 2 - 1)] * f3);
/* 56 */       n[paramInt][(k * 2)] = (n[paramInt][(k * 2 - 1)] * f2 + n[paramInt][(k * 2 - 2)] * f3);
/* 57 */       for (int i1 = k * 2 - 1; i1 >= 2; i1--) n[paramInt][i1] += n[paramInt][(i1 - 1)] * f2 + n[paramInt][(i1 - 2)] * f3;
/* 58 */       n[paramInt][1] += n[paramInt][0] * f2 + f3;
/* 59 */       n[paramInt][0] += f2;
/*    */     }
/* 61 */     if (paramInt == 0) for (k = 0; k < this.r[0] * 2; k++) n[0][k] *= z;
/* 62 */     for (k = 0; k < this.r[paramInt] * 2; k++) j[paramInt][k] = ((int)(n[paramInt][k] * 65536.0F));
/* 63 */     return this.r[paramInt] * 2;
/*    */   }
/*    */ 
/*    */   float z(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 35 */     float f = this.l[paramInt1][0][paramInt2] + paramFloat * (this.l[paramInt1][1][paramInt2] - this.l[paramInt1][0][paramInt2]);
/* 36 */     f *= 0.0001220703F;
/* 37 */     return d(f);
/*    */   }
/*    */ 
/*    */   float n(int paramInt1, int paramInt2, float paramFloat)
/*    */   {
/* 24 */     float f = this.m[paramInt1][0][paramInt2] + paramFloat * (this.m[paramInt1][1][paramInt2] - this.m[paramInt1][0][paramInt2]);
/* 25 */     f *= 0.001525879F;
/* 26 */     return 1.0F - (float)Math.pow(10.0D, -f / 20.0F);
/*    */   }
/*    */ 
/*    */   int g(int paramInt, float paramFloat)
/*    */   {
/* 41 */     if (paramInt == 0) {
/* 42 */       f1 = this.c[0] + (this.c[1] - this.c[0]) * paramFloat;
/* 43 */       f1 *= 0.003051758F;
/* 44 */       z = (float)Math.pow(0.1D, f1 / 20.0F);
/* 45 */       g = (int)(z * 65536.0F);
/*    */     }
/* 47 */     if (this.r[paramInt] == 0) return 0;
/* 48 */     float f1 = r(paramInt, 0, paramFloat);
/* 49 */     n[paramInt][0] = (-2.0F * f1 * (float)Math.cos(l(paramInt, 0, paramFloat)));
/* 50 */     n[paramInt][1] = (f1 * f1);
/* 51 */     for (int k = 1; k < this.r[paramInt]; k++) {
/* 52 */       f1 = r(paramInt, k, paramFloat);
/* 53 */       float f2 = -2.0F * f1 * (float)Math.cos(l(paramInt, k, paramFloat));
/* 54 */       float f3 = f1 * f1;
/* 55 */       n[paramInt][(k * 2 + 1)] = (n[paramInt][(k * 2 - 1)] * f3);
/* 56 */       n[paramInt][(k * 2)] = (n[paramInt][(k * 2 - 1)] * f2 + n[paramInt][(k * 2 - 2)] * f3);
/* 57 */       for (int i1 = k * 2 - 1; i1 >= 2; i1--) n[paramInt][i1] += n[paramInt][(i1 - 1)] * f2 + n[paramInt][(i1 - 2)] * f3;
/* 58 */       n[paramInt][1] += n[paramInt][0] * f2 + f3;
/* 59 */       n[paramInt][0] += f2;
/*    */     }
/* 61 */     if (paramInt == 0) for (k = 0; k < this.r[0] * 2; k++) n[0][k] *= z;
/* 62 */     for (k = 0; k < this.r[paramInt] * 2; k++) j[paramInt][k] = ((int)(n[paramInt][k] * 65536.0F));
/* 63 */     return this.r[paramInt] * 2;
/*    */   }
/*    */ 
/*    */   int q(int paramInt, float paramFloat)
/*    */   {
/* 41 */     if (paramInt == 0) {
/* 42 */       f1 = this.c[0] + (this.c[1] - this.c[0]) * paramFloat;
/* 43 */       f1 *= 0.003051758F;
/* 44 */       z = (float)Math.pow(0.1D, f1 / 20.0F);
/* 45 */       g = (int)(z * 65536.0F);
/*    */     }
/* 47 */     if (this.r[paramInt] == 0) return 0;
/* 48 */     float f1 = r(paramInt, 0, paramFloat);
/* 49 */     n[paramInt][0] = (-2.0F * f1 * (float)Math.cos(l(paramInt, 0, paramFloat)));
/* 50 */     n[paramInt][1] = (f1 * f1);
/* 51 */     for (int k = 1; k < this.r[paramInt]; k++) {
/* 52 */       f1 = r(paramInt, k, paramFloat);
/* 53 */       float f2 = -2.0F * f1 * (float)Math.cos(l(paramInt, k, paramFloat));
/* 54 */       float f3 = f1 * f1;
/* 55 */       n[paramInt][(k * 2 + 1)] = (n[paramInt][(k * 2 - 1)] * f3);
/* 56 */       n[paramInt][(k * 2)] = (n[paramInt][(k * 2 - 1)] * f2 + n[paramInt][(k * 2 - 2)] * f3);
/* 57 */       for (int i1 = k * 2 - 1; i1 >= 2; i1--) n[paramInt][i1] += n[paramInt][(i1 - 1)] * f2 + n[paramInt][(i1 - 2)] * f3;
/* 58 */       n[paramInt][1] += n[paramInt][0] * f2 + f3;
/* 59 */       n[paramInt][0] += f2;
/*    */     }
/* 61 */     if (paramInt == 0) for (k = 0; k < this.r[0] * 2; k++) n[0][k] *= z;
/* 62 */     for (k = 0; k < this.r[paramInt] * 2; k++) j[paramInt][k] = ((int)(n[paramInt][k] * 65536.0F));
/* 63 */     return this.r[paramInt] * 2;
/*    */   }
/*    */ 
/*    */   final void c(ev paramev, k paramk) {
/* 67 */     int k = paramev.t(1118814123);
/* 68 */     this.r[0] = (k >> 4);
/* 69 */     this.r[1] = (k & 0xF);
/* 70 */     if (k != 0) {
/* 71 */       this.c[0] = paramev.k(-1987080889);
/* 72 */       this.c[1] = paramev.k(-1987080889);
/* 73 */       int i1 = paramev.t(1118814123);
/*    */       int i3;
/* 74 */       for (int i2 = 0; i2 < 2; i2++) {
/* 75 */         for (i3 = 0; i3 < this.r[i2]; i3++) {
/* 76 */           this.l[i2][0][i3] = paramev.k(-1987080889);
/* 77 */           this.m[i2][0][i3] = paramev.k(-1987080889);
/*    */         }
/*    */       }
/* 80 */       for (i2 = 0; i2 < 2; i2++) {
/* 81 */         for (i3 = 0; i3 < this.r[i2]; i3++) {
/* 82 */           if ((i1 & 1 << i2 * 4 << i3) != 0) {
/* 83 */             this.l[i2][1][i3] = paramev.k(-1987080889);
/* 84 */             this.m[i2][1][i3] = paramev.k(-1987080889);
/*    */           }
/*    */           else {
/* 87 */             this.l[i2][1][i3] = this.l[i2][0][i3];
/* 88 */             this.m[i2][1][i3] = this.m[i2][0][i3];
/*    */           }
/*    */         }
/*    */       }
/* 92 */       if ((i1 != 0) || (this.c[1] != this.c[0])) paramk.d(paramev); 
/*    */     }
/*    */     else
/*    */     {
/* 95 */       int[] arrayOfInt = this.c;
/* 96 */       this.c[1] = 0;
/* 97 */       arrayOfInt[0] = 0;
/*    */     }
/*    */   }
/*    */ 
/*    */   final void s(ev paramev, k paramk)
/*    */   {
/* 67 */     int k = paramev.t(1118814123);
/* 68 */     this.r[0] = (k >> 4);
/* 69 */     this.r[1] = (k & 0xF);
/* 70 */     if (k != 0) {
/* 71 */       this.c[0] = paramev.k(-1987080889);
/* 72 */       this.c[1] = paramev.k(-1987080889);
/* 73 */       int i1 = paramev.t(1118814123);
/*    */       int i3;
/* 74 */       for (int i2 = 0; i2 < 2; i2++) {
/* 75 */         for (i3 = 0; i3 < this.r[i2]; i3++) {
/* 76 */           this.l[i2][0][i3] = paramev.k(-1987080889);
/* 77 */           this.m[i2][0][i3] = paramev.k(-1987080889);
/*    */         }
/*    */       }
/* 80 */       for (i2 = 0; i2 < 2; i2++) {
/* 81 */         for (i3 = 0; i3 < this.r[i2]; i3++) {
/* 82 */           if ((i1 & 1 << i2 * 4 << i3) != 0) {
/* 83 */             this.l[i2][1][i3] = paramev.k(-1987080889);
/* 84 */             this.m[i2][1][i3] = paramev.k(-1987080889);
/*    */           }
/*    */           else {
/* 87 */             this.l[i2][1][i3] = this.l[i2][0][i3];
/* 88 */             this.m[i2][1][i3] = this.m[i2][0][i3];
/*    */           }
/*    */         }
/*    */       }
/* 92 */       if ((i1 != 0) || (this.c[1] != this.c[0])) paramk.d(paramev); 
/*    */     }
/*    */     else
/*    */     {
/* 95 */       int[] arrayOfInt = this.c;
/* 96 */       this.c[1] = 0;
/* 97 */       arrayOfInt[0] = 0;
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ad
 * JD-Core Version:    0.6.2
 */