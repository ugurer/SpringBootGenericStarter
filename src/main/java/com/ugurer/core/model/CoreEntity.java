package com.ugurer.core.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class CoreEntity implements Serializable{
	private static final long serialVersionUID = 9172306090249157041L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

}
