interface IntA{
	// protected void method1();   CE
	// private void method2();  CE
	static abstract void method3();
	
	// final void method4(); CE
	public void method5();
	abstract void method6();
}