package VittorioVescio.U5W1D2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Pizza extends Consumation {

	private String ingredienti = "Pomodoro, Mozzarella";
	private String nome = "Margherita";
	private long calorie = 500;
	private double prezzo = 4.50;

	@Override
	public String toString() {
		return "[ " + "Nome = " + getNome() + ", Prezzo = " + "€ " + getPrezzo() + ", Ingredienti = " + getIngredienti()
				+ ", Calorie = " + getCalorie() + "]";
	}
}
