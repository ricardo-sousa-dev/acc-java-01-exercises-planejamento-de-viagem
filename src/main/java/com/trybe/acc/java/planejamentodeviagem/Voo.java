package com.trybe.acc.java.planejamentodeviagem;

public class Voo {
  private int tempoVoo;

  /** Método para retornar tempo de Voo. */
  public int retornarTempoVoo(double distanciaKm) {
    this.tempoVoo = (int) (distanciaKm / 700);
    return this.tempoVoo;
  }

  /** Método para retornar informaçao do Voo. */
  // retornarInformacaoVoo: esse método é público e tem retorno do tipo String que
  // representa o resumo das informações sobre o voo. Ele recebe quatro
  // argumentos: String embarque, String origem, String desembarque, String
  // destino, e os utiliza para formar uma String com o resumo do voo.
  public String retornarInformacaoVoo(
      String embarque, String origem, String desembarque, String destino) {
    String informacaoVoo =
        "Embarque: "
            + embarque
            + "\nOrigem: "
            + origem
            + "\nDesembarque: "
            + desembarque
            + "\nDestino: "
            + destino
            + "\nTempo de Voo: "
            + this.tempoVoo
            + " horas";
    return informacaoVoo;
  }
}
