import java.util.*;

public class Main {
    public static void main(String[] args) {

        //ArrayList +fácil em ler, possui índice, mantém lista da maneira como é adicionado
        List<String> jogadoresOnline = new ArrayList<String>();

        jogadoresOnline.add("Robertinho");
        jogadoresOnline.add("Robertinho1");

        System.out.println("Jogadores online no momento:" + jogadoresOnline +"\n"+ jogadoresOnline.get(1));
        jogadoresOnline.remove("Robertinho1"); //Ou JogadoresOnline.remove(1);
        System.out.println("Jogadores online no momento:" + jogadoresOnline +"\n");


        //LinkedList +fácil em adicionar/remover, possui índice, matém a lista da maneira como é adicionado
        List<String> inventario = new LinkedList<String>();

        inventario.add("Espada");
        inventario.add("arco");
        System.out.println(inventario);
        inventario.add(1,"machado");
        System.out.println(inventario);

        
        //HashSet Não permite duplicatas, não possui índice, printa de maneira aleátoria
        Set<String> itemUnico = new HashSet<>();

        itemUnico.add("Pistola divina");
        itemUnico.add("Pistola divina");
        itemUnico.add("Lança divina");
        itemUnico.add("Pistola matadora de deuses");

        System.out.println(itemUnico);


        //TreeSet Não permite duplicatas, não possui índice, printa de maneira ordenada
        Set<String> conquistas = new TreeSet<>();

        conquistas.add("Nadou pela primeira vez");
        conquistas.add("Matou tubararão sem esforço algum");
        conquistas.add("Matou tubararão sem esforço algum");
        conquistas.add("Parabéns, você morreu");

        System.out.println(conquistas);


        //LinkedHashSet Não permite duplicatas, não possui índice, printa da maneira como foi adicionado

        Set<String> conquistasHistoria = new LinkedHashSet<>();

        conquistasHistoria.add("Você nasceu");
        conquistasHistoria.add("Encontrou uma garota");
        conquistasHistoria.add("Começou namorar");
        conquistasHistoria.add("Casou");
        conquistasHistoria.add("Teve filhos");
        conquistasHistoria.add("Morreu");

        System.out.println(conquistasHistoria);

        //HashMap Não permite duplicatas, possui identificador único, printa de maneira aleátoria

        Map<String, Integer> nivel = new HashMap<>();

        nivel.put("Berserk", 1);
        nivel.put("Berserk", 2);
        nivel.put("Robertinho", 1);
        nivel.put("Zaelio", 1);

        System.out.println(nivel.get("Berserk"));
        System.out.println(nivel);

        //TreeMap Não permite duplicatas, possui identificador único, printa de maneira ordenada/ordem

        Map<String, String> agenda = new TreeMap<>();

        agenda.put("Roberto", "1");
        agenda.put("Luquinhas", "2");
        agenda.put("Roberto", "3");
        agenda.put("Lisa", "4");

        System.out.println(agenda.get("Roberto"));
        System.out.println(agenda);

        //LinkedHashMap Não permite duplicatas, possui identificador único, printa da maneira como foi adicionado

        Map<String, Integer> danoRecebido = new LinkedHashMap<>();

        danoRecebido.put("Jorginho", 500);
        danoRecebido.put("Jorginho", 999);
        danoRecebido.put("Leroy", 100);
        danoRecebido.put("AOISD", 300);
        danoRecebido.put("Porr", 300);

        System.out.println(danoRecebido.get("Jorginho"));
        System.out.println(danoRecebido);
    }
}