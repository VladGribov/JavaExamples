package com.java.project;

import java.util.Scanner;

public class ZoomProject {
    public boolean hasBad(String str) {
/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
The string may be any length, including 0. Note: use .equals() to compare 2 strings.
 */

        if(str.length()>=3 && (str.substring(0,3).equals("bad")) || str.length()>3 && (str.substring(1,4).equals("bad"))){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        ZoomProject zoom = new ZoomProject();
        System.out.println(zoom.hasBad("bad"));

    }
}
