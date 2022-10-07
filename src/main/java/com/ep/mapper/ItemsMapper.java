package com.ep.mapper;

import com.ep.domain.Items;
import org.apache.ibatis.annotations.Param;

/***
 * @author dep
 * @version 1.0
 */
public interface ItemsMapper {
    public Items findById(Integer id);
}
