package demo.hw.server.service;

import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.List;

@XmlJavaTypeAdapter(UserListAdapter.class)
public class UserList {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
