package net.proselyte.app.service;

import net.proselyte.app.model.Dish;

import java.util.List;

/**
 * Service interface for {@link Dish} class.
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */

public interface DishService {

    Dish getById(Integer id);

    void save(Dish customer);

    void delete(Integer id);

    List<Dish> getAll();
}
