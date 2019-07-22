package com.herion.esskeetitmusic.dao;

import com.herion.esskeetitmusic.entity.PlayList;

import java.util.List;

public interface IPlayListDao {

    List<PlayList> findAll();       // 查询所有
    void starIncrease();            // 收藏加1
    void starReduce();              // 收藏减1


}
