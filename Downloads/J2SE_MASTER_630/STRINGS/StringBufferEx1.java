class StringBufferEx{
	public static void main(String args[]){
		StringBuffer sb=new StringBuffer("chinni");
System.out.println("Data : "+sb);
System.out.println("Capacity : "+sb.capacity());
System.out.println("Length : "+sb.length());

System.out.println
	("Append : "+sb.append("Khanna"));
System.out.println
	("Insert : "+sb.insert(6,"-"));

System.out.println
	("Delete : "+sb.deleteCharAt(6));

System.out.println("Reverse : "+sb.reverse());
	}

}