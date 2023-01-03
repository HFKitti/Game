public class Game {
    public static void main(String[] args) {

        System.out.println(generator());
    }

    public static String generator(){

        String[] fisrtWord = {"Húzz", "Lépj", "Kimaradsz"};
        String[] secondWord = {"egyet!", "kettőt!", "hármat!", "négyet!", "ötöt!", "hatot!"};
        String[] thirdWord = {"Ilyen ez a játék!", "Sok sikert!"};

        int oneLenght = fisrtWord.length;
        int secondLenght = secondWord.length;
        int thirdLenght = thirdWord.length;

        int random1 = (int) (Math.random()* oneLenght);
        int random2 = (int) (Math.random()* secondLenght);
        int random3 = (int) (Math.random()* thirdLenght);

        String sentence = fisrtWord[random1] + " " + secondWord[random2] + " " + thirdWord[random3];

        return sentence;
    }

}
