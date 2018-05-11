package com.bsutility.cert.pojo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author adminytf
 *
 */
@Document(collection = "cert")
public class Cert {
	
	@Id
	private String cn;
	private String type;
	private List<String> ipAddr;
	private int isAdminCert;

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(List<String> ipAddr) {
		this.ipAddr = ipAddr;
	}

	public int getIsAdminCert() {
		return isAdminCert;
	}

	public void setIsAdminCert(int isAdminCert) {
		this.isAdminCert = isAdminCert;
	}

	@Override
	public String toString() {
		return "Cert [cn=" + cn + ", type=" + type + ", ipAddr=" + ipAddr + ", isAdminCert=" + isAdminCert + "]";
	}

}
