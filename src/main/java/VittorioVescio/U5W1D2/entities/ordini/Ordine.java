package VittorioVescio.U5W1D2.entities.ordini;

import java.time.LocalDateTime;
import java.util.List;

import VittorioVescio.U5W1D2.entities.Prodotto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ordine {
	private Tavolo tavolo;
	private List<Prodotto> comanda;
	private int numOrdine;
	private StatoOrdine stato;
	private int coperti;
	private LocalDateTime oraComanda;
	private double costoTot;
//	@Value("${application.costoCoperto}")
	private double costoCoperto;

	public Ordine(Tavolo tavolo, List<Prodotto> comanda, int numOrdine, StatoOrdine stato, int coperti,
			LocalDateTime oraComanda) {
		super();
		this.tavolo = tavolo;
		this.comanda = comanda;
		this.numOrdine = numOrdine;
		this.stato = stato;
		this.coperti = coperti;
		this.oraComanda = oraComanda;
		setCostoCoperto(1.50 * coperti);
		setCostoTot(totOrdine(comanda) + getCostoCoperto());
	}

	public double totOrdine(List<Prodotto> p) {
		double somma = p.stream().mapToDouble(Prodotto::getPrezzo).sum();
		return somma;
	}

}
