package reports2;
	import java.util.Scanner;
	//Scanner 객체 사용
		public class Integer {
			public static void main(String[] args) {
				int number;
				//number 변수 선언
				Scanner scanner = new Scanner(System.in);
				//scanner 선언
				
				System.out.print("2자리수 정수 입력 (10~99) >> ");
				//정수 입력 받기
				number = scanner.nextInt();
				//number 변수에 값 입력 받아오기
				if(number % 11 == 0)
				//십의 자리와 일의 자리의 수가 같으면 11로 나누었을 때 나머지가 0이 되므로 	
				//11로 나누었을 때 나머지 값에 따라 출력할 문장을 다르게 한다
				System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
				//같을 경우 출력
				else {
				System.out.print("No! 10의 자리와 1의 자리가 다릅니다.");
				//다를 경우 출력
			}
				scanner.close();
			}
		}