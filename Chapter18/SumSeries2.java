/*
18.5 (Sum series) Write a recursive method to compute the following series:
m(i) =1/3 +2/5 +3/7 +4/9 +5/11 +6/13 + ... +i/(2i + 1)
Write a test program that displays m(i) for i = 1, 2, . . ., 10.
*/

public class SumSeries2{
	public static void main(String[] args){
		int index = 10;
		for(int i=1;i<=index;i++){
			System.out.printf("%d: %8.4f\n",i,m(i));
		}
	}

	public static double m(int index){
		if(index==1){
			return 1.0/3;
		}else{
			return index/(2.0*index+1)+m(index-1);
		}
	}
}