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
    @ApiModel(value="OneA对象", description="")
    public class OneA implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

        @TableField("name_z")
    private String nameZ;

        @TableField("name_x")
    private String nameX;

        @TableField("value_z")
    private Integer valueZ;

        @TableField("name_c")
    private String nameC;

        @TableField("name_v")
    private String nameV;

        @TableField("value_x")
    private Integer valueX;

        @TableField("name_b")
    private String nameB;

        @TableField("name_n")
    private String nameN;

        @TableField("value_c")
    private Integer valueC;


}
