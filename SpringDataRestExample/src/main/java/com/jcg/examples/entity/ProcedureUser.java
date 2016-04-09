package com.jcg.examples.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.SequenceGenerator;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;
/*
@NamedNativeQueries({
    @NamedNativeQuery(
            name = "GETUSUARIOSCURSOR",
            query = "SELECT GETUSUARIOSCURSOR(:param1)",
            resultClass = ProcedureUser.class
    )
 })
 */
@NamedStoredProcedureQueries({ //
@NamedStoredProcedureQuery(
		name="ProcedureUser.getUsuariosCursor",
		procedureName="GETUSUARIOSCURSOR",
		resultClasses = ProcedureUser.class,
		parameters = {
				@StoredProcedureParameter(name = "P_CURSOR", mode = ParameterMode.REF_CURSOR, type = void.class)//ParameterMode.REF_CURSOR
		}
)})
@Entity
public class ProcedureUser {

 	@Id @GeneratedValue
 	//@SequenceGenerator(name = "IDFUSERS_SEQ_GENERADOR",allocationSize = 1, sequenceName = "IDFUSERS_SEQ")
 	//@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "IDFUSERS_SEQ_GENERADOR")//	 	@GeneratedValue
 	@Column(name="ID", unique=true, nullable=false, precision=22, scale=0)	 	
    private long id;
	
    @Column(name="NAME")
    private String name;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
	
}