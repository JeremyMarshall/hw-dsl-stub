package org.jenkinsci.plugins.hw_dsl_stub;

import hudson.Extension;
import javaposse.jobdsl.dsl.DslExtensionMethod;
import javaposse.jobdsl.dsl.helpers.step.StepContext;
import javaposse.jobdsl.plugin.ContextExtensionPoint;

/**
 * Created by jeremymarshall on 1/01/2015.
 */
@Extension(optional = true)
public class HelloWorld extends ContextExtensionPoint{

    @DslExtensionMethod(context = StepContext.class)
    public Object helloWorld(String name) {
        return new HelloWorldBuilder(name);
    }

    @DslExtensionMethod(context = StepContext.class)
    public Object helloWorld(Runnable closure){
        HelloWorldContext context = new HelloWorldContext();
        executeInContext(closure, context);

        return new HelloWorldBuilder(context.getName());
    }
}