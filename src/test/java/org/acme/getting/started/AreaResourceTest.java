package org.acme.getting.started;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.ws.rs.core.MediaType;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class AreaResourceTest {

	@Test
	public void testAreaEndpoints() {

		String idArea = given().contentType(MediaType.APPLICATION_JSON).body("{\"color\": \"blue\"}").when()
				.post("/area").then().statusCode(201).extract().path("id");

		String idEmployee01 = given().contentType(MediaType.APPLICATION_JSON)
				.body(String.format("{\"name\": \"Employee01\", \"area\":\"%s\"}", idArea)).when().post("/employee")
				.then().statusCode(201).extract().path("id");

		String idEmployee02 = given().contentType(MediaType.APPLICATION_JSON)
				.body(String.format("{\"name\": \"Employee02\", \"area\":\"%s\"}", idArea)).when().post("/employee")
				.then().statusCode(201).extract().path("id");

		String allEmployees = given().when().get("/area").then().statusCode(200).extract().body().asString();
		assertNotNull(allEmployees);
		assertTrue(allEmployees.contains(idEmployee01));
		assertTrue(allEmployees.contains(idEmployee02));
	}

}