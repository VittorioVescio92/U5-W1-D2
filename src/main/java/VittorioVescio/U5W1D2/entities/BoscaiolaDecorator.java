package VittorioVescio.U5W1D2.entities;

public class BoscaiolaDecorator extends ExtraAdditionDecorator {
	public BoscaiolaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getNome() {
		return "Boscaiola";
	};

	@Override
	public double getPrezzo() {
		return pizza.getPrezzo() + 2.00;
	}

	@Override
	public String getIngredienti() {
		return pizza.getIngredienti() + ", salsiccia e funghi porcini";
	}

	@Override
	public long getCalorie() {
		return pizza.getCalorie() + 500;
	}

	@Override
	public String toString() {
		return "[ " + "Nome = " + getNome() + ", Prezzo = " + "€ " + getPrezzo() + ", Ingredienti = " + getIngredienti()
				+ ", Calorie = " + getCalorie() + "]";
	}

}
