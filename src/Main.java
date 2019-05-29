import java.util.Scanner;
import java.util.Vector;

public class Main {

    Chef chef;
    Doctor doctor;
    Driver driver;
    Runner runner;
    Singer singer;
    Teacher teacher;

    Scanner scan = new Scanner(System.in);

    public void initCharacter()
    {
        chef = new Chef("Chef","Karakter ini dapat memasak");
        doctor = new Doctor("Doctor","Karakter ini dapat menyembuhkan");
        driver = new Driver("Driver","Karakter ini dapat mengendarai");
        runner = new Runner("Runner","Karakter ini dapat berlari");
        singer = new Singer("Singer","Karakter ini dapat menyanyi");
        teacher = new Teacher("Teacher","Karakter ini dapat mengajar");
    }

     public Main (){
        initCharacter();

        String input;
        String temp[];
        String temp2[];

        System.out.println("Simulasi kelompok kemampuan");
        System.out.println("0:Chef");
        System.out.println("1:Doctor");
        System.out.println("2:Driver");
        System.out.println("3.Runner");
        System.out.println("4:Singer");
        System.out.println("5.Teacher");
        System.out.print("Input : ");

        input = scan.nextLine();
        temp = input.split(" ");
        temp2 = temp[1].split(",");

        if(temp[0].equals("Info"))
        {
            for(int i = 0; i < temp2.length; i++)
            {
                if(temp2[i].equals("0"))
                    chef.getInfo();
                else if(temp2[i].equals("1"))
                    doctor.getInfo();
                else if (temp2[i].equals("2"))
                    driver.getInfo();
                else if (temp2[i].equals("3"))
                    runner.getInfo();
                else if (temp2[i].equals("4"))
                    singer.getInfo();
                else if (temp2[i].equals("5"))
                    teacher.getInfo();
            }
        }
        else if (temp[0].equals("Cook"))
        {
            for (int i = 0; i < temp2.length; i++) {
                if(temp2[i].equals("0"))
                    chef.Cook();
                else if(temp2[i].equals("1"))
                    doctor.Cook();
                else if (temp2[i].equals("2"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (temp2[i].equals("3"))
                   System.out.println("Karakter tidak bisa melakukan aksi");
                else if (temp2[i].equals("4"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (temp2[i].equals("5"))
                    teacher.Cook();
            }

        }
        else if (temp[0].equals("Drive"))
        {
            for (int i = 0; i < temp2.length; i++) {
                if(temp2[i].equals("0"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if(temp2[i].equals("1"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (temp2[i].equals("2"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (temp2[i].equals("3"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (temp2[i].equals("4"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (temp2[i].equals("5"))
                    teacher.Drive();
            }

        }

        else if (temp[0].equals("Work"))
        {
            for (int i = 0; i < temp2.length; i++) {
                if(temp2[i].equals("0"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if(temp2[i].equals("1"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (temp2[i].equals("2"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (temp2[i].equals("3"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (temp2[i].equals("4"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (temp2[i].equals("5"))
                    teacher.Work();
            }

        }
        else if (temp[0].equals("Paint"))
        {
            for (int i = 0; i < temp2.length; i++) {
                if(temp2[i].equals("0"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if(temp2[i].equals("1"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (temp2[i].equals("2"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (temp2[i].equals("3"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (temp2[i].equals("4"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (temp2[i].equals("5"))
                    teacher.Paint();
            }

        }


     }

    public static void main(String[]args){
        new Main();

    }
}
