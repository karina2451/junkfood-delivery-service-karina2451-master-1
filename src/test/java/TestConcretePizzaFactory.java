/**
 * @author Karina Medwenitsch
 * @since May 2022
 * This class is to test the createPizza() method and to check if the right type of Pizza is created.
 * Also it tests if the inheritance hierarchy is correct.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lecture.junkfood.Junkfood;
import org.lecture.junkfood.pizza.*;

public class TestConcretePizzaFactory {

    @Test
    public void testCreateMargherita() {
        ConcretePizzaFactory cpf = new ConcretePizzaFactory();
        int number = 4;
        Assertions.assertTrue(cpf.createPizza(number) instanceof Margherita);
    }

    @Test
    public void testCreateSalami() {
        ConcretePizzaFactory cpf = new ConcretePizzaFactory();
        int number = 5;
        Assertions.assertTrue(cpf.createPizza(number) instanceof Salami);
    }

    @Test
    public void testCreateCardinale() {
        ConcretePizzaFactory cpf = new ConcretePizzaFactory();
        int number = 6;
        Assertions.assertTrue(cpf.createPizza(number) instanceof Cardinale);
    }

    @Test
    public void testCardinaleInstanceOfPizza() {
        ConcretePizzaFactory cpf = new ConcretePizzaFactory();
        int number = 6;
        Assertions.assertTrue(cpf.createPizza(number) instanceof Pizza);
    }

    @Test
    public void testCardinaleInstanceOfJunkfood() {
        ConcretePizzaFactory cpf = new ConcretePizzaFactory();
        int number = 6;
        Assertions.assertTrue(cpf.createPizza(number) instanceof Junkfood);
    }
}
