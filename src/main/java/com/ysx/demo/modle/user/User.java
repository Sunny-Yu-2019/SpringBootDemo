
package com.ysx.demo.modle.user;

import java.io.Serializable;
/**
 * 
 * @author haidiyixiaoyu
 *
 */
public class User implements Serializable {

	private String account;
	
	private String passWord;
	
	private String userName;

	private Integer age;
	
	private Long version;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "User [account = "+account+", userName=" + userName + ", age=" + age + ", version"+ version +"]";
	}
}
