public class ProjectTest{
    public static void main(String[] args){
        Project p = new Project();
        p.setName("Project 1");
        p.setDescription("P1 Description");
        p.setCost(300);
        System.out.println(p);

        Project p2 = new Project("Project 2");
        p2.setCost(280.99);
        System.out.println(p2);

        Project p3 = new Project("Project 3","Project 3 Description");
        p3.setCost(555.66);
        System.out.println(p3);

    }
}