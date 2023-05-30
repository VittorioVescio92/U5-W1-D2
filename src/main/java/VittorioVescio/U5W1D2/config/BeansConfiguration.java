package VittorioVescio.U5W1D2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import VittorioVescio.U5W1D2.entities.BoscaiolaDecorator;
import VittorioVescio.U5W1D2.entities.ExtraPepeDecorator;
import VittorioVescio.U5W1D2.entities.Ferrarelle;
import VittorioVescio.U5W1D2.entities.HawaianaDecorator;
import VittorioVescio.U5W1D2.entities.MaxiPizzaDecorator;
import VittorioVescio.U5W1D2.entities.Pizza;

@PropertySource("classpath:application.properties")
@Configuration
public class BeansConfiguration {
	@Bean
	Pizza margherita() {
		return new Pizza();
	}

	@Bean
	BoscaiolaDecorator boscaiola(Pizza margherita) {
		return new BoscaiolaDecorator(margherita);
	}

	@Bean
	HawaianaDecorator hawaiana(Pizza margherita) {
		return new HawaianaDecorator(margherita);
	}

	@Bean
	MaxiPizzaDecorator boscaiolaMaxi(BoscaiolaDecorator b) {
		return new MaxiPizzaDecorator(b);
	}

	@Bean
	ExtraPepeDecorator extraPepe(BoscaiolaDecorator b) {
		return new ExtraPepeDecorator(b);
	}

	@Bean
	Ferrarelle ferrarelle() {
		return new Ferrarelle();
	}
}
