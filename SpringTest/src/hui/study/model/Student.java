package hui.study.model;

import org.springframework.stereotype.Component;

@Component(value="student")
public class Student {

    private String stuName="STUNAME";

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
