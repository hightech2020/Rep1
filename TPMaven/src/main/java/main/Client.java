package main;



import java.util.Calendar;
import java.util.Date;

/**
 * @author PC
 *
 */
public class Client {
	
	private String  ID ;
	private String  nom ;
	private String  prenom ;
	private String  email ;
	private String  password ;
	private Date date_naissance;
	private String tel;
	
	private boolean isPremium ;
	private int ptsFid ;
	public Client(String iD, String nom, String prenom, String email, String password, java.util.Date date1, String tel,
			boolean isPremium, int ptsFid) {
		super();
		ID = iD;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.date_naissance = (Date) date1;
		this.tel = tel;
		this.isPremium = isPremium;
		this.ptsFid = ptsFid;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public boolean isPremium() {
		return isPremium;
	}
	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}
	public int getPtsFid() {
		return ptsFid;
	}
	public void setPtsFid(int ptsFid) {
		this.ptsFid = ptsFid;
	}
	
	
	public int CalAge()
	{
		System.out.println(Calendar.getInstance().get(Calendar.YEAR));
		System.out.println(this.date_naissance.getYear());
		int age =  Calendar.getInstance().get(Calendar.YEAR) - this.date_naissance.getYear() -1900;
		return age;
	}
			  
	
	
}
