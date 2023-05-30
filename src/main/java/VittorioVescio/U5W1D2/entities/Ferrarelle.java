package VittorioVescio.U5W1D2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ferrarelle extends Consumation {
	private String nome = "Acqua Ferrarelle";
	private long calorie = 50;
	private double prezzo = 2.00;
	private double volume = 1.5;

	@Override
	public String toString() {
		return "[ " + "Nome = " + getNome() + ", Prezzo = " + "€ " + getPrezzo() + ", Calorie = " + getCalorie()
				+ ", Volume (l) = " + getVolume() + "]";
	}
}
