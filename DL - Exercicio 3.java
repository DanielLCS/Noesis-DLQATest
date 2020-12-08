import java.util.Scanner;

class Fidelity {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int choice;
        double total = 0;
        int discount = 0;

        //Array for storing prices
        double[] moviePrice = new double[6];
        moviePrice[0] = 45.00;
        moviePrice[1] = 55.00;
        moviePrice[2] = 100.00;
        moviePrice[3] = 55.00;
        moviePrice[4] = 100.00;
        moviePrice[5] = 200.00;

        //Movie name array
        String[] movieName = new String[6];
        movieName[0] = "Senhor dos Anéis";
        movieName[1] = "As Branquelas";
        movieName[2] = "Velozes e Furiosos 7";
        movieName[3] = "Velozes e Furiosos 6";
        movieName[4] = "The Scapegoat";
        movieName[5] = "Meu Malvado Favorito";

        //Movie genre array
        String[] movieGenre = new String[6];
        movieGenre[0] = "Fantasia";
        movieGenre[1] = "Comédia";
        movieGenre[2] = "Ação";
        movieGenre[3] = "Ação";
        movieGenre[4] = "Drama";
        movieGenre[5] = "Animação";

        //Welcome user and gather their menu selection
        System.out.println("Selecione os filmes:\n"
                + "0. Senhor dos Anéis -- $45.00\n"
                + "1. As Branquelas -- $55.00\n"
                + "2. Velozes e Furiosos 7 -- $100.00\n"
                + "3. Velozes e Furiosos 6 -- $55.00\n"
                + "4. The Scapegoat -- $100.00\n"
                + "5. Meu Malvado Favorito -- $200.00\n"
                + "6 End\n");
        do {
            choice = input.nextInt();
            System.out.println("ID:" + choice + " " + movieName[choice] + " selecionado");
            total += moviePrice[choice];
        }while(choice!=6);

        //Add up the total to check discount
        if(total>=100 && total<200){
            discount = 10;
        }else if(total>=200 && total<300){
            discount = 20;
        }else if(total>=300 && total<400){
            discount = 30;
        }else if(total>400){
            discount = 40;
        }
        //Check for genre Ação
        if(choice == 2 || choice == 3){
            discount = discount+5;
        }else{
            discount = discount;
        }

        total = (total*discount)/100;

        System.out.println("Seu total após aplicação de desconto é: " + total);
    }


}
