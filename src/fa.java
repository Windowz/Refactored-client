/*     */ import java.applet.Applet;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.StringReader;
/*     */ import java.io.StringWriter;
/*     */ import java.io.Writer;
/*     */ import java.net.URL;
/*     */ 
/*     */ public class fa extends RuntimeException
/*     */ {
/*     */   String m;
/*     */   static Applet r;
/*     */   static int l;
/*     */   public static String d;
/*     */   Throwable c;
/*     */ 
/*     */   public static fa c(Throwable paramThrowable, String paramString)
/*     */   {
/*     */     fa localfa;
/*  97 */     if ((paramThrowable instanceof fa)) {
/*  98 */       localfa = (fa)paramThrowable;
/*     */       fa tmp20_19 = localfa; tmp20_19.m = (tmp20_19.m + ' ' + paramString);
/*     */     } else {
/* 101 */       localfa = new fa(paramThrowable, paramString);
/* 102 */     }return localfa;
/*     */   }
/*     */ 
/*     */   public static void l(String paramString, Throwable paramThrowable)
/*     */   {
/*     */     try
/*     */     {
/*  31 */       Object localObject1 = "";
/*  32 */       if (null != paramThrowable)
/*     */       {
/*  34 */         localObject3 = paramThrowable;
/*     */ 
/*  37 */         if ((localObject3 instanceof fa)) {
/*  38 */           localObject4 = (fa)localObject3;
/*  39 */           str1 = ((fa)localObject4).m + " | ";
/*  40 */           localObject3 = ((fa)localObject4).c;
/*     */         } else {
/*  42 */           str1 = "";
/*  43 */         }Object localObject4 = new StringWriter();
/*  44 */         PrintWriter localPrintWriter = new PrintWriter((Writer)localObject4);
/*  45 */         ((Throwable)localObject3).printStackTrace(localPrintWriter);
/*  46 */         localPrintWriter.close();
/*  47 */         String str2 = ((StringWriter)localObject4).toString();
/*  48 */         BufferedReader localBufferedReader = new BufferedReader(new StringReader(str2));
/*  49 */         String str3 = localBufferedReader.readLine();
/*     */         while (true) {
/*  51 */           String str4 = localBufferedReader.readLine();
/*  52 */           if (str4 == null) break;
/*  53 */           int i = str4.indexOf('(');
/*  54 */           int j = str4.indexOf(')', i + 1);
/*  55 */           if ((i >= 0) && (j >= 0)) {
/*  56 */             String str5 = str4.substring(i + 1, j);
/*  57 */             int k = str5.indexOf(".java:");
/*  58 */             if (k >= 0) {
/*  59 */               str5 = str5.substring(0, k) + str5.substring(5 + k);
/*  60 */               str1 = str1 + str5 + ' ';
/*     */             }
/*     */             else {
/*  63 */               str4 = str4.substring(0, i);
/*     */             }
/*     */           } else { str4 = str4.trim();
/*  66 */             str4 = str4.substring(str4.lastIndexOf(' ') + 1);
/*  67 */             str4 = str4.substring(str4.lastIndexOf('\t') + 1);
/*  68 */             str1 = str1 + str4 + ' '; }
/*     */         }
/*  70 */         String str1 = str1 + "| " + str3;
/*  71 */         localObject2 = str1;
/*     */ 
/*  73 */         localObject1 = localObject2;
/*     */       }
/*  75 */       if (paramString != null) {
/*  76 */         if (null != paramThrowable) localObject1 = (String)localObject1 + " | ";
/*  77 */         localObject1 = (String)localObject1 + paramString;
/*     */       }
/*  79 */       System.out.println("Error: " + (String)localObject1);
/*  80 */       localObject1 = ((String)localObject1).replace(':', '.');
/*  81 */       localObject1 = ((String)localObject1).replace('@', '_');
/*  82 */       localObject1 = ((String)localObject1).replace('&', '_');
/*  83 */       localObject1 = ((String)localObject1).replace('#', '_');
/*  84 */       if (r == null) return;
/*  85 */       Object localObject2 = new URL(r.getCodeBase(), "clienterror.ws?c=" + -1549431935 * l + "&u=" + d + "&v1=" + ak.r + "&v2=" + ak.d + "&e=" + (String)localObject1);
/*  86 */       Object localObject3 = new DataInputStream(((URL)localObject2).openStream());
/*  87 */       ((DataInputStream)localObject3).read();
/*  88 */       ((DataInputStream)localObject3).close();
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/*     */     }
/*     */   }
/*     */ 
/*     */   public static fa m(Throwable paramThrowable, String paramString)
/*     */   {
/*     */     fa localfa;
/*  97 */     if ((paramThrowable instanceof fa)) {
/*  98 */       localfa = (fa)paramThrowable;
/*     */       fa tmp20_19 = localfa; tmp20_19.m = (tmp20_19.m + ' ' + paramString);
/*     */     } else {
/* 101 */       localfa = new fa(paramThrowable, paramString);
/* 102 */     }return localfa;
/*     */   }
/*     */ 
/*     */   fa(Throwable paramThrowable, String paramString)
/*     */   {
/*  25 */     this.m = paramString;
/*  26 */     this.c = paramThrowable;
/*     */   }
/*     */ 
/*     */   public static fa n(Throwable paramThrowable, String paramString)
/*     */   {
/*     */     fa localfa;
/*  97 */     if ((paramThrowable instanceof fa)) {
/*  98 */       localfa = (fa)paramThrowable;
/*     */       fa tmp20_19 = localfa; tmp20_19.m = (tmp20_19.m + ' ' + paramString);
/*     */     } else {
/* 101 */       localfa = new fa(paramThrowable, paramString);
/* 102 */     }return localfa;
/*     */   }
/*     */ }

/* Location:           C:\Users\Mike\IdeaProjects\RealityBot-2007 Updater\client-deob.jar
 * Qualified Name:     fa
 * JD-Core Version:    0.6.2
 */