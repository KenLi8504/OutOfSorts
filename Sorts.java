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
    }
    System.out.println(Arrays.toString(data));
  }

  public static void insertionSort(int [] data){

  }
}
