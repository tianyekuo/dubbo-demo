package com.knight.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:spring-test-config.xml" })
public class CalServiceTest extends AbstractTestNGSpringContextTests {

    @Autowired
    CalService calService;

    @Test
    public void testCalService(){
        Assert.assertEquals(3,calService.add(1,2));
    }
}
