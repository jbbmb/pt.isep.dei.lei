/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grupo 18
 */
public class ListaProdutos implements Serializable {

    private List<Produto> listaProdutos;

    public ListaProdutos() {
        this.listaProdutos = new ArrayList<>();
    }

    public ListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Produto novoProduto() {
        return new Produto();
    }
    
    public void addProduto(Produto p){
        listaProdutos.add(p);
    }

    public String[] listaProdutosToString() {
        String[] vec = new String[listaProdutos.size()];
        for (int i = 0; i < listaProdutos.size(); i++) {
            Produto p = listaProdutos.get(i);
            vec[i] = p.getNomeProduto();
        }
        return vec;
    }

}
