package com.asule.app.view.css;

import java.io.Serializable;

public class AppCss implements Serializable {

    private String style = "<style>" +

    ".topnav {" +
        "overflow: hidden;" +
        "background-color: #007BFF;" + 
    "}" +

    ".topnav a {" +
        "float: left;" +
        "color: white;" + 
        "text-align: center;" +
        "padding: 14px 16px;" +
        "text-decoration: none;" +
        "font-size: 16px;" + 
    "}" +

    ".topnav a:hover {" +
        "background-color: #0056b3;" + 
        "color: white;" +
    "}" +

    ".topnav a.active {" +
        "background-color: #004080;" + 
        "color: white;" +
    "}" +

    "table {" +
        "font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;" + 
        "border-collapse: collapse;" +
        "width: 100%;" +
        "margin-top: 20px;" +
    "}" +

    "td, th {" +
        "border: 1px solid #dddddd;" +
        "text-align: left;" +
        "padding: 10px;" +
    "}" +

    "tr:nth-child(even) {" +
        "background-color: #f2f2f2;" + 
    "}" +

"</style>";

public String getStyle() {
    return style;
}


    public void setStyle(String style) {
        this.style = style;
    }
}
