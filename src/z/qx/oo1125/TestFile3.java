package z.qx.oo1125;
import java.io.File;
import java.io.IOException;
public class TestFile3 {
	public static void main(String[] args) throws IOException {
		File f = new File("d:/c.txt");
		f.createNewFile();//在d盘下新建c.txt
		f.delete();//删除该文件
		File f2 = new File("d/javafile/file");
		boolean flag = f2.mkdirs();//创建目录 判断是否所有目录均存在
		System.out.println(flag);
		
	}

}
