/*    */ public class o
/*    */ {
/*    */   static final int r = 22050;
/* 10 */   t[] d = new t[10];
/*    */   int l;
/*    */   int m;
/*    */ 
/*    */   public static o z(ch paramch, int paramInt1, int paramInt2)
/*    */   {
/* 15 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 470609251);
/* 16 */     if (arrayOfByte == null) return null;
/* 17 */     return new o(new ev(arrayOfByte));
/*    */   }
/*    */ 
/*    */   public static o c(ch paramch, int paramInt1, int paramInt2)
/*    */   {
/* 15 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 1443971910);
/* 16 */     if (arrayOfByte == null) return null;
/* 17 */     return new o(new ev(arrayOfByte));
/*    */   }
/*    */ 
/*    */   public eq d()
/*    */   {
/* 33 */     byte[] arrayOfByte = m();
/* 34 */     return new eq(22050, arrayOfByte, 22050 * this.l / 1000, 22050 * this.m / 1000);
/*    */   }
/*    */ 
/*    */   public final int l() {
/* 38 */     int i = 9999999;
/* 39 */     for (int j = 0; j < 10; j++) {
/* 40 */       if ((this.d[j] != null) && 
/* 41 */         (this.d[j].b / 20 < i)) i = this.d[j].b / 20;
/*    */     }
/*    */ 
/* 44 */     if ((this.l < this.m) && (this.l / 20 < i)) i = this.l / 20;
/* 45 */     if ((i == 9999999) || (i == 0)) return 0;
/* 46 */     for (j = 0; j < 10; j++) {
/* 47 */       if (this.d[j] != null) this.d[j].b -= i * 20;
/*    */     }
/* 49 */     if (this.l < this.m) {
/* 50 */       this.l -= i * 20;
/* 51 */       this.m -= i * 20;
/*    */     }
/* 53 */     return i;
/*    */   }
/*    */ 
/*    */   final byte[] m() {
/* 57 */     int i = 0;
/* 58 */     for (int j = 0; j < 10; j++) {
/* 59 */       if ((this.d[j] != null) && 
/* 60 */         (this.d[j].e + this.d[j].b > i)) i = this.d[j].e + this.d[j].b;
/*    */     }
/*    */ 
/* 63 */     if (i == 0) return new byte[0];
/* 64 */     j = 22050 * i / 1000;
/* 65 */     byte[] arrayOfByte = new byte[j];
/* 66 */     for (int k = 0; k < 10; k++) {
/* 67 */       if (this.d[k] != null) {
/* 68 */         int n = this.d[k].e * 22050 / 1000;
/* 69 */         int i1 = this.d[k].b * 22050 / 1000;
/* 70 */         int[] arrayOfInt = this.d[k].r(n, this.d[k].e);
/* 71 */         for (int i2 = 0; i2 < n; i2++) {
/* 72 */           int i3 = arrayOfByte[(i2 + i1)] + (arrayOfInt[i2] >> 8);
/* 73 */           if ((i3 + 128 & 0xFFFFFF00) != 0) i3 = i3 >> 31 ^ 0x7F;
/* 74 */           arrayOfByte[(i2 + i1)] = ((byte)i3);
/*    */         }
/*    */       }
/*    */     }
/* 78 */     return arrayOfByte;
/*    */   }
/*    */ 
/*    */   public static o r(ch paramch, int paramInt1, int paramInt2)
/*    */   {
/* 15 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 961794965);
/* 16 */     if (arrayOfByte == null) return null;
/* 17 */     return new o(new ev(arrayOfByte));
/*    */   }
/*    */ 
/*    */   o(ev paramev) {
/* 21 */     for (int i = 0; i < 10; i++) {
/* 22 */       int j = paramev.t(1118814123);
/* 23 */       if (j != 0) {
/* 24 */         paramev.c -= -941396361;
/* 25 */         this.d[i] = new t();
/* 26 */         this.d[i].l(paramev);
/*    */       }
/*    */     }
/* 28 */     this.l = paramev.k(-1987080889);
/* 29 */     this.m = paramev.k(-1987080889);
/*    */   }
/*    */ 
/*    */   public static o j(ch paramch, int paramInt1, int paramInt2)
/*    */   {
/* 15 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 698746955);
/* 16 */     if (arrayOfByte == null) return null;
/* 17 */     return new o(new ev(arrayOfByte));
/*    */   }
/*    */ 
/*    */   public static o n(ch paramch, int paramInt1, int paramInt2)
/*    */   {
/* 15 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 1711046049);
/* 16 */     if (arrayOfByte == null) return null;
/* 17 */     return new o(new ev(arrayOfByte));
/*    */   }
/*    */ 
/*    */   public static o g(ch paramch, int paramInt1, int paramInt2)
/*    */   {
/* 15 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 660319603);
/* 16 */     if (arrayOfByte == null) return null;
/* 17 */     return new o(new ev(arrayOfByte));
/*    */   }
/*    */ 
/*    */   public eq q()
/*    */   {
/* 33 */     byte[] arrayOfByte = m();
/* 34 */     return new eq(22050, arrayOfByte, 22050 * this.l / 1000, 22050 * this.m / 1000);
/*    */   }
/*    */ 
/*    */   public final int i() {
/* 38 */     int i = 9999999;
/* 39 */     for (int j = 0; j < 10; j++) {
/* 40 */       if ((this.d[j] != null) && 
/* 41 */         (this.d[j].b / 20 < i)) i = this.d[j].b / 20;
/*    */     }
/*    */ 
/* 44 */     if ((this.l < this.m) && (this.l / 20 < i)) i = this.l / 20;
/* 45 */     if ((i == 9999999) || (i == 0)) return 0;
/* 46 */     for (j = 0; j < 10; j++) {
/* 47 */       if (this.d[j] != null) this.d[j].b -= i * 20;
/*    */     }
/* 49 */     if (this.l < this.m) {
/* 50 */       this.l -= i * 20;
/* 51 */       this.m -= i * 20;
/*    */     }
/* 53 */     return i;
/*    */   }
/*    */ 
/*    */   public final int s()
/*    */   {
/* 38 */     int i = 9999999;
/* 39 */     for (int j = 0; j < 10; j++) {
/* 40 */       if ((this.d[j] != null) && 
/* 41 */         (this.d[j].b / 20 < i)) i = this.d[j].b / 20;
/*    */     }
/*    */ 
/* 44 */     if ((this.l < this.m) && (this.l / 20 < i)) i = this.l / 20;
/* 45 */     if ((i == 9999999) || (i == 0)) return 0;
/* 46 */     for (j = 0; j < 10; j++) {
/* 47 */       if (this.d[j] != null) this.d[j].b -= i * 20;
/*    */     }
/* 49 */     if (this.l < this.m) {
/* 50 */       this.l -= i * 20;
/* 51 */       this.m -= i * 20;
/*    */     }
/* 53 */     return i;
/*    */   }
/*    */ 
/*    */   public final int u()
/*    */   {
/* 38 */     int i = 9999999;
/* 39 */     for (int j = 0; j < 10; j++) {
/* 40 */       if ((this.d[j] != null) && 
/* 41 */         (this.d[j].b / 20 < i)) i = this.d[j].b / 20;
/*    */     }
/*    */ 
/* 44 */     if ((this.l < this.m) && (this.l / 20 < i)) i = this.l / 20;
/* 45 */     if ((i == 9999999) || (i == 0)) return 0;
/* 46 */     for (j = 0; j < 10; j++) {
/* 47 */       if (this.d[j] != null) this.d[j].b -= i * 20;
/*    */     }
/* 49 */     if (this.l < this.m) {
/* 50 */       this.l -= i * 20;
/* 51 */       this.m -= i * 20;
/*    */     }
/* 53 */     return i;
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     o
 * JD-Core Version:    0.6.2
 */