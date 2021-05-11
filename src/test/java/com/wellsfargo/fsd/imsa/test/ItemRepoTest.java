package com.wellsfargo.fsd.imsa.test;

import java.time.LocalDate;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.wellsfargo.fsd.imsa.dao.ItemRepository;
import com.wellsfargo.fsd.imsa.entity.Item;

@DataJpaTest
public class ItemRepoTest {
	
	@Autowired
	private ItemRepository itemRepo;
	@Autowired
	private TestEntityManager entityManager;
	
	
	@BeforeEach
	public void setUp() {
		List<Object> testData = Arrays.asList(new Item[]{
			new Item(101, "Rice Bag", LocalDate.now(), true, "Bag", 1024.0, 2020.0)
		
		});
		
		for(Item item:testData) {
			entityManager.persistAndFlush(item);
			
		}
	}
	
	
	
	
	
	

}
