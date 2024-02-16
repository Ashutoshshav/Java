import java.util.*;

class Ashu{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number of Rows: ");
    int row = sc.nextInt();

    System.out.print("Enter a number of Coloums : ");
    int coloum = sc.nextInt();

    /* System.out.print("Enter a number : ");
    int number = sc.nextInt(); */

    for(int i = 1;i <= row;i++){
      for(int j = 1;j <= coloum;j++){
          if(i == 1 || i == row || j == 1 || j == coloum){
            System.out.print("*");
          } else{
            System.out.print(" ");
          }
      }
      System.out.println();
    }
  }
}