package com.services;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.map.ObjectMapper;

import com.services.entity.Employee;

@Path("/employeeService")
public class EmployeeService {

	@GET
	@Path("/returnEmployeeObj")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee() {

		System.out.println("--------");

		return new Employee();
	}

	@GET
	@Path("/returnJsonAsString")
	public String getEmployeeAsString() {

		System.out.println("--------");

		ObjectMapper map = new ObjectMapper();
		String value = null;
		try {
			value = map.writeValueAsString(new Employee());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return value;
	}

}
