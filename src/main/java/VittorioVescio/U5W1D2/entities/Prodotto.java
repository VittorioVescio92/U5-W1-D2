package VittorioVescio.U5W1D2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Prodotto {
	protected String nome;
	protected double prezzo;
	private String nota;
}
