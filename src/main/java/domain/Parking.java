/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author juan-
 */
public class Parking {
    
    private int parkingId;
    private VehicleEnum typeVehicle;
    private int parkingMinutes;

    public Parking(int parkingId, VehicleEnum typeVehicle, int parkingMinutes) {
        this.parkingId = parkingId;
        this.typeVehicle = typeVehicle;
        this.parkingMinutes = parkingMinutes;
    }

    public Parking() {
        
    }

    public int getParkingId() {
        return parkingId;
    }

    public VehicleEnum getTypeVehicle() {
        return typeVehicle;
    }

    public int getParkingMinutes() {
        return parkingMinutes;
    }

    public void setParkingId(int parkingId) {
        this.parkingId = parkingId;
    }

    public void setTypeVehicle(VehicleEnum typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    public void setParkingMinutes(int parkingMinutes) {
        this.parkingMinutes = parkingMinutes;
    }
    
    @Override
    public String toString() {
        return "Ingreso: " + parkingId + ", tipo de vehículo: " + 
                typeVehicle.toString().toLowerCase()+ ", tiempo =  " + parkingMinutes + " minutos";
    }
}
