package client;
import demo.hw.server.service.*;
import org.junit.Test;

import java.util.Map;

public class ClientTest {


    @Test
    public void test(){
        HelloWorld_Service service = new HelloWorld_Service();
        HelloWorld hw = service.getHelloWorldImplPort();

        System.out.println(hw.sayHi("World"));

        User user = new User("Joe");
        System.out.println(hw.sayHiToUser(user));

        //say hi to some more users to fill up the map a bit
        user = new User("Galaxy");
        System.out.println(hw.sayHiToUser(user));

        user = new User("Universe");
        System.out.println(hw.sayHiToUser(user));

        // TODO fail to get users
        System.out.println();
        System.out.println("Users: ");
        IntegerUserMap users = hw.getUsers();
        for (IdentifiedUser e : users.getEntry()) {
            System.out.println("  " + e.getId() + ": " + e.getUser().getName());
        }
    }
}
