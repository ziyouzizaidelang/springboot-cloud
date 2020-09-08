package com.shop.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PrductTypePojo {

    private Integer id;

    private String typeName;

    private String typeId;
}
