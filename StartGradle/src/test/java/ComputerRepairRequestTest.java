import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.mpp2024.ComputerShopMain;
import ro.mpp2024.model.ComputerRepairRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First test")

    public void testExemple(){
        ComputerRepairRequest crr = new ComputerRepairRequest();
        assertEquals("", crr.getOwnerName());
        assertEquals("", crr.getOwnerAddress());

    }

    @Test
    @DisplayName("Second test")
    public void testExemple2(){
        assertEquals(2,2,"numerele care trebuie sa fie egale");
    }
      
}
