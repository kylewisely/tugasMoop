public class Doctor extends BaseCharacter implements IChef{
    public Doctor(String name, String description) {

    super(name, description);

    }

    @Override
    public void Cook() {
        System.out.println(name+" memasak");
    }
}