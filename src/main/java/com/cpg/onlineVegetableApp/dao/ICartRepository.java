package com.cpg.onlineVegetableApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpg.onlineVegetableApp.entities.Cart;


/**************************************************************************************
 *        @author           Sai Nikhila
 *      Description         It is cart repository interface that extends jpa repository
 *                          that contains inbuilt methods for various operations
 *      Version             1.0
 *      Created Date        22-MARCH-2021
 *************************************************************************************/
@Repository
public interface ICartRepository extends JpaRepository<Cart, Integer>{
	
}
