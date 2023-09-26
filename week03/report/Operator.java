package reports3;
	import java.util.Scanner;
	
public class Operator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산 >>");
		double num1 = scanner.nextDouble();
		String operator = scanner.next();
		double num2 = scanner.nextDouble();
		//연산식을 입력 받을 변수들 선언


		if(operator.equals("+"))
			System.out.println(num1 + operator +  num2 + "의 계산 결과는 " + (num1 + num2));
		else if(operator.equals("-"))
			System.out.println(num1 + operator +  num2 + "의 계산 결과는 " + (num1 - num2));
		else if(operator.equals("*"))
			System.out.println(num1 + operator +  num2 + "의 계산 결과는 " + (num1 * num2));
		else if(operator.equals("/"))
			if(num2 == 0) 
				System.out.println("0으로 나눌 수 없습니다.");
			else
			System.out.println(num1 + operator +  num2 + "의 계산 결과는 " + (num1 / num2));
		//입력 받은 연산자에 따라서 계산식과 답을 출력
		// "/" 연산자 뒤에 0을 입력 받았을 경우 별도의 문구 출력

/*
		switch(operator) { //switch문 활용
		case "+" :
			System.out.println(num1 + operator +  num2 + "의 계산 결과는 " + (num1 + num2));
			break;
		case "-" :
			System.out.println(num1 + operator +  num2 + "의 계산 결과는 " + (num1 - num2));
			break;
		case "*" :
			System.out.println(num1 + operator +  num2 + "의 계산 결과는 " + (num1 * num2));
			break;
		case "/" :
			if(num2 == 0)
				System.out.println("0으로 나눌 수 없습니다.");
			else
			System.out.println(num1 + operator +  num2 + "의 계산 결과는 " + (num1 / num2));
			break;
		}
*/

			scanner.close();
	}
}
