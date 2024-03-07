package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
    private int height;

    private int shoeSize;

    private boolean hasDog;

    private String nickName;

    private boolean hasJob;





    public Person(){
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.height = 0;
        this.nickName = "";
        this.hasJob = false;
        this.hasDog = false;
        this.shoeSize = 0;
    }



    public Person( int age){
        this.age = age;
        }

    public Person(String name) {
        this.name = name;
        }


    public Person(String name, int age){
        this.name = name;
        this.age = age;
        }

        public void setName (String name){
        this.name= name;
        }

        public void setAge ( int age){
        this.age = age;
        }

        public String getName () {
            return this.name;
        }

        public Integer getAge () {
            return this.age;
        }




    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getShoeSize() {
        return this.shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public boolean hasDog() {
        return hasDog;
    }

    public void setHasDog(boolean hasDog) {
        this.hasDog = hasDog;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public boolean hasJob() {
        return hasJob;
    }

    public void setHasJob(boolean hasJob) {
        this.hasJob = hasJob;
    }
}
