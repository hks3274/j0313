package api4_String;


public class T02_subString {
	public static void main(String[] args) {
		//						 0         1         2
		//             012345678901234567890
		String msg1 = "welcome to korea!!";
		String msg2 = "한국에 방문하신 것을 환영합니다.";
		
		//subString() : 지정된 위치(인덱스번지)의 값을 출력
		// subString(n) : 지정된 위치(인덱스번지)의 위치부터 마지막까지 문자열을 출력
		//subString(n,m) : n 위치부터 지정된 위치(인덱스번지)의 m-1위치까지 마지막까지 문자열을 출력
		System.out.println("1. msg1에 세번째 인덱스 위치부터 출력? " + msg1.substring(3));
		System.out.println("2. msg1에 세번째 인덱스 위치부터 출력? " + msg1.substring(3,12));
		 
		//여기서 ko~단어를 출력하시오.
		System.out.println("ko~"+ msg1.indexOf("ko"));
		System.out.println("!~"+ msg1.indexOf("!"));
		System.out.println("korea : "+ msg1.substring(msg1.indexOf("ko"), msg1.indexOf("!")));
	}
}

//1.입력을 받아놓고
//몇개의 있는지 확인하고 몇번지에 있는지
