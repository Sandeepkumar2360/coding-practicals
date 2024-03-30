package singleton;

public class ArrayProblem1 {
    public static void main(String[] args) {
        int [] a =  {10,20,30,40,50,60,70,80};
        int newArr [] = getSolvedArray(a);

        for (int i:
                newArr) {
            System.out.print(i+", ");
        }

        int [] a1 =  {10,20,30,40,50,60,70};
        int newArr1 [] = getSolvedArray(a1);
        System.out.println();
        for (int i:
                newArr1) {
            System.out.print(i+", ");
        }

        int [] a2 =  {10,20,30,40,50,60};
        int newArr2 [] = getSolvedArray(a2);
        System.out.println();
        for (int i:
                newArr2) {
            System.out.print(i+", ");
        }
    }

    public static int [] getSolvedArray(int [] x) {
        int length = x.length;
        int [] output = new int[length];
        int mid = length /2;

        for (int i=0; i<=mid; i++){
            int index =  length%2==0?  mid+i: mid+i+1;
            int i2x = i * 2;
            if(i2x < length) {
                output[i2x] = x[i];
            }
            if(index< length) {
                int i2xPlus1 = i2x + 1;
                output[i2xPlus1] = x[index];
            }
        }
        return  output;
    }
}


//array of intgeers = 10,20,30,40,50,60,70 ==
//      array of intgeers = x1, x2, x3,x4, y1,y2,y3,y4 = x1,y1,x2,y2,x3,y3,x4,y4
//      array of intgeers = x1, x2, x3, y1,y2,y3,y4 = x1,y1,x2,y2,x3,y3,y4

//      array of intgeers = 10,20,30,40,50,60,70 == 10,50,20,60,30,70,40
/*
i-0, 1, 2, 3, 4, 5,6

i=0, index=1
i=1+

i*2+1 =*/
