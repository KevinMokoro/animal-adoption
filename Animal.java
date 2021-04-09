
class Animal{
  public int mAge;
  public String mSpecies;
  public int mPhoneNumber;
  public int mPrice;
  public boolean mAdopted;
  public Animal(int age, String species, int phoneNumber, int price, boolean adopted){
    mAge = age;
    mSpecies = species;
    mPhoneNumber = phoneNumber;
    mPrice = price;
    mAdopted = adopted;
  }

  public boolean worthBuying(int maxBudget){
  return (mPrice < maxBudget);
  }



  public boolean adopted(boolean unAdopt){
    return  mAdopted = true;
  }


  //boolean insidePet = mSpecies.equals("chiwawa");

//  public boolean insidePet(String insider){
  //  if(insider.equals(insidePet)){
  //    return insidePet;
  //  }
  }
