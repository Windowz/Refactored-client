/*      */ public final class dn extends dg
/*      */ {
/*      */   int z;
/*      */   int c;
/*      */   int u;
/*      */   int j;
/*      */   int n;
/*      */   int g;
/*      */   int q;
/*      */   int i;
/*      */   int s;
/*      */   int m;
/*   16 */   int v = 0;
/*   17 */   int w = 437079793;
/*      */   static int cy;
/*      */ 
/*      */   static int gg(eg parameg, byte paramByte)
/*      */   {
/* 9769 */     el localel = (el)client.lz.r(parameg.e * -1342772421 + (parameg.w * 1442485545 << 32));
/* 9770 */     if (null != localel) { if (paramByte == 25);
/* 9770 */       return localel.m; }
/* 9771 */     return 1805299041 * parameg.ba;
/*      */   }
/*      */ 
/*      */   static final int s(int paramInt1, int paramInt2, int paramInt3, byte paramByte)
/*      */   {
/*  902 */     int k = paramInt1 / paramInt3;
/*  903 */     int i1 = paramInt1 & paramInt3 - 1;
/*  904 */     int i2 = paramInt2 / paramInt3;
/*  905 */     int i3 = paramInt2 & paramInt3 - 1;
/*  906 */     int i4 = cw.u(k, i2, 836407583);
/*  907 */     int i5 = cw.u(k + 1, i2, 836407583);
/*  908 */     int i6 = cw.u(k, 1 + i2, 836407583);
/*  909 */     int i7 = cw.u(k + 1, i2 + 1, 836407583);
/*      */ 
/*  912 */     int i9 = 65536 - fx.ah[(1024 * i1 / paramInt3)] >> 1;
/*  913 */     int i8 = (i5 * i9 >> 16) + (i4 * (65536 - i9) >> 16);
/*      */ 
/*  915 */     i9 = i8;
/*      */ 
/*  918 */     int i11 = 65536 - fx.ah[(1024 * i1 / paramInt3)] >> 1;
/*  919 */     int i10 = (i6 * (65536 - i11) >> 16) + (i11 * i7 >> 16);
/*      */ 
/*  921 */     i11 = i10;
/*      */ 
/*  924 */     int i13 = 65536 - fx.ah[(1024 * i3 / paramInt3)] >> 1;
/*  925 */     int i12 = (i11 * i13 >> 16) + (i9 * (65536 - i13) >> 16);
/*      */ 
/*  927 */     return i12;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     dn
 * JD-Core Version:    0.6.2
 */