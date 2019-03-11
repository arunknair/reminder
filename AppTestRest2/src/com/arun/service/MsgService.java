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
import javax.ws.rs.core.Response;

import com.arun.base.BaseService;
import com.arun.dao.MsgDAO;
import com.arun.model.LoginModel;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Path("/msg")
public class MsgService extends BaseService {

	@GET
	@Path("/hello")
	public String print() {
		System.out.println("Printing response*************");
		return "HWLDOIHJOHUIOGHDIUHUIH";
	}

	@POST
	@Path("/employee-details")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response printEmployeeDetails(LoginModel loginModel, @Context HttpServletResponse httpServletResponse)
			throws IOException {
		System.out.println("Printing response*************");
		System.out.println("Username : " + loginModel.getUsername());
		System.out.println("Password : " + loginModel.getPassword());

		setConnection(createConnection());
		MsgDAO msgDAO = new MsgDAO();
		msgDAO.setConnection(getConnection());

		msgDAO.getSimpleCount();

		String jsonObject = populateHttpResponse(loginModel, httpServletResponse);
		return Response.status(200).entity(jsonObject).build();
	}

	private String populateHttpResponse(LoginModel loginModel, HttpServletResponse httpServletResponse)
			throws IOException {
		Gson gson = new Gson();
		String respString = gson.toJson(loginModel);
		JsonObject jsonObject = (JsonObject) new JsonParser().parse(respString);
		return respString;
	}

}
