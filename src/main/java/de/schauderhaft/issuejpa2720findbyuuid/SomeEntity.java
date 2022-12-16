package de.schauderhaft.issuejpa2720findbyuuid;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class SomeEntity {
	@Id
	UUID id;

	String name;

	public SomeEntity(String one) {
		id = UUID.randomUUID();
	}

	public SomeEntity() {

	}
}
