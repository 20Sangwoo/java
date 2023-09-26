package reports3;
	import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("달을 입력하세요(1~12) >> ");
		int season = scanner.nextInt();
		//달을 입력 받을 변수 season 선언
		
		if((season == 3) || (season == 4) || (season == 5))
			System.out.println("봄");
		else if((season == 6) || (season == 7) || (season == 8))
			System.out.println("여름");		
		else if((season == 9) || (season == 10) || (season == 11))
			System.out.println("가을");
		else
			System.out.println("겨울");
		//입력 받은 값에 따라 계절 출력
		
/*
		switch(season) { //switch 활용문
		case 3 : 
		case 4 :
		case 5 :
			System.out.println("봄");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("여름");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("가을");
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.println("겨울");
			break;
		default :
			System.out.println("잘못 입력");
			break;
		}
		
*/
		scanner.close();
	}

}
