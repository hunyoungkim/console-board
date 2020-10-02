package j.t1.model;

import java.util.Date;

public class Command {

	private String user;
	private int pass;
	private String email;
	private String subject;
	private String content;
	private Date cdate;
	private Date udate;
	
	public Command() {
		// TODO Auto-generated constructor stub
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	public Date getUdate() {
		return udate;
	}
	public void setUdate(Date udate) {
		this.udate = udate;
	}

	public Command(String user, int pass, String email, String subject, String content, Date cdate, Date udate) {
		super();
		this.user = user;
		this.pass = pass;
		this.email = email;
		this.subject = subject;
		this.content = content;
		this.cdate = cdate;
		this.udate = udate;
	}

	@Override
	public String toString() {
		return "Command [user=" + user + ", pass=" + pass + ", email=" + email + ", subject=" + subject + ", content="
				+ content + ", cdate=" + cdate + ", udate=" + udate + "]";
	}
	
}
