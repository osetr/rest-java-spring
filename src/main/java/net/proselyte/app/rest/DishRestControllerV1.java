package net.proselyte.app.rest;

import net.proselyte.app.model.Dish;
import net.proselyte.app.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

/**
 * REST controller for {@link Dish} connected requests.
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */

@RestController
@RequestMapping("/api/v1/dishs/")
public class DishRestControllerV1 {

    @Autowired
    private DishService dishService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Dish> getDish(@PathVariable("id") Integer dishId) {
        if (dishId == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Dish dish = this.dishService.getById(dishId);

        if (dish == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(dish, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Dish> saveDish(@RequestBody @Valid Dish dish) {
        HttpHeaders headers = new HttpHeaders();

        if (dish == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.dishService.save(dish);
        return new ResponseEntity<>(dish, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Dish> updateDish(@RequestBody @Valid Dish dish, UriComponentsBuilder builder) {
        HttpHeaders headers = new HttpHeaders();

        if (dish == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.dishService.save(dish);

        return new ResponseEntity<>(dish, headers, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Dish> deleteDish(@PathVariable("id") Integer id) {
        Dish dish = this.dishService.getById(id);

        if (dish == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        this.dishService.delete(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Dish>> getAllDishs() {
        List<Dish> dishs = this.dishService.getAll();

        if (dishs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(dishs, HttpStatus.OK);
    }
}
