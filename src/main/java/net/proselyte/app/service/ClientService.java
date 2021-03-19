package net.proselyte.app.service;

import net.proselyte.app.model.Client;

import java.util.List;

/**
 * Service interface for {@link Client} class.
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */

public interface ClientService {

    Client getById(Integer id);

    void save(Client customer);

    void delete(Integer id);

    List<Client> getAll();
}
