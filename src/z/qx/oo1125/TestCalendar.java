package z.qx.oo1125;
import java.util.*;
public class TestCalendar {
	public static void main(String[] args) {
		//�õ��������Ԫ��
		GregorianCalendar calendar = new GregorianCalendar(2999,10,9,22,10,50);
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int day2 = calendar.get(Calendar.DATE);//����ͬ��
		
		int date = calendar.get(Calendar.DAY_OF_WEEK);//��ǰ���������ڼ�  1-7 �����쵽������
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(day2);
		System.out.println(date);
		
		//��������
		GregorianCalendar calendar2 = new GregorianCalendar();
		calendar2.set(Calendar.YEAR, 2999);
		calendar2.set(Calendar.MONTH, Calendar.FEBRUARY);
		calendar2.set(Calendar.DATE, 3);
		calendar2.set(Calendar.HOUR_OF_DAY, 10);
		calendar2.set(Calendar.MINUTE, 20);
		
		//���ڼ���
		GregorianCalendar calendar3 = new GregorianCalendar();
		calendar3.add(Calendar.MONTH, -7);
		
		//���������ʱ�����ת��
		Date d = calendar3.getTime();
		GregorianCalendar calendar4 = new GregorianCalendar();
		calendar4.setTime(new Date());
		long g = System.currentTimeMillis();
		System.out.println(g);
		
		
		
	}

}
