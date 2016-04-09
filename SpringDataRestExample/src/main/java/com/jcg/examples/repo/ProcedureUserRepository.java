package com.jcg.examples.repo;

import java.io.Serializable;
import java.io.Writer;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.net.MediaType;
import com.jcg.examples.entity.ProcedureUser;

/*
@RestController
@RequestMapping("/procedureUsers")
public class ProcedureUserRepository {
	
    @Autowired
    private ProcedureUserRepositoryCustom procedureUserRepositoryCustom;
    
    @RequestMapping(value = "/findB" , method = RequestMethod.GET)
    public List<ProcedureUser> find(){ 	
		return procedureUserRepositoryCustom.findById(1);
	} 	
}
*/

@RepositoryRestResource
public interface ProcedureUserRepository extends CrudRepository<ProcedureUser, Serializable>, ProcedureUserRepositoryCustom
{
	@Procedure
	public List<ProcedureUser> getUsuariosCursor();
}