package z.qx.oo1123;

public class TestString03 {
	public static void main(String[] args) {
		//StringBuilder
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<7; i++) {
			sb.append( (char)('a' + i)); //×·¼Óµ¥¸ö×Ö·û
		}
		System.out.println(sb.toString());//»»³ÉStringÊä³ö
		sb.append(" I love my country");//×·¼Ó×Ö·û´®
		System.out.println(sb.toString());
		//StringBuffer
		StringBuffer sb2 = new StringBuffer(" love my country");
		sb2.insert(0, "really").insert(0, "I ");//²åÈë×Ö·û´®
		System.out.println(sb2);
		
		sb2.delete(0, 2);// É¾³ý×Ó×Ö·û´®
		System.out.println(sb2);
		
		sb2.deleteCharAt(0).deleteCharAt(0);
		System.out.println(sb2.charAt(0));
		System.out.println(sb2.reverse());
	}

}
