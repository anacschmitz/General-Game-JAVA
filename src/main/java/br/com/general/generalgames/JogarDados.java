package br.com.general.generalgames;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JogarDados {
    private int qtdDados;
    private ArrayList<Integer> jogadaAcumulada;

    private Dado dado;

    public JogarDados(){
        this.jogadaAcumulada = new ArrayList<>(5);
        this.dado = new Dado();
    }

    public void primeiraJogada(){
        for(int i = 1; i <= 5; i++) {
            int eachDado = dado.sortearDado();
            this.jogadaAcumulada.add(eachDado);
        }
        }

    public void outrasJodadas(int qtd){

        for(int i = 1; i <= qtd; i ++){
            int eachDado = dado.sortearDado();
            this.jogadaAcumulada.add(eachDado);
        }}

    public int definirProximaJogada(){
        boolean continua = true;
        Scanner scan = new Scanner(System.in);
        int answer = 0;

        do {
            try {
                System.out.println("""
                        Deseja jogar novamente?
                        [1] - SIM
                        [2] - NÃO""");
                answer = scan.nextInt();
                if (answer == 1 | answer == 2) {
                    continua = false;
                }
            } catch (Exception e) {
                System.err.println("Valor inválido! Tente novamente");
            }
        } while (continua);
        return answer;
    }

    public int definirQtdDados() {
        Scanner scan = new Scanner(System.in);
        boolean continua = true;
        int answer = 0;

        do {
            System.out.println("Quantos dados você deseja exluir na próxima jogada?");
            answer = scan.nextInt();
            if (answer > 5 | answer < 0) {
                continua = true;
                System.err.println("Valor não permitido");
            }else{
                continua = false;
                }
        } while (continua);
        this.qtdDados = answer;
        return answer;
    }

    public void selecionarDadosParaExcluir(int qtd){
        Scanner scan = new Scanner(System.in);
        System.out.println("O seu resultado é: " +this.getJogadaAcumulada());
        int dado;
        Random r = new Random();

        for(int i = 1; i <= qtd; i ++) {
            System.out.println("Informe um dado a ser excluído e pressione enter: ");
            dado = scan.nextInt();
            if(this.jogadaAcumulada.contains(dado)){
                int indexDado = this.jogadaAcumulada.indexOf(dado);
                this.jogadaAcumulada.remove(indexDado);
                }else
            {
                for(int x = 1; x <= qtd; x ++) {
                    jogadaAcumulada.remove(r.nextInt(jogadaAcumulada.size()));
                    System.err.println("Valor Inválido!\nForam removidos dado (s) aleatório (s): " +  jogadaAcumulada);
                    System.out.println("----------------------------------------------------------------------------");
                }break;
            }
            System.out.println(this.jogadaAcumulada);
        }
    }

    public ArrayList<Integer> getJogadaAcumulada() {
        return jogadaAcumulada;
    }

    public void setJogadaAcumulada(ArrayList<Integer> jogadaAcumulada) {
        this.jogadaAcumulada = jogadaAcumulada;
    }

    public Dado getDado() {
        return dado;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }

    public int getQtdDados() {
        return qtdDados;
    }

    public void setQtdDados(int qtdDados) {
        this.qtdDados = qtdDados;
    }
}