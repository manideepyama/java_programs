import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegEx2{
	public static void main(String args[]){
		Pattern p=Pattern.compile(".");
		Matcher m=p.matcher("1ab2 CD !@3 K");

        while(m.find())
		   {  System.out.println
			        ("Found @ : "+m.start()+" Match : "+
			          m.group()); }
	}
}

/* Predefind char Pattern Classes 
\d  -- Only digits
\D -- Except Digits

\s -- Only Spaces 
\S -- Except Spaces 

\w - Word char | Alph and Num
\W - Except A|N

. -- Any Thing */












