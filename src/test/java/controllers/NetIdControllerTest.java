package controllers;

import org.junit.*;
import controllers.NetIdController;

public class NetIdControllerTest {

    private NetIdController controller = new NetIdController();

    @Test
    public void testGetNetId(){
        assert(controller.getNetId().equals("lh635"));
    }
}
