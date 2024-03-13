package api4_String;

public class T01_trim { //
	public static void main(String[] args) {
		String str1 = "   안    녕   ";
		String res1, res2;
		
		res1 = "1234" + str1 + "opq";
		System.out.println("res :"+ res1);
		
		res2 = "1234" + str1.trim() + "opq";
		System.out.println("res :"+ res2);
	}
}
