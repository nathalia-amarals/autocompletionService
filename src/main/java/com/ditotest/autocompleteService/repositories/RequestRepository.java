package com.ditotest.autocompleteService.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ditotest.autocompleteService.entity.Request;

public interface RequestRepository extends CrudRepository<Request, Long>{
	
	@Query("select keyword from Request where event=?1")
	public List<String> findByEvent(String event);
}
