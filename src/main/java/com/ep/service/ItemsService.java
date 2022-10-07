package com.ep.service;

import com.ep.domain.Items;
import org.springframework.stereotype.Service;

/***
 * @author dep
 * @version 1.0
 */
public interface ItemsService {

    public Items findById(int itemId);
}
