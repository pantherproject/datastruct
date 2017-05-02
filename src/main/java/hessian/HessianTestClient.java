package hessian;

import com.caucho.hessian.client.HessianProxyFactory;

import java.net.MalformedURLException;

/**
 * Created by panther on 17-5-2.
 */
public class HessianTestClient {
    public static void main(String[] args) throws MalformedURLException {
        String url = "http://127.0.0.1:8080/ServiceServlet";
        HessianProxyFactory factory = new HessianProxyFactory();
        HessionService service = null;


        service = (HessionService) factory.create(HessionService.class, url);

        HelloWorld helloWorld = service.sayHelloWorld();

        System.out.println(helloWorld.getName());

    }
}
