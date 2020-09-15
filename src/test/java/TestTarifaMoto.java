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
public class TestTarifaMoto {
    @Test
    public void testMotoRedondeo() throws ParseException {
        System.out.println("Moto mas de 60 minutos");
        Parking parking = new Parking(1,VehicleEnum.MOTO,80); 
        int precio = new ParkingService().calculateParkingFee(parking);
        assertEquals(1200, precio);
        }

    @Test
    public void testCarroMenosTiempo() throws ParseException {
        System.out.println("Moto menos de 60 minutos");
        Parking parking = new Parking(1,VehicleEnum.MOTO,10); 
        int precio = new ParkingService().calculateParkingFee(parking);
        assertEquals(1000, precio);
        }
    
    @Test
    public void testCarroNoRedondeo() throws ParseException {
        System.out.println("Moto sin redondeo");
        Parking parking = new Parking(1, VehicleEnum.MOTO,120); 
        int precio = new ParkingService().calculateParkingFee(parking);
        assertEquals(1500, precio);
        }
    }
