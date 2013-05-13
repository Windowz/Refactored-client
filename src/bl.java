/*     */ public final class bl
/*     */ {
/*     */   int g;
/*     */   static final int d = 256;
/*     */   static final int l = 1020;
/*     */   int[] j;
/*     */   int[] n;
/*     */   static final int r = 8;
/*     */   int z;
/*     */   int m;
/*     */   int q;
/*     */ 
/*     */   final void d(int paramInt)
/*     */   {
/*  35 */     this.g += (this.q += 1323418813) * -1693285061;
/*  36 */     for (int i = 0; i < 256; i++) { if (paramInt != -806778079) return;
/*  37 */       int k = this.j[i];
/*  38 */       if ((i & 0x2) == 0) { if ((paramInt != -806778079) || 
/*  39 */           (0 == (i & 0x1))) { if (paramInt == -806778079);
/*  39 */           this.z = (1997982597 * (this.z * -974293683 ^ -974293683 * this.z << 13)); } else {
/*  40 */           this.z = (1997982597 * (-974293683 * this.z ^ this.z * -974293683 >>> 6));
/*     */         }
/*     */       }
/*  43 */       else if ((i & 0x1) == 0) { if (paramInt == -806778079);
/*  43 */         this.z = (1997982597 * (-974293683 * this.z ^ this.z * -974293683 << 2)); } else {
/*  44 */         this.z = ((this.z * -974293683 ^ this.z * -974293683 >>> 16) * 1997982597);
/*     */       }
/*  46 */       this.z += this.j[(i + 128 & 0xFF)] * 1997982597;
/*     */       int tmp260_259 = (-1138256273 * this.g + (-974293683 * this.z + this.j[((k & 0x3FC) >> 2)])); int i1 = tmp260_259; this.j[i] = tmp260_259;
/*     */       int tmp291_290 = (-1115125617 * (k + this.j[((i1 >> 8 & 0x3FC) >> 2)])); this.g = tmp291_290; this.n[i] = (tmp291_290 * -1138256273);
/*     */     }
/*     */   }
/*     */ 
/*     */   final int r(int paramInt)
/*     */   {
/*  24 */     if (0 == (this.m -= -475736637) * 644268779 + 1) { if (paramInt <= 1815105691) throw new IllegalStateException();
/*  25 */       d(-806778079);
/*  26 */       this.m = -1053758147;
/*     */     }
/*  28 */     return this.n[(644268779 * this.m)];
/*     */   }
/*     */ 
/*     */   final void q()
/*     */   {
/*  62 */     int i7 = -1640531527;
/*  63 */     int i6 = -1640531527;
/*  64 */     int i5 = -1640531527;
/*  65 */     int i4 = -1640531527;
/*  66 */     int i3 = -1640531527;
/*  67 */     int i2 = -1640531527;
/*  68 */     int i1 = -1640531527;
/*  69 */     int k = -1640531527;
/*  70 */     for (int i = 0; i < 4; i++) {
/*  71 */       k ^= i1 << 11;
/*  72 */       i3 += k;
/*  73 */       i1 += i2;
/*  74 */       i1 ^= i2 >>> 2;
/*  75 */       i4 += i1;
/*  76 */       i2 += i3;
/*  77 */       i2 ^= i3 << 8;
/*  78 */       i5 += i2;
/*  79 */       i3 += i4;
/*  80 */       i3 ^= i4 >>> 16;
/*  81 */       i6 += i3;
/*  82 */       i4 += i5;
/*  83 */       i4 ^= i5 << 10;
/*  84 */       i7 += i4;
/*  85 */       i5 += i6;
/*  86 */       i5 ^= i6 >>> 4;
/*  87 */       k += i5;
/*  88 */       i6 += i7;
/*  89 */       i6 ^= i7 << 8;
/*  90 */       i1 += i6;
/*  91 */       i7 += k;
/*  92 */       i7 ^= k >>> 9;
/*  93 */       i2 += i7;
/*  94 */       k += i1;
/*     */     }
/*  96 */     for (i = 0; i < 256; i += 8) {
/*  97 */       k += this.n[i];
/*  98 */       i1 += this.n[(i + 1)];
/*  99 */       i2 += this.n[(2 + i)];
/* 100 */       i3 += this.n[(3 + i)];
/* 101 */       i4 += this.n[(i + 4)];
/* 102 */       i5 += this.n[(5 + i)];
/* 103 */       i6 += this.n[(6 + i)];
/* 104 */       i7 += this.n[(i + 7)];
/* 105 */       k ^= i1 << 11;
/* 106 */       i3 += k;
/* 107 */       i1 += i2;
/* 108 */       i1 ^= i2 >>> 2;
/* 109 */       i4 += i1;
/* 110 */       i2 += i3;
/* 111 */       i2 ^= i3 << 8;
/* 112 */       i5 += i2;
/* 113 */       i3 += i4;
/* 114 */       i3 ^= i4 >>> 16;
/* 115 */       i6 += i3;
/* 116 */       i4 += i5;
/* 117 */       i4 ^= i5 << 10;
/* 118 */       i7 += i4;
/* 119 */       i5 += i6;
/* 120 */       i5 ^= i6 >>> 4;
/* 121 */       k += i5;
/* 122 */       i6 += i7;
/* 123 */       i6 ^= i7 << 8;
/* 124 */       i1 += i6;
/* 125 */       i7 += k;
/* 126 */       i7 ^= k >>> 9;
/* 127 */       i2 += i7;
/* 128 */       k += i1;
/* 129 */       this.j[i] = k;
/* 130 */       this.j[(1 + i)] = i1;
/* 131 */       this.j[(2 + i)] = i2;
/* 132 */       this.j[(i + 3)] = i3;
/* 133 */       this.j[(i + 4)] = i4;
/* 134 */       this.j[(i + 5)] = i5;
/* 135 */       this.j[(6 + i)] = i6;
/* 136 */       this.j[(i + 7)] = i7;
/*     */     }
/* 138 */     for (i = 0; i < 256; i += 8) {
/* 139 */       k += this.j[i];
/* 140 */       i1 += this.j[(i + 1)];
/* 141 */       i2 += this.j[(2 + i)];
/* 142 */       i3 += this.j[(i + 3)];
/* 143 */       i4 += this.j[(4 + i)];
/* 144 */       i5 += this.j[(5 + i)];
/* 145 */       i6 += this.j[(6 + i)];
/* 146 */       i7 += this.j[(i + 7)];
/* 147 */       k ^= i1 << 11;
/* 148 */       i3 += k;
/* 149 */       i1 += i2;
/* 150 */       i1 ^= i2 >>> 2;
/* 151 */       i4 += i1;
/* 152 */       i2 += i3;
/* 153 */       i2 ^= i3 << 8;
/* 154 */       i5 += i2;
/* 155 */       i3 += i4;
/* 156 */       i3 ^= i4 >>> 16;
/* 157 */       i6 += i3;
/* 158 */       i4 += i5;
/* 159 */       i4 ^= i5 << 10;
/* 160 */       i7 += i4;
/* 161 */       i5 += i6;
/* 162 */       i5 ^= i6 >>> 4;
/* 163 */       k += i5;
/* 164 */       i6 += i7;
/* 165 */       i6 ^= i7 << 8;
/* 166 */       i1 += i6;
/* 167 */       i7 += k;
/* 168 */       i7 ^= k >>> 9;
/* 169 */       i2 += i7;
/* 170 */       k += i1;
/* 171 */       this.j[i] = k;
/* 172 */       this.j[(i + 1)] = i1;
/* 173 */       this.j[(2 + i)] = i2;
/* 174 */       this.j[(3 + i)] = i3;
/* 175 */       this.j[(i + 4)] = i4;
/* 176 */       this.j[(5 + i)] = i5;
/* 177 */       this.j[(i + 6)] = i6;
/* 178 */       this.j[(7 + i)] = i7;
/*     */     }
/* 180 */     d(-806778079);
/* 181 */     this.m = -1529494784;
/*     */   }
/*     */ 
/*     */   final void l(int paramInt)
/*     */   {
/*  62 */     int i7 = -1640531527;
/*  63 */     int i6 = -1640531527;
/*  64 */     int i5 = -1640531527;
/*  65 */     int i4 = -1640531527;
/*  66 */     int i3 = -1640531527;
/*  67 */     int i2 = -1640531527;
/*  68 */     int i1 = -1640531527;
/*  69 */     int k = -1640531527;
/*  70 */     for (int i = 0; i < 4; i++) { if (paramInt != 337286731);
/*  71 */       k ^= i1 << 11;
/*  72 */       i3 += k;
/*  73 */       i1 += i2;
/*  74 */       i1 ^= i2 >>> 2;
/*  75 */       i4 += i1;
/*  76 */       i2 += i3;
/*  77 */       i2 ^= i3 << 8;
/*  78 */       i5 += i2;
/*  79 */       i3 += i4;
/*  80 */       i3 ^= i4 >>> 16;
/*  81 */       i6 += i3;
/*  82 */       i4 += i5;
/*  83 */       i4 ^= i5 << 10;
/*  84 */       i7 += i4;
/*  85 */       i5 += i6;
/*  86 */       i5 ^= i6 >>> 4;
/*  87 */       k += i5;
/*  88 */       i6 += i7;
/*  89 */       i6 ^= i7 << 8;
/*  90 */       i1 += i6;
/*  91 */       i7 += k;
/*  92 */       i7 ^= k >>> 9;
/*  93 */       i2 += i7;
/*  94 */       k += i1;
/*     */     }
/*  96 */     for (i = 0; i < 256; i += 8) { if (paramInt != 337286731);
/*  97 */       k += this.n[i];
/*  98 */       i1 += this.n[(i + 1)];
/*  99 */       i2 += this.n[(2 + i)];
/* 100 */       i3 += this.n[(3 + i)];
/* 101 */       i4 += this.n[(i + 4)];
/* 102 */       i5 += this.n[(5 + i)];
/* 103 */       i6 += this.n[(6 + i)];
/* 104 */       i7 += this.n[(i + 7)];
/* 105 */       k ^= i1 << 11;
/* 106 */       i3 += k;
/* 107 */       i1 += i2;
/* 108 */       i1 ^= i2 >>> 2;
/* 109 */       i4 += i1;
/* 110 */       i2 += i3;
/* 111 */       i2 ^= i3 << 8;
/* 112 */       i5 += i2;
/* 113 */       i3 += i4;
/* 114 */       i3 ^= i4 >>> 16;
/* 115 */       i6 += i3;
/* 116 */       i4 += i5;
/* 117 */       i4 ^= i5 << 10;
/* 118 */       i7 += i4;
/* 119 */       i5 += i6;
/* 120 */       i5 ^= i6 >>> 4;
/* 121 */       k += i5;
/* 122 */       i6 += i7;
/* 123 */       i6 ^= i7 << 8;
/* 124 */       i1 += i6;
/* 125 */       i7 += k;
/* 126 */       i7 ^= k >>> 9;
/* 127 */       i2 += i7;
/* 128 */       k += i1;
/* 129 */       this.j[i] = k;
/* 130 */       this.j[(1 + i)] = i1;
/* 131 */       this.j[(2 + i)] = i2;
/* 132 */       this.j[(i + 3)] = i3;
/* 133 */       this.j[(i + 4)] = i4;
/* 134 */       this.j[(i + 5)] = i5;
/* 135 */       this.j[(6 + i)] = i6;
/* 136 */       this.j[(i + 7)] = i7;
/*     */     }
/* 138 */     for (i = 0; i < 256; i += 8) { if (paramInt == 337286731) return;
/* 139 */       k += this.j[i];
/* 140 */       i1 += this.j[(i + 1)];
/* 141 */       i2 += this.j[(2 + i)];
/* 142 */       i3 += this.j[(i + 3)];
/* 143 */       i4 += this.j[(4 + i)];
/* 144 */       i5 += this.j[(5 + i)];
/* 145 */       i6 += this.j[(6 + i)];
/* 146 */       i7 += this.j[(i + 7)];
/* 147 */       k ^= i1 << 11;
/* 148 */       i3 += k;
/* 149 */       i1 += i2;
/* 150 */       i1 ^= i2 >>> 2;
/* 151 */       i4 += i1;
/* 152 */       i2 += i3;
/* 153 */       i2 ^= i3 << 8;
/* 154 */       i5 += i2;
/* 155 */       i3 += i4;
/* 156 */       i3 ^= i4 >>> 16;
/* 157 */       i6 += i3;
/* 158 */       i4 += i5;
/* 159 */       i4 ^= i5 << 10;
/* 160 */       i7 += i4;
/* 161 */       i5 += i6;
/* 162 */       i5 ^= i6 >>> 4;
/* 163 */       k += i5;
/* 164 */       i6 += i7;
/* 165 */       i6 ^= i7 << 8;
/* 166 */       i1 += i6;
/* 167 */       i7 += k;
/* 168 */       i7 ^= k >>> 9;
/* 169 */       i2 += i7;
/* 170 */       k += i1;
/* 171 */       this.j[i] = k;
/* 172 */       this.j[(i + 1)] = i1;
/* 173 */       this.j[(2 + i)] = i2;
/* 174 */       this.j[(3 + i)] = i3;
/* 175 */       this.j[(i + 4)] = i4;
/* 176 */       this.j[(5 + i)] = i5;
/* 177 */       this.j[(i + 6)] = i6;
/* 178 */       this.j[(7 + i)] = i7;
/*     */     }
/* 180 */     d(-806778079);
/* 181 */     this.m = -1529494784;
/*     */   }
/*     */ 
/*     */   final int m()
/*     */   {
/*  24 */     if (0 == (this.m -= -475736637) * 644268779 + 1) {
/*  25 */       d(-806778079);
/*  26 */       this.m = -1053758147;
/*     */     }
/*  28 */     return this.n[(644268779 * this.m)];
/*     */   }
/*     */ 
/*     */   final int c()
/*     */   {
/*  24 */     if (0 == (this.m -= -475736637) * 644268779 + 1) {
/*  25 */       d(-806778079);
/*  26 */       this.m = -1053758147;
/*     */     }
/*  28 */     return this.n[(644268779 * this.m)];
/*     */   }
/*     */ 
/*     */   final void n()
/*     */   {
/*  35 */     this.g += (this.q += 1323418813) * -1693285061;
/*  36 */     for (int i = 0; i < 256; i++) {
/*  37 */       int k = this.j[i];
/*  38 */       if ((i & 0x2) == 0) {
/*  39 */         if (0 == (i & 0x1)) this.z = (1997982597 * (this.z * -974293683 ^ -974293683 * this.z << 13)); else {
/*  40 */           this.z = (1997982597 * (-974293683 * this.z ^ this.z * -974293683 >>> 6));
/*     */         }
/*     */       }
/*  43 */       else if ((i & 0x1) == 0) this.z = (1997982597 * (-974293683 * this.z ^ this.z * -974293683 << 2)); else {
/*  44 */         this.z = ((this.z * -974293683 ^ this.z * -974293683 >>> 16) * 1997982597);
/*     */       }
/*  46 */       this.z += this.j[(i + 128 & 0xFF)] * 1997982597;
/*     */       int tmp226_225 = (-1138256273 * this.g + (-974293683 * this.z + this.j[((k & 0x3FC) >> 2)])); int i1 = tmp226_225; this.j[i] = tmp226_225;
/*     */       int tmp255_254 = (-1115125617 * (k + this.j[((i1 >> 8 & 0x3FC) >> 2)])); this.g = tmp255_254; this.n[i] = (tmp255_254 * -1138256273);
/*     */     }
/*     */   }
/*     */ 
/*     */   final void j()
/*     */   {
/*  35 */     this.g += (this.q += 1323418813) * -1693285061;
/*  36 */     for (int i = 0; i < 256; i++) {
/*  37 */       int k = this.j[i];
/*  38 */       if ((i & 0x2) == 0) {
/*  39 */         if (0 == (i & 0x1)) this.z = (1997982597 * (this.z * -974293683 ^ -974293683 * this.z << 13)); else {
/*  40 */           this.z = (1997982597 * (-974293683 * this.z ^ this.z * -974293683 >>> 6));
/*     */         }
/*     */       }
/*  43 */       else if ((i & 0x1) == 0) this.z = (1997982597 * (-974293683 * this.z ^ this.z * -974293683 << 2)); else {
/*  44 */         this.z = ((this.z * -974293683 ^ this.z * -974293683 >>> 16) * 1997982597);
/*     */       }
/*  46 */       this.z += this.j[(i + 128 & 0xFF)] * 1997982597;
/*     */       int tmp226_225 = (-1138256273 * this.g + (-974293683 * this.z + this.j[((k & 0x3FC) >> 2)])); int i1 = tmp226_225; this.j[i] = tmp226_225;
/*     */       int tmp255_254 = (-1115125617 * (k + this.j[((i1 >> 8 & 0x3FC) >> 2)])); this.g = tmp255_254; this.n[i] = (tmp255_254 * -1138256273);
/*     */     }
/*     */   }
/*     */ 
/*     */   final void z()
/*     */   {
/*  35 */     this.g += (this.q += 1323418813) * -1693285061;
/*  36 */     for (int i = 0; i < 256; i++) {
/*  37 */       int k = this.j[i];
/*  38 */       if ((i & 0x2) == 0) {
/*  39 */         if (0 == (i & 0x1)) this.z = (1997982597 * (this.z * -974293683 ^ -974293683 * this.z << 13)); else {
/*  40 */           this.z = (1997982597 * (-974293683 * this.z ^ this.z * -974293683 >>> 6));
/*     */         }
/*     */       }
/*  43 */       else if ((i & 0x1) == 0) this.z = (1997982597 * (-974293683 * this.z ^ this.z * -974293683 << 2)); else {
/*  44 */         this.z = ((this.z * -974293683 ^ this.z * -974293683 >>> 16) * 1997982597);
/*     */       }
/*  46 */       this.z += this.j[(i + 128 & 0xFF)] * 1997982597;
/*     */       int tmp226_225 = (-1138256273 * this.g + (-974293683 * this.z + this.j[((k & 0x3FC) >> 2)])); int i1 = tmp226_225; this.j[i] = tmp226_225;
/*     */       int tmp255_254 = (-1115125617 * (k + this.j[((i1 >> 8 & 0x3FC) >> 2)])); this.g = tmp255_254; this.n[i] = (tmp255_254 * -1138256273);
/*     */     }
/*     */   }
/*     */ 
/*     */   final void g()
/*     */   {
/*  62 */     int i7 = -1640531527;
/*  63 */     int i6 = -1640531527;
/*  64 */     int i5 = -1640531527;
/*  65 */     int i4 = -1640531527;
/*  66 */     int i3 = -1640531527;
/*  67 */     int i2 = -1640531527;
/*  68 */     int i1 = -1640531527;
/*  69 */     int k = -1640531527;
/*  70 */     for (int i = 0; i < 4; i++) {
/*  71 */       k ^= i1 << 11;
/*  72 */       i3 += k;
/*  73 */       i1 += i2;
/*  74 */       i1 ^= i2 >>> 2;
/*  75 */       i4 += i1;
/*  76 */       i2 += i3;
/*  77 */       i2 ^= i3 << 8;
/*  78 */       i5 += i2;
/*  79 */       i3 += i4;
/*  80 */       i3 ^= i4 >>> 16;
/*  81 */       i6 += i3;
/*  82 */       i4 += i5;
/*  83 */       i4 ^= i5 << 10;
/*  84 */       i7 += i4;
/*  85 */       i5 += i6;
/*  86 */       i5 ^= i6 >>> 4;
/*  87 */       k += i5;
/*  88 */       i6 += i7;
/*  89 */       i6 ^= i7 << 8;
/*  90 */       i1 += i6;
/*  91 */       i7 += k;
/*  92 */       i7 ^= k >>> 9;
/*  93 */       i2 += i7;
/*  94 */       k += i1;
/*     */     }
/*  96 */     for (i = 0; i < 256; i += 8) {
/*  97 */       k += this.n[i];
/*  98 */       i1 += this.n[(i + 1)];
/*  99 */       i2 += this.n[(2 + i)];
/* 100 */       i3 += this.n[(3 + i)];
/* 101 */       i4 += this.n[(i + 4)];
/* 102 */       i5 += this.n[(5 + i)];
/* 103 */       i6 += this.n[(6 + i)];
/* 104 */       i7 += this.n[(i + 7)];
/* 105 */       k ^= i1 << 11;
/* 106 */       i3 += k;
/* 107 */       i1 += i2;
/* 108 */       i1 ^= i2 >>> 2;
/* 109 */       i4 += i1;
/* 110 */       i2 += i3;
/* 111 */       i2 ^= i3 << 8;
/* 112 */       i5 += i2;
/* 113 */       i3 += i4;
/* 114 */       i3 ^= i4 >>> 16;
/* 115 */       i6 += i3;
/* 116 */       i4 += i5;
/* 117 */       i4 ^= i5 << 10;
/* 118 */       i7 += i4;
/* 119 */       i5 += i6;
/* 120 */       i5 ^= i6 >>> 4;
/* 121 */       k += i5;
/* 122 */       i6 += i7;
/* 123 */       i6 ^= i7 << 8;
/* 124 */       i1 += i6;
/* 125 */       i7 += k;
/* 126 */       i7 ^= k >>> 9;
/* 127 */       i2 += i7;
/* 128 */       k += i1;
/* 129 */       this.j[i] = k;
/* 130 */       this.j[(1 + i)] = i1;
/* 131 */       this.j[(2 + i)] = i2;
/* 132 */       this.j[(i + 3)] = i3;
/* 133 */       this.j[(i + 4)] = i4;
/* 134 */       this.j[(i + 5)] = i5;
/* 135 */       this.j[(6 + i)] = i6;
/* 136 */       this.j[(i + 7)] = i7;
/*     */     }
/* 138 */     for (i = 0; i < 256; i += 8) {
/* 139 */       k += this.j[i];
/* 140 */       i1 += this.j[(i + 1)];
/* 141 */       i2 += this.j[(2 + i)];
/* 142 */       i3 += this.j[(i + 3)];
/* 143 */       i4 += this.j[(4 + i)];
/* 144 */       i5 += this.j[(5 + i)];
/* 145 */       i6 += this.j[(6 + i)];
/* 146 */       i7 += this.j[(i + 7)];
/* 147 */       k ^= i1 << 11;
/* 148 */       i3 += k;
/* 149 */       i1 += i2;
/* 150 */       i1 ^= i2 >>> 2;
/* 151 */       i4 += i1;
/* 152 */       i2 += i3;
/* 153 */       i2 ^= i3 << 8;
/* 154 */       i5 += i2;
/* 155 */       i3 += i4;
/* 156 */       i3 ^= i4 >>> 16;
/* 157 */       i6 += i3;
/* 158 */       i4 += i5;
/* 159 */       i4 ^= i5 << 10;
/* 160 */       i7 += i4;
/* 161 */       i5 += i6;
/* 162 */       i5 ^= i6 >>> 4;
/* 163 */       k += i5;
/* 164 */       i6 += i7;
/* 165 */       i6 ^= i7 << 8;
/* 166 */       i1 += i6;
/* 167 */       i7 += k;
/* 168 */       i7 ^= k >>> 9;
/* 169 */       i2 += i7;
/* 170 */       k += i1;
/* 171 */       this.j[i] = k;
/* 172 */       this.j[(i + 1)] = i1;
/* 173 */       this.j[(2 + i)] = i2;
/* 174 */       this.j[(3 + i)] = i3;
/* 175 */       this.j[(i + 4)] = i4;
/* 176 */       this.j[(5 + i)] = i5;
/* 177 */       this.j[(i + 6)] = i6;
/* 178 */       this.j[(7 + i)] = i7;
/*     */     }
/* 180 */     d(-806778079);
/* 181 */     this.m = -1529494784;
/*     */   }
/*     */ 
/*     */   bl(int[] paramArrayOfInt)
/*     */   {
/*  15 */     this.j = new int[256];
/*  16 */     this.n = new int[256];
/*  17 */     for (int i = 0; i < paramArrayOfInt.length; i++) {
/*  18 */       this.n[i] = paramArrayOfInt[i];
/*     */     }
/*  20 */     l(559417555);
/*     */   }
/*     */ 
/*     */   static byte r(char paramChar, int paramInt)
/*     */   {
/*  12 */     if (paramChar > 0) { if ((paramInt > 1968898558) && (paramChar < '')) break label76; if (paramInt <= 1968898558) throw new IllegalStateException();
/*     */     }
/*  12 */     label76: byte b;
/*  12 */     if (paramChar >= ' ') { if (paramInt <= 1968898558) throw new IllegalStateException(); if (paramChar <= 'ÿ') { if (paramInt <= 1968898558) throw new IllegalStateException(); b = (byte)paramChar; break label754; } }
/*  13 */     if (paramChar == '€') { if (paramInt > 1968898558);
/*  13 */       b = -128;
/*  14 */     } else if ('‚' == paramChar) { if (paramInt <= 1968898558) throw new IllegalStateException(); b = -126;
/*  15 */     } else if (paramChar == 'ƒ') { if (paramInt > 1968898558);
/*  15 */       b = -125;
/*  16 */     } else if ('„' == paramChar) { if (paramInt > 1968898558);
/*  16 */       b = -124;
/*  17 */     } else if ('…' == paramChar) { if (paramInt <= 1968898558) throw new IllegalStateException(); b = -123;
/*  18 */     } else if ('†' == paramChar) { if (paramInt > 1968898558);
/*  18 */       b = -122;
/*  19 */     } else if (paramChar == '‡') { if (paramInt > 1968898558);
/*  19 */       b = -121;
/*  20 */     } else if ('ˆ' == paramChar) { if (paramInt > 1968898558);
/*  20 */       b = -120;
/*  21 */     } else if (paramChar == '‰') { if (paramInt > 1968898558);
/*  21 */       b = -119;
/*  22 */     } else if ('Š' == paramChar) { if (paramInt <= 1968898558) throw new IllegalStateException(); b = -118;
/*  23 */     } else if ('‹' == paramChar) { if (paramInt > 1968898558);
/*  23 */       b = -117;
/*  24 */     } else if ('Œ' == paramChar) { if (paramInt <= 1968898558) throw new IllegalStateException(); b = -116;
/*  25 */     } else if (paramChar == 'Ž') { if (paramInt <= 1968898558) throw new IllegalStateException(); b = -114;
/*  26 */     } else if (paramChar == '‘') { if (paramInt <= 1968898558) throw new IllegalStateException(); b = -111;
/*  27 */     } else if (paramChar == '’') { if (paramInt <= 1968898558) throw new IllegalStateException(); b = -110;
/*  28 */     } else if ('“' == paramChar) { if (paramInt > 1968898558);
/*  28 */       b = -109;
/*  29 */     } else if ('”' == paramChar) { if (paramInt <= 1968898558) throw new IllegalStateException(); b = -108;
/*  30 */     } else if (paramChar == '•') { if (paramInt > 1968898558);
/*  30 */       b = -107;
/*  31 */     } else if ('–' == paramChar) { if (paramInt > 1968898558);
/*  31 */       b = -106;
/*  32 */     } else if ('—' == paramChar) { if (paramInt <= 1968898558) throw new IllegalStateException(); b = -105;
/*  33 */     } else if ('˜' == paramChar) { if (paramInt <= 1968898558) throw new IllegalStateException(); b = -104;
/*  34 */     } else if (paramChar == '™') { if (paramInt <= 1968898558) throw new IllegalStateException(); b = -103;
/*  35 */     } else if (paramChar == 'š') { if (paramInt <= 1968898558) throw new IllegalStateException(); b = -102;
/*  36 */     } else if (paramChar == '›') { if (paramInt <= 1968898558) throw new IllegalStateException(); b = -101;
/*  37 */     } else if ('œ' == paramChar) { if (paramInt > 1968898558);
/*  37 */       b = -100;
/*  38 */     } else if (paramChar == 'ž') { if (paramInt <= 1968898558) throw new IllegalStateException(); b = -98;
/*  39 */     } else if (paramChar == 'Ÿ') { if (paramInt <= 1968898558) throw new IllegalStateException(); b = -97; } else {
/*  40 */       b = 63;
/*  41 */     }label754: return b;
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     bl
 * JD-Core Version:    0.6.2
 */