/*    */ import java.io.File;
/*    */ 
/*    */ public class j
/*    */   implements Runnable
/*    */ {
/*  7 */   boolean r = true;
/*    */ 
/* 11 */   int[] c = new int[500];
/*    */ 
/*  9 */   int l = 0;
/* 10 */   int[] m = new int[500];
/*    */ 
/*  8 */   Object d = new Object();
/*    */   static ch j;
/*    */ 
/*    */   public void run()
/*    */   {
/* 16 */     while (this.r) {
/* 17 */       synchronized (this.d) {
/* 18 */         if (-641480657 * this.l < 500) {
/* 19 */           this.m[(-641480657 * this.l)] = (an.j * 2005217983);
/* 20 */           this.c[(-641480657 * this.l)] = (an.z * 1688333977);
/* 21 */           this.l += -1611235633;
/*    */         }
/*    */       }
/* 24 */       cl.r(50L);
/*    */     }
/*    */   }
/*    */ 
/*    */   public void l()
/*    */   {
/* 16 */     while (this.r) {
/* 17 */       synchronized (this.d) {
/* 18 */         if (-641480657 * this.l < 500) {
/* 19 */           this.m[(-641480657 * this.l)] = (an.j * 2005217983);
/* 20 */           this.c[(-641480657 * this.l)] = (an.z * 1688333977);
/* 21 */           this.l += -1611235633;
/*    */         }
/*    */       }
/* 24 */       cl.r(50L);
/*    */     }
/*    */   }
/*    */ 
/*    */   public void d()
/*    */   {
/* 16 */     while (this.r) {
/* 17 */       synchronized (this.d) {
/* 18 */         if (-641480657 * this.l < 500) {
/* 19 */           this.m[(-641480657 * this.l)] = (an.j * 2005217983);
/* 20 */           this.c[(-641480657 * this.l)] = (an.z * 1688333977);
/* 21 */           this.l += -1611235633;
/*    */         }
/*    */       }
/* 24 */       cl.r(50L);
/*    */     }
/*    */   }
/*    */ 
/*    */   public void r()
/*    */   {
/* 16 */     while (this.r) {
/* 17 */       synchronized (this.d) {
/* 18 */         if (-641480657 * this.l < 500) {
/* 19 */           this.m[(-641480657 * this.l)] = (an.j * 2005217983);
/* 20 */           this.c[(-641480657 * this.l)] = (an.z * 1688333977);
/* 21 */           this.l += -1611235633;
/*    */         }
/*    */       }
/* 24 */       cl.r(50L);
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void r(File paramFile, int paramInt)
/*    */   {
/* 16 */     av.d = paramFile;
/* 17 */     if (!av.d.exists()) { if (paramInt <= -998336907) throw new IllegalStateException(); throw new RuntimeException(""); }
/* 18 */     av.r = true;
/*    */   }
/*    */ 
/*    */   public static boolean l(CharSequence paramCharSequence, int paramInt)
/*    */   {
/* 41 */     int i = 0;
/* 42 */     boolean bool2 = false;
/* 43 */     int k = 0;
/* 44 */     int n = paramCharSequence.length();
/* 45 */     for (int i1 = 0; i1 < n; i1++) { if (paramInt > -1189733557);
/* 46 */       int i2 = paramCharSequence.charAt(i1);
/* 47 */       if (0 == i1) { if (paramInt <= -1189733557) throw new IllegalStateException();
/* 48 */         if (45 == i2) { if (paramInt <= -1189733557) throw new IllegalStateException();
/* 49 */           i = 1;
/* 50 */           continue;
/*    */         }
/* 52 */         if (i2 == 43) { if (paramInt > -1189733557);
/* 52 */           continue; }
/*    */       }
/* 54 */       if ((i2 >= 48) && ((paramInt <= -1189733557) || (i2 <= 57))) { if (paramInt <= -1189733557) throw new IllegalStateException(); i2 -= 48;
/* 55 */       } else if ((i2 >= 65) && ((paramInt <= -1189733557) || (i2 <= 90))) { if (paramInt > -1189733557);
/* 55 */         i2 -= 55; } else {
/* 56 */         if (i2 >= 97) { if (paramInt <= -1189733557) throw new IllegalStateException(); if (i2 <= 122) { if (paramInt > -1189733557);
/* 56 */             i2 -= 87; break label239; }
/*    */         }
/* 58 */         bool1 = false;
/* 59 */         break label338;
/*    */       }
/* 61 */       label239: if (i2 >= 10) { if (paramInt <= -1189733557) throw new IllegalStateException();
/* 62 */         bool1 = false;
/* 63 */         break label338;
/*    */       }
/* 65 */       if (i != 0) { if (paramInt > -1189733557);
/* 65 */         i2 = -i2; }
/* 66 */       int i3 = 10 * k + i2;
/* 67 */       if (k != i3 / 10) { if (paramInt <= -1189733557) throw new IllegalStateException();
/* 68 */         bool1 = false;
/* 69 */         break label338;
/*    */       }
/* 71 */       k = i3;
/* 72 */       bool2 = true;
/*    */     }
/* 74 */     boolean bool1 = bool2;
/*    */ 
/* 76 */     label338: return bool1;
/*    */   }
/*    */ 
/*    */   static String r(int paramInt, short paramShort)
/*    */   {
/* 18 */     return "<img=" + paramInt + ">";
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     j
 * JD-Core Version:    0.6.2
 */