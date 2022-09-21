package cl.talentoDigital.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import cl.talentoDigital.models.Order;

public interface IOrderRepository extends CrudRepository<Order, Integer> {
	
	@Query(value="select * from orders where status=?1 and customernumber=?2 and orderdate between to_date(?3,'yyyy-mm-dd') and to_date(?4,'yyyy-mm-dd')", nativeQuery = true)
	public List<Order> findByStatusClienteFecha(String status, String customer, String fechaOrden1, String fechaOrden2);
	

	/*@Query(value="select * FROM usuario WHERE nombre = ?1 and clave = ?2", nativeQuery = true)//Usuario y no usuario ni USUARIO
	public List<Usuario> findByNombreAndClave(String nombre, String clave);*/
}
