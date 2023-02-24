package br.com.cruzvita;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Baralho {

    private ArrayList<Cartas> baralho;
    public Baralho() {
        baralho = new ArrayList<>();

        String[] naipes = {"ouro", "copas", "paus", "espadas"};
        String[] valorCarta = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "K", "Q", "J"};


        for (String naipe : naipes) {
            for (String cartas : valorCarta) {
                baralho.add(new Cartas(naipe, cartas));
            }
        }

        baralho.add(new Cartas("Coringa", "Coringa"));
        baralho.add(new Cartas("Coringa", "Coringa"));
        baralho.add(new Cartas("Coringa", "Coringa"));
        baralho.add(new Cartas("Coringa", "Coringa"));

    }
// metodo shuffle atulizado para sortear os items passados como parametro
    public void embaralha() {
        Collections.shuffle(baralho);
    }

    public boolean temCarta() {
        return !baralho.isEmpty();
    }

    // metodo verifica se o baralho está vazio, caso não esteja vai remover 1 carta
    public Cartas darCarta() {
        if (temCarta()) {
            return baralho.remove(baralho.size()-1);
        } else {
            return null;
        }
    }

    public void imprimeBaralho() {
        for (Cartas carta : baralho) {
            System.out.println(carta.getNaipe() + " de " + carta.getNome());
        }
    }
}
