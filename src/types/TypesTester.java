package types;
import types.Sequence;;

public class TypesTester {
	public static void main(String[] args) {
		Integer[] testBuff = {0, 1, 2, 3, 4, 5};
		Sequence<Integer> testSeq = new Sequence<Integer>(
			"testDev",
			"testDescr",
			0,
			1,
			"u",
			0.5,
			testBuff
		);
		System.out.println(testSeq);
	}

}
