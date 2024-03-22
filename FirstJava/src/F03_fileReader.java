import java.io.File;
import java.io.FileReader;

public class F03_fileReader {

	public static void main(String[] args) {

		File file = new File ("C:\\FileTest\\test.txt");
		
		FileReader in = null;
		
		char[] cbuf = new char[100];
		String content = "";
		
		try {
			in = new FileReader(file);  // 기준 데이터가 char임...
			while(true) {
//				int data = in.read();
//				System.out.printf("%X", data);  // %X or %x는 16진수 표현, %ㅇ 8ㅍ;ㄴ수로 표현
//				System.out.print((char)data);
//				if(data == 1) {
//					break;
//				}
				
				int data = in.read(cbuf);  // data 반환값은 char의 갯수. 글자의 수를 기준으로 함
				System.out.println(data);
				if (data != -1) content = new String(cbuf, 0, data);
				else break;
				System.out.println(content);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {in.close();} catch (Exception e) {}
		}
	}

}
