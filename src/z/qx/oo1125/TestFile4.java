package z.qx.oo1125;
import java.io.File;
import java.io.IOException;

public class TestFile4 {
	public static void main(String[] args) {
		//指定文件
		File file = new File("d:/sxt/b.txt");
		
		//判断是否存在
		boolean flag = file.exists();
		
		//存在就删除 不存在则创建
		if(flag) {
			//删除
			boolean flagd = file.delete();
			if (flagd) {
				System.out.println("删除成功");
				
			}else {
				System.out.println("删除失败");
			}
		}else {
			//创建
			boolean flagn = true;
			try {
				//目录不存在 先创建目录i
				File dir = file.getParentFile();
				dir.mkdirs();
				//创建文件
				flagn = file.createNewFile();
				System.out.println("创建成功");
			} catch(IOException e){
				System.out.println("创建失败");
				e.printStackTrace();

			}
		}
		
		
		
		
	}

}
