package api1_Object;

public class T2_toStringRun {
	public static void main(String[] args) {
		T2_toStringVO vo = new T2_toStringVO();
		
		String name = "김말숙";
		int age = 30;
		boolean gender = false;
		String job = "";
//		String job = null;
		String address = "청주";
		
		vo.setName(name);
		vo.setAge(age);
		vo.setGender(gender);
		vo.setJob(job);
		vo.setAddress(address);
		
		
		System.out.println("성명 : "+vo.getName());
		System.out.println("나이 : "+vo.getAge());
		System.out.println("성별 : "+vo.isGender());
		System.out.println("직업 : "+vo.getJob());
		System.out.println("주소 : "+vo.getAddress());
		System.out.println();
		
		System.out.println("vo : " + vo.toString()); 
		System.out.println("vo : " + vo); //워낙 많이 써서 생략해서 쓸 수 있더라 => 그렇게 사용하게 만들었으
	} 
}
