/*     */ public class by
/*     */ {
/*     */   byte[] d;
/*     */   int[] r;
/*     */   int[] l;
/*     */   public static String[] e;
/*     */   static ah cg;
/*     */   static ft fz;
/*     */   public static ch n;
/*     */ 
/*     */   public int d(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3, byte paramByte)
/*     */   {
/* 101 */     if (0 == paramInt3) { if (paramByte == 7) throw new IllegalStateException(); return 0; }
/* 102 */     int i = 0;
/* 103 */     paramInt3 += paramInt2;
/*     */ 
/* 105 */     for (int j = paramInt1; ; j++) {
/* 106 */       int k = paramArrayOfByte1[j];
/*     */ 
/* 108 */       if (k < 0) { if (paramByte == 7) throw new IllegalStateException(); i = this.l[i]; } else {
/* 109 */         i++;
/*     */       }
/* 110 */       int m;
/* 110 */       if ((m = this.l[i]) < 0) { if (paramByte != 7);
/* 111 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 112 */         if (paramInt2 >= paramInt3) { if (paramByte == 7) throw new IllegalStateException(); break; }
/* 113 */         i = 0;
/*     */       }
/* 115 */       if ((k & 0x40) != 0) { if (paramByte != 7);
/* 115 */         i = this.l[i]; } else {
/* 116 */         i++;
/* 117 */       }if ((m = this.l[i]) < 0) { if (paramByte != 7);
/* 118 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 119 */         if (paramInt2 >= paramInt3) { if (paramByte == 7) throw new IllegalStateException(); break; }
/* 120 */         i = 0;
/*     */       }
/* 122 */       if (0 != (k & 0x20)) { if (paramByte == 7) throw new IllegalStateException(); i = this.l[i]; } else {
/* 123 */         i++;
/* 124 */       }if ((m = this.l[i]) < 0) { if (paramByte != 7);
/* 125 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 126 */         if (paramInt2 >= paramInt3) { if (paramByte != 7);
/* 126 */           break; }
/* 127 */         i = 0;
/*     */       }
/* 129 */       if (0 != (k & 0x10)) { if (paramByte == 7) throw new IllegalStateException(); i = this.l[i]; } else {
/* 130 */         i++;
/* 131 */       }if ((m = this.l[i]) < 0) { if (paramByte != 7);
/* 132 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 133 */         if (paramInt2 >= paramInt3) { if (paramByte != 7);
/* 133 */           break; }
/* 134 */         i = 0;
/*     */       }
/* 136 */       if ((k & 0x8) != 0) { if (paramByte == 7) throw new IllegalStateException(); i = this.l[i]; } else {
/* 137 */         i++;
/* 138 */       }if ((m = this.l[i]) < 0) { if (paramByte != 7);
/* 139 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 140 */         if (paramInt2 >= paramInt3) { if (paramByte == 7) throw new IllegalStateException(); break; }
/* 141 */         i = 0;
/*     */       }
/* 143 */       if ((k & 0x4) != 0) { if (paramByte != 7);
/* 143 */         i = this.l[i]; } else {
/* 144 */         i++;
/* 145 */       }if ((m = this.l[i]) < 0) { if (paramByte == 7) throw new IllegalStateException();
/* 146 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 147 */         if (paramInt2 >= paramInt3) { if (paramByte != 7);
/* 147 */           break; }
/* 148 */         i = 0;
/*     */       }
/* 150 */       if (0 != (k & 0x2)) { if (paramByte == 7) throw new IllegalStateException(); i = this.l[i]; } else {
/* 151 */         i++;
/* 152 */       }if ((m = this.l[i]) < 0) { if (paramByte != 7);
/* 153 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 154 */         if (paramInt2 >= paramInt3) { if (paramByte != 7);
/* 154 */           break; }
/* 155 */         i = 0;
/*     */       }
/* 157 */       if (0 != (k & 0x1)) { if (paramByte != 7);
/* 157 */         i = this.l[i]; } else {
/* 158 */         i++;
/* 159 */       }if ((m = this.l[i]) < 0) { if (paramByte != 7);
/* 160 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 161 */         if (paramInt2 >= paramInt3) { if (paramByte == 7) throw new IllegalStateException(); break; }
/* 162 */         i = 0;
/*     */       }
/*     */     }
/* 165 */     return 1 + j - paramInt1;
/*     */   }
/*     */ 
/*     */   public int r(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3, int paramInt4)
/*     */   {
/*  63 */     int i = 0;
/*  64 */     int j = paramInt3 << 3;
/*  65 */     paramInt2 += paramInt1;
/*  66 */     for (; paramInt1 < paramInt2; paramInt1++) { if (paramInt4 <= 1665182881) throw new IllegalStateException();
/*  67 */       int k = paramArrayOfByte1[paramInt1] & 0xFF;
/*  68 */       int m = this.r[k];
/*  69 */       int i1 = this.d[k];
/*  70 */       if (0 == i1) { if (paramInt4 > 1665182881);
/*  70 */         throw new RuntimeException(""); }
/*  71 */       int i2 = j >> 3;
/*  72 */       int i3 = j & 0x7;
/*  73 */       i &= -i3 >> 31;
/*  74 */       int i4 = i2 + (i1 + i3 - 1 >> 3);
/*     */ 
/*  76 */       i3 += 24;
/*     */       int tmp139_138 = (i | m >>> i3); i = tmp139_138; paramArrayOfByte2[i2] = ((byte)tmp139_138);
/*  78 */       if (i2 >= i4) { if (paramInt4 <= 1665182881) throw new IllegalStateException();  } else {
/*  79 */         i2++;
/*  80 */         i3 -= 8;
/*     */         int tmp184_183 = (m >>> i3); i = tmp184_183; paramArrayOfByte2[i2] = ((byte)tmp184_183);
/*  82 */         if (i2 >= i4) { if (paramInt4 <= 1665182881) throw new IllegalStateException();  } else {
/*  83 */           i2++;
/*  84 */           i3 -= 8;
/*     */           int tmp229_228 = (m >>> i3); i = tmp229_228; paramArrayOfByte2[i2] = ((byte)tmp229_228);
/*  86 */           if (i2 >= i4) { if (paramInt4 <= 1665182881); } else {
/*  87 */             i2++;
/*  88 */             i3 -= 8;
/*     */             int tmp269_268 = (m >>> i3); i = tmp269_268; paramArrayOfByte2[i2] = ((byte)tmp269_268);
/*  90 */             if (i2 >= i4) { if (paramInt4 <= 1665182881) throw new IllegalStateException();  } else {
/*  91 */               i2++;
/*  92 */               i3 -= 8;
/*     */               int tmp315_314 = (m << -i3); i = tmp315_314; paramArrayOfByte2[i2] = ((byte)tmp315_314);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*  95 */       j += i1;
/*     */     }
/*  97 */     return (7 + j >> 3) - paramInt3;
/*     */   }
/*     */ 
/*     */   public int j(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3) {
/* 101 */     if (0 == paramInt3) return 0;
/* 102 */     int i = 0;
/* 103 */     paramInt3 += paramInt2;
/*     */ 
/* 105 */     for (int j = paramInt1; ; j++) {
/* 106 */       int k = paramArrayOfByte1[j];
/*     */ 
/* 108 */       if (k < 0) i = this.l[i]; else
/* 109 */         i++;
/*     */       int m;
/* 110 */       if ((m = this.l[i]) < 0) {
/* 111 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 112 */         if (paramInt2 >= paramInt3) break;
/* 113 */         i = 0;
/*     */       }
/* 115 */       if ((k & 0x40) != 0) i = this.l[i]; else
/* 116 */         i++;
/* 117 */       if ((m = this.l[i]) < 0) {
/* 118 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 119 */         if (paramInt2 >= paramInt3) break;
/* 120 */         i = 0;
/*     */       }
/* 122 */       if (0 != (k & 0x20)) i = this.l[i]; else
/* 123 */         i++;
/* 124 */       if ((m = this.l[i]) < 0) {
/* 125 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 126 */         if (paramInt2 >= paramInt3) break;
/* 127 */         i = 0;
/*     */       }
/* 129 */       if (0 != (k & 0x10)) i = this.l[i]; else
/* 130 */         i++;
/* 131 */       if ((m = this.l[i]) < 0) {
/* 132 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 133 */         if (paramInt2 >= paramInt3) break;
/* 134 */         i = 0;
/*     */       }
/* 136 */       if ((k & 0x8) != 0) i = this.l[i]; else
/* 137 */         i++;
/* 138 */       if ((m = this.l[i]) < 0) {
/* 139 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 140 */         if (paramInt2 >= paramInt3) break;
/* 141 */         i = 0;
/*     */       }
/* 143 */       if ((k & 0x4) != 0) i = this.l[i]; else
/* 144 */         i++;
/* 145 */       if ((m = this.l[i]) < 0) {
/* 146 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 147 */         if (paramInt2 >= paramInt3) break;
/* 148 */         i = 0;
/*     */       }
/* 150 */       if (0 != (k & 0x2)) i = this.l[i]; else
/* 151 */         i++;
/* 152 */       if ((m = this.l[i]) < 0) {
/* 153 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 154 */         if (paramInt2 >= paramInt3) break;
/* 155 */         i = 0;
/*     */       }
/* 157 */       if (0 != (k & 0x1)) i = this.l[i]; else
/* 158 */         i++;
/* 159 */       if ((m = this.l[i]) < 0) {
/* 160 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 161 */         if (paramInt2 >= paramInt3) break;
/* 162 */         i = 0;
/*     */       }
/*     */     }
/* 165 */     return 1 + j - paramInt1;
/*     */   }
/*     */ 
/*     */   public by(byte[] paramArrayOfByte)
/*     */   {
/*   9 */     int i = paramArrayOfByte.length;
/*  10 */     this.r = new int[i];
/*  11 */     this.d = paramArrayOfByte;
/*  12 */     int[] arrayOfInt1 = new int[33];
/*  13 */     this.l = new int[8];
/*  14 */     int j = 0;
/*  15 */     for (int k = 0; k < i; k++) {
/*  16 */       int m = paramArrayOfByte[k];
/*  17 */       if (m != 0) {
/*  18 */         int i1 = 1 << 32 - m;
/*  19 */         int i2 = arrayOfInt1[m];
/*  20 */         this.r[k] = i2;
/*     */         int i3;
/*     */         int i6;
/*  22 */         if ((i2 & i1) != 0) { i3 = arrayOfInt1[(m - 1)];
/*     */         } else {
/*  24 */           i3 = i2 | i1;
/*  25 */           for (i4 = m - 1; i4 >= 1; i4--) {
/*  26 */             i5 = arrayOfInt1[i4];
/*  27 */             if (i2 != i5) break;
/*  28 */             i6 = 1 << 32 - i4;
/*  29 */             if ((i5 & i6) != 0) {
/*  30 */               arrayOfInt1[i4] = arrayOfInt1[(i4 - 1)];
/*  31 */               break;
/*     */             }
/*  33 */             arrayOfInt1[i4] = (i5 | i6);
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/*  38 */         arrayOfInt1[m] = i3;
/*  39 */         for (int i4 = 1 + m; i4 <= 32; i4++) {
/*  40 */           if (arrayOfInt1[i4] == i2) arrayOfInt1[i4] = i3;
/*     */         }
/*  42 */         i4 = 0;
/*  43 */         for (int i5 = 0; i5 < m; i5++) {
/*  44 */           i6 = -2147483648 >>> i5;
/*  45 */           if (0 != (i2 & i6)) {
/*  46 */             if (0 == this.l[i4]) this.l[i4] = j;
/*  47 */             i4 = this.l[i4];
/*     */           } else {
/*  49 */             i4++;
/*  50 */           }if (i4 >= this.l.length) {
/*  51 */             int[] arrayOfInt2 = new int[this.l.length * 2];
/*  52 */             for (int i7 = 0; i7 < this.l.length; i7++) arrayOfInt2[i7] = this.l[i7];
/*  53 */             this.l = arrayOfInt2;
/*     */           }
/*  55 */           i6 >>>= 1;
/*     */         }
/*  57 */         this.l[i4] = (k ^ 0xFFFFFFFF);
/*  58 */         if (i4 >= j) j = 1 + i4;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public int m(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
/*     */   {
/* 101 */     if (0 == paramInt3) return 0;
/* 102 */     int i = 0;
/* 103 */     paramInt3 += paramInt2;
/*     */ 
/* 105 */     for (int j = paramInt1; ; j++) {
/* 106 */       int k = paramArrayOfByte1[j];
/*     */ 
/* 108 */       if (k < 0) i = this.l[i]; else
/* 109 */         i++;
/*     */       int m;
/* 110 */       if ((m = this.l[i]) < 0) {
/* 111 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 112 */         if (paramInt2 >= paramInt3) break;
/* 113 */         i = 0;
/*     */       }
/* 115 */       if ((k & 0x40) != 0) i = this.l[i]; else
/* 116 */         i++;
/* 117 */       if ((m = this.l[i]) < 0) {
/* 118 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 119 */         if (paramInt2 >= paramInt3) break;
/* 120 */         i = 0;
/*     */       }
/* 122 */       if (0 != (k & 0x20)) i = this.l[i]; else
/* 123 */         i++;
/* 124 */       if ((m = this.l[i]) < 0) {
/* 125 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 126 */         if (paramInt2 >= paramInt3) break;
/* 127 */         i = 0;
/*     */       }
/* 129 */       if (0 != (k & 0x10)) i = this.l[i]; else
/* 130 */         i++;
/* 131 */       if ((m = this.l[i]) < 0) {
/* 132 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 133 */         if (paramInt2 >= paramInt3) break;
/* 134 */         i = 0;
/*     */       }
/* 136 */       if ((k & 0x8) != 0) i = this.l[i]; else
/* 137 */         i++;
/* 138 */       if ((m = this.l[i]) < 0) {
/* 139 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 140 */         if (paramInt2 >= paramInt3) break;
/* 141 */         i = 0;
/*     */       }
/* 143 */       if ((k & 0x4) != 0) i = this.l[i]; else
/* 144 */         i++;
/* 145 */       if ((m = this.l[i]) < 0) {
/* 146 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 147 */         if (paramInt2 >= paramInt3) break;
/* 148 */         i = 0;
/*     */       }
/* 150 */       if (0 != (k & 0x2)) i = this.l[i]; else
/* 151 */         i++;
/* 152 */       if ((m = this.l[i]) < 0) {
/* 153 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 154 */         if (paramInt2 >= paramInt3) break;
/* 155 */         i = 0;
/*     */       }
/* 157 */       if (0 != (k & 0x1)) i = this.l[i]; else
/* 158 */         i++;
/* 159 */       if ((m = this.l[i]) < 0) {
/* 160 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 161 */         if (paramInt2 >= paramInt3) break;
/* 162 */         i = 0;
/*     */       }
/*     */     }
/* 165 */     return 1 + j - paramInt1;
/*     */   }
/*     */ 
/*     */   public int c(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
/*     */   {
/* 101 */     if (0 == paramInt3) return 0;
/* 102 */     int i = 0;
/* 103 */     paramInt3 += paramInt2;
/*     */ 
/* 105 */     for (int j = paramInt1; ; j++) {
/* 106 */       int k = paramArrayOfByte1[j];
/*     */ 
/* 108 */       if (k < 0) i = this.l[i]; else
/* 109 */         i++;
/*     */       int m;
/* 110 */       if ((m = this.l[i]) < 0) {
/* 111 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 112 */         if (paramInt2 >= paramInt3) break;
/* 113 */         i = 0;
/*     */       }
/* 115 */       if ((k & 0x40) != 0) i = this.l[i]; else
/* 116 */         i++;
/* 117 */       if ((m = this.l[i]) < 0) {
/* 118 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 119 */         if (paramInt2 >= paramInt3) break;
/* 120 */         i = 0;
/*     */       }
/* 122 */       if (0 != (k & 0x20)) i = this.l[i]; else
/* 123 */         i++;
/* 124 */       if ((m = this.l[i]) < 0) {
/* 125 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 126 */         if (paramInt2 >= paramInt3) break;
/* 127 */         i = 0;
/*     */       }
/* 129 */       if (0 != (k & 0x10)) i = this.l[i]; else
/* 130 */         i++;
/* 131 */       if ((m = this.l[i]) < 0) {
/* 132 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 133 */         if (paramInt2 >= paramInt3) break;
/* 134 */         i = 0;
/*     */       }
/* 136 */       if ((k & 0x8) != 0) i = this.l[i]; else
/* 137 */         i++;
/* 138 */       if ((m = this.l[i]) < 0) {
/* 139 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 140 */         if (paramInt2 >= paramInt3) break;
/* 141 */         i = 0;
/*     */       }
/* 143 */       if ((k & 0x4) != 0) i = this.l[i]; else
/* 144 */         i++;
/* 145 */       if ((m = this.l[i]) < 0) {
/* 146 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 147 */         if (paramInt2 >= paramInt3) break;
/* 148 */         i = 0;
/*     */       }
/* 150 */       if (0 != (k & 0x2)) i = this.l[i]; else
/* 151 */         i++;
/* 152 */       if ((m = this.l[i]) < 0) {
/* 153 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 154 */         if (paramInt2 >= paramInt3) break;
/* 155 */         i = 0;
/*     */       }
/* 157 */       if (0 != (k & 0x1)) i = this.l[i]; else
/* 158 */         i++;
/* 159 */       if ((m = this.l[i]) < 0) {
/* 160 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 161 */         if (paramInt2 >= paramInt3) break;
/* 162 */         i = 0;
/*     */       }
/*     */     }
/* 165 */     return 1 + j - paramInt1;
/*     */   }
/*     */ 
/*     */   public int n(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
/*     */   {
/* 101 */     if (0 == paramInt3) return 0;
/* 102 */     int i = 0;
/* 103 */     paramInt3 += paramInt2;
/*     */ 
/* 105 */     for (int j = paramInt1; ; j++) {
/* 106 */       int k = paramArrayOfByte1[j];
/*     */ 
/* 108 */       if (k < 0) i = this.l[i]; else
/* 109 */         i++;
/*     */       int m;
/* 110 */       if ((m = this.l[i]) < 0) {
/* 111 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 112 */         if (paramInt2 >= paramInt3) break;
/* 113 */         i = 0;
/*     */       }
/* 115 */       if ((k & 0x40) != 0) i = this.l[i]; else
/* 116 */         i++;
/* 117 */       if ((m = this.l[i]) < 0) {
/* 118 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 119 */         if (paramInt2 >= paramInt3) break;
/* 120 */         i = 0;
/*     */       }
/* 122 */       if (0 != (k & 0x20)) i = this.l[i]; else
/* 123 */         i++;
/* 124 */       if ((m = this.l[i]) < 0) {
/* 125 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 126 */         if (paramInt2 >= paramInt3) break;
/* 127 */         i = 0;
/*     */       }
/* 129 */       if (0 != (k & 0x10)) i = this.l[i]; else
/* 130 */         i++;
/* 131 */       if ((m = this.l[i]) < 0) {
/* 132 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 133 */         if (paramInt2 >= paramInt3) break;
/* 134 */         i = 0;
/*     */       }
/* 136 */       if ((k & 0x8) != 0) i = this.l[i]; else
/* 137 */         i++;
/* 138 */       if ((m = this.l[i]) < 0) {
/* 139 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 140 */         if (paramInt2 >= paramInt3) break;
/* 141 */         i = 0;
/*     */       }
/* 143 */       if ((k & 0x4) != 0) i = this.l[i]; else
/* 144 */         i++;
/* 145 */       if ((m = this.l[i]) < 0) {
/* 146 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 147 */         if (paramInt2 >= paramInt3) break;
/* 148 */         i = 0;
/*     */       }
/* 150 */       if (0 != (k & 0x2)) i = this.l[i]; else
/* 151 */         i++;
/* 152 */       if ((m = this.l[i]) < 0) {
/* 153 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 154 */         if (paramInt2 >= paramInt3) break;
/* 155 */         i = 0;
/*     */       }
/* 157 */       if (0 != (k & 0x1)) i = this.l[i]; else
/* 158 */         i++;
/* 159 */       if ((m = this.l[i]) < 0) {
/* 160 */         paramArrayOfByte2[(paramInt2++)] = ((byte)(m ^ 0xFFFFFFFF));
/* 161 */         if (paramInt2 >= paramInt3) break;
/* 162 */         i = 0;
/*     */       }
/*     */     }
/* 165 */     return 1 + j - paramInt1;
/*     */   }
/*     */ 
/*     */   public int l(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3)
/*     */   {
/*  63 */     int i = 0;
/*  64 */     int j = paramInt3 << 3;
/*  65 */     paramInt2 += paramInt1;
/*  66 */     for (; paramInt1 < paramInt2; paramInt1++) {
/*  67 */       int k = paramArrayOfByte1[paramInt1] & 0xFF;
/*  68 */       int m = this.r[k];
/*  69 */       int i1 = this.d[k];
/*  70 */       if (0 == i1) throw new RuntimeException("");
/*  71 */       int i2 = j >> 3;
/*  72 */       int i3 = j & 0x7;
/*  73 */       i &= -i3 >> 31;
/*  74 */       int i4 = i2 + (i1 + i3 - 1 >> 3);
/*     */ 
/*  76 */       i3 += 24;
/*     */       int tmp114_113 = (i | m >>> i3); i = tmp114_113; paramArrayOfByte2[i2] = ((byte)tmp114_113);
/*  78 */       if (i2 < i4) {
/*  79 */         i2++;
/*  80 */         i3 -= 8;
/*     */         int tmp144_143 = (m >>> i3); i = tmp144_143; paramArrayOfByte2[i2] = ((byte)tmp144_143);
/*  82 */         if (i2 < i4) {
/*  83 */           i2++;
/*  84 */           i3 -= 8;
/*     */           int tmp174_173 = (m >>> i3); i = tmp174_173; paramArrayOfByte2[i2] = ((byte)tmp174_173);
/*  86 */           if (i2 < i4) {
/*  87 */             i2++;
/*  88 */             i3 -= 8;
/*     */             int tmp204_203 = (m >>> i3); i = tmp204_203; paramArrayOfByte2[i2] = ((byte)tmp204_203);
/*  90 */             if (i2 < i4) {
/*  91 */               i2++;
/*  92 */               i3 -= 8;
/*     */               int tmp235_234 = (m << -i3); i = tmp235_234; paramArrayOfByte2[i2] = ((byte)tmp235_234);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*  95 */       j += i1;
/*     */     }
/*  97 */     return (7 + j >> 3) - paramInt3;
/*     */   }
/*     */ 
/*     */   public static void j(int paramInt)
/*     */   {
/*     */     try
/*     */     {
/*  71 */       if (1 == 153881033 * bd.c) { if (paramInt != 2091097310);
/*  72 */         int i = bd.m.ad((byte)80);
/*  73 */         if ((i > 0) && ((paramInt == 2091097310) || (bd.m.av(-1949614183)))) { if (paramInt == 2091097310) throw new IllegalStateException();
/*  74 */           i -= cl.q * -1176691867;
/*  75 */           if (i < 0) { if (paramInt == 2091097310) throw new IllegalStateException(); i = 0; }
/*  76 */           bd.m.p(i, 2133704066);
/*  77 */           return;
/*     */         }
/*  79 */         bd.m.ap((byte)0);
/*  80 */         bd.m.as(-185364374);
/*  81 */         if (bd.n != null) { if (paramInt != 2091097310);
/*  81 */           bd.c = 1757987058; } else {
/*  82 */           bd.c = 0;
/*  83 */         }bd.s = null;
/*  84 */         dr.u = null; }
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/*  88 */       localException.printStackTrace();
/*  89 */       bd.m.ap((byte)0);
/*  90 */       bd.c = 0;
/*  91 */       bd.s = null;
/*  92 */       dr.u = null;
/*  93 */       bd.n = null; }  } 
/*     */   // ERROR //
/*     */   public static boolean r(byte paramByte) { // Byte code:
/*     */     //   0: ldc 113
/*     */     //   2: invokestatic 118	cm:r	(I)J
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: getstatic 123	bo:l	J
/*     */     //   10: ldc2_w 124
/*     */     //   13: lmul
/*     */     //   14: lsub
/*     */     //   15: l2i
/*     */     //   16: istore_3
/*     */     //   17: ldc2_w 126
/*     */     //   20: lload_1
/*     */     //   21: lmul
/*     */     //   22: putstatic 123	bo:l	J
/*     */     //   25: iload_3
/*     */     //   26: sipush 200
/*     */     //   29: if_icmple +21 -> 50
/*     */     //   32: iload_0
/*     */     //   33: bipush 13
/*     */     //   35: if_icmpgt +11 -> 46
/*     */     //   38: new 21	java/lang/IllegalStateException
/*     */     //   41: dup
/*     */     //   42: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   45: athrow
/*     */     //   46: sipush 200
/*     */     //   49: istore_3
/*     */     //   50: getstatic 131	cu:d	I
/*     */     //   53: ldc 132
/*     */     //   55: iload_3
/*     */     //   56: imul
/*     */     //   57: iadd
/*     */     //   58: putstatic 131	cu:d	I
/*     */     //   61: ldc 133
/*     */     //   63: getstatic 135	cu:s	I
/*     */     //   66: imul
/*     */     //   67: ifne +80 -> 147
/*     */     //   70: iload_0
/*     */     //   71: bipush 13
/*     */     //   73: if_icmpgt +6 -> 79
/*     */     //   76: goto +0 -> 76
/*     */     //   79: ldc 136
/*     */     //   81: getstatic 138	cu:j	I
/*     */     //   84: imul
/*     */     //   85: ifne +62 -> 147
/*     */     //   88: iload_0
/*     */     //   89: bipush 13
/*     */     //   91: if_icmpgt +11 -> 102
/*     */     //   94: new 21	java/lang/IllegalStateException
/*     */     //   97: dup
/*     */     //   98: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   101: athrow
/*     */     //   102: iconst_0
/*     */     //   103: ldc 139
/*     */     //   105: getstatic 140	cu:q	I
/*     */     //   108: imul
/*     */     //   109: if_icmpne +38 -> 147
/*     */     //   112: iload_0
/*     */     //   113: bipush 13
/*     */     //   115: if_icmpgt +11 -> 126
/*     */     //   118: new 21	java/lang/IllegalStateException
/*     */     //   121: dup
/*     */     //   122: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   125: athrow
/*     */     //   126: iconst_0
/*     */     //   127: ldc 141
/*     */     //   129: getstatic 142	cu:c	I
/*     */     //   132: imul
/*     */     //   133: if_icmpne +14 -> 147
/*     */     //   136: iload_0
/*     */     //   137: bipush 13
/*     */     //   139: if_icmpgt +6 -> 145
/*     */     //   142: goto +3 -> 145
/*     */     //   145: iconst_1
/*     */     //   146: ireturn
/*     */     //   147: aconst_null
/*     */     //   148: getstatic 147	g:r	Lam;
/*     */     //   151: if_acmpne +19 -> 170
/*     */     //   154: iload_0
/*     */     //   155: bipush 13
/*     */     //   157: if_icmpgt +11 -> 168
/*     */     //   160: new 21	java/lang/IllegalStateException
/*     */     //   163: dup
/*     */     //   164: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   167: athrow
/*     */     //   168: iconst_0
/*     */     //   169: ireturn
/*     */     //   170: ldc 148
/*     */     //   172: getstatic 131	cu:d	I
/*     */     //   175: imul
/*     */     //   176: sipush 30000
/*     */     //   179: if_icmple +20 -> 199
/*     */     //   182: iload_0
/*     */     //   183: bipush 13
/*     */     //   185: if_icmpgt +6 -> 191
/*     */     //   188: goto +0 -> 188
/*     */     //   191: new 112	java/io/IOException
/*     */     //   194: dup
/*     */     //   195: invokespecial 149	java/io/IOException:<init>	()V
/*     */     //   198: athrow
/*     */     //   199: getstatic 138	cu:j	I
/*     */     //   202: ldc 136
/*     */     //   204: imul
/*     */     //   205: bipush 20
/*     */     //   207: if_icmpge +131 -> 338
/*     */     //   210: iload_0
/*     */     //   211: bipush 13
/*     */     //   213: if_icmpgt +11 -> 224
/*     */     //   216: new 21	java/lang/IllegalStateException
/*     */     //   219: dup
/*     */     //   220: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   223: athrow
/*     */     //   224: getstatic 142	cu:c	I
/*     */     //   227: ldc 141
/*     */     //   229: imul
/*     */     //   230: ifle +108 -> 338
/*     */     //   233: iload_0
/*     */     //   234: bipush 13
/*     */     //   236: if_icmpgt +11 -> 247
/*     */     //   239: new 21	java/lang/IllegalStateException
/*     */     //   242: dup
/*     */     //   243: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   246: athrow
/*     */     //   247: getstatic 152	cu:m	Lcf;
/*     */     //   250: invokevirtual 157	cf:m	()Ldg;
/*     */     //   253: checkcast 159	fl
/*     */     //   256: astore 4
/*     */     //   258: new 161	ev
/*     */     //   261: dup
/*     */     //   262: iconst_4
/*     */     //   263: invokespecial 163	ev:<init>	(I)V
/*     */     //   266: astore 5
/*     */     //   268: aload 5
/*     */     //   270: iconst_1
/*     */     //   271: ldc 164
/*     */     //   273: invokevirtual 166	ev:c	(II)V
/*     */     //   276: aload 5
/*     */     //   278: aload 4
/*     */     //   280: getfield 168	fl:r	J
/*     */     //   283: l2i
/*     */     //   284: bipush 39
/*     */     //   286: invokevirtual 171	ev:j	(IB)V
/*     */     //   289: getstatic 147	g:r	Lam;
/*     */     //   292: aload 5
/*     */     //   294: getfield 173	ev:m	[B
/*     */     //   297: iconst_0
/*     */     //   298: iconst_4
/*     */     //   299: ldc 174
/*     */     //   301: invokevirtual 180	am:z	([BIII)V
/*     */     //   304: getstatic 182	cu:n	Lcf;
/*     */     //   307: aload 4
/*     */     //   309: aload 4
/*     */     //   311: getfield 168	fl:r	J
/*     */     //   314: invokevirtual 185	cf:d	(Ldg;J)V
/*     */     //   317: getstatic 142	cu:c	I
/*     */     //   320: ldc 186
/*     */     //   322: isub
/*     */     //   323: putstatic 142	cu:c	I
/*     */     //   326: getstatic 138	cu:j	I
/*     */     //   329: ldc 187
/*     */     //   331: iadd
/*     */     //   332: putstatic 138	cu:j	I
/*     */     //   335: goto -136 -> 199
/*     */     //   338: ldc 133
/*     */     //   340: getstatic 135	cu:s	I
/*     */     //   343: imul
/*     */     //   344: bipush 20
/*     */     //   346: if_icmpge +131 -> 477
/*     */     //   349: iload_0
/*     */     //   350: bipush 13
/*     */     //   352: if_icmpgt +11 -> 363
/*     */     //   355: new 21	java/lang/IllegalStateException
/*     */     //   358: dup
/*     */     //   359: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   362: athrow
/*     */     //   363: ldc 139
/*     */     //   365: getstatic 140	cu:q	I
/*     */     //   368: imul
/*     */     //   369: ifle +108 -> 477
/*     */     //   372: iload_0
/*     */     //   373: bipush 13
/*     */     //   375: if_icmpgt +6 -> 381
/*     */     //   378: goto +3 -> 381
/*     */     //   381: getstatic 190	cu:z	Lci;
/*     */     //   384: invokevirtual 195	ci:m	()Len;
/*     */     //   387: checkcast 159	fl
/*     */     //   390: astore 4
/*     */     //   392: new 161	ev
/*     */     //   395: dup
/*     */     //   396: iconst_4
/*     */     //   397: invokespecial 163	ev:<init>	(I)V
/*     */     //   400: astore 5
/*     */     //   402: aload 5
/*     */     //   404: iconst_0
/*     */     //   405: ldc 196
/*     */     //   407: invokevirtual 166	ev:c	(II)V
/*     */     //   410: aload 5
/*     */     //   412: aload 4
/*     */     //   414: getfield 168	fl:r	J
/*     */     //   417: l2i
/*     */     //   418: bipush 100
/*     */     //   420: invokevirtual 171	ev:j	(IB)V
/*     */     //   423: getstatic 147	g:r	Lam;
/*     */     //   426: aload 5
/*     */     //   428: getfield 173	ev:m	[B
/*     */     //   431: iconst_0
/*     */     //   432: iconst_4
/*     */     //   433: ldc 197
/*     */     //   435: invokevirtual 180	am:z	([BIII)V
/*     */     //   438: aload 4
/*     */     //   440: invokevirtual 199	fl:c	()V
/*     */     //   443: getstatic 202	cu:i	Lcf;
/*     */     //   446: aload 4
/*     */     //   448: aload 4
/*     */     //   450: getfield 168	fl:r	J
/*     */     //   453: invokevirtual 185	cf:d	(Ldg;J)V
/*     */     //   456: getstatic 140	cu:q	I
/*     */     //   459: ldc 203
/*     */     //   461: isub
/*     */     //   462: putstatic 140	cu:q	I
/*     */     //   465: getstatic 135	cu:s	I
/*     */     //   468: ldc 204
/*     */     //   470: iadd
/*     */     //   471: putstatic 135	cu:s	I
/*     */     //   474: goto -136 -> 338
/*     */     //   477: iconst_0
/*     */     //   478: istore 4
/*     */     //   480: iload 4
/*     */     //   482: bipush 100
/*     */     //   484: if_icmpge +1272 -> 1756
/*     */     //   487: iload_0
/*     */     //   488: bipush 13
/*     */     //   490: if_icmpgt +6 -> 496
/*     */     //   493: goto +0 -> 493
/*     */     //   496: getstatic 147	g:r	Lam;
/*     */     //   499: ldc 205
/*     */     //   501: invokevirtual 208	am:n	(I)I
/*     */     //   504: istore 5
/*     */     //   506: iload 5
/*     */     //   508: ifge +20 -> 528
/*     */     //   511: iload_0
/*     */     //   512: bipush 13
/*     */     //   514: if_icmpgt +6 -> 520
/*     */     //   517: goto +3 -> 520
/*     */     //   520: new 112	java/io/IOException
/*     */     //   523: dup
/*     */     //   524: invokespecial 149	java/io/IOException:<init>	()V
/*     */     //   527: athrow
/*     */     //   528: iload 5
/*     */     //   530: ifne +15 -> 545
/*     */     //   533: iload_0
/*     */     //   534: bipush 13
/*     */     //   536: if_icmpgt +6 -> 542
/*     */     //   539: goto +0 -> 539
/*     */     //   542: goto +1214 -> 1756
/*     */     //   545: iconst_0
/*     */     //   546: putstatic 131	cu:d	I
/*     */     //   549: iconst_0
/*     */     //   550: istore 6
/*     */     //   552: aconst_null
/*     */     //   553: getstatic 214	bx:v	Lfl;
/*     */     //   556: if_acmpne +24 -> 580
/*     */     //   559: iload_0
/*     */     //   560: bipush 13
/*     */     //   562: if_icmpgt +11 -> 573
/*     */     //   565: new 21	java/lang/IllegalStateException
/*     */     //   568: dup
/*     */     //   569: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   572: athrow
/*     */     //   573: bipush 8
/*     */     //   575: istore 6
/*     */     //   577: goto +29 -> 606
/*     */     //   580: ldc 215
/*     */     //   582: getstatic 218	cu:b	I
/*     */     //   585: imul
/*     */     //   586: ifne +20 -> 606
/*     */     //   589: iload_0
/*     */     //   590: bipush 13
/*     */     //   592: if_icmpgt +11 -> 603
/*     */     //   595: new 21	java/lang/IllegalStateException
/*     */     //   598: dup
/*     */     //   599: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   602: athrow
/*     */     //   603: iconst_1
/*     */     //   604: istore 6
/*     */     //   606: iload 6
/*     */     //   608: ifle +500 -> 1108
/*     */     //   611: iload_0
/*     */     //   612: bipush 13
/*     */     //   614: if_icmpgt +11 -> 625
/*     */     //   617: new 21	java/lang/IllegalStateException
/*     */     //   620: dup
/*     */     //   621: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   624: athrow
/*     */     //   625: iload 6
/*     */     //   627: getstatic 222	cu:w	Lev;
/*     */     //   630: getfield 223	ev:c	I
/*     */     //   633: ldc 224
/*     */     //   635: imul
/*     */     //   636: isub
/*     */     //   637: istore 7
/*     */     //   639: iload 7
/*     */     //   641: iload 5
/*     */     //   643: if_icmple +16 -> 659
/*     */     //   646: iload_0
/*     */     //   647: bipush 13
/*     */     //   649: if_icmpgt +6 -> 655
/*     */     //   652: goto +3 -> 655
/*     */     //   655: iload 5
/*     */     //   657: istore 7
/*     */     //   659: getstatic 147	g:r	Lam;
/*     */     //   662: getstatic 222	cu:w	Lev;
/*     */     //   665: getfield 173	ev:m	[B
/*     */     //   668: getstatic 222	cu:w	Lev;
/*     */     //   671: getfield 223	ev:c	I
/*     */     //   674: ldc 224
/*     */     //   676: imul
/*     */     //   677: iload 7
/*     */     //   679: ldc 225
/*     */     //   681: invokevirtual 227	am:j	([BIII)V
/*     */     //   684: iconst_0
/*     */     //   685: getstatic 231	cu:o	B
/*     */     //   688: if_icmpeq +63 -> 751
/*     */     //   691: iload_0
/*     */     //   692: bipush 13
/*     */     //   694: if_icmpgt +6 -> 700
/*     */     //   697: goto +0 -> 697
/*     */     //   700: iconst_0
/*     */     //   701: istore 8
/*     */     //   703: iload 8
/*     */     //   705: iload 7
/*     */     //   707: if_icmpge +44 -> 751
/*     */     //   710: iload_0
/*     */     //   711: bipush 13
/*     */     //   713: if_icmpgt +6 -> 719
/*     */     //   716: goto +3 -> 719
/*     */     //   719: getstatic 222	cu:w	Lev;
/*     */     //   722: getfield 173	ev:m	[B
/*     */     //   725: iload 8
/*     */     //   727: ldc 224
/*     */     //   729: getstatic 222	cu:w	Lev;
/*     */     //   732: getfield 223	ev:c	I
/*     */     //   735: imul
/*     */     //   736: iadd
/*     */     //   737: dup2
/*     */     //   738: baload
/*     */     //   739: getstatic 231	cu:o	B
/*     */     //   742: ixor
/*     */     //   743: i2b
/*     */     //   744: bastore
/*     */     //   745: iinc 8 1
/*     */     //   748: goto -45 -> 703
/*     */     //   751: getstatic 222	cu:w	Lev;
/*     */     //   754: dup
/*     */     //   755: getfield 223	ev:c	I
/*     */     //   758: iload 7
/*     */     //   760: ldc 232
/*     */     //   762: imul
/*     */     //   763: iadd
/*     */     //   764: putfield 223	ev:c	I
/*     */     //   767: getstatic 222	cu:w	Lev;
/*     */     //   770: getfield 223	ev:c	I
/*     */     //   773: ldc 224
/*     */     //   775: imul
/*     */     //   776: iload 6
/*     */     //   778: if_icmpge +15 -> 793
/*     */     //   781: iload_0
/*     */     //   782: bipush 13
/*     */     //   784: if_icmpgt +6 -> 790
/*     */     //   787: goto +0 -> 787
/*     */     //   790: goto +966 -> 1756
/*     */     //   793: getstatic 214	bx:v	Lfl;
/*     */     //   796: ifnonnull +246 -> 1042
/*     */     //   799: iload_0
/*     */     //   800: bipush 13
/*     */     //   802: if_icmpgt +11 -> 813
/*     */     //   805: new 21	java/lang/IllegalStateException
/*     */     //   808: dup
/*     */     //   809: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   812: athrow
/*     */     //   813: getstatic 222	cu:w	Lev;
/*     */     //   816: iconst_0
/*     */     //   817: putfield 223	ev:c	I
/*     */     //   820: getstatic 222	cu:w	Lev;
/*     */     //   823: ldc 233
/*     */     //   825: invokevirtual 236	ev:t	(I)I
/*     */     //   828: istore 8
/*     */     //   830: getstatic 222	cu:w	Lev;
/*     */     //   833: ldc 237
/*     */     //   835: invokevirtual 240	ev:k	(I)I
/*     */     //   838: istore 9
/*     */     //   840: getstatic 222	cu:w	Lev;
/*     */     //   843: ldc 233
/*     */     //   845: invokevirtual 236	ev:t	(I)I
/*     */     //   848: istore 10
/*     */     //   850: getstatic 222	cu:w	Lev;
/*     */     //   853: ldc 241
/*     */     //   855: invokevirtual 244	ev:h	(I)I
/*     */     //   858: istore 11
/*     */     //   860: iload 9
/*     */     //   862: iload 8
/*     */     //   864: bipush 16
/*     */     //   866: ishl
/*     */     //   867: iadd
/*     */     //   868: i2l
/*     */     //   869: lstore 12
/*     */     //   871: getstatic 182	cu:n	Lcf;
/*     */     //   874: lload 12
/*     */     //   876: invokevirtual 247	cf:r	(J)Ldg;
/*     */     //   879: checkcast 159	fl
/*     */     //   882: astore 14
/*     */     //   884: iconst_1
/*     */     //   885: putstatic 250	cu:u	Z
/*     */     //   888: aconst_null
/*     */     //   889: aload 14
/*     */     //   891: if_acmpne +34 -> 925
/*     */     //   894: iload_0
/*     */     //   895: bipush 13
/*     */     //   897: if_icmpgt +11 -> 908
/*     */     //   900: new 21	java/lang/IllegalStateException
/*     */     //   903: dup
/*     */     //   904: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   907: athrow
/*     */     //   908: getstatic 202	cu:i	Lcf;
/*     */     //   911: lload 12
/*     */     //   913: invokevirtual 247	cf:r	(J)Ldg;
/*     */     //   916: checkcast 159	fl
/*     */     //   919: astore 14
/*     */     //   921: iconst_0
/*     */     //   922: putstatic 250	cu:u	Z
/*     */     //   925: aload 14
/*     */     //   927: ifnonnull +25 -> 952
/*     */     //   930: iload_0
/*     */     //   931: bipush 13
/*     */     //   933: if_icmpgt +11 -> 944
/*     */     //   936: new 21	java/lang/IllegalStateException
/*     */     //   939: dup
/*     */     //   940: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   943: athrow
/*     */     //   944: new 112	java/io/IOException
/*     */     //   947: dup
/*     */     //   948: invokespecial 149	java/io/IOException:<init>	()V
/*     */     //   951: athrow
/*     */     //   952: iload 10
/*     */     //   954: ifne +21 -> 975
/*     */     //   957: iload_0
/*     */     //   958: bipush 13
/*     */     //   960: if_icmpgt +11 -> 971
/*     */     //   963: new 21	java/lang/IllegalStateException
/*     */     //   966: dup
/*     */     //   967: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   970: athrow
/*     */     //   971: iconst_5
/*     */     //   972: goto +5 -> 977
/*     */     //   975: bipush 9
/*     */     //   977: istore 15
/*     */     //   979: aload 14
/*     */     //   981: putstatic 214	bx:v	Lfl;
/*     */     //   984: new 161	ev
/*     */     //   987: dup
/*     */     //   988: iload 15
/*     */     //   990: iload 11
/*     */     //   992: iadd
/*     */     //   993: getstatic 214	bx:v	Lfl;
/*     */     //   996: getfield 252	fl:z	B
/*     */     //   999: iadd
/*     */     //   1000: invokespecial 163	ev:<init>	(I)V
/*     */     //   1003: putstatic 254	cu:e	Lev;
/*     */     //   1006: getstatic 254	cu:e	Lev;
/*     */     //   1009: iload 10
/*     */     //   1011: ldc 255
/*     */     //   1013: invokevirtual 166	ev:c	(II)V
/*     */     //   1016: getstatic 254	cu:e	Lev;
/*     */     //   1019: iload 11
/*     */     //   1021: bipush 86
/*     */     //   1023: invokevirtual 257	ev:z	(IB)V
/*     */     //   1026: ldc_w 258
/*     */     //   1029: putstatic 218	cu:b	I
/*     */     //   1032: getstatic 222	cu:w	Lev;
/*     */     //   1035: iconst_0
/*     */     //   1036: putfield 223	ev:c	I
/*     */     //   1039: goto +711 -> 1750
/*     */     //   1042: iconst_0
/*     */     //   1043: ldc 215
/*     */     //   1045: getstatic 218	cu:b	I
/*     */     //   1048: imul
/*     */     //   1049: if_icmpne +56 -> 1105
/*     */     //   1052: iload_0
/*     */     //   1053: bipush 13
/*     */     //   1055: if_icmpgt +6 -> 1061
/*     */     //   1058: goto +0 -> 1058
/*     */     //   1061: getstatic 222	cu:w	Lev;
/*     */     //   1064: getfield 173	ev:m	[B
/*     */     //   1067: iconst_0
/*     */     //   1068: baload
/*     */     //   1069: iconst_m1
/*     */     //   1070: if_icmpne +28 -> 1098
/*     */     //   1073: iload_0
/*     */     //   1074: bipush 13
/*     */     //   1076: if_icmpgt +6 -> 1082
/*     */     //   1079: goto +0 -> 1079
/*     */     //   1082: ldc_w 259
/*     */     //   1085: putstatic 218	cu:b	I
/*     */     //   1088: getstatic 222	cu:w	Lev;
/*     */     //   1091: iconst_0
/*     */     //   1092: putfield 223	ev:c	I
/*     */     //   1095: goto +655 -> 1750
/*     */     //   1098: aconst_null
/*     */     //   1099: putstatic 214	bx:v	Lfl;
/*     */     //   1102: goto +648 -> 1750
/*     */     //   1105: goto +645 -> 1750
/*     */     //   1108: getstatic 254	cu:e	Lev;
/*     */     //   1111: getfield 173	ev:m	[B
/*     */     //   1114: arraylength
/*     */     //   1115: getstatic 214	bx:v	Lfl;
/*     */     //   1118: getfield 252	fl:z	B
/*     */     //   1121: isub
/*     */     //   1122: istore 7
/*     */     //   1124: sipush 512
/*     */     //   1127: ldc 215
/*     */     //   1129: getstatic 218	cu:b	I
/*     */     //   1132: imul
/*     */     //   1133: isub
/*     */     //   1134: istore 8
/*     */     //   1136: iload 8
/*     */     //   1138: iload 7
/*     */     //   1140: getstatic 254	cu:e	Lev;
/*     */     //   1143: getfield 223	ev:c	I
/*     */     //   1146: ldc 224
/*     */     //   1148: imul
/*     */     //   1149: isub
/*     */     //   1150: if_icmple +31 -> 1181
/*     */     //   1153: iload_0
/*     */     //   1154: bipush 13
/*     */     //   1156: if_icmpgt +11 -> 1167
/*     */     //   1159: new 21	java/lang/IllegalStateException
/*     */     //   1162: dup
/*     */     //   1163: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   1166: athrow
/*     */     //   1167: iload 7
/*     */     //   1169: ldc 224
/*     */     //   1171: getstatic 254	cu:e	Lev;
/*     */     //   1174: getfield 223	ev:c	I
/*     */     //   1177: imul
/*     */     //   1178: isub
/*     */     //   1179: istore 8
/*     */     //   1181: iload 8
/*     */     //   1183: iload 5
/*     */     //   1185: if_icmple +21 -> 1206
/*     */     //   1188: iload_0
/*     */     //   1189: bipush 13
/*     */     //   1191: if_icmpgt +11 -> 1202
/*     */     //   1194: new 21	java/lang/IllegalStateException
/*     */     //   1197: dup
/*     */     //   1198: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   1201: athrow
/*     */     //   1202: iload 5
/*     */     //   1204: istore 8
/*     */     //   1206: getstatic 147	g:r	Lam;
/*     */     //   1209: getstatic 254	cu:e	Lev;
/*     */     //   1212: getfield 173	ev:m	[B
/*     */     //   1215: ldc 224
/*     */     //   1217: getstatic 254	cu:e	Lev;
/*     */     //   1220: getfield 223	ev:c	I
/*     */     //   1223: imul
/*     */     //   1224: iload 8
/*     */     //   1226: ldc_w 260
/*     */     //   1229: invokevirtual 227	am:j	([BIII)V
/*     */     //   1232: iconst_0
/*     */     //   1233: getstatic 231	cu:o	B
/*     */     //   1236: if_icmpeq +73 -> 1309
/*     */     //   1239: iload_0
/*     */     //   1240: bipush 13
/*     */     //   1242: if_icmpgt +11 -> 1253
/*     */     //   1245: new 21	java/lang/IllegalStateException
/*     */     //   1248: dup
/*     */     //   1249: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   1252: athrow
/*     */     //   1253: iconst_0
/*     */     //   1254: istore 9
/*     */     //   1256: iload 9
/*     */     //   1258: iload 8
/*     */     //   1260: if_icmpge +49 -> 1309
/*     */     //   1263: iload_0
/*     */     //   1264: bipush 13
/*     */     //   1266: if_icmpgt +11 -> 1277
/*     */     //   1269: new 21	java/lang/IllegalStateException
/*     */     //   1272: dup
/*     */     //   1273: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   1276: athrow
/*     */     //   1277: getstatic 254	cu:e	Lev;
/*     */     //   1280: getfield 173	ev:m	[B
/*     */     //   1283: iload 9
/*     */     //   1285: getstatic 254	cu:e	Lev;
/*     */     //   1288: getfield 223	ev:c	I
/*     */     //   1291: ldc 224
/*     */     //   1293: imul
/*     */     //   1294: iadd
/*     */     //   1295: dup2
/*     */     //   1296: baload
/*     */     //   1297: getstatic 231	cu:o	B
/*     */     //   1300: ixor
/*     */     //   1301: i2b
/*     */     //   1302: bastore
/*     */     //   1303: iinc 9 1
/*     */     //   1306: goto -50 -> 1256
/*     */     //   1309: getstatic 254	cu:e	Lev;
/*     */     //   1312: dup
/*     */     //   1313: getfield 223	ev:c	I
/*     */     //   1316: iload 8
/*     */     //   1318: ldc 232
/*     */     //   1320: imul
/*     */     //   1321: iadd
/*     */     //   1322: putfield 223	ev:c	I
/*     */     //   1325: getstatic 218	cu:b	I
/*     */     //   1328: ldc_w 259
/*     */     //   1331: iload 8
/*     */     //   1333: imul
/*     */     //   1334: iadd
/*     */     //   1335: putstatic 218	cu:b	I
/*     */     //   1338: iload 7
/*     */     //   1340: getstatic 254	cu:e	Lev;
/*     */     //   1343: getfield 223	ev:c	I
/*     */     //   1346: ldc 224
/*     */     //   1348: imul
/*     */     //   1349: if_icmpne +376 -> 1725
/*     */     //   1352: iload_0
/*     */     //   1353: bipush 13
/*     */     //   1355: if_icmpgt +6 -> 1361
/*     */     //   1358: goto +0 -> 1358
/*     */     //   1361: ldc2_w 261
/*     */     //   1364: getstatic 214	bx:v	Lfl;
/*     */     //   1367: getfield 168	fl:r	J
/*     */     //   1370: lcmp
/*     */     //   1371: ifne +124 -> 1495
/*     */     //   1374: iload_0
/*     */     //   1375: bipush 13
/*     */     //   1377: if_icmpgt +6 -> 1383
/*     */     //   1380: goto +3 -> 1383
/*     */     //   1383: getstatic 254	cu:e	Lev;
/*     */     //   1386: putstatic 267	ab:f	Lev;
/*     */     //   1389: iconst_0
/*     */     //   1390: istore 9
/*     */     //   1392: iload 9
/*     */     //   1394: sipush 256
/*     */     //   1397: if_icmpge +95 -> 1492
/*     */     //   1400: iload_0
/*     */     //   1401: bipush 13
/*     */     //   1403: if_icmpgt +6 -> 1409
/*     */     //   1406: goto +0 -> 1406
/*     */     //   1409: getstatic 270	cu:k	[Ldq;
/*     */     //   1412: iload 9
/*     */     //   1414: aaload
/*     */     //   1415: astore 10
/*     */     //   1417: aload 10
/*     */     //   1419: ifnull +67 -> 1486
/*     */     //   1422: iload_0
/*     */     //   1423: bipush 13
/*     */     //   1425: if_icmpgt +11 -> 1436
/*     */     //   1428: new 21	java/lang/IllegalStateException
/*     */     //   1431: dup
/*     */     //   1432: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   1435: athrow
/*     */     //   1436: getstatic 267	ab:f	Lev;
/*     */     //   1439: ldc_w 273
/*     */     //   1442: iload 9
/*     */     //   1444: ldc_w 274
/*     */     //   1447: imul
/*     */     //   1448: iadd
/*     */     //   1449: putfield 223	ev:c	I
/*     */     //   1452: getstatic 267	ab:f	Lev;
/*     */     //   1455: ldc_w 275
/*     */     //   1458: invokevirtual 244	ev:h	(I)I
/*     */     //   1461: istore 11
/*     */     //   1463: getstatic 267	ab:f	Lev;
/*     */     //   1466: ldc_w 276
/*     */     //   1469: invokevirtual 244	ev:h	(I)I
/*     */     //   1472: istore 12
/*     */     //   1474: aload 10
/*     */     //   1476: iload 11
/*     */     //   1478: iload 12
/*     */     //   1480: ldc_w 277
/*     */     //   1483: invokevirtual 281	dq:bq	(III)V
/*     */     //   1486: iinc 9 1
/*     */     //   1489: goto -97 -> 1392
/*     */     //   1492: goto +176 -> 1668
/*     */     //   1495: getstatic 284	cu:t	Ljava/util/zip/CRC32;
/*     */     //   1498: invokevirtual 289	java/util/zip/CRC32:reset	()V
/*     */     //   1501: getstatic 284	cu:t	Ljava/util/zip/CRC32;
/*     */     //   1504: getstatic 254	cu:e	Lev;
/*     */     //   1507: getfield 173	ev:m	[B
/*     */     //   1510: iconst_0
/*     */     //   1511: iload 7
/*     */     //   1513: invokevirtual 293	java/util/zip/CRC32:update	([BII)V
/*     */     //   1516: getstatic 284	cu:t	Ljava/util/zip/CRC32;
/*     */     //   1519: invokevirtual 297	java/util/zip/CRC32:getValue	()J
/*     */     //   1522: l2i
/*     */     //   1523: istore 9
/*     */     //   1525: iload 9
/*     */     //   1527: ldc_w 298
/*     */     //   1530: getstatic 214	bx:v	Lfl;
/*     */     //   1533: getfield 299	fl:j	I
/*     */     //   1536: imul
/*     */     //   1537: if_icmpeq +61 -> 1598
/*     */     //   1540: iload_0
/*     */     //   1541: bipush 13
/*     */     //   1543: if_icmpgt +11 -> 1554
/*     */     //   1546: new 21	java/lang/IllegalStateException
/*     */     //   1549: dup
/*     */     //   1550: invokespecial 25	java/lang/IllegalStateException:<init>	()V
/*     */     //   1553: athrow
/*     */     //   1554: getstatic 147	g:r	Lam;
/*     */     //   1557: ldc_w 300
/*     */     //   1560: invokevirtual 302	am:m	(I)V
/*     */     //   1563: goto +5 -> 1568
/*     */     //   1566: astore 10
/*     */     //   1568: getstatic 305	cu:a	I
/*     */     //   1571: ldc_w 306
/*     */     //   1574: iadd
/*     */     //   1575: putstatic 305	cu:a	I
/*     */     //   1578: aconst_null
/*     */     //   1579: putstatic 147	g:r	Lam;
/*     */     //   1582: invokestatic 312	java/lang/Math:random	()D
/*     */     //   1585: ldc2_w 313
/*     */     //   1588: dmul
/*     */     //   1589: dconst_1
/*     */     //   1590: dadd
/*     */     //   1591: d2i
/*     */     //   1592: i2b
/*     */     //   1593: putstatic 231	cu:o	B
/*     */     //   1596: iconst_0
/*     */     //   1597: ireturn
/*     */     //   1598: iconst_0
/*     */     //   1599: putstatic 305	cu:a	I
/*     */     //   1602: iconst_0
/*     */     //   1603: putstatic 316	cu:h	I
/*     */     //   1606: getstatic 214	bx:v	Lfl;
/*     */     //   1609: getfield 319	fl:n	Ldq;
/*     */     //   1612: getstatic 214	bx:v	Lfl;
/*     */     //   1615: getfield 168	fl:r	J
/*     */     //   1618: ldc2_w 320
/*     */     //   1621: land
/*     */     //   1622: l2i
/*     */     //   1623: getstatic 254	cu:e	Lev;
/*     */     //   1626: getfield 173	ev:m	[B
/*     */     //   1629: ldc2_w 322
/*     */     //   1632: getstatic 214	bx:v	Lfl;
/*     */     //   1635: getfield 168	fl:r	J
/*     */     //   1638: ldc2_w 322
/*     */     //   1641: land
/*     */     //   1642: lcmp
/*     */     //   1643: ifne +16 -> 1659
/*     */     //   1646: iload_0
/*     */     //   1647: bipush 13
/*     */     //   1649: if_icmpgt +6 -> 1655
/*     */     //   1652: goto +3 -> 1655
/*     */     //   1655: iconst_1
/*     */     //   1656: goto +4 -> 1660
/*     */     //   1659: iconst_0
/*     */     //   1660: getstatic 250	cu:u	Z
/*     */     //   1663: bipush 124
/*     */     //   1665: invokevirtual 327	dq:bj	(I[BZZB)V
/*     */     //   1668: getstatic 214	bx:v	Lfl;
/*     */     //   1671: invokevirtual 329	fl:r	()V
/*     */     //   1674: getstatic 250	cu:u	Z
/*     */     //   1677: ifeq +24 -> 1701
/*     */     //   1680: iload_0
/*     */     //   1681: bipush 13
/*     */     //   1683: if_icmpgt +6 -> 1689
/*     */     //   1686: goto +0 -> 1686
/*     */     //   1689: getstatic 138	cu:j	I
/*     */     //   1692: ldc 187
/*     */     //   1694: isub
/*     */     //   1695: putstatic 138	cu:j	I
/*     */     //   1698: goto +12 -> 1710
/*     */     //   1701: getstatic 135	cu:s	I
/*     */     //   1704: ldc 204
/*     */     //   1706: isub
/*     */     //   1707: putstatic 135	cu:s	I
/*     */     //   1710: iconst_0
/*     */     //   1711: putstatic 218	cu:b	I
/*     */     //   1714: aconst_null
/*     */     //   1715: putstatic 214	bx:v	Lfl;
/*     */     //   1718: aconst_null
/*     */     //   1719: putstatic 254	cu:e	Lev;
/*     */     //   1722: goto +28 -> 1750
/*     */     //   1725: ldc 215
/*     */     //   1727: getstatic 218	cu:b	I
/*     */     //   1730: imul
/*     */     //   1731: sipush 512
/*     */     //   1734: if_icmpne +22 -> 1756
/*     */     //   1737: iload_0
/*     */     //   1738: bipush 13
/*     */     //   1740: if_icmpgt +6 -> 1746
/*     */     //   1743: goto +0 -> 1743
/*     */     //   1746: iconst_0
/*     */     //   1747: putstatic 218	cu:b	I
/*     */     //   1750: iinc 4 1
/*     */     //   1753: goto -1273 -> 480
/*     */     //   1756: iconst_1
/*     */     //   1757: ireturn
/*     */     //   1758: astore 4
/*     */     //   1760: getstatic 147	g:r	Lam;
/*     */     //   1763: ldc_w 330
/*     */     //   1766: invokevirtual 302	am:m	(I)V
/*     */     //   1769: goto +5 -> 1774
/*     */     //   1772: astore 5
/*     */     //   1774: getstatic 316	cu:h	I
/*     */     //   1777: ldc_w 331
/*     */     //   1780: iadd
/*     */     //   1781: putstatic 316	cu:h	I
/*     */     //   1784: aconst_null
/*     */     //   1785: putstatic 147	g:r	Lam;
/*     */     //   1788: iconst_0
/*     */     //   1789: ireturn
/*     */     //
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   1554	1563	1566	java/lang/Exception
/*     */     //   170	1757	1758	java/io/IOException
/*     */     //   1760	1769	1772	java/lang/Exception } 
/* 261 */   static void m(dq paramdq, int paramInt1, int paramInt2, int paramInt3, byte paramByte, boolean paramBoolean, int paramInt4) { long l1 = (paramInt1 << 16) + paramInt2;
/* 262 */     fl localfl = (fl)cu.m.r(l1);
/* 263 */     if (null != localfl) { if (paramInt4 <= -684708029) throw new IllegalStateException(); return; }
/* 264 */     localfl = (fl)cu.n.r(l1);
/* 265 */     if (null != localfl) { if (paramInt4 > -684708029);
/* 265 */       return; }
/* 266 */     localfl = (fl)cu.g.r(l1);
/* 267 */     if (localfl != null) { if (paramInt4 <= -684708029) throw new IllegalStateException();
/* 268 */       if (paramBoolean) { if (paramInt4 > -684708029);
/* 269 */         localfl.c();
/* 270 */         cu.m.d(localfl, l1);
/* 271 */         cu.q -= -2026180679;
/* 272 */         cu.c += -1625805387;
/*     */       }
/* 274 */       return;
/*     */     }
/* 276 */     if (!paramBoolean) { if (paramInt4 <= -684708029) return;
/* 277 */       localfl = (fl)cu.i.r(l1);
/* 278 */       if (null != localfl) { if (paramInt4 <= -684708029) throw new IllegalStateException(); return; }
/*     */     }
/* 280 */     localfl = new fl();
/* 281 */     localfl.n = paramdq;
/* 282 */     localfl.j = (1105346871 * paramInt3);
/* 283 */     localfl.z = paramByte;
/* 284 */     if (paramBoolean) { if (paramInt4 > -684708029);
/* 285 */       cu.m.d(localfl, l1);
/* 286 */       cu.c += -1625805387;
/*     */     } else
/*     */     {
/* 289 */       cu.z.r(localfl);
/* 290 */       cu.g.d(localfl, l1);
/* 291 */       cu.q += -2026180679;
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void z(ch paramch1, ch paramch2, byte paramByte)
/*     */   {
/*  53 */     em.n = paramch1;
/*  54 */     dy.j = paramch2;
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     by
 * JD-Core Version:    0.6.2
 */