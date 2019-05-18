/** @author matheus */
package aps_3_semestre;

import java.util.ArrayList;

public class moda {
    
    double moda = 0;
    int times = 0;
    
    public double calculaModa(double[] values) {
         
        for(int i = 0; i < values.length; i++)
        {
            int vezes = 1;
            // faz o loop que vai comparar se existe numeros iguais e adicionar quantas vezes ele se repete
            for(int k = 0; k < values.length; k++)
            {
                if(i == k) continue;
                
                if(values[i] == values[k])
                    vezes++;
            }
            // Compara se a quantidade de vezes é maior que a anterior, para definir qual mais se repete
            if(vezes > times)
            {
                times = vezes;
                moda = values[i];         
            }
        }
             // retorna o valor encontrado na moda
        return moda;
    }
}