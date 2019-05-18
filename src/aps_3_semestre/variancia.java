/** @author matheus */
package aps_3_semestre;

public class variancia {
    
    double variancia = 0;
    
    public double calculaVariancia(double[] values, double media) {
        
        double valor = 0;
        int n = 0;
        
        // Faz o loop para calcular cada posição do vetor e somar na variavel variancia
        for(int i = 0; i < values.length; i++)
        {
            valor = (values[i] - media);
            variancia += Math.pow(valor, 2);
        }
        // faz o calculo para obter a variancia
        variancia = (variancia / values.length);
        
        return variancia;
    }
}
