package br.digitalhouse.revisao;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {

    public List<Pessoa> pessoas = new ArrayList<>();

    public void cadastroPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    public void imprimeCadastro() {
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i).toString());
        }


    }
}
