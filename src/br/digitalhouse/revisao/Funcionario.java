package br.digitalhouse.revisao;

public class Funcionario extends Pessoa implements Imposto{

    private float salario;
    private float porcentagem;

    public Funcionario(String novoNome, Data novoNascimento, float novoSalario) {
        super(novoNome, novoNascimento);
        salario = novoSalario;
    }
    @Override
    public void imprimirDados() {
        float salComImposto = salario - calculoImposto() ;
//        System.out.println(super.getNome()+ "\n"
//                + super.getNascimento().getDia()+ "/"
//                + super.getNascimento().getMes()+ "/"
//                + super.getNascimento().getAno());
        System.out.println("O valor final do calculo é de: "+ salComImposto);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float novoSalario) {
        salario = novoSalario;
    }

    @Override
    public float calculoImposto() {

        float calImposto = (float)(salario * 0.03);
        return calImposto;
    }
}
