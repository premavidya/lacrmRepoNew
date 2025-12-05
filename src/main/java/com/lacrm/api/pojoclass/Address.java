package com.lacrm.api.pojoclass;

public class Address {

	private String street;
	private String city;
	private String state;
	private String country;
	private int zip;
	
	public Address(String street,String city,String state,String country,int zip)
	{
		this.street=street;
		this.city=city;
		this.state=state;
		this.country=country;
		this.zip = zip;
	}
	public Address()
	{
		
	}
	public String getStreet()
	{
		return street;
	}
	public String getCity()
	{
		return city;
	}
	public String getState()
	{
		return state;
	}
	public String getCountry()
	{
		return country;
	}
	public int getZip()
	{
		return zip;
	}
	public void setStreet(String street)
	{
		this.street=street;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public void setState(String state)
	{
		this.state=state;
	}
	public void setCountry(String country)
	{
		this.country=country;
	}
	public void setZip(int zip)
	{
		this.zip=zip;
	}
}
