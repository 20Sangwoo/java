package reports2;
	import java.util.Scanner;
	//Scanner 객체 사용
		public class Triangle {
			public static void main(String[] args) {
				int a, b, c;
				//정수 입력 받을 변수 a b c 선언
				Scanner scanner = new Scanner(System.in);
				//scanner 선언
				
				System.out.print("정수 3개를 입력하시오 >> ");
				a = scanner.nextInt();
				b = scanner.nextInt();
				c = scanner.nextInt();
				//a b c 값 입력 받아 오기
				
				if(a < b + c)
				System.out.println("삼각형이 됩니다.");
				else if(b < a + c)
				System.out.println("삼각형이 됩니다.");
				else if(c < a + b)
				System.out.println("삼각형이 됩니다.");
				//두 변의 합이 나머지 한 변보다 큰 경우에
				//문장이 출력되도록 작성
				
				scanner.close();
			}
}
