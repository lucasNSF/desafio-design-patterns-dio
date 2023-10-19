package loja.kits;

import loja.produtos.*;

public class KitRustico implements KitCreator {
  
  @Override
  public Cadeira criarCadeira() {
    return new CadeiraRustica();
  }
  
  @Override
  public Mesa criarMesa() {
    return new MesaRustica();
  }
  
  @Override
  public Armario criarArmario() {
    return new ArmarioRustico();
  }
}
