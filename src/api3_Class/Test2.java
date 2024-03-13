package api3_Class;

public class Test2 {
	public static void main(String[] args) {

		try {
			Class.forName("java.lang.String");
			System.out.println("String클래스가 존재합니다");
			
			//객체의 정보(Test1.class) 알아내어 출력하기
			Class clazz = Test1.class; 
			System.out.println("전체이름(패키지명 + 파일명) : "+ clazz.getName());
			System.out.println("패키지명 : "+ clazz.getPackage());
			System.out.println("타입명(패키지명+ 객체타입) : "+ clazz.getTypeName());
			System.out.println("simple이름 : "+ clazz.getSimpleName());
			System.out.println();
			
			
			//중요 => 경로를 알아야 함 ==> 파일을 업로드 다운로드 할 수 있도록 해야함
			Class imgPath = Test2.class; //이미지 경로 가져오기
			System.out.println("그림파일의 경로명 : " + imgPath.getResource("./images/121.jpg").getPath()); //상대경로로 적었음
			System.out.println("Test2.class의 경로명 : " + imgPath.getResource("Test2.class").getPath()); //자신의 위치이므로 자신의 이름을 적으면 된다
			System.out.println("Test2.class의 경로명 : " + clazz.getResource("Test2.class").getPath()); 
			System.out.println("현재 작업경로 루트(/) : " + clazz.getResource("/").getPath()); 
			System.out.println("그림파일의 경로명1 : " + imgPath.getResource("/api3_Class/images/122.jpg").getPath()); 
//		잘못된 경로와 파일명을 입력하면 NullPountException에러 발생
//		System.out.println("그림파일의 경로명 2: " + imgPath.getResource("/images/122.jpg").getPath()); 
			System.out.println("api2_system패키지의 Test1.class 경로명1 : " + imgPath.getResource("../api2_system/Test1.class").getPath()); //상대경로 
			System.out.println("api2_system패키지의 Test1.class 경로명1 : " + imgPath.getResource("/api2_system/Test1.class").getPath()); //절대경로
			System.out.println("api2_system패키지의 Test1.class 경로명1 : " + imgPath.getResource("j0313_AIP/src/api2_system/Test1.class").getPath()); //최상위 폴더를 벗어나버림 +> src가 최상위 폴더임
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 파일이 존재하지 않습니다" + e.getMessage());
		} finally {
			System.out.println("작업 끝");
		}
		
	}
}
