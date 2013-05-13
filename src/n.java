/*      */ import java.awt.Component;
/*      */ 
/*      */ public class n
/*      */ {
/*      */   static final int ak = 35;
/*      */   static final int d = 2;
/*      */   static final int l = 3;
/*      */   static final int s = 12;
/*      */   static final int ai = 50;
/*      */   static final int n = 6;
/*      */   static final int j = 7;
/*      */   static final int z = 8;
/*      */   static final int ae = 47;
/*      */   static final int q = 10;
/*      */   static final int i = 11;
/*      */   static final int t = 19;
/*      */   static final int u = 13;
/*      */   static final int aq = 45;
/*      */   static final int w = 15;
/*      */   static final int e = 16;
/*      */   static final int b = 17;
/*      */   static final int at = 46;
/*      */   static final int g = 9;
/*      */   static final int f = 20;
/*      */   static final int k = 21;
/*      */   static final int o = 22;
/*      */   static final int a = 23;
/*      */   static final int h = 24;
/*      */   static final int ad = 28;
/*      */   static final int p = 26;
/*      */   static final int ah = 38;
/*      */   static final int ac = 29;
/*      */   static final int aa = 30;
/*      */   static final int as = 31;
/*      */   static final int am = 32;
/*      */   static final int m = 4;
/*      */   static final int av = 34;
/*      */   static final int r = 1;
/*      */   static final int az = 36;
/*      */   static final int an = 37;
/*      */   static final int bs = 1003;
/*      */   static final int ay = 39;
/*      */   static final int al = 40;
/*      */   static final int v = 14;
/*      */   static final int ao = 42;
/*      */   static final int x = 25;
/*      */   static final int ar = 44;
/*      */   static final int ap = 33;
/*      */   static final int y = 18;
/*      */   static final int c = 5;
/*      */   static final int af = 58;
/*      */   static final int ax = 49;
/*      */   static final int ag = 43;
/*      */   static final int aj = 51;
/*      */   static final int aw = 57;
/*      */   static final int au = 48;
/*      */   static final int bh = 1001;
/*      */   static final int bi = 1002;
/*      */   static final int ab = 41;
/*      */   static final int bk = 1004;
/*      */   static final int bv = 1005;
/*      */   static final int bg = 1006;
/*      */   static final int bl = 1007;
/*      */   public static int cm;
/*      */ 
/*      */   n()
/*      */     throws Throwable
/*      */   {
/*  182 */     throw new Error();
/*      */   }
/*      */ 
/*      */   public static void r(Component paramComponent, int paramInt)
/*      */   {
/*  115 */     paramComponent.setFocusTraversalKeysEnabled(false);
/*  116 */     paramComponent.addKeyListener(az.r);
/*  117 */     paramComponent.addFocusListener(az.r);
/*      */   }
/*      */ 
/*      */   public static String g(String paramString, byte paramByte)
/*      */   {
/*  155 */     int i1 = paramString.length();
/*  156 */     char[] arrayOfChar = new char[i1];
/*  157 */     int i2 = 2;
/*  158 */     for (int i3 = 0; i3 < i1; i3++) { if (paramByte < 16);
/*  159 */       char c1 = paramString.charAt(i3);
/*  160 */       if (0 == i2) { if (paramByte >= 16) throw new IllegalStateException(); c1 = Character.toLowerCase(c1); } else {
/*  161 */         if (2 != i2) { if ((paramByte < 16) && (!Character.isUpperCase(c1))) break label109; if (paramByte >= 16); } c1 = y.l(c1, (byte)-116);
/*  162 */       }label109: if (Character.isLetter(c1)) { if (paramByte < 16);
/*  162 */         i2 = 0; } else {
/*  163 */         if ((c1 != '.') && ((paramByte >= 16) || ('?' != c1))) { if (paramByte >= 16) throw new IllegalStateException(); if ('!' != c1) break label196; if (paramByte >= 16) throw new IllegalStateException();  } i2 = 2; break label242;
/*  164 */         if (Character.isSpaceChar(c1)) { if ((paramByte >= 16) || 
/*  165 */             (2 != i2)) { if (paramByte >= 16) throw new IllegalStateException(); i2 = 1; }
/*      */         } else
/*  167 */           i2 = 1; 
/*      */       }
/*  168 */       label196: label242: arrayOfChar[i3] = c1;
/*      */     }
/*  170 */     return new String(arrayOfChar);
/*      */   }
/*      */ 
/*      */   static void z(int paramInt, byte paramByte)
/*      */   {
/*   56 */     dl localdl = (dl)dl.m.r(paramInt);
/*   57 */     if (localdl == null) { if (paramByte == 1) throw new IllegalStateException(); return; }
/*   58 */     localdl.r();
/*      */   }
/*      */ 
/*      */   static final boolean fa(eg parameg, int paramInt)
/*      */   {
/* 8707 */     if (parameg.dv == null) { if (paramInt != 1978182591);
/* 8707 */       return false; }
/* 8708 */     for (int i1 = 0; i1 < parameg.dv.length; i1++) { if (paramInt == 1978182591) throw new IllegalStateException();
/* 8709 */       int i2 = ba.fq(parameg, i1, (byte)0);
/* 8710 */       int i3 = parameg.ds[i1];
/* 8711 */       if (parameg.dv[i1] == 2) { if ((paramInt == 1978182591) || 
/* 8712 */           (i2 >= i3)) { if (paramInt != 1978182591);
/* 8712 */           return false; }
/*      */       }
/* 8714 */       else if (3 == parameg.dv[i1]) { if (paramInt == 1978182591) throw new IllegalStateException();
/* 8715 */         if (i2 <= i3) { if (paramInt != 1978182591);
/* 8715 */           return false; }
/*      */       }
/* 8717 */       else if (4 == parameg.dv[i1]) { if (paramInt == 1978182591) throw new IllegalStateException();
/* 8718 */         if (i2 == i3) { if (paramInt == 1978182591) throw new IllegalStateException(); return false; }
/*      */       }
/* 8720 */       else if (i2 != i3) { if (paramInt != 1978182591);
/* 8720 */         return false; }
/*      */     }
/* 8722 */     return true;
/*      */   }
/*      */ 
/*      */   static final void fo(int paramInt1, int paramInt2)
/*      */   {
/* 9221 */     if (!dw.z(paramInt1, -1222514233)) { if (paramInt2 != 836448885);
/* 9221 */       return; }
/* 9222 */     eg[] arrayOfeg = av.m[paramInt1];
/* 9223 */     for (int i1 = 0; i1 < arrayOfeg.length; i1++) { if (paramInt2 == 836448885) return;
/* 9224 */       eg localeg = arrayOfeg[i1];
/* 9225 */       if (localeg == null) { if (paramInt2 == 836448885); } else {
/* 9226 */         localeg.dr = 0;
/* 9227 */         localeg.du = 0;
/*      */       }
/*      */     }
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     n
 * JD-Core Version:    0.6.2
 */