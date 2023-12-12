package reports9;

import java.io.*;
import java.util.Scanner;

public class FileRead {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileInputStream one = null;
		FileInputStream two = null;
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		
		System.out.print("첫 번째 파일 이름을 입력하세요>>");
		String first = sc.next();
		System.out.print("두 번째 파일 이름을 입력하세요>>");
		String second = sc.next();
		
		System.out.println(first + "와 " + second + "를 비교합니다.");
		try {
			one = new FileInputStream(first);
			two = new FileInputStream(second);
			if(compareFile(one, two))
				System.out.println("파일이 같습니다.");
			else
				System.out.println("파일이 다릅니다.");
			
			one.close();
			two.close();
		} catch(IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
		sc.close();
	}
	
	private static boolean compareFile(FileInputStream one, FileInputStream two) throws IOException {
		byte[] buf1 = new byte[1024];	//버퍼
		byte[] buf2 = new byte[1024];
		
		int count1 = 0, count2;
		while(true) {
			count1 = one.read(buf1, 0, buf1.length);	
			count2 = two.read(buf2, 0, buf2.length);
			
			if(count1 != count2) return false;			
			if(count1 == -1) break;						
			
			for(int i = 0; i < count1; i++) {			
				if(buf1[i] != buf2[i]) return false;
			}
		}
		return true;
	}
}