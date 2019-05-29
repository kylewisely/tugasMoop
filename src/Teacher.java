public class Teacher extends BaseCharacter implements IChef,IArtist,IDriver,IWorker {
    public Teacher(String name , String description){

     super(name, description);

    }

    @Override
    public void Paint() {
        System.out.println(name+" melukis");
    }

    @Override
    public void Cook() {
        System.out.println(name+" memasak");
    }

    @Override
    public void Drive() {

        System.out.println(name+" menyetir");
    }

    @Override
    public void Work() {

        System.out.println(name+" bekerja");

    }
}
