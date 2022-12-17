package com.bean;

import java.util.Objects;

/**
 * @program: java
 * @description:
 * @author:
 * @create: 2020-11-08 10:57
 */
public class Student {

    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Student))return false;
        if (obj == this) return true;
        Student s = (Student) obj;
        return this.name.equals(s.name);
    }
}