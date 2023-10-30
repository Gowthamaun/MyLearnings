package Preparation;

/*
Question is:
To find the max path in a 2d array. You will start 
from the last element and you have to reach the 
element element. You can only go uptwards and 
Leftwards.
I/P: 10 20
      4 3
O/p – path followed 10 – 20 – 3
Sum is 33.

Logic and Algorithm behind this approach.

* Now ur current position is in the Lastrow and Lastcolum.
*According to the above given question you can go only in leftwards and upwards.
*Here we use two checks (upcheck and leftcheck)
*leftcheck is to make sure that ur currentcol-1 will not give any error.
*upcheck is to make sure that ur currentrow-1 will not give any error.
*We need the maxpath so we need to compare between the upwards element and leftwards element 
which one is greater then we add that element to our and move our current position to that greater element.
*Once we reach the currentrow==0 and currentcol==0 then we need to break.
*/
public class Maxpath {
    public static void main(String[] args) {
        int[][] arr = { { 10, 20, 9 },
                { 4, 3, 30 }

        };
        findMaxPath(arr);
    }

    static void findMaxPath(int[][] way) {
        int sum = 0;
        int leftcol = 0;
        boolean leftcheck = false;
        boolean upcheck = false;
        int uprow = 0;
        int currentrow = way.length - 1;
        int currentcol = way[0].length - 1;
        sum = way[currentrow][currentcol];
        while (currentcol >= 0 && currentrow >= 0) {
            System.out.println("way is:" + way[currentrow][currentcol]);
            // column and row to go upwards.
            upcheck = currentrow - 1 >= 0;
            if (currentrow >= 1) {
                uprow = currentrow - 1;
            }
            int upcol = currentcol;
            // column and row to go leftwards
            int leftrow = currentrow;
            leftcheck = currentcol - 1 >= 0;
            if (currentcol >= 1) {
                leftcol = currentcol - 1;
            }
            if (!leftcheck || (way[uprow][upcol] > way[leftrow][leftcol] && upcheck)) {
                if (way[uprow][upcol] > way[leftrow][leftcol]) {
                    currentcol = upcol;
                    currentrow = uprow;
                }

            } else {
                currentcol = leftcol;
                currentrow = leftrow;
            }
            sum += way[currentrow][currentcol];
            if (currentcol == 0 && currentrow == 0) {
                break;
            }
        }
        System.out.println(way[currentrow][currentcol]);
        System.out.println(sum);
    }
}
