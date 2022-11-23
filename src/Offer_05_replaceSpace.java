public class Offer_05_replaceSpace {
    public String replaceSpace(String s) {
//        String[] res = s.split("");
//        StringBuilder prt = new StringBuilder();
//        for (int i = 0; i < res.length; i++) {
//            if (res[i].equals(" ")) {
//                prt.append("%20");
//            } else {
//                prt.append(res[i]);
//            }
//        }
//        return prt.toString();
        return s.replaceAll(" ", "%20");
    }

    public static void main(String[] args) {
        Offer_05_replaceSpace fun = new Offer_05_replaceSpace();
        String res = fun.replaceSpace("     ");
        System.out.println(res);
    }
}
