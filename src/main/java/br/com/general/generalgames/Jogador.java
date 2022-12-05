package br.com.general.generalgames;

public class Jogador {
    private String nomeJogador;

    private int pontuacaoTotal;

    public Jogador(String nomeJogador){
        this.nomeJogador = nomeJogador;
    }

    public void adicionarPontuacaoRodada(int resultadoRodada){
        this.pontuacaoTotal += resultadoRodada;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public int getPontuacaoTotal() {
        return pontuacaoTotal;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public void setPontuacaoTotal(int pontuacaoTotal) {
        this.pontuacaoTotal = pontuacaoTotal;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Jogador{" +
                "nomeJogador='" + nomeJogador + '\'' +
                ", pontuacaoTotal=" + pontuacaoTotal +
                '}';
    }
}
