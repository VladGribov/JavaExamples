package com.java.Test;

    /* File name : EncapTest.java */
    public class EncapTest {
        private String name;
        private String idNum;
        private int age;
        private int height;

        public int getHeight() {
            return height;
        }
        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public String getIdNum() {
            return idNum;
        }
        public void setHeight(int newHeight) {
            height = newHeight;
        }
        public void setAge( int newAge) {
            age = newAge;
        }

        public void setName(String newName) {
            name = newName;
        }

        public void setIdNum( String newId) {
            idNum = newId;
        }
    }

