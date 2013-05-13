/*      */ public class fw extends fu
/*      */ {
/*      */   int aq;
/*      */   int[] g;
/*      */   int[] z;
/*      */   int[] q;
/*   13 */   int i = 0;
/*      */   int o;
/*      */   int[] u;
/*    9 */   int j = 0;
/*      */   byte[] w;
/*      */   byte[] e;
/*      */   short[] x;
/*      */   byte[] y;
/*   51 */   static int[] ai = new int[10000];
/*      */ 
/*   23 */   byte k = 0;
/*      */   ao[] ab;
/*      */   int at;
/*      */   byte[] a;
/*      */   short[] h;
/*      */   int[] v;
/*      */   short[] p;
/*      */   short[] ad;
/*      */   short[] ac;
/*      */   short[] aa;
/*      */   short[] as;
/*      */   short[] am;
/*      */   short[] ap;
/*      */   byte[] av;
/*      */   int au;
/*      */   int[] az;
/*      */   int[][] an;
/*      */   int[][] ah;
/*      */   ag[] ay;
/*      */   ao[] al;
/*      */   short[] t;
/*      */   short[] f;
/*      */   public short ag;
/*   45 */   boolean ar = false;
/*      */   public short ao;
/*      */   byte[] b;
/*      */   int ae;
/*      */   int[] s;
/*      */   int ax;
/*      */   int[] ak;
/*   52 */   static int[] aj = new int[10000];
/*   53 */   static int aw = 0;
/*   54 */   static int[] af = fx.an;
/*   55 */   static int[] bh = fx.ah;
/*      */ 
/*      */   public static fw ag(ch paramch, int paramInt1, int paramInt2)
/*      */   {
/*   60 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 2122539848);
/*   61 */     if (arrayOfByte == null) return null;
/*   62 */     return new fw(arrayOfByte);
/*      */   }
/*      */ 
/*      */   public fw aw()
/*      */   {
/*  726 */     fw localfw = new fw();
/*  727 */     if (this.w != null) {
/*  728 */       localfw.w = new byte[this.i];
/*  729 */       for (int m = 0; m < this.i; m++) localfw.w[m] = this.w[m];
/*      */     }
/*  731 */     localfw.j = this.j;
/*  732 */     localfw.i = this.i;
/*  733 */     localfw.o = this.o;
/*  734 */     localfw.z = this.z;
/*  735 */     localfw.g = this.g;
/*  736 */     localfw.q = this.q;
/*  737 */     localfw.s = this.s;
/*  738 */     localfw.u = this.u;
/*  739 */     localfw.v = this.v;
/*  740 */     localfw.e = this.e;
/*  741 */     localfw.b = this.b;
/*  742 */     localfw.y = this.y;
/*  743 */     localfw.t = this.t;
/*  744 */     localfw.f = this.f;
/*  745 */     localfw.k = this.k;
/*  746 */     localfw.a = this.a;
/*  747 */     localfw.h = this.h;
/*  748 */     localfw.x = this.x;
/*  749 */     localfw.p = this.p;
/*  750 */     localfw.ad = this.ad;
/*  751 */     localfw.ac = this.ac;
/*  752 */     localfw.aa = this.aa;
/*  753 */     localfw.as = this.as;
/*  754 */     localfw.av = this.av;
/*  755 */     localfw.am = this.am;
/*  756 */     localfw.ap = this.ap;
/*  757 */     localfw.ak = this.ak;
/*  758 */     localfw.az = this.az;
/*  759 */     localfw.an = this.an;
/*  760 */     localfw.ah = this.ah;
/*  761 */     localfw.al = this.al;
/*  762 */     localfw.ay = this.ay;
/*  763 */     localfw.ao = this.ao;
/*  764 */     localfw.ag = this.ag;
/*  765 */     return localfw;
/*      */   }
/*      */ 
/*      */   public void cj(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  966 */     for (int m = 0; m < this.j; m++) {
/*  967 */       this.z[m] = (this.z[m] * paramInt1 / 128);
/*  968 */       this.g[m] = (this.g[m] * paramInt2 / 128);
/*  969 */       this.q[m] = (this.q[m] * paramInt3 / 128);
/*      */     }
/*  971 */     ak();
/*      */   }
/*      */ 
/*      */   fw()
/*      */   {
/*      */   }
/*      */ 
/*      */   public void p()
/*      */   {
/*  914 */     for (int m = 0; m < this.j; m++) {
/*  915 */       int n = this.q[m];
/*  916 */       this.q[m] = this.z[m];
/*  917 */       this.z[m] = (-n);
/*      */     }
/*  919 */     ak();
/*      */   }
/*      */ 
/*      */   public void br()
/*      */   {
/*  956 */     for (int m = 0; m < this.j; m++) this.q[m] = (-this.q[m]);
/*  957 */     for (m = 0; m < this.i; m++) {
/*  958 */       int n = this.s[m];
/*  959 */       this.s[m] = this.v[m];
/*  960 */       this.v[m] = n;
/*      */     }
/*  962 */     ak();
/*      */   }
/*      */ 
/*      */   public void bo()
/*      */   {
/*  914 */     for (int m = 0; m < this.j; m++) {
/*  915 */       int n = this.q[m];
/*  916 */       this.q[m] = this.z[m];
/*  917 */       this.z[m] = (-n);
/*      */     }
/*  919 */     ak();
/*      */   }
/*      */ 
/*      */   public void cl()
/*      */   {
/*  975 */     if (this.al != null) return;
/*  976 */     this.al = new ao[this.j];
/*  977 */     for (int m = 0; m < this.j; m++) this.al[m] = new ao();
/*  978 */     for (m = 0; m < this.i; m++) {
/*  979 */       int n = this.s[m];
/*  980 */       int i1 = this.u[m];
/*  981 */       int i2 = this.v[m];
/*  982 */       int i3 = this.z[i1] - this.z[n];
/*  983 */       int i4 = this.g[i1] - this.g[n];
/*  984 */       int i5 = this.q[i1] - this.q[n];
/*  985 */       int i6 = this.z[i2] - this.z[n];
/*  986 */       int i7 = this.g[i2] - this.g[n];
/*  987 */       int i8 = this.q[i2] - this.q[n];
/*  988 */       int i9 = i4 * i8 - i7 * i5;
/*  989 */       int i10 = i5 * i6 - i8 * i3;
/*  990 */       int i11 = i3 * i7 - i6 * i4;
/*  991 */       while ((i9 > 8192) || (i10 > 8192) || (i11 > 8192) || (i9 < -8192) || (i10 < -8192) || (i11 < -8192)) {
/*  992 */         i9 >>= 1;
/*  993 */         i10 >>= 1;
/*  994 */         i11 >>= 1;
/*      */       }
/*  996 */       int i12 = (int)Math.sqrt(i9 * i9 + i10 * i10 + i11 * i11);
/*  997 */       if (i12 <= 0) i12 = 1;
/*  998 */       i9 = i9 * 256 / i12;
/*  999 */       i10 = i10 * 256 / i12;
/* 1000 */       i11 = i11 * 256 / i12;
/*      */       int i13;
/* 1002 */       if (this.w == null) i13 = 0; else
/* 1003 */         i13 = this.w[m];
/*      */       Object localObject;
/* 1004 */       if (i13 == 0)
/*      */       {
/* 1006 */         localObject = this.al[n];
/* 1007 */         localObject.r += i9 * -51093915;
/* 1008 */         localObject.d += i10 * -2118275021;
/* 1009 */         localObject.l += i11 * -1777776979;
/* 1010 */         localObject.m += 38215753;
/* 1011 */         localObject = this.al[i1];
/* 1012 */         localObject.r += i9 * -51093915;
/* 1013 */         localObject.d += i10 * -2118275021;
/* 1014 */         localObject.l += i11 * -1777776979;
/* 1015 */         localObject.m += 38215753;
/* 1016 */         localObject = this.al[i2];
/* 1017 */         localObject.r += i9 * -51093915;
/* 1018 */         localObject.d += i10 * -2118275021;
/* 1019 */         localObject.l += i11 * -1777776979;
/* 1020 */         localObject.m += 38215753;
/*      */       }
/* 1022 */       else if (i13 == 1) {
/* 1023 */         if (this.ay == null) this.ay = new ag[this.i];
/* 1024 */         localObject = this.ay[m] =  = new ag();
/* 1025 */         ((ag)localObject).r = (i9 * 1456119963);
/* 1026 */         ((ag)localObject).d = (i10 * -1706466891);
/* 1027 */         ((ag)localObject).l = (i11 * 968018991);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   final int ai(fw paramfw, int paramInt)
/*      */   {
/*  636 */     int m = -1;
/*  637 */     int n = paramfw.z[paramInt];
/*  638 */     int i1 = paramfw.g[paramInt];
/*  639 */     int i2 = paramfw.q[paramInt];
/*  640 */     for (int i3 = 0; i3 < this.j; i3++) {
/*  641 */       if ((n == this.z[i3]) && (i1 == this.g[i3]) && (i2 == this.q[i3])) {
/*  642 */         m = i3;
/*  643 */         break;
/*      */       }
/*      */     }
/*  646 */     if (m == -1) {
/*  647 */       this.z[this.j] = n;
/*  648 */       this.g[this.j] = i1;
/*  649 */       this.q[this.j] = i2;
/*  650 */       if (paramfw.ak != null) this.ak[this.j] = paramfw.ak[paramInt];
/*  651 */       m = this.j++;
/*      */     }
/*  653 */     return m;
/*      */   }
/*      */ 
/*      */   public fw o(int[][] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
/*      */   {
/*  769 */     az();
/*  770 */     int m = paramInt1 + this.at;
/*  771 */     int n = paramInt1 + this.ae;
/*  772 */     int i1 = paramInt3 + this.ax;
/*  773 */     int i2 = paramInt3 + this.au;
/*  774 */     if ((m < 0) || (n + 128 >> 7 >= paramArrayOfInt.length) || (i1 < 0) || (i2 + 128 >> 7 >= paramArrayOfInt[0].length)) return this;
/*  775 */     m >>= 7;
/*  776 */     n = n + 127 >> 7;
/*  777 */     i1 >>= 7;
/*  778 */     i2 = i2 + 127 >> 7;
/*  779 */     if ((paramArrayOfInt[m][i1] == paramInt2) && (paramArrayOfInt[n][i1] == paramInt2) && (paramArrayOfInt[m][i2] == paramInt2) && (paramArrayOfInt[n][i2] == paramInt2)) return this;
/*      */     fw localfw;
/*  781 */     if (paramBoolean) {
/*  782 */       localfw = new fw();
/*  783 */       localfw.j = this.j;
/*  784 */       localfw.i = this.i;
/*  785 */       localfw.o = this.o;
/*  786 */       localfw.z = this.z;
/*  787 */       localfw.q = this.q;
/*  788 */       localfw.s = this.s;
/*  789 */       localfw.u = this.u;
/*  790 */       localfw.v = this.v;
/*  791 */       localfw.w = this.w;
/*  792 */       localfw.e = this.e;
/*  793 */       localfw.b = this.b;
/*  794 */       localfw.y = this.y;
/*  795 */       localfw.t = this.t;
/*  796 */       localfw.f = this.f;
/*  797 */       localfw.k = this.k;
/*  798 */       localfw.a = this.a;
/*  799 */       localfw.h = this.h;
/*  800 */       localfw.x = this.x;
/*  801 */       localfw.p = this.p;
/*  802 */       localfw.ad = this.ad;
/*  803 */       localfw.ac = this.ac;
/*  804 */       localfw.aa = this.aa;
/*  805 */       localfw.as = this.as;
/*  806 */       localfw.av = this.av;
/*  807 */       localfw.am = this.am;
/*  808 */       localfw.ap = this.ap;
/*  809 */       localfw.ak = this.ak;
/*  810 */       localfw.az = this.az;
/*  811 */       localfw.an = this.an;
/*  812 */       localfw.ah = this.ah;
/*  813 */       localfw.ao = this.ao;
/*  814 */       localfw.ag = this.ag;
/*  815 */       localfw.g = new int[localfw.j];
/*      */     }
/*      */     else {
/*  818 */       localfw = this;
/*      */     }
/*      */     int i3;
/*      */     int i4;
/*      */     int i5;
/*      */     int i6;
/*      */     int i7;
/*      */     int i8;
/*      */     int i9;
/*      */     int i10;
/*      */     int i11;
/*      */     int i12;
/*  820 */     if (paramInt4 == 0) {
/*  821 */       for (i3 = 0; i3 < localfw.j; i3++) {
/*  822 */         i4 = this.z[i3] + paramInt1;
/*  823 */         i5 = this.q[i3] + paramInt3;
/*  824 */         i6 = i4 & 0x7F;
/*  825 */         i7 = i5 & 0x7F;
/*  826 */         i8 = i4 >> 7;
/*  827 */         i9 = i5 >> 7;
/*  828 */         i10 = paramArrayOfInt[i8][i9] * (128 - i6) + paramArrayOfInt[(i8 + 1)][i9] * i6 >> 7;
/*  829 */         i11 = paramArrayOfInt[i8][(i9 + 1)] * (128 - i6) + paramArrayOfInt[(i8 + 1)][(i9 + 1)] * i6 >> 7;
/*  830 */         i12 = i10 * (128 - i7) + i11 * i7 >> 7;
/*  831 */         localfw.g[i3] = (this.g[i3] + i12 - paramInt2);
/*      */       }
/*      */     }
/*      */     else {
/*  835 */       for (i3 = 0; i3 < localfw.j; i3++) {
/*  836 */         i4 = (-this.g[i3] << 16) / (this.n * 1921388913);
/*  837 */         if (i4 < paramInt4) {
/*  838 */           i5 = this.z[i3] + paramInt1;
/*  839 */           i6 = this.q[i3] + paramInt3;
/*  840 */           i7 = i5 & 0x7F;
/*  841 */           i8 = i6 & 0x7F;
/*  842 */           i9 = i5 >> 7;
/*  843 */           i10 = i6 >> 7;
/*  844 */           i11 = paramArrayOfInt[i9][i10] * (128 - i7) + paramArrayOfInt[(i9 + 1)][i10] * i7 >> 7;
/*  845 */           i12 = paramArrayOfInt[i9][(i10 + 1)] * (128 - i7) + paramArrayOfInt[(i9 + 1)][(i10 + 1)] * i7 >> 7;
/*  846 */           int i13 = i11 * (128 - i8) + i12 * i8 >> 7;
/*  847 */           this.g[i3] += (i13 - paramInt2) * (paramInt4 - i4) / paramInt4;
/*      */         }
/*      */       }
/*      */     }
/*  851 */     localfw.ak();
/*  852 */     return localfw;
/*      */   }
/*      */ 
/*      */   void a()
/*      */   {
/*      */     int[] arrayOfInt;
/*      */     int m;
/*      */     int n;
/*      */     int i1;
/*  856 */     if (this.ak != null) {
/*  857 */       arrayOfInt = new int[256];
/*  858 */       m = 0;
/*  859 */       for (n = 0; n < this.j; n++) {
/*  860 */         i1 = this.ak[n];
/*  861 */         arrayOfInt[i1] += 1;
/*  862 */         if (i1 > m) m = i1;
/*      */       }
/*  864 */       this.an = new int[m + 1][];
/*  865 */       for (n = 0; n <= m; n++) {
/*  866 */         this.an[n] = new int[arrayOfInt[n]];
/*  867 */         arrayOfInt[n] = 0;
/*      */       }
/*  869 */       for (n = 0; n < this.j; n++) {
/*  870 */         i1 = this.ak[n];
/*      */         int tmp122_120 = i1;
/*      */         int[] tmp122_119 = arrayOfInt;
/*      */         int tmp124_123 = tmp122_119[tmp122_120]; tmp122_119[tmp122_120] = (tmp124_123 + 1); this.an[i1][tmp124_123] = n;
/*      */       }
/*  873 */       this.ak = null;
/*      */     }
/*  875 */     if (this.az != null) {
/*  876 */       arrayOfInt = new int[256];
/*  877 */       m = 0;
/*  878 */       for (n = 0; n < this.i; n++) {
/*  879 */         i1 = this.az[n];
/*  880 */         arrayOfInt[i1] += 1;
/*  881 */         if (i1 > m) m = i1;
/*      */       }
/*  883 */       this.ah = new int[m + 1][];
/*  884 */       for (n = 0; n <= m; n++) {
/*  885 */         this.ah[n] = new int[arrayOfInt[n]];
/*  886 */         arrayOfInt[n] = 0;
/*      */       }
/*  888 */       for (n = 0; n < this.i; n++) {
/*  889 */         i1 = this.az[n];
/*      */         int tmp263_261 = i1;
/*      */         int[] tmp263_260 = arrayOfInt;
/*      */         int tmp265_264 = tmp263_260[tmp263_261]; tmp263_260[tmp263_261] = (tmp265_264 + 1); this.ah[i1][tmp265_264] = n;
/*      */       }
/*  892 */       this.az = null;
/*      */     }
/*      */   }
/*      */ 
/*      */   public void h() {
/*  897 */     for (int m = 0; m < this.j; m++) {
/*  898 */       int n = this.z[m];
/*  899 */       this.z[m] = this.q[m];
/*  900 */       this.q[m] = (-n);
/*      */     }
/*  902 */     ak();
/*      */   }
/*      */ 
/*      */   public void x() {
/*  906 */     for (int m = 0; m < this.j; m++) {
/*  907 */       this.z[m] = (-this.z[m]);
/*  908 */       this.q[m] = (-this.q[m]);
/*      */     }
/*  910 */     ak();
/*      */   }
/*      */ 
/*      */   public void av()
/*      */   {
/*  975 */     if (this.al != null) return;
/*  976 */     this.al = new ao[this.j];
/*  977 */     for (int m = 0; m < this.j; m++) this.al[m] = new ao();
/*  978 */     for (m = 0; m < this.i; m++) {
/*  979 */       int n = this.s[m];
/*  980 */       int i1 = this.u[m];
/*  981 */       int i2 = this.v[m];
/*  982 */       int i3 = this.z[i1] - this.z[n];
/*  983 */       int i4 = this.g[i1] - this.g[n];
/*  984 */       int i5 = this.q[i1] - this.q[n];
/*  985 */       int i6 = this.z[i2] - this.z[n];
/*  986 */       int i7 = this.g[i2] - this.g[n];
/*  987 */       int i8 = this.q[i2] - this.q[n];
/*  988 */       int i9 = i4 * i8 - i7 * i5;
/*  989 */       int i10 = i5 * i6 - i8 * i3;
/*  990 */       int i11 = i3 * i7 - i6 * i4;
/*  991 */       while ((i9 > 8192) || (i10 > 8192) || (i11 > 8192) || (i9 < -8192) || (i10 < -8192) || (i11 < -8192)) {
/*  992 */         i9 >>= 1;
/*  993 */         i10 >>= 1;
/*  994 */         i11 >>= 1;
/*      */       }
/*  996 */       int i12 = (int)Math.sqrt(i9 * i9 + i10 * i10 + i11 * i11);
/*  997 */       if (i12 <= 0) i12 = 1;
/*  998 */       i9 = i9 * 256 / i12;
/*  999 */       i10 = i10 * 256 / i12;
/* 1000 */       i11 = i11 * 256 / i12;
/*      */       int i13;
/* 1002 */       if (this.w == null) i13 = 0; else
/* 1003 */         i13 = this.w[m];
/*      */       Object localObject;
/* 1004 */       if (i13 == 0)
/*      */       {
/* 1006 */         localObject = this.al[n];
/* 1007 */         localObject.r += i9 * -51093915;
/* 1008 */         localObject.d += i10 * -2118275021;
/* 1009 */         localObject.l += i11 * -1777776979;
/* 1010 */         localObject.m += 38215753;
/* 1011 */         localObject = this.al[i1];
/* 1012 */         localObject.r += i9 * -51093915;
/* 1013 */         localObject.d += i10 * -2118275021;
/* 1014 */         localObject.l += i11 * -1777776979;
/* 1015 */         localObject.m += 38215753;
/* 1016 */         localObject = this.al[i2];
/* 1017 */         localObject.r += i9 * -51093915;
/* 1018 */         localObject.d += i10 * -2118275021;
/* 1019 */         localObject.l += i11 * -1777776979;
/* 1020 */         localObject.m += 38215753;
/*      */       }
/* 1022 */       else if (i13 == 1) {
/* 1023 */         if (this.ay == null) this.ay = new ag[this.i];
/* 1024 */         localObject = this.ay[m] =  = new ag();
/* 1025 */         ((ag)localObject).r = (i9 * 1456119963);
/* 1026 */         ((ag)localObject).d = (i10 * -1706466891);
/* 1027 */         ((ag)localObject).l = (i11 * 968018991);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void ad(int paramInt)
/*      */   {
/*  923 */     int m = af[paramInt];
/*  924 */     int n = bh[paramInt];
/*  925 */     for (int i1 = 0; i1 < this.j; i1++) {
/*  926 */       int i2 = this.q[i1] * m + this.z[i1] * n >> 16;
/*  927 */       this.q[i1] = (this.q[i1] * n - this.z[i1] * m >> 16);
/*  928 */       this.z[i1] = i2;
/*      */     }
/*  930 */     ak();
/*      */   }
/*      */ 
/*      */   public void ac(int paramInt1, int paramInt2, int paramInt3) {
/*  934 */     for (int m = 0; m < this.j; m++) {
/*  935 */       this.z[m] += paramInt1;
/*  936 */       this.g[m] += paramInt2;
/*  937 */       this.q[m] += paramInt3;
/*      */     }
/*  939 */     ak();
/*      */   }
/*      */ 
/*      */   public void aa(short paramShort1, short paramShort2) {
/*  943 */     for (int m = 0; m < this.i; m++)
/*  944 */       if (this.t[m] == paramShort1) this.t[m] = paramShort2;
/*      */   }
/*      */ 
/*      */   static final int cq(int paramInt)
/*      */   {
/* 1251 */     if (paramInt < 2) paramInt = 2;
/* 1252 */     else if (paramInt > 126) paramInt = 126;
/* 1253 */     return paramInt;
/*      */   }
/*      */ 
/*      */   public fw(fw[] paramArrayOffw, int paramInt)
/*      */   {
/*  521 */     int m = 0;
/*  522 */     int n = 0;
/*  523 */     int i1 = 0;
/*  524 */     int i2 = 0;
/*  525 */     int i3 = 0;
/*  526 */     int i4 = 0;
/*  527 */     this.j = 0;
/*  528 */     this.i = 0;
/*  529 */     this.o = 0;
/*  530 */     this.k = -1;
/*      */     fw localfw;
/*  531 */     for (int i5 = 0; i5 < paramInt; i5++) {
/*  532 */       localfw = paramArrayOffw[i5];
/*  533 */       if (localfw != null) {
/*  534 */         this.j += localfw.j;
/*  535 */         this.i += localfw.i;
/*  536 */         this.o += localfw.o;
/*  537 */         if (localfw.e != null) { n = 1;
/*      */         } else {
/*  539 */           if (this.k == -1) this.k = localfw.k;
/*  540 */           if (this.k != localfw.k) n = 1;
/*      */         }
/*  542 */         m |= (localfw.w != null ? 1 : 0);
/*  543 */         i1 |= (localfw.b != null ? 1 : 0);
/*  544 */         i2 |= (localfw.az != null ? 1 : 0);
/*  545 */         i3 |= (localfw.f != null ? 1 : 0);
/*  546 */         i4 |= (localfw.y != null ? 1 : 0);
/*      */       }
/*      */     }
/*  549 */     this.z = new int[this.j];
/*  550 */     this.g = new int[this.j];
/*  551 */     this.q = new int[this.j];
/*  552 */     this.ak = new int[this.j];
/*  553 */     this.s = new int[this.i];
/*  554 */     this.u = new int[this.i];
/*  555 */     this.v = new int[this.i];
/*  556 */     if (m != 0) this.w = new byte[this.i];
/*  557 */     if (n != 0) this.e = new byte[this.i];
/*  558 */     if (i1 != 0) this.b = new byte[this.i];
/*  559 */     if (i2 != 0) this.az = new int[this.i];
/*  560 */     if (i3 != 0) this.f = new short[this.i];
/*  561 */     if (i4 != 0) this.y = new byte[this.i];
/*  562 */     this.t = new short[this.i];
/*  563 */     if (this.o > 0) {
/*  564 */       this.a = new byte[this.o];
/*  565 */       this.h = new short[this.o];
/*  566 */       this.x = new short[this.o];
/*  567 */       this.p = new short[this.o];
/*  568 */       this.ad = new short[this.o];
/*  569 */       this.ac = new short[this.o];
/*  570 */       this.aa = new short[this.o];
/*  571 */       this.as = new short[this.o];
/*  572 */       this.av = new byte[this.o];
/*  573 */       this.am = new short[this.o];
/*  574 */       this.ap = new short[this.o];
/*      */     }
/*  576 */     this.j = 0;
/*  577 */     this.i = 0;
/*  578 */     this.o = 0;
/*  579 */     for (i5 = 0; i5 < paramInt; i5++) {
/*  580 */       localfw = paramArrayOffw[i5];
/*  581 */       if (localfw != null) {
/*  582 */         for (int i6 = 0; i6 < localfw.i; i6++) {
/*  583 */           if ((m != 0) && 
/*  584 */             (localfw.w != null)) this.w[this.i] = localfw.w[i6];
/*      */ 
/*  586 */           if (n != 0) {
/*  587 */             if (localfw.e != null) this.e[this.i] = localfw.e[i6]; else
/*  588 */               this.e[this.i] = localfw.k;
/*      */           }
/*  590 */           if ((i1 != 0) && 
/*  591 */             (localfw.b != null)) this.b[this.i] = localfw.b[i6];
/*      */ 
/*  593 */           if ((i2 != 0) && 
/*  594 */             (localfw.az != null)) this.az[this.i] = localfw.az[i6];
/*      */ 
/*  596 */           if (i3 != 0) {
/*  597 */             if (localfw.f != null) this.f[this.i] = localfw.f[i6]; else
/*  598 */               this.f[this.i] = -1;
/*      */           }
/*  600 */           if (i4 != 0) {
/*  601 */             if ((localfw.y != null) && (localfw.y[i6] != -1)) this.y[this.i] = ((byte)(localfw.y[i6] + this.o)); else
/*  602 */               this.y[this.i] = -1;
/*      */           }
/*  604 */           this.t[this.i] = localfw.t[i6];
/*  605 */           this.s[this.i] = f(localfw, localfw.s[i6]);
/*  606 */           this.u[this.i] = f(localfw, localfw.u[i6]);
/*  607 */           this.v[this.i] = f(localfw, localfw.v[i6]);
/*  608 */           this.i += 1;
/*      */         }
/*  610 */         for (i6 = 0; i6 < localfw.o; i6++) {
/*  611 */           int i7 = this.a[this.o] = localfw.a[i6];
/*  612 */           if (i7 == 0) {
/*  613 */             this.h[this.o] = ((short)f(localfw, localfw.h[i6]));
/*  614 */             this.x[this.o] = ((short)f(localfw, localfw.x[i6]));
/*  615 */             this.p[this.o] = ((short)f(localfw, localfw.p[i6]));
/*      */           }
/*  617 */           if ((i7 >= 1) && (i7 <= 3)) {
/*  618 */             this.h[this.o] = localfw.h[i6];
/*  619 */             this.x[this.o] = localfw.x[i6];
/*  620 */             this.p[this.o] = localfw.p[i6];
/*  621 */             this.ad[this.o] = localfw.ad[i6];
/*  622 */             this.ac[this.o] = localfw.ac[i6];
/*  623 */             this.aa[this.o] = localfw.aa[i6];
/*  624 */             this.as[this.o] = localfw.as[i6];
/*  625 */             this.av[this.o] = localfw.av[i6];
/*  626 */             this.am[this.o] = localfw.am[i6];
/*      */           }
/*  628 */           if (i7 == 2) this.ap[this.o] = localfw.ap[i6];
/*  629 */           this.o += 1;
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void ap(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  966 */     for (int m = 0; m < this.j; m++) {
/*  967 */       this.z[m] = (this.z[m] * paramInt1 / 128);
/*  968 */       this.g[m] = (this.g[m] * paramInt2 / 128);
/*  969 */       this.q[m] = (this.q[m] * paramInt3 / 128);
/*      */     }
/*  971 */     ak();
/*      */   }
/*      */ 
/*      */   void ch()
/*      */   {
/* 1033 */     this.al = null;
/* 1034 */     this.ab = null;
/* 1035 */     this.ay = null;
/* 1036 */     this.ar = false;
/*      */   }
/*      */ 
/*      */   static final int al(int paramInt)
/*      */   {
/* 1251 */     if (paramInt < 2) paramInt = 2;
/* 1252 */     else if (paramInt > 126) paramInt = 126;
/* 1253 */     return paramInt;
/*      */   }
/*      */ 
/*      */   void az()
/*      */   {
/* 1040 */     if (this.ar) return;
/* 1041 */     this.n = 0;
/* 1042 */     this.aq = 0;
/* 1043 */     this.at = 999999;
/* 1044 */     this.ae = -999999;
/* 1045 */     this.au = -99999;
/* 1046 */     this.ax = 99999;
/* 1047 */     for (int m = 0; m < this.j; m++) {
/* 1048 */       int n = this.z[m];
/* 1049 */       int i1 = this.g[m];
/* 1050 */       int i2 = this.q[m];
/* 1051 */       if (n < this.at) this.at = n;
/* 1052 */       if (n > this.ae) this.ae = n;
/* 1053 */       if (i2 < this.ax) this.ax = i2;
/* 1054 */       if (i2 > this.au) this.au = i2;
/* 1055 */       if (-i1 > this.n * 1921388913) this.n = (-i1 * 443715473);
/* 1056 */       if (i1 > this.aq) this.aq = i1;
/*      */     }
/* 1058 */     this.ar = true;
/*      */   }
/*      */ 
/*      */   static void an(fw paramfw1, fw paramfw2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/* 1062 */     paramfw1.az();
/* 1063 */     paramfw1.av();
/* 1064 */     paramfw2.az();
/* 1065 */     paramfw2.av();
/* 1066 */     aw += 1;
/* 1067 */     int m = 0;
/* 1068 */     int[] arrayOfInt = paramfw2.z;
/* 1069 */     int n = paramfw2.j;
/* 1070 */     for (int i1 = 0; i1 < paramfw1.j; i1++) {
/* 1071 */       ao localao1 = paramfw1.al[i1];
/* 1072 */       if (localao1.m * -943271431 != 0) {
/* 1073 */         int i2 = paramfw1.g[i1] - paramInt2;
/* 1074 */         if (i2 <= paramfw2.aq) {
/* 1075 */           int i3 = paramfw1.z[i1] - paramInt1;
/* 1076 */           if ((i3 >= paramfw2.at) && (i3 <= paramfw2.ae)) {
/* 1077 */             int i4 = paramfw1.q[i1] - paramInt3;
/* 1078 */             if ((i4 >= paramfw2.ax) && (i4 <= paramfw2.au))
/* 1079 */               for (int i5 = 0; i5 < n; i5++) {
/* 1080 */                 ao localao2 = paramfw2.al[i5];
/* 1081 */                 if ((i3 == arrayOfInt[i5]) && (i4 == paramfw2.q[i5]) && (i2 == paramfw2.g[i5]) && (localao2.m * -943271431 != 0)) {
/* 1082 */                   if (paramfw1.ab == null) paramfw1.ab = new ao[paramfw1.j];
/* 1083 */                   if (paramfw2.ab == null) paramfw2.ab = new ao[n];
/* 1084 */                   ao localao3 = paramfw1.ab[i1];
/* 1085 */                   if (localao3 == null) localao3 = paramfw1.ab[i1] =  = new ao(localao1);
/* 1086 */                   ao localao4 = paramfw2.ab[i5];
/* 1087 */                   if (localao4 == null) localao4 = paramfw2.ab[i5] =  = new ao(localao2);
/* 1088 */                   localao3.r += localao2.r * 1;
/* 1089 */                   localao3.d += localao2.d * 1;
/* 1090 */                   localao3.l += localao2.l * 1;
/* 1091 */                   localao3.m += localao2.m * 1;
/* 1092 */                   localao4.r += localao1.r * 1;
/* 1093 */                   localao4.d += localao1.d * 1;
/* 1094 */                   localao4.l += localao1.l * 1;
/* 1095 */                   localao4.m += localao1.m * 1;
/* 1096 */                   m++;
/* 1097 */                   ai[i1] = aw;
/* 1098 */                   aj[i5] = aw;
/*      */                 }
/*      */               } 
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/* 1102 */     if ((m < 3) || (!paramBoolean)) return;
/* 1103 */     for (i1 = 0; i1 < paramfw1.i; i1++) {
/* 1104 */       if ((ai[paramfw1.s[i1]] == aw) && (ai[paramfw1.u[i1]] == aw) && (ai[paramfw1.v[i1]] == aw)) {
/* 1105 */         if (paramfw1.w == null) paramfw1.w = new byte[paramfw1.i];
/* 1106 */         paramfw1.w[i1] = 2;
/*      */       }
/*      */     }
/* 1109 */     for (i1 = 0; i1 < paramfw2.i; i1++)
/* 1110 */       if ((aj[paramfw2.s[i1]] == aw) && (aj[paramfw2.u[i1]] == aw) && (aj[paramfw2.v[i1]] == aw)) {
/* 1111 */         if (paramfw2.w == null) paramfw2.w = new byte[paramfw2.i];
/* 1112 */         paramfw2.w[i1] = 2;
/*      */       }
/*      */   }
/*      */ 
/*      */   public final fo ah(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/* 1118 */     av();
/* 1119 */     int m = (int)Math.sqrt(paramInt3 * paramInt3 + paramInt4 * paramInt4 + paramInt5 * paramInt5);
/* 1120 */     int n = paramInt2 * m >> 8;
/* 1121 */     fo localfo = new fo();
/* 1122 */     localfo.t = new int[this.i];
/* 1123 */     localfo.f = new int[this.i];
/* 1124 */     localfo.k = new int[this.i];
/*      */     int i2;
/*      */     int i3;
/* 1125 */     if ((this.o > 0) && (this.y != null)) {
/* 1126 */       int[] arrayOfInt = new int[this.o];
/* 1127 */       for (i2 = 0; i2 < this.i; i2++) {
/* 1128 */         if (this.y[i2] != -1) arrayOfInt[(this.y[i2] & 0xFF)] += 1;
/*      */       }
/* 1130 */       localfo.ad = 0;
/* 1131 */       for (i2 = 0; i2 < this.o; i2++) {
/* 1132 */         if ((arrayOfInt[i2] > 0) && (this.a[i2] == 0)) localfo.ad += 1;
/*      */       }
/* 1134 */       localfo.ac = new int[localfo.ad];
/* 1135 */       localfo.aa = new int[localfo.ad];
/* 1136 */       localfo.as = new int[localfo.ad];
/* 1137 */       i2 = 0;
/* 1138 */       for (i3 = 0; i3 < this.o; i3++)
/* 1139 */         if ((arrayOfInt[i3] > 0) && (this.a[i3] == 0)) {
/* 1140 */           localfo.ac[i2] = (this.h[i3] & 0xFFFF);
/* 1141 */           localfo.aa[i2] = (this.x[i3] & 0xFFFF);
/* 1142 */           localfo.as[i2] = (this.p[i3] & 0xFFFF);
/* 1143 */           arrayOfInt[i3] = (i2++);
/*      */         } else {
/* 1145 */           arrayOfInt[i3] = -1;
/*      */         }
/* 1147 */       localfo.h = new byte[this.i];
/* 1148 */       for (i3 = 0; i3 < this.i; i3++) {
/* 1149 */         if (this.y[i3] != -1) localfo.h[i3] = ((byte)arrayOfInt[(this.y[i3] & 0xFF)]); else
/* 1150 */           localfo.h[i3] = -1;
/*      */       }
/*      */     }
/* 1153 */     for (int i1 = 0; i1 < this.i; i1++)
/*      */     {
/* 1155 */       if (this.w == null) i2 = 0; else {
/* 1156 */         i2 = this.w[i1];
/*      */       }
/* 1158 */       if (this.b == null) i3 = 0; else
/* 1159 */         i3 = this.b[i1];
/* 1161 */       int i4;
/* 1161 */       if (this.f == null) i4 = -1; else
/* 1162 */         i4 = this.f[i1];
/* 1163 */       if (i3 == -2) i2 = 3;
/* 1164 */       if (i3 == -1) i2 = 2;
/*      */       Object localObject;
/*      */       int i5;
/* 1165 */       if (i4 == -1) {
/* 1166 */         if (i2 == 0)
/*      */         {
/* 1169 */           int i6 = this.t[i1] & 0xFFFF;
/* 1170 */           if ((this.ab != null) && (this.ab[this.s[i1]] != null)) localObject = this.ab[this.s[i1]]; else
/* 1171 */             localObject = this.al[this.s[i1]];
/* 1172 */           i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1173 */           localfo.t[i1] = ay(i6, i5);
/* 1174 */           if ((this.ab != null) && (this.ab[this.u[i1]] != null)) localObject = this.ab[this.u[i1]]; else
/* 1175 */             localObject = this.al[this.u[i1]];
/* 1176 */           i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1177 */           localfo.f[i1] = ay(i6, i5);
/* 1178 */           if ((this.ab != null) && (this.ab[this.v[i1]] != null)) localObject = this.ab[this.v[i1]]; else
/* 1179 */             localObject = this.al[this.v[i1]];
/* 1180 */           i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1181 */           localfo.k[i1] = ay(i6, i5);
/*      */         }
/* 1183 */         else if (i2 == 1) {
/* 1184 */           localObject = this.ay[i1];
/* 1185 */           i5 = paramInt1 + (paramInt3 * (((ag)localObject).r * 1691633043) + paramInt4 * (((ag)localObject).d * 700400797) + paramInt5 * (((ag)localObject).l * -1364591921)) / (n + n / 2);
/* 1186 */           localfo.t[i1] = ay(this.t[i1] & 0xFFFF, i5);
/* 1187 */           localfo.k[i1] = -1;
/*      */         }
/* 1189 */         else if (i2 == 3) {
/* 1190 */           localfo.t[i1] = 128;
/* 1191 */           localfo.k[i1] = -1;
/*      */         }
/*      */         else {
/* 1194 */           localfo.k[i1] = -2;
/*      */         }
/*      */ 
/*      */       }
/* 1198 */       else if (i2 == 0)
/*      */       {
/* 1201 */         if ((this.ab != null) && (this.ab[this.s[i1]] != null)) localObject = this.ab[this.s[i1]]; else
/* 1202 */           localObject = this.al[this.s[i1]];
/* 1203 */         i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1204 */         localfo.t[i1] = al(i5);
/* 1205 */         if ((this.ab != null) && (this.ab[this.u[i1]] != null)) localObject = this.ab[this.u[i1]]; else
/* 1206 */           localObject = this.al[this.u[i1]];
/* 1207 */         i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1208 */         localfo.f[i1] = al(i5);
/* 1209 */         if ((this.ab != null) && (this.ab[this.v[i1]] != null)) localObject = this.ab[this.v[i1]]; else
/* 1210 */           localObject = this.al[this.v[i1]];
/* 1211 */         i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1212 */         localfo.k[i1] = al(i5);
/*      */       }
/* 1214 */       else if (i2 == 1) {
/* 1215 */         localObject = this.ay[i1];
/* 1216 */         i5 = paramInt1 + (paramInt3 * (((ag)localObject).r * 1691633043) + paramInt4 * (((ag)localObject).d * 700400797) + paramInt5 * (((ag)localObject).l * -1364591921)) / (n + n / 2);
/* 1217 */         localfo.t[i1] = al(i5);
/* 1218 */         localfo.k[i1] = -1;
/*      */       }
/*      */       else {
/* 1221 */         localfo.k[i1] = -2;
/*      */       }
/*      */     }
/*      */ 
/* 1225 */     a();
/* 1226 */     localfo.i = this.j;
/* 1227 */     localfo.s = this.z;
/* 1228 */     localfo.u = this.g;
/* 1229 */     localfo.v = this.q;
/* 1230 */     localfo.w = this.i;
/* 1231 */     localfo.e = this.s;
/* 1232 */     localfo.b = this.u;
/* 1233 */     localfo.y = this.v;
/* 1234 */     localfo.o = this.e;
/* 1235 */     localfo.a = this.b;
/* 1236 */     localfo.p = this.k;
/* 1237 */     localfo.am = this.an;
/* 1238 */     localfo.ap = this.ah;
/* 1239 */     localfo.x = this.f;
/* 1240 */     return localfo;
/*      */   }
/*      */ 
/*      */   static final int ay(int paramInt1, int paramInt2) {
/* 1244 */     paramInt2 = paramInt2 * (paramInt1 & 0x7F) >> 7;
/* 1245 */     if (paramInt2 < 2) paramInt2 = 2;
/* 1246 */     else if (paramInt2 > 126) paramInt2 = 126;
/* 1247 */     return (paramInt1 & 0xFF80) + paramInt2;
/*      */   }
/*      */ 
/*      */   void y(byte[] paramArrayOfByte)
/*      */   {
/*   71 */     ev localev1 = new ev(paramArrayOfByte);
/*   72 */     ev localev2 = new ev(paramArrayOfByte);
/*   73 */     ev localev3 = new ev(paramArrayOfByte);
/*   74 */     ev localev4 = new ev(paramArrayOfByte);
/*   75 */     ev localev5 = new ev(paramArrayOfByte);
/*   76 */     ev localev6 = new ev(paramArrayOfByte);
/*   77 */     ev localev7 = new ev(paramArrayOfByte);
/*   78 */     localev1.c = ((paramArrayOfByte.length - 23) * -941396361);
/*   79 */     int m = localev1.k(-1987080889);
/*   80 */     int n = localev1.k(-1987080889);
/*   81 */     int i1 = localev1.t(1118814123);
/*   82 */     int i2 = localev1.t(1118814123);
/*   83 */     int i3 = localev1.t(1118814123);
/*   84 */     int i4 = localev1.t(1118814123);
/*   85 */     int i5 = localev1.t(1118814123);
/*   86 */     int i6 = localev1.t(1118814123);
/*   87 */     int i7 = localev1.t(1118814123);
/*   88 */     int i8 = localev1.k(-1987080889);
/*   89 */     int i9 = localev1.k(-1987080889);
/*   90 */     int i10 = localev1.k(-1987080889);
/*   91 */     int i11 = localev1.k(-1987080889);
/*   92 */     int i12 = localev1.k(-1987080889);
/*   93 */     int i13 = 0;
/*   94 */     int i14 = 0;
/*   95 */     int i15 = 0;
/*   96 */     if (i1 > 0) {
/*   97 */       this.a = new byte[i1];
/*   98 */       localev1.c = 0;
/*   99 */       for (i16 = 0; i16 < i1; i16++) {
/*  100 */         i17 = this.a[i16] = localev1.f(2002687137);
/*  101 */         if (i17 == 0) i13++;
/*  102 */         if ((i17 >= 1) && (i17 <= 3)) i14++;
/*  103 */         if (i17 == 2) i15++;
/*      */       }
/*      */     }
/*  106 */     int i16 = i1;
/*  107 */     int i17 = i16;
/*  108 */     i16 += m;
/*  109 */     int i18 = i16;
/*  110 */     if (i2 == 1) i16 += n;
/*  111 */     int i19 = i16;
/*  112 */     i16 += n;
/*  113 */     int i20 = i16;
/*  114 */     if (i3 == 255) i16 += n;
/*  115 */     int i21 = i16;
/*  116 */     if (i5 == 1) i16 += n;
/*  117 */     int i22 = i16;
/*  118 */     if (i7 == 1) i16 += m;
/*  119 */     int i23 = i16;
/*  120 */     if (i4 == 1) i16 += n;
/*  121 */     int i24 = i16;
/*  122 */     i16 += i11;
/*  123 */     int i25 = i16;
/*  124 */     if (i6 == 1) i16 += n * 2;
/*  125 */     int i26 = i16;
/*  126 */     i16 += i12;
/*  127 */     int i27 = i16;
/*  128 */     i16 += n * 2;
/*  129 */     int i28 = i16;
/*  130 */     i16 += i8;
/*  131 */     int i29 = i16;
/*  132 */     i16 += i9;
/*  133 */     int i30 = i16;
/*  134 */     i16 += i10;
/*  135 */     int i31 = i16;
/*  136 */     i16 += i13 * 6;
/*  137 */     int i32 = i16;
/*  138 */     i16 += i14 * 6;
/*  139 */     int i33 = i16;
/*  140 */     i16 += i14 * 6;
/*  141 */     int i34 = i16;
/*  142 */     i16 += i14 * 2;
/*  143 */     int i35 = i16;
/*  144 */     i16 += i14;
/*  145 */     int i36 = i16;
/*  146 */     i16 += i14 * 2 + i15 * 2;
/*  147 */     int i37 = i16;
/*  148 */     this.j = m;
/*  149 */     this.i = n;
/*  150 */     this.o = i1;
/*  151 */     this.z = new int[m];
/*  152 */     this.g = new int[m];
/*  153 */     this.q = new int[m];
/*  154 */     this.s = new int[n];
/*  155 */     this.u = new int[n];
/*  156 */     this.v = new int[n];
/*  157 */     if (i7 == 1) this.ak = new int[m];
/*  158 */     if (i2 == 1) this.w = new byte[n];
/*  159 */     if (i3 == 255) this.e = new byte[n]; else
/*  160 */       this.k = ((byte)i3);
/*  161 */     if (i4 == 1) this.b = new byte[n];
/*  162 */     if (i5 == 1) this.az = new int[n];
/*  163 */     if (i6 == 1) this.f = new short[n];
/*  164 */     if ((i6 == 1) && (i1 > 0)) this.y = new byte[n];
/*  165 */     this.t = new short[n];
/*  166 */     if (i1 > 0) {
/*  167 */       this.h = new short[i1];
/*  168 */       this.x = new short[i1];
/*  169 */       this.p = new short[i1];
/*  170 */       if (i14 > 0) {
/*  171 */         this.ad = new short[i14];
/*  172 */         this.ac = new short[i14];
/*  173 */         this.aa = new short[i14];
/*  174 */         this.as = new short[i14];
/*  175 */         this.av = new byte[i14];
/*  176 */         this.am = new short[i14];
/*      */       }
/*  178 */       if (i15 > 0) this.ap = new short[i15];
/*      */     }
/*  180 */     localev1.c = (i17 * -941396361);
/*  181 */     localev2.c = (i28 * -941396361);
/*  182 */     localev3.c = (i29 * -941396361);
/*  183 */     localev4.c = (i30 * -941396361);
/*  184 */     localev5.c = (i22 * -941396361);
/*  185 */     int i38 = 0;
/*  186 */     int i39 = 0;
/*  187 */     int i40 = 0;
/*  188 */     for (int i41 = 0; i41 < m; i41++) {
/*  189 */       i42 = localev1.t(1118814123);
/*  190 */       i43 = 0;
/*  191 */       if ((i42 & 0x1) != 0) i43 = localev2.am(-2146354692);
/*  192 */       i44 = 0;
/*  193 */       if ((i42 & 0x2) != 0) i44 = localev3.am(-987737832);
/*  194 */       i45 = 0;
/*  195 */       if ((i42 & 0x4) != 0) i45 = localev4.am(-1710851842);
/*  196 */       this.z[i41] = (i38 + i43);
/*  197 */       this.g[i41] = (i39 + i44);
/*  198 */       this.q[i41] = (i40 + i45);
/*  199 */       i38 = this.z[i41];
/*  200 */       i39 = this.g[i41];
/*  201 */       i40 = this.q[i41];
/*  202 */       if (i7 == 1) this.ak[i41] = localev5.t(1118814123);
/*      */     }
/*  204 */     localev1.c = (i27 * -941396361);
/*  205 */     localev2.c = (i18 * -941396361);
/*  206 */     localev3.c = (i20 * -941396361);
/*  207 */     localev4.c = (i23 * -941396361);
/*  208 */     localev5.c = (i21 * -941396361);
/*  209 */     localev6.c = (i25 * -941396361);
/*  210 */     localev7.c = (i26 * -941396361);
/*  211 */     for (i41 = 0; i41 < n; i41++) {
/*  212 */       this.t[i41] = ((short)localev1.k(-1987080889));
/*  213 */       if (i2 == 1) this.w[i41] = localev2.f(2002687137);
/*  214 */       if (i3 == 255) this.e[i41] = localev3.f(2002687137);
/*  215 */       if (i4 == 1) this.b[i41] = localev4.f(2002687137);
/*  216 */       if (i5 == 1) this.az[i41] = localev5.t(1118814123);
/*  217 */       if (i6 == 1) this.f[i41] = ((short)(localev6.k(-1987080889) - 1));
/*  218 */       if ((this.y != null) && (this.f[i41] != -1)) this.y[i41] = ((byte)(localev7.t(1118814123) - 1));
/*      */     }
/*  220 */     localev1.c = (i24 * -941396361);
/*  221 */     localev2.c = (i19 * -941396361);
/*  222 */     i41 = 0;
/*  223 */     int i42 = 0;
/*  224 */     int i43 = 0;
/*  225 */     int i44 = 0;
/*      */     int i46;
/*  226 */     for (int i45 = 0; i45 < n; i45++) {
/*  227 */       i46 = localev2.t(1118814123);
/*  228 */       if (i46 == 1) {
/*  229 */         i41 = localev1.am(-1139302136) + i44;
/*  230 */         i44 = i41;
/*  231 */         i42 = localev1.am(-1326378194) + i44;
/*  232 */         i44 = i42;
/*  233 */         i43 = localev1.am(-1032386213) + i44;
/*  234 */         i44 = i43;
/*  235 */         this.s[i45] = i41;
/*  236 */         this.u[i45] = i42;
/*  237 */         this.v[i45] = i43;
/*      */       }
/*  239 */       if (i46 == 2) {
/*  240 */         i42 = i43;
/*  241 */         i43 = localev1.am(-2138635551) + i44;
/*  242 */         i44 = i43;
/*  243 */         this.s[i45] = i41;
/*  244 */         this.u[i45] = i42;
/*  245 */         this.v[i45] = i43;
/*      */       }
/*  247 */       if (i46 == 3) {
/*  248 */         i41 = i43;
/*  249 */         i43 = localev1.am(-812381752) + i44;
/*  250 */         i44 = i43;
/*  251 */         this.s[i45] = i41;
/*  252 */         this.u[i45] = i42;
/*  253 */         this.v[i45] = i43;
/*      */       }
/*  255 */       if (i46 == 4) {
/*  256 */         int i47 = i41;
/*  257 */         i41 = i42;
/*  258 */         i42 = i47;
/*  259 */         i43 = localev1.am(-1107715500) + i44;
/*  260 */         i44 = i43;
/*  261 */         this.s[i45] = i41;
/*  262 */         this.u[i45] = i42;
/*  263 */         this.v[i45] = i43;
/*      */       }
/*      */     }
/*  266 */     localev1.c = (i31 * -941396361);
/*  267 */     localev2.c = (i32 * -941396361);
/*  268 */     localev3.c = (i33 * -941396361);
/*  269 */     localev4.c = (i34 * -941396361);
/*  270 */     localev5.c = (i35 * -941396361);
/*  271 */     localev6.c = (i36 * -941396361);
/*  272 */     for (i45 = 0; i45 < i1; i45++) {
/*  273 */       i46 = this.a[i45] & 0xFF;
/*  274 */       if (i46 == 0) {
/*  275 */         this.h[i45] = ((short)localev1.k(-1987080889));
/*  276 */         this.x[i45] = ((short)localev1.k(-1987080889));
/*  277 */         this.p[i45] = ((short)localev1.k(-1987080889));
/*      */       }
/*  279 */       if (i46 == 1) {
/*  280 */         this.h[i45] = ((short)localev2.k(-1987080889));
/*  281 */         this.x[i45] = ((short)localev2.k(-1987080889));
/*  282 */         this.p[i45] = ((short)localev2.k(-1987080889));
/*  283 */         this.ad[i45] = ((short)localev3.k(-1987080889));
/*  284 */         this.ac[i45] = ((short)localev3.k(-1987080889));
/*  285 */         this.aa[i45] = ((short)localev3.k(-1987080889));
/*  286 */         this.as[i45] = ((short)localev4.k(-1987080889));
/*  287 */         this.av[i45] = localev5.f(2002687137);
/*  288 */         this.am[i45] = ((short)localev6.k(-1987080889));
/*      */       }
/*  290 */       if (i46 == 2) {
/*  291 */         this.h[i45] = ((short)localev2.k(-1987080889));
/*  292 */         this.x[i45] = ((short)localev2.k(-1987080889));
/*  293 */         this.p[i45] = ((short)localev2.k(-1987080889));
/*  294 */         this.ad[i45] = ((short)localev3.k(-1987080889));
/*  295 */         this.ac[i45] = ((short)localev3.k(-1987080889));
/*  296 */         this.aa[i45] = ((short)localev3.k(-1987080889));
/*  297 */         this.as[i45] = ((short)localev4.k(-1987080889));
/*  298 */         this.av[i45] = localev5.f(2002687137);
/*  299 */         this.am[i45] = ((short)localev6.k(-1987080889));
/*  300 */         this.ap[i45] = ((short)localev6.k(-1987080889));
/*      */       }
/*  302 */       if (i46 == 3) {
/*  303 */         this.h[i45] = ((short)localev2.k(-1987080889));
/*  304 */         this.x[i45] = ((short)localev2.k(-1987080889));
/*  305 */         this.p[i45] = ((short)localev2.k(-1987080889));
/*  306 */         this.ad[i45] = ((short)localev3.k(-1987080889));
/*  307 */         this.ac[i45] = ((short)localev3.k(-1987080889));
/*  308 */         this.aa[i45] = ((short)localev3.k(-1987080889));
/*  309 */         this.as[i45] = ((short)localev4.k(-1987080889));
/*  310 */         this.av[i45] = localev5.f(2002687137);
/*  311 */         this.am[i45] = ((short)localev6.k(-1987080889));
/*      */       }
/*      */     }
/*  314 */     localev1.c = (i37 * -941396361);
/*  315 */     i45 = localev1.t(1118814123);
/*  316 */     if (i45 != 0) {
/*  317 */       new aj();
/*  318 */       localev1.k(-1987080889);
/*  319 */       localev1.k(-1987080889);
/*  320 */       localev1.k(-1987080889);
/*  321 */       localev1.h(1710626180);
/*      */     }
/*      */   }
/*      */ 
/*      */   public static fw ab(ch paramch, int paramInt1, int paramInt2)
/*      */   {
/*   60 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 662785868);
/*   61 */     if (arrayOfByte == null) return null;
/*   62 */     return new fw(arrayOfByte);
/*      */   }
/*      */ 
/*      */   public static fw ao(ch paramch, int paramInt1, int paramInt2)
/*      */   {
/*   60 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 885034882);
/*   61 */     if (arrayOfByte == null) return null;
/*   62 */     return new fw(arrayOfByte);
/*      */   }
/*      */ 
/*      */   final int f(fw paramfw, int paramInt)
/*      */   {
/*  636 */     int m = -1;
/*  637 */     int n = paramfw.z[paramInt];
/*  638 */     int i1 = paramfw.g[paramInt];
/*  639 */     int i2 = paramfw.q[paramInt];
/*  640 */     for (int i3 = 0; i3 < this.j; i3++) {
/*  641 */       if ((n == this.z[i3]) && (i1 == this.g[i3]) && (i2 == this.q[i3])) {
/*  642 */         m = i3;
/*  643 */         break;
/*      */       }
/*      */     }
/*  646 */     if (m == -1) {
/*  647 */       this.z[this.j] = n;
/*  648 */       this.g[this.j] = i1;
/*  649 */       this.q[this.j] = i2;
/*  650 */       if (paramfw.ak != null) this.ak[this.j] = paramfw.ak[paramInt];
/*  651 */       m = this.j++;
/*      */     }
/*  653 */     return m;
/*      */   }
/*      */ 
/*      */   public static fw ar(ch paramch, int paramInt1, int paramInt2)
/*      */   {
/*   60 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 1530261137);
/*   61 */     if (arrayOfByte == null) return null;
/*   62 */     return new fw(arrayOfByte);
/*      */   }
/*      */ 
/*      */   void aq(byte[] paramArrayOfByte)
/*      */   {
/*   71 */     ev localev1 = new ev(paramArrayOfByte);
/*   72 */     ev localev2 = new ev(paramArrayOfByte);
/*   73 */     ev localev3 = new ev(paramArrayOfByte);
/*   74 */     ev localev4 = new ev(paramArrayOfByte);
/*   75 */     ev localev5 = new ev(paramArrayOfByte);
/*   76 */     ev localev6 = new ev(paramArrayOfByte);
/*   77 */     ev localev7 = new ev(paramArrayOfByte);
/*   78 */     localev1.c = ((paramArrayOfByte.length - 23) * -941396361);
/*   79 */     int m = localev1.k(-1987080889);
/*   80 */     int n = localev1.k(-1987080889);
/*   81 */     int i1 = localev1.t(1118814123);
/*   82 */     int i2 = localev1.t(1118814123);
/*   83 */     int i3 = localev1.t(1118814123);
/*   84 */     int i4 = localev1.t(1118814123);
/*   85 */     int i5 = localev1.t(1118814123);
/*   86 */     int i6 = localev1.t(1118814123);
/*   87 */     int i7 = localev1.t(1118814123);
/*   88 */     int i8 = localev1.k(-1987080889);
/*   89 */     int i9 = localev1.k(-1987080889);
/*   90 */     int i10 = localev1.k(-1987080889);
/*   91 */     int i11 = localev1.k(-1987080889);
/*   92 */     int i12 = localev1.k(-1987080889);
/*   93 */     int i13 = 0;
/*   94 */     int i14 = 0;
/*   95 */     int i15 = 0;
/*   96 */     if (i1 > 0) {
/*   97 */       this.a = new byte[i1];
/*   98 */       localev1.c = 0;
/*   99 */       for (i16 = 0; i16 < i1; i16++) {
/*  100 */         i17 = this.a[i16] = localev1.f(2002687137);
/*  101 */         if (i17 == 0) i13++;
/*  102 */         if ((i17 >= 1) && (i17 <= 3)) i14++;
/*  103 */         if (i17 == 2) i15++;
/*      */       }
/*      */     }
/*  106 */     int i16 = i1;
/*  107 */     int i17 = i16;
/*  108 */     i16 += m;
/*  109 */     int i18 = i16;
/*  110 */     if (i2 == 1) i16 += n;
/*  111 */     int i19 = i16;
/*  112 */     i16 += n;
/*  113 */     int i20 = i16;
/*  114 */     if (i3 == 255) i16 += n;
/*  115 */     int i21 = i16;
/*  116 */     if (i5 == 1) i16 += n;
/*  117 */     int i22 = i16;
/*  118 */     if (i7 == 1) i16 += m;
/*  119 */     int i23 = i16;
/*  120 */     if (i4 == 1) i16 += n;
/*  121 */     int i24 = i16;
/*  122 */     i16 += i11;
/*  123 */     int i25 = i16;
/*  124 */     if (i6 == 1) i16 += n * 2;
/*  125 */     int i26 = i16;
/*  126 */     i16 += i12;
/*  127 */     int i27 = i16;
/*  128 */     i16 += n * 2;
/*  129 */     int i28 = i16;
/*  130 */     i16 += i8;
/*  131 */     int i29 = i16;
/*  132 */     i16 += i9;
/*  133 */     int i30 = i16;
/*  134 */     i16 += i10;
/*  135 */     int i31 = i16;
/*  136 */     i16 += i13 * 6;
/*  137 */     int i32 = i16;
/*  138 */     i16 += i14 * 6;
/*  139 */     int i33 = i16;
/*  140 */     i16 += i14 * 6;
/*  141 */     int i34 = i16;
/*  142 */     i16 += i14 * 2;
/*  143 */     int i35 = i16;
/*  144 */     i16 += i14;
/*  145 */     int i36 = i16;
/*  146 */     i16 += i14 * 2 + i15 * 2;
/*  147 */     int i37 = i16;
/*  148 */     this.j = m;
/*  149 */     this.i = n;
/*  150 */     this.o = i1;
/*  151 */     this.z = new int[m];
/*  152 */     this.g = new int[m];
/*  153 */     this.q = new int[m];
/*  154 */     this.s = new int[n];
/*  155 */     this.u = new int[n];
/*  156 */     this.v = new int[n];
/*  157 */     if (i7 == 1) this.ak = new int[m];
/*  158 */     if (i2 == 1) this.w = new byte[n];
/*  159 */     if (i3 == 255) this.e = new byte[n]; else
/*  160 */       this.k = ((byte)i3);
/*  161 */     if (i4 == 1) this.b = new byte[n];
/*  162 */     if (i5 == 1) this.az = new int[n];
/*  163 */     if (i6 == 1) this.f = new short[n];
/*  164 */     if ((i6 == 1) && (i1 > 0)) this.y = new byte[n];
/*  165 */     this.t = new short[n];
/*  166 */     if (i1 > 0) {
/*  167 */       this.h = new short[i1];
/*  168 */       this.x = new short[i1];
/*  169 */       this.p = new short[i1];
/*  170 */       if (i14 > 0) {
/*  171 */         this.ad = new short[i14];
/*  172 */         this.ac = new short[i14];
/*  173 */         this.aa = new short[i14];
/*  174 */         this.as = new short[i14];
/*  175 */         this.av = new byte[i14];
/*  176 */         this.am = new short[i14];
/*      */       }
/*  178 */       if (i15 > 0) this.ap = new short[i15];
/*      */     }
/*  180 */     localev1.c = (i17 * -941396361);
/*  181 */     localev2.c = (i28 * -941396361);
/*  182 */     localev3.c = (i29 * -941396361);
/*  183 */     localev4.c = (i30 * -941396361);
/*  184 */     localev5.c = (i22 * -941396361);
/*  185 */     int i38 = 0;
/*  186 */     int i39 = 0;
/*  187 */     int i40 = 0;
/*  188 */     for (int i41 = 0; i41 < m; i41++) {
/*  189 */       i42 = localev1.t(1118814123);
/*  190 */       i43 = 0;
/*  191 */       if ((i42 & 0x1) != 0) i43 = localev2.am(-1980275014);
/*  192 */       i44 = 0;
/*  193 */       if ((i42 & 0x2) != 0) i44 = localev3.am(-1830238462);
/*  194 */       i45 = 0;
/*  195 */       if ((i42 & 0x4) != 0) i45 = localev4.am(-1155616472);
/*  196 */       this.z[i41] = (i38 + i43);
/*  197 */       this.g[i41] = (i39 + i44);
/*  198 */       this.q[i41] = (i40 + i45);
/*  199 */       i38 = this.z[i41];
/*  200 */       i39 = this.g[i41];
/*  201 */       i40 = this.q[i41];
/*  202 */       if (i7 == 1) this.ak[i41] = localev5.t(1118814123);
/*      */     }
/*  204 */     localev1.c = (i27 * -941396361);
/*  205 */     localev2.c = (i18 * -941396361);
/*  206 */     localev3.c = (i20 * -941396361);
/*  207 */     localev4.c = (i23 * -941396361);
/*  208 */     localev5.c = (i21 * -941396361);
/*  209 */     localev6.c = (i25 * -941396361);
/*  210 */     localev7.c = (i26 * -941396361);
/*  211 */     for (i41 = 0; i41 < n; i41++) {
/*  212 */       this.t[i41] = ((short)localev1.k(-1987080889));
/*  213 */       if (i2 == 1) this.w[i41] = localev2.f(2002687137);
/*  214 */       if (i3 == 255) this.e[i41] = localev3.f(2002687137);
/*  215 */       if (i4 == 1) this.b[i41] = localev4.f(2002687137);
/*  216 */       if (i5 == 1) this.az[i41] = localev5.t(1118814123);
/*  217 */       if (i6 == 1) this.f[i41] = ((short)(localev6.k(-1987080889) - 1));
/*  218 */       if ((this.y != null) && (this.f[i41] != -1)) this.y[i41] = ((byte)(localev7.t(1118814123) - 1));
/*      */     }
/*  220 */     localev1.c = (i24 * -941396361);
/*  221 */     localev2.c = (i19 * -941396361);
/*  222 */     i41 = 0;
/*  223 */     int i42 = 0;
/*  224 */     int i43 = 0;
/*  225 */     int i44 = 0;
/*      */     int i46;
/*  226 */     for (int i45 = 0; i45 < n; i45++) {
/*  227 */       i46 = localev2.t(1118814123);
/*  228 */       if (i46 == 1) {
/*  229 */         i41 = localev1.am(-1704797053) + i44;
/*  230 */         i44 = i41;
/*  231 */         i42 = localev1.am(-2015379148) + i44;
/*  232 */         i44 = i42;
/*  233 */         i43 = localev1.am(-1971137589) + i44;
/*  234 */         i44 = i43;
/*  235 */         this.s[i45] = i41;
/*  236 */         this.u[i45] = i42;
/*  237 */         this.v[i45] = i43;
/*      */       }
/*  239 */       if (i46 == 2) {
/*  240 */         i42 = i43;
/*  241 */         i43 = localev1.am(-1084605387) + i44;
/*  242 */         i44 = i43;
/*  243 */         this.s[i45] = i41;
/*  244 */         this.u[i45] = i42;
/*  245 */         this.v[i45] = i43;
/*      */       }
/*  247 */       if (i46 == 3) {
/*  248 */         i41 = i43;
/*  249 */         i43 = localev1.am(-1535077780) + i44;
/*  250 */         i44 = i43;
/*  251 */         this.s[i45] = i41;
/*  252 */         this.u[i45] = i42;
/*  253 */         this.v[i45] = i43;
/*      */       }
/*  255 */       if (i46 == 4) {
/*  256 */         int i47 = i41;
/*  257 */         i41 = i42;
/*  258 */         i42 = i47;
/*  259 */         i43 = localev1.am(-2101892771) + i44;
/*  260 */         i44 = i43;
/*  261 */         this.s[i45] = i41;
/*  262 */         this.u[i45] = i42;
/*  263 */         this.v[i45] = i43;
/*      */       }
/*      */     }
/*  266 */     localev1.c = (i31 * -941396361);
/*  267 */     localev2.c = (i32 * -941396361);
/*  268 */     localev3.c = (i33 * -941396361);
/*  269 */     localev4.c = (i34 * -941396361);
/*  270 */     localev5.c = (i35 * -941396361);
/*  271 */     localev6.c = (i36 * -941396361);
/*  272 */     for (i45 = 0; i45 < i1; i45++) {
/*  273 */       i46 = this.a[i45] & 0xFF;
/*  274 */       if (i46 == 0) {
/*  275 */         this.h[i45] = ((short)localev1.k(-1987080889));
/*  276 */         this.x[i45] = ((short)localev1.k(-1987080889));
/*  277 */         this.p[i45] = ((short)localev1.k(-1987080889));
/*      */       }
/*  279 */       if (i46 == 1) {
/*  280 */         this.h[i45] = ((short)localev2.k(-1987080889));
/*  281 */         this.x[i45] = ((short)localev2.k(-1987080889));
/*  282 */         this.p[i45] = ((short)localev2.k(-1987080889));
/*  283 */         this.ad[i45] = ((short)localev3.k(-1987080889));
/*  284 */         this.ac[i45] = ((short)localev3.k(-1987080889));
/*  285 */         this.aa[i45] = ((short)localev3.k(-1987080889));
/*  286 */         this.as[i45] = ((short)localev4.k(-1987080889));
/*  287 */         this.av[i45] = localev5.f(2002687137);
/*  288 */         this.am[i45] = ((short)localev6.k(-1987080889));
/*      */       }
/*  290 */       if (i46 == 2) {
/*  291 */         this.h[i45] = ((short)localev2.k(-1987080889));
/*  292 */         this.x[i45] = ((short)localev2.k(-1987080889));
/*  293 */         this.p[i45] = ((short)localev2.k(-1987080889));
/*  294 */         this.ad[i45] = ((short)localev3.k(-1987080889));
/*  295 */         this.ac[i45] = ((short)localev3.k(-1987080889));
/*  296 */         this.aa[i45] = ((short)localev3.k(-1987080889));
/*  297 */         this.as[i45] = ((short)localev4.k(-1987080889));
/*  298 */         this.av[i45] = localev5.f(2002687137);
/*  299 */         this.am[i45] = ((short)localev6.k(-1987080889));
/*  300 */         this.ap[i45] = ((short)localev6.k(-1987080889));
/*      */       }
/*  302 */       if (i46 == 3) {
/*  303 */         this.h[i45] = ((short)localev2.k(-1987080889));
/*  304 */         this.x[i45] = ((short)localev2.k(-1987080889));
/*  305 */         this.p[i45] = ((short)localev2.k(-1987080889));
/*  306 */         this.ad[i45] = ((short)localev3.k(-1987080889));
/*  307 */         this.ac[i45] = ((short)localev3.k(-1987080889));
/*  308 */         this.aa[i45] = ((short)localev3.k(-1987080889));
/*  309 */         this.as[i45] = ((short)localev4.k(-1987080889));
/*  310 */         this.av[i45] = localev5.f(2002687137);
/*  311 */         this.am[i45] = ((short)localev6.k(-1987080889));
/*      */       }
/*      */     }
/*  314 */     localev1.c = (i37 * -941396361);
/*  315 */     i45 = localev1.t(1118814123);
/*  316 */     if (i45 != 0) {
/*  317 */       new aj();
/*  318 */       localev1.k(-1987080889);
/*  319 */       localev1.k(-1987080889);
/*  320 */       localev1.k(-1987080889);
/*  321 */       localev1.h(-1201358267);
/*      */     }
/*      */   }
/*      */ 
/*      */   void at(byte[] paramArrayOfByte)
/*      */   {
/*   71 */     ev localev1 = new ev(paramArrayOfByte);
/*   72 */     ev localev2 = new ev(paramArrayOfByte);
/*   73 */     ev localev3 = new ev(paramArrayOfByte);
/*   74 */     ev localev4 = new ev(paramArrayOfByte);
/*   75 */     ev localev5 = new ev(paramArrayOfByte);
/*   76 */     ev localev6 = new ev(paramArrayOfByte);
/*   77 */     ev localev7 = new ev(paramArrayOfByte);
/*   78 */     localev1.c = ((paramArrayOfByte.length - 23) * -941396361);
/*   79 */     int m = localev1.k(-1987080889);
/*   80 */     int n = localev1.k(-1987080889);
/*   81 */     int i1 = localev1.t(1118814123);
/*   82 */     int i2 = localev1.t(1118814123);
/*   83 */     int i3 = localev1.t(1118814123);
/*   84 */     int i4 = localev1.t(1118814123);
/*   85 */     int i5 = localev1.t(1118814123);
/*   86 */     int i6 = localev1.t(1118814123);
/*   87 */     int i7 = localev1.t(1118814123);
/*   88 */     int i8 = localev1.k(-1987080889);
/*   89 */     int i9 = localev1.k(-1987080889);
/*   90 */     int i10 = localev1.k(-1987080889);
/*   91 */     int i11 = localev1.k(-1987080889);
/*   92 */     int i12 = localev1.k(-1987080889);
/*   93 */     int i13 = 0;
/*   94 */     int i14 = 0;
/*   95 */     int i15 = 0;
/*   96 */     if (i1 > 0) {
/*   97 */       this.a = new byte[i1];
/*   98 */       localev1.c = 0;
/*   99 */       for (i16 = 0; i16 < i1; i16++) {
/*  100 */         i17 = this.a[i16] = localev1.f(2002687137);
/*  101 */         if (i17 == 0) i13++;
/*  102 */         if ((i17 >= 1) && (i17 <= 3)) i14++;
/*  103 */         if (i17 == 2) i15++;
/*      */       }
/*      */     }
/*  106 */     int i16 = i1;
/*  107 */     int i17 = i16;
/*  108 */     i16 += m;
/*  109 */     int i18 = i16;
/*  110 */     if (i2 == 1) i16 += n;
/*  111 */     int i19 = i16;
/*  112 */     i16 += n;
/*  113 */     int i20 = i16;
/*  114 */     if (i3 == 255) i16 += n;
/*  115 */     int i21 = i16;
/*  116 */     if (i5 == 1) i16 += n;
/*  117 */     int i22 = i16;
/*  118 */     if (i7 == 1) i16 += m;
/*  119 */     int i23 = i16;
/*  120 */     if (i4 == 1) i16 += n;
/*  121 */     int i24 = i16;
/*  122 */     i16 += i11;
/*  123 */     int i25 = i16;
/*  124 */     if (i6 == 1) i16 += n * 2;
/*  125 */     int i26 = i16;
/*  126 */     i16 += i12;
/*  127 */     int i27 = i16;
/*  128 */     i16 += n * 2;
/*  129 */     int i28 = i16;
/*  130 */     i16 += i8;
/*  131 */     int i29 = i16;
/*  132 */     i16 += i9;
/*  133 */     int i30 = i16;
/*  134 */     i16 += i10;
/*  135 */     int i31 = i16;
/*  136 */     i16 += i13 * 6;
/*  137 */     int i32 = i16;
/*  138 */     i16 += i14 * 6;
/*  139 */     int i33 = i16;
/*  140 */     i16 += i14 * 6;
/*  141 */     int i34 = i16;
/*  142 */     i16 += i14 * 2;
/*  143 */     int i35 = i16;
/*  144 */     i16 += i14;
/*  145 */     int i36 = i16;
/*  146 */     i16 += i14 * 2 + i15 * 2;
/*  147 */     int i37 = i16;
/*  148 */     this.j = m;
/*  149 */     this.i = n;
/*  150 */     this.o = i1;
/*  151 */     this.z = new int[m];
/*  152 */     this.g = new int[m];
/*  153 */     this.q = new int[m];
/*  154 */     this.s = new int[n];
/*  155 */     this.u = new int[n];
/*  156 */     this.v = new int[n];
/*  157 */     if (i7 == 1) this.ak = new int[m];
/*  158 */     if (i2 == 1) this.w = new byte[n];
/*  159 */     if (i3 == 255) this.e = new byte[n]; else
/*  160 */       this.k = ((byte)i3);
/*  161 */     if (i4 == 1) this.b = new byte[n];
/*  162 */     if (i5 == 1) this.az = new int[n];
/*  163 */     if (i6 == 1) this.f = new short[n];
/*  164 */     if ((i6 == 1) && (i1 > 0)) this.y = new byte[n];
/*  165 */     this.t = new short[n];
/*  166 */     if (i1 > 0) {
/*  167 */       this.h = new short[i1];
/*  168 */       this.x = new short[i1];
/*  169 */       this.p = new short[i1];
/*  170 */       if (i14 > 0) {
/*  171 */         this.ad = new short[i14];
/*  172 */         this.ac = new short[i14];
/*  173 */         this.aa = new short[i14];
/*  174 */         this.as = new short[i14];
/*  175 */         this.av = new byte[i14];
/*  176 */         this.am = new short[i14];
/*      */       }
/*  178 */       if (i15 > 0) this.ap = new short[i15];
/*      */     }
/*  180 */     localev1.c = (i17 * -941396361);
/*  181 */     localev2.c = (i28 * -941396361);
/*  182 */     localev3.c = (i29 * -941396361);
/*  183 */     localev4.c = (i30 * -941396361);
/*  184 */     localev5.c = (i22 * -941396361);
/*  185 */     int i38 = 0;
/*  186 */     int i39 = 0;
/*  187 */     int i40 = 0;
/*  188 */     for (int i41 = 0; i41 < m; i41++) {
/*  189 */       i42 = localev1.t(1118814123);
/*  190 */       i43 = 0;
/*  191 */       if ((i42 & 0x1) != 0) i43 = localev2.am(-1100790651);
/*  192 */       i44 = 0;
/*  193 */       if ((i42 & 0x2) != 0) i44 = localev3.am(-1093769597);
/*  194 */       i45 = 0;
/*  195 */       if ((i42 & 0x4) != 0) i45 = localev4.am(-828971289);
/*  196 */       this.z[i41] = (i38 + i43);
/*  197 */       this.g[i41] = (i39 + i44);
/*  198 */       this.q[i41] = (i40 + i45);
/*  199 */       i38 = this.z[i41];
/*  200 */       i39 = this.g[i41];
/*  201 */       i40 = this.q[i41];
/*  202 */       if (i7 == 1) this.ak[i41] = localev5.t(1118814123);
/*      */     }
/*  204 */     localev1.c = (i27 * -941396361);
/*  205 */     localev2.c = (i18 * -941396361);
/*  206 */     localev3.c = (i20 * -941396361);
/*  207 */     localev4.c = (i23 * -941396361);
/*  208 */     localev5.c = (i21 * -941396361);
/*  209 */     localev6.c = (i25 * -941396361);
/*  210 */     localev7.c = (i26 * -941396361);
/*  211 */     for (i41 = 0; i41 < n; i41++) {
/*  212 */       this.t[i41] = ((short)localev1.k(-1987080889));
/*  213 */       if (i2 == 1) this.w[i41] = localev2.f(2002687137);
/*  214 */       if (i3 == 255) this.e[i41] = localev3.f(2002687137);
/*  215 */       if (i4 == 1) this.b[i41] = localev4.f(2002687137);
/*  216 */       if (i5 == 1) this.az[i41] = localev5.t(1118814123);
/*  217 */       if (i6 == 1) this.f[i41] = ((short)(localev6.k(-1987080889) - 1));
/*  218 */       if ((this.y != null) && (this.f[i41] != -1)) this.y[i41] = ((byte)(localev7.t(1118814123) - 1));
/*      */     }
/*  220 */     localev1.c = (i24 * -941396361);
/*  221 */     localev2.c = (i19 * -941396361);
/*  222 */     i41 = 0;
/*  223 */     int i42 = 0;
/*  224 */     int i43 = 0;
/*  225 */     int i44 = 0;
/*      */     int i46;
/*  226 */     for (int i45 = 0; i45 < n; i45++) {
/*  227 */       i46 = localev2.t(1118814123);
/*  228 */       if (i46 == 1) {
/*  229 */         i41 = localev1.am(-1588616951) + i44;
/*  230 */         i44 = i41;
/*  231 */         i42 = localev1.am(-2053171642) + i44;
/*  232 */         i44 = i42;
/*  233 */         i43 = localev1.am(-1143648256) + i44;
/*  234 */         i44 = i43;
/*  235 */         this.s[i45] = i41;
/*  236 */         this.u[i45] = i42;
/*  237 */         this.v[i45] = i43;
/*      */       }
/*  239 */       if (i46 == 2) {
/*  240 */         i42 = i43;
/*  241 */         i43 = localev1.am(-1693571882) + i44;
/*  242 */         i44 = i43;
/*  243 */         this.s[i45] = i41;
/*  244 */         this.u[i45] = i42;
/*  245 */         this.v[i45] = i43;
/*      */       }
/*  247 */       if (i46 == 3) {
/*  248 */         i41 = i43;
/*  249 */         i43 = localev1.am(-963159563) + i44;
/*  250 */         i44 = i43;
/*  251 */         this.s[i45] = i41;
/*  252 */         this.u[i45] = i42;
/*  253 */         this.v[i45] = i43;
/*      */       }
/*  255 */       if (i46 == 4) {
/*  256 */         int i47 = i41;
/*  257 */         i41 = i42;
/*  258 */         i42 = i47;
/*  259 */         i43 = localev1.am(-1688560275) + i44;
/*  260 */         i44 = i43;
/*  261 */         this.s[i45] = i41;
/*  262 */         this.u[i45] = i42;
/*  263 */         this.v[i45] = i43;
/*      */       }
/*      */     }
/*  266 */     localev1.c = (i31 * -941396361);
/*  267 */     localev2.c = (i32 * -941396361);
/*  268 */     localev3.c = (i33 * -941396361);
/*  269 */     localev4.c = (i34 * -941396361);
/*  270 */     localev5.c = (i35 * -941396361);
/*  271 */     localev6.c = (i36 * -941396361);
/*  272 */     for (i45 = 0; i45 < i1; i45++) {
/*  273 */       i46 = this.a[i45] & 0xFF;
/*  274 */       if (i46 == 0) {
/*  275 */         this.h[i45] = ((short)localev1.k(-1987080889));
/*  276 */         this.x[i45] = ((short)localev1.k(-1987080889));
/*  277 */         this.p[i45] = ((short)localev1.k(-1987080889));
/*      */       }
/*  279 */       if (i46 == 1) {
/*  280 */         this.h[i45] = ((short)localev2.k(-1987080889));
/*  281 */         this.x[i45] = ((short)localev2.k(-1987080889));
/*  282 */         this.p[i45] = ((short)localev2.k(-1987080889));
/*  283 */         this.ad[i45] = ((short)localev3.k(-1987080889));
/*  284 */         this.ac[i45] = ((short)localev3.k(-1987080889));
/*  285 */         this.aa[i45] = ((short)localev3.k(-1987080889));
/*  286 */         this.as[i45] = ((short)localev4.k(-1987080889));
/*  287 */         this.av[i45] = localev5.f(2002687137);
/*  288 */         this.am[i45] = ((short)localev6.k(-1987080889));
/*      */       }
/*  290 */       if (i46 == 2) {
/*  291 */         this.h[i45] = ((short)localev2.k(-1987080889));
/*  292 */         this.x[i45] = ((short)localev2.k(-1987080889));
/*  293 */         this.p[i45] = ((short)localev2.k(-1987080889));
/*  294 */         this.ad[i45] = ((short)localev3.k(-1987080889));
/*  295 */         this.ac[i45] = ((short)localev3.k(-1987080889));
/*  296 */         this.aa[i45] = ((short)localev3.k(-1987080889));
/*  297 */         this.as[i45] = ((short)localev4.k(-1987080889));
/*  298 */         this.av[i45] = localev5.f(2002687137);
/*  299 */         this.am[i45] = ((short)localev6.k(-1987080889));
/*  300 */         this.ap[i45] = ((short)localev6.k(-1987080889));
/*      */       }
/*  302 */       if (i46 == 3) {
/*  303 */         this.h[i45] = ((short)localev2.k(-1987080889));
/*  304 */         this.x[i45] = ((short)localev2.k(-1987080889));
/*  305 */         this.p[i45] = ((short)localev2.k(-1987080889));
/*  306 */         this.ad[i45] = ((short)localev3.k(-1987080889));
/*  307 */         this.ac[i45] = ((short)localev3.k(-1987080889));
/*  308 */         this.aa[i45] = ((short)localev3.k(-1987080889));
/*  309 */         this.as[i45] = ((short)localev4.k(-1987080889));
/*  310 */         this.av[i45] = localev5.f(2002687137);
/*  311 */         this.am[i45] = ((short)localev6.k(-1987080889));
/*      */       }
/*      */     }
/*  314 */     localev1.c = (i37 * -941396361);
/*  315 */     i45 = localev1.t(1118814123);
/*  316 */     if (i45 != 0) {
/*  317 */       new aj();
/*  318 */       localev1.k(-1987080889);
/*  319 */       localev1.k(-1987080889);
/*  320 */       localev1.k(-1987080889);
/*  321 */       localev1.h(426218296);
/*      */     }
/*      */   }
/*      */ 
/*      */   void ae(byte[] paramArrayOfByte) {
/*  326 */     int m = 0;
/*  327 */     int n = 0;
/*  328 */     ev localev1 = new ev(paramArrayOfByte);
/*  329 */     ev localev2 = new ev(paramArrayOfByte);
/*  330 */     ev localev3 = new ev(paramArrayOfByte);
/*  331 */     ev localev4 = new ev(paramArrayOfByte);
/*  332 */     ev localev5 = new ev(paramArrayOfByte);
/*  333 */     localev1.c = ((paramArrayOfByte.length - 18) * -941396361);
/*  334 */     int i1 = localev1.k(-1987080889);
/*  335 */     int i2 = localev1.k(-1987080889);
/*  336 */     int i3 = localev1.t(1118814123);
/*  337 */     int i4 = localev1.t(1118814123);
/*  338 */     int i5 = localev1.t(1118814123);
/*  339 */     int i6 = localev1.t(1118814123);
/*  340 */     int i7 = localev1.t(1118814123);
/*  341 */     int i8 = localev1.t(1118814123);
/*  342 */     int i9 = localev1.k(-1987080889);
/*  343 */     int i10 = localev1.k(-1987080889);
/*  344 */     int i11 = localev1.k(-1987080889);
/*  345 */     int i12 = localev1.k(-1987080889);
/*  346 */     int i13 = 0;
/*  347 */     int i14 = i13;
/*  348 */     i13 += i1;
/*  349 */     int i15 = i13;
/*  350 */     i13 += i2;
/*  351 */     int i16 = i13;
/*  352 */     if (i5 == 255) i13 += i2;
/*  353 */     int i17 = i13;
/*  354 */     if (i7 == 1) i13 += i2;
/*  355 */     int i18 = i13;
/*  356 */     if (i4 == 1) i13 += i2;
/*  357 */     int i19 = i13;
/*  358 */     if (i8 == 1) i13 += i1;
/*  359 */     int i20 = i13;
/*  360 */     if (i6 == 1) i13 += i2;
/*  361 */     int i21 = i13;
/*  362 */     i13 += i12;
/*  363 */     int i22 = i13;
/*  364 */     i13 += i2 * 2;
/*  365 */     int i23 = i13;
/*  366 */     i13 += i3 * 6;
/*  367 */     int i24 = i13;
/*  368 */     i13 += i9;
/*  369 */     int i25 = i13;
/*  370 */     i13 += i10;
/*  371 */     int i26 = i13;
/*  372 */     i13 += i11;
/*  373 */     this.j = i1;
/*  374 */     this.i = i2;
/*  375 */     this.o = i3;
/*  376 */     this.z = new int[i1];
/*  377 */     this.g = new int[i1];
/*  378 */     this.q = new int[i1];
/*  379 */     this.s = new int[i2];
/*  380 */     this.u = new int[i2];
/*  381 */     this.v = new int[i2];
/*  382 */     if (i3 > 0) {
/*  383 */       this.a = new byte[i3];
/*  384 */       this.h = new short[i3];
/*  385 */       this.x = new short[i3];
/*  386 */       this.p = new short[i3];
/*      */     }
/*  388 */     if (i8 == 1) this.ak = new int[i1];
/*  389 */     if (i4 == 1) {
/*  390 */       this.w = new byte[i2];
/*  391 */       this.y = new byte[i2];
/*  392 */       this.f = new short[i2];
/*      */     }
/*  394 */     if (i5 == 255) this.e = new byte[i2]; else
/*  395 */       this.k = ((byte)i5);
/*  396 */     if (i6 == 1) this.b = new byte[i2];
/*  397 */     if (i7 == 1) this.az = new int[i2];
/*  398 */     this.t = new short[i2];
/*  399 */     localev1.c = (i14 * -941396361);
/*  400 */     localev2.c = (i24 * -941396361);
/*  401 */     localev3.c = (i25 * -941396361);
/*  402 */     localev4.c = (i26 * -941396361);
/*  403 */     localev5.c = (i19 * -941396361);
/*  404 */     int i27 = 0;
/*  405 */     int i28 = 0;
/*  406 */     int i29 = 0;
/*  407 */     for (int i30 = 0; i30 < i1; i30++) {
/*  408 */       i31 = localev1.t(1118814123);
/*  409 */       i32 = 0;
/*  410 */       if ((i31 & 0x1) != 0) i32 = localev2.am(-2056990904);
/*  411 */       i33 = 0;
/*  412 */       if ((i31 & 0x2) != 0) i33 = localev3.am(-1378413396);
/*  413 */       i34 = 0;
/*  414 */       if ((i31 & 0x4) != 0) i34 = localev4.am(-1964785641);
/*  415 */       this.z[i30] = (i27 + i32);
/*  416 */       this.g[i30] = (i28 + i33);
/*  417 */       this.q[i30] = (i29 + i34);
/*  418 */       i27 = this.z[i30];
/*  419 */       i28 = this.g[i30];
/*  420 */       i29 = this.q[i30];
/*  421 */       if (i8 == 1) this.ak[i30] = localev5.t(1118814123);
/*      */     }
/*  423 */     localev1.c = (i22 * -941396361);
/*  424 */     localev2.c = (i18 * -941396361);
/*  425 */     localev3.c = (i16 * -941396361);
/*  426 */     localev4.c = (i20 * -941396361);
/*  427 */     localev5.c = (i17 * -941396361);
/*  428 */     for (i30 = 0; i30 < i2; i30++) {
/*  429 */       this.t[i30] = ((short)localev1.k(-1987080889));
/*  430 */       if (i4 == 1) {
/*  431 */         i31 = localev2.t(1118814123);
/*  432 */         if ((i31 & 0x1) == 1) {
/*  433 */           this.w[i30] = 1;
/*  434 */           m = 1;
/*      */         } else {
/*  436 */           this.w[i30] = 0;
/*  437 */         }if ((i31 & 0x2) == 2) {
/*  438 */           this.y[i30] = ((byte)(i31 >> 2));
/*  439 */           this.f[i30] = this.t[i30];
/*  440 */           this.t[i30] = 127;
/*  441 */           if (this.f[i30] != -1) n = 1; 
/*      */         }
/*      */         else
/*      */         {
/*  444 */           this.y[i30] = -1;
/*  445 */           this.f[i30] = -1;
/*      */         }
/*      */       }
/*  448 */       if (i5 == 255) this.e[i30] = localev3.f(2002687137);
/*  449 */       if (i6 == 1) this.b[i30] = localev4.f(2002687137);
/*  450 */       if (i7 == 1) this.az[i30] = localev5.t(1118814123);
/*      */     }
/*  452 */     localev1.c = (i21 * -941396361);
/*  453 */     localev2.c = (i15 * -941396361);
/*  454 */     i30 = 0;
/*  455 */     int i31 = 0;
/*  456 */     int i32 = 0;
/*  457 */     int i33 = 0;
/*      */     int i35;
/*      */     int i36;
/*  458 */     for (int i34 = 0; i34 < i2; i34++) {
/*  459 */       i35 = localev2.t(1118814123);
/*  460 */       if (i35 == 1) {
/*  461 */         i30 = localev1.am(-754145780) + i33;
/*  462 */         i33 = i30;
/*  463 */         i31 = localev1.am(-2010505569) + i33;
/*  464 */         i33 = i31;
/*  465 */         i32 = localev1.am(-1791049882) + i33;
/*  466 */         i33 = i32;
/*  467 */         this.s[i34] = i30;
/*  468 */         this.u[i34] = i31;
/*  469 */         this.v[i34] = i32;
/*      */       }
/*  471 */       if (i35 == 2) {
/*  472 */         i31 = i32;
/*  473 */         i32 = localev1.am(-1645718912) + i33;
/*  474 */         i33 = i32;
/*  475 */         this.s[i34] = i30;
/*  476 */         this.u[i34] = i31;
/*  477 */         this.v[i34] = i32;
/*      */       }
/*  479 */       if (i35 == 3) {
/*  480 */         i30 = i32;
/*  481 */         i32 = localev1.am(-1572390007) + i33;
/*  482 */         i33 = i32;
/*  483 */         this.s[i34] = i30;
/*  484 */         this.u[i34] = i31;
/*  485 */         this.v[i34] = i32;
/*      */       }
/*  487 */       if (i35 == 4) {
/*  488 */         i36 = i30;
/*  489 */         i30 = i31;
/*  490 */         i31 = i36;
/*  491 */         i32 = localev1.am(-1121832593) + i33;
/*  492 */         i33 = i32;
/*  493 */         this.s[i34] = i30;
/*  494 */         this.u[i34] = i31;
/*  495 */         this.v[i34] = i32;
/*      */       }
/*      */     }
/*  498 */     localev1.c = (i23 * -941396361);
/*  499 */     for (i34 = 0; i34 < i3; i34++) {
/*  500 */       this.a[i34] = 0;
/*  501 */       this.h[i34] = ((short)localev1.k(-1987080889));
/*  502 */       this.x[i34] = ((short)localev1.k(-1987080889));
/*  503 */       this.p[i34] = ((short)localev1.k(-1987080889));
/*      */     }
/*  505 */     if (this.y != null) {
/*  506 */       i34 = 0;
/*  507 */       for (i35 = 0; i35 < i2; i35++) {
/*  508 */         i36 = this.y[i35] & 0xFF;
/*  509 */         if (i36 != 255) {
/*  510 */           if (((this.h[i36] & 0xFFFF) == this.s[i35]) && ((this.x[i36] & 0xFFFF) == this.u[i35]) && ((this.p[i36] & 0xFFFF) == this.v[i35])) this.y[i35] = -1; else
/*  511 */             i34 = 1;
/*      */         }
/*      */       }
/*  514 */       if (i34 == 0) this.y = null;
/*      */     }
/*  516 */     if (n == 0) this.f = null;
/*  517 */     if (m == 0) this.w = null;
/*      */   }
/*      */ 
/*      */   fw(byte[] paramArrayOfByte)
/*      */   {
/*   66 */     if ((paramArrayOfByte[(paramArrayOfByte.length - 1)] == -1) && (paramArrayOfByte[(paramArrayOfByte.length - 2)] == -1)) y(paramArrayOfByte); else
/*   67 */       t(paramArrayOfByte);
/*      */   }
/*      */ 
/*      */   void ax(byte[] paramArrayOfByte)
/*      */   {
/*  326 */     int m = 0;
/*  327 */     int n = 0;
/*  328 */     ev localev1 = new ev(paramArrayOfByte);
/*  329 */     ev localev2 = new ev(paramArrayOfByte);
/*  330 */     ev localev3 = new ev(paramArrayOfByte);
/*  331 */     ev localev4 = new ev(paramArrayOfByte);
/*  332 */     ev localev5 = new ev(paramArrayOfByte);
/*  333 */     localev1.c = ((paramArrayOfByte.length - 18) * -941396361);
/*  334 */     int i1 = localev1.k(-1987080889);
/*  335 */     int i2 = localev1.k(-1987080889);
/*  336 */     int i3 = localev1.t(1118814123);
/*  337 */     int i4 = localev1.t(1118814123);
/*  338 */     int i5 = localev1.t(1118814123);
/*  339 */     int i6 = localev1.t(1118814123);
/*  340 */     int i7 = localev1.t(1118814123);
/*  341 */     int i8 = localev1.t(1118814123);
/*  342 */     int i9 = localev1.k(-1987080889);
/*  343 */     int i10 = localev1.k(-1987080889);
/*  344 */     int i11 = localev1.k(-1987080889);
/*  345 */     int i12 = localev1.k(-1987080889);
/*  346 */     int i13 = 0;
/*  347 */     int i14 = i13;
/*  348 */     i13 += i1;
/*  349 */     int i15 = i13;
/*  350 */     i13 += i2;
/*  351 */     int i16 = i13;
/*  352 */     if (i5 == 255) i13 += i2;
/*  353 */     int i17 = i13;
/*  354 */     if (i7 == 1) i13 += i2;
/*  355 */     int i18 = i13;
/*  356 */     if (i4 == 1) i13 += i2;
/*  357 */     int i19 = i13;
/*  358 */     if (i8 == 1) i13 += i1;
/*  359 */     int i20 = i13;
/*  360 */     if (i6 == 1) i13 += i2;
/*  361 */     int i21 = i13;
/*  362 */     i13 += i12;
/*  363 */     int i22 = i13;
/*  364 */     i13 += i2 * 2;
/*  365 */     int i23 = i13;
/*  366 */     i13 += i3 * 6;
/*  367 */     int i24 = i13;
/*  368 */     i13 += i9;
/*  369 */     int i25 = i13;
/*  370 */     i13 += i10;
/*  371 */     int i26 = i13;
/*  372 */     i13 += i11;
/*  373 */     this.j = i1;
/*  374 */     this.i = i2;
/*  375 */     this.o = i3;
/*  376 */     this.z = new int[i1];
/*  377 */     this.g = new int[i1];
/*  378 */     this.q = new int[i1];
/*  379 */     this.s = new int[i2];
/*  380 */     this.u = new int[i2];
/*  381 */     this.v = new int[i2];
/*  382 */     if (i3 > 0) {
/*  383 */       this.a = new byte[i3];
/*  384 */       this.h = new short[i3];
/*  385 */       this.x = new short[i3];
/*  386 */       this.p = new short[i3];
/*      */     }
/*  388 */     if (i8 == 1) this.ak = new int[i1];
/*  389 */     if (i4 == 1) {
/*  390 */       this.w = new byte[i2];
/*  391 */       this.y = new byte[i2];
/*  392 */       this.f = new short[i2];
/*      */     }
/*  394 */     if (i5 == 255) this.e = new byte[i2]; else
/*  395 */       this.k = ((byte)i5);
/*  396 */     if (i6 == 1) this.b = new byte[i2];
/*  397 */     if (i7 == 1) this.az = new int[i2];
/*  398 */     this.t = new short[i2];
/*  399 */     localev1.c = (i14 * -941396361);
/*  400 */     localev2.c = (i24 * -941396361);
/*  401 */     localev3.c = (i25 * -941396361);
/*  402 */     localev4.c = (i26 * -941396361);
/*  403 */     localev5.c = (i19 * -941396361);
/*  404 */     int i27 = 0;
/*  405 */     int i28 = 0;
/*  406 */     int i29 = 0;
/*  407 */     for (int i30 = 0; i30 < i1; i30++) {
/*  408 */       i31 = localev1.t(1118814123);
/*  409 */       i32 = 0;
/*  410 */       if ((i31 & 0x1) != 0) i32 = localev2.am(-1758996246);
/*  411 */       i33 = 0;
/*  412 */       if ((i31 & 0x2) != 0) i33 = localev3.am(-1046920744);
/*  413 */       i34 = 0;
/*  414 */       if ((i31 & 0x4) != 0) i34 = localev4.am(-1885886996);
/*  415 */       this.z[i30] = (i27 + i32);
/*  416 */       this.g[i30] = (i28 + i33);
/*  417 */       this.q[i30] = (i29 + i34);
/*  418 */       i27 = this.z[i30];
/*  419 */       i28 = this.g[i30];
/*  420 */       i29 = this.q[i30];
/*  421 */       if (i8 == 1) this.ak[i30] = localev5.t(1118814123);
/*      */     }
/*  423 */     localev1.c = (i22 * -941396361);
/*  424 */     localev2.c = (i18 * -941396361);
/*  425 */     localev3.c = (i16 * -941396361);
/*  426 */     localev4.c = (i20 * -941396361);
/*  427 */     localev5.c = (i17 * -941396361);
/*  428 */     for (i30 = 0; i30 < i2; i30++) {
/*  429 */       this.t[i30] = ((short)localev1.k(-1987080889));
/*  430 */       if (i4 == 1) {
/*  431 */         i31 = localev2.t(1118814123);
/*  432 */         if ((i31 & 0x1) == 1) {
/*  433 */           this.w[i30] = 1;
/*  434 */           m = 1;
/*      */         } else {
/*  436 */           this.w[i30] = 0;
/*  437 */         }if ((i31 & 0x2) == 2) {
/*  438 */           this.y[i30] = ((byte)(i31 >> 2));
/*  439 */           this.f[i30] = this.t[i30];
/*  440 */           this.t[i30] = 127;
/*  441 */           if (this.f[i30] != -1) n = 1; 
/*      */         }
/*      */         else
/*      */         {
/*  444 */           this.y[i30] = -1;
/*  445 */           this.f[i30] = -1;
/*      */         }
/*      */       }
/*  448 */       if (i5 == 255) this.e[i30] = localev3.f(2002687137);
/*  449 */       if (i6 == 1) this.b[i30] = localev4.f(2002687137);
/*  450 */       if (i7 == 1) this.az[i30] = localev5.t(1118814123);
/*      */     }
/*  452 */     localev1.c = (i21 * -941396361);
/*  453 */     localev2.c = (i15 * -941396361);
/*  454 */     i30 = 0;
/*  455 */     int i31 = 0;
/*  456 */     int i32 = 0;
/*  457 */     int i33 = 0;
/*      */     int i35;
/*      */     int i36;
/*  458 */     for (int i34 = 0; i34 < i2; i34++) {
/*  459 */       i35 = localev2.t(1118814123);
/*  460 */       if (i35 == 1) {
/*  461 */         i30 = localev1.am(-1379117480) + i33;
/*  462 */         i33 = i30;
/*  463 */         i31 = localev1.am(-1303105399) + i33;
/*  464 */         i33 = i31;
/*  465 */         i32 = localev1.am(-1462998085) + i33;
/*  466 */         i33 = i32;
/*  467 */         this.s[i34] = i30;
/*  468 */         this.u[i34] = i31;
/*  469 */         this.v[i34] = i32;
/*      */       }
/*  471 */       if (i35 == 2) {
/*  472 */         i31 = i32;
/*  473 */         i32 = localev1.am(-1216228387) + i33;
/*  474 */         i33 = i32;
/*  475 */         this.s[i34] = i30;
/*  476 */         this.u[i34] = i31;
/*  477 */         this.v[i34] = i32;
/*      */       }
/*  479 */       if (i35 == 3) {
/*  480 */         i30 = i32;
/*  481 */         i32 = localev1.am(-1746566871) + i33;
/*  482 */         i33 = i32;
/*  483 */         this.s[i34] = i30;
/*  484 */         this.u[i34] = i31;
/*  485 */         this.v[i34] = i32;
/*      */       }
/*  487 */       if (i35 == 4) {
/*  488 */         i36 = i30;
/*  489 */         i30 = i31;
/*  490 */         i31 = i36;
/*  491 */         i32 = localev1.am(-1857714831) + i33;
/*  492 */         i33 = i32;
/*  493 */         this.s[i34] = i30;
/*  494 */         this.u[i34] = i31;
/*  495 */         this.v[i34] = i32;
/*      */       }
/*      */     }
/*  498 */     localev1.c = (i23 * -941396361);
/*  499 */     for (i34 = 0; i34 < i3; i34++) {
/*  500 */       this.a[i34] = 0;
/*  501 */       this.h[i34] = ((short)localev1.k(-1987080889));
/*  502 */       this.x[i34] = ((short)localev1.k(-1987080889));
/*  503 */       this.p[i34] = ((short)localev1.k(-1987080889));
/*      */     }
/*  505 */     if (this.y != null) {
/*  506 */       i34 = 0;
/*  507 */       for (i35 = 0; i35 < i2; i35++) {
/*  508 */         i36 = this.y[i35] & 0xFF;
/*  509 */         if (i36 != 255) {
/*  510 */           if (((this.h[i36] & 0xFFFF) == this.s[i35]) && ((this.x[i36] & 0xFFFF) == this.u[i35]) && ((this.p[i36] & 0xFFFF) == this.v[i35])) this.y[i35] = -1; else
/*  511 */             i34 = 1;
/*      */         }
/*      */       }
/*  514 */       if (i34 == 0) this.y = null;
/*      */     }
/*  516 */     if (n == 0) this.f = null;
/*  517 */     if (m == 0) this.w = null;
/*      */   }
/*      */ 
/*      */   public void cp()
/*      */   {
/*  975 */     if (this.al != null) return;
/*  976 */     this.al = new ao[this.j];
/*  977 */     for (int m = 0; m < this.j; m++) this.al[m] = new ao();
/*  978 */     for (m = 0; m < this.i; m++) {
/*  979 */       int n = this.s[m];
/*  980 */       int i1 = this.u[m];
/*  981 */       int i2 = this.v[m];
/*  982 */       int i3 = this.z[i1] - this.z[n];
/*  983 */       int i4 = this.g[i1] - this.g[n];
/*  984 */       int i5 = this.q[i1] - this.q[n];
/*  985 */       int i6 = this.z[i2] - this.z[n];
/*  986 */       int i7 = this.g[i2] - this.g[n];
/*  987 */       int i8 = this.q[i2] - this.q[n];
/*  988 */       int i9 = i4 * i8 - i7 * i5;
/*  989 */       int i10 = i5 * i6 - i8 * i3;
/*  990 */       int i11 = i3 * i7 - i6 * i4;
/*  991 */       while ((i9 > 8192) || (i10 > 8192) || (i11 > 8192) || (i9 < -8192) || (i10 < -8192) || (i11 < -8192)) {
/*  992 */         i9 >>= 1;
/*  993 */         i10 >>= 1;
/*  994 */         i11 >>= 1;
/*      */       }
/*  996 */       int i12 = (int)Math.sqrt(i9 * i9 + i10 * i10 + i11 * i11);
/*  997 */       if (i12 <= 0) i12 = 1;
/*  998 */       i9 = i9 * 256 / i12;
/*  999 */       i10 = i10 * 256 / i12;
/* 1000 */       i11 = i11 * 256 / i12;
/*      */       int i13;
/* 1002 */       if (this.w == null) i13 = 0; else
/* 1003 */         i13 = this.w[m];
/*      */       Object localObject;
/* 1004 */       if (i13 == 0)
/*      */       {
/* 1006 */         localObject = this.al[n];
/* 1007 */         localObject.r += i9 * -51093915;
/* 1008 */         localObject.d += i10 * -2118275021;
/* 1009 */         localObject.l += i11 * -1777776979;
/* 1010 */         localObject.m += 38215753;
/* 1011 */         localObject = this.al[i1];
/* 1012 */         localObject.r += i9 * -51093915;
/* 1013 */         localObject.d += i10 * -2118275021;
/* 1014 */         localObject.l += i11 * -1777776979;
/* 1015 */         localObject.m += 38215753;
/* 1016 */         localObject = this.al[i2];
/* 1017 */         localObject.r += i9 * -51093915;
/* 1018 */         localObject.d += i10 * -2118275021;
/* 1019 */         localObject.l += i11 * -1777776979;
/* 1020 */         localObject.m += 38215753;
/*      */       }
/* 1022 */       else if (i13 == 1) {
/* 1023 */         if (this.ay == null) this.ay = new ag[this.i];
/* 1024 */         localObject = this.ay[m] =  = new ag();
/* 1025 */         ((ag)localObject).r = (i9 * 1456119963);
/* 1026 */         ((ag)localObject).d = (i10 * -1706466891);
/* 1027 */         ((ag)localObject).l = (i11 * 968018991);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   void bs()
/*      */   {
/*      */     int[] arrayOfInt;
/*      */     int m;
/*      */     int n;
/*      */     int i1;
/*  856 */     if (this.ak != null) {
/*  857 */       arrayOfInt = new int[256];
/*  858 */       m = 0;
/*  859 */       for (n = 0; n < this.j; n++) {
/*  860 */         i1 = this.ak[n];
/*  861 */         arrayOfInt[i1] += 1;
/*  862 */         if (i1 > m) m = i1;
/*      */       }
/*  864 */       this.an = new int[m + 1][];
/*  865 */       for (n = 0; n <= m; n++) {
/*  866 */         this.an[n] = new int[arrayOfInt[n]];
/*  867 */         arrayOfInt[n] = 0;
/*      */       }
/*  869 */       for (n = 0; n < this.j; n++) {
/*  870 */         i1 = this.ak[n];
/*      */         int tmp122_120 = i1;
/*      */         int[] tmp122_119 = arrayOfInt;
/*      */         int tmp124_123 = tmp122_119[tmp122_120]; tmp122_119[tmp122_120] = (tmp124_123 + 1); this.an[i1][tmp124_123] = n;
/*      */       }
/*  873 */       this.ak = null;
/*      */     }
/*  875 */     if (this.az != null) {
/*  876 */       arrayOfInt = new int[256];
/*  877 */       m = 0;
/*  878 */       for (n = 0; n < this.i; n++) {
/*  879 */         i1 = this.az[n];
/*  880 */         arrayOfInt[i1] += 1;
/*  881 */         if (i1 > m) m = i1;
/*      */       }
/*  883 */       this.ah = new int[m + 1][];
/*  884 */       for (n = 0; n <= m; n++) {
/*  885 */         this.ah[n] = new int[arrayOfInt[n]];
/*  886 */         arrayOfInt[n] = 0;
/*      */       }
/*  888 */       for (n = 0; n < this.i; n++) {
/*  889 */         i1 = this.az[n];
/*      */         int tmp263_261 = i1;
/*      */         int[] tmp263_260 = arrayOfInt;
/*      */         int tmp265_264 = tmp263_260[tmp263_261]; tmp263_260[tmp263_261] = (tmp265_264 + 1); this.ah[i1][tmp265_264] = n;
/*      */       }
/*  892 */       this.az = null;
/*      */     }
/*      */   }
/*      */ 
/*      */   void t(byte[] paramArrayOfByte)
/*      */   {
/*  326 */     int m = 0;
/*  327 */     int n = 0;
/*  328 */     ev localev1 = new ev(paramArrayOfByte);
/*  329 */     ev localev2 = new ev(paramArrayOfByte);
/*  330 */     ev localev3 = new ev(paramArrayOfByte);
/*  331 */     ev localev4 = new ev(paramArrayOfByte);
/*  332 */     ev localev5 = new ev(paramArrayOfByte);
/*  333 */     localev1.c = ((paramArrayOfByte.length - 18) * -941396361);
/*  334 */     int i1 = localev1.k(-1987080889);
/*  335 */     int i2 = localev1.k(-1987080889);
/*  336 */     int i3 = localev1.t(1118814123);
/*  337 */     int i4 = localev1.t(1118814123);
/*  338 */     int i5 = localev1.t(1118814123);
/*  339 */     int i6 = localev1.t(1118814123);
/*  340 */     int i7 = localev1.t(1118814123);
/*  341 */     int i8 = localev1.t(1118814123);
/*  342 */     int i9 = localev1.k(-1987080889);
/*  343 */     int i10 = localev1.k(-1987080889);
/*  344 */     int i11 = localev1.k(-1987080889);
/*  345 */     int i12 = localev1.k(-1987080889);
/*  346 */     int i13 = 0;
/*  347 */     int i14 = i13;
/*  348 */     i13 += i1;
/*  349 */     int i15 = i13;
/*  350 */     i13 += i2;
/*  351 */     int i16 = i13;
/*  352 */     if (i5 == 255) i13 += i2;
/*  353 */     int i17 = i13;
/*  354 */     if (i7 == 1) i13 += i2;
/*  355 */     int i18 = i13;
/*  356 */     if (i4 == 1) i13 += i2;
/*  357 */     int i19 = i13;
/*  358 */     if (i8 == 1) i13 += i1;
/*  359 */     int i20 = i13;
/*  360 */     if (i6 == 1) i13 += i2;
/*  361 */     int i21 = i13;
/*  362 */     i13 += i12;
/*  363 */     int i22 = i13;
/*  364 */     i13 += i2 * 2;
/*  365 */     int i23 = i13;
/*  366 */     i13 += i3 * 6;
/*  367 */     int i24 = i13;
/*  368 */     i13 += i9;
/*  369 */     int i25 = i13;
/*  370 */     i13 += i10;
/*  371 */     int i26 = i13;
/*  372 */     i13 += i11;
/*  373 */     this.j = i1;
/*  374 */     this.i = i2;
/*  375 */     this.o = i3;
/*  376 */     this.z = new int[i1];
/*  377 */     this.g = new int[i1];
/*  378 */     this.q = new int[i1];
/*  379 */     this.s = new int[i2];
/*  380 */     this.u = new int[i2];
/*  381 */     this.v = new int[i2];
/*  382 */     if (i3 > 0) {
/*  383 */       this.a = new byte[i3];
/*  384 */       this.h = new short[i3];
/*  385 */       this.x = new short[i3];
/*  386 */       this.p = new short[i3];
/*      */     }
/*  388 */     if (i8 == 1) this.ak = new int[i1];
/*  389 */     if (i4 == 1) {
/*  390 */       this.w = new byte[i2];
/*  391 */       this.y = new byte[i2];
/*  392 */       this.f = new short[i2];
/*      */     }
/*  394 */     if (i5 == 255) this.e = new byte[i2]; else
/*  395 */       this.k = ((byte)i5);
/*  396 */     if (i6 == 1) this.b = new byte[i2];
/*  397 */     if (i7 == 1) this.az = new int[i2];
/*  398 */     this.t = new short[i2];
/*  399 */     localev1.c = (i14 * -941396361);
/*  400 */     localev2.c = (i24 * -941396361);
/*  401 */     localev3.c = (i25 * -941396361);
/*  402 */     localev4.c = (i26 * -941396361);
/*  403 */     localev5.c = (i19 * -941396361);
/*  404 */     int i27 = 0;
/*  405 */     int i28 = 0;
/*  406 */     int i29 = 0;
/*  407 */     for (int i30 = 0; i30 < i1; i30++) {
/*  408 */       i31 = localev1.t(1118814123);
/*  409 */       i32 = 0;
/*  410 */       if ((i31 & 0x1) != 0) i32 = localev2.am(-1903186782);
/*  411 */       i33 = 0;
/*  412 */       if ((i31 & 0x2) != 0) i33 = localev3.am(-1220943609);
/*  413 */       i34 = 0;
/*  414 */       if ((i31 & 0x4) != 0) i34 = localev4.am(-1027617079);
/*  415 */       this.z[i30] = (i27 + i32);
/*  416 */       this.g[i30] = (i28 + i33);
/*  417 */       this.q[i30] = (i29 + i34);
/*  418 */       i27 = this.z[i30];
/*  419 */       i28 = this.g[i30];
/*  420 */       i29 = this.q[i30];
/*  421 */       if (i8 == 1) this.ak[i30] = localev5.t(1118814123);
/*      */     }
/*  423 */     localev1.c = (i22 * -941396361);
/*  424 */     localev2.c = (i18 * -941396361);
/*  425 */     localev3.c = (i16 * -941396361);
/*  426 */     localev4.c = (i20 * -941396361);
/*  427 */     localev5.c = (i17 * -941396361);
/*  428 */     for (i30 = 0; i30 < i2; i30++) {
/*  429 */       this.t[i30] = ((short)localev1.k(-1987080889));
/*  430 */       if (i4 == 1) {
/*  431 */         i31 = localev2.t(1118814123);
/*  432 */         if ((i31 & 0x1) == 1) {
/*  433 */           this.w[i30] = 1;
/*  434 */           m = 1;
/*      */         } else {
/*  436 */           this.w[i30] = 0;
/*  437 */         }if ((i31 & 0x2) == 2) {
/*  438 */           this.y[i30] = ((byte)(i31 >> 2));
/*  439 */           this.f[i30] = this.t[i30];
/*  440 */           this.t[i30] = 127;
/*  441 */           if (this.f[i30] != -1) n = 1; 
/*      */         }
/*      */         else
/*      */         {
/*  444 */           this.y[i30] = -1;
/*  445 */           this.f[i30] = -1;
/*      */         }
/*      */       }
/*  448 */       if (i5 == 255) this.e[i30] = localev3.f(2002687137);
/*  449 */       if (i6 == 1) this.b[i30] = localev4.f(2002687137);
/*  450 */       if (i7 == 1) this.az[i30] = localev5.t(1118814123);
/*      */     }
/*  452 */     localev1.c = (i21 * -941396361);
/*  453 */     localev2.c = (i15 * -941396361);
/*  454 */     i30 = 0;
/*  455 */     int i31 = 0;
/*  456 */     int i32 = 0;
/*  457 */     int i33 = 0;
/*      */     int i35;
/*      */     int i36;
/*  458 */     for (int i34 = 0; i34 < i2; i34++) {
/*  459 */       i35 = localev2.t(1118814123);
/*  460 */       if (i35 == 1) {
/*  461 */         i30 = localev1.am(-772596720) + i33;
/*  462 */         i33 = i30;
/*  463 */         i31 = localev1.am(-2073553720) + i33;
/*  464 */         i33 = i31;
/*  465 */         i32 = localev1.am(-1971452997) + i33;
/*  466 */         i33 = i32;
/*  467 */         this.s[i34] = i30;
/*  468 */         this.u[i34] = i31;
/*  469 */         this.v[i34] = i32;
/*      */       }
/*  471 */       if (i35 == 2) {
/*  472 */         i31 = i32;
/*  473 */         i32 = localev1.am(-2000072778) + i33;
/*  474 */         i33 = i32;
/*  475 */         this.s[i34] = i30;
/*  476 */         this.u[i34] = i31;
/*  477 */         this.v[i34] = i32;
/*      */       }
/*  479 */       if (i35 == 3) {
/*  480 */         i30 = i32;
/*  481 */         i32 = localev1.am(-1540063144) + i33;
/*  482 */         i33 = i32;
/*  483 */         this.s[i34] = i30;
/*  484 */         this.u[i34] = i31;
/*  485 */         this.v[i34] = i32;
/*      */       }
/*  487 */       if (i35 == 4) {
/*  488 */         i36 = i30;
/*  489 */         i30 = i31;
/*  490 */         i31 = i36;
/*  491 */         i32 = localev1.am(-796195256) + i33;
/*  492 */         i33 = i32;
/*  493 */         this.s[i34] = i30;
/*  494 */         this.u[i34] = i31;
/*  495 */         this.v[i34] = i32;
/*      */       }
/*      */     }
/*  498 */     localev1.c = (i23 * -941396361);
/*  499 */     for (i34 = 0; i34 < i3; i34++) {
/*  500 */       this.a[i34] = 0;
/*  501 */       this.h[i34] = ((short)localev1.k(-1987080889));
/*  502 */       this.x[i34] = ((short)localev1.k(-1987080889));
/*  503 */       this.p[i34] = ((short)localev1.k(-1987080889));
/*      */     }
/*  505 */     if (this.y != null) {
/*  506 */       i34 = 0;
/*  507 */       for (i35 = 0; i35 < i2; i35++) {
/*  508 */         i36 = this.y[i35] & 0xFF;
/*  509 */         if (i36 != 255) {
/*  510 */           if (((this.h[i36] & 0xFFFF) == this.s[i35]) && ((this.x[i36] & 0xFFFF) == this.u[i35]) && ((this.p[i36] & 0xFFFF) == this.v[i35])) this.y[i35] = -1; else
/*  511 */             i34 = 1;
/*      */         }
/*      */       }
/*  514 */       if (i34 == 0) this.y = null;
/*      */     }
/*  516 */     if (n == 0) this.f = null;
/*  517 */     if (m == 0) this.w = null;
/*      */   }
/*      */ 
/*      */   public fw af()
/*      */   {
/*  726 */     fw localfw = new fw();
/*  727 */     if (this.w != null) {
/*  728 */       localfw.w = new byte[this.i];
/*  729 */       for (int m = 0; m < this.i; m++) localfw.w[m] = this.w[m];
/*      */     }
/*  731 */     localfw.j = this.j;
/*  732 */     localfw.i = this.i;
/*  733 */     localfw.o = this.o;
/*  734 */     localfw.z = this.z;
/*  735 */     localfw.g = this.g;
/*  736 */     localfw.q = this.q;
/*  737 */     localfw.s = this.s;
/*  738 */     localfw.u = this.u;
/*  739 */     localfw.v = this.v;
/*  740 */     localfw.e = this.e;
/*  741 */     localfw.b = this.b;
/*  742 */     localfw.y = this.y;
/*  743 */     localfw.t = this.t;
/*  744 */     localfw.f = this.f;
/*  745 */     localfw.k = this.k;
/*  746 */     localfw.a = this.a;
/*  747 */     localfw.h = this.h;
/*  748 */     localfw.x = this.x;
/*  749 */     localfw.p = this.p;
/*  750 */     localfw.ad = this.ad;
/*  751 */     localfw.ac = this.ac;
/*  752 */     localfw.aa = this.aa;
/*  753 */     localfw.as = this.as;
/*  754 */     localfw.av = this.av;
/*  755 */     localfw.am = this.am;
/*  756 */     localfw.ap = this.ap;
/*  757 */     localfw.ak = this.ak;
/*  758 */     localfw.az = this.az;
/*  759 */     localfw.an = this.an;
/*  760 */     localfw.ah = this.ah;
/*  761 */     localfw.al = this.al;
/*  762 */     localfw.ay = this.ay;
/*  763 */     localfw.ao = this.ao;
/*  764 */     localfw.ag = this.ag;
/*  765 */     return localfw;
/*      */   }
/*      */ 
/*      */   public fw bh(int[][] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4) {
/*  769 */     az();
/*  770 */     int m = paramInt1 + this.at;
/*  771 */     int n = paramInt1 + this.ae;
/*  772 */     int i1 = paramInt3 + this.ax;
/*  773 */     int i2 = paramInt3 + this.au;
/*  774 */     if ((m < 0) || (n + 128 >> 7 >= paramArrayOfInt.length) || (i1 < 0) || (i2 + 128 >> 7 >= paramArrayOfInt[0].length)) return this;
/*  775 */     m >>= 7;
/*  776 */     n = n + 127 >> 7;
/*  777 */     i1 >>= 7;
/*  778 */     i2 = i2 + 127 >> 7;
/*  779 */     if ((paramArrayOfInt[m][i1] == paramInt2) && (paramArrayOfInt[n][i1] == paramInt2) && (paramArrayOfInt[m][i2] == paramInt2) && (paramArrayOfInt[n][i2] == paramInt2)) return this;
/*      */     fw localfw;
/*  781 */     if (paramBoolean) {
/*  782 */       localfw = new fw();
/*  783 */       localfw.j = this.j;
/*  784 */       localfw.i = this.i;
/*  785 */       localfw.o = this.o;
/*  786 */       localfw.z = this.z;
/*  787 */       localfw.q = this.q;
/*  788 */       localfw.s = this.s;
/*  789 */       localfw.u = this.u;
/*  790 */       localfw.v = this.v;
/*  791 */       localfw.w = this.w;
/*  792 */       localfw.e = this.e;
/*  793 */       localfw.b = this.b;
/*  794 */       localfw.y = this.y;
/*  795 */       localfw.t = this.t;
/*  796 */       localfw.f = this.f;
/*  797 */       localfw.k = this.k;
/*  798 */       localfw.a = this.a;
/*  799 */       localfw.h = this.h;
/*  800 */       localfw.x = this.x;
/*  801 */       localfw.p = this.p;
/*  802 */       localfw.ad = this.ad;
/*  803 */       localfw.ac = this.ac;
/*  804 */       localfw.aa = this.aa;
/*  805 */       localfw.as = this.as;
/*  806 */       localfw.av = this.av;
/*  807 */       localfw.am = this.am;
/*  808 */       localfw.ap = this.ap;
/*  809 */       localfw.ak = this.ak;
/*  810 */       localfw.az = this.az;
/*  811 */       localfw.an = this.an;
/*  812 */       localfw.ah = this.ah;
/*  813 */       localfw.ao = this.ao;
/*  814 */       localfw.ag = this.ag;
/*  815 */       localfw.g = new int[localfw.j];
/*      */     }
/*      */     else {
/*  818 */       localfw = this;
/*      */     }
/*      */     int i3;
/*      */     int i4;
/*      */     int i5;
/*      */     int i6;
/*      */     int i7;
/*      */     int i8;
/*      */     int i9;
/*      */     int i10;
/*      */     int i11;
/*      */     int i12;
/*  820 */     if (paramInt4 == 0) {
/*  821 */       for (i3 = 0; i3 < localfw.j; i3++) {
/*  822 */         i4 = this.z[i3] + paramInt1;
/*  823 */         i5 = this.q[i3] + paramInt3;
/*  824 */         i6 = i4 & 0x7F;
/*  825 */         i7 = i5 & 0x7F;
/*  826 */         i8 = i4 >> 7;
/*  827 */         i9 = i5 >> 7;
/*  828 */         i10 = paramArrayOfInt[i8][i9] * (128 - i6) + paramArrayOfInt[(i8 + 1)][i9] * i6 >> 7;
/*  829 */         i11 = paramArrayOfInt[i8][(i9 + 1)] * (128 - i6) + paramArrayOfInt[(i8 + 1)][(i9 + 1)] * i6 >> 7;
/*  830 */         i12 = i10 * (128 - i7) + i11 * i7 >> 7;
/*  831 */         localfw.g[i3] = (this.g[i3] + i12 - paramInt2);
/*      */       }
/*      */     }
/*      */     else {
/*  835 */       for (i3 = 0; i3 < localfw.j; i3++) {
/*  836 */         i4 = (-this.g[i3] << 16) / (this.n * 1921388913);
/*  837 */         if (i4 < paramInt4) {
/*  838 */           i5 = this.z[i3] + paramInt1;
/*  839 */           i6 = this.q[i3] + paramInt3;
/*  840 */           i7 = i5 & 0x7F;
/*  841 */           i8 = i6 & 0x7F;
/*  842 */           i9 = i5 >> 7;
/*  843 */           i10 = i6 >> 7;
/*  844 */           i11 = paramArrayOfInt[i9][i10] * (128 - i7) + paramArrayOfInt[(i9 + 1)][i10] * i7 >> 7;
/*  845 */           i12 = paramArrayOfInt[i9][(i10 + 1)] * (128 - i7) + paramArrayOfInt[(i9 + 1)][(i10 + 1)] * i7 >> 7;
/*  846 */           int i13 = i11 * (128 - i8) + i12 * i8 >> 7;
/*  847 */           this.g[i3] += (i13 - paramInt2) * (paramInt4 - i4) / paramInt4;
/*      */         }
/*      */       }
/*      */     }
/*  851 */     localfw.ak();
/*  852 */     return localfw;
/*      */   }
/*      */ 
/*      */   public fw bi(int[][] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
/*      */   {
/*  769 */     az();
/*  770 */     int m = paramInt1 + this.at;
/*  771 */     int n = paramInt1 + this.ae;
/*  772 */     int i1 = paramInt3 + this.ax;
/*  773 */     int i2 = paramInt3 + this.au;
/*  774 */     if ((m < 0) || (n + 128 >> 7 >= paramArrayOfInt.length) || (i1 < 0) || (i2 + 128 >> 7 >= paramArrayOfInt[0].length)) return this;
/*  775 */     m >>= 7;
/*  776 */     n = n + 127 >> 7;
/*  777 */     i1 >>= 7;
/*  778 */     i2 = i2 + 127 >> 7;
/*  779 */     if ((paramArrayOfInt[m][i1] == paramInt2) && (paramArrayOfInt[n][i1] == paramInt2) && (paramArrayOfInt[m][i2] == paramInt2) && (paramArrayOfInt[n][i2] == paramInt2)) return this;
/*      */     fw localfw;
/*  781 */     if (paramBoolean) {
/*  782 */       localfw = new fw();
/*  783 */       localfw.j = this.j;
/*  784 */       localfw.i = this.i;
/*  785 */       localfw.o = this.o;
/*  786 */       localfw.z = this.z;
/*  787 */       localfw.q = this.q;
/*  788 */       localfw.s = this.s;
/*  789 */       localfw.u = this.u;
/*  790 */       localfw.v = this.v;
/*  791 */       localfw.w = this.w;
/*  792 */       localfw.e = this.e;
/*  793 */       localfw.b = this.b;
/*  794 */       localfw.y = this.y;
/*  795 */       localfw.t = this.t;
/*  796 */       localfw.f = this.f;
/*  797 */       localfw.k = this.k;
/*  798 */       localfw.a = this.a;
/*  799 */       localfw.h = this.h;
/*  800 */       localfw.x = this.x;
/*  801 */       localfw.p = this.p;
/*  802 */       localfw.ad = this.ad;
/*  803 */       localfw.ac = this.ac;
/*  804 */       localfw.aa = this.aa;
/*  805 */       localfw.as = this.as;
/*  806 */       localfw.av = this.av;
/*  807 */       localfw.am = this.am;
/*  808 */       localfw.ap = this.ap;
/*  809 */       localfw.ak = this.ak;
/*  810 */       localfw.az = this.az;
/*  811 */       localfw.an = this.an;
/*  812 */       localfw.ah = this.ah;
/*  813 */       localfw.ao = this.ao;
/*  814 */       localfw.ag = this.ag;
/*  815 */       localfw.g = new int[localfw.j];
/*      */     }
/*      */     else {
/*  818 */       localfw = this;
/*      */     }
/*      */     int i3;
/*      */     int i4;
/*      */     int i5;
/*      */     int i6;
/*      */     int i7;
/*      */     int i8;
/*      */     int i9;
/*      */     int i10;
/*      */     int i11;
/*      */     int i12;
/*  820 */     if (paramInt4 == 0) {
/*  821 */       for (i3 = 0; i3 < localfw.j; i3++) {
/*  822 */         i4 = this.z[i3] + paramInt1;
/*  823 */         i5 = this.q[i3] + paramInt3;
/*  824 */         i6 = i4 & 0x7F;
/*  825 */         i7 = i5 & 0x7F;
/*  826 */         i8 = i4 >> 7;
/*  827 */         i9 = i5 >> 7;
/*  828 */         i10 = paramArrayOfInt[i8][i9] * (128 - i6) + paramArrayOfInt[(i8 + 1)][i9] * i6 >> 7;
/*  829 */         i11 = paramArrayOfInt[i8][(i9 + 1)] * (128 - i6) + paramArrayOfInt[(i8 + 1)][(i9 + 1)] * i6 >> 7;
/*  830 */         i12 = i10 * (128 - i7) + i11 * i7 >> 7;
/*  831 */         localfw.g[i3] = (this.g[i3] + i12 - paramInt2);
/*      */       }
/*      */     }
/*      */     else {
/*  835 */       for (i3 = 0; i3 < localfw.j; i3++) {
/*  836 */         i4 = (-this.g[i3] << 16) / (this.n * 1921388913);
/*  837 */         if (i4 < paramInt4) {
/*  838 */           i5 = this.z[i3] + paramInt1;
/*  839 */           i6 = this.q[i3] + paramInt3;
/*  840 */           i7 = i5 & 0x7F;
/*  841 */           i8 = i6 & 0x7F;
/*  842 */           i9 = i5 >> 7;
/*  843 */           i10 = i6 >> 7;
/*  844 */           i11 = paramArrayOfInt[i9][i10] * (128 - i7) + paramArrayOfInt[(i9 + 1)][i10] * i7 >> 7;
/*  845 */           i12 = paramArrayOfInt[i9][(i10 + 1)] * (128 - i7) + paramArrayOfInt[(i9 + 1)][(i10 + 1)] * i7 >> 7;
/*  846 */           int i13 = i11 * (128 - i8) + i12 * i8 >> 7;
/*  847 */           this.g[i3] += (i13 - paramInt2) * (paramInt4 - i4) / paramInt4;
/*      */         }
/*      */       }
/*      */     }
/*  851 */     localfw.ak();
/*  852 */     return localfw;
/*      */   }
/*      */ 
/*      */   void co()
/*      */   {
/* 1033 */     this.al = null;
/* 1034 */     this.ab = null;
/* 1035 */     this.ay = null;
/* 1036 */     this.ar = false;
/*      */   }
/*      */ 
/*      */   public void bk()
/*      */   {
/*  897 */     for (int m = 0; m < this.j; m++) {
/*  898 */       int n = this.z[m];
/*  899 */       this.z[m] = this.q[m];
/*  900 */       this.q[m] = (-n);
/*      */     }
/*  902 */     ak();
/*      */   }
/*      */ 
/*      */   public void bv()
/*      */   {
/*  897 */     for (int m = 0; m < this.j; m++) {
/*  898 */       int n = this.z[m];
/*  899 */       this.z[m] = this.q[m];
/*  900 */       this.q[m] = (-n);
/*      */     }
/*  902 */     ak();
/*      */   }
/*      */ 
/*      */   public void bw() {
/*  906 */     for (int m = 0; m < this.j; m++) {
/*  907 */       this.z[m] = (-this.z[m]);
/*  908 */       this.q[m] = (-this.q[m]);
/*      */     }
/*  910 */     ak();
/*      */   }
/*      */ 
/*      */   public void by()
/*      */   {
/*  906 */     for (int m = 0; m < this.j; m++) {
/*  907 */       this.z[m] = (-this.z[m]);
/*  908 */       this.q[m] = (-this.q[m]);
/*      */     }
/*  910 */     ak();
/*      */   }
/*      */ 
/*      */   public void bx() {
/*  914 */     for (int m = 0; m < this.j; m++) {
/*  915 */       int n = this.q[m];
/*  916 */       this.q[m] = this.z[m];
/*  917 */       this.z[m] = (-n);
/*      */     }
/*  919 */     ak();
/*      */   }
/*      */ 
/*      */   public void bf()
/*      */   {
/*  914 */     for (int m = 0; m < this.j; m++) {
/*  915 */       int n = this.q[m];
/*  916 */       this.q[m] = this.z[m];
/*  917 */       this.z[m] = (-n);
/*      */     }
/*  919 */     ak();
/*      */   }
/*      */ 
/*      */   public void bu()
/*      */   {
/*  914 */     for (int m = 0; m < this.j; m++) {
/*  915 */       int n = this.q[m];
/*  916 */       this.q[m] = this.z[m];
/*  917 */       this.z[m] = (-n);
/*      */     }
/*  919 */     ak();
/*      */   }
/*      */ 
/*      */   public final fo cz(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/* 1118 */     av();
/* 1119 */     int m = (int)Math.sqrt(paramInt3 * paramInt3 + paramInt4 * paramInt4 + paramInt5 * paramInt5);
/* 1120 */     int n = paramInt2 * m >> 8;
/* 1121 */     fo localfo = new fo();
/* 1122 */     localfo.t = new int[this.i];
/* 1123 */     localfo.f = new int[this.i];
/* 1124 */     localfo.k = new int[this.i];
/*      */     int i2;
/*      */     int i3;
/* 1125 */     if ((this.o > 0) && (this.y != null)) {
/* 1126 */       int[] arrayOfInt = new int[this.o];
/* 1127 */       for (i2 = 0; i2 < this.i; i2++) {
/* 1128 */         if (this.y[i2] != -1) arrayOfInt[(this.y[i2] & 0xFF)] += 1;
/*      */       }
/* 1130 */       localfo.ad = 0;
/* 1131 */       for (i2 = 0; i2 < this.o; i2++) {
/* 1132 */         if ((arrayOfInt[i2] > 0) && (this.a[i2] == 0)) localfo.ad += 1;
/*      */       }
/* 1134 */       localfo.ac = new int[localfo.ad];
/* 1135 */       localfo.aa = new int[localfo.ad];
/* 1136 */       localfo.as = new int[localfo.ad];
/* 1137 */       i2 = 0;
/* 1138 */       for (i3 = 0; i3 < this.o; i3++)
/* 1139 */         if ((arrayOfInt[i3] > 0) && (this.a[i3] == 0)) {
/* 1140 */           localfo.ac[i2] = (this.h[i3] & 0xFFFF);
/* 1141 */           localfo.aa[i2] = (this.x[i3] & 0xFFFF);
/* 1142 */           localfo.as[i2] = (this.p[i3] & 0xFFFF);
/* 1143 */           arrayOfInt[i3] = (i2++);
/*      */         } else {
/* 1145 */           arrayOfInt[i3] = -1;
/*      */         }
/* 1147 */       localfo.h = new byte[this.i];
/* 1148 */       for (i3 = 0; i3 < this.i; i3++) {
/* 1149 */         if (this.y[i3] != -1) localfo.h[i3] = ((byte)arrayOfInt[(this.y[i3] & 0xFF)]); else
/* 1150 */           localfo.h[i3] = -1;
/*      */       }
/*      */     }
/* 1153 */     for (int i1 = 0; i1 < this.i; i1++)
/*      */     {
/* 1155 */       if (this.w == null) i2 = 0; else {
/* 1156 */         i2 = this.w[i1];
/*      */       }
/* 1158 */       if (this.b == null) i3 = 0; else
/* 1159 */         i3 = this.b[i1];
/* 1161 */       int i4;
/* 1161 */       if (this.f == null) i4 = -1; else
/* 1162 */         i4 = this.f[i1];
/* 1163 */       if (i3 == -2) i2 = 3;
/* 1164 */       if (i3 == -1) i2 = 2;
/*      */       Object localObject;
/*      */       int i5;
/* 1165 */       if (i4 == -1) {
/* 1166 */         if (i2 == 0)
/*      */         {
/* 1169 */           int i6 = this.t[i1] & 0xFFFF;
/* 1170 */           if ((this.ab != null) && (this.ab[this.s[i1]] != null)) localObject = this.ab[this.s[i1]]; else
/* 1171 */             localObject = this.al[this.s[i1]];
/* 1172 */           i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1173 */           localfo.t[i1] = ay(i6, i5);
/* 1174 */           if ((this.ab != null) && (this.ab[this.u[i1]] != null)) localObject = this.ab[this.u[i1]]; else
/* 1175 */             localObject = this.al[this.u[i1]];
/* 1176 */           i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1177 */           localfo.f[i1] = ay(i6, i5);
/* 1178 */           if ((this.ab != null) && (this.ab[this.v[i1]] != null)) localObject = this.ab[this.v[i1]]; else
/* 1179 */             localObject = this.al[this.v[i1]];
/* 1180 */           i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1181 */           localfo.k[i1] = ay(i6, i5);
/*      */         }
/* 1183 */         else if (i2 == 1) {
/* 1184 */           localObject = this.ay[i1];
/* 1185 */           i5 = paramInt1 + (paramInt3 * (((ag)localObject).r * 1691633043) + paramInt4 * (((ag)localObject).d * 700400797) + paramInt5 * (((ag)localObject).l * -1364591921)) / (n + n / 2);
/* 1186 */           localfo.t[i1] = ay(this.t[i1] & 0xFFFF, i5);
/* 1187 */           localfo.k[i1] = -1;
/*      */         }
/* 1189 */         else if (i2 == 3) {
/* 1190 */           localfo.t[i1] = 128;
/* 1191 */           localfo.k[i1] = -1;
/*      */         }
/*      */         else {
/* 1194 */           localfo.k[i1] = -2;
/*      */         }
/*      */ 
/*      */       }
/* 1198 */       else if (i2 == 0)
/*      */       {
/* 1201 */         if ((this.ab != null) && (this.ab[this.s[i1]] != null)) localObject = this.ab[this.s[i1]]; else
/* 1202 */           localObject = this.al[this.s[i1]];
/* 1203 */         i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1204 */         localfo.t[i1] = al(i5);
/* 1205 */         if ((this.ab != null) && (this.ab[this.u[i1]] != null)) localObject = this.ab[this.u[i1]]; else
/* 1206 */           localObject = this.al[this.u[i1]];
/* 1207 */         i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1208 */         localfo.f[i1] = al(i5);
/* 1209 */         if ((this.ab != null) && (this.ab[this.v[i1]] != null)) localObject = this.ab[this.v[i1]]; else
/* 1210 */           localObject = this.al[this.v[i1]];
/* 1211 */         i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1212 */         localfo.k[i1] = al(i5);
/*      */       }
/* 1214 */       else if (i2 == 1) {
/* 1215 */         localObject = this.ay[i1];
/* 1216 */         i5 = paramInt1 + (paramInt3 * (((ag)localObject).r * 1691633043) + paramInt4 * (((ag)localObject).d * 700400797) + paramInt5 * (((ag)localObject).l * -1364591921)) / (n + n / 2);
/* 1217 */         localfo.t[i1] = al(i5);
/* 1218 */         localfo.k[i1] = -1;
/*      */       }
/*      */       else {
/* 1221 */         localfo.k[i1] = -2;
/*      */       }
/*      */     }
/*      */ 
/* 1225 */     a();
/* 1226 */     localfo.i = this.j;
/* 1227 */     localfo.s = this.z;
/* 1228 */     localfo.u = this.g;
/* 1229 */     localfo.v = this.q;
/* 1230 */     localfo.w = this.i;
/* 1231 */     localfo.e = this.s;
/* 1232 */     localfo.b = this.u;
/* 1233 */     localfo.y = this.v;
/* 1234 */     localfo.o = this.e;
/* 1235 */     localfo.a = this.b;
/* 1236 */     localfo.p = this.k;
/* 1237 */     localfo.am = this.an;
/* 1238 */     localfo.ap = this.ah;
/* 1239 */     localfo.x = this.f;
/* 1240 */     return localfo;
/*      */   }
/*      */ 
/*      */   public void bq(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  934 */     for (int m = 0; m < this.j; m++) {
/*  935 */       this.z[m] += paramInt1;
/*  936 */       this.g[m] += paramInt2;
/*  937 */       this.q[m] += paramInt3;
/*      */     }
/*  939 */     ak();
/*      */   }
/*      */ 
/*      */   public void bj(short paramShort1, short paramShort2) {
/*  943 */     for (int m = 0; m < this.i; m++)
/*  944 */       if (this.t[m] == paramShort1) this.t[m] = paramShort2;
/*      */   }
/*      */ 
/*      */   public void bz(short paramShort1, short paramShort2)
/*      */   {
/*  943 */     for (int m = 0; m < this.i; m++)
/*  944 */       if (this.t[m] == paramShort1) this.t[m] = paramShort2;
/*      */   }
/*      */ 
/*      */   public void bm(short paramShort1, short paramShort2)
/*      */   {
/*  949 */     if (this.f == null) return;
/*  950 */     for (int m = 0; m < this.i; m++)
/*  951 */       if (this.f[m] == paramShort1) this.f[m] = paramShort2;
/*      */   }
/*      */ 
/*      */   public void bn(short paramShort1, short paramShort2)
/*      */   {
/*  949 */     if (this.f == null) return;
/*  950 */     for (int m = 0; m < this.i; m++)
/*  951 */       if (this.f[m] == paramShort1) this.f[m] = paramShort2;
/*      */   }
/*      */ 
/*      */   public void be(short paramShort1, short paramShort2)
/*      */   {
/*  949 */     if (this.f == null) return;
/*  950 */     for (int m = 0; m < this.i; m++)
/*  951 */       if (this.f[m] == paramShort1) this.f[m] = paramShort2;
/*      */   }
/*      */ 
/*      */   public void bp()
/*      */   {
/*  956 */     for (int m = 0; m < this.j; m++) this.q[m] = (-this.q[m]);
/*  957 */     for (m = 0; m < this.i; m++) {
/*  958 */       int n = this.s[m];
/*  959 */       this.s[m] = this.v[m];
/*  960 */       this.v[m] = n;
/*      */     }
/*  962 */     ak();
/*      */   }
/*      */ 
/*      */   public void ba()
/*      */   {
/*  956 */     for (int m = 0; m < this.j; m++) this.q[m] = (-this.q[m]);
/*  957 */     for (m = 0; m < this.i; m++) {
/*  958 */       int n = this.s[m];
/*  959 */       this.s[m] = this.v[m];
/*  960 */       this.v[m] = n;
/*      */     }
/*  962 */     ak();
/*      */   }
/*      */ 
/*      */   public void as(short paramShort1, short paramShort2)
/*      */   {
/*  949 */     if (this.f == null) return;
/*  950 */     for (int m = 0; m < this.i; m++)
/*  951 */       if (this.f[m] == paramShort1) this.f[m] = paramShort2;
/*      */   }
/*      */ 
/*      */   public void cr(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  966 */     for (int m = 0; m < this.j; m++) {
/*  967 */       this.z[m] = (this.z[m] * paramInt1 / 128);
/*  968 */       this.g[m] = (this.g[m] * paramInt2 / 128);
/*  969 */       this.q[m] = (this.q[m] * paramInt3 / 128);
/*      */     }
/*  971 */     ak();
/*      */   }
/*      */ 
/*      */   public void bb()
/*      */   {
/*  956 */     for (int m = 0; m < this.j; m++) this.q[m] = (-this.q[m]);
/*  957 */     for (m = 0; m < this.i; m++) {
/*  958 */       int n = this.s[m];
/*  959 */       this.s[m] = this.v[m];
/*  960 */       this.v[m] = n;
/*      */     }
/*  962 */     ak();
/*      */   }
/*      */ 
/*      */   public void cs(int paramInt1, int paramInt2, int paramInt3) {
/*  966 */     for (int m = 0; m < this.j; m++) {
/*  967 */       this.z[m] = (this.z[m] * paramInt1 / 128);
/*  968 */       this.g[m] = (this.g[m] * paramInt2 / 128);
/*  969 */       this.q[m] = (this.q[m] * paramInt3 / 128);
/*      */     }
/*  971 */     ak();
/*      */   }
/*      */ 
/*      */   public void bc()
/*      */   {
/*  956 */     for (int m = 0; m < this.j; m++) this.q[m] = (-this.q[m]);
/*  957 */     for (m = 0; m < this.i; m++) {
/*  958 */       int n = this.s[m];
/*  959 */       this.s[m] = this.v[m];
/*  960 */       this.v[m] = n;
/*      */     }
/*  962 */     ak();
/*      */   }
/*      */ 
/*      */   public void am()
/*      */   {
/*  956 */     for (int m = 0; m < this.j; m++) this.q[m] = (-this.q[m]);
/*  957 */     for (m = 0; m < this.i; m++) {
/*  958 */       int n = this.s[m];
/*  959 */       this.s[m] = this.v[m];
/*  960 */       this.v[m] = n;
/*      */     }
/*  962 */     ak();
/*      */   }
/*      */ 
/*      */   public fw k()
/*      */   {
/*  726 */     fw localfw = new fw();
/*  727 */     if (this.w != null) {
/*  728 */       localfw.w = new byte[this.i];
/*  729 */       for (int m = 0; m < this.i; m++) localfw.w[m] = this.w[m];
/*      */     }
/*  731 */     localfw.j = this.j;
/*  732 */     localfw.i = this.i;
/*  733 */     localfw.o = this.o;
/*  734 */     localfw.z = this.z;
/*  735 */     localfw.g = this.g;
/*  736 */     localfw.q = this.q;
/*  737 */     localfw.s = this.s;
/*  738 */     localfw.u = this.u;
/*  739 */     localfw.v = this.v;
/*  740 */     localfw.e = this.e;
/*  741 */     localfw.b = this.b;
/*  742 */     localfw.y = this.y;
/*  743 */     localfw.t = this.t;
/*  744 */     localfw.f = this.f;
/*  745 */     localfw.k = this.k;
/*  746 */     localfw.a = this.a;
/*  747 */     localfw.h = this.h;
/*  748 */     localfw.x = this.x;
/*  749 */     localfw.p = this.p;
/*  750 */     localfw.ad = this.ad;
/*  751 */     localfw.ac = this.ac;
/*  752 */     localfw.aa = this.aa;
/*  753 */     localfw.as = this.as;
/*  754 */     localfw.av = this.av;
/*  755 */     localfw.am = this.am;
/*  756 */     localfw.ap = this.ap;
/*  757 */     localfw.ak = this.ak;
/*  758 */     localfw.az = this.az;
/*  759 */     localfw.an = this.an;
/*  760 */     localfw.ah = this.ah;
/*  761 */     localfw.al = this.al;
/*  762 */     localfw.ay = this.ay;
/*  763 */     localfw.ao = this.ao;
/*  764 */     localfw.ag = this.ag;
/*  765 */     return localfw;
/*      */   }
/*      */ 
/*      */   public fw aj()
/*      */   {
/*  726 */     fw localfw = new fw();
/*  727 */     if (this.w != null) {
/*  728 */       localfw.w = new byte[this.i];
/*  729 */       for (int m = 0; m < this.i; m++) localfw.w[m] = this.w[m];
/*      */     }
/*  731 */     localfw.j = this.j;
/*  732 */     localfw.i = this.i;
/*  733 */     localfw.o = this.o;
/*  734 */     localfw.z = this.z;
/*  735 */     localfw.g = this.g;
/*  736 */     localfw.q = this.q;
/*  737 */     localfw.s = this.s;
/*  738 */     localfw.u = this.u;
/*  739 */     localfw.v = this.v;
/*  740 */     localfw.e = this.e;
/*  741 */     localfw.b = this.b;
/*  742 */     localfw.y = this.y;
/*  743 */     localfw.t = this.t;
/*  744 */     localfw.f = this.f;
/*  745 */     localfw.k = this.k;
/*  746 */     localfw.a = this.a;
/*  747 */     localfw.h = this.h;
/*  748 */     localfw.x = this.x;
/*  749 */     localfw.p = this.p;
/*  750 */     localfw.ad = this.ad;
/*  751 */     localfw.ac = this.ac;
/*  752 */     localfw.aa = this.aa;
/*  753 */     localfw.as = this.as;
/*  754 */     localfw.av = this.av;
/*  755 */     localfw.am = this.am;
/*  756 */     localfw.ap = this.ap;
/*  757 */     localfw.ak = this.ak;
/*  758 */     localfw.az = this.az;
/*  759 */     localfw.an = this.an;
/*  760 */     localfw.ah = this.ah;
/*  761 */     localfw.al = this.al;
/*  762 */     localfw.ay = this.ay;
/*  763 */     localfw.ao = this.ao;
/*  764 */     localfw.ag = this.ag;
/*  765 */     return localfw;
/*      */   }
/*      */ 
/*      */   public final fo cv(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/* 1118 */     av();
/* 1119 */     int m = (int)Math.sqrt(paramInt3 * paramInt3 + paramInt4 * paramInt4 + paramInt5 * paramInt5);
/* 1120 */     int n = paramInt2 * m >> 8;
/* 1121 */     fo localfo = new fo();
/* 1122 */     localfo.t = new int[this.i];
/* 1123 */     localfo.f = new int[this.i];
/* 1124 */     localfo.k = new int[this.i];
/*      */     int i2;
/*      */     int i3;
/* 1125 */     if ((this.o > 0) && (this.y != null)) {
/* 1126 */       int[] arrayOfInt = new int[this.o];
/* 1127 */       for (i2 = 0; i2 < this.i; i2++) {
/* 1128 */         if (this.y[i2] != -1) arrayOfInt[(this.y[i2] & 0xFF)] += 1;
/*      */       }
/* 1130 */       localfo.ad = 0;
/* 1131 */       for (i2 = 0; i2 < this.o; i2++) {
/* 1132 */         if ((arrayOfInt[i2] > 0) && (this.a[i2] == 0)) localfo.ad += 1;
/*      */       }
/* 1134 */       localfo.ac = new int[localfo.ad];
/* 1135 */       localfo.aa = new int[localfo.ad];
/* 1136 */       localfo.as = new int[localfo.ad];
/* 1137 */       i2 = 0;
/* 1138 */       for (i3 = 0; i3 < this.o; i3++)
/* 1139 */         if ((arrayOfInt[i3] > 0) && (this.a[i3] == 0)) {
/* 1140 */           localfo.ac[i2] = (this.h[i3] & 0xFFFF);
/* 1141 */           localfo.aa[i2] = (this.x[i3] & 0xFFFF);
/* 1142 */           localfo.as[i2] = (this.p[i3] & 0xFFFF);
/* 1143 */           arrayOfInt[i3] = (i2++);
/*      */         } else {
/* 1145 */           arrayOfInt[i3] = -1;
/*      */         }
/* 1147 */       localfo.h = new byte[this.i];
/* 1148 */       for (i3 = 0; i3 < this.i; i3++) {
/* 1149 */         if (this.y[i3] != -1) localfo.h[i3] = ((byte)arrayOfInt[(this.y[i3] & 0xFF)]); else
/* 1150 */           localfo.h[i3] = -1;
/*      */       }
/*      */     }
/* 1153 */     for (int i1 = 0; i1 < this.i; i1++)
/*      */     {
/* 1155 */       if (this.w == null) i2 = 0; else {
/* 1156 */         i2 = this.w[i1];
/*      */       }
/* 1158 */       if (this.b == null) i3 = 0; else
/* 1159 */         i3 = this.b[i1];
/* 1161 */       int i4;
/* 1161 */       if (this.f == null) i4 = -1; else
/* 1162 */         i4 = this.f[i1];
/* 1163 */       if (i3 == -2) i2 = 3;
/* 1164 */       if (i3 == -1) i2 = 2;
/*      */       Object localObject;
/*      */       int i5;
/* 1165 */       if (i4 == -1) {
/* 1166 */         if (i2 == 0)
/*      */         {
/* 1169 */           int i6 = this.t[i1] & 0xFFFF;
/* 1170 */           if ((this.ab != null) && (this.ab[this.s[i1]] != null)) localObject = this.ab[this.s[i1]]; else
/* 1171 */             localObject = this.al[this.s[i1]];
/* 1172 */           i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1173 */           localfo.t[i1] = ay(i6, i5);
/* 1174 */           if ((this.ab != null) && (this.ab[this.u[i1]] != null)) localObject = this.ab[this.u[i1]]; else
/* 1175 */             localObject = this.al[this.u[i1]];
/* 1176 */           i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1177 */           localfo.f[i1] = ay(i6, i5);
/* 1178 */           if ((this.ab != null) && (this.ab[this.v[i1]] != null)) localObject = this.ab[this.v[i1]]; else
/* 1179 */             localObject = this.al[this.v[i1]];
/* 1180 */           i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1181 */           localfo.k[i1] = ay(i6, i5);
/*      */         }
/* 1183 */         else if (i2 == 1) {
/* 1184 */           localObject = this.ay[i1];
/* 1185 */           i5 = paramInt1 + (paramInt3 * (((ag)localObject).r * 1691633043) + paramInt4 * (((ag)localObject).d * 700400797) + paramInt5 * (((ag)localObject).l * -1364591921)) / (n + n / 2);
/* 1186 */           localfo.t[i1] = ay(this.t[i1] & 0xFFFF, i5);
/* 1187 */           localfo.k[i1] = -1;
/*      */         }
/* 1189 */         else if (i2 == 3) {
/* 1190 */           localfo.t[i1] = 128;
/* 1191 */           localfo.k[i1] = -1;
/*      */         }
/*      */         else {
/* 1194 */           localfo.k[i1] = -2;
/*      */         }
/*      */ 
/*      */       }
/* 1198 */       else if (i2 == 0)
/*      */       {
/* 1201 */         if ((this.ab != null) && (this.ab[this.s[i1]] != null)) localObject = this.ab[this.s[i1]]; else
/* 1202 */           localObject = this.al[this.s[i1]];
/* 1203 */         i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1204 */         localfo.t[i1] = al(i5);
/* 1205 */         if ((this.ab != null) && (this.ab[this.u[i1]] != null)) localObject = this.ab[this.u[i1]]; else
/* 1206 */           localObject = this.al[this.u[i1]];
/* 1207 */         i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1208 */         localfo.f[i1] = al(i5);
/* 1209 */         if ((this.ab != null) && (this.ab[this.v[i1]] != null)) localObject = this.ab[this.v[i1]]; else
/* 1210 */           localObject = this.al[this.v[i1]];
/* 1211 */         i5 = paramInt1 + (paramInt3 * (((ao)localObject).r * 1344021357) + paramInt4 * (((ao)localObject).d * 1041550075) + paramInt5 * (((ao)localObject).l * 614075685)) / (n * (((ao)localObject).m * -943271431));
/* 1212 */         localfo.k[i1] = al(i5);
/*      */       }
/* 1214 */       else if (i2 == 1) {
/* 1215 */         localObject = this.ay[i1];
/* 1216 */         i5 = paramInt1 + (paramInt3 * (((ag)localObject).r * 1691633043) + paramInt4 * (((ag)localObject).d * 700400797) + paramInt5 * (((ag)localObject).l * -1364591921)) / (n + n / 2);
/* 1217 */         localfo.t[i1] = al(i5);
/* 1218 */         localfo.k[i1] = -1;
/*      */       }
/*      */       else {
/* 1221 */         localfo.k[i1] = -2;
/*      */       }
/*      */     }
/*      */ 
/* 1225 */     a();
/* 1226 */     localfo.i = this.j;
/* 1227 */     localfo.s = this.z;
/* 1228 */     localfo.u = this.g;
/* 1229 */     localfo.v = this.q;
/* 1230 */     localfo.w = this.i;
/* 1231 */     localfo.e = this.s;
/* 1232 */     localfo.b = this.u;
/* 1233 */     localfo.y = this.v;
/* 1234 */     localfo.o = this.e;
/* 1235 */     localfo.a = this.b;
/* 1236 */     localfo.p = this.k;
/* 1237 */     localfo.am = this.an;
/* 1238 */     localfo.ap = this.ah;
/* 1239 */     localfo.x = this.f;
/* 1240 */     return localfo;
/*      */   }
/*      */ 
/*      */   void ca()
/*      */   {
/* 1033 */     this.al = null;
/* 1034 */     this.ab = null;
/* 1035 */     this.ay = null;
/* 1036 */     this.ar = false;
/*      */   }
/*      */ 
/*      */   void ak()
/*      */   {
/* 1033 */     this.al = null;
/* 1034 */     this.ab = null;
/* 1035 */     this.ay = null;
/* 1036 */     this.ar = false;
/*      */   }
/*      */ 
/*      */   public fw(fw paramfw, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
/*      */   {
/*  657 */     this.j = paramfw.j;
/*  658 */     this.i = paramfw.i;
/*  659 */     this.o = paramfw.o;
/*      */     int m;
/*  660 */     if (paramBoolean1) {
/*  661 */       this.z = paramfw.z;
/*  662 */       this.g = paramfw.g;
/*  663 */       this.q = paramfw.q;
/*      */     }
/*      */     else {
/*  666 */       this.z = new int[this.j];
/*  667 */       this.g = new int[this.j];
/*  668 */       this.q = new int[this.j];
/*  669 */       for (m = 0; m < this.j; m++) {
/*  670 */         this.z[m] = paramfw.z[m];
/*  671 */         this.g[m] = paramfw.g[m];
/*  672 */         this.q[m] = paramfw.q[m];
/*      */       }
/*      */     }
/*  675 */     if (paramBoolean2) { this.t = paramfw.t;
/*      */     } else {
/*  677 */       this.t = new short[this.i];
/*  678 */       for (m = 0; m < this.i; m++) this.t[m] = paramfw.t[m];
/*      */     }
/*  680 */     if ((paramBoolean3) || (paramfw.f == null)) { this.f = paramfw.f;
/*      */     } else {
/*  682 */       this.f = new short[this.i];
/*  683 */       for (m = 0; m < this.i; m++) this.f[m] = paramfw.f[m];
/*      */     }
/*  685 */     if (paramBoolean4) { this.b = paramfw.b;
/*      */     } else {
/*  687 */       this.b = new byte[this.i];
/*  688 */       if (paramfw.b == null) {
/*  689 */         for (m = 0; m < this.i; m++) this.b[m] = 0;
/*      */       }
/*      */       else {
/*  692 */         for (m = 0; m < this.i; m++) this.b[m] = paramfw.b[m];
/*      */       }
/*      */     }
/*  695 */     this.s = paramfw.s;
/*  696 */     this.u = paramfw.u;
/*  697 */     this.v = paramfw.v;
/*  698 */     this.w = paramfw.w;
/*  699 */     this.e = paramfw.e;
/*  700 */     this.y = paramfw.y;
/*  701 */     this.k = paramfw.k;
/*  702 */     this.a = paramfw.a;
/*  703 */     this.h = paramfw.h;
/*  704 */     this.x = paramfw.x;
/*  705 */     this.p = paramfw.p;
/*  706 */     this.ad = paramfw.ad;
/*  707 */     this.ac = paramfw.ac;
/*  708 */     this.aa = paramfw.aa;
/*  709 */     this.as = paramfw.as;
/*  710 */     this.av = paramfw.av;
/*  711 */     this.am = paramfw.am;
/*  712 */     this.ap = paramfw.ap;
/*  713 */     this.ak = paramfw.ak;
/*  714 */     this.az = paramfw.az;
/*  715 */     this.an = paramfw.an;
/*  716 */     this.ah = paramfw.ah;
/*  717 */     this.al = paramfw.al;
/*  718 */     this.ay = paramfw.ay;
/*  719 */     this.ab = paramfw.ab;
/*  720 */     this.ao = paramfw.ao;
/*  721 */     this.ag = paramfw.ag;
/*      */   }
/*      */ 
/*      */   void cu()
/*      */   {
/* 1033 */     this.al = null;
/* 1034 */     this.ab = null;
/* 1035 */     this.ay = null;
/* 1036 */     this.ar = false;
/*      */   }
/*      */ 
/*      */   void cc() {
/* 1040 */     if (this.ar) return;
/* 1041 */     this.n = 0;
/* 1042 */     this.aq = 0;
/* 1043 */     this.at = 999999;
/* 1044 */     this.ae = -999999;
/* 1045 */     this.au = -99999;
/* 1046 */     this.ax = 99999;
/* 1047 */     for (int m = 0; m < this.j; m++) {
/* 1048 */       int n = this.z[m];
/* 1049 */       int i1 = this.g[m];
/* 1050 */       int i2 = this.q[m];
/* 1051 */       if (n < this.at) this.at = n;
/* 1052 */       if (n > this.ae) this.ae = n;
/* 1053 */       if (i2 < this.ax) this.ax = i2;
/* 1054 */       if (i2 > this.au) this.au = i2;
/* 1055 */       if (-i1 > this.n * 1921388913) this.n = (-i1 * 443715473);
/* 1056 */       if (i1 > this.aq) this.aq = i1;
/*      */     }
/* 1058 */     this.ar = true;
/*      */   }
/*      */ 
/*      */   public void bd(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  966 */     for (int m = 0; m < this.j; m++) {
/*  967 */       this.z[m] = (this.z[m] * paramInt1 / 128);
/*  968 */       this.g[m] = (this.g[m] * paramInt2 / 128);
/*  969 */       this.q[m] = (this.q[m] * paramInt3 / 128);
/*      */     }
/*  971 */     ak();
/*      */   }
/*      */ 
/*      */   static void cw(fw paramfw1, fw paramfw2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*      */   {
/* 1062 */     paramfw1.az();
/* 1063 */     paramfw1.av();
/* 1064 */     paramfw2.az();
/* 1065 */     paramfw2.av();
/* 1066 */     aw += 1;
/* 1067 */     int m = 0;
/* 1068 */     int[] arrayOfInt = paramfw2.z;
/* 1069 */     int n = paramfw2.j;
/* 1070 */     for (int i1 = 0; i1 < paramfw1.j; i1++) {
/* 1071 */       ao localao1 = paramfw1.al[i1];
/* 1072 */       if (localao1.m * -943271431 != 0) {
/* 1073 */         int i2 = paramfw1.g[i1] - paramInt2;
/* 1074 */         if (i2 <= paramfw2.aq) {
/* 1075 */           int i3 = paramfw1.z[i1] - paramInt1;
/* 1076 */           if ((i3 >= paramfw2.at) && (i3 <= paramfw2.ae)) {
/* 1077 */             int i4 = paramfw1.q[i1] - paramInt3;
/* 1078 */             if ((i4 >= paramfw2.ax) && (i4 <= paramfw2.au))
/* 1079 */               for (int i5 = 0; i5 < n; i5++) {
/* 1080 */                 ao localao2 = paramfw2.al[i5];
/* 1081 */                 if ((i3 == arrayOfInt[i5]) && (i4 == paramfw2.q[i5]) && (i2 == paramfw2.g[i5]) && (localao2.m * -943271431 != 0)) {
/* 1082 */                   if (paramfw1.ab == null) paramfw1.ab = new ao[paramfw1.j];
/* 1083 */                   if (paramfw2.ab == null) paramfw2.ab = new ao[n];
/* 1084 */                   ao localao3 = paramfw1.ab[i1];
/* 1085 */                   if (localao3 == null) localao3 = paramfw1.ab[i1] =  = new ao(localao1);
/* 1086 */                   ao localao4 = paramfw2.ab[i5];
/* 1087 */                   if (localao4 == null) localao4 = paramfw2.ab[i5] =  = new ao(localao2);
/* 1088 */                   localao3.r += localao2.r * 1;
/* 1089 */                   localao3.d += localao2.d * 1;
/* 1090 */                   localao3.l += localao2.l * 1;
/* 1091 */                   localao3.m += localao2.m * 1;
/* 1092 */                   localao4.r += localao1.r * 1;
/* 1093 */                   localao4.d += localao1.d * 1;
/* 1094 */                   localao4.l += localao1.l * 1;
/* 1095 */                   localao4.m += localao1.m * 1;
/* 1096 */                   m++;
/* 1097 */                   ai[i1] = aw;
/* 1098 */                   aj[i5] = aw;
/*      */                 }
/*      */               } 
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/* 1102 */     if ((m < 3) || (!paramBoolean)) return;
/* 1103 */     for (i1 = 0; i1 < paramfw1.i; i1++) {
/* 1104 */       if ((ai[paramfw1.s[i1]] == aw) && (ai[paramfw1.u[i1]] == aw) && (ai[paramfw1.v[i1]] == aw)) {
/* 1105 */         if (paramfw1.w == null) paramfw1.w = new byte[paramfw1.i];
/* 1106 */         paramfw1.w[i1] = 2;
/*      */       }
/*      */     }
/* 1109 */     for (i1 = 0; i1 < paramfw2.i; i1++)
/* 1110 */       if ((aj[paramfw2.s[i1]] == aw) && (aj[paramfw2.u[i1]] == aw) && (aj[paramfw2.v[i1]] == aw)) {
/* 1111 */         if (paramfw2.w == null) paramfw2.w = new byte[paramfw2.i];
/* 1112 */         paramfw2.w[i1] = 2;
/*      */       }
/*      */   }
/*      */ 
/*      */   void au(byte[] paramArrayOfByte)
/*      */   {
/*  326 */     int m = 0;
/*  327 */     int n = 0;
/*  328 */     ev localev1 = new ev(paramArrayOfByte);
/*  329 */     ev localev2 = new ev(paramArrayOfByte);
/*  330 */     ev localev3 = new ev(paramArrayOfByte);
/*  331 */     ev localev4 = new ev(paramArrayOfByte);
/*  332 */     ev localev5 = new ev(paramArrayOfByte);
/*  333 */     localev1.c = ((paramArrayOfByte.length - 18) * -941396361);
/*  334 */     int i1 = localev1.k(-1987080889);
/*  335 */     int i2 = localev1.k(-1987080889);
/*  336 */     int i3 = localev1.t(1118814123);
/*  337 */     int i4 = localev1.t(1118814123);
/*  338 */     int i5 = localev1.t(1118814123);
/*  339 */     int i6 = localev1.t(1118814123);
/*  340 */     int i7 = localev1.t(1118814123);
/*  341 */     int i8 = localev1.t(1118814123);
/*  342 */     int i9 = localev1.k(-1987080889);
/*  343 */     int i10 = localev1.k(-1987080889);
/*  344 */     int i11 = localev1.k(-1987080889);
/*  345 */     int i12 = localev1.k(-1987080889);
/*  346 */     int i13 = 0;
/*  347 */     int i14 = i13;
/*  348 */     i13 += i1;
/*  349 */     int i15 = i13;
/*  350 */     i13 += i2;
/*  351 */     int i16 = i13;
/*  352 */     if (i5 == 255) i13 += i2;
/*  353 */     int i17 = i13;
/*  354 */     if (i7 == 1) i13 += i2;
/*  355 */     int i18 = i13;
/*  356 */     if (i4 == 1) i13 += i2;
/*  357 */     int i19 = i13;
/*  358 */     if (i8 == 1) i13 += i1;
/*  359 */     int i20 = i13;
/*  360 */     if (i6 == 1) i13 += i2;
/*  361 */     int i21 = i13;
/*  362 */     i13 += i12;
/*  363 */     int i22 = i13;
/*  364 */     i13 += i2 * 2;
/*  365 */     int i23 = i13;
/*  366 */     i13 += i3 * 6;
/*  367 */     int i24 = i13;
/*  368 */     i13 += i9;
/*  369 */     int i25 = i13;
/*  370 */     i13 += i10;
/*  371 */     int i26 = i13;
/*  372 */     i13 += i11;
/*  373 */     this.j = i1;
/*  374 */     this.i = i2;
/*  375 */     this.o = i3;
/*  376 */     this.z = new int[i1];
/*  377 */     this.g = new int[i1];
/*  378 */     this.q = new int[i1];
/*  379 */     this.s = new int[i2];
/*  380 */     this.u = new int[i2];
/*  381 */     this.v = new int[i2];
/*  382 */     if (i3 > 0) {
/*  383 */       this.a = new byte[i3];
/*  384 */       this.h = new short[i3];
/*  385 */       this.x = new short[i3];
/*  386 */       this.p = new short[i3];
/*      */     }
/*  388 */     if (i8 == 1) this.ak = new int[i1];
/*  389 */     if (i4 == 1) {
/*  390 */       this.w = new byte[i2];
/*  391 */       this.y = new byte[i2];
/*  392 */       this.f = new short[i2];
/*      */     }
/*  394 */     if (i5 == 255) this.e = new byte[i2]; else
/*  395 */       this.k = ((byte)i5);
/*  396 */     if (i6 == 1) this.b = new byte[i2];
/*  397 */     if (i7 == 1) this.az = new int[i2];
/*  398 */     this.t = new short[i2];
/*  399 */     localev1.c = (i14 * -941396361);
/*  400 */     localev2.c = (i24 * -941396361);
/*  401 */     localev3.c = (i25 * -941396361);
/*  402 */     localev4.c = (i26 * -941396361);
/*  403 */     localev5.c = (i19 * -941396361);
/*  404 */     int i27 = 0;
/*  405 */     int i28 = 0;
/*  406 */     int i29 = 0;
/*  407 */     for (int i30 = 0; i30 < i1; i30++) {
/*  408 */       i31 = localev1.t(1118814123);
/*  409 */       i32 = 0;
/*  410 */       if ((i31 & 0x1) != 0) i32 = localev2.am(-1083515137);
/*  411 */       i33 = 0;
/*  412 */       if ((i31 & 0x2) != 0) i33 = localev3.am(-1279749952);
/*  413 */       i34 = 0;
/*  414 */       if ((i31 & 0x4) != 0) i34 = localev4.am(-1207223784);
/*  415 */       this.z[i30] = (i27 + i32);
/*  416 */       this.g[i30] = (i28 + i33);
/*  417 */       this.q[i30] = (i29 + i34);
/*  418 */       i27 = this.z[i30];
/*  419 */       i28 = this.g[i30];
/*  420 */       i29 = this.q[i30];
/*  421 */       if (i8 == 1) this.ak[i30] = localev5.t(1118814123);
/*      */     }
/*  423 */     localev1.c = (i22 * -941396361);
/*  424 */     localev2.c = (i18 * -941396361);
/*  425 */     localev3.c = (i16 * -941396361);
/*  426 */     localev4.c = (i20 * -941396361);
/*  427 */     localev5.c = (i17 * -941396361);
/*  428 */     for (i30 = 0; i30 < i2; i30++) {
/*  429 */       this.t[i30] = ((short)localev1.k(-1987080889));
/*  430 */       if (i4 == 1) {
/*  431 */         i31 = localev2.t(1118814123);
/*  432 */         if ((i31 & 0x1) == 1) {
/*  433 */           this.w[i30] = 1;
/*  434 */           m = 1;
/*      */         } else {
/*  436 */           this.w[i30] = 0;
/*  437 */         }if ((i31 & 0x2) == 2) {
/*  438 */           this.y[i30] = ((byte)(i31 >> 2));
/*  439 */           this.f[i30] = this.t[i30];
/*  440 */           this.t[i30] = 127;
/*  441 */           if (this.f[i30] != -1) n = 1; 
/*      */         }
/*      */         else
/*      */         {
/*  444 */           this.y[i30] = -1;
/*  445 */           this.f[i30] = -1;
/*      */         }
/*      */       }
/*  448 */       if (i5 == 255) this.e[i30] = localev3.f(2002687137);
/*  449 */       if (i6 == 1) this.b[i30] = localev4.f(2002687137);
/*  450 */       if (i7 == 1) this.az[i30] = localev5.t(1118814123);
/*      */     }
/*  452 */     localev1.c = (i21 * -941396361);
/*  453 */     localev2.c = (i15 * -941396361);
/*  454 */     i30 = 0;
/*  455 */     int i31 = 0;
/*  456 */     int i32 = 0;
/*  457 */     int i33 = 0;
/*      */     int i35;
/*      */     int i36;
/*  458 */     for (int i34 = 0; i34 < i2; i34++) {
/*  459 */       i35 = localev2.t(1118814123);
/*  460 */       if (i35 == 1) {
/*  461 */         i30 = localev1.am(-1040587753) + i33;
/*  462 */         i33 = i30;
/*  463 */         i31 = localev1.am(-2114603841) + i33;
/*  464 */         i33 = i31;
/*  465 */         i32 = localev1.am(-1951701550) + i33;
/*  466 */         i33 = i32;
/*  467 */         this.s[i34] = i30;
/*  468 */         this.u[i34] = i31;
/*  469 */         this.v[i34] = i32;
/*      */       }
/*  471 */       if (i35 == 2) {
/*  472 */         i31 = i32;
/*  473 */         i32 = localev1.am(-1693319134) + i33;
/*  474 */         i33 = i32;
/*  475 */         this.s[i34] = i30;
/*  476 */         this.u[i34] = i31;
/*  477 */         this.v[i34] = i32;
/*      */       }
/*  479 */       if (i35 == 3) {
/*  480 */         i30 = i32;
/*  481 */         i32 = localev1.am(-869606181) + i33;
/*  482 */         i33 = i32;
/*  483 */         this.s[i34] = i30;
/*  484 */         this.u[i34] = i31;
/*  485 */         this.v[i34] = i32;
/*      */       }
/*  487 */       if (i35 == 4) {
/*  488 */         i36 = i30;
/*  489 */         i30 = i31;
/*  490 */         i31 = i36;
/*  491 */         i32 = localev1.am(-1294129499) + i33;
/*  492 */         i33 = i32;
/*  493 */         this.s[i34] = i30;
/*  494 */         this.u[i34] = i31;
/*  495 */         this.v[i34] = i32;
/*      */       }
/*      */     }
/*  498 */     localev1.c = (i23 * -941396361);
/*  499 */     for (i34 = 0; i34 < i3; i34++) {
/*  500 */       this.a[i34] = 0;
/*  501 */       this.h[i34] = ((short)localev1.k(-1987080889));
/*  502 */       this.x[i34] = ((short)localev1.k(-1987080889));
/*  503 */       this.p[i34] = ((short)localev1.k(-1987080889));
/*      */     }
/*  505 */     if (this.y != null) {
/*  506 */       i34 = 0;
/*  507 */       for (i35 = 0; i35 < i2; i35++) {
/*  508 */         i36 = this.y[i35] & 0xFF;
/*  509 */         if (i36 != 255) {
/*  510 */           if (((this.h[i36] & 0xFFFF) == this.s[i35]) && ((this.x[i36] & 0xFFFF) == this.u[i35]) && ((this.p[i36] & 0xFFFF) == this.v[i35])) this.y[i35] = -1; else
/*  511 */             i34 = 1;
/*      */         }
/*      */       }
/*  514 */       if (i34 == 0) this.y = null;
/*      */     }
/*  516 */     if (n == 0) this.f = null;
/*  517 */     if (m == 0) this.w = null;
/*      */   }
/*      */ 
/*      */   public static fw b(ch paramch, int paramInt1, int paramInt2)
/*      */   {
/*   60 */     byte[] arrayOfByte = paramch.l(paramInt1, paramInt2, 269599940);
/*   61 */     if (arrayOfByte == null) return null;
/*   62 */     return new fw(arrayOfByte);
/*      */   }
/*      */ 
/*      */   static final int ct(int paramInt1, int paramInt2)
/*      */   {
/* 1244 */     paramInt2 = paramInt2 * (paramInt1 & 0x7F) >> 7;
/* 1245 */     if (paramInt2 < 2) paramInt2 = 2;
/* 1246 */     else if (paramInt2 > 126) paramInt2 = 126;
/* 1247 */     return (paramInt1 & 0xFF80) + paramInt2;
/*      */   }
/*      */ 
/*      */   static final int ck(int paramInt1, int paramInt2)
/*      */   {
/* 1244 */     paramInt2 = paramInt2 * (paramInt1 & 0x7F) >> 7;
/* 1245 */     if (paramInt2 < 2) paramInt2 = 2;
/* 1246 */     else if (paramInt2 > 126) paramInt2 = 126;
/* 1247 */     return (paramInt1 & 0xFF80) + paramInt2;
/*      */   }
/*      */ 
/*      */   static final int cy(int paramInt) {
/* 1251 */     if (paramInt < 2) paramInt = 2;
/* 1252 */     else if (paramInt > 126) paramInt = 126;
/* 1253 */     return paramInt;
/*      */   }
/*      */ 
/*      */   void cm()
/*      */   {
/* 1040 */     if (this.ar) return;
/* 1041 */     this.n = 0;
/* 1042 */     this.aq = 0;
/* 1043 */     this.at = 999999;
/* 1044 */     this.ae = -999999;
/* 1045 */     this.au = -99999;
/* 1046 */     this.ax = 99999;
/* 1047 */     for (int m = 0; m < this.j; m++) {
/* 1048 */       int n = this.z[m];
/* 1049 */       int i1 = this.g[m];
/* 1050 */       int i2 = this.q[m];
/* 1051 */       if (n < this.at) this.at = n;
/* 1052 */       if (n > this.ae) this.ae = n;
/* 1053 */       if (i2 < this.ax) this.ax = i2;
/* 1054 */       if (i2 > this.au) this.au = i2;
/* 1055 */       if (-i1 > this.n * 1921388913) this.n = (-i1 * 443715473);
/* 1056 */       if (i1 > this.aq) this.aq = i1;
/*      */     }
/* 1058 */     this.ar = true;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     fw
 * JD-Core Version:    0.6.2
 */