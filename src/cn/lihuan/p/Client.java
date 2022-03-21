package cn.lihuan.p;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resumeA = new Resume();
        resumeA.setName("小明");
        resumeA.setSex("男");
        resumeA.setAge("20");
        resumeA.setWorkExperience(new WorkExperience("2020.02.22", "创业公司"));

        Resume resumeB = (Resume) resumeA.clone();
        resumeA.setAge("23");
        resumeA.getWorkExperience().setCompany("超级创业公司");
        resumeA.display();
        resumeB.display();
    }
}
