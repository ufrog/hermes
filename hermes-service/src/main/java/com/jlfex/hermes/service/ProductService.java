package com.jlfex.hermes.service;

import java.util.List;

import com.jlfex.hermes.model.Product;
import com.jlfex.hermes.service.pojo.ProductInfo;

/**
 * 产品业务接口
 * 
 * @author ultrafrog
 * @version 1.0, 2013-12-18
 * @since 1.0
 */
public interface ProductService {

	/**
	 * 查询所有产品
	 * 
	 * @return
	 */
	public List<ProductInfo> findAll();
	
	/**
	 * @author Ray
	 * @date 2013-12-23 上午10:38:00
	 * @param id
	 * @return
	 * description:
	 */
	public Product loadById(String id);
	
	/**
	 * 读取所有产品<br>
	 * 从缓存加载数据
	 * 
	 * @return
	 */
	public List<ProductInfo> getAll();
}
