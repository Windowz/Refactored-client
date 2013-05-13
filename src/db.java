/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ public class db extends bw
/*    */ {
/*    */   ByteBuffer d;
/*    */ 
/*    */   byte[] s()
/*    */   {
/* 12 */     byte[] arrayOfByte = new byte[this.d.capacity()];
/* 13 */     this.d.position(0);
/* 14 */     this.d.get(arrayOfByte);
/* 15 */     return arrayOfByte;
/*    */   }
/*    */ 
/*    */   byte[] l(int paramInt)
/*    */   {
/* 12 */     byte[] arrayOfByte = new byte[this.d.capacity()];
/* 13 */     this.d.position(0);
/* 14 */     this.d.get(arrayOfByte);
/* 15 */     return arrayOfByte;
/*    */   }
/*    */ 
/*    */   void m(byte[] paramArrayOfByte, int paramInt) {
/* 19 */     this.d = ByteBuffer.allocateDirect(paramArrayOfByte.length);
/* 20 */     this.d.position(0);
/* 21 */     this.d.put(paramArrayOfByte);
/*    */   }
/*    */ 
/*    */   byte[] u()
/*    */   {
/* 12 */     byte[] arrayOfByte = new byte[this.d.capacity()];
/* 13 */     this.d.position(0);
/* 14 */     this.d.get(arrayOfByte);
/* 15 */     return arrayOfByte;
/*    */   }
/*    */ 
/*    */   byte[] v()
/*    */   {
/* 12 */     byte[] arrayOfByte = new byte[this.d.capacity()];
/* 13 */     this.d.position(0);
/* 14 */     this.d.get(arrayOfByte);
/* 15 */     return arrayOfByte;
/*    */   }
/*    */ 
/*    */   void w(byte[] paramArrayOfByte) {
/* 19 */     this.d = ByteBuffer.allocateDirect(paramArrayOfByte.length);
/* 20 */     this.d.position(0);
/* 21 */     this.d.put(paramArrayOfByte);
/*    */   }
/*    */ 
/*    */   void e(byte[] paramArrayOfByte)
/*    */   {
/* 19 */     this.d = ByteBuffer.allocateDirect(paramArrayOfByte.length);
/* 20 */     this.d.position(0);
/* 21 */     this.d.put(paramArrayOfByte);
/*    */   }
/*    */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     db
 * JD-Core Version:    0.6.2
 */