package com.arun.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.arun.service.MsgService;

public class RestApp extends Application{
	
	private Set<Object> singleton = new HashSet<Object>();

	public Set<Object> getSingleton() {
		return singleton;
	}
	
	public RestApp()
	{
		singleton.add(new MsgService());
	}

}
