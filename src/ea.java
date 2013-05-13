/*    */ public final class ea extends ev
/*    */ {
/*    */   int i;
/*  5 */   static final int[] q = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };
/*    */   bl g;
/*    */ 
/*    */   public void hr()
/*    */   {
/* 25 */     this.i = (-2063903976 * this.c);
/*    */   }
/*    */ 
/*    */   public void hf()
/*    */   {
/* 44 */     this.c = ((7 + this.i * 2049908429) / 8 * -941396361);
/*    */   }
/*    */ 
/*    */   public void gt(int paramInt1, int paramInt2)
/*    */   {
/*    */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt1 + this.g.r(2011017408)));
/*    */   }
/*    */ 
/*    */   public ea(int paramInt)
/*    */   {
/*  9 */     super(paramInt);
/*    */   }
/*    */ 
/*    */   public void gy(short paramShort)
/*    */   {
/* 25 */     this.i = (-2063903976 * this.c);
/*    */   }
/*    */ 
/*    */   public int gu(int paramInt1, int paramInt2) {
/* 29 */     int j = 2049908429 * this.i >> 3;
/* 30 */     int k = 8 - (this.i * 2049908429 & 0x7);
/* 31 */     int m = 0;
/* 32 */     this.i += 1150942725 * paramInt1;
/* 33 */     while (paramInt1 > k) { if (paramInt2 <= 16777215) throw new IllegalStateException();
/* 34 */       m += ((this.m[(j++)] & q[k]) << paramInt1 - k);
/* 35 */       paramInt1 -= k;
/* 36 */       k = 8;
/*    */     }
/* 38 */     if (paramInt1 == k) { if (paramInt2 > 16777215);
/* 38 */       m += (this.m[j] & q[k]); } else {
/* 39 */       m += (this.m[j] >> k - paramInt1 & q[paramInt1]);
/* 40 */     }return m;
/*    */   }
/*    */ 
/*    */   public void gc(int paramInt)
/*    */   {
/*    */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt + this.g.r(2138435454)));
/*    */   }
/*    */ 
/*    */   public int gs(int paramInt1, int paramInt2)
/*    */   {
/* 48 */     return 8 * paramInt1 - 2049908429 * this.i;
/*    */   }
/*    */ 
/*    */   public void gv(int[] paramArrayOfInt, int paramInt)
/*    */   {
/* 13 */     this.g = new bl(paramArrayOfInt); } 
/* 13 */   public void ga(int[] paramArrayOfInt) { this.g = new bl(paramArrayOfInt); } 
/* 13 */   public void go(int[] paramArrayOfInt) { this.g = new bl(paramArrayOfInt); }
/*    */ 
/*    */ 
/*    */   public int he()
/*    */   {
/* 21 */     return this.m[((this.c += -941396361) * -196293817 - 1)] - this.g.r(2006762084) & 0xFF;
/*    */   }
/*    */ 
/*    */   public void hb(int paramInt)
/*    */   {
/*    */     int tmp12_11 = (this.c + -941396361); this.c = tmp12_11; this.m[(tmp12_11 * -196293817 - 1)] = ((byte)(paramInt + this.g.r(2082385820)));
/*    */   }
/*    */ 
/*    */   public int hw() {
/* 21 */     return this.m[((this.c += -941396361) * -196293817 - 1)] - this.g.r(2092308143) & 0xFF; } 
/* 21 */   public int hv() { return this.m[((this.c += -941396361) * -196293817 - 1)] - this.g.r(1923819838) & 0xFF; }
/*    */ 
/*    */ 
/*    */   public int hj(int paramInt)
/*    */   {
/* 29 */     int j = 2049908429 * this.i >> 3;
/* 30 */     int k = 8 - (this.i * 2049908429 & 0x7);
/* 31 */     int m = 0;
/* 32 */     this.i += 1150942725 * paramInt;
/* 33 */     while (paramInt > k) {
/* 34 */       m += ((this.m[(j++)] & q[k]) << paramInt - k);
/* 35 */       paramInt -= k;
/* 36 */       k = 8;
/*    */     }
/* 38 */     if (paramInt == k) m += (this.m[j] & q[k]); else
/* 39 */       m += (this.m[j] >> k - paramInt & q[paramInt]);
/* 40 */     return m;
/*    */   }
/*    */ 
/*    */   public int hk()
/*    */   {
/* 21 */     return this.m[((this.c += -941396361) * -196293817 - 1)] - this.g.r(2032579731) & 0xFF; } 
/* 21 */   public int gg(byte paramByte) { return this.m[((this.c += -941396361) * -196293817 - 1)] - this.g.r(2121137175) & 0xFF; }
/*    */ 
/*    */   public void hm()
/*    */   {
/* 25 */     this.i = (-2063903976 * this.c); } 
/* 25 */   public void hu() { this.i = (-2063903976 * this.c); } 
/* 25 */   public void hl() { this.i = (-2063903976 * this.c); }
/*    */ 
/*    */ 
/*    */   public void gb(int paramInt)
/*    */   {
/* 44 */     this.c = ((7 + this.i * 2049908429) / 8 * -941396361);
/*    */   }
/*    */ 
/*    */   public int hn(int paramInt)
/*    */   {
/* 29 */     int j = 2049908429 * this.i >> 3;
/* 30 */     int k = 8 - (this.i * 2049908429 & 0x7);
/* 31 */     int m = 0;
/* 32 */     this.i += 1150942725 * paramInt;
/* 33 */     while (paramInt > k) {
/* 34 */       m += ((this.m[(j++)] & q[k]) << paramInt - k);
/* 35 */       paramInt -= k;
/* 36 */       k = 8;
/*    */     }
/* 38 */     if (paramInt == k) m += (this.m[j] & q[k]); else
/* 39 */       m += (this.m[j] >> k - paramInt & q[paramInt]);
/* 40 */     return m;
/*    */   }
/*    */ 
/*    */   public int hs(int paramInt)
/*    */   {
/* 29 */     int j = 2049908429 * this.i >> 3;
/* 30 */     int k = 8 - (this.i * 2049908429 & 0x7);
/* 31 */     int m = 0;
/* 32 */     this.i += 1150942725 * paramInt;
/* 33 */     while (paramInt > k) {
/* 34 */       m += ((this.m[(j++)] & q[k]) << paramInt - k);
/* 35 */       paramInt -= k;
/* 36 */       k = 8;
/*    */     }
/* 38 */     if (paramInt == k) m += (this.m[j] & q[k]); else
/* 39 */       m += (this.m[j] >> k - paramInt & q[paramInt]);
/* 40 */     return m;
/*    */   }
/*    */ 
/*    */   public void gi(int[] paramArrayOfInt)
/*    */   {
/* 13 */     this.g = new bl(paramArrayOfInt);
/*    */   }
/*    */ 
/*    */   public static int q(String paramString, int paramInt)
/*    */   {
/* 72 */     return paramString.length() + 1;
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ea
 * JD-Core Version:    0.6.2
 */