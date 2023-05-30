package VittorioVescio.U5W1D2.entities.ordini;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import VittorioVescio.U5W1D2.config.BeansConfiguration;
import VittorioVescio.U5W1D2.entities.BoscaiolaDecorator;
import VittorioVescio.U5W1D2.entities.ExtraPepeDecorator;
import VittorioVescio.U5W1D2.entities.Ferrarelle;
import VittorioVescio.U5W1D2.entities.HawaianaDecorator;
import VittorioVescio.U5W1D2.entities.MaxiPizzaDecorator;
import VittorioVescio.U5W1D2.entities.Pizza;
import VittorioVescio.U5W1D2.entities.Prodotto;

@Component
public class OrdiniRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		menu();
	}

	public static void menu() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);
		System.out.println();

		Pizza margherita = (Pizza) ctx.getBean("margherita");
		BoscaiolaDecorator boscaiola = (BoscaiolaDecorator) ctx.getBean("boscaiola");
		HawaianaDecorator hawaiana = (HawaianaDecorator) ctx.getBean("hawaiana");
		MaxiPizzaDecorator boscaiolaMaxi = (MaxiPizzaDecorator) ctx.getBean("boscaiolaMaxi");
		ExtraPepeDecorator boscaiolaPepata = new ExtraPepeDecorator(boscaiola);
		Ferrarelle ferrarelle = (Ferrarelle) ctx.getBean("ferrarelle");
		Tavolo tavolo1 = new Tavolo(1, 4, StatoTavolo.LIBERO);
		List<Prodotto> lista = new ArrayList<>(Arrays.asList(margherita, ferrarelle));
		Ordine ord1 = new Ordine(tavolo1, lista, 1, StatoOrdine.IN_CORSO, 1, LocalDateTime.of(2023, 05, 30, 12, 30));

		System.out.println(margherita.toString());
		System.out.println(boscaiola.toString());
		System.out.println(hawaiana.toString());
		System.out.println(boscaiolaMaxi.toString());
		System.out.println(boscaiolaPepata.toString());
		System.out.println(ferrarelle.toString());
		System.out.println(ord1.toString());

		ctx.close();
	}
}
