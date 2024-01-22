/*12.32 (Ranking summary) Write a program that uses the files described in Programming
Exercise 12.31 and displays a ranking summary table for the first five
girlÆs and boyÆs names as follows:
*/
public class RankingSummary{
	public static void main(String[] args){
		System.out.println("                          Girl                                         Boy                   ");
		System.out.println("______________________________________________________________________________________________");
		System.out.println("Year    Rank1    Rank2    Rank3    Rank4    Rank5    Rank1    Rank2    Rank3    Rank4    Rank5");
		System.out.println("______________________________________________________________________________________________");

		for(int i=2010;i>=2001;i--){
			File file = new File("babynameranking"+i+".txt");
			Scanner input = new Scanner(file);
			System.out.print(i+"    ");
			for(int j=0;j<5;j++){
				String[] rank1 = input.nextLine().split();
				String[] rank2=input.nextLine().split();
				String[] rank3=input.nextLine().split();
				String[] rank4=input.nextLine().split();
				String[] rank5=input.nextLine().split();
		
				System.out.println(rank1[3]+"    "+rank2[3]+"    "+rank3[3]+"    "+rank4[3]+"    "+rank5[3]+rank1[1]+"    "+rank2[1]+"    "+rank3[1]+"    "+rank4[1]+"    "+rank5[1]);
			}
		}
	}
}


