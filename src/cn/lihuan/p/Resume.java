package cn.lihuan.p;

public class Resume implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    public void display() {
        System.out.printf("%s %s %s\n", name, sex, age);
        System.out.printf("%s %s\n", workExperience.getCompany(), workExperience.getWorkDate());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume resume = (Resume) super.clone();
        resume.workExperience = (WorkExperience) resume.workExperience.clone();
        return resume;
    }
}
