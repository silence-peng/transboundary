package com.daji.mapper;

import com.daji.pojo.SelectOrder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("selectOrderMapper")
public interface SelectOrderMapper {
    List<SelectOrder> selectAll();
}
