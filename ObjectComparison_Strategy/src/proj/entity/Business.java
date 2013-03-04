package proj.entity;

import java.util.Comparator;

public class Business implements Comparable<Business>{
private String businessName;
private String address;
private String city;
private String zip;
private String phoneNumber;
private String description;
private static Comparator<Business> comparator;

public String getBusinessName() {
	return this.businessName;
}
public void setBusinessName(String bName) {
	this.businessName = bName;
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

public static void setComparator(Comparator<Business> comp)
{
	Business.comparator=comp;
}

@Override
public String toString()
{
	return "Business name: "+this.businessName+"\tAddress: "+this.address+"\tCity: "+this.city
			+"\tZip Code: "+this.zip+"\tPhone Number: "+this.phoneNumber+"\tDescription:\n"+this.description+"\n";
}
@Override
public int compareTo(Business b) {
	return Business.comparator.compare(this, b);
}

}
