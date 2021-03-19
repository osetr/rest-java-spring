package net.proselyte.app.service;

import net.proselyte.app.model.Event;

import java.util.List;

/**
 * Service interface for {@link Event} class.
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */

public interface EventService {

    Event getById(Integer id);

    void save(Event customer);

    void delete(Integer id);

    List<Event> getAll();
}
