/** @author matheus */
package aps_3_semestre;

public class desvio_padrao {
    
    float desvio_padrao = 0.0f;
    double conta = 0;
    
    public float calculaDesvioPadrao(float variancia) {
        conta = Math.sqrt(variancia);
        desvio_padrao = (float)conta;
        return desvio_padrao;
    }
}
