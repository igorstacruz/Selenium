package com.jalasoft.testing.pages;

/**
 * Created by Igor Santa Cruz on 5/18/2016.
 */
public class MainContainer extends AbstractBasePage {

    public Header goToHeader() {
        return new Header();
    }

    public TabBar goToTabBar() {
        return new TabBar();
    }

    public Footer goToFooter() {
        return new Footer();
    }
}