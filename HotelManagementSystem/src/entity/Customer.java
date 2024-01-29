package entity;

public class Customer {
	private String cname;
	private int cid;
	private long cphno;
	private String cemail;
	private String cpan;
	private double camt;
	private Address caddress;
	
	public Customer(String cname, int cid, long cphno, String cemail, String cpan, Address caddress) {
		this.cname = cname;
		this.cid = cid;
		this.cphno = cphno;
		this.cemail = cemail;
		this.cpan = cpan;
		this.caddress = caddress;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public long getCphno() {
		return cphno;
	}

	public void setCphno(long cphno) {
		this.cphno = cphno;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCpan() {
		return cpan;
	}

	public void setCpan(String cpan) {
		this.cpan = cpan;
	}

	public Address getCaddress() {
		return caddress;
	}

	public void setCaddress(Address caddress) {
		this.caddress = caddress;
	}

	public double getCamt() {
		return camt;
	}

	public void setCamt(double camt) {
		this.camt = camt;
	}

	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", cid=" + cid + ", cphno=" + cphno + ", cemail=" + cemail + ", cpan="
				+ cpan + ", camt=" + camt + ", caddress=" + caddress + "]";
	}
	
	
}
