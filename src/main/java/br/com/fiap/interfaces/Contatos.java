package br.com.fiap.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.entity.Contato;

public interface Contatos extends JpaRepository<Contato, Long>{

}
