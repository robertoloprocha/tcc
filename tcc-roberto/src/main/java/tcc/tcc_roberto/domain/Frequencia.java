package tcc.tcc_roberto.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Frequencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String mes;
	@Column
	private int quantFaltas;
	
	public Frequencia(String mes, int quantFaltas) {
		super();
		this.mes = mes;
		this.quantFaltas = quantFaltas;	
	}

//	public Frequencia() {
//		super();
//		this.disciplinas = new ArrayList<Disciplina>();
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getQuantFaltas() {
		return quantFaltas;
	}

	public void setQuantFaltas(int quantFaltas) {
		this.quantFaltas = quantFaltas;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mes == null) ? 0 : mes.hashCode());
		result = prime * result + quantFaltas;
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
		Frequencia other = (Frequencia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mes == null) {
			if (other.mes != null)
				return false;
		} else if (!mes.equals(other.mes))
			return false;
		if (quantFaltas != other.quantFaltas)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Frequencia [id=" + id + ", mes=" + mes + ", quantFaltas=" + quantFaltas + "]";
	}


	

}
