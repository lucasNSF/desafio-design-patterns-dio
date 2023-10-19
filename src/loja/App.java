package loja;

import loja.kits.KitCreator;
import loja.kits.KitRustico;
import loja.produtos.Armario;
import loja.produtos.Cadeira;
import loja.produtos.Mesa;

public class App {
  public static void main(String[] args) {
//    Abstract Factory Method

//    Necessário apenas trocar o kit para mudar o comportamento da aplicação
    KitCreator kit = new KitRustico();
    
    Cadeira cadeira = kit.criarCadeira();
    Mesa mesa = kit.criarMesa();
    Armario armario = kit.criarArmario();
    
    cadeira.sentar();
    mesa.tocar();
    armario.olhar();
  }
}
