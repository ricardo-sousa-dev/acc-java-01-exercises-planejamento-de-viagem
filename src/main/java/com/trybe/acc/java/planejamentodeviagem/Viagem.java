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
  public Viagem(String partida, String origem, String destino, int distanciaKm) {
    this.embarque = partida;
    this.origem = origem;
    this.destino = destino;
    this.distanciaKm = distanciaKm;
    this.voo = new Voo();
  }

  /** Método para retorno do horário de Desembarque no Destino. */
  public String retonarDesembarqueHorarioLocalDestino() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());
    return tempoViagem.retonarDesembarqueHorarioLocalDestino();
  }

  /** Método para retorno do horário de Desembarque no Origem. */
  public String retonarDesembarqueHorarioLocalOrigem() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());
    return tempoViagem.retonarDesembarqueHorarioLocalOrigem();
  }

  // aqui consideramos que um aviao percorre em media 700 km a cada hora
  public int retornarDuracaoVoo() {
    return this.voo.retornarTempoVoo(this.distanciaKm);
  }

  /** Método para retorno da informaçao da viagem. */
  public String retornarInformacaoViagem() {
    String resumo =
        "Partida: "
            + this.embarque
            + "\n"
            + "Origem: "
            + this.origem
            + "\n"
            + "Chegada: "
            + retonarDesembarqueHorarioLocalDestino()
            + "\n"
            + "Destino: "
            + this.destino
            + "\n"
            + "Atenção: o desembarque em "
            + this.destino
            + " será: "
            + retonarDesembarqueHorarioLocalDestino()
            + " no horário de "
            + this.destino
            + " e "
            + retonarDesembarqueHorarioLocalOrigem()
            + " no horário de "
            + this.origem
            + "\n";
    return resumo;
  }
}
