package demo.hw.server.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.8
 * 2024-12-03T15:24:56.270+08:00
 * Generated source version: 3.5.8
 *
 */
@WebService(targetNamespace = "http://service.server.hw.demo/", name = "HelloWorld")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWorld {

    @WebMethod
    @Action(input = "http://service.server.hw.demo/HelloWorld/sayHiRequest", output = "http://service.server.hw.demo/HelloWorld/sayHiResponse")
    @RequestWrapper(localName = "sayHi", targetNamespace = "http://service.server.hw.demo/", className = "demo.hw.server.service.SayHi")
    @ResponseWrapper(localName = "sayHiResponse", targetNamespace = "http://service.server.hw.demo/", className = "demo.hw.server.service.SayHiResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHi(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://service.server.hw.demo/HelloWorld/getUsersRequest", output = "http://service.server.hw.demo/HelloWorld/getUsersResponse")
    @RequestWrapper(localName = "getUsers", targetNamespace = "http://service.server.hw.demo/", className = "demo.hw.server.service.GetUsers")
    @ResponseWrapper(localName = "getUsersResponse", targetNamespace = "http://service.server.hw.demo/", className = "demo.hw.server.service.GetUsersResponse")
    @WebResult(name = "return", targetNamespace = "")
    public demo.hw.server.service.IntegerUserMap getUsers()
;

    @WebMethod
    @Action(input = "http://service.server.hw.demo/HelloWorld/sayHiToUserRequest", output = "http://service.server.hw.demo/HelloWorld/sayHiToUserResponse")
    @RequestWrapper(localName = "sayHiToUser", targetNamespace = "http://service.server.hw.demo/", className = "demo.hw.server.service.SayHiToUser")
    @ResponseWrapper(localName = "sayHiToUserResponse", targetNamespace = "http://service.server.hw.demo/", className = "demo.hw.server.service.SayHiToUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHiToUser(

        @WebParam(name = "arg0", targetNamespace = "")
        demo.hw.server.service.User arg0
    );

    @WebMethod
    @Action(input = "http://service.server.hw.demo/HelloWorld/getUserListRequest", output = "http://service.server.hw.demo/HelloWorld/getUserListResponse")
    @RequestWrapper(localName = "getUserList", targetNamespace = "http://service.server.hw.demo/", className = "demo.hw.server.service.GetUserList")
    @ResponseWrapper(localName = "getUserListResponse", targetNamespace = "http://service.server.hw.demo/", className = "demo.hw.server.service.GetUserListResponse")
    @WebResult(name = "return", targetNamespace = "")
    public demo.hw.server.service.UserList getUserList()
;
}
