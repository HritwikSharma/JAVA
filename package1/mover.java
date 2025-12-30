package package1;

class mover extends mover1{
    public static void main(String args[]){
        mover1 n=new mover1();
        int a,b;
        a=n.add(5,10);
        b=n.add(2,3);
        double c=n.add(2.54,5.63);
        String d=n.add("Hello","world");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}