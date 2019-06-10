//ILIAS PAPOUNIDIS AOC 2017
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class day2 {
  public static void main(String[] args) throws IOException{

    if (args[0].equals("1")) {
      part1();
    } else {
      part2();
    }
  }

  public static void part1() throws IOException{ //Solution to Part 1

    File file = new File("day2_input.txt");
    Scanner input = new Scanner(file);
    int checksum = 0;

    do {
      String line = input.nextLine();
      String[] values = line.split("\t| ");

      int min = 9999;
      int max = 0;

      for (int i=0; i < values.length; i++) {
        int value = Integer.parseInt(values[i]);
        if(value > max) {
          max = value;
        } if(value < min) {
          min = value;
        }
      }
      System.out.println(max + " " + min);
      checksum += (max - min);
    } while (input.hasNextLine());
    System.out.println(checksum);
  }

  public static void part2() throws IOException { //Solution to Part 2

    File file = new File("day2_input.txt");
    Scanner input = new Scanner(file);
    int sum = 0;

    do {
      String line = input.nextLine();
      String[] values = line.split("\t| ");

      for (int i=0; i < values.length; i++ ) {
        int currentNum = Integer.parseInt(values[i]);

        for (int j=values.length-1; j > i; j--) {
          int otherNum = Integer.parseInt(values[j]);

          if(currentNum % otherNum == 0) {
            if (currentNum > otherNum) {
              sum += (currentNum/otherNum);
            } else {
              sum += (otherNum/currentNum);
            }
          } else if(otherNum % currentNum == 0) {
            if (currentNum > otherNum) {
              sum += (currentNum/otherNum);
            } else {
              sum += (otherNum/currentNum);
            }
          }
        }
      }
    } while (input.hasNextLine());
    System.out.println(sum);
  }
}
