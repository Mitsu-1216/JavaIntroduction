package introduction.introduction17;

public class Person {
	int age; 

	public void setAge(int age) {
		if(age < 0) {
			throw new IllegalCallerException
			("年齢は0以上の数を指定すべきです。指定値は" + age);
		}

		this.age = age;
	}
	
}