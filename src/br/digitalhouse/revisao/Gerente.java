package br.digitalhouse.revisao;

public class Gerente extends Funcionario implements Imposto {

    private String area;

    public Gerente(String novoNome, Data novoNascimento, float novoSalario, String novaArea) {
        super(novoNome, novoNascimento, novoSalario);
        area = novaArea;
    }
        public float calculoImposto(){

        float calImposto = (float)(getSalario() * 0.05);
        return calImposto;
    }
    @Override
        public void imprimirDados () {
          //  super.imprimirDados();
        System.out.println(super.getNome()+ "\n"
                + super.getNascimento().getDia()+ "/"
                + super.getNascimento().getMes()+ "/"
                + super.getNascimento().getAno()+ "\n"
                + area);
        }

}