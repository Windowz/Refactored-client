/*     */ public class e
/*     */ {
/*   8 */   static final int[] r = { 256, 128, 86, 64 };
/*   9 */   static final float[] d = { 1.064986E-007F, 1.134195E-007F, 1.207902E-007F, 1.286398E-007F, 1.369995E-007F, 1.459025E-007F, 1.553841E-007F, 1.654818E-007F, 1.762357E-007F, 1.876886E-007F, 1.998856E-007F, 2.128753E-007F, 2.267091E-007F, 2.41442E-007F, 2.571322E-007F, 2.738421E-007F, 2.916379E-007F, 3.105902E-007F, 3.307741E-007F, 3.522697E-007F, 3.751621E-007F, 3.995423E-007F, 4.255068E-007F, 4.531586E-007F, 4.826075E-007F, 5.1397E-007F, 5.473706E-007F, 5.829419E-007F, 6.208247E-007F, 6.611694E-007F, 7.041359E-007F, 7.498946E-007F, 7.98627E-007F, 8.505263E-007F, 9.057983E-007F, 9.646622E-007F, 1.027351E-006F, 1.094114E-006F, 1.165216E-006F, 1.240938E-006F, 1.321582E-006F, 1.407465E-006F, 1.498931E-006F, 1.596339E-006F, 1.700079E-006F, 1.810559E-006F, 1.92822E-006F, 2.053526E-006F, 2.186976E-006F, 2.329098E-006F, 2.480456E-006F, 2.64165E-006F, 2.813319E-006F, 2.996144E-006F, 3.190851E-006F, 3.39821E-006F, 3.619045E-006F, 3.854231E-006F, 4.104701E-006F, 4.371447E-006F, 4.655528E-006F, 4.958071E-006F, 5.280274E-006F, 5.623416E-006F, 5.988857E-006F, 6.378047E-006F, 6.792528E-006F, 7.233945E-006F, 7.704048E-006F, 8.2047E-006F, 8.737888E-006F, 9.305725E-006F, 9.910464E-006F, 1.05545E-005F, 1.124039E-005F, 1.197086E-005F, 1.274879E-005F, 1.357728E-005F, 1.445961E-005F, 1.539927E-005F, 1.640001E-005F, 1.746577E-005F, 1.860079E-005F, 1.980958E-005F, 2.109691E-005F, 2.246791E-005F, 2.3928E-005F, 2.548298E-005F, 2.713901E-005F, 2.890265E-005F, 3.078091E-005F, 3.278123E-005F, 3.491153E-005F, 3.718028E-005F, 3.959647E-005F, 4.216967E-005F, 4.491009E-005F, 4.78286E-005F, 5.093678E-005F, 5.424693E-005F, 5.77722E-005F, 6.152657E-005F, 6.552491E-005F, 6.978308E-005F, 7.431798E-005F, 7.914758E-005F, 8.429104E-005F, 8.976875E-005F, 9.560242E-005F, 0.0001018152F, 0.0001084317F, 0.0001154782F, 0.0001229827F, 0.0001309748F, 0.0001394863F, 0.0001485509F, 0.0001582045F, 0.0001684856F, 0.0001794347F, 0.0001910954F, 0.0002035138F, 0.000216739F, 0.0002308242F, 0.0002458245F, 0.0002617996F, 0.0002788128F, 0.0002969316F, 0.0003162279F, 0.0003367782F, 0.0003586639F, 0.0003819719F, 0.0004067946F, 0.0004332304F, 0.000461384F, 0.0004913675F, 0.0005232993F, 0.0005573062F, 0.0005935231F, 0.0006320936F, 0.0006731706F, 0.000716917F, 0.0007635063F, 0.0008131233F, 0.0008659646F, 0.0009222399F, 0.0009821722F, 0.001045999F, 0.001113974F, 0.001186367F, 0.001263463F, 0.00134557F, 0.001433013F, 0.001526138F, 0.001625315F, 0.001730937F, 0.001843424F, 0.00196322F, 0.002090801F, 0.002226673F, 0.002371374F, 0.00252548F, 0.002689599F, 0.002864385F, 0.003050529F, 0.003248769F, 0.003459893F, 0.003684736F, 0.003924191F, 0.004179207F, 0.004450795F, 0.004740033F, 0.005048067F, 0.005376119F, 0.00572549F, 0.006097564F, 0.006493818F, 0.006915823F, 0.007365251F, 0.007843887F, 0.008353627F, 0.008896492F, 0.00947464F, 0.01009035F, 0.0107461F, 0.01144442F, 0.01218814F, 0.0129802F, 0.01382373F, 0.01472207F, 0.01567879F, 0.01669769F, 0.0177828F, 0.01893842F, 0.02016915F, 0.02147985F, 0.02287574F, 0.02436233F, 0.02594553F, 0.02763162F, 0.02942728F, 0.03133963F, 0.0333763F, 0.03554523F, 0.03785516F, 0.040315F, 0.04293511F, 0.04572528F, 0.04869676F, 0.05186135F, 0.0552316F, 0.05882085F, 0.06264336F, 0.06671428F, 0.0710498F, 0.07566696F, 0.08058423F, 0.08582105F, 0.0913982F, 0.09733775F, 0.103663F, 0.1103999F, 0.1175743F, 0.125215F, 0.1333522F, 0.1420181F, 0.1512473F, 0.1610762F, 0.1715438F, 0.1826917F, 0.194564F, 0.2072079F, 0.2206734F, 0.235014F, 0.2502866F, 0.2665516F, 0.2838736F, 0.3023213F, 0.3219679F, 0.3428911F, 0.3651741F, 0.388905F, 0.4141785F, 0.4410941F, 0.469759F, 0.5002865F, 0.5327979F, 0.5674221F, 0.6042964F, 0.643567F, 0.6853896F, 0.72993F, 0.777365F, 0.8278826F, 0.8816831F, 0.93898F, 1.0F };
/*     */   int m;
/*     */   int[] l;
/*     */   static int[] q;
/*     */   int[] n;
/*     */   int[] j;
/*     */   int[] z;
/*     */   int[][] g;
/*     */   int[] c;
/*     */   static int[] i;
/*     */   static boolean[] s;
/*     */ 
/*     */   boolean o()
/*     */   {
/* 153 */     int k = dt.j() != 0 ? 1 : 0;
/* 154 */     if (k == 0) return false;
/* 155 */     int i1 = this.l.length;
/* 156 */     for (int i2 = 0; i2 < i1; i2++) q[i2] = this.l[i2];
/* 157 */     i2 = r[(this.m - 1)];
/* 158 */     int i3 = az.l(i2 - 1, (byte)42);
/* 159 */     i[0] = dt.z(i3);
/* 160 */     i[1] = dt.z(i3);
/* 161 */     int i4 = 2;
/* 162 */     for (int i5 = 0; i5 < this.c.length; i5++) {
/* 163 */       int i6 = this.c[i5];
/* 164 */       int i7 = this.n[i6];
/* 165 */       int i8 = this.j[i6];
/* 166 */       int i9 = (1 << i8) - 1;
/* 167 */       int i10 = 0;
/* 168 */       if (i8 > 0) i10 = dt.w[this.z[i6]].l();
/* 169 */       for (int i11 = 0; i11 < i7; i11++) {
/* 170 */         int i12 = this.g[i6][(i10 & i9)];
/* 171 */         i10 >>>= i8;
/* 172 */         i[(i4++)] = (i12 >= 0 ? dt.w[i12].l() : 0);
/*     */       }
/*     */     }
/* 175 */     return true;
/*     */   }
/*     */ 
/*     */   static int d(int[] paramArrayOfInt, int paramInt)
/*     */   {
/*  36 */     int k = paramArrayOfInt[paramInt];
/*  37 */     int i1 = -1;
/*  38 */     int i2 = 2147483647;
/*  39 */     for (int i3 = 0; i3 < paramInt; i3++) {
/*  40 */       int i4 = paramArrayOfInt[i3];
/*  41 */       if ((i4 > k) && (i4 < i2)) {
/*  42 */         i1 = i3;
/*  43 */         i2 = i4;
/*     */       }
/*     */     }
/*  46 */     return i1;
/*     */   }
/*     */ 
/*     */   static int q(int[] paramArrayOfInt, int paramInt)
/*     */   {
/*  36 */     int k = paramArrayOfInt[paramInt];
/*  37 */     int i1 = -1;
/*  38 */     int i2 = 2147483647;
/*  39 */     for (int i3 = 0; i3 < paramInt; i3++) {
/*  40 */       int i4 = paramArrayOfInt[i3];
/*  41 */       if ((i4 > k) && (i4 < i2)) {
/*  42 */         i1 = i3;
/*  43 */         i2 = i4;
/*     */       }
/*     */     }
/*  46 */     return i1;
/*     */   }
/*     */ 
/*     */   void m(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat, int paramInt5)
/*     */   {
/*  59 */     int k = paramInt4 - paramInt2;
/*  60 */     int i1 = paramInt3 - paramInt1;
/*  61 */     int i2 = k < 0 ? -k : k;
/*  62 */     int i3 = k / i1;
/*  63 */     int i4 = paramInt2;
/*  64 */     int i5 = 0;
/*  65 */     int i6 = k < 0 ? i3 - 1 : i3 + 1;
/*  66 */     i2 -= (i3 < 0 ? -i3 : i3) * i1;
/*  67 */     paramArrayOfFloat[paramInt1] *= d[i4];
/*  68 */     if (paramInt3 > paramInt5) paramInt3 = paramInt5;
/*  69 */     for (int i7 = paramInt1 + 1; i7 < paramInt3; i7++) {
/*  70 */       i5 += i2;
/*  71 */       if (i5 >= i1) {
/*  72 */         i5 -= i1;
/*  73 */         i4 += i6;
/*     */       }
/*     */       else {
/*  76 */         i4 += i3;
/*     */       }
/*  78 */       paramArrayOfFloat[i7] *= d[i4];
/*     */     }
/*     */   }
/*     */ 
/*     */   int l(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  50 */     int k = paramInt4 - paramInt2;
/*  51 */     int i1 = paramInt3 - paramInt1;
/*  52 */     int i2 = k < 0 ? -k : k;
/*  53 */     int i3 = i2 * (paramInt5 - paramInt1);
/*  54 */     int i4 = i3 / i1;
/*  55 */     return k < 0 ? paramInt2 - i4 : paramInt2 + i4;
/*     */   }
/*     */ 
/*     */   int u(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  50 */     int k = paramInt4 - paramInt2;
/*  51 */     int i1 = paramInt3 - paramInt1;
/*  52 */     int i2 = k < 0 ? -k : k;
/*  53 */     int i3 = i2 * (paramInt5 - paramInt1);
/*  54 */     int i4 = i3 / i1;
/*  55 */     return k < 0 ? paramInt2 - i4 : paramInt2 + i4;
/*     */   }
/*     */ 
/*     */   boolean n()
/*     */   {
/* 153 */     int k = dt.j() != 0 ? 1 : 0;
/* 154 */     if (k == 0) return false;
/* 155 */     int i1 = this.l.length;
/* 156 */     for (int i2 = 0; i2 < i1; i2++) q[i2] = this.l[i2];
/* 157 */     i2 = r[(this.m - 1)];
/* 158 */     int i3 = az.l(i2 - 1, (byte)42);
/* 159 */     i[0] = dt.z(i3);
/* 160 */     i[1] = dt.z(i3);
/* 161 */     int i4 = 2;
/* 162 */     for (int i5 = 0; i5 < this.c.length; i5++) {
/* 163 */       int i6 = this.c[i5];
/* 164 */       int i7 = this.n[i6];
/* 165 */       int i8 = this.j[i6];
/* 166 */       int i9 = (1 << i8) - 1;
/* 167 */       int i10 = 0;
/* 168 */       if (i8 > 0) i10 = dt.w[this.z[i6]].l();
/* 169 */       for (int i11 = 0; i11 < i7; i11++) {
/* 170 */         int i12 = this.g[i6][(i10 & i9)];
/* 171 */         i10 >>>= i8;
/* 172 */         i[(i4++)] = (i12 >= 0 ? dt.w[i12].l() : 0);
/*     */       }
/*     */     }
/* 175 */     return true;
/*     */   }
/*     */ 
/*     */   void j(float[] paramArrayOfFloat, int paramInt) {
/* 179 */     int k = this.l.length;
/* 180 */     int i1 = r[(this.m - 1)];
/* 181 */     boolean[] arrayOfBoolean1 = s;
/* 182 */     s[1] = true;
/* 183 */     arrayOfBoolean1[0] = true;
/*     */     int i6;
/* 184 */     for (int i2 = 2; i2 < k; i2++) {
/* 185 */       i3 = r(q, i2);
/* 186 */       i4 = d(q, i2);
/* 187 */       i5 = l(q[i3], i[i3], q[i4], i[i4], q[i2]);
/* 188 */       i6 = i[i2];
/* 189 */       int i7 = i1 - i5;
/* 190 */       int i8 = i5;
/* 191 */       int i9 = (i7 < i8 ? i7 : i8) << 1;
/* 192 */       if (i6 != 0) {
/* 193 */         boolean[] arrayOfBoolean2 = s;
/* 194 */         int i10 = i3;
/* 195 */         s[i4] = true;
/* 196 */         arrayOfBoolean2[i10] = true;
/* 197 */         s[i2] = true;
/* 198 */         if (i6 >= i9) {
/* 199 */           i[i2] = (i7 > i8 ? i6 - i8 + i5 : i5 - i6 + i7 - 1);
/*     */         }
/*     */         else
/* 202 */           i[i2] = ((i6 & 0x1) != 0 ? i5 - (i6 + 1) / 2 : i5 + i6 / 2);
/*     */       }
/*     */       else
/*     */       {
/* 206 */         s[i2] = false;
/* 207 */         i[i2] = i5;
/*     */       }
/*     */     }
/* 210 */     c(0, k - 1);
/* 211 */     i2 = 0;
/* 212 */     int i3 = i[0] * this.m;
/* 213 */     for (int i4 = 1; i4 < k; i4++) {
/* 214 */       if (s[i4] != 0) {
/* 215 */         i5 = q[i4];
/* 216 */         i6 = i[i4] * this.m;
/* 217 */         m(i2, i3, i5, i6, paramArrayOfFloat, paramInt);
/* 218 */         if (i5 >= paramInt) return;
/* 219 */         i2 = i5;
/* 220 */         i3 = i6;
/*     */       }
/*     */     }
/* 223 */     float f = d[i3];
/* 224 */     for (int i5 = i2; i5 < paramInt; i5++) paramArrayOfFloat[i5] *= f;
/*     */   }
/*     */ 
/*     */   void f(int paramInt1, int paramInt2)
/*     */   {
/*  83 */     if (paramInt1 >= paramInt2) return;
/*  84 */     int k = paramInt1;
/*  85 */     int i1 = q[k];
/*  86 */     int i2 = i[k];
/*  87 */     int i3 = s[k];
/*  88 */     for (int i4 = paramInt1 + 1; i4 <= paramInt2; i4++) {
/*  89 */       int i5 = q[i4];
/*  90 */       if (i5 < i1) {
/*  91 */         q[k] = i5;
/*  92 */         i[k] = i[i4];
/*  93 */         s[k] = s[i4];
/*  94 */         k++;
/*  95 */         q[i4] = q[k];
/*  96 */         i[i4] = i[k];
/*  97 */         s[i4] = s[k];
/*     */       }
/*     */     }
/* 100 */     q[k] = i1;
/* 101 */     i[k] = i2;
/* 102 */     s[k] = i3;
/* 103 */     c(paramInt1, k - 1);
/* 104 */     c(k + 1, paramInt2);
/*     */   }
/*     */ 
/*     */   static int z(int[] paramArrayOfInt, int paramInt)
/*     */   {
/*  22 */     int k = paramArrayOfInt[paramInt];
/*  23 */     int i1 = -1;
/*  24 */     int i2 = -2147483648;
/*  25 */     for (int i3 = 0; i3 < paramInt; i3++) {
/*  26 */       int i4 = paramArrayOfInt[i3];
/*  27 */       if ((i4 < k) && (i4 > i2)) {
/*  28 */         i1 = i3;
/*  29 */         i2 = i4;
/*     */       }
/*     */     }
/*  32 */     return i1;
/*     */   }
/*     */ 
/*     */   static int g(int[] paramArrayOfInt, int paramInt)
/*     */   {
/*  22 */     int k = paramArrayOfInt[paramInt];
/*  23 */     int i1 = -1;
/*  24 */     int i2 = -2147483648;
/*  25 */     for (int i3 = 0; i3 < paramInt; i3++) {
/*  26 */       int i4 = paramArrayOfInt[i3];
/*  27 */       if ((i4 < k) && (i4 > i2)) {
/*  28 */         i1 = i3;
/*  29 */         i2 = i4;
/*     */       }
/*     */     }
/*  32 */     return i1;
/*     */   }
/*     */ 
/*     */   static int i(int[] paramArrayOfInt, int paramInt) {
/*  36 */     int k = paramArrayOfInt[paramInt];
/*  37 */     int i1 = -1;
/*  38 */     int i2 = 2147483647;
/*  39 */     for (int i3 = 0; i3 < paramInt; i3++) {
/*  40 */       int i4 = paramArrayOfInt[i3];
/*  41 */       if ((i4 > k) && (i4 < i2)) {
/*  42 */         i1 = i3;
/*  43 */         i2 = i4;
/*     */       }
/*     */     }
/*  46 */     return i1;
/*     */   }
/*     */ 
/*     */   int s(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*  50 */     int k = paramInt4 - paramInt2;
/*  51 */     int i1 = paramInt3 - paramInt1;
/*  52 */     int i2 = k < 0 ? -k : k;
/*  53 */     int i3 = i2 * (paramInt5 - paramInt1);
/*  54 */     int i4 = i3 / i1;
/*  55 */     return k < 0 ? paramInt2 - i4 : paramInt2 + i4;
/*     */   }
/*     */ 
/*     */   void c(int paramInt1, int paramInt2)
/*     */   {
/*  83 */     if (paramInt1 >= paramInt2) return;
/*  84 */     int k = paramInt1;
/*  85 */     int i1 = q[k];
/*  86 */     int i2 = i[k];
/*  87 */     int i3 = s[k];
/*  88 */     for (int i4 = paramInt1 + 1; i4 <= paramInt2; i4++) {
/*  89 */       int i5 = q[i4];
/*  90 */       if (i5 < i1) {
/*  91 */         q[k] = i5;
/*  92 */         i[k] = i[i4];
/*  93 */         s[k] = s[i4];
/*  94 */         k++;
/*  95 */         q[i4] = q[k];
/*  96 */         i[i4] = i[k];
/*  97 */         s[i4] = s[k];
/*     */       }
/*     */     }
/* 100 */     q[k] = i1;
/* 101 */     i[k] = i2;
/* 102 */     s[k] = i3;
/* 103 */     c(paramInt1, k - 1);
/* 104 */     c(k + 1, paramInt2);
/*     */   }
/*     */ 
/*     */   int v(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  50 */     int k = paramInt4 - paramInt2;
/*  51 */     int i1 = paramInt3 - paramInt1;
/*  52 */     int i2 = k < 0 ? -k : k;
/*  53 */     int i3 = i2 * (paramInt5 - paramInt1);
/*  54 */     int i4 = i3 / i1;
/*  55 */     return k < 0 ? paramInt2 - i4 : paramInt2 + i4;
/*     */   }
/*     */ 
/*     */   int w(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  50 */     int k = paramInt4 - paramInt2;
/*  51 */     int i1 = paramInt3 - paramInt1;
/*  52 */     int i2 = k < 0 ? -k : k;
/*  53 */     int i3 = i2 * (paramInt5 - paramInt1);
/*  54 */     int i4 = i3 / i1;
/*  55 */     return k < 0 ? paramInt2 - i4 : paramInt2 + i4;
/*     */   }
/*     */ 
/*     */   void e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat, int paramInt5) {
/*  59 */     int k = paramInt4 - paramInt2;
/*  60 */     int i1 = paramInt3 - paramInt1;
/*  61 */     int i2 = k < 0 ? -k : k;
/*  62 */     int i3 = k / i1;
/*  63 */     int i4 = paramInt2;
/*  64 */     int i5 = 0;
/*  65 */     int i6 = k < 0 ? i3 - 1 : i3 + 1;
/*  66 */     i2 -= (i3 < 0 ? -i3 : i3) * i1;
/*  67 */     paramArrayOfFloat[paramInt1] *= d[i4];
/*  68 */     if (paramInt3 > paramInt5) paramInt3 = paramInt5;
/*  69 */     for (int i7 = paramInt1 + 1; i7 < paramInt3; i7++) {
/*  70 */       i5 += i2;
/*  71 */       if (i5 >= i1) {
/*  72 */         i5 -= i1;
/*  73 */         i4 += i6;
/*     */       }
/*     */       else {
/*  76 */         i4 += i3;
/*     */       }
/*  78 */       paramArrayOfFloat[i7] *= d[i4];
/*     */     }
/*     */   }
/*     */ 
/*     */   void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat, int paramInt5)
/*     */   {
/*  59 */     int k = paramInt4 - paramInt2;
/*  60 */     int i1 = paramInt3 - paramInt1;
/*  61 */     int i2 = k < 0 ? -k : k;
/*  62 */     int i3 = k / i1;
/*  63 */     int i4 = paramInt2;
/*  64 */     int i5 = 0;
/*  65 */     int i6 = k < 0 ? i3 - 1 : i3 + 1;
/*  66 */     i2 -= (i3 < 0 ? -i3 : i3) * i1;
/*  67 */     paramArrayOfFloat[paramInt1] *= d[i4];
/*  68 */     if (paramInt3 > paramInt5) paramInt3 = paramInt5;
/*  69 */     for (int i7 = paramInt1 + 1; i7 < paramInt3; i7++) {
/*  70 */       i5 += i2;
/*  71 */       if (i5 >= i1) {
/*  72 */         i5 -= i1;
/*  73 */         i4 += i6;
/*     */       }
/*     */       else {
/*  76 */         i4 += i3;
/*     */       }
/*  78 */       paramArrayOfFloat[i7] *= d[i4];
/*     */     }
/*     */   }
/*     */ 
/*     */   static int r(int[] paramArrayOfInt, int paramInt)
/*     */   {
/*  22 */     int k = paramArrayOfInt[paramInt];
/*  23 */     int i1 = -1;
/*  24 */     int i2 = -2147483648;
/*  25 */     for (int i3 = 0; i3 < paramInt; i3++) {
/*  26 */       int i4 = paramArrayOfInt[i3];
/*  27 */       if ((i4 < k) && (i4 > i2)) {
/*  28 */         i1 = i3;
/*  29 */         i2 = i4;
/*     */       }
/*     */     }
/*  32 */     return i1;
/*     */   }
/*     */ 
/*     */   void t(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat, int paramInt5)
/*     */   {
/*  59 */     int k = paramInt4 - paramInt2;
/*  60 */     int i1 = paramInt3 - paramInt1;
/*  61 */     int i2 = k < 0 ? -k : k;
/*  62 */     int i3 = k / i1;
/*  63 */     int i4 = paramInt2;
/*  64 */     int i5 = 0;
/*  65 */     int i6 = k < 0 ? i3 - 1 : i3 + 1;
/*  66 */     i2 -= (i3 < 0 ? -i3 : i3) * i1;
/*  67 */     paramArrayOfFloat[paramInt1] *= d[i4];
/*  68 */     if (paramInt3 > paramInt5) paramInt3 = paramInt5;
/*  69 */     for (int i7 = paramInt1 + 1; i7 < paramInt3; i7++) {
/*  70 */       i5 += i2;
/*  71 */       if (i5 >= i1) {
/*  72 */         i5 -= i1;
/*  73 */         i4 += i6;
/*     */       }
/*     */       else {
/*  76 */         i4 += i3;
/*     */       }
/*  78 */       paramArrayOfFloat[i7] *= d[i4];
/*     */     }
/*     */   }
/*     */ 
/*     */   e()
/*     */   {
/* 108 */     int k = dt.z(16);
/* 109 */     if (k != 1) {
/* 110 */       throw new RuntimeException();
/*     */     }
/* 112 */     int i1 = dt.z(5);
/* 113 */     int i2 = 0;
/* 114 */     this.c = new int[i1];
/* 115 */     for (int i3 = 0; i3 < i1; i3++) {
/* 116 */       i4 = dt.z(4);
/* 117 */       this.c[i3] = i4;
/* 118 */       if (i4 >= i2) i2 = i4 + 1;
/*     */     }
/* 120 */     this.n = new int[i2];
/* 121 */     this.j = new int[i2];
/* 122 */     this.z = new int[i2];
/* 123 */     this.g = new int[i2][];
/*     */     int i6;
/* 124 */     for (i3 = 0; i3 < i2; i3++) {
/* 125 */       this.n[i3] = (dt.z(3) + 1);
/* 126 */       i4 = this.j[i3] = dt.z(2);
/* 127 */       if (i4 != 0) this.z[i3] = dt.z(8);
/* 128 */       i4 = 1 << i4;
/* 129 */       int[] arrayOfInt = new int[i4];
/* 130 */       this.g[i3] = arrayOfInt;
/* 131 */       for (i6 = 0; i6 < i4; i6++) arrayOfInt[i6] = (dt.z(8) - 1);
/*     */     }
/* 133 */     this.m = (dt.z(2) + 1);
/* 134 */     i3 = dt.z(4);
/* 135 */     int i4 = 2;
/* 136 */     for (int i5 = 0; i5 < i1; i5++) i4 += this.n[this.c[i5]];
/* 137 */     this.l = new int[i4];
/* 138 */     this.l[0] = 0;
/* 139 */     this.l[1] = (1 << i3);
/* 140 */     i4 = 2;
/* 141 */     for (i5 = 0; i5 < i1; i5++) {
/* 142 */       i6 = this.c[i5];
/* 143 */       for (int i7 = 0; i7 < this.n[i6]; i7++) this.l[(i4++)] = dt.z(i3);
/*     */     }
/* 145 */     if ((q == null) || (q.length < i4)) {
/* 146 */       q = new int[i4];
/* 147 */       i = new int[i4];
/* 148 */       s = new boolean[i4];
/*     */     }
/*     */   }
/*     */ 
/*     */   void k(int paramInt1, int paramInt2)
/*     */   {
/*  83 */     if (paramInt1 >= paramInt2) return;
/*  84 */     int k = paramInt1;
/*  85 */     int i1 = q[k];
/*  86 */     int i2 = i[k];
/*  87 */     int i3 = s[k];
/*  88 */     for (int i4 = paramInt1 + 1; i4 <= paramInt2; i4++) {
/*  89 */       int i5 = q[i4];
/*  90 */       if (i5 < i1) {
/*  91 */         q[k] = i5;
/*  92 */         i[k] = i[i4];
/*  93 */         s[k] = s[i4];
/*  94 */         k++;
/*  95 */         q[i4] = q[k];
/*  96 */         i[i4] = i[k];
/*  97 */         s[i4] = s[k];
/*     */       }
/*     */     }
/* 100 */     q[k] = i1;
/* 101 */     i[k] = i2;
/* 102 */     s[k] = i3;
/* 103 */     c(paramInt1, k - 1);
/* 104 */     c(k + 1, paramInt2);
/*     */   }
/*     */ 
/*     */   void y(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat, int paramInt5)
/*     */   {
/*  59 */     int k = paramInt4 - paramInt2;
/*  60 */     int i1 = paramInt3 - paramInt1;
/*  61 */     int i2 = k < 0 ? -k : k;
/*  62 */     int i3 = k / i1;
/*  63 */     int i4 = paramInt2;
/*  64 */     int i5 = 0;
/*  65 */     int i6 = k < 0 ? i3 - 1 : i3 + 1;
/*  66 */     i2 -= (i3 < 0 ? -i3 : i3) * i1;
/*  67 */     paramArrayOfFloat[paramInt1] *= d[i4];
/*  68 */     if (paramInt3 > paramInt5) paramInt3 = paramInt5;
/*  69 */     for (int i7 = paramInt1 + 1; i7 < paramInt3; i7++) {
/*  70 */       i5 += i2;
/*  71 */       if (i5 >= i1) {
/*  72 */         i5 -= i1;
/*  73 */         i4 += i6;
/*     */       }
/*     */       else {
/*  76 */         i4 += i3;
/*     */       }
/*  78 */       paramArrayOfFloat[i7] *= d[i4];
/*     */     }
/*     */   }
/*     */ 
/*     */   void a(float[] paramArrayOfFloat, int paramInt)
/*     */   {
/* 179 */     int k = this.l.length;
/* 180 */     int i1 = r[(this.m - 1)];
/* 181 */     boolean[] arrayOfBoolean1 = s;
/* 182 */     s[1] = true;
/* 183 */     arrayOfBoolean1[0] = true;
/*     */     int i6;
/* 184 */     for (int i2 = 2; i2 < k; i2++) {
/* 185 */       i3 = r(q, i2);
/* 186 */       i4 = d(q, i2);
/* 187 */       i5 = l(q[i3], i[i3], q[i4], i[i4], q[i2]);
/* 188 */       i6 = i[i2];
/* 189 */       int i7 = i1 - i5;
/* 190 */       int i8 = i5;
/* 191 */       int i9 = (i7 < i8 ? i7 : i8) << 1;
/* 192 */       if (i6 != 0) {
/* 193 */         boolean[] arrayOfBoolean2 = s;
/* 194 */         int i10 = i3;
/* 195 */         s[i4] = true;
/* 196 */         arrayOfBoolean2[i10] = true;
/* 197 */         s[i2] = true;
/* 198 */         if (i6 >= i9) {
/* 199 */           i[i2] = (i7 > i8 ? i6 - i8 + i5 : i5 - i6 + i7 - 1);
/*     */         }
/*     */         else
/* 202 */           i[i2] = ((i6 & 0x1) != 0 ? i5 - (i6 + 1) / 2 : i5 + i6 / 2);
/*     */       }
/*     */       else
/*     */       {
/* 206 */         s[i2] = false;
/* 207 */         i[i2] = i5;
/*     */       }
/*     */     }
/* 210 */     c(0, k - 1);
/* 211 */     i2 = 0;
/* 212 */     int i3 = i[0] * this.m;
/* 213 */     for (int i4 = 1; i4 < k; i4++) {
/* 214 */       if (s[i4] != 0) {
/* 215 */         i5 = q[i4];
/* 216 */         i6 = i[i4] * this.m;
/* 217 */         m(i2, i3, i5, i6, paramArrayOfFloat, paramInt);
/* 218 */         if (i5 >= paramInt) return;
/* 219 */         i2 = i5;
/* 220 */         i3 = i6;
/*     */       }
/*     */     }
/* 223 */     float f = d[i3];
/* 224 */     for (int i5 = i2; i5 < paramInt; i5++) paramArrayOfFloat[i5] *= f;
/*     */   }
/*     */ 
/*     */   void h(float[] paramArrayOfFloat, int paramInt)
/*     */   {
/* 179 */     int k = this.l.length;
/* 180 */     int i1 = r[(this.m - 1)];
/* 181 */     boolean[] arrayOfBoolean1 = s;
/* 182 */     s[1] = true;
/* 183 */     arrayOfBoolean1[0] = true;
/*     */     int i6;
/* 184 */     for (int i2 = 2; i2 < k; i2++) {
/* 185 */       i3 = r(q, i2);
/* 186 */       i4 = d(q, i2);
/* 187 */       i5 = l(q[i3], i[i3], q[i4], i[i4], q[i2]);
/* 188 */       i6 = i[i2];
/* 189 */       int i7 = i1 - i5;
/* 190 */       int i8 = i5;
/* 191 */       int i9 = (i7 < i8 ? i7 : i8) << 1;
/* 192 */       if (i6 != 0) {
/* 193 */         boolean[] arrayOfBoolean2 = s;
/* 194 */         int i10 = i3;
/* 195 */         s[i4] = true;
/* 196 */         arrayOfBoolean2[i10] = true;
/* 197 */         s[i2] = true;
/* 198 */         if (i6 >= i9) {
/* 199 */           i[i2] = (i7 > i8 ? i6 - i8 + i5 : i5 - i6 + i7 - 1);
/*     */         }
/*     */         else
/* 202 */           i[i2] = ((i6 & 0x1) != 0 ? i5 - (i6 + 1) / 2 : i5 + i6 / 2);
/*     */       }
/*     */       else
/*     */       {
/* 206 */         s[i2] = false;
/* 207 */         i[i2] = i5;
/*     */       }
/*     */     }
/* 210 */     c(0, k - 1);
/* 211 */     i2 = 0;
/* 212 */     int i3 = i[0] * this.m;
/* 213 */     for (int i4 = 1; i4 < k; i4++) {
/* 214 */       if (s[i4] != 0) {
/* 215 */         i5 = q[i4];
/* 216 */         i6 = i[i4] * this.m;
/* 217 */         m(i2, i3, i5, i6, paramArrayOfFloat, paramInt);
/* 218 */         if (i5 >= paramInt) return;
/* 219 */         i2 = i5;
/* 220 */         i3 = i6;
/*     */       }
/*     */     }
/* 223 */     float f = d[i3];
/* 224 */     for (int i5 = i2; i5 < paramInt; i5++) paramArrayOfFloat[i5] *= f;
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     e
 * JD-Core Version:    0.6.2
 */