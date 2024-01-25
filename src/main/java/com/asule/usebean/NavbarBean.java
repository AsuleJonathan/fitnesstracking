package com.asule.usebean;

import java.io.Serializable;

public class NavbarBean implements Serializable {
    private String menu;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void generateMenu(String firstLetter){
        this.menu = "  <div class=\"navbarContainer\" >\n" +
                "    <nav class=\"navClass\">\n" +
                "        <div class=\"title\">\n" +
                "            <a href=\"./home\"> Fitness Tracker</a>\n" +
                "        </div>\n" +
                "        <div class=\"links\" >\n" +
                "           <a href=\"./home\">HOME</a>\n" +
                "           <a href=\"./Memberships\">MembershipS</a>\n" +
                "           <a href=\"./Members\">MemberS</a>\n" +
                "        </div>\n" +
                "        <div class=\"lastPart\">\n" +
                "            <p class=\"profile\" >  " +
                firstLetter +
                "</p>\n" +
                "            <a href=\"./logout\" class=\"contactButton\"> LOGOUT </a>\n" +
                "        </div>" +
                "    </nav>\n" +
                "</div>";
    }
}