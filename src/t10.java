public class t10 {
    public t10(){
        System.out.println("222");

    }

    private String name;

    private void setname(String name){
        this.name=name;
    }

    public String getName(){
        int id =1;
        setname("java.");
        return id + this.name;
    }

    public t10 getbook(){
        return this;
    }

}

