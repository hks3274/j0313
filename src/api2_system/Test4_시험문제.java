package api2_system;

public class Test4_시험문제 { //시험문제에 있음 = 이지하군
	public static void main(String[] args) {
		int tot = 0;
		long startTime = System.nanoTime();
		
		
		for (int i = 1; i < 100000000; i++) {
			 tot += i;
		}
		
		long endTime = System.nanoTime();
		
		System.out.println("작업에 소모되는 시간? "+ (endTime-startTime));
		System.out.println("작업끝");
		
	}
}
