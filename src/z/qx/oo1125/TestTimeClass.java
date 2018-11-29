package z.qx.oo1125;
import java.util.Date;

public class TestTimeClass {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date date1 = new Date();//新建Date对象，初始化为系统时间
		System.out.println(date1);
		
		long i = date1.getTime();//返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数
		System.out.println(i);
		
		Date date2 = new Date(i - 1000);//初始时间减1000毫秒
		Date date3 = new Date(i + 1000);
		System.out.println(date2);
		System.out.println(date3);
		
		System.out.println(date1.after(date2));
		System.out.println(date1.before(date2));
		System.out.println(date1.equals(date2));
		System.out.println(date1.after(date3));
		System.out.println(date1.before(date3));
		System.out.println(date1.equals(date3));
		System.out.println(new Date(1000L * 60 * 60 * 24 * 365 * 39L).toString());
	}
}
