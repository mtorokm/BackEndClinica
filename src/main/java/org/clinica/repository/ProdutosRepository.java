package org.clinica.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.clinica.model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosModel, Long> {
	
	public List<ProdutosModel> findAllByNomeProdutoContainingIgnoreCase (String nomeProduto);

}
