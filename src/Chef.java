public class Chef extends BaseCharacter implements IChef {
    public Chef(String name , String description){

        super(name, description);

    }

    @Override
    public void Cook() {

        System.out.println(name+" memasak");
    }
}
