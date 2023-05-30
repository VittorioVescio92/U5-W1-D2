package VittorioVescio.U5W1D2.entities;

public class MaxiPizzaDecorator extends ExtraAdditionDecorator {
	public MaxiPizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getNome() {
		return pizza.getNome() + " formato Maxi!";
	};

	@Override
	public double getPrezzo() {
		return pizza.getPrezzo() * 2;
	}

	@Override
	public String getIngredienti() {
		return pizza.getIngredienti();
	}

	@Override
	public long getCalorie() {
		return pizza.getCalorie() * 2;
	}

	@Override
	public String toString() {
		return "[ " + "Nome = " + getNome() + ", Prezzo = " + "€ " + getPrezzo() + ", Ingredienti = " + getIngredienti()
				+ ", Calorie = " + getCalorie() + "]";
	}

}
