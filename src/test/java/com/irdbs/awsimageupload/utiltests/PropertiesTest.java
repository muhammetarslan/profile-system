package com.irdbs.awsimageupload.utiltests;

import com.irdbs.awsimageupload.utils.PropertyReader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PropertiesTest {

    @Test
    public void testProperties(){
        assertEquals(PropertyReader.getProperty("myname"),"fatih");
    }
}
