/*      */ import java.io.EOFException;
/*      */ import java.io.IOException;
/*      */ 
/*      */ public final class ap
/*      */ {
/*    9 */   v l = null;
/*   10 */   v d = null;
/*      */ 
/*    8 */   static byte[] r = new byte[520];
/*      */   int m;
/*   12 */   int c = -1311507880;
/*      */   public static int w;
/*      */ 
/*      */   boolean q(int paramInt1, byte[] paramArrayOfByte, int paramInt2, boolean paramBoolean)
/*      */   {
/*   70 */     synchronized (this.l)
/*      */     {
/*      */       try
/*      */       {
/*      */         int i;
/*   73 */         if (paramBoolean) {
/*   74 */           if (this.d.l(-145968931) < 6 + paramInt1 * 6) return false;
/*   75 */           this.d.d(paramInt1 * 6);
/*   76 */           this.d.c(r, 0, 6, 1925690116);
/*   77 */           i = (r[5] & 0xFF) + (((r[4] & 0xFF) << 8) + ((r[3] & 0xFF) << 16));
/*   78 */           if ((i <= 0) || (i > this.l.l(-1141415937) / 520L)) return false; 
/*      */         }
/*      */         else
/*      */         {
/*   81 */           i = (int)((this.l.l(-1916363508) + 519L) / 520L);
/*   82 */           if (i == 0) i = 1;
/*      */         }
/*   84 */         r[0] = ((byte)(paramInt2 >> 16));
/*   85 */         r[1] = ((byte)(paramInt2 >> 8));
/*   86 */         r[2] = ((byte)paramInt2);
/*   87 */         r[3] = ((byte)(i >> 16));
/*   88 */         r[4] = ((byte)(i >> 8));
/*   89 */         r[5] = ((byte)i);
/*   90 */         this.d.d(paramInt1 * 6);
/*   91 */         this.d.j(r, 0, 6, (byte)13);
/*   92 */         int j = 0;
/*   93 */         int k = 0;
/*   94 */         while (j < paramInt2) {
/*   95 */           int n = 0;
/*   96 */           if (paramBoolean) {
/*   97 */             this.l.d(i * 520);
/*      */             try {
/*   99 */               this.l.c(r, 0, 8, 2045361771);
/*      */             }
/*      */             catch (EOFException localEOFException) {
/*  102 */               break;
/*      */             }
/*  104 */             i1 = ((r[0] & 0xFF) << 8) + (r[1] & 0xFF);
/*  105 */             int i2 = (r[3] & 0xFF) + ((r[2] & 0xFF) << 8);
/*  106 */             n = (r[6] & 0xFF) + (((r[4] & 0xFF) << 16) + ((r[5] & 0xFF) << 8));
/*  107 */             int i3 = r[7] & 0xFF;
/*  108 */             if ((i1 != paramInt1) || (i2 != k) || (i3 != this.m * 469030651)) return false;
/*  109 */             if ((n < 0) || (n > this.l.l(-1777726536) / 520L)) return false;
/*      */           }
/*  111 */           if (n == 0) {
/*  112 */             paramBoolean = false;
/*  113 */             n = (int)((this.l.l(-908261836) + 519L) / 520L);
/*  114 */             if (n == 0) n++;
/*  115 */             if (n == i) n++;
/*      */           }
/*  117 */           if (paramInt2 - j <= 512) n = 0;
/*  118 */           r[0] = ((byte)(paramInt1 >> 8));
/*  119 */           r[1] = ((byte)paramInt1);
/*  120 */           r[2] = ((byte)(k >> 8));
/*  121 */           r[3] = ((byte)k);
/*  122 */           r[4] = ((byte)(n >> 16));
/*  123 */           r[5] = ((byte)(n >> 8));
/*  124 */           r[6] = ((byte)n);
/*  125 */           r[7] = ((byte)(469030651 * this.m));
/*  126 */           this.l.d(520 * i);
/*  127 */           this.l.j(r, 0, 8, (byte)22);
/*  128 */           int i1 = paramInt2 - j;
/*  129 */           if (i1 > 512) i1 = 512;
/*  130 */           this.l.j(paramArrayOfByte, j, i1, (byte)66);
/*  131 */           j += i1;
/*  132 */           i = n;
/*  133 */           k++;
/*      */         }
/*  135 */         return true;
/*      */       }
/*      */       catch (IOException localIOException) {
/*  138 */         return false;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public boolean d(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
/*      */   {
/*   59 */     synchronized (this.l) {
/*   60 */       if (paramInt2 >= 0) { if (paramInt3 == -1170793213) throw new IllegalStateException(); if (paramInt2 <= this.c * -903999465) break label57; if (paramInt3 == -1170793213); }
/*   61 */       throw new IllegalArgumentException();
/*      */ 
/*   63 */       label57: boolean bool = l(paramInt1, paramArrayOfByte, paramInt2, true, -29653269);
/*   64 */       if (!bool) { if (paramInt3 == -1170793213) throw new IllegalStateException(); bool = l(paramInt1, paramArrayOfByte, paramInt2, false, -383176778); }
/*   65 */       return bool;
/*      */     }
/*      */   }
/*      */ 
/*      */   boolean l(int paramInt1, byte[] paramArrayOfByte, int paramInt2, boolean paramBoolean, int paramInt3) {
/*   70 */     synchronized (this.l)
/*      */     {
/*      */       try
/*      */       {
/*   73 */         int i;
/*   73 */         if (paramBoolean) { if ((paramInt3 <= -1090880349) || 
/*   74 */             (this.d.l(-109611240) < 6 + paramInt1 * 6)) { if (paramInt3 > -1090880349);
/*   74 */             return false; }
/*   75 */           this.d.d(paramInt1 * 6);
/*   76 */           this.d.c(r, 0, 6, 763962683);
/*   77 */           i = (r[5] & 0xFF) + (((r[4] & 0xFF) << 8) + ((r[3] & 0xFF) << 16));
/*   78 */           if (i > 0) { if ((paramInt3 > -1090880349) && (i <= this.l.l(-1754746290) / 520L)) break label217; if (paramInt3 <= -1090880349) throw new IllegalStateException();  } return false;
/*      */         } else
/*      */         {
/*   81 */           i = (int)((this.l.l(-1142261246) + 519L) / 520L);
/*   82 */           if (i == 0) { if (paramInt3 > -1090880349);
/*   82 */             i = 1; }
/*      */         }
/*   84 */         label217: r[0] = ((byte)(paramInt2 >> 16));
/*   85 */         r[1] = ((byte)(paramInt2 >> 8));
/*   86 */         r[2] = ((byte)paramInt2);
/*   87 */         r[3] = ((byte)(i >> 16));
/*   88 */         r[4] = ((byte)(i >> 8));
/*   89 */         r[5] = ((byte)i);
/*   90 */         this.d.d(paramInt1 * 6);
/*   91 */         this.d.j(r, 0, 6, (byte)105);
/*   92 */         int j = 0;
/*   93 */         int k = 0;
/*   94 */         while (j < paramInt2) { if (paramInt3 > -1090880349);
/*   95 */           int n = 0;
/*   96 */           if (paramBoolean) { if (paramInt3 > -1090880349);
/*   97 */             this.l.d(i * 520);
/*      */             try {
/*   99 */               this.l.c(r, 0, 8, 781487686);
/*      */             }
/*      */             catch (EOFException localEOFException) {
/*  102 */               break;
/*      */             }
/*  104 */             i1 = ((r[0] & 0xFF) << 8) + (r[1] & 0xFF);
/*  105 */             int i2 = (r[3] & 0xFF) + ((r[2] & 0xFF) << 8);
/*  106 */             n = (r[6] & 0xFF) + (((r[4] & 0xFF) << 16) + ((r[5] & 0xFF) << 8));
/*  107 */             int i3 = r[7] & 0xFF;
/*  108 */             if (i1 == paramInt1) { if (paramInt3 <= -1090880349) throw new IllegalStateException(); if (i2 == k) { if ((paramInt3 > -1090880349) && (i3 == this.m * 469030651)) break label546; if (paramInt3 <= -1090880349) throw new IllegalStateException();  }  }
/*  108 */             return false;
/*  109 */             label546: if (n >= 0) { if ((paramInt3 > -1090880349) && (n <= this.l.l(-28558245) / 520L)) break label596; if (paramInt3 <= -1090880349); } return false;
/*      */           }
/*  111 */           label596: if (n == 0) { if (paramInt3 > -1090880349);
/*  112 */             paramBoolean = false;
/*  113 */             n = (int)((this.l.l(-252732596) + 519L) / 520L);
/*  114 */             if (n == 0) { if (paramInt3 > -1090880349);
/*  114 */               n++; }
/*  115 */             if (n == i) { if (paramInt3 > -1090880349);
/*  115 */               n++; }
/*      */           }
/*  117 */           if (paramInt2 - j <= 512) { if (paramInt3 > -1090880349);
/*  117 */             n = 0; }
/*  118 */           r[0] = ((byte)(paramInt1 >> 8));
/*  119 */           r[1] = ((byte)paramInt1);
/*  120 */           r[2] = ((byte)(k >> 8));
/*  121 */           r[3] = ((byte)k);
/*  122 */           r[4] = ((byte)(n >> 16));
/*  123 */           r[5] = ((byte)(n >> 8));
/*  124 */           r[6] = ((byte)n);
/*  125 */           r[7] = ((byte)(469030651 * this.m));
/*  126 */           this.l.d(520 * i);
/*  127 */           this.l.j(r, 0, 8, (byte)109);
/*  128 */           int i1 = paramInt2 - j;
/*  129 */           if (i1 > 512) { if (paramInt3 > -1090880349);
/*  129 */             i1 = 512; }
/*  130 */           this.l.j(paramArrayOfByte, j, i1, (byte)79);
/*  131 */           j += i1;
/*  132 */           i = n;
/*  133 */           k++;
/*      */         }
/*  135 */         return true;
/*      */       }
/*      */       catch (IOException localIOException) {
/*  138 */         return false;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public ap(int paramInt1, v paramv1, v paramv2, int paramInt2)
/*      */   {
/*   15 */     this.m = (-15481805 * paramInt1);
/*   16 */     this.l = paramv1;
/*   17 */     this.d = paramv2;
/*   18 */     this.c = (-1013962841 * paramInt2);
/*      */   }
/*      */ 
/*      */   public byte[] m(int paramInt) {
/*   22 */     synchronized (this.l) {
/*      */       try {
/*   24 */         if (this.d.l(-1171629795) < 6 + 6 * paramInt) return null;
/*   25 */         this.d.d(paramInt * 6);
/*   26 */         this.d.c(r, 0, 6, 1113407461);
/*   27 */         int i = ((r[0] & 0xFF) << 16) + ((r[1] & 0xFF) << 8) + (r[2] & 0xFF);
/*   28 */         int j = (r[5] & 0xFF) + (((r[4] & 0xFF) << 8) + ((r[3] & 0xFF) << 16));
/*   29 */         if ((i < 0) || (i > -903999465 * this.c)) return null;
/*   30 */         if ((j <= 0) || (j > this.l.l(-516235205) / 520L)) return null;
/*   31 */         byte[] arrayOfByte = new byte[i];
/*   32 */         int k = 0;
/*   33 */         int n = 0;
/*   34 */         while (k < i) {
/*   35 */           if (j == 0) return null;
/*   36 */           this.l.d(j * 520);
/*   37 */           int i1 = i - k;
/*   38 */           if (i1 > 512) i1 = 512;
/*   39 */           this.l.c(r, 0, 8 + i1, 1305291935);
/*   40 */           int i2 = (r[1] & 0xFF) + ((r[0] & 0xFF) << 8);
/*   41 */           int i3 = ((r[2] & 0xFF) << 8) + (r[3] & 0xFF);
/*   42 */           int i4 = ((r[4] & 0xFF) << 16) + ((r[5] & 0xFF) << 8) + (r[6] & 0xFF);
/*   43 */           int i5 = r[7] & 0xFF;
/*   44 */           if ((paramInt != i2) || (i3 != n) || (i5 != this.m * 469030651)) return null;
/*   45 */           if ((i4 < 0) || (i4 > this.l.l(-927598643) / 520L)) return null;
/*   46 */           for (int i6 = 0; i6 < i1; i6++) arrayOfByte[(k++)] = r[(8 + i6)];
/*   47 */           j = i4;
/*   48 */           n++;
/*      */         }
/*   50 */         return arrayOfByte;
/*      */       }
/*      */       catch (IOException localIOException) {
/*   53 */         return null;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public boolean c(int paramInt1, byte[] paramArrayOfByte, int paramInt2) {
/*   59 */     synchronized (this.l) {
/*   60 */       if ((paramInt2 < 0) || (paramInt2 > this.c * -903999465)) {
/*   61 */         throw new IllegalArgumentException();
/*      */       }
/*   63 */       boolean bool = l(paramInt1, paramArrayOfByte, paramInt2, true, 468777191);
/*   64 */       if (!bool) bool = l(paramInt1, paramArrayOfByte, paramInt2, false, 1542958049);
/*   65 */       return bool;
/*      */     }
/*      */   }
/*      */ 
/*      */   boolean n(int paramInt1, byte[] paramArrayOfByte, int paramInt2, boolean paramBoolean) {
/*   70 */     synchronized (this.l)
/*      */     {
/*      */       try
/*      */       {
/*      */         int i;
/*   73 */         if (paramBoolean) {
/*   74 */           if (this.d.l(-106742852) < 6 + paramInt1 * 6) return false;
/*   75 */           this.d.d(paramInt1 * 6);
/*   76 */           this.d.c(r, 0, 6, 1951812430);
/*   77 */           i = (r[5] & 0xFF) + (((r[4] & 0xFF) << 8) + ((r[3] & 0xFF) << 16));
/*   78 */           if ((i <= 0) || (i > this.l.l(-727282393) / 520L)) return false; 
/*      */         }
/*      */         else
/*      */         {
/*   81 */           i = (int)((this.l.l(-844132090) + 519L) / 520L);
/*   82 */           if (i == 0) i = 1;
/*      */         }
/*   84 */         r[0] = ((byte)(paramInt2 >> 16));
/*   85 */         r[1] = ((byte)(paramInt2 >> 8));
/*   86 */         r[2] = ((byte)paramInt2);
/*   87 */         r[3] = ((byte)(i >> 16));
/*   88 */         r[4] = ((byte)(i >> 8));
/*   89 */         r[5] = ((byte)i);
/*   90 */         this.d.d(paramInt1 * 6);
/*   91 */         this.d.j(r, 0, 6, (byte)125);
/*   92 */         int j = 0;
/*   93 */         int k = 0;
/*   94 */         while (j < paramInt2) {
/*   95 */           int n = 0;
/*   96 */           if (paramBoolean) {
/*   97 */             this.l.d(i * 520);
/*      */             try {
/*   99 */               this.l.c(r, 0, 8, 1449696056);
/*      */             }
/*      */             catch (EOFException localEOFException) {
/*  102 */               break;
/*      */             }
/*  104 */             i1 = ((r[0] & 0xFF) << 8) + (r[1] & 0xFF);
/*  105 */             int i2 = (r[3] & 0xFF) + ((r[2] & 0xFF) << 8);
/*  106 */             n = (r[6] & 0xFF) + (((r[4] & 0xFF) << 16) + ((r[5] & 0xFF) << 8));
/*  107 */             int i3 = r[7] & 0xFF;
/*  108 */             if ((i1 != paramInt1) || (i2 != k) || (i3 != this.m * 469030651)) return false;
/*  109 */             if ((n < 0) || (n > this.l.l(-1814566255) / 520L)) return false;
/*      */           }
/*  111 */           if (n == 0) {
/*  112 */             paramBoolean = false;
/*  113 */             n = (int)((this.l.l(-1185663126) + 519L) / 520L);
/*  114 */             if (n == 0) n++;
/*  115 */             if (n == i) n++;
/*      */           }
/*  117 */           if (paramInt2 - j <= 512) n = 0;
/*  118 */           r[0] = ((byte)(paramInt1 >> 8));
/*  119 */           r[1] = ((byte)paramInt1);
/*  120 */           r[2] = ((byte)(k >> 8));
/*  121 */           r[3] = ((byte)k);
/*  122 */           r[4] = ((byte)(n >> 16));
/*  123 */           r[5] = ((byte)(n >> 8));
/*  124 */           r[6] = ((byte)n);
/*  125 */           r[7] = ((byte)(469030651 * this.m));
/*  126 */           this.l.d(520 * i);
/*  127 */           this.l.j(r, 0, 8, (byte)13);
/*  128 */           int i1 = paramInt2 - j;
/*  129 */           if (i1 > 512) i1 = 512;
/*  130 */           this.l.j(paramArrayOfByte, j, i1, (byte)91);
/*  131 */           j += i1;
/*  132 */           i = n;
/*  133 */           k++;
/*      */         }
/*  135 */         return true;
/*      */       }
/*      */       catch (IOException localIOException) {
/*  138 */         return false;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   boolean j(int paramInt1, byte[] paramArrayOfByte, int paramInt2, boolean paramBoolean)
/*      */   {
/*   70 */     synchronized (this.l)
/*      */     {
/*      */       try
/*      */       {
/*      */         int i;
/*   73 */         if (paramBoolean) {
/*   74 */           if (this.d.l(-1242235311) < 6 + paramInt1 * 6) return false;
/*   75 */           this.d.d(paramInt1 * 6);
/*   76 */           this.d.c(r, 0, 6, 1018535826);
/*   77 */           i = (r[5] & 0xFF) + (((r[4] & 0xFF) << 8) + ((r[3] & 0xFF) << 16));
/*   78 */           if ((i <= 0) || (i > this.l.l(-841913917) / 520L)) return false; 
/*      */         }
/*      */         else
/*      */         {
/*   81 */           i = (int)((this.l.l(-1859634844) + 519L) / 520L);
/*   82 */           if (i == 0) i = 1;
/*      */         }
/*   84 */         r[0] = ((byte)(paramInt2 >> 16));
/*   85 */         r[1] = ((byte)(paramInt2 >> 8));
/*   86 */         r[2] = ((byte)paramInt2);
/*   87 */         r[3] = ((byte)(i >> 16));
/*   88 */         r[4] = ((byte)(i >> 8));
/*   89 */         r[5] = ((byte)i);
/*   90 */         this.d.d(paramInt1 * 6);
/*   91 */         this.d.j(r, 0, 6, (byte)12);
/*   92 */         int j = 0;
/*   93 */         int k = 0;
/*   94 */         while (j < paramInt2) {
/*   95 */           int n = 0;
/*   96 */           if (paramBoolean) {
/*   97 */             this.l.d(i * 520);
/*      */             try {
/*   99 */               this.l.c(r, 0, 8, 1593765992);
/*      */             }
/*      */             catch (EOFException localEOFException) {
/*  102 */               break;
/*      */             }
/*  104 */             i1 = ((r[0] & 0xFF) << 8) + (r[1] & 0xFF);
/*  105 */             int i2 = (r[3] & 0xFF) + ((r[2] & 0xFF) << 8);
/*  106 */             n = (r[6] & 0xFF) + (((r[4] & 0xFF) << 16) + ((r[5] & 0xFF) << 8));
/*  107 */             int i3 = r[7] & 0xFF;
/*  108 */             if ((i1 != paramInt1) || (i2 != k) || (i3 != this.m * 469030651)) return false;
/*  109 */             if ((n < 0) || (n > this.l.l(-147411461) / 520L)) return false;
/*      */           }
/*  111 */           if (n == 0) {
/*  112 */             paramBoolean = false;
/*  113 */             n = (int)((this.l.l(-1899617763) + 519L) / 520L);
/*  114 */             if (n == 0) n++;
/*  115 */             if (n == i) n++;
/*      */           }
/*  117 */           if (paramInt2 - j <= 512) n = 0;
/*  118 */           r[0] = ((byte)(paramInt1 >> 8));
/*  119 */           r[1] = ((byte)paramInt1);
/*  120 */           r[2] = ((byte)(k >> 8));
/*  121 */           r[3] = ((byte)k);
/*  122 */           r[4] = ((byte)(n >> 16));
/*  123 */           r[5] = ((byte)(n >> 8));
/*  124 */           r[6] = ((byte)n);
/*  125 */           r[7] = ((byte)(469030651 * this.m));
/*  126 */           this.l.d(520 * i);
/*  127 */           this.l.j(r, 0, 8, (byte)119);
/*  128 */           int i1 = paramInt2 - j;
/*  129 */           if (i1 > 512) i1 = 512;
/*  130 */           this.l.j(paramArrayOfByte, j, i1, (byte)6);
/*  131 */           j += i1;
/*  132 */           i = n;
/*  133 */           k++;
/*      */         }
/*  135 */         return true;
/*      */       }
/*      */       catch (IOException localIOException) {
/*  138 */         return false;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   boolean i(int paramInt1, byte[] paramArrayOfByte, int paramInt2, boolean paramBoolean)
/*      */   {
/*   70 */     synchronized (this.l)
/*      */     {
/*      */       try
/*      */       {
/*      */         int i;
/*   73 */         if (paramBoolean) {
/*   74 */           if (this.d.l(-436695541) < 6 + paramInt1 * 6) return false;
/*   75 */           this.d.d(paramInt1 * 6);
/*   76 */           this.d.c(r, 0, 6, 2091644539);
/*   77 */           i = (r[5] & 0xFF) + (((r[4] & 0xFF) << 8) + ((r[3] & 0xFF) << 16));
/*   78 */           if ((i <= 0) || (i > this.l.l(-1319397208) / 520L)) return false; 
/*      */         }
/*      */         else
/*      */         {
/*   81 */           i = (int)((this.l.l(-389599510) + 519L) / 520L);
/*   82 */           if (i == 0) i = 1;
/*      */         }
/*   84 */         r[0] = ((byte)(paramInt2 >> 16));
/*   85 */         r[1] = ((byte)(paramInt2 >> 8));
/*   86 */         r[2] = ((byte)paramInt2);
/*   87 */         r[3] = ((byte)(i >> 16));
/*   88 */         r[4] = ((byte)(i >> 8));
/*   89 */         r[5] = ((byte)i);
/*   90 */         this.d.d(paramInt1 * 6);
/*   91 */         this.d.j(r, 0, 6, (byte)74);
/*   92 */         int j = 0;
/*   93 */         int k = 0;
/*   94 */         while (j < paramInt2) {
/*   95 */           int n = 0;
/*   96 */           if (paramBoolean) {
/*   97 */             this.l.d(i * 520);
/*      */             try {
/*   99 */               this.l.c(r, 0, 8, 1966951384);
/*      */             }
/*      */             catch (EOFException localEOFException) {
/*  102 */               break;
/*      */             }
/*  104 */             i1 = ((r[0] & 0xFF) << 8) + (r[1] & 0xFF);
/*  105 */             int i2 = (r[3] & 0xFF) + ((r[2] & 0xFF) << 8);
/*  106 */             n = (r[6] & 0xFF) + (((r[4] & 0xFF) << 16) + ((r[5] & 0xFF) << 8));
/*  107 */             int i3 = r[7] & 0xFF;
/*  108 */             if ((i1 != paramInt1) || (i2 != k) || (i3 != this.m * 469030651)) return false;
/*  109 */             if ((n < 0) || (n > this.l.l(-1101529577) / 520L)) return false;
/*      */           }
/*  111 */           if (n == 0) {
/*  112 */             paramBoolean = false;
/*  113 */             n = (int)((this.l.l(-1424289269) + 519L) / 520L);
/*  114 */             if (n == 0) n++;
/*  115 */             if (n == i) n++;
/*      */           }
/*  117 */           if (paramInt2 - j <= 512) n = 0;
/*  118 */           r[0] = ((byte)(paramInt1 >> 8));
/*  119 */           r[1] = ((byte)paramInt1);
/*  120 */           r[2] = ((byte)(k >> 8));
/*  121 */           r[3] = ((byte)k);
/*  122 */           r[4] = ((byte)(n >> 16));
/*  123 */           r[5] = ((byte)(n >> 8));
/*  124 */           r[6] = ((byte)n);
/*  125 */           r[7] = ((byte)(469030651 * this.m));
/*  126 */           this.l.d(520 * i);
/*  127 */           this.l.j(r, 0, 8, (byte)85);
/*  128 */           int i1 = paramInt2 - j;
/*  129 */           if (i1 > 512) i1 = 512;
/*  130 */           this.l.j(paramArrayOfByte, j, i1, (byte)127);
/*  131 */           j += i1;
/*  132 */           i = n;
/*  133 */           k++;
/*      */         }
/*  135 */         return true;
/*      */       }
/*      */       catch (IOException localIOException) {
/*  138 */         return false;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   boolean g(int paramInt1, byte[] paramArrayOfByte, int paramInt2, boolean paramBoolean)
/*      */   {
/*   70 */     synchronized (this.l)
/*      */     {
/*      */       try
/*      */       {
/*      */         int i;
/*   73 */         if (paramBoolean) {
/*   74 */           if (this.d.l(-1592823389) < 6 + paramInt1 * 6) return false;
/*   75 */           this.d.d(paramInt1 * 6);
/*   76 */           this.d.c(r, 0, 6, 2101609160);
/*   77 */           i = (r[5] & 0xFF) + (((r[4] & 0xFF) << 8) + ((r[3] & 0xFF) << 16));
/*   78 */           if ((i <= 0) || (i > this.l.l(-145343884) / 520L)) return false; 
/*      */         }
/*      */         else
/*      */         {
/*   81 */           i = (int)((this.l.l(-1564717109) + 519L) / 520L);
/*   82 */           if (i == 0) i = 1;
/*      */         }
/*   84 */         r[0] = ((byte)(paramInt2 >> 16));
/*   85 */         r[1] = ((byte)(paramInt2 >> 8));
/*   86 */         r[2] = ((byte)paramInt2);
/*   87 */         r[3] = ((byte)(i >> 16));
/*   88 */         r[4] = ((byte)(i >> 8));
/*   89 */         r[5] = ((byte)i);
/*   90 */         this.d.d(paramInt1 * 6);
/*   91 */         this.d.j(r, 0, 6, (byte)123);
/*   92 */         int j = 0;
/*   93 */         int k = 0;
/*   94 */         while (j < paramInt2) {
/*   95 */           int n = 0;
/*   96 */           if (paramBoolean) {
/*   97 */             this.l.d(i * 520);
/*      */             try {
/*   99 */               this.l.c(r, 0, 8, 1412318343);
/*      */             }
/*      */             catch (EOFException localEOFException) {
/*  102 */               break;
/*      */             }
/*  104 */             i1 = ((r[0] & 0xFF) << 8) + (r[1] & 0xFF);
/*  105 */             int i2 = (r[3] & 0xFF) + ((r[2] & 0xFF) << 8);
/*  106 */             n = (r[6] & 0xFF) + (((r[4] & 0xFF) << 16) + ((r[5] & 0xFF) << 8));
/*  107 */             int i3 = r[7] & 0xFF;
/*  108 */             if ((i1 != paramInt1) || (i2 != k) || (i3 != this.m * 469030651)) return false;
/*  109 */             if ((n < 0) || (n > this.l.l(-1380621813) / 520L)) return false;
/*      */           }
/*  111 */           if (n == 0) {
/*  112 */             paramBoolean = false;
/*  113 */             n = (int)((this.l.l(-296532664) + 519L) / 520L);
/*  114 */             if (n == 0) n++;
/*  115 */             if (n == i) n++;
/*      */           }
/*  117 */           if (paramInt2 - j <= 512) n = 0;
/*  118 */           r[0] = ((byte)(paramInt1 >> 8));
/*  119 */           r[1] = ((byte)paramInt1);
/*  120 */           r[2] = ((byte)(k >> 8));
/*  121 */           r[3] = ((byte)k);
/*  122 */           r[4] = ((byte)(n >> 16));
/*  123 */           r[5] = ((byte)(n >> 8));
/*  124 */           r[6] = ((byte)n);
/*  125 */           r[7] = ((byte)(469030651 * this.m));
/*  126 */           this.l.d(520 * i);
/*  127 */           this.l.j(r, 0, 8, (byte)39);
/*  128 */           int i1 = paramInt2 - j;
/*  129 */           if (i1 > 512) i1 = 512;
/*  130 */           this.l.j(paramArrayOfByte, j, i1, (byte)110);
/*  131 */           j += i1;
/*  132 */           i = n;
/*  133 */           k++;
/*      */         }
/*  135 */         return true;
/*      */       }
/*      */       catch (IOException localIOException) {
/*  138 */         return false;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public byte[] r(int paramInt1, int paramInt2)
/*      */   {
/*   22 */     synchronized (this.l) {
/*      */       try {
/*   24 */         if (this.d.l(-1180095241) < 6 + 6 * paramInt1) { if (paramInt2 >= 250807159) throw new IllegalStateException(); return null; }
/*   25 */         this.d.d(paramInt1 * 6);
/*   26 */         this.d.c(r, 0, 6, 1049594376);
/*   27 */         int i = ((r[0] & 0xFF) << 16) + ((r[1] & 0xFF) << 8) + (r[2] & 0xFF);
/*   28 */         int j = (r[5] & 0xFF) + (((r[4] & 0xFF) << 8) + ((r[3] & 0xFF) << 16));
/*   29 */         if (i >= 0) { if ((paramInt2 < 250807159) && (i <= -903999465 * this.c)) break label191; if (paramInt2 >= 250807159) throw new IllegalStateException();  } return null;
/*   30 */         label191: if (j > 0) { if ((paramInt2 < 250807159) && (j <= this.l.l(-1150796871) / 520L)) break label238; if (paramInt2 >= 250807159); } return null;
/*   31 */         label238: byte[] arrayOfByte = new byte[i];
/*   32 */         int k = 0;
/*   33 */         int n = 0;
/*   34 */         while (k < i) { if (paramInt2 >= 250807159) throw new IllegalStateException();
/*   35 */           if (j == 0) { if (paramInt2 >= 250807159) throw new IllegalStateException(); return null; }
/*   36 */           this.l.d(j * 520);
/*   37 */           int i1 = i - k;
/*   38 */           if (i1 > 512) { if (paramInt2 < 250807159);
/*   38 */             i1 = 512; }
/*   39 */           this.l.c(r, 0, 8 + i1, 1218695896);
/*   40 */           int i2 = (r[1] & 0xFF) + ((r[0] & 0xFF) << 8);
/*   41 */           int i3 = ((r[2] & 0xFF) << 8) + (r[3] & 0xFF);
/*   42 */           int i4 = ((r[4] & 0xFF) << 16) + ((r[5] & 0xFF) << 8) + (r[6] & 0xFF);
/*   43 */           int i5 = r[7] & 0xFF;
/*   44 */           if ((paramInt1 == i2) && ((paramInt2 >= 250807159) || (i3 == n))) { if ((paramInt2 < 250807159) && (i5 == this.m * 469030651)) break label509; if (paramInt2 >= 250807159); } return null;
/*   45 */           label509: if (i4 >= 0) { if (paramInt2 >= 250807159) throw new IllegalStateException(); if (i4 <= this.l.l(-567734331) / 520L) break label561; if (paramInt2 >= 250807159); } return null;
/*   46 */           label561: for (int i6 = 0; i6 < i1; i6++) { if (paramInt2 >= 250807159) throw new IllegalStateException(); arrayOfByte[(k++)] = r[(8 + i6)]; }
/*   47 */           j = i4;
/*   48 */           n++;
/*      */         }
/*   50 */         return arrayOfByte;
/*      */       }
/*      */       catch (IOException localIOException) {
/*   53 */         return null;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   boolean z(int paramInt1, byte[] paramArrayOfByte, int paramInt2, boolean paramBoolean)
/*      */   {
/*   70 */     synchronized (this.l)
/*      */     {
/*      */       try
/*      */       {
/*      */         int i;
/*   73 */         if (paramBoolean) {
/*   74 */           if (this.d.l(-833261810) < 6 + paramInt1 * 6) return false;
/*   75 */           this.d.d(paramInt1 * 6);
/*   76 */           this.d.c(r, 0, 6, 916875463);
/*   77 */           i = (r[5] & 0xFF) + (((r[4] & 0xFF) << 8) + ((r[3] & 0xFF) << 16));
/*   78 */           if ((i <= 0) || (i > this.l.l(-1672790736) / 520L)) return false; 
/*      */         }
/*      */         else
/*      */         {
/*   81 */           i = (int)((this.l.l(-1858720111) + 519L) / 520L);
/*   82 */           if (i == 0) i = 1;
/*      */         }
/*   84 */         r[0] = ((byte)(paramInt2 >> 16));
/*   85 */         r[1] = ((byte)(paramInt2 >> 8));
/*   86 */         r[2] = ((byte)paramInt2);
/*   87 */         r[3] = ((byte)(i >> 16));
/*   88 */         r[4] = ((byte)(i >> 8));
/*   89 */         r[5] = ((byte)i);
/*   90 */         this.d.d(paramInt1 * 6);
/*   91 */         this.d.j(r, 0, 6, (byte)100);
/*   92 */         int j = 0;
/*   93 */         int k = 0;
/*   94 */         while (j < paramInt2) {
/*   95 */           int n = 0;
/*   96 */           if (paramBoolean) {
/*   97 */             this.l.d(i * 520);
/*      */             try {
/*   99 */               this.l.c(r, 0, 8, 1123842115);
/*      */             }
/*      */             catch (EOFException localEOFException) {
/*  102 */               break;
/*      */             }
/*  104 */             i1 = ((r[0] & 0xFF) << 8) + (r[1] & 0xFF);
/*  105 */             int i2 = (r[3] & 0xFF) + ((r[2] & 0xFF) << 8);
/*  106 */             n = (r[6] & 0xFF) + (((r[4] & 0xFF) << 16) + ((r[5] & 0xFF) << 8));
/*  107 */             int i3 = r[7] & 0xFF;
/*  108 */             if ((i1 != paramInt1) || (i2 != k) || (i3 != this.m * 469030651)) return false;
/*  109 */             if ((n < 0) || (n > this.l.l(-1779697126) / 520L)) return false;
/*      */           }
/*  111 */           if (n == 0) {
/*  112 */             paramBoolean = false;
/*  113 */             n = (int)((this.l.l(-1888453748) + 519L) / 520L);
/*  114 */             if (n == 0) n++;
/*  115 */             if (n == i) n++;
/*      */           }
/*  117 */           if (paramInt2 - j <= 512) n = 0;
/*  118 */           r[0] = ((byte)(paramInt1 >> 8));
/*  119 */           r[1] = ((byte)paramInt1);
/*  120 */           r[2] = ((byte)(k >> 8));
/*  121 */           r[3] = ((byte)k);
/*  122 */           r[4] = ((byte)(n >> 16));
/*  123 */           r[5] = ((byte)(n >> 8));
/*  124 */           r[6] = ((byte)n);
/*  125 */           r[7] = ((byte)(469030651 * this.m));
/*  126 */           this.l.d(520 * i);
/*  127 */           this.l.j(r, 0, 8, (byte)107);
/*  128 */           int i1 = paramInt2 - j;
/*  129 */           if (i1 > 512) i1 = 512;
/*  130 */           this.l.j(paramArrayOfByte, j, i1, (byte)88);
/*  131 */           j += i1;
/*  132 */           i = n;
/*  133 */           k++;
/*      */         }
/*  135 */         return true;
/*      */       }
/*      */       catch (IOException localIOException) {
/*  138 */         return false;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void dr(fz paramfz, int paramInt)
/*      */   {
/* 4639 */     if (-940170599 * paramfz.af != client.au * 1513618129) { if (paramInt == 166543467) return; if ((-1 != -1085803875 * paramfz.ah) && ((paramInt == 166543467) || (paramfz.ab * -1548016099 == 0))) { if (paramInt == 166543467) return; if (1 + paramfz.al * 1655903573 <= i.g(paramfz.ah * -1085803875, 0).u[(804831839 * paramfz.ay)]) break label242; if (paramInt == 166543467); } }
/* 4640 */     int i = paramfz.af * -940170599 - 946849601 * paramfz.aw;
/* 4641 */     int j = 1513618129 * client.au - paramfz.aw * 946849601;
/* 4642 */     int k = paramfz.i * -1554910912 + paramfz.au * 854412928;
/* 4643 */     int n = -1982569344 * paramfz.ai + -1554910912 * paramfz.i;
/* 4644 */     int i1 = -1896204928 * paramfz.ax + -1554910912 * paramfz.i;
/* 4645 */     int i2 = -1554910912 * paramfz.i + 1366851712 * paramfz.aj;
/* 4646 */     paramfz.j = (1768526741 * ((k * (i - j) + j * i1) / i));
/* 4647 */     paramfz.z = (-295509745 * ((n * (i - j) + j * i2) / i));
/*      */ 
/* 4649 */     label242: paramfz.bx = 0;
/* 4650 */     if (0 == paramfz.bh * 1949758081) { if (paramInt != 166543467);
/* 4650 */       paramfz.bk = 759301120; }
/* 4651 */     if (paramfz.bh * 1949758081 == 1) { if (paramInt != 166543467);
/* 4651 */       paramfz.bk = 1138951680; }
/* 4652 */     if (paramfz.bh * 1949758081 == 2) { if (paramInt != 166543467);
/* 4652 */       paramfz.bk = 0; }
/* 4653 */     if (3 == paramfz.bh * 1949758081) { if (paramInt == 166543467) return; paramfz.bk = 379650560; }
/* 4654 */     paramfz.g = (paramfz.bk * -624476955);
/*      */   }
/*      */ 
/*      */   static final void ew(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/* 5945 */     Object localObject = null;
/* 5946 */     dn localdn = (dn)client.iv.j();
/* 5947 */     while (localdn != null) { if ((paramInt10 != 1862510102) || 
/* 5948 */         (paramInt1 == localdn.m * -343936653)) { if (paramInt10 != 1862510102) throw new IllegalStateException(); if ((localdn.n * -1854575731 == paramInt2) && ((paramInt10 != 1862510102) || ((localdn.j * 2131749159 == paramInt3) && ((paramInt10 != 1862510102) || (localdn.c * -1555364995 == paramInt4))))) { if (paramInt10 != 1862510102) return;
/* 5949 */           localObject = localdn;
/* 5950 */           break; }
/*      */       }
/* 5952 */       localdn = (dn)client.iv.g();
/*      */     }
/* 5954 */     if (localObject == null) { if (paramInt10 == 1862510102);
/* 5955 */       localObject = new dn();
/* 5956 */       ((dn)localObject).m = (paramInt1 * -1245799493);
/* 5957 */       ((dn)localObject).c = (paramInt4 * -2014851627);
/* 5958 */       ((dn)localObject).n = (paramInt2 * -1531982011);
/* 5959 */       ((dn)localObject).j = (paramInt3 * -1491143017);
/* 5960 */       dc.ek((dn)localObject, -620494182);
/* 5961 */       client.iv.d((dg)localObject);
/*      */     }
/* 5963 */     ((dn)localObject).i = (paramInt5 * -808585575);
/* 5964 */     ((dn)localObject).u = (-391651271 * paramInt6);
/* 5965 */     ((dn)localObject).s = (paramInt7 * -1803982861);
/* 5966 */     ((dn)localObject).v = (-8635973 * paramInt8);
/* 5967 */     ((dn)localObject).w = (-437079793 * paramInt9);
/*      */   }
/*      */ 
/*      */   static String gb(eg parameg, int paramInt)
/*      */   {
/* 9796 */     if (da.d(dn.gg(parameg, (byte)25), -1213874217) == 0) { if (paramInt < 919131240);
/* 9796 */       return null; }
/* 9797 */     if (null != parameg.cj) { if (paramInt >= 919131240) throw new IllegalStateException(); if (parameg.cj.trim().length() != 0) break label75; if (paramInt >= 919131240); }
/* 9798 */     return null;
/*      */ 
/* 9800 */     label75: return parameg.cj;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ap
 * JD-Core Version:    0.6.2
 */