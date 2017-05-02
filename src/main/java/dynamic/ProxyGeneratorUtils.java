package dynamic;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by panther on 17-5-1.
 */
public class ProxyGeneratorUtils {

    public static void writeProxyClassToHardDisk(String path) {
        byte[] classFile = ProxyGenerator.
                generateProxyClass("$Proxy11", UserServiceImpl.class.getInterfaces());

        FileOutputStream outputStream = null;


        try {
            outputStream = new FileOutputStream(path);
            outputStream.write(classFile);
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//
//        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userService);
//
//
//        UserService proxy = (UserService) myInvocationHandler.getProxy();
//
//        proxy.add();


        ProxyGeneratorUtils.writeProxyClassToHardDisk("/opt/soft/project/45/datastruct/$Proxy11.class");
    }


}
