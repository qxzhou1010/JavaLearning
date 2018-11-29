package z.qx.oo1125;
import java.util.Date;

public class TestTimeClass {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date date1 = new Date();//�½�Date���󣬳�ʼ��Ϊϵͳʱ��
		System.out.println(date1);
		
		long i = date1.getTime();//������ 1970 �� 1 �� 1 �� 00:00:00 GMT ������ Date �����ʾ�ĺ�����
		System.out.println(i);
		
		Date date2 = new Date(i - 1000);//��ʼʱ���1000����
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
