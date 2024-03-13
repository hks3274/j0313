package api2_system;

public class Test3 {
	public static void main(String[] args) {
		int i, tot = 0;
		
		for (i = 1; i < 100000000; i++) {
			 tot += i;
			 if(tot >= 10000) {
				 System.out.println("합이 10000 이상일때 i값은? " + i);
//				 break;
//				 return; //이렇게 하는 방법도 있지만 JVM에서 헷갈릴 수 있음
				 System.exit(0); //시스템 종료버튼 ==> JVM에서 완벽하게 종료 됨
			 }
		}
		System.out.println("작업끝");
		
	}
}
