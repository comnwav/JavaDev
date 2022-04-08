package devLib;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		
		
		Calendar cal1 = Calendar.getInstance();
		cal1.add(Calendar.DATE, 80);
		
		Date date = new Date(cal1.getTimeInMillis());
		SimpleDateFormat tf = new SimpleDateFormat("yyyy-MM-dd");
		tf.date
		
		System.out.println(tf);

	}

}
