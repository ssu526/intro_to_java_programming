//Chapter 7 - Question 1

public class AssignGrades{

	public static void main(String[] args){

		assignment();

	}

	

	public static void assignment(){

		int numberOfStudents=4;
     	int[] scores = {40,55,70,58};

		int best=scores[0];

		for(int i=1;i<numberOfStudents;i++){

			if(scores[i]>best){
				best=scores[i];
			}

		}



		for(int i=0;i<numberOfStudents;i++){
			if(scores[i]>=best-10){
				System.out.println("Student "+i+" score is "+scores[i]+" and grade is A");
			}else if(scores[i]>=best-20){
				System.out.println("Student "+i+" score is "+scores[i]+" and grade is B");
			}else if(scores[i]>=best-30){
				System.out.println("Student "+i+" score is "+scores[i]+" and grade is C");
			}else if(scores[i]>=best-40){
				System.out.println("Student "+i+" score is "+scores[i]+" and grade is D");
			}else{
				System.out.println("Student "+i+" score is "+scores[i]+" and grade is F");
			}

		}


	}








}