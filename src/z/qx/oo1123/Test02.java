package z.qx.oo1123;

public class Test02 {
	public static void main(String[] args) {
		Integer in1 = -128;
		Integer in2 = -128;
		System.out.println(in1 == in2);//true -128在缓存区内
		System.out.println( in1.equals(in2)); //true
		
		Integer in3 = 1234;
		Integer in4 = 1234;
		System.out.println(in3 == in4); //false 两个不同的对象 有不同的地址
		System.out.print(in3.equals(in4)); //true两者值相同
	}

}
