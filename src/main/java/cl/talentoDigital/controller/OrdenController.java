package cl.talentoDigital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.talentoDigital.services.ICustomerService;
import cl.talentoDigital.services.IOrderService;

@Controller
@RequestMapping("/ordenes")
public class OrdenController {

	@Autowired
	ICustomerService customerService; 
	
	@Autowired
	IOrderService orderService; 
	
	@GetMapping("/ordenes")
	public String listaOrdenes(Model model) {
		model.addAttribute("listaCustomers", customerService.findAll());
		model.addAttribute("listaOrders", orderService.findAll());
	return "mantenedorOrdenes";	
	}
	
	@GetMapping("/filtrar")
	public String filtraListaOrdenes(Model model, @RequestParam(required=false) String status
			, @RequestParam(required=false) String customer
			, @RequestParam(required=false) String orderDate1
			, @RequestParam(required=false) String orderDate2
			) {
		model.addAttribute("listaCustomers", customerService.findAll());
		model.addAttribute("listaOrders", orderService.findByStatusClienteFecha(status, customer, orderDate1, orderDate2));
	return "mantenedorOrdenes";	
	}
	
}
