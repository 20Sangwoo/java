package reports9;

import java.io.*;
import java.util.Scanner;

public class LineDoc {
	public static void main(String[] args) {
		System.out.println("c:\\windows\\system.ini를 읽어 출력합니다.");
		FileReader fin = null;
		int i = 1;	
		
		try {
			fin = new FileReader("c:\\windows\\system.ini");
			Scanner fScanner = new Scanner(fin);
			while(fScanner.hasNext()) {
				String line = fScanner.nextLine();
				System.out.printf("%2d: ", i);
				System.out.println(line);
				i++;
			}
			fin.close();
			fScanner.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
