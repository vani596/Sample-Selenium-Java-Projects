package firstjavapackage;

public class StringMethodsExample {
	public static void main(String[] args) {
		String b ="AutomationTesting";
		System.out.println(b.length());
		
		String uppercaseString=b.toUpperCase();
		System.out.println(uppercaseString);
		
		String lowerCaseString=b.toLowerCase();
		System.out.println(lowerCaseString);
		char chr=b.charAt(10);
		System.out.println(chr);
		
		int firstIndex=b.indexOf("o");
		System.out.println(firstIndex);
		
		int secondIndex=b.indexOf("o",firstIndex+1);
		System.out.println(secondIndex);
		
		
		String replacedString=b.replace("Testing", "keerthi");
		System.out.println(replacedString);
		
		}

}
