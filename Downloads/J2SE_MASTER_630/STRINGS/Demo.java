Using String
   String s="Sai"; vs
   String s=new String("Sai");

   constructors:
   String()
   String s=new String();

   String(String)
   String s=new String("welcome");
   System.out.println(s);  //welcome
   
   String(char[])
   char[ ] x={'w','e','l','c','o','m','e'};
   String s=new String(x);
   System.out.println(x); //welcome

   String(char[],int sp,int noc)
      char[ ] x={'w','e','l','c','o','m','e'};
	  String s=new String(x,3,4);
	  System.out.println(s);  //come

Methods :
   public int length():
      IQ's:  length vs length( )

   public boolean equals(Object);
       IQs:  == vs equals()









         

Using StringBuffer
Using StringBuilder
Using StringTokenizer
