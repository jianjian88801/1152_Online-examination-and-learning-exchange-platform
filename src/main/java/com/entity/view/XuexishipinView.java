package com.entity.view;

import com.entity.XuexishipinEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 学习视频
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xuexishipin")
public class XuexishipinView extends XuexishipinEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 学习类型的值
		*/
		private String xuexishipinValue;



	public XuexishipinView() {

	}

	public XuexishipinView(XuexishipinEntity xuexishipinEntity) {
		try {
			BeanUtils.copyProperties(this, xuexishipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 学习类型的值
			*/
			public String getXuexishipinValue() {
				return xuexishipinValue;
			}
			/**
			* 设置： 学习类型的值
			*/
			public void setXuexishipinValue(String xuexishipinValue) {
				this.xuexishipinValue = xuexishipinValue;
			}














}
