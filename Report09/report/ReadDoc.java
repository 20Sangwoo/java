package reports9;

import java.io.*;

public class ReadDoc {
	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		
		try {
			fin = new FileReader("c:\\windows\\system.ini");
			while((c = fin.read()) != -1) {
				c = Character.toUpperCase(c);
				System.out.print((char)c);
			}
			fin.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
