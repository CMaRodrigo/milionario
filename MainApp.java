import java.util.Scanner;
/**
 * A classe {MainApp} contém uma simulçao do jogo "Quem quer ser um milionário" onde serão feitas perguntas ao usuário e caso este
 * acerte o jogo avança, o jogo tem um total de 13 perguntas.
 * 
 * As alternativas são a, b, c, d. Sendo necessário ser em minúsculo.
 * 
@author Rodrigo da Rosa (rodrigo.rosa001@edu.pucrs.br);

@ 22/06/2021
*/



public class MainApp{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
    
       String a;
        String b;
        String c;
        String d;
        String alternativa;
        int vidas;
        int conta;
        
        System.out.println("Seja muito bem vindo ao Quem Quer Ser um Milionário!! Se você acertar as próximas 13 perguntas será o grande campeão!! \n");
    
        String[] perguntas = {"Quem foi o presidente do Brasil no ano de 2014?", 
                            "A laranja é rica em qual vitamina?",
                            "Quem compôs o Hino da Independência?",
                            "A cópia de segurança de um arquivo que é guardado como reserva chama-se:",
                            "O sangue é formado por inúmeras e diminutas estruturas avermelhadas chamadas de:",
                            "Como é conhecido o cloreto de sódio?",
                            "Que instrumento Jimi Hendrix tocava?",
                            "No Brasil, na carteira de motorista a categoria E se refere a quais veículos?",
                            "Qual bicho transmite a doença de Chagas?",
                            "Qual é o triângulo que tem todos os lados diferentes?",
                            "Para obter R$ 32 com a mesma quantidade de moedas de um, cinco e dez centavos, quantas moedas de cada valor são necessárias?",
                            "Qual destes animais é conhecido como cão selvagem australiano?",
                            "Qual a classificação dada ao medicamento obtido exclusivamente da matéria-prima vegetal?"};
                            
       teclado = new Scanner(System.in);
        a = "a";
        b = "b";
        c = "c";
        d= "d";
        alternativa = "0";
        vidas = 1;
        conta = 0; 
                            
        while(vidas == 1){
            
        System.out.println(perguntas[0]);
        System.out.println("\n");
        System.out.println(" A - Dilma Rouseff \n B - Michel Temer \n C - Jair Bolsonaro \n D - Lula");
        
        alternativa = teclado.nextLine();
        if(alternativa.equals(a)){
            System.out.println("ACERTOU!!!\n");
            conta = conta + 1000;
            System.out.println("Seu saldo é de: R$ " + conta);
        }
        else{
            System.out.println("ERROUUUUU!! \n Agradecemos a sua participação, infelizmente não foi desta vez.");
            break;
        }

        System.out.println("\n");
        System.out.println(perguntas[1]);
        System.out.println("\n");
        System.out.println(" A - Viatamina D \n B - Vitamina C \n C - Vitamina E \n D - Vitamina K");
        
        alternativa = teclado.nextLine();
        
        if(alternativa.equals(b)){
            System.out.println("ACERTOU!!!\n");
            conta = conta + 1000;
            System.out.println("Seu saldo é de: R$ " + conta);
        }
        else{
            System.out.println("ERROUUUUU!! \n Agradecemos a sua participação, infelizmente não foi desta vez.");
            break;
        }
        System.out.println("\n");
        System.out.println(perguntas[2]);
        System.out.println("\n");
        System.out.println(" A - Dom Pedro I\n B - Manuel Bandeira \n C - Castro Alves \n D - Carlos Gomes");
        
        alternativa = teclado.nextLine();
        
        if(alternativa.equals(a)){
            System.out.println("ACERTOU!!!\n");
            conta = conta + 3000;
            System.out.println("Seu saldo é de: R$ " + conta);
        }
        else{
            System.out.println("ERROUUUUU!! \n Agradecemos a sua participação, infelizmente não foi desta vez.");
            break;
        }
        System.out.println("\n");
        
        System.out.println(perguntas[3]);
        System.out.println("\n");
        System.out.println(" A - Backhand \n B - Backlight \n C - Backbone \n D - Backup");
        
        alternativa = teclado.nextLine();
        
        if(alternativa.equals(d)){
            System.out.println("ACERTOU!!!\n");
            conta = conta + 5000;
            System.out.println("Seu saldo é de: R$ " + conta);
        }
        else{
            System.out.println("ERROUUUUU!! \n Agradecemos a sua participação, infelizmente não foi desta vez.");
            break;
        }
        System.out.println("\n");
        
        System.out.println(perguntas[4]);
        System.out.println("\n");
        System.out.println(" A - Glóbulos Brancos \n B - Glóbulos Roxos\n C - Glóbulos Vermelhos \n D - Glóbulos Amarelos");
        
        alternativa = teclado.nextLine();
        
    if(alternativa.equals(c)){
            System.out.println("ACERTOU!!!\n");
            conta = conta + 10000;
            System.out.println("Seu saldo é de: R$ " + conta);
        }
        else{
            System.out.println("ERROUUUUU!! \n Agradecemos a sua participação, infelizmente não foi desta vez.");
            break;
        }
        System.out.println("\n");
        
        System.out.println(perguntas[5]);
        System.out.println("\n");
        System.out.println(" A - Água sanitária \n B - Sal de cozinha\n C - Amaciante de roupas\n D - Aspirina");
        
        alternativa = teclado.nextLine();
        
        if(alternativa.equals(b)){
            System.out.println("ACERTOU!!!\n");
            conta = conta + 20000;
            System.out.println("Seu saldo é de: R$ " + conta);
        }
        else{
            System.out.println("ERROUUUUU!! \n Agradecemos a sua participação, infelizmente não foi desta vez.");
            break;
        }
    System.out.println("\n");
    
    System.out.println(perguntas[6]);
    System.out.println("\n");
    System.out.println(" A - Bateria\n B - Guitarra\n C - Baixo\n D - Pandeiro");
    
    alternativa = teclado.nextLine();
    
    if(alternativa.equals(b)){
            System.out.println("ACERTOU!!!\n");
            conta = conta + 40000;
            System.out.println("Seu saldo é de: R$ " + conta);
        }
        else{
            System.out.println("ERROUUUUU!! \n Agradecemos a sua participação, infelizmente não foi desta vez.");
            break;
        }
    System.out.print("\n");
    
    System.out.println(perguntas[7]);
    System.out.println("\n");
    System.out.println(" A - Transporte de carga pequeno\n B - Carros de passeio\n C - Ônibus\n D - Transporte de carga grande");
    
    alternativa = teclado.nextLine();
    
    if(alternativa.equals(a)){
            System.out.println("ACERTOU!!!\n");
            conta = conta + 70000;
            System.out.println("Seu saldo é de: R$ " + conta);
            
        }
        else{
            System.out.println("ERROUUUUU!! \n Agradecemos a sua participação, infelizmente não foi desta vez.");
            break;
        }
    System.out.println("\n");
    
    System.out.println(perguntas[8]);
    System.out.println("\n");
    System.out.println(" A - Abelha\n B - Barata\n C - Pulga\n D - Barbeiro");
    
    alternativa = teclado.nextLine();
    
    if(alternativa.equals(d)){
            System.out.println("ACERTOU!!!\n");
            conta = conta + 90000;
            System.out.println("Seu saldo é de: R$ " + conta);
        }
        else{
            System.out.println("ERROUUUUU!! \n Agradecemos a sua participação, infelizmente não foi desta vez.");
            break;
        }
        System.out.println("\n");
        
        System.out.println(perguntas[9]);
        System.out.println("\n");
        System.out.println(" A - Equilátero\n B - Isóceles\n C - Escaleno\n D - Trapézio");
        
        alternativa = teclado.nextLine();
        
        
    if(alternativa.equals(c)){
            System.out.println("ACERTOU!!!\n");
            conta = conta + 120000;
            System.out.println("Seu saldo é de: R$ " + conta);
        }
        else{
            System.out.println("ERROUUUUU!! \n Agradecemos a sua participação, infelizmente não foi desta vez.");
            break;
        }
        System.out.println("\n");
        
        System.out.println(perguntas[10]);
        System.out.println(" A - 100\n B - 150\n C - 200\n D - 250");
        
        alternativa = teclado.nextLine();
        
        if(alternativa.equals(c)){
            System.out.println("ACERTOU!!! \n");
            conta = conta + 160000;
            System.out.println("Seu saldo é de: R$ " + conta);
        }
        else{
            System.out.println("ERROUUUUU!! \n Agradecemos a sua participação, infelizmente não foi desta vez.");
            break;
        }
    System.out.println("\n");
    
    System.out.println(perguntas[11]);
    System.out.println(" A - Dingo\n B - Bisão\n C - Curica\n D - Acauã");
    
    alternativa = teclado.nextLine();

        
    if(alternativa.equals(a)){
            System.out.println("ACERTOU!!! \n");
            conta = conta + 200000;
            System.out.println("Seu saudo é de R$ " + conta);
        }
        else{
            System.out.println("ERROUUUUU!! \n Agradecemos a sua participação, infelizmente não foi desta vez.");
            break;
        }
    System.out.println("\n");
    
    System.out.println(perguntas[12]);
    System.out.println(" A - Genérico\n B - Fitoterápico\n C - Homeopático\n D - Alopático");
    
    alternativa = teclado.nextLine();
    
    if(alternativa.equals(b)){
            System.out.println("VOCẼ É O MAIS NOVO MILIONÁRIO BRASILEIRO, PARABENS!!!");
        }
        else{
            System.out.println("ERROUUUUU!! \n Agradecemos a sua participação, infelizmente não foi desta vez.");
            break;
        }
        teclado.close();
        break;
        }    
    }   
}