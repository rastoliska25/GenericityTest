public class Printer<T extends Statue>{
    T thingToPring;

    public Printer(T thingToPring){
        this.thingToPring = thingToPring;
    }

    public void print(){
        System.out.println(thingToPring);
    }




}
