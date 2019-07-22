package com.herion.esskeetitmusic;

import com.herion.esskeetitmusic.dao.IPlayListDao;
import com.herion.esskeetitmusic.entity.PlayList;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSession;

import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IPlayListDao playListDao = session.getMapper(IPlayListDao.class);
        List<PlayList> playLists = playListDao.findAll();
        for (PlayList playList : playLists){
            System.out.println(playList);
        }
        session.close();
        in.close();
    }
}
