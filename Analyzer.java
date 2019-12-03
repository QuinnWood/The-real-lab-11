public class Analyzer
{

    //this method allows a linear search, going through a String array and search index by index until the correct String is found
    //this code iterates through dataSet's length and uses the compareTo function in order to compare the String at
    //a point in the array and the String we are searching for, returing the index it was found at or a -1 if that
    //string is not found in the array

    //the code was obtained from GeeksForGeeks.com with the url being:
    //https://www.geeksforgeeks.org/linear-search/

    public static int linearSearch (String[] dataSet, String element)
    {
        for (int i = 0; i < dataSet.length; i++)
        {
            int stringCompare = element.compareTo(dataSet[i]);
            if (stringCompare == 0)
            {
                return i;
            }
        }
        return -1;
    }


    //this method searches for the index a String is at in the String array dataSet
    //A binary search starts in the middle index of an array and deduces if the object in the array index is less than
    // greater than, or equal to the target String. If the String at the index (say arr[i] ) is less than the target string, the
    //binary search ignores every index to the left of the index arr[i] and vice versa if the String at arr[i] is greater than
    //the target String

    //this code was obtained at GeeksForGeeks.com
    // url: https://www.geeksforgeeks.org/binary-search-a-string/
    public static int binarySearch (String[] dataSet, String element)
    {
        int right = dataSet.length-1;
        int left = 0;
        while (right >= left)
        {
            int middle = left + (right - left) / 2;
            int stringCompare = element.compareTo(dataSet[middle]);
            if (stringCompare == 0)
            {
                return middle;
            }

            //the target string is greater than the string in the current middle index
            //so the left variable becomes the middle + 1 because we deduced that the middle is also not the target array
            else if (stringCompare > 0)
            {
                left = middle + 1;
            }

            //if the target string is less than the middle index then the right variable turns into the middle of the
            //array - 1 because the index in the middle is also not the target string
            else
                right = middle - 1;

        }
        return -1;
    }

    public static void main(String[] args)
    {
        //this initializes data to reference the StringData class so that we can call upon the .getData function to
        //get the String array
        StringData data = new StringData();
        long index = 0;

        //nano_start starts the timer in nano seconds so we can time how long the system takes to search for the target string
       // long nano_start = System.nanoTime();
        //index = binarySearch(data.getData(), "mzzzz");
        //long nano_end = System.nanoTime();

        //long nano_start = System.nanoTime();
        //index = binarySearch(data.getData(), "not_here");
        //long nano_end = System.nanoTime();

        //long nano_start = System.nanoTime();
        //index = binarySearch(data.getData(), "aaaaa");
        //long nano_end = System.nanoTime();

       // long nano_start = System.nanoTime();
         //index = linearSearch(data.getData(), "mzzzz");
        //long nano_end = System.nanoTime();

        //long nano_start = System.nanoTime();
        //index = linearSearch(data.getData(), "not_here");
        //long nano_end = System.nanoTime();

        //long nano_start = System.nanoTime();
        //index = linearSearch(data.getData(), "aaaaa");
        //long nano_end = System.nanoTime();


        System.out.println("The index of the element is: " + index);

        // subtracting the start time from the nano time gives only the time that the system took to search for the target string
        System.out.println("the time taken in nano seconds is: " + (nano_end - nano_start));

        //order of the screenshots/tests run is BINARY: mzzzz, not_here, aaaaa,    LINEAR: mzzzz, not_here, aaaaa

    }
}
