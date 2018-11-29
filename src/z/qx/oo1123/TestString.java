package z.qx.oo1123;

public class TestString {
	public static void main(String[] args) {
		String s1 = new String("abcdefg");
		String s2 = s1.substring(2,4);
		System.out.println( Integer.toHexString(s1.hashCode()));
		System.out.println( Integer.toHexString(s2.hashCode()));
		//打印发现两个不是同一个对象
		//substring()是对字符串的截取操作，但本质是读取原字符串内容生成了新的字符串
	}

}
