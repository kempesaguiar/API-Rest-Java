package br.com.embalo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.embalo.api.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>  {

	public Produto findById(long id);
}
