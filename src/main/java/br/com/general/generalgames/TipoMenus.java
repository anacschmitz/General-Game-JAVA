package br.com.general.generalgames;

import java.util.ArrayList;

public interface TipoMenus {
    public void menuInicial();
    public void menuPontuacao();
    public void resultadoRodada(ArrayList<Jogador> jogadores, NumeroRodada numeroRodada);
    public void resultadoFinal(ArrayList<Jogador> classificacao);
    public void verificarRegras();


}
