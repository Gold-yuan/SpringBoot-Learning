package com.didispace.bean;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author adminytf
 *
 */

@Document(collection = "user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = -3258839839160856613L;
	@Id
	private Long id;
	private String userName;
	private String passWord;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userName=" + userName + ", passWord=" + passWord + "]";
	}

}