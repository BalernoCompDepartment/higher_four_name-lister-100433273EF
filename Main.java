class Main {
  public static void main(String[] args) {
    
  
    String [] names = {"Marisol","Gaynelle","Josue","Cletus","Dong","Lucille","Margot","Mai","Vaughn","Sebastian","Petrina","Maxima","Fletcher","Kenda","Doug","Dot","Jeromy","Jerald","Alla","Georgene"};
   
    int separation = Keyboard.getInt("Please enter the number to separate students by.");
    for (int index = 0; index < 20; index ++) {
      if (((index + 1)%separation) == 0)  {
        System.out.println(names[index] + " ");
      }
    }

  }
}
