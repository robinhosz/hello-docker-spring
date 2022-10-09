package br.com.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.docker.model.DockerPojo;

@RestController
public class DockerController {

	
	@RequestMapping("/hello-docker")
	public DockerPojo greeting() {
		
		var hostName = System.getenv("HOSTNAME");
		
		return new DockerPojo("Hello Docker", hostName);
	}
}
