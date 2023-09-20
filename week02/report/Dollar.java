package reports2;
	import java.util.Scanner;
	//Scanner 객체 사용
		public class Dollar {
			public static void main(String[] args) {
				int won;
				//won 변수 선언
				Scanner scanner = new Scanner(System.in);
				//scanner 선언
				
				System.out.print("원화를 입력하세요(단위 원)>> ");
				//원화 입력 받기
				won = scanner.nextInt();
				//won 변수에 값 입력 받아오기
				double dollar = won/1100;
				//dollar 변수에 1달러는 1100원이라는 수식 입력 (소수가 나올 수 있으므로 double 사용)
				System.out.println(won + "원은 $" + dollar + "입니다.");
				//결과 값 출력
				scanner.close();
			}
}
