package com.example.demo;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
@ApplicationPath("/webapi/*")
public class Application extends ResourceConfig {

	public Application() {
		super();
		packages("com.example.demo");
	}
}

