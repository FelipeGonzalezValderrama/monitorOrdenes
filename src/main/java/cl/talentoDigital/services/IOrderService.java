package cl.talentoDigital.services;

import java.util.List;

import cl.talentoDigital.models.Order;

public interface IOrderService {

	public List<Order> findAll();
	
	public List<Order> findByStatusClienteFecha(String status, String customer, String fechaOrden1, String fechaOrden2);
}
