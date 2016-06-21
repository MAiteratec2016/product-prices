package product;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductPricesRepository extends CrudRepository<ProductPrice, Long> {
	
	List<ProductPrice> findByPrice(@Param("price") double price);
}
