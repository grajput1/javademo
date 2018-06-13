package com.home.learnjava;


import java.io.IOException;
import java.util.Scanner;
import java.io.File;

interface Message{
    String getMessage();
}

public class App {
    enum COLOR
    {
        WHITE,
        RED,
        BLACK
    }

    static void displayMessage(Message m){
        System.out.println(m.getMessage() + "This is greeting message from displayMessage function");
    }

    public static void main(String[] args){


        COLOR mycolor = COLOR.RED;

        displayMessage(new Message() {
            @Override
            public String getMessage() {
                return "Hello";
            }
        });

        for(int i = 0 ; i < args.length ;++i)
            System.out.println(args[i]);

        int[] arr1 = {0, 1, 2, 3, 2};
        int[] arr2 = {0, 0};
        int[] arr3 = {22, 0, -5, 0, 126};
        int[] arr4 = {1, 0};

        System.out.println("passing " + printIntegerArray(arr1) + " got back " + printIntegerArray(NonZeros(arr1)));
        System.out.println("passing " + printIntegerArray(arr2) + " got back " + printIntegerArray(NonZeros(arr2)));
        System.out.println("passing " + printIntegerArray(arr3) + " got back " + printIntegerArray(NonZeros(arr3)));
        System.out.println("passing " + printIntegerArray(arr4) + " got back " + printIntegerArray(NonZeros(arr4)));

        List mylist = new List();
        Integer item = 0;
        mylist.AddToEnd(++item);
        mylist.AddToEnd(++item);
        mylist.AddToEnd(++item);
        mylist.AddToEnd(++item);
        mylist.AddToEnd(++item);
        mylist.AddToEnd(++item);
        List l2 = (List)mylist.clone();

        l2.PrintToScreen();



        Scanner scanner = new Scanner(System.in);
        System.out.println("Type some text:");
        String input = scanner.nextLine();
        System.out.println("input:" + input);

        try {
            readFile("C:\\Users\\Ganesh Rajput\\Desktop\\1b.txt");
        }
        catch(IOException ex)
        {
            System.out.println("IOException" + ex.getMessage());
        }

        String str1 = "Hi there";
        String str2 = new String("Hi there");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.substring(1,7));
        System.out.println(str1.trim());
        System.out.println(str1.startsWith("Hi"));
        System.out.println(str1.endsWith("there"));
        System.out.println(str1.replace('i', 'o'));
    }

    static void readFile(String filename) throws IOException {
        File file = new File(filename);
        if(file.exists()) {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }

    }
    static String printIntegerArray(int[] arr) {
        String outString = "";
        outString += "[";
        for(int i = 0; i < arr.length ; ++i) {
            if(i+1 == arr.length) {
                outString += String.valueOf(arr[i]) ;
            } else
                outString += String.valueOf(arr[i]) + ",";
        }
        outString += "]";
        return outString;
    }

    public static int[] NonZeros( int [] A )
    {
        int nonz = 0;
        for (int k=0; k<A.length; k++) if (A[k] != 0) nonz++;

        // allocate and fill new array
        int[] result = new int[nonz];
        int j = 0; // index of next element of new array to fill in
        for (int k=0; k<A.length; k++) {
            if (A[k] != 0) {
                result[j] = A[k];
                j++;
            }
        }
        return result;
    }
}

class List implements Cloneable{
    private Object[] items;
    private int      numItems;

    public Object clone()
    {
        try {
            List tmp = (List) super.clone();
            tmp.items = (Object[])items.clone();
            return tmp;
        }
        catch(CloneNotSupportedException ex){
            throw new InternalError(ex.toString());
        }
    }
    public List() {
        this(10);
    }

    public List(int num){
        items = new Object[num];
        numItems = 0;
    }
    public void AddToEnd(Object item){
        items[numItems] = item;
        ++numItems;
    }

    public void PrintToScreen() {
        for (Object a: items
             )
            try {
                System.out.println(a);
            } catch (ClassCastException ex) {
                ex.printStackTrace();
            }
    }
}

