package practicalTasks;

class Admin {
	void name() {
		System.out.println("head: Viditha");
	}
}

class Study extends Admin {
	@Override
	void name() {
		System.out.println("head: Akshara");
	}
}

class Faculty extends Admin {
	@Override
	void name() {
		System.out.println("head: Swapnika");
	}
}

public class Task4 {

	public static void main(String[] args) {
		Admin a = new Admin();
		Admin s = new Study();
		Admin f = new Faculty();

		a.name();
		s.name();
		f.name();
	}
}
