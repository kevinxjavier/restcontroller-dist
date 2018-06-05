package com.bancochile.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "player")
public class Message {
	private String name;
	private String text;
	
	public Message() {
		/*
			@XmlRootElement(name = "player")
			
			Para activar XmlRootElement agregar al pom.xml
			 <dependency>
				<groupId>javax.xml.bind</groupId>
				<artifactId>jaxb-api</artifactId>
				<version>2.1</version>
			</dependency>
			
			Al colocar esta anotacion se debe crear este constructor,
			Ahora se debe invocar asi el rest para obtener un formato json
			http://localhost:8080/restcontroller-dist/hello/kevin.json
			http://localhost:8080/restcontroller-dist/hello/kevin.xml
			Por defecto devuelve un xml: http://localhost:8080/restcontroller-dist/hello/kevin
		*/	
	}
	public Message(String name, String text) {
		this.name = name;
		this.text = text;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
