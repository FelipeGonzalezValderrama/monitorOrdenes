package cl.talentoDigital.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.talentoDigital.models.Customer;
import cl.talentoDigital.repositorys.ICustomerRepository;
@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	ICustomerRepository dao;

	@Override
	public List<Customer> findAll() {
		return (List<Customer>) dao.findAll();
	}



}
