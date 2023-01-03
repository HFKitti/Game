public class Game {
    public static void main(String[] args) {

        System.out.println(generator());
    }

    public static String generator(){

        String[] fisrtWord = {"Húzz", "Lépj", "Kimaradsz"};
        String[] secondWord = {"egyet!", "kettőt!", "hármat!", "négyet!", "ötöt!", "hatot!"};
        String[] thirdWord = {"Ilyen ez a játék!", "Sok sikert!"};

        int random1 = (int) (Math.random()* fisrtWord.length);
        int random2 = (int) (Math.random()* secondWord.length);
        int random3 = (int) (Math.random()* thirdWord.length);

        String sentence = fisrtWord[random1] + " " + secondWord[random2] + " " + thirdWord[random3];

        return sentence;
    }

}
