package abc;

import java.time.LocalDateTime;
import java.util.Calendar;

public class ToPrintDateAndTimeDemo {

	public static void main(String[] args) {
		/*int day,mon,year;
		int sec,min,hr;
		Calendar date = null;
		day=date.get(Calendar.DAY_OF_MONTH);
		mon=date.get(Calendar.MONTH);
		year=date.get(Calendar.DAY_OF_YEAR);
		sec=date.get(Calendar.SECOND);
		min=date.get(Calendar.MINUTE);
		hr=date.get(Calendar.HOUR);
		System.out.println("current date is.."+day+"/"+mon+"/"+year);
		System.out.println("current time is.."+hr+":"+min+":"+sec);*/
		
		LocalDateTime cur=LocalDateTime.now();
		System.out.println("current date and time is.." + "\n" + cur );
	}

}
