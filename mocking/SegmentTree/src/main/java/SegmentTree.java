public class SegmentTree {

    public static Integer[] Tree = null;
    public static Integer[] inputArray = null;
    public SegmentTree(int size, Integer[] inputArray)
    {
        this.inputArray = inputArray;
        Tree = new Integer[(2*size)+2];
    }
    public static void print(Integer[] input)
    {
        for(Integer i : input)
            System.out.print(i + " ");
    }
                                    //1             //0                     //n-1
    public void buildTree(int startIndexOfTree, int startIndexOfInputArray, int endingIndexOfInputArray)
    {
        if(startIndexOfInputArray == endingIndexOfInputArray) {
            Tree[startIndexOfTree] = inputArray[startIndexOfInputArray];
            System.out.println(startIndexOfInputArray+" "+endingIndexOfInputArray);

        }
            else
        {
            Double midInDouble = Math.floor((startIndexOfInputArray+endingIndexOfInputArray)/2);
            int mid = midInDouble.intValue();
            System.out.println(startIndexOfInputArray+" "+mid+" "+endingIndexOfInputArray);
            buildTree((startIndexOfTree*2), startIndexOfInputArray, mid);
            buildTree((startIndexOfTree*2)+1, (mid+1), endingIndexOfInputArray);
            Tree[startIndexOfTree] = Tree[(startIndexOfTree*2)] + Tree[(startIndexOfTree*2)+1];
        }
    }

}
