import packageone.ClassOne;
import packagetwo.ClassTwo;

public class MyPackageTest {
	public static void main(String[] args){
		ClassTwo a = new ClassTwo();
		ClassOne b = new ClassOne();
		a.methodClassTwo();
		b.methodClassOne();
	}
}
