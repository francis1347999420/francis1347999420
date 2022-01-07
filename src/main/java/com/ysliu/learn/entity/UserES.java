package com.ysliu.learn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author ysliu
 * @since 2021-12-02
 */
@Data
@Document(indexName = "users")
public class UserES implements Serializable {

    @Id
    @Field(type = FieldType.Long)
    private Long id;

    @Field(type = FieldType.Text)
    private String userName;

    @Field(type = FieldType.Text)
    private String passWord;

    @Field(type = FieldType.Text)
    private String realName;
}
