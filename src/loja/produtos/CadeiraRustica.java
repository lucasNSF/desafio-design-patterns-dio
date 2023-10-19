package loja.produtos;

import loja.produtos.Cadeira;

public class CadeiraRustica implements Cadeira {
  
  @Override
  public void sentar() {
    System.out.println("É uma cadeira rústica e é bastante confortável!");
  }
}
