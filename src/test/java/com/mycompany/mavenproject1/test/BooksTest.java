/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.mavenproject1.test;

import com.mycompany.mavenproject1.DropwizardApplication;
import com.mycompany.mavenproject1.HelloWorldConfiguration;
import com.mycompany.mavenproject1.model.Book;
import io.dropwizard.testing.ResourceHelpers;
import io.dropwizard.testing.junit5.DropwizardAppExtension;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.MediaType;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import javax.ws.rs.core.Response;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;


/**
 *
 * @author carlos
 */
@ExtendWith(DropwizardExtensionsSupport.class)
public class BooksTest {
    private static final String CONFIG_PATH = ResourceHelpers.resourceFilePath("hello-world.yml");
    /*private static final DropwizardAppExtension<HelloWorldConfiguration> EXT = new DropwizardAppExtension<>(
            DropwizardApplication.class,
            ResourceHelpers.resourceFilePath("hello-world.yml"));*/
   static final DropwizardAppExtension<HelloWorldConfiguration> APP = new DropwizardAppExtension<>(
            DropwizardApplication.class, CONFIG_PATH);
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    @Test
    public void hello() {
        final Response response = APP.client().target("http://localhost:" + APP.getLocalPort()+"/bookService/books")
                .request(MediaType.APPLICATION_JSON)
                .get();
        
        assertEquals(200,response.getStatus());
    
    }
}
