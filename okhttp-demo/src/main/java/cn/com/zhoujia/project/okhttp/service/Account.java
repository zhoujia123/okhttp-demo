package cn.com.zhoujia.project.okhttp.service;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Surface Pro on 2016/9/11.
 */
public class Account implements Serializable {


    private List<Role> roles;
    @JsonProperty("nodes")
    private List<Perm> perms;

    private List<Integer> parts;
    private List<Integer> staff;


    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Perm> getPerms() {
        return perms;
    }

    public void setPerms(List<Perm> perms) {
        this.perms = perms;
    }

    public List<Integer> getParts() {
        return parts;
    }

    public void setParts(List<Integer> parts) {
        this.parts = parts;
    }

    public List<Integer> getStaff() {
        return staff;
    }

    public void setStaff(List<Integer> staff) {
        this.staff = staff;
    }

    class Role implements Serializable{

        private Integer id;
        private String en;
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getEn() {
            return en;
        }

        public void setEn(String en) {
            this.en = en;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Role{" +
                    "id=" + id +
                    ", en='" + en + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


    class Perm implements Serializable{

        private Integer id;
        private String en;
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getEn() {
            return en;
        }

        public void setEn(String en) {
            this.en = en;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Perm{" +
                    "id=" + id +
                    ", en='" + en + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "roles=" + roles +
                ", perms=" + perms +
                ", parts=" + parts +
                ", staff=" + staff +
                '}';
    }
}
