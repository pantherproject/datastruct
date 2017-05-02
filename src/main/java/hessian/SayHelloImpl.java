package hessian;

/**
 * Created by panther on 17-5-2.
 */
public class SayHelloImpl implements ISayHello {
    public String sayHello(String arg1, String arg2) {
        return "arg1=" + arg1 + ",arg2=" + arg2;
    }
}
