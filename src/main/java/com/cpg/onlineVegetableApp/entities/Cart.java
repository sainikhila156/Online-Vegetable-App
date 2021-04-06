package com.cpg.onlineVegetableApp.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/************************************************************************************
 *          @author          Sai Nikhila
 *          Description      It is a entity class for cart default constructor, parameterized
 *                           constructor along with getters and setters 
 *         Version             1.0
 *         Created Date    25-March-2020
 ************************************************************************************/
@Entity
@Table(name="Cart")
public class Cart {
	@Id
	
	private int cartId;
	private int custId;
	@OneToMany 
	private List<VegetableDTO> vegetables;
	
	/************************************************************************************
	 * Method:                          Cart
     *Description:                      It is used to initialize the empty constructor.
     *Created By                      - Sai Nikhila
     *Created Date                    - 25-MARCH-2021                           
	 
	 ************************************************************************************/
	public Cart() {
		super();
	}
	
	/************************************************************************************
	 * Method:                          patient
     *Description:                      It is used to initialize the parameterized constructor.
	 * @param cartId
	 * @param custId
	 * @param vegetables
	 * *Created By                     - Sai Nikhila
     *Created Date                     - 25-MARCH-2021 
	 ************************************************************************************/
	public Cart(int cartId, int custId, List<VegetableDTO> vegetables) {
		super();
		this.cartId = cartId;
		this.custId = custId;
		this.vegetables = vegetables;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public List<VegetableDTO> getVegetables() {
		return vegetables;
	}
	public void setVegetables(List<VegetableDTO> vegetables) {
		this.vegetables = vegetables;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", custId=" + custId + ", vegetables=" + vegetables + "]";
	}
	

}
