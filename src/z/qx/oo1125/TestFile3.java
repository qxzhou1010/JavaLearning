package z.qx.oo1125;
import java.io.File;
import java.io.IOException;
public class TestFile3 {
	public static void main(String[] args) throws IOException {
		File f = new File("d:/c.txt");
		f.createNewFile();//��d�����½�c.txt
		f.delete();//ɾ�����ļ�
		File f2 = new File("d/javafile/file");
		boolean flag = f2.mkdirs();//����Ŀ¼ �ж��Ƿ�����Ŀ¼������
		System.out.println(flag);
		
	}

}
