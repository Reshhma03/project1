package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.BoutiqueModel;

import jakarta.transaction.Transactional;

public interface BoutiqueRepo extends JpaRepository<BoutiqueModel, Integer> {
	@Query(value="select * from Dress ",nativeQuery=true)
    public List<BoutiqueModel> getAllData();
    
    @Query(value="select * from Dress where id=:id",nativeQuery=true)
    public List<BoutiqueModel> byCafenum (@Param("id")int id);
    
    @Query(value="select * from Dress where id between :start and :end",nativeQuery=true)
    public List<BoutiqueModel> startEnd(@Param("start") int start,@Param("end")int end);
    
    @Modifying
    @Transactional
    @Query(value="delete from Dress where id=?1 and dname=?2",nativeQuery = true)
    Integer deleteD(@Param("id") int pid,@Param ("name") String pname);
    
    @Modifying
    @Transactional
    @Query(value="update Dress set id=:pid where dname=:pname",nativeQuery=true)
    public void updateByQuery(@Param ("pid")int pid,@Param ("pname")String pname);
    
    @Query(value="select c from BoutiqueModel c")
    List<BoutiqueModel> jpqlQ();
    
    @Query(value="select c from BoutiqueModel c where c.id=?1")
    public List<BoutiqueModel> jqBYCon(@Param ("id")int sid);

}
