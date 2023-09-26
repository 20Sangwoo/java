package reports3;
	import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력 >> ");
		double circlex = scanner.nextDouble();
		double circley = scanner.nextDouble();
		double radius = scanner.nextDouble();
		//원의 중심 좌표를 입력 받을 변수 circlex, y와 반지름을 입력 받을 변수 radius 선언
		
		System.out.print("점 입력 >>");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		//원 내부에 있는 지 판별할 점의 좌표를 입력받을 변수 x, y 선언
		
		if((x - circlex) * (x - circlex) + (y - circley) * (y - circley) <= radius * radius)
			System.out.println("점 (" + x + " " + y + ") 는 원 안에 있다.");
		else
			System.out.println("점 (" + x + " " + y + ") 는 원 밖에 있다.");
		scanner.close();
	}

}
