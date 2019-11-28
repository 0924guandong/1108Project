package com.qf.Dao;

import com.qf.domain.Motif;
import com.qf.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotifDao {

    List<Motif> findAll();

    /**
     * 根据m_id获取分类
     * @param aid
     * @return
     */
    List<Motif> getMotif(Integer aid);


}
