package z.qx.oo1123;

public class WrapperClassTest {
	public static void main(String[] args) {
		//Integer i = new Integer(10);
		//Integer j = new Integer(50);
		WrapperClassTest test = new WrapperClassTest();
		test.testInteger();
	
	}
	public void testInteger() {
		//��������ת��ΪInteger����
		Integer int1 = Integer.valueOf(10);
		//Integer����ת��Ϊint
		int a = int1.intValue();
		//String ת��Ϊ Integer
		Integer s = Integer.parseInt("123");
		//Integer---->String
		String s1 = s.toString();
		
		//int���͵���س���
		System.out.println(" the max number of int " + Integer.MAX_VALUE);
	}
}
