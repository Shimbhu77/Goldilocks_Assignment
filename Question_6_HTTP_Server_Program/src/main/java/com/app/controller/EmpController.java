package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Emp;
import com.app.repository.EmpRepository;
import com.app.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	private EmpService empService;
	
	@Autowired
	private EmpRepository empRepo;
	
	@GetMapping("/app/read-data")
	public ResponseEntity<List<Emp>> readDBHandler()
	{
		List<Emp> list = empService.readDB();
		
		return new ResponseEntity<List<Emp>>(list,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/test")
	public ResponseEntity<List<Emp>> readDBValueHandler(@RequestParam("value") String value)
	{
		List<Emp> list = empRepo.findByNameContaining(value);
		
		return new ResponseEntity<List<Emp>>(list,HttpStatus.ACCEPTED);
	}
}
