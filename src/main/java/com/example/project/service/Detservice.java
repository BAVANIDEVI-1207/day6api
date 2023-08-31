package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.project.model.Model;
import com.example.project.repository.Repository;

@Service
public class Detservice {
	@Autowired
	Repository  repository;
	public List<Model> print(){
		return repository.findAll();
	}
	public List<Model> print(List<Model> s) {
		return (List<Model>)repository.saveAll(s);
	}
	public Model dispupdate(Model s) {
		return repository.saveAndFlush(s);
		
	}
	public void deleteinfo(int s){
		    repository.deleteById(s);

}
	public List<Model> bookinfo(String S){
		return repository.findAll(Sort.by(Sort.Direction.DESC,S));
	}
	public List<Model> bookinfo(int pgno,int pgsize,String s){
		Page<Model> p=repository.findAll(PageRequest.of(pgno, pgsize,Sort.by(Sort.Direction.DESC,s)));
		return p.getContent();
	}
}
