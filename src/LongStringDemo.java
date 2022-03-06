import java.util.Arrays;

public class LongStringDemo {
    public static void main(String[] args) {
//        String str="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin nisl ex, ultricies vitae egestas et, lobortis sit amet velit. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Vivamus placerat sem quis semper rhoncus. Aenean lacus nisi, dictum vitae pulvinar et, mattis et mi. Quisque ut arcu in elit rutrum ultricies. Proin iaculis mauris consequat leo luctus, eget porttitor tortor mattis. Vestibulum ut euismod nulla, ac tempus libero. Aenean molestie, odio a ornare rhoncus, ipsum purus eleifend lacus, et accumsan sem enim eu nisl. Duis condimentum, nunc a aliquet semper, ipsum sapien aliquet mi, luctus commodo velit turpis sit amet quam. Etiam felis nisi, ornare et condimentum id, pharetra ut ante. Ut vehicula scelerisque dapibus. Curabitur blandit quis erat vel tempor. Donec fermentum purus eget eros porta malesuada";
//
//        int totalChars=0;for(int i=0;i<str.length();i++)
//        {
//            char[] chars = str.toCharArray();
//            if(chars='a')
//            {
//
//            }
        //}

        String[] names=new String[5];
        names[0]="sukhvinder";
        names[1]="mandeep";
        names[2]="navdeep";
        names[3]="yagna";
        names[0]="manpreet";
        System.out.println(Arrays.binarySearch(names, "navdeep"));
        System.out.println(Arrays.compare(new int[]{1, 2, 4}, new int[]{1, 2, 4}));

    }
}
