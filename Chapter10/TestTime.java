// Chapter 10 - Question 1

class Time{

	private int hour;
	private int minute;
	private int second;

	
	public Time(){
	
		long totalMilliseconds=System.currentTimeMillis();
		second=(int)((totalMilliseconds/1000)%60);
		minute=(int)((totalMilliseconds/1000/60)%60);
		hour=(int)((totalMilliseconds/1000/60/60)%24);	
	}


	public Time(long elapsedTime){
		second=(int)((elapsedTime/1000)%60);
		minute=(int)((elapsedTime/1000/60)%60);
		hour=(int)((elapsedTime/1000/60/60)%24);

	}


	public Time(int hour, int minute, int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;

	}

	
	public int getHour(){
		return hour;
	}

	public int getMinute(){
		return minute;
	}

	public int getSecond(){
		return second;
	}

	public void setHour(int hour){
		this.hour=hour;
	}

	public void setMinute(int minute){
		this.minute=minute;
	}

	public void setSecond(int second){
		this.second=second;
	}

	public void setTime(long elapsedTime){
		this.second=(int)((elapsedTime/1000)%60);
		this.minute=(int)((elapsedTime/1000/60)%60);
		this.hour=(int)((elapsedTime/1000/60/60)%24);
	}


}


public class TestTime{

	public static void main(String[] args){

		Time time1 = new Time();
		Time time2 = new Time(555550000);

		System.out.println("Time 1 is: "+time1.getHour()+":"+time1.getMinute()+":"+time1.getSecond());
		System.out.println("Time 2 is: "+time2.getHour()+":"+time2.getMinute()+":"+time2.getSecond());
	}


}

