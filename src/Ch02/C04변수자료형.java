package Ch02;

public class C04변수자료형 {

	public static void main(String[] args) {
		// --------------------
		// 정수 int-4byte 정수 부호 o
		// --------------------
//		int n1 = 0b10101101;    // 2진수값
//		int n2 = 173;    // 10진 정수값
//		int n3 = 0255;    // 8진수
//		int n4 = 0xad;    // 16진수
//		System.out.printf("%d %d %d %d\n", n1, n2, n3, n4);
		
		// --------------------
		// 정수 byte-1byte 정수 부호 o
		// --------------------
//		byte n1 = -128;
//		byte n2 = -30;
//		byte n3 = 30;
//		byte n4 = 127;
//		byte n5 = (byte)129;    // 문제 발생.. 왜?? int를 byte에 넣으려고 해서
//		System.out.printf("%d\n", n5);    // 왜?? 데이터 소실
		
		// --------------------
		// 정수 short-2byte 정수 부호 o | char-2byte정수 부호x(양수만)
		// --------------------
//		char n1 = 65535;    //(0~2^16-1)(0~65535)
//		short n2 = 32767;    //(-2^15~+2^15-1)(-32768~+32767)
//		
//		char n3=60000;
//		short n4 = (short)n3;    // 문제발생... 왜?? char을 short로 만들어서 데이터 소실
//		
//		System.out.printf("%d\n", n4);
		
		// --------------------
		// 정수 long-8byte 정수 부호 o
		// --------------------
//		long n1 = 10;
//		long n2 = 20L;    // L, l(리터럴 접미사) : long 자료형 사용하여 값 저장
//		
//		long n3 = 10000000000;    // 문제발생.. 왜? 기본 자료형 int가 long 보다 용량이 작아서
//		long n4 = 10000000000L;
//		System.out.print(n3);
		
		// --------------------
		// 실수
		// --------------------
		// 유리수와 무리수의 통칭
		// 소숫점 이하 값을 가지는 수 123.456
		// float : 4byte 실수(6-9자리)
		// double : 8byte 실수(15-18자리), 기본 자료형
		
		// 정밀도 확인
//		float n1 = 0.123456789123456789F;    // f, F:float형 접미사
//		double n2 = 0.123456789123456789;
//		
//		System.out.println(n1);
//		System.out.println(n2);
		
		// --------------------
		// 단일문자 char 2byte 정수
		// --------------------
//		char ch1 = 'a';
//		System.out.println(ch1);
//		System.out.println((int)ch1);    // 011000001
//		
//		char ch2 = 98;
//		System.out.println(ch2);
//		System.out.println((int)ch2);    // 011000010
//		
//		char ch3 = 'b'+1;
//		System.out.println(ch3);
//		System.out.println((int)ch3);    // 011000011
//		
//		byte ch4 = 'c'+2;
//		System.out.println((char)ch4);
//		System.out.println(ch4);    // 011000011
//		
//		char ch5 = '가';
//		char ch6 = 0xac00+1;
//		System.out.printf("%c %c\n", ch5, ch6);
		
		// \\u : 유니코드 값 이스케이프 문자
//		System.out.printf("%c\n", '\uAC80');
//		
//		System.out.printf("TEST : %c\n", '\ud7fb');
		
		// --------------------
		// 문자열 : String (클래스 자료형)
		// --------------------
		
		// 기본자료형(원시 타입)
//		byte n1;
//		short n2;
//		double n3;
//		long n4;
		
		// 클래스 자료형
		// 클래스 자료형으로 만든 변수는 '참조 변수'라고 하고
		// 참조 변수는 데이터가 저장된 위치 정보(메모리 주소값)이 저장된다.
//		int n1 = 10;
//		String name = "홍길동";
//		String job = "프로그래머";
//		System.out.println(name);
//		System.out.println(job);
		
		// --------------------
		// boolean : 논리형(true/false 저장)
		// --------------------
		
		boolean flag = (10>5);    // 참(긍정)
		if(flag)
		{
			System.out.println("참인 경우 실행");
		}
		else
		{
			System.out.println("거짓인 경우 실행");
		}
		
		String var = "나의직업은 \"개발자\" 입니다.";
		System.out.println(1e4);
		System.out.println(1e-2);
		int v2 = 1e2;

	}

}
