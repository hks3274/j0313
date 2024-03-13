package api4_String;

//contains() : 문자열의 포함유무(있으면 Ture, 없으면 false)
//concat() : 문자열과 문자열의 결합(+연산자와 비슷(?))

public class T13_concat {
	public static void main(String[] args) {
		String str1 = "서울";
		String str2 = "부산";
		String gubun = "%";
		String res = "";

		res = str1 + gubun + str2;

		System.out.println("1.res : " + res);
		
		res = str1.concat(gubun).concat(str2); 
		
		System.out.println("2. res : " + res);
		System.out.println();
		
		System.out.println(gubun.concat(str1).concat(gubun));
		
	}
}
