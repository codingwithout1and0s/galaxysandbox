package org.comit.GalaxySandbox.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // will create table called User (based on Class name)
@Table(name="users") // writes to table users instead of User (as User is a keyword in MYSQL)
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Long userId;
	private String userName;
	private String userPassword;
	private String userNickname;
	
	public long getUserID() {
		return userId;
	}
	public void setUserID(long userID) {
		this.userId = userID;
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
