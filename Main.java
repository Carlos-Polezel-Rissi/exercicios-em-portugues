import java.util.*;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        ArrayList<Task> manager= new ArrayList<>();
        Scanner MyObj = new Scanner(System.in);
        int chose;
        while(true) {
            System.out.println("=== MENU GERENCIADO DE TAREFAS ===");
            System.out.println("1 - Adicionar uma nova tarefa");
            System.out.println("2 - Mostrar todas as tarefas");
            System.out.println("3 - Proucurar tarefa por nome");
            System.out.println("4 - Marcar tarefa se completa");
            System.out.println("5 - Remover tarefa");
            System.out.println("6 - Mostrar todas as tarefas completas");
            System.out.println("7 - Mostrar todas as tarefas incompletas");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opçao");
            chose = MyObj.nextInt();
            switch (chose){
                case 1:
                    System.out.println("Inserir o id da tarefa: ");
                    int id = MyObj.nextInt();
                    MyObj.nextLine();
                    System.out.println("Inserir o nome da tarefa: ");
                    String Title = MyObj.nextLine();
                    System.out.println("Inserir a descriçao da tarefa: ");
                    String Description = MyObj.nextLine();
                    System.out.println("Inserir a data: (formato ano-mes-dia)");
                    String date = MyObj.nextLine();
                    LocalDate term = LocalDate.parse(date);
                    System.out.println("Inserir se a tarefa esta completa ou nao: (true our false)");
                    boolean completed = MyObj.nextBoolean();
                    manager.add(new Task(id, Title, Description, term, completed));
                break;
                case 2:
                    //2 - Show all task//
                    for (Task t: manager){
                        System.out.println("INFOMRMAÇAO DA TAREFA");
                        System.out.println("O id é: " + t.getId());
                        System.out.println("o titulo é: " + t.getTitle());
                        System.out.println("A descriçao é: " + t.getDescription());
                        System.out.println("A data é: " +t.getTerm());
                        if (t.getCompleted()){
                            System.out.println("A tarefa esta completa");
                        }
                        if(!t.getCompleted()){
                            System.out.println("A tarefa esta incompleta");
                        }
                    }
                break;
                case 3:
                    //3 - Search task by title
                    MyObj.nextLine();
                    boolean exist = false;
                    System.out.println("\nforneça o titulo da task que deseja proucurar");
                    String search = MyObj.nextLine();
                    for(Task t: manager){
                        if(t.getTitle().equalsIgnoreCase(search)){
                            System.out.println("A tarefa é " + "\n" +t.getId()+ "\n" + t.getTitle() + "\n" + t.getDescription() + "\n" + t.getTerm());
                            exist = true;
                        }
                    }
                    if(!exist){
                        System.out.println("Tarefa nao encontrada");
                    }
                break;
                case 4:
                    //4 - Mark task completed//
                    MyObj.nextLine();
                    boolean complete = false; ;
                    System.out.println("Infomre o id da tarefa para marcar completa: ");
                    int Search = MyObj.nextInt();
                    for(Task t: manager){
                        if(t.getId() == Search){
                            complete = true;
                            t.setCompleted(true);
                        }
                        break;
                    }
                    if(!complete){
                        System.out.println("tarefa nao encontrada");
                    }
                break;
                case 5:
                    //5 - Remove task
                    MyObj.nextLine();
                    boolean found = false; ;
                    System.out.println("informa o id da tarefa para remover: ");
                    int Search1 = MyObj.nextInt();
                    for(Task t: manager){
                        if(t.getId() == Search1){
                            found = true;
                            manager.remove(t);
                        }
                        break;
                    }
                    if(!found){
                        System.out.println("Tarefa nao encontrada");
                    }
                break;
                case 6:
                    //6 - Show all completed task
                    for(Task t: manager){
                        if(t.getCompleted() == true){
                            System.out.println("Essa tarefa esta completa: " + "\n" +t.getId()+ "\n" + t.getTitle() + "\n" + t.getDescription() + "\n" + t.getTerm());
                            break;
                        }
                    }
                break;
                case 7:
                    //7 - Show all incompleted task
                    for(Task t: manager){
                        if(t.getCompleted() == false){
                            System.out.println("Essa tarefa ta incompleta: " + "\n" +t.getId()+ "\n" + t.getTitle() + "\n" + t.getDescription() + "\n" + t.getTerm());
                            break;
                        }
                    }
                break;
                case 0:
                    return;
                default:
                    System.out.println("informe uma opçao valida");
            }
            }
        }
    }
