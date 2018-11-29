package z.qx.oo1125;
import java.util.*;
public class TestCalendar {
	public static void main(String[] args) {
		//得到相关日期元素
		GregorianCalendar calendar = new GregorianCalendar(2999,10,9,22,10,50);
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int day2 = calendar.get(Calendar.DATE);//二者同义
		
		int date = calendar.get(Calendar.DAY_OF_WEEK);//当前日期是星期几  1-7 星期天到星期六
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(day2);
		System.out.println(date);
		
		//设置日期
		GregorianCalendar calendar2 = new GregorianCalendar();
		calendar2.set(Calendar.YEAR, 2999);
		calendar2.set(Calendar.MONTH, Calendar.FEBRUARY);
		calendar2.set(Calendar.DATE, 3);
		calendar2.set(Calendar.HOUR_OF_DAY, 10);
		calendar2.set(Calendar.MINUTE, 20);
		
		//日期计算
		GregorianCalendar calendar3 = new GregorianCalendar();
		calendar3.add(Calendar.MONTH, -7);
		
		//日历对象和时间对象转换
		Date d = calendar3.getTime();
		GregorianCalendar calendar4 = new GregorianCalendar();
		calendar4.setTime(new Date());
		long g = System.currentTimeMillis();
		System.out.println(g);
		
		
		
	}

}
