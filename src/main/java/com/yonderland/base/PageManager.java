package com.yonderland.base;

import com.yonderland.pages.HomePage;

public class PageManager {

    public static HomePage homepage;

    public static void initialize(){
        homepage = new HomePage();
    }
}
