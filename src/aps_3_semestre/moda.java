/** @author matheus */
package aps_3_semestre;

import java.util.ArrayList;

public class moda {
    
    float moda = 0.0f;
    int times = 0;
    
    public float calculaModa(String[] values) {
         
        for(int i = 0; i < values.length; i++)
        {
            int vezes = 1;
            // faz o loop que vai comparar se existe numeros iguais e adicionar quantas vezes ele se repete
            for(int k = 0; k < values.length; k++)
            {
                if(i == k) continue;
                
                if(Float.parseFloat(values[i]) == Float.parseFloat(values[k]))
                    vezes++;
            }
            // Compara se a quantidade de vezes é maior que a anterior, para definir qual mais se repete
            if(vezes > times)
            {
                times = vezes;
                moda = Float.parseFloat(values[i]);         
            }
        }
             // retorna o valor encontrado na moda
        return moda;
    }
}