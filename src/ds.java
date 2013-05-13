/*    */ import java.awt.Component;
/*    */ import javax.sound.sampled.AudioFormat;
/*    */ import javax.sound.sampled.AudioSystem;
/*    */ import javax.sound.sampled.DataLine.Info;
/*    */ import javax.sound.sampled.LineUnavailableException;
/*    */ import javax.sound.sampled.SourceDataLine;
/*    */ 
/*    */ public class ds extends y
/*    */ {
/*    */   byte[] am;
/*    */   AudioFormat ac;
/*    */   int as;
/*    */   SourceDataLine aa;
/*    */ 
/*    */   void p(int paramInt)
/*    */     throws LineUnavailableException
/*    */   {
/*    */     try
/*    */     {
/* 26 */       DataLine.Info localInfo = new DataLine.Info(Class.forName("javax.sound.sampled.SourceDataLine"), this.ac, paramInt << (d ? 2 : 1));
/* 27 */       this.aa = ((SourceDataLine)AudioSystem.getLine(localInfo));
/* 28 */       this.aa.open();
/* 29 */       this.aa.start();
/* 30 */       this.as = (-271171317 * paramInt);
/*    */     }
/*    */     catch (LineUnavailableException localLineUnavailableException) {
/* 33 */       if (eg.d(paramInt, (byte)0) != 1)
/*    */       {
/* 35 */         int j = paramInt;
/*    */ 
/* 37 */         j--;
/* 38 */         j |= j >>> 1;
/* 39 */         j |= j >>> 2;
/* 40 */         j |= j >>> 4;
/* 41 */         j |= j >>> 8;
/* 42 */         j |= j >>> 16;
/* 43 */         int i = 1 + j;
/*    */ 
/* 45 */         u(i);
/* 46 */         return;
/*    */       }
/* 48 */       this.aa = null;
/* 49 */       throw localLineUnavailableException;
/*    */     }
/*    */   }
/*    */ 
/*    */   int ac() {
/* 54 */     return this.as * -1966636381 - (this.aa.available() >> (d ? 2 : 1));
/*    */   }
/*    */ 
/*    */   void u(int paramInt)
/*    */     throws LineUnavailableException
/*    */   {
/*    */     try
/*    */     {
/* 26 */       DataLine.Info localInfo = new DataLine.Info(Class.forName("javax.sound.sampled.SourceDataLine"), this.ac, paramInt << (d ? 2 : 1));
/* 27 */       this.aa = ((SourceDataLine)AudioSystem.getLine(localInfo));
/* 28 */       this.aa.open();
/* 29 */       this.aa.start();
/* 30 */       this.as = (-271171317 * paramInt);
/*    */     }
/*    */     catch (LineUnavailableException localLineUnavailableException) {
/* 33 */       if (eg.d(paramInt, (byte)0) != 1)
/*    */       {
/* 35 */         int j = paramInt;
/*    */ 
/* 37 */         j--;
/* 38 */         j |= j >>> 1;
/* 39 */         j |= j >>> 2;
/* 40 */         j |= j >>> 4;
/* 41 */         j |= j >>> 8;
/* 42 */         j |= j >>> 16;
/* 43 */         int i = 1 + j;
/*    */ 
/* 45 */         u(i);
/* 46 */         return;
/*    */       }
/* 48 */       this.aa = null;
/* 49 */       throw localLineUnavailableException;
/*    */     }
/*    */   }
/*    */ 
/*    */   void y(Component paramComponent)
/*    */   {
/* 20 */     this.ac = new AudioFormat(r * -1570391439, 16, d ? 2 : 1, true, false);
/* 21 */     this.am = new byte[256 << (d ? 2 : 1)];
/*    */   }
/*    */ 
/*    */   void w()
/*    */   {
/* 59 */     int i = 256;
/* 60 */     if (d) i <<= 1;
/* 61 */     for (int j = 0; j < i; j++) {
/* 62 */       int k = this.j[j];
/* 63 */       if ((8388608 + k & 0xFF000000) != 0) {
/* 64 */         k = 0x7FFFFF ^ k >> 31;
/*    */       }
/* 66 */       this.am[(j * 2)] = ((byte)(k >> 8));
/* 67 */       this.am[(1 + 2 * j)] = ((byte)(k >> 16));
/*    */     }
/* 69 */     this.aa.write(this.am, 0, i << 1);
/*    */   }
/*    */ 
/*    */   void e() {
/* 73 */     if (this.aa != null) {
/* 74 */       this.aa.close();
/* 75 */       this.aa = null;
/*    */     }
/*    */   }
/*    */ 
/*    */   void b() {
/* 80 */     this.aa.flush();
/*    */   }
/*    */ 
/*    */   void t(int paramInt)
/*    */     throws LineUnavailableException
/*    */   {
/*    */     try
/*    */     {
/* 26 */       DataLine.Info localInfo = new DataLine.Info(Class.forName("javax.sound.sampled.SourceDataLine"), this.ac, paramInt << (d ? 2 : 1));
/* 27 */       this.aa = ((SourceDataLine)AudioSystem.getLine(localInfo));
/* 28 */       this.aa.open();
/* 29 */       this.aa.start();
/* 30 */       this.as = (-271171317 * paramInt);
/*    */     }
/*    */     catch (LineUnavailableException localLineUnavailableException) {
/* 33 */       if (eg.d(paramInt, (byte)0) != 1)
/*    */       {
/* 35 */         int j = paramInt;
/*    */ 
/* 37 */         j--;
/* 38 */         j |= j >>> 1;
/* 39 */         j |= j >>> 2;
/* 40 */         j |= j >>> 4;
/* 41 */         j |= j >>> 8;
/* 42 */         j |= j >>> 16;
/* 43 */         int i = 1 + j;
/*    */ 
/* 45 */         u(i);
/* 46 */         return;
/*    */       }
/* 48 */       this.aa = null;
/* 49 */       throw localLineUnavailableException;
/*    */     }
/*    */   }
/*    */ 
/*    */   void f(int paramInt)
/*    */     throws LineUnavailableException
/*    */   {
/*    */     try
/*    */     {
/* 26 */       DataLine.Info localInfo = new DataLine.Info(Class.forName("javax.sound.sampled.SourceDataLine"), this.ac, paramInt << (d ? 2 : 1));
/* 27 */       this.aa = ((SourceDataLine)AudioSystem.getLine(localInfo));
/* 28 */       this.aa.open();
/* 29 */       this.aa.start();
/* 30 */       this.as = (-271171317 * paramInt);
/*    */     }
/*    */     catch (LineUnavailableException localLineUnavailableException) {
/* 33 */       if (eg.d(paramInt, (byte)0) != 1)
/*    */       {
/* 35 */         int j = paramInt;
/*    */ 
/* 37 */         j--;
/* 38 */         j |= j >>> 1;
/* 39 */         j |= j >>> 2;
/* 40 */         j |= j >>> 4;
/* 41 */         j |= j >>> 8;
/* 42 */         j |= j >>> 16;
/* 43 */         int i = 1 + j;
/*    */ 
/* 45 */         u(i);
/* 46 */         return;
/*    */       }
/* 48 */       this.aa = null;
/* 49 */       throw localLineUnavailableException;
/*    */     }
/*    */   }
/*    */ 
/*    */   void k(int paramInt)
/*    */     throws LineUnavailableException
/*    */   {
/*    */     try
/*    */     {
/* 26 */       DataLine.Info localInfo = new DataLine.Info(Class.forName("javax.sound.sampled.SourceDataLine"), this.ac, paramInt << (d ? 2 : 1));
/* 27 */       this.aa = ((SourceDataLine)AudioSystem.getLine(localInfo));
/* 28 */       this.aa.open();
/* 29 */       this.aa.start();
/* 30 */       this.as = (-271171317 * paramInt);
/*    */     }
/*    */     catch (LineUnavailableException localLineUnavailableException) {
/* 33 */       if (eg.d(paramInt, (byte)0) != 1)
/*    */       {
/* 35 */         int j = paramInt;
/*    */ 
/* 37 */         j--;
/* 38 */         j |= j >>> 1;
/* 39 */         j |= j >>> 2;
/* 40 */         j |= j >>> 4;
/* 41 */         j |= j >>> 8;
/* 42 */         j |= j >>> 16;
/* 43 */         int i = 1 + j;
/*    */ 
/* 45 */         u(i);
/* 46 */         return;
/*    */       }
/* 48 */       this.aa = null;
/* 49 */       throw localLineUnavailableException;
/*    */     }
/*    */   }
/*    */ 
/*    */   void o(int paramInt)
/*    */     throws LineUnavailableException
/*    */   {
/*    */     try
/*    */     {
/* 26 */       DataLine.Info localInfo = new DataLine.Info(Class.forName("javax.sound.sampled.SourceDataLine"), this.ac, paramInt << (d ? 2 : 1));
/* 27 */       this.aa = ((SourceDataLine)AudioSystem.getLine(localInfo));
/* 28 */       this.aa.open();
/* 29 */       this.aa.start();
/* 30 */       this.as = (-271171317 * paramInt);
/*    */     }
/*    */     catch (LineUnavailableException localLineUnavailableException) {
/* 33 */       if (eg.d(paramInt, (byte)0) != 1)
/*    */       {
/* 35 */         int j = paramInt;
/*    */ 
/* 37 */         j--;
/* 38 */         j |= j >>> 1;
/* 39 */         j |= j >>> 2;
/* 40 */         j |= j >>> 4;
/* 41 */         j |= j >>> 8;
/* 42 */         j |= j >>> 16;
/* 43 */         int i = 1 + j;
/*    */ 
/* 45 */         u(i);
/* 46 */         return;
/*    */       }
/* 48 */       this.aa = null;
/* 49 */       throw localLineUnavailableException;
/*    */     }
/*    */   }
/*    */ 
/*    */   void a(int paramInt)
/*    */     throws LineUnavailableException
/*    */   {
/*    */     try
/*    */     {
/* 26 */       DataLine.Info localInfo = new DataLine.Info(Class.forName("javax.sound.sampled.SourceDataLine"), this.ac, paramInt << (d ? 2 : 1));
/* 27 */       this.aa = ((SourceDataLine)AudioSystem.getLine(localInfo));
/* 28 */       this.aa.open();
/* 29 */       this.aa.start();
/* 30 */       this.as = (-271171317 * paramInt);
/*    */     }
/*    */     catch (LineUnavailableException localLineUnavailableException) {
/* 33 */       if (eg.d(paramInt, (byte)0) != 1)
/*    */       {
/* 35 */         int j = paramInt;
/*    */ 
/* 37 */         j--;
/* 38 */         j |= j >>> 1;
/* 39 */         j |= j >>> 2;
/* 40 */         j |= j >>> 4;
/* 41 */         j |= j >>> 8;
/* 42 */         j |= j >>> 16;
/* 43 */         int i = 1 + j;
/*    */ 
/* 45 */         u(i);
/* 46 */         return;
/*    */       }
/* 48 */       this.aa = null;
/* 49 */       throw localLineUnavailableException;
/*    */     }
/*    */   }
/*    */ 
/*    */   int v() {
/* 54 */     return this.as * -1966636381 - (this.aa.available() >> (d ? 2 : 1));
/*    */   }
/*    */ 
/*    */   void as()
/*    */   {
/* 73 */     if (this.aa != null) {
/* 74 */       this.aa.close();
/* 75 */       this.aa = null;
/*    */     }
/*    */   }
/*    */ 
/*    */   void s(Component paramComponent)
/*    */   {
/* 20 */     this.ac = new AudioFormat(r * -1570391439, 16, d ? 2 : 1, true, false);
/* 21 */     this.am = new byte[256 << (d ? 2 : 1)];
/*    */   }
/*    */ 
/*    */   int ad()
/*    */   {
/* 54 */     return this.as * -1966636381 - (this.aa.available() >> (d ? 2 : 1));
/*    */   }
/*    */ 
/*    */   void av()
/*    */   {
/* 73 */     if (this.aa != null) {
/* 74 */       this.aa.close();
/* 75 */       this.aa = null;
/*    */     }
/*    */   }
/*    */ 
/*    */   void x(int paramInt)
/*    */     throws LineUnavailableException
/*    */   {
/*    */     try
/*    */     {
/* 26 */       DataLine.Info localInfo = new DataLine.Info(Class.forName("javax.sound.sampled.SourceDataLine"), this.ac, paramInt << (d ? 2 : 1));
/* 27 */       this.aa = ((SourceDataLine)AudioSystem.getLine(localInfo));
/* 28 */       this.aa.open();
/* 29 */       this.aa.start();
/* 30 */       this.as = (-271171317 * paramInt);
/*    */     }
/*    */     catch (LineUnavailableException localLineUnavailableException) {
/* 33 */       if (eg.d(paramInt, (byte)0) != 1)
/*    */       {
/* 35 */         int j = paramInt;
/*    */ 
/* 37 */         j--;
/* 38 */         j |= j >>> 1;
/* 39 */         j |= j >>> 2;
/* 40 */         j |= j >>> 4;
/* 41 */         j |= j >>> 8;
/* 42 */         j |= j >>> 16;
/* 43 */         int i = 1 + j;
/*    */ 
/* 45 */         u(i);
/* 46 */         return;
/*    */       }
/* 48 */       this.aa = null;
/* 49 */       throw localLineUnavailableException;
/*    */     }
/*    */   }
/*    */ 
/*    */   void aa()
/*    */   {
/* 59 */     int i = 256;
/* 60 */     if (d) i <<= 1;
/* 61 */     for (int j = 0; j < i; j++) {
/* 62 */       int k = this.j[j];
/* 63 */       if ((8388608 + k & 0xFF000000) != 0) {
/* 64 */         k = 0x7FFFFF ^ k >> 31;
/*    */       }
/* 66 */       this.am[(j * 2)] = ((byte)(k >> 8));
/* 67 */       this.am[(1 + 2 * j)] = ((byte)(k >> 16));
/*    */     }
/* 69 */     this.aa.write(this.am, 0, i << 1);
/*    */   }
/*    */ 
/*    */   void am() {
/* 73 */     if (this.aa != null) {
/* 74 */       this.aa.close();
/* 75 */       this.aa = null;
/*    */     }
/*    */   }
/*    */ 
/*    */   void h(int paramInt)
/*    */     throws LineUnavailableException
/*    */   {
/*    */     try
/*    */     {
/* 26 */       DataLine.Info localInfo = new DataLine.Info(Class.forName("javax.sound.sampled.SourceDataLine"), this.ac, paramInt << (d ? 2 : 1));
/* 27 */       this.aa = ((SourceDataLine)AudioSystem.getLine(localInfo));
/* 28 */       this.aa.open();
/* 29 */       this.aa.start();
/* 30 */       this.as = (-271171317 * paramInt);
/*    */     }
/*    */     catch (LineUnavailableException localLineUnavailableException) {
/* 33 */       if (eg.d(paramInt, (byte)0) != 1)
/*    */       {
/* 35 */         int j = paramInt;
/*    */ 
/* 37 */         j--;
/* 38 */         j |= j >>> 1;
/* 39 */         j |= j >>> 2;
/* 40 */         j |= j >>> 4;
/* 41 */         j |= j >>> 8;
/* 42 */         j |= j >>> 16;
/* 43 */         int i = 1 + j;
/*    */ 
/* 45 */         u(i);
/* 46 */         return;
/*    */       }
/* 48 */       this.aa = null;
/* 49 */       throw localLineUnavailableException;
/*    */     }
/*    */   }
/*    */ 
/*    */   void ap()
/*    */   {
/* 73 */     if (this.aa != null) {
/* 74 */       this.aa.close();
/* 75 */       this.aa = null;
/*    */     }
/*    */   }
/*    */ 
/*    */   void ak() {
/* 80 */     this.aa.flush(); } 
/* 80 */   void az() { this.aa.flush(); } 
/* 80 */   void an() { this.aa.flush(); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ds
 * JD-Core Version:    0.6.2
 */