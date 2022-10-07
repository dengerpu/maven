package com.ep;

import com.ep.domain.Items;
import com.ep.mapper.ItemsMapper;
import com.ep.service.impl.ItemsServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @author dep
 * @version 1.0
 */
public class ItemsMapperTest {
    @Test
    public void testFindItemsById() {
        //获取 spring 容器
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取 Mapper
        ItemsServiceImpl itemsService =
                applicationContext.getBean(ItemsServiceImpl.class);
        //调用 Mapper 方法
        Items items = itemsService.findById(1);
         System.out.println(items);
    }
}
