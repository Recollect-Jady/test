package test;

public class B {
	private C c;

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	public void b() {
		System.out.println("IOC xml b");
		c.c();
	}
}
