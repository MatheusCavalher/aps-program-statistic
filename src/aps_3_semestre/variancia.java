/** @author matheus */
package aps_3_semestre;

public class variancia {
    
    float variancia = 0.0f;
    
    public float calculaVariancia(String[] values, float media) {
        
        float valor = 0;
        int n = 0;
        
        // Faz o loop para calcular cada posição do vetor e somar na variavel variancia
        for(int i = 0; i < values.length; i++)
        {
            valor = (Float.parseFloat(values[i]) - media);
            variancia += (float) Math.pow(valor, 2);
        }
        // faz o calculo para obter a variancia
        variancia = (variancia / values.length);
        
        return variancia;
    }
}
