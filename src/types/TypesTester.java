package types;
import types.Sequence;;

public class TypesTester {
	public static void main(String[] args) {
		Sequence<Integer> testSeq = new Sequence<Integer>("testDev","testDescr",0, 1, "u", 0.5, null);
		System.out.println(testSeq);
	}

}
