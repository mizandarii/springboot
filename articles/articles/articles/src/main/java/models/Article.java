package models;

import java.util.Calendar;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
///@AllArgsConstructor
@Setter
@Getter


public class Article {
    private String slug;
    private String name;
    private String body;
    private Calendar dateCreated;
    

    public Article(String slug, String name, String body, Calendar dateCreated){
        this.slug = slug;
        this.name = name;
        this.body = body;
        this.dateCreated = dateCreated;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }


}

