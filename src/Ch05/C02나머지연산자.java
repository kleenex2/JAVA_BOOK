package Ch05;

import java.util.Scanner;

public class C02나머지연산자 {

	public static void main(String[] args) throws InterruptedException {
		// 1 짝홀수 구분 N%2==0 or 1
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		
//		String result = (num1%2==0)?"짝수입니다":"홀수입니다";
//		System.out.println("결과 : "+result);
		
		// 2 배수 구분
//		Scanner sc = new Scanner(System.in);
//		int n1, n2, n3, sum;
//		n1=sc.nextInt();
//		n2=sc.nextInt();
//		n3=sc.nextInt();
//		sum=n1+n2+n3;
//		String result = (sum%5==0)?"5의배수입니다":"5의 배수가 아닙니다";
//		System.out.println("RESULT : "+result);
		
		// 3 수의 범위 제한
		// N % 2 = 0~1
		// N % 3 = 0~2
		// N % 10 = 0~9
		// N % 100 = 0~99
		
		// 난수생성
//		Random rnd = new Random();
//		while (true) {
//			System.out.println(rnd.nextInt(5));    // N%5 과 동일 (0~4)
//			Thread.sleep(500);
//		}
		
		// 02 Math.random() 사용
//		while(true) {
//			System.out.println( (int)(Math.random()*100)%45 + 1 );
//			Thread.sleep(500);
//		}
		
		// 4 자리수
		int num = 56789;
		
		System.out.println("오른쪽 끝 1자리 : " + (num % 10));
		System.out.println("오른쪽 끝 2자리 : " + (num % 100));
		System.out.println("오른쪽 끝 3자리 : " + (num % 1000));
		System.out.println("오른쪽 끝 4자리 : " + (num % 10000));
		System.out.println();	
		System.out.println("왼쪽 끝 1자리 : " + (num / 10000));
		System.out.println("왼쪽 끝 2자리 : " + (num / 1000));
		System.out.println("왼쪽 끝 3자리 : " + (num / 100));
		System.out.println("왼쪽 끝 4자리 : " + (num / 10));
		

	}

}
