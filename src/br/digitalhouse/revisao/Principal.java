package br.digitalhouse.revisao;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Data novaData = new Data(22, 10,1996);

        Cliente novoCliente= new Cliente("Ariel",novaData, 1234);
        novoCliente.imprimirDados();

        Data novaData2 = new Data(25, 12,1990);
        Funcionario novoFuncionario = new Funcionario("jose",novaData2,1000f);
        novoFuncionario.calculoImposto();
        novoFuncionario.imprimirDados();

        Gerente novoGerente= new Gerente("Joao", novaData, 2000,"Tecnologia");
        novoGerente.calculoImposto();
        novoGerente.imprimirDados();

        CadastroPessoa novoCadastro = new CadastroPessoa();
        novoCadastro.cadastroPessoa(novoCliente);
        novoCadastro.cadastroPessoa(novoFuncionario);
        novoCadastro.cadastroPessoa(novoGerente);
        novoCadastro.imprimeCadastro();

        List<Imposto>imposto = new ArrayList<>();
        imposto.add(novoFuncionario);
    }
}
