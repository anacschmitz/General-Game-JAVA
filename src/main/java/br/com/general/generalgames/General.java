package br.com.general.generalgames;

import java.util.ArrayList;
import java.util.Scanner;

public class General {
    public NumeroRodada numeroRodada;

    private ArrayList<Jogador> jogadores = new ArrayList<>();

    private Menu menu = new Menu();

    public Rodada rodada;

    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogador3;

    public General() {
    }

    public void iniciarJogo() {
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        boolean x = true;
        int answer;
        do {
            try {
                menu.menuInicial();
                answer = scan.nextInt();

                if (answer == 1) {
                    adicionarJogadores();
                    x = false;
                } else if (answer == 2 & jogadores.size() >= 2) {
                    int t = jogadores.size();
                    chamarRodada(NumeroRodada.UM, jogador1);
                    x = false;
                } else if (answer == 3) {
                    menu.verificarRegras();
                } else if (answer == 4) {
                    System.out.println("OK! Até a próxima!");
                    System.exit(0);
                }else{
                    System.err.println("Valor Inválido! Tente novamente!");
                }
            } catch (Exception exception) {
                System.err.println(exception.getMessage());
            }
        } while (x);
    }


    public void adicionarJogadores() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome do primeiro(a) jogador(a): ");
        this.jogador1 = new Jogador(scan.next());
        this.jogadores.add(jogador1);

        System.out.println("Informe o nome do segundo(a) jogador(a): ");
        scan.nextLine();
        this.jogador2 = new Jogador(scan.next());
        this.jogadores.add(jogador2);
        System.out.println();

        System.out.println("Deseja inserir uma terceira pessoa?\n[1] - SIM\n[2] - NÃO");
        int ansewr = scan.nextInt();
        boolean x = true;
        do {
            try {
                if (ansewr == 1) {
                    System.out.println("Informe o nome do terceiro(a) jogador(a): ");
                    this.jogador3 = new Jogador(scan.next());
                    this.jogadores.add(jogador3);
                    x = false;
                } else if (ansewr == 2) {
                    x = false;
                }
            } catch (Exception e) {
                System.out.println("Valor Incorreto! Insira novamente!");
            }
        } while (x);
        iniciarJogo();
    }

    public void chamarRodada(NumeroRodada numeroRodada, Jogador jogador) {
        this.numeroRodada = numeroRodada;
        Scanner scan = new Scanner(System.in);

        Rodada rodada = new Rodada();
        System.out.println("######JOGADOR (A) TENTANDO A SORTE: \n" +
                "     " + jogador.getNomeJogador());
        rodada.iniciarRodada();


        Menu menu = new Menu();
        menu.menuPontuacao();
        int tipoPontuacao = scan.nextInt();
        rodada.escolherPontuacao(tipoPontuacao, rodada.getResultadoJogadas());

        jogador.adicionarPontuacaoRodada(rodada.getResultadoRodada());
    }

    public ArrayList<Jogador> classificarJogadores() {
        ArrayList<Jogador> classificacao = new ArrayList<>(3);
        int primeiro = 0;
        int segundo = 0;

        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getPontuacaoTotal() > primeiro) {
                primeiro = jogadores.get(i).getPontuacaoTotal();
                classificacao.add(0, jogadores.get(i));
            } else if (jogadores.get(i).getPontuacaoTotal() < primeiro & jogadores.get(i).getPontuacaoTotal() > segundo) {
                segundo = jogadores.get(i).getPontuacaoTotal();
                classificacao.add(1, jogadores.get(i));
            } else {
                int terceiro = jogadores.get(i).getPontuacaoTotal();
                classificacao.add(2, jogadores.get(i));
            }
        }
        return classificacao;
    }


    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public Menu getMenu() {
        return menu;
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public Jogador getJogador3() {
        return jogador3;
    }

}

