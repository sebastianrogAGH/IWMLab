package types;

public class Packet {
	protected String m_device;
	protected String m_description;
	protected long m_date;

	public Packet(String device, String description, long date) {
		m_device = device;
		m_description = description;
		m_date = date;
	}

	public String toString() {
		return "\n Packet: [device=" + m_device + ", description=" + m_description + ", date=" + m_date + "]";
	}
}
