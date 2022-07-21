class Testing{
	static Testing t=new Testing();
	private Testing(){}
	static Testing getObject(){ return t; }
	void getData(){
	   System.out.println("Hello"); }
}

class OutSide{
	public static void main(String args[]){
		Testing t1=Testing.getObject();
		               t1.getData();
		Testing t2=Testing.getObject();
		              t2.getData();
	}
}