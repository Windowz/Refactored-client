/*      */ import java.io.EOFException;
/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.io.PrintStream;
/*      */ import java.io.RandomAccessFile;
/*      */ 
/*      */ public final class u
/*      */ {
/*      */   long l;
/*      */   long d;
/*      */   RandomAccessFile r;
/*      */ 
/*      */   public u(File paramFile, String paramString, long paramLong)
/*      */     throws IOException
/*      */   {
/*   14 */     if (-1L == paramLong) paramLong = 9223372036854775807L;
/*   15 */     if (paramFile.length() >= paramLong) {
/*   16 */       paramFile.delete();
/*      */     }
/*   18 */     this.r = new RandomAccessFile(paramFile, paramString);
/*   19 */     this.d = (paramLong * -8462016028211536701L);
/*   20 */     this.l = 0L;
/*   21 */     int i = this.r.read();
/*   22 */     if ((-1 != i) && (!paramString.equals("r"))) {
/*   23 */       this.r.seek(0L);
/*   24 */       this.r.write(i);
/*      */     }
/*   26 */     this.r.seek(0L);
/*      */   }
/*      */ 
/*      */   final void r(long paramLong) throws IOException {
/*   30 */     this.r.seek(paramLong);
/*   31 */     this.l = (492711335852739585L * paramLong);
/*      */   }
/*      */ 
/*      */   public final void d(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3) throws IOException {
/*   35 */     if (6778147509823894529L * this.l + paramInt2 > 8551649694085051371L * this.d) { if (paramInt3 > -57083042);
/*   36 */       this.r.seek(1L + 8551649694085051371L * this.d);
/*   37 */       this.r.write(1);
/*   38 */       throw new EOFException();
/*      */     }
/*   40 */     this.r.write(paramArrayOfByte, paramInt1, paramInt2);
/*   41 */     this.l += paramInt2 * 492711335852739585L;
/*      */   }
/*      */ 
/*      */   public final void l(int paramInt) throws IOException {
/*   45 */     if (this.r != null) { if (paramInt != 1273308593) return;
/*   46 */       this.r.close();
/*   47 */       this.r = null; }
/*      */   }
/*      */ 
/*      */   public final long m(int paramInt) throws IOException
/*      */   {
/*   52 */     return this.r.length();
/*      */   }
/*      */ 
/*      */   public final int c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3) throws IOException {
/*   56 */     int i = this.r.read(paramArrayOfByte, paramInt1, paramInt2);
/*   57 */     if (i > 0) { if (paramInt3 == -1082864631) throw new IllegalStateException(); this.l += i * 492711335852739585L; }
/*   58 */     return i;
/*      */   }
/*      */ 
/*      */   public final void z(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*      */     throws IOException
/*      */   {
/*   35 */     if (6778147509823894529L * this.l + paramInt2 > 8551649694085051371L * this.d) {
/*   36 */       this.r.seek(1L + 8551649694085051371L * this.d);
/*   37 */       this.r.write(1);
/*   38 */       throw new EOFException();
/*      */     }
/*   40 */     this.r.write(paramArrayOfByte, paramInt1, paramInt2);
/*   41 */     this.l += paramInt2 * 492711335852739585L;
/*      */   }
/*      */ 
/*      */   void bl()
/*      */     throws Throwable
/*      */   {
/*   62 */     if (this.r != null) {
/*   63 */       System.out.println("");
/*   64 */       l(1273308593);
/*      */     }
/*      */   }
/*      */ 
/*      */   public final void j(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*      */     throws IOException
/*      */   {
/*   35 */     if (6778147509823894529L * this.l + paramInt2 > 8551649694085051371L * this.d) {
/*   36 */       this.r.seek(1L + 8551649694085051371L * this.d);
/*   37 */       this.r.write(1);
/*   38 */       throw new EOFException();
/*      */     }
/*   40 */     this.r.write(paramArrayOfByte, paramInt1, paramInt2);
/*   41 */     this.l += paramInt2 * 492711335852739585L;
/*      */   }
/*      */ 
/*      */   public void finalize()
/*      */     throws Throwable
/*      */   {
/*   62 */     if (this.r != null) {
/*   63 */       System.out.println("");
/*   64 */       l(1273308593);
/*      */     }
/*      */   }
/*      */ 
/*      */   public final void g(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*      */     throws IOException
/*      */   {
/*   35 */     if (6778147509823894529L * this.l + paramInt2 > 8551649694085051371L * this.d) {
/*   36 */       this.r.seek(1L + 8551649694085051371L * this.d);
/*   37 */       this.r.write(1);
/*   38 */       throw new EOFException();
/*      */     }
/*   40 */     this.r.write(paramArrayOfByte, paramInt1, paramInt2);
/*   41 */     this.l += paramInt2 * 492711335852739585L;
/*      */   }
/*      */ 
/*      */   public final void q(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*      */     throws IOException
/*      */   {
/*   35 */     if (6778147509823894529L * this.l + paramInt2 > 8551649694085051371L * this.d) {
/*   36 */       this.r.seek(1L + 8551649694085051371L * this.d);
/*   37 */       this.r.write(1);
/*   38 */       throw new EOFException();
/*      */     }
/*   40 */     this.r.write(paramArrayOfByte, paramInt1, paramInt2);
/*   41 */     this.l += paramInt2 * 492711335852739585L;
/*      */   }
/*      */ 
/*      */   public final void i() throws IOException {
/*   45 */     if (this.r != null) {
/*   46 */       this.r.close();
/*   47 */       this.r = null;
/*      */     }
/*      */   }
/*      */ 
/*      */   void bg()
/*      */     throws Throwable
/*      */   {
/*   62 */     if (this.r != null) {
/*   63 */       System.out.println("");
/*   64 */       l(1273308593);
/*      */     }
/*      */   }
/*      */ 
/*      */   public final void u()
/*      */     throws IOException
/*      */   {
/*   45 */     if (this.r != null) {
/*   46 */       this.r.close();
/*   47 */       this.r = null;
/*      */     }
/*      */   }
/*      */ 
/*      */   public final long v() throws IOException {
/*   52 */     return this.r.length();
/*      */   }
/*      */ 
/*      */   final void n(long paramLong)
/*      */     throws IOException
/*      */   {
/*   30 */     this.r.seek(paramLong);
/*   31 */     this.l = (492711335852739585L * paramLong);
/*      */   }
/*      */ 
/*      */   public final void s()
/*      */     throws IOException
/*      */   {
/*   45 */     if (this.r != null) {
/*   46 */       this.r.close();
/*   47 */       this.r = null;
/*      */     }
/*      */   }
/*      */ 
/*      */   void bt()
/*      */     throws Throwable
/*      */   {
/*   62 */     if (this.r != null) {
/*   63 */       System.out.println("");
/*   64 */       l(1273308593);
/*      */     }
/*      */   }
/*      */ 
/*      */   public static ft n(ch paramch, int paramInt1, int paramInt2)
/*      */   {
/*  143 */     if (!ai.i(paramch, paramInt1, -1466435351)) { if (paramInt2 == 2073764796) throw new IllegalStateException(); return null; }
/*  144 */     return ao.j(-586214152);
/*      */   }
/*      */ 
/*      */   public static void z(ch paramch, int paramInt)
/*      */   {
/*   21 */     ec.n = paramch;
/*      */   }
/*      */ 
/*      */   static dq dd(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, byte paramByte)
/*      */   {
/* 3958 */     ap localap = null;
/* 3959 */     if (null != ay.s) { if (paramByte < 3);
/* 3959 */       localap = new ap(paramInt, ay.s, av.v[paramInt], 1000000); }
/* 3960 */     return new dq(localap, r.pa, paramInt, paramBoolean1, paramBoolean2, paramBoolean3);
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     u
 * JD-Core Version:    0.6.2
 */