class A {
	public void method(I i) {
		i.method();
	}
}
class B implements I {
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class C implements I {
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}

interface I {
	public void method();
}


public class Main {
	public static void main(String[] args) {
		
		A a = new A();
		a.method(new C());
		
		
	}
}
