//Chapter 5 - Question 17

public class DisplayPyramid{

	public static void main(String[] args){
		
		int lines=7;
		int lineNumber;

		for(int count = 1; count<=lines;count++){
		 	lineNumber=count;
         	int space=lines-count;
        
         	for(int i=1;i<=space;i++){
            	System.out.print(" ");
            }

        	while(lineNumber>1){
            	System.out.print(lineNumber);
				lineNumber--;
				}


			do{
				System.out.print(lineNumber);
				lineNumber++;
            }while(lineNumber<=count);
            
			System.out.println("");
		}
	}
}





