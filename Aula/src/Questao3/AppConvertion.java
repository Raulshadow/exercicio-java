package Questao3;

public class AppConvertion {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.setMassa((float)80.0);//meu peso

        ObjetoCeleste lua = new ObjetoCeleste();
        lua.setConvertingRate((float)0.17);

        System.out.println(lua.convertion(eu.getMassa()) + "Kg na Lua");
    }
}
