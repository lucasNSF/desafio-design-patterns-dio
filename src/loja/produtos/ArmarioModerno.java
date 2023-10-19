package loja.produtos;

import loja.produtos.Armario;

public class ArmarioModerno implements Armario {
  @Override
  public void olhar() {
    System.out.println("Um armário moderno de 3 portas feito de MDF");
  }
}
