package com.onyx.tacocloud.data;

import com.onyx.tacocloud.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
