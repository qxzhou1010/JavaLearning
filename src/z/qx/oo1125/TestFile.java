package z.qx.oo1125;
import java.io.File;

public class TestFile {
	public static void main(String[] args) throws Exception {
	System.out.println( System.getProperty("user.dir"));
	File f = new File("a.txt");//���·����Ĭ�Ϸ���user.dir����
	f.createNewFile();//�����ļ�
	File f2 = new File("d:/b.txt");//����·��
	
	f2.createNewFile();
	
	}
}
