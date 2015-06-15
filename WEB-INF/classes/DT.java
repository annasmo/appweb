/**
 * Created by Anna on 2015-06-15.
 */
import java.util.Arrays;

interface Doctor{
    String say();
    int howMany();
}
public class DT implements Doctor{
    String [] companion={"Rose Tyler","Martha Jones","Donna Noble"};
    int id=10;
    String text= "Allons-y";
    public String say(){
        return text;
    }
    public int howMany(){
        return id-1;
    }
    public String toString(){
        System.out.println(say());
        System.out.println(howMany());
        System.out.println(Arrays.toString(companion));
        return "I don't wanna go";
    }


