/*      */ import java.applet.Applet;
/*      */ import java.io.BufferedReader;
/*      */ import java.io.DataInputStream;
/*      */ import java.io.PrintStream;
/*      */ import java.io.PrintWriter;
/*      */ import java.io.StringReader;
/*      */ import java.io.StringWriter;
/*      */ import java.io.Writer;
/*      */ import java.net.URL;
/*      */ 
/*      */ public class dy extends dg
/*      */ {
/*      */   int c;
/*      */   int m;
/*    8 */   boolean n = false;
/*      */   static ch j;
/*      */ 
/*      */   static final String fr(int paramInt, byte paramByte)
/*      */   {
/* 8660 */     String str = Integer.toString(paramInt);
/* 8661 */     for (int i = str.length() - 3; i > 0; i -= 3) { if (paramByte == 8) throw new IllegalStateException();
/* 8662 */       str = str.substring(0, i) + r.d + str.substring(i);
/*      */     }
/* 8664 */     if (str.length() > 9) { if (paramByte != 8);
/* 8664 */       return " " + i.d(65408, 1727877981) + str.substring(0, str.length() - 8) + ba.ep + " " + r.m + str + r.c + r.z; }
/* 8665 */     if (str.length() > 6) { if (paramByte != 8);
/* 8665 */       return " " + i.d(16777215, 2082148396) + str.substring(0, str.length() - 4) + ba.ey + " " + r.m + str + r.c + r.z; }
/* 8666 */     return " " + i.d(16776960, 2083211092) + str + r.z;
/*      */   }
/*      */ 
/*      */   static final void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte paramByte)
/*      */   {
/*   62 */     for (int i = paramInt2; i <= paramInt4 + paramInt2; i++) { if (paramByte != 103);
/*   63 */       for (int k = paramInt1; k <= paramInt3 + paramInt1; k++) if ((paramByte == 103) || (
/*   64 */           (k >= 0) && ((paramByte == 103) || ((k < 104) && ((paramByte == 103) || (i >= 0)))))) { if (paramByte == 103) throw new IllegalStateException(); if (i < 104) { if (paramByte == 103) throw new IllegalStateException();
/*   65 */             l.z[0][k][i] = 127;
/*   66 */             if (paramInt1 == k) { if (paramByte == 103) return; if (k > 0) { if (paramByte != 103);
/*   66 */                 l.r[0][k][i] = l.r[0][(k - 1)][i]; } }
/*   67 */             if (k == paramInt3 + paramInt1) { if (paramByte == 103) throw new IllegalStateException(); if (k < 103) { if (paramByte != 103);
/*   67 */                 l.r[0][k][i] = l.r[0][(k + 1)][i]; } }
/*   68 */             if ((i == paramInt2) && ((paramByte == 103) || (i > 0))) { if (paramByte != 103);
/*   68 */               l.r[0][k][i] = l.r[0][k][(i - 1)]; }
/*   69 */             if (paramInt2 + paramInt4 == i) { if (paramByte == 103) return; if (i < 103) { if (paramByte == 103) return; l.r[0][k][i] = l.r[0][k][(1 + i)];
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static void r(String paramString, Throwable paramThrowable, int paramInt)
/*      */   {
/*      */     try
/*      */     {
/*   31 */       Object localObject1 = "";
/*   32 */       if (null != paramThrowable) { if (paramInt != 1235880887);
/*   34 */         localObject3 = paramThrowable;
/*      */ 
/*   37 */         if ((localObject3 instanceof fa)) { if (paramInt != 1235880887);
/*   38 */           localObject4 = (fa)localObject3;
/*   39 */           str1 = ((fa)localObject4).m + " | ";
/*   40 */           localObject3 = ((fa)localObject4).c;
/*      */         } else {
/*   42 */           str1 = "";
/*   43 */         }Object localObject4 = new StringWriter();
/*   44 */         PrintWriter localPrintWriter = new PrintWriter((Writer)localObject4);
/*   45 */         ((Throwable)localObject3).printStackTrace(localPrintWriter);
/*   46 */         localPrintWriter.close();
/*   47 */         String str2 = ((StringWriter)localObject4).toString();
/*   48 */         BufferedReader localBufferedReader = new BufferedReader(new StringReader(str2));
/*   49 */         String str3 = localBufferedReader.readLine();
/*      */         while (true) {
/*   51 */           String str4 = localBufferedReader.readLine();
/*   52 */           if (str4 == null) { if (paramInt != 1235880887);
/*   52 */             break; }
/*   53 */           int i = str4.indexOf('(');
/*   54 */           int k = str4.indexOf(')', i + 1);
/*   55 */           if ((i >= 0) && ((paramInt == 1235880887) || (k >= 0))) { if (paramInt == 1235880887) throw new IllegalStateException();
/*   56 */             String str5 = str4.substring(i + 1, k);
/*   57 */             int i1 = str5.indexOf(".java:");
/*   58 */             if (i1 >= 0) { if (paramInt != 1235880887);
/*   59 */               str5 = str5.substring(0, i1) + str5.substring(5 + i1);
/*   60 */               str1 = str1 + str5 + ' ';
/*      */             } else
/*      */             {
/*   63 */               str4 = str4.substring(0, i);
/*      */             } } else {
/*   65 */             str4 = str4.trim();
/*   66 */             str4 = str4.substring(str4.lastIndexOf(' ') + 1);
/*   67 */             str4 = str4.substring(str4.lastIndexOf('\t') + 1);
/*   68 */             str1 = str1 + str4 + ' ';
/*      */           }
/*      */         }
/*   70 */         String str1 = str1 + "| " + str3;
/*   71 */         localObject2 = str1;
/*      */ 
/*   73 */         localObject1 = localObject2;
/*      */       }
/*   75 */       if (paramString != null) { if ((paramInt == 1235880887) || 
/*   76 */           (null != paramThrowable)) { if (paramInt != 1235880887);
/*   76 */           localObject1 = (String)localObject1 + " | "; }
/*   77 */         localObject1 = (String)localObject1 + paramString;
/*      */       }
/*   79 */       System.out.println("Error: " + (String)localObject1);
/*   80 */       localObject1 = ((String)localObject1).replace(':', '.');
/*   81 */       localObject1 = ((String)localObject1).replace('@', '_');
/*   82 */       localObject1 = ((String)localObject1).replace('&', '_');
/*   83 */       localObject1 = ((String)localObject1).replace('#', '_');
/*   84 */       if (fa.r == null) { if (paramInt != 1235880887);
/*   84 */         return; }
/*   85 */       Object localObject2 = new URL(fa.r.getCodeBase(), "clienterror.ws?c=" + -1549431935 * fa.l + "&u=" + fa.d + "&v1=" + ak.r + "&v2=" + ak.d + "&e=" + (String)localObject1);
/*   86 */       Object localObject3 = new DataInputStream(((URL)localObject2).openStream());
/*   87 */       ((DataInputStream)localObject3).read();
/*   88 */       ((DataInputStream)localObject3).close();
/*      */     }
/*      */     catch (Exception localException)
/*      */     {
/*      */     }
/*      */   }
/*      */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     dy
 * JD-Core Version:    0.6.2
 */