/**
 * 
 */
package com.springboot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.test.beans.Vehicle;

/**
 * @author v.huggila
 *
 */
@Component
public class DriveVehicle {

	@Autowired
	Vehicle vehicle;

	public void drive() {
		System.out.println("driving vehicle ===>" + vehicle.getVehicle());
	}

}
