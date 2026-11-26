
package frc.robot;

import edu.wpi.first.networktables.BooleanEntry;
import edu.wpi.first.networktables.DoubleEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class Dashboard {

    @SuppressWarnings("unused")
    private final static BooleanEntry estadoBotao;
        private final DoubleEntry velocidade;
    
        public Dashboard() {
    
            var nt = NetworkTableInstance.getDefault();
    
            estadoBotao = nt
                .getBooleanTopic("/Elastic/Chaves/01")
                .getEntry(false);
    
            velocidade = nt
                .getDoubleTopic("/Elastic/Valores/Velocidade")
                .getEntry(0.0);
        }
    
        public static void atualizar(boolean botao, double valorVelocidade) {
    
            estadoBotao.set(botao);
        velocidade.set(valorVelocidade);

    }
}
