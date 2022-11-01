//package com.solera.ndproyect.ndproyect;
//
//import java.text.ParseException;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.validation.BindingResult;
//
//import com.solera.ndproyect.ndproyect.controller.TripController;
//import com.solera.ndproyect.ndproyect.entity.Trip;
//
//import uk.co.jemos.podam.api.PodamFactory;
//import uk.co.jemos.podam.api.PodamFactoryImpl;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//public class TripControllerTest {
//
//	@InjectMocks
//	TripController controller;
//	
//	  
//	PodamFactory factory = new PodamFactoryImpl(); 
//	  
//	@Test
//	public void TripTest() throws ParseException {
//		
//		   Trip pojo = factory.manufacturePojo(Trip.class);
//		
//		  controller.trip(pojo);
//		  }
//	
//}
