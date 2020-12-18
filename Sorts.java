// push to git
import java.util.Arrays;
public  class Sorts{

  public static void bubbleSort (int [] data){
    for (int i = 0; i <data.length - 1; i++){
      int SwapsDone = 0;
      for (int j = 0; j <data.length - 1; j++){
        if (data[j] > data[j+1]){
          int placeholder = data[j];
          data[j] = data[j+1];
          data[j+1] = placeholder;
          SwapsDone++;
        }
      }
      if (SwapsDone == 0){
        i = data.length - 1;
      }
    }
  }

  public static void main (String [] args){
    int [] test1 = {6,2,3,1,4,5};
    bubbleSort(test1);
    System.out.println(Arrays.toString(test1));
    }
}
