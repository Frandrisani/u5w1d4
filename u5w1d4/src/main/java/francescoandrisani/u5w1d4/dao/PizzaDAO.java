package francescoandrisani.u5w1d4.dao;

import francescoandrisani.u5w1d4.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaDAO extends JpaRepository<Pizza, Integer> {


}
