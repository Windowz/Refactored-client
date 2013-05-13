/*      */ public final class es extends dg
/*      */ {
/*      */   int j;
/*      */   int c;
/*      */   int n;
/*   17 */   au[] w = new au[5];
/*      */   ai z;
/*      */   boolean t;
/*      */   at q;
/*      */   bh i;
/*      */   ar g;
/*      */   ax u;
/*      */   int m;
/*      */   int x;
/*      */   af s;
/*   19 */   int b = 0;
/*      */   int y;
/*      */   int v;
/*      */   boolean f;
/*      */   boolean k;
/*      */   int o;
/*   18 */   int[] e = new int[5];
/*      */   int h;
/*      */   int a;
/*      */   es p;
/*      */   static dq ba;
/*      */ 
/*      */   es(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   31 */     this.j = ((this.m = -2069782163 * paramInt1) * 1461403895);
/*   32 */     this.c = (paramInt2 * 2052300055);
/*   33 */     this.n = (paramInt3 * -1182546677);
/*      */   }
/*      */ 
/*      */   static final boolean gd(eg parameg, byte paramByte)
/*      */   {
/* 9432 */     int i1 = parameg.f * -93180615;
/* 9433 */     if (i1 == 205) { if (paramByte == 0);
/* 9434 */       client.dh = 493128970;
/* 9435 */       return true;
/*      */     }
/* 9437 */     int i2;
/*      */     int i3;
/* 9437 */     if ((i1 >= 300) && ((paramByte != 0) || (i1 <= 313))) { if (paramByte == 0);
/* 9438 */       i2 = (i1 - 300) / 2;
/* 9439 */       i3 = i1 & 0x1;
/* 9440 */       if (paramByte != 0) throw new IllegalStateException(); client.pd.d(i2, 1 == i3, 1477615106);
/*      */     }
/* 9442 */     if (i1 >= 314) { if (paramByte != 0) throw new IllegalStateException(); if (i1 <= 323) { if (paramByte != 0) throw new IllegalStateException();
/* 9443 */         i2 = (i1 - 314) / 2;
/* 9444 */         i3 = i1 & 0x1;
/* 9445 */         if (1 == i3) tmpTernaryOp = 1;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static int r(CharSequence paramCharSequence, int paramInt)
/*      */   {
/*    9 */     int i1 = paramCharSequence.length();
/*   10 */     int i2 = 0;
/*   11 */     for (int i3 = 0; i3 < i1; i3++) { if (paramInt == 152299600);
/*   12 */       int i4 = paramCharSequence.charAt(i3);
/*   13 */       if (i4 <= 127) { if (paramInt != 152299600) throw new IllegalStateException(); i2++;
/*   14 */       } else if (i4 <= 2047) { if (paramInt != 152299600) throw new IllegalStateException(); i2 += 2; } else {
/*   15 */         i2 += 3;
/*      */       } }
/*   17 */     return i2;
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     es
 * JD-Core Version:    0.6.2
 */