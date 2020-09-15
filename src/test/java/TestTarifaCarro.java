/**
 *
 * @author User
 */

import java.text.ParseException;
import org.junit.Test;
import domain.Parking;
import domain.VehicleEnum;
import domain.service.ParkingService;
import static org.junit.Assert.*;
public class TestTarifaCarro {

    @Test
    public void testCarroRedondeo() throws ParseException {
        System.out.println("Carro mas de 60 minutos");
        Parking parking = new Parking(1,VehicleEnum.CARRO,80); 
        int precio = new ParkingService().calculateParkingFee(parking);
        assertEquals(2400, precio);
        }

    /**
     * Test de la clase ViajeIncentivo.
     *
     * @throws java.text.ParseException
     */
    @Test
    public void testCarroMenosTiempo() throws ParseException {
        System.out.println("Carro menos de 60 minutos");
        Parking parking = new Parking(1,VehicleEnum.CARRO,10); 
        int precio = new ParkingService().calculateParkingFee(parking);
        assertEquals(2000, precio);
        }
    
    @Test
    public void testCarroNoRedondeo() throws ParseException {
        System.out.println("Carro sin redondeo");
        Parking parking = new Parking(1,VehicleEnum.CARRO,120); 
        int precio = new ParkingService().calculateParkingFee(parking);
        assertEquals(3000, precio);
        }
    }
    
    
