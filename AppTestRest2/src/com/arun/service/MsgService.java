package com.arun.service;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.arun.model.LoginModel;
import com.google.gson.Gson;

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
	public HttpServletResponse  printEmployeeDetails(LoginModel loginModel, @Context HttpServletResponse httpServletResponse) throws IOException
	{
		System.out.println("Printing response*************");
		System.out.println("Username : "+loginModel.getUsername());
		System.out.println("Password : "+loginModel.getPassword());
		
		populateResponseHeaders(httpServletResponse);
		populateHttpResponse(loginModel,httpServletResponse);
		return httpServletResponse;
	}

	private void populateHttpResponse(LoginModel loginModel, HttpServletResponse httpServletResponse) throws IOException {
		try
		{
			Gson gson = new Gson();
			String respString = gson.toJson(loginModel);
			httpServletResponse.getOutputStream().write(respString.getBytes());
			httpServletResponse.getOutputStream().flush();
		}
		finally 
		{
			httpServletResponse.getOutputStream().close();
		}
	}

	private void populateResponseHeaders(HttpServletResponse httpServletResponse) {
        System.out.println("setting  Expires header");
        httpServletResponse.setHeader("Expires", "-1");
        System.out.println("setting  Content-Security-Policy header");
        httpServletResponse.setHeader("Content-Security-Policy", "frame-ancestors 'none' ;");
        System.out.println("setting X-Frame-Options header ");
        httpServletResponse.setHeader("X-Frame-Options", "DENY");
        System.out.println("setting Pragma header ");
        httpServletResponse.setHeader("Pragma", "no-cache");
        System.out.println("setting  Cache-Control header ");
        httpServletResponse.setHeader("Cache-Control", "no-store,no-cache,must-revalidate");
        httpServletResponse.addHeader("Cache-Control", "post-check=0,pre-check=0");
	}
}
