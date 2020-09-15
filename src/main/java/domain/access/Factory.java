/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.access;

import domain.CalculateFee;
import domain.CarFee;
import domain.MotoFee;
import domain.TruckFee;
import domain.VehicleEnum;
import java.util.EnumMap;
import java.util.Map;

/**
 * Fábrica que utiliza el patrón de diseño Singleton
 *
 * @author Libardo, Julio
 */
public class Factory {

    private Map<VehicleEnum, CalculateFee> parkingDictionary;

    // Singleton
    private static Factory instance;

    private Factory() {
        parkingDictionary = new EnumMap<>(VehicleEnum.class);
        parkingDictionary.put(VehicleEnum.CAMION, new TruckFee());
        parkingDictionary.put(VehicleEnum.CARRO, new CarFee());
        parkingDictionary.put(VehicleEnum.MOTO, new MotoFee());
        // Si se requie otro vehículo, se abre un registro en este diccionario
        // No se viola el principio porque este este modulo no está pensado
        // para que sea estable.
    }

    /**
     * Devuelve la instancia de la clase
     *
     * @return instancia unica de la la fábrica
     */

    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    /**
     * Para un pais determina la clase que se encarga de calcular el costo del
     * envío.
     *
     * @param vehiculo
     * @return
     */
    public CalculateFee getVehicle(VehicleEnum vehiculo) {

        CalculateFee result = null;

        if (parkingDictionary.containsKey(vehiculo)) {
            result = parkingDictionary.get(vehiculo);
        }

        return result;

    }
     public IParkingRepository getRepository(String type) {

        IParkingRepository result = null;

        switch (type) {
            case "default":
                result = new ParkingRepository();
                break;
        }

        return result;

    }
}