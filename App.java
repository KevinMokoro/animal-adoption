import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App{
  public static void main(String[] args){
    Console myConsole = System.console();

    Animal cat = new Animal(2,"panther",4000,3400,true);
    Animal dog = new Animal(4,"chiwawa",5600,5999,false);
    Animal parrot = new Animal(3,"bird",4100,7888,false);
    Animal cow = new Animal(9,"Fresian",7700,89999,false);




  //  /System.out.println("Would you prefer an inside pet or outside pet;");
    //String userPrefence = myConsole.readLine();


    List<Animal> allAnimals = new ArrayList<Animal>();
    allAnimals.add(cat);
    allAnimals.add(dog);
    allAnimals.add(parrot);
    allAnimals.add(cow);
  //  allAnimals.add(userAnimal);
    boolean programRunning = true;
    while(programRunning){
    System.out.println("Welcome to our animal adoption site,choose one of the following options:All Animals, Search Price, Add Animal, Search Unadopted, or Exit");
    String navigationChoice = myConsole.readLine();

    if(navigationChoice.equals("All Animals")){
      for(Animal individualAnimal : allAnimals){
        System.out.println("______________________");
        System.out.println(individualAnimal.mAge);
        System.out.println(individualAnimal.mSpecies);
        System.out.println(individualAnimal.mPhoneNumber);
        System.out.println(individualAnimal.mPrice);

      }
    }else if(navigationChoice.equals("Search Price")){
      System.out.println("How much are you willing to spend?");
      String stringMaxBudget = myConsole.readLine();
      int maxBudget = Integer.parseInt(stringMaxBudget);
      System.out.println("Here are animals within your price range and your preferrence:");

      for(Animal individualAnimal : allAnimals){
        if(individualAnimal.worthBuying(maxBudget)){
        System.out.println("______________________");
        System.out.println(individualAnimal.mAge);
        System.out.println(individualAnimal.mSpecies);
        System.out.println(individualAnimal.mPhoneNumber);
        System.out.println(individualAnimal.mPrice);
      }
    }
  }else if(navigationChoice.equals("Add Animal")){
    System.out.println("How old is your animal?");
    int userAnimalAge = Integer.parseInt(myConsole.readLine());
    System.out.println("Got it.What is the species of your animal?");
    String userAnimalSpecies = myConsole.readLine();
    System.out.println("Alright.What is your phone number?");
    int userPhoneNumber = Integer.parseInt(myConsole.readLine());
    System.out.println("Finally.How much is your animal");
    int userPrice = Integer.parseInt(myConsole.readLine());
    System.out.println("Has your animal found an adopter?Reply with true OR false");
    boolean userAdoptStatus = Boolean.parseBoolean(myConsole.readLine());

    Animal userAnimal = new Animal(userAnimalAge,userAnimalSpecies,userPhoneNumber,userPrice, userAdoptStatus);
    allAnimals.add(userAnimal);
    System.out.println("Alright, here is your animal: ");
    System.out.println("______________________");
    System.out.println(userAnimal.mAge);
    System.out.println(userAnimal.mSpecies);
    System.out.println(userAnimal.mPhoneNumber);
    System.out.println(userAnimal.mPrice);
    System.out.println(userAnimal.mAdopted);

  }else if(navigationChoice.equals("Search Unadopted")){
    System.out.println("here are animals that have not been taken");
    //boolean unAdopted = true;
    for(Animal individualAnimal : allAnimals){
      if(individualAnimal.adopted(false)){
      System.out.println("__________________________");
      System.out.println(individualAnimal.mAge);
      System.out.println(individualAnimal.mSpecies);
      System.out.println(individualAnimal.mPhoneNumber);
      System.out.println(individualAnimal.mPrice);
      }
    }
  }
  else if(navigationChoice.equals("Exit")){
    programRunning = false;
  }  else{
    System.out.println("I am sorry, we dont recognize your input.");
  }
}
}
}
