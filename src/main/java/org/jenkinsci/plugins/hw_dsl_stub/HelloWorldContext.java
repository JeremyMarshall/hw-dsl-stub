package org.jenkinsci.plugins.hw_dsl_stub;

import javaposse.jobdsl.dsl.Context;

/**
 * Created by jeremymarshall on 31/01/2015.
 */

public class HelloWorldContext implements Context{

    String name;

    public void name(String  value) {

        this.name = value;
    }

    public String getName(){
        return name;
    }
}
