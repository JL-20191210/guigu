package com.atguigu.fruit.dao;

import com.atguigu.fruit.pojo.Fruit;

import java.util.List;

public interface FruitDAO {
    //获取所有的库存列表信息
    List<Fruit> getFruitList();
    //根据fid查询库存信息
    Fruit getFruitById(Integer fid);
    //更新数据库信息
    void updateFruit(Fruit fruit);
    //添加库存信息
    void addFruit(Fruit fruit);
    //根据fid删除信息
    void DelFruit(Integer fid);
}
