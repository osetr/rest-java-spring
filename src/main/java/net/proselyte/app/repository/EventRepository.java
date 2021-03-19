package net.proselyte.app.repository;

import net.proselyte.app.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Event} class.
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */
public interface EventRepository extends JpaRepository<Event, Integer> {
}
