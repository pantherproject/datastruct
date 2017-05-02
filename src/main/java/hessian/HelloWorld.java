package hessian;

import java.io.Serializable;

/**
 * Created by panther on 17-5-2.
 */
public class HelloWorld implements Serializable {


    private String name;

    public HelloWorld() {

    }

    public HelloWorld(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName() {
        this.name = name;
    }
}
