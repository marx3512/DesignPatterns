// No metodo singleton voce tem que colocar a propriedade instance static, o construtor da classe deve ser privado
// Metodo getInstance em static tambem

public class Singleton{
    public static Singleton instance;

    private Singleton(){};

    public static Singleton getInstance(){
        if(instance == null){
            System.out.println("Criando uma nova instancia");
            instance = new Singleton();
            return instance;
        }
        System.out.println("Retornando uma instancia ja criada");
        return instance;
    }
}