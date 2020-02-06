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
    @ApiModel(value="OneZ对象", description="")
    public class OneZ implements Serializable {

    private static final long serialVersionUID = 1L;

        @TableField("id")
    private String id;

        @TableField("wave_X")
    private String waveX;

        @TableField("wave_Y")
    private String waveY;


}
