import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDemoMain {

	public static void main(String[] args) {
		
		FileReader reader = null;
		
		try {
//			// System.out.println((char)reader.read());
//			
//			int data = 0;
//			while((data = reader.read()) != -1) {
//				System.out.print((char)data);
//			}
			System.out.println();
			// File 객체
			File file = new File("C:/testReader.txt");
			reader = new FileReader(file); // Reader 를 Right 로 바꾸면 원하는 디렉토리에 출력할 수 있다.
			
			char [] charAry = new char[(int) file.length()]; // length 의 return type 이 long 이여서 int 로 캐스팅 해줌.
			
			reader.read(charAry); // char 하나씩을 읽어들이는 것이 아니라 전체 한꺼번에 읽어들인다.
			
			for(int idx = 0; idx < charAry.length; idx++) {
				System.out.print(charAry[idx]);
			}
			
		} catch (Exception e) { // Exception 을 사용하면 다중 catch 를 할 필요가 없다.
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
