public class Classroom {
    public static void main(String[] args) {

        Wilder wilderOne = new Wilder("John", true);
        Wilder wilderTwo = new Wilder("Jack", false);
        String wilderOneFirstName = wilderOne.getFirstName();
        boolean wilderOneIsAware = wilderOne.getAware();
        String wilderTwoFirstName = wilderTwo.getFirstName();
        boolean wilderTwoIsAware = wilderTwo.getAware();
        System.out.println(wilderOne.whoAmI(wilderOneFirstName, wilderOneIsAware));
        System.out.println(wilderTwo.whoAmI(wilderTwoFirstName, wilderTwoIsAware));

    }
}
