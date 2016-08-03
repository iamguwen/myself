package action;

public class User {
	private String username;
	private int age;
	private char sex;
	public User(String username, int age, char ch) {
		this.age = age;
		this.sex= ch;
		this.username= username;
	}
	public static void a(){
		
	}
	public User() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	

}
