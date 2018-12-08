package Bisnis;

public class Account {
	private int id;
	private String account_number;
	private String name;
	private String address;
	
	public Account() {}
	public Account(int id, String account_number, String name, String address) {
		this.id = id;
		this.account_number = account_number;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
