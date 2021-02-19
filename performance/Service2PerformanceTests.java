package com.elsevier.app;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Service2PerformanceTests
{

    final String URLTest = "http://ergast.com/api/blalbla/f1/2017/circuits.json";

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test_NumberOfCircuitsFor2017Season_ShouldNotBe19() {
        callJMeter("API1PerfTest1.jmx");
    }

    @Test
    public void checkAPI1For20() {
        doGetRequest("http://ergast.com/api/f1/2017/circuits.json").expect("200",var1="20");
    }

    @Test
    public void checkAPI1For20() {
        doGetRequest("http://ergast.com/api/f1/2017/circuits.json").expect("400",var1="20");
    }
//
    @Test
    public void checkAPI1For19() {
        doGetRequest(URLTest).expect("200",var1="19");
    }
//
//    @Test
//    public void checkAPI1For400() {
//        doGetRequest(URLTest).expect("400",var1="20");
//    }
//
//    @Test
//    public void checkAPI1For400() {
//        doGetRequest(NewAPI1).expect("200",var1="20");
//    }
//
//    @Test
//    public void checkAPI1For400() {
//        doGetRequest(NewAPI1).expect("400",body="somethiggElse");
//    }
//
//    @Test
//    public void checkAPI1For400() {
//        doGetRequest(NewAPI1).expect("500",errorMessage="error");
//    }

}
