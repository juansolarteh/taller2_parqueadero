/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.access.IParkingRepository;
import domain.Parking;
import domain.VehicleEnum;
import domain.access.Factory;
import domain.service.Service;

/**
 *
 * @author juan-
 */
public class ClientMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        IParkingRepository repository = Factory.getInstance().getRepository("default");
        Service service = new Service(repository);

        Parking newParking = new Parking(1, VehicleEnum.CAMION, 1849);
        service.saveParking(newParking);

        newParking = new Parking(2, VehicleEnum.MOTO, 180);
        service.saveParking(newParking);

        for (Parking p : service.listParking()) {
            System.out.println(p.toString());
            System.out.println(service.calculateFee(p));
        }
    }
}
