package br.com.general.generalgames;

import java.util.Random;

public class Dado {
    public int[] dado = new int[]{1, 2, 3, 4, 5, 6};

    public int sortearDado() {
        Random r = new Random();
        int sorteio = dado[r.nextInt(dado.length)];
        return sorteio;
    }
}
