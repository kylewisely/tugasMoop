public class BaseCharacter {

    String name;
    String description;

    public BaseCharacter(String name , String description){

        this.name = name;
        this.description = description;

    }
    public void getInfo(){

        System.out.println(name+" "+description);

    }


}
