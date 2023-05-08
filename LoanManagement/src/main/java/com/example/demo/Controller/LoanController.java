package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.AdminModel;
import com.example.demo.Model.LoanApplicationModel;
import com.example.demo.Model.LoginModel;
import com.example.demo.Model.UserModel;
import com.example.demo.Service.EducationLoanService;

@RestController
public class LoanController {
	
		
	@Autowired
	public EducationLoanService eserv;

	//user
	@PostMapping("/info")
	public UserModel addDetails(@RequestBody UserModel us)
	{
		return eserv.saveInfo(us);
	}
	@GetMapping("/details")
	public List<UserModel> getDetails()
	{
		return eserv.getInfo();
		
	}
	@PutMapping("/updatedetails")
	public UserModel updateDetails(@RequestBody UserModel id)
	{
		return eserv.UpdateInfo(id);
	}

	@DeleteMapping("/deletedetails/{id}")
	public String deleteDetails(@PathVariable("id") int id)
	{
		eserv.deleteInfo(id);
		return "Student Id "+id+" is deleted";
	}

	//login
	@PostMapping("/log")
	public LoginModel addDetails1(@RequestBody LoginModel us)
	{
		return eserv.saveInfo1(us);
	}
	@GetMapping("/det")
	public List<LoginModel> getDetails1()
	{
		return eserv.getInfo1();
		
	}
	@PutMapping("/up")
	public LoginModel updateDetails1(@RequestBody LoginModel id)
	{
		return eserv.UpdateInfo1(id);
	}
	@DeleteMapping("/del/{id}")
	public String deleteDetails1(@PathVariable("id") int id)
	{
		eserv.deleteInfo(id);
		return "Student Id "+id+" is deleted";
	} 
	//loanapplication
	@PostMapping("/posting")
	public LoanApplicationModel addDetails2(@RequestBody LoanApplicationModel lam)
	{
		return eserv.saveInfo2(lam);
	}
	@GetMapping("/getting")
	public List<LoanApplicationModel> getDetails2()
	{
		return eserv.getInfo2();
		
	}
	@PutMapping("/update")
	public LoanApplicationModel updateDetails2(@RequestBody LoanApplicationModel id)
	{
		return eserv.UpdateInfo2(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDetails2(@PathVariable("id") int id)
	{
		eserv.deleteInfo(id);
		return "Student Id "+id+" is deleted";
	} 
	//admin
	@PostMapping("/pm")
	public AdminModel addDetails3(@RequestBody AdminModel am)
	{
		return eserv.saveInfo3(am);
	}

	@GetMapping("/gm")
	public List<AdminModel> getDetails3()
	{
		return eserv.getInfo3();
		
	}
	@PutMapping("/pum")
	public AdminModel updateDetails3(@RequestBody AdminModel id)
	{
		return eserv.UpdateInfo3(id);
	}
	@DeleteMapping("/dm/{id}")
	public String deleteDetails3(@PathVariable("id") int id)
	{
		eserv.deleteInfo(id);
		return "Student Id "+id+" is deleted";
	}

}
