package com.trabalho.trabalho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabalho.trabalho.model.Produto;
import com.trabalho.trabalho.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    /**
     * Metodo para retornar uma lista de produtos do repository
     * @return lista de produtos
     */
    public List<Produto> obterTodos(){
        //Regra de negocio entra aqui caso tenha
        return produtoRepository.findAll();
    }

    /**
     * Metodo que retorna o produto encontrado pelo seu Id.
     * @param id do produto que será localizado.
     * @return Retorna um produto caso seja encontrado
     */
    public Optional<Produto> obterPorId(Integer id){
        //Regra de negocio entra aqui caso tenha
        return produtoRepository.findById(id);
    }


     /**
     * Metodo para adicionar produto na lista
     * @param produto que será adicionado
     * @return o produto que foi adicionado na lista
     */
    public Produto adicionar(Produto produto){
        //Regra de negocio entra aqui caso tenha
        return produtoRepository.save(produto);
    }


     /**
     * Metodo para deletar um produto por id
     * @param id do produto a ser deletado
     */
    public void deletar(Integer id){
        //Regra de negocio entra aqui caso tenha
        produtoRepository.deleteById(id);
    }


    /**
     * Metodo para atualizar os produtos na lista
     * @param produto que será atualizado
     * @param id do produto
     * @return Retorna o produto após atualizar a lista
     */
    public Produto atualizar(Integer Id, Produto produto){
        
        produto.setId(Id);
        return produtoRepository.save(produto);

    }


}
