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

  public static void selectionSort(int [] data){
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
    }
  }

  public static void insertionSort(int [] data){
    for (int i = 0; i <data.length; i++){
      int CurrentNumber /*to be sorted*/ = data[i];
      int currentIndex = i;
      for (int j = i - 1; j >= 0;){
        if (data[j] > CurrentNumber){
          data[j+1] = data[j];
        }
        else{
          data[j] = CurrentNumber;
        }
      }
    }
  }
}
