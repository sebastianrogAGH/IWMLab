package types;

public class Packet {
	protected String m_device;
	protected String m_description;
	protected long m_date;
	
	public Packet(){
		m_device = "empty device name";
		m_description = "empty description";
		m_date = 0;
	}
	
	public Packet(String str){
		m_device = "dev"+str;
		m_description = "descr"+str;
		m_date = System.currentTimeMillis() / 1000L;
	}

	public Packet(String device, String description, long date) {
		m_device = device;
		m_description = description;
		if(date == 0)
			m_date = System.currentTimeMillis() / 1000L;
		else
			m_date = date;
	}

	public String toString() {
		return "Packet: [device=" + m_device + ", description=" + m_description + ", date=" + m_date + "]";
	}
}
