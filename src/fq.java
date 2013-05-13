/*     */ import java.awt.Component;
/*     */ import java.awt.Image;
/*     */ import java.awt.MediaTracker;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.image.PixelGrabber;
/*     */ 
/*     */ public final class fq extends fv
/*     */ {
/*     */   int b;
/*     */   static final int f = 4;
/*     */   int w;
/*     */   int e;
/*     */   static final int o = 8;
/*     */   public int y;
/*     */   public int t;
/*     */   public int[] u;
/*     */   static final int k = 15;
/*     */   int v;
/*     */   static final int a = 12;
/*     */   static final int h = 4095;
/*     */ 
/*     */   public void ej(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/* 473 */     if ((paramInt3 <= 0) || (paramInt4 <= 0)) return;
/* 474 */     int i = this.v;
/* 475 */     int j = this.w;
/* 476 */     int m = 0;
/* 477 */     int n = 0;
/* 478 */     int i1 = this.y;
/* 479 */     int i2 = this.t;
/* 480 */     int i3 = (i1 << 16) / paramInt3;
/* 481 */     int i4 = (i2 << 16) / paramInt4;
/* 482 */     if (this.e > 0) {
/* 483 */       i5 = ((this.e << 16) + i3 - 1) / i3;
/* 484 */       paramInt1 += i5;
/* 485 */       m += i5 * i3 - (this.e << 16);
/*     */     }
/* 487 */     if (this.b > 0) {
/* 488 */       i5 = ((this.b << 16) + i4 - 1) / i4;
/* 489 */       paramInt2 += i5;
/* 490 */       n += i5 * i4 - (this.b << 16);
/*     */     }
/* 492 */     if (i < i1) paramInt3 = ((i << 16) - m + i3 - 1) / i3;
/* 493 */     if (j < i2) paramInt4 = ((j << 16) - n + i4 - 1) / i4;
/* 494 */     int i5 = paramInt1 + paramInt2 * j;
/* 495 */     int i6 = j - paramInt3;
/* 496 */     if (paramInt2 + paramInt4 > q) paramInt4 -= paramInt2 + paramInt4 - q;
/*     */     int i7;
/* 497 */     if (paramInt2 < g) {
/* 498 */       i7 = g - paramInt2;
/* 499 */       paramInt4 -= i7;
/* 500 */       i5 += i7 * j;
/* 501 */       n += i4 * i7;
/*     */     }
/* 503 */     if (paramInt1 + paramInt3 > s) {
/* 504 */       i7 = paramInt1 + paramInt3 - s;
/* 505 */       paramInt3 -= i7;
/* 506 */       i6 += i7;
/*     */     }
/* 508 */     if (paramInt1 < i) {
/* 509 */       i7 = i - paramInt1;
/* 510 */       paramInt3 -= i7;
/* 511 */       i5 += i7;
/* 512 */       m += i3 * i7;
/* 513 */       i6 += i7;
/*     */     }
/* 515 */     cw(n, this.u, 0, m, n, i5, i6, paramInt3, paramInt4, i3, i4, i, paramInt5);
/*     */   }
/*     */ 
/*     */   public fq(int paramInt1, int paramInt2)
/*     */   {
/*  28 */     this.u = new int[paramInt1 * paramInt2];
/*  29 */     this.v = (this.y = paramInt1);
/*  30 */     this.w = (this.t = paramInt2);
/*  31 */     this.b = 0;
/*  32 */     this.e = 0;
/*     */   }
/*     */ 
/*     */   public void ea(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 598 */     ck(this.y << 3, this.t << 3, paramInt1 << 4, paramInt2 << 4, paramInt3, paramInt4);
/*     */   }
/*     */ 
/*     */   public void du(int paramInt1, int paramInt2)
/*     */   {
/* 235 */     paramInt1 += this.e;
/* 236 */     paramInt2 += this.b;
/* 237 */     int i = paramInt1 + paramInt2 * j;
/* 238 */     int j = 0;
/* 239 */     int m = this.w;
/* 240 */     int n = this.v;
/* 241 */     int i1 = j - n;
/* 242 */     int i2 = 0;
/*     */     int i3;
/* 243 */     if (paramInt2 < g) {
/* 244 */       i3 = g - paramInt2;
/* 245 */       m -= i3;
/* 246 */       paramInt2 = g;
/* 247 */       j += i3 * n;
/* 248 */       i += i3 * j;
/*     */     }
/* 250 */     if (paramInt2 + m > q) m -= paramInt2 + m - q;
/* 251 */     if (paramInt1 < i) {
/* 252 */       i3 = i - paramInt1;
/* 253 */       n -= i3;
/* 254 */       paramInt1 = i;
/* 255 */       j += i3;
/* 256 */       i += i3;
/* 257 */       i2 += i3;
/* 258 */       i1 += i3;
/*     */     }
/* 260 */     if (paramInt1 + n > s) {
/* 261 */       i3 = paramInt1 + n - s;
/* 262 */       n -= i3;
/* 263 */       i2 += i3;
/* 264 */       i1 += i3;
/*     */     }
/* 266 */     if ((n <= 0) || (m <= 0)) return;
/* 267 */     cl(n, this.u, 0, j, i, n, m, i1, i2);
/*     */   }
/*     */ 
/*     */   public void bn()
/*     */   {
/*  69 */     z(this.u, this.v, this.w);
/*     */   }
/*     */ 
/*     */   public void be(int paramInt1, int paramInt2, int paramInt3) {
/*  73 */     for (int i = 0; i < this.u.length; i++) {
/*  74 */       int j = this.u[i];
/*  75 */       if (j != 0) {
/*  76 */         int m = j >> 16 & 0xFF;
/*  77 */         m += paramInt1;
/*  78 */         if (m < 1) m = 1;
/*  79 */         else if (m > 255) m = 255;
/*  80 */         int n = j >> 8 & 0xFF;
/*  81 */         n += paramInt2;
/*  82 */         if (n < 1) n = 1;
/*  83 */         else if (n > 255) n = 255;
/*  84 */         int i1 = j & 0xFF;
/*  85 */         i1 += paramInt3;
/*  86 */         if (i1 < 1) i1 = 1;
/*  87 */         else if (i1 > 255) i1 = 255;
/*  88 */         this.u[i] = ((m << 16) + (n << 8) + i1);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void cp(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 299 */     if ((paramInt3 <= 0) || (paramInt4 <= 0)) return;
/* 300 */     int i = this.v;
/* 301 */     int j = this.w;
/* 302 */     int m = 0;
/* 303 */     int n = 0;
/* 304 */     int i1 = this.y;
/* 305 */     int i2 = this.t;
/* 306 */     int i3 = (i1 << 16) / paramInt3;
/* 307 */     int i4 = (i2 << 16) / paramInt4;
/* 308 */     if (this.e > 0) {
/* 309 */       i5 = ((this.e << 16) + i3 - 1) / i3;
/* 310 */       paramInt1 += i5;
/* 311 */       m += i5 * i3 - (this.e << 16);
/*     */     }
/* 313 */     if (this.b > 0) {
/* 314 */       i5 = ((this.b << 16) + i4 - 1) / i4;
/* 315 */       paramInt2 += i5;
/* 316 */       n += i5 * i4 - (this.b << 16);
/*     */     }
/* 318 */     if (i < i1) paramInt3 = ((i << 16) - m + i3 - 1) / i3;
/* 319 */     if (j < i2) paramInt4 = ((j << 16) - n + i4 - 1) / i4;
/* 320 */     int i5 = paramInt1 + paramInt2 * j;
/* 321 */     int i6 = j - paramInt3;
/* 322 */     if (paramInt2 + paramInt4 > q) paramInt4 -= paramInt2 + paramInt4 - q;
/*     */     int i7;
/* 323 */     if (paramInt2 < g) {
/* 324 */       i7 = g - paramInt2;
/* 325 */       paramInt4 -= i7;
/* 326 */       i5 += i7 * j;
/* 327 */       n += i4 * i7;
/*     */     }
/* 329 */     if (paramInt1 + paramInt3 > s) {
/* 330 */       i7 = paramInt1 + paramInt3 - s;
/* 331 */       paramInt3 -= i7;
/* 332 */       i6 += i7;
/*     */     }
/* 334 */     if (paramInt1 < i) {
/* 335 */       i7 = i - paramInt1;
/* 336 */       paramInt3 -= i7;
/* 337 */       i5 += i7;
/* 338 */       m += i3 * i7;
/* 339 */       i6 += i7;
/*     */     }
/* 341 */     ca(n, this.u, 0, m, n, i5, i6, paramInt3, paramInt4, i3, i4, i);
/*     */   }
/*     */ 
/*     */   public void cv(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, double paramDouble, int paramInt7)
/*     */   {
/*     */     try
/*     */     {
/* 569 */       int i = -paramInt3 / 2;
/* 570 */       int j = -paramInt4 / 2;
/* 571 */       int m = (int)(Math.sin(paramDouble) * 65536.0D);
/* 572 */       int n = (int)(Math.cos(paramDouble) * 65536.0D);
/* 573 */       m = m * paramInt7 >> 8;
/* 574 */       n = n * paramInt7 >> 8;
/* 575 */       int i1 = (paramInt5 << 16) + (j * m + i * n);
/* 576 */       int i2 = (paramInt6 << 16) + (j * n - i * m);
/* 577 */       int i3 = paramInt1 + paramInt2 * j;
/* 578 */       for (paramInt2 = 0; paramInt2 < paramInt4; paramInt2++) {
/* 579 */         int i4 = i3;
/* 580 */         int i5 = i1;
/* 581 */         int i6 = i2;
/* 582 */         for (paramInt1 = -paramInt3; paramInt1 < 0; paramInt1++) {
/* 583 */           int i7 = this.u[((i5 >> 16) + (i6 >> 16) * this.v)];
/* 584 */           if (i7 != 0) n[(i4++)] = i7; else
/* 585 */             i4++;
/* 586 */           i5 += n;
/* 587 */           i6 -= m;
/*     */         }
/* 589 */         i1 += m;
/* 590 */         i2 += n;
/* 591 */         i3 += j;
/*     */       }
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/*     */     }
/*     */   }
/*     */ 
/*     */   public void bc()
/*     */   {
/* 134 */     int[] arrayOfInt = new int[this.v * this.w];
/* 135 */     int i = 0;
/* 136 */     for (int j = 0; j < this.w; j++) {
/* 137 */       for (int m = this.v - 1; m >= 0; m--) arrayOfInt[(i++)] = this.u[(m + j * this.v)];
/*     */     }
/* 139 */     this.u = arrayOfInt;
/* 140 */     this.e = (this.y - this.v - this.e);
/*     */   }
/*     */ 
/*     */   public void cr(int paramInt1, int paramInt2)
/*     */   {
/* 181 */     paramInt1 += this.e;
/* 182 */     paramInt2 += this.b;
/* 183 */     int i = paramInt1 + paramInt2 * j;
/* 184 */     int j = 0;
/* 185 */     int m = this.w;
/* 186 */     int n = this.v;
/* 187 */     int i1 = j - n;
/* 188 */     int i2 = 0;
/*     */     int i3;
/* 189 */     if (paramInt2 < g) {
/* 190 */       i3 = g - paramInt2;
/* 191 */       m -= i3;
/* 192 */       paramInt2 = g;
/* 193 */       j += i3 * n;
/* 194 */       i += i3 * j;
/*     */     }
/* 196 */     if (paramInt2 + m > q) m -= paramInt2 + m - q;
/* 197 */     if (paramInt1 < i) {
/* 198 */       i3 = i - paramInt1;
/* 199 */       n -= i3;
/* 200 */       paramInt1 = i;
/* 201 */       j += i3;
/* 202 */       i += i3;
/* 203 */       i2 += i3;
/* 204 */       i1 += i3;
/*     */     }
/* 206 */     if (paramInt1 + n > s) {
/* 207 */       i3 = paramInt1 + n - s;
/* 208 */       n -= i3;
/* 209 */       i2 += i3;
/* 210 */       i1 += i3;
/*     */     }
/* 212 */     if ((n <= 0) || (m <= 0)) return;
/* 213 */     cs(n, this.u, j, i, n, m, i1, i2);
/*     */   }
/*     */ 
/*     */   public void dd()
/*     */   {
/*  94 */     if ((this.v == this.y) && (this.w == this.t)) return;
/*  95 */     int[] arrayOfInt = new int[this.y * this.t];
/*  96 */     for (int i = 0; i < this.w; i++) {
/*  97 */       for (int j = 0; j < this.v; j++) {
/*  98 */         arrayOfInt[((i + this.b) * this.y + (j + this.e))] = this.u[(i * this.v + j)];
/*     */       }
/*     */     }
/* 101 */     this.u = arrayOfInt;
/* 102 */     this.v = this.y;
/* 103 */     this.w = this.t;
/* 104 */     this.e = 0;
/* 105 */     this.b = 0;
/*     */   }
/*     */ 
/*     */   public void bd(int paramInt)
/*     */   {
/* 172 */     for (int i = this.w - 1; i > 0; i--) {
/* 173 */       int j = i * this.v;
/* 174 */       for (int m = this.v - 1; m > 0; m--)
/* 175 */         if ((this.u[(m + j)] == 0) && (this.u[(m + j - 1 - this.v)] != 0)) this.u[(m + j)] = paramInt;
/*     */     }
/*     */   }
/*     */ 
/*     */   fq()
/*     */   {
/*     */   }
/*     */ 
/*     */   static void cs(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/* 217 */     for (int i = -paramInt4; i < 0; i++) {
/* 218 */       int j = paramInt2 + paramInt3 - 3;
/* 219 */       while (paramInt2 < j) {
/* 220 */         paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(paramInt1++)];
/* 221 */         paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(paramInt1++)];
/* 222 */         paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(paramInt1++)];
/* 223 */         paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(paramInt1++)];
/*     */       }
/* 225 */       j += 3;
/* 226 */       while (paramInt2 < j) {
/* 227 */         paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(paramInt1++)];
/*     */       }
/* 229 */       paramInt2 += paramInt5;
/* 230 */       paramInt1 += paramInt6;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void cj(int paramInt1, int paramInt2) {
/* 235 */     paramInt1 += this.e;
/* 236 */     paramInt2 += this.b;
/* 237 */     int i = paramInt1 + paramInt2 * j;
/* 238 */     int j = 0;
/* 239 */     int m = this.w;
/* 240 */     int n = this.v;
/* 241 */     int i1 = j - n;
/* 242 */     int i2 = 0;
/*     */     int i3;
/* 243 */     if (paramInt2 < g) {
/* 244 */       i3 = g - paramInt2;
/* 245 */       m -= i3;
/* 246 */       paramInt2 = g;
/* 247 */       j += i3 * n;
/* 248 */       i += i3 * j;
/*     */     }
/* 250 */     if (paramInt2 + m > q) m -= paramInt2 + m - q;
/* 251 */     if (paramInt1 < i) {
/* 252 */       i3 = i - paramInt1;
/* 253 */       n -= i3;
/* 254 */       paramInt1 = i;
/* 255 */       j += i3;
/* 256 */       i += i3;
/* 257 */       i2 += i3;
/* 258 */       i1 += i3;
/*     */     }
/* 260 */     if (paramInt1 + n > s) {
/* 261 */       i3 = paramInt1 + n - s;
/* 262 */       n -= i3;
/* 263 */       i2 += i3;
/* 264 */       i1 += i3;
/*     */     }
/* 266 */     if ((n <= 0) || (m <= 0)) return;
/* 267 */     cl(n, this.u, 0, j, i, n, m, i1, i2);
/*     */   }
/*     */ 
/*     */   void em(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/* 602 */     if (paramInt6 == 0) return;
/* 603 */     paramInt1 -= (this.e << 4);
/* 604 */     paramInt2 -= (this.b << 4);
/* 605 */     double d1 = (paramInt5 & 0xFFFF) * 9.587379924285257E-005D;
/* 606 */     int i = (int)Math.floor(Math.sin(d1) * paramInt6 + 0.5D);
/* 607 */     int j = (int)Math.floor(Math.cos(d1) * paramInt6 + 0.5D);
/* 608 */     int m = -paramInt1 * j + -paramInt2 * i;
/* 609 */     int n = --paramInt1 * i + -paramInt2 * j;
/* 610 */     int i1 = ((this.v << 4) - paramInt1) * j + -paramInt2 * i;
/* 611 */     int i2 = -((this.v << 4) - paramInt1) * i + -paramInt2 * j;
/* 612 */     int i3 = -paramInt1 * j + ((this.w << 4) - paramInt2) * i;
/* 613 */     int i4 = --paramInt1 * i + ((this.w << 4) - paramInt2) * j;
/* 614 */     int i5 = ((this.v << 4) - paramInt1) * j + ((this.w << 4) - paramInt2) * i;
/* 615 */     int i6 = -((this.v << 4) - paramInt1) * i + ((this.w << 4) - paramInt2) * j;
/*     */     int i7;
/* 618 */     if (m < i1) {
/* 619 */       i7 = m;
/* 620 */       i8 = i1;
/*     */     }
/*     */     else {
/* 623 */       i7 = i1;
/* 624 */       i8 = m;
/*     */     }
/* 626 */     if (i3 < i7) i7 = i3;
/* 627 */     if (i5 < i7) i7 = i5;
/* 628 */     if (i3 > i8) i8 = i3;
/* 629 */     if (i5 > i8) i8 = i5;
/*     */     int i9;
/* 632 */     if (n < i2) {
/* 633 */       i9 = n;
/* 634 */       i10 = i2;
/*     */     }
/*     */     else {
/* 637 */       i9 = i2;
/* 638 */       i10 = n;
/*     */     }
/* 640 */     if (i4 < i9) i9 = i4;
/* 641 */     if (i6 < i9) i9 = i6;
/* 642 */     if (i4 > i10) i10 = i4;
/* 643 */     if (i6 > i10) i10 = i6;
/* 644 */     i7 >>= 12;
/* 645 */     int i8 = i8 + 4095 >> 12;
/* 646 */     i9 >>= 12;
/* 647 */     int i10 = i10 + 4095 >> 12;
/* 648 */     i7 += paramInt3;
/* 649 */     i8 += paramInt3;
/* 650 */     i9 += paramInt4;
/* 651 */     i10 += paramInt4;
/* 652 */     i7 >>= 4;
/* 653 */     i8 = i8 + 15 >> 4;
/* 654 */     i9 >>= 4;
/* 655 */     i10 = i10 + 15 >> 4;
/* 656 */     if (i7 < i) i7 = i;
/* 657 */     if (i8 > s) i8 = s;
/* 658 */     if (i9 < g) i9 = g;
/* 659 */     if (i10 > q) i10 = q;
/* 660 */     i8 = i7 - i8;
/* 661 */     if (i8 >= 0) return;
/* 662 */     i10 = i9 - i10;
/* 663 */     if (i10 >= 0) return;
/* 664 */     int i11 = i9 * j + i7;
/* 665 */     double d2 = 16777216.0D / paramInt6;
/* 666 */     int i12 = (int)Math.floor(Math.sin(d1) * d2 + 0.5D);
/* 667 */     int i13 = (int)Math.floor(Math.cos(d1) * d2 + 0.5D);
/* 668 */     int i14 = (i7 << 4) + 8 - paramInt3;
/* 669 */     int i15 = (i9 << 4) + 8 - paramInt4;
/* 670 */     int i16 = (paramInt1 << 8) - (i15 * i12 >> 4);
/* 671 */     int i17 = (paramInt2 << 8) + (i15 * i13 >> 4);
/*     */     int i19;
/*     */     int i20;
/*     */     int i21;
/*     */     int i22;
/*     */     int i23;
/*     */     int i24;
/*     */     int i18;
/* 673 */     if (i13 == 0) {
/* 674 */       if (i12 == 0) {
/* 675 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 676 */           i20 = i11;
/* 677 */           i21 = i16;
/* 678 */           i22 = i17;
/* 679 */           i23 = i8;
/* 680 */           if ((i21 >= 0) && 
/* 681 */             (i22 >= 0) && 
/* 682 */             (i21 - (this.v << 12) < 0) && 
/* 683 */             (i22 - (this.w << 12) < 0))
/* 684 */             for (; i23 < 0; i23++) {
/* 685 */               i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 686 */               if (i24 != 0) n[(i20++)] = i24; else
/* 687 */                 i20++;
/*     */             }
/* 675 */           i19++;
/*     */         }
/*     */ 
/*     */       }
/* 691 */       else if (i12 < 0) {
/* 692 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 693 */           i20 = i11;
/* 694 */           i21 = i16;
/* 695 */           i22 = i17 + (i14 * i12 >> 4);
/* 696 */           i23 = i8;
/* 697 */           if ((i21 >= 0) && 
/* 698 */             (i21 - (this.v << 12) < 0)) {
/* 699 */             if ((i18 = i22 - (this.w << 12)) >= 0) {
/* 700 */               i18 = (i12 - i18) / i12;
/* 701 */               i23 += i18;
/* 702 */               i22 += i12 * i18;
/* 703 */               i20 += i18;
/*     */             }
/* 705 */             if ((i18 = (i22 - i12) / i12) > i23);
/* 705 */             for (i23 = i18; 
/* 706 */               i23 < 0; i23++) {
/* 707 */               i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 708 */               if (i24 != 0) n[(i20++)] = i24; else
/* 709 */                 i20++;
/* 710 */               i22 += i12;
/*     */             }
/*     */           }
/* 692 */           i19++; i16 -= i12;
/*     */         }
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/* 715 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 716 */           i20 = i11;
/* 717 */           i21 = i16;
/* 718 */           i22 = i17 + (i14 * i12 >> 4);
/* 719 */           i23 = i8;
/* 720 */           if ((i21 >= 0) && 
/* 721 */             (i21 - (this.v << 12) < 0)) {
/* 722 */             if (i22 < 0) {
/* 723 */               i18 = (i12 - 1 - i22) / i12;
/* 724 */               i23 += i18;
/* 725 */               i22 += i12 * i18;
/* 726 */               i20 += i18;
/*     */             }
/* 728 */             if ((i18 = (1 + i22 - (this.w << 12) - i12) / i12) > i23);
/* 728 */             for (i23 = i18; 
/* 729 */               i23 < 0; i23++) {
/* 730 */               i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 731 */               if (i24 != 0) n[(i20++)] = i24; else
/* 732 */                 i20++;
/* 733 */               i22 += i12;
/*     */             }
/*     */           }
/* 715 */           i19++; i16 -= i12;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/* 738 */     else if (i13 < 0) {
/* 739 */       if (i12 == 0) {
/* 740 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 741 */           i20 = i11;
/* 742 */           i21 = i16 + (i14 * i13 >> 4);
/* 743 */           i22 = i17;
/* 744 */           i23 = i8;
/* 745 */           if ((i22 >= 0) && 
/* 746 */             (i22 - (this.w << 12) < 0)) {
/* 747 */             if ((i18 = i21 - (this.v << 12)) >= 0) {
/* 748 */               i18 = (i13 - i18) / i13;
/* 749 */               i23 += i18;
/* 750 */               i21 += i13 * i18;
/* 751 */               i20 += i18;
/*     */             }
/* 753 */             if ((i18 = (i21 - i13) / i13) > i23);
/* 753 */             for (i23 = i18; 
/* 754 */               i23 < 0; i23++) {
/* 755 */               i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 756 */               if (i24 != 0) n[(i20++)] = i24; else
/* 757 */                 i20++;
/* 758 */               i21 += i13;
/*     */             }
/*     */           }
/* 740 */           i19++; i17 += i13;
/*     */         }
/*     */ 
/*     */       }
/* 762 */       else if (i12 < 0) {
/* 763 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 764 */           i20 = i11;
/* 765 */           i21 = i16 + (i14 * i13 >> 4);
/* 766 */           i22 = i17 + (i14 * i12 >> 4);
/* 767 */           i23 = i8;
/* 768 */           if ((i18 = i21 - (this.v << 12)) >= 0) {
/* 769 */             i18 = (i13 - i18) / i13;
/* 770 */             i23 += i18;
/* 771 */             i21 += i13 * i18;
/* 772 */             i22 += i12 * i18;
/* 773 */             i20 += i18;
/*     */           }
/* 775 */           if ((i18 = (i21 - i13) / i13) > i23) i23 = i18;
/* 776 */           if ((i18 = i22 - (this.w << 12)) >= 0) {
/* 777 */             i18 = (i12 - i18) / i12;
/* 778 */             i23 += i18;
/* 779 */             i21 += i13 * i18;
/* 780 */             i22 += i12 * i18;
/* 781 */             i20 += i18;
/*     */           }
/* 783 */           if ((i18 = (i22 - i12) / i12) > i23);
/* 783 */           for (i23 = i18; 
/* 784 */             i23 < 0; i23++) {
/* 785 */             i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 786 */             if (i24 != 0) n[(i20++)] = i24; else
/* 787 */               i20++;
/* 788 */             i21 += i13;
/* 789 */             i22 += i12;
/*     */           }
/* 763 */           i19++; i16 -= i12; i17 += i13;
/*     */         }
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/* 794 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 795 */           i20 = i11;
/* 796 */           i21 = i16 + (i14 * i13 >> 4);
/* 797 */           i22 = i17 + (i14 * i12 >> 4);
/* 798 */           i23 = i8;
/* 799 */           if ((i18 = i21 - (this.v << 12)) >= 0) {
/* 800 */             i18 = (i13 - i18) / i13;
/* 801 */             i23 += i18;
/* 802 */             i21 += i13 * i18;
/* 803 */             i22 += i12 * i18;
/* 804 */             i20 += i18;
/*     */           }
/* 806 */           if ((i18 = (i21 - i13) / i13) > i23) i23 = i18;
/* 807 */           if (i22 < 0) {
/* 808 */             i18 = (i12 - 1 - i22) / i12;
/* 809 */             i23 += i18;
/* 810 */             i21 += i13 * i18;
/* 811 */             i22 += i12 * i18;
/* 812 */             i20 += i18;
/*     */           }
/* 814 */           if ((i18 = (1 + i22 - (this.w << 12) - i12) / i12) > i23);
/* 814 */           for (i23 = i18; 
/* 815 */             i23 < 0; i23++) {
/* 816 */             i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 817 */             if (i24 != 0) n[(i20++)] = i24; else
/* 818 */               i20++;
/* 819 */             i21 += i13;
/* 820 */             i22 += i12;
/*     */           }
/* 794 */           i19++; i16 -= i12; i17 += i13;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/* 826 */     else if (i12 == 0) {
/* 827 */       for (i19 = i10; i19 < 0; i11 += j) {
/* 828 */         i20 = i11;
/* 829 */         i21 = i16 + (i14 * i13 >> 4);
/* 830 */         i22 = i17;
/* 831 */         i23 = i8;
/* 832 */         if ((i22 >= 0) && 
/* 833 */           (i22 - (this.w << 12) < 0)) {
/* 834 */           if (i21 < 0) {
/* 835 */             i18 = (i13 - 1 - i21) / i13;
/* 836 */             i23 += i18;
/* 837 */             i21 += i13 * i18;
/* 838 */             i20 += i18;
/*     */           }
/* 840 */           if ((i18 = (1 + i21 - (this.v << 12) - i13) / i13) > i23);
/* 840 */           for (i23 = i18; 
/* 841 */             i23 < 0; i23++) {
/* 842 */             i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 843 */             if (i24 != 0) n[(i20++)] = i24; else
/* 844 */               i20++;
/* 845 */             i21 += i13;
/*     */           }
/*     */         }
/* 827 */         i19++; i17 += i13;
/*     */       }
/*     */ 
/*     */     }
/* 849 */     else if (i12 < 0) {
/* 850 */       for (i19 = i10; i19 < 0; i11 += j) {
/* 851 */         i20 = i11;
/* 852 */         i21 = i16 + (i14 * i13 >> 4);
/* 853 */         i22 = i17 + (i14 * i12 >> 4);
/* 854 */         i23 = i8;
/* 855 */         if (i21 < 0) {
/* 856 */           i18 = (i13 - 1 - i21) / i13;
/* 857 */           i23 += i18;
/* 858 */           i21 += i13 * i18;
/* 859 */           i22 += i12 * i18;
/* 860 */           i20 += i18;
/*     */         }
/* 862 */         if ((i18 = (1 + i21 - (this.v << 12) - i13) / i13) > i23) i23 = i18;
/* 863 */         if ((i18 = i22 - (this.w << 12)) >= 0) {
/* 864 */           i18 = (i12 - i18) / i12;
/* 865 */           i23 += i18;
/* 866 */           i21 += i13 * i18;
/* 867 */           i22 += i12 * i18;
/* 868 */           i20 += i18;
/*     */         }
/* 870 */         if ((i18 = (i22 - i12) / i12) > i23);
/* 870 */         for (i23 = i18; 
/* 871 */           i23 < 0; i23++) {
/* 872 */           i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 873 */           if (i24 != 0) n[(i20++)] = i24; else
/* 874 */             i20++;
/* 875 */           i21 += i13;
/* 876 */           i22 += i12;
/*     */         }
/* 850 */         i19++; i16 -= i12; i17 += i13;
/*     */       }
/*     */ 
/*     */     }
/*     */     else
/*     */     {
/* 881 */       for (i19 = i10; i19 < 0; i11 += j) {
/* 882 */         i20 = i11;
/* 883 */         i21 = i16 + (i14 * i13 >> 4);
/* 884 */         i22 = i17 + (i14 * i12 >> 4);
/* 885 */         i23 = i8;
/* 886 */         if (i21 < 0) {
/* 887 */           i18 = (i13 - 1 - i21) / i13;
/* 888 */           i23 += i18;
/* 889 */           i21 += i13 * i18;
/* 890 */           i22 += i12 * i18;
/* 891 */           i20 += i18;
/*     */         }
/* 893 */         if ((i18 = (1 + i21 - (this.v << 12) - i13) / i13) > i23) i23 = i18;
/* 894 */         if (i22 < 0) {
/* 895 */           i18 = (i12 - 1 - i22) / i12;
/* 896 */           i23 += i18;
/* 897 */           i21 += i13 * i18;
/* 898 */           i22 += i12 * i18;
/* 899 */           i20 += i18;
/*     */         }
/* 901 */         if ((i18 = (1 + i22 - (this.w << 12) - i12) / i12) > i23);
/* 901 */         for (i23 = i18; 
/* 902 */           i23 < 0; i23++) {
/* 903 */           i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 904 */           if (i24 != 0) n[(i20++)] = i24; else
/* 905 */             i20++;
/* 906 */           i21 += i13;
/* 907 */           i22 += i12;
/*     */         }
/* 881 */         i19++; i16 -= i12; i17 += i13;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   void ep(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/* 602 */     if (paramInt6 == 0) return;
/* 603 */     paramInt1 -= (this.e << 4);
/* 604 */     paramInt2 -= (this.b << 4);
/* 605 */     double d1 = (paramInt5 & 0xFFFF) * 9.587379924285257E-005D;
/* 606 */     int i = (int)Math.floor(Math.sin(d1) * paramInt6 + 0.5D);
/* 607 */     int j = (int)Math.floor(Math.cos(d1) * paramInt6 + 0.5D);
/* 608 */     int m = -paramInt1 * j + -paramInt2 * i;
/* 609 */     int n = --paramInt1 * i + -paramInt2 * j;
/* 610 */     int i1 = ((this.v << 4) - paramInt1) * j + -paramInt2 * i;
/* 611 */     int i2 = -((this.v << 4) - paramInt1) * i + -paramInt2 * j;
/* 612 */     int i3 = -paramInt1 * j + ((this.w << 4) - paramInt2) * i;
/* 613 */     int i4 = --paramInt1 * i + ((this.w << 4) - paramInt2) * j;
/* 614 */     int i5 = ((this.v << 4) - paramInt1) * j + ((this.w << 4) - paramInt2) * i;
/* 615 */     int i6 = -((this.v << 4) - paramInt1) * i + ((this.w << 4) - paramInt2) * j;
/*     */     int i7;
/* 618 */     if (m < i1) {
/* 619 */       i7 = m;
/* 620 */       i8 = i1;
/*     */     }
/*     */     else {
/* 623 */       i7 = i1;
/* 624 */       i8 = m;
/*     */     }
/* 626 */     if (i3 < i7) i7 = i3;
/* 627 */     if (i5 < i7) i7 = i5;
/* 628 */     if (i3 > i8) i8 = i3;
/* 629 */     if (i5 > i8) i8 = i5;
/*     */     int i9;
/* 632 */     if (n < i2) {
/* 633 */       i9 = n;
/* 634 */       i10 = i2;
/*     */     }
/*     */     else {
/* 637 */       i9 = i2;
/* 638 */       i10 = n;
/*     */     }
/* 640 */     if (i4 < i9) i9 = i4;
/* 641 */     if (i6 < i9) i9 = i6;
/* 642 */     if (i4 > i10) i10 = i4;
/* 643 */     if (i6 > i10) i10 = i6;
/* 644 */     i7 >>= 12;
/* 645 */     int i8 = i8 + 4095 >> 12;
/* 646 */     i9 >>= 12;
/* 647 */     int i10 = i10 + 4095 >> 12;
/* 648 */     i7 += paramInt3;
/* 649 */     i8 += paramInt3;
/* 650 */     i9 += paramInt4;
/* 651 */     i10 += paramInt4;
/* 652 */     i7 >>= 4;
/* 653 */     i8 = i8 + 15 >> 4;
/* 654 */     i9 >>= 4;
/* 655 */     i10 = i10 + 15 >> 4;
/* 656 */     if (i7 < i) i7 = i;
/* 657 */     if (i8 > s) i8 = s;
/* 658 */     if (i9 < g) i9 = g;
/* 659 */     if (i10 > q) i10 = q;
/* 660 */     i8 = i7 - i8;
/* 661 */     if (i8 >= 0) return;
/* 662 */     i10 = i9 - i10;
/* 663 */     if (i10 >= 0) return;
/* 664 */     int i11 = i9 * j + i7;
/* 665 */     double d2 = 16777216.0D / paramInt6;
/* 666 */     int i12 = (int)Math.floor(Math.sin(d1) * d2 + 0.5D);
/* 667 */     int i13 = (int)Math.floor(Math.cos(d1) * d2 + 0.5D);
/* 668 */     int i14 = (i7 << 4) + 8 - paramInt3;
/* 669 */     int i15 = (i9 << 4) + 8 - paramInt4;
/* 670 */     int i16 = (paramInt1 << 8) - (i15 * i12 >> 4);
/* 671 */     int i17 = (paramInt2 << 8) + (i15 * i13 >> 4);
/*     */     int i19;
/*     */     int i20;
/*     */     int i21;
/*     */     int i22;
/*     */     int i23;
/*     */     int i24;
/*     */     int i18;
/* 673 */     if (i13 == 0) {
/* 674 */       if (i12 == 0) {
/* 675 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 676 */           i20 = i11;
/* 677 */           i21 = i16;
/* 678 */           i22 = i17;
/* 679 */           i23 = i8;
/* 680 */           if ((i21 >= 0) && 
/* 681 */             (i22 >= 0) && 
/* 682 */             (i21 - (this.v << 12) < 0) && 
/* 683 */             (i22 - (this.w << 12) < 0))
/* 684 */             for (; i23 < 0; i23++) {
/* 685 */               i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 686 */               if (i24 != 0) n[(i20++)] = i24; else
/* 687 */                 i20++;
/*     */             }
/* 675 */           i19++;
/*     */         }
/*     */ 
/*     */       }
/* 691 */       else if (i12 < 0) {
/* 692 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 693 */           i20 = i11;
/* 694 */           i21 = i16;
/* 695 */           i22 = i17 + (i14 * i12 >> 4);
/* 696 */           i23 = i8;
/* 697 */           if ((i21 >= 0) && 
/* 698 */             (i21 - (this.v << 12) < 0)) {
/* 699 */             if ((i18 = i22 - (this.w << 12)) >= 0) {
/* 700 */               i18 = (i12 - i18) / i12;
/* 701 */               i23 += i18;
/* 702 */               i22 += i12 * i18;
/* 703 */               i20 += i18;
/*     */             }
/* 705 */             if ((i18 = (i22 - i12) / i12) > i23);
/* 705 */             for (i23 = i18; 
/* 706 */               i23 < 0; i23++) {
/* 707 */               i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 708 */               if (i24 != 0) n[(i20++)] = i24; else
/* 709 */                 i20++;
/* 710 */               i22 += i12;
/*     */             }
/*     */           }
/* 692 */           i19++; i16 -= i12;
/*     */         }
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/* 715 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 716 */           i20 = i11;
/* 717 */           i21 = i16;
/* 718 */           i22 = i17 + (i14 * i12 >> 4);
/* 719 */           i23 = i8;
/* 720 */           if ((i21 >= 0) && 
/* 721 */             (i21 - (this.v << 12) < 0)) {
/* 722 */             if (i22 < 0) {
/* 723 */               i18 = (i12 - 1 - i22) / i12;
/* 724 */               i23 += i18;
/* 725 */               i22 += i12 * i18;
/* 726 */               i20 += i18;
/*     */             }
/* 728 */             if ((i18 = (1 + i22 - (this.w << 12) - i12) / i12) > i23);
/* 728 */             for (i23 = i18; 
/* 729 */               i23 < 0; i23++) {
/* 730 */               i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 731 */               if (i24 != 0) n[(i20++)] = i24; else
/* 732 */                 i20++;
/* 733 */               i22 += i12;
/*     */             }
/*     */           }
/* 715 */           i19++; i16 -= i12;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/* 738 */     else if (i13 < 0) {
/* 739 */       if (i12 == 0) {
/* 740 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 741 */           i20 = i11;
/* 742 */           i21 = i16 + (i14 * i13 >> 4);
/* 743 */           i22 = i17;
/* 744 */           i23 = i8;
/* 745 */           if ((i22 >= 0) && 
/* 746 */             (i22 - (this.w << 12) < 0)) {
/* 747 */             if ((i18 = i21 - (this.v << 12)) >= 0) {
/* 748 */               i18 = (i13 - i18) / i13;
/* 749 */               i23 += i18;
/* 750 */               i21 += i13 * i18;
/* 751 */               i20 += i18;
/*     */             }
/* 753 */             if ((i18 = (i21 - i13) / i13) > i23);
/* 753 */             for (i23 = i18; 
/* 754 */               i23 < 0; i23++) {
/* 755 */               i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 756 */               if (i24 != 0) n[(i20++)] = i24; else
/* 757 */                 i20++;
/* 758 */               i21 += i13;
/*     */             }
/*     */           }
/* 740 */           i19++; i17 += i13;
/*     */         }
/*     */ 
/*     */       }
/* 762 */       else if (i12 < 0) {
/* 763 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 764 */           i20 = i11;
/* 765 */           i21 = i16 + (i14 * i13 >> 4);
/* 766 */           i22 = i17 + (i14 * i12 >> 4);
/* 767 */           i23 = i8;
/* 768 */           if ((i18 = i21 - (this.v << 12)) >= 0) {
/* 769 */             i18 = (i13 - i18) / i13;
/* 770 */             i23 += i18;
/* 771 */             i21 += i13 * i18;
/* 772 */             i22 += i12 * i18;
/* 773 */             i20 += i18;
/*     */           }
/* 775 */           if ((i18 = (i21 - i13) / i13) > i23) i23 = i18;
/* 776 */           if ((i18 = i22 - (this.w << 12)) >= 0) {
/* 777 */             i18 = (i12 - i18) / i12;
/* 778 */             i23 += i18;
/* 779 */             i21 += i13 * i18;
/* 780 */             i22 += i12 * i18;
/* 781 */             i20 += i18;
/*     */           }
/* 783 */           if ((i18 = (i22 - i12) / i12) > i23);
/* 783 */           for (i23 = i18; 
/* 784 */             i23 < 0; i23++) {
/* 785 */             i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 786 */             if (i24 != 0) n[(i20++)] = i24; else
/* 787 */               i20++;
/* 788 */             i21 += i13;
/* 789 */             i22 += i12;
/*     */           }
/* 763 */           i19++; i16 -= i12; i17 += i13;
/*     */         }
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/* 794 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 795 */           i20 = i11;
/* 796 */           i21 = i16 + (i14 * i13 >> 4);
/* 797 */           i22 = i17 + (i14 * i12 >> 4);
/* 798 */           i23 = i8;
/* 799 */           if ((i18 = i21 - (this.v << 12)) >= 0) {
/* 800 */             i18 = (i13 - i18) / i13;
/* 801 */             i23 += i18;
/* 802 */             i21 += i13 * i18;
/* 803 */             i22 += i12 * i18;
/* 804 */             i20 += i18;
/*     */           }
/* 806 */           if ((i18 = (i21 - i13) / i13) > i23) i23 = i18;
/* 807 */           if (i22 < 0) {
/* 808 */             i18 = (i12 - 1 - i22) / i12;
/* 809 */             i23 += i18;
/* 810 */             i21 += i13 * i18;
/* 811 */             i22 += i12 * i18;
/* 812 */             i20 += i18;
/*     */           }
/* 814 */           if ((i18 = (1 + i22 - (this.w << 12) - i12) / i12) > i23);
/* 814 */           for (i23 = i18; 
/* 815 */             i23 < 0; i23++) {
/* 816 */             i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 817 */             if (i24 != 0) n[(i20++)] = i24; else
/* 818 */               i20++;
/* 819 */             i21 += i13;
/* 820 */             i22 += i12;
/*     */           }
/* 794 */           i19++; i16 -= i12; i17 += i13;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/* 826 */     else if (i12 == 0) {
/* 827 */       for (i19 = i10; i19 < 0; i11 += j) {
/* 828 */         i20 = i11;
/* 829 */         i21 = i16 + (i14 * i13 >> 4);
/* 830 */         i22 = i17;
/* 831 */         i23 = i8;
/* 832 */         if ((i22 >= 0) && 
/* 833 */           (i22 - (this.w << 12) < 0)) {
/* 834 */           if (i21 < 0) {
/* 835 */             i18 = (i13 - 1 - i21) / i13;
/* 836 */             i23 += i18;
/* 837 */             i21 += i13 * i18;
/* 838 */             i20 += i18;
/*     */           }
/* 840 */           if ((i18 = (1 + i21 - (this.v << 12) - i13) / i13) > i23);
/* 840 */           for (i23 = i18; 
/* 841 */             i23 < 0; i23++) {
/* 842 */             i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 843 */             if (i24 != 0) n[(i20++)] = i24; else
/* 844 */               i20++;
/* 845 */             i21 += i13;
/*     */           }
/*     */         }
/* 827 */         i19++; i17 += i13;
/*     */       }
/*     */ 
/*     */     }
/* 849 */     else if (i12 < 0) {
/* 850 */       for (i19 = i10; i19 < 0; i11 += j) {
/* 851 */         i20 = i11;
/* 852 */         i21 = i16 + (i14 * i13 >> 4);
/* 853 */         i22 = i17 + (i14 * i12 >> 4);
/* 854 */         i23 = i8;
/* 855 */         if (i21 < 0) {
/* 856 */           i18 = (i13 - 1 - i21) / i13;
/* 857 */           i23 += i18;
/* 858 */           i21 += i13 * i18;
/* 859 */           i22 += i12 * i18;
/* 860 */           i20 += i18;
/*     */         }
/* 862 */         if ((i18 = (1 + i21 - (this.v << 12) - i13) / i13) > i23) i23 = i18;
/* 863 */         if ((i18 = i22 - (this.w << 12)) >= 0) {
/* 864 */           i18 = (i12 - i18) / i12;
/* 865 */           i23 += i18;
/* 866 */           i21 += i13 * i18;
/* 867 */           i22 += i12 * i18;
/* 868 */           i20 += i18;
/*     */         }
/* 870 */         if ((i18 = (i22 - i12) / i12) > i23);
/* 870 */         for (i23 = i18; 
/* 871 */           i23 < 0; i23++) {
/* 872 */           i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 873 */           if (i24 != 0) n[(i20++)] = i24; else
/* 874 */             i20++;
/* 875 */           i21 += i13;
/* 876 */           i22 += i12;
/*     */         }
/* 850 */         i19++; i16 -= i12; i17 += i13;
/*     */       }
/*     */ 
/*     */     }
/*     */     else
/*     */     {
/* 881 */       for (i19 = i10; i19 < 0; i11 += j) {
/* 882 */         i20 = i11;
/* 883 */         i21 = i16 + (i14 * i13 >> 4);
/* 884 */         i22 = i17 + (i14 * i12 >> 4);
/* 885 */         i23 = i8;
/* 886 */         if (i21 < 0) {
/* 887 */           i18 = (i13 - 1 - i21) / i13;
/* 888 */           i23 += i18;
/* 889 */           i21 += i13 * i18;
/* 890 */           i22 += i12 * i18;
/* 891 */           i20 += i18;
/*     */         }
/* 893 */         if ((i18 = (1 + i21 - (this.v << 12) - i13) / i13) > i23) i23 = i18;
/* 894 */         if (i22 < 0) {
/* 895 */           i18 = (i12 - 1 - i22) / i12;
/* 896 */           i23 += i18;
/* 897 */           i21 += i13 * i18;
/* 898 */           i22 += i12 * i18;
/* 899 */           i20 += i18;
/*     */         }
/* 901 */         if ((i18 = (1 + i22 - (this.w << 12) - i12) / i12) > i23);
/* 901 */         for (i23 = i18; 
/* 902 */           i23 < 0; i23++) {
/* 903 */           i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 904 */           if (i24 != 0) n[(i20++)] = i24; else
/* 905 */             i20++;
/* 906 */           i21 += i13;
/* 907 */           i22 += i12;
/*     */         }
/* 881 */         i19++; i16 -= i12; i17 += i13;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   static void ca(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/* 345 */     int i = paramInt2;
/* 346 */     for (int j = -paramInt7; j < 0; j++) {
/* 347 */       int m = (paramInt3 >> 16) * paramInt10;
/* 348 */       for (int n = -paramInt6; n < 0; n++) {
/* 349 */         paramInt1 = paramArrayOfInt2[((paramInt2 >> 16) + m)];
/* 350 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt4++)] = paramInt1; else
/* 351 */           paramInt4++;
/* 352 */         paramInt2 += paramInt8;
/*     */       }
/* 354 */       paramInt3 += paramInt9;
/* 355 */       paramInt2 = i;
/* 356 */       paramInt4 += paramInt5;
/*     */     }
/*     */   }
/*     */ 
/*     */   public fq(byte[] paramArrayOfByte, Component paramComponent)
/*     */   {
/*     */     try
/*     */     {
/*  37 */       Image localImage = Toolkit.getDefaultToolkit().createImage(paramArrayOfByte);
/*  38 */       MediaTracker localMediaTracker = new MediaTracker(paramComponent);
/*  39 */       localMediaTracker.addImage(localImage, 0);
/*  40 */       localMediaTracker.waitForAll();
/*  41 */       this.v = localImage.getWidth(paramComponent);
/*  42 */       this.w = localImage.getHeight(paramComponent);
/*  43 */       this.y = this.v;
/*  44 */       this.t = this.w;
/*  45 */       this.e = 0;
/*  46 */       this.b = 0;
/*  47 */       this.u = new int[this.v * this.w];
/*  48 */       PixelGrabber localPixelGrabber = new PixelGrabber(localImage, 0, 0, this.v, this.w, this.u, 0, this.v);
/*  49 */       localPixelGrabber.grabPixels();
/*     */     }
/*     */     catch (InterruptedException localInterruptedException)
/*     */     {
/*     */     }
/*     */   }
/*     */ 
/*     */   static void ch(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/* 401 */     int i = 256 - paramInt8;
/* 402 */     int j = (paramInt9 & 0xFF00FF) * i & 0xFF00FF00;
/* 403 */     int m = (paramInt9 & 0xFF00) * i & 0xFF0000;
/* 404 */     paramInt9 = (j | m) >>> 8;
/* 405 */     for (int n = -paramInt5; n < 0; n++) {
/* 406 */       for (int i1 = -paramInt4; i1 < 0; i1++) {
/* 407 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 408 */         if (paramInt1 != 0) {
/* 409 */           j = (paramInt1 & 0xFF00FF) * paramInt8 & 0xFF00FF00;
/* 410 */           m = (paramInt1 & 0xFF00) * paramInt8 & 0xFF0000;
/* 411 */           paramArrayOfInt1[(paramInt3++)] = (((j | m) >>> 8) + paramInt9);
/*     */         } else {
/* 413 */           paramInt3++;
/*     */         }
/*     */       }
/* 415 */       paramInt3 += paramInt6;
/* 416 */       paramInt2 += paramInt7;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void cu(int paramInt1, int paramInt2, int paramInt3) {
/* 421 */     paramInt1 += this.e;
/* 422 */     paramInt2 += this.b;
/* 423 */     int i = paramInt1 + paramInt2 * j;
/* 424 */     int j = 0;
/* 425 */     int m = this.w;
/* 426 */     int n = this.v;
/* 427 */     int i1 = j - n;
/* 428 */     int i2 = 0;
/*     */     int i3;
/* 429 */     if (paramInt2 < g) {
/* 430 */       i3 = g - paramInt2;
/* 431 */       m -= i3;
/* 432 */       paramInt2 = g;
/* 433 */       j += i3 * n;
/* 434 */       i += i3 * j;
/*     */     }
/* 436 */     if (paramInt2 + m > q) m -= paramInt2 + m - q;
/* 437 */     if (paramInt1 < i) {
/* 438 */       i3 = i - paramInt1;
/* 439 */       n -= i3;
/* 440 */       paramInt1 = i;
/* 441 */       j += i3;
/* 442 */       i += i3;
/* 443 */       i2 += i3;
/* 444 */       i1 += i3;
/*     */     }
/* 446 */     if (paramInt1 + n > s) {
/* 447 */       i3 = paramInt1 + n - s;
/* 448 */       n -= i3;
/* 449 */       i2 += i3;
/* 450 */       i1 += i3;
/*     */     }
/* 452 */     if ((n <= 0) || (m <= 0)) return;
/* 453 */     cc(n, this.u, 0, j, i, n, m, i1, i2, paramInt3);
/*     */   }
/*     */ 
/*     */   static void cc(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
/* 457 */     int i = 256 - paramInt8;
/* 458 */     for (int j = -paramInt5; j < 0; j++) {
/* 459 */       for (int m = -paramInt4; m < 0; m++) {
/* 460 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 461 */         if (paramInt1 != 0) {
/* 462 */           int n = paramArrayOfInt1[paramInt3];
/* 463 */           paramArrayOfInt1[(paramInt3++)] = (((paramInt1 & 0xFF00FF) * paramInt8 + (n & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt1 & 0xFF00) * paramInt8 + (n & 0xFF00) * i & 0xFF0000) >> 8);
/*     */         } else {
/* 465 */           paramInt3++;
/*     */         }
/*     */       }
/* 467 */       paramInt3 += paramInt6;
/* 468 */       paramInt2 += paramInt7;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void cm(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 473 */     if ((paramInt3 <= 0) || (paramInt4 <= 0)) return;
/* 474 */     int i = this.v;
/* 475 */     int j = this.w;
/* 476 */     int m = 0;
/* 477 */     int n = 0;
/* 478 */     int i1 = this.y;
/* 479 */     int i2 = this.t;
/* 480 */     int i3 = (i1 << 16) / paramInt3;
/* 481 */     int i4 = (i2 << 16) / paramInt4;
/* 482 */     if (this.e > 0) {
/* 483 */       i5 = ((this.e << 16) + i3 - 1) / i3;
/* 484 */       paramInt1 += i5;
/* 485 */       m += i5 * i3 - (this.e << 16);
/*     */     }
/* 487 */     if (this.b > 0) {
/* 488 */       i5 = ((this.b << 16) + i4 - 1) / i4;
/* 489 */       paramInt2 += i5;
/* 490 */       n += i5 * i4 - (this.b << 16);
/*     */     }
/* 492 */     if (i < i1) paramInt3 = ((i << 16) - m + i3 - 1) / i3;
/* 493 */     if (j < i2) paramInt4 = ((j << 16) - n + i4 - 1) / i4;
/* 494 */     int i5 = paramInt1 + paramInt2 * j;
/* 495 */     int i6 = j - paramInt3;
/* 496 */     if (paramInt2 + paramInt4 > q) paramInt4 -= paramInt2 + paramInt4 - q;
/*     */     int i7;
/* 497 */     if (paramInt2 < g) {
/* 498 */       i7 = g - paramInt2;
/* 499 */       paramInt4 -= i7;
/* 500 */       i5 += i7 * j;
/* 501 */       n += i4 * i7;
/*     */     }
/* 503 */     if (paramInt1 + paramInt3 > s) {
/* 504 */       i7 = paramInt1 + paramInt3 - s;
/* 505 */       paramInt3 -= i7;
/* 506 */       i6 += i7;
/*     */     }
/* 508 */     if (paramInt1 < i) {
/* 509 */       i7 = i - paramInt1;
/* 510 */       paramInt3 -= i7;
/* 511 */       i5 += i7;
/* 512 */       m += i3 * i7;
/* 513 */       i6 += i7;
/*     */     }
/* 515 */     cw(n, this.u, 0, m, n, i5, i6, paramInt3, paramInt4, i3, i4, i, paramInt5);
/*     */   }
/*     */ 
/*     */   static void cw(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11) {
/* 519 */     int i = 256 - paramInt11;
/* 520 */     int j = paramInt2;
/* 521 */     for (int m = -paramInt7; m < 0; m++) {
/* 522 */       int n = (paramInt3 >> 16) * paramInt10;
/* 523 */       for (int i1 = -paramInt6; i1 < 0; i1++) {
/* 524 */         paramInt1 = paramArrayOfInt2[((paramInt2 >> 16) + n)];
/* 525 */         if (paramInt1 != 0) {
/* 526 */           int i2 = paramArrayOfInt1[paramInt4];
/* 527 */           paramArrayOfInt1[(paramInt4++)] = (((paramInt1 & 0xFF00FF) * paramInt11 + (i2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt1 & 0xFF00) * paramInt11 + (i2 & 0xFF00) * i & 0xFF0000) >> 8);
/*     */         } else {
/* 529 */           paramInt4++;
/* 530 */         }paramInt2 += paramInt8;
/*     */       }
/* 532 */       paramInt3 += paramInt9;
/* 533 */       paramInt2 = j;
/* 534 */       paramInt4 += paramInt5;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void cz(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int[] paramArrayOfInt1, int[] paramArrayOfInt2) {
/*     */     try {
/* 540 */       int i = -paramInt3 / 2;
/* 541 */       int j = -paramInt4 / 2;
/* 542 */       int m = (int)(Math.sin(paramInt7 / 326.11000000000001D) * 65536.0D);
/* 543 */       int n = (int)(Math.cos(paramInt7 / 326.11000000000001D) * 65536.0D);
/* 544 */       m = m * paramInt8 >> 8;
/* 545 */       n = n * paramInt8 >> 8;
/* 546 */       int i1 = (paramInt5 << 16) + (j * m + i * n);
/* 547 */       int i2 = (paramInt6 << 16) + (j * n - i * m);
/* 548 */       int i3 = paramInt1 + paramInt2 * j;
/* 549 */       for (paramInt2 = 0; paramInt2 < paramInt4; paramInt2++) {
/* 550 */         int i4 = paramArrayOfInt1[paramInt2];
/* 551 */         int i5 = i3 + i4;
/* 552 */         int i6 = i1 + n * i4;
/* 553 */         int i7 = i2 - m * i4;
/* 554 */         for (paramInt1 = -paramArrayOfInt2[paramInt2]; paramInt1 < 0; paramInt1++) {
/* 555 */           n[(i5++)] = this.u[((i6 >> 16) + (i7 >> 16) * this.v)];
/* 556 */           i6 += n;
/* 557 */           i7 -= m;
/*     */         }
/* 559 */         i1 += m;
/* 560 */         i2 += n;
/* 561 */         i3 += j;
/*     */       }
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/*     */     }
/*     */   }
/*     */ 
/*     */   public void dp(int paramInt)
/*     */   {
/* 154 */     int[] arrayOfInt = new int[this.v * this.w];
/* 155 */     int i = 0;
/* 156 */     for (int j = 0; j < this.w; j++) {
/* 157 */       for (int m = 0; m < this.v; m++) {
/* 158 */         int n = this.u[i];
/* 159 */         if (n == 0) {
/* 160 */           if ((m > 0) && (this.u[(i - 1)] != 0)) n = paramInt;
/* 161 */           else if ((j > 0) && (this.u[(i - this.v)] != 0)) n = paramInt;
/* 162 */           else if ((m < this.v - 1) && (this.u[(i + 1)] != 0)) n = paramInt;
/* 163 */           else if ((j < this.w - 1) && (this.u[(i + this.v)] != 0)) n = paramInt;
/*     */         }
/* 165 */         arrayOfInt[(i++)] = n;
/*     */       }
/*     */     }
/* 168 */     this.u = arrayOfInt;
/*     */   }
/*     */ 
/*     */   public void ey(ft paramft, int paramInt1, int paramInt2)
/*     */   {
/* 915 */     if ((s - i != paramft.w) || (q - g != paramft.e)) throw new IllegalStateException();
/* 916 */     paramInt1 += this.e;
/* 917 */     paramInt2 += this.b;
/* 918 */     int i = paramInt1 + paramInt2 * j;
/* 919 */     int j = 0;
/* 920 */     int m = this.w;
/* 921 */     int n = this.v;
/* 922 */     int i1 = j - n;
/* 923 */     int i2 = 0;
/* 924 */     if (paramInt2 < g) {
/* 925 */       i3 = g - paramInt2;
/* 926 */       m -= i3;
/* 927 */       paramInt2 = g;
/* 928 */       j += i3 * n;
/* 929 */       i += i3 * j;
/*     */     }
/* 931 */     if (paramInt2 + m > q) m -= paramInt2 + m - q;
/* 932 */     if (paramInt1 < i) {
/* 933 */       i3 = i - paramInt1;
/* 934 */       n -= i3;
/* 935 */       paramInt1 = i;
/* 936 */       j += i3;
/* 937 */       i += i3;
/* 938 */       i2 += i3;
/* 939 */       i1 += i3;
/*     */     }
/* 941 */     if (paramInt1 + n > s) {
/* 942 */       i3 = paramInt1 + n - s;
/* 943 */       n -= i3;
/* 944 */       i2 += i3;
/* 945 */       i1 += i3;
/*     */     }
/* 947 */     if ((n <= 0) || (m <= 0)) return;
/* 948 */     int i3 = paramInt1 - i + (paramInt2 - g) * paramft.w;
/* 949 */     int i4 = paramft.w - n;
/* 950 */     cq(n, this.u, 0, j, i, i3, n, m, i1, i2, i4, paramft.u);
/*     */   }
/*     */ 
/*     */   void ck(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/* 602 */     if (paramInt6 == 0) return;
/* 603 */     paramInt1 -= (this.e << 4);
/* 604 */     paramInt2 -= (this.b << 4);
/* 605 */     double d1 = (paramInt5 & 0xFFFF) * 9.587379924285257E-005D;
/* 606 */     int i = (int)Math.floor(Math.sin(d1) * paramInt6 + 0.5D);
/* 607 */     int j = (int)Math.floor(Math.cos(d1) * paramInt6 + 0.5D);
/* 608 */     int m = -paramInt1 * j + -paramInt2 * i;
/* 609 */     int n = --paramInt1 * i + -paramInt2 * j;
/* 610 */     int i1 = ((this.v << 4) - paramInt1) * j + -paramInt2 * i;
/* 611 */     int i2 = -((this.v << 4) - paramInt1) * i + -paramInt2 * j;
/* 612 */     int i3 = -paramInt1 * j + ((this.w << 4) - paramInt2) * i;
/* 613 */     int i4 = --paramInt1 * i + ((this.w << 4) - paramInt2) * j;
/* 614 */     int i5 = ((this.v << 4) - paramInt1) * j + ((this.w << 4) - paramInt2) * i;
/* 615 */     int i6 = -((this.v << 4) - paramInt1) * i + ((this.w << 4) - paramInt2) * j;
/*     */     int i7;
/* 618 */     if (m < i1) {
/* 619 */       i7 = m;
/* 620 */       i8 = i1;
/*     */     }
/*     */     else {
/* 623 */       i7 = i1;
/* 624 */       i8 = m;
/*     */     }
/* 626 */     if (i3 < i7) i7 = i3;
/* 627 */     if (i5 < i7) i7 = i5;
/* 628 */     if (i3 > i8) i8 = i3;
/* 629 */     if (i5 > i8) i8 = i5;
/*     */     int i9;
/* 632 */     if (n < i2) {
/* 633 */       i9 = n;
/* 634 */       i10 = i2;
/*     */     }
/*     */     else {
/* 637 */       i9 = i2;
/* 638 */       i10 = n;
/*     */     }
/* 640 */     if (i4 < i9) i9 = i4;
/* 641 */     if (i6 < i9) i9 = i6;
/* 642 */     if (i4 > i10) i10 = i4;
/* 643 */     if (i6 > i10) i10 = i6;
/* 644 */     i7 >>= 12;
/* 645 */     int i8 = i8 + 4095 >> 12;
/* 646 */     i9 >>= 12;
/* 647 */     int i10 = i10 + 4095 >> 12;
/* 648 */     i7 += paramInt3;
/* 649 */     i8 += paramInt3;
/* 650 */     i9 += paramInt4;
/* 651 */     i10 += paramInt4;
/* 652 */     i7 >>= 4;
/* 653 */     i8 = i8 + 15 >> 4;
/* 654 */     i9 >>= 4;
/* 655 */     i10 = i10 + 15 >> 4;
/* 656 */     if (i7 < i) i7 = i;
/* 657 */     if (i8 > s) i8 = s;
/* 658 */     if (i9 < g) i9 = g;
/* 659 */     if (i10 > q) i10 = q;
/* 660 */     i8 = i7 - i8;
/* 661 */     if (i8 >= 0) return;
/* 662 */     i10 = i9 - i10;
/* 663 */     if (i10 >= 0) return;
/* 664 */     int i11 = i9 * j + i7;
/* 665 */     double d2 = 16777216.0D / paramInt6;
/* 666 */     int i12 = (int)Math.floor(Math.sin(d1) * d2 + 0.5D);
/* 667 */     int i13 = (int)Math.floor(Math.cos(d1) * d2 + 0.5D);
/* 668 */     int i14 = (i7 << 4) + 8 - paramInt3;
/* 669 */     int i15 = (i9 << 4) + 8 - paramInt4;
/* 670 */     int i16 = (paramInt1 << 8) - (i15 * i12 >> 4);
/* 671 */     int i17 = (paramInt2 << 8) + (i15 * i13 >> 4);
/*     */     int i19;
/*     */     int i20;
/*     */     int i21;
/*     */     int i22;
/*     */     int i23;
/*     */     int i24;
/*     */     int i18;
/* 673 */     if (i13 == 0) {
/* 674 */       if (i12 == 0) {
/* 675 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 676 */           i20 = i11;
/* 677 */           i21 = i16;
/* 678 */           i22 = i17;
/* 679 */           i23 = i8;
/* 680 */           if ((i21 >= 0) && 
/* 681 */             (i22 >= 0) && 
/* 682 */             (i21 - (this.v << 12) < 0) && 
/* 683 */             (i22 - (this.w << 12) < 0))
/* 684 */             for (; i23 < 0; i23++) {
/* 685 */               i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 686 */               if (i24 != 0) n[(i20++)] = i24; else
/* 687 */                 i20++;
/*     */             }
/* 675 */           i19++;
/*     */         }
/*     */ 
/*     */       }
/* 691 */       else if (i12 < 0) {
/* 692 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 693 */           i20 = i11;
/* 694 */           i21 = i16;
/* 695 */           i22 = i17 + (i14 * i12 >> 4);
/* 696 */           i23 = i8;
/* 697 */           if ((i21 >= 0) && 
/* 698 */             (i21 - (this.v << 12) < 0)) {
/* 699 */             if ((i18 = i22 - (this.w << 12)) >= 0) {
/* 700 */               i18 = (i12 - i18) / i12;
/* 701 */               i23 += i18;
/* 702 */               i22 += i12 * i18;
/* 703 */               i20 += i18;
/*     */             }
/* 705 */             if ((i18 = (i22 - i12) / i12) > i23);
/* 705 */             for (i23 = i18; 
/* 706 */               i23 < 0; i23++) {
/* 707 */               i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 708 */               if (i24 != 0) n[(i20++)] = i24; else
/* 709 */                 i20++;
/* 710 */               i22 += i12;
/*     */             }
/*     */           }
/* 692 */           i19++; i16 -= i12;
/*     */         }
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/* 715 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 716 */           i20 = i11;
/* 717 */           i21 = i16;
/* 718 */           i22 = i17 + (i14 * i12 >> 4);
/* 719 */           i23 = i8;
/* 720 */           if ((i21 >= 0) && 
/* 721 */             (i21 - (this.v << 12) < 0)) {
/* 722 */             if (i22 < 0) {
/* 723 */               i18 = (i12 - 1 - i22) / i12;
/* 724 */               i23 += i18;
/* 725 */               i22 += i12 * i18;
/* 726 */               i20 += i18;
/*     */             }
/* 728 */             if ((i18 = (1 + i22 - (this.w << 12) - i12) / i12) > i23);
/* 728 */             for (i23 = i18; 
/* 729 */               i23 < 0; i23++) {
/* 730 */               i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 731 */               if (i24 != 0) n[(i20++)] = i24; else
/* 732 */                 i20++;
/* 733 */               i22 += i12;
/*     */             }
/*     */           }
/* 715 */           i19++; i16 -= i12;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/* 738 */     else if (i13 < 0) {
/* 739 */       if (i12 == 0) {
/* 740 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 741 */           i20 = i11;
/* 742 */           i21 = i16 + (i14 * i13 >> 4);
/* 743 */           i22 = i17;
/* 744 */           i23 = i8;
/* 745 */           if ((i22 >= 0) && 
/* 746 */             (i22 - (this.w << 12) < 0)) {
/* 747 */             if ((i18 = i21 - (this.v << 12)) >= 0) {
/* 748 */               i18 = (i13 - i18) / i13;
/* 749 */               i23 += i18;
/* 750 */               i21 += i13 * i18;
/* 751 */               i20 += i18;
/*     */             }
/* 753 */             if ((i18 = (i21 - i13) / i13) > i23);
/* 753 */             for (i23 = i18; 
/* 754 */               i23 < 0; i23++) {
/* 755 */               i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 756 */               if (i24 != 0) n[(i20++)] = i24; else
/* 757 */                 i20++;
/* 758 */               i21 += i13;
/*     */             }
/*     */           }
/* 740 */           i19++; i17 += i13;
/*     */         }
/*     */ 
/*     */       }
/* 762 */       else if (i12 < 0) {
/* 763 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 764 */           i20 = i11;
/* 765 */           i21 = i16 + (i14 * i13 >> 4);
/* 766 */           i22 = i17 + (i14 * i12 >> 4);
/* 767 */           i23 = i8;
/* 768 */           if ((i18 = i21 - (this.v << 12)) >= 0) {
/* 769 */             i18 = (i13 - i18) / i13;
/* 770 */             i23 += i18;
/* 771 */             i21 += i13 * i18;
/* 772 */             i22 += i12 * i18;
/* 773 */             i20 += i18;
/*     */           }
/* 775 */           if ((i18 = (i21 - i13) / i13) > i23) i23 = i18;
/* 776 */           if ((i18 = i22 - (this.w << 12)) >= 0) {
/* 777 */             i18 = (i12 - i18) / i12;
/* 778 */             i23 += i18;
/* 779 */             i21 += i13 * i18;
/* 780 */             i22 += i12 * i18;
/* 781 */             i20 += i18;
/*     */           }
/* 783 */           if ((i18 = (i22 - i12) / i12) > i23);
/* 783 */           for (i23 = i18; 
/* 784 */             i23 < 0; i23++) {
/* 785 */             i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 786 */             if (i24 != 0) n[(i20++)] = i24; else
/* 787 */               i20++;
/* 788 */             i21 += i13;
/* 789 */             i22 += i12;
/*     */           }
/* 763 */           i19++; i16 -= i12; i17 += i13;
/*     */         }
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/* 794 */         for (i19 = i10; i19 < 0; i11 += j) {
/* 795 */           i20 = i11;
/* 796 */           i21 = i16 + (i14 * i13 >> 4);
/* 797 */           i22 = i17 + (i14 * i12 >> 4);
/* 798 */           i23 = i8;
/* 799 */           if ((i18 = i21 - (this.v << 12)) >= 0) {
/* 800 */             i18 = (i13 - i18) / i13;
/* 801 */             i23 += i18;
/* 802 */             i21 += i13 * i18;
/* 803 */             i22 += i12 * i18;
/* 804 */             i20 += i18;
/*     */           }
/* 806 */           if ((i18 = (i21 - i13) / i13) > i23) i23 = i18;
/* 807 */           if (i22 < 0) {
/* 808 */             i18 = (i12 - 1 - i22) / i12;
/* 809 */             i23 += i18;
/* 810 */             i21 += i13 * i18;
/* 811 */             i22 += i12 * i18;
/* 812 */             i20 += i18;
/*     */           }
/* 814 */           if ((i18 = (1 + i22 - (this.w << 12) - i12) / i12) > i23);
/* 814 */           for (i23 = i18; 
/* 815 */             i23 < 0; i23++) {
/* 816 */             i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 817 */             if (i24 != 0) n[(i20++)] = i24; else
/* 818 */               i20++;
/* 819 */             i21 += i13;
/* 820 */             i22 += i12;
/*     */           }
/* 794 */           i19++; i16 -= i12; i17 += i13;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/* 826 */     else if (i12 == 0) {
/* 827 */       for (i19 = i10; i19 < 0; i11 += j) {
/* 828 */         i20 = i11;
/* 829 */         i21 = i16 + (i14 * i13 >> 4);
/* 830 */         i22 = i17;
/* 831 */         i23 = i8;
/* 832 */         if ((i22 >= 0) && 
/* 833 */           (i22 - (this.w << 12) < 0)) {
/* 834 */           if (i21 < 0) {
/* 835 */             i18 = (i13 - 1 - i21) / i13;
/* 836 */             i23 += i18;
/* 837 */             i21 += i13 * i18;
/* 838 */             i20 += i18;
/*     */           }
/* 840 */           if ((i18 = (1 + i21 - (this.v << 12) - i13) / i13) > i23);
/* 840 */           for (i23 = i18; 
/* 841 */             i23 < 0; i23++) {
/* 842 */             i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 843 */             if (i24 != 0) n[(i20++)] = i24; else
/* 844 */               i20++;
/* 845 */             i21 += i13;
/*     */           }
/*     */         }
/* 827 */         i19++; i17 += i13;
/*     */       }
/*     */ 
/*     */     }
/* 849 */     else if (i12 < 0) {
/* 850 */       for (i19 = i10; i19 < 0; i11 += j) {
/* 851 */         i20 = i11;
/* 852 */         i21 = i16 + (i14 * i13 >> 4);
/* 853 */         i22 = i17 + (i14 * i12 >> 4);
/* 854 */         i23 = i8;
/* 855 */         if (i21 < 0) {
/* 856 */           i18 = (i13 - 1 - i21) / i13;
/* 857 */           i23 += i18;
/* 858 */           i21 += i13 * i18;
/* 859 */           i22 += i12 * i18;
/* 860 */           i20 += i18;
/*     */         }
/* 862 */         if ((i18 = (1 + i21 - (this.v << 12) - i13) / i13) > i23) i23 = i18;
/* 863 */         if ((i18 = i22 - (this.w << 12)) >= 0) {
/* 864 */           i18 = (i12 - i18) / i12;
/* 865 */           i23 += i18;
/* 866 */           i21 += i13 * i18;
/* 867 */           i22 += i12 * i18;
/* 868 */           i20 += i18;
/*     */         }
/* 870 */         if ((i18 = (i22 - i12) / i12) > i23);
/* 870 */         for (i23 = i18; 
/* 871 */           i23 < 0; i23++) {
/* 872 */           i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 873 */           if (i24 != 0) n[(i20++)] = i24; else
/* 874 */             i20++;
/* 875 */           i21 += i13;
/* 876 */           i22 += i12;
/*     */         }
/* 850 */         i19++; i16 -= i12; i17 += i13;
/*     */       }
/*     */ 
/*     */     }
/*     */     else
/*     */     {
/* 881 */       for (i19 = i10; i19 < 0; i11 += j) {
/* 882 */         i20 = i11;
/* 883 */         i21 = i16 + (i14 * i13 >> 4);
/* 884 */         i22 = i17 + (i14 * i12 >> 4);
/* 885 */         i23 = i8;
/* 886 */         if (i21 < 0) {
/* 887 */           i18 = (i13 - 1 - i21) / i13;
/* 888 */           i23 += i18;
/* 889 */           i21 += i13 * i18;
/* 890 */           i22 += i12 * i18;
/* 891 */           i20 += i18;
/*     */         }
/* 893 */         if ((i18 = (1 + i21 - (this.v << 12) - i13) / i13) > i23) i23 = i18;
/* 894 */         if (i22 < 0) {
/* 895 */           i18 = (i12 - 1 - i22) / i12;
/* 896 */           i23 += i18;
/* 897 */           i21 += i13 * i18;
/* 898 */           i22 += i12 * i18;
/* 899 */           i20 += i18;
/*     */         }
/* 901 */         if ((i18 = (1 + i22 - (this.w << 12) - i12) / i12) > i23);
/* 901 */         for (i23 = i18; 
/* 902 */           i23 < 0; i23++) {
/* 903 */           i24 = this.u[((i22 >> 12) * this.v + (i21 >> 12))];
/* 904 */           if (i24 != 0) n[(i20++)] = i24; else
/* 905 */             i20++;
/* 906 */           i21 += i13;
/* 907 */           i22 += i12;
/*     */         }
/* 881 */         i19++; i16 -= i12; i17 += i13;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void cn()
/*     */   {
/*  69 */     z(this.u, this.v, this.w);
/*     */   }
/*     */ 
/*     */   public void ct(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 598 */     ck(this.y << 3, this.t << 3, paramInt1 << 4, paramInt2 << 4, paramInt3, paramInt4);
/*     */   }
/*     */ 
/*     */   public fq cd()
/*     */   {
/*  55 */     fq localfq = new fq(this.v, this.w);
/*  56 */     localfq.y = this.y;
/*  57 */     localfq.t = this.t;
/*  58 */     localfq.e = (this.y - this.v - this.e);
/*  59 */     localfq.b = this.b;
/*  60 */     for (int i = 0; i < this.w; i++) {
/*  61 */       for (int j = 0; j < this.v; j++) {
/*  62 */         localfq.u[(i * this.v + j)] = this.u[(i * this.v + this.v - 1 - j)];
/*     */       }
/*     */     }
/*  65 */     return localfq;
/*     */   }
/*     */ 
/*     */   public fq cx()
/*     */   {
/*  55 */     fq localfq = new fq(this.v, this.w);
/*  56 */     localfq.y = this.y;
/*  57 */     localfq.t = this.t;
/*  58 */     localfq.e = (this.y - this.v - this.e);
/*  59 */     localfq.b = this.b;
/*  60 */     for (int i = 0; i < this.w; i++) {
/*  61 */       for (int j = 0; j < this.v; j++) {
/*  62 */         localfq.u[(i * this.v + j)] = this.u[(i * this.v + this.v - 1 - j)];
/*     */       }
/*     */     }
/*  65 */     return localfq;
/*     */   }
/*     */ 
/*     */   static void cq(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, byte[] paramArrayOfByte)
/*     */   {
/* 954 */     int i = -(paramInt5 >> 2);
/* 955 */     paramInt5 = -(paramInt5 & 0x3);
/* 956 */     for (int j = -paramInt6; j < 0; j++) {
/* 957 */       for (int m = i; m < 0; m++) {
/* 958 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 959 */         if ((paramInt1 != 0) && (paramArrayOfByte[paramInt4] == 0)) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 960 */           paramInt3++;
/* 961 */         paramInt4++;
/* 962 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 963 */         if ((paramInt1 != 0) && (paramArrayOfByte[paramInt4] == 0)) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 964 */           paramInt3++;
/* 965 */         paramInt4++;
/* 966 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 967 */         if ((paramInt1 != 0) && (paramArrayOfByte[paramInt4] == 0)) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 968 */           paramInt3++;
/* 969 */         paramInt4++;
/* 970 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 971 */         if ((paramInt1 != 0) && (paramArrayOfByte[paramInt4] == 0)) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 972 */           paramInt3++;
/* 973 */         paramInt4++;
/*     */       }
/* 975 */       for (m = paramInt5; m < 0; m++) {
/* 976 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 977 */         if ((paramInt1 != 0) && (paramArrayOfByte[paramInt4] == 0)) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 978 */           paramInt3++;
/* 979 */         paramInt4++;
/*     */       }
/* 981 */       paramInt3 += paramInt7;
/* 982 */       paramInt2 += paramInt8;
/* 983 */       paramInt4 += paramInt9;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void ce(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  73 */     for (int i = 0; i < this.u.length; i++) {
/*  74 */       int j = this.u[i];
/*  75 */       if (j != 0) {
/*  76 */         int m = j >> 16 & 0xFF;
/*  77 */         m += paramInt1;
/*  78 */         if (m < 1) m = 1;
/*  79 */         else if (m > 255) m = 255;
/*  80 */         int n = j >> 8 & 0xFF;
/*  81 */         n += paramInt2;
/*  82 */         if (n < 1) n = 1;
/*  83 */         else if (n > 255) n = 255;
/*  84 */         int i1 = j & 0xFF;
/*  85 */         i1 += paramInt3;
/*  86 */         if (i1 < 1) i1 = 1;
/*  87 */         else if (i1 > 255) i1 = 255;
/*  88 */         this.u[i] = ((m << 16) + (n << 8) + i1);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void dw(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 299 */     if ((paramInt3 <= 0) || (paramInt4 <= 0)) return;
/* 300 */     int i = this.v;
/* 301 */     int j = this.w;
/* 302 */     int m = 0;
/* 303 */     int n = 0;
/* 304 */     int i1 = this.y;
/* 305 */     int i2 = this.t;
/* 306 */     int i3 = (i1 << 16) / paramInt3;
/* 307 */     int i4 = (i2 << 16) / paramInt4;
/* 308 */     if (this.e > 0) {
/* 309 */       i5 = ((this.e << 16) + i3 - 1) / i3;
/* 310 */       paramInt1 += i5;
/* 311 */       m += i5 * i3 - (this.e << 16);
/*     */     }
/* 313 */     if (this.b > 0) {
/* 314 */       i5 = ((this.b << 16) + i4 - 1) / i4;
/* 315 */       paramInt2 += i5;
/* 316 */       n += i5 * i4 - (this.b << 16);
/*     */     }
/* 318 */     if (i < i1) paramInt3 = ((i << 16) - m + i3 - 1) / i3;
/* 319 */     if (j < i2) paramInt4 = ((j << 16) - n + i4 - 1) / i4;
/* 320 */     int i5 = paramInt1 + paramInt2 * j;
/* 321 */     int i6 = j - paramInt3;
/* 322 */     if (paramInt2 + paramInt4 > q) paramInt4 -= paramInt2 + paramInt4 - q;
/*     */     int i7;
/* 323 */     if (paramInt2 < g) {
/* 324 */       i7 = g - paramInt2;
/* 325 */       paramInt4 -= i7;
/* 326 */       i5 += i7 * j;
/* 327 */       n += i4 * i7;
/*     */     }
/* 329 */     if (paramInt1 + paramInt3 > s) {
/* 330 */       i7 = paramInt1 + paramInt3 - s;
/* 331 */       paramInt3 -= i7;
/* 332 */       i6 += i7;
/*     */     }
/* 334 */     if (paramInt1 < i) {
/* 335 */       i7 = i - paramInt1;
/* 336 */       paramInt3 -= i7;
/* 337 */       i5 += i7;
/* 338 */       m += i3 * i7;
/* 339 */       i6 += i7;
/*     */     }
/* 341 */     ca(n, this.u, 0, m, n, i5, i6, paramInt3, paramInt4, i3, i4, i);
/*     */   }
/*     */ 
/*     */   public void cb(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  73 */     for (int i = 0; i < this.u.length; i++) {
/*  74 */       int j = this.u[i];
/*  75 */       if (j != 0) {
/*  76 */         int m = j >> 16 & 0xFF;
/*  77 */         m += paramInt1;
/*  78 */         if (m < 1) m = 1;
/*  79 */         else if (m > 255) m = 255;
/*  80 */         int n = j >> 8 & 0xFF;
/*  81 */         n += paramInt2;
/*  82 */         if (n < 1) n = 1;
/*  83 */         else if (n > 255) n = 255;
/*  84 */         int i1 = j & 0xFF;
/*  85 */         i1 += paramInt3;
/*  86 */         if (i1 < 1) i1 = 1;
/*  87 */         else if (i1 > 255) i1 = 255;
/*  88 */         this.u[i] = ((m << 16) + (n << 8) + i1);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void cf() {
/*  94 */     if ((this.v == this.y) && (this.w == this.t)) return;
/*  95 */     int[] arrayOfInt = new int[this.y * this.t];
/*  96 */     for (int i = 0; i < this.w; i++) {
/*  97 */       for (int j = 0; j < this.v; j++) {
/*  98 */         arrayOfInt[((i + this.b) * this.y + (j + this.e))] = this.u[(i * this.v + j)];
/*     */       }
/*     */     }
/* 101 */     this.u = arrayOfInt;
/* 102 */     this.v = this.y;
/* 103 */     this.w = this.t;
/* 104 */     this.e = 0;
/* 105 */     this.b = 0;
/*     */   }
/*     */ 
/*     */   public void cg()
/*     */   {
/*  94 */     if ((this.v == this.y) && (this.w == this.t)) return;
/*  95 */     int[] arrayOfInt = new int[this.y * this.t];
/*  96 */     for (int i = 0; i < this.w; i++) {
/*  97 */       for (int j = 0; j < this.v; j++) {
/*  98 */         arrayOfInt[((i + this.b) * this.y + (j + this.e))] = this.u[(i * this.v + j)];
/*     */       }
/*     */     }
/* 101 */     this.u = arrayOfInt;
/* 102 */     this.v = this.y;
/* 103 */     this.w = this.t;
/* 104 */     this.e = 0;
/* 105 */     this.b = 0;
/*     */   }
/*     */ 
/*     */   public void cy(ft paramft, int paramInt1, int paramInt2)
/*     */   {
/* 915 */     if ((s - i != paramft.w) || (q - g != paramft.e)) throw new IllegalStateException();
/* 916 */     paramInt1 += this.e;
/* 917 */     paramInt2 += this.b;
/* 918 */     int i = paramInt1 + paramInt2 * j;
/* 919 */     int j = 0;
/* 920 */     int m = this.w;
/* 921 */     int n = this.v;
/* 922 */     int i1 = j - n;
/* 923 */     int i2 = 0;
/* 924 */     if (paramInt2 < g) {
/* 925 */       i3 = g - paramInt2;
/* 926 */       m -= i3;
/* 927 */       paramInt2 = g;
/* 928 */       j += i3 * n;
/* 929 */       i += i3 * j;
/*     */     }
/* 931 */     if (paramInt2 + m > q) m -= paramInt2 + m - q;
/* 932 */     if (paramInt1 < i) {
/* 933 */       i3 = i - paramInt1;
/* 934 */       n -= i3;
/* 935 */       paramInt1 = i;
/* 936 */       j += i3;
/* 937 */       i += i3;
/* 938 */       i2 += i3;
/* 939 */       i1 += i3;
/*     */     }
/* 941 */     if (paramInt1 + n > s) {
/* 942 */       i3 = paramInt1 + n - s;
/* 943 */       n -= i3;
/* 944 */       i2 += i3;
/* 945 */       i1 += i3;
/*     */     }
/* 947 */     if ((n <= 0) || (m <= 0)) return;
/* 948 */     int i3 = paramInt1 - i + (paramInt2 - g) * paramft.w;
/* 949 */     int i4 = paramft.w - n;
/* 950 */     cq(n, this.u, 0, j, i, i3, n, m, i1, i2, i4, paramft.u);
/*     */   }
/*     */ 
/*     */   public void dg()
/*     */   {
/*  94 */     if ((this.v == this.y) && (this.w == this.t)) return;
/*  95 */     int[] arrayOfInt = new int[this.y * this.t];
/*  96 */     for (int i = 0; i < this.w; i++) {
/*  97 */       for (int j = 0; j < this.v; j++) {
/*  98 */         arrayOfInt[((i + this.b) * this.y + (j + this.e))] = this.u[(i * this.v + j)];
/*     */       }
/*     */     }
/* 101 */     this.u = arrayOfInt;
/* 102 */     this.v = this.y;
/* 103 */     this.w = this.t;
/* 104 */     this.e = 0;
/* 105 */     this.b = 0;
/*     */   }
/*     */ 
/*     */   public void df()
/*     */   {
/*  94 */     if ((this.v == this.y) && (this.w == this.t)) return;
/*  95 */     int[] arrayOfInt = new int[this.y * this.t];
/*  96 */     for (int i = 0; i < this.w; i++) {
/*  97 */       for (int j = 0; j < this.v; j++) {
/*  98 */         arrayOfInt[((i + this.b) * this.y + (j + this.e))] = this.u[(i * this.v + j)];
/*     */       }
/*     */     }
/* 101 */     this.u = arrayOfInt;
/* 102 */     this.v = this.y;
/* 103 */     this.w = this.t;
/* 104 */     this.e = 0;
/* 105 */     this.b = 0;
/*     */   }
/*     */ 
/*     */   public void dk(int paramInt) {
/* 109 */     if ((this.v == this.y) && (this.w == this.t)) return;
/* 110 */     int i = paramInt;
/* 111 */     if (i > this.e) i = this.e;
/* 112 */     int j = paramInt;
/* 113 */     if (j + this.e + this.v > this.y) j = this.y - this.e - this.v;
/* 114 */     int m = paramInt;
/* 115 */     if (m > this.b) m = this.b;
/* 116 */     int n = paramInt;
/* 117 */     if (n + this.b + this.w > this.t) n = this.t - this.b - this.w;
/* 118 */     int i1 = this.v + i + j;
/* 119 */     int i2 = this.w + m + n;
/* 120 */     int[] arrayOfInt = new int[i1 * i2];
/* 121 */     for (int i3 = 0; i3 < this.w; i3++) {
/* 122 */       for (int i4 = 0; i4 < this.v; i4++) {
/* 123 */         arrayOfInt[((i3 + m) * i1 + (i4 + i))] = this.u[(i3 * this.v + i4)];
/*     */       }
/*     */     }
/* 126 */     this.u = arrayOfInt;
/* 127 */     this.v = i1;
/* 128 */     this.w = i2;
/* 129 */     this.e -= i;
/* 130 */     this.b -= m;
/*     */   }
/*     */ 
/*     */   public void dz(int paramInt)
/*     */   {
/* 109 */     if ((this.v == this.y) && (this.w == this.t)) return;
/* 110 */     int i = paramInt;
/* 111 */     if (i > this.e) i = this.e;
/* 112 */     int j = paramInt;
/* 113 */     if (j + this.e + this.v > this.y) j = this.y - this.e - this.v;
/* 114 */     int m = paramInt;
/* 115 */     if (m > this.b) m = this.b;
/* 116 */     int n = paramInt;
/* 117 */     if (n + this.b + this.w > this.t) n = this.t - this.b - this.w;
/* 118 */     int i1 = this.v + i + j;
/* 119 */     int i2 = this.w + m + n;
/* 120 */     int[] arrayOfInt = new int[i1 * i2];
/* 121 */     for (int i3 = 0; i3 < this.w; i3++) {
/* 122 */       for (int i4 = 0; i4 < this.v; i4++) {
/* 123 */         arrayOfInt[((i3 + m) * i1 + (i4 + i))] = this.u[(i3 * this.v + i4)];
/*     */       }
/*     */     }
/* 126 */     this.u = arrayOfInt;
/* 127 */     this.v = i1;
/* 128 */     this.w = i2;
/* 129 */     this.e -= i;
/* 130 */     this.b -= m;
/*     */   }
/*     */ 
/*     */   public void co(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 361 */     if (paramInt3 == 256) {
/* 362 */       cj(paramInt1, paramInt2);
/* 363 */       return;
/*     */     }
/* 365 */     paramInt1 += this.e;
/* 366 */     paramInt2 += this.b;
/* 367 */     int i = paramInt1 + paramInt2 * j;
/* 368 */     int j = 0;
/* 369 */     int m = this.w;
/* 370 */     int n = this.v;
/* 371 */     int i1 = j - n;
/* 372 */     int i2 = 0;
/*     */     int i3;
/* 373 */     if (paramInt2 < g) {
/* 374 */       i3 = g - paramInt2;
/* 375 */       m -= i3;
/* 376 */       paramInt2 = g;
/* 377 */       j += i3 * n;
/* 378 */       i += i3 * j;
/*     */     }
/* 380 */     if (paramInt2 + m > q) m -= paramInt2 + m - q;
/* 381 */     if (paramInt1 < i) {
/* 382 */       i3 = i - paramInt1;
/* 383 */       n -= i3;
/* 384 */       paramInt1 = i;
/* 385 */       j += i3;
/* 386 */       i += i3;
/* 387 */       i2 += i3;
/* 388 */       i1 += i3;
/*     */     }
/* 390 */     if (paramInt1 + n > s) {
/* 391 */       i3 = paramInt1 + n - s;
/* 392 */       n -= i3;
/* 393 */       i2 += i3;
/* 394 */       i1 += i3;
/*     */     }
/* 396 */     if ((n <= 0) || (m <= 0)) return;
/* 397 */     ch(n, this.u, 0, j, i, n, m, i1, i2, paramInt3, paramInt4);
/*     */   }
/*     */ 
/*     */   public void dj()
/*     */   {
/* 134 */     int[] arrayOfInt = new int[this.v * this.w];
/* 135 */     int i = 0;
/* 136 */     for (int j = 0; j < this.w; j++) {
/* 137 */       for (int m = this.v - 1; m >= 0; m--) arrayOfInt[(i++)] = this.u[(m + j * this.v)];
/*     */     }
/* 139 */     this.u = arrayOfInt;
/* 140 */     this.e = (this.y - this.v - this.e);
/*     */   }
/*     */ 
/*     */   public void dv(int paramInt)
/*     */   {
/* 154 */     int[] arrayOfInt = new int[this.v * this.w];
/* 155 */     int i = 0;
/* 156 */     for (int j = 0; j < this.w; j++) {
/* 157 */       for (int m = 0; m < this.v; m++) {
/* 158 */         int n = this.u[i];
/* 159 */         if (n == 0) {
/* 160 */           if ((m > 0) && (this.u[(i - 1)] != 0)) n = paramInt;
/* 161 */           else if ((j > 0) && (this.u[(i - this.v)] != 0)) n = paramInt;
/* 162 */           else if ((m < this.v - 1) && (this.u[(i + 1)] != 0)) n = paramInt;
/* 163 */           else if ((j < this.w - 1) && (this.u[(i + this.v)] != 0)) n = paramInt;
/*     */         }
/* 165 */         arrayOfInt[(i++)] = n;
/*     */       }
/*     */     }
/* 168 */     this.u = arrayOfInt;
/*     */   }
/*     */ 
/*     */   public void ds(int paramInt)
/*     */   {
/* 154 */     int[] arrayOfInt = new int[this.v * this.w];
/* 155 */     int i = 0;
/* 156 */     for (int j = 0; j < this.w; j++) {
/* 157 */       for (int m = 0; m < this.v; m++) {
/* 158 */         int n = this.u[i];
/* 159 */         if (n == 0) {
/* 160 */           if ((m > 0) && (this.u[(i - 1)] != 0)) n = paramInt;
/* 161 */           else if ((j > 0) && (this.u[(i - this.v)] != 0)) n = paramInt;
/* 162 */           else if ((m < this.v - 1) && (this.u[(i + 1)] != 0)) n = paramInt;
/* 163 */           else if ((j < this.w - 1) && (this.u[(i + this.v)] != 0)) n = paramInt;
/*     */         }
/* 165 */         arrayOfInt[(i++)] = n;
/*     */       }
/*     */     }
/* 168 */     this.u = arrayOfInt;
/*     */   }
/*     */ 
/*     */   public void dh(int paramInt)
/*     */   {
/* 154 */     int[] arrayOfInt = new int[this.v * this.w];
/* 155 */     int i = 0;
/* 156 */     for (int j = 0; j < this.w; j++) {
/* 157 */       for (int m = 0; m < this.v; m++) {
/* 158 */         int n = this.u[i];
/* 159 */         if (n == 0) {
/* 160 */           if ((m > 0) && (this.u[(i - 1)] != 0)) n = paramInt;
/* 161 */           else if ((j > 0) && (this.u[(i - this.v)] != 0)) n = paramInt;
/* 162 */           else if ((m < this.v - 1) && (this.u[(i + 1)] != 0)) n = paramInt;
/* 163 */           else if ((j < this.w - 1) && (this.u[(i + this.v)] != 0)) n = paramInt;
/*     */         }
/* 165 */         arrayOfInt[(i++)] = n;
/*     */       }
/*     */     }
/* 168 */     this.u = arrayOfInt;
/*     */   }
/*     */ 
/*     */   public void dc(int paramInt)
/*     */   {
/* 154 */     int[] arrayOfInt = new int[this.v * this.w];
/* 155 */     int i = 0;
/* 156 */     for (int j = 0; j < this.w; j++) {
/* 157 */       for (int m = 0; m < this.v; m++) {
/* 158 */         int n = this.u[i];
/* 159 */         if (n == 0) {
/* 160 */           if ((m > 0) && (this.u[(i - 1)] != 0)) n = paramInt;
/* 161 */           else if ((j > 0) && (this.u[(i - this.v)] != 0)) n = paramInt;
/* 162 */           else if ((m < this.v - 1) && (this.u[(i + 1)] != 0)) n = paramInt;
/* 163 */           else if ((j < this.w - 1) && (this.u[(i + this.v)] != 0)) n = paramInt;
/*     */         }
/* 165 */         arrayOfInt[(i++)] = n;
/*     */       }
/*     */     }
/* 168 */     this.u = arrayOfInt;
/*     */   }
/*     */ 
/*     */   static void ei(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/* 457 */     int i = 256 - paramInt8;
/* 458 */     for (int j = -paramInt5; j < 0; j++) {
/* 459 */       for (int m = -paramInt4; m < 0; m++) {
/* 460 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 461 */         if (paramInt1 != 0) {
/* 462 */           int n = paramArrayOfInt1[paramInt3];
/* 463 */           paramArrayOfInt1[(paramInt3++)] = (((paramInt1 & 0xFF00FF) * paramInt8 + (n & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt1 & 0xFF00) * paramInt8 + (n & 0xFF00) * i & 0xFF0000) >> 8);
/*     */         } else {
/* 465 */           paramInt3++;
/*     */         }
/*     */       }
/* 467 */       paramInt3 += paramInt6;
/* 468 */       paramInt2 += paramInt7;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void dm(int paramInt)
/*     */   {
/* 172 */     for (int i = this.w - 1; i > 0; i--) {
/* 173 */       int j = i * this.v;
/* 174 */       for (int m = this.v - 1; m > 0; m--)
/* 175 */         if ((this.u[(m + j)] == 0) && (this.u[(m + j - 1 - this.v)] != 0)) this.u[(m + j)] = paramInt;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void di(int paramInt)
/*     */   {
/* 172 */     for (int i = this.w - 1; i > 0; i--) {
/* 173 */       int j = i * this.v;
/* 174 */       for (int m = this.v - 1; m > 0; m--)
/* 175 */         if ((this.u[(m + j)] == 0) && (this.u[(m + j - 1 - this.v)] != 0)) this.u[(m + j)] = paramInt;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void db(int paramInt1, int paramInt2)
/*     */   {
/* 181 */     paramInt1 += this.e;
/* 182 */     paramInt2 += this.b;
/* 183 */     int i = paramInt1 + paramInt2 * j;
/* 184 */     int j = 0;
/* 185 */     int m = this.w;
/* 186 */     int n = this.v;
/* 187 */     int i1 = j - n;
/* 188 */     int i2 = 0;
/*     */     int i3;
/* 189 */     if (paramInt2 < g) {
/* 190 */       i3 = g - paramInt2;
/* 191 */       m -= i3;
/* 192 */       paramInt2 = g;
/* 193 */       j += i3 * n;
/* 194 */       i += i3 * j;
/*     */     }
/* 196 */     if (paramInt2 + m > q) m -= paramInt2 + m - q;
/* 197 */     if (paramInt1 < i) {
/* 198 */       i3 = i - paramInt1;
/* 199 */       n -= i3;
/* 200 */       paramInt1 = i;
/* 201 */       j += i3;
/* 202 */       i += i3;
/* 203 */       i2 += i3;
/* 204 */       i1 += i3;
/*     */     }
/* 206 */     if (paramInt1 + n > s) {
/* 207 */       i3 = paramInt1 + n - s;
/* 208 */       n -= i3;
/* 209 */       i2 += i3;
/* 210 */       i1 += i3;
/*     */     }
/* 212 */     if ((n <= 0) || (m <= 0)) return;
/* 213 */     cs(n, this.u, j, i, n, m, i1, i2);
/*     */   }
/*     */ 
/*     */   static void dq(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/* 217 */     for (int i = -paramInt4; i < 0; i++) {
/* 218 */       int j = paramInt2 + paramInt3 - 3;
/* 219 */       while (paramInt2 < j) {
/* 220 */         paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(paramInt1++)];
/* 221 */         paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(paramInt1++)];
/* 222 */         paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(paramInt1++)];
/* 223 */         paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(paramInt1++)];
/*     */       }
/* 225 */       j += 3;
/* 226 */       while (paramInt2 < j) {
/* 227 */         paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(paramInt1++)];
/*     */       }
/* 229 */       paramInt2 += paramInt5;
/* 230 */       paramInt1 += paramInt6;
/*     */     }
/*     */   }
/*     */ 
/*     */   static void ew(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11)
/*     */   {
/* 519 */     int i = 256 - paramInt11;
/* 520 */     int j = paramInt2;
/* 521 */     for (int m = -paramInt7; m < 0; m++) {
/* 522 */       int n = (paramInt3 >> 16) * paramInt10;
/* 523 */       for (int i1 = -paramInt6; i1 < 0; i1++) {
/* 524 */         paramInt1 = paramArrayOfInt2[((paramInt2 >> 16) + n)];
/* 525 */         if (paramInt1 != 0) {
/* 526 */           int i2 = paramArrayOfInt1[paramInt4];
/* 527 */           paramArrayOfInt1[(paramInt4++)] = (((paramInt1 & 0xFF00FF) * paramInt11 + (i2 & 0xFF00FF) * i & 0xFF00FF00) + ((paramInt1 & 0xFF00) * paramInt11 + (i2 & 0xFF00) * i & 0xFF0000) >> 8);
/*     */         } else {
/* 529 */           paramInt4++;
/* 530 */         }paramInt2 += paramInt8;
/*     */       }
/* 532 */       paramInt3 += paramInt9;
/* 533 */       paramInt2 = j;
/* 534 */       paramInt4 += paramInt5;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void br()
/*     */   {
/* 144 */     int[] arrayOfInt = new int[this.v * this.w];
/* 145 */     int i = 0;
/* 146 */     for (int j = this.w - 1; j >= 0; j--) {
/* 147 */       for (int m = 0; m < this.v; m++) arrayOfInt[(i++)] = this.u[(m + j * this.v)];
/*     */     }
/* 149 */     this.u = arrayOfInt;
/* 150 */     this.b = (this.t - this.w - this.b);
/*     */   }
/*     */ 
/*     */   static void dy(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/* 271 */     int i = -(paramInt4 >> 2);
/* 272 */     paramInt4 = -(paramInt4 & 0x3);
/* 273 */     for (int j = -paramInt5; j < 0; j++) {
/* 274 */       for (int m = i; m < 0; m++) {
/* 275 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 276 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 277 */           paramInt3++;
/* 278 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 279 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 280 */           paramInt3++;
/* 281 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 282 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 283 */           paramInt3++;
/* 284 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 285 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 286 */           paramInt3++;
/*     */       }
/* 288 */       for (m = paramInt4; m < 0; m++) {
/* 289 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 290 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 291 */           paramInt3++;
/*     */       }
/* 293 */       paramInt3 += paramInt6;
/* 294 */       paramInt2 += paramInt7;
/*     */     }
/*     */   }
/*     */ 
/*     */   static void de(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/* 271 */     int i = -(paramInt4 >> 2);
/* 272 */     paramInt4 = -(paramInt4 & 0x3);
/* 273 */     for (int j = -paramInt5; j < 0; j++) {
/* 274 */       for (int m = i; m < 0; m++) {
/* 275 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 276 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 277 */           paramInt3++;
/* 278 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 279 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 280 */           paramInt3++;
/* 281 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 282 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 283 */           paramInt3++;
/* 284 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 285 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 286 */           paramInt3++;
/*     */       }
/* 288 */       for (m = paramInt4; m < 0; m++) {
/* 289 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 290 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 291 */           paramInt3++;
/*     */       }
/* 293 */       paramInt3 += paramInt6;
/* 294 */       paramInt2 += paramInt7;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void bb(int paramInt)
/*     */   {
/* 154 */     int[] arrayOfInt = new int[this.v * this.w];
/* 155 */     int i = 0;
/* 156 */     for (int j = 0; j < this.w; j++) {
/* 157 */       for (int m = 0; m < this.v; m++) {
/* 158 */         int n = this.u[i];
/* 159 */         if (n == 0) {
/* 160 */           if ((m > 0) && (this.u[(i - 1)] != 0)) n = paramInt;
/* 161 */           else if ((j > 0) && (this.u[(i - this.v)] != 0)) n = paramInt;
/* 162 */           else if ((m < this.v - 1) && (this.u[(i + 1)] != 0)) n = paramInt;
/* 163 */           else if ((j < this.w - 1) && (this.u[(i + this.v)] != 0)) n = paramInt;
/*     */         }
/* 165 */         arrayOfInt[(i++)] = n;
/*     */       }
/*     */     }
/* 168 */     this.u = arrayOfInt;
/*     */   }
/*     */ 
/*     */   public void eg(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/* 473 */     if ((paramInt3 <= 0) || (paramInt4 <= 0)) return;
/* 474 */     int i = this.v;
/* 475 */     int j = this.w;
/* 476 */     int m = 0;
/* 477 */     int n = 0;
/* 478 */     int i1 = this.y;
/* 479 */     int i2 = this.t;
/* 480 */     int i3 = (i1 << 16) / paramInt3;
/* 481 */     int i4 = (i2 << 16) / paramInt4;
/* 482 */     if (this.e > 0) {
/* 483 */       i5 = ((this.e << 16) + i3 - 1) / i3;
/* 484 */       paramInt1 += i5;
/* 485 */       m += i5 * i3 - (this.e << 16);
/*     */     }
/* 487 */     if (this.b > 0) {
/* 488 */       i5 = ((this.b << 16) + i4 - 1) / i4;
/* 489 */       paramInt2 += i5;
/* 490 */       n += i5 * i4 - (this.b << 16);
/*     */     }
/* 492 */     if (i < i1) paramInt3 = ((i << 16) - m + i3 - 1) / i3;
/* 493 */     if (j < i2) paramInt4 = ((j << 16) - n + i4 - 1) / i4;
/* 494 */     int i5 = paramInt1 + paramInt2 * j;
/* 495 */     int i6 = j - paramInt3;
/* 496 */     if (paramInt2 + paramInt4 > q) paramInt4 -= paramInt2 + paramInt4 - q;
/*     */     int i7;
/* 497 */     if (paramInt2 < g) {
/* 498 */       i7 = g - paramInt2;
/* 499 */       paramInt4 -= i7;
/* 500 */       i5 += i7 * j;
/* 501 */       n += i4 * i7;
/*     */     }
/* 503 */     if (paramInt1 + paramInt3 > s) {
/* 504 */       i7 = paramInt1 + paramInt3 - s;
/* 505 */       paramInt3 -= i7;
/* 506 */       i6 += i7;
/*     */     }
/* 508 */     if (paramInt1 < i) {
/* 509 */       i7 = i - paramInt1;
/* 510 */       paramInt3 -= i7;
/* 511 */       i5 += i7;
/* 512 */       m += i3 * i7;
/* 513 */       i6 += i7;
/*     */     }
/* 515 */     cw(n, this.u, 0, m, n, i5, i6, paramInt3, paramInt4, i3, i4, i, paramInt5);
/*     */   }
/*     */ 
/*     */   static void dn(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/* 345 */     int i = paramInt2;
/* 346 */     for (int j = -paramInt7; j < 0; j++) {
/* 347 */       int m = (paramInt3 >> 16) * paramInt10;
/* 348 */       for (int n = -paramInt6; n < 0; n++) {
/* 349 */         paramInt1 = paramArrayOfInt2[((paramInt2 >> 16) + m)];
/* 350 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt4++)] = paramInt1; else
/* 351 */           paramInt4++;
/* 352 */         paramInt2 += paramInt8;
/*     */       }
/* 354 */       paramInt3 += paramInt9;
/* 355 */       paramInt2 = i;
/* 356 */       paramInt4 += paramInt5;
/*     */     }
/*     */   }
/*     */ 
/*     */   static void jdMethod_do(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/* 345 */     int i = paramInt2;
/* 346 */     for (int j = -paramInt7; j < 0; j++) {
/* 347 */       int m = (paramInt3 >> 16) * paramInt10;
/* 348 */       for (int n = -paramInt6; n < 0; n++) {
/* 349 */         paramInt1 = paramArrayOfInt2[((paramInt2 >> 16) + m)];
/* 350 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt4++)] = paramInt1; else
/* 351 */           paramInt4++;
/* 352 */         paramInt2 += paramInt8;
/*     */       }
/* 354 */       paramInt3 += paramInt9;
/* 355 */       paramInt2 = i;
/* 356 */       paramInt4 += paramInt5;
/*     */     }
/*     */   }
/*     */ 
/*     */   static void dx(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/* 345 */     int i = paramInt2;
/* 346 */     for (int j = -paramInt7; j < 0; j++) {
/* 347 */       int m = (paramInt3 >> 16) * paramInt10;
/* 348 */       for (int n = -paramInt6; n < 0; n++) {
/* 349 */         paramInt1 = paramArrayOfInt2[((paramInt2 >> 16) + m)];
/* 350 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt4++)] = paramInt1; else
/* 351 */           paramInt4++;
/* 352 */         paramInt2 += paramInt8;
/*     */       }
/* 354 */       paramInt3 += paramInt9;
/* 355 */       paramInt2 = i;
/* 356 */       paramInt4 += paramInt5;
/*     */     }
/*     */   }
/*     */ 
/*     */   public fq bm()
/*     */   {
/*  55 */     fq localfq = new fq(this.v, this.w);
/*  56 */     localfq.y = this.y;
/*  57 */     localfq.t = this.t;
/*  58 */     localfq.e = (this.y - this.v - this.e);
/*  59 */     localfq.b = this.b;
/*  60 */     for (int i = 0; i < this.w; i++) {
/*  61 */       for (int j = 0; j < this.v; j++) {
/*  62 */         localfq.u[(i * this.v + j)] = this.u[(i * this.v + this.v - 1 - j)];
/*     */       }
/*     */     }
/*  65 */     return localfq;
/*     */   }
/*     */ 
/*     */   public void eb(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 361 */     if (paramInt3 == 256) {
/* 362 */       cj(paramInt1, paramInt2);
/* 363 */       return;
/*     */     }
/* 365 */     paramInt1 += this.e;
/* 366 */     paramInt2 += this.b;
/* 367 */     int i = paramInt1 + paramInt2 * j;
/* 368 */     int j = 0;
/* 369 */     int m = this.w;
/* 370 */     int n = this.v;
/* 371 */     int i1 = j - n;
/* 372 */     int i2 = 0;
/*     */     int i3;
/* 373 */     if (paramInt2 < g) {
/* 374 */       i3 = g - paramInt2;
/* 375 */       m -= i3;
/* 376 */       paramInt2 = g;
/* 377 */       j += i3 * n;
/* 378 */       i += i3 * j;
/*     */     }
/* 380 */     if (paramInt2 + m > q) m -= paramInt2 + m - q;
/* 381 */     if (paramInt1 < i) {
/* 382 */       i3 = i - paramInt1;
/* 383 */       n -= i3;
/* 384 */       paramInt1 = i;
/* 385 */       j += i3;
/* 386 */       i += i3;
/* 387 */       i2 += i3;
/* 388 */       i1 += i3;
/*     */     }
/* 390 */     if (paramInt1 + n > s) {
/* 391 */       i3 = paramInt1 + n - s;
/* 392 */       n -= i3;
/* 393 */       i2 += i3;
/* 394 */       i1 += i3;
/*     */     }
/* 396 */     if ((n <= 0) || (m <= 0)) return;
/* 397 */     ch(n, this.u, 0, j, i, n, m, i1, i2, paramInt3, paramInt4);
/*     */   }
/*     */ 
/*     */   public void er(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 361 */     if (paramInt3 == 256) {
/* 362 */       cj(paramInt1, paramInt2);
/* 363 */       return;
/*     */     }
/* 365 */     paramInt1 += this.e;
/* 366 */     paramInt2 += this.b;
/* 367 */     int i = paramInt1 + paramInt2 * j;
/* 368 */     int j = 0;
/* 369 */     int m = this.w;
/* 370 */     int n = this.v;
/* 371 */     int i1 = j - n;
/* 372 */     int i2 = 0;
/*     */     int i3;
/* 373 */     if (paramInt2 < g) {
/* 374 */       i3 = g - paramInt2;
/* 375 */       m -= i3;
/* 376 */       paramInt2 = g;
/* 377 */       j += i3 * n;
/* 378 */       i += i3 * j;
/*     */     }
/* 380 */     if (paramInt2 + m > q) m -= paramInt2 + m - q;
/* 381 */     if (paramInt1 < i) {
/* 382 */       i3 = i - paramInt1;
/* 383 */       n -= i3;
/* 384 */       paramInt1 = i;
/* 385 */       j += i3;
/* 386 */       i += i3;
/* 387 */       i2 += i3;
/* 388 */       i1 += i3;
/*     */     }
/* 390 */     if (paramInt1 + n > s) {
/* 391 */       i3 = paramInt1 + n - s;
/* 392 */       n -= i3;
/* 393 */       i2 += i3;
/* 394 */       i1 += i3;
/*     */     }
/* 396 */     if ((n <= 0) || (m <= 0)) return;
/* 397 */     ch(n, this.u, 0, j, i, n, m, i1, i2, paramInt3, paramInt4);
/*     */   }
/*     */ 
/*     */   static void dr(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/* 217 */     for (int i = -paramInt4; i < 0; i++) {
/* 218 */       int j = paramInt2 + paramInt3 - 3;
/* 219 */       while (paramInt2 < j) {
/* 220 */         paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(paramInt1++)];
/* 221 */         paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(paramInt1++)];
/* 222 */         paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(paramInt1++)];
/* 223 */         paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(paramInt1++)];
/*     */       }
/* 225 */       j += 3;
/* 226 */       while (paramInt2 < j) {
/* 227 */         paramArrayOfInt1[(paramInt2++)] = paramArrayOfInt2[(paramInt1++)];
/*     */       }
/* 229 */       paramInt2 += paramInt5;
/* 230 */       paramInt1 += paramInt6;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void ez(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 421 */     paramInt1 += this.e;
/* 422 */     paramInt2 += this.b;
/* 423 */     int i = paramInt1 + paramInt2 * j;
/* 424 */     int j = 0;
/* 425 */     int m = this.w;
/* 426 */     int n = this.v;
/* 427 */     int i1 = j - n;
/* 428 */     int i2 = 0;
/*     */     int i3;
/* 429 */     if (paramInt2 < g) {
/* 430 */       i3 = g - paramInt2;
/* 431 */       m -= i3;
/* 432 */       paramInt2 = g;
/* 433 */       j += i3 * n;
/* 434 */       i += i3 * j;
/*     */     }
/* 436 */     if (paramInt2 + m > q) m -= paramInt2 + m - q;
/* 437 */     if (paramInt1 < i) {
/* 438 */       i3 = i - paramInt1;
/* 439 */       n -= i3;
/* 440 */       paramInt1 = i;
/* 441 */       j += i3;
/* 442 */       i += i3;
/* 443 */       i2 += i3;
/* 444 */       i1 += i3;
/*     */     }
/* 446 */     if (paramInt1 + n > s) {
/* 447 */       i3 = paramInt1 + n - s;
/* 448 */       n -= i3;
/* 449 */       i2 += i3;
/* 450 */       i1 += i3;
/*     */     }
/* 452 */     if ((n <= 0) || (m <= 0)) return;
/* 453 */     cc(n, this.u, 0, j, i, n, m, i1, i2, paramInt3);
/*     */   }
/*     */ 
/*     */   public void ev(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 421 */     paramInt1 += this.e;
/* 422 */     paramInt2 += this.b;
/* 423 */     int i = paramInt1 + paramInt2 * j;
/* 424 */     int j = 0;
/* 425 */     int m = this.w;
/* 426 */     int n = this.v;
/* 427 */     int i1 = j - n;
/* 428 */     int i2 = 0;
/*     */     int i3;
/* 429 */     if (paramInt2 < g) {
/* 430 */       i3 = g - paramInt2;
/* 431 */       m -= i3;
/* 432 */       paramInt2 = g;
/* 433 */       j += i3 * n;
/* 434 */       i += i3 * j;
/*     */     }
/* 436 */     if (paramInt2 + m > q) m -= paramInt2 + m - q;
/* 437 */     if (paramInt1 < i) {
/* 438 */       i3 = i - paramInt1;
/* 439 */       n -= i3;
/* 440 */       paramInt1 = i;
/* 441 */       j += i3;
/* 442 */       i += i3;
/* 443 */       i2 += i3;
/* 444 */       i1 += i3;
/*     */     }
/* 446 */     if (paramInt1 + n > s) {
/* 447 */       i3 = paramInt1 + n - s;
/* 448 */       n -= i3;
/* 449 */       i2 += i3;
/* 450 */       i1 += i3;
/*     */     }
/* 452 */     if ((n <= 0) || (m <= 0)) return;
/* 453 */     cc(n, this.u, 0, j, i, n, m, i1, i2, paramInt3);
/*     */   }
/*     */ 
/*     */   public void ba(int paramInt)
/*     */   {
/* 109 */     if ((this.v == this.y) && (this.w == this.t)) return;
/* 110 */     int i = paramInt;
/* 111 */     if (i > this.e) i = this.e;
/* 112 */     int j = paramInt;
/* 113 */     if (j + this.e + this.v > this.y) j = this.y - this.e - this.v;
/* 114 */     int m = paramInt;
/* 115 */     if (m > this.b) m = this.b;
/* 116 */     int n = paramInt;
/* 117 */     if (n + this.b + this.w > this.t) n = this.t - this.b - this.w;
/* 118 */     int i1 = this.v + i + j;
/* 119 */     int i2 = this.w + m + n;
/* 120 */     int[] arrayOfInt = new int[i1 * i2];
/* 121 */     for (int i3 = 0; i3 < this.w; i3++) {
/* 122 */       for (int i4 = 0; i4 < this.v; i4++) {
/* 123 */         arrayOfInt[((i3 + m) * i1 + (i4 + i))] = this.u[(i3 * this.v + i4)];
/*     */       }
/*     */     }
/* 126 */     this.u = arrayOfInt;
/* 127 */     this.v = i1;
/* 128 */     this.w = i2;
/* 129 */     this.e -= i;
/* 130 */     this.b -= m;
/*     */   }
/*     */ 
/*     */   public void ef(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/* 473 */     if ((paramInt3 <= 0) || (paramInt4 <= 0)) return;
/* 474 */     int i = this.v;
/* 475 */     int j = this.w;
/* 476 */     int m = 0;
/* 477 */     int n = 0;
/* 478 */     int i1 = this.y;
/* 479 */     int i2 = this.t;
/* 480 */     int i3 = (i1 << 16) / paramInt3;
/* 481 */     int i4 = (i2 << 16) / paramInt4;
/* 482 */     if (this.e > 0) {
/* 483 */       i5 = ((this.e << 16) + i3 - 1) / i3;
/* 484 */       paramInt1 += i5;
/* 485 */       m += i5 * i3 - (this.e << 16);
/*     */     }
/* 487 */     if (this.b > 0) {
/* 488 */       i5 = ((this.b << 16) + i4 - 1) / i4;
/* 489 */       paramInt2 += i5;
/* 490 */       n += i5 * i4 - (this.b << 16);
/*     */     }
/* 492 */     if (i < i1) paramInt3 = ((i << 16) - m + i3 - 1) / i3;
/* 493 */     if (j < i2) paramInt4 = ((j << 16) - n + i4 - 1) / i4;
/* 494 */     int i5 = paramInt1 + paramInt2 * j;
/* 495 */     int i6 = j - paramInt3;
/* 496 */     if (paramInt2 + paramInt4 > q) paramInt4 -= paramInt2 + paramInt4 - q;
/*     */     int i7;
/* 497 */     if (paramInt2 < g) {
/* 498 */       i7 = g - paramInt2;
/* 499 */       paramInt4 -= i7;
/* 500 */       i5 += i7 * j;
/* 501 */       n += i4 * i7;
/*     */     }
/* 503 */     if (paramInt1 + paramInt3 > s) {
/* 504 */       i7 = paramInt1 + paramInt3 - s;
/* 505 */       paramInt3 -= i7;
/* 506 */       i6 += i7;
/*     */     }
/* 508 */     if (paramInt1 < i) {
/* 509 */       i7 = i - paramInt1;
/* 510 */       paramInt3 -= i7;
/* 511 */       i5 += i7;
/* 512 */       m += i3 * i7;
/* 513 */       i6 += i7;
/*     */     }
/* 515 */     cw(n, this.u, 0, m, n, i5, i6, paramInt3, paramInt4, i3, i4, i, paramInt5);
/*     */   }
/*     */ 
/*     */   public void da(int paramInt)
/*     */   {
/* 109 */     if ((this.v == this.y) && (this.w == this.t)) return;
/* 110 */     int i = paramInt;
/* 111 */     if (i > this.e) i = this.e;
/* 112 */     int j = paramInt;
/* 113 */     if (j + this.e + this.v > this.y) j = this.y - this.e - this.v;
/* 114 */     int m = paramInt;
/* 115 */     if (m > this.b) m = this.b;
/* 116 */     int n = paramInt;
/* 117 */     if (n + this.b + this.w > this.t) n = this.t - this.b - this.w;
/* 118 */     int i1 = this.v + i + j;
/* 119 */     int i2 = this.w + m + n;
/* 120 */     int[] arrayOfInt = new int[i1 * i2];
/* 121 */     for (int i3 = 0; i3 < this.w; i3++) {
/* 122 */       for (int i4 = 0; i4 < this.v; i4++) {
/* 123 */         arrayOfInt[((i3 + m) * i1 + (i4 + i))] = this.u[(i3 * this.v + i4)];
/*     */       }
/*     */     }
/* 126 */     this.u = arrayOfInt;
/* 127 */     this.v = i1;
/* 128 */     this.w = i2;
/* 129 */     this.e -= i;
/* 130 */     this.b -= m;
/*     */   }
/*     */ 
/*     */   public void eh(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/* 473 */     if ((paramInt3 <= 0) || (paramInt4 <= 0)) return;
/* 474 */     int i = this.v;
/* 475 */     int j = this.w;
/* 476 */     int m = 0;
/* 477 */     int n = 0;
/* 478 */     int i1 = this.y;
/* 479 */     int i2 = this.t;
/* 480 */     int i3 = (i1 << 16) / paramInt3;
/* 481 */     int i4 = (i2 << 16) / paramInt4;
/* 482 */     if (this.e > 0) {
/* 483 */       i5 = ((this.e << 16) + i3 - 1) / i3;
/* 484 */       paramInt1 += i5;
/* 485 */       m += i5 * i3 - (this.e << 16);
/*     */     }
/* 487 */     if (this.b > 0) {
/* 488 */       i5 = ((this.b << 16) + i4 - 1) / i4;
/* 489 */       paramInt2 += i5;
/* 490 */       n += i5 * i4 - (this.b << 16);
/*     */     }
/* 492 */     if (i < i1) paramInt3 = ((i << 16) - m + i3 - 1) / i3;
/* 493 */     if (j < i2) paramInt4 = ((j << 16) - n + i4 - 1) / i4;
/* 494 */     int i5 = paramInt1 + paramInt2 * j;
/* 495 */     int i6 = j - paramInt3;
/* 496 */     if (paramInt2 + paramInt4 > q) paramInt4 -= paramInt2 + paramInt4 - q;
/*     */     int i7;
/* 497 */     if (paramInt2 < g) {
/* 498 */       i7 = g - paramInt2;
/* 499 */       paramInt4 -= i7;
/* 500 */       i5 += i7 * j;
/* 501 */       n += i4 * i7;
/*     */     }
/* 503 */     if (paramInt1 + paramInt3 > s) {
/* 504 */       i7 = paramInt1 + paramInt3 - s;
/* 505 */       paramInt3 -= i7;
/* 506 */       i6 += i7;
/*     */     }
/* 508 */     if (paramInt1 < i) {
/* 509 */       i7 = i - paramInt1;
/* 510 */       paramInt3 -= i7;
/* 511 */       i5 += i7;
/* 512 */       m += i3 * i7;
/* 513 */       i6 += i7;
/*     */     }
/* 515 */     cw(n, this.u, 0, m, n, i5, i6, paramInt3, paramInt4, i3, i4, i, paramInt5);
/*     */   }
/*     */ 
/*     */   public void ci(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  73 */     for (int i = 0; i < this.u.length; i++) {
/*  74 */       int j = this.u[i];
/*  75 */       if (j != 0) {
/*  76 */         int m = j >> 16 & 0xFF;
/*  77 */         m += paramInt1;
/*  78 */         if (m < 1) m = 1;
/*  79 */         else if (m > 255) m = 255;
/*  80 */         int n = j >> 8 & 0xFF;
/*  81 */         n += paramInt2;
/*  82 */         if (n < 1) n = 1;
/*  83 */         else if (n > 255) n = 255;
/*  84 */         int i1 = j & 0xFF;
/*  85 */         i1 += paramInt3;
/*  86 */         if (i1 < 1) i1 = 1;
/*  87 */         else if (i1 > 255) i1 = 255;
/*  88 */         this.u[i] = ((m << 16) + (n << 8) + i1);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void el(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/* 473 */     if ((paramInt3 <= 0) || (paramInt4 <= 0)) return;
/* 474 */     int i = this.v;
/* 475 */     int j = this.w;
/* 476 */     int m = 0;
/* 477 */     int n = 0;
/* 478 */     int i1 = this.y;
/* 479 */     int i2 = this.t;
/* 480 */     int i3 = (i1 << 16) / paramInt3;
/* 481 */     int i4 = (i2 << 16) / paramInt4;
/* 482 */     if (this.e > 0) {
/* 483 */       i5 = ((this.e << 16) + i3 - 1) / i3;
/* 484 */       paramInt1 += i5;
/* 485 */       m += i5 * i3 - (this.e << 16);
/*     */     }
/* 487 */     if (this.b > 0) {
/* 488 */       i5 = ((this.b << 16) + i4 - 1) / i4;
/* 489 */       paramInt2 += i5;
/* 490 */       n += i5 * i4 - (this.b << 16);
/*     */     }
/* 492 */     if (i < i1) paramInt3 = ((i << 16) - m + i3 - 1) / i3;
/* 493 */     if (j < i2) paramInt4 = ((j << 16) - n + i4 - 1) / i4;
/* 494 */     int i5 = paramInt1 + paramInt2 * j;
/* 495 */     int i6 = j - paramInt3;
/* 496 */     if (paramInt2 + paramInt4 > q) paramInt4 -= paramInt2 + paramInt4 - q;
/*     */     int i7;
/* 497 */     if (paramInt2 < g) {
/* 498 */       i7 = g - paramInt2;
/* 499 */       paramInt4 -= i7;
/* 500 */       i5 += i7 * j;
/* 501 */       n += i4 * i7;
/*     */     }
/* 503 */     if (paramInt1 + paramInt3 > s) {
/* 504 */       i7 = paramInt1 + paramInt3 - s;
/* 505 */       paramInt3 -= i7;
/* 506 */       i6 += i7;
/*     */     }
/* 508 */     if (paramInt1 < i) {
/* 509 */       i7 = i - paramInt1;
/* 510 */       paramInt3 -= i7;
/* 511 */       i5 += i7;
/* 512 */       m += i3 * i7;
/* 513 */       i6 += i7;
/*     */     }
/* 515 */     cw(n, this.u, 0, m, n, i5, i6, paramInt3, paramInt4, i3, i4, i, paramInt5);
/*     */   }
/*     */ 
/*     */   public void en(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/* 473 */     if ((paramInt3 <= 0) || (paramInt4 <= 0)) return;
/* 474 */     int i = this.v;
/* 475 */     int j = this.w;
/* 476 */     int m = 0;
/* 477 */     int n = 0;
/* 478 */     int i1 = this.y;
/* 479 */     int i2 = this.t;
/* 480 */     int i3 = (i1 << 16) / paramInt3;
/* 481 */     int i4 = (i2 << 16) / paramInt4;
/* 482 */     if (this.e > 0) {
/* 483 */       i5 = ((this.e << 16) + i3 - 1) / i3;
/* 484 */       paramInt1 += i5;
/* 485 */       m += i5 * i3 - (this.e << 16);
/*     */     }
/* 487 */     if (this.b > 0) {
/* 488 */       i5 = ((this.b << 16) + i4 - 1) / i4;
/* 489 */       paramInt2 += i5;
/* 490 */       n += i5 * i4 - (this.b << 16);
/*     */     }
/* 492 */     if (i < i1) paramInt3 = ((i << 16) - m + i3 - 1) / i3;
/* 493 */     if (j < i2) paramInt4 = ((j << 16) - n + i4 - 1) / i4;
/* 494 */     int i5 = paramInt1 + paramInt2 * j;
/* 495 */     int i6 = j - paramInt3;
/* 496 */     if (paramInt2 + paramInt4 > q) paramInt4 -= paramInt2 + paramInt4 - q;
/*     */     int i7;
/* 497 */     if (paramInt2 < g) {
/* 498 */       i7 = g - paramInt2;
/* 499 */       paramInt4 -= i7;
/* 500 */       i5 += i7 * j;
/* 501 */       n += i4 * i7;
/*     */     }
/* 503 */     if (paramInt1 + paramInt3 > s) {
/* 504 */       i7 = paramInt1 + paramInt3 - s;
/* 505 */       paramInt3 -= i7;
/* 506 */       i6 += i7;
/*     */     }
/* 508 */     if (paramInt1 < i) {
/* 509 */       i7 = i - paramInt1;
/* 510 */       paramInt3 -= i7;
/* 511 */       i5 += i7;
/* 512 */       m += i3 * i7;
/* 513 */       i6 += i7;
/*     */     }
/* 515 */     cw(n, this.u, 0, m, n, i5, i6, paramInt3, paramInt4, i3, i4, i, paramInt5);
/*     */   }
/*     */ 
/*     */   static void cl(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/* 271 */     int i = -(paramInt4 >> 2);
/* 272 */     paramInt4 = -(paramInt4 & 0x3);
/* 273 */     for (int j = -paramInt5; j < 0; j++) {
/* 274 */       for (int m = i; m < 0; m++) {
/* 275 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 276 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 277 */           paramInt3++;
/* 278 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 279 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 280 */           paramInt3++;
/* 281 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 282 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 283 */           paramInt3++;
/* 284 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 285 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 286 */           paramInt3++;
/*     */       }
/* 288 */       for (m = paramInt4; m < 0; m++) {
/* 289 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 290 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt3++)] = paramInt1; else
/* 291 */           paramInt3++;
/*     */       }
/* 293 */       paramInt3 += paramInt6;
/* 294 */       paramInt2 += paramInt7;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void ek(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
/*     */   {
/*     */     try
/*     */     {
/* 540 */       int i = -paramInt3 / 2;
/* 541 */       int j = -paramInt4 / 2;
/* 542 */       int m = (int)(Math.sin(paramInt7 / 326.11000000000001D) * 65536.0D);
/* 543 */       int n = (int)(Math.cos(paramInt7 / 326.11000000000001D) * 65536.0D);
/* 544 */       m = m * paramInt8 >> 8;
/* 545 */       n = n * paramInt8 >> 8;
/* 546 */       int i1 = (paramInt5 << 16) + (j * m + i * n);
/* 547 */       int i2 = (paramInt6 << 16) + (j * n - i * m);
/* 548 */       int i3 = paramInt1 + paramInt2 * j;
/* 549 */       for (paramInt2 = 0; paramInt2 < paramInt4; paramInt2++) {
/* 550 */         int i4 = paramArrayOfInt1[paramInt2];
/* 551 */         int i5 = i3 + i4;
/* 552 */         int i6 = i1 + n * i4;
/* 553 */         int i7 = i2 - m * i4;
/* 554 */         for (paramInt1 = -paramArrayOfInt2[paramInt2]; paramInt1 < 0; paramInt1++) {
/* 555 */           n[(i5++)] = this.u[((i6 >> 16) + (i7 >> 16) * this.v)];
/* 556 */           i6 += n;
/* 557 */           i7 -= m;
/*     */         }
/* 559 */         i1 += m;
/* 560 */         i2 += n;
/* 561 */         i3 += j;
/*     */       }
/*     */     } catch (Exception localException) {
/*     */     }
/*     */   }
/*     */ 
/*     */   public void eq(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, double paramDouble, int paramInt7) {
/*     */     try {
/* 569 */       int i = -paramInt3 / 2;
/* 570 */       int j = -paramInt4 / 2;
/* 571 */       int m = (int)(Math.sin(paramDouble) * 65536.0D);
/* 572 */       int n = (int)(Math.cos(paramDouble) * 65536.0D);
/* 573 */       m = m * paramInt7 >> 8;
/* 574 */       n = n * paramInt7 >> 8;
/* 575 */       int i1 = (paramInt5 << 16) + (j * m + i * n);
/* 576 */       int i2 = (paramInt6 << 16) + (j * n - i * m);
/* 577 */       int i3 = paramInt1 + paramInt2 * j;
/* 578 */       for (paramInt2 = 0; paramInt2 < paramInt4; paramInt2++) {
/* 579 */         int i4 = i3;
/* 580 */         int i5 = i1;
/* 581 */         int i6 = i2;
/* 582 */         for (paramInt1 = -paramInt3; paramInt1 < 0; paramInt1++) {
/* 583 */           int i7 = this.u[((i5 >> 16) + (i6 >> 16) * this.v)];
/* 584 */           if (i7 != 0) n[(i4++)] = i7; else
/* 585 */             i4++;
/* 586 */           i5 += n;
/* 587 */           i6 -= m;
/*     */         }
/* 589 */         i1 += m;
/* 590 */         i2 += n;
/* 591 */         i3 += j;
/*     */       }
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/*     */     }
/*     */   }
/*     */ 
/*     */   public void et(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, double paramDouble, int paramInt7)
/*     */   {
/*     */     try
/*     */     {
/* 569 */       int i = -paramInt3 / 2;
/* 570 */       int j = -paramInt4 / 2;
/* 571 */       int m = (int)(Math.sin(paramDouble) * 65536.0D);
/* 572 */       int n = (int)(Math.cos(paramDouble) * 65536.0D);
/* 573 */       m = m * paramInt7 >> 8;
/* 574 */       n = n * paramInt7 >> 8;
/* 575 */       int i1 = (paramInt5 << 16) + (j * m + i * n);
/* 576 */       int i2 = (paramInt6 << 16) + (j * n - i * m);
/* 577 */       int i3 = paramInt1 + paramInt2 * j;
/* 578 */       for (paramInt2 = 0; paramInt2 < paramInt4; paramInt2++) {
/* 579 */         int i4 = i3;
/* 580 */         int i5 = i1;
/* 581 */         int i6 = i2;
/* 582 */         for (paramInt1 = -paramInt3; paramInt1 < 0; paramInt1++) {
/* 583 */           int i7 = this.u[((i5 >> 16) + (i6 >> 16) * this.v)];
/* 584 */           if (i7 != 0) n[(i4++)] = i7; else
/* 585 */             i4++;
/* 586 */           i5 += n;
/* 587 */           i6 -= m;
/*     */         }
/* 589 */         i1 += m;
/* 590 */         i2 += n;
/* 591 */         i3 += j;
/*     */       }
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/*     */     }
/*     */   }
/*     */ 
/*     */   public void ee(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, double paramDouble, int paramInt7)
/*     */   {
/*     */     try
/*     */     {
/* 569 */       int i = -paramInt3 / 2;
/* 570 */       int j = -paramInt4 / 2;
/* 571 */       int m = (int)(Math.sin(paramDouble) * 65536.0D);
/* 572 */       int n = (int)(Math.cos(paramDouble) * 65536.0D);
/* 573 */       m = m * paramInt7 >> 8;
/* 574 */       n = n * paramInt7 >> 8;
/* 575 */       int i1 = (paramInt5 << 16) + (j * m + i * n);
/* 576 */       int i2 = (paramInt6 << 16) + (j * n - i * m);
/* 577 */       int i3 = paramInt1 + paramInt2 * j;
/* 578 */       for (paramInt2 = 0; paramInt2 < paramInt4; paramInt2++) {
/* 579 */         int i4 = i3;
/* 580 */         int i5 = i1;
/* 581 */         int i6 = i2;
/* 582 */         for (paramInt1 = -paramInt3; paramInt1 < 0; paramInt1++) {
/* 583 */           int i7 = this.u[((i5 >> 16) + (i6 >> 16) * this.v)];
/* 584 */           if (i7 != 0) n[(i4++)] = i7; else
/* 585 */             i4++;
/* 586 */           i5 += n;
/* 587 */           i6 -= m;
/*     */         }
/* 589 */         i1 += m;
/* 590 */         i2 += n;
/* 591 */         i3 += j;
/*     */       }
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/*     */     }
/*     */   }
/*     */ 
/*     */   public void ed(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, double paramDouble, int paramInt7)
/*     */   {
/*     */     try
/*     */     {
/* 569 */       int i = -paramInt3 / 2;
/* 570 */       int j = -paramInt4 / 2;
/* 571 */       int m = (int)(Math.sin(paramDouble) * 65536.0D);
/* 572 */       int n = (int)(Math.cos(paramDouble) * 65536.0D);
/* 573 */       m = m * paramInt7 >> 8;
/* 574 */       n = n * paramInt7 >> 8;
/* 575 */       int i1 = (paramInt5 << 16) + (j * m + i * n);
/* 576 */       int i2 = (paramInt6 << 16) + (j * n - i * m);
/* 577 */       int i3 = paramInt1 + paramInt2 * j;
/* 578 */       for (paramInt2 = 0; paramInt2 < paramInt4; paramInt2++) {
/* 579 */         int i4 = i3;
/* 580 */         int i5 = i1;
/* 581 */         int i6 = i2;
/* 582 */         for (paramInt1 = -paramInt3; paramInt1 < 0; paramInt1++) {
/* 583 */           int i7 = this.u[((i5 >> 16) + (i6 >> 16) * this.v)];
/* 584 */           if (i7 != 0) n[(i4++)] = i7; else
/* 585 */             i4++;
/* 586 */           i5 += n;
/* 587 */           i6 -= m;
/*     */         }
/* 589 */         i1 += m;
/* 590 */         i2 += n;
/* 591 */         i3 += j;
/*     */       }
/*     */     } catch (Exception localException) {
/*     */     }
/*     */   }
/*     */ 
/*     */   public void ex(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 598 */     ck(this.y << 3, this.t << 3, paramInt1 << 4, paramInt2 << 4, paramInt3, paramInt4);
/*     */   }
/*     */ 
/*     */   public void dt(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 361 */     if (paramInt3 == 256) {
/* 362 */       cj(paramInt1, paramInt2);
/* 363 */       return;
/*     */     }
/* 365 */     paramInt1 += this.e;
/* 366 */     paramInt2 += this.b;
/* 367 */     int i = paramInt1 + paramInt2 * j;
/* 368 */     int j = 0;
/* 369 */     int m = this.w;
/* 370 */     int n = this.v;
/* 371 */     int i1 = j - n;
/* 372 */     int i2 = 0;
/*     */     int i3;
/* 373 */     if (paramInt2 < g) {
/* 374 */       i3 = g - paramInt2;
/* 375 */       m -= i3;
/* 376 */       paramInt2 = g;
/* 377 */       j += i3 * n;
/* 378 */       i += i3 * j;
/*     */     }
/* 380 */     if (paramInt2 + m > q) m -= paramInt2 + m - q;
/* 381 */     if (paramInt1 < i) {
/* 382 */       i3 = i - paramInt1;
/* 383 */       n -= i3;
/* 384 */       paramInt1 = i;
/* 385 */       j += i3;
/* 386 */       i += i3;
/* 387 */       i2 += i3;
/* 388 */       i1 += i3;
/*     */     }
/* 390 */     if (paramInt1 + n > s) {
/* 391 */       i3 = paramInt1 + n - s;
/* 392 */       n -= i3;
/* 393 */       i2 += i3;
/* 394 */       i1 += i3;
/*     */     }
/* 396 */     if ((n <= 0) || (m <= 0)) return;
/* 397 */     ch(n, this.u, 0, j, i, n, m, i1, i2, paramInt3, paramInt4);
/*     */   }
/*     */ 
/*     */   static void es(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9) {
/* 401 */     int i = 256 - paramInt8;
/* 402 */     int j = (paramInt9 & 0xFF00FF) * i & 0xFF00FF00;
/* 403 */     int m = (paramInt9 & 0xFF00) * i & 0xFF0000;
/* 404 */     paramInt9 = (j | m) >>> 8;
/* 405 */     for (int n = -paramInt5; n < 0; n++) {
/* 406 */       for (int i1 = -paramInt4; i1 < 0; i1++) {
/* 407 */         paramInt1 = paramArrayOfInt2[(paramInt2++)];
/* 408 */         if (paramInt1 != 0) {
/* 409 */           j = (paramInt1 & 0xFF00FF) * paramInt8 & 0xFF00FF00;
/* 410 */           m = (paramInt1 & 0xFF00) * paramInt8 & 0xFF0000;
/* 411 */           paramArrayOfInt1[(paramInt3++)] = (((j | m) >>> 8) + paramInt9);
/*     */         } else {
/* 413 */           paramInt3++;
/*     */         }
/*     */       }
/* 415 */       paramInt3 += paramInt6;
/* 416 */       paramInt2 += paramInt7;
/*     */     }
/*     */   }
/*     */ 
/*     */   public void bp()
/*     */   {
/*  94 */     if ((this.v == this.y) && (this.w == this.t)) return;
/*  95 */     int[] arrayOfInt = new int[this.y * this.t];
/*  96 */     for (int i = 0; i < this.w; i++) {
/*  97 */       for (int j = 0; j < this.v; j++) {
/*  98 */         arrayOfInt[((i + this.b) * this.y + (j + this.e))] = this.u[(i * this.v + j)];
/*     */       }
/*     */     }
/* 101 */     this.u = arrayOfInt;
/* 102 */     this.v = this.y;
/* 103 */     this.w = this.t;
/* 104 */     this.e = 0;
/* 105 */     this.b = 0;
/*     */   }
/*     */ 
/*     */   static void dl(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/* 345 */     int i = paramInt2;
/* 346 */     for (int j = -paramInt7; j < 0; j++) {
/* 347 */       int m = (paramInt3 >> 16) * paramInt10;
/* 348 */       for (int n = -paramInt6; n < 0; n++) {
/* 349 */         paramInt1 = paramArrayOfInt2[((paramInt2 >> 16) + m)];
/* 350 */         if (paramInt1 != 0) paramArrayOfInt1[(paramInt4++)] = paramInt1; else
/* 351 */           paramInt4++;
/* 352 */         paramInt2 += paramInt8;
/*     */       }
/* 354 */       paramInt3 += paramInt9;
/* 355 */       paramInt2 = i;
/* 356 */       paramInt4 += paramInt5;
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     fq
 * JD-Core Version:    0.6.2
 */