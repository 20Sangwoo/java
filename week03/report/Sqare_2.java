package reports3;
	import java.util.Scanner;
public class Sqare_2 {
	public static boolean inRect(int x, int y, int rectx1, 
								int recty1, int rectx2, int recty2) {
		if((x >= rectx1) && (x <= rectx2) && (y >= recty1) && (y <= recty2))
			return true;
		else return false;
	}
	//과제문에서 제시한 메소드 inRect
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점 (x1, y1)의 좌표를 입력하시오 : ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		System.out.print("점 (x2, y2)의 좌표를 입력하시오 : ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		//좌표를 입력 받을 변수들 선언
		
		if(inRect(x1, y1, 100, 100, 200, 300)||inRect(x2, y2, 100, 100, 200, 200))
			System.out.println("충돌합니다.");
		else
			System.out.println("충돌하지 않습니다");
		//메소드를 활용하여 조건을 작성 후 값에 따라 문구를 출력
		scanner.close();
	}
	}
