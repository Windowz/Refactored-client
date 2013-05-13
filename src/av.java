/*    */ import java.io.File;
/*    */ import java.io.RandomAccessFile;
/*    */ import java.util.Hashtable;
/*    */ 
/*    */ public class av
/*    */ {
/*    */   static File d;
/*  7 */   static boolean r = false;
/*    */ 
/*  9 */   static Hashtable l = new Hashtable(16);
/*    */   public static v[] v;
/*    */   public static eg[][] m;
/*    */ 
/*    */   public static void m(File paramFile)
/*    */   {
/* 16 */     d = paramFile;
/* 17 */     if (!d.exists()) throw new RuntimeException("");
/* 18 */     r = true;
/*    */   }
/*    */ 
/*    */   public static void l(File paramFile)
/*    */   {
/* 16 */     d = paramFile;
/* 17 */     if (!d.exists()) throw new RuntimeException("");
/* 18 */     r = true;
/*    */   }
/*    */ 
/*    */   public static File g(String paramString) {
/* 22 */     if (!r) throw new RuntimeException("");
/* 23 */     File localFile1 = (File)l.get(paramString);
/* 24 */     if (localFile1 != null) return localFile1;
/* 25 */     File localFile2 = new File(d, paramString);
/* 26 */     RandomAccessFile localRandomAccessFile = null;
/*    */     try {
/* 28 */       File localFile3 = new File(localFile2.getParent());
/* 29 */       if (!localFile3.exists()) throw new RuntimeException("");
/* 30 */       localRandomAccessFile = new RandomAccessFile(localFile2, "rw");
/* 31 */       int i = localRandomAccessFile.read();
/* 32 */       localRandomAccessFile.seek(0L);
/* 33 */       localRandomAccessFile.write(i);
/* 34 */       localRandomAccessFile.seek(0L);
/* 35 */       localRandomAccessFile.close();
/* 36 */       l.put(paramString, localFile2);
/* 37 */       return localFile2;
/*    */     }
/*    */     catch (Exception localException1) {
/*    */       try {
/* 41 */         if (localRandomAccessFile != null) {
/* 42 */           localRandomAccessFile.close();
/* 43 */           localRandomAccessFile = null;
/*    */         }
/*    */       } catch (Exception localException2) {
/*    */       }
/*    */     }
/* 48 */     throw new RuntimeException();
/*    */   }
/*    */ 
/*    */   av()
/*    */     throws Throwable
/*    */   {
/* 12 */     throw new Error();
/*    */   }
/*    */ 
/*    */   public static File n(String paramString)
/*    */   {
/* 22 */     if (!r) throw new RuntimeException("");
/* 23 */     File localFile1 = (File)l.get(paramString);
/* 24 */     if (localFile1 != null) return localFile1;
/* 25 */     File localFile2 = new File(d, paramString);
/* 26 */     RandomAccessFile localRandomAccessFile = null;
/*    */     try {
/* 28 */       File localFile3 = new File(localFile2.getParent());
/* 29 */       if (!localFile3.exists()) throw new RuntimeException("");
/* 30 */       localRandomAccessFile = new RandomAccessFile(localFile2, "rw");
/* 31 */       int i = localRandomAccessFile.read();
/* 32 */       localRandomAccessFile.seek(0L);
/* 33 */       localRandomAccessFile.write(i);
/* 34 */       localRandomAccessFile.seek(0L);
/* 35 */       localRandomAccessFile.close();
/* 36 */       l.put(paramString, localFile2);
/* 37 */       return localFile2;
/*    */     }
/*    */     catch (Exception localException1) {
/*    */       try {
/* 41 */         if (localRandomAccessFile != null) {
/* 42 */           localRandomAccessFile.close();
/* 43 */           localRandomAccessFile = null;
/*    */         }
/*    */       } catch (Exception localException2) {
/*    */       }
/*    */     }
/* 48 */     throw new RuntimeException();
/*    */   }
/*    */ 
/*    */   public static File j(String paramString)
/*    */   {
/* 22 */     if (!r) throw new RuntimeException("");
/* 23 */     File localFile1 = (File)l.get(paramString);
/* 24 */     if (localFile1 != null) return localFile1;
/* 25 */     File localFile2 = new File(d, paramString);
/* 26 */     RandomAccessFile localRandomAccessFile = null;
/*    */     try {
/* 28 */       File localFile3 = new File(localFile2.getParent());
/* 29 */       if (!localFile3.exists()) throw new RuntimeException("");
/* 30 */       localRandomAccessFile = new RandomAccessFile(localFile2, "rw");
/* 31 */       int i = localRandomAccessFile.read();
/* 32 */       localRandomAccessFile.seek(0L);
/* 33 */       localRandomAccessFile.write(i);
/* 34 */       localRandomAccessFile.seek(0L);
/* 35 */       localRandomAccessFile.close();
/* 36 */       l.put(paramString, localFile2);
/* 37 */       return localFile2;
/*    */     }
/*    */     catch (Exception localException1) {
/*    */       try {
/* 41 */         if (localRandomAccessFile != null) {
/* 42 */           localRandomAccessFile.close();
/* 43 */           localRandomAccessFile = null;
/*    */         }
/*    */       } catch (Exception localException2) {
/*    */       }
/*    */     }
/* 48 */     throw new RuntimeException();
/*    */   }
/*    */ 
/*    */   public static File z(String paramString)
/*    */   {
/* 22 */     if (!r) throw new RuntimeException("");
/* 23 */     File localFile1 = (File)l.get(paramString);
/* 24 */     if (localFile1 != null) return localFile1;
/* 25 */     File localFile2 = new File(d, paramString);
/* 26 */     RandomAccessFile localRandomAccessFile = null;
/*    */     try {
/* 28 */       File localFile3 = new File(localFile2.getParent());
/* 29 */       if (!localFile3.exists()) throw new RuntimeException("");
/* 30 */       localRandomAccessFile = new RandomAccessFile(localFile2, "rw");
/* 31 */       int i = localRandomAccessFile.read();
/* 32 */       localRandomAccessFile.seek(0L);
/* 33 */       localRandomAccessFile.write(i);
/* 34 */       localRandomAccessFile.seek(0L);
/* 35 */       localRandomAccessFile.close();
/* 36 */       l.put(paramString, localFile2);
/* 37 */       return localFile2;
/*    */     }
/*    */     catch (Exception localException1) {
/*    */       try {
/* 41 */         if (localRandomAccessFile != null) {
/* 42 */           localRandomAccessFile.close();
/* 43 */           localRandomAccessFile = null;
/*    */         }
/*    */       } catch (Exception localException2) {
/*    */       }
/*    */     }
/* 48 */     throw new RuntimeException();
/*    */   }
/*    */ 
/*    */   public static void c(File paramFile)
/*    */   {
/* 16 */     d = paramFile;
/* 17 */     if (!d.exists()) throw new RuntimeException("");
/* 18 */     r = true;
/*    */   }
/*    */ 
/*    */   public static int r(int paramInt1, int paramInt2, byte paramByte)
/*    */   {
/*  9 */     int i;
/*  9 */     if (paramInt2 > paramInt1) { if (paramByte <= 1) throw new IllegalStateException();
/* 10 */       i = paramInt1;
/* 11 */       paramInt1 = paramInt2;
/* 12 */       paramInt2 = i;
/*    */     }
/* 14 */     while (paramInt2 != 0) { if (paramByte <= 1) throw new IllegalStateException();
/* 15 */       i = paramInt1 % paramInt2;
/* 16 */       paramInt1 = paramInt2;
/* 17 */       paramInt2 = i;
/*    */     }
/* 19 */     return paramInt1;
/*    */   }
/*    */ 
/*    */   public static void z(ch paramch1, ch paramch2, boolean paramBoolean, int paramInt)
/*    */   {
/* 70 */     j.j = paramch1;
/* 71 */     ey.z = paramch2;
/* 72 */     ey.n = paramBoolean;
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     av
 * JD-Core Version:    0.6.2
 */