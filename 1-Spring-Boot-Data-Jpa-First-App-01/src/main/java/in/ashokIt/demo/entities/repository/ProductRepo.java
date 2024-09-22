package in.ashokIt.demo.entities.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import in.ashokIt.demo.entities.Product;

public interface ProductRepo extends CrudRepository<Product,Serializable> {

}
