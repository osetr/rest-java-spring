package net.proselyte.app.repository;

import net.proselyte.app.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Client} class.
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
