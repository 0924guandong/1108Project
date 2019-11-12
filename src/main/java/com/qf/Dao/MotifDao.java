package com.qf.Dao;

import com.qf.domain.Motif;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotifDao {

    List<Motif> findAll();

//    List<>

}
