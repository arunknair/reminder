package com.arun.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arun.model.LoginModel;

@Path("/msg")
public class MsgService {

	@GET
	@Path("/hello")
	public String print()
	{
		System.out.println("Printing response*************");
		return "HWLDOIHJOHUIOGHDIUHUIH";
	}
	
	@POST
	@Path("/employee-details")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String printEmployeeDetails(LoginModel loginModel)
	{
		System.out.println("Printing response*************");
		System.out.println("Username : "+loginModel.getUsername());
		System.out.println("Password : "+loginModel.getPassword());
		
		return "ID : "+loginModel.getUsername()+"\nNAME : "+loginModel.getPassword();
	}
}
