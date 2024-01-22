//Chapter 10 - Question 14


import java.util.GregorianCalendar;
import java.util.Calendar;

class MyDate{

	private int year;
	private int month; 
	private int day;
  
	/*
	public MyDate(){
		long elapsedTime=System.currentTimeMillis();
		day = (int)(elapsedTime/1000/60/60/24)%31;
		month = (int)(elapsedTime/1000/60/60/24/31)%12;
		year=(int)(elapsedTime/1000/60/60/24/31/12)+1970;
		
	}


	public MyDate(long elapsedTime){
		day = (int)(elapsedTime/1000/60/60/24)%31;
		month = (int)(elapsedTime/1000/60/60/24/31)%12;
		year=(int)(elapsedTime/1000/60/60/24/31/12)+1970;
	}
	*/
  
  
  public MyDate(){
    long elapsedTime = System.currentTimeMillis();
   	GregorianCalendar cal = new GregorianCalendar();
    cal.setTimeInMillis(elapsedTime);
    year=cal.get(Calendar.YEAR);
    month=cal.get(Calendar.MONTH)+1;
    day=cal.get(Calendar.DAY_OF_MONTH);
    
  }

  public MyDate(long elapsedTime){
   	GregorianCalendar cal = new GregorianCalendar();
    cal.setTimeInMillis(elapsedTime);
    year=cal.get(Calendar.YEAR);
    month=cal.get(Calendar.MONTH)+1;
    day=cal.get(Calendar.DAY_OF_MONTH);
    
    
    
  }
	public MyDate(int year, int month, int day){
		this.year=year;
		this.month=month;
		this.day=day;

	}

	public void setYear(int year){
		this.year=year;
	}


	public void setMonth(int month){
		this.month=month;
	}


	public void setDay(int day){
		this.day=day;
	}
	

	public int getYear(){
		return year;
	}


	public int getMonth(){
		return month;
	}


	public int getDay(){
		return day;
	}
}



public class TestMyDate{
	public static void main(String[] args){

		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate(561555550000L);

		System.out.println(date1.getYear()+" "+date1.getMonth()+" "+date1.getDay());
		System.out.println(date2.getYear()+" "+date2.getMonth()+" "+date2.getDay());

	}

}

