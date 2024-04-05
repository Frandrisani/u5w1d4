package francescoandrisani.u5w1d4.dao;

import francescoandrisani.u5w1d4.entities.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {
    @Autowired
    private PizzaDAO usersDAO;
}
