package test;

public class A {
	private B b;
	
	public A(B b) {
		this.b=b;
	}
	public void a() {
		System.out.println("IOC xml a");
		b.b();
	}
}
