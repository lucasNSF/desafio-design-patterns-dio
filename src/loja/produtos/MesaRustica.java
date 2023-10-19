package loja.produtos;

import loja.produtos.Mesa;

public class MesaRustica implements Mesa {
  @Override
  public void tocar() {
    System.out.println("É uma mesa rústica feita de madeira!");
  }
}
