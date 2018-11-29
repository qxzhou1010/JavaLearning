package z.qx.oo1123;

public class Test {
	public static void main(String[] args) {
		Integer i = 5;//自动装箱 和下列语句等价
		
		Integer j = Integer.valueOf(5);
		
		int k = i; // 自动拆箱 i 自动变为基本数据类型
		int n = i.intValue();
		
		Integer s = null; //这两句可以通过编译，但在运行阶段会报错！
		int s1 = s;
		
	}

}
