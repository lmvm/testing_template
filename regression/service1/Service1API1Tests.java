package com.elsevier.app;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Service1API1Tests
{

    final String URLTest = "http://ergast.com/api/blalbla/f1/2017/circuits.json";
//    final String NewAPI1 = "url/APINEW/blabla";

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {

        given().
                when().
                get("http://ergast.com/api/f1/2017/circuits.json").
                then().
                assertThat().
                body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
    }


    @Test
    public void checkAPI1For20() {
        doGetRequest("http://ergast.com/api/f1/2017/circuits.json").expect("200",var1="20");
    }

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
