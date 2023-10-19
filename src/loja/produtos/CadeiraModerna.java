package loja.produtos;

import loja.produtos.Cadeira;

public class CadeiraModerna implements Cadeira {
  @Override
  public void sentar() {
    System.out.println("Uma cadeira com design moderno e é bem confortável!");
  }
}
