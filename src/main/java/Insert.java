public class Insert {
    private String city;
    private String name;
    private String surname;
    private int number;
    private  String pesel;
    private int[] tab={1,3,7,9,1,3,7,9,1,3};/*tableau stock the number who check if the project.pesel is correct*/

    public Insert(String city, String name,String surname, String pesel) {
        this.city = city;
        this.name = name;
        this.surname=surname;
        this.pesel = pesel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    private void  multiple()
    {
        for(int i=0;i<tab.length;i++)
        {
            number +=(tab[i]* Integer.parseInt(pesel.substring(i,i+1)))%10;
        }
    }
    /*{

    }*/
   public  void printPesel()
   {
       System.out.println("the name of city is:" +city);
       System.out.println("the name is : " + name + "and the surname is: " + surname + " Number Pesel is : " + pesel);
   }
  public boolean isValid()
  {
      multiple();
      int taille= Integer.parseInt(pesel.substring(10,11));
      int newtaille,peselbis;
      peselbis = number%10;
      if(peselbis == 0)
      {
          newtaille = 0;
      }
      else
      {
          newtaille = 10 - peselbis;

      }
      if(taille == newtaille)
      {
          System.out.println("the project.pesel is correct:"+pesel);
          return true;
      }
      else
      {
          System.out.println("the project.pesel is not correct:"+pesel);
          return false;
      }
  }
}
