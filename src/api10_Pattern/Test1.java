package api10_Pattern;

import java.util.regex.Pattern;

//정규식은 pattern클래스를 사용합니다.
//숫자 : ^[\\D]*$ ===> 숫자가 아닌것을 참으로 보겠다.

public class Test1 {
	public static void main(String[] args) {
		String str1 = "1234";
		String str2 = "12A34";	
		
		//정규식을 만들고 입력 데이터와 조건비교처리한다.
		String regExp = "^[\\d]*$";
		
		//1번 방법// 보통은 wrapper클래스로 만든다.
		Boolean pattern1 = Pattern.compile(regExp).matcher(str1).find();
		Boolean pattern2 = Pattern.compile(regExp).matcher(str2).find();
	
		
		System.out.println("1. : " + pattern1);
		System.out.println("2. : " + pattern2);
		
		//2번방법
		Boolean pattern3 = Pattern.matches(regExp, str1);
		Boolean pattern4 = Pattern.matches(regExp, str2);
		
		System.out.println("3. : " + pattern3);
		System.out.println("4. : " + pattern4);
		
		System.out.println("5. : " + Pattern.matches(regExp, str1));
		System.out.println("6. : " + Pattern.matches(regExp, str2));
		System.out.println();
		
		//프로그램에서의 적용예......
		if(Pattern.matches(regExp, str1)) System.out.println("숫자가 맞습니다");
		else System.out.println("숫자가 아닌 값을 포함하고 있습니다");
		
		if(Pattern.matches(regExp, str2)) System.out.println("숫자가 맞습니다");
		else System.out.println("숫자가 아닌 값을 포함하고 있습니다");
		
	}
}
