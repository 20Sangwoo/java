package reports3;
	import java.util.Scanner;
	
		public class Clap {
			public static void main(String[] args) {
				System.out.println("1~99 사이의 정수를 입력하시오. >> ");
				Scanner scanner = new Scanner(System.in);
				int num = scanner.nextInt();
				int ten = num / 10;
				int one = num % 10;
				int count = 0;
				
				//정수를 입력 받을 변수 num, 십의 자리수를 저장할 변수 ten, 일의 자리수를 저장할 변수 one,
				//3,6,9가 총 몇 번 나왔는 지 세어줄 변수 count를 선언 및 초기화
				
				if(ten == 3 || ten ==6 || ten == 9) {
					count++;	
				}
				if(one == 3 || one == 6 || one ==9) {
					count++;
				}
				//십의 자리수와 일의 자리수에 3, 6, 9가 있는지 보고 발견하면 count가 올라감
				
				if(count > 0) {
					System.out.print("박수");
				}
				//count에 숫자가 들어있으면 박수를 출력

				switch(count) {
				case 1 :
					System.out.print("짝");
					break;
				case 2 :
					System.out.print("짝짝");
					break;
				}
				//count된 갯수에 따라 출력되는 짝의 개수도 달라짐
				
				scanner.close();
			}

}
