/** @author matheus */
package aps_3_semestre;

public class desvio_padrao {
    
    double desvio_padrao = 0.0f;
    double conta = 0;
    
    public double calculaDesvioPadrao(double variancia) {
        conta = Math.sqrt(variancia);
        desvio_padrao = conta;
        return desvio_padrao;
    }
}
