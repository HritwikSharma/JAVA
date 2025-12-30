import java.util.stream.Stream;
class streamiter{
    public static void main(String args[]){
        Stream.iterate(10,n->n+2).filter(n->n%2==0).limit(10).forEach(System.out::println);
    }
}