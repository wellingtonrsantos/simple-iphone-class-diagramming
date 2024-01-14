package dev.wellington.model;

import java.util.Objects;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

  private String musica;
  private String pagina;

  @Override
  public void tocar() {
    if (Objects.nonNull(this.musica))
      System.out.println("Tocando a musica: " + this.musica);
    else
      System.out.println("Nenhuma musica selecionada");
  }

  @Override
  public void pausar() {
    System.out.println("Musica pausada...");
  }

  @Override
  public void selecionarMusica(String musica) {
    this.musica = musica;
    System.out.println("Musica " + musica + " selecionada");
  }

  @Override
  public void ligar() {
    System.out.println("Realizando ligacao");
  }

  @Override
  public void atender() {
    System.out.println("Atendendo ligacao");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz");
  }

  @Override
  public void exibirPagina(String pagina) {
    this.pagina = pagina;
    System.out.println("Exibindo a pagina " + pagina);
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba");
  }

  @Override
  public void atualizarPagina() {
    if (Objects.isNull(this.pagina))
      System.out.println("Pagina " + this.pagina + " atualizada");
    else
      System.out.println("Pagina home atualizada");
  }
}
