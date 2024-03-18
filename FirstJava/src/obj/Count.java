package obj;

public class Count {
	
	public int a = 0;
	public static int b = 0;
	
	public static int doIt() {
//		return ++a;// Cannot make a static reference to the non-static field a
//		return ++b;
		++new Count().a; // ++((new Count().a)
		return ++b;
	}

}
