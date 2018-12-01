package Ch_11;

import static java.lang.System.out;

class ShowGuests2 {

    public static void main(String args[]) {

        int guests[] = {1, 4, 2, 0, 2, 1, 4, 3, 0, 2};

        out.println("Room\tGuests");

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            out.print(roomNum);
            out.print("\t\t");
            out.println(guests[roomNum]);
        }
    }
}
