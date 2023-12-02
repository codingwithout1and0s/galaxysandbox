package org.comit.GalaxySandbox.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	private long userID;
	private String userName;
	private String userPassword;
	private String userNickname;
	
	public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
		
}
