public class AbstrFact {
    public static void  createCharacters(CharactersFactory chfact){
        Traveler traveler=chfact.createTraveler();
        NotTraveler notTraveler=chfact.createNotTraveler();
        traveler.travel();
        traveler.createInvention();
        notTraveler.askQuestions();
    }
    public static void main(String[] args) {
        CharactersFactory cf1 = new Characters1();
        createCharacters(cf1);
        System.out.println();
        CharactersFactory cf2 = new Characters2();
        createCharacters(cf2);
    }
}
 abstract class CharactersFactory{
    public abstract Traveler createTraveler();
    public abstract NotTraveler createNotTraveler();
}
 interface Traveler {
    public void travel();
    public void createInvention();
}
 interface NotTraveler {
    public void askQuestions();
}
 class Characters1 extends CharactersFactory {
    @Override
    public Traveler createTraveler() {
        System.out.println("Create Traveler Rick...");
        return new RickSanchez();
    }
    @Override
    public NotTraveler createNotTraveler() {
        System.out.println("Create NotTraveler Beth...");
        return new BethSmith();
    }
}
 class Characters2 extends CharactersFactory {
    @Override
    public Traveler createTraveler() {
        System.out.println("Create Traveler Morty...");
        return new Morty();
    }
    @Override
    public NotTraveler createNotTraveler() {
        System.out.println("Create NotTraveler Jerry...");
        return new JerrySmith();
    }
}

 class RickSanchez implements Traveler{
    public void travel(){
        System.out.println();
        System.out.println("--Rick is going on a journey--");
        System.out.println("Rick: Morty, I need your help on an adventure!");
    }
    public void createInvention(){
        System.out.println();
        System.out.println("--Rick and his experiments--");
        System.out.println("Rick: Boom! Big reveal! I turned myself into a pickle, Morty! I'm Pickle Ri-i-i-ick!!");
    }
}
 class Morty implements Traveler{
    public void travel(){
        System.out.println();
        System.out.println("--Morty is going on a journey--");
        System.out.println("Morty: I'm on an adventure with my grandpa!");
    }
    public void createInvention(){
        System.out.println();
        System.out.println("--But what Morty is doing?--");
        System.out.println("Make problems...");
    }
}
 class JerrySmith implements NotTraveler{
    public void askQuestions(){
        System.out.println();
        System.out.println("--NotTravelers and their thoughts--");
        System.out.println("Jerry: Innocent people are going to die because of me. Why am I so mediocre?");
    }
}
 class BethSmith implements NotTraveler{
    public void askQuestions(){
        System.out.println();
        System.out.println("--NotTravelers and their thoughts--");
        System.out.println("Beth: Am I evil?");
    }
}

