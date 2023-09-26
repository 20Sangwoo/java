package reports3;
	import java.util.Scanner;
	
public class Circle_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 원의 중심과 반지름 입력 >> ");
		double circlex1 = scanner.nextDouble();
		double circley1 = scanner.nextDouble();
		double radius1 = scanner.nextDouble();
		//첫 번째 원의 중심 좌표와 반지름을 입력 받을 변수 circlex, y, radius를 선언
		
		System.out.print("두 번째 원의 중심과 반지름 입력 >> ");
		double circlex2 = scanner.nextDouble();
		double circley2 = scanner.nextDouble();
		double radius2 = scanner.nextDouble();
		//두 번째 원의 중심 좌표와 반지름을 입력 받을 변수 circlex, y, radius를 선언
		
		if((circlex1 - circlex2) * (circlex1 - circlex2) + 
				(circley1 - circley2) * (circley1 - circley2) <= 
					(radius1 - radius2) * (radius1 - radius2))
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 겹치지 않는다.");
		scanner.close();
	}

}
