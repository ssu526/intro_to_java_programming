/*12.31 (Baby name popularity ranking) The popularity ranking of baby names from
years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored
in files named babynameranking2001.txt, babynameranking2002.txt, . . . ,
babynameranking2010.txt. 

Each file contains one thousand lines. Each line
contains a ranking, a boyÆs name, number for the boyÆs name, a girlÆs name,
and number for the girlÆs name. For example, the first two lines in the file
babynameranking2010.txt are as follows:

1 Jacob 21,875 Isabella 22,731
2 Ethan 17,866 Sophia 20,477


So, the boyÆs name Jacob and girlÆs name Isabella are ranked #1 and the boyÆs
name Ethan and girlÆs name Sophia are ranked #2. 21,875 boys are named
Jacob and 22,731 girls are named Isabella. Write a program that prompts the
user to enter the year, gender, and followed by a name, and displays the ranking
of the name for the year. Here is a sample run:

Enter the year: 2010
Enter the gender: M
Enter the name: Javier
Javier is ranked #190 in year 2010

Enter the year: 2010
Enter the gender: F
Enter the name: ABC
The name ABC is not ranked in year 2010
*/

public class BabyNameQuery{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the year: ");
		String year = sc.next();
		String fileName="babynameranking"+year+".txt";
		File file = new file(fileName);
		if(!file.exist()){
			System.out.println("Enter a year between 2001 and 2010");
			System.exit(1);
		}

		System.out.println("Enter the gender(M or F): ");
		String gender=sc.next().toUpperCase();
		if(!(gender.equals("M") || gender.equals("F")){
			System.out.println("Please enter M for male or F for female");
			System.exit(2);
		}

		System.out.println("Enter the name: ");
		String name=sc.next();


		Scanner input = new Scanner(file);
		String rank;
		boolean nameIsRanked=false;

		while(input.hasNext()){
			String line = input.nextLine();
			if(line.contains(name)){
				rank=line.next();
				nameisRanked=true;
				break;
			}
		}

		if(nameisRanked==false){
			System.out.println("The name "+name+" is not ranked in year "+year);
		}else{
			System.out.println("The name "+name+" is ranked #"+rank+" in year "+year");
		}

		
		
	}
}
