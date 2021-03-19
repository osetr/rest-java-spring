package net.proselyte.app.repository;

import net.proselyte.app.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Dish} class.
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */
public interface DishRepository extends JpaRepository<Dish, Integer> {
}
