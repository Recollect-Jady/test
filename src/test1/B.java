package test1;

public class B {
	private C c;
	public C getC() {
		return c;
	}
	public void setC(C c) {
		this.c = c;
	}
	public void b() {
		// TODO Auto-generated method stub
		
		System.out.println("B");
		c.c();
	}
	
	

}
