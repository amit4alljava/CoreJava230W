package com.srivastava.actions;

import com.opensymphony.xwork2.ActionSupport;

// 1st Way Make it  POJO
// 2nd Way implement Action Interface
// 3rd Way Use ActionSupport Class (I18N + Validation) (No Need to Override execute )
public class LoginAction extends ActionSupport{ //implements Action {
private String userid;
private String pwd;
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
@Override
public void validate(){
	
}

// this method will call after setters
public String checkLogin(){
	if(this.getUserid().equals(this.getPwd())){
		this.setMessage("Welcome "+this.getUserid());
		return SUCCESS;
		//return "success";
	}
	else
	{
		this.setMessage("Invalid Userid or Password");
		return ERROR;
		//return "error";
	}
}

public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}

@Override
public String execute() throws Exception {
	// TODO Auto-generated method stub
	return null;
}


}
