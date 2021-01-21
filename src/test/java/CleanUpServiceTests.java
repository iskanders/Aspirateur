import application.Exception.AspiratorException;
import application.Model.Case;
import application.Model.Orientation;
import application.Model.StandardAspirator;
import application.Service.CleanUp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CleanUpServiceTests {

    @Test
    public void CleanUpTest() throws AspiratorException {
        CleanUp cleanUpService = new CleanUp();
        cleanUpService.initService(10,10,5,5,'N');
        cleanUpService.cleanUp("DADADADAA");
        assertTrue(new Case(5,6).equals(((StandardAspirator)cleanUpService.getAspirator()).getCurrentPosition())
                    && ((StandardAspirator)cleanUpService.getAspirator()).getCurrentOrientation()==Orientation.North);
    }

    @Test
    public void CleanUp_Move_Aspirator_out_of_room(){
        CleanUp cleanUpService = new CleanUp();
        cleanUpService.initService(2,2,0,0,'S');
        assertThrows(AspiratorException.class,()->cleanUpService.cleanUp("A"));
    }
}
