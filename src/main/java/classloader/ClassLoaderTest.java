package classloader;

import java.io.IOException;
import java.io.InputStream;

/**
 * 类加载器
 * Created by panther on 17-5-2.
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                String fileName = name.substring(name.lastIndexOf('.') + 1) + ".class";

                InputStream inputStream = getClass().getResourceAsStream(fileName);

                if (inputStream == null) {
                    return super.loadClass(name);
                }

                try {
                    byte[] bytes = new byte[inputStream.available()];
                    inputStream.read(bytes);
                    return defineClass(name, bytes, 0, bytes.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };


        Object object = myLoader.loadClass("classloader.ClassLoaderTest").newInstance();
        System.out.println(object.getClass());

        System.out.println(object instanceof ClassLoaderTest);
    }
}
