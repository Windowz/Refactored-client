/*     */ public class cs
/*     */ {
/*     */   int[] c;
/*     */   int[] n;
/*     */   int[] l;
/*     */   static final int v = 3;
/*     */   static final int z = 500000;
/*     */   int[] m;
/*     */   int j;
/*   8 */   ev r = new ev(null);
/*     */   long g;
/*  17 */   static final byte[] q = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
/*     */   static final int i = 0;
/*     */   static final int s = 1;
/*     */   static final int u = 2;
/*     */   int d;
/*     */ 
/*     */   int p(int paramInt)
/*     */   {
/*  89 */     int k = q(paramInt);
/*  90 */     return k;
/*     */   }
/*     */ 
/*     */   void r(byte[] paramArrayOfByte)
/*     */   {
/*  30 */     this.r.m = paramArrayOfByte;
/*     */ 
/*  33 */     this.r.c = -824029018;
/*  34 */     int k = this.r.k(-1987080889);
/*     */ 
/*  36 */     this.d = this.r.k(-1987080889);
/*  37 */     this.j = 500000;
/*  38 */     this.l = new int[k];
/*  39 */     for (int i1 = 0; i1 < k; ) {
/*  40 */       int i2 = this.r.h(217292942);
/*  41 */       int i3 = this.r.h(-594597558);
/*  42 */       if (i2 == 1297379947) {
/*  43 */         this.l[i1] = (this.r.c * -196293817);
/*  44 */         i1++;
/*     */       }
/*  46 */       this.r.c += i3 * -941396361;
/*     */     }
/*  48 */     this.g = 0L;
/*  49 */     this.m = new int[k];
/*  50 */     for (i1 = 0; i1 < k; i1++) this.m[i1] = this.l[i1];
/*  51 */     this.c = new int[k];
/*  52 */     this.n = new int[k];
/*     */   }
/*     */ 
/*     */   int ay()
/*     */   {
/* 151 */     int k = this.m.length;
/* 152 */     int i1 = -1;
/* 153 */     int i2 = 2147483647;
/* 154 */     for (int i3 = 0; i3 < k; i3++) {
/* 155 */       if ((this.m[i3] >= 0) && 
/* 156 */         (this.c[i3] < i2)) {
/* 157 */         i1 = i3;
/* 158 */         i2 = this.c[i3];
/*     */       }
/*     */     }
/* 161 */     return i1;
/*     */   }
/*     */ 
/*     */   void a(int paramInt)
/*     */   {
/*  84 */     int k = this.r.ak((byte)2);
/*  85 */     this.c[paramInt] += k;
/*     */   }
/*     */ 
/*     */   boolean l()
/*     */   {
/*  64 */     return this.r.m != null;
/*     */   }
/*     */ 
/*     */   int m() {
/*  68 */     return this.m.length;
/*     */   }
/*     */ 
/*     */   void c(int paramInt) {
/*  72 */     this.r.c = (this.m[paramInt] * -941396361);
/*     */   }
/*     */ 
/*     */   void n(int paramInt) {
/*  76 */     this.m[paramInt] = (this.r.c * -196293817);
/*     */   }
/*     */ 
/*     */   void j() {
/*  80 */     this.r.c = 941396361;
/*     */   }
/*     */ 
/*     */   void z(int paramInt) {
/*  84 */     int k = this.r.ak((byte)2);
/*  85 */     this.c[paramInt] += k;
/*     */   }
/*     */ 
/*     */   int h(int paramInt) {
/*  89 */     int k = q(paramInt);
/*  90 */     return k;
/*     */   }
/*     */ 
/*     */   int q(int paramInt) {
/*  94 */     int k = this.r.m[(this.r.c * -196293817)];
/*  95 */     if (k < 0) {
/*  96 */       k &= 255;
/*  97 */       this.n[paramInt] = k;
/*  98 */       this.r.c += -941396361;
/*     */     }
/*     */     else {
/* 101 */       k = this.n[paramInt];
/*     */     }
/* 103 */     if ((k == 240) || (k == 247)) {
/* 104 */       int i1 = this.r.ak((byte)2);
/* 105 */       if ((k == 247) && (i1 > 0)) {
/* 106 */         int i2 = this.r.m[(this.r.c * -196293817)] & 0xFF;
/* 107 */         if (((i2 >= 241) && (i2 <= 243)) || (i2 == 246) || (i2 == 248) || ((i2 >= 250) && (i2 <= 252)) || (i2 == 254)) {
/* 108 */           this.r.c += -941396361;
/* 109 */           this.n[paramInt] = i2;
/* 110 */           return i(paramInt, i2);
/*     */         }
/*     */       }
/* 113 */       this.r.c += i1 * -941396361;
/* 114 */       return 0;
/*     */     }
/* 116 */     return i(paramInt, k);
/*     */   }
/*     */ 
/*     */   int i(int paramInt1, int paramInt2) {
/* 120 */     if (paramInt2 == 255) {
/* 121 */       k = this.r.t(1118814123);
/* 122 */       i1 = this.r.ak((byte)2);
/* 123 */       if (k == 47) {
/* 124 */         this.r.c += i1 * -941396361;
/* 125 */         return 1;
/*     */       }
/* 127 */       if (k == 81) {
/* 128 */         int i2 = this.r.a((byte)99);
/* 129 */         i1 -= 3;
/* 130 */         int i3 = this.c[paramInt1];
/* 131 */         this.g += i3 * (this.j - i2);
/* 132 */         this.j = i2;
/* 133 */         this.r.c += i1 * -941396361;
/* 134 */         return 2;
/*     */       }
/* 136 */       this.r.c += i1 * -941396361;
/* 137 */       return 3;
/*     */     }
/* 139 */     int k = q[(paramInt2 - 128)];
/* 140 */     int i1 = paramInt2;
/* 141 */     if (k >= 1) i1 |= this.r.t(1118814123) << 8;
/* 142 */     if (k >= 2) i1 |= this.r.t(1118814123) << 16;
/* 143 */     return i1;
/*     */   }
/*     */ 
/*     */   long s(int paramInt) {
/* 147 */     return this.g + paramInt * this.j;
/*     */   }
/*     */ 
/*     */   void d()
/*     */   {
/*  56 */     this.r.m = null;
/*  57 */     this.l = null;
/*  58 */     this.m = null;
/*  59 */     this.c = null;
/*  60 */     this.n = null;
/*     */   }
/*     */ 
/*     */   boolean v()
/*     */   {
/* 165 */     int k = this.m.length;
/* 166 */     for (int i1 = 0; i1 < k; i1++) if (this.m[i1] >= 0) return false;
/* 167 */     return true;
/*     */   }
/*     */ 
/*     */   int g(int paramInt)
/*     */   {
/*  89 */     int k = q(paramInt);
/*  90 */     return k;
/*     */   }
/*     */ 
/*     */   long an(int paramInt)
/*     */   {
/* 147 */     return this.g + paramInt * this.j;
/*     */   }
/*     */ 
/*     */   boolean b()
/*     */   {
/*  64 */     return this.r.m != null;
/*     */   }
/*     */ 
/*     */   void y(int paramInt)
/*     */   {
/*  72 */     this.r.c = (this.m[paramInt] * -941396361); } 
/*  72 */   void t(int paramInt) { this.r.c = (this.m[paramInt] * -941396361); } 
/*  72 */   void f(int paramInt) { this.r.c = (this.m[paramInt] * -941396361); }
/*     */ 
/*     */ 
/*     */   void k()
/*     */   {
/*  80 */     this.r.c = 941396361; } 
/*  80 */   void o() { this.r.c = 941396361; }
/*     */ 
/*     */ 
/*     */   void w(long paramLong)
/*     */   {
/* 171 */     this.g = paramLong;
/* 172 */     int k = this.m.length;
/* 173 */     for (int i1 = 0; i1 < k; i1++) {
/* 174 */       this.c[i1] = 0;
/* 175 */       this.n[i1] = 0;
/* 176 */       this.r.c = (this.l[i1] * -941396361);
/* 177 */       z(i1);
/* 178 */       this.m[i1] = (this.r.c * -196293817);
/*     */     }
/*     */   }
/*     */ 
/*     */   cs()
/*     */   {
/*     */   }
/*     */ 
/*     */   int x(int paramInt)
/*     */   {
/*  89 */     int k = q(paramInt);
/*  90 */     return k;
/*     */   }
/*     */ 
/*     */   int am(int paramInt1, int paramInt2)
/*     */   {
/* 120 */     if (paramInt2 == 255) {
/* 121 */       k = this.r.t(1118814123);
/* 122 */       i1 = this.r.ak((byte)2);
/* 123 */       if (k == 47) {
/* 124 */         this.r.c += i1 * -941396361;
/* 125 */         return 1;
/*     */       }
/* 127 */       if (k == 81) {
/* 128 */         int i2 = this.r.a((byte)73);
/* 129 */         i1 -= 3;
/* 130 */         int i3 = this.c[paramInt1];
/* 131 */         this.g += i3 * (this.j - i2);
/* 132 */         this.j = i2;
/* 133 */         this.r.c += i1 * -941396361;
/* 134 */         return 2;
/*     */       }
/* 136 */       this.r.c += i1 * -941396361;
/* 137 */       return 3;
/*     */     }
/* 139 */     int k = q[(paramInt2 - 128)];
/* 140 */     int i1 = paramInt2;
/* 141 */     if (k >= 1) i1 |= this.r.t(1118814123) << 8;
/* 142 */     if (k >= 2) i1 |= this.r.t(1118814123) << 16;
/* 143 */     return i1;
/*     */   }
/*     */ 
/*     */   int ac(int paramInt)
/*     */   {
/*  94 */     int k = this.r.m[(this.r.c * -196293817)];
/*  95 */     if (k < 0) {
/*  96 */       k &= 255;
/*  97 */       this.n[paramInt] = k;
/*  98 */       this.r.c += -941396361;
/*     */     }
/*     */     else {
/* 101 */       k = this.n[paramInt];
/*     */     }
/* 103 */     if ((k == 240) || (k == 247)) {
/* 104 */       int i1 = this.r.ak((byte)2);
/* 105 */       if ((k == 247) && (i1 > 0)) {
/* 106 */         int i2 = this.r.m[(this.r.c * -196293817)] & 0xFF;
/* 107 */         if (((i2 >= 241) && (i2 <= 243)) || (i2 == 246) || (i2 == 248) || ((i2 >= 250) && (i2 <= 252)) || (i2 == 254)) {
/* 108 */           this.r.c += -941396361;
/* 109 */           this.n[paramInt] = i2;
/* 110 */           return i(paramInt, i2);
/*     */         }
/*     */       }
/* 113 */       this.r.c += i1 * -941396361;
/* 114 */       return 0;
/*     */     }
/* 116 */     return i(paramInt, k);
/*     */   }
/*     */ 
/*     */   int ap(int paramInt1, int paramInt2) {
/* 120 */     if (paramInt2 == 255) {
/* 121 */       k = this.r.t(1118814123);
/* 122 */       i1 = this.r.ak((byte)2);
/* 123 */       if (k == 47) {
/* 124 */         this.r.c += i1 * -941396361;
/* 125 */         return 1;
/*     */       }
/* 127 */       if (k == 81) {
/* 128 */         int i2 = this.r.a((byte)106);
/* 129 */         i1 -= 3;
/* 130 */         int i3 = this.c[paramInt1];
/* 131 */         this.g += i3 * (this.j - i2);
/* 132 */         this.j = i2;
/* 133 */         this.r.c += i1 * -941396361;
/* 134 */         return 2;
/*     */       }
/* 136 */       this.r.c += i1 * -941396361;
/* 137 */       return 3;
/*     */     }
/* 139 */     int k = q[(paramInt2 - 128)];
/* 140 */     int i1 = paramInt2;
/* 141 */     if (k >= 1) i1 |= this.r.t(1118814123) << 8;
/* 142 */     if (k >= 2) i1 |= this.r.t(1118814123) << 16;
/* 143 */     return i1;
/*     */   }
/*     */ 
/*     */   int aa(int paramInt)
/*     */   {
/*  94 */     int k = this.r.m[(this.r.c * -196293817)];
/*  95 */     if (k < 0) {
/*  96 */       k &= 255;
/*  97 */       this.n[paramInt] = k;
/*  98 */       this.r.c += -941396361;
/*     */     }
/*     */     else {
/* 101 */       k = this.n[paramInt];
/*     */     }
/* 103 */     if ((k == 240) || (k == 247)) {
/* 104 */       int i1 = this.r.ak((byte)2);
/* 105 */       if ((k == 247) && (i1 > 0)) {
/* 106 */         int i2 = this.r.m[(this.r.c * -196293817)] & 0xFF;
/* 107 */         if (((i2 >= 241) && (i2 <= 243)) || (i2 == 246) || (i2 == 248) || ((i2 >= 250) && (i2 <= 252)) || (i2 == 254)) {
/* 108 */           this.r.c += -941396361;
/* 109 */           this.n[paramInt] = i2;
/* 110 */           return i(paramInt, i2);
/*     */         }
/*     */       }
/* 113 */       this.r.c += i1 * -941396361;
/* 114 */       return 0;
/*     */     }
/* 116 */     return i(paramInt, k);
/*     */   }
/*     */ 
/*     */   int as(int paramInt)
/*     */   {
/*  94 */     int k = this.r.m[(this.r.c * -196293817)];
/*  95 */     if (k < 0) {
/*  96 */       k &= 255;
/*  97 */       this.n[paramInt] = k;
/*  98 */       this.r.c += -941396361;
/*     */     }
/*     */     else {
/* 101 */       k = this.n[paramInt];
/*     */     }
/* 103 */     if ((k == 240) || (k == 247)) {
/* 104 */       int i1 = this.r.ak((byte)2);
/* 105 */       if ((k == 247) && (i1 > 0)) {
/* 106 */         int i2 = this.r.m[(this.r.c * -196293817)] & 0xFF;
/* 107 */         if (((i2 >= 241) && (i2 <= 243)) || (i2 == 246) || (i2 == 248) || ((i2 >= 250) && (i2 <= 252)) || (i2 == 254)) {
/* 108 */           this.r.c += -941396361;
/* 109 */           this.n[paramInt] = i2;
/* 110 */           return i(paramInt, i2);
/*     */         }
/*     */       }
/* 113 */       this.r.c += i1 * -941396361;
/* 114 */       return 0;
/*     */     }
/* 116 */     return i(paramInt, k);
/*     */   }
/*     */ 
/*     */   int ak(int paramInt1, int paramInt2) {
/* 120 */     if (paramInt2 == 255) {
/* 121 */       k = this.r.t(1118814123);
/* 122 */       i1 = this.r.ak((byte)2);
/* 123 */       if (k == 47) {
/* 124 */         this.r.c += i1 * -941396361;
/* 125 */         return 1;
/*     */       }
/* 127 */       if (k == 81) {
/* 128 */         int i2 = this.r.a((byte)8);
/* 129 */         i1 -= 3;
/* 130 */         int i3 = this.c[paramInt1];
/* 131 */         this.g += i3 * (this.j - i2);
/* 132 */         this.j = i2;
/* 133 */         this.r.c += i1 * -941396361;
/* 134 */         return 2;
/*     */       }
/* 136 */       this.r.c += i1 * -941396361;
/* 137 */       return 3;
/*     */     }
/* 139 */     int k = q[(paramInt2 - 128)];
/* 140 */     int i1 = paramInt2;
/* 141 */     if (k >= 1) i1 |= this.r.t(1118814123) << 8;
/* 142 */     if (k >= 2) i1 |= this.r.t(1118814123) << 16;
/* 143 */     return i1;
/*     */   }
/*     */ 
/*     */   void e()
/*     */   {
/*  56 */     this.r.m = null;
/*  57 */     this.l = null;
/*  58 */     this.m = null;
/*  59 */     this.c = null;
/*  60 */     this.n = null;
/*     */   }
/*     */ 
/*     */   int av(int paramInt1, int paramInt2)
/*     */   {
/* 120 */     if (paramInt2 == 255) {
/* 121 */       k = this.r.t(1118814123);
/* 122 */       i1 = this.r.ak((byte)2);
/* 123 */       if (k == 47) {
/* 124 */         this.r.c += i1 * -941396361;
/* 125 */         return 1;
/*     */       }
/* 127 */       if (k == 81) {
/* 128 */         int i2 = this.r.a((byte)35);
/* 129 */         i1 -= 3;
/* 130 */         int i3 = this.c[paramInt1];
/* 131 */         this.g += i3 * (this.j - i2);
/* 132 */         this.j = i2;
/* 133 */         this.r.c += i1 * -941396361;
/* 134 */         return 2;
/*     */       }
/* 136 */       this.r.c += i1 * -941396361;
/* 137 */       return 3;
/*     */     }
/* 139 */     int k = q[(paramInt2 - 128)];
/* 140 */     int i1 = paramInt2;
/* 141 */     if (k >= 1) i1 |= this.r.t(1118814123) << 8;
/* 142 */     if (k >= 2) i1 |= this.r.t(1118814123) << 16;
/* 143 */     return i1;
/*     */   }
/*     */ 
/*     */   cs(byte[] paramArrayOfByte)
/*     */   {
/*  26 */     r(paramArrayOfByte);
/*     */   }
/*     */ 
/*     */   int az(int paramInt1, int paramInt2)
/*     */   {
/* 120 */     if (paramInt2 == 255) {
/* 121 */       k = this.r.t(1118814123);
/* 122 */       i1 = this.r.ak((byte)2);
/* 123 */       if (k == 47) {
/* 124 */         this.r.c += i1 * -941396361;
/* 125 */         return 1;
/*     */       }
/* 127 */       if (k == 81) {
/* 128 */         int i2 = this.r.a((byte)114);
/* 129 */         i1 -= 3;
/* 130 */         int i3 = this.c[paramInt1];
/* 131 */         this.g += i3 * (this.j - i2);
/* 132 */         this.j = i2;
/* 133 */         this.r.c += i1 * -941396361;
/* 134 */         return 2;
/*     */       }
/* 136 */       this.r.c += i1 * -941396361;
/* 137 */       return 3;
/*     */     }
/* 139 */     int k = q[(paramInt2 - 128)];
/* 140 */     int i1 = paramInt2;
/* 141 */     if (k >= 1) i1 |= this.r.t(1118814123) << 8;
/* 142 */     if (k >= 2) i1 |= this.r.t(1118814123) << 16;
/* 143 */     return i1;
/*     */   }
/*     */ 
/*     */   int ad(int paramInt)
/*     */   {
/*  94 */     int k = this.r.m[(this.r.c * -196293817)];
/*  95 */     if (k < 0) {
/*  96 */       k &= 255;
/*  97 */       this.n[paramInt] = k;
/*  98 */       this.r.c += -941396361;
/*     */     }
/*     */     else {
/* 101 */       k = this.n[paramInt];
/*     */     }
/* 103 */     if ((k == 240) || (k == 247)) {
/* 104 */       int i1 = this.r.ak((byte)2);
/* 105 */       if ((k == 247) && (i1 > 0)) {
/* 106 */         int i2 = this.r.m[(this.r.c * -196293817)] & 0xFF;
/* 107 */         if (((i2 >= 241) && (i2 <= 243)) || (i2 == 246) || (i2 == 248) || ((i2 >= 250) && (i2 <= 252)) || (i2 == 254)) {
/* 108 */           this.r.c += -941396361;
/* 109 */           this.n[paramInt] = i2;
/* 110 */           return i(paramInt, i2);
/*     */         }
/*     */       }
/* 113 */       this.r.c += i1 * -941396361;
/* 114 */       return 0;
/*     */     }
/* 116 */     return i(paramInt, k);
/*     */   }
/*     */ 
/*     */   int u()
/*     */   {
/* 151 */     int k = this.m.length;
/* 152 */     int i1 = -1;
/* 153 */     int i2 = 2147483647;
/* 154 */     for (int i3 = 0; i3 < k; i3++) {
/* 155 */       if ((this.m[i3] >= 0) && 
/* 156 */         (this.c[i3] < i2)) {
/* 157 */         i1 = i3;
/* 158 */         i2 = this.c[i3];
/*     */       }
/*     */     }
/* 161 */     return i1;
/*     */   }
/*     */ 
/*     */   int ah()
/*     */   {
/* 151 */     int k = this.m.length;
/* 152 */     int i1 = -1;
/* 153 */     int i2 = 2147483647;
/* 154 */     for (int i3 = 0; i3 < k; i3++) {
/* 155 */       if ((this.m[i3] >= 0) && 
/* 156 */         (this.c[i3] < i2)) {
/* 157 */         i1 = i3;
/* 158 */         i2 = this.c[i3];
/*     */       }
/*     */     }
/* 161 */     return i1;
/*     */   }
/*     */ 
/*     */   boolean al() {
/* 165 */     int k = this.m.length;
/* 166 */     for (int i1 = 0; i1 < k; i1++) if (this.m[i1] >= 0) return false;
/* 167 */     return true;
/*     */   }
/*     */ 
/*     */   boolean ab()
/*     */   {
/* 165 */     int k = this.m.length;
/* 166 */     for (int i1 = 0; i1 < k; i1++) if (this.m[i1] >= 0) return false;
/* 167 */     return true;
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     cs
 * JD-Core Version:    0.6.2
 */