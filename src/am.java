/*      */ import java.io.EOFException;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.OutputStream;
/*      */ import java.net.Socket;
/*      */ 
/*      */ public final class am
/*      */   implements Runnable
/*      */ {
/*   14 */   boolean m = false;
/*      */   OutputStream d;
/*      */   Socket l;
/*      */   byte[] j;
/*   20 */   boolean q = false;
/*      */   ah n;
/*      */   ak c;
/*   18 */   int z = 0;
/*   19 */   int g = 0;
/*      */   InputStream r;
/*      */   static int[][] ef;
/*      */ 
/*      */   public void run()
/*      */   {
/*      */     try
/*      */     {
/*      */       while (true)
/*      */       {
/*      */         int k;
/*      */         int i;
/*  102 */         synchronized (this) {
/*  103 */           if (this.g * 1290433195 == this.z * -1403910689) {
/*  104 */             if (this.m) break;
/*      */             try {
/*  106 */               wait();
/*      */             } catch (InterruptedException localInterruptedException) {
/*      */             }
/*      */           }
/*  110 */           k = this.z * -1403910689;
/*  111 */           if (this.g * 1290433195 >= this.z * -1403910689) i = this.g * 1290433195 - -1403910689 * this.z; else
/*  112 */             i = 5000 - this.z * -1403910689;
/*      */         }
/*  114 */         if (i > 0) {
/*      */           try {
/*  116 */             this.d.write(this.j, k, i);
/*      */           }
/*      */           catch (IOException localIOException2) {
/*  119 */             this.q = true;
/*      */           }
/*  121 */           this.z = (2067002911 * ((this.z * -1403910689 + i) % 5000));
/*      */           try {
/*  123 */             if (1290433195 * this.g == -1403910689 * this.z) this.d.flush(); 
/*      */           }
/*      */           catch (IOException localIOException3)
/*      */           {
/*  126 */             this.q = true;
/*      */           }
/*      */         }
/*      */       }
/*      */       try {
/*  131 */         if (this.r != null) this.r.close();
/*  132 */         if (null != this.d) this.d.close();
/*  133 */         if (null != this.l) this.l.close(); 
/*      */       }
/*      */       catch (IOException localIOException1) {  }
/*      */ 
/*  136 */       this.j = null;
/*      */     }
/*      */     catch (Exception localException) {
/*  139 */       dy.r(null, localException, 1838097521);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void j(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
/*      */     throws IOException
/*      */   {
/*   66 */     if (this.m) { if (paramInt3 == -1714803314) return; return; }
/*   67 */     while (paramInt2 > 0) { if (paramInt3 == -1714803314) return;
/*   68 */       int i = this.r.read(paramArrayOfByte, paramInt1, paramInt2);
/*   69 */       if (i <= 0) { if (paramInt3 != -1714803314);
/*   69 */         throw new EOFException(); }
/*   70 */       paramInt1 += i;
/*   71 */       paramInt2 -= i;
/*      */     }
/*      */   }
/*      */ 
/*      */   public void m(int paramInt)
/*      */   {
/*   32 */     if (this.m) { if (paramInt < 1109083877);
/*   32 */       return; }
/*   33 */     synchronized (this) {
/*   34 */       this.m = true;
/*   35 */       notifyAll();
/*      */     }
/*   37 */     if (null != this.n) { if (paramInt >= 1109083877) throw new IllegalStateException();
/*   38 */       while (this.n.c == 0) { if (paramInt < 1109083877);
/*   39 */         cl.r(1L);
/*      */       }
/*   41 */       if (this.n.c == 1) { if (paramInt >= 1109083877) throw new IllegalStateException(); try
/*      */         {
/*   43 */           ((Thread)this.n.g).join();
/*      */         }
/*      */         catch (InterruptedException localInterruptedException)
/*      */         {
/*      */         } } }
/*   48 */     this.n = null;
/*      */   }
/*      */ 
/*      */   public void l()
/*      */   {
/*      */     try
/*      */     {
/*      */       while (true)
/*      */       {
/*      */         int k;
/*      */         int i;
/*  102 */         synchronized (this) {
/*  103 */           if (this.g * 1290433195 == this.z * -1403910689) {
/*  104 */             if (this.m) break;
/*      */             try {
/*  106 */               wait();
/*      */             } catch (InterruptedException localInterruptedException) {
/*      */             }
/*      */           }
/*  110 */           k = this.z * -1403910689;
/*  111 */           if (this.g * 1290433195 >= this.z * -1403910689) i = this.g * 1290433195 - -1403910689 * this.z; else
/*  112 */             i = 5000 - this.z * -1403910689;
/*      */         }
/*  114 */         if (i > 0) {
/*      */           try {
/*  116 */             this.d.write(this.j, k, i);
/*      */           }
/*      */           catch (IOException localIOException2) {
/*  119 */             this.q = true;
/*      */           }
/*  121 */           this.z = (2067002911 * ((this.z * -1403910689 + i) % 5000));
/*      */           try {
/*  123 */             if (1290433195 * this.g == -1403910689 * this.z) this.d.flush(); 
/*      */           }
/*      */           catch (IOException localIOException3)
/*      */           {
/*  126 */             this.q = true;
/*      */           }
/*      */         }
/*      */       }
/*      */       try {
/*  131 */         if (this.r != null) this.r.close();
/*  132 */         if (null != this.d) this.d.close();
/*  133 */         if (null != this.l) this.l.close(); 
/*      */       }
/*      */       catch (IOException localIOException1) {  }
/*      */ 
/*  136 */       this.j = null;
/*      */     }
/*      */     catch (Exception localException) {
/*  139 */       dy.r(null, localException, 1694277574);
/*      */     }
/*      */   }
/*      */ 
/*      */   public int n(int paramInt)
/*      */     throws IOException
/*      */   {
/*   61 */     if (this.m) { if (paramInt == 1170352585);
/*   61 */       return 0; }
/*   62 */     return this.r.available();
/*      */   }
/*      */ 
/*      */   public void d()
/*      */   {
/*      */     try
/*      */     {
/*      */       while (true)
/*      */       {
/*      */         int k;
/*      */         int i;
/*  102 */         synchronized (this) {
/*  103 */           if (this.g * 1290433195 == this.z * -1403910689) {
/*  104 */             if (this.m) break;
/*      */             try {
/*  106 */               wait();
/*      */             } catch (InterruptedException localInterruptedException) {
/*      */             }
/*      */           }
/*  110 */           k = this.z * -1403910689;
/*  111 */           if (this.g * 1290433195 >= this.z * -1403910689) i = this.g * 1290433195 - -1403910689 * this.z; else
/*  112 */             i = 5000 - this.z * -1403910689;
/*      */         }
/*  114 */         if (i > 0) {
/*      */           try {
/*  116 */             this.d.write(this.j, k, i);
/*      */           }
/*      */           catch (IOException localIOException2) {
/*  119 */             this.q = true;
/*      */           }
/*  121 */           this.z = (2067002911 * ((this.z * -1403910689 + i) % 5000));
/*      */           try {
/*  123 */             if (1290433195 * this.g == -1403910689 * this.z) this.d.flush(); 
/*      */           }
/*      */           catch (IOException localIOException3)
/*      */           {
/*  126 */             this.q = true;
/*      */           }
/*      */         }
/*      */       }
/*      */       try {
/*  131 */         if (this.r != null) this.r.close();
/*  132 */         if (null != this.d) this.d.close();
/*  133 */         if (null != this.l) this.l.close(); 
/*      */       }
/*      */       catch (IOException localIOException1) {  }
/*      */ 
/*  136 */       this.j = null;
/*      */     }
/*      */     catch (Exception localException) {
/*  139 */       dy.r(null, localException, 257202941);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void z(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
/*      */     throws IOException
/*      */   {
/*   76 */     if (this.m) { if (paramInt3 < 16465432);
/*   76 */       return; }
/*   77 */     if (this.q) { if (paramInt3 >= 16465432) return;
/*   78 */       this.q = false;
/*   79 */       throw new IOException();
/*      */     }
/*   81 */     if (null == this.j) { if (paramInt3 >= 16465432) throw new IllegalStateException(); this.j = new byte[5000]; }
/*   82 */     synchronized (this) {
/*   83 */       for (int i = 0; i < paramInt2; i++) { if (paramInt3 < 16465432);
/*   84 */         this.j[(this.g * 1290433195)] = paramArrayOfByte[(i + paramInt1)];
/*   85 */         this.g = (-1769867261 * ((1290433195 * this.g + 1) % 5000));
/*   86 */         if ((4900 + -1403910689 * this.z) % 5000 == 1290433195 * this.g) { if (paramInt3 < 16465432);
/*   87 */           throw new IOException();
/*      */         }
/*      */       }
/*   90 */       if (this.n == null) { if (paramInt3 >= 16465432) throw new IllegalStateException();
/*   91 */         this.n = this.c.j(this, 3, 936108459);
/*      */       }
/*   93 */       notifyAll();
/*      */     }
/*      */   }
/*      */ 
/*      */   public am(Socket paramSocket, ak paramak)
/*      */     throws IOException
/*      */   {
/*   23 */     this.c = paramak;
/*   24 */     this.l = paramSocket;
/*   25 */     this.l.setSoTimeout(30000);
/*   26 */     this.l.setTcpNoDelay(true);
/*   27 */     this.r = this.l.getInputStream();
/*   28 */     this.d = this.l.getOutputStream();
/*      */   }
/*      */ 
/*      */   public void r()
/*      */   {
/*      */     try
/*      */     {
/*      */       while (true)
/*      */       {
/*      */         int k;
/*      */         int i;
/*  102 */         synchronized (this) {
/*  103 */           if (this.g * 1290433195 == this.z * -1403910689) {
/*  104 */             if (this.m) break;
/*      */             try {
/*  106 */               wait();
/*      */             } catch (InterruptedException localInterruptedException) {
/*      */             }
/*      */           }
/*  110 */           k = this.z * -1403910689;
/*  111 */           if (this.g * 1290433195 >= this.z * -1403910689) i = this.g * 1290433195 - -1403910689 * this.z; else
/*  112 */             i = 5000 - this.z * -1403910689;
/*      */         }
/*  114 */         if (i > 0) {
/*      */           try {
/*  116 */             this.d.write(this.j, k, i);
/*      */           }
/*      */           catch (IOException localIOException2) {
/*  119 */             this.q = true;
/*      */           }
/*  121 */           this.z = (2067002911 * ((this.z * -1403910689 + i) % 5000));
/*      */           try {
/*  123 */             if (1290433195 * this.g == -1403910689 * this.z) this.d.flush(); 
/*      */           }
/*      */           catch (IOException localIOException3)
/*      */           {
/*  126 */             this.q = true;
/*      */           }
/*      */         }
/*      */       }
/*      */       try {
/*  131 */         if (this.r != null) this.r.close();
/*  132 */         if (null != this.d) this.d.close();
/*  133 */         if (null != this.l) this.l.close(); 
/*      */       }
/*      */       catch (IOException localIOException1) {  }
/*      */ 
/*  136 */       this.j = null;
/*      */     }
/*      */     catch (Exception localException) {
/*  139 */       dy.r(null, localException, 990391698);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void finalize()
/*      */   {
/*   52 */     m(-496827666);
/*      */   }
/*      */ 
/*      */   public int c(int paramInt) throws IOException {
/*   56 */     if (this.m) { if (paramInt != -420767224) throw new IllegalStateException(); return 0; }
/*   57 */     return this.r.read();
/*      */   }
/*      */ 
/*      */   void bg()
/*      */   {
/*   52 */     m(377936189); } 
/*   52 */   void bl() { m(-823211306); } 
/*   52 */   void bt() { m(724430984); }
/*      */ 
/*      */ 
/*      */   public void g()
/*      */   {
/*   32 */     if (this.m) return;
/*   33 */     synchronized (this) {
/*   34 */       this.m = true;
/*   35 */       notifyAll();
/*      */     }
/*   37 */     if (null != this.n) {
/*   38 */       while (this.n.c == 0) {
/*   39 */         cl.r(1L);
/*      */       }
/*   41 */       if (this.n.c == 1)
/*      */         try {
/*   43 */           ((Thread)this.n.g).join();
/*      */         }
/*      */         catch (InterruptedException localInterruptedException) {
/*      */         }
/*      */     }
/*   48 */     this.n = null;
/*      */   }
/*      */ 
/*      */   public int q()
/*      */     throws IOException
/*      */   {
/*   61 */     if (this.m) return 0;
/*   62 */     return this.r.available();
/*      */   }
/*      */ 
/*      */   public void i(byte[] paramArrayOfByte, int paramInt1, int paramInt2) throws IOException {
/*   66 */     if (this.m) return;
/*   67 */     while (paramInt2 > 0) {
/*   68 */       int i = this.r.read(paramArrayOfByte, paramInt1, paramInt2);
/*   69 */       if (i <= 0) throw new EOFException();
/*   70 */       paramInt1 += i;
/*   71 */       paramInt2 -= i;
/*      */     }
/*      */   }
/*      */ 
/*      */   public void s(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*      */     throws IOException
/*      */   {
/*   66 */     if (this.m) return;
/*   67 */     while (paramInt2 > 0) {
/*   68 */       int i = this.r.read(paramArrayOfByte, paramInt1, paramInt2);
/*   69 */       if (i <= 0) throw new EOFException();
/*   70 */       paramInt1 += i;
/*   71 */       paramInt2 -= i;
/*      */     }
/*      */   }
/*      */ 
/*      */   public void u(byte[] paramArrayOfByte, int paramInt1, int paramInt2) throws IOException {
/*   76 */     if (this.m) return;
/*   77 */     if (this.q) {
/*   78 */       this.q = false;
/*   79 */       throw new IOException();
/*      */     }
/*   81 */     if (null == this.j) this.j = new byte[5000];
/*   82 */     synchronized (this) {
/*   83 */       for (int i = 0; i < paramInt2; i++) {
/*   84 */         this.j[(this.g * 1290433195)] = paramArrayOfByte[(i + paramInt1)];
/*   85 */         this.g = (-1769867261 * ((1290433195 * this.g + 1) % 5000));
/*   86 */         if ((4900 + -1403910689 * this.z) % 5000 == 1290433195 * this.g) {
/*   87 */           throw new IOException();
/*      */         }
/*      */       }
/*   90 */       if (this.n == null) {
/*   91 */         this.n = this.c.j(this, 3, 1778825680);
/*      */       }
/*   93 */       notifyAll();
/*      */     }
/*      */   }
/*      */ 
/*      */   public void v(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
/*      */     throws IOException
/*      */   {
/*   76 */     if (this.m) return;
/*   77 */     if (this.q) {
/*   78 */       this.q = false;
/*   79 */       throw new IOException();
/*      */     }
/*   81 */     if (null == this.j) this.j = new byte[5000];
/*   82 */     synchronized (this) {
/*   83 */       for (int i = 0; i < paramInt2; i++) {
/*   84 */         this.j[(this.g * 1290433195)] = paramArrayOfByte[(i + paramInt1)];
/*   85 */         this.g = (-1769867261 * ((1290433195 * this.g + 1) % 5000));
/*   86 */         if ((4900 + -1403910689 * this.z) % 5000 == 1290433195 * this.g) {
/*   87 */           throw new IOException();
/*      */         }
/*      */       }
/*   90 */       if (this.n == null) {
/*   91 */         this.n = this.c.j(this, 3, 1820139396);
/*      */       }
/*   93 */       notifyAll();
/*      */     }
/*      */   }
/*      */ 
/*      */   static final void gr(dy paramdy, boolean paramBoolean, int paramInt)
/*      */   {
/* 9404 */     int i = paramdy.m * -2056138635;
/* 9405 */     int k = (int)paramdy.r;
/* 9406 */     paramdy.r();
/* 9407 */     if (paramBoolean) { if (paramInt == 339534113) return;
/* 9408 */       if (-1 == i) { if (paramInt == 339534113) return; 
/*      */       }
/* 9409 */       else if (df.c[i] == 0) { if (paramInt == 339534113) throw new IllegalStateException();  } else {
/* 9410 */         eg.n.w(i, -130954046);
/* 9411 */         if (null == av.m[i]) { if (paramInt == 339534113); } else {
/* 9412 */           int i1 = 1;
/* 9413 */           for (int i2 = 0; i2 < av.m[i].length; i2++) if ((paramInt == 339534113) || 
/* 9414 */               (av.m[i][i2] != null)) if ((paramInt == 339534113) || 
/* 9415 */                 (808825319 * av.m[i][i2].b != 2)) { if (paramInt == 339534113) return; av.m[i][i2] = null; } else {
/* 9416 */                 i1 = 0;
/*      */               }
/*      */ 
/* 9419 */           if (i1 != 0) { if (paramInt != 339534113);
/* 9419 */             av.m[i] = null; }
/* 9420 */           df.c[i] = false;
/*      */         }
/*      */       } } s.gt(i, 937390112);
/* 9423 */     eg localeg = bw.n(k, (byte)1);
/* 9424 */     if (null != localeg) { if (paramInt == 339534113) return; cq.fy(localeg, -1207489509); }
/* 9425 */     client.jj = false;
/* 9426 */     client.jp = 0;
/* 9427 */     bs.ea(-910222263 * ca.jf, bk.ji * -1250173129, al.jt * 1782215731, -1661844025 * m.jd, 1856281335);
/* 9428 */     if (-1 != -1955724463 * client.ki) { if (paramInt == 339534113) throw new IllegalStateException(); ai.fs(-1955724463 * client.ki, 1, -1937112112);
/*      */     }
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     am
 * JD-Core Version:    0.6.2
 */