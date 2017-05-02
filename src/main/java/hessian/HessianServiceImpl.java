package hessian;

/**
 * Created by panther on 17-5-2.
 */
public class HessianServiceImpl implements HessionService {
    public HelloWorld sayHelloWorld() {
        return new HelloWorld("hello,world");
    }
}
