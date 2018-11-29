package z.qx.oo1123;

public class WrapperClassTest {
	public static void main(String[] args) {
		//Integer i = new Integer(10);
		//Integer j = new Integer(50);
		WrapperClassTest test = new WrapperClassTest();
		test.testInteger();
	
	}
	public void testInteger() {
		//基本类型转化为Integer对象
		Integer int1 = Integer.valueOf(10);
		//Integer对象转换为int
		int a = int1.intValue();
		//String 转换为 Integer
		Integer s = Integer.parseInt("123");
		//Integer---->String
		String s1 = s.toString();
		
		//int类型的相关常量
		System.out.println(" the max number of int " + Integer.MAX_VALUE);
	}
}
