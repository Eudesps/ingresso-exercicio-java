package models;

// valor, nome do filme e informar se é dublado ou legendado
abstract class Ingresso {
    protected double valorDoIngresso;
    private String nomeDoFilme;
    private boolean isDublado;

    public Ingresso(double valorDoIngresso, String nomeDoFilme, boolean isDublado) {
        this.valorDoIngresso = valorDoIngresso;
        this.nomeDoFilme = nomeDoFilme;
        this.isDublado = isDublado;
    }

    public double getValorDoIngresso() {
        setValorDoIngresso(valorDoIngresso);
        return valorDoIngresso;
    }

    abstract void setValorDoIngresso(double valorDoIngresso);

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public boolean isDublado() {
        return isDublado;
    }

    public void setDublado(boolean dublado) {
        isDublado = dublado;
    }
}
