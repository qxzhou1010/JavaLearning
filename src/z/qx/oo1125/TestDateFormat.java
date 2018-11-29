package z.qx.oo1125;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		//新建对象
		SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat s2 = new SimpleDateFormat("yyy-MM-dd");
		//时间信息格式化输出
		String daytime = s1.format(new Date());
		System.out.println(daytime);
		
		System.out.println(s2.format(new Date()));
		System.out.println(new SimpleDateFormat("hh:mm:ss").format(new Date()));
		
		//将符合指定格式的字符串 拆成 时间信息
		String time = "2007-11-00"; //这个字符串的格式和s2一致
		Date date = s2.parse(time);
		System.out.println("date1:"+ date);
		
		time = "2008-11-22 12:23:33";
		date = s1.parse(time);
		System.out.println("date2:" + date);
		
		
		//时间字符格式的使用
		//获取今天是这年的第几天
		SimpleDateFormat ss = new SimpleDateFormat("D");
		String daytime0 = ss.format(new Date());
		System.out.println(daytime0);

	}

}
