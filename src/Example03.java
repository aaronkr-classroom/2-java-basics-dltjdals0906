
public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 6;
		short s = 2;
		int i = 12;
		long l = 123456789012345l;
		
		char c = 'y';
		char c2 = 88; //ASCII 코드
		String str = "Do you like pizza?";
		
		float f = 12.3456789f;
		double d = 1234567890.123456789; // 끝 자리 d 붙히는 거는 선택
		
		boolean bool = true;
		boolean bool2 = false; // true, false 는 소문자

		// 출력
		System.out.println(str);
		System.out.print(bool);
		System.out.print(" " + c);
		System.out.println(); // 다음 줄로 가기
		System.out.println("Numbers: ");
		System.out.print("\tBye: " + b);
		System.out.print("\tShort: " + s);
		System.out.print("\tint: " + i);
		System.out.print("\tFloat: " + l);
		System.out.print("\tDouble: " + d);
		// Double: 
		
		System.out.println("\nChar2: " + c2);
		char c3 = 89;
		System.out.print("\tShort: " + s);
			
	}

}
