package com.qf.service.Impl;

import com.qf.Dao.MotifDao;
import com.qf.domain.Motif;
import com.qf.service.MotifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotifImpl implements MotifService {

    @Autowired
    private MotifDao motifDao;

    @Override
    public List<Motif> findAll() {
        List<Motif> mf = motifDao.findAll();

        return mf;
    }
}
