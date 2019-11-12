package com.qf.service;

import com.qf.Dao.MotifDao;
import com.qf.domain.Motif;

import java.util.List;

public interface MotifService {

    List<Motif> findAll();
}
