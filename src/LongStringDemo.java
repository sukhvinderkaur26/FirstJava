import java.util.Arrays;

public class LongStringDemo {
    public static void main(String[] args) {
//        String str="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin nisl ex, ultricies vitae egestas et, lobortis sit amet velit. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Vivamus placerat sem quis semper rhoncus. Aenean lacus nisi, dictum vitae pulvinar et, mattis et mi. Quisque ut arcu in elit rutrum ultricies. Proin iaculis mauris consequat leo luctus, eget porttitor tortor mattis. Vestibulum ut euismod nulla, ac tempus libero. Aenean molestie, odio a ornare rhoncus, ipsum purus eleifend lacus, et accumsan sem enim eu nisl. Duis condimentum, nunc a aliquet semper, ipsum sapien aliquet mi, luctus commodo velit turpis sit amet quam. Etiam felis nisi, ornare et condimentum id, pharetra ut ante. Ut vehicula scelerisque dapibus. Curabitur blandit quis erat vel tempor. Donec fermentum purus eget eros porta malesuada";
//
//        int totalChars=0;
//        char[] chars = str.toCharArray();
//        int length=str.length();
//        for(int i=0;i<length;i++)
//        {
//          if (chars[i]=='a'||chars[i]=='A')
//          {
//              totalChars++;
//          }
//
//        }
//        System.out.println("Total number of a is :"+totalChars);


        //Atin sir code

//        String str="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin nisl ex, ultricies vitae egestas et, lobortis sit amet velit. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Vivamus placerat sem quis semper rhoncus. Aenean lacus nisi, dictum vitae pulvinar et, mattis et mi. Quisque ut arcu in elit rutrum ultricies. Proin iaculis mauris consequat leo luctus, eget porttitor tortor mattis. Vestibulum ut euismod nulla, ac tempus libero. Aenean molestie, odio a ornare rhoncus, ipsum purus eleifend lacus, et accumsan sem enim eu nisl. Duis condimentum, nunc a aliquet semper, ipsum sapien aliquet mi, luctus commodo velit turpis sit amet quam. Etiam felis nisi, ornare et condimentum id, pharetra ut ante. Ut vehicula scelerisque dapibus. Curabitur blandit quis erat vel tempor. Donec fermentum purus eget eros porta malesuada";
//
//        String[] split = str.split(" ");
//        int worldcount=0;
//        for (String st:split)
//        {
//            if(st.length()>=5)
//            {
//                worldcount++;
//            }
//        }
//        System.out.println("Total world >=5 are :"+worldcount);
        //***********************


        String[] names=new String[5];
        names[0]="sukhvinder";
        names[1]="mandeep";
        names[2]="navdeep";
        names[3]="yagna";
        names[4]="manpreet";
        System.out.println(Arrays.binarySearch(names, "navdeep"));
        System.out.println(Arrays.compare(new int[]{1, 2, 3},0,1, new int[]{1, 2, 4},0,1 ));
        System.out.println(Arrays.compareUnsigned(new int[]{2, 3}, new int[]{-2, 3}));
        String[] copy = Arrays.copyOf(names, 3, String[].class);
        System.out.println(Arrays.toString(copy));
    }
}
