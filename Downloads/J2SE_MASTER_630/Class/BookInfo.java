class BookInfo 
{  int pages; //instance field
    String bname; 
	float price;

	public static void main(String args[]){
		int x=123;  //local variable
		System.out.println("x val is : "+x);
		BookInfo b=new BookInfo( );

System.out.println("bname is : "+b.bname);
System.out.println("Pages is : "+b.pages);
System.out.println("Price is : "+b.price);
	}
}

