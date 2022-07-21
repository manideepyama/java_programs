import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegEx4{
	public static void main(String args[]){
Pattern p=Pattern.compile("a*");
Matcher m=p.matcher("abaabaaab");

while(m.find())
		   { System.out.println
	             ("Match : "+m.group()+
	               " Found @ : "+m.start());  }
	}
}

/* Userdefined Pattern 
[a] --> Only a or 'a'
[abc] --> Either a or b or c
[a-z] --> Only small Lts
[A-Z] --> Only C.Lts
[a-zA-Z] --> Only Alp
[^a-zA-z] --> Except Alp 

[0-9] --> Only digits or \d
[^0-9] --> \D
[a-zA-Z0-9] --- A|N -- \w
[^a-zA-Z0-9] -- Except A|N -- \W
*/












