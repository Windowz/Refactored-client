/*      */ import java.awt.EventQueue;
/*      */ import java.awt.Toolkit;
/*      */ import java.io.DataInputStream;
/*      */ import java.net.InetAddress;
/*      */ import java.net.Socket;
/*      */ import java.net.URL;
/*      */ 
/*      */ public class ak
/*      */   implements Runnable
/*      */ {
/*   15 */   ah m = null;
/*      */   static String d;
/*      */   w l;
/*   18 */   boolean j = false;
/*      */ 
/*   16 */   ah c = null;
/*      */   Thread n;
/*      */   public static String r;
/*      */   public EventQueue z;
/*      */   static final int g = 1;
/*      */   static final int q = 2;
/*      */   static final int i = 3;
/*      */   static final int s = 4;
/*      */   static int kt;
/*      */ 
/*      */   final void i()
/*      */   {
/*   45 */     synchronized (this) {
/*   46 */       this.j = true;
/*   47 */       notifyAll();
/*      */     }
/*      */     try {
/*   50 */       this.n.join();
/*      */     }
/*      */     catch (InterruptedException localInterruptedException)
/*      */     {
/*      */     }
/*      */   }
/*      */ 
/*      */   final ah u(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
/*      */   {
/*  104 */     ah localah = new ah();
/*  105 */     localah.n = (paramInt1 * 633378541);
/*  106 */     localah.j = paramInt2;
/*  107 */     localah.z = paramObject;
/*  108 */     synchronized (this) {
/*  109 */       if (this.c != null) {
/*  110 */         this.c.r = localah;
/*  111 */         this.c = localah;
/*      */       }
/*      */       else {
/*  114 */         this.c = (this.m = localah);
/*      */       }
/*  116 */       notify();
/*      */     }
/*  118 */     return localah;
/*      */   }
/*      */ 
/*      */   public final void l()
/*      */   {
/*      */     while (true)
/*      */     {
/*      */       ah localah;
/*   58 */       synchronized (this)
/*      */       {
/*   60 */         if (this.j) return;
/*   61 */         if (null != this.m) {
/*   62 */           localah = this.m;
/*   63 */           this.m = this.m.r;
/*   64 */           if (this.m == null) this.c = null; 
/*      */         }
/*      */         else
/*      */         {
/*      */           try { wait(); } catch (InterruptedException localInterruptedException) {
/*      */           }
/*   70 */           continue;
/*      */         }
/*      */       }
/*      */       try {
/*   74 */         int k = 1863268069 * localah.n;
/*   75 */         if (1 == k) {
/*   76 */           localah.g = new Socket(InetAddress.getByName((String)localah.z), localah.j);
/*      */         }
/*      */         else
/*      */         {
/*      */           Object localObject1;
/*   78 */           if (k == 2) {
/*   79 */             localObject1 = new Thread((Runnable)localah.z);
/*   80 */             ((Thread)localObject1).setDaemon(true);
/*   81 */             ((Thread)localObject1).start();
/*   82 */             ((Thread)localObject1).setPriority(localah.j);
/*   83 */             localah.g = localObject1;
/*      */           }
/*   85 */           else if (4 == k) {
/*   86 */             localah.g = new DataInputStream(((URL)localah.z).openStream());
/*      */           }
/*   88 */           else if (3 == k) {
/*   89 */             localObject1 = (localah.j >> 24 & 0xFF) + "." + (localah.j >> 16 & 0xFF) + "." + (localah.j >> 8 & 0xFF) + "." + (localah.j & 0xFF);
/*   90 */             localah.g = InetAddress.getByName((String)localObject1).getHostName();
/*      */           }
/*      */         }
/*   92 */         localah.c = 1;
/*      */       }
/*      */       catch (ThreadDeath localThreadDeath) {
/*   95 */         throw localThreadDeath;
/*      */       }
/*      */       catch (Throwable localThrowable) {
/*   98 */         localah.c = 2;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   final ah c(int paramInt1, int paramInt2, int paramInt3, Object paramObject, short paramShort) {
/*  104 */     ah localah = new ah();
/*  105 */     localah.n = (paramInt1 * 633378541);
/*  106 */     localah.j = paramInt2;
/*  107 */     localah.z = paramObject;
/*  108 */     synchronized (this) {
/*  109 */       if (this.c != null) { if (paramShort < 255);
/*  110 */         this.c.r = localah;
/*  111 */         this.c = localah;
/*      */       } else
/*      */       {
/*  114 */         this.c = (this.m = localah);
/*      */       }
/*  116 */       notify();
/*      */     }
/*  118 */     return localah;
/*      */   }
/*      */ 
/*      */   final void m(byte paramByte)
/*      */   {
/*   45 */     synchronized (this) {
/*   46 */       this.j = true;
/*   47 */       notifyAll();
/*      */     }
/*      */     try {
/*   50 */       this.n.join();
/*      */     }
/*      */     catch (InterruptedException localInterruptedException)
/*      */     {
/*      */     }
/*      */   }
/*      */ 
/*      */   public final ah j(Runnable paramRunnable, int paramInt1, int paramInt2)
/*      */   {
/*  126 */     return c(2, paramInt1, 0, paramRunnable, (short)-23445);
/*      */   }
/*      */ 
/*      */   public final ah z(int paramInt1, int paramInt2) {
/*  130 */     return c(3, paramInt1, 0, null, (short)-22189);
/*      */   }
/*      */ 
/*      */   public final ah o(URL paramURL) {
/*  134 */     return c(4, 0, 0, paramURL, (short)-31224);
/*      */   }
/*      */ 
/*      */   public final w q(int paramInt) {
/*  138 */     return this.l;
/*      */   }
/*      */ 
/*      */   public final void r()
/*      */   {
/*      */     while (true)
/*      */     {
/*      */       ah localah;
/*   58 */       synchronized (this)
/*      */       {
/*   60 */         if (this.j) return;
/*   61 */         if (null != this.m) {
/*   62 */           localah = this.m;
/*   63 */           this.m = this.m.r;
/*   64 */           if (this.m == null) this.c = null; 
/*      */         }
/*      */         else
/*      */         {
/*      */           try { wait(); } catch (InterruptedException localInterruptedException) {
/*      */           }
/*   70 */           continue;
/*      */         }
/*      */       }
/*      */       try {
/*   74 */         int k = 1863268069 * localah.n;
/*   75 */         if (1 == k) {
/*   76 */           localah.g = new Socket(InetAddress.getByName((String)localah.z), localah.j);
/*      */         }
/*      */         else
/*      */         {
/*      */           Object localObject1;
/*   78 */           if (k == 2) {
/*   79 */             localObject1 = new Thread((Runnable)localah.z);
/*   80 */             ((Thread)localObject1).setDaemon(true);
/*   81 */             ((Thread)localObject1).start();
/*   82 */             ((Thread)localObject1).setPriority(localah.j);
/*   83 */             localah.g = localObject1;
/*      */           }
/*   85 */           else if (4 == k) {
/*   86 */             localah.g = new DataInputStream(((URL)localah.z).openStream());
/*      */           }
/*   88 */           else if (3 == k) {
/*   89 */             localObject1 = (localah.j >> 24 & 0xFF) + "." + (localah.j >> 16 & 0xFF) + "." + (localah.j >> 8 & 0xFF) + "." + (localah.j & 0xFF);
/*   90 */             localah.g = InetAddress.getByName((String)localObject1).getHostName();
/*      */           }
/*      */         }
/*   92 */         localah.c = 1;
/*      */       }
/*      */       catch (ThreadDeath localThreadDeath) {
/*   95 */         throw localThreadDeath;
/*      */       }
/*      */       catch (Throwable localThrowable) {
/*   98 */         localah.c = 2;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public final void d()
/*      */   {
/*      */     while (true)
/*      */     {
/*      */       ah localah;
/*   58 */       synchronized (this)
/*      */       {
/*   60 */         if (this.j) return;
/*   61 */         if (null != this.m) {
/*   62 */           localah = this.m;
/*   63 */           this.m = this.m.r;
/*   64 */           if (this.m == null) this.c = null; 
/*      */         }
/*      */         else
/*      */         {
/*      */           try { wait(); } catch (InterruptedException localInterruptedException) {
/*      */           }
/*   70 */           continue;
/*      */         }
/*      */       }
/*      */       try {
/*   74 */         int k = 1863268069 * localah.n;
/*   75 */         if (1 == k) {
/*   76 */           localah.g = new Socket(InetAddress.getByName((String)localah.z), localah.j);
/*      */         }
/*      */         else
/*      */         {
/*      */           Object localObject1;
/*   78 */           if (k == 2) {
/*   79 */             localObject1 = new Thread((Runnable)localah.z);
/*   80 */             ((Thread)localObject1).setDaemon(true);
/*   81 */             ((Thread)localObject1).start();
/*   82 */             ((Thread)localObject1).setPriority(localah.j);
/*   83 */             localah.g = localObject1;
/*      */           }
/*   85 */           else if (4 == k) {
/*   86 */             localah.g = new DataInputStream(((URL)localah.z).openStream());
/*      */           }
/*   88 */           else if (3 == k) {
/*   89 */             localObject1 = (localah.j >> 24 & 0xFF) + "." + (localah.j >> 16 & 0xFF) + "." + (localah.j >> 8 & 0xFF) + "." + (localah.j & 0xFF);
/*   90 */             localah.g = InetAddress.getByName((String)localObject1).getHostName();
/*      */           }
/*      */         }
/*   92 */         localah.c = 1;
/*      */       }
/*      */       catch (ThreadDeath localThreadDeath) {
/*   95 */         throw localThreadDeath;
/*      */       }
/*      */       catch (Throwable localThrowable) {
/*   98 */         localah.c = 2;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public final ah f(int paramInt)
/*      */   {
/*  130 */     return c(3, paramInt, 0, null, (short)-15899);
/*      */   }
/*      */ 
/*      */   ak()
/*      */   {
/*   26 */     r = "Unknown";
/*   27 */     d = "1.1";
/*      */     try {
/*   29 */       r = System.getProperty("java.vendor");
/*   30 */       d = System.getProperty("java.version");
/*      */     } catch (Exception localException) {
/*      */     }
/*      */     try {
/*   34 */       this.z = Toolkit.getDefaultToolkit().getSystemEventQueue();
/*      */     } catch (Throwable localThrowable) {
/*      */     }
/*   37 */     this.j = false;
/*   38 */     this.n = new Thread(this);
/*   39 */     this.n.setPriority(10);
/*   40 */     this.n.setDaemon(true);
/*   41 */     this.n.start();
/*      */   }
/*      */ 
/*      */   final void s() {
/*   45 */     synchronized (this) {
/*   46 */       this.j = true;
/*   47 */       notifyAll();
/*      */     }
/*      */     try {
/*   50 */       this.n.join();
/*      */     }
/*      */     catch (InterruptedException localInterruptedException)
/*      */     {
/*      */     }
/*      */   }
/*      */ 
/*      */   public final ah g(URL paramURL, int paramInt)
/*      */   {
/*  134 */     return c(4, 0, 0, paramURL, (short)-27685);
/*      */   }
/*      */ 
/*      */   public final ah e(Runnable paramRunnable, int paramInt)
/*      */   {
/*  126 */     return c(2, paramInt, 0, paramRunnable, (short)-22810);
/*      */   }
/*      */ 
/*      */   public final ah w(String paramString, int paramInt)
/*      */   {
/*  122 */     return c(1, paramInt, 0, paramString, (short)-10426);
/*      */   }
/*      */ 
/*      */   public final void run()
/*      */   {
/*      */     while (true)
/*      */     {
/*      */       ah localah;
/*   58 */       synchronized (this)
/*      */       {
/*   60 */         if (this.j) return;
/*   61 */         if (null != this.m) {
/*   62 */           localah = this.m;
/*   63 */           this.m = this.m.r;
/*   64 */           if (this.m == null) this.c = null; 
/*      */         }
/*      */         else
/*      */         {
/*      */           try { wait(); } catch (InterruptedException localInterruptedException) {
/*      */           }
/*   70 */           continue;
/*      */         }
/*      */       }
/*      */       try {
/*   74 */         int k = 1863268069 * localah.n;
/*   75 */         if (1 == k) {
/*   76 */           localah.g = new Socket(InetAddress.getByName((String)localah.z), localah.j);
/*      */         }
/*      */         else
/*      */         {
/*      */           Object localObject1;
/*   78 */           if (k == 2) {
/*   79 */             localObject1 = new Thread((Runnable)localah.z);
/*   80 */             ((Thread)localObject1).setDaemon(true);
/*   81 */             ((Thread)localObject1).start();
/*   82 */             ((Thread)localObject1).setPriority(localah.j);
/*   83 */             localah.g = localObject1;
/*      */           }
/*   85 */           else if (4 == k) {
/*   86 */             localah.g = new DataInputStream(((URL)localah.z).openStream());
/*      */           }
/*   88 */           else if (3 == k) {
/*   89 */             localObject1 = (localah.j >> 24 & 0xFF) + "." + (localah.j >> 16 & 0xFF) + "." + (localah.j >> 8 & 0xFF) + "." + (localah.j & 0xFF);
/*   90 */             localah.g = InetAddress.getByName((String)localObject1).getHostName();
/*      */           }
/*      */         }
/*   92 */         localah.c = 1;
/*      */       }
/*      */       catch (ThreadDeath localThreadDeath) {
/*   95 */         throw localThreadDeath;
/*      */       }
/*      */       catch (Throwable localThrowable) {
/*   98 */         localah.c = 2;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public final ah b(Runnable paramRunnable, int paramInt)
/*      */   {
/*  126 */     return c(2, paramInt, 0, paramRunnable, (short)-20992); } 
/*  126 */   public final ah y(Runnable paramRunnable, int paramInt) { return c(2, paramInt, 0, paramRunnable, (short)-12740); }
/*      */ 
/*      */   public final ah t(int paramInt)
/*      */   {
/*  130 */     return c(3, paramInt, 0, null, (short)-25396);
/*      */   }
/*      */ 
/*      */   public final ah n(String paramString, int paramInt, byte paramByte)
/*      */   {
/*  122 */     return c(1, paramInt, 0, paramString, (short)-29318);
/*      */   }
/*      */ 
/*      */   public final ah k(URL paramURL)
/*      */   {
/*  134 */     return c(4, 0, 0, paramURL, (short)-29375);
/*      */   }
/*      */ 
/*      */   final ah v(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
/*      */   {
/*  104 */     ah localah = new ah();
/*  105 */     localah.n = (paramInt1 * 633378541);
/*  106 */     localah.j = paramInt2;
/*  107 */     localah.z = paramObject;
/*  108 */     synchronized (this) {
/*  109 */       if (this.c != null) {
/*  110 */         this.c.r = localah;
/*  111 */         this.c = localah;
/*      */       }
/*      */       else {
/*  114 */         this.c = (this.m = localah);
/*      */       }
/*  116 */       notify();
/*      */     }
/*  118 */     return localah;
/*      */   }
/*      */ 
/*      */   public final ah a(URL paramURL)
/*      */   {
/*  134 */     return c(4, 0, 0, paramURL, (short)-24501);
/*      */   }
/*      */ 
/*      */   public final w h() {
/*  138 */     return this.l; } 
/*  138 */   public final w x() { return this.l; }
/*      */ 
/*      */ 
/*      */   public static ft d(ch paramch, String paramString1, String paramString2, int paramInt)
/*      */   {
/*   61 */     int k = paramch.y(paramString1, -1415290383);
/*   62 */     int i1 = paramch.t(k, paramString2, (byte)-1);
/*      */     ft localft;
/*   65 */     if (!bn.q(paramch, k, i1, 965112777)) { if (paramInt == -1431334245) throw new IllegalStateException();
/*   66 */       localft = null;
/*      */     } else
/*      */     {
/*   69 */       localft = ao.j(-1110636500);
/*      */     }
/*   71 */     return localft;
/*      */   }
/*      */ 
/*      */   static final void gm(int paramInt1, int paramInt2, int paramInt3, int paramInt4, fq paramfq, byte paramByte)
/*      */   {
/* 9545 */     int k = paramInt4 * paramInt4 + paramInt3 * paramInt3;
/* 9546 */     if (k > 4225) { if (paramByte >= 100) return; if (k < 90000) { if (paramByte >= 100) return;
/* 9547 */         int i1 = client.fc * -387887155 + 1168764363 * client.gz & 0x7FF;
/* 9548 */         int i2 = fx.an[i1];
/* 9549 */         int i3 = fx.ah[i1];
/* 9550 */         i2 = i2 * 256 / (client.fj * -936091237 + 256);
/* 9551 */         i3 = i3 * 256 / (256 + -936091237 * client.fj);
/* 9552 */         int i4 = paramInt4 * i2 + i3 * paramInt3 >> 16;
/* 9553 */         int i5 = i3 * paramInt4 - i2 * paramInt3 >> 16;
/* 9554 */         double d1 = Math.atan2(i4, i5);
/* 9555 */         int i6 = (int)(Math.sin(d1) * 63.0D);
/* 9556 */         int i7 = (int)(Math.cos(d1) * 57.0D);
/* 9557 */         df.fr.cv(i6 + (94 + paramInt1) + 4 - 10, 83 + paramInt2 - i7 - 20, 20, 20, 15, 15, d1, 256);
/* 9558 */         return; } }
/* 9559 */     g.gw(paramInt1, paramInt2, paramInt3, paramInt4, paramfq, -891703510);
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ak
 * JD-Core Version:    0.6.2
 */