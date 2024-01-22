




/* 12.23 (Process scores in a text file on the Web) Suppose that the text file on the Web http://cs.armstrong.edu/liang/data/Scores.txt contains an unspecified number of scores. Write a program that reads the scores from the file and displays their total and average. Scores are separated by blanks. */ import java.util.Scanner; import java.io.*; import java.text.*; public class ProcessScores{ public static void main(String[] args) throws IOException{ java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Scores.txt"); Scanner input = new Scanner(url.openStream()); double total = 0; double average; int count=0; while(input.hasNext()){ total= total+input.nextDouble(); count++; } average=total/count; NumberFormat formatter = new DecimalFormat("#0.00"); System.out.println("Total: "+formatter.format(total)+" Average: "+formatter.format(average)); } } 
