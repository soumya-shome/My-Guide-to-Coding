public class Passenger{
    private int ticketid;
    private String name;
    private String gender;
    private String address;
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Passenger(int ticketid, String name, String gender, String address) {
		super();
		this.ticketid = ticketid;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}
	@Override
	public String toString() {
		String s="ticketid:"+ticketid+",name:"+name+",gender:"+gender+",address:"+address;
		return s;
	}
    
}