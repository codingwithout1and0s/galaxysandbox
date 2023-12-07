package org.comit.galaxysandbox.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="users") // will create table called User (based on Class name)
@Table(name="users") // writes to table users instead of User (as User is a keyword in MYSQL)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(
			name = "USER_ID",
			updatable = false
			)
	private Long userId;
	
	@Column(
			name="USER_NAME",
			nullable = false,
			columnDefinition = "TEXT"
	)
	private String userName;
	
	@Column(
			name="PASSWORD",
			nullable = false,
			columnDefinition = "TEXT",
			unique = true
	)
	private String userPassword;
	
	@Column(
			name="USER_NICKNAME",
			nullable = false,
			columnDefinition = "TEXT",
			unique = true
	)
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
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userNickname=" + userNickname + "]";
	}
		
}
