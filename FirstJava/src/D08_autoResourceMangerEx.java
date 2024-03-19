import java.io.FileInputStream;
import java.io.IOException;

public class D08_autoResourceMangerEx {

	public static void main(String[] args) {
		// 파일 입출력...
		// 자동으로 자원을 릴리즈...
		try (FileInputStream in = new FileInputStream("C:\\AWSDEVEOP\\FirstJava\\src\\a.txt")){
			System.out.println("read data : " +in.read());
		}catch (NullPointerException | IOException ex) {
//			System.out.println(in);  // in 변수 참조X
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
		}
		
		// 직접 자원에 대해서 제어
		FileInputStream in2 = null;
		try {
			in2 = new FileInputStream("C:\\AWSDEVEOP\\FirstJava\\src\\a.txt");
			System.out.println("read data : "+in2.read());
		} catch (NullPointerException ex) {
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
		} catch (IOException ie) {
			System.out.println(in2);
			System.out.println("예외 처리합니다.");
			System.out.println(ie.toString());
		} finally {  // 외부에서 작업했던 내용을 클로우즈를 마무리할 때 사용된다.(안할 시 작업을 안한다.)
			try {in2.close();} catch (IOException ie) {}
		}
	}

}
