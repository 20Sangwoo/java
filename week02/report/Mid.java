package reports2;
	import java.util.Scanner;
	//Scanner 객체 사용
		public class Mid {
			public static void main(String[] args) {
				int a, b, c;
				//정수 입력 받을 변수 a b c 선언
				Scanner scanner = new Scanner(System.in);
				//scanner 선언
				
				System.out.print("정수 3개 입력 >> ");
				//정수 입력 받기
				a = scanner.nextInt();
				b = scanner.nextInt();
				c = scanner.nextInt();
				//a b c 값 입력 받아 오기
				
				if(a > b && a < c)
				System.out.println("중간 값은 " + a);
				else if(a > c && a < b)
				System.out.println("중간 값은 " + a);
				else if(b > a && b < c)
				System.out.println("중간 값은 " + b);
				else if(b > c && b < a)
				System.out.println("중간 값은 " + b);
				else
				System.out.println("중간 값은 " + c);
				//a 값이 중간값이 되는 경우와 b 값이 중간값이 되는 경우와
				//둘 다 해당되지 않는 경우 각각 a, b, c가 출력되도록 조건문 작성
				
				scanner.close();
			}
}
