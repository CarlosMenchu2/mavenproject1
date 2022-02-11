/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.controller.BookController;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
/**
 *
 * @author carlos
 */
public class DropwizardApplication extends Application<HelloWorldConfiguration> {
    public static void main(String[] args) throws Exception {
        new DropwizardApplication().run(args);
    }
    
    public DropwizardApplication() {
    }
    
     @Override
    public String getName() {
        return "hello-world";
    }
    
    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        // nothing to do yet
    }
 
    @Override
    public void run(HelloWorldConfiguration c, Environment e) throws Exception {
         e.jersey().register(new BookController());
    }
 
}
