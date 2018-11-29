package z.qx.oo1125;
import com.sun.org.apache.xml.internal.security.utils.resolver.implementations.ResolverLocalFilesystem;

import java.io.File;
import java.util.Date;
public class TestFile2 {
	public static void main(String[] args) {
		File f = new File("d:/b.txt");
		
		System.out.println("文件是否存在"+f.exists());
		System.out.println("文件是否为目录"+f.isDirectory());
		System.out.println("是否为文件"+ f.isFile());
		System.out.println("最后修改时间" + new Date(f.lastModified()));
		System.out.println("大小"+ f.length());
		System.out.println("文件名"+ f.getName());
		System.out.println("目录路径"+ f.getPath());


	}

}
