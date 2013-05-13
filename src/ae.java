/*    */ public class ae
/*    */ {
/* 18 */   boolean i = false;
/*    */ 
/*  9 */   static int[] d = new int[500];
/* 10 */   static int[] l = new int[500];
/*    */ 
/*  8 */   static int[] r = new int[500];
/*    */ 
/* 12 */   ez c = null;
/* 13 */   int n = -1;
/*    */   int[] j;
/*    */   int[] z;
/*    */   int[] g;
/*    */   int[] q;
/* 11 */   static int[] m = new int[500];
/*    */ 
/*    */   ae(byte[] paramArrayOfByte, ez paramez)
/*    */   {
/* 21 */     this.c = paramez;
/* 22 */     ev localev1 = new ev(paramArrayOfByte);
/* 23 */     ev localev2 = new ev(paramArrayOfByte);
/* 24 */     localev1.c = -1882792722;
/* 25 */     int k = localev1.t(1118814123);
/* 26 */     int i1 = -1;
/* 27 */     int i2 = 0;
/* 28 */     localev2.c = ((localev1.c * -196293817 + k) * -941396361);
/* 29 */     for (int i3 = 0; i3 < k; i3++) {
/* 30 */       int i4 = localev1.t(1118814123);
/* 31 */       if (i4 > 0) {
/* 32 */         if (this.c.n[i3] != 0) {
/* 33 */           for (i5 = i3 - 1; i5 > i1; i5--) {
/* 34 */             if (this.c.n[i5] == 0) {
/* 35 */               r[i2] = i5;
/* 36 */               d[i2] = 0;
/* 37 */               l[i2] = 0;
/* 38 */               m[i2] = 0;
/* 39 */               i2++;
/* 40 */               break;
/*    */             }
/*    */           }
/*    */         }
/* 44 */         r[i2] = i3;
/* 45 */         int i5 = 0;
/* 46 */         if (this.c.n[i3] == 3) i5 = 128;
/* 47 */         if ((i4 & 0x1) != 0) d[i2] = localev2.am(-1121534081); else
/* 48 */           d[i2] = i5;
/* 49 */         if ((i4 & 0x2) != 0) l[i2] = localev2.am(-822099018); else
/* 50 */           l[i2] = i5;
/* 51 */         if ((i4 & 0x4) != 0) m[i2] = localev2.am(-826088771); else
/* 52 */           m[i2] = i5;
/* 53 */         i1 = i3;
/* 54 */         i2++;
/* 55 */         if (this.c.n[i3] == 5) this.i = true;
/*    */       }
/*    */     }
/* 58 */     if (localev2.c * -196293817 != paramArrayOfByte.length) {
/* 59 */       throw new RuntimeException();
/*    */     }
/* 61 */     this.n = i2;
/* 62 */     this.j = new int[i2];
/* 63 */     this.z = new int[i2];
/* 64 */     this.g = new int[i2];
/* 65 */     this.q = new int[i2];
/* 66 */     for (i3 = 0; i3 < i2; i3++) {
/* 67 */       this.j[i3] = r[i3];
/* 68 */       this.z[i3] = d[i3];
/* 69 */       this.g[i3] = l[i3];
/* 70 */       this.q[i3] = m[i3];
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     ae
 * JD-Core Version:    0.6.2
 */