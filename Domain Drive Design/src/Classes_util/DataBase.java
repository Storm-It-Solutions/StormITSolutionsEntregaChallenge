package Classes_util;

import javax.swing.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

public class DataBase implements Serializable {

    private List<Job> tableJob = new ArrayList<Job>();
    private List<JobRequest> tableJobRequest = new ArrayList<JobRequest>();
    private List<Course> tableCourse = new ArrayList<Course>();
    private List<CourseRequest> tableCourseRequest = new ArrayList<CourseRequest>();
    private List<RequestReturn> tableRequestReturn = new ArrayList<RequestReturn>();


    public DataBase(){

        tableJob.add(new Job(1,
                "Desenvolvedor Java Júnior",
                "Desenvolvimento",
                "[Vale Transporte, Vale Alimentação, Vale Refeição]",
                "Conhecimentos em Java, Spring, Comandos SQL",
                "CLT", LocalDate.now(),
                true, "Analista Desenvolvedor Java, atuar em migração de sistemas",
                "Período temporário", 3));

        tableJob.add(new Job(2,
                "Desenvolvedor .Net Júnior",
                "Desenvolvimento",
                "[Vale Transporte, Vale Alimentação, Vale Refeição]",
                "Conhecimento em C#, conhecimento de SOLID e Design Parterns",
                "CLT", LocalDate.now(),
                true, "Analista Desenvolvedor C#, atuar em migração de sistemas",
                "Período temporário", 3));

        tableJob.add(new Job(3,
                "Desenvolvedor Python Júnior",
                "Desenvolvimento",
                "[Vale Transporte, Vale Alimentação, Vale Refeição]",
                "Conhecimento em Python, Flask, JavaScript",
                "CLT", LocalDate.now(),
                true, "Atuar com análise de dados",
                "Período temporário", 3));

        tableJob.add(new Job(4,
                "Auxiliar Administrativo",
                "Administração",
                "[Vale Transporte, Vale Alimentação, Vale Refeição]",
                "Conhecimento básico em Administração",
                "CLT", LocalDate.now(),
                true, "Criar relatórios e planilhas no Excel",
                "Período temporário", 1));

        tableJob.add(new Job(5,
                "Quality Assurance",
                "Desenvolvimento",
                "[Vale Transporte, Vale Alimentação, Vale Refeição]",
                "Conhecimentos avançados em Testes de Automação",
                "CLT", LocalDate.now(),
                true, "Atuar com ferramentas de automação de Testes (Selenium Web Driver)",
                "Período temporário", 6));

        tableJob.add(new Job(6,
                "Engenheiro de Software",
                "Desenvolvimento",
                "[Vale Transporte, Vale Alimentação, Vale Refeição]",
                "Entendimento de Regras de Negócio, conhecimentos avançados em comandos SQL",
                "CLT", LocalDate.now(),
                true, "Reuniões integradoras relacionadas aos projetos da empresa",
                "Período inderterminado", 8));

        tableJob.add(new Job(7,
                "Analista de Negócios",
                "Desenvolvimento",
                "[Vale Transporte, Vale Alimentação, Vale Refeição]",
                "Entendimento de Regras de Negócio, conhecimentos avançados em comandos SQL",
                "CLT", LocalDate.now(),
                true, "Reuniões integradoras relacionadas aos projetos da empresa",
                "Período inderterminado", 8));

        tableJob.add(new Job(8,
                "Desenvolvedora Java Pleno ",
                "Desenvolvimento",
                "[Vale Transporte, Vale Alimentação, Vale Refeição]",
                "Spring, Hibernate, Maven, Tom Cat",
                "CLT", LocalDate.now(),
                true, "Atuar no desenvolvimento de novos projetos a serem implementados",
                "Período inderterminado", 8));

        tableJob.add(new Job(9,
                "Desenvolvedora Python Pleno ",
                "Desenvolvimento",
                "[Vale Transporte, Vale Alimentação, Vale Refeição]",
                "No mínimo 5 anos de experiência, Flask, Djungle",
                "CLT", LocalDate.now(),
                true, "Atuar no desenvimento de Aplicações Web e Analise de dados",
                "Período inderterminado", 8));

        tableJob.add(new Job(10,
                "Analista Financeiro",
                "Financeiro",
                "[Vale Transporte, Vale Alimentação, Vale Refeição]",
                "Fomação em Ciências Contáveis, no mínimo 5 anos de experiência",
                "CLT", LocalDate.now(),
                true, "Atuar no controle do fluxo de caixa, emissão de notas e contas a pagar ",
                "Período temporário", 8));

        //JobRequest
        tableJobRequest.add(new JobRequest(tableJob.get(0),
                1,
                LocalDate.now(),
                "Carlos dos Santos Silva",
                "De acordo com meu desempenho, mereço a vaga de Programador Pleno",
                true,
                "Marcelo"));

        tableJobRequest.add(new JobRequest(tableJob.get(1),
                2,
                LocalDate.now(),
                "Carlos do Santos Silva",
                "De acordo com meu desempenho, mereço a vaga de Programador Pleno",
                true,
                "Victor"));

        tableJobRequest.add(new JobRequest(tableJob.get(2),
                3,
                LocalDate.now(),
                "Lucas",
                "De acordo com meu desempenho, mereço a vaga de Programador Sênior",
                true,
                "Caio"));

        tableJobRequest.add(new JobRequest(tableJob.get(3),
                4,
                LocalDate.now(),
                "Lucas",
                "De acordo com meu desempenho, mereço a vaga de Coordenador administrativo",
                true,
                "Enrique"));

        tableJobRequest.add(new JobRequest(tableJob.get(4),
                5,
                LocalDate.now(),
                "Lucas",
                "De acordo com meu desempenho, mereço a vaga de QA Sênior",
                true,
                "Hugo"));

        tableJobRequest.add(new JobRequest(tableJob.get(5),
                6, LocalDate.now(), "Lucas",
                "De acordo com meu desempenho, mereço a vaga de Analista programador Pleno",
                true,
                "Larissa"));

        tableJobRequest.add(new JobRequest(tableJob.get(6),
                7,
                LocalDate.now(),
                "Lucas",
                "De acordo com meu desempenho, mereço a vaga de Analista programador Sênior",
                true,
                "Luana"));

        tableJobRequest.add(new JobRequest(tableJob.get(7),
                8,
                LocalDate.now(),
                "Lucas",
                "De acordo com meu desempenho, mereço a vaga de Desenvolvedor .Net",
                true,
                "Gilberto"));

        tableJobRequest.add(new JobRequest(tableJob.get(8),
                9,
                LocalDate.now(),
                "Lucas",
                "De acordo com meu desempenho, mereço a vaga de Cientista de Dados",
                true,
                "Mauricio"));

        tableJobRequest.add(new JobRequest(tableJob.get(9),
                10,
                LocalDate.now(),
                "Lucas",
                "De acordo com meu desempenho, mereço a vaga de Gerente de Progestos",
                true,
                "Barbara"));

        //Curso
        tableCourse.add(new Course("Golang",
                "TI",
                30f,
                LocalDate.now(),
                "Curso Básico de Golang",
                1 ));

        tableCourse.add(new Course("Java",
                "TI",
                100f,
                LocalDate.now(),
                "Curso Avançado de Java",
                2 ));

        tableCourse.add(new Course("Python",
                "TI",
                50f,
                LocalDate.now(),
                "Curso Intermediário de Python",
                3 ));

        tableCourse.add(new Course("Clojure",
                "TI",
                10f,
                LocalDate.now(),
                "Curso Introdutório de Clojure",
                4 ));

        tableCourse.add(new Course("Gestão de Infraestrutura",
                "TI",
                100f,
                LocalDate.now(),
                "Curso de Gestão de Infra",
                5 ));

        tableCourse.add(new Course("Cobol",
                "TI",
                200f,
                LocalDate.now(),
                "Curso completo de Cobol",
                6 ));

        tableCourse.add(new Course("Delphi",
                "TI",
                150f,
                LocalDate.now(),
                "Curso Avançado de Delphi",
                7 ));

        tableCourse.add(new Course("DevOps",
                "TI",
                70f,
                LocalDate.now(),
                "Curso de DevOps",
                8 ));

        tableCourse.add(new Course("Responsive Web Development",
                "TI",
                2500f,
                LocalDate.now(),
                "Curso de FrontEnd",
                9 ));

        tableCourse.add(new Course("Agile Development",
                "TI",
                5000f,
                LocalDate.now(),
                "Curso de Metodologias Ágeis",
                10 ));

        //Course Request
        tableCourseRequest.add(new CourseRequest(tableCourse.get(0),
                1,
                LocalDate.now(),
                "Carlos dos Santos Silva",
                "Ganhar mais conhecimento",
                false,
                "Victor"));

        tableCourseRequest.add(new CourseRequest(tableCourse.get(1),
                2,
                LocalDate.now(),
                "Gestor Andrey",
                "Ganhar mais conhecimento",
                false, "Lucas"));

        tableCourseRequest.add(new CourseRequest(tableCourse.get(2),
                3,
                LocalDate.now(),
                "Carlos dos Santos Silva",
                "Ganhar mais conhecimento",
                false,
                "Julio"));

        tableCourseRequest.add(new CourseRequest(tableCourse.get(3),
                4,
                LocalDate.now(),
                "Gestor Andrey",
                "Ganhar mais conhecimento",
                false,
                "Tiago"));

        tableCourseRequest.add(new CourseRequest(tableCourse.get(4),
                5,
                LocalDate.now(),
                "Gestor Andrey",
                "Ganhar mais conhecimento",
                false,
                "Caio"));

        tableCourseRequest.add(new CourseRequest(tableCourse.get(5),
                6,
                LocalDate.now(),
                "Gestor Andrey",
                "Ganhar mais conhecimento",
                false,
                "Matheus"));

        tableCourseRequest.add(new CourseRequest(tableCourse.get(6),
                7,
                LocalDate.now(),
                "Gestor Andrey",
                "Ganhar mais conhecimento", false, "Fabio"));

        tableCourseRequest.add(new CourseRequest(tableCourse.get(7),
                8,
                LocalDate.now(),
                "Gestor Andrey",
                "Ganhar mais conhecimento",
                false, "Ruan"));

        tableCourseRequest.add(new CourseRequest(tableCourse.get(8),
                9,
                LocalDate.now(),
                "Gestor Andrey",
                "Ganhar mais conhecimento",
                false,
                "Heitor"));

        tableCourseRequest.add(new CourseRequest(tableCourse.get(9),
                10,
                LocalDate.now(),
                "Gestor Andrey",
                "Ganhar mais conhecimento",
                false,
                "Erik"));

        tableRequestReturn.add(new RequestReturn(LocalDate.now(),
                "Gestor Andrey",
                "Não foi aprovado por não ter conhecimento básico",
                false,
                1,
                LocalDate.now()));

        tableRequestReturn.add(new RequestReturn(LocalDate.now(),
                "Gestor Andrey",
                "Não foi aprovado por ser de área diferente",
                false,
                2,
                LocalDate.now()));

        tableRequestReturn.add(new RequestReturn(LocalDate.now(),
                "Gestor Andrey",
                "Não foi aprovado por não ter nível suficiente",
                false,
                3,
                LocalDate.now()));

        tableRequestReturn.add(new RequestReturn(LocalDate.now(),
                "Gestor Andrey",
                "Não foi aprovado por não ter os requisitos mínimos",
                false,
                4,
                LocalDate.now()));

        tableRequestReturn.add(new RequestReturn(LocalDate.now(),
                "Gestor Andrey",
                "Não foi aprovado por não ter os requisitos mínimos",
                false,
                5,
                LocalDate.now()));

        tableRequestReturn.add(new RequestReturn(LocalDate.now(),
                "Gestor Andrey",
                "Não foi aprovado por ser de área diferente",
                false,
                6,
                LocalDate.now()));

        tableRequestReturn.add(new RequestReturn(LocalDate.now(),
                "Gestor Andrey",
                "Não foi aprovado por ser de área diferente",
                false,
                7,
                LocalDate.now()));

        tableRequestReturn.add(new RequestReturn(LocalDate.now(),
                "Gestor Andrey",
                "Não foi aprovado por não ter os requisitos mínimos",
                false,
                8,LocalDate.now()));

        tableRequestReturn.add(new RequestReturn(LocalDate.now(),
                "Gestor Andrey",
                "Não foi aprovado por não ter conhecimento básico",
                false,
                9,
                LocalDate.now()));

        tableRequestReturn.add(new RequestReturn(LocalDate.now(),
                "Gestor Andrey",
                "Não foi aprovado por ser de área diferente",
                false,
                10,
                LocalDate.now()));
    }



    public List<Job> buscarVagas(int level){
        List<Job> vagas = new ArrayList<Job>();



        for (Job job : this.tableJob){
            if (level >= job.getJobLevel()){
                vagas.add(job);
            }
        }
        return vagas;
    } // feito

    public Course buscarCurso(){

        for (Course curso : this.tableCourse){
            int resposta = JOptionPane.showConfirmDialog(null, curso.toNotification() + "\nO curso desejado é esse?");
            if (resposta == 0){
                return curso;
            }
        }
        return new Course();
    } //feito

    public RequestReturn buscarRespostaDaRequisicao( int requestID){
        for (RequestReturn resposta : this.tableRequestReturn){
            if (requestID == resposta.getRequestID()) {
                return resposta;
            }
        }
        return new RequestReturn();
    } // feito

    public List<CourseRequest> buscarCourseRequests(String recepient){
        List<CourseRequest> requests = new ArrayList<CourseRequest>();

        for (CourseRequest request: this.tableCourseRequest){
            if ( recepient.toLowerCase().equalsIgnoreCase(request.getRecipient().toLowerCase())){
                requests.add(request);
            }
        }
        return requests;
    } //feito

    public List<JobRequest> buscarJobRequests(String recepient){
        List<JobRequest> requests = new ArrayList<JobRequest>();
        for (JobRequest request : this.tableJobRequest) {
            if (request.getRecipient().toLowerCase().equalsIgnoreCase(recepient.toLowerCase())){
                requests.add(request);
            }
        }
        return requests;
    } //feito



    public void addJob(Job job){
        this.tableJob.add(job);
    } // feito

    public void addCourse(Course course){
        this.tableCourse.add(course);
    } // feito

    public void addRequestReturn(RequestReturn response){
        this.tableRequestReturn.add(response);
    } // feito

    public void addCourseRequest(CourseRequest courseRequest){
        this.tableCourseRequest.add(courseRequest);
    } // feito

    public void addJobRequest(JobRequest jobRequest){
        this.tableJobRequest.add(jobRequest);
    } // feito



    public boolean updateJob(int jobID, Job updatedJob){
        for (Job job : this.tableJob){
            if (job.getJobId() == jobID){
                this.tableJob.set(this.tableJob.indexOf(job), updatedJob);
                return true;
            }
        }
        this.addJob(updatedJob);
        return false;
    } // feito

    public boolean updateCourse(int courseID, Course updatedCourse){
        for (Course course : this.tableCourse){
            if (course.getCourseID() == courseID){
                this.tableCourse.set(this.tableCourse.indexOf(course), updatedCourse);
                return true;
            }
        }
        this.addCourse(updatedCourse);
        return false;
    } // feito



    public boolean deleteJob(int jobID){

        for (Job job : this.tableJob) {
            if (jobID == job.getJobId()) {
                this.tableJob.remove(job);
                return true;
            }
        }
        return false;
    } // feito

    public  boolean deleteCourse(int CourseID){
        for (Course course : this.tableCourse) {
            if (CourseID == course.getCourseID()) {
                this.tableCourse.remove(course);
                return true;
            }
        }
        return false;
    } // feito


}
