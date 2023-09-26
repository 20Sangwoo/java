package reports3;
	import java.util.Scanner;

public class Sqare {
	public static void main(String[] args) {
		System.out.println("점 (x,y)의 좌표를 입력하시오 >>> ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		//좌표 x, y를 입력 받을 변수 x, y 선언
		
		if((x > 100) && (x < 200) && (y > 100) && (y < 200)) 
			System.out.println("(" + x + "," + y + ") 는 사각형 안에 있습니다.");
		else
			System.out.println("사각형 안에 없습니다.");
		//과제문에 나와있는 조건에 따라 x, y가 100 초과 200 미만이면 사각형 안으로 출력, 그 외에는 없다는 문구를 출력
	scanner.close();
	}
}
