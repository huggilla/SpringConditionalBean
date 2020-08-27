/**
 * 
 */
package com.springboot.test.condition;

import java.time.LocalDate;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author v.huggila
 *
 */
public class OddDayOfTheMonthConditon implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

		int dayOfTheMonth = LocalDate.now().getDayOfMonth();
		System.out.println("=============>" + dayOfTheMonth);
		if (dayOfTheMonth % 2 != 0)
			return true;
		return false;

	}

}
