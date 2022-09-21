package cl.talentoDigital.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	@Id
	@Column(name="ordernumber")
	private Integer orderNumber;
	@Column(name="orderdate")
	private Date orderDate;
	@Column(name="requireddate")
	private Date requiredDate;
	@Column(name="shippeddate")
	private Date shippedDate;
	private String status;
	private String comments;
	@Column(name="customernumber")
	private Integer customerNumber;
	
	public Integer getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getRequiredDate() {
		return requiredDate;
	}
	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}
	public Date getShippedDate() {
		return shippedDate;
	}
	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Integer getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	

}
