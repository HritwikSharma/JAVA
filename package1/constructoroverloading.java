package package1;
class constructoroverloading{
    public static void main(String args[]){
        A o=new A(2,3);
        A o1=new A();
        o.display();
        o1.display();
    }
}
class A{
    int x;
    int y;
    A(int x,int y){
        this.x=x;
        this.y=y;
    }
    A(){
        x=999;
        y=999;
    }
    void display(){
        System.out.println("x="+x+"y="+y);
    }
}