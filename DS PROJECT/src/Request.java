
public class Request {
	String fname,lname,email,attrname,date,message;
	int reqid;
	
	
	public Request() {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.attrname = attrname;
		this.date = date;
		this.message = message;
		this.reqid = reqid;
	}
	
	public Request(String fname, String lname, String email, String attrname, String date,String message, int reqid) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.attrname = attrname;
		this.date = date;
		this.message = message;
		this.reqid = reqid;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAttrname() {
		return attrname;
	}
	public void setAttrname(String attrname) {
		this.attrname = attrname;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getReqid() {
		return reqid;
	}
	public void setReqid(int reqid) {
		this.reqid = reqid;
	}
	
	
}
