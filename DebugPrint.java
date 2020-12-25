import java.util.Arrays;
public class DebugPrint{
  //TOGGLE THIS VARIABLE TO TURN ON/OFF prints
  public static boolean DEBUG = true;

  public static void dprint(String s){
    if(DEBUG){
      System.out.println(s);
    }
  }

  public static void bubbleSort (int [] data){
    for (int i = 0; i <data.length - 1; i++){
      int SwapsDone = 0;
      for (int j = 0; j <data.length - 1; j++){
        if (data[j] > data[j+1]){
          int placeholder = data[j];
          data[j] = data[j+1];
          data[j+1] = placeholder;
          System.out.println(Arrays.toString(data));
          SwapsDone++;
        }
      }
      if (SwapsDone == 0){
        i = data.length - 1;
      }
    }
  }
  public static void SelectionSort(int [] data){
    for (int i = 0; i < data.length;i++){
      int UnsortedMinimum = data[i];
      int IndexOfMin = i;
      for (int j = i; j < data.length;j++){
        if (data[j] < UnsortedMinimum){
          UnsortedMinimum = data[j];
          IndexOfMin = j;
        }
      }
      int placeholder = data[i];
      data[i] = UnsortedMinimum;
      data[IndexOfMin] = placeholder;
      System.out.println(Arrays.toString(data));
    }
    System.out.println(Arrays.toString(data));
  }

public static void InsertionSort(int [] data){
  System.out.println(Arrays.toString(data));
    for (int i = 1; i < data.length; i++){
      int CurrentNumber = data[i];
      int j = i - 1;
      while(j >= 0 && data[j] >= CurrentNumber){
        data[j+1] = data[j];
        j--;
      }
      data[j+1] = CurrentNumber;
    System.out.println(Arrays.toString(data));
    }
    System.out.println(Arrays.toString(data));
  }

  public static void main(String[]args){
    dprint("TURN THIS OFF BEFORE SUBMITTING YOUR CODE!!!!!!!!");
//random
    int [] test1 = {4,5,2,3,1};
    int [] test1b = {4,5,2,3,1};
    int [] test1c = {4,5,2,3,1};
    int [] test1d = {4,5,2,3,1};

//random duplicates
    int [] test2 = {2,3,4,4,2};
    int [] test2b = {2,3,4,4,2};
    int [] test2c = {2,3,4,4,2};

// sorted
    int [] test3 = {1,2,3,4,5};
    int [] test3b = {1,2,3,4,5};
    int [] test3c = {1,2,3,4,5};

//empty
    int [] test4 = {};
    int [] test4b = {};
    int [] test4c = {};

// all duplicates
    int [] test5 = {1,1,1,1,1,1};
    int [] test5b= {1,1,1,1,1,1};
    int [] test5c = {1,1,1,1,1,1};

//reverse sorted
    int [] test6 = {6,5,4,3,2,1};
    int [] test6b = {6,5,4,3,2,1};
    int [] test6c = {6,5,4,3,2,1};
    Sorts.bubbleSort(test1);
    Sorts.selectionSort(test1b);
    Sorts.insertionSort(test1c);
    dprint(Arrays.toString(test1));
    dprint(Arrays.toString(test1b));
    dprint(Arrays.toString(test1c));
    System.out.println("split");
    Sorts.bubbleSort(test2);
    Sorts.selectionSort(test2b);
    Sorts.insertionSort(test2c);
    dprint(Arrays.toString(test2));
    dprint(Arrays.toString(test2b));
    dprint(Arrays.toString(test2c));
    System.out.println("split");
    Sorts.bubbleSort(test3);
    Sorts.selectionSort(test3b);
    Sorts.insertionSort(test3c);
    dprint(Arrays.toString(test3));
    dprint(Arrays.toString(test3b));
    dprint(Arrays.toString(test3c));
    System.out.println("split");
    Sorts.bubbleSort(test4);
    Sorts.selectionSort(test4b);
    Sorts.insertionSort(test4c);
    dprint(Arrays.toString(test4));
    dprint(Arrays.toString(test4b));
    dprint(Arrays.toString(test4c));
    System.out.println("split");
    Sorts.bubbleSort(test5);
    Sorts.selectionSort(test5b);
    Sorts.insertionSort(test5c);
    dprint(Arrays.toString(test5));
    dprint(Arrays.toString(test5b));
    dprint(Arrays.toString(test5c));
    System.out.println("split");
    Sorts.bubbleSort(test6);
    Sorts.selectionSort(test6b);
    Sorts.insertionSort(test6c);
    dprint(Arrays.toString(test6));
    dprint(Arrays.toString(test6b));
    dprint(Arrays.toString(test6c));
  }
}
