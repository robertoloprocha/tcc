package br.com.tcc.domain;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Semestre extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/*
	 *  If you are using Glassfish then remove the strategy attribute
	 */
	@Id
	@GeneratedValue(strategy = SEQUENCE)
	private Long id;
	
	@Column
	private String numero;
	
	
	
	
	public Semestre() {
		super();
	}
	
//	public Aluno(String description, String link) {
//		this.description = description;
//		this.link = link;
//	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	
	
	
}
