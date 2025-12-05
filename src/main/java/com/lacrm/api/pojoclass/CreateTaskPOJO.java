package com.lacrm.api.pojoclass;


import java.util.List;

public class CreateTaskPOJO {

	private String status;
	private User userInfo;
	private List<Tasks> tasks;
	
	public CreateTaskPOJO(String status, User userInfo, List< Tasks> tasks)
	{
		this.status=status;
		this.userInfo = userInfo;
		this.tasks = tasks;
	}
	public CreateTaskPOJO()
	{	}
	
	public void setStatus(String status)
	{
		this.status=status;
	}
	public void setUserInfo(User userInfo)
	{
		this.userInfo=userInfo;
	}
	public void setTasks(List<Tasks> tasks)
	{
		this.tasks=tasks;
	}
	public String getStatus()
	{
		return status;
	}
	public User getuserInfo()
	{
		return userInfo;
	}
	public List<Tasks> gettasks()
	{
		return tasks;
	}
}
class User
{
  private String id;
  private String name;
  private String role;
  
  public User(String id,String name,String role)
  {
	  
  }
  public User() {}
  public void setId(String id)
  {
	  this.id=id;
  }
  public void setName(String name)
  {
	  this.name=name;
   }
  public void setRole(String role)
  {
	  this.role=role;
  }
  public String getId()
  {
	  return id;
  }
  public String getName()
  {
	  return name;
  }
  public String getRole()
  {
	  return role;
  }
}

class Tasks
{
	private String id;
	private String title;
	private String due;
	private String priority;
	private String status;
	
	public Tasks(String id,String title,String due,String priority,String status)
	{
		this.id=id;
		this.title=title;
		this.due = due;
		this.priority=priority;
		this.status=status;
	}
	public Tasks() {}
	public void setId(String id)
	{
		this.id=id;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setDue(String due)
	{
		this.due=due;
	}
	public void setPriority(String priority)
	{
		this.priority=priority;
	}
	public void setStatus(String status)
	{
		this.status=status;
	}
	public String getId()
	{
		return id;
	}
	public String getDue()
	{
		return due;
	}
	public String getTitle()
	{
		return title;
	}
	public String getPriority()
	{
		return priority;
	}
	public String getStatus()
	{
		return status;
	}
}
