package types;
import types.Packet;

public class TypesTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Packet testPack = new Packet("testDev","testDescr",100);
		System.out.println(testPack);
		Packet testPackDate = new Packet("testDev2","testDescr2",0);
		System.out.println("date -> "+testPackDate.toString());
		Packet testPackSimple = new Packet("simple");
		System.out.println("simple -> "+testPackSimple.toString());
	}

}
