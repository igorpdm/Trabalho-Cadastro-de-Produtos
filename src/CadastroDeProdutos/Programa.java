package CadastroDeProdutos;


import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Produto[] vetprodutos = new Produto[10];
        Produto[] vettemp = new Produto[10];
        Produto a = new Produto();
        Produto b[] = new Produto[1];
        int opcao;
        int opcao2;
        Scanner scn = new Scanner(System.in);
        init(vetprodutos);

        OUTER:
        do {
            inicio();
            opcao = scn.nextInt();
            switch (opcao) {
                case 1:
                    Produto p = lerproduto(vetprodutos);
                    inserir(vetprodutos, p);
                    break;
                case 2:
                    alterar(vetprodutos);
                    break;
                case 3:
                    imprimirProdutos(vetprodutos);
                    excluir(vetprodutos);
                    break;
                case 4:
                    listagens();
                    opcao2 = scn.nextInt();
                    switch (opcao2) {
                        case 1:
                            listarTodos(vetprodutos);
                            break;
                        case 2:
                            vettemp = listarPorNome(vetprodutos);
                            imprimirProdutos(vettemp);
                            break;
                        case 3:
                            b[0] = buscar(vetprodutos);
                            imprimirProdutos(b);
                            break;
                    }
                    break;
                case 0:
                    break OUTER;
                default:
                    break;
            }
        } while (true);
    }

    static void init(Produto[] a) {
        Random random = new Random();
        System.out.println("INICIALIZE e INSIRA 5 PRODUTOS INICIAIS");
        for (int i = 0; i < 5; i++) {
            Produto p = lerproduto(a);
            inserir(a, p);

        }

    }

    static void inicio() {
        System.out.println("\tCadastro de produtos");
        System.out.println("Digite (1) se deseja INSERIR produtos");
        System.out.println("Digite (2) se deseja ALTERAR produtos");
        System.out.println("Digite (3) se deseja EXCLUIR produtos");
        System.out.println("Digite (4) se deseja GERAR a listagem dos produtos");
        System.out.println("Digite (0) para encerrar  o programa");
        System.out.print("Opcao: ");
    }

    static void listagens() {
        System.out.println("\tListagem de produtos");
        System.out.println("Digite (1) se deseja LISTAR todos os produtos");
        System.out.println("Digite (2) se deseja LISTAR os produtos em ordem alfabética");
        System.out.println("Digite (3) se deseja BUSCAR produtos");
        System.out.print("Opção: ");
    }

    static Produto lerproduto(Produto[] a) {
        Scanner scn = new Scanner(System.in);
        Produto p = new Produto();
        System.out.println("Cadastro de Usuário");
        p.codigo = 1;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != null){
                while(a[i].codigo == p.codigo){
                    p.codigo = (a[i].codigo)+1;
                }
            }
        }
        System.out.println("Digite o nome do produto: ");
        p.nome = scn.next();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != null) {
                while (a[i].nome.equals(p.nome)) {
                    System.out.println("O nome inserido já está sendo utilizado, tente outro: ");
                    p.nome = scn.next();
                }
            }

        }

        System.out.println("Digite a marca do produto: ");
        p.marca = scn.next();

        System.out.println("Digite o preço do produto: ");
        p.preco = scn.nextDouble();

        System.out.println("Digite a quantidade do produto: ");
        p.quantidade = scn.nextDouble();

        return p;
    }

    static boolean inserir(Produto[] p, Produto a) {
        for (int i = 0; i < p.length; i++) {
            if (p[i] == null) {
                p[i] = a;
                return true;
            }
        }
        return false;

    }

    static boolean excluir(Produto[] p) {
        int codigo;
        System.out.println("Você está EXCLUINDO produtos");
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe o código do produto: ");
        codigo = scn.nextInt();
        for (int i = 0; i < p.length; i++) {
            if (p[i] != null) {
                if (p[i].codigo == codigo) {
                    p[i] = null;
                    return true;
                }
            }

        }
        return false;
    }

    static boolean alterar(Produto[] p) {
        int codigo;
        System.out.println("Você está ALTERANDO produtos");
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe o código do produto que deseja alterar: ");
        codigo = scn.nextInt();
        for (int i = 0; i < p.length; i++) {
            if (p[i] != null) {
                if (p[i].codigo == codigo) {
                    System.out.println("Cadastro de Usuário");

                    System.out.println("Digite o nome do produto: ");
                    p[i].nome = scn.next();

                    System.out.println("Digite a marca do produto: ");
                    p[i].marca = scn.next();

                    System.out.println("Digite o preço do produto: ");
                    p[i].preco = scn.nextDouble();

                    System.out.println("Digite a quantidade do produto: ");
                    p[i].quantidade = scn.nextDouble();
                    return true;
                }
            }

        }
        return false;
    }

    static Produto buscar(Produto[] a) {
        Produto p = new Produto();
        int codigo;
        System.out.println("Você está BUSCANDO produtos");
        Scanner scn = new Scanner(System.in);

        System.out.println("Informe o código do produto: ");
        codigo = scn.nextInt();
        for (int i = 0; i < a.length; i++) {
            if(a[i] != null){
                if(a[i].codigo  == codigo){
                p = a[i];
            }
        }

        
    }return p;
    }
    static void listarTodos(Produto[] p) {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Você está LISTANDO TODOS os produtos");
        System.out.print("Código");
        System.out.print("\t\tNome");
        System.out.print("\t\tMarca");
        System.out.print("\t\tPreço");
        System.out.println("\t\tQuantidade");
        for (int i = 0; i < p.length; i++) {
            if (p[i] != null) {
                System.out.print(p[i].codigo);
                System.out.print("\t\t" + p[i].nome);
                System.out.print("\t\t" + p[i].marca);
                System.out.print("\t\tR$:" + p[i].preco);
                System.out.println("\t\t" + p[i].quantidade);
            }
        }
        System.out.println("---------------------------------------------------------------------------");
    }

    static Produto[] listarPorNome(Produto[] a) {
        Produto[] vettemp = new Produto[a.length];
        Produto p = new Produto();
        for (int i = 0; i < a.length; i++) {
            if(a[i] != null){
                vettemp[i] = a[i];
            }
            
        }
        for (int j = 0; j < vettemp.length; j++) {
            for (int i = 0; i < vettemp.length-1; i++) {
                if(vettemp[i] != null && vettemp[i+1] != null){
                    if((vettemp[i].nome.compareTo(vettemp[i+1].nome))> 0){
                        p = vettemp[i];
                        vettemp[i] = vettemp[i+1];
                        vettemp[i+1] = p;
                    
                } 
                    
                
            }
        }

        }
            
        return vettemp;
    }
    static void imprimirProdutos(Produto[] p) {
        System.out.println("---------------------------------------------------------------------------");
        System.out.print("Código");
        System.out.print("\t\tNome");
        System.out.print("\t\tMarca");
        System.out.print("\t\tPreço");
        System.out.println("\t\tQuantidade");
        for (int i = 0; i < p.length; i++) {
            if (p[i] != null) {
                System.out.print(p[i].codigo);
                System.out.print("\t\t" + p[i].nome);
                System.out.print("\t\t" + p[i].marca);
                System.out.print("\t\tR$:" + p[i].preco);
                System.out.println("\t\t" + p[i].quantidade);
            }
        }
        System.out.println("---------------------------------------------------------------------------");
    }
    
}
