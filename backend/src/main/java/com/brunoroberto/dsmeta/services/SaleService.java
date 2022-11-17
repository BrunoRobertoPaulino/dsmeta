package com.brunoroberto.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunoroberto.dsmeta.entities.Sale;
import com.brunoroberto.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;

	public List<Sale> findSales() {
		return repository.findAll();
	}
	
}
