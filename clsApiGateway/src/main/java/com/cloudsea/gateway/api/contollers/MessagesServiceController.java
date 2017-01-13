package com.cloudsea.gateway.api.contollers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@FeignClient("cls-message-service")
interface MessageReader {

	@RequestMapping(method = RequestMethod.GET, value = "messages")
	Resources<ClsMessage> read();
}

class ClsMessage {

	private String message;

	public String getMessage() {
		return message;
	}

}

@RestController
@RequestMapping("/messages")
public class MessagesServiceController {

	private final MessageReader messgeReader;

	@Autowired
	public MessagesServiceController(MessageReader messageReader) {
		this.messgeReader = messageReader;
	}

//	@RequestMapping(method = RequestMethod.POST)
//	public void write(@RequestBody ClsMessage clsMessage) {
//
//		Message<String> msg = MessageBuilder.withPayload(clsMessage.getMessage()).build();
//		messageOutput.send(msg);
//	}

	@RequestMapping(method = RequestMethod.GET, value = "/data")
	@HystrixCommand(fallbackMethod = "fallBackForMessages")
	public Collection<String> read() {

		return this.messgeReader.read().getContent().stream().map(ClsMessage::getMessage).collect(Collectors.toList());
	}

	public Collection<String> fallBackForMessages() {
		return new ArrayList<>();
	}
}
