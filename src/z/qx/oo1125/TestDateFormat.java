package z.qx.oo1125;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		//�½�����
		SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat s2 = new SimpleDateFormat("yyy-MM-dd");
		//ʱ����Ϣ��ʽ�����
		String daytime = s1.format(new Date());
		System.out.println(daytime);
		
		System.out.println(s2.format(new Date()));
		System.out.println(new SimpleDateFormat("hh:mm:ss").format(new Date()));
		
		//������ָ����ʽ���ַ��� ��� ʱ����Ϣ
		String time = "2007-11-00"; //����ַ����ĸ�ʽ��s2һ��
		Date date = s2.parse(time);
		System.out.println("date1:"+ date);
		
		time = "2008-11-22 12:23:33";
		date = s1.parse(time);
		System.out.println("date2:" + date);
		
		
		//ʱ���ַ���ʽ��ʹ��
		//��ȡ����������ĵڼ���
		SimpleDateFormat ss = new SimpleDateFormat("D");
		String daytime0 = ss.format(new Date());
		System.out.println(daytime0);

	}

}
