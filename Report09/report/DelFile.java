package reports9;

import java.io.File;

public class DelFile {
	public static void main(String[] args) {
		File f = new File("C:\\Temp\\test");
		File [] subFiles = f.listFiles();
		int count = 0;
		for(int i = 0; i < subFiles.length; i++) {
			String name = subFiles[i].getName();
			int index = name.lastIndexOf(".txt");
			if(index != -1) {
				subFiles[i].delete();
				System.out.println(name + "삭제");
				count++;
			}
		}
		System.out.println("총 " + count + "개의 .txt 파일을 삭제 했습니다.");
	}
}