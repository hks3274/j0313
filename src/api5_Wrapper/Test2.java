package api5_Wrapper;

public class Test2 {
	public static void main(String[] args) {
		//객체에 정수값 대입시, 1byte의 저장법위인 -128 ~ 127 사이의 값은 해당 번지에 저장된다. "=="으로 비교하면 같은값으로 출력
		//그래서 결론은 객체의 비교시에는 equals 로 비교해야 한다.
		Integer objInt1 = 300;
		Integer objInt2 = 300;
		System.out.println("== : " + (objInt1 == objInt2)); 
		System.out.println("equals : " + (objInt1.equals(objInt2))); 
		
		Integer objInt3 = 10;
		Integer objInt4 = 10;
		System.out.println("== : " + (objInt3 == objInt4)); //왜 이렇게 되는거지? byte 타입으로 정수형이 저장된다.  
		System.out.println("equals : " + (objInt3.equals(objInt4))); 
		
	}
}
