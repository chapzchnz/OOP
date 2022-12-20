public class Dog {

    private String dogName;
    private String dogColor;

    /**
     *Constructor 01
     */
    public Dog(String dogName, String dogColor){
        this.dogName = dogName;
        this.dogColor = dogColor;
    }
    /**
     *Constructor 02
     */
    public Dog(String dogName){
        this.dogName = dogName;
    }


    public void speak(){
        System.out.println(dogName +" Bark");
    }
    public void mate(){
        System.out.println(dogName + " Mate");
    }
    public void sleep(){
        System.out.println(dogName + " sleep");
    }
}
