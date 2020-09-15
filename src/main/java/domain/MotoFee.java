/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author User
 */
public class MotoFee extends CalculateFee {
      @Override
    public int CalcularTarifa(int minutos) {
         tarifa=1000;
        if (minutos>60){
            tarifa += (minutos-60)*(25/3);
            tarifa= approximate(tarifa);
         }    
        return tarifa;
    }   
}
        

