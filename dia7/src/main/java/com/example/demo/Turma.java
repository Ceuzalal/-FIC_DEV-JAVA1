package com.example.demo;
import jakarta.persistence.*;

@Entity
public class Turma {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private int numerosAlunos;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumerosAlunos() {
		return numerosAlunos;
	}
	public void setNumerosAlunos(int numerosAlunos) {
		this.numerosAlunos = numerosAlunos;
	}

}
