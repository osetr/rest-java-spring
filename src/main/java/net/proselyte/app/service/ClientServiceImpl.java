package net.proselyte.app.service;

import lombok.extern.slf4j.Slf4j;
import net.proselyte.app.model.Client;
import net.proselyte.app.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementations of {@link ClientService} interface.
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */

@Slf4j
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client getById(Integer id) {
        return clientRepository.findOne(id);
    }

    @Override
    public void save(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void delete(Integer id) {
        clientRepository.delete(id);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }
}
