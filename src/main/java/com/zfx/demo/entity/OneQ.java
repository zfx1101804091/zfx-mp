package com.zfx.demo.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import com.baomidou.mybatisplus.annotation.TableField;
    import java.io.Serializable;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author zheng_fx
* @since 2020-02-06
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @ApiModel(value="OneQ对象", description="")
    public class OneQ implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            @ApiModelProperty(value = "name_q的值和name_Q的值相同")
        @TableField("name_q")
    private String nameQ;

            @ApiModelProperty(value = "name_q的值和name_Q的值相同")
        @TableField("name_y")
    private String nameY;

        @TableField("value_q")
    private String valueQ;

        @TableField("value_y")
    private String valueY;


}
