package client;
import demo.hw.server.service.*;
import org.junit.Test;


public class ClientTest {

    private class UserWrapper{
        private User user;

        public UserWrapper(String userName) {
            this.user = new User();
            this.user.setName(userName);
        }

        public User getUser() {
            return user;
        }
    }

    @Test
    public void test(){
        HelloWorld_Service service = new HelloWorld_Service();
        HelloWorld hw = service.getHelloWorldImplPort();

        System.out.println(hw.sayHi("World"));

        User user = new UserWrapper("Joe").getUser();
        System.out.println(hw.sayHiToUser(user));

        //say hi to some more users to fill up the map a bit
        user = new UserWrapper("Galaxy").getUser();
        System.out.println(hw.sayHiToUser(user));

        user = new UserWrapper("Universe").getUser();
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
