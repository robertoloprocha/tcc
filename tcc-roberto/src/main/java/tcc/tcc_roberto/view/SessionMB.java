package tcc.tcc_roberto.view;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import org.hsqldb.lib.StringUtil;
import org.slf4j.Logger;

import tcc.tcc_roberto.business.AlunoBC;
import tcc.tcc_roberto.domain.Aluno;

import br.gov.frameworkdemoiselle.stereotype.ViewController;

@ViewController
@SessionScoped
public class SessionMB implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private Logger log;

	@Inject
	private AlunoBC bc;

	private Aluno aluno;

	private String matricula;

	private String senha;

	@SuppressWarnings("unused")
	@PostConstruct
	private void init() {
		log.info("Sessão iniciada!");
	}

	public String login() {
		if (!StringUtil.isEmpty(matricula) && !StringUtil.isEmpty(senha)) {
			this.aluno = bc.findAlunoByMatricula(matricula, senha);
			if (this.aluno.getId() != null) {
				log.info("Aluno encontrado! ", new Object[] { this.aluno });
				return "navigator.xhtml";
			} else {
				log.info("Usuário não encontrado!");
			}
		} else {
			log.info("Usuário ou senha inválidos!");
		}

		return null;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}
