package ch15_inout;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class FileBasic {

	public static void main(String[] args) {
		// 현재 디렉토리 경로 가져오기
		String path = System.getProperty("user.dir");
		System.out.println(path);
		
		// 현재 경로의 파일리스트 출력(ls)
		File currentFile = new File(path + "/src");
		
		// .listFiles()
		// 해당 폴더 내 파일리스트를 배열(Array)로 리턴
		File[] files = currentFile.listFiles();
		for(int i = 0; i<files.length;i++) {
			// 경로가 포함된 파일명
			System.out.println(files[i]);
		}
		for(int i = 0; i<files.length;i++) {
			// 경로가 포함되지 않는 파일명
			System.out.println(files[i].getName());
		}
		
		System.out.println("=================================");
		
		// 해당 File 객체가 폴더인지 파일인지 확인
		System.out.println(files[0]);
		System.out.println(files[0].isDirectory());
		System.out.println();
		
		// Ramen.java를 File객체로 가져오기
		File ramen = new File(files[0] + "/Comments.java");
		System.out.println(ramen);
		
		// .lastModified() 마지막 수정 날짜 (MillSec)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.println(sdf.format(ramen.lastModified()));
		
		// .length() 파일크기
		// 1KB = 1024Byte
		System.out.println(ramen.length());
		
		// .exists() 해당 파일이 실제 존재하는지 리턴 
		System.out.println(ramen.exists());
		
		File temp = new File("/home/pc41/test");
		System.out.println(temp.exists());
		
		// 폴더 만들기
		temp.mkdir();
		System.out.println(temp.exists());
		
		File test = new File("/home/pc41/test/test.txt");
		
		try {
			test.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 읽기 전용 설정
//		test.setReadOnly();
		
		ArrayList<String> students = new ArrayList<>();
		students.add("가나혜");
		students.add("김달현");
		students.add("김성빈");
		students.add("김성윤");
		students.add("남궁혜");
		students.add("박기현");
		students.add("박설리");
		students.add("박승주");
		students.add("석승원");
		students.add("송나겸");
		students.add("신윤빈");
		students.add("염현섭");
		students.add("오혁진");
		students.add("유동준");
		students.add("이한정");
		students.add("임동성");
		students.add("임성헌");
		students.add("정기준");
		students.add("최윤정");
		students.add("한예성");
		students.add("황의창");
		
		// /home/pc41/test 폴더 안에 students 리스트에 있는 학생들 폴더를 만들어 주세요
		File temp1;
		for(int i = 0; i<students.size();i++) {
			temp1 = new File("/home/pc41/test/"+students.get(i));
			temp1.mkdir();
		}
		
		File ls = new File("/home/pc41/test");
		File[] lsfiles = ls.listFiles();
		for(int i = 0; i<lsfiles.length;i++) {
			// 경로가 포함되지 않는 파일명
			System.out.println(lsfiles[i].getName());
		}
	}

}
