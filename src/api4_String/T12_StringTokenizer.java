package api4_String;

import java.util.StringTokenizer;

public class T12_StringTokenizer {
	public static void main(String[] args) {
		//StringTokenizer() : 문자열을 특정 문자(열)로 분리시킨 후 분리 된 각각의 토큰을 내부반복자(이터레이터)로 호출시켜준다.
		
		String tel = "010-1234-5678";
		
		StringTokenizer telArr =  new StringTokenizer(tel,"-");
		
		System.out.println("telArr토큰의 갯수? "+ telArr.countTokens());
		
		String str = "";
		while(telArr.hasMoreElements()) {
			str += telArr.nextToken() + "/"; //이터레이터 방식
		}
		
		System.out.println("str : "+str.substring(0, str.length()-1));
	}
}
