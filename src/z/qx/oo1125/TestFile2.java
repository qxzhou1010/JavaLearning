package z.qx.oo1125;
import com.sun.org.apache.xml.internal.security.utils.resolver.implementations.ResolverLocalFilesystem;

import java.io.File;
import java.util.Date;
public class TestFile2 {
	public static void main(String[] args) {
		File f = new File("d:/b.txt");
		
		System.out.println("�ļ��Ƿ����"+f.exists());
		System.out.println("�ļ��Ƿ�ΪĿ¼"+f.isDirectory());
		System.out.println("�Ƿ�Ϊ�ļ�"+ f.isFile());
		System.out.println("����޸�ʱ��" + new Date(f.lastModified()));
		System.out.println("��С"+ f.length());
		System.out.println("�ļ���"+ f.getName());
		System.out.println("Ŀ¼·��"+ f.getPath());


	}

}
