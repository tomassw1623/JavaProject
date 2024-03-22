package quiz;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Quiz_240322_AM {

    public static void main(String[] args) {
    	
//    	// 텍스트 내용
//        String textContent = "별을 헤는 밤\n";
//
//        File test = new File("C:\\filetest4\\윤동주.txt");  // 파일 위치
//        // 파일생성
//        try {
//            if (test.createNewFile()) {
//                System.out.println("윤동주.txt 파일을 생성하였습니다.");
//                FileWriter writer = new FileWriter(test);
//                writer.write(textContent);
//                writer.close();
//            } else {
//                System.out.println("윤동주.txt 파일이 이미 존재합니다.");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("파일 생성 중 오류가 발생했습니다.");
//        }
//        
//        // 존재 여부
//        File testFile = new File("C:\\filetest4\\윤동주.txt");
//        if (!testFile.exists()) {
//            System.out.println("윤동주.txt 파일이 존재하지 않습니다.");
//            return;
//        }
//        if (!testFile.isFile()) {
//            System.out.println("윤동주.txt가 파일이 아닙니다.");
//            return;
//        }
//
//        File destinationDir = new File("C:\\filetest4\\testFile\\temp");
//        if (!destinationDir.exists()) {
//            destinationDir.mkdirs();
//        }
//
//        File destinationFile = new File(destinationDir, testFile.getName());
//
//        try {
//            Files.move(testFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
//            System.out.println("윤동주.txt 파일을 이동하였습니다.");
//
//            String content = Files.readString(destinationFile.toPath());
//            System.out.println("윤동주.txt 파일의 내용:");
//            System.out.println(content);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("파일 이동 또는 읽기 중에 오류가 발생했습니다.");
//        }
    	
    	// 선샌님 답안===================================================
    	
    	File file = new File("D:/filetest4/윤동주.txt");
		File dir = new File("D:/FileTest/testFile/temp");
		File dstFile = null;
		
		System.out.println("윤동주.txt는 파일인가요? "+file.isFile());
		System.out.println("dir이 존재하나요? "+dir.exists());
		if(dir.exists()) {
			dstFile = new File(dir.getPath()+"/"+file.getName());
			file.renameTo(dstFile);
		}else {
			System.out.println("디렉터리가 존재하지 않습니다.");
			dir.mkdirs();
			System.out.println("디랙터리 생성했습니다.");
			dstFile = new File(dir.getPath()+"/"+file.getName());
			file.renameTo(dstFile);
		}
		System.out.println(dstFile);
		Reader rFile = null;
		try {
			rFile = new FileReader(dstFile);
			while(true) {
				int data = rFile.read();
				System.out.print((char)data);
				if(data == -1) break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rFile.close();
			} catch (Exception e2) {}
		}

    }
}
