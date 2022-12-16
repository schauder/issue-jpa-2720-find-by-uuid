package de.schauderhaft.issuejpa2720findbyuuid;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class IssueFindByUuidApplicationTests {

	@Autowired
	AllEntities allEntities;

	@Test
	void findById() {

		SomeEntity entity = allEntities.save(new SomeEntity("one"));

		SomeEntity reloaded = allEntities.findById(entity.id).get();
	}
	@Test
	void findByAltId() {

		SomeEntity entity = allEntities.save(new SomeEntity("one"));

		SomeEntity reloaded = allEntities.findByAltId(entity.id).get();
	}

}
