package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BoutiqueModel;
import com.example.demo.repository.BoutiqueRepo;
import com.example.demo.service.BoutiqueService;

import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
public class BoutiqueController {
	@Autowired
	public BoutiqueService bserv;
	@Tag(name="Post",description="To add the details")
	@PostMapping("/save")
	public BoutiqueModel addDetails(@RequestBody BoutiqueModel phm)
	{
		return bserv.saveInfo(phm);
	}
	
	@Tag(name="Post",description="To add the details")
	@GetMapping("/get")
	public List <BoutiqueModel> getDetails(){
		return bserv.getInfo();
	}

	@Tag(name="Post",description="To add the details")
	@PutMapping("/update")
	public BoutiqueModel display(@RequestBody BoutiqueModel pm)
	{
		return bserv.UpdateInfo(pm);
	}
	
	@Tag(name="Post",description="To add the details")
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable int id)
	{
		bserv.deleteInfo(id);
		return "Id "+id+" deleted";
	}
	
	@Tag(name="Post",description="To add the details")
	@DeleteMapping("/del")
	public String deleteByParams(@RequestParam int id)
	{
		bserv.deleteInfo(id);
		return "Id "+id+" deleted";
	}
	
	@Tag(name="Post",description="To add the details")
	@GetMapping("/sortDes/{pname}")
	public List<BoutiqueModel> sortPlayer(@PathVariable("pname") String pname)
	{
		return bserv.sortDesc(pname);
	}
	
	@Tag(name="Post",description="To add the details")
	@GetMapping("/sortAsc/{pname}")
	public List<BoutiqueModel> sort(@PathVariable("pname") String pname)
	{
		return bserv.sortAsc(pname);
	}
	//pagination
	
	@Tag(name="Post",description="To add the details")
	@GetMapping("/pagination/{pno}/{psize}")
	public List<BoutiqueModel> paginationData(@PathVariable("pno") int pno,@PathVariable("psize") int psize)
	{
		return bserv.paginationnData(pno, psize);
	}
	
	@Tag(name="Post",description="To add the details")
	@GetMapping("/paginationsort/{pno}/{psize}/{pname}")
	public List<BoutiqueModel>paginationAndSorting(@PathVariable("pno")int pno,@PathVariable("psize")int psize,@PathVariable("pname")String pname)
	{
		return bserv.paginationAndSorting(pno,psize,pname);
	}
	
	//queries
	@Autowired
	public BoutiqueRepo ir;

	@Tag( name="Native query",description="Getting details")
	@GetMapping("/saveir")
	public List<BoutiqueModel> getD()
	{
		return ir.getAllData();
	}

	@Tag( name="Native query",description="Getting details by id")
	@GetMapping("byName/{id}")
	public List<BoutiqueModel> getName(@PathVariable ("id") int pid )
	{
		return ir.byCafenum(pid);
	}

	@Tag( name="Native query",description="Getting details by start end method")
	@GetMapping("startend/{start}/{end}")
	public List<BoutiqueModel> getStart(@PathVariable ("start")int start,@PathVariable ("end")int end)
	{
		return ir.startEnd(start, end);
	}

	@Tag( name="Native query",description="Deleting details by id and name")
	@DeleteMapping("/del/{id}/{name}")
	public String delD(@PathVariable ("id") int id,@PathVariable ("name")String name)
	{
		ir.deleteD(id, name);
		return "deleted";
	}

	@Tag( name="Native query",description="Posting details")
	@PutMapping("updatee/{pid}/{pname}")
	public void updateQue(@PathVariable("pid")int pid,@PathVariable("pname") String pname)
	{
		ir.updateByQuery(pid, pname);
	}

	@Tag( name="JPQL",description="Getting details by methods")
	@GetMapping("jp")
	public List<BoutiqueModel> jplQuery()
	{
		return ir.jpqlQ();
	}

	@Tag( name="JPQL",description="Getting details by id")
	@GetMapping("/upp/{id}")
	public List<BoutiqueModel> jpqUp(@PathVariable ("id") int id)
	{
		return ir.jqBYCon(id);
	}
	

}
