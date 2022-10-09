package br.com.docker.model;

public class DockerPojo {

	private final String content;
	private final String environment;

	public DockerPojo(String content, String environment) {
		super();
		this.content = content;
		this.environment = environment;
	}

	public String getContent() {
		return content;
	}

	public String getEnvironment() {
		return environment;
	}

}
