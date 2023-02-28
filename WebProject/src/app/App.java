package app;

import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.port;

import static spark.Spark.staticFiles;

import java.io.File;

import repositories.UserRepository;
import services.LoginService;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		UserRepository.loadUsers();
		
		port(8080);
		staticFiles.externalLocation(new File("./static").getCanonicalPath());
		
		post("/login", LoginService.login);
		
		
		

	}

}
