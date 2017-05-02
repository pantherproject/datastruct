package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by panther on 17-5-1.
 */
public class MyInvocationHandler implements InvocationHandler {

    //目标对象
    private Object target;

    public MyInvocationHandler(Object target) {
        super();
        this.target = target;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----------------------------before-----------------------------");
        Object result = method.invoke(target, args);
        System.out.println("-----------------------------after------------------------------");
        return result;
    }


    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(), this);
    }


    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        Class<?>[] result = UserServiceImpl.class.getInterfaces();
        System.out.println(result.length);
        for (Class<?> cl : result) {
            System.out.println(cl);
        }

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
    }
}
