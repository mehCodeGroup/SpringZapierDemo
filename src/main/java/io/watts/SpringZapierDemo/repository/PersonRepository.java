package io.watts.SpringZapierDemo.repository;

import io.watts.SpringZapierDemo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by iyasuwatts on 11/8/17.
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
