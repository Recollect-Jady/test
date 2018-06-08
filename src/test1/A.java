package test1;

public class A {
	private B b;

	public A(B b) {
		this.b = b;
	}

	public void a() {
		System.out.println("A");

		b.b();
	}
}
