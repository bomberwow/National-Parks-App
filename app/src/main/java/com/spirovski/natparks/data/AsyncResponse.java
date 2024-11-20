package com.spirovski.natparks.data;

import  com.spirovski.natparks.model.Park;
import java.util.List;

public interface AsyncResponse {
    void processPark(List<Park> parks);
}
