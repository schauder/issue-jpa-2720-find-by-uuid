package de.schauderhaft.issuejpa2720findbyuuid;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IssueFindByUuidApplicationTests {

	@Autowired
	AllEntities allEntities;

	@Autowired
	EntityManager em;

	@Test
	void findById() {

		SomeEntity entity = allEntities.save(new SomeEntity("one"));
		em.clear();

		SomeEntity reloaded = allEntities.findById(entity.id).get();
	}

	@Test
	void findByAltId() {

		SomeEntity entity = allEntities.save(new SomeEntity("one"));
		em.clear();

		SomeEntity reloaded = allEntities.findByAltId(entity.id).get();
	}

}
