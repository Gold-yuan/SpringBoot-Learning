package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.didispace.Application;
import com.didispace.prop.FooPropertie;
import com.didispace.prop.PostI;

/**
 * @author adminytf
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class TestM {
	@Autowired
	FooPropertie f;
	@Autowired
	PostI p;

	@Test
	public void a() {
		System.out.println(f.getFoo());
		System.out.println(p);
	}
}
