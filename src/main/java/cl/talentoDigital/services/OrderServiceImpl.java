package cl.talentoDigital.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.talentoDigital.models.Order;
import cl.talentoDigital.repositorys.IOrderRepository;
@Service
public class OrderServiceImpl implements IOrderService {
	
	@Autowired
	IOrderRepository dao;

	@Override
	public List<Order> findAll() {
		return (List<Order>) dao.findAll();
	}

	@Override
	public List<Order> findByStatusClienteFecha(String status, String customer, String fechaOrden1,
			String fechaOrden2) {
		return dao.findByStatusClienteFecha(status, customer, fechaOrden1, fechaOrden2);
	}

}
