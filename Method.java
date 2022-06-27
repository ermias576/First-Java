public class Method {

    public static void main(String[] args) {
        // AddExclamation("Hey there");
        /*
         * String exclaiam = AddExclamation("Hey there");
         * System.out.println(exclaiam);
         */
        Person a = new Person();
        String person = a.IamPerson();
        System.out.println(person);
    }

    /*
     * public static void AddExclamation(String s) {
     * System.out.println(s + "!");
     * }
     */
    public static String AddExclamation(String s) {
        return s + "!";
    }
}