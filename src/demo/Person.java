package demo;

public class Person {
	private String name;
	private String dob;
	private String age;

	public Person() {
	}

	public Person(String name, String dob, String age) {
		super();
		this.name = name;
		this.dob = dob;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", age=" + age + "]";
	}

}
