/*
 * ��Ʈ���� �Է°� ����� �̿��Ͽ� ���� ���� ����� ����!!
 * */
package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//��°� �Է��� ������ �������� ���α׷��� �������� �Ѵ�!!
//��, �������� ���α׷����� �����Ͱ� ���´ٸ� �Է�, �����ٸ� ���!!

public class FileCopy {
	FileInputStream fis; //������ ������� �� �Է�Ʈ��
	FileOutputStream fos; //������ ������� �� ��� ��Ʈ��

	public FileCopy() {
		try {
			//�Է½�Ʈ�� ����!!(���Ͽ� ���� ����, ���� �������� �ʾҴ�..)
			fis = new FileInputStream("C:/web_app DB/oracle_workspace/project0511/res/pic.png");
			//���� ��½�Ʈ���� ������!!(0byte)�� �������ش�!!!!!!
			fos = new FileOutputStream("C:/web_app DB/oracle_workspace/project0511/res/pic_copy.png");
			
			while(true) {
				//����ִ� ���Ͽ�, fis���� �ҷ��� �����͸� �ϳ��� ä���ֱ�!
				int data = -1;
				data = fis.read(); //1byte �б�
				if(data==-1) break; //���̻� �����Ͱ� ���ٸ� �ݺ��� ����
				fos.write(data); //1byte ���� �� ���!!
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new FileCopy();
	}
}
