/*      */ import java.io.File;
/*      */ import java.io.RandomAccessFile;
/*      */ import java.util.Hashtable;
/*      */ 
/*      */ public class co
/*      */ {
/*      */   static int[] ei;
/*      */   static int op;
/*      */ 
/*      */   public static char l(char paramChar, int paramInt)
/*      */   {
/*    9 */     if ((paramChar >= 'À') && (paramChar <= 'ÿ')) {
/*   10 */       if ((paramChar >= 'À') && (paramChar <= 'Æ')) return 'A';
/*   11 */       if ('Ç' == paramChar) return 'C';
/*   12 */       if ((paramChar >= 'È') && (paramChar <= 'Ë')) return 'E';
/*   13 */       if ((paramChar >= 'Ì') && (paramChar <= 'Ï')) return 'I';
/*   14 */       if ((paramChar >= 'Ò') && (paramChar <= 'Ö')) return 'O';
/*   15 */       if ((paramChar >= 'Ù') && (paramChar <= 'Ü')) return 'U';
/*   16 */       if ('Ý' == paramChar) return 'Y';
/*   17 */       if ('ß' == paramChar) return 's';
/*   18 */       if ((paramChar >= 'à') && (paramChar <= 'æ')) return 'a';
/*   19 */       if (paramChar == 'ç') return 'c';
/*   20 */       if ((paramChar >= 'è') && (paramChar <= 'ë')) return 'e';
/*   21 */       if ((paramChar >= 'ì') && (paramChar <= 'ï')) return 'i';
/*   22 */       if ((paramChar >= 'ò') && (paramChar <= 'ö')) return 'o';
/*   23 */       if ((paramChar >= 'ù') && (paramChar <= 'ü')) return 'u';
/*   24 */       if ((paramChar == 'ý') || ('ÿ' == paramChar)) return 'y';
/*      */     }
/*   26 */     if ('Œ' == paramChar) return 'O';
/*   27 */     if (paramChar == 'œ') return 'o';
/*   28 */     if ('Ÿ' == paramChar) return 'Y';
/*   29 */     return paramChar;
/*      */   }
/*      */ 
/*      */   co()
/*      */     throws Throwable
/*      */   {
/*    5 */     throw new Error();
/*      */   }
/*      */ 
/*      */   public static int m(char paramChar, int paramInt)
/*      */   {
/*   33 */     int i = paramChar << '\004';
/*   34 */     if ((Character.isUpperCase(paramChar)) || (Character.isTitleCase(paramChar))) {
/*   35 */       paramChar = Character.toLowerCase(paramChar);
/*   36 */       i = (paramChar << '\004') + 1;
/*      */     }
/*   38 */     return i;
/*      */   }
/*      */ 
/*      */   public static int c(char paramChar, int paramInt)
/*      */   {
/*   33 */     int i = paramChar << '\004';
/*   34 */     if ((Character.isUpperCase(paramChar)) || (Character.isTitleCase(paramChar))) {
/*   35 */       paramChar = Character.toLowerCase(paramChar);
/*   36 */       i = (paramChar << '\004') + 1;
/*      */     }
/*   38 */     return i;
/*      */   }
/*      */ 
/*      */   public static File d(String paramString, int paramInt)
/*      */   {
/*   22 */     if (!av.r) { if (paramInt <= -1423152423) throw new IllegalStateException(); throw new RuntimeException(""); }
/*   23 */     File localFile1 = (File)av.l.get(paramString);
/*   24 */     if (localFile1 != null) { if (paramInt <= -1423152423) throw new IllegalStateException(); return localFile1; }
/*   25 */     File localFile2 = new File(av.d, paramString);
/*   26 */     RandomAccessFile localRandomAccessFile = null;
/*      */     try {
/*   28 */       File localFile3 = new File(localFile2.getParent());
/*   29 */       if (!localFile3.exists()) { if (paramInt <= -1423152423) throw new IllegalStateException(); throw new RuntimeException(""); }
/*   30 */       localRandomAccessFile = new RandomAccessFile(localFile2, "rw");
/*   31 */       int i = localRandomAccessFile.read();
/*   32 */       localRandomAccessFile.seek(0L);
/*   33 */       localRandomAccessFile.write(i);
/*   34 */       localRandomAccessFile.seek(0L);
/*   35 */       localRandomAccessFile.close();
/*   36 */       av.l.put(paramString, localFile2);
/*   37 */       return localFile2;
/*      */     }
/*      */     catch (Exception localException1) {
/*      */       try {
/*   41 */         if (localRandomAccessFile != null) { if (paramInt <= -1423152423) throw new IllegalStateException();
/*   42 */           localRandomAccessFile.close();
/*   43 */           localRandomAccessFile = null; }
/*      */       }
/*      */       catch (Exception localException2) {
/*      */       }
/*      */     }
/*   48 */     throw new RuntimeException();
/*      */   }
/*      */ 
/*      */   static void dw(fi paramfi, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/* 4879 */     if (-1085803875 * paramfi.ah == paramInt1) { if (paramInt3 >= 65535) throw new IllegalStateException(); if (paramInt1 != -1) { if (paramInt3 >= 65535) throw new IllegalStateException();
/* 4880 */         int i = i.g(paramInt1, (byte)0).h * 1237724085;
/* 4881 */         if (1 == i) { if (paramInt3 >= 65535) return;
/* 4882 */           paramfi.ay = 0;
/* 4883 */           paramfi.al = 0;
/* 4884 */           paramfi.ab = (1774898229 * paramInt2);
/* 4885 */           paramfi.ao = 0;
/*      */         }
/* 4887 */         if (i == 2) { if (paramInt3 < 65535);
/* 4888 */           paramfi.ao = 0;
/*      */         }
/* 4890 */         return; } }
/* 4891 */     if ((-1 != paramInt1) && ((paramInt3 >= 65535) || (paramfi.ah * -1085803875 != -1))) { if ((paramInt3 < 65535) && (i.g(paramInt1, (byte)0).y * -1623763161 < i.g(paramfi.ah * -1085803875, (byte)0).y * -1623763161)) return; if (paramInt3 >= 65535); }
/* 4892 */     paramfi.ah = (paramInt1 * 1995318197);
/* 4893 */     paramfi.ay = 0;
/* 4894 */     paramfi.al = 0;
/* 4895 */     paramfi.ab = (1774898229 * paramInt2);
/* 4896 */     paramfi.ao = 0;
/* 4897 */     paramfi.bf = (paramfi.bl * -530735311);
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     co
 * JD-Core Version:    0.6.2
 */