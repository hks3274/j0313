package api1_Object;

public class T2_toStringVO {
	private String name;
	private int age;
	private boolean gender;
	private String job;
	private String address;

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "T2_toStringVO [name=" + name + ", age=" + age + ", gender=" + gender + ", job=" + job + ", address="
				+ address + "]";
	}
	
//	@Override
//	public String toString() {ㄴㄴㄴ
//		return "VO = [name = "+name+" , age = "+age+" , gender = "+gender+" , job = "+job+" , address = "+address+" ]";
//	}
	//값을 전달을 확인하는 방법
	
	
	
}
