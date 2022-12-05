package br.com.general.generalgames;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_general {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        jogoGeneral();

        System.out.println("""
                Vocês desejam jogar novamente?
                [1] - SIM
                [2] - NÃO""");
        int user = scan.nextInt();
        if (user == 1) {
            jogoGeneral();
        } else {
            System.out.println("OK! Até a próxima!");
        }

    }
    public static void jogoGeneral(){
            Scanner scan = new Scanner(System.in);
            General general = new General();

            general.iniciarJogo();

            general.chamarRodada(NumeroRodada.UM, general.getJogador2());
            if (general.getJogadores().size() == 3){
                general.chamarRodada(NumeroRodada.UM, general.getJogador3());
            }
            general.getMenu().resultadoRodada(general.getJogadores(), NumeroRodada.UM);

            general.chamarRodada(NumeroRodada.DOIS, general.getJogador1());
            general.chamarRodada(NumeroRodada.DOIS, general.getJogador2());
            if (general.getJogadores().size() == 3){
                general.chamarRodada(NumeroRodada.DOIS, general.getJogador3());
            }
            general.getMenu().resultadoRodada(general.getJogadores(),NumeroRodada.DOIS);

            general.chamarRodada(NumeroRodada.TRES, general.getJogador1());
            general.chamarRodada(NumeroRodada.TRES, general.getJogador2());
            if (general.getJogadores().size() == 3){
                general.chamarRodada(NumeroRodada.TRES, general.getJogador3());
            }
            general.getMenu().resultadoRodada(general.getJogadores(),NumeroRodada.DOIS);
            general.getMenu().resultadoFinal(general.classificarJogadores());

        }
        }



