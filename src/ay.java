/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.io.RandomAccessFile;
/*      */ 
/*      */ public class ay
/*      */ {
/*      */   public static int n;
/*      */   public static final int d = 1048576;
/*      */   public static final String l = "rw";
/*      */   public static File c;
/*      */   public static final int r = 1048576000;
/*      */   public static final String j = "main_file_cache.dat2";
/*      */   static File m;
/*      */   public static final String z = "main_file_cache.idx";
/*      */   public static final String g = "main_file_cache.idx255";
/*      */   static final String q = "random.dat";
/*   21 */   static v i = null;
/*   22 */   public static v s = null;
/*   23 */   public static v u = null;
/*      */   static final int y = 0;
/*      */   static final int t = 1;
/*      */   static int[] a;
/*      */ 
/*      */   public static void z()
/*      */   {
/*      */     try
/*      */     {
/*  183 */       File localFile1 = new File(ez.o, "random.dat");
/*      */       int i1;
/*  184 */       if (localFile1.exists()) {
/*  185 */         i = new v(new u(localFile1, "rw", 25L), 24, 0);
/*      */       }
/*      */       else {
/*  188 */         for (int k = 0; k < ag.b.length; k++) {
/*  189 */           for (i1 = 0; i1 < by.e.length; i1++) {
/*  190 */             File localFile2 = new File(by.e[i1] + ag.b[k] + File.separatorChar + "random.dat");
/*  191 */             if (localFile2.exists()) {
/*  192 */               i = new v(new u(localFile2, "rw", 25L), 24, 0);
/*  193 */               break label162;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*  198 */       label162: if (i == null) {
/*  199 */         RandomAccessFile localRandomAccessFile = new RandomAccessFile(localFile1, "rw");
/*  200 */         i1 = localRandomAccessFile.read();
/*  201 */         localRandomAccessFile.seek(0L);
/*  202 */         localRandomAccessFile.write(i1);
/*  203 */         localRandomAccessFile.seek(0L);
/*  204 */         localRandomAccessFile.close();
/*  205 */         i = new v(new u(localFile1, "rw", 25L), 24, 0);
/*      */       }
/*      */     }
/*      */     catch (IOException localIOException)
/*      */     {
/*      */     }
/*      */   }
/*      */ 
/*      */   ay()
/*      */     throws Throwable
/*      */   {
/*   35 */     throw new Error();
/*      */   }
/*      */ 
/*      */   public static File n(String paramString1, String paramString2, int paramInt) {
/*   39 */     String str1 = "" + paramInt;
/*   40 */     m = new File(ez.o, "jagex_cl_" + paramString1 + "_" + paramString2 + str1 + ".dat");
/*   41 */     String str2 = null;
/*   42 */     String str3 = null;
/*   43 */     int k = 0;
/*   44 */     if (m.exists()) {
/*      */       int i3;
/*      */       try {
/*   47 */         u localu1 = new u(m, "rw", 10000L);
/*   48 */         ev localev = new ev((int)localu1.m(-1804730665));
/*   49 */         while (localev.c * -196293817 < localev.m.length) {
/*   50 */           i3 = localu1.c(localev.m, localev.c * -196293817, localev.m.length - localev.c * -196293817, -2123701214);
/*   51 */           if (i3 == -1) throw new IOException();
/*   52 */           localev.c += -941396361 * i3;
/*      */         }
/*   54 */         localev.c = 0;
/*   55 */         i3 = localev.t(1118814123);
/*   56 */         if ((i3 < 1) || (i3 > 3)) throw new IOException("" + i3);
/*   57 */         int i4 = 0;
/*   58 */         if (i3 > 1) i4 = localev.t(1118814123);
/*   59 */         if (i3 <= 2) {
/*   60 */           str2 = localev.ac((byte)-118);
/*   61 */           if (i4 == 1) str3 = localev.ac((byte)-128); 
/*      */         }
/*      */         else
/*      */         {
/*   64 */           str2 = localev.aa(2102096004);
/*   65 */           if (i4 == 1) str3 = localev.aa(-883757238);
/*      */         }
/*   67 */         localu1.l(1273308593);
/*      */       }
/*      */       catch (IOException localIOException1) {
/*   70 */         localIOException1.printStackTrace();
/*      */       }
/*      */       File localFile2;
/*   72 */       if (str2 != null) {
/*   73 */         localFile2 = new File(str2);
/*   74 */         if (!localFile2.exists()) {
/*   75 */           str2 = null;
/*      */         }
/*      */       }
/*   78 */       if (str2 != null) {
/*   79 */         localFile2 = new File(str2, "test.dat");
/*      */         try
/*      */         {
/*   83 */           RandomAccessFile localRandomAccessFile1 = new RandomAccessFile(localFile2, "rw");
/*   84 */           int i6 = localRandomAccessFile1.read();
/*   85 */           localRandomAccessFile1.seek(0L);
/*   86 */           localRandomAccessFile1.write(i6);
/*   87 */           localRandomAccessFile1.seek(0L);
/*   88 */           localRandomAccessFile1.close();
/*   89 */           localFile2.delete();
/*   90 */           i3 = 1;
/*      */         }
/*      */         catch (Exception localException2) {
/*   93 */           i3 = 0;
/*      */         }
/*      */ 
/*   96 */         if (i3 == 0)
/*   97 */           str2 = null;
/*      */       }
/*      */     }
/*      */     Object localObject1;
/*  101 */     if ((str2 == null) && (paramInt == 0)) {
/*  102 */       for (int i1 = 0; i1 < ag.b.length; i1++) {
/*  103 */         for (int i2 = 0; i2 < by.e.length; i2++) {
/*  104 */           localObject1 = new File(by.e[i2] + ag.b[i1] + File.separatorChar + paramString1 + File.separatorChar);
/*  105 */           if (((File)localObject1).exists()) {
/*  107 */             File localFile4 = new File((File)localObject1, "test.dat");
/*      */             int i5;
/*      */             try {
/*  110 */               RandomAccessFile localRandomAccessFile2 = new RandomAccessFile(localFile4, "rw");
/*  111 */               int i8 = localRandomAccessFile2.read();
/*  112 */               localRandomAccessFile2.seek(0L);
/*  113 */               localRandomAccessFile2.write(i8);
/*  114 */               localRandomAccessFile2.seek(0L);
/*  115 */               localRandomAccessFile2.close();
/*  116 */               localFile4.delete();
/*  117 */               i5 = 1;
/*      */             }
/*      */             catch (Exception localException3) {
/*  120 */               i5 = 0;
/*      */             }
/*      */ 
/*  123 */             if (i5 != 0) {
/*  124 */               str2 = ((File)localObject1).toString();
/*  125 */               k = 1;
/*  126 */               break label676;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*  132 */     label676: if (null == str2) {
/*  133 */       str2 = ez.o + File.separatorChar + "jagexcache" + str1 + File.separatorChar + paramString1 + File.separatorChar + paramString2 + File.separatorChar;
/*  134 */       k = 1;
/*      */     }
/*      */     File localFile1;
/*      */     File localFile3;
/*      */     Object localObject2;
/*  136 */     if (str3 != null) {
/*  137 */       localFile1 = new File(str3);
/*  138 */       localFile3 = new File(str2);
/*      */       try {
/*  140 */         localObject1 = localFile1.listFiles();
/*      */ 
/*  142 */         localObject2 = localObject1;
/*  143 */         for (int i7 = 0; i7 < localObject2.length; i7++) {
/*  144 */           Object localObject3 = localObject2[i7];
/*      */ 
/*  146 */           File localFile5 = new File(localFile3, localObject3.getName());
/*  147 */           boolean bool = localObject3.renameTo(localFile5);
/*  148 */           if (!bool) throw new IOException();
/*      */         }
/*      */ 
/*      */       }
/*      */       catch (Exception localException1)
/*      */       {
/*  154 */         localException1.printStackTrace();
/*      */       }
/*  156 */       k = 1;
/*      */     }
/*  158 */     if (k != 0) {
/*  159 */       localFile1 = new File(str2);
/*  160 */       localFile3 = null;
/*      */       try
/*      */       {
/*  164 */         u localu2 = new u(m, "rw", 10000L);
/*  165 */         localObject2 = new ev(500);
/*  166 */         ((ev)localObject2).c(3, 1964239064);
/*  167 */         ((ev)localObject2).c(null != localFile3 ? 1 : 0, 1404132596);
/*  168 */         ((ev)localObject2).s(localFile1.getPath(), 375042907);
/*  169 */         if (localFile3 != null) ((ev)localObject2).s(localFile3.getPath(), 375042907);
/*  170 */         localu2.d(((ev)localObject2).m, 0, ((ev)localObject2).c * -196293817, 858141644);
/*  171 */         localu2.l(1273308593);
/*      */       }
/*      */       catch (IOException localIOException2) {
/*  174 */         localIOException2.printStackTrace();
/*      */       }
/*      */     }
/*      */ 
/*  178 */     return new File(str2);
/*      */   }
/*      */ 
/*      */   public static void j() {
/*      */     try {
/*  183 */       File localFile1 = new File(ez.o, "random.dat");
/*      */       int i1;
/*  184 */       if (localFile1.exists()) {
/*  185 */         i = new v(new u(localFile1, "rw", 25L), 24, 0);
/*      */       }
/*      */       else {
/*  188 */         for (int k = 0; k < ag.b.length; k++) {
/*  189 */           for (i1 = 0; i1 < by.e.length; i1++) {
/*  190 */             File localFile2 = new File(by.e[i1] + ag.b[k] + File.separatorChar + "random.dat");
/*  191 */             if (localFile2.exists()) {
/*  192 */               i = new v(new u(localFile2, "rw", 25L), 24, 0);
/*  193 */               break label162;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*  198 */       label162: if (i == null) {
/*  199 */         RandomAccessFile localRandomAccessFile = new RandomAccessFile(localFile1, "rw");
/*  200 */         i1 = localRandomAccessFile.read();
/*  201 */         localRandomAccessFile.seek(0L);
/*  202 */         localRandomAccessFile.write(i1);
/*  203 */         localRandomAccessFile.seek(0L);
/*  204 */         localRandomAccessFile.close();
/*  205 */         i = new v(new u(localFile1, "rw", 25L), 24, 0);
/*      */       }
/*      */     } catch (IOException localIOException) {  }
/*      */   }
/*      */ 
/*  212 */   public static void g(ev paramev) { byte[] arrayOfByte = new byte[24];
/*      */     int i1;
/*      */     try {
/*  214 */       i.d(0L);
/*  215 */       i.m(arrayOfByte, 1165793808);
/*  216 */       int k = 0;
/*  217 */       while ((k < 24) && 
/*  218 */         (0 == arrayOfByte[k])) {
/*  217 */         k++;
/*      */       }
/*      */ 
/*  220 */       if (k >= 24) throw new IOException(); 
/*      */     }
/*      */     catch (Exception localException)
/*      */     {
/*  223 */       i1 = 0; } for (; i1 < 24; i1++) arrayOfByte[i1] = -1;
/*      */ 
/*  225 */     paramev.u(arrayOfByte, 0, 24, (byte)53); }
/*      */ 
/*      */   public static void i(ev paramev, int paramInt)
/*      */   {
/*  229 */     if (i != null)
/*      */       try {
/*  231 */         i.d(0L);
/*  232 */         i.j(paramev.m, paramInt, 24, (byte)62);
/*      */       }
/*      */       catch (Exception localException)
/*      */       {
/*      */       }
/*      */   }
/*      */ 
/*      */   public static void q(ev paramev, int paramInt)
/*      */   {
/*  229 */     if (i != null)
/*      */       try {
/*  231 */         i.d(0L);
/*  232 */         i.j(paramev.m, paramInt, 24, (byte)8);
/*      */       }
/*      */       catch (Exception localException) {
/*      */       }
/*      */   }
/*      */ 
/*      */   public static void s() {
/*      */     try {
/*  240 */       s.r(-883153307);
/*  241 */       for (int k = 0; k < 446752721 * n; k++) av.v[k].r(-883153307);
/*  242 */       u.r(-883153307);
/*  243 */       i.r(-883153307);
/*      */     }
/*      */     catch (Exception localException)
/*      */     {
/*      */     }
/*      */   }
/*      */ 
/*      */   public static boolean z(int paramInt)
/*      */   {
/*      */     try
/*      */     {
/*   99 */       if (2 == 153881033 * bd.c) { if (paramInt == 1364420812) throw new IllegalStateException();
/*  100 */         if (null == bd.s) { if (paramInt != 1364420812);
/*  101 */           bd.s = ei.c(bd.n, aa.j * -507685161, 1776013249 * bd.z);
/*  102 */           if (null == bd.s) { if (paramInt != 1364420812);
/*  102 */             return false; }
/*      */         }
/*  104 */         if (null == dr.u) { if (paramInt != 1364420812);
/*  104 */           dr.u = new a(bd.l, bd.d); }
/*  105 */         if (bd.m.ac(bd.s, bd.r, dr.u, 22050, (byte)70)) { if (paramInt != 1364420812);
/*  106 */           bd.m.aa((byte)68);
/*  107 */           bd.m.p(-1012574207 * bd.g, 2122102736);
/*  108 */           bd.m.am(bd.s, dl.i, (byte)-45);
/*  109 */           bd.c = 0;
/*  110 */           bd.s = null;
/*  111 */           dr.u = null;
/*  112 */           bd.n = null;
/*  113 */           return true; }
/*      */       }
/*      */     }
/*      */     catch (Exception localException)
/*      */     {
/*  118 */       localException.printStackTrace();
/*  119 */       bd.m.ap((byte)0);
/*  120 */       bd.c = 0;
/*  121 */       bd.s = null;
/*  122 */       dr.u = null;
/*  123 */       bd.n = null;
/*      */     }
/*  125 */     return false;
/*      */   }
/*      */ 
/*      */   public static void c(ch paramch1, ch paramch2, ch paramch3, ch paramch4, int paramInt)
/*      */   {
/*  147 */     eg.n = paramch1;
/*  148 */     eg.j = paramch2;
/*  149 */     dc.z = paramch3;
/*  150 */     eg.g = paramch4;
/*  151 */     av.m = new eg[eg.n.v(1223675499)][];
/*  152 */     df.c = new boolean[eg.n.v(1223675499)];
/*      */   }
/*      */ 
/*      */   static String gu(eg parameg, int paramInt1, int paramInt2)
/*      */   {
/* 9784 */     int i1 = dn.gg(parameg, (byte)25);
/*      */ 
/* 9786 */     if (paramInt2 >= 1483809292) throw new IllegalStateException(); int k = (i1 >> 1 + paramInt1 & 0x1) != 0 ? 1 : 0;
/*      */ 
/* 9788 */     if ((k == 0) && ((paramInt2 >= 1483809292) || (null == parameg.cb))) { if (paramInt2 >= 1483809292) throw new IllegalStateException(); return null; }
/* 9789 */     if ((null != parameg.br) && ((paramInt2 >= 1483809292) || (parameg.br.length > paramInt1))) { if (paramInt2 >= 1483809292) throw new IllegalStateException(); if (null != parameg.br[paramInt1]) { if ((paramInt2 < 1483809292) && (parameg.br[paramInt1].trim().length() != 0)) break label168; if (paramInt2 >= 1483809292); } }
/* 9790 */     return null;
/*      */ 
/* 9792 */     label168: return parameg.br[paramInt1];
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ay
 * JD-Core Version:    0.6.2
 */