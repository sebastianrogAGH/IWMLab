package types;
import java.util.Arrays;

public class Sequence<T> extends Packet {
	
	protected int m_channelNr;
	protected String m_unit;
	protected double m_resolution;
	protected T[] m_buffer;

	public Sequence() {
		super();
		m_channelNr = 0;
		m_unit = "empty unit";
		m_resolution = 0.0;
		m_buffer = null;
	}

	public Sequence(String str) {
		super(str);
		m_channelNr = 0;
		m_unit = "unit"+str;
		m_resolution = 0.0;
		m_buffer = null;
	}

	public Sequence(String device, String description, long date, int channelNr, String unit, double res, T[] buff) {
		super(device, description, date);
		m_channelNr = channelNr;
		m_unit = unit;
		m_resolution = res;
		m_buffer = buff;
	}
	
	public String toString(){
		return super.toString() + " Sequence: [channelNr=" + m_channelNr + ", unit=" + m_unit + ", resolution=" + m_resolution + " buffer = "+Arrays.toString(m_buffer)+"]";
	}

}
