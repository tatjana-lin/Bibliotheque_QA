package com.bibliotheque_API.tests.userController;

import com.bibliotheque.data.EndpointData;
import com.bibliotheque_API.tests.TestBase_API;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetAllUsersListTests extends TestBase_API {


    @Test
    public void getAllUsersListApiSuccessTest() {

//   Response response =

        given()
                .contentType("application/json")
                .get(EndpointData.getAllUsers)
                .then()
                .assertThat().statusCode(200);

//    response.body().prettyPrint();

    }

}
