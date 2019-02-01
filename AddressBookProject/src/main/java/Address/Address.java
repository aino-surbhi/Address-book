package Address;

import java.io.Serializable;

public class Address implements Serializable {
 String name;
 String emailId;
 int phoneNo;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
@Override
public String toString() {
	return "Address [name=" + name + ", emailId=" + emailId + ", phoneNo=" + phoneNo + "]";
}
public int getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(int phoneNo) {
	this.phoneNo = phoneNo;
}
}
