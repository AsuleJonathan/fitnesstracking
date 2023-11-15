package com.asule.app.view.html;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.List;

public class HtmlComponent implements Serializable {

    public static String table(List<? extends Object> models){

        if (models == null || models.isEmpty())
            return StringUtils.EMPTY;

        Field [] fields = models.get(0).getClass().getDeclaredFields();

        StringBuilder trBuilder = new StringBuilder();
        trBuilder.append("<table><tr>");

        for (Field field : fields) {
            if (!field.isAnnotationPresent(AsuleTableColHeader.class))
                continue;

            trBuilder.append("<th>" + field.getAnnotation(AsuleTableColHeader.class).header() + "</th>");
        }

        trBuilder.append("</tr>");

        for (Object model : models){

            trBuilder.append("<tr>");
            for (Field field : fields) {
                if (!field.isAnnotationPresent(AsuleTableColHeader.class))
                    continue;

                try {
                    field.setAccessible(true);
                    trBuilder.append("<td>").append(field.get(model)).append("</td>");
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            trBuilder.append("<tr>");

        }

        trBuilder.append("</table>");

        return trBuilder.toString();

    }

    public static String form(Class<?> model){

        AsuleHtmlForm bavonHtmlForm = null;
        if (model.isAnnotationPresent(AsuleHtmlForm.class))
            bavonHtmlForm = model.getAnnotation(AsuleHtmlForm.class);

        if (bavonHtmlForm == null)
            return StringUtils.EMPTY;

       String htmlForm =  "<h2>" +  bavonHtmlForm.label() + "</h2>" +
        "<br/>Add " + bavonHtmlForm.label() + "<br/><form action=\"" + bavonHtmlForm.url()
           + "\" method=\"" + bavonHtmlForm.httpMethod() + "\">";

        Field [] fields = model.getDeclaredFields();

        for (Field field : fields) {
            if (!field.isAnnotationPresent(AsuleHtmlFormField.class))
                continue;

            AsuleHtmlFormField formField = field.getAnnotation(AsuleHtmlFormField.class);

            String fieldName = field.getName();

            htmlForm += "<label for=\""
                    + (StringUtils.isBlank(formField.labelFor())?fieldName : formField.labelFor())
                + "\">"
                    + (StringUtils.isBlank(formField.label())?fieldName : formField.label()) + ":</label><br>";
            htmlForm += "<input type=\"text\" id=\""
                    + (StringUtils.isBlank(formField.id())?fieldName : formField.id())+ "\" name=\""
                    + (StringUtils.isBlank(formField.name())?fieldName : formField.name()) + "\" ><br>";
        }

        htmlForm += "<input type=\"submit\" value=\"Submit\">";
        htmlForm += "</form><br/>";

        return htmlForm;


    }
}
