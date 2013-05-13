/*      */ public abstract class bw
/*      */ {
/*    4 */   static boolean r = false;
/*      */   public static short[][] z;
/*      */   static int[] ez;
/*      */ 
/*      */   public static Object g(byte[] paramArrayOfByte, boolean paramBoolean)
/*      */   {
/*    9 */     if (null == paramArrayOfByte) return null;
/*   10 */     if ((paramArrayOfByte.length > 136) && (!r)) {
/*      */       try {
/*   12 */         db localdb = new db();
/*   13 */         localdb.m(paramArrayOfByte, -1063820189);
/*   14 */         return localdb;
/*      */       }
/*      */       catch (Throwable localThrowable) {
/*   17 */         r = true;
/*      */       }
/*      */     }
/*   20 */     if (paramBoolean)
/*      */     {
/*   23 */       int i = paramArrayOfByte.length;
/*   24 */       byte[] arrayOfByte = new byte[i];
/*   25 */       System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, i);
/*   26 */       Object localObject = arrayOfByte;
/*      */ 
/*   28 */       return localObject;
/*      */     }
/*   30 */     return paramArrayOfByte;
/*      */   }
/*      */ 
/*      */   abstract byte[] l(int paramInt);
/*      */ 
/*      */   abstract void m(byte[] paramArrayOfByte, int paramInt);
/*      */ 
/*      */   public static Object c(byte[] paramArrayOfByte, boolean paramBoolean)
/*      */   {
/*    9 */     if (null == paramArrayOfByte) return null;
/*   10 */     if ((paramArrayOfByte.length > 136) && (!r)) {
/*      */       try {
/*   12 */         db localdb = new db();
/*   13 */         localdb.m(paramArrayOfByte, -952296410);
/*   14 */         return localdb;
/*      */       }
/*      */       catch (Throwable localThrowable) {
/*   17 */         r = true;
/*      */       }
/*      */     }
/*   20 */     if (paramBoolean)
/*      */     {
/*   23 */       int i = paramArrayOfByte.length;
/*   24 */       byte[] arrayOfByte = new byte[i];
/*   25 */       System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, i);
/*   26 */       Object localObject = arrayOfByte;
/*      */ 
/*   28 */       return localObject;
/*      */     }
/*   30 */     return paramArrayOfByte;
/*      */   }
/*      */ 
/*      */   public static Object n(byte[] paramArrayOfByte, boolean paramBoolean)
/*      */   {
/*    9 */     if (null == paramArrayOfByte) return null;
/*   10 */     if ((paramArrayOfByte.length > 136) && (!r)) {
/*      */       try {
/*   12 */         db localdb = new db();
/*   13 */         localdb.m(paramArrayOfByte, -2097685615);
/*   14 */         return localdb;
/*      */       }
/*      */       catch (Throwable localThrowable) {
/*   17 */         r = true;
/*      */       }
/*      */     }
/*   20 */     if (paramBoolean)
/*      */     {
/*   23 */       int i = paramArrayOfByte.length;
/*   24 */       byte[] arrayOfByte = new byte[i];
/*   25 */       System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, i);
/*   26 */       Object localObject = arrayOfByte;
/*      */ 
/*   28 */       return localObject;
/*      */     }
/*   30 */     return paramArrayOfByte;
/*      */   }
/*      */ 
/*      */   public static Object j(byte[] paramArrayOfByte, boolean paramBoolean)
/*      */   {
/*    9 */     if (null == paramArrayOfByte) return null;
/*   10 */     if ((paramArrayOfByte.length > 136) && (!r)) {
/*      */       try {
/*   12 */         db localdb = new db();
/*   13 */         localdb.m(paramArrayOfByte, -1037309277);
/*   14 */         return localdb;
/*      */       }
/*      */       catch (Throwable localThrowable) {
/*   17 */         r = true;
/*      */       }
/*      */     }
/*   20 */     if (paramBoolean)
/*      */     {
/*   23 */       int i = paramArrayOfByte.length;
/*   24 */       byte[] arrayOfByte = new byte[i];
/*   25 */       System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, i);
/*   26 */       Object localObject = arrayOfByte;
/*      */ 
/*   28 */       return localObject;
/*      */     }
/*   30 */     return paramArrayOfByte;
/*      */   }
/*      */ 
/*      */   public static Object z(byte[] paramArrayOfByte, boolean paramBoolean)
/*      */   {
/*    9 */     if (null == paramArrayOfByte) return null;
/*   10 */     if ((paramArrayOfByte.length > 136) && (!r)) {
/*      */       try {
/*   12 */         db localdb = new db();
/*   13 */         localdb.m(paramArrayOfByte, -1230978858);
/*   14 */         return localdb;
/*      */       }
/*      */       catch (Throwable localThrowable) {
/*   17 */         r = true;
/*      */       }
/*      */     }
/*   20 */     if (paramBoolean)
/*      */     {
/*   23 */       int i = paramArrayOfByte.length;
/*   24 */       byte[] arrayOfByte = new byte[i];
/*   25 */       System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, i);
/*   26 */       Object localObject = arrayOfByte;
/*      */ 
/*   28 */       return localObject;
/*      */     }
/*   30 */     return paramArrayOfByte;
/*      */   }
/*      */   abstract byte[] u();
/*      */ 
/*   34 */   public static byte[] q(Object paramObject, boolean paramBoolean) { if (paramObject == null) return null;
/*      */     Object localObject;
/*   35 */     if ((paramObject instanceof byte[])) {
/*   36 */       localObject = (byte[])paramObject;
/*   37 */       if (paramBoolean)
/*      */       {
/*   40 */         int i = localObject.length;
/*   41 */         byte[] arrayOfByte2 = new byte[i];
/*   42 */         System.arraycopy(localObject, 0, arrayOfByte2, 0, i);
/*   43 */         byte[] arrayOfByte1 = arrayOfByte2;
/*      */ 
/*   45 */         return arrayOfByte1;
/*      */       }
/*   47 */       return localObject;
/*      */     }
/*   49 */     if ((paramObject instanceof bw)) {
/*   50 */       localObject = (bw)paramObject;
/*   51 */       return ((bw)localObject).l(-239484996);
/*      */     }
/*   53 */     throw new IllegalArgumentException();
/*      */   }
/*      */ 
/*      */   abstract byte[] s();
/*      */ 
/*      */   abstract void w(byte[] paramArrayOfByte);
/*      */ 
/*      */   public static byte[] i(Object paramObject, boolean paramBoolean)
/*      */   {
/*   34 */     if (paramObject == null) return null;
/*      */     Object localObject;
/*   35 */     if ((paramObject instanceof byte[])) {
/*   36 */       localObject = (byte[])paramObject;
/*   37 */       if (paramBoolean)
/*      */       {
/*   40 */         int i = localObject.length;
/*   41 */         byte[] arrayOfByte2 = new byte[i];
/*   42 */         System.arraycopy(localObject, 0, arrayOfByte2, 0, i);
/*   43 */         byte[] arrayOfByte1 = arrayOfByte2;
/*      */ 
/*   45 */         return arrayOfByte1;
/*      */       }
/*   47 */       return localObject;
/*      */     }
/*   49 */     if ((paramObject instanceof bw)) {
/*   50 */       localObject = (bw)paramObject;
/*   51 */       return ((bw)localObject).l(-730701660);
/*      */     }
/*   53 */     throw new IllegalArgumentException();
/*      */   }
/*      */ 
/*      */   abstract void e(byte[] paramArrayOfByte);
/*      */ 
/*      */   abstract byte[] v();
/*      */ 
/*      */   public static eg n(int paramInt, byte paramByte)
/*      */   {
/*  156 */     int i = paramInt >> 16;
/*  157 */     int j = paramInt & 0xFFFF;
/*  158 */     if (null != av.m[i]) { if (paramByte != 1) throw new IllegalStateException(); if (av.m[i][j] != null) break label78; if (paramByte != 1) throw new IllegalStateException(); 
/*      */     }
/*  159 */     boolean bool = dw.z(i, -821357875);
/*  160 */     if (!bool) { if (paramByte == 1);
/*  160 */       return null;
/*      */     }
/*  162 */     label78: return av.m[i][j];
/*      */   }
/*      */ 
/*      */   static final int ev(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/* 5102 */     int i = paramInt1 >> 7;
/* 5103 */     int j = paramInt2 >> 7;
/* 5104 */     if (i >= 0) { if (paramInt4 >= -797299820) throw new IllegalStateException(); if ((j >= 0) && ((paramInt4 >= -797299820) || (i <= 103))) { if ((paramInt4 < -797299820) && (j <= 103)) break label79; if (paramInt4 >= -797299820); }  } return 0;
/* 5105 */     label79: int k = paramInt3;
/* 5106 */     if ((k < 3) && ((paramInt4 >= -797299820) || ((l.d[1][i][j] & 0x2) == 2))) { if (paramInt4 < -797299820);
/* 5106 */       k++; }
/* 5107 */     int m = paramInt1 & 0x7F;
/* 5108 */     int n = paramInt2 & 0x7F;
/* 5109 */     int i1 = (128 - m) * l.r[k][i][j] + l.r[k][(i + 1)][j] * m >> 7;
/* 5110 */     int i2 = l.r[k][i][(j + 1)] * (128 - m) + m * l.r[k][(1 + i)][(j + 1)] >> 7;
/* 5111 */     return (128 - n) * i1 + n * i2 >> 7;
/*      */   }
/*      */ 
/*      */   static final void q(dx paramdx, int paramInt)
/*      */   {
/*  281 */     paramdx.j = false;
/*  282 */     if (null != paramdx.n) { if (paramInt <= -1712424720) throw new IllegalStateException(); paramdx.n.m = 0; }
/*  283 */     for (dx localdx = paramdx.n(); localdx != null; localdx = paramdx.j()) { if (paramInt > -1712424720);
/*  283 */       q(localdx, -640204340);
/*      */     }
/*      */   }
/*      */ 
/*      */   public static void r(by paramby, int paramInt)
/*      */   {
/*   15 */     dz.r = paramby;
/*      */   }
/*      */ 
/*      */   public static fm c(ch paramch1, ch paramch2, String paramString1, String paramString2, int paramInt)
/*      */   {
/*  129 */     int i = paramch1.y(paramString1, 298134685);
/*  130 */     int j = paramch1.t(i, paramString2, (byte)-1);
/*      */     fm localfm;
/*  133 */     if (!bn.q(paramch1, i, j, 1242763578)) { if (paramInt != 1079385674) throw new IllegalStateException();
/*  134 */       localfm = null;
/*      */     } else
/*      */     {
/*  137 */       localfm = y.g(paramch2.l(i, j, 858539626), -1235964043);
/*      */     }
/*  139 */     return localfm;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     bw
 * JD-Core Version:    0.6.2
 */