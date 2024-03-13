package api4_String;

public class T05_getChars {
	public static void main(String[] args) {
		String str1 = "Hello1";
		
		
		char[] strArr = new char[str1.length()];
		str1.getChars(0, str1.length(), strArr, 0); //문자열의 시작, 문자열의 끝, 받는배열, 배열의시작위치 ==> 배열 복사하는 것이다.
		System.out.println("strArr : "+ strArr); //향상된 for문을 사용하면 편하다
		
		String temp = "";
		
		for( char str : strArr) {
			temp += str+"/";
		}
		System.out.println(temp.substring(0, temp.length()-1));
	}
}
