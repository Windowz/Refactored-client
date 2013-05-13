/*    */ public final class ft extends fv
/*    */ {
/*    */   public byte[] u;
/*    */   public int[] v;
/*    */   public int w;
/*    */   public int e;
/*    */   public int b;
/*    */   public int y;
/*    */   public int t;
/*    */   public int f;
/*    */ 
/*    */   public void bc()
/*    */   {
/* 18 */     if ((this.w == this.t) && (this.e == this.f)) return;
/* 19 */     byte[] arrayOfByte = new byte[this.t * this.f];
/* 20 */     int i = 0;
/* 21 */     for (int j = 0; j < this.e; j++) {
/* 22 */       for (int k = 0; k < this.w; k++) {
/* 23 */         arrayOfByte[(k + this.b + (j + this.y) * this.t)] = this.u[(i++)];
/*    */       }
/*    */     }
/* 26 */     this.u = arrayOfByte;
/* 27 */     this.w = this.t;
/* 28 */     this.e = this.f;
/* 29 */     this.b = 0;
/* 30 */     this.y = 0;
/*    */   }
/*    */ 
/*    */   public void bm()
/*    */   {
/* 18 */     if ((this.w == this.t) && (this.e == this.f)) return;
/* 19 */     byte[] arrayOfByte = new byte[this.t * this.f];
/* 20 */     int i = 0;
/* 21 */     for (int j = 0; j < this.e; j++) {
/* 22 */       for (int k = 0; k < this.w; k++) {
/* 23 */         arrayOfByte[(k + this.b + (j + this.y) * this.t)] = this.u[(i++)];
/*    */       }
/*    */     }
/* 26 */     this.u = arrayOfByte;
/* 27 */     this.w = this.t;
/* 28 */     this.e = this.f;
/* 29 */     this.b = 0;
/* 30 */     this.y = 0;
/*    */   }
/*    */ 
/*    */   static void bp(int[] paramArrayOfInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 88 */     int i = -(paramInt3 >> 2);
/* 89 */     paramInt3 = -(paramInt3 & 0x3);
/* 90 */     for (int j = -paramInt4; j < 0; j++)
/*    */     {
/*    */       int m;
/* 91 */       for (int k = i; k < 0; k++) {
/* 92 */         m = paramArrayOfByte[(paramInt1++)];
/* 93 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 94 */           paramInt2++;
/* 95 */         m = paramArrayOfByte[(paramInt1++)];
/* 96 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 97 */           paramInt2++;
/* 98 */         m = paramArrayOfByte[(paramInt1++)];
/* 99 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 100 */           paramInt2++;
/* 101 */         m = paramArrayOfByte[(paramInt1++)];
/* 102 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 103 */           paramInt2++;
/*    */       }
/* 105 */       for (k = paramInt3; k < 0; k++) {
/* 106 */         m = paramArrayOfByte[(paramInt1++)];
/* 107 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 108 */           paramInt2++;
/*    */       }
/* 110 */       paramInt2 += paramInt5;
/* 111 */       paramInt1 += paramInt6;
/*    */     }
/*    */   }
/*    */ 
/*    */   public void bb(int paramInt1, int paramInt2)
/*    */   {
/* 52 */     paramInt1 += this.b;
/* 53 */     paramInt2 += this.y;
/* 54 */     int i = paramInt1 + paramInt2 * j;
/* 55 */     int j = 0;
/* 56 */     int k = this.e;
/* 57 */     int m = this.w;
/* 58 */     int n = j - m;
/* 59 */     int i1 = 0;
/*    */     int i2;
/* 60 */     if (paramInt2 < g) {
/* 61 */       i2 = g - paramInt2;
/* 62 */       k -= i2;
/* 63 */       paramInt2 = g;
/* 64 */       j += i2 * m;
/* 65 */       i += i2 * j;
/*    */     }
/* 67 */     if (paramInt2 + k > q) k -= paramInt2 + k - q;
/* 68 */     if (paramInt1 < i) {
/* 69 */       i2 = i - paramInt1;
/* 70 */       m -= i2;
/* 71 */       paramInt1 = i;
/* 72 */       j += i2;
/* 73 */       i += i2;
/* 74 */       i1 += i2;
/* 75 */       n += i2;
/*    */     }
/* 77 */     if (paramInt1 + m > s) {
/* 78 */       i2 = paramInt1 + m - s;
/* 79 */       m -= i2;
/* 80 */       i1 += i2;
/* 81 */       n += i2;
/*    */     }
/* 83 */     if ((m <= 0) || (k <= 0)) return;
/* 84 */     bp(n, this.u, this.v, j, i, m, k, n, i1);
/*    */   }
/*    */ 
/*    */   public void be(int paramInt1, int paramInt2)
/*    */   {
/* 52 */     paramInt1 += this.b;
/* 53 */     paramInt2 += this.y;
/* 54 */     int i = paramInt1 + paramInt2 * j;
/* 55 */     int j = 0;
/* 56 */     int k = this.e;
/* 57 */     int m = this.w;
/* 58 */     int n = j - m;
/* 59 */     int i1 = 0;
/*    */     int i2;
/* 60 */     if (paramInt2 < g) {
/* 61 */       i2 = g - paramInt2;
/* 62 */       k -= i2;
/* 63 */       paramInt2 = g;
/* 64 */       j += i2 * m;
/* 65 */       i += i2 * j;
/*    */     }
/* 67 */     if (paramInt2 + k > q) k -= paramInt2 + k - q;
/* 68 */     if (paramInt1 < i) {
/* 69 */       i2 = i - paramInt1;
/* 70 */       m -= i2;
/* 71 */       paramInt1 = i;
/* 72 */       j += i2;
/* 73 */       i += i2;
/* 74 */       i1 += i2;
/* 75 */       n += i2;
/*    */     }
/* 77 */     if (paramInt1 + m > s) {
/* 78 */       i2 = paramInt1 + m - s;
/* 79 */       m -= i2;
/* 80 */       i1 += i2;
/* 81 */       n += i2;
/*    */     }
/* 83 */     if ((m <= 0) || (k <= 0)) return;
/* 84 */     bp(n, this.u, this.v, j, i, m, k, n, i1);
/*    */   }
/*    */ 
/*    */   public void ba()
/*    */   {
/* 18 */     if ((this.w == this.t) && (this.e == this.f)) return;
/* 19 */     byte[] arrayOfByte = new byte[this.t * this.f];
/* 20 */     int i = 0;
/* 21 */     for (int j = 0; j < this.e; j++) {
/* 22 */       for (int k = 0; k < this.w; k++) {
/* 23 */         arrayOfByte[(k + this.b + (j + this.y) * this.t)] = this.u[(i++)];
/*    */       }
/*    */     }
/* 26 */     this.u = arrayOfByte;
/* 27 */     this.w = this.t;
/* 28 */     this.e = this.f;
/* 29 */     this.b = 0;
/* 30 */     this.y = 0;
/*    */   }
/*    */ 
/*    */   static void cr(int[] paramArrayOfInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 88 */     int i = -(paramInt3 >> 2);
/* 89 */     paramInt3 = -(paramInt3 & 0x3);
/* 90 */     for (int j = -paramInt4; j < 0; j++)
/*    */     {
/*    */       int m;
/* 91 */       for (int k = i; k < 0; k++) {
/* 92 */         m = paramArrayOfByte[(paramInt1++)];
/* 93 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 94 */           paramInt2++;
/* 95 */         m = paramArrayOfByte[(paramInt1++)];
/* 96 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 97 */           paramInt2++;
/* 98 */         m = paramArrayOfByte[(paramInt1++)];
/* 99 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 100 */           paramInt2++;
/* 101 */         m = paramArrayOfByte[(paramInt1++)];
/* 102 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 103 */           paramInt2++;
/*    */       }
/* 105 */       for (k = paramInt3; k < 0; k++) {
/* 106 */         m = paramArrayOfByte[(paramInt1++)];
/* 107 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 108 */           paramInt2++;
/*    */       }
/* 110 */       paramInt2 += paramInt5;
/* 111 */       paramInt1 += paramInt6;
/*    */     }
/*    */   }
/*    */ 
/*    */   public void br(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 34 */     for (int i = 0; i < this.v.length; i++) {
/* 35 */       int j = this.v[i] >> 16 & 0xFF;
/* 36 */       j += paramInt1;
/* 37 */       if (j < 0) j = 0;
/* 38 */       else if (j > 255) j = 255;
/* 39 */       int k = this.v[i] >> 8 & 0xFF;
/* 40 */       k += paramInt2;
/* 41 */       if (k < 0) k = 0;
/* 42 */       else if (k > 255) k = 255;
/* 43 */       int m = this.v[i] & 0xFF;
/* 44 */       m += paramInt3;
/* 45 */       if (m < 0) m = 0;
/* 46 */       else if (m > 255) m = 255;
/* 47 */       this.v[i] = ((j << 16) + (k << 8) + m);
/*    */     }
/*    */   }
/*    */ 
/*    */   public void bn(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 34 */     for (int i = 0; i < this.v.length; i++) {
/* 35 */       int j = this.v[i] >> 16 & 0xFF;
/* 36 */       j += paramInt1;
/* 37 */       if (j < 0) j = 0;
/* 38 */       else if (j > 255) j = 255;
/* 39 */       int k = this.v[i] >> 8 & 0xFF;
/* 40 */       k += paramInt2;
/* 41 */       if (k < 0) k = 0;
/* 42 */       else if (k > 255) k = 255;
/* 43 */       int m = this.v[i] & 0xFF;
/* 44 */       m += paramInt3;
/* 45 */       if (m < 0) m = 0;
/* 46 */       else if (m > 255) m = 255;
/* 47 */       this.v[i] = ((j << 16) + (k << 8) + m);
/*    */     }
/*    */   }
/*    */ 
/*    */   static void bd(int[] paramArrayOfInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 88 */     int i = -(paramInt3 >> 2);
/* 89 */     paramInt3 = -(paramInt3 & 0x3);
/* 90 */     for (int j = -paramInt4; j < 0; j++)
/*    */     {
/*    */       int m;
/* 91 */       for (int k = i; k < 0; k++) {
/* 92 */         m = paramArrayOfByte[(paramInt1++)];
/* 93 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 94 */           paramInt2++;
/* 95 */         m = paramArrayOfByte[(paramInt1++)];
/* 96 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 97 */           paramInt2++;
/* 98 */         m = paramArrayOfByte[(paramInt1++)];
/* 99 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 100 */           paramInt2++;
/* 101 */         m = paramArrayOfByte[(paramInt1++)];
/* 102 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 103 */           paramInt2++;
/*    */       }
/* 105 */       for (k = paramInt3; k < 0; k++) {
/* 106 */         m = paramArrayOfByte[(paramInt1++)];
/* 107 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 108 */           paramInt2++;
/*    */       }
/* 110 */       paramInt2 += paramInt5;
/* 111 */       paramInt1 += paramInt6;
/*    */     }
/*    */   }
/*    */ 
/*    */   static void cs(int[] paramArrayOfInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 88 */     int i = -(paramInt3 >> 2);
/* 89 */     paramInt3 = -(paramInt3 & 0x3);
/* 90 */     for (int j = -paramInt4; j < 0; j++)
/*    */     {
/*    */       int m;
/* 91 */       for (int k = i; k < 0; k++) {
/* 92 */         m = paramArrayOfByte[(paramInt1++)];
/* 93 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 94 */           paramInt2++;
/* 95 */         m = paramArrayOfByte[(paramInt1++)];
/* 96 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 97 */           paramInt2++;
/* 98 */         m = paramArrayOfByte[(paramInt1++)];
/* 99 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 100 */           paramInt2++;
/* 101 */         m = paramArrayOfByte[(paramInt1++)];
/* 102 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 103 */           paramInt2++;
/*    */       }
/* 105 */       for (k = paramInt3; k < 0; k++) {
/* 106 */         m = paramArrayOfByte[(paramInt1++)];
/* 107 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 108 */           paramInt2++;
/*    */       }
/* 110 */       paramInt2 += paramInt5;
/* 111 */       paramInt1 += paramInt6;
/*    */     }
/*    */   }
/*    */ 
/*    */   static void cj(int[] paramArrayOfInt1, byte[] paramArrayOfByte, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 88 */     int i = -(paramInt3 >> 2);
/* 89 */     paramInt3 = -(paramInt3 & 0x3);
/* 90 */     for (int j = -paramInt4; j < 0; j++)
/*    */     {
/*    */       int m;
/* 91 */       for (int k = i; k < 0; k++) {
/* 92 */         m = paramArrayOfByte[(paramInt1++)];
/* 93 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 94 */           paramInt2++;
/* 95 */         m = paramArrayOfByte[(paramInt1++)];
/* 96 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 97 */           paramInt2++;
/* 98 */         m = paramArrayOfByte[(paramInt1++)];
/* 99 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 100 */           paramInt2++;
/* 101 */         m = paramArrayOfByte[(paramInt1++)];
/* 102 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 103 */           paramInt2++;
/*    */       }
/* 105 */       for (k = paramInt3; k < 0; k++) {
/* 106 */         m = paramArrayOfByte[(paramInt1++)];
/* 107 */         if (m != 0) paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(m & 0xFF)]; else
/* 108 */           paramInt2++;
/*    */       }
/* 110 */       paramInt2 += paramInt5;
/* 111 */       paramInt1 += paramInt6;
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ft
 * JD-Core Version:    0.6.2
 */