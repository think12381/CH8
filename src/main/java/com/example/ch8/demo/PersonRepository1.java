package com.example.ch8.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository1 extends CustomRepository<Person,Long> {
    //使用方法名查询,返回列表
    List<Person> findByAddress(String address);
    //使用方法名查询，返回单个对象
    Person findByNameAndAddress(String name,String address);
    //使用query查询，参数按照名称绑定
    @Query(value = "select p from Person p where p.name=:name and p.address=:address")
    Person withNameAndAddressQuery(@Param("name")String name, @Param("address")String address);
    //使用NamedQuery查询，在实体类中做了定义
    List<Person> withNameAndAddressNamedQuery(String name,String address);
}