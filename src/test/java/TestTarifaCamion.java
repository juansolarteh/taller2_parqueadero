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
public class TestTarifaCamion {
    
    @Test
    public void testCamionMasDelDia() throws ParseException {
        System.out.println("Camion más de un día completo");
        Parking parking = new Parking(1,VehicleEnum.CAMION,1445); 
        int precio = new ParkingService().calculateParkingFee(parking);
        assertEquals(15100, precio);
        }

    @Test
    public void testCamionDiaCompleto() throws ParseException {
        System.out.println("Camion día completo");
        Parking parking = new Parking(1,VehicleEnum.CAMION,1440); 
        int precio = new ParkingService().calculateParkingFee(parking);
        assertEquals(15000, precio);
        }

    @Test
    public void testCamionMasDeMedioDia() throws ParseException {
        System.out.println("Camion más de medio día");
        Parking parking = new Parking(1,VehicleEnum.CAMION,800); 
        int precio = new ParkingService().calculateParkingFee(parking);
        assertEquals(11200, precio);
        }
    
    @Test
    public void testCamionMedioDia() throws ParseException {
        System.out.println("Camion medio día");
        Parking parking = new Parking(1,VehicleEnum.CAMION,720); 
        int precio = new ParkingService().calculateParkingFee(parking);
        assertEquals(10000, precio);
        }
    
    @Test
    public void testCamionMenosMedioDia() throws ParseException {
        System.out.println("Camion menos de medio día");
        Parking parking = new Parking(1,VehicleEnum.CAMION,600); 
        int precio = new ParkingService().calculateParkingFee(parking);
        assertEquals(10000, precio);
        }
    
    }
