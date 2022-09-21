package cl.talentoDigital.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.talentoDigital.models.Customer;
import cl.talentoDigital.repositorys.ICustomerRepository;

public interface ICustomerService {

	public List<Customer> findAll();
	
	
}
