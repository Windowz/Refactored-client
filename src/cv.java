/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.RandomAccessFile;
/*     */ 
/*     */ public class cv
/*     */ {
/*     */   static int e;
/*     */   static int ll;
/*     */   static int nm;
/*     */   static eg hg;
/*     */ 
/*     */   public static boolean t(int paramInt)
/*     */   {
/*  21 */     return 0 != (paramInt >> 28 & 0x1);
/*     */   }
/*     */ 
/*     */   public static boolean c(int paramInt)
/*     */   {
/*   9 */     return 0 != (paramInt & 0x1);
/*     */   }
/*     */ 
/*     */   public static int v(int paramInt)
/*     */   {
/*  17 */     return paramInt >> 17 & 0x7; } 
/*  17 */   public static int w(int paramInt) { return paramInt >> 17 & 0x7; }
/*     */ 
/*     */ 
/*     */   public static int z(int paramInt)
/*     */   {
/*  13 */     return paramInt >> 11 & 0x3F; } 
/*  13 */   public static int g(int paramInt) { return paramInt >> 11 & 0x3F; }
/*     */ 
/*     */ 
/*     */   public static boolean y(int paramInt)
/*     */   {
/*  21 */     return 0 != (paramInt >> 28 & 0x1);
/*     */   }
/*     */ 
/*     */   public static int i(int paramInt)
/*     */   {
/*  13 */     return paramInt >> 11 & 0x3F; } 
/*  13 */   public static int s(int paramInt) { return paramInt >> 11 & 0x3F; }
/*     */ 
/*     */ 
/*     */   public static boolean n(int paramInt)
/*     */   {
/*   9 */     return 0 != (paramInt & 0x1);
/*     */   }
/*     */ 
/*     */   public static boolean b(int paramInt)
/*     */   {
/*  21 */     return 0 != (paramInt >> 28 & 0x1);
/*     */   }
/*     */ 
/*     */   public static int q(int paramInt)
/*     */   {
/*  13 */     return paramInt >> 11 & 0x3F;
/*     */   }
/*     */ 
/*     */   public static int e(int paramInt) {
/*  17 */     return paramInt >> 17 & 0x7;
/*     */   }
/*     */ 
/*     */   cv()
/*     */     throws Throwable
/*     */   {
/*   5 */     throw new Error();
/*     */   }
/*     */ 
/*     */   public static int u(int paramInt)
/*     */   {
/*  13 */     return paramInt >> 11 & 0x3F;
/*     */   }
/*     */ 
/*     */   public static boolean j(int paramInt)
/*     */   {
/*   9 */     return 0 != (paramInt & 0x1);
/*     */   }
/*     */ 
/*     */   public static boolean f(int paramInt)
/*     */   {
/*  21 */     return 0 != (paramInt >> 28 & 0x1);
/*     */   }
/*     */ 
/*     */   public static void d(byte paramByte)
/*     */   {
/*     */     try
/*     */     {
/* 183 */       File localFile1 = new File(ez.o, "random.dat");
/*     */       int j;
/* 184 */       if (localFile1.exists()) { if (paramByte == 2) throw new IllegalStateException();
/* 185 */         ay.i = new v(new u(localFile1, "rw", 25L), 24, 0);
/*     */       } else
/*     */       {
/* 188 */         for (int i = 0; i < ag.b.length; i++) { if (paramByte != 2);
/* 189 */           for (j = 0; j < by.e.length; j++) { if (paramByte == 2) return;
/* 190 */             File localFile2 = new File(by.e[j] + ag.b[i] + File.separatorChar + "random.dat");
/* 191 */             if (localFile2.exists()) { if (paramByte == 2) throw new IllegalStateException();
/* 192 */               ay.i = new v(new u(localFile2, "rw", 25L), 24, 0);
/* 193 */               break label205;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/* 198 */       label205: if (ay.i == null) { if (paramByte != 2);
/* 199 */         RandomAccessFile localRandomAccessFile = new RandomAccessFile(localFile1, "rw");
/* 200 */         j = localRandomAccessFile.read();
/* 201 */         localRandomAccessFile.seek(0L);
/* 202 */         localRandomAccessFile.write(j);
/* 203 */         localRandomAccessFile.seek(0L);
/* 204 */         localRandomAccessFile.close();
/* 205 */         ay.i = new v(new u(localFile1, "rw", 25L), 24, 0);
/*     */       }
/*     */     }
/*     */     catch (IOException localIOException)
/*     */     {
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     cv
 * JD-Core Version:    0.6.2
 */