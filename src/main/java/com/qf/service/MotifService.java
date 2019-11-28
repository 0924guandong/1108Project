package com.qf.service;

import com.qf.Dao.MotifDao;
import com.qf.domain.Motif;
import com.qf.domain.User;

import java.util.List;

public interface MotifService {

    List<Motif> findAll();

    /**
     * 根据m_id获取分类
     * @param aid
     * @return
     */
    List<Motif> getMotif(Integer aid);

}
