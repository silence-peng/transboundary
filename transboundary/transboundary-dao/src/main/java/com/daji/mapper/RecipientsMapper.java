package com.daji.mapper;

import com.daji.pojo.Recipients;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("recipientsMapper")
public interface RecipientsMapper extends tk.mybatis.mapper.common.Mapper<Recipients> {
}
