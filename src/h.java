/*    */ public class h
/*    */ {
/*    */   int c;
/*    */   int d;
/*    */   int m;
/*    */   int r;
/*    */   int l;
/*    */   int n;
/*    */   int[] j;
/*    */ 
/*    */   void d(float[] paramArrayOfFloat, int paramInt, boolean paramBoolean)
/*    */   {
/* 34 */     for (int i = 0; i < paramInt; i++) paramArrayOfFloat[i] = 0.0F;
/* 35 */     if (paramBoolean) return;
/* 36 */     i = dt.w[this.n].r;
/* 37 */     int k = this.l - this.d;
/* 38 */     int i1 = k / this.m;
/* 39 */     int[] arrayOfInt = new int[i1];
/* 40 */     for (int i2 = 0; i2 < 8; i2++) {
/* 41 */       int i3 = 0;
/* 42 */       while (i3 < i1)
/*    */       {
/*    */         int i5;
/* 43 */         if (i2 == 0)
/*    */         {
/* 45 */           i4 = dt.w[this.n].l();
/* 46 */           for (i5 = i - 1; i5 >= 0; i5--) {
/* 47 */             if (i3 + i5 < i1) arrayOfInt[(i3 + i5)] = (i4 % this.c);
/* 48 */             i4 /= this.c;
/*    */           }
/*    */         }
/*    */ 
/* 52 */         for (int i4 = 0; i4 < i; i4++)
/*    */         {
/* 54 */           i5 = arrayOfInt[i3];
/* 55 */           int i6 = this.j[(i5 * 8 + i2)];
/* 56 */           if (i6 >= 0) {
/* 57 */             int i7 = this.d + i3 * this.m;
/* 58 */             x localx = dt.w[i6];
/*    */             int i8;
/* 59 */             if (this.r == 0) {
/* 60 */               i8 = this.m / localx.r;
/* 61 */               for (int i9 = 0; i9 < i8; i9++) {
/* 62 */                 float[] arrayOfFloat2 = localx.m();
/* 63 */                 for (int i11 = 0; i11 < localx.r; i11++) paramArrayOfFloat[(i7 + i9 + i11 * i8)] += arrayOfFloat2[i11]; 
/*    */               }
/*    */             }
/*    */             else
/*    */             {
/* 67 */               i8 = 0;
/* 68 */               while (i8 < this.m) {
/* 69 */                 float[] arrayOfFloat1 = localx.m();
/* 70 */                 for (int i10 = 0; i10 < localx.r; i10++) {
/* 71 */                   paramArrayOfFloat[(i7 + i8)] += arrayOfFloat1[i10];
/* 72 */                   i8++;
/*    */                 }
/*    */               }
/*    */             }
/*    */           }
/*    */ 
/* 78 */           i3++;
/* 79 */           if (i3 >= i1)
/*    */             break;
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   void r(float[] paramArrayOfFloat, int paramInt, boolean paramBoolean)
/*    */   {
/* 34 */     for (int i = 0; i < paramInt; i++) paramArrayOfFloat[i] = 0.0F;
/* 35 */     if (paramBoolean) return;
/* 36 */     i = dt.w[this.n].r;
/* 37 */     int k = this.l - this.d;
/* 38 */     int i1 = k / this.m;
/* 39 */     int[] arrayOfInt = new int[i1];
/* 40 */     for (int i2 = 0; i2 < 8; i2++) {
/* 41 */       int i3 = 0;
/* 42 */       while (i3 < i1)
/*    */       {
/*    */         int i5;
/* 43 */         if (i2 == 0)
/*    */         {
/* 45 */           i4 = dt.w[this.n].l();
/* 46 */           for (i5 = i - 1; i5 >= 0; i5--) {
/* 47 */             if (i3 + i5 < i1) arrayOfInt[(i3 + i5)] = (i4 % this.c);
/* 48 */             i4 /= this.c;
/*    */           }
/*    */         }
/*    */ 
/* 52 */         for (int i4 = 0; i4 < i; i4++)
/*    */         {
/* 54 */           i5 = arrayOfInt[i3];
/* 55 */           int i6 = this.j[(i5 * 8 + i2)];
/* 56 */           if (i6 >= 0) {
/* 57 */             int i7 = this.d + i3 * this.m;
/* 58 */             x localx = dt.w[i6];
/*    */             int i8;
/* 59 */             if (this.r == 0) {
/* 60 */               i8 = this.m / localx.r;
/* 61 */               for (int i9 = 0; i9 < i8; i9++) {
/* 62 */                 float[] arrayOfFloat2 = localx.m();
/* 63 */                 for (int i11 = 0; i11 < localx.r; i11++) paramArrayOfFloat[(i7 + i9 + i11 * i8)] += arrayOfFloat2[i11]; 
/*    */               }
/*    */             }
/*    */             else
/*    */             {
/* 67 */               i8 = 0;
/* 68 */               while (i8 < this.m) {
/* 69 */                 float[] arrayOfFloat1 = localx.m();
/* 70 */                 for (int i10 = 0; i10 < localx.r; i10++) {
/* 71 */                   paramArrayOfFloat[(i7 + i8)] += arrayOfFloat1[i10];
/* 72 */                   i8++;
/*    */                 }
/*    */               }
/*    */             }
/*    */           }
/*    */ 
/* 78 */           i3++;
/* 79 */           if (i3 >= i1)
/*    */             break;
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   h()
/*    */   {
/* 15 */     this.r = dt.z(16);
/* 16 */     this.d = dt.z(24);
/* 17 */     this.l = dt.z(24);
/* 18 */     this.m = (dt.z(24) + 1);
/* 19 */     this.c = (dt.z(6) + 1);
/* 20 */     this.n = dt.z(8);
/* 21 */     int[] arrayOfInt = new int[this.c];
/* 22 */     for (int i = 0; i < this.c; i++) {
/* 23 */       int k = 0;
/* 24 */       int i1 = dt.z(3);
/* 25 */       int i2 = dt.j() != 0 ? 1 : 0;
/* 26 */       if (i2 != 0) k = dt.z(5);
/* 27 */       arrayOfInt[i] = (k << 3 | i1);
/*    */     }
/* 29 */     this.j = new int[this.c * 8];
/* 30 */     for (i = 0; i < this.c * 8; i++) this.j[i] = ((arrayOfInt[(i >> 3)] & 1 << (i & 0x7)) != 0 ? dt.z(8) : -1);
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     h
 * JD-Core Version:    0.6.2
 */