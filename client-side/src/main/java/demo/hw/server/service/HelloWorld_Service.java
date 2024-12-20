package demo.hw.server.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.8
 * 2024-12-03T15:24:56.296+08:00
 * Generated source version: 3.5.8
 *
 */
@WebServiceClient(name = "HelloWorld",
                  wsdlLocation = "file:/C:/interest-workspace/java_first_jaxws/client-side/src/main/resources/wsdl/helloWorld.wsdl",
                  targetNamespace = "http://service.server.hw.demo/")
public class HelloWorld_Service extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("http://service.server.hw.demo/", "HelloWorld");
    public static final QName HelloWorldImplPort = new QName("http://service.server.hw.demo/", "HelloWorldImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/interest-workspace/java_first_jaxws/client-side/src/main/resources/wsdl/helloWorld.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloWorld_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/interest-workspace/java_first_jaxws/client-side/src/main/resources/wsdl/helloWorld.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloWorld_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWorld_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorld_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public HelloWorld_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloWorld_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloWorld_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldImplPort")
    public HelloWorld getHelloWorldImplPort() {
        return super.getPort(HelloWorldImplPort, HelloWorld.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldImplPort")
    public HelloWorld getHelloWorldImplPort(WebServiceFeature... features) {
        return super.getPort(HelloWorldImplPort, HelloWorld.class, features);
    }

}
