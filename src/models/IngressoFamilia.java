package models;

public class IngressoFamilia extends Ingresso{
    private final int numeroPessoas;

    public IngressoFamilia(double valorDoIngresso, String nomeDoFilme, boolean isDublado, int numeroPessoas) {
        super(valorDoIngresso,nomeDoFilme, isDublado);
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    void setValorDoIngresso(double valorDoIngresso) {
        this.valorDoIngresso = this.numeroPessoas > 3 ? (valorDoIngresso * this.numeroPessoas) - ((valorDoIngresso * this.numeroPessoas) * 0.05)
                : valorDoIngresso * this.numeroPessoas;
    }
}
