package hello;

import org.springframework.data.repository.CrudRepository;

public interface GreetingsRepository extends CrudRepository<Greetings,Long> {

}