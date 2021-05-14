package beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	int eid;
	String ename;
	List skillset;
	Set phoneNumbers;
	Map emailIds;
	Properties app_pro;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int eid, String ename, List skillset, Set phoneNumbers, Map emailIds, Properties app_pro) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.skillset = skillset;
		this.phoneNumbers = phoneNumbers;
		this.emailIds = emailIds;
		this.app_pro = app_pro;
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List getSkillset() {
		return skillset;
	}
	public void setSkillset(List skillset) {
		this.skillset = skillset;
	}
	public Set getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(Set phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Map getEmailIds() {
		return emailIds;
	}

	public void setEmailIds(Map emailIds) {
		this.emailIds = emailIds;
	}

	public Properties getApp_pro() {
		return app_pro;
	}

	public void setApp_pro(Properties app_pro) {
		this.app_pro = app_pro;
	}
	

}
