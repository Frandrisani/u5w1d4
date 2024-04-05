package francescoandrisani.u5w1d4.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
	private List<Pizza> pizzaList;
	private List<Drink> drinkList;
	private List<Topping> toppingList;
	private List<Ordine> ordini;

	public void printMenu() {
		System.out.println("******* Menu *******");
		System.out.println("PIZZAS");
		this.pizzaList.forEach(System.out::println);
		System.out.println();

		System.out.println("TOPPINGS");
		this.toppingList.forEach(System.out::println);
		System.out.println();

		System.out.println("DRINKS");
		this.drinkList.forEach(System.out::println);
		System.out.println();

		System.out.println("ORDINI");
		this.ordini.forEach(System.out::println);
		System.out.println();

	}
}
