package com;

public class MemberDTO {

    private String username;
    private int age;
    private String address;

    @Override
    public String toString() {
        return "MemberDTO{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public MemberDTO(String username, int age, String address){
        this.username = username;
        this.age = age;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }



}
