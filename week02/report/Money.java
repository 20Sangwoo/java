package reports2;
	import java.util.Scanner;
	//Scanner 객체 사용
		public class Money {
			public static void main(String[] args) {
				int money, Five, Tenh, Ten, Hun, five, ten, one;
				//금액을 입력 받을 변수 선언
				Scanner scanner = new Scanner(System.in);
				//scanner 선언 
				
				System.out.print("금액을 입력하시오 >> ");
				//금액 입력 받기
				money = scanner.nextInt();
				//money 변수에 값 입력 받아 오기
				Five = money/50000;
				//Five 변수에는 오만원권 갯수 계산 후 저장
				money = money%50000;
				//money 변수는 오만원권을 뺀 나머지 금액을 저장
				System.out.println("오만원권" + Five + "매");
				Tenh = money/10000;
				//Tenh 변수에는 만원권 갯수 계산 후 저장
				money = money%10000;
				//money 변수는 만원권을 뺀 나머지 금액을 저장
				System.out.println("만원권" + Tenh + "매");
				Ten = money/1000;
				//Ten 변수에는 천원권 갯수 계산 후 저장
				money = money%1000;
				//money 변수는 천원권을 뺀 나머지 금액을 저장
				System.out.println("천원권" + Ten + "매");
				Hun = money/100;
				//Hun 변수에는 백원 갯수 계산 후 저장;
				money = money%100;
				//money 변수는 백원을 뺀 나머지 금액을 저장
				System.out.println("백원" + Hun + "개");
				five = money/50;
				//five 변수에는 오십원 갯수 계산 후 저장
				money = money%50;
				//money 변수는 오십원을 뺸 나머지 금액을 저장
				System.out.println("오십원" + five + "개");
				ten = money/10;
				//ten 변수에는 십원 갯수 계산 후 저장
				money = money%10;
				//money 변수는 십원을 뺀 나머지 금액을 저장
				System.out.println("십원" + ten + "개");
				one = money/1;
				//one 변수에는 일원 갯수 계산 후 저장
				System.out.println("일원" + one + "개");
				//각 금액 갯수 값 저장한 것들 출력하기
				scanner.close();
			}
}
