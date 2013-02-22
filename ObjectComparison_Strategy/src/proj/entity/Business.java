package proj.entity;

public class Business{
private String businessName;
private String address;
private String city;
private String zip;
private String phoneNumber;
private String description;

public String getBusinessName() {
	return businessName;
}
public void setBusinessName(String businessName) {
	this.businessName = businessName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

@Override
public String toString()
{
	return "Business name: "+this.businessName+" Address: "+this.address+" City: "+this.city
			+" Zip Code: "+this.zip+" Phone Number: "+this.phoneNumber+"\nDescription:\n"+this.description;
}

}
