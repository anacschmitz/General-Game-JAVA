package br.com.general.generalgames;

import java.util.ArrayList;

public class Menu implements TipoMenus{

    @Override
    public void menuInicial() {
        System.out.println("----------------------------------------");
        System.out.println("--------------GENERAL GAME--------------");
        System.out.println("-------Bem Vindos ao General Game!------");
        System.out.println("----------------------------------------");
        System.out.println("-------------MENU PRINCIPAL:------------");
        System.out.println(">> Escolha uma das opções abaixo:");
        System.out.println("[1] - ADICIONAR JOGADORES:");
        System.out.println("[2] - INICIAR JOGO!");
        System.out.println("[3] - VERIFICAR REGRAS!");
        System.out.println("[4] - FINALIZAR!");
    }

    public void verificarRegras(){
        System.out.println("----------------------------------------");
        System.out.println("----------GENERAL GAME - REGRAS:--------");
        System.out.println("[1] - ALEATÓRIA: Sempre poderá ser utilizada!\n" +
                "PONTUAÇÃO = a soma dos 5 DADOS!");
        System.out.println("[2] - SEQUÊNCIA BAIXA: Quando o resultado conter os DADOS de valores: 1 - 2 - 3 - 4 - 5\n" +
                "PONTUAÇÃO = 40 PONTOS!");
        System.out.println("[3] - SEQUÊNCIA ALTA: Quando o resultado conter os DADOS de valores: 2 - 3 - 4 - 5 - 6\n" +
                "PONTUAÇÃO = 40 PONTOS!");
        System.out.println("[4] - FULL HOUSE: Quando houver 3 DADOS com um mesmo valor + 2 dados com o mesmo valor\n" +
                "PONTUAÇÃO = 30 PONTOS!");
        System.out.println("[5] - GENERAL: Quando houver 5 DADOS com o mesmo valor\n" +
                "PONTUAÇÃO = 50 PONTOS!");
        System.out.println("[6] - TRINCA: Quando houver 3 DADOS com o mesmo valor\n" +
                "PONTUAÇÃO = 25 PONTOS!");
        System.out.println("[7] - QUADRA: Quando houver 4 DADOS com o mesmo valor\n" +
                "PONTUAÇÃO = 25 PONTOS!");

    }

    @Override
    public void menuPontuacao() {
        System.out.println("""
                Selecione qual pontuação você deseja:\s
                [1] - Aleatória\s
                [2] - Sequencia Baixa
                [3] - Sequencia Alta
                [4] - Full House
                [5] - General
                [6] - Trinca
                [7] - Quadra""");
    }
    @Override
    public void resultadoRodada(ArrayList<Jogador> jogadores, NumeroRodada numeroRodada) {
        System.out.println("----------------------------------------------------------");
        System.out.println("Rodada: " + numeroRodada);
        System.out.println("Pontuação para o jogador " + jogadores.get(0).getNomeJogador()+": " + jogadores.get(0).getPontuacaoTotal());

        System.out.println("Pontuação para o jogador " + jogadores.get(1).getNomeJogador()+": " + jogadores.get(1).getPontuacaoTotal());
        if(jogadores.size() == 3){
            System.out.println("Pontuação para o jogador " + jogadores.get(2).getNomeJogador()+":" + jogadores.get(2).getPontuacaoTotal());
        }
        System.out.println("----------------------------------------------------------");
    }


    public void resultadoFinal(ArrayList<Jogador> classificacao) {
        String vencedor = classificacao.get(0).getNomeJogador();
        String segundo = classificacao.get(1).getNomeJogador();
        if(classificacao.size() == 3){
            String terceiro = classificacao.get(2).getNomeJogador();
            System.out.println("VENCEDOR (A):" +vencedor + "\nSEGUNDO COLOCADO: " +segundo + "TERCEIRO COLOCADO: " +terceiro);
        }else{
            System.out.println("VENCEDOR (A):" +vencedor + "\nSEGUNDO COLOCADO: " +segundo);
        }
    }

}
