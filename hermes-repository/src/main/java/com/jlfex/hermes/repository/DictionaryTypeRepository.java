package com.jlfex.hermes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jlfex.hermes.model.DictionaryType;

/**
 * 字典类型信息仓库
 * 
 * @author ultrafrog
 * @version 1.0, 2013-11-18
 * @since 1.0
 */
@Repository
public interface DictionaryTypeRepository extends JpaRepository<DictionaryType, String> {

}
