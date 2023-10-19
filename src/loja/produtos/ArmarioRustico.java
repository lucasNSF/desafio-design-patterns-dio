package loja.produtos;

import loja.produtos.Armario;

public class ArmarioRustico implements Armario {
  
  @Override
  public void olhar() {
    System.out.println("Um armário rústico tradicional de madeira com 2 portas!");
  }
}
