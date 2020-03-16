package org.leolee.entity;


import javax.persistence.*;

/**
 * @author: LeoLee <zeroming@163.com>
 * @date: 2020/3/16 12:09
 * @since:
 */
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
