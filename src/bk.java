/*      */ import java.util.HashMap;
/*      */ 
/*      */ public class bk
/*      */ {
/*      */   static int ji;
/*      */ 
/*      */   static
/*      */   {
/*    8 */     new HashMap();
/*      */   }
/*      */ 
/*      */   bk() throws Throwable {
/*   12 */     throw new Error();
/*      */   }
/*      */ 
/*      */   public static boolean d(char paramChar, int paramInt)
/*      */   {
/*   45 */     if (paramChar > 0) { if ((paramInt < -1195543665) && (paramChar < '')) break label71; if (paramInt >= -1195543665); } if (paramChar >= ' ') { if (paramInt >= -1195543665) throw new IllegalStateException(); if (paramChar <= 'ÿ') { if (paramInt >= -1195543665) throw new IllegalStateException(); label71: return true; } }
/*   46 */     if ('\000' != paramChar) { if (paramInt < -1195543665);
/*   48 */       char[] arrayOfChar = ca.r;
/*   49 */       for (int i = 0; i < arrayOfChar.length; i++) { if (paramInt >= -1195543665) throw new IllegalStateException();
/*   50 */         char c = arrayOfChar[i];
/*      */ 
/*   52 */         if (c == paramChar) { if (paramInt >= -1195543665) throw new IllegalStateException(); return true;
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*   57 */     return false;
/*      */   }
/*      */ 
/*      */   public static String d(long paramLong)
/*      */   {
/*   26 */     if ((paramLong <= 0L) || (paramLong >= 6582952005840035281L)) return null;
/*   27 */     if (0L == paramLong % 37L) return null;
/*   28 */     int i = 0;
/*   29 */     long l1 = paramLong;
/*   30 */     while (0L != l1) {
/*   31 */       i++;
/*   32 */       l1 /= 37L;
/*      */     }
/*   34 */     StringBuilder localStringBuilder = new StringBuilder(i);
/*   35 */     while (paramLong != 0L) {
/*   36 */       long l2 = paramLong;
/*   37 */       paramLong /= 37L;
/*   38 */       localStringBuilder.append(cj.r[((int)(l2 - paramLong * 37L))]);
/*      */     }
/*   40 */     return localStringBuilder.reverse().toString();
/*      */   }
/*      */ 
/*      */   static final void ep(byte paramByte)
/*      */   {
/* 6431 */     int i = af.dr.bp(ba.ew);
/* 6432 */     for (int j = 0; j < client.jp * 1875006849; j++) { if (paramByte == 32) throw new IllegalStateException();
/* 6433 */       k = af.dr.bp(cq.fb(j, (short)-26108));
/* 6434 */       if (k > i) { if (paramByte == 32) return; i = k; }
/*      */     }
/* 6436 */     i += 8;
/* 6437 */     j = 21 + client.jp * -1939668337;
/* 6438 */     int k = 429599329 * an.v - i / 2;
/* 6439 */     if (i + k > 765) { if (paramByte == 32) throw new IllegalStateException(); k = 765 - i; }
/* 6440 */     if (k < 0) { if (paramByte == 32) return; k = 0; }
/* 6441 */     int m = -374516205 * an.w;
/* 6442 */     if (m + j > 503) { if (paramByte != 32);
/* 6442 */       m = 503 - j; }
/* 6443 */     if (m < 0) { if (paramByte != 32);
/* 6443 */       m = 0; }
/* 6444 */     client.jj = true;
/* 6445 */     ca.jf = 376411641 * k;
/* 6446 */     ji = -1541536121 * m;
/* 6447 */     al.jt = i * 172861179;
/* 6448 */     m.jd = -1708243142 + client.jp * 1317649657;
/*      */   }
/*      */ 
/*      */   static final void v(byte paramByte)
/*      */   {
/*  276 */     bc.i.r(1131286551);
/*  277 */     for (int i = 0; i < 32; i++) { if (paramByte <= 8) return; dj.u[i] = 0L; }
/*  278 */     for (i = 0; i < 32; i++) { if (paramByte > 8);
/*  278 */       dj.w[i] = 0L; }
/*  279 */     dj.j = 0;
/*      */   }
/*      */ 
/*      */   static void r(int paramInt)
/*      */   {
/*   47 */     l.m = (byte[][][])null;
/*   48 */     l.c = (byte[][][])null;
/*   49 */     l.n = (byte[][][])null;
/*   50 */     l.j = (byte[][][])null;
/*   51 */     bp.w = (int[][][])null;
/*   52 */     l.z = (byte[][][])null;
/*   53 */     ag.g = (int[][])null;
/*   54 */     ax.q = null;
/*   55 */     da.i = null;
/*   56 */     l.s = null;
/*   57 */     dm.u = null;
/*   58 */     l.v = null;
/*      */   }
/*      */ 
/*      */   static final boolean y(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  975 */     ey localey = fj.g(paramInt1, (byte)100);
/*  976 */     if (paramInt2 == 11) { if (paramInt3 == -329330923);
/*  976 */       paramInt2 = 10; }
/*  977 */     if ((paramInt2 >= 5) && ((paramInt3 != -329330923) || (paramInt2 <= 8))) { if (paramInt3 == -329330923);
/*  977 */       paramInt2 = 4; }
/*  978 */     return localey.u(paramInt2, 2124293179);
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     bk
 * JD-Core Version:    0.6.2
 */