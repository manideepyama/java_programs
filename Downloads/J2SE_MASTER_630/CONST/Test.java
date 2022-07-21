class Test{
	Test( )
		{ System.out.println("Def  ");}
	
	Test(int x){
		this();
		System.out.println("1 para : "+x); }

	Test(int x,int y){
		this(90);
		System.out.println("2 para : "+x+" "+y);  }

	static public void main(String args[])
	   { Test t=new Test(10,20); }
}


