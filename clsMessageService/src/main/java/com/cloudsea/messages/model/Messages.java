package com.cloudsea.messages.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author kshahbaz
 *
 */

@Entity
public class Messages {

	@Id
	@GeneratedValue
	private Long messageId;

	@Enumerated(EnumType.STRING)
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

	public Long getMessageId() {
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
