package com.mauri.mongo.document;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;


@Document(collection = "users")
@Data @ToString 
public class User implements Serializable {
//Serializable para realizar el envio al servidor de mongodb

	/**
	 * 
	 */
	private static final long serialVersionUID = -1289693234054724056L;

    @Indexed
	@NotNull
	private String id; //El id tiene que ser un String
	
	private String name;
	
	private String lastName;
	
	private int age;
	
	public User() {}
}
