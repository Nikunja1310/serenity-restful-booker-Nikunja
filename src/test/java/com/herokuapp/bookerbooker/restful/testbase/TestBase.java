package com.herokuapp.bookerbooker.restful.testbase;

import com.herokuapp.bookerbooker.restful.constants.Path;
import com.herokuapp.bookerbooker.restful.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.basePath = Path.BOOKING;
    }

}
