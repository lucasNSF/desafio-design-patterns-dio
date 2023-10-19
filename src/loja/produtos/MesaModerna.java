package loja.produtos;

import loja.produtos.Mesa;

public class MesaModerna implements Mesa {
  
  @Override
  public void tocar() {
    System.out.println("Uma mesa com design moderno feita de vidro!");
  }
}
