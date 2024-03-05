import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Lion lev=new Lion(200.0f,1.5f, LocalDate.now(),"lev",new Owner("ahmad"));
        lev.moving();
        Cat shaitan=new Cat(5.0f, 15.0f,LocalDate.now(),"shaitan",new Owner("muhamad"));
        shaitan.moving();
        Dog HunAta=new Dog(5.0f, 15.0f,LocalDate.now(),"HunAta",new Owner("sultan"));
        HunAta.moving();
        Bird b=new Bird(5.0f, 15.0f,LocalDate.now(),"HunAta",new Owner("sultan"));
        b.moving();
        Duck donald=new Duck(5.0f, 15.0f,LocalDate.now(),"donald",new Owner("sultan"));
        donald.moving();



//        List<Animal>animals=new ArrayList<>();
//        animals.add(shaitan);
//        animals.add(HunAta);
//        animals.add(lev);
//        System.out.println(animals);
//        for (int i = 0; i < animals.size(); i++) {
//            System.out.println(animals.get(i).getName());
//
//        }
//
//
//
        }
    }