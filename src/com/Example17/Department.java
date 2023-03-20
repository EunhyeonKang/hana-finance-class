package com.Example17;

import java.io.Serializable;

public class Department implements Serializable {
    private static final long serialVersionUID = -4218032666050367765L;
    String name;
    Employee leader;

    public Department() {

    }

    public Department(String name, Employee leader) {
        this.name = name;
        this.leader = leader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getLeader() {
        return leader;
    }

    public void setLeader(Employee leader) {
        this.leader = leader;
    }



    @Override
    public String toString() {
        return "Department [name=" + name + ", leader=" + leader + "]";
    }


}
