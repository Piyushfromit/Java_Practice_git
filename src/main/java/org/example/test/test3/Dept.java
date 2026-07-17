package org.example.test.test3;


import java.util.Objects;

public class Dept {

    private Long deptId;
    private String name;

    public Dept(Long deptId, String name) {
        this.deptId = deptId;
        this.name = name;
    }


    public Long getDeptId() {
        return deptId;
    }

    public String getName() {
        return name;
    }


    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", name='" + name + '\'' +
                '}';
    }




}
