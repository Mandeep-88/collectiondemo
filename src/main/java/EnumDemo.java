public class EnumDemo {
    public static void main(String[] args) {
        Size s = Size.SMALL;
        Size[] values = Size.values();
        for(Size size : values){
            System.out.println(size);
        }
        System.out.println(Size.valueOf("SMAll")); //.valueof
        String name = Size.SMALL.name();   // .name is given the string version of enum

// String s ="fbgch";
        System.out.println("please fetch the shirt size :"+ s);
    }
}
