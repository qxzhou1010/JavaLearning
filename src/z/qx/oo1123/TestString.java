package z.qx.oo1123;

public class TestString {
	public static void main(String[] args) {
		String s1 = new String("abcdefg");
		String s2 = s1.substring(2,4);
		System.out.println( Integer.toHexString(s1.hashCode()));
		System.out.println( Integer.toHexString(s2.hashCode()));
		//��ӡ������������ͬһ������
		//substring()�Ƕ��ַ����Ľ�ȡ�������������Ƕ�ȡԭ�ַ��������������µ��ַ���
	}

}
