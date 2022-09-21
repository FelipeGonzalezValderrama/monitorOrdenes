package cl.talentoDigital.repositorys;

import org.springframework.data.repository.CrudRepository;

import cl.talentoDigital.models.Customer;

public interface ICustomerRepository extends CrudRepository<Customer, Integer> {

}
