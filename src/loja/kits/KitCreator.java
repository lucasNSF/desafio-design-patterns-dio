package loja.kits;

import loja.produtos.Armario;
import loja.produtos.Cadeira;
import loja.produtos.Mesa;

public interface KitCreator {
  Cadeira criarCadeira();
  Mesa criarMesa();
  Armario criarArmario();
}
