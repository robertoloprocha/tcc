package br.com.tcc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "pessoa_id_generator", sequenceName = "seq_pessoa")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_id_generator")
	private Long id;
	
	@Column
	private String matricula;

	@Column
	private String cpf;

	@Column
	private String nome;
	
	@Column
	private String telefone;

//	@OneToMany(mappedBy = "pessoa", cascade = { CascadeType.ALL })
//	private List<Contato> contatos = new ArrayList<Contato>();

	
//	@ManyToMany
//	@JoinTable(name = "UNIDADE_TRABALHO", joinColumns = { @JoinColumn(name = "PESSOA_ID") }, inverseJoinColumns = { @JoinColumn(name = "UNIDADE_ID") })
//	private List<Unidade> unidades = new ArrayList<Unidade>();

	public Pessoa() {
		
		
	}

	public Pessoa(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

//	public List<Contato> getContatos() {
//		return contatos;
//	}
//
//	public void setContatos(List<Contato> contatos) {
//		this.contatos = contatos;
//	}

	

//	public List<Unidade> getUnidades() {
//		return unidades;
//	}
//
//	public void setUnidades(List<Unidade> unidades) {
//		this.unidades = unidades;
//	}

	

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
