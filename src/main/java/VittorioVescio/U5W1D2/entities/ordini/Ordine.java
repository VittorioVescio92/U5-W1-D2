package VittorioVescio.U5W1D2.entities.ordini;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import VittorioVescio.U5W1D2.entities.Prodotto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@PropertySource("classpath:application.properties")
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
	@Value("${application.costoCoperto}")
	private double costoCoperto;
	private double costoCopertoTot;

	public Ordine(Tavolo tavolo, List<Prodotto> comanda, int numOrdine, StatoOrdine stato, int coperti,
			LocalDateTime oraComanda) {
		super();
		this.tavolo = tavolo;
		this.comanda = comanda;
		this.numOrdine = numOrdine;
		this.stato = stato;
		this.coperti = coperti;
		this.oraComanda = oraComanda;
		setCostoCopertoTot(costoCoperto * coperti);
		setCostoTot(totOrdine(comanda) + getCostoCopertoTot());
	}

	public double totOrdine(List<Prodotto> p) {
		double somma = p.stream().mapToDouble(Prodotto::getPrezzo).sum();
		return somma;
	}

}
