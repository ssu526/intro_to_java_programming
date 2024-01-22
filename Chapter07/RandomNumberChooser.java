//Chapter 7 - Question 13


/*

(Random number chooser) Write a method that returns a random number between
1 and 54, excluding the numbers passed in the argument. The method header is
specified as follows:
public static int getRandom(int... numbers)


*/

public class RandomNumberChooser{

	public static void main(String[] args){
		System.out.println(getRandom(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30}));

	}


	public static int getRandom(int...numbers){

		int length=numbers.length;
		boolean numberExist;
		int ranNumber;
      

      do{

        numberExist=false;
        ranNumber=(int)(1+Math.random()*54);
        
        for(int i=0;i<length;i++){
			if(ranNumber==numbers[i]){
                numberExist=true;
				break;
			}
		}
        

      }while(numberExist==true);
      
      

		return ranNumber;

	}



}