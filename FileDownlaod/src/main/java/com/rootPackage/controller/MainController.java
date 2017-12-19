package com.rootPackage.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rootPackage.model.Student;
	
@Controller
public class MainController {
	
	@RequestMapping("/")
	public String mainPage() {
		System.out.println("request for main page");
		return "Registration";
	}
	
	@RequestMapping("/fileDownload")
	public void fileDownload(HttpServletResponse response) {
		System.out.println("request for main page");
		
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        File file = new File(classloader.getResource("temp/timesheet.xls").getFile()); 
		long fileSize = file.length();
		System.out.println("fileSize :: "+fileSize);
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-Disposition", "attachment;filename="+file.getName());
		
		//response.setContentLengthLong(fileSize);
		//response.setContentType("application/vnd.oasis.opendocument.spreadsheet-template");
		//File file = new File("/temp/tempA.xls");
		
		try {
			BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream outputStream = new BufferedOutputStream(response.getOutputStream());
			byte[] buffer = new byte[1024];
			int bytesRead = 0;
		      while ((bytesRead = inputStream.read(buffer)) != -1) {
		    	  outputStream.write(buffer, 0, bytesRead);
		    	}
		      outputStream.flush();
		      inputStream.close();
		      outputStream.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) { 
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/do.addS", method = RequestMethod.POST)
	public void insertS(@ModelAttribute Student student, @RequestParam String action, Map<String, Object> map,HttpServletResponse response) throws IOException {
		
		System.out.println("Action :- " + action);
		
		PrintWriter out = response.getWriter();
		
		String firstName = student.getFirstName();
		String lastName = student.getLastName();
		String email = student.getEmail();
		String password = student.getPassword();
		String confirmPassword = student.getConfirmPassword();
		Long contactNo = student.getContactNo();
		
		if(firstName.equals("") || firstName.length()==0)
		{
			out.write("Enter first name");
		}
		if(lastName.equals("") || lastName.length()==0)
		{
			out.write("Enter first name");
		}
		if(email.equals("") || email.length()==0)
		{
			out.write("Enter first name");
		}
		if(password.equals("") || password.length()==0)
		{
			out.write("Enter first name");
		}
		if(confirmPassword.equals("") || confirmPassword.length()==0)
		{
			out.write("Enter first name");
		}
		if(contactNo.equals(""))
		{
			out.write("Enter first name");
		}
	}
}