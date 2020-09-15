/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.access;

import domain.Parking;
import java.util.List;

/**
 *
 * @author juan-
 */
public interface IParkingRepository {
    boolean save(Parking newParking);

    List<Parking> list();
}
