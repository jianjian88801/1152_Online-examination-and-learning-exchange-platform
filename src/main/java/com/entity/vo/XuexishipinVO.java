package com.entity.vo;

import com.entity.XuexishipinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学习视频
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xuexishipin")
public class XuexishipinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学习视频标题
     */

    @TableField(value = "xuexishipin_name")
    private String xuexishipinName;


    /**
     * 封面
     */

    @TableField(value = "xuexishipin_photo")
    private String xuexishipinPhoto;


    /**
     * 视频
     */

    @TableField(value = "xuexishipin_video")
    private String xuexishipinVideo;


    /**
     * 讲师
     */

    @TableField(value = "xuexishipin_jiangshi")
    private String xuexishipinJiangshi;


    /**
     * 学习类型
     */

    @TableField(value = "xuexishipin_types")
    private Integer xuexishipinTypes;


    /**
     * 详情
     */

    @TableField(value = "xuexishipin_content")
    private String xuexishipinContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学习视频标题
	 */
    public String getXuexishipinName() {
        return xuexishipinName;
    }


    /**
	 * 获取：学习视频标题
	 */

    public void setXuexishipinName(String xuexishipinName) {
        this.xuexishipinName = xuexishipinName;
    }
    /**
	 * 设置：封面
	 */
    public String getXuexishipinPhoto() {
        return xuexishipinPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setXuexishipinPhoto(String xuexishipinPhoto) {
        this.xuexishipinPhoto = xuexishipinPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getXuexishipinVideo() {
        return xuexishipinVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setXuexishipinVideo(String xuexishipinVideo) {
        this.xuexishipinVideo = xuexishipinVideo;
    }
    /**
	 * 设置：讲师
	 */
    public String getXuexishipinJiangshi() {
        return xuexishipinJiangshi;
    }


    /**
	 * 获取：讲师
	 */

    public void setXuexishipinJiangshi(String xuexishipinJiangshi) {
        this.xuexishipinJiangshi = xuexishipinJiangshi;
    }
    /**
	 * 设置：学习类型
	 */
    public Integer getXuexishipinTypes() {
        return xuexishipinTypes;
    }


    /**
	 * 获取：学习类型
	 */

    public void setXuexishipinTypes(Integer xuexishipinTypes) {
        this.xuexishipinTypes = xuexishipinTypes;
    }
    /**
	 * 设置：详情
	 */
    public String getXuexishipinContent() {
        return xuexishipinContent;
    }


    /**
	 * 获取：详情
	 */

    public void setXuexishipinContent(String xuexishipinContent) {
        this.xuexishipinContent = xuexishipinContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
