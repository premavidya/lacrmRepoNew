package com.lacrm.api.endpoints;

public interface IEndPoints {

	public String CreateContact="/addContact";
	public String GetUsers="/Settings/Users";
	public String DeleteContact="/app/{DeleteContact}";
	public String EditContact="/app/{EditContact}";
	public String Login="/app/login";
}
