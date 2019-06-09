public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> myList =new MyList<Integer>();
        myList.add(0,1);
        myList.add(1,2);
        myList.add(2,3);
        myList.add(3,4);
        myList.add(4,1);
        myList.add(5,4);
        myList.add(6,1);
        myList.add(7,2);
        myList.add(8,3);
        myList.add(9,4);


        myList.remove(1);

        MyList<Integer> myList1=myList.clone();

        myList.clear();
        System.out.println(myList1.size());
        System.out.println(myList1.contains(5));
        System.out.println(myList1.indexOf(3));
        System.out.println();
        for (int i=0;i<myList1.size();i++) {
            System.out.println(myList1.get(i));
        }
    }
}
