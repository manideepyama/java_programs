import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegEx1{
	public static void main(String args[]){
		Pattern p=Pattern.compile("h");
		Matcher m=p.matcher("shashi");

		while(m.find())
		     { System.out.println
			          ("Found @ : "+m.start()
			                +" Match : "+m.group());  }
	}
}