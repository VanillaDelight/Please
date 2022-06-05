package Lambda2;

import java.util.function.Consumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx1 {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		
		c.accept("String");
		
		ObjIntConsumer<String> c2 = (s, i) -> System.out.println(i + ", " + s);
		ObjDoubleConsumer<String> c3 = (s, d) -> System.out.println(d + ", " + s);
		
		double d = 1.1;
		
		c3.accept("apple", d++);
		c3.accept("vanilla", d++);
		c3.accept("Delight", d++);
		
		int n = 1;
		
		c2.accept("toy", n++);
		c2.accept("box", n++);
		c2.accept("robot", n++);
	}

}
