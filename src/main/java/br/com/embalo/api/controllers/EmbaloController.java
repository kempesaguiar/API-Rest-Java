package br.com.embalo.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.embalo.api.models.Produto;
import br.com.embalo.api.repositories.ProdutoRepository;

@RestController
@RequestMapping(value="/api")
public class EmbaloController {

	@Autowired
	ProdutoRepository pr;
	
	@GetMapping("/produtos")
	public List<Produto> listaProdutos(){
		
		return pr.findAll();
	}
	
	@PostMapping("/produto")
	public Produto salvaProduto(@RequestBody Produto produto) {
		return pr.save(produto);
		
	}
	
	@DeleteMapping("/produto")
	public void excluiProduto(@RequestBody Produto produto) {
		pr.delete(produto);
	}
	
	@PutMapping("/produto")
	public Produto atualizaProduto(@RequestBody Produto produto) {
		return pr.save(produto);
	}
	
	@GetMapping("/produto/{id}")
	public Produto listaProduto(@PathVariable(value="id") long id) {
		return pr.findById(id);
	}
	
	
	
}
