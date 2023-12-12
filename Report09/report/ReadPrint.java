package reports9;

import java.io.*;
import java.util.*;

public class ReadPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<String> wordsV = new Vector<String>();
		try {
			Scanner fScanner = new Scanner(new FileReader("C:\\Temp\\words.txt"));
			while(fScanner.hasNext()) {
				String line = fScanner.nextLine();
				wordsV.add(line);
			}
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}

		System.out.println("프로젝트 폴더 밑의 words.txt 파일을 읽었습니다...");
		
		while(true) {
			boolean check = false;
			
			System.out.print("단어>>");
			String word = sc.next();
			if(word.equals("그만")) {
				System.out.println("종료합니다."); break;
			}
			
			Iterator<String> it = wordsV.iterator();
			while(it.hasNext()) {
				String temp = it.next();
				if(temp.length() < word.length()) continue;
				String frontPart = temp.substring(0, word.length());
				if(word.equals(frontPart)) {
					System.out.println(temp);
					check = true;
				}
			}
			if(!check) System.out.println("발견할 수 없음");
		}
		sc.close();
	}
}
