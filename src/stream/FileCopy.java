/*
 * 스트림의 입력과 출력을 이용하여 파일 복사 기능을 구현!!
 * */
package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//출력과 입력의 기준은 실해중인 프로그램을 기준으로 한다!!
//즉, 실행중인 프로그램으로 데어터가 들어온다면 입력, 나간다면 출력!!

public class FileCopy {
	FileInputStream fis; //파일을 대상으로 한 입력슽트림
	FileOutputStream fos; //파일을 대상으로 한 출력 스트림

	public FileCopy() {
		try {
			//입력스트림 생성!!(파일에 빨대 꽂음, 아직 마시지는 않았다..)
			fis = new FileInputStream("C:/web_app DB/oracle_workspace/project0511/res/pic.png");
			//파일 출력스트림은 빈파일!!(0byte)을 생성해준다!!!!!!
			fos = new FileOutputStream("C:/web_app DB/oracle_workspace/project0511/res/pic_copy.png");
			
			while(true) {
				//비어있는 파일에, fis에서 불러온 데어터를 하나씩 채워넣기!
				int data = -1;
				data = fis.read(); //1byte 읽기
				if(data==-1) break; //더이상 데이터가 없다면 반복문 멈춤
				fos.write(data); //1byte 쓰기 즉 출력!!
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
