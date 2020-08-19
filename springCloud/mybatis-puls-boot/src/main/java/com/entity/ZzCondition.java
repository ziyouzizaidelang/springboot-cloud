package com.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-08-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ZzCondition implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资质名称
     */
    private String zzName;

    /**
     * 营业执照和危险品许可证唯一标识
     */
    private String code;

    /**
     * 资质类型（1.文字说明、2.图片说明、3.文件说明(Word.Pdf)）
     */
    private Integer zzType;

    /**
     * 资质说明
     */
    private String content;

    /**
     * 状态标识(标识企业是否为自己配置了该资质)
     */
    private Integer status;

    private LocalDateTime createDate;


}
