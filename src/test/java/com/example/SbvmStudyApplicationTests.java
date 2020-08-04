package com.example;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
public class SbvmStudyApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	public void contextLoads() {
		 System.out.println(dataSource.getClass());
	}

}
