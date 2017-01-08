package com.cloudsea.messages.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author kshahbaz
 *
 */

@Document(collection="messages")
public class Messages {

	@Id
	private String messageId;

	private MessageType messageType;

	private String senderIdentifier;

	private String recipient;

	private String message;

	public Messages() {
		super();
	}

	public Messages(MessageType messageType, String senderIdentifier, String recipient, String message) {
		super();
		this.messageType = messageType;
		this.senderIdentifier = senderIdentifier;
		this.recipient = recipient;
		this.message = message;
	}

	public String getMessageId() {
		return messageId;
	}

	public MessageType getMessageType() {
		return messageType;
	}

	public String getSenderIdentifier() {
		return senderIdentifier;
	}

	public String getRecipient() {
		return recipient;
	}

	public String getMessage() {
		return message;
	}

}
