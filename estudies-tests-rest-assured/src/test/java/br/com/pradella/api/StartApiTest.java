package br.com.pradella.api;

import static com.jayway.restassured.RestAssured.baseURI;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import spark.utils.IOUtils;

public class StartApiTest {

	@Before
	public void setUp() throws Exception {
		baseURI = "http://localhost:4567/";
	}

	
	
	
	
	
	 @Test
	    public void quandoEnviarPostVerificarInformacoesEStatusCodDoRetorno() throws IOException {
		         given()
		           .contentType("application/json")
		           .body(json())
		         .when()
		           .post("/")
		         .then()
		           .statusCode(202)
		           .body("nome", containsString("Tonny Stark"))
		           .body("permissao", containsString("Admin"))
		           .body("descricao", containsString("Full Acesso a Armadura"));
		    }
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	private String json() throws IOException {
		return IOUtils.toString(StartApi.class.getResourceAsStream("/json.json"));
	}

}
