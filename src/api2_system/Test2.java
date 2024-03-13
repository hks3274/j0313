package api2_system;

public class Test2 {
	public static void main(String[] args) {
		int i, tot = 0;
		
		for (i = 1; i < 100000000; i++) {
			 tot += i;
			 if(tot >= 10000) {
				 System.out.println("합이 10000 이상일때 i값은? " + i);
//				 break;
				 return;
			 }
		}
		System.out.println("작업끝");
		
	}
}
