package br.com.general.generalgames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PontuacaoRodada extends CalculadoraPontos {

    public int somarDados(ArrayList<Integer> resultadoJogadas) {
        /*Pontuação aleatória que pode ser usada em qualquer resultado e a pontuação será equivalente
        * a soma dos 5 dados jogados*/
            int resultado = 0;

            for (int i = 0; i < 5; i++) {
                resultado += resultadoJogadas.get(i);
            }
            return resultado;
        }
    public int sequenciaBaixa(ArrayList<Integer> resultadoJogadas){
        /*Caso os cinco dados tenham resultado numa sequencia entre 1 e 5 */
        int resultado;
        Collections.sort(resultadoJogadas);

        List<Integer> seguenciaBaixa = List.of(1,2,3,4,5);

        if(seguenciaBaixa.equals(resultadoJogadas)){
            resultado = 40;
            System.out.println("Você ganhou:" + resultado);
        }else{
            System.err.println("Regra selecionada não aplicável.\nVocê ganhous 5 pontos!");
            resultado = 5;
        }
            return resultado;
    }

    public int sequenciaAlta(ArrayList<Integer> resultadoJogadas){
        /*Caso os cinco dados tenham resultado numa sequencia entre 2 e 6 */
        int resultado;
        Collections.sort(resultadoJogadas);

        List<Integer> seguenciaAlta = List.of(2,3,4,5,6);

        if(seguenciaAlta.equals(resultadoJogadas)){
            resultado = 30;
            System.out.println("Você ganhou:" + resultado);
        }else{
            System.err.println("Regra selecionada não aplicável.\nVocê ganhous 5 pontos!");
            resultado = 5;
        }
            return resultado;
    }

    public int fullHouse(ArrayList<Integer> resultadoJogadas){
        int resultado =0;
        /*Caso haja 3 dados com um mesmo valor e mais 2 dados com o mesmo valor*/
        Collections.sort(resultadoJogadas);

        if(resultadoJogadas.get(0).equals(resultadoJogadas.get(1)) && resultadoJogadas.get(3).equals(resultadoJogadas.get(4))) {
            if(resultadoJogadas.get(2).equals(resultadoJogadas.get(0)) | resultadoJogadas.get(2).equals(resultadoJogadas.get(4))){
                resultado = 30;
        }}else{
            System.err.println("Regra selecionada não aplicável.\nVocê ganhous 5 pontos!");
            resultado = 5;
        }
         return resultado;
    }

    public int general(ArrayList<Integer> resultadoJogadas){
        /*Caso os 5 dados marcarem o mesmo valor*/
        int soma = 0;
        int resultado;

        for (int i = 0; i < 5; i++) {
            soma += resultadoJogadas.get(i);
        }
        if (soma / 5 == resultadoJogadas.get(0)) {
            resultado = 50;
        } else {
            System.err.println("Regra selecionada não aplicável.\nVocê ganhous 5 pontos!");
            resultado = 5;
        }
        return resultado;
    }

    public int trinca(ArrayList<Integer> resultadoJogadas){
        /*Caso haja 3 dados com o mesmo valor*/
        int resultado = 0;
        for (int i = 1; i <= 6; i++) {
            int c = 0;
            for (int x = 0; x < resultadoJogadas.size(); x++) {
                int y = resultadoJogadas.get(x);
                if (i == y) {
                    c += 1;
                }
            }
            if (c >= 3) {
                resultado = 25;
                break;
            }
        } if(resultado != 25){
            System.err.println("Regra selecionada não aplicável.\nVocê ganhous 5 pontos!");
            resultado = 5;
        }
            return resultado;

    }

    public int quadra(ArrayList<Integer> resultadoJogadas){
        /*Caso haja 4 dados com o mesmo valor*/
        int resultado = 0;
        for (int i = 1; i <= 6; i++) {
            int c = 0;
            for (int x = 0; x < resultadoJogadas.size(); x++) {
                int y = resultadoJogadas.get(x);
                if (i == y) {
                    c += 1;
                }
            }
            if (c >= 4) {
                resultado = 25;
                break;
            }
        }
        if (resultado != 25) {
            System.err.println("Regra selecionada não aplicável.\nVocê ganhous 5 pontos!");
            resultado = 5;
        }
        return resultado;
    }


}
