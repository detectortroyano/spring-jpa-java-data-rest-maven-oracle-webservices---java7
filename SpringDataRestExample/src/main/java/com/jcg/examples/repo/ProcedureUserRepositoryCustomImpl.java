package com.jcg.examples.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;

import org.springframework.data.repository.query.Param;

import com.jcg.examples.entity.ProcedureUser;

import oracle.jdbc.OracleTypes;

public class ProcedureUserRepositoryCustomImpl implements ProcedureUserRepositoryCustom {
/*
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<ProcedureUser> findById() {
	    StoredProcedureQuery storedProcedure = entityManager.createNamedStoredProcedureQuery("getUsuariosCursor");
	    storedProcedure.registerStoredProcedureParameter(1, Object.class, ParameterMode.REF_CURSOR);
	    //query.setParameter(1, OracleTypes.CURSOR);
	    //query.execute();
	    List<ProcedureUser> list = null;//storedProcedure.getResultList();
	    //Object outputParameterValue = query.getOutputParameterValue(1);
	    return list;
	}
*/
}