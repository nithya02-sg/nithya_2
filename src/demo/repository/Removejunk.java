package demo.repository;

public class Removejunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		                 //Using regular expression [^a-zA-Z0-9]-->this will keep only
		                  //alphabets and num from 0-9
String s="&*()(** Seleniumtest";
s=s.replaceAll("[^a-zA-Z0-9]", "");
System.out.println(s);
	}
	//System.out.println(s);
}

