package z.qx.oo1123;

public class TestString02 {
	public static void main(String[] args) {
		String str1 = "hello" + " java";//字符串拼接，直接在编译阶段就完成了
		String str2 = "hello java";
		System.out.println(str1 == str2);//true
		
		String str3 = "hello";
		String str4 = " java";
		
		String str5 = str3 + str4;
		System.out.println(str2 == str5); //false
	}

}
