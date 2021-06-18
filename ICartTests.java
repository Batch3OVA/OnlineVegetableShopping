package com.vegetable.mgmt.test.cart;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.vegetable.mgmt.entities.VegetableDTO;
import com.vegetable.mgmt.exceptions.EmptyCartFoundException;
import com.vegetable.mgmt.entities.CartDTO;
import com.vegetable.mgmt.entities.Customer;
import com.vegetable.mgmt.repository.ICartRepository;
import com.vegetable.mgmt.repository.IVegetableMgmtRepository;
import com.vegetable.mgmt.service.ICartService;
import com.vegetable.mgmt.service.impl.ICartServiceImpl;
@SpringBootTest
class ICartTests {

	@Autowired
    ICartServiceImpl cartService;
	@Autowired
	ICartRepository cartRepo;
	@Autowired
	IVegetableMgmtRepository vegrepo;
	
	List<VegetableDTO> list=new ArrayList<>();
//	CartDTO cart=new CartDTO();
//	VegetableDTO veg=new VegetableDTO();
	
	@Test
	void testAddToCart() {
		CartDTO cart=new CartDTO();
		cart.setCartId(1111);
		list.add(new VegetableDTO(2348,"radish","root",50,6));
		cart.setVegetables(list);
		assertEquals("Item is successfully added to the cart with the cartid",cartService.addToCart(cart));	
	}
	
	@Test
	void testUpdateItemQuantity() {
	     	CartDTO cart=new CartDTO();
	        cart.setCartId(1269);
		    VegetableDTO veg=new VegetableDTO();
		    veg.setVegId(2342);
		    veg.setQuantity(14);
		    veg.setName("beetroot");
		    assertEquals("Item Quantity updated sucessfully",cartService.updateItemQuantity(veg,1269,2342,14));
	}
	
	@Test
	void testViewAllItems() {
		int cartId=1269;
		int size=1;
		int size1=cartRepo.findAllByCartId(1269).size();
		assertEquals(size,size1);
	}
	
  @Test
  void testRemoveAllItems() {
	 int cartId=1239;
	 cartService.removeAllItems(cartId);
	 assertEquals("Entire Cart items of" +cartId+ "are deleted sucessfully",cartService.removeAllItems(cartId));
    
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
