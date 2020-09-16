/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.service;

import domain.Parking;
import domain.access.IParkingRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan-
 */
public class Service {
    
    private IParkingRepository repository;
    
    public Service(IParkingRepository repository) {
        this.repository = repository;
    }
    
    public boolean saveParking(Parking newParking) {

        //Validate product
        if (newParking == null || newParking.getParkingMinutes()<= 0 || 
                newParking.getTypeVehicle() == null || newParking.getParkingId() <= 0) {
            return false;
        }
        if (repository == null)
            return false;
        repository.save(newParking);
        return true;

    }

    public List<Parking> listParking() {
        List<Parking> parking = new ArrayList<>();
        parking = repository.list();;

        return parking;
    }
    
    public int calculateFee(Parking parking){
        return new ParkingService().calculateParkingFee(parking);
    }
}
