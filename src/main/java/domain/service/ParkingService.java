/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.service;

import domain.Parking;
import domain.CalculateFee;
import domain.access.Factory;

/**
 *
 * @author juan-
 */
public class ParkingService {
    
    public int calculateParkingFee(Parking parking) {

        if (parking == null) {
            return 0;
        }
        // La fábrica devuelve una instancia de la jerarquia IDelivery  
        CalculateFee fee = Factory.getInstance().getVehicle(parking.getTypeVehicle());
        int result = fee.CalcularTarifa(parking.getParkingMinutes());

        return result;

    }
    
}
