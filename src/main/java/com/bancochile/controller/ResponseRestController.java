package com.bancochile.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancochile.domain.Message;

@RestController
public class ResponseRestController {

	@RequestMapping("/hello/{player}")
	public Message message(@PathVariable String player) {
		Message message = new Message(player, "Hola " + player);
		return message;
	}
}
