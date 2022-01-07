package com.ysliu.learn.dao;

import com.ysliu.learn.entity.UserES;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserESDao extends ElasticsearchRepository<UserES, Long> {

}
