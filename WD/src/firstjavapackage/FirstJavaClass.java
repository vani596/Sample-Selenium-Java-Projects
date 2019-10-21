package firstjavapackage;

public class FirstJavaClass {

	int x = 1;

	public String addString() {
		String str1 = "selenium";
		String str2 = "webdriver";
		String str3 = str1 + str2;
		return str3;
	}

	public static void main(String[] args) {

		FirstJavaClass obj1 = new FirstJavaClass();
		System.out.println(obj1.x);

		obj1.addString();

	}

}
