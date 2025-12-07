package com.main.aplicando_orientacao_objetos;

import com.main.aplicando_orientacao_objetos.calculo.CalculadoraDeTempo;
import com.main.aplicando_orientacao_objetos.calculo.FiltroDeRecomendacao;
import com.main.aplicando_orientacao_objetos.modelos.Filme;
import com.main.aplicando_orientacao_objetos.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
      Filme filme1 = new Filme();
      filme1.setNome("Top Gun");

      filme1.setAnoDeLancamento(2016);
      filme1.setDuracaoEmMinutos(98);
      filme1.setIncluidoNoPlano(false);


        filme1.avalia(5.5);
        filme1.avalia(4.5);
        filme1.avalia(3.5);


        filme1.exibirFichaTecnica();
      System.out.println("=====================================");
      Serie lost = new Serie();
      lost.setNome("Lost");
      lost.setAnoDeLancamento(2016);
      lost.setDuracaoEmMinutos(98);
      lost.setIncluidoNoPlano(true);
      lost.avalia(5.5);
      lost.avalia(4.5);
      lost.avalia(3.5);
      lost.setTemporadas(12);
      lost.setMinutosPorEpisodio(47);
      lost.setEpisodiosPorTemporada(24);
      lost.exibirFichaTecnica();
      System.out.println("Duração para maratonar "+ lost.getNome() +": " + lost.getDuracaoEmMinutos() + " minutos");


      CalculadoraDeTempo calc = new CalculadoraDeTempo();
      calc.inclui(filme1);
      calc.inclui(lost);
      System.out.println("total para temporar titulos: "+calc.getTempoTotal());

      FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
      filtro.filtra((filme1));
    }
}
