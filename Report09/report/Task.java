package reports9;

import java.util.*;
import java.io.File;

public class Task {
	public static void main(String[] args) {
		System.out.println("****파일 탐색기입니다****");
		Scanner sc = new Scanner(System.in);
		File file = new File("c:\\");
		while(true) {
			File subFiles[] = file.listFiles();
			System.out.println("[" + file.getPath() + "]");

			for(int i = 0; i < subFiles.length; i++) {
				String res="";
				File f = subFiles[i];
				if(f.isFile()) res = "file";
				else if(f.isDirectory()) res = "dir";

				System.out.print(res + "\t");
				System.out.printf("%-10s바이트\t\t", f.length());
				System.out.printf("%s\n", f.getName().trim());
			}

			System.out.print(">>");
			String dir = sc.next();
			String newDir = "";
			if(dir.equals("그만")) break;
			if(dir.equals(".."))
				newDir = file.getParent();
			else
				newDir = file.getPath().concat("\\" + dir);
			file = new File(newDir);
		}
		sc.close();
	}
}
