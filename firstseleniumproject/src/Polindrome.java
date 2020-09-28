
public class Polindrome {
	
	 
	public static void main(String[] args){
		String a = "malayalam";
		String b = "";
	 char[] polindrome = a.toCharArray();
	for(int i=0;i<=polindrome.length-1;i++)
	{
	b = b+polindrome[i];
	}
	if (a.equals(b))
	{
	System.out.println("it is a polindrome");
	}
	else{
		System.out.println("not a polindrome");
	}

	}}
