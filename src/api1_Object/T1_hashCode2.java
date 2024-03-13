package api1_Object;

import java.util.HashMap;

class Aa {
	String name;
	
	public Aa(String name) {
		this.name = name;
	}
}

class Bb {
	String name;
	
	public Bb(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) { //Object 객체이기 때문에 오버라이드가 된다.
		if(this.name == ((Bb)obj).name) return true; //동등비교 해쉬코드와 이퀄스가 같은 것을 동등비교하고 한다.
 		else return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
}

public class T1_hashCode2 {
	public static void main(String[] args) {
		/*
		 * hashMap, +==> 키와 값을 사용한 데이터에 사용
		 * "성명": "홍길동", " 성명":"23"
		 */
	
		HashMap<Integer, String> map = new HashMap<>(); //해쉬맵 생성
		
		map.put(1, "데이터1"); //데이터를 넣을 때는 put을 사용
		map.put(1, "데이터1"); //데이터가 같으면 겹쳐서 넣어짐
		map.put(2, "데이터2"); 
		System.out.println(map);
		
		
		HashMap<Aa, String> map2 = new HashMap<>();
		map2.put(new Aa("첫번째"), "데이터1" ); //실제 데이터의 주소는 다 다르다.
		map2.put(new Aa("첫번째"), "데이터2" );
		map2.put(new Aa("두번째"), "데이터3" );
		System.out.println(map2);
		
		
		HashMap<Bb, String> map3 = new HashMap<>();
		map3.put(new Bb("첫번째"), "데이터1" ); //실제 데이터의 주소는 다 다르다.
		map3.put(new Bb("첫번째"), "데이터2" );
		map3.put(new Bb("두번째"), "데이터3" );
		System.out.println(map3);
		
		
	}
	
}
