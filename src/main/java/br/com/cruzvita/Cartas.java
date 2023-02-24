package br.com.cruzvita;

public class Cartas {

    private String nome;
    private String naipes;

    public Cartas(String nome, String naipe) {
        this.nome = nome;
        this.naipes = naipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaipe() {
        return naipes;
    }

    public void setNaipe(String naipe) {
        this.naipes = naipe;
    }

//    @Override
//    public String toString() {
//        return naipes + " de " + nome ;
//    }
}
