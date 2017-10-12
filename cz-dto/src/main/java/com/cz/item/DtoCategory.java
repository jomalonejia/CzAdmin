package com.cz.item;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jomalone_jia on 2017/10/10.
 */
public class DtoCategory implements Serializable{

    private static final long serialVersionUID = -8428540691908176793L;

    private Long id;
    private String name;
    private List<DtoCategory> children;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DtoCategory> getChildren() {
        return children;
    }

    public void setChildren(List<DtoCategory> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "DtoCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
