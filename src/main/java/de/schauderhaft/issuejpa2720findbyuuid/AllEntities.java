package de.schauderhaft.issuejpa2720findbyuuid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface AllEntities extends JpaRepository<SomeEntity, UUID> {
	@Query("select e from SomeEntity e where e.id = ?1")
	Optional<SomeEntity> findByAltId(UUID id);
}
