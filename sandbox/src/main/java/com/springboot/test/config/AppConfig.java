/**
 * 
 */
package com.springboot.test.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.springboot.test.beans.Car;
import com.springboot.test.beans.Truck;
import com.springboot.test.beans.Vehicle;
import com.springboot.test.condition.EvenDayOfTheMonthConditon;
import com.springboot.test.condition.OddDayOfTheMonthConditon;

/**
 * @author v.huggila
 *
 */

@Configuration
public class AppConfig {
	@Bean
	@Conditional(OddDayOfTheMonthConditon.class)
	public Vehicle getCar() {
		return new Car();
	}

	@Bean
	@Conditional(EvenDayOfTheMonthConditon.class)
	public Vehicle getTruck() {
		return new Truck();
	}

}
