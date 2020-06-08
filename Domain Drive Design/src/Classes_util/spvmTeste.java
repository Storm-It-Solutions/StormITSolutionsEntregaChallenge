package Classes_util;


import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class spvmTeste {


    public static void main(String[] args) {
        Manager gestor = new Manager("carlinhos",
                "Gestor",
                20300,
                20966.32f,
                30,
                new ArrayList<Achievement>(),
                "Carlos dos Santos Silva",
                "Gestor de TI",
                LocalDate.of(2005, 8, 30),
                LocalDate.of(1990, 6, 14),
                "Masculino",
                "TI",
                6,
                "TI",
                0,
                new ArrayList<Persona>(),
                new ArrayList<JobRequest>(),
                new ArrayList<CourseRequest>()
        );

        Persona persona = new Persona(
                "carlinho",
                "Desenvolvedor",
                0,
                500,
                0,
                new ArrayList<Achievement>(),
                "Carlos dos Santos",
                "Java Developer",
                LocalDate.now(),
                LocalDate.of(2002,9,1),
                "Masculino",
                "TI",
                15
                );


        Recruiter recrutador = new Recruiter(
                "marlinha",
                "Recrutadora",
                0,
                500,
                0,
                new ArrayList<Achievement>(),
                "Marcela Siqueira de Mattos",
                "Recursos Humanos",
                LocalDate.of(2019,12,31),
                LocalDate.of(1998, 9, 24),
                "Feminino",
                "RH",
                8
                );


        DataBase db = new DataBase();
        gestor.defineDataBase(db);
        persona.setDataBase(db);
        recrutador.setDataBase(db);



        boolean continuar = true;

        while (continuar){

            int opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n< 1 > - Entrar como Persona \n< 2 > - Entrar como Gestor \n< 3 > - Entrar como Recrutador \n< 4 > - Sair"));

            switch (opc){
                case 1:
                    JOptionPane.showMessageDialog(null, "Logado como Persona!");
                    int func;
                    do{
                        func = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção selecionada:" +
                                "\n< 1 > - Solicitar curso" +
                                "\n< 2 > - Solicitar Vaga" +
                                "\n< 3 > - Ver conta" +
                                "\n< 4 > - Receber Experiência" +
                                "\n< 5 > - Ver Conquistas" +
                                "\n< 6 > - Receber conquista" +
                                "\n< 7 > - Verificar status da requisição" +
                                "\n< 15 > - Deslogar"));

                        switch (func){
                            case 1:
                                JOptionPane.showMessageDialog(null,"Solicitar curso");
                                persona.sendCourseRequest();
                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null,"Solicitar vaga");
                                persona.selectJob();
                                break;

                            case 3:
                                JOptionPane.showMessageDialog(null,"Verificar informações");
                                persona.showInfo();
                                break;

                            case 4:
                                float xp = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de xp:"));
                                persona.receiveXP(xp);
                                JOptionPane.showMessageDialog(null,
                                        String.format("Você ganhou %.2f pontos de experiência", xp));
                                break;

                            case 5:
                                JOptionPane.showMessageDialog(null,"Conquistas:");
                                persona.showAchievements();
                                break;

                            case 6:
                                persona.receiveAchievements(createAchievement());
                                JOptionPane.showMessageDialog(null,"Conquista recebida!");
                                break;

                            case 7:
                                int idRequisicao = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da requisição de respota: "));
                                JOptionPane.showMessageDialog(null,"Verificando status da requisição......");
                                persona.verifyStatusRequest(idRequisicao);
                                break;
                            case 15:
                                JOptionPane.showMessageDialog(null,"Saindo ....");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção Inválida.");
                        }
                    }while(func != 15);
                    break;


                case 2:
                    JOptionPane.showMessageDialog(null, "Logado como Gestor!");
                    do{


                        func = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção selecionada:" +
                                "\n< 1 > - Avaliar requisições de vaga" +
                                "\n< 2 > - Avaliar requisições de curso" +
                                "\n< 3 > - Solicitar curso" +
                                "\n< 4 > - Solicitar Vaga" +
                                "\n< 5 > - Ver conta" +
                                "\n< 6 > - Receber Experiência" +
                                "\n< 7 > - Ver Conquistas" +
                                "\n< 8 > - Receber conquista" +
                                "\n< 9 > - Verificar status da requisição" +

                                "\n< 15 > - Deslogar"));

                        switch (func){
                            case 1:
                                JOptionPane.showMessageDialog(null,"Requisições de vagas");
                                gestor.showJobRequests();
                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null,"Requisições de cursos");
                                gestor.showCoursesRequests();
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null,"Solicitar curso");
                                gestor.sendCourseRequest();
                                break;

                            case 4:
                                JOptionPane.showMessageDialog(null,"Solicitar vaga");
                                gestor.selectJob();
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null,"Verificar informações");
                                gestor.showInfo();
                                break;

                            case 6:
                                float xp = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de xp:"));
                                gestor.receiveXP(xp);
                                JOptionPane.showMessageDialog(null,
                                        String.format("Você ganhou %.1f pontos de experiência", xp));
                                break;

                            case 7:
                                JOptionPane.showMessageDialog(null,"Conquistas:");
                                gestor.showAchievements();
                                break;

                            case 8:
                                gestor.receiveAchievements(createAchievement());
                                JOptionPane.showMessageDialog(null,"Conquista recebida!");
                                break;

                            case 9:
                                int idRequisicao = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da requisição de respota: "));
                                JOptionPane.showMessageDialog(null,"Verificando status da requisição...");
                                gestor.verifyStatusRequest(idRequisicao);
                                break;
                            case 15:
                                JOptionPane.showMessageDialog(null,"Saindo ....");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção Inválida.");
                        }
                    }while(func != 15);
                    break;


                case 3:
                    JOptionPane.showMessageDialog(null, "Logado como Recrutador!!");
                    do{
                        func = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção selecionada:" +
                                "\n< 1 > - Criar uma vaga" +
                                "\n< 2 > - Atualizar uma vaga" +
                                "\n< 3 > - Deletar uma Vaga" +
                                "\n< 4 > - Solicitar Vaga" +
                                "\n< 5 > - Verificar status da requisição" +

                                "\n< 6 > - Criar um curso" +
                                "\n< 7 > - Atualizar um curso" +
                                "\n< 8 > - Deletar um curso" +
                                "\n< 9 > - Solicitar curso" +


                                "\n< 10 > - Ver conta" +
                                "\n< 11 > - Receber Experiência" +
                                "\n< 12 > - Ver Conquistas" +
                                "\n< 13 > - Receber conquista" +


                                "\n< 15 > - Deslogar"));
                            switch (func){
                                case 1:
                                    JOptionPane.showMessageDialog(null,
                                            "Iniciando criação de vaga .....");
                                    recrutador.postJob(recrutador.createJob());
                                    break;

                                case 2:
                                    JOptionPane.showMessageDialog(null,
                                            "Iniciando atualização de vaga .....");
                                    recrutador.updateJob(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da vaga:")));
                                    break;

                                case 3:
                                    JOptionPane.showMessageDialog(null,
                                            "Selecione a vaga que deseja deletar:");
                                    recrutador.deleteJob(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da vaga:")));
                                    break;

                                case 4:
                                    JOptionPane.showMessageDialog(null,
                                            "Vagas disponiveis:");
                                    recrutador.sendJobRequest(recrutador.selectJob());
                                    break;

                                case 5:
                                    JOptionPane.showMessageDialog(null,
                                            "Verificando status da solicitação ......");
                                    recrutador.verifyStatusRequest(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da requisição:")));
                                    break;





                                case 6:
                                    JOptionPane.showMessageDialog(null,
                                            "Iniciando criação de um curso");
                                    recrutador.postCourse(recrutador.createCourse());
                                    break;

                                case 7:
                                    JOptionPane.showMessageDialog(null,
                                            "Atualização de curso iniciada ........");
                                    recrutador.updateCourse(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da curso:")));
                                    break;

                                case 8:
                                    JOptionPane.showMessageDialog(null,
                                            "Exclusão de curso iniciada ...");
                                    recrutador.deleteCourse(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da curso:")));
                                    break;

                                case 9:
                                    JOptionPane.showMessageDialog(null,
                                            "Seleçãp de curso iniciada");
                                    recrutador.sendCourseRequest();


                                case 10:
                                    JOptionPane.showMessageDialog(null, "Informações da conta");
                                    recrutador.showInfo();
                                    break;


                                case 11:
                                    float xp = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de xp:"));
                                    persona.receiveXP(xp);
                                    JOptionPane.showMessageDialog(null,
                                            String.format("Você ganhou %.2f pontos de experiência", xp));
                                    break;
                                case 12:
                                    JOptionPane.showMessageDialog(null,
                                            "Conquistas:");
                                    persona.showAchievements();
                                    break;
                                case 13:
                                    persona.receiveAchievements(createAchievement());
                                    JOptionPane.showMessageDialog(null,
                                            "Conquista recebida!");
                                    break;
                                case 15:
                                    JOptionPane.showMessageDialog(null,
                                            "Deslogando .....");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null,
                                            "Opção inválida");
                            }
                    }while(func != 15);
                    break;


                case 4:
                    continuar = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida.");

            }

        }

    }


    static public Achievement createAchievement(){
        String achievement = JOptionPane.showInputDialog("Digite o nome do achievement: ");
        LocalDate receiptDate = LocalDate.now();
        String achievementType = JOptionPane.showInputDialog("Digite o tipo do achievement:");
        float XP = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de XP que essa conquista irá fornecer:"));
        String achievementDescription = JOptionPane.showInputDialog("Descrição da conquista:");

        return new Achievement(achievement,receiptDate,achievementType, XP, achievementDescription);
    }

}
