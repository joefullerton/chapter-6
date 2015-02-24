package Chapter_6;

// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create & fill
// a list of integers.
//          
// ****************************************************************

public class IntegerList

{
  int[] list; // values in the list
  int newsize;
  int[] newList;
  int numElem = 0;
  // -------------------------------------------------------
  // create a list of the given size
  // -------------------------------------------------------
  public IntegerList(int size)
  {
    list = new int[size];
    numElem = size;
  }

  // -------------------------------------------------------
  // fill array with integers between 1 and 100, inclusive
  // -------------------------------------------------------
  public void randomize()
  {
    for (int i = 0; i < list.length; i++)
      list[i] = (int) (Math.random() * 100) + 1;
  }
  
  
  
  public void increaseSize()
  {
    newList = new int[list.length*2];
    for (int i = 0; i < list.length; i++)
    {
      newList[i] = list[i];
    }
    list = newList;
  }
  
  
  public void addElement(int newVal)
  {
    if (list[list.length - 1] > 0)
    {
    increaseSize();
    }
    for(int i = 0; i < list.length; i++)
    {
        if (list[i] <1)
        {
        list[i] = newVal;
        i = list.length + 1;
        }
    }
   // list[numElem+1] = newVal;
    //numElem++;
    
  }
  
  public void removeFirst(int newVal)
  {
	  
  }
  
  public void removeAll(int newVal)
  {
	  
  }

  // -------------------------------------------------------
  // print array elements with indices
  // -------------------------------------------------------
  public void print()
  {
    for (int i = 0; i < list.length; i++)
      System.out.println(i + ":\t" + list[i]);
  }

  public int search(int target)
  {
    int found = -1;
    for (int i = 0; i < list.length && found == -1; i++)
      if (target == list[i])
        found = i;
    return found;
  }

  public void selectionSort()
  {
    int num;
    for (int c = 0; c < list.length - 1; c++)
    {
      num = c;
      for (int i = c + 1; i < list.length; i++)
      {
        if (list[i] < list[num])
          num = i;
      }
      int temp = list[num];
      list[num] = list[c];
      list[c] = temp;
    }
  }

  public void replaceFirst(int oldVal, int newVal)
  {
    int oldIndex = -1;
    oldIndex = search(oldVal);
    list[oldIndex] = newVal;
  }

  public void replaceAll(int oldVal, int newVal)
  {
    for (int c = 0; c < list.length - 1; c++)
      if (list[c] == oldVal)
        list[c] = newVal;
  }

  public void sortDecreasing()
  {
    int maxIndex;

    for (int i = 0; i < list.length - 1; i++)
    {
      maxIndex = i;
      for (int j = i + 1; j < list.length; j++)
      {
        if (list[j] > list[maxIndex])
          maxIndex = j;
      }
      int temp = list[i];
      list[i] = list[maxIndex];
      list[maxIndex] = temp;
    }
  }

  public int binarySearchD(int target)
  {
    int low, mid, high;
    low = 0;
    high = (list.length - 1);
    mid = (low + high) / 2;
    while (list[mid] != target && low <= high)
    {
      
      if (target < list[mid])
        low = mid + 1;
      else
        high = mid - 1;
      
      mid = (low + high) / 2;

    }
    if (list[mid] == target)
      return mid;
    else
      return -1;
  }
}
