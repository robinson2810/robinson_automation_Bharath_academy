package praticeJava;

public class Stringmethods {
	public static void main(String[] args) {
		
	
String [] names = {"robinson","34JanA@&@#^&@^Ni12","zara"};
System.out.println(names.length);
System.out.println(names[1].replaceAll("[^A-Za-z]", ""));


System.out.println(names[0].substring(5,8));

String sentences = "startsWith, endsWith ==> to check whether the string starts or ends with a";
String [] sen = sentences.split(" ");
for(String ken : sen) {
	System.out.println(ken);
}
}
	}