package net.proselyte.app.service;

import lombok.extern.slf4j.Slf4j;
import net.proselyte.app.model.Event;
import net.proselyte.app.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementations of {@link EventService} interface.
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */

@Slf4j
@Service
public class EventServiceImpl implements EventService {

    @Autowired
    EventRepository clientRepository;

    @Override
    public Event getById(Integer id) {
        return clientRepository.findOne(id);
    }

    @Override
    public void save(Event client) {
        clientRepository.save(client);
    }

    @Override
    public void delete(Integer id) {
        clientRepository.delete(id);
    }

    @Override
    public List<Event> getAll() {
        return clientRepository.findAll();
    }
}
