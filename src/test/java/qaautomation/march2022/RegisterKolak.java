package qaautomation.march2022;


import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RegisterKolak {


	
	@Test
	public void registerKolak() {
		Faker faker = new Faker();
		String newEmail = faker.name().username() + "@gmail.com" ;
		String newPhone = faker.phoneNumber().cellPhone();
		
		System.out.println(newEmail);
		System.out.println(newPhone);
		
		RestAssured.baseURI = "https://kolakproject.herokuapp.com";
		String register = "{\"username\": \"kevinswa\", \"password\": \"asd1234\", \"email\": \"" + newEmail + "\", \"phonenumber\": \"" + newPhone + "\"}";
		Response responseRegister = RestAssured.given().contentType("application/json").body(register).when()
			.post("/register");
	}

}
