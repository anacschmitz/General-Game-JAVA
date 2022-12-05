package br.com.general.generalgames;

import java.util.ArrayList;

public class Rodada {
    private int tipoPontuacao;
    private JogarDados jogarDados = new JogarDados();
    private ArrayList<Integer> resultadoJogadas;

    private PontuacaoRodada pontuacaoRodada;

    private int resultadoRodada;

    public Rodada() {
    }

    public void escolherPontuacao(int tipoPontuacao, ArrayList<Integer> resultadoJogadas) {
        this.tipoPontuacao = tipoPontuacao;
        this.resultadoJogadas = resultadoJogadas;
        this.pontuacaoRodada = new PontuacaoRodada();

        switch (tipoPontuacao) {
            case 1:
                this.resultadoRodada = pontuacaoRodada.somarDados(resultadoJogadas);
                break;
            case 2:
                this.resultadoRodada = pontuacaoRodada.sequenciaBaixa(resultadoJogadas);
                break;
            case 3:
                this.resultadoRodada = pontuacaoRodada.sequenciaAlta(resultadoJogadas);
                break;
            case 4:
                this.resultadoRodada = pontuacaoRodada.fullHouse(resultadoJogadas);
                break;
            case 5:
                this.resultadoRodada = pontuacaoRodada.general(resultadoJogadas);
                break;
            case 6:
                this.resultadoRodada = pontuacaoRodada.trinca(resultadoJogadas);
                break;
            case 7:
                this.resultadoRodada = pontuacaoRodada.quadra(resultadoJogadas);
                break;
        }
    }

    public void iniciarRodada() {
        /*PRIMEIRA JOGADA DA RODADA AQUI*/
        jogarDados.primeiraJogada();
        System.out.println("Resultado da primeira jogada: " + jogarDados.getJogadaAcumulada());
        int answer = jogarDados.definirProximaJogada();
        if (answer == 1) {
            int qtd = jogarDados.definirQtdDados();
            jogarDados.selecionarDadosParaExcluir(qtd);

            jogarDados.outrasJodadas(qtd);
            System.out.println("Resultado da segunda jogada: " + jogarDados.getJogadaAcumulada());
            answer = jogarDados.definirProximaJogada();

            if (answer == 1) {
                qtd = jogarDados.definirQtdDados();
                jogarDados.selecionarDadosParaExcluir(qtd);
                jogarDados.outrasJodadas(qtd);
                System.out.println("Resultado da terceira jogada: " + jogarDados.getJogadaAcumulada());

            }
        }
        this.resultadoJogadas = jogarDados.getJogadaAcumulada();

    }

    public ArrayList<Integer> getResultadoJogadas() {
        return resultadoJogadas;
    }

    public void setResultadoJogadas(ArrayList<Integer> resultadoJogadas) {
        this.resultadoJogadas = resultadoJogadas;
    }

    public int getTipoPontuacao() {
        return tipoPontuacao;
    }

    public void setTipoPontuacao(int tipoPontuacao) {
        this.tipoPontuacao = tipoPontuacao;
    }

    public JogarDados getJogarDados() {
        return jogarDados;
    }

    public void setJogarDados(JogarDados jogarDados) {
        this.jogarDados = jogarDados;
    }

    public PontuacaoRodada getPontuacaoRodada() {
        return pontuacaoRodada;
    }

    public void setPontuacaoRodada(PontuacaoRodada pontuacaoRodada) {
        this.pontuacaoRodada = pontuacaoRodada;
    }

    public int getResultadoRodada() {
        return resultadoRodada;
    }

    public void setResultadoRodada(int resultadoRodada) {
        this.resultadoRodada = resultadoRodada;
    }
}