package com.cloudsea.messages.commandline;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cloudsea.messages.model.MessageType;
import com.cloudsea.messages.model.Messages;
import com.cloudsea.messages.repository.MessagesRepository;

/**
 * This class just for adding some dummy data, before the application statrts
 * up.
 * 
 * @author kshahbaz
 *
 */

@Component
public class DummyCommandLineRunner implements CommandLineRunner {

	private final MessagesRepository msgRepository;

	@Autowired
	public DummyCommandLineRunner(MessagesRepository msgRepository) {
		this.msgRepository = msgRepository;
	}

	@Override
	public void run(String... arg0) throws Exception {

		List<Messages> messages = new ArrayList<>();
		messages.add(
				new Messages(MessageType.EMAIL, "shahbaz.khan1003@gmail.com", "jocnudadgmail.com", "Hellow World"));
		messages.add(new Messages(MessageType.EMAIL, "faiz@gmail.com", "jocnudadgmail.com", "Congratulations "));
		messages.add(new Messages(MessageType.EMAIL, "zooby@gmail.com", "jocnudadgmail.com", "Sad to hear that"));

		msgRepository.save(messages);

	}

}
