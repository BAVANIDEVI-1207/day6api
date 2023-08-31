package com.example.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Model;
import com.example.project.service.Detservice;

@RestController
public class Controller {
	@Autowired
	Detservice service;

	@PostMapping("/show")
	public List<Model>print(@RequestBody List<Model> s) {
		return service.print();
	}
	@GetMapping("/value")
			public List<Model>get(){
		return service.print();
	   }

	@PutMapping("/disp")
	public Model updateinfo( @RequestBody Model s) {
		return service.dispupdate(s);
	}
	
	@DeleteMapping("/del")
	public void  delinfo(@RequestParam int id) {
		 service.deleteinfo(id); 
	}
	@GetMapping("showsort/{Title}")
	public List <Model> storedetails(@PathVariable String Title){
		return service.bookinfo(Title);
	}
	@GetMapping("showpage/{pgno}/{pgsize}/{Title}")
	public List<Model> storeinfo(@PathVariable int pgno,@PathVariable int pgsize,@PathVariable String Title ){
		return service.bookinfo(pgno, pgsize,Title);
		}

	
	
}
