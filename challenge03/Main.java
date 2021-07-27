class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int[]array={11, 22, 33, 44, 55, 66, 77};
    int n =90;
    System.out.println(binarySearch(array,n));
  }
  public static int binarySearch(int[] array , int n){
    int minIdx=0;
    int maxIdx=array.length-1;
    int iteration=0;
    while(n!=array[minIdx] && n!=array[maxIdx]){
      iteration++;
      if(n<array[minIdx]||n>array[maxIdx]){
        System.out.println("your number is out of the array boundaries" );
        return -1;      
      }else if (Math.pow(2, iteration)> array.length){
        System.out.println("your number is not in the array" );
        return -1;      
      }
      if(array[((maxIdx-minIdx))/2]>=n){
      maxIdx=((maxIdx-minIdx))/2;     
    }else if (array[((maxIdx-minIdx))/2]<n){
      minIdx+=((maxIdx-minIdx))/2;
    }
    }
     if(n==array[minIdx]){
      return minIdx;
    } else if (n==array[maxIdx]){
      return maxIdx;
    }
    return -1;
  }
}

