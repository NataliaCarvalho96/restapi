package com.teste.restapi.database;

import com.teste.restapi.entidade.Contato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioContato extends JpaRepository<Contato,Long>{
    
}
