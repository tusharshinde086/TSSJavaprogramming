public class FinalizeMethod {
    public static void main(String[] args) {
        FinalizeMethod  b=new FinalizeMethod();
        System.out.println(b.hashCode());
        b=null;
        System.gc();
        System.out.println("end of garbage collection");
    }
    protected void finalize(){
        System.out.println("finalize method called");
    }
    
}
