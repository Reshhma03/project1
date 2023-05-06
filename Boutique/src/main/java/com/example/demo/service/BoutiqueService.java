package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.BoutiqueModel;
import com.example.demo.repository.BoutiqueRepo;

@Service
public class BoutiqueService {
	@Autowired
	public BoutiqueRepo brepo;
	public BoutiqueModel saveInfo(BoutiqueModel bm)
	{
		return brepo.save(bm);
	}
	public List <BoutiqueModel> getInfo(){
		return brepo.findAll();
	}
	public BoutiqueModel UpdateInfo(BoutiqueModel io)
	{
		return brepo.saveAndFlush(io);
	}
	public void deleteInfo(int id)
	{
		brepo.deleteById(id);
	}
	//sorting
	public List<BoutiqueModel> sortDesc(String pname)
	{
		return brepo.findAll(Sort.by(pname).descending());
	}
	public List<BoutiqueModel> sortAsc(String pname)
	{
		return brepo.findAll(Sort.by(pname).ascending());
	}
	//Pagination
	public List<BoutiqueModel> paginationnData(int pageno, int pageSize)
	{
		Page<BoutiqueModel> p=brepo.findAll(PageRequest.of(pageno, pageSize));
		return p.getContent();
	}
	public List<BoutiqueModel> paginationAndSorting(int pageno,int pageSize,String pname)
	{
		Page<BoutiqueModel> p=brepo.findAll(PageRequest.of(pageno, pageSize,Sort.by(pname).descending()));
		return p.getContent();
	}



}
