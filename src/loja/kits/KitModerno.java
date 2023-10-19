package loja.kits;

import loja.produtos.*;

public class KitModerno implements KitCreator {
  @Override
  public Cadeira criarCadeira() {
    return new CadeiraModerna();
  }
  
  @Override
  public Mesa criarMesa() {
    return new MesaModerna();
  }
  
  @Override
  public Armario criarArmario() {
    return new ArmarioModerno();
  }
}
