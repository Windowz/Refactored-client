/*      */ public abstract class aa
/*      */ {
/*      */   public static int j;
/*      */   static dq cs;
/*      */ 
/*      */   abstract int j(int paramInt1, int paramInt2);
/*      */ 
/*      */   abstract void l();
/*      */ 
/*      */   abstract int d(int paramInt1, int paramInt2, byte paramByte);
/*      */ 
/*      */   abstract void r(int paramInt);
/*      */ 
/*      */   abstract void m();
/*      */ 
/*      */   abstract int c(int paramInt1, int paramInt2);
/*      */ 
/*      */   abstract int n(int paramInt1, int paramInt2);
/*      */ 
/*      */   static final void m(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, ck[] paramArrayOfck, byte paramByte)
/*      */   {
/*   94 */     for (int i = 0; i < 8; i++) { if (paramByte != 84);
/*   95 */       for (k = 0; k < 8; k++) if ((paramByte == 84) || (
/*   96 */           (i + paramInt2 > 0) && ((paramByte == 84) || ((i + paramInt2 < 103) && ((paramByte == 84) || (k + paramInt3 > 0)))))) { if (paramByte == 84) throw new IllegalStateException(); if (k + paramInt3 < 103) { if (paramByte != 84);
/*   96 */             paramArrayOfck[paramInt1].az[(i + paramInt2)][(k + paramInt3)] &= -16777217; }
/*      */         }
/*      */     }
/*   99 */     ev localev1 = new ev(paramArrayOfByte);
/*  100 */     for (int k = 0; k < 4; k++) { if (paramByte == 84) return;
/*  101 */       for (int m = 0; m < 64; m++) { if (paramByte != 84);
/*  102 */         for (int n = 0; n < 64; n++) { if ((paramByte == 84) || 
/*  103 */             (k == paramInt4)) { if (paramByte == 84) throw new IllegalStateException(); if (m >= paramInt5) { if (paramByte == 84) throw new IllegalStateException(); if ((m < paramInt5 + 8) && ((paramByte == 84) || ((n >= paramInt6) && ((paramByte == 84) || (n < 8 + paramInt6))))) { if (paramByte != 84);
/*  104 */                 ev localev2 = localev1;
/*  105 */                 int i1 = paramInt1;
/*  106 */                 int i2 = paramInt2;
/*      */ 
/*  108 */                 int i4 = m & 0x7;
/*  109 */                 int i5 = n & 0x7;
/*  110 */                 int i6 = paramInt7;
/*      */ 
/*  112 */                 i6 &= 3;
/*      */                 int i3;
/*  113 */                 if (0 == i6) { if (paramByte == 84) throw new IllegalStateException();
/*  114 */                   i3 = i4;
/*      */                 }
/*  117 */                 else if (i6 == 1) { if (paramByte != 84);
/*  118 */                   i3 = i5;
/*      */                 }
/*  121 */                 else if (i6 == 2) { if (paramByte != 84);
/*  122 */                   i3 = 7 - i4;
/*      */                 } else
/*      */                 {
/*  125 */                   i3 = 7 - i5;
/*      */                 }
/*  127 */                 ev localev3 = localev2;
/*  128 */                 int i7 = i1;
/*  129 */                 int i8 = i3 + i2;
/*  130 */                 int i9 = paramInt3;
/*      */ 
/*  132 */                 int i11 = m & 0x7;
/*  133 */                 int i12 = n & 0x7;
/*  134 */                 int i13 = paramInt7;
/*      */ 
/*  136 */                 i13 &= 3;
/*      */                 int i10;
/*  137 */                 if (i13 == 0) { if (paramByte == 84) throw new IllegalStateException();
/*  138 */                   i10 = i12;
/*      */                 }
/*  141 */                 else if (i13 == 1) { if (paramByte != 84);
/*  142 */                   i10 = 7 - i11;
/*      */                 }
/*  145 */                 else if (i13 == 2) { if (paramByte != 84);
/*  146 */                   i10 = 7 - i12;
/*      */                 } else
/*      */                 {
/*  149 */                   i10 = i11;
/*      */                 }
/*  151 */                 dz.c(localev3, i7, i8, i9 + i10, 0, 0, paramInt7, -1025430739);
/*  152 */                 continue; } } }
/*  153 */           dz.c(localev1, 0, -1, -1, 0, 0, 0, -1025430739);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static final int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  966 */     if (paramInt3 > 179) { if (paramInt4 != 1456887457);
/*  966 */       paramInt2 /= 2; }
/*  967 */     if (paramInt3 > 192) { if (paramInt4 == 1456887457) throw new IllegalStateException(); paramInt2 /= 2; }
/*  968 */     if (paramInt3 > 217) { if (paramInt4 == 1456887457) throw new IllegalStateException(); paramInt2 /= 2; }
/*  969 */     if (paramInt3 > 243) { if (paramInt4 == 1456887457) throw new IllegalStateException(); paramInt2 /= 2; }
/*  970 */     int i = paramInt3 / 2 + ((paramInt1 / 4 << 10) + (paramInt2 / 32 << 7));
/*  971 */     return i;
/*      */   }
/*      */ 
/*      */   static final void l(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, ck[] paramArrayOfck, int paramInt5)
/*      */   {
/*   76 */     int m;
/*   76 */     for (int i = 0; i < 4; i++) { if (paramInt5 < 549358263);
/*   77 */       for (k = 0; k < 64; k++) { if (paramInt5 >= 549358263) throw new IllegalStateException();
/*   78 */         for (m = 0; m < 64; m++) { if (paramInt5 >= 549358263) return;
/*   79 */           if ((paramInt1 + k > 0) && ((paramInt5 >= 549358263) || (k + paramInt1 < 103))) { if (paramInt5 >= 549358263) throw new IllegalStateException(); if (m + paramInt2 > 0) { if (paramInt5 >= 549358263) return; if (m + paramInt2 < 103) { if (paramInt5 < 549358263);
/*   79 */                 paramArrayOfck[i].az[(paramInt1 + k)][(paramInt2 + m)] &= -16777217; } } }
/*      */         }
/*      */       }
/*      */     }
/*   83 */     ev localev = new ev(paramArrayOfByte);
/*   84 */     for (int k = 0; k < 4; k++) { if (paramInt5 < 549358263);
/*   85 */       for (m = 0; m < 64; m++) { if (paramInt5 >= 549358263) throw new IllegalStateException();
/*   86 */         for (int n = 0; n < 64; n++) { if (paramInt5 >= 549358263) throw new IllegalStateException();
/*   87 */           dz.c(localev, k, m + paramInt1, paramInt2 + n, paramInt3, paramInt4, 0, -1025430739);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void gv(int paramInt)
/*      */   {
/* 9756 */     client.df.gt(185, 2062507603);
/* 9757 */     client.df.c(0, 1217245671);
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     aa
 * JD-Core Version:    0.6.2
 */