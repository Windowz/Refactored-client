/*    */ public class k
/*    */ {
/*    */   int n;
/*    */   int[] d;
/*    */   int[] l;
/*    */   int r;
/*    */   int c;
/*    */   int z;
/*    */   int j;
/*    */   int i;
/*    */   int g;
/*    */   int q;
/*    */   int m;
/*    */ 
/*    */   k()
/*    */   {
/* 21 */     this.r = 2;
/* 22 */     this.d = new int[2];
/* 23 */     this.l = new int[2];
/* 24 */     this.d[0] = 0;
/* 25 */     this.d[1] = 65535;
/* 26 */     this.l[0] = 0;
/* 27 */     this.l[1] = 65535;
/*    */   }
/*    */ 
/*    */   final void r(ev paramev) {
/* 31 */     this.n = paramev.t(1118814123);
/* 32 */     this.m = paramev.h(1548222203);
/* 33 */     this.c = paramev.h(-731226796);
/* 34 */     d(paramev);
/*    */   }
/*    */ 
/*    */   final void d(ev paramev) {
/* 38 */     this.r = paramev.t(1118814123);
/* 39 */     this.d = new int[this.r];
/* 40 */     this.l = new int[this.r];
/* 41 */     for (int k = 0; k < this.r; k++) {
/* 42 */       this.d[k] = paramev.k(-1987080889);
/* 43 */       this.l[k] = paramev.k(-1987080889);
/*    */     }
/*    */   }
/*    */ 
/*    */   final void j(ev paramev)
/*    */   {
/* 38 */     this.r = paramev.t(1118814123);
/* 39 */     this.d = new int[this.r];
/* 40 */     this.l = new int[this.r];
/* 41 */     for (int k = 0; k < this.r; k++) {
/* 42 */       this.d[k] = paramev.k(-1987080889);
/* 43 */       this.l[k] = paramev.k(-1987080889);
/*    */     }
/*    */   }
/*    */ 
/*    */   final int m(int paramInt)
/*    */   {
/* 56 */     if (this.i >= this.j) {
/* 57 */       this.q = (this.l[(this.z++)] << 15);
/* 58 */       if (this.z >= this.r) this.z = (this.r - 1);
/* 59 */       this.j = ((int)(this.d[this.z] / 65536.0D * paramInt));
/* 60 */       if (this.j > this.i) this.g = (((this.l[this.z] << 15) - this.q) / (this.j - this.i));
/*    */     }
/* 62 */     this.q += this.g;
/* 63 */     this.i += 1;
/* 64 */     return this.q - this.g >> 15;
/*    */   }
/*    */ 
/*    */   final void c(ev paramev)
/*    */   {
/* 31 */     this.n = paramev.t(1118814123);
/* 32 */     this.m = paramev.h(663687109);
/* 33 */     this.c = paramev.h(1361138381);
/* 34 */     d(paramev);
/*    */   }
/*    */ 
/*    */   final void g(ev paramev) {
/* 38 */     this.r = paramev.t(1118814123);
/* 39 */     this.d = new int[this.r];
/* 40 */     this.l = new int[this.r];
/* 41 */     for (int k = 0; k < this.r; k++) {
/* 42 */       this.d[k] = paramev.k(-1987080889);
/* 43 */       this.l[k] = paramev.k(-1987080889);
/*    */     }
/*    */   }
/*    */ 
/*    */   final void s() {
/* 48 */     this.j = 0;
/* 49 */     this.z = 0;
/* 50 */     this.g = 0;
/* 51 */     this.q = 0;
/* 52 */     this.i = 0;
/*    */   }
/*    */ 
/*    */   final void z(ev paramev)
/*    */   {
/* 38 */     this.r = paramev.t(1118814123);
/* 39 */     this.d = new int[this.r];
/* 40 */     this.l = new int[this.r];
/* 41 */     for (int k = 0; k < this.r; k++) {
/* 42 */       this.d[k] = paramev.k(-1987080889);
/* 43 */       this.l[k] = paramev.k(-1987080889);
/*    */     }
/*    */   }
/*    */ 
/*    */   final void l() {
/* 48 */     this.j = 0;
/* 49 */     this.z = 0;
/* 50 */     this.g = 0;
/* 51 */     this.q = 0;
/* 52 */     this.i = 0;
/*    */   }
/*    */ 
/*    */   final void n(ev paramev)
/*    */   {
/* 38 */     this.r = paramev.t(1118814123);
/* 39 */     this.d = new int[this.r];
/* 40 */     this.l = new int[this.r];
/* 41 */     for (int k = 0; k < this.r; k++) {
/* 42 */       this.d[k] = paramev.k(-1987080889);
/* 43 */       this.l[k] = paramev.k(-1987080889);
/*    */     }
/*    */   }
/*    */ 
/*    */   final void i() {
/* 48 */     this.j = 0;
/* 49 */     this.z = 0;
/* 50 */     this.g = 0;
/* 51 */     this.q = 0;
/* 52 */     this.i = 0;
/*    */   }
/*    */ 
/*    */   final void q()
/*    */   {
/* 48 */     this.j = 0;
/* 49 */     this.z = 0;
/* 50 */     this.g = 0;
/* 51 */     this.q = 0;
/* 52 */     this.i = 0;
/*    */   }
/*    */ 
/*    */   final int u(int paramInt) {
/* 56 */     if (this.i >= this.j) {
/* 57 */       this.q = (this.l[(this.z++)] << 15);
/* 58 */       if (this.z >= this.r) this.z = (this.r - 1);
/* 59 */       this.j = ((int)(this.d[this.z] / 65536.0D * paramInt));
/* 60 */       if (this.j > this.i) this.g = (((this.l[this.z] << 15) - this.q) / (this.j - this.i));
/*    */     }
/* 62 */     this.q += this.g;
/* 63 */     this.i += 1;
/* 64 */     return this.q - this.g >> 15;
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     k
 * JD-Core Version:    0.6.2
 */