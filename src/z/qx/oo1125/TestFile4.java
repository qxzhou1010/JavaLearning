package z.qx.oo1125;
import java.io.File;
import java.io.IOException;

public class TestFile4 {
	public static void main(String[] args) {
		//ָ���ļ�
		File file = new File("d:/sxt/b.txt");
		
		//�ж��Ƿ����
		boolean flag = file.exists();
		
		//���ھ�ɾ�� �������򴴽�
		if(flag) {
			//ɾ��
			boolean flagd = file.delete();
			if (flagd) {
				System.out.println("ɾ���ɹ�");
				
			}else {
				System.out.println("ɾ��ʧ��");
			}
		}else {
			//����
			boolean flagn = true;
			try {
				//Ŀ¼������ �ȴ���Ŀ¼i
				File dir = file.getParentFile();
				dir.mkdirs();
				//�����ļ�
				flagn = file.createNewFile();
				System.out.println("�����ɹ�");
			} catch(IOException e){
				System.out.println("����ʧ��");
				e.printStackTrace();

			}
		}
		
		
		
		
	}

}
