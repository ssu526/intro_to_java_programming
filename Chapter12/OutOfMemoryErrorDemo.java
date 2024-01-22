




//12.10 (OutOfMemoryError) Write a program that causes the JVM to throw an OutOfMemoryError and catches and handles this error.public class OutOfMemoryErrorDemo{ public static void main(String[] args){ try{ //out of memory example }catch(OutOfMemoryError e){ System.out.println(e.getMessage()); } }}//From someone else/*public class OutOfMemoryErrorDemo { public static void main(String[] args) { try { int[] temp = new int[1000000000]; temp = new int[temp.length * 1000000000]; } catch (OutOfMemoryError ex) { ex.printStackTrace(); } }}*/ 
