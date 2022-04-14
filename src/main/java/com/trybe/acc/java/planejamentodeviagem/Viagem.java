package com.trybe.acc.java.planejamentodeviagem;

public class Viagem {
  private String origem;
  private String destino;
  private String embarque;
  private double distanciaKm;
  private Voo voo;

  /**
   * Método construtor da classe.
   *
   * @param origem
   * @param destino
   * @param partida
   * @param distanciaKm
   */
  public Viagem(String origem, String destino, String partida, Double distanciaKm) {
    this.embarque = "";
    this.origem = "";
    this.destino = "";
    this.distanciaKm = 0.0;
    this.voo = new Voo();
  }

  /** Método para retorno do horário de Desembarque no Destino. */
  public String retonarDesembarqueHorarioLocalDestino() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());
    return tempoViagem.retonarDesembarqueHorarioLocalDestino();
  }

  // aqui consideramos que um aviao percorre em media 700 km a cada hora
  public int retornarDuracaoVoo() {}

  /** Método para retorno da informaçao da viagem. */
  public String retornarInformacaoViagem() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());
  }
}
