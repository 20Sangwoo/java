package reports9;

import java.io.*;
import java.util.*;

public class NumRead {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> phone = new HashMap<String, String>();
		try {
			Scanner fScanner = new Scanner(new FileReader("C:\\Temp\\phone.txt"));
			while(fScanner.hasNext()) {
				String line = fScanner.nextLine();
				String s[] = line.split(" ");
				phone.put(s[0], s[1]);
			}
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
		System.out.println("총 " + phone.size() + "개의 전화번호를 읽었습니다.");
		while(true) {
			System.out.print("이름>>");
			String name = sc.next();
			if(name.equals("그만")) break;
			if(phone.containsKey(name))
				System.out.println(phone.get(name));
			else
				System.out.println("찾는 이름이 없습니다.");
		}
		sc.close();
	}
}
