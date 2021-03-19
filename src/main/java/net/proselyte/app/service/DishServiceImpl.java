package net.proselyte.app.service;

import lombok.extern.slf4j.Slf4j;
import net.proselyte.app.model.Dish;
import net.proselyte.app.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementations of {@link DishService} interface.
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */

@Slf4j
@Service
public class DishServiceImpl implements DishService {

    @Autowired
    DishRepository clientRepository;

    @Override
    public Dish getById(Integer id) {
        return clientRepository.findOne(id);
    }

    @Override
    public void save(Dish client) {
        clientRepository.save(client);
    }

    @Override
    public void delete(Integer id) {
        clientRepository.delete(id);
    }

    @Override
    public List<Dish> getAll() {
        return clientRepository.findAll();
    }
}
