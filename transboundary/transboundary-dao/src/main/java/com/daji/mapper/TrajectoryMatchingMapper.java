package com.daji.mapper;

import com.daji.pojo.TrajectoryMatching;
import org.springframework.stereotype.Repository;


@Repository("trajectoryMatchingMapper")
public interface TrajectoryMatchingMapper extends tk.mybatis.mapper.common.Mapper<TrajectoryMatching> {
}
