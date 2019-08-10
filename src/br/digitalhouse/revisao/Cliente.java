package br.digitalhouse.revisao;

public class Cliente extends Pessoa {

    private int codigo;

    public Cliente(String novoNome, Data novoNascimento, int novoCodigo) {
        super(novoNome, novoNascimento);
        codigo = novoCodigo;

        System.out.println("Olá meu nome é " + super.getNome());
    }

    @Override
    public void imprimirDados() {
        System.out.println(super.getNome()+ "\n"
                + super.getNascimento().toString());
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int novoCodigo) {
        codigo = novoCodigo;
    }
}
