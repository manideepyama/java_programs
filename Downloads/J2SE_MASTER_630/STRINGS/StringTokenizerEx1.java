import java.util.StringTokenizer;
class StringTokenizerEx{
	public static void main(String args[]){
		StringTokenizer st=
			new StringTokenizer("welcome to sssit kphb hyd");
		int nt=st.countTokens();
		System.out.println("No.of.Tokens : "+nt);

		while( st.hasMoreTokens() ){
			String n=st.nextToken();
		//	System.out.println(n.toUpperCase());
			if(n.length()==5)
				System.out.println(n.toLowerCase());
		}
	}
}