package product;

import java.util.Currency;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner initData(ProductPricesRepository repo){
		return (args) -> {
			repo.save(new ProductPrice(1, 29.99, Currency.getInstance("EUR")));
			repo.save(new ProductPrice(2, 19.95, Currency.getInstance("EUR")));
			repo.save(new ProductPrice(3, 68.00, Currency.getInstance("USD")));
			repo.save(new ProductPrice(4, 1.98, Currency.getInstance("EUR")));
		};
	}
}
