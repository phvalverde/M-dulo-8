public class ExMod8 {

    public static void main(String[] args) {
        mediaNotas();
    }
    private static void mediaNotas() {
        System.out.println("****** Desempenho do Aluno ******");

            int media = 6;

            double bimes1 = 7.1;
            System.out.println("Tirou " + bimes1 + " no primeiro bimestre");
            double bimes2 = 4.5;
            System.out.println("Tirou " + bimes2 + " no segundo bimestre");
            double bimes3 = 5.6;
            System.out.println("Tirou " + bimes3 + " no terceiro bimestre");
            double bimes4 = 5.3;
            System.out.println("Tirou " + bimes4 + " no quarto bimestre");

            double mediaAluno = (bimes1 + bimes2 + bimes3 + bimes4) / 4;
            System.out.printf("A média do aluno foi = %.2f %n", + mediaAluno);
            //Estava dando o valor decimal com muitos zeros, busquei na internet como faria pra encurtar,
            //encontrei o "printf e usei if else pra entregar o status, ainda não dado no curso
            //mas que já tenho certo conhecimento sobre.

            if (mediaAluno >= media) {
                System.out.println("O aluno foi Aprovado");
            } else if (mediaAluno <= 5){
                System.out.println("O aluno foi Reprovado");
            } else {
                System.out.println("O aluno está na Recuperação");
            }

    }

}
