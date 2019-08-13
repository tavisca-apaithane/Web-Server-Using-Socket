import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numberOfElements =0;
        int numberOfQueries=0;
        numberOfElements = sc.nextInt();
        numberOfQueries = sc.nextInt();

        //accept input
        Integer[] inputArray = new Integer[numberOfElements];
        for(int i=0;i<numberOfElements;i++)
        {
            inputArray[i]=sc.nextInt();
        }
        SegmentTree segmentTree = new SegmentTree(numberOfElements, inputArray);
        segmentTree.buildTree(1,0,numberOfElements-1);
        SegmentTree.print(SegmentTree.Tree);


    }
}
